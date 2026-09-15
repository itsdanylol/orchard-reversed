package k74.x;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1291;
import net.minecraft.class_1293;
import net.minecraft.class_1713;
import net.minecraft.class_1799;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_746;
import net.minecraft.class_7923;
import net.minecraft.class_3675.class_306;

@Environment(EnvType.CLIENT)
public final class IlIIIIIl extends IlIIIIIIl {
   private static final String II;
   private final lllIIlII Il;
   private static final String[] lllI;
   private long lI;
   private static final Gson ll;
   private long III;
   private String IIl;
   public static final String IlI;
   private final lIlllIl Ill;
   private static final int lII = 36;
   private lllIlll lIl;
   private List<lllIlll> llI;
   private static final int[] lll;
   private static final long IIII = 3000L;
   private static final String[] IIIl;
   private boolean IIlI;
   private boolean IIll;
   private static final String[] IlII;
   private boolean IlIl;
   private static final int IllI = 40;
   private final Map<String, Boolean> Illl;
   private static final int lIII = 9;
   private static final Object[] llll;
   private boolean lIIl;
   private static String[] I;
   private static final int[] llIl;
   private final IllIII<IlIIIlllI> lIlI;
   private long lIll;
   private String llII;

   private int I(class_746 param1, lllIlll param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 1d
      // 04: aload 2
      // 05: ifnull 1d
      // 08: goto 0f
      // 0b: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e: athrow
      // 0f: aload 2
      // 10: getfield k74/x/lllIlll.l Ljava/util/List;
      // 13: ifnonnull 23
      // 16: goto 1d
      // 19: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: bipush 0
      // 1e: ireturn
      // 1f: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22: athrow
      // 23: bipush 0
      // 24: istore 3
      // 25: aload 0
      // 26: aload 2
      // 27: invokevirtual k74/x/IlIIIIIl.llIIl (Lk74/x/lllIlll;)Ljava/util/Map;
      // 2a: astore 4
      // 2c: aload 2
      // 2d: getfield k74/x/lllIlll.l Ljava/util/List;
      // 30: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 35: astore 5
      // 37: aload 5
      // 39: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3e: ifeq a0
      // 41: aload 5
      // 43: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 48: checkcast k74/x/IIlIllIll
      // 4b: astore 6
      // 4d: aload 6
      // 4f: ifnull 37
      // 52: aload 0
      // 53: aload 6
      // 55: getfield k74/x/IIlIllIll.lI I
      // 58: invokevirtual k74/x/IlIIIIIl.llIlI (I)Z
      // 5b: ifeq 37
      // 5e: aload 6
      // 60: getfield k74/x/IIlIllIll.I Ljava/lang/String;
      // 63: ifnonnull 6d
      // 66: goto 37
      // 69: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6c: athrow
      // 6d: aload 0
      // 6e: aload 0
      // 6f: aload 1
      // 70: aload 6
      // 72: getfield k74/x/IIlIllIll.lI I
      // 75: invokevirtual k74/x/IlIIIIIl.IllI (Lnet/minecraft/class_746;I)Lnet/minecraft/class_1799;
      // 78: aload 6
      // 7a: invokevirtual k74/x/IlIIIIIl.lll (Lnet/minecraft/class_1799;Lk74/x/IIlIllIll;)Z
      // 7d: ifeq 87
      // 80: goto 37
      // 83: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 86: athrow
      // 87: aload 0
      // 88: aload 1
      // 89: aload 4
      // 8b: aload 6
      // 8d: invokevirtual k74/x/IlIIIIIl.lIIIl (Lnet/minecraft/class_746;Ljava/util/Map;Lk74/x/IIlIllIll;)I
      // 90: iflt 9d
      // 93: iinc 3 1
      // 96: goto 9d
      // 99: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9c: athrow
      // 9d: goto 37
      // a0: iload 3
      // a1: ireturn
   }

   private Path l(String var1) {
      Path var2 = this.lIIII();

      try {
         if (var2 == null) {
            return null;
         }
      } catch (IllegalStateException var5) {
         throw Illll(var5);
      }

      String var4 = IlIIllIII.lI(I[3]);
      return var2.resolve(var1 + var4);
   }

   public Map<String, Object> II() {
      return this.IIl();
   }

   private static boolean Il(Path var0) {
      return var0.getFileName().toString().endsWith(IlIIllIII.lI(I[3]));
   }

   private void lI(class_310 param1, class_746 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/IlIIIIIl.lIlI Lk74/x/IllIII;
      // 04: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 07: getstatic k74/x/IlIIIlllI.l Lk74/x/IlIIIlllI;
      // 0a: if_acmpne 4a
      // 0d: aload 1
      // 0e: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 11: ifnonnull 4a
      // 14: goto 1b
      // 17: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a: athrow
      // 1b: aload 1
      // 1c: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 1f: ifnull 4a
      // 22: goto 29
      // 25: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28: athrow
      // 29: aload 1
      // 2a: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 2d: new net/minecraft/class_2848
      // 30: dup
      // 31: aload 2
      // 32: getstatic net/minecraft/class_2848$class_2849.field_12988 Lnet/minecraft/class_2848$class_2849;
      // 35: invokespecial net/minecraft/class_2848.<init> (Lnet/minecraft/class_1297;Lnet/minecraft/class_2848$class_2849;)V
      // 38: invokevirtual net/minecraft/class_634.method_52787 (Lnet/minecraft/class_2596;)V
      // 3b: aload 0
      // 3c: bipush 1
      // 3d: putfield k74/x/IlIIIIIl.lIIl Z
      // 40: aload 0
      // 41: bipush 1
      // 42: putfield k74/x/IlIIIIIl.IIll Z
      // 45: return
      // 46: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 49: athrow
      // 4a: aload 1
      // 4b: new net/minecraft/class_490
      // 4e: dup
      // 4f: aload 2
      // 50: invokespecial net/minecraft/class_490.<init> (Lnet/minecraft/class_1657;)V
      // 53: invokevirtual net/minecraft/class_310.method_1507 (Lnet/minecraft/class_437;)V
      // 56: aload 0
      // 57: bipush 1
      // 58: putfield k74/x/IlIIIIIl.IlIl Z
      // 5b: aload 0
      // 5c: bipush 1
      // 5d: putfield k74/x/IlIIIIIl.IIll Z
      // 60: return
   }

   private static int IIIllI(int var0, int var1) {
      int var2 = llIl[var0 ^ 1652139518] ^ var1 ^ var0;
      var2 -= 54739;
      var2 ^= 7649;
      var2 ^= 31201;
      var2 ^= 44262;
      var2 += 33189;
      var2 += 19610;
      var2 += 5043;
      return var2 - 54610;
   }

