package k74.x;

import java.awt.Color;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_2680;
import net.minecraft.class_2818;
import net.minecraft.class_310;
import net.minecraft.class_2338.class_2339;

@Environment(EnvType.CLIENT)
public final class Il extends IlIIIIIIl {
   private final lllIIlII II;
   private final lllIIlII Il;
   private final IIIlIIlll lI;
   private final IllIII<IIlIlIIll> ll;
   private static String[] III;
   private final IIIlIIlll IIl;
   private static final String[] IlI;
   private final lllIIlII Ill;
   private static final int lII = 2;
   private final lllIIlII lIl;
   private final lllIIlII llI;
   private final lllIIlII lll;
   private final IIIlIIlll IIII;
   private final IIIlIIlll IIIl;
   private static final int IIlI = 20;
   private final ArrayDeque<II> IIll;
   private final Map<Long, List<lllIlIlI>> IlII;
   private final IIIlIIlll IlIl;
   private final lllIIlII IllI;
   private final IIIlIIlll Illl;
   private static final String[] lIII;
   private final IIIlIIlll lIIl;
   private static final String[] IllIl;
   private static final int lIlI = 64;
   private final lllIIlII lIll;
   private static final int[] IllII;
   private final IIIlIIlll llII;
   private final lllIIlII I;
   private static final int llIl = 8;
   private final lllIIlII lllI;
   private final IIIlIIlll llll;
   private int IIIII;
   private final IIIlIIlll IIIIl;
   private final lllIIlII IIIlI;
   private final IIIlIIlll IIIll;
   private Object IIlII;
   private int IIlIl;
   private final lllIIlII IIllI;
   private final lllIIlII IIlll;
   private int IlIII;
   private final IllIlIl IlIIl;
   private static final Object[] IlllI;
   private final IIlIII IlIlI;
   private static volatile Il IlIll;

   @Override
   public void IlI(lIIlIl var1) {
      this.IlII(var1);
   }

   public boolean I(class_2680 param1) {
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
      // 05: invokevirtual net/minecraft/class_2680.method_26215 ()Z
      // 08: ifeq 18
      // 0b: goto 12
      // 0e: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: bipush 0
      // 13: ireturn
      // 14: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 17: athrow
      // 18: aload 0
      // 19: aload 1
      // 1a: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
      // 1d: invokevirtual k74/x/Il.lI (Lnet/minecraft/class_2248;)Z
      // 20: ireturn
   }

   private static String lIll(int var0, char var1, char var2) {
      int var3 = var1 ^ 8926;
      char[] var4 = IllIl[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])IlllI[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         IlllI[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 11087;
      int var9 = 0;

      do {
         int var10 = var4[var9] + 'ꖲ';
         var10 += 50572;
         var10 ^= 50135;
         var10 -= 63056;
         var10 += 10;
         var10 -= 47953;
         var10 += 43633;
         var10 ^= 58591;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private Color l(class_2248 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: aload 1
      // 001: getstatic net/minecraft/class_2246.field_10442 Lnet/minecraft/class_2248;
      // 004: if_acmpeq 015
      // 007: aload 1
      // 008: getstatic net/minecraft/class_2246.field_29029 Lnet/minecraft/class_2248;
      // 00b: if_acmpne 03b
      // 00e: goto 015
      // 011: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 014: athrow
      // 015: aload 0
      // 016: getfield k74/x/Il.IllI Lk74/x/lllIIlII;
      // 019: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 01c: checkcast java/lang/Boolean
      // 01f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 022: ifeq 03b
      // 025: goto 02c
      // 028: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 02b: athrow
      // 02c: aload 0
      // 02d: getfield k74/x/Il.llII Lk74/x/IIIlIIlll;
      // 030: invokevirtual k74/x/IIIlIIlll.IllI ()Ljava/lang/Object;
      // 033: checkcast java/awt/Color
      // 036: areturn
      // 037: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 03a: athrow
      // 03b: aload 1
      // 03c: getstatic net/minecraft/class_2246.field_10013 Lnet/minecraft/class_2248;
      // 03f: if_acmpeq 050
      // 042: aload 1
      // 043: getstatic net/minecraft/class_2246.field_29220 Lnet/minecraft/class_2248;
      // 046: if_acmpne 076
      // 049: goto 050
      // 04c: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 04f: athrow
      // 050: aload 0
      // 051: getfield k74/x/Il.II Lk74/x/lllIIlII;
      // 054: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 057: checkcast java/lang/Boolean
      // 05a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 05d: ifeq 076
      // 060: goto 067
      // 063: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 066: athrow
      // 067: aload 0
      // 068: getfield k74/x/Il.IIIll Lk74/x/IIIlIIlll;
      // 06b: invokevirtual k74/x/IIIlIIlll.IllI ()Ljava/lang/Object;
      // 06e: checkcast java/awt/Color
      // 071: areturn
      // 072: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 075: athrow
      // 076: aload 1
      // 077: getstatic net/minecraft/class_2246.field_10571 Lnet/minecraft/class_2248;
      // 07a: if_acmpeq 099
      // 07d: aload 1
      // 07e: getstatic net/minecraft/class_2246.field_29026 Lnet/minecraft/class_2248;
      // 081: if_acmpeq 099
      // 084: goto 08b
      // 087: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 08a: athrow
      // 08b: aload 1
      // 08c: getstatic net/minecraft/class_2246.field_23077 Lnet/minecraft/class_2248;
      // 08f: if_acmpne 0bf
      // 092: goto 099
      // 095: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 098: athrow
      // 099: aload 0
      // 09a: getfield k74/x/Il.llI Lk74/x/lllIIlII;
      // 09d: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 0a0: checkcast java/lang/Boolean
      // 0a3: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0a6: ifeq 0bf
      // 0a9: goto 0b0
      // 0ac: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0af: athrow
      // 0b0: aload 0
      // 0b1: getfield k74/x/Il.Illl Lk74/x/IIIlIIlll;
      // 0b4: invokevirtual k74/x/IIIlIIlll.IllI ()Ljava/lang/Object;
      // 0b7: checkcast java/awt/Color
      // 0ba: areturn
      // 0bb: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0be: athrow
      // 0bf: aload 1
      // 0c0: getstatic net/minecraft/class_2246.field_10212 Lnet/minecraft/class_2248;
      // 0c3: if_acmpeq 0d4
      // 0c6: aload 1
      // 0c7: getstatic net/minecraft/class_2246.field_29027 Lnet/minecraft/class_2248;
      // 0ca: if_acmpne 0fa
      // 0cd: goto 0d4
      // 0d0: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0d3: athrow
      // 0d4: aload 0
      // 0d5: getfield k74/x/Il.IIIlI Lk74/x/lllIIlII;
      // 0d8: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 0db: checkcast java/lang/Boolean
      // 0de: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0e1: ifeq 0fa
      // 0e4: goto 0eb
      // 0e7: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0ea: athrow
      // 0eb: aload 0
      // 0ec: getfield k74/x/Il.lI Lk74/x/IIIlIIlll;
      // 0ef: invokevirtual k74/x/IIIlIIlll.IllI ()Ljava/lang/Object;
      // 0f2: checkcast java/awt/Color
      // 0f5: areturn
      // 0f6: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0f9: athrow
      // 0fa: aload 1
      // 0fb: getstatic net/minecraft/class_2246.field_10080 Lnet/minecraft/class_2248;
      // 0fe: if_acmpeq 10f
      // 101: aload 1
      // 102: getstatic net/minecraft/class_2246.field_29030 Lnet/minecraft/class_2248;
      // 105: if_acmpne 135
      // 108: goto 10f
      // 10b: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 10e: athrow
      // 10f: aload 0
      // 110: getfield k74/x/Il.lll Lk74/x/lllIIlII;
      // 113: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 116: checkcast java/lang/Boolean
      // 119: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 11c: ifeq 135
      // 11f: goto 126
      // 122: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 125: athrow
      // 126: aload 0
      // 127: getfield k74/x/Il.IIIl Lk74/x/IIIlIIlll;
      // 12a: invokevirtual k74/x/IIIlIIlll.IllI ()Ljava/lang/Object;
      // 12d: checkcast java/awt/Color
      // 130: areturn
      // 131: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 134: athrow
      // 135: aload 1
      // 136: getstatic net/minecraft/class_2246.field_10090 Lnet/minecraft/class_2248;
      // 139: if_acmpeq 14a
      // 13c: aload 1
      // 13d: getstatic net/minecraft/class_2246.field_29028 Lnet/minecraft/class_2248;
      // 140: if_acmpne 170
      // 143: goto 14a
      // 146: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 149: athrow
      // 14a: aload 0
      // 14b: getfield k74/x/Il.IIlll Lk74/x/lllIIlII;
      // 14e: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 151: checkcast java/lang/Boolean
      // 154: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 157: ifeq 170
      // 15a: goto 161
      // 15d: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 160: athrow
      // 161: aload 0
      // 162: getfield k74/x/Il.IIIIl Lk74/x/IIIlIIlll;
      // 165: invokevirtual k74/x/IIIlIIlll.IllI ()Ljava/lang/Object;
      // 168: checkcast java/awt/Color
      // 16b: areturn
      // 16c: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 16f: athrow
      // 170: aload 1
      // 171: getstatic net/minecraft/class_2246.field_10418 Lnet/minecraft/class_2248;
      // 174: if_acmpeq 185
      // 177: aload 1
      // 178: getstatic net/minecraft/class_2246.field_29219 Lnet/minecraft/class_2248;
      // 17b: if_acmpne 1ab
      // 17e: goto 185
      // 181: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 184: athrow
      // 185: aload 0
      // 186: getfield k74/x/Il.lIl Lk74/x/lllIIlII;
      // 189: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 18c: checkcast java/lang/Boolean
      // 18f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 192: ifeq 1ab
      // 195: goto 19c
      // 198: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 19b: athrow
      // 19c: aload 0
      // 19d: getfield k74/x/Il.llll Lk74/x/IIIlIIlll;
      // 1a0: invokevirtual k74/x/IIIlIIlll.IllI ()Ljava/lang/Object;
      // 1a3: checkcast java/awt/Color
      // 1a6: areturn
      // 1a7: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1aa: athrow
      // 1ab: aload 1
      // 1ac: getstatic net/minecraft/class_2246.field_27120 Lnet/minecraft/class_2248;
      // 1af: if_acmpeq 1c0
      // 1b2: aload 1
      // 1b3: getstatic net/minecraft/class_2246.field_29221 Lnet/minecraft/class_2248;
      // 1b6: if_acmpne 1e6
      // 1b9: goto 1c0
      // 1bc: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1bf: athrow
      // 1c0: aload 0
      // 1c1: getfield k74/x/Il.I Lk74/x/lllIIlII;
      // 1c4: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 1c7: checkcast java/lang/Boolean
      // 1ca: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1cd: ifeq 1e6
      // 1d0: goto 1d7
      // 1d3: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1d6: athrow
      // 1d7: aload 0
      // 1d8: getfield k74/x/Il.IIII Lk74/x/IIIlIIlll;
      // 1db: invokevirtual k74/x/IIIlIIlll.IllI ()Ljava/lang/Object;
      // 1de: checkcast java/awt/Color
      // 1e1: areturn
      // 1e2: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1e5: athrow
      // 1e6: aload 1
      // 1e7: getstatic net/minecraft/class_2246.field_22109 Lnet/minecraft/class_2248;
      // 1ea: if_acmpne 213
      // 1ed: aload 0
      // 1ee: getfield k74/x/Il.lllI Lk74/x/lllIIlII;
      // 1f1: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 1f4: checkcast java/lang/Boolean
      // 1f7: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1fa: ifeq 213
      // 1fd: goto 204
      // 200: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 203: athrow
      // 204: aload 0
      // 205: getfield k74/x/Il.IIl Lk74/x/IIIlIIlll;
      // 208: invokevirtual k74/x/IIIlIIlll.IllI ()Ljava/lang/Object;
      // 20b: checkcast java/awt/Color
      // 20e: areturn
      // 20f: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 212: athrow
      // 213: aload 1
      // 214: getstatic net/minecraft/class_2246.field_33509 Lnet/minecraft/class_2248;
      // 217: if_acmpeq 236
      // 21a: aload 1
      // 21b: getstatic net/minecraft/class_2246.field_33508 Lnet/minecraft/class_2248;
      // 21e: if_acmpeq 236
      // 221: goto 228
      // 224: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 227: athrow
      // 228: aload 1
      // 229: getstatic net/minecraft/class_2246.field_33510 Lnet/minecraft/class_2248;
      // 22c: if_acmpne 25c
      // 22f: goto 236
      // 232: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 235: athrow
      // 236: aload 0
      // 237: getfield k74/x/Il.Il Lk74/x/lllIIlII;
      // 23a: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 23d: checkcast java/lang/Boolean
      // 240: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 243: ifeq 25c
      // 246: goto 24d
      // 249: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 24c: athrow
      // 24d: aload 0
      // 24e: getfield k74/x/Il.lIIl Lk74/x/IIIlIIlll;
      // 251: invokevirtual k74/x/IIIlIIlll.IllI ()Ljava/lang/Object;
      // 254: checkcast java/awt/Color
      // 257: areturn
      // 258: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 25b: athrow
      // 25c: aload 0
      // 25d: getfield k74/x/Il.IlIl Lk74/x/IIIlIIlll;
      // 260: invokevirtual k74/x/IIIlIIlll.IllI ()Ljava/lang/Object;
      // 263: checkcast java/awt/Color
      // 266: areturn
   }

   private void II(Object param1, class_238 param2, Color param3, double param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/Il.Ill Lk74/x/lllIIlII;
      // 04: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 07: checkcast java/lang/Boolean
      // 0a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0d: ifeq 4b
      // 10: aload 0
      // 11: getfield k74/x/Il.ll Lk74/x/IllIII;
      // 14: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 17: getstatic k74/x/IIlIlIIll.IlI Lk74/x/IIlIlIIll;
      // 1a: if_acmpne 43
      // 1d: goto 24
      // 20: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 23: athrow
      // 24: aload 1
      // 25: aload 2
      // 26: ldc2_w 0.035
      // 29: invokevirtual net/minecraft/class_238.method_1014 (D)Lnet/minecraft/class_238;
      // 2c: aload 3
      // 2d: ldc2_w 0.78
      // 30: invokestatic k74/x/IllIIlIl.III (Ljava/awt/Color;D)Ljava/awt/Color;
      // 33: dload 4
      // 35: ldc2_w 0.78
      // 38: dmul
      // 39: invokestatic k74/x/IlIII.lIIlI (Ljava/lang/Object;Lnet/minecraft/class_238;Ljava/awt/Color;D)V
      // 3c: goto 43
      // 3f: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 42: athrow
      // 43: aload 1
      // 44: aload 2
      // 45: aload 3
      // 46: dload 4
      // 48: invokestatic k74/x/IlIII.lIIlI (Ljava/lang/Object;Lnet/minecraft/class_238;Ljava/awt/Color;D)V
      // 4b: aload 0
      // 4c: getfield k74/x/Il.lIll Lk74/x/lllIIlII;
      // 4f: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 52: checkcast java/lang/Boolean
      // 55: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 58: ifeq af
      // 5b: aload 0
      // 5c: getfield k74/x/Il.ll Lk74/x/IllIII;
      // 5f: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 62: getstatic k74/x/IIlIlIIll.IlI Lk74/x/IIlIlIIll;
      // 65: if_acmpne 8e
      // 68: goto 6f
      // 6b: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 6e: athrow
      // 6f: aload 1
      // 70: aload 2
      // 71: ldc2_w 0.035
      // 74: invokevirtual net/minecraft/class_238.method_1014 (D)Lnet/minecraft/class_238;
      // 77: aload 3
      // 78: ldc2_w 0.72
      // 7b: invokestatic k74/x/IllIIlIl.III (Ljava/awt/Color;D)Ljava/awt/Color;
      // 7e: ldc2_w 165.0
      // 81: ldc_w 3.0
      // 84: invokestatic k74/x/IlIII.IlIlI (Ljava/lang/Object;Lnet/minecraft/class_238;Ljava/awt/Color;DF)V
      // 87: goto 8e
      // 8a: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 8d: athrow
      // 8e: aload 1
      // 8f: aload 2
      // 90: aload 3
      // 91: ldc2_w 255.0
      // 94: aload 0
      // 95: getfield k74/x/Il.ll Lk74/x/IllIII;
      // 98: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 9b: getstatic k74/x/IIlIlIIll.IlI Lk74/x/IIlIlIIll;
      // 9e: if_acmpne ab
      // a1: ldc_w 2.4
      // a4: goto ac
      // a7: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // aa: athrow
      // ab: fconst_2
      // ac: invokestatic k74/x/IlIII.IlIlI (Ljava/lang/Object;Lnet/minecraft/class_238;Ljava/awt/Color;DF)V
      // af: return
   }

   private void Il() {
      this.IIll.clear();
      this.IlII.clear();
      this.IIlII = null;
      this.IlIII = lIlI(-481146391, 147990061 ^ 745636486);
      this.IIlIl = lIlI(-481146392, 147990061 ^ 821783777);
      this.IIIII = 0;
   }

   private static int lIlI(int var0, int var1) {
      int var2 = IllII[var0 ^ -481146391] ^ var1 ^ var0;
      var2 ^= 6188;
      var2 -= 3144;
      var2 += 60654;
      var2 ^= 3203;
      var2 -= 63140;
      var2 ^= 6671;
      var2 += 37474;
      return var2 ^ 924;
   }

   private boolean lI(class_2248 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 15
      // 04: aload 1
      // 05: invokevirtual net/minecraft/class_2248.method_9564 ()Lnet/minecraft/class_2680;
      // 08: invokevirtual net/minecraft/class_2680.method_26215 ()Z
      // 0b: ifeq 1b
      // 0e: goto 15
      // 11: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 14: athrow
      // 15: bipush 0
      // 16: ireturn
      // 17: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1a: athrow
      // 1b: aload 0
      // 1c: aload 1
      // 1d: invokevirtual k74/x/Il.lll (Lnet/minecraft/class_2248;)Z
      // 20: ifne 32
      // 23: aload 0
      // 24: aload 1
      // 25: invokevirtual k74/x/Il.IIll (Lnet/minecraft/class_2248;)Z
      // 28: ifeq 3a
      // 2b: goto 32
      // 2e: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 31: athrow
      // 32: bipush 1
      // 33: goto 3b
      // 36: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 39: athrow
      // 3a: bipush 0
      // 3b: ireturn
   }

   private void ll() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 03: astore 1
      // 04: aload 1
      // 05: ifnull 24
      // 08: aload 1
      // 09: getfield net/minecraft/class_310.field_1769 Lnet/minecraft/class_761;
      // 0c: ifnull 24
      // 0f: goto 16
      // 12: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 15: athrow
      // 16: aload 1
      // 17: getfield net/minecraft/class_310.field_1769 Lnet/minecraft/class_761;
      // 1a: invokevirtual net/minecraft/class_761.method_3279 ()V
      // 1d: goto 24
      // 20: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 23: athrow
      // 24: return
   }

   private static String III(char[] var0, long var1, int var3) {
      int var4 = lIlI(-481146389, -1873445655 ^ 1709335127) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & lIlI(-481146390, -1873445655 ^ 434186314);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private static void IIl() {
      int var0 = 1972605531;
      III[0] = III(lIII(lIlI(-481146387, var0 ^ -495486821), lIlI(-481146388, var0 ^ 1814426142)).toCharArray(), 34744L, lIlI(-481146385, var0 ^ 1302093061));
      III[1] = III("".toCharArray(), 17830L, lIlI(-481146386, var0 ^ 1125816799));
      III[2] = III(lIII(lIlI(-481146399, var0 ^ -947206980), lIlI(-481146400, var0 ^ -1121148499)).toCharArray(), 26199L, lIlI(-481146397, var0 ^ -209119821));
      III[3] = III(lIII(lIlI(-481146398, var0 ^ -937195117), lIlI(-481146395, var0 ^ 598860996)).toCharArray(), 64601L, lIlI(-481146396, var0 ^ 686019816));
      III[4] = III(lIII(lIlI(-481146393, var0 ^ 1746656412), lIlI(-481146394, var0 ^ 1071237216)).toCharArray(), 83635L, lIlI(-481146375, var0 ^ 1196272961));
      III[5] = III(lIII(lIlI(-481146376, var0 ^ -1687833325), lIlI(-481146373, var0 ^ -18478072)).toCharArray(), 97769L, lIlI(-481146374, var0 ^ 1705849620));
      III[lIlI(-481146371, var0 ^ -198086947)] = III(
         lIII(lIlI(-481146372, var0 ^ -416736342), lIlI(-481146369, var0 ^ 612967702)).toCharArray(), 84259L, lIlI(-481146370, var0 ^ 425682121)
      );
      III[lIlI(-481146383, var0 ^ -289863584)] = III(
         lIII(lIlI(-481146384, var0 ^ 26424380), lIlI(-481146381, var0 ^ -1559952947)).toCharArray(), 76331L, lIlI(-481146382, var0 ^ 844060885)
      );
      III[lIlI(-481146379, var0 ^ -636816986)] = III(
         lIII(lIlI(-481146380, var0 ^ -1469526802), lIlI(-481146377, var0 ^ 1384777736)).toCharArray(), 74495L, lIlI(-481146378, var0 ^ 511825784)
      );
      III[lIlI(-481146423, var0 ^ 417198428)] = III(
         lIII(lIlI(-481146424, var0 ^ 1817259825), lIlI(-481146421, var0 ^ 620885305)).toCharArray(), 68547L, lIlI(-481146422, var0 ^ -105122651)
      );
      III[lIlI(-481146419, var0 ^ -585319902)] = III(
         lIII(lIlI(-481146420, var0 ^ -419351605), lIlI(-481146417, var0 ^ 1026470633)).toCharArray(), 97157L, lIlI(-481146418, var0 ^ -1847485635)
      );
      III[lIlI(-481146431, var0 ^ 52168991)] = III(
         lIII(lIlI(-481146432, var0 ^ 2100129424), lIlI(-481146429, var0 ^ -819606696)).toCharArray(), 90607L, lIlI(-481146430, var0 ^ -106995369)
      );
      III[lIlI(-481146427, var0 ^ 1823318318)] = III(
         lIII(lIlI(-481146428, var0 ^ 1227023819), lIlI(-481146425, var0 ^ -609794649)).toCharArray(), 64172L, lIlI(-481146426, var0 ^ -1834205741)
      );
      III[lIlI(-481146407, var0 ^ -133610171)] = III(
         lIII(lIlI(-481146408, var0 ^ -1866063091), lIlI(-481146405, var0 ^ 329162806)).toCharArray(), 30459L, lIlI(-481146406, var0 ^ 1436222132)
      );
      III[lIlI(-481146403, var0 ^ 615131039)] = III(
         lIII(lIlI(-481146404, var0 ^ 1356286143), lIlI(-481146401, var0 ^ 5370948)).toCharArray(), 28291L, lIlI(-481146402, var0 ^ 1702811271)
      );
      III[lIlI(-481146415, var0 ^ 294697912)] = III(
         lIII(lIlI(-481146416, var0 ^ 35654206), lIlI(-481146413, var0 ^ -1128829126)).toCharArray(), 49804L, lIlI(-481146414, var0 ^ 598848119)
      );
      III[lIlI(-481146411, var0 ^ -292579378)] = III(
         lIII(lIlI(-481146412, var0 ^ 1707961502), lIlI(-481146409, var0 ^ 908205524)).toCharArray(), 69450L, lIlI(-481146410, var0 ^ -1547705333)
      );
      III[lIlI(-481146455, var0 ^ 656616902)] = III(
         lIII(lIlI(-481146456, var0 ^ -163361413), lIlI(-481146453, var0 ^ -644872222)).toCharArray(), 36425L, lIlI(-481146454, var0 ^ 1171265616)
      );
      III[lIlI(-481146451, var0 ^ 804870180)] = III(
         lIII(lIlI(-481146452, var0 ^ 2040825938), lIlI(-481146449, var0 ^ 382960394)).toCharArray(), 14135L, lIlI(-481146450, var0 ^ -2072020016)
      );
      III[lIlI(-481146463, var0 ^ -1077744648)] = III(
         lIII(lIlI(-481146464, var0 ^ 1617815660), lIlI(-481146461, var0 ^ -738986545)).toCharArray(), 53131L, lIlI(-481146462, var0 ^ -1033282154)
      );
      III[lIlI(-481146459, var0 ^ -600482539)] = III(
         lIII(lIlI(-481146460, var0 ^ 765500550), lIlI(-481146457, var0 ^ 1796660781)).toCharArray(), 63037L, lIlI(-481146458, var0 ^ 1954486462)
      );
      III[lIlI(-481146439, var0 ^ 707356005)] = III(
         lIII(lIlI(-481146440, var0 ^ -917850539), lIlI(-481146437, var0 ^ 1132777368)).toCharArray(), 45842L, lIlI(-481146438, var0 ^ 882856714)
      );
      III[lIlI(-481146435, var0 ^ 520572000)] = III(
         lIII(lIlI(-481146436, var0 ^ -1085184413), lIlI(-481146433, var0 ^ 1689270548)).toCharArray(), 14527L, lIlI(-481146434, var0 ^ 478393906)
      );
      III[lIlI(-481146447, var0 ^ 1113408375)] = III(
         lIII(lIlI(-481146448, var0 ^ -256425642), lIlI(-481146445, var0 ^ 1213179618)).toCharArray(), 77915L, lIlI(-481146446, var0 ^ 824313614)
      );
      III[lIlI(-481146443, var0 ^ -1347027317)] = III(
         lIII(lIlI(-481146444, var0 ^ 1726672288), lIlI(-481146441, var0 ^ -1019444872)).toCharArray(), 96424L, lIlI(-481146442, var0 ^ -1165315709)
      );
      III[lIlI(-481146487, var0 ^ -686204569)] = III(
         lIII(lIlI(-481146488, var0 ^ 628365500), lIlI(-481146485, var0 ^ 662370429)).toCharArray(), 67705L, lIlI(-481146486, var0 ^ -1864874634)
      );
      III[lIlI(-481146483, var0 ^ -883321713)] = III(
         lIII(lIlI(-481146484, var0 ^ -754382012), lIlI(-481146481, var0 ^ -472018598)).toCharArray(), 16716L, lIlI(-481146482, var0 ^ -1686687141)
      );
      III[lIlI(-481146495, var0 ^ -1936041272)] = III(
         lIII(lIlI(-481146496, var0 ^ -445785062), lIlI(-481146493, var0 ^ -1102668876)).toCharArray(), 98111L, lIlI(-481146494, var0 ^ -125794440)
      );
      III[lIlI(-481146491, var0 ^ -1028039346)] = III(
         lIII(lIlI(-481146492, var0 ^ 850154420), lIlI(-481146489, var0 ^ 31553468)).toCharArray(), 55971L, lIlI(-481146490, var0 ^ -710006288)
      );
      III[lIlI(-481146471, var0 ^ -1864246931)] = III(
         lIII(lIlI(-481146472, var0 ^ -342267255), lIlI(-481146469, var0 ^ -511365940)).toCharArray(), 41159L, lIlI(-481146470, var0 ^ -1925813011)
      );
      III[lIlI(-481146467, var0 ^ -2069652304)] = III(
         lIII(lIlI(-481146468, var0 ^ 802879168), lIlI(-481146465, var0 ^ -1791957577)).toCharArray(), 93925L, lIlI(-481146466, var0 ^ 949696692)
      );
      III[lIlI(-481146479, var0 ^ 1998334716)] = III(
         lIII(lIlI(-481146480, var0 ^ -1858424849), lIlI(-481146477, var0 ^ -578074099)).toCharArray(), 71368L, lIlI(-481146478, var0 ^ -1489691327)
      );
      III[lIlI(-481146475, var0 ^ -1496774864)] = III(
         lIII(lIlI(-481146476, var0 ^ -137647096), lIlI(-481146473, var0 ^ 1324827811)).toCharArray(), 50056L, lIlI(-481146474, var0 ^ -483364238)
      );
      III[lIlI(-481146519, var0 ^ 1351016333)] = III(
         lIII(lIlI(-481146520, var0 ^ 814933189), lIlI(-481146517, var0 ^ -616375492)).toCharArray(), 60404L, lIlI(-481146518, var0 ^ -1666403524)
      );
      III[lIlI(-481146515, var0 ^ -1625946429)] = III(
         lIII(lIlI(-481146516, var0 ^ 1019585996), lIlI(-481146513, var0 ^ -215466611)).toCharArray(), 91505L, lIlI(-481146514, var0 ^ 190816995)
      );
   }

   private static long Ill(int var0, int var1) {
      return var0 & 4294967295L | (long)var1 << lIlI(-481146527, -1495995714 ^ 1839197101);
   }

   @Override
   public void IlIII() {
      IlIll = this;
      this.Il();
      this.ll();
   }

   @Override
   public void llIl() {
      try {
         if (IlIll == this) {
            IlIll = null;
         }
      } catch (MatchException var1) {
         throw Illl(var1);
      }

      this.Il();
      this.ll();
   }

   public Il() {
      int var1 = 1999587202;
      super(IlIIllIII.Ill(III[lIlI(-481146528, var1 ^ -630140220)]), lllIIlIl.IIl, IlIIllIII.Ill(III[lIlI(-481146525, var1 ^ -1946946708)]));
      this.Ill = this.IllIIll(new lllIIlII(IlIIllIII.Ill(III[lIlI(-481146526, var1 ^ 1430650445)]), false));
      this.lIll = this.IllIIll(new lllIIlII(IlIIllIII.Ill(III[5]), true));
      this.IlIlI = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(III[lIlI(-481146523, var1 ^ -1139880009)]), 35.0, 0.0, 100.0, 1.0)
            .IlII(IlIIllIII.lI(III[lIlI(-481146524, var1 ^ 641263170)]))
      );
      this.ll = this.IllIIll(new IllIII<>(IlIIllIII.Ill(III[lIlI(-481146521, var1 ^ -999775803)]), IIlIlIIll.class, IIlIlIIll.IIl));
      this.IlIIl = this.IllIIll(
         new IllIlIl(IlIIllIII.Ill(III[lIlI(-481146522, var1 ^ 1756378688)]), List.of(), IlIIllIII.lI(III[lIlI(-481146503, var1 ^ 1881758966)]))
      );
      this.lIl = this.IllIIll(new lllIIlII(IlIIllIII.Ill(III[lIlI(-481146504, var1 ^ 807113242)]), true));
      this.llll = this.IllIIll(
         new IIIlIIlll(
            IlIIllIII.Ill(III[lIlI(-481146501, var1 ^ -737994628)]),
            new Color(
               lIlI(-481146502, var1 ^ 294826755),
               lIlI(-481146499, var1 ^ 1117028225),
               lIlI(-481146500, var1 ^ -1128231080),
               lIlI(-481146497, var1 ^ 244269741)
            )
         )
      );
      this.I = this.IllIIll(new lllIIlII(IlIIllIII.Ill(III[lIlI(-481146498, var1 ^ 2012939602)]), true));
      this.IIII = this.IllIIll(
         new IIIlIIlll(
            IlIIllIII.Ill(III[lIlI(-481146511, var1 ^ -1916513941)]),
            new Color(
               lIlI(-481146512, var1 ^ 1220947867), lIlI(-481146509, var1 ^ 966199689), lIlI(-481146510, var1 ^ 596355950), lIlI(-481146507, var1 ^ 1646206098)
            )
         )
      );
      this.IllI = this.IllIIll(new lllIIlII(IlIIllIII.Ill(III[lIlI(-481146508, var1 ^ -721865341)]), true));
      this.llII = this.IllIIll(
         new IIIlIIlll(
            IlIIllIII.Ill(III[lIlI(-481146505, var1 ^ 1396624012)]),
            new Color(
               lIlI(-481146506, var1 ^ 1072427120),
               lIlI(-481146551, var1 ^ 1338929566),
               lIlI(-481146552, var1 ^ 773424685),
               lIlI(-481146549, var1 ^ -161072943)
            )
         )
      );
      this.II = this.IllIIll(new lllIIlII(IlIIllIII.Ill(III[lIlI(-481146550, var1 ^ -1322970925)]), true));
      this.IIIll = this.IllIIll(
         new IIIlIIlll(
            IlIIllIII.Ill(III[lIlI(-481146547, var1 ^ -1445418341)]),
            new Color(
               lIlI(-481146548, var1 ^ 1153913831),
               lIlI(-481146545, var1 ^ 2059580175),
               lIlI(-481146546, var1 ^ -290840238),
               lIlI(-481146559, var1 ^ -1117790399)
            )
         )
      );
      this.llI = this.IllIIll(new lllIIlII(IlIIllIII.Ill(III[lIlI(-481146560, var1 ^ 1844464747)]), true));
      this.Illl = this.IllIIll(
         new IIIlIIlll(
            IlIIllIII.Ill(III[lIlI(-481146557, var1 ^ 151638691)]),
            new Color(
               lIlI(-481146558, var1 ^ -1584508434),
               lIlI(-481146555, var1 ^ -63419654),
               lIlI(-481146556, var1 ^ 1511866002),
               lIlI(-481146553, var1 ^ -1652697799)
            )
         )
      );
      this.IIIlI = this.IllIIll(new lllIIlII(IlIIllIII.Ill(III[lIlI(-481146554, var1 ^ 1214579616)]), true));
      this.lI = this.IllIIll(
         new IIIlIIlll(
            IlIIllIII.Ill(III[lIlI(-481146535, var1 ^ -1146085964)]),
            new Color(
               lIlI(-481146536, var1 ^ -863216937),
               lIlI(-481146533, var1 ^ -1526867357),
               lIlI(-481146534, var1 ^ 530287513),
               lIlI(-481146531, var1 ^ 1320685330)
            )
         )
      );
      this.IIlll = this.IllIIll(new lllIIlII(IlIIllIII.Ill(III[lIlI(-481146532, var1 ^ -1999637022)]), true));
      this.IIIIl = this.IllIIll(
         new IIIlIIlll(
            IlIIllIII.Ill(III[3]),
            new Color(
               lIlI(-481146529, var1 ^ 1072449798),
               lIlI(-481146530, var1 ^ 2048725175),
               lIlI(-481146543, var1 ^ 790784809),
               lIlI(-481146544, var1 ^ 1628403996)
            )
         )
      );
      this.lll = this.IllIIll(new lllIIlII(IlIIllIII.Ill(III[lIlI(-481146541, var1 ^ -1256108825)]), true));
      this.IIIl = this.IllIIll(
         new IIIlIIlll(
            IlIIllIII.Ill(III[lIlI(-481146542, var1 ^ -1662538854)]),
            new Color(
               lIlI(-481146539, var1 ^ 1285139174),
               lIlI(-481146540, var1 ^ -561566382),
               lIlI(-481146537, var1 ^ 275015810),
               lIlI(-481146538, var1 ^ -702816870)
            )
         )
      );
      this.lllI = this.IllIIll(new lllIIlII(IlIIllIII.Ill(III[lIlI(-481146583, var1 ^ -428918176)]), true));
      this.IIl = this.IllIIll(
         new IIIlIIlll(
            IlIIllIII.Ill(III[lIlI(-481146584, var1 ^ 1465662798)]),
            new Color(
               lIlI(-481146581, var1 ^ -1204471553),
               lIlI(-481146582, var1 ^ -977931690),
               lIlI(-481146579, var1 ^ 1022127371),
               lIlI(-481146580, var1 ^ 1166412040)
            )
         )
      );
      this.Il = this.IllIIll(new lllIIlII(IlIIllIII.Ill(III[lIlI(-481146577, var1 ^ -624195546)]), true));
      this.lIIl = this.IllIIll(
         new IIIlIIlll(
            IlIIllIII.Ill(III[2]),
            new Color(
               lIlI(-481146578, var1 ^ 644737040), lIlI(-481146591, var1 ^ 1792315367), lIlI(-481146592, var1 ^ 831823011), lIlI(-481146589, var1 ^ 1747959119)
            )
         )
      );
      this.IIllI = this.IllIIll(new lllIIlII(IlIIllIII.Ill(III[lIlI(-481146590, var1 ^ -18355358)]), true));
      this.IlIl = this.IllIIll(
         new IIIlIIlll(
            IlIIllIII.Ill(III[4]),
            new Color(
               lIlI(-481146587, var1 ^ -1271895366),
               lIlI(-481146588, var1 ^ 1139744685),
               lIlI(-481146585, var1 ^ -912410379),
               lIlI(-481146586, var1 ^ -413826965)
            )
         )
      );
      this.IIll = new ArrayDeque<>();
      this.IlII = new HashMap<>();
      this.IlIII = lIlI(-481146567, var1 ^ -1521454879);
      this.IIlIl = lIlI(-481146568, var1 ^ 690092642);
   }

   public static Il lII() {
      return IlIll;
   }

   private Color lIl(Color var1, double var2) {
      try {
         switch ((IIlIlIIll)this.ll.IllI()) {
            case I:
               return var1;
            case Il:
               return IllIIlIl.lI(var1, IIlIlIIl.II, var2);
            case IIl:
               return IllIIlIl.lI(var1, IIlIlIIl.lI, var2);
            case IlI:
               return IllIIlIl.lI(var1, IIlIlIIl.III, var2);
            default:
               throw new MatchException(null, null);
         }
      } catch (MatchException var4) {
         throw Illl(var4);
      }
   }

   private static int llI(long var0) {
      return (int)(var0 >> lIlI(-481146565, 137879403 ^ 412692898));
   }

   private boolean lll(class_2248 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic net/minecraft/class_7923.field_41175 Lnet/minecraft/class_7922;
      // 03: aload 1
      // 04: invokeinterface net/minecraft/class_7922.method_10221 (Ljava/lang/Object;)Lnet/minecraft/class_2960; 2
      // 09: invokevirtual net/minecraft/class_2960.toString ()Ljava/lang/String;
      // 0c: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 0f: invokevirtual java/lang/String.toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
      // 12: astore 2
      // 13: getstatic net/minecraft/class_7923.field_41175 Lnet/minecraft/class_7922;
      // 16: aload 1
      // 17: invokeinterface net/minecraft/class_7922.method_10221 (Ljava/lang/Object;)Lnet/minecraft/class_2960; 2
      // 1c: invokevirtual net/minecraft/class_2960.method_12832 ()Ljava/lang/String;
      // 1f: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 22: invokevirtual java/lang/String.toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
      // 25: astore 3
      // 26: aload 0
      // 27: getfield k74/x/Il.IlIIl Lk74/x/IllIlIl;
      // 2a: invokevirtual k74/x/IllIlIl.IllI ()Ljava/lang/Object;
      // 2d: checkcast java/util/List
      // 30: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 35: astore 4
      // 37: aload 4
      // 39: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3e: ifeq cc
      // 41: aload 4
      // 43: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 48: checkcast java/lang/String
      // 4b: astore 5
      // 4d: aload 5
      // 4f: ifnonnull 5e
      // 52: getstatic k74/x/Il.III [Ljava/lang/String;
      // 55: bipush 1
      // 56: aaload
      // 57: goto 69
      // 5a: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 5d: athrow
      // 5e: aload 5
      // 60: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 63: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 66: invokevirtual java/lang/String.toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
      // 69: astore 6
      // 6b: aload 6
      // 6d: invokevirtual java/lang/String.isEmpty ()Z
      // 70: ifne c9
      // 73: aload 2
      // 74: aload 6
      // 76: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 79: ifne c3
      // 7c: goto 83
      // 7f: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 82: athrow
      // 83: aload 3
      // 84: aload 6
      // 86: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 89: ifne c3
      // 8c: goto 93
      // 8f: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 92: athrow
      // 93: aload 2
      // 94: getstatic k74/x/Il.III [Ljava/lang/String;
      // 97: bipush 0
      // 98: aaload
      // 99: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 9c: aload 6
      // 9e: astore 8
      // a0: astore 7
      // a2: new java/lang/StringBuilder
      // a5: dup
      // a6: invokespecial java/lang/StringBuilder.<init> ()V
      // a9: aload 7
      // ab: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // ae: aload 8
      // b0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // b3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // b6: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // b9: ifeq c9
      // bc: goto c3
      // bf: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // c2: athrow
      // c3: bipush 1
      // c4: ireturn
      // c5: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // c8: athrow
      // c9: goto 37
      // cc: bipush 0
      // cd: ireturn
   }

   private static boolean IIII(int param0, int param1, int param2, Long param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 3
      // 01: invokevirtual java/lang/Long.longValue ()J
      // 04: invokestatic k74/x/Il.lIIl (J)I
      // 07: i2l
      // 08: iload 0
      // 09: i2l
      // 0a: lsub
      // 0b: lstore 4
      // 0d: aload 3
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: invokestatic k74/x/Il.llI (J)I
      // 14: i2l
      // 15: iload 1
      // 16: i2l
      // 17: lsub
      // 18: lstore 6
      // 1a: lload 4
      // 1c: iload 2
      // 1d: ineg
      // 1e: i2l
      // 1f: lcmp
      // 20: iflt 51
      // 23: lload 4
      // 25: iload 2
      // 26: i2l
      // 27: lcmp
      // 28: ifgt 51
      // 2b: goto 32
      // 2e: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 31: athrow
      // 32: lload 6
      // 34: iload 2
      // 35: ineg
      // 36: i2l
      // 37: lcmp
      // 38: iflt 51
      // 3b: goto 42
      // 3e: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 41: athrow
      // 42: lload 6
      // 44: iload 2
      // 45: i2l
      // 46: lcmp
      // 47: ifle 59
      // 4a: goto 51
      // 4d: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 50: athrow
      // 51: bipush 1
      // 52: goto 5a
      // 55: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 58: athrow
      // 59: bipush 0
      // 5a: ireturn
   }

   private void IIIl(class_310 param1, class_2338 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/Il.IIll Ljava/util/ArrayDeque;
      // 04: invokevirtual java/util/ArrayDeque.isEmpty ()Z
      // 07: ifne 12
      // 0a: bipush 1
      // 0b: goto 13
      // 0e: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: bipush 0
      // 13: istore 3
      // 14: bipush 0
      // 15: istore 4
      // 17: iload 4
      // 19: bipush 2
      // 1a: if_icmpge 8a
      // 1d: aload 0
      // 1e: getfield k74/x/Il.IIll Ljava/util/ArrayDeque;
      // 21: invokevirtual java/util/ArrayDeque.isEmpty ()Z
      // 24: ifne 8a
      // 27: goto 2e
      // 2a: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2d: athrow
      // 2e: aload 0
      // 2f: getfield k74/x/Il.IIll Ljava/util/ArrayDeque;
      // 32: invokevirtual java/util/ArrayDeque.removeFirst ()Ljava/lang/Object;
      // 35: checkcast k74/x/II
      // 38: astore 5
      // 3a: aload 5
      // 3c: invokevirtual k74/x/II.II ()I
      // 3f: aload 5
      // 41: invokevirtual k74/x/II.I ()I
      // 44: invokestatic k74/x/Il.Ill (II)J
      // 47: lstore 6
      // 49: aload 1
      // 4a: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 4d: invokevirtual net/minecraft/class_638.method_2935 ()Lnet/minecraft/class_631;
      // 50: aload 5
      // 52: invokevirtual k74/x/II.II ()I
      // 55: aload 5
      // 57: invokevirtual k74/x/II.I ()I
      // 5a: invokevirtual net/minecraft/class_631.method_21730 (II)Lnet/minecraft/class_2818;
      // 5d: astore 8
      // 5f: aload 8
      // 61: ifnonnull 7a
      // 64: aload 0
      // 65: getfield k74/x/Il.IlII Ljava/util/Map;
      // 68: lload 6
      // 6a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6d: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 72: pop
      // 73: goto 17
      // 76: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 79: athrow
      // 7a: aload 0
      // 7b: aload 1
      // 7c: aload 2
      // 7d: aload 5
      // 7f: aload 8
      // 81: invokevirtual k74/x/Il.IlIl (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;Lk74/x/II;Lnet/minecraft/class_2818;)V
      // 84: iinc 4 1
      // 87: goto 17
      // 8a: iload 3
      // 8b: ifeq ab
      // 8e: aload 0
      // 8f: getfield k74/x/Il.IIll Ljava/util/ArrayDeque;
      // 92: invokevirtual java/util/ArrayDeque.isEmpty ()Z
      // 95: ifeq ab
      // 98: goto 9f
      // 9b: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 9e: athrow
      // 9f: aload 0
      // a0: bipush 1
      // a1: putfield k74/x/Il.IIIII I
      // a4: goto ab
      // a7: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // aa: athrow
      // ab: return
   }

   private double IIlI(class_2338 var1) {
      return var1.method_10263() * 0.061 + var1.method_10264() * 0.021 + var1.method_10260() * 0.043;
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
      // 00: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 03: astore 1
      // 04: aload 0
      // 05: invokevirtual k74/x/Il.IIIIlIl ()Z
      // 08: ifne 10
      // 0b: return
      // 0c: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0f: athrow
      // 10: aload 0
      // 11: getfield k74/x/Il.IIlII Ljava/lang/Object;
      // 14: aload 1
      // 15: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 18: if_acmpeq 23
      // 1b: bipush 1
      // 1c: goto 24
      // 1f: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 22: athrow
      // 23: bipush 0
      // 24: istore 2
      // 25: iload 2
      // 26: ifeq 3c
      // 29: aload 0
      // 2a: invokevirtual k74/x/Il.Il ()V
      // 2d: aload 0
      // 2e: aload 1
      // 2f: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 32: putfield k74/x/Il.IIlII Ljava/lang/Object;
      // 35: goto 3c
      // 38: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 3b: athrow
      // 3c: aload 1
      // 3d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 40: ifnull 51
      // 43: aload 1
      // 44: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 47: ifnonnull 56
      // 4a: goto 51
      // 4d: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 50: athrow
      // 51: return
      // 52: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 55: athrow
      // 56: aload 1
      // 57: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 5a: invokevirtual net/minecraft/class_746.method_24515 ()Lnet/minecraft/class_2338;
      // 5d: astore 3
      // 5e: aload 3
      // 5f: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // 62: bipush 4
      // 63: ishr
      // 64: istore 4
      // 66: aload 3
      // 67: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // 6a: bipush 4
      // 6b: ishr
      // 6c: istore 5
      // 6e: iload 4
      // 70: aload 0
      // 71: getfield k74/x/Il.IlIII I
      // 74: if_icmpne 87
      // 77: iload 5
      // 79: aload 0
      // 7a: getfield k74/x/Il.IIlIl I
      // 7d: if_icmpeq 8f
      // 80: goto 87
      // 83: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 86: athrow
      // 87: bipush 1
      // 88: goto 90
      // 8b: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 8e: athrow
      // 8f: bipush 0
      // 90: istore 6
      // 92: iload 2
      // 93: ifne a2
      // 96: iload 6
      // 98: ifeq b2
      // 9b: goto a2
      // 9e: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // a1: athrow
      // a2: aload 0
      // a3: aload 1
      // a4: iload 4
      // a6: iload 5
      // a8: invokevirtual k74/x/Il.IllI (Lnet/minecraft/class_310;II)V
      // ab: goto ec
      // ae: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // b1: athrow
      // b2: aload 0
      // b3: getfield k74/x/Il.IIll Ljava/util/ArrayDeque;
      // b6: invokevirtual java/util/ArrayDeque.isEmpty ()Z
      // b9: ifeq ec
      // bc: aload 0
      // bd: dup
      // be: getfield k74/x/Il.IIIII I
      // c1: dup_x1
      // c2: bipush 1
      // c3: iadd
      // c4: putfield k74/x/Il.IIIII I
      // c7: ldc_w -481146566
      // ca: ldc_w -280117758
      // cd: ldc_w 1680211134
      // d0: ixor
      // d1: invokestatic k74/x/Il.lIlI (II)I
      // d4: if_icmpge e3
      // d7: goto de
      // da: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // dd: athrow
      // de: return
      // df: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // e2: athrow
      // e3: aload 0
      // e4: aload 1
      // e5: iload 4
      // e7: iload 5
      // e9: invokevirtual k74/x/Il.IllI (Lnet/minecraft/class_310;II)V
      // ec: aload 0
      // ed: aload 1
      // ee: aload 3
      // ef: invokevirtual k74/x/Il.IIIl (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)V
      // f2: return
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var18 = 2055021673;
      String var8 = "\uf41e渚ᆋ\ue526欑\ue5cb⟊燄⡙㯥ᖹ\uf1cc喇殛瀚\uef2a\ueef9環ﴽ闒\u20c5読窚\udd68㤃\uf11c\ue540\u09b4瑕꒭ﬕ岜⠍\udb97ꢺ䗧耽‘푃㛋튰\ud92aﶬ動\u0e63綜\u2feb泃\ud7ca꽏鮙识✪菼➷쯕ḣ橓☘\uf046튗衟Ю陸擏솎ꙺ愣糛\ue20e钙㗬猲퇶䆩䇈笰耻灄솤詉틓깼帪ʌ㏦\uec0c៰쇥봵䁜ꓟᔆܾݥ왹ᖊ偪튴쁋㊳翺ᅔ\uf5f0쳗帚줔\uf312쬵ᯧ䶂牗㇕\uf78c餾튗荡拱ƛ罖훽轳ᚤ⢳ᰶ䛧Ⰷ換舷㻍\ud806綩\ueabe\udd2d㚎䍶틓ﶷ뛧鵼䁽ẹ熚瞪艼鵢䦜亢\ue314曛摊\ue98e쭨튴\u2029겋蠌뚿塀\ueb51욚ᘮ\udcf2柈囒ਇ阪燆ꉲ噁튟譱Ὤ⺢နﴒ擶ꊶ縹ﲹ抪\udc75碊튬具☕箩鬣횷岼珙쐓튨❆屼㮜妡匬騆ᄐစ틇뿾\udd97ퟤℓ턾퇧㫸氒\uf21a磭\ud876높틖턠㈸⛬䆓\u0cda⪾ὂ鵊ﵳ⭲\uea2a懆扄쐈銡\u1759慷譆涮늨튟鎧繖胴灺뽈犸쮪\ue20d틐ₓ딵㟿튬珎梩읏穴嫻\ue224ᤙ캡튰\ueee5▟ቤ뵜빏묫홥\u2e67绎㵝抔燇\ue0e2냳⥻碗틢羡❌盱\uf631ᠤ풢텅े呇\uf370峝퀄⛇얿\ud947㌶먄ꩾ℧臧ꖻ\u0a0d쥶촴틊理\u2e60镽㗂ጯ꘦剼Ⴔ鸤繼獷⋂䯨洔㔚뤕틟k禖悪˾틓ꊰ眇ꚵ㰄ጣ㗀蹵륟ኔ㋰ਐ\ud8b3渓텂\ue54fធ튬̎\uecff馤䭶쌼女㞕⥄튨顀\uf477陌ⳬ\ue8ea꭛辣騾틋쿅ొ풜⽮ꌅ蝼렐宛튓ᏼ잓哲\uef9f凂ꋒ喷㎚틒筓\u0c3b儑茒摧吆\ue2e4⁒튨媭ꗇ䂳㢫쀹腃뗉笃胂प㻔\ueb51ܝ₨\uf37b擁\ue193㓾鬕橀틞䉑煚淂숝낍ﻤ퀋鈾硢\ud805엮\ue4c1튘䦭垳茗㽜̶⺂툐餮따⯓蹊⿈ᒅ덕꼺幓햠逶琥ꍱଙʁ\ue17e䎣튨箷矠蛸鐾㗪恭⫏䵀틓뀢ꍓ蹸阌爟訛鯧묐Ᏽ詹\uf532醩翽ℰᡘ芅트莌蝒ᛍ匵튨\uef98舌\uebb8욒襜솯薩\uf6a2彼㳒馥恓\uebd6칿䜢廉\u1ad2䆜\udbd9ఘ틞㫨䴌썟눌䒿서ቤ뛫鹺ꏽ药᩺ꭸ뙏퀔셚龏餫\udf32褏\u0a61唥勷咷鱱偖㉣瞟밅⊤쒌탈쁍읩ꤳᠽ匛";
      byte var14 = -1;
      char[] var9 = "娭寏".toCharArray();
      short var7 = 23510;
      String[] var10 = new String[var9.length];

      while (true) {
         int var11 = 0;
         int var12 = 0;
         int var13 = 0;
         if (var14 == 0) {
            IllIl = var10;
            IlllI = new Object[var10.length];
            int var22 = 0;
            int var10001 = 0;
            IllII = new int[498];
            byte[] var10002 = "l\u0010\u0006Æp\u009aè \"vìIA\u0007öò_WUÉÑ\u0004·\u0007¯\u0081 ç\táE\u0010zªéå\u0000\f\u0088\u0090ó$\u009duu\u0003¤¥\u009e\u0091\u0007¢Cï\u0002¾Õ;ñ®\u0082ø\u0084(ræ¯O&E\u0098NCÆâsv¥\u0007\u000fI\u0011^ùZ\t6ÿ\u0099©Ó\u008aCz}NS\u00998I¼³\u0019\u007f\u001e%\u0090\u0002o¨P\u0088g*Á\u0084\u0015Há¦ïªRµf\u0095®\u001a¥ýÁCÑq\u0002Z\u0098!YjFÝÆ¡`<\u008a2Z!\u001eº\u0080\u000eË\u0002\u0004\u000ekÌ¾<9\u0002À\rCþ\u008dúj\u000b'\u009b\u007fåÑ\u008d\u0091 ô\u0002È£f\u0087j\u0012ã4\u0082$E)uV-æ\u000ek®¾µgÈDk\u008d\u0099\u008a\u0017\u0093í÷eÚ½qÇæSZÆù¬°\u008b¹¿\u0000$X\u0001\u0097r~\u0088[g\u0012S¯§ÔØíBú\u008b\u0002Êq,0üt\u009a\u0003\u001d¡Kccdd°©\u0089SÔ:\u000e\u0092Ùh|Ä\u0084¥^«ó\u0019Î\u0007\u0088\u0088½\u0002âÛ\u00adÝMÅ~nÓÏ|\u008a\u008d\u0092²a\u0015ms\u0090\u0080±\u008fÖ6\u0084°È\u009dA\u0095\u0097\tU\u001etj\u009b\u0017þ¤ÿÅ\u00885[M¢'|\u0014\u0002qK}Ù\u0090¨Y°\u0018Ö²ÿ}s\u000eM\u0097lBõoQ3OÝtº\u0012\u0095ÎùÛÊÀ»~\u001cçë\u008d)\u009d\u0004j9i(\u0098T5ï\u009aZMl8ÎL\u0005vy¤Ïn)&\u0012^ýxÇ_\u0017<\u00151ºj\u0085XMña\u0003f¼ª\u0016ãÔè\u007f\u0099m0\u008f\u008c~\u009b¼ÁâJ~*Öé-Áé\u000eV¹G»\\¥\u0081\u0000\u001e\u0089B\u00839\u0083¬ì\u0092úÛý(\u0010#»#íøåÊ<\u001a\u00ad,\u001a\u0082×`«j]iä$Y\u001bé7\u001aJë\u0081;ó×·(\u0018T\b\u008aí¦ïZ\u008d²É\u000bfbå/\u0011\u0004ë°\"66\u000b\u0081å\u008b\u0011N\tnO\u0004FÝU\u0003ø£\u0096eì7º4o\u0016\u001bêÙ\u001b!\u0003\u0092*Ë\u0099¤\u0003/{ôD¦×,Ó0Ïµ¹\u00ad\u008f\u0087wmk\u009fý+®\u000eW\"ý\b\u009a\u009e\u0003\\h\u0096±\u0013§ëÈgà$2X´\u0002÷ZÊÒ\u0086\u000bím\u009c\u0017OEÝ\u0083ùÞkeÐöì¢/Ö\u0080w\u0014@ðR\u0094ò\u0091\u0085c\\IúÝ£\u000e¹õ\u0083\u0016DOÖû[·íÅ^VyQ6Æ¦\u0002Ã:9Òl©;¶\u00957\u0086\u001e\u0012´\u0095C¤¯oå\u0081Ú\u0096\"á0G÷ùæñ\u0004,øþs\u0010¾m\u001ba>À \u0007oSñ$êv7S\u0010«\u0080p\u00ad\u0019Å\u0081÷_\u0090¾\u008eAÞ\u0093\u009cu\n½©±#{NÙó\u0005O\u008aa\u001bÈ~¯ø\u008c\u0095i\u00878õYóßVèÀØ}\u0007©Ü?z)\u0016\u0010\u0083p\u0089aú\u001aì\u001deWm\u001b\u0099ñ\r\u001eÕHk\"\u008e\bxÎ×³XUA{\u000ec\u000b¬\u008f¦üsú°v\u0001]ëXÉet\u009aÌ\u0095Þ\u0016½\u001f\\Ø\u001dL\u0016CÛà\u001eöU\u0002Z\u008d{á«DÒêVç%KêeîÅ{\u0010Ãê\u008fÐ¸\u0002aâÚ§Ã7q\u009d\b\u009c\u0013po¡?\u009euß$\u001fD\u0085-\nÖý?\u001b@\\ìñ \u009f[¼zë\u0095ßá\\\u0083Aß«jØ7\u0014\u000eMR\u0095\u008f±\u000e¸\u008eí\u008fT,ðSÎãáR\u0016Óak^@¢x\u0082g9\u0098·\u0018<\u0004\u0018íTHåÄxÂ&\u0018Å\u0012Óª\u0095§}$\u0019~Ú\u000b¥\u001ft#\u0091ó;ïÉú\u00187ËI- *ó:ÛT\u001b<\u0012Q\u001ady±\u008c\u0088è÷Û\u0092Gs³Ù\u0018þÂ¥O\u008bs\u0007n]É^JÛ\u0096\u008ca¶[È\u007f\u0089³Óí¨È0\u0006cñõç/PÖ-Âðò\u008eem^jv0é\u001a8»ÖòK'WÍ\u0016Î:S;TÜsAo\u0093ç2ÿî99Ï\u0001\u0015³é\u000b\u00162©ÿ¹Ô¶\u009e\u0080\u0088?\u0084:G*\u008b±þ\b\u008e\u000e0ÃZNV\u0085\u0002¹9W©ê·øCþB\u00adf°\u0090\u001c\u0016\u009cp§LØÏpãK»°\u0097¥½\u00183`Ð-Ëp¥\u0002\u0098\u009cHÊ\u008a¹I\t\u0015ß.\u009aÃè\u000e,\u0002,AP\u008c=èWÖTøé±×AÜ{æ\u0000îÓ4pv89O&SÉ\u0014c\n\u0016âq\r$ýµ\u0007²\u0007¨úù\u008er\u001fx\u001bÓ\u008aÁaö\u0086\u0099µ3¡¥\u008eå¬Ô\b<\u000bî\u0005mä\u0015NéºS-Ö\u008d\f\u0018\u0081ñ\u0095X\"Ø¤¨^L\u0015ÿøÇßU\u008b~ëèÈR\u0080\u0004Ó×\u0019\u000eÌª¬\u0081\fåÍP}³Éî.ä$\u0015\"bþ\\n\u0000\u001fNÖø\u008baC<<ÒÜ\u0083\u009a\u0014{ISÚ\u0093j>\u0006-~å\u009f¶ÄÐ-;òÍ\u0089®Új?áþ\u0015±EåxUn\u008eöSöWll½q>»Øe¯;\u0086\u008e&`tÅFäøêÁÔ´\u00158CÎ\u0083\bÞð\u00071\u0014÷£%G®ï£é#\u0015%«^\u0097hóL\u008cÖÈç\u0095ì®\u0083g±1Gµ×q³¶á\u0083\u008fÆONzBÙ\u0007\u0012d¾æ\u0080«NchÚ\u009awâ0u\u0005@\bõ\u009f\u000b\\\u0082É\u0016À\u0015\u008eÞ$ÂéÄt\u0003\u0007ÏZ&\u001a) \u0001©\u0081\u0092új´Ì\u001c\u001c\u0099\u0010¯\u0014Æ\u0005ç¹üv\u000fü)\u0015:\u00143ME^\u0086>¤Ñó\u008f¾{R¿^PÌ¶Y5\u00adÍ[\u0095¥Ü\u00013j&\"\u0018\u0096\u0005¼D[·cÈ\u008a\u0014Igò>XëÉ\u0001\"\u0005¬ZÝ\u008cæ-{+ªmq\u008e\u0093\u0000ºÊ<\u00145Ko£É³\u0080GT;×xçzå\u0007¯\tÞ\"Â\u0017]l\u009c÷³¤^²*Þ¿u\u009eY>LPf\u0091©ÉbY£ÀdLÌÓK2e\u0004\b I\u009c37vP+â³²-\u008fÉw\u008cz#¬\u0012\u0097ø\u0007Jÿ\u0081\u0017XQ\u0086í·\u0015Rø¯\u0091\nr¹³k\u0019Y]\u0089\u008fK\tØ[\u008a&È\u0091þ\u001eÆÕv\u009dG\u0094C¹\u0095\u0087\u0002G_ö\u0096,\b\u0088rEa\u000fBEâém]u\u009fõ'\u0002ÓÜ\u008cÃ\u0090977¬úAâì\nwÍ\u0086%Î\"\u0006\u001cl\u001e2\ryäã¥Fºr¤ô\u007fb>/\u008c(äÓIµ\u0005|WN/ûódÏ\u0081\u009dl&\u0083\u0080W\"x\u0013?P\"Q\u0002Áö'\u0014\u00101\u001cÐXTb\u0081÷2\u001b=\u0017A\u0017\u001bäªØb\u0090\u0086*WæøfY\u009a\u009e\u0010¼R\u0007àÉhIZ;n'wý\u009c1Õþ!\u0099Å\u0092\u00888©e#'\u0089\u0093C½\u008d\u009d\u0006\fÃ@¨÷×3²*Á¹\u0088\u0006ô>N\u009f`\u0093¹å\u0088\u0014<1·\u000b¢Ç\r\u0015Äò\u0007]±Ê\u0018ÒU§ëm\u001a;ç\u001c\u0014ê£Y¸ûiè¸ã3û\u0006-ª\u0019ëÈñgÝþ\u0095M\u0084ôæÎ\u0084>\u0086Õì1¤>Ý\u001a²G48Ü¤_eÞÅPóÛ×¥~ÉÂ\u0006\u008fzé5\u0004úM\u0083B\u0099w\u0089QîqãÂïd"
               .getBytes("ISO-8859-1");

            int var55;
            do {
               IllII[var22] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ -736198884;
               var22 += 1;
               var55 = var10001 + 4;
               var10001 += 4;
            } while (var55 < var10002.length);

            String[] var5 = new String[lIlI(-481146870, var18 ^ 1493595898)];
            int var3 = 0;
            String var2;
            int var4 = (var2 = lIll(var18 ^ 1489455206, '⋞', '뎐')).length();
            int var1 = lIlI(-481146867, var18 ^ 1865421481);
            int var20 = -1;

            label103:
            while (true) {
               var22 = lIlI(-481146868, var18 ^ 909795435);
               String var27 = var2.substring(++var20, var20 + var1);
               byte var39 = -1;

               while (true) {
                  label98: {
                     char[] var57 = var27.toCharArray();
                     int var69 = var57.length;
                     int var6 = 0;
                     var55 = var22;
                     var44 = var57;
                     var10001 = var69;
                     char[] var81;
                     int var88;
                     if (var69 <= 1) {
                        var81 = var57;
                        var69 = var22;
                        var88 = var6;
                     } else {
                        var55 = var22;
                        var10001 = var69;
                        if (var69 <= var6) {
                           break label98;
                        }

                        var81 = var57;
                        var69 = var22;
                        var88 = var6;
                     }

                     while (true) {
                        var81[var88] = (char)(var81[var88] ^ var69 ^ switch (var6 % lIlI(-481146880, var18 ^ -2030675122)) {
                           case 0 -> lIlI(-481146877, var18 ^ -307537617);
                           case 1 -> lIlI(-481146878, var18 ^ -499294585);
                           case 2 -> lIlI(-481146875, var18 ^ 397430308);
                           case 3 -> lIlI(-481146876, var18 ^ -1270743793);
                           case 4 -> lIlI(-481146873, var18 ^ -2016772674);
                           case 5 -> lIlI(-481146874, var18 ^ 831265842);
                           default -> lIlI(-481146855, var18 ^ 1000303008);
                        });
                        var6++;
                        if (var55 == 0) {
                           var88 = var55;
                           var81 = var44;
                           var69 = var55;
                        } else {
                           if (var10001 <= var6) {
                              break;
                           }

                           var81 = var44;
                           var69 = var55;
                           var88 = var6;
                        }
                     }
                  }

                  String var62 = new String(var44).intern();
                  switch (var39) {
                     case 0:
                        var5[var3++] = var62;
                        if ((var20 += var1) >= var4) {
                           lIII = var5;
                           IlI = new String[lIlI(-481146879, var18 ^ 1876178385)];
                           III = new String[lIlI(-481146856, var18 ^ 1359767786)];
                           IIl();
                           return;
                        }

                        var1 = var2.charAt(var20);
                        break;
                     default:
                        var5[var3++] = var62;
                        if ((var20 += var1) < var4) {
                           var1 = var2.charAt(var20);
                           continue label103;
                        }

                        var4 = (var2 = lIll(var18 ^ 1522797219, '⋟', '驕')).length();
                        var1 = lIlI(-481146865, var18 ^ 921698599);
                        var20 = -1;
                  }

                  var22 = lIlI(-481146866, var18 ^ 1593778820);
                  var27 = var2.substring(++var20, var20 + var1);
                  var39 = 0;
               }
            }
         }

         do {
            var13 = var9[var11] ^ var7;
            char[] var15 = var8.substring(var12, var12 + var13).toCharArray();
            int var16 = 0;

            do {
               byte var17 = switch (var16 % 5) {
                  default -> 91;
                  case 1 -> 3;
                  case 2 -> 96;
                  case 3 -> 100;
                  case 4 -> 26;
               };
               var15[var16] = (char)(var15[var16] ^ var17);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   private boolean IIll(class_2248 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: aload 1
      // 001: getstatic net/minecraft/class_2246.field_10442 Lnet/minecraft/class_2248;
      // 004: if_acmpeq 015
      // 007: aload 1
      // 008: getstatic net/minecraft/class_2246.field_29029 Lnet/minecraft/class_2248;
      // 00b: if_acmpne 032
      // 00e: goto 015
      // 011: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 014: athrow
      // 015: aload 0
      // 016: getfield k74/x/Il.IllI Lk74/x/lllIIlII;
      // 019: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 01c: checkcast java/lang/Boolean
      // 01f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 022: ifeq 032
      // 025: goto 02c
      // 028: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 02b: athrow
      // 02c: bipush 1
      // 02d: ireturn
      // 02e: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 031: athrow
      // 032: aload 1
      // 033: getstatic net/minecraft/class_2246.field_10013 Lnet/minecraft/class_2248;
      // 036: if_acmpeq 047
      // 039: aload 1
      // 03a: getstatic net/minecraft/class_2246.field_29220 Lnet/minecraft/class_2248;
      // 03d: if_acmpne 064
      // 040: goto 047
      // 043: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 046: athrow
      // 047: aload 0
      // 048: getfield k74/x/Il.II Lk74/x/lllIIlII;
      // 04b: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 04e: checkcast java/lang/Boolean
      // 051: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 054: ifeq 064
      // 057: goto 05e
      // 05a: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 05d: athrow
      // 05e: bipush 1
      // 05f: ireturn
      // 060: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 063: athrow
      // 064: aload 1
      // 065: getstatic net/minecraft/class_2246.field_10571 Lnet/minecraft/class_2248;
      // 068: if_acmpeq 087
      // 06b: aload 1
      // 06c: getstatic net/minecraft/class_2246.field_29026 Lnet/minecraft/class_2248;
      // 06f: if_acmpeq 087
      // 072: goto 079
      // 075: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 078: athrow
      // 079: aload 1
      // 07a: getstatic net/minecraft/class_2246.field_23077 Lnet/minecraft/class_2248;
      // 07d: if_acmpne 0a4
      // 080: goto 087
      // 083: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 086: athrow
      // 087: aload 0
      // 088: getfield k74/x/Il.llI Lk74/x/lllIIlII;
      // 08b: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 08e: checkcast java/lang/Boolean
      // 091: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 094: ifeq 0a4
      // 097: goto 09e
      // 09a: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 09d: athrow
      // 09e: bipush 1
      // 09f: ireturn
      // 0a0: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0a3: athrow
      // 0a4: aload 1
      // 0a5: getstatic net/minecraft/class_2246.field_10212 Lnet/minecraft/class_2248;
      // 0a8: if_acmpeq 0b9
      // 0ab: aload 1
      // 0ac: getstatic net/minecraft/class_2246.field_29027 Lnet/minecraft/class_2248;
      // 0af: if_acmpne 0d6
      // 0b2: goto 0b9
      // 0b5: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0b8: athrow
      // 0b9: aload 0
      // 0ba: getfield k74/x/Il.IIIlI Lk74/x/lllIIlII;
      // 0bd: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 0c0: checkcast java/lang/Boolean
      // 0c3: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0c6: ifeq 0d6
      // 0c9: goto 0d0
      // 0cc: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0cf: athrow
      // 0d0: bipush 1
      // 0d1: ireturn
      // 0d2: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0d5: athrow
      // 0d6: aload 1
      // 0d7: getstatic net/minecraft/class_2246.field_10080 Lnet/minecraft/class_2248;
      // 0da: if_acmpeq 0eb
      // 0dd: aload 1
      // 0de: getstatic net/minecraft/class_2246.field_29030 Lnet/minecraft/class_2248;
      // 0e1: if_acmpne 108
      // 0e4: goto 0eb
      // 0e7: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0ea: athrow
      // 0eb: aload 0
      // 0ec: getfield k74/x/Il.lll Lk74/x/lllIIlII;
      // 0ef: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 0f2: checkcast java/lang/Boolean
      // 0f5: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0f8: ifeq 108
      // 0fb: goto 102
      // 0fe: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 101: athrow
      // 102: bipush 1
      // 103: ireturn
      // 104: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 107: athrow
      // 108: aload 1
      // 109: getstatic net/minecraft/class_2246.field_10090 Lnet/minecraft/class_2248;
      // 10c: if_acmpeq 11d
      // 10f: aload 1
      // 110: getstatic net/minecraft/class_2246.field_29028 Lnet/minecraft/class_2248;
      // 113: if_acmpne 13a
      // 116: goto 11d
      // 119: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11c: athrow
      // 11d: aload 0
      // 11e: getfield k74/x/Il.IIlll Lk74/x/lllIIlII;
      // 121: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 124: checkcast java/lang/Boolean
      // 127: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 12a: ifeq 13a
      // 12d: goto 134
      // 130: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 133: athrow
      // 134: bipush 1
      // 135: ireturn
      // 136: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 139: athrow
      // 13a: aload 1
      // 13b: getstatic net/minecraft/class_2246.field_10418 Lnet/minecraft/class_2248;
      // 13e: if_acmpeq 14f
      // 141: aload 1
      // 142: getstatic net/minecraft/class_2246.field_29219 Lnet/minecraft/class_2248;
      // 145: if_acmpne 16c
      // 148: goto 14f
      // 14b: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 14e: athrow
      // 14f: aload 0
      // 150: getfield k74/x/Il.lIl Lk74/x/lllIIlII;
      // 153: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 156: checkcast java/lang/Boolean
      // 159: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 15c: ifeq 16c
      // 15f: goto 166
      // 162: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 165: athrow
      // 166: bipush 1
      // 167: ireturn
      // 168: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 16b: athrow
      // 16c: aload 1
      // 16d: getstatic net/minecraft/class_2246.field_27120 Lnet/minecraft/class_2248;
      // 170: if_acmpeq 181
      // 173: aload 1
      // 174: getstatic net/minecraft/class_2246.field_29221 Lnet/minecraft/class_2248;
      // 177: if_acmpne 19e
      // 17a: goto 181
      // 17d: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 180: athrow
      // 181: aload 0
      // 182: getfield k74/x/Il.I Lk74/x/lllIIlII;
      // 185: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 188: checkcast java/lang/Boolean
      // 18b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 18e: ifeq 19e
      // 191: goto 198
      // 194: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 197: athrow
      // 198: bipush 1
      // 199: ireturn
      // 19a: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 19d: athrow
      // 19e: aload 1
      // 19f: getstatic net/minecraft/class_2246.field_22109 Lnet/minecraft/class_2248;
      // 1a2: if_acmpne 1c2
      // 1a5: aload 0
      // 1a6: getfield k74/x/Il.lllI Lk74/x/lllIIlII;
      // 1a9: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 1ac: checkcast java/lang/Boolean
      // 1af: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1b2: ifeq 1c2
      // 1b5: goto 1bc
      // 1b8: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1bb: athrow
      // 1bc: bipush 1
      // 1bd: ireturn
      // 1be: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1c1: athrow
      // 1c2: aload 1
      // 1c3: getstatic net/minecraft/class_2246.field_33509 Lnet/minecraft/class_2248;
      // 1c6: if_acmpeq 1e5
      // 1c9: aload 1
      // 1ca: getstatic net/minecraft/class_2246.field_33508 Lnet/minecraft/class_2248;
      // 1cd: if_acmpeq 1e5
      // 1d0: goto 1d7
      // 1d3: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1d6: athrow
      // 1d7: aload 1
      // 1d8: getstatic net/minecraft/class_2246.field_33510 Lnet/minecraft/class_2248;
      // 1db: if_acmpne 202
      // 1de: goto 1e5
      // 1e1: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1e4: athrow
      // 1e5: aload 0
      // 1e6: getfield k74/x/Il.Il Lk74/x/lllIIlII;
      // 1e9: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 1ec: checkcast java/lang/Boolean
      // 1ef: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1f2: ifeq 202
      // 1f5: goto 1fc
      // 1f8: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1fb: athrow
      // 1fc: bipush 1
      // 1fd: ireturn
      // 1fe: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 201: athrow
      // 202: getstatic net/minecraft/class_7923.field_41175 Lnet/minecraft/class_7922;
      // 205: aload 1
      // 206: invokeinterface net/minecraft/class_7922.method_10221 (Ljava/lang/Object;)Lnet/minecraft/class_2960; 2
      // 20b: invokevirtual net/minecraft/class_2960.method_12832 ()Ljava/lang/String;
      // 20e: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 211: invokevirtual java/lang/String.toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
      // 214: astore 2
      // 215: aload 0
      // 216: getfield k74/x/Il.IIllI Lk74/x/lllIIlII;
      // 219: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 21c: checkcast java/lang/Boolean
      // 21f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 222: ifeq 271
      // 225: aload 2
      // 226: getstatic k74/x/Il.III [Ljava/lang/String;
      // 229: ldc_w -481146563
      // 22c: ldc_w 245295830
      // 22f: ldc_w 813189711
      // 232: ixor
      // 233: invokestatic k74/x/Il.lIlI (II)I
      // 236: aaload
      // 237: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 23a: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 23d: ifne 269
      // 240: goto 247
      // 243: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 246: athrow
      // 247: aload 2
      // 248: getstatic k74/x/Il.III [Ljava/lang/String;
      // 24b: ldc_w -481146564
      // 24e: ldc_w 245295830
      // 251: ldc_w 1263970724
      // 254: ixor
      // 255: invokestatic k74/x/Il.lIlI (II)I
      // 258: aaload
      // 259: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 25c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 25f: ifeq 271
      // 262: goto 269
      // 265: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 268: athrow
      // 269: bipush 1
      // 26a: goto 272
      // 26d: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 270: athrow
      // 271: bipush 0
      // 272: ireturn
   }

   public void IlII(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: invokestatic k74/x/IIllllIl.IIIIl ()[Ljava/lang/String;
      // 003: astore 2
      // 004: aload 0
      // 005: invokevirtual k74/x/Il.IIIIlIl ()Z
      // 008: ifeq 047
      // 00b: aload 0
      // 00c: getfield k74/x/Il.Ill Lk74/x/lllIIlII;
      // 00f: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 012: checkcast java/lang/Boolean
      // 015: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 018: ifne 039
      // 01b: goto 022
      // 01e: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 021: athrow
      // 022: aload 0
      // 023: getfield k74/x/Il.lIll Lk74/x/lllIIlII;
      // 026: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 029: checkcast java/lang/Boolean
      // 02c: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 02f: ifeq 047
      // 032: goto 039
      // 035: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 038: athrow
      // 039: aload 1
      // 03a: invokestatic k74/x/IlIII.IIIIII (Ljava/lang/Object;)Z
      // 03d: ifne 04c
      // 040: goto 047
      // 043: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 046: athrow
      // 047: return
      // 048: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 04b: athrow
      // 04c: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 04f: astore 3
      // 050: aload 3
      // 051: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 054: ifnull 065
      // 057: aload 3
      // 058: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 05b: ifnonnull 06a
      // 05e: goto 065
      // 061: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 064: athrow
      // 065: return
      // 066: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 069: athrow
      // 06a: aload 0
      // 06b: getfield k74/x/Il.IIlII Ljava/lang/Object;
      // 06e: aload 3
      // 06f: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 072: if_acmpeq 07e
      // 075: aload 0
      // 076: invokevirtual k74/x/Il.Il ()V
      // 079: return
      // 07a: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 07d: athrow
      // 07e: aload 3
      // 07f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 082: invokevirtual net/minecraft/class_746.method_24515 ()Lnet/minecraft/class_2338;
      // 085: astore 4
      // 087: aload 0
      // 088: getfield k74/x/Il.IlIlI Lk74/x/IIlIII;
      // 08b: invokevirtual k74/x/IIlIII.IllI ()Ljava/lang/Object;
      // 08e: checkcast java/lang/Double
      // 091: invokevirtual java/lang/Double.doubleValue ()D
      // 094: ldc2_w 100.0
      // 097: ddiv
      // 098: ldc2_w 255.0
      // 09b: dmul
      // 09c: dstore 5
      // 09e: aload 3
      // 09f: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 0a2: invokevirtual net/minecraft/class_315.method_42503 ()Lnet/minecraft/class_7172;
      // 0a5: invokevirtual net/minecraft/class_7172.method_41753 ()Ljava/lang/Object;
      // 0a8: checkcast java/lang/Integer
      // 0ab: invokevirtual java/lang/Integer.intValue ()I
      // 0ae: istore 7
      // 0b0: bipush 1
      // 0b1: iload 7
      // 0b3: ldc_w -481146561
      // 0b6: ldc_w 2053817424
      // 0b9: ldc_w -167015243
      // 0bc: ixor
      // 0bd: invokestatic k74/x/Il.lIlI (II)I
      // 0c0: invokestatic java/lang/Math.min (II)I
      // 0c3: invokestatic java/lang/Math.max (II)I
      // 0c6: istore 8
      // 0c8: iload 8
      // 0ca: ldc_w -481146562
      // 0cd: ldc_w 2053817424
      // 0d0: ldc_w 1442589968
      // 0d3: ixor
      // 0d4: invokestatic k74/x/Il.lIlI (II)I
      // 0d7: imul
      // 0d8: istore 9
      // 0da: iload 9
      // 0dc: iload 9
      // 0de: imul
      // 0df: istore 10
      // 0e1: aload 3
      // 0e2: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 0e5: invokevirtual net/minecraft/class_638.method_31607 ()I
      // 0e8: aload 4
      // 0ea: invokevirtual net/minecraft/class_2338.method_10264 ()I
      // 0ed: ldc_w -481146575
      // 0f0: ldc_w 2053817424
      // 0f3: ldc_w -684219682
      // 0f6: ixor
      // 0f7: invokestatic k74/x/Il.lIlI (II)I
      // 0fa: isub
      // 0fb: invokestatic java/lang/Math.max (II)I
      // 0fe: istore 11
      // 100: aload 3
      // 101: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 104: invokevirtual net/minecraft/class_638.method_31600 ()I
      // 107: aload 4
      // 109: invokevirtual net/minecraft/class_2338.method_10264 ()I
      // 10c: ldc_w -481146576
      // 10f: ldc_w 2053817424
      // 112: ldc_w -1575318229
      // 115: ixor
      // 116: invokestatic k74/x/Il.lIlI (II)I
      // 119: iadd
      // 11a: invokestatic java/lang/Math.min (II)I
      // 11d: istore 12
      // 11f: aload 0
      // 120: getfield k74/x/Il.IlII Ljava/util/Map;
      // 123: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 128: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 12d: astore 13
      // 12f: aload 13
      // 131: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 136: ifeq 26c
      // 139: aload 13
      // 13b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 140: checkcast java/util/Map$Entry
      // 143: astore 14
      // 145: aload 14
      // 147: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 14c: checkcast java/lang/Long
      // 14f: invokevirtual java/lang/Long.longValue ()J
      // 152: invokestatic k74/x/Il.lIIl (J)I
      // 155: istore 15
      // 157: aload 14
      // 159: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 15e: checkcast java/lang/Long
      // 161: invokevirtual java/lang/Long.longValue ()J
      // 164: invokestatic k74/x/Il.llI (J)I
      // 167: istore 16
      // 169: iload 15
      // 16b: bipush 4
      // 16c: ishl
      // 16d: istore 17
      // 16f: iload 16
      // 171: bipush 4
      // 172: ishl
      // 173: istore 18
      // 175: new net/minecraft/class_238
      // 178: dup
      // 179: iload 17
      // 17b: i2d
      // 17c: iload 11
      // 17e: i2d
      // 17f: iload 18
      // 181: i2d
      // 182: iload 17
      // 184: i2d
      // 185: ldc2_w 16.0
      // 188: dadd
      // 189: iload 12
      // 18b: i2d
      // 18c: dconst_1
      // 18d: dadd
      // 18e: iload 18
      // 190: i2d
      // 191: ldc2_w 16.0
      // 194: dadd
      // 195: invokespecial net/minecraft/class_238.<init> (DDDDDD)V
      // 198: astore 19
      // 19a: aload 1
      // 19b: aload 19
      // 19d: invokestatic k74/x/IlIII.lll (Ljava/lang/Object;Lnet/minecraft/class_238;)Z
      // 1a0: ifne 1aa
      // 1a3: goto 12f
      // 1a6: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1a9: athrow
      // 1aa: aload 14
      // 1ac: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 1b1: checkcast java/util/List
      // 1b4: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 1b9: astore 20
      // 1bb: aload 20
      // 1bd: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1c2: ifeq 268
      // 1c5: aload 20
      // 1c7: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1cc: checkcast k74/x/lllIlIlI
      // 1cf: astore 21
      // 1d1: aload 21
      // 1d3: invokevirtual k74/x/lllIlIlI.l ()Lnet/minecraft/class_2338;
      // 1d6: astore 22
      // 1d8: aload 22
      // 1da: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // 1dd: aload 4
      // 1df: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // 1e2: isub
      // 1e3: istore 23
      // 1e5: aload 22
      // 1e7: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // 1ea: aload 4
      // 1ec: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // 1ef: isub
      // 1f0: istore 24
      // 1f2: iload 23
      // 1f4: iload 23
      // 1f6: imul
      // 1f7: iload 24
      // 1f9: iload 24
      // 1fb: imul
      // 1fc: iadd
      // 1fd: iload 10
      // 1ff: if_icmpgt 1bb
      // 202: aload 22
      // 204: invokevirtual net/minecraft/class_2338.method_10264 ()I
      // 207: iload 11
      // 209: if_icmplt 1bb
      // 20c: aload 22
      // 20e: invokevirtual net/minecraft/class_2338.method_10264 ()I
      // 211: iload 12
      // 213: if_icmpgt 1bb
      // 216: aload 0
      // 217: aload 21
      // 219: invokevirtual k74/x/lllIlIlI.I ()Lnet/minecraft/class_2248;
      // 21c: invokevirtual k74/x/Il.lI (Lnet/minecraft/class_2248;)Z
      // 21f: ifne 229
      // 222: goto 1bb
      // 225: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 228: athrow
      // 229: new net/minecraft/class_238
      // 22c: dup
      // 22d: aload 22
      // 22f: invokespecial net/minecraft/class_238.<init> (Lnet/minecraft/class_2338;)V
      // 232: astore 25
      // 234: aload 1
      // 235: aload 25
      // 237: invokestatic k74/x/IlIII.lll (Ljava/lang/Object;Lnet/minecraft/class_238;)Z
      // 23a: ifne 244
      // 23d: goto 1bb
      // 240: invokestatic k74/x/Il.Illl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 243: athrow
      // 244: aload 0
      // 245: aload 0
      // 246: aload 21
      // 248: invokevirtual k74/x/lllIlIlI.I ()Lnet/minecraft/class_2248;
      // 24b: invokevirtual k74/x/Il.l (Lnet/minecraft/class_2248;)Ljava/awt/Color;
      // 24e: aload 0
      // 24f: aload 22
      // 251: invokevirtual k74/x/Il.IIlI (Lnet/minecraft/class_2338;)D
      // 254: invokevirtual k74/x/Il.lIl (Ljava/awt/Color;D)Ljava/awt/Color;
      // 257: astore 26
      // 259: aload 0
      // 25a: aload 1
      // 25b: aload 25
      // 25d: aload 26
      // 25f: dload 5
      // 261: invokevirtual k74/x/Il.II (Ljava/lang/Object;Lnet/minecraft/class_238;Ljava/awt/Color;D)V
      // 264: aload 2
      // 265: ifnull 1bb
      // 268: aload 2
      // 269: ifnull 12f
      // 26c: return
   }

   private void IlIl(class_310 var1, class_2338 var2, II var3, class_2818 var4) {
      int var24 = 1038782876;
      int var6 = (Integer)var1.field_1690.method_42503().method_41753();
      int var7 = Math.max(1, Math.min(var6, lIlI(-481146573, var24 ^ 635515202)));
      String[] var10000 = IIllllIl.IIIIl();
      int var8 = var7 * lIlI(-481146574, var24 ^ 394499321);
      int var9 = var8 * var8;
      String[] var5 = var10000;
      int var10 = Math.max(var1.field_1687.method_31607(), var2.method_10264() - lIlI(-481146571, var24 ^ -1037521051));
      int var11 = Math.min(var1.field_1687.method_31600(), var2.method_10264() + lIlI(-481146572, var24 ^ 1766474243));
      int var12 = var3.II() << 4;
      int var13 = var3.I() << 4;
      class_2339 var14 = new class_2339();
      ArrayList var15 = new ArrayList();
      int var16 = 0;

      label51:
      while (var16 < lIlI(-481146569, var24 ^ 1416015178)) {
         int var17 = var12 + var16;
         int var18 = var17 - var2.method_10263();
         int var19 = 0;

         while (true) {
            if (var19 < lIlI(-481146570, var24 ^ 712846458)) {
               int var20 = var13 + var19;
               int var21 = var20 - var2.method_10260();

               label57: {
                  try {
                     if (var18 * var18 + var21 * var21 > var9) {
                        break label57;
                     }
                  } catch (MatchException var26) {
                     throw Illl(var26);
                  }

                  int var22 = var10;

                  while (var22 <= var11) {
                     var14.method_10103(var17, var22, var20);
                     class_2680 var23 = var4.method_8320(var14);

                     try {
                        if (this.I(var23)) {
                           var15.add(new lllIlIlI(new class_2338(var17, var22, var20), var23.method_26204()));
                        }
                     } catch (MatchException var25) {
                        throw Illl(var25);
                     }

                     var22++;
                     if (var5 != null) {
                        break;
                     }
                  }
               }

               var19++;
               if (var5 == null) {
                  continue;
               }
            }

            var16++;
            if (var5 != null) {
               break label51;
            }
            break;
         }
      }

      this.IlII.put(Ill(var3.II(), var3.I()), List.copyOf(var15));
   }

   private void IllI(class_310 var1, int var2, int var3) {
      this.IIll.clear();
      this.IlIII = var2;
      this.IIlIl = var3;
      this.IIIII = 0;
      int var4 = (Integer)var1.field_1690.method_42503().method_41753();
      int var5 = Math.max(1, Math.min(var4, lIlI(-481146615, 1245360147 ^ 128194624)));
      int var6 = var5 * 2 + 1;
      ArrayList var7 = new ArrayList(var6 * var6);

      for (int var8 = var2 - var5; var8 <= var2 + var5; var8++) {
         for (int var9 = var3 - var5; var9 <= var3 + var5; var9++) {
            int var10 = var8 - var2;
            int var11 = var9 - var3;
            var7.add(new II(var8, var9, var10 * var10 + var11 * var11));
         }
      }

      var7.sort(Comparator.comparingInt(II::l));
      this.IIll.addAll(var7);
      this.IlII.keySet().removeIf(Il::IIII);
   }

   private static MatchException Illl(MatchException var0) {
      return var0;
   }

   private static String lIII(int var0, int var1) {
      int var9 = 1785782452;
      int var2 = (var0 ^ lIlI(-481146616, var9 ^ 1610368125)) & lIlI(-481146613, var9 ^ 30455460);
      if (IlI[var2] == null) {
         char[] var3 = lIII[var2].toCharArray();

         int var4 = switch (var3[0] & lIlI(-481146614, var9 ^ 1033436799)) {
            case 0 -> lIlI(-481146611, var9 ^ 1230412845);
            case 1 -> lIlI(-481146612, var9 ^ -29359229);
            case 2 -> lIlI(-481146609, var9 ^ 162110449);
            case 3 -> lIlI(-481146610, var9 ^ -1228075179);
            case 4 -> lIlI(-481146623, var9 ^ 927789446);
            case 5 -> lIlI(-481146624, var9 ^ 441298833);
            case 6 -> lIlI(-481146621, var9 ^ -152063411);
            case 7 -> lIlI(-481146622, var9 ^ 1814078274);
            case 8 -> lIlI(-481146619, var9 ^ -1274010736);
            case 9 -> lIlI(-481146620, var9 ^ -58465541);
            case 10 -> lIlI(-481146617, var9 ^ 547650126);
            case 11 -> lIlI(-481146618, var9 ^ 366706604);
            case 12 -> lIlI(-481146599, var9 ^ -1171384331);
            case 13 -> lIlI(-481146600, var9 ^ 1191656173);
            case 14 -> lIlI(-481146597, var9 ^ -2065988207);
            case 15 -> lIlI(-481146598, var9 ^ 1902761668);
            case 16 -> lIlI(-481146595, var9 ^ -538486284);
            case 17 -> lIlI(-481146596, var9 ^ 2026432270);
            case 18 -> lIlI(-481146593, var9 ^ -689909070);
            case 19 -> lIlI(-481146594, var9 ^ -1725134289);
            case 20 -> lIlI(-481146607, var9 ^ -1158379378);
            case 21 -> lIlI(-481146608, var9 ^ -1880921737);
            case 22 -> lIlI(-481146605, var9 ^ -1743251526);
            case 23 -> lIlI(-481146606, var9 ^ -1630465315);
            case 24 -> 3;
            case 25 -> lIlI(-481146603, var9 ^ -960826790);
            case 26 -> lIlI(-481146604, var9 ^ 707507350);
            case 27 -> lIlI(-481146601, var9 ^ 813969733);
            case 28 -> lIlI(-481146602, var9 ^ 2077998225);
            case 29 -> lIlI(-481146647, var9 ^ 126667065);
            case 30 -> lIlI(-481146648, var9 ^ -1515380998);
            case 31 -> lIlI(-481146645, var9 ^ -58091449);
            case 32 -> lIlI(-481146646, var9 ^ 782431451);
            case 33 -> lIlI(-481146643, var9 ^ 1790757470);
            case 34 -> lIlI(-481146644, var9 ^ 1898900242);
            case 35 -> lIlI(-481146641, var9 ^ -1832574928);
            case 36 -> lIlI(-481146642, var9 ^ 1462004988);
            case 37 -> lIlI(-481146655, var9 ^ 1961787703);
            case 38 -> lIlI(-481146656, var9 ^ 1347233364);
            case 39 -> lIlI(-481146653, var9 ^ -56019953);
            case 40 -> lIlI(-481146654, var9 ^ 1272543891);
            case 41 -> lIlI(-481146651, var9 ^ 1949370729);
            case 42 -> lIlI(-481146652, var9 ^ -183610287);
            case 43 -> lIlI(-481146649, var9 ^ -1735362283);
            case 44 -> lIlI(-481146650, var9 ^ 2125464214);
            case 45 -> lIlI(-481146631, var9 ^ 824472464);
            case 46 -> lIlI(-481146632, var9 ^ 1291483321);
            case 47 -> lIlI(-481146629, var9 ^ -1546194499);
            case 48 -> lIlI(-481146630, var9 ^ -1445629534);
            case 49 -> lIlI(-481146627, var9 ^ 1568315116);
            case 50 -> lIlI(-481146628, var9 ^ 1011075771);
            case 51 -> lIlI(-481146625, var9 ^ 653853968);
            case 52 -> lIlI(-481146626, var9 ^ 695385178);
            case 53 -> lIlI(-481146639, var9 ^ 751662017);
            case 54 -> lIlI(-481146640, var9 ^ -124971024);
            case 55 -> lIlI(-481146637, var9 ^ -1602585928);
            case 56 -> lIlI(-481146638, var9 ^ 187299465);
            case 57 -> lIlI(-481146635, var9 ^ -516095726);
            case 58 -> lIlI(-481146636, var9 ^ -999042703);
            case 59 -> lIlI(-481146633, var9 ^ -1268829464);
            case 60 -> lIlI(-481146634, var9 ^ -300184436);
            case 61 -> lIlI(-481146679, var9 ^ 1099496189);
            case 62 -> lIlI(-481146680, var9 ^ 895942431);
            case 63 -> lIlI(-481146677, var9 ^ -1851551388);
            case 64 -> lIlI(-481146678, var9 ^ 1773397565);
            case 65 -> lIlI(-481146675, var9 ^ 979307118);
            case 66 -> lIlI(-481146676, var9 ^ 679087014);
            case 67 -> lIlI(-481146673, var9 ^ -1222873859);
            case 68 -> lIlI(-481146674, var9 ^ 1630227494);
            case 69 -> 5;
            case 70 -> lIlI(-481146687, var9 ^ -1594948985);
            case 71 -> lIlI(-481146688, var9 ^ 788441973);
            case 72 -> lIlI(-481146685, var9 ^ 1956100701);
            case 73 -> lIlI(-481146686, var9 ^ 320078692);
            case 74 -> lIlI(-481146683, var9 ^ -651869450);
            case 75 -> lIlI(-481146684, var9 ^ 1912025928);
            case 76 -> lIlI(-481146681, var9 ^ -1694888560);
            case 77 -> lIlI(-481146682, var9 ^ -250980457);
            case 78 -> lIlI(-481146663, var9 ^ -1462394545);
            case 79 -> lIlI(-481146664, var9 ^ -1343767005);
            case 80 -> lIlI(-481146661, var9 ^ -1519303235);
            case 81 -> lIlI(-481146662, var9 ^ 1480248740);
            case 82 -> lIlI(-481146659, var9 ^ -1111795462);
            case 83 -> lIlI(-481146660, var9 ^ 671228906);
            case 84 -> lIlI(-481146657, var9 ^ 609941227);
            case 85 -> lIlI(-481146658, var9 ^ 57069022);
            case 86 -> lIlI(-481146671, var9 ^ 236407764);
            case 87 -> lIlI(-481146672, var9 ^ -1456650564);
            case 88 -> lIlI(-481146669, var9 ^ 1188433195);
            case 89 -> lIlI(-481146670, var9 ^ 412118953);
            case 90 -> lIlI(-481146667, var9 ^ 802118180);
            case 91 -> lIlI(-481146668, var9 ^ 1398152159);
            case 92 -> lIlI(-481146665, var9 ^ 2053630933);
            case 93 -> lIlI(-481146666, var9 ^ -287916726);
            case 94 -> lIlI(-481146711, var9 ^ 1696339485);
            case 95 -> lIlI(-481146712, var9 ^ -601314603);
            case 96 -> lIlI(-481146709, var9 ^ -264026320);
            case 97 -> lIlI(-481146710, var9 ^ 1977241022);
            case 98 -> lIlI(-481146707, var9 ^ 141542165);
            case 99 -> lIlI(-481146708, var9 ^ 1192104624);
            case 100 -> lIlI(-481146705, var9 ^ 285912150);
            case 101 -> lIlI(-481146706, var9 ^ 1189566130);
            case 102 -> lIlI(-481146719, var9 ^ -1069735974);
            case 103 -> lIlI(-481146720, var9 ^ -1562636903);
            case 104 -> lIlI(-481146717, var9 ^ 1514677078);
            case 105 -> lIlI(-481146718, var9 ^ -1627418251);
            case 106 -> lIlI(-481146715, var9 ^ 559503032);
            case 107 -> lIlI(-481146716, var9 ^ -342845133);
            case 108 -> lIlI(-481146713, var9 ^ -922925671);
            case 109 -> lIlI(-481146714, var9 ^ -601432432);
            case 110 -> lIlI(-481146695, var9 ^ 1712549530);
            case 111 -> lIlI(-481146696, var9 ^ 1343146567);
            case 112 -> lIlI(-481146693, var9 ^ 2024373655);
            case 113 -> lIlI(-481146694, var9 ^ 1557590923);
            case 114 -> lIlI(-481146691, var9 ^ 1203443351);
            case 115 -> lIlI(-481146692, var9 ^ 741675182);
            case 116 -> lIlI(-481146689, var9 ^ -173068540);
            case 117 -> lIlI(-481146690, var9 ^ -738330525);
            case 118 -> lIlI(-481146703, var9 ^ -949192592);
            case 119 -> lIlI(-481146704, var9 ^ 753214262);
            case 120 -> lIlI(-481146701, var9 ^ 1736812467);
            case 121 -> lIlI(-481146702, var9 ^ 1208129533);
            case 122 -> lIlI(-481146699, var9 ^ -1208287125);
            case 123 -> lIlI(-481146700, var9 ^ 566992102);
            case 124 -> lIlI(-481146697, var9 ^ -1510844874);
            case 125 -> lIlI(-481146698, var9 ^ 31851579);
            case 126 -> lIlI(-481146743, var9 ^ 1298181106);
            case 127 -> lIlI(-481146744, var9 ^ -1209603651);
            case 128 -> lIlI(-481146741, var9 ^ 900444395);
            case 129 -> lIlI(-481146742, var9 ^ 773163538);
            case 130 -> lIlI(-481146739, var9 ^ 925887810);
            case 131 -> lIlI(-481146740, var9 ^ -982355084);
            case 132 -> lIlI(-481146737, var9 ^ 387199615);
            case 133 -> lIlI(-481146738, var9 ^ 337822076);
            case 134 -> lIlI(-481146751, var9 ^ 1686899992);
            case 135 -> lIlI(-481146752, var9 ^ -535149268);
            case 136 -> lIlI(-481146749, var9 ^ -964843631);
            case 137 -> lIlI(-481146750, var9 ^ 160243731);
            case 138 -> lIlI(-481146747, var9 ^ 2019112120);
            case 139 -> lIlI(-481146748, var9 ^ -1833548262);
            case 140 -> lIlI(-481146745, var9 ^ -1439245110);
            case 141 -> lIlI(-481146746, var9 ^ -29258756);
            case 142 -> lIlI(-481146727, var9 ^ 1658244120);
            case 143 -> lIlI(-481146728, var9 ^ -2046710794);
            case 144 -> lIlI(-481146725, var9 ^ -692042635);
            case 145 -> lIlI(-481146726, var9 ^ -119186946);
            case 146 -> lIlI(-481146723, var9 ^ 46328784);
            case 147 -> lIlI(-481146724, var9 ^ 809052275);
            case 148 -> lIlI(-481146721, var9 ^ 1860132224);
            case 149 -> lIlI(-481146722, var9 ^ -1301522576);
            case 150 -> lIlI(-481146735, var9 ^ -1490748890);
            case 151 -> lIlI(-481146736, var9 ^ -724779739);
            case 152 -> lIlI(-481146733, var9 ^ -1208395885);
            case 153 -> lIlI(-481146734, var9 ^ -276423460);
            case 154 -> lIlI(-481146731, var9 ^ -1670934295);
            case 155 -> lIlI(-481146732, var9 ^ 763181114);
            case 156 -> lIlI(-481146729, var9 ^ 496832966);
            case 157 -> lIlI(-481146730, var9 ^ 345666743);
            case 158 -> lIlI(-481146775, var9 ^ 1872287606);
            case 159 -> lIlI(-481146776, var9 ^ 2126672336);
            case 160 -> lIlI(-481146773, var9 ^ -2065605690);
            case 161 -> lIlI(-481146774, var9 ^ -1484847684);
            case 162 -> lIlI(-481146771, var9 ^ 362842762);
            case 163 -> lIlI(-481146772, var9 ^ -1232460650);
            case 164 -> lIlI(-481146769, var9 ^ -1667520431);
            case 165 -> lIlI(-481146770, var9 ^ -1545517528);
            case 166 -> lIlI(-481146783, var9 ^ -132198450);
            case 167 -> lIlI(-481146784, var9 ^ -1883739573);
            case 168 -> lIlI(-481146781, var9 ^ -810365683);
            case 169 -> lIlI(-481146782, var9 ^ -1569093345);
            case 170 -> lIlI(-481146779, var9 ^ -1225389413);
            case 171 -> lIlI(-481146780, var9 ^ 17494187);
            case 172 -> lIlI(-481146777, var9 ^ -443058106);
            case 173 -> lIlI(-481146778, var9 ^ -635160528);
            case 174 -> lIlI(-481146759, var9 ^ -1519629358);
            case 175 -> lIlI(-481146760, var9 ^ -2147396126);
            case 176 -> lIlI(-481146757, var9 ^ -832588754);
            case 177 -> lIlI(-481146758, var9 ^ 111014328);
            case 178 -> lIlI(-481146755, var9 ^ 2088515398);
            case 179 -> lIlI(-481146756, var9 ^ -67301631);
            case 180 -> lIlI(-481146753, var9 ^ -1001198996);
            case 181 -> lIlI(-481146754, var9 ^ -1063591748);
            case 182 -> lIlI(-481146767, var9 ^ -963670308);
            case 183 -> lIlI(-481146768, var9 ^ -370071965);
            case 184 -> lIlI(-481146765, var9 ^ -1436349768);
            case 185 -> lIlI(-481146766, var9 ^ -1846266624);
            case 186 -> lIlI(-481146763, var9 ^ -1994264208);
            case 187 -> lIlI(-481146764, var9 ^ -1890809318);
            case 188 -> lIlI(-481146761, var9 ^ 783901051);
            case 189 -> lIlI(-481146762, var9 ^ -1336624479);
            case 190 -> lIlI(-481146807, var9 ^ -398670901);
            case 191 -> lIlI(-481146808, var9 ^ -91044470);
            case 192 -> lIlI(-481146805, var9 ^ 366350362);
            case 193 -> 4;
            case 194 -> lIlI(-481146806, var9 ^ 223496664);
            case 195 -> lIlI(-481146803, var9 ^ 460335592);
            case 196 -> lIlI(-481146804, var9 ^ -73479629);
            case 197 -> lIlI(-481146801, var9 ^ -372598370);
            case 198 -> lIlI(-481146802, var9 ^ 686132017);
            case 199 -> lIlI(-481146815, var9 ^ 1558021363);
            case 200 -> lIlI(-481146816, var9 ^ -732036053);
            case 201 -> lIlI(-481146813, var9 ^ -512043163);
            case 202 -> lIlI(-481146814, var9 ^ -1601954360);
            case 203 -> lIlI(-481146811, var9 ^ 888097396);
            case 204 -> lIlI(-481146812, var9 ^ -796515745);
            case 205 -> lIlI(-481146809, var9 ^ -528047922);
            case 206 -> lIlI(-481146810, var9 ^ -811714685);
            case 207 -> lIlI(-481146791, var9 ^ 1474576857);
            case 208 -> lIlI(-481146792, var9 ^ 2119139539);
            case 209 -> 0;
            case 210 -> lIlI(-481146789, var9 ^ -1678478173);
            case 211 -> lIlI(-481146790, var9 ^ 1484956131);
            case 212 -> lIlI(-481146787, var9 ^ -1464561752);
            case 213 -> lIlI(-481146788, var9 ^ -2029165622);
            case 214 -> lIlI(-481146785, var9 ^ -1095803563);
            case 215 -> lIlI(-481146786, var9 ^ -1346721809);
            case 216 -> 2;
            case 217 -> lIlI(-481146799, var9 ^ 126220744);
            case 218 -> lIlI(-481146800, var9 ^ 104283535);
            case 219 -> lIlI(-481146797, var9 ^ -1662202348);
            case 220 -> lIlI(-481146798, var9 ^ 1175455865);
            case 221 -> lIlI(-481146795, var9 ^ -1480649669);
            case 222 -> lIlI(-481146796, var9 ^ -1925664659);
            case 223 -> 1;
            case 224 -> lIlI(-481146793, var9 ^ 1833099146);
            case 225 -> lIlI(-481146794, var9 ^ -2076130662);
            case 226 -> lIlI(-481146839, var9 ^ -2135207560);
            case 227 -> lIlI(-481146840, var9 ^ -220130618);
            case 228 -> lIlI(-481146837, var9 ^ 1664443813);
            case 229 -> lIlI(-481146838, var9 ^ -1292738920);
            case 230 -> lIlI(-481146835, var9 ^ -90758662);
            case 231 -> lIlI(-481146836, var9 ^ 1441880316);
            case 232 -> lIlI(-481146833, var9 ^ -1249749518);
            case 233 -> lIlI(-481146834, var9 ^ 1181326076);
            case 234 -> lIlI(-481146847, var9 ^ 843409731);
            case 235 -> lIlI(-481146848, var9 ^ 1144726902);
            case 236 -> lIlI(-481146845, var9 ^ 945640029);
            case 237 -> lIlI(-481146846, var9 ^ -255548468);
            case 238 -> lIlI(-481146843, var9 ^ -896919202);
            case 239 -> lIlI(-481146844, var9 ^ -857459460);
            case 240 -> lIlI(-481146841, var9 ^ 1056085931);
            case 241 -> lIlI(-481146842, var9 ^ -2091219328);
            case 242 -> lIlI(-481146823, var9 ^ 721152904);
            case 243 -> lIlI(-481146824, var9 ^ -2115712240);
            case 244 -> lIlI(-481146821, var9 ^ -511783236);
            case 245 -> lIlI(-481146822, var9 ^ -1529905031);
            case 246 -> lIlI(-481146819, var9 ^ 171217962);
            case 247 -> lIlI(-481146820, var9 ^ 283738125);
            case 248 -> lIlI(-481146817, var9 ^ 717600466);
            case 249 -> lIlI(-481146818, var9 ^ -329505885);
            case 250 -> lIlI(-481146831, var9 ^ 455526842);
            case 251 -> lIlI(-481146832, var9 ^ -1628244782);
            case 252 -> lIlI(-481146829, var9 ^ 281781);
            case 253 -> lIlI(-481146830, var9 ^ 1714505444);
            case 254 -> lIlI(-481146827, var9 ^ 319380111);
            default -> lIlI(-481146828, var9 ^ -144398020);
         };
         int var5 = (var1 & lIlI(-481146825, var9 ^ -1191664604)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & lIlI(-481146826, var9 ^ 1238820192)) >>> lIlI(-481146871, var9 ^ 439888601)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & lIlI(-481146872, var9 ^ 438333692);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & lIlI(-481146869, var9 ^ -1527846627);
            }
         }

         IlI[var2] = new String(var3).intern();
      }

      return IlI[var2];
   }

   private static int lIIl(long var0) {
      return (int)var0;
   }
}