   @Override
   public void IIlIl() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc 1215955141
      // 002: istore 8
      // 004: aload 0
      // 005: getfield k74/x/IlIIIIIl.IIlI Z
      // 008: ifne 010
      // 00b: return
      // 00c: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 00f: athrow
      // 010: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 013: astore 1
      // 014: aload 0
      // 015: aload 1
      // 016: invokevirtual k74/x/IlIIIIIl.llIII (Lnet/minecraft/class_310;)Z
      // 019: ifne 037
      // 01c: aload 0
      // 01d: aload 1
      // 01e: getstatic k74/x/IlIIIIIl.I [Ljava/lang/String;
      // 021: ldc 1652139518
      // 023: iload 8
      // 025: ldc 2143770824
      // 027: ixor
      // 028: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 02b: aaload
      // 02c: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 02f: invokevirtual k74/x/IlIIIIIl.IIIlII (Lnet/minecraft/class_310;Ljava/lang/String;)V
      // 032: return
      // 033: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 036: athrow
      // 037: aload 1
      // 038: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 03b: astore 2
      // 03c: aload 2
      // 03d: getfield net/minecraft/class_746.field_7498 Lnet/minecraft/class_1723;
      // 040: invokevirtual net/minecraft/class_1723.method_34255 ()Lnet/minecraft/class_1799;
      // 043: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 046: ifne 066
      // 049: aload 0
      // 04a: aload 1
      // 04b: getstatic k74/x/IlIIIIIl.I [Ljava/lang/String;
      // 04e: ldc_w 1652139519
      // 051: iload 8
      // 053: ldc_w 889985585
      // 056: ixor
      // 057: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 05a: aaload
      // 05b: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 05e: invokevirtual k74/x/IlIIIIIl.IIIlII (Lnet/minecraft/class_310;Ljava/lang/String;)V
      // 061: return
      // 062: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 065: athrow
      // 066: aload 0
      // 067: aload 1
      // 068: invokevirtual k74/x/IlIIIIIl.Illl (Lnet/minecraft/class_310;)Z
      // 06b: ifne 0b0
      // 06e: aload 0
      // 06f: getfield k74/x/IlIIIIIl.IIll Z
      // 072: ifeq 099
      // 075: goto 07c
      // 078: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07b: athrow
      // 07c: aload 0
      // 07d: aload 1
      // 07e: getstatic k74/x/IlIIIIIl.I [Ljava/lang/String;
      // 081: ldc_w 1652139516
      // 084: iload 8
      // 086: ldc_w -1819262478
      // 089: ixor
      // 08a: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 08d: aaload
      // 08e: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 091: invokevirtual k74/x/IlIIIIIl.IIIlII (Lnet/minecraft/class_310;Ljava/lang/String;)V
      // 094: return
      // 095: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 098: athrow
      // 099: aload 1
      // 09a: invokestatic k74/x/lIIIllII.l (Lnet/minecraft/class_310;)Z
      // 09d: ifne 0a5
      // 0a0: return
      // 0a1: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a4: athrow
      // 0a5: aload 0
      // 0a6: aload 1
      // 0a7: aload 2
      // 0a8: invokevirtual k74/x/IlIIIIIl.lI (Lnet/minecraft/class_310;Lnet/minecraft/class_746;)V
      // 0ab: aload 1
      // 0ac: invokestatic k74/x/lIIIllII.IIll (Lnet/minecraft/class_310;)V
      // 0af: return
      // 0b0: invokestatic java/lang/System.currentTimeMillis ()J
      // 0b3: lstore 3
      // 0b4: lload 3
      // 0b5: aload 0
      // 0b6: getfield k74/x/IlIIIIIl.lI J
      // 0b9: lsub
      // 0ba: aload 0
      // 0bb: getfield k74/x/IlIIIIIl.III J
      // 0be: lcmp
      // 0bf: ifge 0c7
      // 0c2: return
      // 0c3: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c6: athrow
      // 0c7: aload 0
      // 0c8: aload 2
      // 0c9: aload 0
      // 0ca: getfield k74/x/IlIIIIIl.lIl Lk74/x/lllIlll;
      // 0cd: invokevirtual k74/x/IlIIIIIl.lIlll (Lnet/minecraft/class_746;Lk74/x/lllIlll;)Lk74/x/lIllI;
      // 0d0: astore 5
      // 0d2: aload 5
      // 0d4: ifnonnull 0e1
      // 0d7: aload 0
      // 0d8: aload 1
      // 0d9: invokevirtual k74/x/IlIIIIIl.IIIIl (Lnet/minecraft/class_310;)V
      // 0dc: return
      // 0dd: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e0: athrow
      // 0e1: aload 1
      // 0e2: invokestatic k74/x/lIIIllII.l (Lnet/minecraft/class_310;)Z
      // 0e5: ifne 0ed
      // 0e8: return
      // 0e9: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ec: athrow
      // 0ed: aload 0
      // 0ee: aload 1
      // 0ef: aload 2
      // 0f0: aload 5
      // 0f2: getfield k74/x/lIllI.I I
      // 0f5: aload 5
      // 0f7: getfield k74/x/lIllI.l I
      // 0fa: invokevirtual k74/x/IlIIIIIl.IllII (Lnet/minecraft/class_310;Lnet/minecraft/class_746;II)V
      // 0fd: aload 2
      // 0fe: getfield net/minecraft/class_746.field_7498 Lnet/minecraft/class_1723;
      // 101: invokevirtual net/minecraft/class_1723.method_34255 ()Lnet/minecraft/class_1799;
      // 104: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 107: ifne 127
      // 10a: aload 0
      // 10b: aload 1
      // 10c: getstatic k74/x/IlIIIIIl.I [Ljava/lang/String;
      // 10f: ldc_w 1652139517
      // 112: iload 8
      // 114: ldc_w -713699285
      // 117: ixor
      // 118: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 11b: aaload
      // 11c: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 11f: invokevirtual k74/x/IlIIIIIl.IIIlII (Lnet/minecraft/class_310;Ljava/lang/String;)V
      // 122: return
      // 123: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 126: athrow
      // 127: aload 0
      // 128: lload 3
      // 129: putfield k74/x/IlIIIIIl.lI J
      // 12c: aload 0
      // 12d: aload 0
      // 12e: invokevirtual k74/x/IlIIIIIl.lIIlI ()J
      // 131: putfield k74/x/IlIIIIIl.III J
      // 134: aload 0
      // 135: getstatic k74/x/IlIIIIIl.I [Ljava/lang/String;
      // 138: ldc_w 1652139514
      // 13b: iload 8
      // 13d: ldc_w -1790533337
      // 140: ixor
      // 141: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 144: aaload
      // 145: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 148: aload 0
      // 149: aload 0
      // 14a: getfield k74/x/IlIIIIIl.lIl Lk74/x/lllIlll;
      // 14d: invokevirtual k74/x/IlIIIIIl.lllII (Lk74/x/lllIlll;)Ljava/lang/String;
      // 150: astore 7
      // 152: astore 6
      // 154: new java/lang/StringBuilder
      // 157: dup
      // 158: invokespecial java/lang/StringBuilder.<init> ()V
      // 15b: aload 6
      // 15d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 160: aload 7
      // 162: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 165: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 168: putfield k74/x/IlIIIIIl.IIl Ljava/lang/String;
      // 16b: return
   }

   public String ll() {
      return this.IIl;
   }

   @Override
   public void llIl() {
      this.IIIlII(class_310.method_1551(), IlIIllIII.lI(I[IIIllI(1652139515, 1779086612 ^ -1939676774)]));
      this.Illl.clear();
   }

   private String III(String var1) {
      try {
         if (var1 == null) {
            return I[1];
         }
      } catch (IllegalStateException var2) {
         throw Illll(var2);
      }

      return var1.replaceAll(IlIIllIII.lI(I[IIIllI(1652139512, 46858131 ^ -1232045675)]), I[1]).trim();
   }

   private Map<String, Object> IIl() {
      LinkedHashMap var1 = new LinkedHashMap();
      var1.put(IlIIllIII.lI(I[IIIllI(1652139513, 1548125728 ^ 1677830160)]), true);
      ArrayList var2 = new ArrayList();

      for (lllIlll var4 : this.lII()) {
         var2.add(this.IIllI(var4));
      }

      var1.put(IlIIllIII.lI(I[IIIllI(1652139510, 1548125728 ^ 1371681316)]), var2);
      var1.put(IlIIllIII.lI(I[IIIllI(1652139511, 1548125728 ^ -1040096101)]), this.Ill());
      return var1;
   }

   private Map<String, Object> Ill() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: new java/util/LinkedHashMap
      // 03: dup
      // 04: invokespecial java/util/LinkedHashMap.<init> ()V
      // 07: astore 1
      // 08: aload 1
      // 09: getstatic k74/x/IlIIIIIl.I [Ljava/lang/String;
      // 0c: ldc_w 1652139508
      // 0f: ldc_w -1522564847
      // 12: ldc_w 1310330939
      // 15: ixor
      // 16: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 19: aaload
      // 1a: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 1d: aload 0
      // 1e: getfield k74/x/IlIIIIIl.IIlI Z
      // 21: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 24: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 29: pop
      // 2a: aload 1
      // 2b: getstatic k74/x/IlIIIIIl.I [Ljava/lang/String;
      // 2e: ldc_w 1652139509
      // 31: ldc_w -1522564847
      // 34: ldc_w -677508824
      // 37: ixor
      // 38: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 3b: aaload
      // 3c: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 3f: aload 0
      // 40: getfield k74/x/IlIIIIIl.llII Ljava/lang/String;
      // 43: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 48: pop
      // 49: aload 1
      // 4a: getstatic k74/x/IlIIIIIl.I [Ljava/lang/String;
      // 4d: ldc_w 1652139506
      // 50: ldc_w -1522564847
      // 53: ldc_w -1314866582
      // 56: ixor
      // 57: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 5a: aaload
      // 5b: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 5e: aload 0
      // 5f: getfield k74/x/IlIIIIIl.IIl Ljava/lang/String;
      // 62: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 67: pop
      // 68: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 6b: astore 2
      // 6c: aload 0
      // 6d: getfield k74/x/IlIIIIIl.IIlI Z
      // 70: ifeq 9f
      // 73: aload 2
      // 74: ifnull 9f
      // 77: goto 7e
      // 7a: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7d: athrow
      // 7e: aload 2
      // 7f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 82: ifnull 9f
      // 85: goto 8c
      // 88: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8b: athrow
      // 8c: aload 0
      // 8d: aload 2
      // 8e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 91: aload 0
      // 92: getfield k74/x/IlIIIIIl.lIl Lk74/x/lllIlll;
      // 95: invokevirtual k74/x/IlIIIIIl.I (Lnet/minecraft/class_746;Lk74/x/lllIlll;)I
      // 98: goto a0
      // 9b: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9e: athrow
      // 9f: bipush 0
      // a0: istore 3
      // a1: aload 1
      // a2: getstatic k74/x/IlIIIIIl.I [Ljava/lang/String;
      // a5: ldc_w 1652139507
      // a8: ldc_w -1522564847
      // ab: ldc_w -979374989
      // ae: ixor
      // af: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // b2: aaload
      // b3: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // b6: iload 3
      // b7: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // ba: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // bf: pop
      // c0: aload 1
      // c1: areturn
   }

   private List<lllIlll> lII() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual k74/x/IlIIIIIl.lIIII ()Ljava/nio/file/Path;
      // 04: astore 1
      // 05: aload 1
      // 06: ifnull 1b
      // 09: aload 1
      // 0a: bipush 0
      // 0b: anewarray 399
      // 0e: invokestatic java/nio/file/Files.isDirectory (Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
      // 11: ifne 23
      // 14: goto 1b
      // 17: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a: athrow
      // 1b: invokestatic java/util/List.of ()Ljava/util/List;
      // 1e: areturn
      // 1f: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22: athrow
      // 23: new java/util/ArrayList
      // 26: dup
      // 27: invokespecial java/util/ArrayList.<init> ()V
      // 2a: astore 2
      // 2b: aload 1
      // 2c: invokestatic java/nio/file/Files.list (Ljava/nio/file/Path;)Ljava/util/stream/Stream;
      // 2f: astore 3
      // 30: aload 3
      // 31: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, k74/x/IlIIIIIl.Il (Ljava/nio/file/Path;)Z, (Ljava/nio/file/Path;)Z ]
      // 36: invokeinterface java/util/stream/Stream.filter (Ljava/util/function/Predicate;)Ljava/util/stream/Stream; 2
      // 3b: aload 0
      // 3c: invokedynamic apply (Lk74/x/IlIIIIIl;)Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, k74/x/IlIIIIIl.llIll (Ljava/nio/file/Path;)Lk74/x/lllIlll;, (Ljava/nio/file/Path;)Lk74/x/lllIlll; ]
      // 41: invokeinterface java/util/stream/Stream.map (Ljava/util/function/Function;)Ljava/util/stream/Stream; 2
      // 46: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, k74/x/IlIIIIIl.IIlI (Lk74/x/lllIlll;)Z, (Lk74/x/lllIlll;)Z ]
      // 4b: invokeinterface java/util/stream/Stream.filter (Ljava/util/function/Predicate;)Ljava/util/stream/Stream; 2
      // 50: aload 2
      // 51: dup
      // 52: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 55: pop
      // 56: invokedynamic accept (Ljava/util/List;)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, java/util/List.add (Ljava/lang/Object;)Z, (Lk74/x/lllIlll;)V ]
      // 5b: invokeinterface java/util/stream/Stream.forEach (Ljava/util/function/Consumer;)V 2
      // 60: aload 3
      // 61: ifnull 88
      // 64: aload 3
      // 65: invokeinterface java/util/stream/Stream.close ()V 1
      // 6a: goto 88
      // 6d: astore 4
      // 6f: aload 3
      // 70: ifnull 85
      // 73: aload 3
      // 74: invokeinterface java/util/stream/Stream.close ()V 1
      // 79: goto 85
      // 7c: astore 5
      // 7e: aload 4
      // 80: aload 5
      // 82: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 85: aload 4
      // 87: athrow
      // 88: goto 8c
      // 8b: astore 3
      // 8c: aload 2
      // 8d: invokedynamic applyAsLong ()Ljava/util/function/ToLongFunction; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)J, k74/x/IlIIIIIl.IlIl (Lk74/x/lllIlll;)J, (Lk74/x/lllIlll;)J ]
      // 92: invokestatic java/util/Comparator.comparingLong (Ljava/util/function/ToLongFunction;)Ljava/util/Comparator;
      // 95: invokeinterface java/util/Comparator.reversed ()Ljava/util/Comparator; 1
      // 9a: aload 0
      // 9b: invokedynamic apply (Lk74/x/IlIIIIIl;)Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, k74/x/IlIIIIIl.IIIIIl (Lk74/x/lllIlll;)Ljava/lang/String;, (Lk74/x/lllIlll;)Ljava/lang/String; ]
      // a0: getstatic java/lang/String.CASE_INSENSITIVE_ORDER Ljava/util/Comparator;
      // a3: invokeinterface java/util/Comparator.thenComparing (Ljava/util/function/Function;Ljava/util/Comparator;)Ljava/util/Comparator; 3
      // a8: invokeinterface java/util/List.sort (Ljava/util/Comparator;)V 2
      // ad: aload 2
      // ae: areturn
   }

   public Map<String, Object> lIl(String var1, class_306 var2) {
      IlIIIIIl var10000;
      String var10001;
      try {
         var10000 = this;
         var10001 = var1;
         if (k74.x.IIll.IIlll(var2)) {
            return this.lllll(var1, null);
         }
      } catch (IllegalStateException var3) {
         throw Illll(var3);
      }

      return var10000.lllll(var10001, var2.method_1441());
   }

   private static int[] llI() {
      int var4 = -1237229227;
      int var0 = IIIllI(1652139504, var4 ^ -251520750);
      int[] var1 = new int[var0];
      int var2 = 0;
      int var3 = IIIllI(1652139505, var4 ^ -613641460);

      try {
         while (var3 < IIIllI(1652139502, var4 ^ 1296551754)) {
            var1[var2++] = var3++;
         }
      } catch (IllegalStateException var6) {
         throw Illll(var6);
      }

      var3 = 0;

      try {
         while (var3 < IIIllI(1652139503, var4 ^ 56791684)) {
            var1[var2++] = IIIllI(1652139500, var4 ^ 1203703604) + var3;
            var3++;
         }
      } catch (IllegalStateException var5) {
         throw Illll(var5);
      }

      var1[var2] = IIIllI(1652139501, var4 ^ 1902668531);
      return var1;
   }

   private boolean lll(class_1799 param1, IIlIllIll param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 2
      // 01: ifnull 17
      // 04: aload 0
      // 05: aload 1
      // 06: aload 2
      // 07: getfield k74/x/IIlIllIll.I Ljava/lang/String;
      // 0a: invokevirtual k74/x/IlIIIIIl.lIlI (Lnet/minecraft/class_1799;Ljava/lang/String;)Z
      // 0d: ifne 1d
      // 10: goto 17
      // 13: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16: athrow
      // 17: bipush 0
      // 18: ireturn
      // 19: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: aload 2
      // 1e: getfield k74/x/IIlIllIll.II Ljava/lang/String;
      // 21: ifnull 35
      // 24: aload 2
      // 25: getfield k74/x/IIlIllIll.II Ljava/lang/String;
      // 28: invokevirtual java/lang/String.isBlank ()Z
      // 2b: ifeq 3b
      // 2e: goto 35
      // 31: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 34: athrow
      // 35: bipush 1
      // 36: ireturn
      // 37: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a: athrow
      // 3b: aload 2
      // 3c: getfield k74/x/IIlIllIll.II Ljava/lang/String;
      // 3f: aload 0
      // 40: aload 1
      // 41: invokevirtual k74/x/IlIIIIIl.IIlII (Lnet/minecraft/class_1799;)Ljava/lang/String;
      // 44: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 47: ireturn
   }

   private int IIII(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc_w 1535837830
      // 03: istore 2
      // 04: iload 1
      // 05: ldc_w 1652139498
      // 08: iload 2
      // 09: ldc_w -933606337
      // 0c: ixor
      // 0d: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 10: if_icmplt 3b
      // 13: iload 1
      // 14: ldc_w 1652139499
      // 17: iload 2
      // 18: ldc_w -798008022
      // 1b: ixor
      // 1c: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 1f: if_icmpge 3b
      // 22: goto 29
      // 25: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28: athrow
      // 29: iload 1
      // 2a: ldc_w 1652139496
      // 2d: iload 2
      // 2e: ldc_w 1368515994
      // 31: ixor
      // 32: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 35: isub
      // 36: ireturn
      // 37: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a: athrow
      // 3b: iload 1
      // 3c: ldc_w 1652139497
      // 3f: iload 2
      // 40: ldc_w 443197750
      // 43: ixor
      // 44: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 47: if_icmpne 50
      // 4a: bipush 0
      // 4b: ireturn
      // 4c: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4f: athrow
      // 50: iload 1
      // 51: ldc_w 1652139494
      // 54: iload 2
      // 55: ldc_w 1547457080
      // 58: ixor
      // 59: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 5c: isub
      // 5d: ireturn
   }

   private void IIIl(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/IlIIIIIl.lIIl Z
      // 04: ifeq 52
      // 07: aload 1
      // 08: ifnull 4d
      // 0b: goto 12
      // 0e: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11: athrow
      // 12: aload 1
      // 13: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 16: ifnull 4d
      // 19: goto 20
      // 1c: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: aload 1
      // 21: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 24: ifnull 4d
      // 27: goto 2e
      // 2a: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d: athrow
      // 2e: aload 1
      // 2f: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 32: new net/minecraft/class_2815
      // 35: dup
      // 36: aload 1
      // 37: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 3a: getfield net/minecraft/class_746.field_7498 Lnet/minecraft/class_1723;
      // 3d: getfield net/minecraft/class_1723.field_7763 I
      // 40: invokespecial net/minecraft/class_2815.<init> (I)V
      // 43: invokevirtual net/minecraft/class_634.method_52787 (Lnet/minecraft/class_2596;)V
      // 46: goto 4d
      // 49: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4c: athrow
      // 4d: aload 0
      // 4e: bipush 0
      // 4f: putfield k74/x/IlIIIIIl.lIIl Z
      // 52: aload 0
      // 53: getfield k74/x/IlIIIIIl.IlIl Z
      // 56: ifne 5e
      // 59: return
      // 5a: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5d: athrow
      // 5e: aload 1
      // 5f: ifnull 7f
      // 62: aload 1
      // 63: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 66: instanceof net/minecraft/class_490
      // 69: ifeq 7f
      // 6c: goto 73
      // 6f: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 72: athrow
      // 73: aload 1
      // 74: aconst_null
      // 75: invokevirtual net/minecraft/class_310.method_1507 (Lnet/minecraft/class_437;)V
      // 78: goto 7f
      // 7b: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7e: athrow
      // 7f: aload 0
      // 80: bipush 0
      // 81: putfield k74/x/IlIIIIIl.IlIl Z
      // 84: return
   }

   private static boolean IIlI(lllIlll param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: ifnull 28
      // 04: aload 0
      // 05: getfield k74/x/lllIlll.II Ljava/lang/String;
      // 08: ifnull 28
      // 0b: goto 12
      // 0e: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11: athrow
      // 12: aload 0
      // 13: getfield k74/x/lllIlll.l Ljava/util/List;
      // 16: ifnull 28
      // 19: goto 20
      // 1c: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: bipush 1
      // 21: goto 29
      // 24: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27: athrow
      // 28: bipush 0
      // 29: ireturn
   }

   public Map<String, Object> IIll(String var1) {
      class_310 var2 = class_310.method_1551();

      try {
         if (!this.llIII(var2)) {
            throw new IllegalStateException(IlIIllIII.lI(I[IIIllI(1652139495, 1611920741 ^ 616905525)]));
         }
      } catch (IllegalStateException var4) {
         throw Illll(var4);
      }

      lllIlll var3 = this.IIIll(var2.field_1724, var1);
      this.IlII(var3);
      this.lIIll();
      return this.IIl();
   }

   private void IlII(lllIlll var1) {
      Path var2 = this.lIIII();

      try {
         if (var2 == null) {
            throw new IllegalStateException(IlIIllIII.lI(I[IIIllI(1652139492, -377603672 ^ -404450400)]));
         }
      } catch (IOException var8) {
         throw Illll(var8);
      }

      try {
         Files.createDirectories(var2);
         String var10001 = var1.II;
         String var9 = IlIIllIII.lI(I[3]);
         String var4 = var10001;
         Files.writeString(var2.resolve(var4 + var9), ll.toJson(var1));
      } catch (IOException var7) {
         String var10002 = IlIIllIII.lI(I[5]);
         String var6 = var7.getMessage();
         String var5 = var10002;
         throw new IllegalStateException(var5 + var6, var7);
      }
   }

   private static long IlIl(lllIlll var0) {
      return var0.ll;
   }

   private class_1799 IllI(class_746 param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 24
      // 04: iload 2
      // 05: iflt 24
      // 08: goto 0f
      // 0b: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e: athrow
      // 0f: iload 2
      // 10: aload 1
      // 11: getfield net/minecraft/class_746.field_7498 Lnet/minecraft/class_1723;
      // 14: getfield net/minecraft/class_1723.field_7761 Lnet/minecraft/class_2371;
      // 17: invokevirtual net/minecraft/class_2371.size ()I
      // 1a: if_icmplt 2c
      // 1d: goto 24
      // 20: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23: athrow
      // 24: getstatic net/minecraft/class_1799.field_8037 Lnet/minecraft/class_1799;
      // 27: areturn
      // 28: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b: athrow
      // 2c: aload 1
      // 2d: getfield net/minecraft/class_746.field_7498 Lnet/minecraft/class_1723;
      // 30: getfield net/minecraft/class_1723.field_7761 Lnet/minecraft/class_2371;
      // 33: iload 2
      // 34: invokevirtual net/minecraft/class_2371.get (I)Ljava/lang/Object;
      // 37: checkcast net/minecraft/class_1735
      // 3a: invokevirtual net/minecraft/class_1735.method_7677 ()Lnet/minecraft/class_1799;
      // 3d: areturn
   }

   private boolean Illl(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnonnull 0a
      // 04: bipush 0
      // 05: ireturn
      // 06: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09: athrow
      // 0a: aload 1
      // 0b: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 0e: instanceof net/minecraft/class_490
      // 11: ifeq 1a
      // 14: bipush 1
      // 15: ireturn
      // 16: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19: athrow
      // 1a: aload 0
      // 1b: getfield k74/x/IlIIIIIl.lIIl Z
      // 1e: ifeq 4b
      // 21: aload 0
      // 22: getfield k74/x/IlIIIIIl.lIlI Lk74/x/IllIII;
      // 25: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 28: getstatic k74/x/IlIIIlllI.l Lk74/x/IlIIIlllI;
      // 2b: if_acmpne 4b
      // 2e: goto 35
      // 31: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 34: athrow
      // 35: aload 1
      // 36: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 39: ifnonnull 4b
      // 3c: goto 43
      // 3f: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 42: athrow
      // 43: bipush 1
      // 44: goto 4c
      // 47: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a: athrow
      // 4b: bipush 0
      // 4c: ireturn
   }

   private String lIII(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc_w 342032009
      // 03: istore 2
      // 04: iload 1
      // 05: ldc_w 1652139493
      // 08: iload 2
      // 09: ldc_w -855144660
      // 0c: ixor
      // 0d: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 10: if_icmplt 40
      // 13: iload 1
      // 14: ldc_w 1652139490
      // 17: iload 2
      // 18: ldc_w -915482567
      // 1b: ixor
      // 1c: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 1f: if_icmpge 40
      // 22: goto 29
      // 25: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28: athrow
      // 29: getstatic k74/x/IlIIIIIl.I [Ljava/lang/String;
      // 2c: ldc_w 1652139491
      // 2f: iload 2
      // 30: ldc_w 467120771
      // 33: ixor
      // 34: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 37: aaload
      // 38: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 3b: areturn
      // 3c: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3f: athrow
      // 40: iload 1
      // 41: ldc_w 1652139488
      // 44: iload 2
      // 45: ldc_w 1574242732
      // 48: ixor
      // 49: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 4c: if_icmpne 66
      // 4f: getstatic k74/x/IlIIIIIl.I [Ljava/lang/String;
      // 52: ldc_w 1652139489
      // 55: iload 2
      // 56: ldc_w 390465675
      // 59: ixor
      // 5a: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 5d: aaload
      // 5e: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 61: areturn
      // 62: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 65: athrow
      // 66: getstatic k74/x/IlIIIIIl.I [Ljava/lang/String;
      // 69: ldc_w 1652139486
      // 6c: iload 2
      // 6d: ldc_w 1753023303
      // 70: ixor
      // 71: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 74: aaload
      // 75: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 78: areturn
   }

   private String lIIl(String var1) {
      try {
         if (var1 == null) {
            return I[1];
         }
      } catch (IllegalStateException var2) {
         throw Illll(var2);
      }

      return var1.replaceAll(IlIIllIII.lI(I[0]), I[1]);
   }

   private boolean lIlI(class_1799 param1, String param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 04: ifne 2d
      // 07: aload 2
      // 08: ifnull 2d
      // 0b: goto 12
      // 0e: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11: athrow
      // 12: aload 2
      // 13: aload 0
      // 14: aload 1
      // 15: invokevirtual k74/x/IlIIIIIl.lIll (Lnet/minecraft/class_1799;)Ljava/lang/String;
      // 18: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1b: ifeq 2d
      // 1e: goto 25
      // 21: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: bipush 1
      // 26: goto 2e
      // 29: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c: athrow
      // 2d: bipush 0
      // 2e: ireturn
   }

   public IlIIIIIl() {
      int var1 = -1181093892;
      super(IlI, lllIIlIl.IlI, IlIIllIII.lI(I[IIIllI(1652139487, var1 ^ 198578753)]));
      this.Ill = this.IllIIll(
         new lIlllIl(IlIIllIII.Ill(I[IIIllI(1652139484, var1 ^ -1236927572)]), 75.0, 125.0, 0.0, 1000.0, 5.0)
            .lI(IlIIllIII.lI(I[IIIllI(1652139485, var1 ^ -886603965)]))
      );
      this.Il = this.IllIIll(new lllIIlII(IlIIllIII.Ill(I[IIIllI(1652139482, var1 ^ 1470585466)]), true));
      this.lIlI = this.IllIIll(new IllIII<>(IlIIllIII.Ill(I[IIIllI(1652139483, var1 ^ -1729258080)]), IlIIIlllI.class, IlIIIlllI.Il));
      this.llII = I[1];
      this.IIl = IlIIllIII.lI(I[IIIllI(1652139480, var1 ^ -9531173)]);
      this.llI = new ArrayList<>();
      this.lIll = 0L;
      this.Illl = new HashMap<>();
   }

   private String lIll(class_1799 var1) {
      return class_7923.field_41178.method_10221(var1.method_7909()).toString();
   }

   private List<lllIlll> llII() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/IlIIIIIl.llI Ljava/util/List;
      // 04: ifnull 1d
      // 07: invokestatic java/lang/System.currentTimeMillis ()J
      // 0a: aload 0
      // 0b: getfield k74/x/IlIIIIIl.lIll J
      // 0e: lsub
      // 0f: ldc2_w 3000
      // 12: lcmp
      // 13: ifle 28
      // 16: goto 1d
      // 19: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: aload 0
      // 1e: invokevirtual k74/x/IlIIIIIl.lIIll ()V
      // 21: goto 28
      // 24: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27: athrow
      // 28: aload 0
      // 29: getfield k74/x/IlIIIIIl.llI Ljava/util/List;
      // 2c: areturn
   }

   @Override
   public int lIllll() {
      return IIIllI(1652139481, 612900336 ^ -2061888028);
   }

   private static void lllI() {
      int var0 = 1208476680;
      I[0] = IIIIII(
         IIIIll(IIIllI(1652139478, var0 ^ 1315797396), IIIllI(1652139479, var0 ^ -1620715735)).toCharArray(), 35287L, IIIllI(1652139476, var0 ^ 202794059)
      );
      I[1] = IIIIII("".toCharArray(), 98774L, IIIllI(1652139477, var0 ^ 724924568));
      I[2] = IIIIII(
         IIIIll(IIIllI(1652139474, var0 ^ -1714772482), IIIllI(1652139475, var0 ^ 582765831)).toCharArray(), 92553L, IIIllI(1652139472, var0 ^ 128766958)
      );
      I[3] = IIIIII(
         IIIIll(IIIllI(1652139473, var0 ^ 1981347515), IIIllI(1652139470, var0 ^ -504824105)).toCharArray(), 695L, IIIllI(1652139471, var0 ^ -2092795452)
      );
      I[4] = IIIIII(
         IIIIll(IIIllI(1652139468, var0 ^ 126523379), IIIllI(1652139469, var0 ^ -1417002214)).toCharArray(), 64064L, IIIllI(1652139466, var0 ^ 228105801)
      );
      I[5] = IIIIII(
         IIIIll(IIIllI(1652139467, var0 ^ -1405658232), IIIllI(1652139464, var0 ^ 544231507)).toCharArray(), 29116L, IIIllI(1652139465, var0 ^ -1056790956)
      );
      I[IIIllI(1652139462, var0 ^ 1164325823)] = IIIIII(
         IIIIll(IIIllI(1652139463, var0 ^ -7240427), IIIllI(1652139460, var0 ^ -399177651)).toCharArray(), 74354L, IIIllI(1652139461, var0 ^ -765395546)
      );
      I[IIIllI(1652139458, var0 ^ -1688394620)] = IIIIII(
         IIIIll(IIIllI(1652139459, var0 ^ -321176093), IIIllI(1652139456, var0 ^ 1163292392)).toCharArray(), 54103L, IIIllI(1652139457, var0 ^ -437348148)
      );
      I[IIIllI(1652139454, var0 ^ -139167349)] = IIIIII(
         IIIIll(IIIllI(1652139455, var0 ^ -657696086), IIIllI(1652139452, var0 ^ -1868426379)).toCharArray(), 58564L, IIIllI(1652139453, var0 ^ -1099555290)
      );
      I[IIIllI(1652139450, var0 ^ 1617235824)] = IIIIII(
         IIIIll(IIIllI(1652139451, var0 ^ 1897811290), IIIllI(1652139448, var0 ^ -868052288)).toCharArray(), 50834L, IIIllI(1652139449, var0 ^ 1103888040)
      );
      I[IIIllI(1652139446, var0 ^ 1665959473)] = IIIIII(
         IIIIll(IIIllI(1652139447, var0 ^ -17745143), IIIllI(1652139444, var0 ^ -1047516863)).toCharArray(), 51912L, IIIllI(1652139445, var0 ^ -320938928)
      );
      I[IIIllI(1652139442, var0 ^ -13495874)] = IIIIII(
         IIIIll(IIIllI(1652139443, var0 ^ -107290921), IIIllI(1652139440, var0 ^ -487390096)).toCharArray(), 48279L, IIIllI(1652139441, var0 ^ -824943334)
      );
      I[IIIllI(1652139438, var0 ^ 1422284224)] = IIIIII(
         IIIIll(IIIllI(1652139439, var0 ^ -2141379546), IIIllI(1652139436, var0 ^ 397008489)).toCharArray(), 2440L, IIIllI(1652139437, var0 ^ 187146706)
      );
      I[IIIllI(1652139434, var0 ^ -45963535)] = IIIIII(
         IIIIll(IIIllI(1652139435, var0 ^ 2063228755), IIIllI(1652139432, var0 ^ 397328509)).toCharArray(), 33218L, IIIllI(1652139433, var0 ^ 252916867)
      );
      I[IIIllI(1652139430, var0 ^ 1345483020)] = IIIIII(
         IIIIll(IIIllI(1652139431, var0 ^ 86642486), IIIllI(1652139428, var0 ^ -2102242420)).toCharArray(), 81000L, IIIllI(1652139429, var0 ^ -1193897454)
      );
      I[IIIllI(1652139426, var0 ^ 1372150635)] = IIIIII(
         IIIIll(IIIllI(1652139427, var0 ^ 865159105), IIIllI(1652139424, var0 ^ 1756130493)).toCharArray(), 30846L, IIIllI(1652139425, var0 ^ 689931518)
      );
      I[IIIllI(1652139422, var0 ^ -820821187)] = IIIIII(
         IIIIll(IIIllI(1652139423, var0 ^ -952775243), IIIllI(1652139420, var0 ^ -1434135669)).toCharArray(), 46927L, IIIllI(1652139421, var0 ^ 48555947)
      );
      I[IIIllI(1652139418, var0 ^ -1364711093)] = IIIIII(
         IIIIll(IIIllI(1652139419, var0 ^ 508924400), IIIllI(1652139416, var0 ^ -970406452)).toCharArray(), 57225L, IIIllI(1652139417, var0 ^ -1774353052)
      );
      I[IIIllI(1652139414, var0 ^ -1971864919)] = IIIIII(
         IIIIll(IIIllI(1652139415, var0 ^ -1718617683), IIIllI(1652139412, var0 ^ 167930277)).toCharArray(), 9493L, IIIllI(1652139413, var0 ^ 1932776934)
      );
      I[IIIllI(1652139410, var0 ^ 1791616248)] = IIIIII(
         IIIIll(IIIllI(1652139411, var0 ^ -1941709226), IIIllI(1652139408, var0 ^ 1601928384)).toCharArray(), 27113L, IIIllI(1652139409, var0 ^ -1835556119)
      );
      I[IIIllI(1652139406, var0 ^ 325145347)] = IIIIII(
         IIIIll(IIIllI(1652139407, var0 ^ 1822505713), IIIllI(1652139404, var0 ^ 1429399844)).toCharArray(), 478L, IIIllI(1652139405, var0 ^ -906660669)
      );
      I[IIIllI(1652139402, var0 ^ -1627919126)] = IIIIII(
         IIIIll(IIIllI(1652139403, var0 ^ -1885212893), IIIllI(1652139400, var0 ^ 1689788539)).toCharArray(), 12519L, IIIllI(1652139401, var0 ^ 1995442494)
      );
      I[IIIllI(1652139398, var0 ^ -1974377447)] = IIIIII(
         IIIIll(IIIllI(1652139399, var0 ^ -24747353), IIIllI(1652139396, var0 ^ -952539769)).toCharArray(), 14669L, IIIllI(1652139397, var0 ^ 1208184900)
      );
      I[IIIllI(1652139394, var0 ^ 1460278993)] = IIIIII(
         IIIIll(IIIllI(1652139395, var0 ^ -866866304), IIIllI(1652139392, var0 ^ 1758632702)).toCharArray(), 40235L, IIIllI(1652139393, var0 ^ 427171546)
      );
      I[IIIllI(1652139390, var0 ^ 1364659630)] = IIIIII(
         IIIIll(IIIllI(1652139391, var0 ^ 216845940), IIIllI(1652139388, var0 ^ 964464909)).toCharArray(), 51274L, IIIllI(1652139389, var0 ^ -1543886967)
      );
      I[IIIllI(1652139386, var0 ^ -101360993)] = IIIIII(
         IIIIll(IIIllI(1652139387, var0 ^ 1053013388), IIIllI(1652139384, var0 ^ -510919633)).toCharArray(), 27185L, IIIllI(1652139385, var0 ^ 19649577)
      );
      I[IIIllI(1652139382, var0 ^ 462949523)] = IIIIII(
         IIIIll(IIIllI(1652139383, var0 ^ 2105224137), IIIllI(1652139380, var0 ^ -1563530852)).toCharArray(), 74998L, IIIllI(1652139381, var0 ^ 456580260)
      );
      I[IIIllI(1652139378, var0 ^ -1667967482)] = IIIIII(
         IIIIll(IIIllI(1652139379, var0 ^ -2012143278), IIIllI(1652139376, var0 ^ 1784086185)).toCharArray(), 94595L, IIIllI(1652139377, var0 ^ -77570644)
      );
      I[IIIllI(1652139374, var0 ^ -1540523619)] = IIIIII(
         IIIIll(IIIllI(1652139375, var0 ^ -1412094557), IIIllI(1652139372, var0 ^ -453338690)).toCharArray(), 28045L, IIIllI(1652139373, var0 ^ -1784620733)
      );
      I[IIIllI(1652139370, var0 ^ -1718101744)] = IIIIII(
         IIIIll(IIIllI(1652139371, var0 ^ -750734170), IIIllI(1652139368, var0 ^ -1676407732)).toCharArray(), 19104L, IIIllI(1652139369, var0 ^ -1179534298)
      );
      I[IIIllI(1652139366, var0 ^ 1801119453)] = IIIIII(
         IIIIll(IIIllI(1652139367, var0 ^ 25740877), IIIllI(1652139364, var0 ^ -1251296328)).toCharArray(), 16097L, IIIllI(1652139365, var0 ^ -1137669572)
      );
      I[IIIllI(1652139362, var0 ^ 849610300)] = IIIIII(
         IIIIll(IIIllI(1652139363, var0 ^ -846612843), IIIllI(1652139360, var0 ^ 1320878230)).toCharArray(), 98434L, IIIllI(1652139361, var0 ^ -1223632995)
      );
      I[IIIllI(1652139358, var0 ^ 2066078328)] = IIIIII(
         IIIIll(IIIllI(1652139359, var0 ^ 368568537), IIIllI(1652139356, var0 ^ 2115526428)).toCharArray(), 68028L, IIIllI(1652139357, var0 ^ -1013448948)
      );
      I[IIIllI(1652139354, var0 ^ -1939827797)] = IIIIII(
         IIIIll(IIIllI(1652139355, var0 ^ 480784615), IIIllI(1652139352, var0 ^ 1312599081)).toCharArray(), 7188L, IIIllI(1652139353, var0 ^ -619458329)
      );
      I[IIIllI(1652139350, var0 ^ -877255284)] = IIIIII(
         IIIIll(IIIllI(1652139351, var0 ^ -809149447), IIIllI(1652139348, var0 ^ -605128407)).toCharArray(), 91925L, IIIllI(1652139349, var0 ^ -288344420)
      );
      I[IIIllI(1652139346, var0 ^ 275489056)] = IIIIII(
         IIIIll(IIIllI(1652139347, var0 ^ 543369190), IIIllI(1652139344, var0 ^ -1499910040)).toCharArray(), 51328L, IIIllI(1652139345, var0 ^ -512464916)
      );
      I[IIIllI(1652139342, var0 ^ -740704594)] = IIIIII(
         IIIIll(IIIllI(1652139343, var0 ^ -569849583), IIIllI(1652139340, var0 ^ 1244341382)).toCharArray(), 93408L, IIIllI(1652139341, var0 ^ -414864481)
      );
      I[IIIllI(1652139338, var0 ^ -1927555157)] = IIIIII(
         IIIIll(IIIllI(1652139339, var0 ^ 122564004), IIIllI(1652139336, var0 ^ -1630599290)).toCharArray(), 75728L, IIIllI(1652139337, var0 ^ 86978814)
      );
      I[IIIllI(1652139334, var0 ^ 197500698)] = IIIIII(
         IIIIll(IIIllI(1652139335, var0 ^ 367560126), IIIllI(1652139332, var0 ^ -203508246)).toCharArray(), 90096L, IIIllI(1652139333, var0 ^ 331348305)
      );
      I[IIIllI(1652139330, var0 ^ -1267054891)] = IIIIII(
         IIIIll(IIIllI(1652139331, var0 ^ 1767239844), IIIllI(1652139328, var0 ^ -1480235339)).toCharArray(), 61711L, IIIllI(1652139329, var0 ^ -1779004801)
      );
      I[IIIllI(1652139326, var0 ^ 1265321709)] = IIIIII(
         IIIIll(IIIllI(1652139327, var0 ^ -1797792944), IIIllI(1652139324, var0 ^ -2100844808)).toCharArray(), 48061L, IIIllI(1652139325, var0 ^ 1013684445)
      );
      I[IIIllI(1652139322, var0 ^ -1804004065)] = IIIIII(
         IIIIll(IIIllI(1652139323, var0 ^ 2095987568), IIIllI(1652139320, var0 ^ 220970784)).toCharArray(), 18939L, IIIllI(1652139321, var0 ^ -801175811)
      );
      I[IIIllI(1652139318, var0 ^ -954078287)] = IIIIII(
         IIIIll(IIIllI(1652139319, var0 ^ -890705234), IIIllI(1652139316, var0 ^ -557356617)).toCharArray(), 60809L, IIIllI(1652139317, var0 ^ -96069083)
      );
      I[IIIllI(1652139314, var0 ^ -878793835)] = IIIIII(
         IIIIll(IIIllI(1652139315, var0 ^ 1811108727), IIIllI(1652139312, var0 ^ -1679780416)).toCharArray(), 91663L, IIIllI(1652139313, var0 ^ 1402337644)
      );
      I[IIIllI(1652139310, var0 ^ 767303290)] = IIIIII(
         IIIIll(IIIllI(1652139311, var0 ^ 55330133), IIIllI(1652139308, var0 ^ 1261433558)).toCharArray(), 4242L, IIIllI(1652139309, var0 ^ 1209373711)
      );
      I[IIIllI(1652139306, var0 ^ 1215306685)] = IIIIII(
         IIIIll(IIIllI(1652139307, var0 ^ -1440229193), IIIllI(1652139304, var0 ^ 1826436475)).toCharArray(), 16606L, IIIllI(1652139305, var0 ^ 656231789)
      );
      I[IIIllI(1652139302, var0 ^ -307950465)] = IIIIII(
         IIIIll(IIIllI(1652139303, var0 ^ 1942672899), IIIllI(1652139300, var0 ^ -1093847985)).toCharArray(), 40781L, IIIllI(1652139301, var0 ^ -866713790)
      );
      I[IIIllI(1652139298, var0 ^ 872999946)] = IIIIII(
         IIIIll(IIIllI(1652139299, var0 ^ -455693448), IIIllI(1652139296, var0 ^ -1103503716)).toCharArray(), 93648L, IIIllI(1652139297, var0 ^ -301828254)
      );
      I[IIIllI(1652139294, var0 ^ 1130867414)] = IIIIII(
         IIIIll(IIIllI(1652139295, var0 ^ -1571755976), IIIllI(1652139292, var0 ^ 925126473)).toCharArray(), 94997L, IIIllI(1652139293, var0 ^ -608089022)
      );
      I[IIIllI(1652139290, var0 ^ 345091650)] = IIIIII(
         IIIIll(IIIllI(1652139291, var0 ^ -1373352255), IIIllI(1652139288, var0 ^ 1619246260)).toCharArray(), 46188L, IIIllI(1652139289, var0 ^ -1597076151)
      );
      I[IIIllI(1652139286, var0 ^ -1807802076)] = IIIIII(
         IIIIll(IIIllI(1652139287, var0 ^ -185532118), IIIllI(1652139284, var0 ^ 1434325302)).toCharArray(), 53455L, IIIllI(1652139285, var0 ^ -1240612536)
      );
      I[IIIllI(1652139282, var0 ^ 1577071316)] = IIIIII(
         IIIIll(IIIllI(1652139283, var0 ^ 602795630), IIIllI(1652139280, var0 ^ 136311717)).toCharArray(), 37728L, IIIllI(1652139281, var0 ^ -483350458)
      );
      I[IIIllI(1652139278, var0 ^ 1332720927)] = IIIIII(
         IIIIll(IIIllI(1652139279, var0 ^ 110163307), IIIllI(1652139276, var0 ^ -1435569349)).toCharArray(), 59079L, IIIllI(1652139277, var0 ^ 672015477)
      );
      I[IIIllI(1652139274, var0 ^ -996374940)] = IIIIII(
         IIIIll(IIIllI(1652139275, var0 ^ 713984953), IIIllI(1652139272, var0 ^ -84085281)).toCharArray(), 48793L, IIIllI(1652139273, var0 ^ 2112558297)
      );
      I[IIIllI(1652139270, var0 ^ -1855724725)] = IIIIII(
         IIIIll(IIIllI(1652139271, var0 ^ -1614895119), IIIllI(1652139268, var0 ^ -344364672)).toCharArray(), 2388L, IIIllI(1652139269, var0 ^ 1327024992)
      );
      I[IIIllI(1652139266, var0 ^ 1086635246)] = IIIIII(
         IIIIll(IIIllI(1652139267, var0 ^ -348242922), IIIllI(1652139264, var0 ^ -1734344732)).toCharArray(), 98418L, IIIllI(1652139265, var0 ^ 1684703729)
      );
      I[IIIllI(1652139262, var0 ^ 281177280)] = IIIIII(
         IIIIll(IIIllI(1652139263, var0 ^ 1352025347), IIIllI(1652139260, var0 ^ 1538243491)).toCharArray(), 46346L, IIIllI(1652139261, var0 ^ -37044546)
      );
      I[IIIllI(1652139258, var0 ^ 92532586)] = IIIIII(
         IIIIll(IIIllI(1652139259, var0 ^ 1283472537), IIIllI(1652139256, var0 ^ 180138666)).toCharArray(), 59338L, IIIllI(1652139257, var0 ^ 30801327)
      );
      I[IIIllI(1652139254, var0 ^ 69052898)] = IIIIII(
         IIIIll(IIIllI(1652139255, var0 ^ -2069950167), IIIllI(1652139252, var0 ^ 115195497)).toCharArray(), 91319L, IIIllI(1652139253, var0 ^ -1893637019)
      );
      I[IIIllI(1652139250, var0 ^ -332318870)] = IIIIII(
         IIIIll(IIIllI(1652139251, var0 ^ -937927984), IIIllI(1652139248, var0 ^ 1957433699)).toCharArray(), 45620L, IIIllI(1652139249, var0 ^ -101972203)
      );
      I[IIIllI(1652139246, var0 ^ 290632192)] = IIIIII(
         IIIIll(IIIllI(1652139247, var0 ^ -452571340), IIIllI(1652139244, var0 ^ 903759318)).toCharArray(), 51713L, IIIllI(1652139245, var0 ^ -498266548)
      );
      I[IIIllI(1652139242, var0 ^ -46833415)] = IIIIII(
         IIIIll(IIIllI(1652139243, var0 ^ -859792296), IIIllI(1652139240, var0 ^ -843882489)).toCharArray(), 93312L, IIIllI(1652139241, var0 ^ -1253547859)
      );
      I[IIIllI(1652139238, var0 ^ -1912161349)] = IIIIII(
         IIIIll(IIIllI(1652139239, var0 ^ 841644529), IIIllI(1652139236, var0 ^ -720587321)).toCharArray(), 26655L, IIIllI(1652139237, var0 ^ -1429334471)
      );
      I[IIIllI(1652139234, var0 ^ -1678174219)] = IIIIII(
         IIIIll(IIIllI(1652139235, var0 ^ -2013045825), IIIllI(1652139232, var0 ^ -465640254)).toCharArray(), 89427L, IIIllI(1652139233, var0 ^ 1422727184)
      );
      I[IIIllI(1652139230, var0 ^ -252953923)] = IIIIII(
         IIIIll(IIIllI(1652139231, var0 ^ 673638401), IIIllI(1652139228, var0 ^ 971219621)).toCharArray(), 21951L, IIIllI(1652139229, var0 ^ -261993145)
      );
      I[IIIllI(1652139226, var0 ^ 1768489369)] = IIIIII(
         IIIIll(IIIllI(1652139227, var0 ^ 603081130), IIIllI(1652139224, var0 ^ -1149442970)).toCharArray(), 9318L, IIIllI(1652139225, var0 ^ 1254942242)
      );
      I[IIIllI(1652139222, var0 ^ -468333014)] = IIIIII(
         IIIIll(IIIllI(1652139223, var0 ^ 1519118489), IIIllI(1652139220, var0 ^ 1618463960)).toCharArray(), 63940L, IIIllI(1652139221, var0 ^ 1075178383)
      );
      I[IIIllI(1652139218, var0 ^ -2011524973)] = IIIIII(
         IIIIll(IIIllI(1652139219, var0 ^ -502833977), IIIllI(1652139216, var0 ^ 1329458212)).toCharArray(), 68488L, IIIllI(1652139217, var0 ^ -771254413)
      );
      I[IIIllI(1652139214, var0 ^ -455048379)] = IIIIII(
         IIIIll(IIIllI(1652139215, var0 ^ 1903757900), IIIllI(1652139212, var0 ^ -14955031)).toCharArray(), 62414L, IIIllI(1652139213, var0 ^ -563226475)
      );
      I[IIIllI(1652139210, var0 ^ 1994085567)] = IIIIII(
         IIIIll(IIIllI(1652139211, var0 ^ -1130445931), IIIllI(1652139208, var0 ^ 2014398502)).toCharArray(), 25313L, IIIllI(1652139209, var0 ^ -273379711)
      );
   }

   private boolean IIIII(class_1799 param1, int param2, Map<Integer, IIlIllIll> param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 3
      // 01: iload 2
      // 02: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 05: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0a: checkcast k74/x/IIlIllIll
      // 0d: astore 4
      // 0f: aload 4
      // 11: ifnull 2d
      // 14: aload 0
      // 15: aload 1
      // 16: aload 4
      // 18: invokevirtual k74/x/IlIIIIIl.lll (Lnet/minecraft/class_1799;Lk74/x/IIlIllIll;)Z
      // 1b: ifeq 2d
      // 1e: goto 25
      // 21: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: bipush 1
      // 26: goto 2e
      // 29: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c: athrow
      // 2d: bipush 0
      // 2e: ireturn
   }

   private void IIIIl(class_310 var1) {
      try {
         String var10001 = IlIIllIII.lI(I[IIIllI(1652139206, -1350257262 ^ -690985801)]);
         String var3 = this.lllII(this.lIl);
         String var2 = var10001;
         this.IIl = var2 + var3;
         this.IIlI = false;
         this.lIl = null;
         this.llII = I[1];
         this.IIll = false;
         if (this.Il.IllI()) {
            this.IIIl(var1);
            return;
         }
      } catch (IllegalStateException var4) {
         throw Illll(var4);
      }

      this.IlIl = false;
      this.lIIl = false;
   }

   @Override
   public void llIIII(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokevirtual k74/x/IlIIIIIl.IIIIlIl ()Z
      // 004: ifeq 020
      // 007: aload 1
      // 008: ifnull 020
      // 00b: goto 012
      // 00e: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 011: athrow
      // 012: aload 1
      // 013: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 016: ifnonnull 025
      // 019: goto 020
      // 01c: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01f: athrow
      // 020: return
      // 021: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 024: athrow
      // 025: aload 1
      // 026: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 029: ifnull 042
      // 02c: aload 1
      // 02d: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 030: instanceof net/minecraft/class_490
      // 033: ifne 042
      // 036: goto 03d
      // 039: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03c: athrow
      // 03d: return
      // 03e: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 041: athrow
      // 042: aload 0
      // 043: invokevirtual k74/x/IlIIIIIl.llII ()Ljava/util/List;
      // 046: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 04b: astore 2
      // 04c: aload 2
      // 04d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 052: ifeq 100
      // 055: aload 2
      // 056: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 05b: checkcast k74/x/lllIlll
      // 05e: astore 3
      // 05f: aload 3
      // 060: ifnull 04c
      // 063: aload 3
      // 064: getfield k74/x/lllIlll.II Ljava/lang/String;
      // 067: ifnull 04c
      // 06a: aload 3
      // 06b: getfield k74/x/lllIlll.Il Ljava/lang/String;
      // 06e: ifnull 04c
      // 071: aload 3
      // 072: getfield k74/x/lllIlll.Il Ljava/lang/String;
      // 075: invokevirtual java/lang/String.isBlank ()Z
      // 078: ifeq 082
      // 07b: goto 04c
      // 07e: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 081: athrow
      // 082: aload 3
      // 083: getfield k74/x/lllIlll.Il Ljava/lang/String;
      // 086: invokestatic net/minecraft/class_3675.method_15981 (Ljava/lang/String;)Lnet/minecraft/class_3675$class_306;
      // 089: astore 4
      // 08b: goto 093
      // 08e: astore 5
      // 090: goto 04c
      // 093: aload 4
      // 095: ifnull 04c
      // 098: aload 4
      // 09a: getstatic net/minecraft/class_3675.field_16237 Lnet/minecraft/class_3675$class_306;
      // 09d: invokevirtual net/minecraft/class_3675$class_306.equals (Ljava/lang/Object;)Z
      // 0a0: ifeq 0aa
      // 0a3: goto 04c
      // 0a6: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a9: athrow
      // 0aa: aload 1
      // 0ab: aload 4
      // 0ad: invokestatic k74/x/IIll.IIIllll (Lnet/minecraft/class_310;Lnet/minecraft/class_3675$class_306;)Z
      // 0b0: istore 5
      // 0b2: aload 0
      // 0b3: getfield k74/x/IlIIIIIl.Illl Ljava/util/Map;
      // 0b6: aload 3
      // 0b7: getfield k74/x/lllIlll.II Ljava/lang/String;
      // 0ba: bipush 0
      // 0bb: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0be: invokeinterface java/util/Map.getOrDefault (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0c3: checkcast java/lang/Boolean
      // 0c6: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0c9: istore 6
      // 0cb: aload 0
      // 0cc: getfield k74/x/IlIIIIIl.Illl Ljava/util/Map;
      // 0cf: aload 3
      // 0d0: getfield k74/x/lllIlll.II Ljava/lang/String;
      // 0d3: iload 5
      // 0d5: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0d8: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0dd: pop
      // 0de: iload 5
      // 0e0: ifeq 0fd
      // 0e3: iload 6
      // 0e5: ifne 0fd
      // 0e8: goto 0ef
      // 0eb: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ee: athrow
      // 0ef: aload 0
      // 0f0: aload 3
      // 0f1: getfield k74/x/lllIlll.II Ljava/lang/String;
      // 0f4: invokevirtual k74/x/IlIIIIIl.IllIl (Ljava/lang/String;)Ljava/util/Map;
      // 0f7: pop
      // 0f8: goto 0fd
      // 0fb: astore 7
      // 0fd: goto 04c
      // 100: return
   }

   private lllIlll IIIlI(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 12
      // 04: aload 1
      // 05: invokevirtual java/lang/String.isBlank ()Z
      // 08: ifeq 18
      // 0b: goto 12
      // 0e: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11: athrow
      // 12: aconst_null
      // 13: areturn
      // 14: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: aload 0
      // 19: aload 1
      // 1a: invokevirtual k74/x/IlIIIIIl.l (Ljava/lang/String;)Ljava/nio/file/Path;
      // 1d: astore 2
      // 1e: aload 2
      // 1f: ifnull 34
      // 22: aload 2
      // 23: bipush 0
      // 24: anewarray 399
      // 27: invokestatic java/nio/file/Files.exists (Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
      // 2a: ifne 3a
      // 2d: goto 34
      // 30: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 33: athrow
      // 34: aconst_null
      // 35: areturn
      // 36: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39: athrow
      // 3a: aload 0
      // 3b: aload 2
      // 3c: invokevirtual k74/x/IlIIIIIl.IIlll (Ljava/nio/file/Path;)Lk74/x/lllIlll;
      // 3f: areturn
   }

   private lllIlll IIIll(class_746 var1, String var2) {
      String var3 = this.III(var2);
      if (var3.isBlank()) {
         String var10000 = IlIIllIII.lI(I[IIIllI(1652139207, -2061806187 ^ -827542584)]);
         int var12 = this.lII().size() + 1;
         String var11 = var10000;
         var3 = var11 + var12;
      }

      lllIlll var4 = new lllIlll();
      var4.lI = 1;
      var4.I = var3;
      var4.II = this.IIIIlI(var3);
      var4.ll = System.currentTimeMillis();
      var4.l = new ArrayList<>();

      for (int var8 : lll) {
         class_1799 var9 = this.IllI(var1, var8);

         try {
            if (var9.method_7960()) {
               continue;
            }
         } catch (IllegalStateException var13) {
            throw Illll(var13);
         }

         IIlIllIll var10 = new IIlIllIll();
         var10.l = this.lIII(var8);
         var10.ll = this.IIII(var8);
         var10.lI = var8;
         var10.I = this.lIll(var9);
         var10.II = this.IIlII(var9);
         var10.III = var9.method_7964().getString();
         var10.Il = var9.method_7947();
         var4.l.add(var10);
      }

      return var4;
   }

   private String IIlII(class_1799 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w -1388340269
      // 003: istore 9
      // 005: invokestatic k74/x/IIllllIl.IIIIl ()[Ljava/lang/String;
      // 008: astore 2
      // 009: aload 1
      // 00a: ifnull 01b
      // 00d: aload 1
      // 00e: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 011: ifeq 021
      // 014: goto 01b
      // 017: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01a: athrow
      // 01b: aconst_null
      // 01c: areturn
      // 01d: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 020: athrow
      // 021: aload 1
      // 022: getstatic net/minecraft/class_9334.field_49651 Lnet/minecraft/class_9331;
      // 025: invokevirtual net/minecraft/class_1799.method_58694 (Lnet/minecraft/class_9331;)Ljava/lang/Object;
      // 028: checkcast net/minecraft/class_1844
      // 02b: astore 3
      // 02c: aload 3
      // 02d: ifnonnull 036
      // 030: aconst_null
      // 031: areturn
      // 032: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 035: athrow
      // 036: new java/lang/StringBuilder
      // 039: dup
      // 03a: invokespecial java/lang/StringBuilder.<init> ()V
      // 03d: astore 4
      // 03f: aload 3
      // 040: invokevirtual net/minecraft/class_1844.comp_2378 ()Ljava/util/Optional;
      // 043: invokevirtual java/util/Optional.isPresent ()Z
      // 046: ifeq 084
      // 049: getstatic net/minecraft/class_7923.field_41179 Lnet/minecraft/class_2378;
      // 04c: aload 3
      // 04d: invokevirtual net/minecraft/class_1844.comp_2378 ()Ljava/util/Optional;
      // 050: invokevirtual java/util/Optional.get ()Ljava/lang/Object;
      // 053: checkcast net/minecraft/class_6880
      // 056: invokeinterface net/minecraft/class_6880.comp_349 ()Ljava/lang/Object; 1
      // 05b: checkcast net/minecraft/class_1842
      // 05e: invokeinterface net/minecraft/class_2378.method_10221 (Ljava/lang/Object;)Lnet/minecraft/class_2960; 2
      // 063: astore 5
      // 065: aload 4
      // 067: aload 5
      // 069: ifnonnull 07b
      // 06c: getstatic k74/x/IlIIIIIl.I [Ljava/lang/String;
      // 06f: bipush 2
      // 070: aaload
      // 071: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 074: goto 080
      // 077: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07a: athrow
      // 07b: aload 5
      // 07d: invokevirtual net/minecraft/class_2960.toString ()Ljava/lang/String;
      // 080: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 083: pop
      // 084: new java/util/ArrayList
      // 087: dup
      // 088: invokespecial java/util/ArrayList.<init> ()V
      // 08b: astore 5
      // 08d: aload 3
      // 08e: invokevirtual net/minecraft/class_1844.comp_2380 ()Ljava/util/List;
      // 091: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 096: astore 6
      // 098: aload 6
      // 09a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 09f: ifeq 0bc
      // 0a2: aload 6
      // 0a4: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0a9: checkcast net/minecraft/class_1293
      // 0ac: astore 7
      // 0ae: aload 5
      // 0b0: aload 7
      // 0b2: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0b7: pop
      // 0b8: aload 2
      // 0b9: ifnull 098
      // 0bc: aload 5
      // 0be: invokeinterface java/util/List.isEmpty ()Z 1
      // 0c3: ifne 18d
      // 0c6: aload 5
      // 0c8: invokedynamic apply ()Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, k74/x/IlIIIIIl.lIlIl (Lnet/minecraft/class_1293;)Ljava/lang/String;, (Lnet/minecraft/class_1293;)Ljava/lang/String; ]
      // 0cd: invokestatic java/util/Comparator.comparing (Ljava/util/function/Function;)Ljava/util/Comparator;
      // 0d0: invokeinterface java/util/List.sort (Ljava/util/Comparator;)V 2
      // 0d5: aload 4
      // 0d7: ldc_w 1652139204
      // 0da: iload 9
      // 0dc: ldc_w -952795685
      // 0df: ixor
      // 0e0: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 0e3: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0e6: pop
      // 0e7: bipush 0
      // 0e8: istore 6
      // 0ea: iload 6
      // 0ec: aload 5
      // 0ee: invokeinterface java/util/List.size ()I 1
      // 0f3: if_icmpge 18d
      // 0f6: aload 5
      // 0f8: iload 6
      // 0fa: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0ff: checkcast net/minecraft/class_1293
      // 102: astore 7
      // 104: getstatic net/minecraft/class_7923.field_41174 Lnet/minecraft/class_2378;
      // 107: aload 7
      // 109: invokevirtual net/minecraft/class_1293.method_5579 ()Lnet/minecraft/class_6880;
      // 10c: invokeinterface net/minecraft/class_6880.comp_349 ()Ljava/lang/Object; 1
      // 111: checkcast net/minecraft/class_1291
      // 114: invokeinterface net/minecraft/class_2378.method_10221 (Ljava/lang/Object;)Lnet/minecraft/class_2960; 2
      // 119: astore 8
      // 11b: iload 6
      // 11d: ifle 139
      // 120: aload 4
      // 122: ldc_w 1652139205
      // 125: iload 9
      // 127: ldc_w 1819559352
      // 12a: ixor
      // 12b: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 12e: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 131: pop
      // 132: goto 139
      // 135: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 138: athrow
      // 139: aload 4
      // 13b: aload 8
      // 13d: ifnonnull 14f
      // 140: getstatic k74/x/IlIIIIIl.I [Ljava/lang/String;
      // 143: bipush 2
      // 144: aaload
      // 145: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 148: goto 154
      // 14b: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14e: athrow
      // 14f: aload 8
      // 151: invokevirtual net/minecraft/class_2960.toString ()Ljava/lang/String;
      // 154: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 157: ldc_w 1652139202
      // 15a: iload 9
      // 15c: ldc_w -1317690862
      // 15f: ixor
      // 160: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 163: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 166: aload 7
      // 168: invokevirtual net/minecraft/class_1293.method_5578 ()I
      // 16b: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 16e: ldc_w 1652139203
      // 171: iload 9
      // 173: ldc_w -356306408
      // 176: ixor
      // 177: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 17a: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 17d: aload 7
      // 17f: invokevirtual net/minecraft/class_1293.method_5584 ()I
      // 182: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 185: pop
      // 186: iinc 6 1
      // 189: aload 2
      // 18a: ifnull 0ea
      // 18d: aload 3
      // 18e: invokevirtual net/minecraft/class_1844.comp_2379 ()Ljava/util/Optional;
      // 191: invokevirtual java/util/Optional.isPresent ()Z
      // 194: ifeq 1c0
      // 197: aload 4
      // 199: ldc_w 1652139200
      // 19c: iload 9
      // 19e: ldc_w 219824582
      // 1a1: ixor
      // 1a2: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 1a5: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 1a8: aload 3
      // 1a9: invokevirtual net/minecraft/class_1844.comp_2379 ()Ljava/util/Optional;
      // 1ac: invokevirtual java/util/Optional.get ()Ljava/lang/Object;
      // 1af: checkcast java/lang/Integer
      // 1b2: invokevirtual java/lang/Integer.intValue ()I
      // 1b5: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 1b8: pop
      // 1b9: goto 1c0
      // 1bc: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1bf: athrow
      // 1c0: aload 4
      // 1c2: invokevirtual java/lang/StringBuilder.length ()I
      // 1c5: ifne 1d0
      // 1c8: aconst_null
      // 1c9: goto 1d5
      // 1cc: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1cf: athrow
      // 1d0: aload 4
      // 1d2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1d5: areturn
   }

   private Map<String, Object> IIllI(lllIlll param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w 1502355994
      // 003: istore 7
      // 005: new java/util/LinkedHashMap
      // 008: dup
      // 009: invokespecial java/util/LinkedHashMap.<init> ()V
      // 00c: astore 3
      // 00d: invokestatic k74/x/IIllllIl.IIIIl ()[Ljava/lang/String;
      // 010: aload 3
      // 011: getstatic k74/x/IlIIIIIl.I [Ljava/lang/String;
      // 014: ldc_w 1652139201
      // 017: iload 7
      // 019: ldc_w 1483958180
      // 01c: ixor
      // 01d: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 020: aaload
      // 021: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 024: aload 1
      // 025: getfield k74/x/lllIlll.II Ljava/lang/String;
      // 028: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 02d: pop
      // 02e: aload 3
      // 02f: getstatic k74/x/IlIIIIIl.I [Ljava/lang/String;
      // 032: ldc_w 1652139198
      // 035: iload 7
      // 037: ldc_w 978104277
      // 03a: ixor
      // 03b: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 03e: aaload
      // 03f: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 042: aload 0
      // 043: aload 1
      // 044: invokevirtual k74/x/IlIIIIIl.lllII (Lk74/x/lllIlll;)Ljava/lang/String;
      // 047: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 04c: pop
      // 04d: astore 2
      // 04e: aload 3
      // 04f: getstatic k74/x/IlIIIIIl.I [Ljava/lang/String;
      // 052: ldc_w 1652139199
      // 055: iload 7
      // 057: ldc_w -20342377
      // 05a: ixor
      // 05b: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 05e: aaload
      // 05f: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 062: aload 1
      // 063: getfield k74/x/lllIlll.ll J
      // 066: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 069: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 06e: pop
      // 06f: aload 3
      // 070: getstatic k74/x/IlIIIIIl.I [Ljava/lang/String;
      // 073: ldc_w 1652139196
      // 076: iload 7
      // 078: ldc_w -983579669
      // 07b: ixor
      // 07c: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 07f: aaload
      // 080: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 083: aload 1
      // 084: getfield k74/x/lllIlll.l Ljava/util/List;
      // 087: ifnonnull 092
      // 08a: bipush 0
      // 08b: goto 09b
      // 08e: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 091: athrow
      // 092: aload 1
      // 093: getfield k74/x/lllIlll.l Ljava/util/List;
      // 096: invokeinterface java/util/List.size ()I 1
      // 09b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 09e: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0a3: pop
      // 0a4: aload 3
      // 0a5: getstatic k74/x/IlIIIIIl.I [Ljava/lang/String;
      // 0a8: ldc_w 1652139197
      // 0ab: iload 7
      // 0ad: ldc_w -343369180
      // 0b0: ixor
      // 0b1: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 0b4: aaload
      // 0b5: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0b8: aload 1
      // 0b9: getfield k74/x/lllIlll.Il Ljava/lang/String;
      // 0bc: ifnonnull 0cb
      // 0bf: getstatic k74/x/IlIIIIIl.I [Ljava/lang/String;
      // 0c2: bipush 1
      // 0c3: aaload
      // 0c4: goto 0cf
      // 0c7: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ca: athrow
      // 0cb: aload 1
      // 0cc: getfield k74/x/lllIlll.Il Ljava/lang/String;
      // 0cf: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0d4: pop
      // 0d5: aload 3
      // 0d6: getstatic k74/x/IlIIIIIl.I [Ljava/lang/String;
      // 0d9: ldc_w 1652139194
      // 0dc: iload 7
      // 0de: ldc_w -1144587924
      // 0e1: ixor
      // 0e2: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 0e5: aaload
      // 0e6: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0e9: aload 0
      // 0ea: aload 1
      // 0eb: invokevirtual k74/x/IlIIIIIl.lIlII (Lk74/x/lllIlll;)Ljava/lang/String;
      // 0ee: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0f3: pop
      // 0f4: aload 3
      // 0f5: getstatic k74/x/IlIIIIIl.I [Ljava/lang/String;
      // 0f8: ldc_w 1652139195
      // 0fb: iload 7
      // 0fd: ldc_w 2074858322
      // 100: ixor
      // 101: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 104: aaload
      // 105: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 108: aload 0
      // 109: aload 1
      // 10a: invokevirtual k74/x/IlIIIIIl.llllI (Lk74/x/lllIlll;)Ljava/util/Map;
      // 10d: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 112: pop
      // 113: new java/util/ArrayList
      // 116: dup
      // 117: invokespecial java/util/ArrayList.<init> ()V
      // 11a: astore 4
      // 11c: aload 1
      // 11d: getfield k74/x/lllIlll.l Ljava/util/List;
      // 120: ifnull 175
      // 123: aload 1
      // 124: getfield k74/x/lllIlll.l Ljava/util/List;
      // 127: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 12c: astore 5
      // 12e: aload 5
      // 130: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 135: ifeq 175
      // 138: aload 5
      // 13a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 13f: checkcast k74/x/IIlIllIll
      // 142: astore 6
      // 144: aload 6
      // 146: ifnull 171
      // 149: aload 0
      // 14a: aload 6
      // 14c: getfield k74/x/IIlIllIll.lI I
      // 14f: invokevirtual k74/x/IlIIIIIl.llIlI (I)Z
      // 152: ifeq 171
      // 155: goto 15c
      // 158: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15b: athrow
      // 15c: aload 4
      // 15e: aload 0
      // 15f: aload 6
      // 161: invokevirtual k74/x/IlIIIIIl.IIIlIl (Lk74/x/IIlIllIll;)Ljava/util/Map;
      // 164: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 169: pop
      // 16a: goto 171
      // 16d: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 170: athrow
      // 171: aload 2
      // 172: ifnull 12e
      // 175: aload 3
      // 176: getstatic k74/x/IlIIIIIl.I [Ljava/lang/String;
      // 179: ldc_w 1652139192
      // 17c: iload 7
      // 17e: ldc_w -1332168629
      // 181: ixor
      // 182: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 185: aaload
      // 186: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 189: aload 4
      // 18b: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 190: pop
      // 191: aload 3
      // 192: areturn
   }

   private lllIlll IIlll(Path var1) {
      try {
         lllIlll var2 = (lllIlll)ll.fromJson(Files.readString(var1), lllIlll.class);

         try {
            if (var2 == null || var2.II == null) {
               return null;
            }
         } catch (Exception var4) {
            throw Illll(var4);
         }

         try {
            if (var2.l == null) {
               var2.l = new ArrayList<>();
            }
         } catch (Exception var3) {
            throw Illll(var3);
         }

         return var2;
      } catch (Exception var5) {
         return null;
      }
   }

   private void IllII(class_310 var1, class_746 var2, int var3, int var4) {
      int var5 = var2.field_7498.field_7763;

      try {
         if (var3 == IIIllI(1652139193, 2015520548 ^ 888441787)) {
            var1.field_1761.method_2906(var5, var4, IIIllI(1652139190, 2015520548 ^ -1546630356), class_1713.field_7791, var2);
            return;
         }
      } catch (IllegalStateException var7) {
         throw Illll(var7);
      }

      try {
         if (var4 == IIIllI(1652139191, 2015520548 ^ 1849479171)) {
            var1.field_1761.method_2906(var5, var3, IIIllI(1652139188, 2015520548 ^ -2061717337), class_1713.field_7791, var2);
            return;
         }
      } catch (IllegalStateException var8) {
         throw Illll(var8);
      }

      try {
         var1.field_1761.method_2906(var5, var3, 0, class_1713.field_7790, var2);
         var1.field_1761.method_2906(var5, var4, 0, class_1713.field_7790, var2);
         if (!var2.field_7498.method_34255().method_7960()) {
            var1.field_1761.method_2906(var5, var3, 0, class_1713.field_7790, var2);
         }
      } catch (IllegalStateException var6) {
         throw Illll(var6);
      }
   }

   public Map<String, Object> IllIl(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: aload 0
      // 002: aload 1
      // 003: invokevirtual k74/x/IlIIIIIl.lIIl (Ljava/lang/String;)Ljava/lang/String;
      // 006: invokevirtual k74/x/IlIIIIIl.IIIlI (Ljava/lang/String;)Lk74/x/lllIlll;
      // 009: astore 2
      // 00a: aload 2
      // 00b: ifnonnull 02e
      // 00e: new java/lang/IllegalArgumentException
      // 011: dup
      // 012: getstatic k74/x/IlIIIIIl.I [Ljava/lang/String;
      // 015: ldc_w 1652139189
      // 018: ldc_w 1758052378
      // 01b: ldc_w 455868596
      // 01e: ixor
      // 01f: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 022: aaload
      // 023: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 026: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 029: athrow
      // 02a: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02d: athrow
      // 02e: aload 0
      // 02f: invokevirtual k74/x/IlIIIIIl.IIIIlIl ()Z
      // 032: ifne 08b
      // 035: new java/lang/IllegalStateException
      // 038: dup
      // 039: getstatic k74/x/IlIIIIIl.I [Ljava/lang/String;
      // 03c: ldc_w 1652139186
      // 03f: ldc_w 1758052378
      // 042: ldc_w -901266884
      // 045: ixor
      // 046: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 049: aaload
      // 04a: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 04d: getstatic k74/x/IlIIIIIl.IlI Ljava/lang/String;
      // 050: getstatic k74/x/IlIIIIIl.I [Ljava/lang/String;
      // 053: ldc_w 1652139187
      // 056: ldc_w 1758052378
      // 059: ldc_w -517221216
      // 05c: ixor
      // 05d: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 060: aaload
      // 061: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 064: astore 6
      // 066: astore 5
      // 068: astore 4
      // 06a: new java/lang/StringBuilder
      // 06d: dup
      // 06e: invokespecial java/lang/StringBuilder.<init> ()V
      // 071: aload 4
      // 073: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 076: aload 5
      // 078: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 07b: aload 6
      // 07d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 080: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 083: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 086: athrow
      // 087: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08a: athrow
      // 08b: aload 0
      // 08c: aload 2
      // 08d: putfield k74/x/IlIIIIIl.lIl Lk74/x/lllIlll;
      // 090: aload 0
      // 091: aload 2
      // 092: getfield k74/x/lllIlll.II Ljava/lang/String;
      // 095: ifnonnull 0a4
      // 098: getstatic k74/x/IlIIIIIl.I [Ljava/lang/String;
      // 09b: bipush 1
      // 09c: aaload
      // 09d: goto 0a8
      // 0a0: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a3: athrow
      // 0a4: aload 2
      // 0a5: getfield k74/x/lllIlll.II Ljava/lang/String;
      // 0a8: putfield k74/x/IlIIIIIl.llII Ljava/lang/String;
      // 0ab: aload 0
      // 0ac: bipush 1
      // 0ad: putfield k74/x/IlIIIIIl.IIlI Z
      // 0b0: aload 0
      // 0b1: bipush 0
      // 0b2: putfield k74/x/IlIIIIIl.IlIl Z
      // 0b5: aload 0
      // 0b6: bipush 0
      // 0b7: putfield k74/x/IlIIIIIl.lIIl Z
      // 0ba: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 0bd: astore 3
      // 0be: aload 0
      // 0bf: aload 3
      // 0c0: ifnull 0dc
      // 0c3: aload 3
      // 0c4: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 0c7: instanceof net/minecraft/class_490
      // 0ca: ifeq 0dc
      // 0cd: goto 0d4
      // 0d0: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d3: athrow
      // 0d4: bipush 1
      // 0d5: goto 0dd
      // 0d8: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0db: athrow
      // 0dc: bipush 0
      // 0dd: putfield k74/x/IlIIIIIl.IIll Z
      // 0e0: aload 0
      // 0e1: lconst_0
      // 0e2: putfield k74/x/IlIIIIIl.lI J
      // 0e5: aload 0
      // 0e6: lconst_0
      // 0e7: putfield k74/x/IlIIIIIl.III J
      // 0ea: aload 0
      // 0eb: getstatic k74/x/IlIIIIIl.I [Ljava/lang/String;
      // 0ee: ldc_w 1652139184
      // 0f1: ldc_w 1758052378
      // 0f4: ldc_w 358294040
      // 0f7: ixor
      // 0f8: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 0fb: aaload
      // 0fc: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0ff: aload 0
      // 100: aload 2
      // 101: invokevirtual k74/x/IlIIIIIl.lllII (Lk74/x/lllIlll;)Ljava/lang/String;
      // 104: astore 6
      // 106: astore 5
      // 108: new java/lang/StringBuilder
      // 10b: dup
      // 10c: invokespecial java/lang/StringBuilder.<init> ()V
      // 10f: aload 5
      // 111: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 114: aload 6
      // 116: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 119: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 11c: putfield k74/x/IlIIIIIl.IIl Ljava/lang/String;
      // 11f: aload 0
      // 120: invokevirtual k74/x/IlIIIIIl.IIl ()Ljava/util/Map;
      // 123: areturn
   }

   private class_306 IlllI(lllIlll param1) {
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
      // 05: getfield k74/x/lllIlll.Il Ljava/lang/String;
      // 08: ifnull 23
      // 0b: goto 12
      // 0e: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11: athrow
      // 12: aload 1
      // 13: getfield k74/x/lllIlll.Il Ljava/lang/String;
      // 16: invokevirtual java/lang/String.isBlank ()Z
      // 19: ifeq 2b
      // 1c: goto 23
      // 1f: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22: athrow
      // 23: getstatic net/minecraft/class_3675.field_16237 Lnet/minecraft/class_3675$class_306;
      // 26: areturn
      // 27: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: aload 1
      // 2c: getfield k74/x/lllIlll.Il Ljava/lang/String;
      // 2f: invokestatic net/minecraft/class_3675.method_15981 (Ljava/lang/String;)Lnet/minecraft/class_3675$class_306;
      // 32: areturn
      // 33: astore 2
      // 34: getstatic net/minecraft/class_3675.field_16237 Lnet/minecraft/class_3675$class_306;
      // 37: areturn
   }

   private static Throwable Illll(Throwable var0) {
      return var0;
   }

   private Path lIIII() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic k74/x/IIIIIllII.III ()Lk74/x/IIIIIllII;
      // 03: astore 1
      // 04: aload 1
      // 05: ifnull 16
      // 08: aload 1
      // 09: invokevirtual k74/x/IIIIIllII.ll ()Lk74/x/IlllIlI;
      // 0c: ifnonnull 1c
      // 0f: goto 16
      // 12: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aconst_null
      // 17: areturn
      // 18: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b: athrow
      // 1c: aload 1
      // 1d: invokevirtual k74/x/IIIIIllII.ll ()Lk74/x/IlllIlI;
      // 20: invokevirtual k74/x/IlllIlI.llIlI ()Ljava/nio/file/Path;
      // 23: areturn
   }

   private int lIIIl(class_746 param1, Map<Integer, IIlIllIll> param2, IIlIllIll param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush -1
      // 01: istore 4
      // 03: ldc_w 1652139169
      // 06: ldc_w -1462920419
      // 09: ldc_w -210434985
      // 0c: ixor
      // 0d: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 10: istore 5
      // 12: getstatic k74/x/IlIIIIIl.lll [I
      // 15: astore 6
      // 17: aload 6
      // 19: arraylength
      // 1a: istore 7
      // 1c: bipush 0
      // 1d: istore 8
      // 1f: iload 8
      // 21: iload 7
      // 23: if_icmpge b4
      // 26: aload 6
      // 28: iload 8
      // 2a: iaload
      // 2b: istore 9
      // 2d: iload 9
      // 2f: aload 3
      // 30: getfield k74/x/IIlIllIll.lI I
      // 33: if_icmpne 3d
      // 36: goto ae
      // 39: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c: athrow
      // 3d: aload 0
      // 3e: aload 1
      // 3f: iload 9
      // 41: invokevirtual k74/x/IlIIIIIl.IllI (Lnet/minecraft/class_746;I)Lnet/minecraft/class_1799;
      // 44: astore 10
      // 46: aload 0
      // 47: aload 10
      // 49: aload 3
      // 4a: invokevirtual k74/x/IlIIIIIl.lll (Lnet/minecraft/class_1799;Lk74/x/IIlIllIll;)Z
      // 4d: ifeq ae
      // 50: aload 0
      // 51: aload 10
      // 53: iload 9
      // 55: aload 2
      // 56: invokevirtual k74/x/IlIIIIIl.IIIII (Lnet/minecraft/class_1799;ILjava/util/Map;)Z
      // 59: ifeq 6a
      // 5c: goto 63
      // 5f: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: goto ae
      // 66: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 69: athrow
      // 6a: ldc_w 1652139166
      // 6d: ldc_w -1462920419
      // 70: ldc_w 1266736694
      // 73: ixor
      // 74: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 77: aload 10
      // 79: invokevirtual net/minecraft/class_1799.method_7947 ()I
      // 7c: aload 3
      // 7d: getfield k74/x/IIlIllIll.Il I
      // 80: isub
      // 81: invokestatic java/lang/Math.abs (I)I
      // 84: isub
      // 85: istore 11
      // 87: aload 2
      // 88: iload 9
      // 8a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 8d: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 92: ifne 9f
      // 95: iinc 11 100
      // 98: goto 9f
      // 9b: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9e: athrow
      // 9f: iload 11
      // a1: iload 5
      // a3: if_icmple ae
      // a6: iload 11
      // a8: istore 5
      // aa: iload 9
      // ac: istore 4
      // ae: iinc 8 1
      // b1: goto 1f
      // b4: iload 4
      // b6: ireturn
   }

   private long lIIlI() {
      double var1 = this.Ill.IIlI();
      double var3 = this.Ill.IlI();

      try {
         if (var1 == var3) {
            return Math.round(var1);
         }
      } catch (IllegalStateException var5) {
         throw Illll(var5);
      }

      return Math.round(ThreadLocalRandom.current().nextDouble(var1, var3));
   }

   private void lIIll() {
      this.llI = this.lII();
      this.lIll = System.currentTimeMillis();
   }

   private String lIlII(lllIlll var1) {
      class_306 var2 = this.IlllI(var1);

      try {
         if (k74.x.IIll.IIlll(var2)) {
            return I[1];
         }
      } catch (IllegalStateException var3) {
         throw Illll(var3);
      }

      return k74.x.IIll.lI(var2);
   }

   private static String lIlIl(class_1293 var0) {
      class_2960 var1 = class_7923.field_41174.method_10221((class_1291)var0.method_5579().comp_349());

      try {
         if (var1 == null) {
            return I[1];
         }
      } catch (IllegalStateException var2) {
         throw Illll(var2);
      }

      return var1.toString();
   }

   public List<lII> lIllI() {
      ArrayList var1 = new ArrayList();

      for (lllIlll var3 : this.llII()) {
         if (var3 != null) {
            try {
               if (var3.II == null) {
                  continue;
               }
            } catch (IllegalStateException var5) {
               throw Illll(var5);
            }

            ArrayList var10000;
            lII var10001;
            lII var10002;
            String var10003;
            String var10004;
            String var10005;
            int var10006;
            label26: {
               try {
                  var10000 = var1;
                  var10001 = new lII;
                  var10002 = var10001;
                  var10003 = var3.II;
                  var10004 = this.lllII(var3);
                  var10005 = this.lIlII(var3);
                  if (var3.l == null) {
                     var10006 = 0;
                     break label26;
                  }
               } catch (IllegalStateException var4) {
                  throw Illll(var4);
               }

               var10006 = var3.l.size();
            }

            var10002./* $VF: Unable to resugar constructor */<init>(var10003, var10004, var10005, var10006);
            var10000.add(var10001);
         }
      }

      return var1;
   }

   private lIllI lIlll(class_746 param1, lllIlll param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 2
      // 01: ifnull 25
      // 04: aload 2
      // 05: getfield k74/x/lllIlll.l Ljava/util/List;
      // 08: ifnull 25
      // 0b: goto 12
      // 0e: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11: athrow
      // 12: aload 2
      // 13: getfield k74/x/lllIlll.l Ljava/util/List;
      // 16: invokeinterface java/util/List.isEmpty ()Z 1
      // 1b: ifeq 2b
      // 1e: goto 25
      // 21: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: aconst_null
      // 26: areturn
      // 27: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: aload 0
      // 2c: aload 2
      // 2d: invokevirtual k74/x/IlIIIIIl.llIIl (Lk74/x/lllIlll;)Ljava/util/Map;
      // 30: astore 3
      // 31: aload 2
      // 32: getfield k74/x/lllIlll.l Ljava/util/List;
      // 35: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 3a: astore 4
      // 3c: aload 4
      // 3e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 43: ifeq b5
      // 46: aload 4
      // 48: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 4d: checkcast k74/x/IIlIllIll
      // 50: astore 5
      // 52: aload 5
      // 54: ifnull 3c
      // 57: aload 0
      // 58: aload 5
      // 5a: getfield k74/x/IIlIllIll.lI I
      // 5d: invokevirtual k74/x/IlIIIIIl.llIlI (I)Z
      // 60: ifeq 3c
      // 63: aload 5
      // 65: getfield k74/x/IIlIllIll.I Ljava/lang/String;
      // 68: ifnonnull 72
      // 6b: goto 3c
      // 6e: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 71: athrow
      // 72: aload 0
      // 73: aload 1
      // 74: aload 5
      // 76: getfield k74/x/IIlIllIll.lI I
      // 79: invokevirtual k74/x/IlIIIIIl.IllI (Lnet/minecraft/class_746;I)Lnet/minecraft/class_1799;
      // 7c: astore 6
      // 7e: aload 0
      // 7f: aload 6
      // 81: aload 5
      // 83: invokevirtual k74/x/IlIIIIIl.lll (Lnet/minecraft/class_1799;Lk74/x/IIlIllIll;)Z
      // 86: ifeq 90
      // 89: goto 3c
      // 8c: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8f: athrow
      // 90: aload 0
      // 91: aload 1
      // 92: aload 3
      // 93: aload 5
      // 95: invokevirtual k74/x/IlIIIIIl.lIIIl (Lnet/minecraft/class_746;Ljava/util/Map;Lk74/x/IIlIllIll;)I
      // 98: istore 7
      // 9a: iload 7
      // 9c: iflt b2
      // 9f: new k74/x/lIllI
      // a2: dup
      // a3: iload 7
      // a5: aload 5
      // a7: getfield k74/x/IIlIllIll.lI I
      // aa: invokespecial k74/x/lIllI.<init> (II)V
      // ad: areturn
      // ae: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b1: athrow
      // b2: goto 3c
      // b5: aconst_null
      // b6: areturn
   }

   private boolean llIII(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 47
      // 04: aload 1
      // 05: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 08: ifnull 47
      // 0b: goto 12
      // 0e: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11: athrow
      // 12: aload 1
      // 13: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 16: ifnull 47
      // 19: goto 20
      // 1c: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: aload 1
      // 21: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 24: ifnull 47
      // 27: goto 2e
      // 2a: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d: athrow
      // 2e: aload 1
      // 2f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 32: getfield net/minecraft/class_746.field_7498 Lnet/minecraft/class_1723;
      // 35: ifnull 47
      // 38: goto 3f
      // 3b: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e: athrow
      // 3f: bipush 1
      // 40: goto 48
      // 43: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 46: athrow
      // 47: bipush 0
      // 48: ireturn
   }

   private Map<Integer, IIlIllIll> llIIl(lllIlll param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: new java/util/HashMap
      // 03: dup
      // 04: invokespecial java/util/HashMap.<init> ()V
      // 07: astore 2
      // 08: aload 1
      // 09: ifnull 1a
      // 0c: aload 1
      // 0d: getfield k74/x/lllIlll.l Ljava/util/List;
      // 10: ifnonnull 20
      // 13: goto 1a
      // 16: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19: athrow
      // 1a: aload 2
      // 1b: areturn
      // 1c: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: aload 1
      // 21: getfield k74/x/lllIlll.l Ljava/util/List;
      // 24: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 29: astore 3
      // 2a: aload 3
      // 2b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 30: ifeq 71
      // 33: aload 3
      // 34: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 39: checkcast k74/x/IIlIllIll
      // 3c: astore 4
      // 3e: aload 4
      // 40: ifnull 6e
      // 43: aload 0
      // 44: aload 4
      // 46: getfield k74/x/IIlIllIll.lI I
      // 49: invokevirtual k74/x/IlIIIIIl.llIlI (I)Z
      // 4c: ifeq 6e
      // 4f: goto 56
      // 52: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 55: athrow
      // 56: aload 2
      // 57: aload 4
      // 59: getfield k74/x/IIlIllIll.lI I
      // 5c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 5f: aload 4
      // 61: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 66: pop
      // 67: goto 6e
      // 6a: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6d: athrow
      // 6e: goto 2a
      // 71: aload 2
      // 72: areturn
   }

   private boolean llIlI(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: ldc_w -314348340
      // 03: istore 2
      // 04: iload 1
      // 05: ldc_w 1652139167
      // 08: iload 2
      // 09: ldc_w -762738914
      // 0c: ixor
      // 0d: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 10: if_icmplt 29
      // 13: iload 1
      // 14: ldc_w 1652139164
      // 17: iload 2
      // 18: ldc_w -18233461
      // 1b: ixor
      // 1c: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 1f: if_icmplt 6b
      // 22: goto 29
      // 25: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28: athrow
      // 29: iload 1
      // 2a: ldc_w 1652139165
      // 2d: iload 2
      // 2e: ldc_w -436001144
      // 31: ixor
      // 32: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 35: if_icmplt 55
      // 38: goto 3f
      // 3b: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e: athrow
      // 3f: iload 1
      // 40: ldc_w 1652139162
      // 43: iload 2
      // 44: ldc_w 186899388
      // 47: ixor
      // 48: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 4b: if_icmplt 6b
      // 4e: goto 55
      // 51: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 54: athrow
      // 55: iload 1
      // 56: ldc_w 1652139163
      // 59: iload 2
      // 5a: ldc_w 248410704
      // 5d: ixor
      // 5e: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 61: if_icmpne 73
      // 64: goto 6b
      // 67: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6a: athrow
      // 6b: bipush 1
      // 6c: goto 74
      // 6f: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 72: athrow
      // 73: bipush 0
      // 74: ireturn
   }

   private lllIlll llIll(Path var1) {
      return this.IIlll(var1);
   }

   private String lllII(lllIlll param1) {
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
      // 05: getfield k74/x/lllIlll.I Ljava/lang/String;
      // 08: ifnull 23
      // 0b: goto 12
      // 0e: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11: athrow
      // 12: aload 1
      // 13: getfield k74/x/lllIlll.I Ljava/lang/String;
      // 16: invokevirtual java/lang/String.isBlank ()Z
      // 19: ifeq 32
      // 1c: goto 23
      // 1f: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22: athrow
      // 23: getstatic k74/x/IlIIIIIl.I [Ljava/lang/String;
      // 26: bipush 4
      // 27: aaload
      // 28: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 2b: goto 36
      // 2e: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 1
      // 33: getfield k74/x/lllIlll.I Ljava/lang/String;
      // 36: areturn
   }

   public Map<String, Object> lllIl(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: invokevirtual k74/x/IlIIIIIl.lIIl (Ljava/lang/String;)Ljava/lang/String;
      // 05: astore 2
      // 06: aload 2
      // 07: invokevirtual java/lang/String.isBlank ()Z
      // 0a: ifeq 2d
      // 0d: new java/lang/IllegalArgumentException
      // 10: dup
      // 11: getstatic k74/x/IlIIIIIl.I [Ljava/lang/String;
      // 14: ldc_w 1652139160
      // 17: ldc_w 2072677468
      // 1a: ldc_w -613267879
      // 1d: ixor
      // 1e: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 21: aaload
      // 22: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 25: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 28: athrow
      // 29: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c: athrow
      // 2d: aload 0
      // 2e: aload 2
      // 2f: invokevirtual k74/x/IlIIIIIl.l (Ljava/lang/String;)Ljava/nio/file/Path;
      // 32: astore 3
      // 33: aload 3
      // 34: ifnull 49
      // 37: aload 3
      // 38: bipush 0
      // 39: anewarray 399
      // 3c: invokestatic java/nio/file/Files.exists (Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
      // 3f: ifne 69
      // 42: goto 49
      // 45: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 48: athrow
      // 49: new java/lang/IllegalArgumentException
      // 4c: dup
      // 4d: getstatic k74/x/IlIIIIIl.I [Ljava/lang/String;
      // 50: ldc_w 1652139161
      // 53: ldc_w 2072677468
      // 56: ldc_w -1973533472
      // 59: ixor
      // 5a: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 5d: aaload
      // 5e: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 61: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 64: athrow
      // 65: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 68: athrow
      // 69: aload 3
      // 6a: invokestatic java/nio/file/Files.deleteIfExists (Ljava/nio/file/Path;)Z
      // 6d: pop
      // 6e: goto ae
      // 71: astore 4
      // 73: new java/lang/IllegalStateException
      // 76: dup
      // 77: getstatic k74/x/IlIIIIIl.I [Ljava/lang/String;
      // 7a: ldc_w 1652139158
      // 7d: ldc_w 2072677468
      // 80: ldc_w 100870020
      // 83: ixor
      // 84: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 87: aaload
      // 88: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 8b: aload 4
      // 8d: invokevirtual java/io/IOException.getMessage ()Ljava/lang/String;
      // 90: astore 6
      // 92: astore 5
      // 94: new java/lang/StringBuilder
      // 97: dup
      // 98: invokespecial java/lang/StringBuilder.<init> ()V
      // 9b: aload 5
      // 9d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // a0: aload 6
      // a2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // a5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // a8: aload 4
      // aa: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // ad: athrow
      // ae: aload 2
      // af: aload 0
      // b0: getfield k74/x/IlIIIIIl.llII Ljava/lang/String;
      // b3: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // b6: ifeq db
      // b9: aload 0
      // ba: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // bd: getstatic k74/x/IlIIIIIl.I [Ljava/lang/String;
      // c0: ldc_w 1652139159
      // c3: ldc_w 2072677468
      // c6: ldc_w -1482233860
      // c9: ixor
      // ca: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // cd: aaload
      // ce: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // d1: invokevirtual k74/x/IlIIIIIl.IIIlII (Lnet/minecraft/class_310;Ljava/lang/String;)V
      // d4: goto db
      // d7: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // da: athrow
      // db: aload 0
      // dc: getfield k74/x/IlIIIIIl.Illl Ljava/util/Map;
      // df: aload 2
      // e0: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // e5: pop
      // e6: aload 0
      // e7: invokevirtual k74/x/IlIIIIIl.lIIll ()V
      // ea: aload 0
      // eb: invokevirtual k74/x/IlIIIIIl.IIl ()Ljava/util/Map;
      // ee: areturn
   }

   private Map<String, Object> llllI(lllIlll var1) {
      int var5 = -1459641105;
      class_306 var2 = this.IlllI(var1);
      boolean var3 = k74.x.IIll.IIlll(var2);
      LinkedHashMap var4 = new LinkedHashMap();

      LinkedHashMap var10000;
      String var10001;
      String var10002;
      label53: {
         try {
            var4.put(IlIIllIII.lI(I[IIIllI(1652139156, var5 ^ -1999470136)]), var3);
            var10000 = var4;
            var10001 = IlIIllIII.lI(I[IIIllI(1652139157, var5 ^ -1525677947)]);
            if (var3) {
               var10002 = I[1];
               break label53;
            }
         } catch (IllegalStateException var9) {
            throw Illll(var9);
         }

         var10002 = k74.x.IIll.lI(var2);
      }

      label46: {
         try {
            var10000.put(var10001, var10002);
            var10000 = var4;
            var10001 = IlIIllIII.lI(I[IIIllI(1652139154, var5 ^ 644911058)]);
            if (var3) {
               var10002 = I[1];
               break label46;
            }
         } catch (IllegalStateException var8) {
            throw Illll(var8);
         }

         var10002 = var2.method_1441();
      }

      label39: {
         try {
            var10000.put(var10001, var10002);
            var10000 = var4;
            var10001 = IlIIllIII.lI(I[IIIllI(1652139155, var5 ^ 1223043932)]);
            if (var3) {
               var10002 = IlIIllIII.lI(I[IIIllI(1652139152, var5 ^ 1166577308)]);
               break label39;
            }
         } catch (IllegalStateException var7) {
            throw Illll(var7);
         }

         var10002 = var2.method_1442().name().toLowerCase(Locale.ROOT);
      }

      label32: {
         try {
            var10000.put(var10001, var10002);
            var10000 = var4;
            var10001 = IlIIllIII.lI(I[IIIllI(1652139153, var5 ^ 210494251)]);
            if (var3) {
               var18 = -1;
               break label32;
            }
         } catch (IllegalStateException var6) {
            throw Illll(var6);
         }

         var18 = var2.method_1444();
      }

      var10000.put(var10001, var18);
      return var4;
   }

   public Map<String, Object> lllll(String param1, String param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: invokevirtual k74/x/IlIIIIIl.lIIl (Ljava/lang/String;)Ljava/lang/String;
      // 05: astore 3
      // 06: aload 3
      // 07: invokevirtual java/lang/String.isBlank ()Z
      // 0a: ifeq 2d
      // 0d: new java/lang/IllegalArgumentException
      // 10: dup
      // 11: getstatic k74/x/IlIIIIIl.I [Ljava/lang/String;
      // 14: ldc_w 1652139150
      // 17: ldc_w -1068379856
      // 1a: ldc_w 941586725
      // 1d: ixor
      // 1e: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 21: aaload
      // 22: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 25: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 28: athrow
      // 29: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c: athrow
      // 2d: aload 0
      // 2e: aload 3
      // 2f: invokevirtual k74/x/IlIIIIIl.IIIlI (Ljava/lang/String;)Lk74/x/lllIlll;
      // 32: astore 4
      // 34: aload 4
      // 36: ifnonnull 59
      // 39: new java/lang/IllegalArgumentException
      // 3c: dup
      // 3d: getstatic k74/x/IlIIIIIl.I [Ljava/lang/String;
      // 40: ldc_w 1652139151
      // 43: ldc_w -1068379856
      // 46: ldc_w -1856219860
      // 49: ixor
      // 4a: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 4d: aaload
      // 4e: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 51: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 54: athrow
      // 55: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 58: athrow
      // 59: aload 2
      // 5a: ifnull 8d
      // 5d: aload 2
      // 5e: invokevirtual java/lang/String.isBlank ()Z
      // 61: ifne 8d
      // 64: goto 6b
      // 67: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6a: athrow
      // 6b: getstatic k74/x/IlIIIIIl.I [Ljava/lang/String;
      // 6e: ldc_w 1652139148
      // 71: ldc_w -1068379856
      // 74: ldc_w -643046176
      // 77: ixor
      // 78: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 7b: aaload
      // 7c: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 7f: aload 2
      // 80: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 83: ifeq 9a
      // 86: goto 8d
      // 89: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8c: athrow
      // 8d: aload 4
      // 8f: aconst_null
      // 90: putfield k74/x/lllIlll.Il Ljava/lang/String;
      // 93: goto df
      // 96: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 99: athrow
      // 9a: aload 2
      // 9b: invokestatic net/minecraft/class_3675.method_15981 (Ljava/lang/String;)Lnet/minecraft/class_3675$class_306;
      // 9e: pop
      // 9f: goto d9
      // a2: astore 5
      // a4: new java/lang/IllegalArgumentException
      // a7: dup
      // a8: getstatic k74/x/IlIIIIIl.I [Ljava/lang/String;
      // ab: ldc_w 1652139149
      // ae: ldc_w -1068379856
      // b1: ldc_w -84432302
      // b4: ixor
      // b5: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // b8: aaload
      // b9: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // bc: aload 2
      // bd: astore 7
      // bf: astore 6
      // c1: new java/lang/StringBuilder
      // c4: dup
      // c5: invokespecial java/lang/StringBuilder.<init> ()V
      // c8: aload 6
      // ca: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // cd: aload 7
      // cf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // d2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // d5: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // d8: athrow
      // d9: aload 4
      // db: aload 2
      // dc: putfield k74/x/lllIlll.Il Ljava/lang/String;
      // df: aload 0
      // e0: aload 4
      // e2: invokevirtual k74/x/IlIIIIIl.IlII (Lk74/x/lllIlll;)V
      // e5: aload 0
      // e6: invokevirtual k74/x/IlIIIIIl.lIIll ()V
      // e9: aload 0
      // ea: getfield k74/x/IlIIIIIl.Illl Ljava/util/Map;
      // ed: aload 3
      // ee: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // f3: pop
      // f4: aload 0
      // f5: invokevirtual k74/x/IlIIIIIl.IIl ()Ljava/util/Map;
      // f8: areturn
   }

   private static String IIIIII(char[] var0, long var1, int var3) {
      int var4 = IIIllI(1652139146, 1158171560 ^ -1007402782) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & IIIllI(1652139147, 1158171560 ^ -1870282829);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private String IIIIIl(lllIlll var1) {
      return this.lllII(var1);
   }

   private String IIIIlI(String var1) {
      int var10 = -1444350251;
      String var2 = this.III(var1)
         .toLowerCase(Locale.ROOT)
         .replaceAll(IlIIllIII.lI(I[IIIllI(1652139144, var10 ^ 1370990112)]), IlIIllIII.lI(I[IIIllI(1652139145, var10 ^ -1954266353)]))
         .replaceAll(IlIIllIII.lI(I[IIIllI(1652139142, var10 ^ -1776837668)]), I[1]);
      if (var2.isBlank()) {
         var2 = IlIIllIII.lI(I[IIIllI(1652139143, var10 ^ -1108609988)]);
      }

      String var10001 = IlIIllIII.lI(I[IIIllI(1652139140, var10 ^ -1893559330)]);
      String var8 = Long.toString(System.currentTimeMillis(), IIIllI(1652139141, var10 ^ 2064690529));
      String var7 = var10001;
      String var3 = var2 + var7 + var8;
      String var4 = var3;
      int var5 = 2;

      while (true) {
         try {
            if (this.l(var4) == null || !Files.exists(this.l(var4))) {
               return var4;
            }
         } catch (IllegalStateException var11) {
            throw Illll(var11);
         }

         var10001 = IlIIllIII.lI(I[IIIllI(1652139138, var10 ^ 221082800)]);
         int var9 = var5++;
         var8 = var10001;
         var4 = var3 + var8 + var9;
      }
   }

   private static String IIIIll(int var0, int var1) {
      int var9 = 752756069;
      int var2 = (var0 ^ IIIllI(1652139139, var9 ^ 955831961)) & IIIllI(1652139136, var9 ^ 1470893362);
      if (IIIl[var2] == null) {
         char[] var3 = IlII[var2].toCharArray();

         int var4 = switch (var3[0] & IIIllI(1652139137, var9 ^ 1874830652)) {
            case 0 -> IIIllI(1652139134, var9 ^ 379393785);
            case 1 -> IIIllI(1652139135, var9 ^ -1795698641);
            case 2 -> IIIllI(1652139132, var9 ^ 1396319817);
            case 3 -> 1;
            case 4 -> IIIllI(1652139133, var9 ^ -393249384);
            case 5 -> IIIllI(1652139130, var9 ^ -673955140);
            case 6 -> IIIllI(1652139131, var9 ^ 632340319);
            case 7 -> IIIllI(1652139128, var9 ^ 1995306323);
            case 8 -> IIIllI(1652139129, var9 ^ 345801164);
            case 9 -> IIIllI(1652139126, var9 ^ -581716303);
            case 10 -> IIIllI(1652139127, var9 ^ -1478845769);
            case 11 -> IIIllI(1652139124, var9 ^ 248829732);
            case 12 -> IIIllI(1652139125, var9 ^ 1680888500);
            case 13 -> IIIllI(1652139122, var9 ^ 1425080961);
            case 14 -> IIIllI(1652139123, var9 ^ -1291079941);
            case 15 -> IIIllI(1652139120, var9 ^ 1510194849);
            case 16 -> IIIllI(1652139121, var9 ^ 1872897953);
            case 17 -> IIIllI(1652139118, var9 ^ -1217324010);
            case 18 -> IIIllI(1652139119, var9 ^ -1678156312);
            case 19 -> IIIllI(1652139116, var9 ^ 2115448842);
            case 20 -> IIIllI(1652139117, var9 ^ 1325188984);
            case 21 -> IIIllI(1652139114, var9 ^ 1244166814);
            case 22 -> IIIllI(1652139115, var9 ^ -1698827578);
            case 23 -> IIIllI(1652139112, var9 ^ 399131810);
            case 24 -> IIIllI(1652139113, var9 ^ 1102016954);
            case 25 -> IIIllI(1652139110, var9 ^ 160135416);
            case 26 -> IIIllI(1652139111, var9 ^ -1963025232);
            case 27 -> IIIllI(1652139108, var9 ^ -73105362);
            case 28 -> IIIllI(1652139109, var9 ^ 1336284701);
            case 29 -> IIIllI(1652139106, var9 ^ -1917934237);
            case 30 -> IIIllI(1652139107, var9 ^ -1568206021);
            case 31 -> IIIllI(1652139104, var9 ^ -585668865);
            case 32 -> IIIllI(1652139105, var9 ^ -1678296018);
            case 33 -> IIIllI(1652139102, var9 ^ 1429194408);
            case 34 -> IIIllI(1652139103, var9 ^ -2076725377);
            case 35 -> IIIllI(1652139100, var9 ^ -1452417493);
            case 36 -> IIIllI(1652139101, var9 ^ -1307556293);
            case 37 -> IIIllI(1652139098, var9 ^ -1579109726);
            case 38 -> IIIllI(1652139099, var9 ^ -631435396);
            case 39 -> IIIllI(1652139096, var9 ^ -843806678);
            case 40 -> IIIllI(1652139097, var9 ^ 939776411);
            case 41 -> IIIllI(1652139094, var9 ^ 1413752170);
            case 42 -> IIIllI(1652139095, var9 ^ -704231703);
            case 43 -> IIIllI(1652139092, var9 ^ -1129888634);
            case 44 -> IIIllI(1652139093, var9 ^ 1883768444);
            case 45 -> IIIllI(1652139090, var9 ^ 1165619210);
            case 46 -> IIIllI(1652139091, var9 ^ -1316214700);
            case 47 -> IIIllI(1652139088, var9 ^ 2000451331);
            case 48 -> IIIllI(1652139089, var9 ^ -301096759);
            case 49 -> IIIllI(1652139086, var9 ^ 920995630);
            case 50 -> IIIllI(1652139087, var9 ^ 1615011433);
            case 51 -> IIIllI(1652139084, var9 ^ 2058693750);
            case 52 -> 4;
            case 53 -> IIIllI(1652139085, var9 ^ -1437602918);
            case 54 -> IIIllI(1652139082, var9 ^ -2035568013);
            case 55 -> IIIllI(1652139083, var9 ^ -966223720);
            case 56 -> IIIllI(1652139080, var9 ^ -1851329536);
            case 57 -> IIIllI(1652139081, var9 ^ 1264938522);
            case 58 -> IIIllI(1652139078, var9 ^ -1781933059);
            case 59 -> IIIllI(1652139079, var9 ^ 1965601216);
            case 60 -> IIIllI(1652139076, var9 ^ 829838087);
            case 61 -> IIIllI(1652139077, var9 ^ -1643230260);
            case 62 -> IIIllI(1652139074, var9 ^ 623105594);
            case 63 -> IIIllI(1652139075, var9 ^ -1956309959);
            case 64 -> IIIllI(1652139072, var9 ^ 1474072879);
            case 65 -> IIIllI(1652139073, var9 ^ 1945215633);
            case 66 -> IIIllI(1652139070, var9 ^ -617557478);
            case 67 -> IIIllI(1652139071, var9 ^ -186799836);
            case 68 -> IIIllI(1652139068, var9 ^ 1648344267);
            case 69 -> IIIllI(1652139069, var9 ^ 1317672144);
            case 70 -> IIIllI(1652139066, var9 ^ 1100991452);
            case 71 -> IIIllI(1652139067, var9 ^ 379459939);
            case 72 -> IIIllI(1652139064, var9 ^ 548954611);
            case 73 -> IIIllI(1652139065, var9 ^ -999325515);
            case 74 -> IIIllI(1652139062, var9 ^ -128111928);
            case 75 -> IIIllI(1652139063, var9 ^ 141921257);
            case 76 -> IIIllI(1652139060, var9 ^ -1954241742);
            case 77 -> IIIllI(1652139061, var9 ^ 1787118265);
            case 78 -> IIIllI(1652139058, var9 ^ 1550285702);
            case 79 -> IIIllI(1652139059, var9 ^ -2001306424);
            case 80 -> IIIllI(1652139056, var9 ^ -535008831);
            case 81 -> IIIllI(1652139057, var9 ^ -1899743549);
            case 82 -> IIIllI(1652139054, var9 ^ 696499904);
            case 83 -> IIIllI(1652139055, var9 ^ 1534247996);
            case 84 -> IIIllI(1652139052, var9 ^ -1713830747);
            case 85 -> IIIllI(1652139053, var9 ^ 360388634);
            case 86 -> IIIllI(1652139050, var9 ^ 229737586);
            case 87 -> IIIllI(1652139051, var9 ^ 1065483211);
            case 88 -> IIIllI(1652139048, var9 ^ -1194831577);
            case 89 -> IIIllI(1652139049, var9 ^ -1393222039);
            case 90 -> IIIllI(1652139046, var9 ^ 1967777827);
            case 91 -> IIIllI(1652139047, var9 ^ -1141463454);
            case 92 -> IIIllI(1652139044, var9 ^ -688346863);
            case 93 -> IIIllI(1652139045, var9 ^ 1765365082);
            case 94 -> IIIllI(1652139042, var9 ^ -1613625229);
            case 95 -> IIIllI(1652139043, var9 ^ -331407620);
            case 96 -> IIIllI(1652139040, var9 ^ 518332054);
            case 97 -> IIIllI(1652139041, var9 ^ -85117449);
            case 98 -> IIIllI(1652139038, var9 ^ 1991581171);
            case 99 -> 0;
            case 100 -> IIIllI(1652139039, var9 ^ -867707202);
            case 101 -> IIIllI(1652139036, var9 ^ -482884980);
            case 102 -> IIIllI(1652139037, var9 ^ 1140377291);
            case 103 -> IIIllI(1652139034, var9 ^ 865924351);
            case 104 -> IIIllI(1652139035, var9 ^ 1447741452);
            case 105 -> IIIllI(1652139032, var9 ^ 238689679);
            case 106 -> IIIllI(1652139033, var9 ^ -646593554);
            case 107 -> IIIllI(1652139030, var9 ^ 867809277);
            case 108 -> IIIllI(1652139031, var9 ^ 1430767896);
            case 109 -> IIIllI(1652139028, var9 ^ -1891417704);
            case 110 -> IIIllI(1652139029, var9 ^ -1566406545);
            case 111 -> IIIllI(1652139026, var9 ^ -1923705391);
            case 112 -> IIIllI(1652139027, var9 ^ -1250498571);
            case 113 -> IIIllI(1652139024, var9 ^ -1540406719);
            case 114 -> IIIllI(1652139025, var9 ^ -724112658);
            case 115 -> IIIllI(1652139022, var9 ^ 112575294);
            case 116 -> IIIllI(1652139023, var9 ^ -855964551);
            case 117 -> IIIllI(1652139020, var9 ^ -1762411664);
            case 118 -> IIIllI(1652139021, var9 ^ -360554582);
            case 119 -> IIIllI(1652139018, var9 ^ -1608103802);
            case 120 -> IIIllI(1652139019, var9 ^ -840025539);
            case 121 -> IIIllI(1652139016, var9 ^ -226711486);
            case 122 -> IIIllI(1652139017, var9 ^ -915895804);
            case 123 -> IIIllI(1652139014, var9 ^ 1462137617);
            case 124 -> IIIllI(1652139015, var9 ^ -778248391);
            case 125 -> IIIllI(1652139012, var9 ^ -1294119729);
            case 126 -> IIIllI(1652139013, var9 ^ -1404773949);
            case 127 -> IIIllI(1652139010, var9 ^ 1300064846);
            case 128 -> IIIllI(1652139011, var9 ^ 1436310906);
            case 129 -> IIIllI(1652139008, var9 ^ -585911288);
            case 130 -> IIIllI(1652139009, var9 ^ 1376443571);
            case 131 -> IIIllI(1652140030, var9 ^ -1102920609);
            case 132 -> IIIllI(1652140031, var9 ^ -897805200);
            case 133 -> IIIllI(1652140028, var9 ^ 2733123);
            case 134 -> IIIllI(1652140029, var9 ^ -244641073);
            case 135 -> IIIllI(1652140026, var9 ^ -1566470441);
            case 136 -> IIIllI(1652140027, var9 ^ -28213705);
            case 137 -> IIIllI(1652140024, var9 ^ 1841934239);
            case 138 -> IIIllI(1652140025, var9 ^ 1511277060);
            case 139 -> IIIllI(1652140022, var9 ^ 960499870);
            case 140 -> IIIllI(1652140023, var9 ^ -1435999741);
            case 141 -> IIIllI(1652140020, var9 ^ 1424942382);
            case 142 -> IIIllI(1652140021, var9 ^ 317663831);
            case 143 -> IIIllI(1652140018, var9 ^ 1308809112);
            case 144 -> IIIllI(1652140019, var9 ^ -983407488);
            case 145 -> IIIllI(1652140016, var9 ^ -2116686525);
            case 146 -> IIIllI(1652140017, var9 ^ -44029462);
            case 147 -> IIIllI(1652140014, var9 ^ -1339695083);
            case 148 -> IIIllI(1652140015, var9 ^ -1227817752);
            case 149 -> 2;
            case 150 -> IIIllI(1652140012, var9 ^ -396916835);
            case 151 -> IIIllI(1652140013, var9 ^ 1163799637);
            case 152 -> IIIllI(1652140010, var9 ^ 1339066097);
            case 153 -> IIIllI(1652140011, var9 ^ -898520054);
            case 154 -> IIIllI(1652140008, var9 ^ -1763052921);
            case 155 -> IIIllI(1652140009, var9 ^ 465372597);
            case 156 -> 5;
            case 157 -> IIIllI(1652140006, var9 ^ -798033796);
            case 158 -> IIIllI(1652140007, var9 ^ 1830224646);
            case 159 -> IIIllI(1652140004, var9 ^ 171462366);
            case 160 -> IIIllI(1652140005, var9 ^ -1721007561);
            case 161 -> IIIllI(1652140002, var9 ^ 922813115);
            case 162 -> IIIllI(1652140003, var9 ^ 1595670224);
            case 163 -> IIIllI(1652140000, var9 ^ 1337417702);
            case 164 -> IIIllI(1652140001, var9 ^ 586196950);
            case 165 -> IIIllI(1652139998, var9 ^ 1021641887);
            case 166 -> IIIllI(1652139999, var9 ^ 559340564);
            case 167 -> IIIllI(1652139996, var9 ^ 1053259059);
            case 168 -> IIIllI(1652139997, var9 ^ 237174160);
            case 169 -> IIIllI(1652139994, var9 ^ -1472131396);
            case 170 -> IIIllI(1652139995, var9 ^ -671004679);
            case 171 -> IIIllI(1652139992, var9 ^ -393539833);
            case 172 -> IIIllI(1652139993, var9 ^ 1457088522);
            case 173 -> IIIllI(1652139990, var9 ^ -1501383340);
            case 174 -> IIIllI(1652139991, var9 ^ 1219714789);
            case 175 -> IIIllI(1652139988, var9 ^ 2029519530);
            case 176 -> IIIllI(1652139989, var9 ^ -1811866035);
            case 177 -> IIIllI(1652139986, var9 ^ 822187586);
            case 178 -> IIIllI(1652139987, var9 ^ 2145822697);
            case 179 -> IIIllI(1652139984, var9 ^ 559204296);
            case 180 -> IIIllI(1652139985, var9 ^ 1215750340);
            case 181 -> IIIllI(1652139982, var9 ^ 1551242059);
            case 182 -> IIIllI(1652139983, var9 ^ -1769638110);
            case 183 -> IIIllI(1652139980, var9 ^ 1385064951);
            case 184 -> IIIllI(1652139981, var9 ^ 219580717);
            case 185 -> IIIllI(1652139978, var9 ^ -2114894495);
            case 186 -> IIIllI(1652139979, var9 ^ -1047412399);
            case 187 -> IIIllI(1652139976, var9 ^ -655947935);
            case 188 -> IIIllI(1652139977, var9 ^ 846933757);
            case 189 -> IIIllI(1652139974, var9 ^ -955445061);
            case 190 -> IIIllI(1652139975, var9 ^ 1766841892);
            case 191 -> IIIllI(1652139972, var9 ^ -1794864453);
            case 192 -> IIIllI(1652139973, var9 ^ -1537184154);
            case 193 -> IIIllI(1652139970, var9 ^ 1957367551);
            case 194 -> IIIllI(1652139971, var9 ^ 902982290);
            case 195 -> IIIllI(1652139968, var9 ^ -794414695);
            case 196 -> IIIllI(1652139969, var9 ^ 722314747);
            case 197 -> IIIllI(1652139966, var9 ^ -94431068);
            case 198 -> IIIllI(1652139967, var9 ^ -294985226);
            case 199 -> IIIllI(1652139964, var9 ^ -1973206903);
            case 200 -> IIIllI(1652139965, var9 ^ 410491798);
            case 201 -> IIIllI(1652139962, var9 ^ 848536796);
            case 202 -> IIIllI(1652139963, var9 ^ 1661036565);
            case 203 -> IIIllI(1652139960, var9 ^ -1222481589);
            case 204 -> IIIllI(1652139961, var9 ^ -1685102710);
            case 205 -> IIIllI(1652139958, var9 ^ 1932240976);
            case 206 -> IIIllI(1652139959, var9 ^ -1374385195);
            case 207 -> IIIllI(1652139956, var9 ^ 1138646741);
            case 208 -> IIIllI(1652139957, var9 ^ -56682296);
            case 209 -> IIIllI(1652139954, var9 ^ -434966851);
            case 210 -> IIIllI(1652139955, var9 ^ 1502834419);
            case 211 -> IIIllI(1652139952, var9 ^ 927540581);
            case 212 -> IIIllI(1652139953, var9 ^ 1779480784);
            case 213 -> IIIllI(1652139950, var9 ^ 497176398);
            case 214 -> IIIllI(1652139951, var9 ^ 1924140191);
            case 215 -> IIIllI(1652139948, var9 ^ -1251611742);
            case 216 -> IIIllI(1652139949, var9 ^ -911620266);
            case 217 -> IIIllI(1652139946, var9 ^ -895924614);
            case 218 -> IIIllI(1652139947, var9 ^ -74490991);
            case 219 -> IIIllI(1652139944, var9 ^ -969551579);
            case 220 -> IIIllI(1652139945, var9 ^ -988820653);
            case 221 -> IIIllI(1652139942, var9 ^ 1705143185);
            case 222 -> IIIllI(1652139943, var9 ^ -1046865493);
            case 223 -> IIIllI(1652139940, var9 ^ 81205227);
            case 224 -> IIIllI(1652139941, var9 ^ -2012535494);
            case 225 -> IIIllI(1652139938, var9 ^ 1198156547);
            case 226 -> IIIllI(1652139939, var9 ^ -876163161);
            case 227 -> IIIllI(1652139936, var9 ^ 1493917331);
            case 228 -> IIIllI(1652139937, var9 ^ 813120676);
            case 229 -> 3;
            case 230 -> IIIllI(1652139934, var9 ^ -1565711741);
            case 231 -> IIIllI(1652139935, var9 ^ 416197959);
            case 232 -> IIIllI(1652139932, var9 ^ -1625849461);
            case 233 -> IIIllI(1652139933, var9 ^ 498344098);
            case 234 -> IIIllI(1652139930, var9 ^ -1270690084);
            case 235 -> IIIllI(1652139931, var9 ^ 1983508382);
            case 236 -> IIIllI(1652139928, var9 ^ -2054040684);
            case 237 -> IIIllI(1652139929, var9 ^ 1022819544);
            case 238 -> IIIllI(1652139926, var9 ^ -599045378);
            case 239 -> IIIllI(1652139927, var9 ^ -961083421);
            case 240 -> IIIllI(1652139924, var9 ^ -952364184);
            case 241 -> IIIllI(1652139925, var9 ^ 1220391668);
            case 242 -> IIIllI(1652139922, var9 ^ 923678311);
            case 243 -> IIIllI(1652139923, var9 ^ -561495547);
            case 244 -> IIIllI(1652139920, var9 ^ 384941333);
            case 245 -> IIIllI(1652139921, var9 ^ 710338112);
            case 246 -> IIIllI(1652139918, var9 ^ -1581339108);
            case 247 -> IIIllI(1652139919, var9 ^ -1442862038);
            case 248 -> IIIllI(1652139916, var9 ^ 914281967);
            case 249 -> IIIllI(1652139917, var9 ^ 262695635);
            case 250 -> IIIllI(1652139914, var9 ^ -918986804);
            case 251 -> IIIllI(1652139915, var9 ^ -1920637722);
            case 252 -> IIIllI(1652139912, var9 ^ -726497285);
            case 253 -> IIIllI(1652139913, var9 ^ 49513659);
            case 254 -> IIIllI(1652139910, var9 ^ 811197430);
            default -> IIIllI(1652139911, var9 ^ -159520530);
         };
         int var5 = (var1 & IIIllI(1652139908, var9 ^ -649187720)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & IIIllI(1652139909, var9 ^ 1664733399)) >>> IIIllI(1652139906, var9 ^ -1794467984)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & IIIllI(1652139907, var9 ^ -1802486263);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & IIIllI(1652139904, var9 ^ -662156567);
            }
         }

         IIIl[var2] = new String(var3).intern();
      }

      return IIIl[var2];
   }

   private static String IIIlll(int var0, int var1) {
      int var3 = var0 ^ -1379072389;
      char[] var4 = lllI[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])llll[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         llll[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -225251499;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 8;
            case 1 -> 67;
            case 2 -> 225;
            case 3 -> 22;
            case 4 -> 106;
            case 5 -> 213;
            case 6 -> 142;
            case 7 -> 219;
            case 8 -> 193;
            case 9 -> 3;
            case 10 -> 84;
            case 11 -> 55;
            case 12 -> 148;
            case 13 -> 21;
            case 14 -> 156;
            case 15 -> 106;
            case 16 -> 40;
            case 17 -> 243;
            case 18 -> 11;
            case 19 -> 1;
            case 20 -> 142;
            case 21 -> 126;
            case 22 -> 243;
            case 23 -> 0;
            case 24 -> 252;
            case 25 -> 194;
            case 26 -> 178;
            case 27 -> 193;
            case 28 -> 6;
            case 29 -> 170;
            case 30 -> 21;
            case 31 -> 109;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var18 = -315600389;
      String var8 = "拞豫ꐽꄹ藏벧\uf66a烁ẅሲ㲳\ue1f9\uee00\uf8cdꙄ\uf57b稷\uf86bﳘ厇阌ᚹꩴꞑ\ud8a1㨫㒹\u1af0䣔漟Ō꩖쇢뇘媭ᐆ稸ꌔ眿ᔇ䬼稈릞剠ꁱ㾠箮㑃\ud88e혊續\ue4b1徭ཐ穎\ufaefᕫ\ue562\ueb3e穠六ꑰ⮀鬔\uf4beං\udc3b瓶\u0a00\u0ee5왏ڪ\udaa5䶄䧁孞鏗㽱⹒櫖沤黒ꑅ缞稻⣲ﮠꐪ뿸\ue017Ꮮ賆㧠竐\ue0bdյ鎿稷䰑밸㗔讽揨ឞ慸涢穟\ue8a7뚉昅里迎ﬠ㣋䅬鎴ﭚ禮\udc1b窭ತ皔凐䳹₸⚁ꮎƭ\ue0b4셱㖪\u1cbcҋ\ue845窊\uf719Ḛ皇\uf75bȨ窒꽡鶍韷婴⯏\uf447컛\uf02c㑖坑茿絳窒ꘟ眆쎡扲\u1f7f爽醂遑갷\u0e61Ὧ흺릃쬑ဴ흩\ued95쾲캏㣏ꦼ嚪葡㡝穗뱤\uda6e㋢\udb13槶䯮噛䳋䟮㲚෯㬖泏꺩팻肻\ua630흆芘\udff4究ﴷ㡃ದ㨄㉭좯ⱁሎᮘペ鱝뷅熽页ԍ䅷욼고펷\udf9c稈뇼砰㉱脦穁ꝭ뇉ꯆꃈ♝뚉톻\ueb3e窹፴㿀\uf3be⛫箊⮽㩢\uedf9룪彬핰씸꿜ᨫ㎮\uf03d䌫푌狡쐠噃\uf4f2髕䁈ﻻ瀮췣亹譮튗癩\uf4d6舯\udc1eڸꡎ睼䜤⩐\ue614涕ⳇ\u0a3b녢\u0ef7鄃ল褝獪顧\udbd4ᓡ闒䡁娶㉫땷ၙ恅\uf46cﾓ\ue305ᒵ澕\ued54䝿㍨㍹쑢ﴺ\udf0c\uedf1億\udd99ቻ엌\ue8db掚넦섑緺㙗ᜦ\u12c1竘鰋⍹ヮ곔훻帘쾂㟭淓ᒖ≤ᴰ竤垉置㡞楂\uf613\uef77婆Ғ㩎歹踊⽘竄ᘕ緾\ue058䴺\ue4e4缼\uf591暠죫L\ued72\uec97竊덒⾋껼ḡﯙ\ude51氼戁\uedc8㧼㰖䎔稲\uf850钠⿁ꦂ쫚᮳\udb00㷏䲨㷦鼌搼\ue494\ud843贴锂䋕訲䒴聪\uf680뀕醓藗⛍蕾鋻\u1cff⺑灳갤\uf5c1緉精\uec2d䎛后棗\ue75bﬖ\udb0f틊䥊좦\ueed4䨎介\ue3d4문⊎휰㔩穔ϟ\ud857ᬳ곗蜈㷡掫\ue826Ƌ䃖钁ﲸ\uf35c삊緐䝯改ꏉ\uf040ꙃ\ue470춞洿ȼ櫑墼됓యओ믔茼灄䲏\uf0e8鏏辆砌싙岌軇丢\uee8c\ue985玱立܄䟅廵慄\ue0e0䮓ᛐ⤩剾Ἁ\uf051岧窕䄕፡눎㜘犣䟬멷㉪稼\ue9dd䬲ᰇ톻\ue966\uf8a9䇀Ꜻ폏㷯蠕鿤穝돡㩼銮슞쟖\uf619䷪⮹蹀ᘔ巗ெ䜝펌焴蕒⺑▆肑᪭햼ꑸ红⺅穚ừꌫ荙\u209d坺䤇仙ⷳ쏤⑉缱\ueb48ﰅ\uebb0\ued6fӸ竮뱵弟ⱬ좩\uda5e뭥诳佘稱\udded\uf6e5䂻놏\u1f7fც랮㚶ヲ髼\ue630㹏窸跩尰䡤Ა纴輋쫙咖暗ᙺ脮芾竖㙧ꝩ鐅똵穃菏壻ᯐ㋵㴯ᙗꕸ塉\ue7c3㦱\uda57뿫컯ၸ〱艶突䕖豫ᅘ폮ຸ袖\ue463枱稂鉮᪕ক镤䌊ⱆ\uf041ኡ雳\ue66bྒ놐ꠉ萁픟剅㎱槡戃ꤹ窂攙㟴쓣㣘곯₣哚蟾窕\ueeb7板쐅\u0a80蕈ﳌ紖\uf15a稴\u0a4e뛎旚髮稧\uec02꒧諞崿猬\ufae6媾䧉竌磒䧒㝁掿稗꜊\uf434\uec2bꊋ瞧⮘짗\uf1a6穪앗厷퇃\uf35e죮襸屝荘穬⩀ᠲ뛏\uf103ᘩ⓿睡\uf80e䰚颻慸ᬐ窱畾㛥楘䛙洕դꡂ떴\uee38ᯋ벋ﾈ䂔要ℋ\uda95ꫀ徣哺ෞ㺤赗鹹栏噜﮼꺧॒窴㱟뀐\ued86쬮焔ⵁ讨嗋톔\ueacc뫱\uede1窇ⵅ궠\udb06❂⟥맰毩㎊嶠Ɛ掗汱笽죒⺋ꖈ枖⸖戔ᄝ窯喺䮁⚳휣퓌\udd5c䪭碟\uffbfꦹ롟푿㒄肦옋顉稚㒻\u2439廰旚쾍\uef3aꦲ批竵讧繞瀞喤鮊飇䡕题ك\udaf3団崋穾豑㞗뵤修侱\ue8ef⍟䶢凋ᥙ\uf22a\ude76ꩁ⩡ﭻ辻哦鹭爯\uec93⯜\udd79紹뽗囃衵鿖籊鱻룕始㧎穥붉ক渂\ue7de\uee72渘搷딄稳侰쟥♏\ueec8\uf4f8장妐蚱ꚿ駍珌\ue97c鳀儽咯탽⎢곗뾅暂ￜ똹᪸펝缟虋\ue2e5\ua7efᄝ⍗멇䢞鰝뜾뭋讄烵ᚐ\ue2d6찇燰꽑䉈᳆窔眏鱈그⍹뇧沷蚀\uda21ঀⰅ\ueab5邧夯藈䷹㤑፼\ueab0훗䧋뙑蝋ᶐꧻ惕큿\ua82e甃᳐톪䨓醺뻏풐Һ벊ᮘ㑿\uf0a7\udd99䈟䍺蹧헃竝좋鳩蜃ࡕ겕틪蛥希涾\ue6ea₼쟈竞梣崵習砶莡㘜\u2429ꊗ댑罈ᖹ遣痲怨멨\ue806䌲\uabef䅫峂끽㜌ո덯穙믮섆楀\ud90e穗賢抙凥䲦ꏃ暆䑽銌殙\ue91eⲔ⤤轪뭏ꚼ凳苐䩍릐븽穦䶃랦튋돚稍嘨㠿骇\ue316쎝㋓苪퇠뀛魏폈螨\uea9f瘶廆珥ꊉ伔磩쏻瞡偣剤◄샞\ue66e\ue32e큰㉿\uf2cc५흎穭㖧\ue626礗溜穻콹ꚟ喍䈽蹔蕈唾鞩殗蘹찂舐穫\ue16c嶤섭र瑪\ue772폿龝ꊟ숛뽦癙竔⪔居潞\ue027\u2d99讬繛ᩇ税嬽紏ヤᖏ莩䭇춆΄瑁욕\ue47e鶲竣\u2efb朮犚㛒깼譐ꋤ䯩窆쫆\uf081Ⴠᛑᰃ皮࿁贰竒ꉒ簸ꆉ㜀跽မ㴨Ꮙꆏ饊ꏢ\ue875\uec30琏\uf766隹쮕濥䒼ᰡ窲ᄶ⛋甌撧愪啙瞊葕⌦癩ዝꮅ싙ኧ簨⍟뤿ᨺ\ue5cc\udba9堲ᑿጹ\u0085걵ࢳᦙন\ue82c\uf515讌拻墁堡\ue858觠赥邒ቧኅ䂸᭸懫⢵\uf438킪渦\ufddf穾㞩\udb8f㈝ᗶে\uf40a⇲⟋굤牅쳲䖻⫀⋿휽⸪䢫멫咨ᨊߒ 侞꛳䛽\ue7b7ࣕ采祅⽓罣玝";
      short var7 = 23288;
      char[] var9 = "床媱".toCharArray();
      int var10000 = var9.length;
      byte var14 = -1;
      String[] var10 = new String[var10000];

      while (true) {
         int var11 = 0;
         int var12 = 0;
         int var13 = 0;
         if (var14 == 0) {
            lllI = var10;
            llll = new Object[var10.length];
            int var23 = 0;
            int var10001 = 0;
            byte[] var10002 = "{{ª¦1°è_\u0097,³\u009cÑÉ\"I\u0091úSeª®¦Tø\u009ctát\u0081ÜÐABFîÒ\u0081\u0010R§ãcý>gzîXYÉ©,f\u009f\u008c\u000b\u0085\u008aÃ!ë\u0000\u0088·À\\\u0086ùå\u0001\u001e½8\u009cú\u008bïù7ß\u0017¸$Ç\"©;FÜ\u0011\u0083\r']%Kq¦x\b\u0010<ÎB\\Xý\u0095£\u008b7\u0091ÊÔ.Cs¾ç\u0005q\u0005¹Oâ\u0004¸0Ù\u000fHþ\u0089\u000fEC\u001aæ©>xbH¢øGtm²\u0080£\n1\u008dÔíTæGJ¬Tï\u009b¤ä¦nò\u0094Ö\u009cb9©\u009d\u000b\u008e·&|ö\u0098ëXëòrÙÝ\u009aå(\u0094\u001eæB\u009eÃ\u0003K¼¶¯J\u0097\u000e\u0010\u007fÅ\u0088¨öp½$°'\u008a}+ÂxA§%`ûP®&\u0013\u000bîd1¿\u009d>\u009f\u009c2Xè\u001a\u0016ÝA\u0097ây\u0081\u0095\u0012Róuo\u001eÜ\rw¾\u0094cS\u0012\u0007ð«Ld¤\u0019âuß`uÈ\u0083\u001c\u0092`ßôOg\u008d\u0090\u0092ú0\u0010XÅP \u0088Æøkgûó\u0007&ý[õ\u0091\u0019Íõ\u0080\u008c¹Ä?P\u0007Cy\u0084\u009c\t,\u0013i°\u008dÝ\u009f\bªù\u0083°O~;r_ì\u00909-A/9\u0082Tóg»\u0001ë$\u001ay\u008cº§pdª\u0002U\bMß7Pl\u0083ll\n\u0012w\u001cö?ËÒU\u0080ÃôæØ®D½\u000640«5ªi?ñ\u001a\u0094ºíÂè¡Õ\u0004îÅò\u008e¶¬\u0012\u009dNÔ¥\u000eÂ¥\u008b\u0017\u0012ÐÕn\bòH\u0088\u0082õ@[º`u-4g\u0011\u0017 E¢h`\u0017ÞQòUT?äáT\u009a6úL\u008b`Ä&`y+ð\rPì@\u008e\u0090r¶úGO\u0098<\u0007\u008f4³ÅTkSË\u0000}È\u0095\u0086¹l\u00121ç1â°ºU\u0096\u001bë\b-å\u008c=¼î\u008dUÿ=\u0003ý4LÝ:\u0002\u009em\u001aµ\u0019ð\u0098{\u000b \u001fY\u001aÀyº\u0006\u0017Yðµ\u001caß¹t\u0098UÀN\u008cÐ\f\u0089n\u0096Lø`VÓh ìoÔ¯\u0014\u000eLà;\fLE?&g\u009dVÏ^×\u0081\u009f;\u0098Ô\u0094ö\u0084ÅÑ\u0012o\u009bð\u009a\u0005Ië¼±«76\u0081ç}\u008a6e\u0010xÉH\u009dnµ\u0085öVh2=\u0089\u007fäÌU\u00116Å\u0015zØ?\u0003eõÆ\u000f\u0088¡\u0085\u0081\u0018i\u001d!Jý\u008cWà\u009a{ÀÏw3§Ë\u0004p]ß.û°\u0006\u0018Qi\u0014ª·\u0000$¢\f6¢X(a\u00adbá\u0092×\u0018¨\u009fÚÉâ¡Nê¨ín¢|«\u0089ÚÁ\u009d\u0003\u008f\u0000K\u009a\u000e\u0011ðÿ\u008a!~\u000f\u0004\u0089%\u0011)¨B÷\u001eÖí6öë×°»Pém\u0094ÝF£\u0005\u001f\u008f\tÁSUOªPØ\u0090\u0016öÍ\u0086\u0007.\u009a]?1\u001c\u0090¸\u0003-x/\u0016ä\tëx\u0080mO4\nÃàýòÎ)Á\u0015Ú\u0007ÙXÜ>\u0086\u0015Ï_½\u00ado2xÌ\u009f!¸Û\u001c\u008c\tà)}\b#\u0007\u008dhãOîÈ\u001eWèàGL±\rã®æómh\u001dP)ã7j\u0091éd\u001a(w\u000bû±º\rF°x\u009a*º0Éú^à\u0017\u0080§ºùdL\u009aÕ\u0014~G¦¼Ë¦\u0091Å¶3ånæ\u0081ý±ã\u0010P¸XªåcHdB¢\u0094üÂ\u001bÆ\u0090þ7?ð0,¡Q¿\u0006´:hÄ#ZÁ$Ä',ÃÞ\fÞî\"*¯î¸K®£\u001e\u0002QÞæQP\u000eÉ\u0098X´ÜÀ]\u0090b.O Eþ=Ê\u00128\u0010E¡\u0095¢õD\u009b\u007f\u008afï¸nÕS\u0089û5D\u0005ªâïÿ\u0017\u0091\u009c_AØjAÒ¾\u0014\u0003{%TWo\u001b_o\u000f¡À}xs\u0001Bø\u0088HA\u0016\u009b\u000e}¿¨r$R\u0013\u0000Ü¾\u0011\u0080^;S\u0002\u001cë\u009eÅ\u0093\u009e\u000eèð \u0082ÌÙp¬plÙ\u0096jsç¶\u0015\u0093¥éáÇc}1\u001fD©\u008dÉÑ\u0098ùôw\u0017È\u0001¶W6\u008d¹õÓÌ ï\u008aÇ¬\\6ëUºÑÍ>ó\u0003ü\u0083k\u009f8\u0000\u0011\u008cÂqÝàþWxqcFþô--0,çÄI=#p×\u000fÓ\u009cèm¨\u0016\u0013'3eß¿¼c7\u0007©ß\u009eàÔÙ¡^JÂÄ\u009bI:¢\u009e¥x¤\u008cÛ\u0087\u0013æÆp¾KüÂ«Í-\u0082Óà!\u0094Ôu¸&\u001dûÛ¿óì5`cr\u001aC)¸_é»|Ðc\u0007\u000b[p\n5\u0092\"\u009d\u0007q\u0015\u008c&Ì\u0015\u0083\u008d\u008d-ÑP\u008cÊ\u000e\u000b:Z\u0005ìã)¯M9¶\u0004/\u0006~\u000bë\u0083H\u001dÐ\u0015\u00128þÂK¯®\u008c(åná\u0002\u008b¥ÒiÇ\u0000\u0010\u001fZ\u00974ß½ZØDì±ø$4?#3\u0019îHñëÅ$çu1T\u0011Ï\u0019f\u00ad¸ÈEióÛñ-4\u0081\u0087\u009bRÇÆ>ò*Ø×¤\u009aÑê\u009dCã8%î\u000eÛ\u0019\u0003\u0003\u0085\u0015'\u0086\u0094Ejdð6FTt´\u0087\u007f?7zq§p[Å'µ\u0097~lð¯\u008b²vs\f\u0018m_lX¬G\u0086¹®ª¦D\u0096¯Kí{ì>9\u0092½\u0012;'1OXB\u0090ê\u0098>lëÖ\u0095A)WÏÂIØ\u0082¬ß|\u0012¡±ÙÅè²´f´\u0088[\u0094\u001dËw\u0091U<ÆNv`\u0088âk3¢~\u0099K\u0004^´\u0099£\tnªF$s9\u009eùXÅñ\u001fj\f\u0096ø\u009e>¨Fè\u0003q\u0090Xà;Ö7µÛ\u0019\u000f§p\u0016v\u0085À¯ôï\u0005Ê3\"ó\u0098\u0088\u0097ª.·Ì\u0094ÌE¨ik\u0016õ#bt\u0084W\u0096½KcuÇÂM=nÌ\u0002Ú\u0004(\u0084ß4éÔàÓ\u0013{3:\u001bi\u001e\u000fºòh×iÉ+ûá\u0088×\u001e\u000få=.ä\u0012¿*0¯\u0012ú¥$²wÒ\u0091$!·§ñi\u0093¯mêæI:\u009b¼V3/¾Àoí¶s\u0004Â\u009fÅu½\u000f°ëûïéù57\u0013¢ä/y\fÉu\u000büÒ\b\u0091\u0099ÁødêºEÚz\u00ad¬^\u007fX\u001b\f\\4\\ó<¶\u001e\u0091hÜ¿\u0091b\u0010PÐc%a%ôÑ\u0094ý\u0080\u0017$¢Ý\u008e\u0015väVý\u0092\u0097\u0000[Ë\u008f\u001a\u00adú6ÊW>qæ³d\u0013¦pMiñ¾#°+}¸bõÑ\r\u0094\u00150dÞQn\u0084·þ\u0016\u009e-E;\u0000Fë}Áþ7ÄG\u0014\u0013éw\u008f»(\u0004a\u0094Å|\u008f\u0002'k\f.\u0092Á{!\u0087\u001e\fv\u0086Ì°@ ·¾¤wVÚ\u0098Eüçhm^Që\u009cv\u00ad\n\u009d\u0094Ì<\u007f\u00adÝè®ªî\u0080\u0004¿\u0099îÜàûI\u009bhÝ;j\u0012_ùÁÒµucÏÅm©R._\u0099-ÒØÐ\u0084±ÌíÈ\u0001\u0015Q=TÛîq¼¶à\u007fY\t!\u0083|ÿÊÞv\u008c'É\u000f~ýÉk\u009aõãÊ\u0016\u00adË ¬_\u0000\u009b\u0083/\u0014¹#à\u0010\u009eS\u0084!\f6R\u001eun\"Êg¹m\u0014\tS¡bR5_\u001c\u009fï[\u0094mÂº]\u0096íNC¤Õn1çÄ7\u0094Z´Î=;f\u00ad\u0016¶¬ãÓºöëmd\u008a\u009a\u0089ÁÀ>\u009eª\u00adöíþ\u0092d\u007f»©p_W7>¦÷±\u0084\t\u0003ÒÅ\u009b\u001eÌ\\\f#-e¼!5\u0084\u008bm½\u000ba¹2\u0012\n\u0093ÞZ\u0011¼ªdAï`1b\u001d\u0091sÇ\u0019Â¹X\u0088\u009eI¨:\rÑ{©:\f\u0094`YXÅ#Êp´\u001f4ö0\u0099r÷üW.\u001a\u0003\u0090¥z²ÿáÍ8Ö\u009dxü\u0001Ð=4;ÖÈ*ä\u0088OR6%Fù\u008d/ÈPCªiz³öñ$\u0080{¥Ñ\u008b°v,H\r\u000fÖÄj \u009b@ùsWÜW\u0019×a?\u0003+\u0005/¯\u008a\u0017Bèsî\\ýÒÈAN\n\u0095^ß£On:)\u0091ÈYÛd¸\u0019\u0092M\u0088\u0093Ú\u009d6Á½·Æ\u009aaZ(«\u0088Ö\u0018àÖ¥ô\u0019Ë\u0090Q\u0019@$\u001fþr\u0001AL\u0013Ì(n5;<nÇVö\u009d£\u00112\u0096¼\fm\u000e_\u007fáé\u0093\b¡\u0089\u0017-¸ÿÑ\bRcø\u00ad§\u0015Æá\tW\b\u0001õ\u001c\\ÌÄx»Ô\u0014³Û\u0019UÊ¾\u008e°¾ä\u000eK\u0015qù\u009aGÌÐ\u008er7Òê{\u0096¶xoN$R\u008bq\b\u0003\u0019¾\t×:¿{û\u0097\u008a5\u00133|'Î\f_¤#Æ\u0088Ü\u009c\u0087Í]\u0086\n;\u00199\u008b»[WQðÒ\n\bnÞ}º\u009b1\u0012¨ÙvÕ}=\u0099©±\u0011iª\u0081\u0093\u0094\u009b\u0097\u008d\u008f¦-\u0007\u0000¥\u0017\u001e\u0090\u0005º¾\\¡\u0082Ï°dÏÂpè\u0013ñX'r¿d«Þ\u0019\u00979\u0013\u008aíPoéPÂµô\u009dxÖxÈÿ\u000fUÕ}¬õGÔZ\u001bv\u0016!9\u0087å\u0089\u0006m\\î(\u008c¼S\u009cé¦¯Òp§$ÆÈ(¥dÏW\u0016à\u0012¾\u0090\u0096Lvék\u0010JN3èÁ¦{ñÉçz=Vf\u0001ªo°¼Û©!\u0089\u001aí\u009d±#´ªQÜbëR\u009aPA6\u0003\u0096e>ø¹VøW\u0003 \u0005ùõ\u0012B´ô\u0088è!¸\u0090\u009cÂ-ó\u009e\\²k\u0096¡\u008c¬;8ñò\u0083\u009a\u0012ûÕ)\tìoÉþ.-Ìndb.1\u0086\u001dnL\r¤\\\u0084f\u0002\u008d°LÏT"
               .getBytes("ISO-8859-1");
            llIl = new int[651];

            int var56;
            do {
               llIl[var23] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ 784287298;
               var23 += 1;
               var56 = var10001 + 4;
               var10001 += 4;
            } while (var56 < var10002.length);

            String[] var5 = new String[IIIllI(1652139185, var18 ^ -1198518362)];
            int var3 = 0;
            String var2;
            int var4 = (var2 = IIIlll(-1379072389, var18 ^ 2058300490)).length();
            int var1 = IIIllI(1652139182, var18 ^ 1773390733);
            int var20 = -1;

            label102:
            while (true) {
               var23 = IIIllI(1652139183, var18 ^ 2047315730);
               String var28 = var2.substring(++var20, var20 + var1);
               byte var40 = -1;

               while (true) {
                  label97: {
                     char[] var58 = var28.toCharArray();
                     int var70 = var58.length;
                     int var6 = 0;
                     var56 = var23;
                     var45 = var58;
                     var10001 = var70;
                     char[] var82;
                     int var89;
                     if (var70 <= 1) {
                        var82 = var58;
                        var70 = var23;
                        var89 = var6;
                     } else {
                        var56 = var23;
                        var10001 = var70;
                        if (var70 <= var6) {
                           break label97;
                        }

                        var82 = var58;
                        var70 = var23;
                        var89 = var6;
                     }

                     while (true) {
                        var82[var89] = (char)(var82[var89] ^ var70 ^ switch (var6 % IIIllI(1652139179, var18 ^ 992430299)) {
                           case 0 -> IIIllI(1652139176, var18 ^ -501900341);
                           case 1 -> IIIllI(1652139177, var18 ^ 1341684029);
                           case 2 -> IIIllI(1652139174, var18 ^ -1560992003);
                           case 3 -> IIIllI(1652139175, var18 ^ -2039466439);
                           case 4 -> IIIllI(1652139172, var18 ^ -879603175);
                           case 5 -> 4;
                           default -> IIIllI(1652139173, var18 ^ -408758630);
                        });
                        var6++;
                        if (var56 == 0) {
                           var89 = var56;
                           var82 = var45;
                           var70 = var56;
                        } else {
                           if (var10001 <= var6) {
                              break;
                           }

                           var82 = var45;
                           var70 = var56;
                           var89 = var6;
                        }
                     }
                  }

                  String var63 = new String(var45).intern();
                  switch (var40) {
                     case 0:
                        var5[var3++] = var63;
                        if ((var20 += var1) >= var4) {
                           IlII = var5;
                           IIIl = new String[IIIllI(1652139178, var18 ^ -1959889503)];
                           I = new String[IIIllI(1652139170, var18 ^ 646552895)];
                           lllI();
                           IlI = IlIIllIII.lI(I[IIIllI(1652139171, var18 ^ -611908312)]);
                           ll = new GsonBuilder().setPrettyPrinting().create();
                           II = IlIIllIII.lI(I[IIIllI(1652139168, var18 ^ -97286675)]);
                           lll = llI();
                           return;
                        }

                        var1 = var2.charAt(var20);
                        break;
                     default:
                        var5[var3++] = var63;
                        if ((var20 += var1) < var4) {
                           var1 = var2.charAt(var20);
                           continue label102;
                        }

                        var4 = (var2 = IIIlll(-1379072390, var18 ^ -186753993)).length();
                        var1 = IIIllI(1652139180, var18 ^ 544291186);
                        var20 = -1;
                  }

                  var23 = IIIllI(1652139181, var18 ^ 1714461902);
                  var28 = var2.substring(++var20, var20 + var1);
                  var40 = 0;
               }
            }
         }

         do {
            var13 = var9[var11] ^ var7;
            char[] var15 = var8.substring(var12, var12 + var13).toCharArray();
            int var16 = 0;

            do {
               short var17 = switch (var16 % 5) {
                  default -> 25;
                  case 1 -> 20;
                  case 2 -> 111;
                  case 3 -> 91;
                  case 4 -> 170;
               };
               var15[var16] = (char)(var15[var16] ^ var17);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   @Override
   public void IlIII() {
      try {
         if (!this.IIlI) {
            this.IIl = IlIIllIII.lI(I[IIIllI(1652139905, 2109236280 ^ 479005390)]);
         }
      } catch (IllegalStateException var1) {
         throw Illll(var1);
      }

      this.lIIll();
      this.Illl.clear();
   }

   private void IIIlII(class_310 param1, String param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/IlIIIIIl.IIlI Z
      // 04: ifeq 2a
      // 07: aload 0
      // 08: getfield k74/x/IlIIIIIl.Il Lk74/x/lllIIlII;
      // 0b: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 0e: checkcast java/lang/Boolean
      // 11: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 14: ifeq 2a
      // 17: goto 1e
      // 1a: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: aload 0
      // 1f: aload 1
      // 20: invokevirtual k74/x/IlIIIIIl.IIIl (Lnet/minecraft/class_310;)V
      // 23: goto 34
      // 26: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29: athrow
      // 2a: aload 0
      // 2b: bipush 0
      // 2c: putfield k74/x/IlIIIIIl.IlIl Z
      // 2f: aload 0
      // 30: bipush 0
      // 31: putfield k74/x/IlIIIIIl.lIIl Z
      // 34: aload 0
      // 35: bipush 0
      // 36: putfield k74/x/IlIIIIIl.IIlI Z
      // 39: aload 0
      // 3a: aconst_null
      // 3b: putfield k74/x/IlIIIIIl.lIl Lk74/x/lllIlll;
      // 3e: aload 0
      // 3f: getstatic k74/x/IlIIIIIl.I [Ljava/lang/String;
      // 42: bipush 1
      // 43: aaload
      // 44: putfield k74/x/IlIIIIIl.llII Ljava/lang/String;
      // 47: aload 0
      // 48: bipush 0
      // 49: putfield k74/x/IlIIIIIl.IIll Z
      // 4c: aload 0
      // 4d: aload 2
      // 4e: ifnull 5f
      // 51: aload 2
      // 52: invokevirtual java/lang/String.isBlank ()Z
      // 55: ifeq 7a
      // 58: goto 5f
      // 5b: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5e: athrow
      // 5f: getstatic k74/x/IlIIIIIl.I [Ljava/lang/String;
      // 62: ldc_w 1652139902
      // 65: ldc_w -1281250440
      // 68: ldc_w 1292684684
      // 6b: ixor
      // 6c: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 6f: aaload
      // 70: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 73: goto 7b
      // 76: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 79: athrow
      // 7a: aload 2
      // 7b: putfield k74/x/IlIIIIIl.IIl Ljava/lang/String;
      // 7e: return
   }

   private Map<String, Object> IIIlIl(IIlIllIll param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w -896309398
      // 003: istore 7
      // 005: new java/util/LinkedHashMap
      // 008: dup
      // 009: invokespecial java/util/LinkedHashMap.<init> ()V
      // 00c: astore 2
      // 00d: aload 2
      // 00e: getstatic k74/x/IlIIIIIl.I [Ljava/lang/String;
      // 011: ldc_w 1652139903
      // 014: iload 7
      // 016: ldc_w 184134718
      // 019: ixor
      // 01a: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 01d: aaload
      // 01e: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 021: aload 1
      // 022: getfield k74/x/IIlIllIll.l Ljava/lang/String;
      // 025: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 02a: pop
      // 02b: aload 2
      // 02c: getstatic k74/x/IlIIIIIl.I [Ljava/lang/String;
      // 02f: ldc_w 1652139900
      // 032: iload 7
      // 034: ldc_w 2007438474
      // 037: ixor
      // 038: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 03b: aaload
      // 03c: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 03f: aload 1
      // 040: getfield k74/x/IIlIllIll.ll I
      // 043: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 046: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 04b: pop
      // 04c: aload 2
      // 04d: getstatic k74/x/IlIIIIIl.I [Ljava/lang/String;
      // 050: ldc_w 1652139901
      // 053: iload 7
      // 055: ldc_w -1800519111
      // 058: ixor
      // 059: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 05c: aaload
      // 05d: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 060: aload 1
      // 061: getfield k74/x/IIlIllIll.lI I
      // 064: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 067: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 06c: pop
      // 06d: aload 2
      // 06e: getstatic k74/x/IlIIIIIl.I [Ljava/lang/String;
      // 071: ldc_w 1652139898
      // 074: iload 7
      // 076: ldc_w -1883637549
      // 079: ixor
      // 07a: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 07d: aaload
      // 07e: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 081: aload 1
      // 082: getfield k74/x/IIlIllIll.I Ljava/lang/String;
      // 085: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 08a: pop
      // 08b: aload 1
      // 08c: getfield k74/x/IIlIllIll.II Ljava/lang/String;
      // 08f: ifnull 0c8
      // 092: aload 1
      // 093: getfield k74/x/IIlIllIll.II Ljava/lang/String;
      // 096: invokevirtual java/lang/String.isBlank ()Z
      // 099: ifne 0c8
      // 09c: goto 0a3
      // 09f: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a2: athrow
      // 0a3: aload 2
      // 0a4: getstatic k74/x/IlIIIIIl.I [Ljava/lang/String;
      // 0a7: ldc_w 1652139899
      // 0aa: iload 7
      // 0ac: ldc_w 2021374678
      // 0af: ixor
      // 0b0: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 0b3: aaload
      // 0b4: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0b7: aload 1
      // 0b8: getfield k74/x/IIlIllIll.II Ljava/lang/String;
      // 0bb: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0c0: pop
      // 0c1: goto 0c8
      // 0c4: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c7: athrow
      // 0c8: aload 2
      // 0c9: getstatic k74/x/IlIIIIIl.I [Ljava/lang/String;
      // 0cc: ldc_w 1652139896
      // 0cf: iload 7
      // 0d1: ldc_w -399379139
      // 0d4: ixor
      // 0d5: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 0d8: aaload
      // 0d9: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0dc: aload 1
      // 0dd: getfield k74/x/IIlIllIll.III Ljava/lang/String;
      // 0e0: ifnull 0f4
      // 0e3: aload 1
      // 0e4: getfield k74/x/IIlIllIll.III Ljava/lang/String;
      // 0e7: invokevirtual java/lang/String.isBlank ()Z
      // 0ea: ifeq 0ff
      // 0ed: goto 0f4
      // 0f0: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f3: athrow
      // 0f4: aload 1
      // 0f5: getfield k74/x/IIlIllIll.I Ljava/lang/String;
      // 0f8: goto 103
      // 0fb: invokestatic k74/x/IlIIIIIl.Illll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fe: athrow
      // 0ff: aload 1
      // 100: getfield k74/x/IIlIllIll.III Ljava/lang/String;
      // 103: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 108: pop
      // 109: aload 2
      // 10a: getstatic k74/x/IlIIIIIl.I [Ljava/lang/String;
      // 10d: ldc_w 1652139897
      // 110: iload 7
      // 112: ldc_w -1210873224
      // 115: ixor
      // 116: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 119: aaload
      // 11a: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 11d: aload 1
      // 11e: getfield k74/x/IIlIllIll.Il I
      // 121: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 124: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 129: pop
      // 12a: aload 2
      // 12b: getstatic k74/x/IlIIIIIl.I [Ljava/lang/String;
      // 12e: ldc_w 1652139894
      // 131: iload 7
      // 133: ldc_w -900189368
      // 136: ixor
      // 137: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 13a: aaload
      // 13b: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 13e: getstatic k74/x/IlIIIIIl.I [Ljava/lang/String;
      // 141: ldc_w 1652139895
      // 144: iload 7
      // 146: ldc_w 36935060
      // 149: ixor
      // 14a: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 14d: aaload
      // 14e: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 151: aload 1
      // 152: getfield k74/x/IIlIllIll.I Ljava/lang/String;
      // 155: getstatic java/nio/charset/StandardCharsets.UTF_8 Ljava/nio/charset/Charset;
      // 158: invokestatic java/net/URLEncoder.encode (Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/lang/String;
      // 15b: getstatic k74/x/IlIIIIIl.I [Ljava/lang/String;
      // 15e: ldc_w 1652139892
      // 161: iload 7
      // 163: ldc_w 907630682
      // 166: ixor
      // 167: invokestatic k74/x/IlIIIIIl.IIIllI (II)I
      // 16a: aaload
      // 16b: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 16e: getstatic k74/x/IlIIIIIl.II Ljava/lang/String;
      // 171: astore 6
      // 173: astore 5
      // 175: astore 4
      // 177: astore 3
      // 178: new java/lang/StringBuilder
      // 17b: dup
      // 17c: invokespecial java/lang/StringBuilder.<init> ()V
      // 17f: aload 3
      // 180: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 183: aload 4
      // 185: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 188: aload 5
      // 18a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 18d: aload 6
      // 18f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 192: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 195: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 19a: pop
      // 19b: aload 2
      // 19c: areturn
   }
}
