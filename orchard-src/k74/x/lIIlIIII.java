package k74.x;

import java.awt.Color;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1309;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_3532;

@Environment(EnvType.CLIENT)
public final class lIIlIIII extends IlIIIIIIl implements IIIIIlII {
   private static final double I = 5.0;
   private static final String[] II;
   private static final IIIllIIl Il;
   private final IIlIII lI;
   private static final int[] IIIl;
   private final IIlIII ll;
   private final IIlIII III;
   private final IIlIII IIl;
   private static final String[] IlI;
   private final lllIIlII Ill;
   private final IIlIII lII;
   private final lllIIlII lIl;
   private static final String[] IIlI;
   private static final Object[] IIll;
   private final lllIIlII llI;
   private static final double lll = 108.0;
   private volatile List<IlllIlll> IIII;

   public lIIlIIII() {
      int var1 = -351842588;
      super(
         IlIIllIII.Ill(IIl(lIl(-335271104, var1 ^ 1652852189), lIl(-335271103, var1 ^ -24155029))),
         lllIIlIl.II,
         IlIIllIII.Ill(IIl(lIl(-335271102, var1 ^ -16692834), lIl(-335271101, var1 ^ 2034124315)))
      );
      this.ll = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(IIl(lIl(-335271100, var1 ^ 989980913), lIl(-335271099, var1 ^ -2011852170))), 18.0, 0.0, 4000.0, 1.0)
            .IIIl(IlIIllIII.Ill(IIl(lIl(-335271098, var1 ^ 2128765487), lIl(-335271097, var1 ^ -456316701))))
      );
      this.IIl = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(IIl(lIl(-335271096, var1 ^ 411153264), lIl(-335271095, var1 ^ 1924475465))), 126.0, 0.0, 4000.0, 1.0)
            .IIIl(IlIIllIII.Ill(IIl(lIl(-335271094, var1 ^ 97405957), lIl(-335271093, var1 ^ -1985343505))))
      );
      this.lI = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(IIl(lIl(-335271092, var1 ^ -1010747991), lIl(-335271091, var1 ^ 784338999))), 108.0, 72.0, 180.0, 2.0)
            .IIIl(IlIIllIII.Ill(IIl(lIl(-335271090, var1 ^ -1200119255), lIl(-335271089, var1 ^ -233677715))))
      );
      this.III = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(IIl(lIl(-335271088, var1 ^ 565546541), lIl(-335271087, var1 ^ 599594072))), 36.0, 8.0, 128.0, 1.0)
            .IIIl(IlIIllIII.Ill(IIl(lIl(-335271086, var1 ^ -1314775059), lIl(-335271085, var1 ^ -1184583006))))
      );
      this.lII = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(IIl(lIl(-335271084, var1 ^ -284593209), lIl(-335271083, var1 ^ -1244812587))), 100.0, 60.0, 200.0, 5.0)
            .IIIl(IlIIllIII.Ill(IIl(lIl(-335271082, var1 ^ 1260422444), lIl(-335271081, var1 ^ -911671819))))
      );
      this.lIl = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IIl(lIl(-335271080, var1 ^ 1645310831), lIl(-335271079, var1 ^ 1244225555))), true));
      this.llI = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IIl(lIl(-335271078, var1 ^ -1000627499), lIl(-335271077, var1 ^ 1789353335))), true));
      this.Ill = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IIl(lIl(-335271076, var1 ^ 1465553017), lIl(-335271075, var1 ^ -1124566187))), true));
      this.IIII = List.of();
   }

   private static String llI(int var0, char var1, short var2) {
      int var3 = var1 ^ '薞';
      char[] var4 = IIlI[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])IIll[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         IIll[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 23528;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ '쏱';
         var10 ^= 54540;
         var10 ^= 23512;
         var10 -= 38676;
         var10 ^= 36607;
         var10 -= 60362;
         var10 += 37522;
         var10 -= 58838;
         var10 -= 7118;
         var10 -= 39039;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   @Override
   public double lll() {
      return this.ll.IllI();
   }

   @Override
   public void llIl() {
      this.IIII = List.of();
   }

   @Override
   public void llll(class_332 var1, int var2, int var3, float var4) {
      this.l(var1, false, var4);
   }

   @Override
   public double IIIl() {
      return this.lI.IllI() * this.lII();
   }

   @Override
   public void lllI(double var1, double var3) {
      class_310 var5 = class_310.method_1551();
      double var6 = Double.MAX_VALUE;
      double var8 = Double.MAX_VALUE;

      label18: {
         try {
            if (var5 == null || var5.method_22683() == null) {
               break label18;
            }
         } catch (RuntimeException var10) {
            throw I(var10);
         }

         var6 = Math.max(0.0, var5.method_22683().method_4486() - this.IIllI());
         var8 = Math.max(0.0, var5.method_22683().method_4502() - this.IIIl());
      }

      this.ll.Ill(Math.max(0.0, Math.min(var1, var6)));
      this.IIl.Ill(Math.max(0.0, Math.min(var3, var8)));
   }

   private static RuntimeException I(RuntimeException var0) {
      return var0;
   }

   @Override
   public double IIllI() {
      return this.lI.IllI() * this.lII();
   }

   @Override
   public boolean llII(double param1, double param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: dload 1
      // 01: aload 0
      // 02: invokevirtual k74/x/lIIlIIII.lll ()D
      // 05: dcmpl
      // 06: iflt 4b
      // 09: dload 1
      // 0a: aload 0
      // 0b: invokevirtual k74/x/lIIlIIII.lll ()D
      // 0e: aload 0
      // 0f: invokevirtual k74/x/lIIlIIII.IIllI ()D
      // 12: dadd
      // 13: dcmpg
      // 14: ifgt 4b
      // 17: goto 1e
      // 1a: invokestatic k74/x/lIIlIIII.I (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1d: athrow
      // 1e: dload 3
      // 1f: aload 0
      // 20: invokevirtual k74/x/lIIlIIII.ll ()D
      // 23: dcmpl
      // 24: iflt 4b
      // 27: goto 2e
      // 2a: invokestatic k74/x/lIIlIIII.I (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2d: athrow
      // 2e: dload 3
      // 2f: aload 0
      // 30: invokevirtual k74/x/lIIlIIII.ll ()D
      // 33: aload 0
      // 34: invokevirtual k74/x/lIIlIIII.IIIl ()D
      // 37: dadd
      // 38: dcmpg
      // 39: ifgt 4b
      // 3c: goto 43
      // 3f: invokestatic k74/x/lIIlIIII.I (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 42: athrow
      // 43: bipush 1
      // 44: goto 4c
      // 47: invokestatic k74/x/lIIlIIII.I (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 4a: athrow
      // 4b: bipush 0
      // 4c: ireturn
   }

   private void l(class_332 param1, boolean param2, float param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 03: astore 4
      // 05: aload 1
      // 06: ifnull 42
      // 09: aload 4
      // 0b: ifnull 42
      // 0e: goto 15
      // 11: invokestatic k74/x/lIIlIIII.I (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 14: athrow
      // 15: aload 4
      // 17: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 1a: ifnull 42
      // 1d: goto 24
      // 20: invokestatic k74/x/lIIlIIII.I (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 23: athrow
      // 24: aload 4
      // 26: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 29: ifnull 42
      // 2c: goto 33
      // 2f: invokestatic k74/x/lIIlIIII.I (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 32: athrow
      // 33: aload 4
      // 35: getfield net/minecraft/class_310.field_1772 Lnet/minecraft/class_327;
      // 38: ifnonnull 47
      // 3b: goto 42
      // 3e: invokestatic k74/x/lIIlIIII.I (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 41: athrow
      // 42: return
      // 43: invokestatic k74/x/lIIlIIII.I (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 46: athrow
      // 47: aload 0
      // 48: invokevirtual k74/x/lIIlIIII.lII ()D
      // 4b: dstore 5
      // 4d: aload 0
      // 4e: getfield k74/x/lIIlIIII.lI Lk74/x/IIlIII;
      // 51: invokevirtual k74/x/IIlIII.IllI ()Ljava/lang/Object;
      // 54: checkcast java/lang/Double
      // 57: invokevirtual java/lang/Double.doubleValue ()D
      // 5a: dstore 7
      // 5c: aload 0
      // 5d: invokevirtual k74/x/lIIlIIII.lll ()D
      // 60: dstore 9
      // 62: aload 0
      // 63: invokevirtual k74/x/lIIlIIII.ll ()D
      // 66: dstore 11
      // 68: aload 1
      // 69: invokestatic k74/x/IlIIlllIl.IIllll (Lnet/minecraft/class_332;)V
      // 6c: aload 1
      // 6d: dload 9
      // 6f: dload 11
      // 71: invokestatic k74/x/IlIIlllIl.IlIIlI (Lnet/minecraft/class_332;DD)V
      // 74: aload 1
      // 75: dload 5
      // 77: dload 5
      // 79: invokestatic k74/x/IlIIlllIl.llIIIl (Lnet/minecraft/class_332;DD)V
      // 7c: aload 0
      // 7d: aload 1
      // 7e: dload 7
      // 80: iload 2
      // 81: invokevirtual k74/x/lIIlIIII.lI (Lnet/minecraft/class_332;DZ)V
      // 84: aload 0
      // 85: aload 1
      // 86: dload 7
      // 88: invokevirtual k74/x/lIIlIIII.III (Lnet/minecraft/class_332;D)V
      // 8b: aload 0
      // 8c: aload 1
      // 8d: aload 4
      // 8f: dload 7
      // 91: fload 3
      // 92: invokevirtual k74/x/lIIlIIII.Ill (Lnet/minecraft/class_332;Lnet/minecraft/class_310;DF)I
      // 95: pop
      // 96: aload 1
      // 97: invokestatic k74/x/IlIIlllIl.lIIIll (Lnet/minecraft/class_332;)V
      // 9a: goto a6
      // 9d: astore 13
      // 9f: aload 1
      // a0: invokestatic k74/x/IlIIlllIl.lIIIll (Lnet/minecraft/class_332;)V
      // a3: aload 13
      // a5: athrow
      // a6: return
   }

   private boolean II(class_310 param1, class_1309 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 2
      // 01: instanceof net/minecraft/class_1657
      // 04: ifeq 35
      // 07: aload 2
      // 08: checkcast net/minecraft/class_1657
      // 0b: astore 3
      // 0c: aload 0
      // 0d: getfield k74/x/lIIlIIII.lIl Lk74/x/lllIIlII;
      // 10: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 13: checkcast java/lang/Boolean
      // 16: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 19: ifeq 33
      // 1c: aload 1
      // 1d: aload 3
      // 1e: invokestatic k74/x/IlIII.lIlll (Lnet/minecraft/class_310;Lnet/minecraft/class_1657;)Z
      // 21: ifeq 33
      // 24: goto 2b
      // 27: invokestatic k74/x/lIIlIIII.I (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2a: athrow
      // 2b: bipush 1
      // 2c: goto 34
      // 2f: invokestatic k74/x/lIIlIIII.I (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 32: athrow
      // 33: bipush 0
      // 34: ireturn
      // 35: aload 0
      // 36: getfield k74/x/lIIlIIII.llI Lk74/x/lllIIlII;
      // 39: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 3c: checkcast java/lang/Boolean
      // 3f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 42: ifeq 6a
      // 45: aload 2
      // 46: instanceof net/minecraft/class_1308
      // 49: ifeq 6a
      // 4c: goto 53
      // 4f: invokestatic k74/x/lIIlIIII.I (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 52: athrow
      // 53: aload 1
      // 54: aload 2
      // 55: invokestatic k74/x/IlIII.lllll (Lnet/minecraft/class_310;Lnet/minecraft/class_1297;)Z
      // 58: ifeq 6a
      // 5b: goto 62
      // 5e: invokestatic k74/x/lIIlIIII.I (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 61: athrow
      // 62: bipush 1
      // 63: goto 6b
      // 66: invokestatic k74/x/lIIlIIII.I (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 69: athrow
      // 6a: bipush 0
      // 6b: ireturn
   }

   private Color Il() {
      return new Color(lIl(-335271074, 1713847942 ^ -1089990359), lIl(-335271073, 1713847942 ^ 678287162), lIl(-335271072, 1713847942 ^ 795847732));
   }

   @Override
   public double ll() {
      return this.IIl.IllI();
   }

   private void lI(class_332 param1, double param2, boolean param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/lIIlIIII.Ill Lk74/x/lllIIlII;
      // 04: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 07: checkcast java/lang/Boolean
      // 0a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0d: ifne 1c
      // 10: iload 4
      // 12: ifeq 30
      // 15: goto 1c
      // 18: invokestatic k74/x/lIIlIIII.I (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1b: athrow
      // 1c: aload 1
      // 1d: getstatic k74/x/lIIlIIII.Il Lk74/x/IIIllIIl;
      // 20: dconst_0
      // 21: dconst_0
      // 22: dload 2
      // 23: dload 2
      // 24: iload 4
      // 26: invokestatic k74/x/IIIlIllII.llI (Lnet/minecraft/class_332;Lk74/x/IIIllIIl;DDDDZ)V
      // 29: goto 30
      // 2c: invokestatic k74/x/lIIlIIII.I (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2f: athrow
      // 30: return
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = 605564408;
      int var10001 = "\u0093⑤鉟㫮\u12c7㪭펜㧘ᎏ␊틁㯁鎸㯄ᎈ㯪劷\u244d厔㩔Ꭽ㧊팒㤝퉃␔厇㧶ጣ⒑Ꮋ㨴鎣㥚팸㦝前㮔펁㫦匭㧙ቁ㫠鎴㨂匡㫁厯㫨别㧆鋈▽Ꭿ⌼ᎌ㫪匒㩙펳㧜펂㤢匘㯩剀㤌厂⎮ጿ㯍厝㫤퉒㪆匬⒵Ꮋ㪄ᎂ╮ዂ␙\u139d㫜퉚㥆ጥ㮱\u139d㫈ቐ㭶匬㤽鎞◰퉒\u245aጹ㦅Ꮋ㨨剕⎊팼⒅厪㥘鎲㫮区⒥厥⌔鈩㭂ዝ㥁Ꮊ㪀鎻㭪匭▹Ꮀ㮀펋㨚錛▵鎧㤘鎶㨆鋏⍍厔㯈ራ㭮錖㥍Ꮋ㥤鉒Ⓨ\u0011现휰爊鞐燭圧珀霡糞ᝍ牅\u173c粄埔熶靌籑"
         .length();
      int var17 = 0;
      short var18 = 14559;
      String[] var10002 = new String[2];
      int var16 = 0;
      String[] var15 = var10002;
      int var14 = var10001;
      String var13 = "\u0093⑤鉟㫮\u12c7㪭펜㧘ᎏ␊틁㯁鎸㯄ᎈ㯪劷\u244d厔㩔Ꭽ㧊팒㤝퉃␔厇㧶ጣ⒑Ꮋ㨴鎣㥚팸㦝前㮔펁㫦匭㧙ቁ㫠鎴㨂匡㫁厯㫨别㧆鋈▽Ꭿ⌼ᎌ㫪匒㩙펳㧜펂㤢匘㯩剀㤌厂⎮ጿ㯍厝㫤퉒㪆匬⒵Ꮋ㪄ᎂ╮ዂ␙\u139d㫜퉚㥆ጥ㮱\u139d㫈ቐ㭶匬㤽鎞◰퉒\u245aጹ㦅Ꮋ㨨剕⎊팼⒅厪㥘鎲㫮区⒥厥⌔鈩㭂ዝ㥁Ꮊ㪀鎻㭪匭▹Ꮀ㮀펋㨚錛▵鎧㤘鎶㨆鋏⍍厔㯈ራ㭮錖㥍Ꮋ㥤鉒Ⓨ\u0011现휰爊鞐燭圧珀霡糞ᝍ牅\u173c粄埔熶靌籑";

      do {
         char var19 = var13.charAt(var17);
         int var21 = 0;
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 6) {
               default -> 237;
               case 1 -> 21;
               case 2 -> 119;
               case 3 -> 141;
               case 4 -> 184;
               case 5 -> 11;
            }) ^ var22;
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 2 | var22 << 14) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 2 | var22 >>> 14) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      IIlI = var15;
      IIll = new Object[var15.length];
      int var9 = -1996088087;
      byte[] var7 = "\u0013\u007f-\u0087\u008ft@v\u008eúáÀ\bÅ! Jú@¦ùîî¬\u000f\u0019Êp\u00956°\u0012iz\u001b'\u0003Nt't5äYøQ}F²:\u009dð_;:\u009eÉ\u008c\nq\u0083é.ÀPN&\u007fRF7\u001fÀY·¤È\u009fWs\u009eòÛ\u0082Ä6j\u0006:Û-j¸S>\u0087\u0013êÛ);Ò\u0099\u008eµ \n\u0092\u001b\\½ö&¡8=Í\u0003Â\u009bCÓbbÔ¶¤õÓ´ß\u008d2Ðy¡Â¶8¨¯ñv\u0096å\u00957 ÞYo\u0093?c\u008b\u008a~ZÌÎ`õ5¬  a7Þ\u0096w\u0084D\u0084°]\r\u0092$>4ô#ÐÐk½c\rìZ\u0017æ\u0018Õ\u009ffs\u001f ä'éÍ\u009b[Çq~a¶·^æ\u00833\f\u0081·MôºB|¬Ös±'\u0093\u0094wL\u0005µ°\u0090EÙg\rÝ\u0004z\u009c\u008e\u0094\u0091\u0099Þ\u0000i\u009a·TÇ\u00974K¡\\\u0007öo\u0083`\u008bë\u009dèÜî|çêT\u0092Ç\u001fÀB}(¸Q\u0095}=\u008dA$EµîÂu®\u0097\u0012\u008d/\t7\u008b\u000b\u0002\u001bDAj0¦1¨\u0015_£dÀnõ\u0006Q²Ùñ\u008eë^1\u0089\u009bbjéÅî1\u0087z\fVÍLùæ\u000b\u0014½wJüñ\u0002\u009abwT\u0087;øÏ\u00ad\bË¨Z:\u0018\u0096/i\u0005Â-å]éGÒ\n)\u0098\u0090*py\u0013HvÿÔ\u0003{ÍX\u0098©\u008f×YÏø\u0082S\u0000lè\u0083·Ú³C^lÁo \"\u0090\u0019÷.íË¦D\u00141°\u008e\nXÛ\nÉ´á)ó\b}\u001f\u0000\u0081.w¢W\u0098?êªMÄ×Ú\u008fê8\u0016%EQÝ\u008d(}U\u000e\u0003õ\u008b4d=½ G\t\u0003¡\u0090yP\u0010=\rÁ\u0016!f½}V+S\u0088ÒûùèNýF±\u0000\u009e:\u0096dzÚAÉ\u0098\u007f\u009bPf\u0010ÉÏ¨Ó\u000e\nì\u0017ë\b\u0011ÃiO:=Ôü\u0087*Ä¨Ø\u0089PL\u0010pü,¬à+\u009dünñ¼\rÌ¨¬¾y\u000e.|:\u000bQÂG/N(\u001cRÝj=1ðjë\u009c¥\u008e\u000f2ñ4°8NCN\u0007\u00802Ìõ\u0084'$¾ îWKÀ)vïÃ\u00ad|\u009fxU\nðr\u001dÑe¤²ã\u0019\u009b\u0004²êÃ\\\"G£\u0018~\u0088Ã|¤õI\u009e9pSc×\u009bhÊþì\u0003\u007fü°)}\u008f·é§;\u000eè\u0092A\u009cIw \u0003hQcí\u001fÊm®ì»sëüõÖ\u0088ÞÝ³GüçîÊÅ\u0000\u00025£÷Ú\u007f¦¡~\u000eý\u001bòì¢\u009cj\u008ax!\r8î#7ñ\u0099¹w\u009eh\nð¸ËLØ\u0086|KÑXúñ\u007f÷@\u0016Ä\u0011\u0006ó\u009dQ(q\t+£ß\u008a:^3÷¡\u009aK\u000fÛj¬ ±d\u000e%\u001b\u0014T#i©\u0004\u0004q¹çó¥\u0007»(:ü·©ÄOÏ4\u0088ÊÅkÃ¶âE¡\u001d\t¢D0þÙ¥¶ÅY\u0097ñ;ÄTÂ\u009b\u001d¾\u0013 ùk\u0011\u007f\u001a\u0011ø+\u0081ìÚ§.Ä3\b¸\u0095\n\t:G¤ãâÄ£-ÀP\u0016ïxâ\\ÞÈi]ùî4^\u008d7 |^ÝÓ\u001d}dÍË²ÐY%ÙÒéµÔ~\u009b}ÑPfÝß·×G\u00821Ì¶±0\u0080\u0092ñ\u0019Dâgt¢Ø\u001bd¥+Ý\u0097³à~\u0093}\u0017u{_Þ¬YôCP\u008bcîü¨áË_É×5ú9Ü\u001bô\u001b\u0098XÜ×©)DPð¼PÆ\u00072\u000b\u0087yl\u001e\u0005:7ð\u001b!I\u00146{V\u009bó»\u0006+Mt\u0017\u0014áe\u0082 \u0019K2;!×\u008c\u001dc\u001bÝ\u009f\u0086lY\u0006\u0004Ü\u001cßxW¯óÞb\u008bÆ>E9ÜØàã\u007f\fp®\u0085$m+tÉü·¡\u0095¤ÕÂ\u007f2_©B÷.c©k Í\u001f´F³.ªIÏd´\u0098:\u009c[\u0018{ñ\u0019:ÔB\fló3\u0081¶q»Ç}\u008ad6õ\ftQ¨HþR\u0081¯.Ï\u0086\u0080\u000bC¶b\u0097[pR\u000e©#\u0097¡í|Î.ì=¦\u0006\u0013\u000e kÍ\u0090I\u0005îèe\u0000\u008a\u0011³ûek\u0018\u0085£\u0013â¡Ãé0j¬p·&-4B#þ\u009b25Y\u0082þ°ØÎ\u001fË%$/Ðâ\u0002\u001eÁeYv^\u0011´ä]ü±»\u0017ÏìëxÖ7¡æA\u0003¬"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      IIIl = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         IIIl[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var5 = new String[lIl(-335271325, var23 ^ 522684527)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = llI(var23 ^ -82871195, '薞', (short)'뛐')).length();
      int var1 = 4;
      int var25 = -1;

      label99:
      while (true) {
         int var28 = lIl(-335271324, var23 ^ -733474391);
         String var30 = var2.substring(++var25, var25 + var1);
         byte var37 = -1;

         while (true) {
            label94: {
               char[] var46 = var30.toCharArray();
               int var10004 = var46.length;
               int var6 = 0;
               int var49 = var28;
               var42 = var46;
               var10001 = var10004;
               char[] var58;
               int var10006;
               if (var10004 <= 1) {
                  var58 = var46;
                  var10004 = var28;
                  var10006 = var6;
               } else {
                  var49 = var28;
                  var10001 = var10004;
                  if (var10004 <= var6) {
                     break label94;
                  }

                  var58 = var46;
                  var10004 = var28;
                  var10006 = var6;
               }

               while (true) {
                  var58[var10006] = (char)(var58[var10006] ^ var10004 ^ switch (var6 % lIl(-335271320, var23 ^ 238858048)) {
                     case 0 -> lIl(-335271319, var23 ^ 1975600399);
                     case 1 -> lIl(-335271318, var23 ^ 1845912334);
                     case 2 -> 2;
                     case 3 -> lIl(-335271317, var23 ^ 2139175060);
                     case 4 -> lIl(-335271316, var23 ^ -520759850);
                     case 5 -> lIl(-335271315, var23 ^ -484912961);
                     default -> lIl(-335271314, var23 ^ -1456763449);
                  });
                  var6++;
                  if (var49 == 0) {
                     var10006 = var49;
                     var58 = var42;
                     var10004 = var49;
                  } else {
                     if (var10001 <= var6) {
                        break;
                     }

                     var58 = var42;
                     var10004 = var49;
                     var10006 = var6;
                  }
               }
            }

            String var51 = new String(var42).intern();
            switch (var37) {
               case 0:
                  var5[var3++] = var51;
                  if ((var25 += var1) >= var4) {
                     IlI = var5;
                     II = new String[lIl(-335271321, var23 ^ -1950489691)];
                     Il = IIIllIIl.II;
                     return;
                  }

                  var1 = var2.charAt(var25);
                  break;
               default:
                  var5[var3++] = var51;
                  if ((var25 += var1) < var4) {
                     var1 = var2.charAt(var25);
                     continue label99;
                  }

                  var4 = (var2 = llI(var23 ^ -1760662367, '薟', (short)'쐄')).length();
                  var1 = lIl(-335271323, var23 ^ -1731635951);
                  var25 = -1;
            }

            var28 = lIl(-335271322, var23 ^ -1659176392);
            var30 = var2.substring(++var25, var25 + var1);
            var37 = 0;
         }
      }
   }

   @Override
   public void IIlIl() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: invokestatic k74/x/IIllllIl.IIIIl ()[Ljava/lang/String;
      // 03: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 06: astore 2
      // 07: astore 1
      // 08: aload 2
      // 09: ifnull 28
      // 0c: aload 2
      // 0d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 10: ifnull 28
      // 13: goto 1a
      // 16: invokestatic k74/x/lIIlIIII.I (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 19: athrow
      // 1a: aload 2
      // 1b: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 1e: ifnonnull 34
      // 21: goto 28
      // 24: invokestatic k74/x/lIIlIIII.I (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 27: athrow
      // 28: aload 0
      // 29: invokestatic java/util/List.of ()Ljava/util/List;
      // 2c: putfield k74/x/lIIlIIII.IIII Ljava/util/List;
      // 2f: return
      // 30: invokestatic k74/x/lIIlIIII.I (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 33: athrow
      // 34: aload 2
      // 35: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 38: invokevirtual net/minecraft/class_746.method_23317 ()D
      // 3b: dstore 3
      // 3c: aload 2
      // 3d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 40: invokevirtual net/minecraft/class_746.method_23321 ()D
      // 43: dstore 5
      // 45: new java/util/ArrayList
      // 48: dup
      // 49: invokespecial java/util/ArrayList.<init> ()V
      // 4c: astore 7
      // 4e: aload 2
      // 4f: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 52: invokevirtual net/minecraft/class_638.method_18112 ()Ljava/lang/Iterable;
      // 55: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 5a: astore 8
      // 5c: aload 8
      // 5e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 63: ifeq dd
      // 66: aload 8
      // 68: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 6d: checkcast net/minecraft/class_1297
      // 70: astore 9
      // 72: aload 9
      // 74: instanceof net/minecraft/class_1309
      // 77: ifeq 8b
      // 7a: aload 9
      // 7c: checkcast net/minecraft/class_1309
      // 7f: astore 10
      // 81: aload 0
      // 82: aload 2
      // 83: aload 10
      // 85: invokevirtual k74/x/lIIlIIII.II (Lnet/minecraft/class_310;Lnet/minecraft/class_1309;)Z
      // 88: ifne 8e
      // 8b: goto 5c
      // 8e: aload 10
      // 90: invokevirtual net/minecraft/class_1309.method_23317 ()D
      // 93: dload 3
      // 94: dsub
      // 95: dstore 11
      // 97: aload 10
      // 99: invokevirtual net/minecraft/class_1309.method_23321 ()D
      // 9c: dload 5
      // 9e: dsub
      // 9f: dstore 13
      // a1: dload 11
      // a3: invokestatic java/lang/Double.isFinite (D)Z
      // a6: ifeq b8
      // a9: dload 13
      // ab: invokestatic java/lang/Double.isFinite (D)Z
      // ae: ifne bc
      // b1: goto b8
      // b4: invokestatic k74/x/lIIlIIII.I (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // b7: athrow
      // b8: aload 1
      // b9: ifnull 5c
      // bc: aload 7
      // be: new k74/x/IlllIlll
      // c1: dup
      // c2: dload 11
      // c4: dload 13
      // c6: aload 10
      // c8: instanceof net/minecraft/class_1657
      // cb: invokespecial k74/x/IlllIlll.<init> (DDZ)V
      // ce: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // d3: pop
      // d4: goto d9
      // d7: astore 10
      // d9: aload 1
      // da: ifnull 5c
      // dd: aload 0
      // de: aload 7
      // e0: invokestatic java/util/List.copyOf (Ljava/util/Collection;)Ljava/util/List;
      // e3: putfield k74/x/lIIlIIII.IIII Ljava/util/List;
      // e6: goto f2
      // e9: astore 8
      // eb: aload 0
      // ec: invokestatic java/util/List.of ()Ljava/util/List;
      // ef: putfield k74/x/lIIlIIII.IIII Ljava/util/List;
      // f2: return
   }

   private static int lIl(int var0, int var1) {
      int var2 = IIIl[var0 ^ -335271104] ^ var1 ^ var0;
      var2 -= 22856;
      var2 += 12451;
      var2 += 25434;
      var2 += 36034;
      var2 += 18519;
      return var2 + 30227;
   }

   private void III(class_332 var1, double var2) {
      double var4 = 0.0;
      double var6 = 0.0;
      double var10 = var4 + var2 * 0.5;
      double var12 = var6 + var2 * 0.5;
      int var14 = IIIlIllII.lll();
      IlIIlllIl.IlIIIl(var1, var4 + 5.0, var12, var4 + var2 - 5.0, var12, 1.0, var14);
      IlIIlllIl.IlIIIl(var1, var10, var6 + 5.0, var10, var6 + var2 - 5.0, 1.0, var14);
   }

   @Override
   public void Illl(class_332 var1, int var2, int var3, float var4, boolean var5) {
      this.l(var1, var5, var4);
   }

   private static String IIl(int var0, int var1) {
      int var9 = 381561966;
      int var2 = (var0 ^ lIl(-335271071, var9 ^ -1097682093)) & lIl(-335271070, var9 ^ 1324702035);
      if (II[var2] == null) {
         char[] var3 = IlI[var2].toCharArray();

         int var4 = switch (var3[0] & lIl(-335271069, var9 ^ 598939244)) {
            case 0 -> lIl(-335271068, var9 ^ 1775719952);
            case 1 -> lIl(-335271067, var9 ^ 1377505023);
            case 2 -> lIl(-335271066, var9 ^ -1289622814);
            case 3 -> lIl(-335271065, var9 ^ -233263651);
            case 4 -> lIl(-335271064, var9 ^ -323529535);
            case 5 -> lIl(-335271063, var9 ^ 753008756);
            case 6 -> lIl(-335271062, var9 ^ 1389631161);
            case 7 -> lIl(-335271061, var9 ^ -926494371);
            case 8 -> lIl(-335271060, var9 ^ -2117057142);
            case 9 -> lIl(-335271059, var9 ^ -1196014956);
            case 10 -> lIl(-335271058, var9 ^ 1546247200);
            case 11 -> lIl(-335271057, var9 ^ -2119287961);
            case 12 -> lIl(-335271056, var9 ^ 1784329220);
            case 13 -> lIl(-335271055, var9 ^ -365855054);
            case 14 -> lIl(-335271054, var9 ^ 1751484586);
            case 15 -> lIl(-335271053, var9 ^ 387556883);
            case 16 -> lIl(-335271052, var9 ^ -232532044);
            case 17 -> lIl(-335271051, var9 ^ -760946172);
            case 18 -> lIl(-335271050, var9 ^ -2134649110);
            case 19 -> lIl(-335271049, var9 ^ 2029527974);
            case 20 -> lIl(-335271048, var9 ^ 546575199);
            case 21 -> lIl(-335271047, var9 ^ -1412303418);
            case 22 -> lIl(-335271046, var9 ^ -1069034439);
            case 23 -> lIl(-335271045, var9 ^ 470268289);
            case 24 -> lIl(-335271044, var9 ^ -2120260118);
            case 25 -> lIl(-335271043, var9 ^ 281867363);
            case 26 -> lIl(-335271042, var9 ^ 362570018);
            case 27 -> lIl(-335271041, var9 ^ 385168722);
            case 28 -> lIl(-335271168, var9 ^ 460728990);
            case 29 -> lIl(-335271167, var9 ^ -800745666);
            case 30 -> lIl(-335271166, var9 ^ 253946462);
            case 31 -> lIl(-335271165, var9 ^ 296402377);
            case 32 -> lIl(-335271164, var9 ^ -257586183);
            case 33 -> lIl(-335271163, var9 ^ 512065131);
            case 34 -> lIl(-335271162, var9 ^ -834713231);
            case 35 -> lIl(-335271161, var9 ^ -573105083);
            case 36 -> lIl(-335271160, var9 ^ 16991629);
            case 37 -> lIl(-335271159, var9 ^ 967615418);
            case 38 -> lIl(-335271158, var9 ^ 584414207);
            case 39 -> lIl(-335271157, var9 ^ -1555343775);
            case 40 -> lIl(-335271156, var9 ^ -2025817560);
            case 41 -> lIl(-335271155, var9 ^ -852996063);
            case 42 -> 1;
            case 43 -> lIl(-335271154, var9 ^ -1108708102);
            case 44 -> lIl(-335271153, var9 ^ 791060787);
            case 45 -> lIl(-335271152, var9 ^ 2034511943);
            case 46 -> lIl(-335271151, var9 ^ 1437855619);
            case 47 -> lIl(-335271150, var9 ^ -764155684);
            case 48 -> lIl(-335271149, var9 ^ -299333417);
            case 49 -> lIl(-335271148, var9 ^ 1651762823);
            case 50 -> lIl(-335271147, var9 ^ -2146128805);
            case 51 -> lIl(-335271146, var9 ^ 1973709527);
            case 52 -> lIl(-335271145, var9 ^ 825567850);
            case 53 -> lIl(-335271144, var9 ^ 2101410637);
            case 54 -> lIl(-335271143, var9 ^ -82385292);
            case 55 -> lIl(-335271142, var9 ^ 1955450060);
            case 56 -> lIl(-335271141, var9 ^ 1206533111);
            case 57 -> lIl(-335271140, var9 ^ -1798025221);
            case 58 -> lIl(-335271139, var9 ^ -1988080426);
            case 59 -> lIl(-335271138, var9 ^ -777312421);
            case 60 -> lIl(-335271137, var9 ^ -2039744164);
            case 61 -> lIl(-335271136, var9 ^ -1506666050);
            case 62 -> lIl(-335271135, var9 ^ -1003184279);
            case 63 -> lIl(-335271134, var9 ^ -1892045700);
            case 64 -> lIl(-335271133, var9 ^ 351006380);
            case 65 -> lIl(-335271132, var9 ^ -712140422);
            case 66 -> lIl(-335271131, var9 ^ -549319299);
            case 67 -> lIl(-335271130, var9 ^ 267762542);
            case 68 -> lIl(-335271129, var9 ^ -820245083);
            case 69 -> lIl(-335271128, var9 ^ -480099451);
            case 70 -> lIl(-335271127, var9 ^ -1783279818);
            case 71 -> lIl(-335271126, var9 ^ 1206134266);
            case 72 -> lIl(-335271125, var9 ^ -1108152425);
            case 73 -> lIl(-335271124, var9 ^ -728143013);
            case 74 -> lIl(-335271123, var9 ^ 950225240);
            case 75 -> lIl(-335271122, var9 ^ -2076213665);
            case 76 -> lIl(-335271121, var9 ^ 225187536);
            case 77 -> lIl(-335271120, var9 ^ -606446070);
            case 78 -> lIl(-335271119, var9 ^ 638559356);
            case 79 -> lIl(-335271118, var9 ^ 1456311147);
            case 80 -> lIl(-335271117, var9 ^ -1704516439);
            case 81 -> 0;
            case 82 -> lIl(-335271116, var9 ^ 1372539247);
            case 83 -> lIl(-335271115, var9 ^ -649305376);
            case 84 -> lIl(-335271114, var9 ^ 125175210);
            case 85 -> lIl(-335271113, var9 ^ 828515884);
            case 86 -> lIl(-335271112, var9 ^ -1880886925);
            case 87 -> lIl(-335271111, var9 ^ -598582183);
            case 88 -> lIl(-335271110, var9 ^ 1297367069);
            case 89 -> lIl(-335271109, var9 ^ 826226444);
            case 90 -> lIl(-335271108, var9 ^ -540364030);
            case 91 -> lIl(-335271107, var9 ^ 1974087563);
            case 92 -> lIl(-335271106, var9 ^ -890019453);
            case 93 -> lIl(-335271105, var9 ^ -1227618824);
            case 94 -> lIl(-335270976, var9 ^ 1443080272);
            case 95 -> lIl(-335270975, var9 ^ -203869842);
            case 96 -> lIl(-335270974, var9 ^ -1668567518);
            case 97 -> lIl(-335270973, var9 ^ 1598843893);
            case 98 -> lIl(-335270972, var9 ^ -1683396327);
            case 99 -> lIl(-335270971, var9 ^ 1328230033);
            case 100 -> lIl(-335270970, var9 ^ -1315529344);
            case 101 -> lIl(-335270969, var9 ^ -1501115969);
            case 102 -> lIl(-335270968, var9 ^ 85077406);
            case 103 -> lIl(-335270967, var9 ^ -54637339);
            case 104 -> lIl(-335270966, var9 ^ 1818885329);
            case 105 -> lIl(-335270965, var9 ^ -491529131);
            case 106 -> lIl(-335270964, var9 ^ 1089129931);
            case 107 -> lIl(-335270963, var9 ^ -179548222);
            case 108 -> lIl(-335270962, var9 ^ -1236717498);
            case 109 -> lIl(-335270961, var9 ^ -882036987);
            case 110 -> lIl(-335270960, var9 ^ -1877951299);
            case 111 -> lIl(-335270959, var9 ^ -1317826057);
            case 112 -> lIl(-335270958, var9 ^ 1742652647);
            case 113 -> lIl(-335270957, var9 ^ -2089775095);
            case 114 -> lIl(-335270956, var9 ^ 1014640147);
            case 115 -> lIl(-335270955, var9 ^ -1035607624);
            case 116 -> lIl(-335270954, var9 ^ 1085793571);
            case 117 -> lIl(-335270953, var9 ^ -1459830433);
            case 118 -> lIl(-335270952, var9 ^ -620126094);
            case 119 -> lIl(-335270951, var9 ^ -89284094);
            case 120 -> lIl(-335270950, var9 ^ -253945523);
            case 121 -> lIl(-335270949, var9 ^ -2035150257);
            case 122 -> lIl(-335270948, var9 ^ 1562887543);
            case 123 -> lIl(-335270947, var9 ^ 1868298916);
            case 124 -> lIl(-335270946, var9 ^ 1051239161);
            case 125 -> lIl(-335270945, var9 ^ -1375354166);
            case 126 -> lIl(-335270944, var9 ^ -221601100);
            case 127 -> lIl(-335270943, var9 ^ 683092132);
            case 128 -> lIl(-335270942, var9 ^ -1255001404);
            case 129 -> lIl(-335270941, var9 ^ 1540950481);
            case 130 -> 2;
            case 131 -> lIl(-335270940, var9 ^ 1924031064);
            case 132 -> lIl(-335270939, var9 ^ 1894926497);
            case 133 -> lIl(-335270938, var9 ^ 66423028);
            case 134 -> lIl(-335270937, var9 ^ -1219720810);
            case 135 -> lIl(-335270936, var9 ^ -841078740);
            case 136 -> lIl(-335270935, var9 ^ -1405023920);
            case 137 -> lIl(-335270934, var9 ^ -273711584);
            case 138 -> lIl(-335270933, var9 ^ -504591074);
            case 139 -> lIl(-335270932, var9 ^ -5661267);
            case 140 -> lIl(-335270931, var9 ^ 1523236695);
            case 141 -> 5;
            case 142 -> lIl(-335270930, var9 ^ 1057332518);
            case 143 -> lIl(-335270929, var9 ^ 1653122117);
            case 144 -> lIl(-335270928, var9 ^ -1904754083);
            case 145 -> 4;
            case 146 -> lIl(-335270927, var9 ^ 1446889374);
            case 147 -> lIl(-335270926, var9 ^ -229860317);
            case 148 -> lIl(-335270925, var9 ^ 2125382578);
            case 149 -> lIl(-335270924, var9 ^ -423094183);
            case 150 -> lIl(-335270923, var9 ^ -2122674268);
            case 151 -> lIl(-335270922, var9 ^ -1145833464);
            case 152 -> lIl(-335270921, var9 ^ -69465798);
            case 153 -> lIl(-335270920, var9 ^ 2096802596);
            case 154 -> lIl(-335270919, var9 ^ 1422138653);
            case 155 -> lIl(-335270918, var9 ^ 1562024594);
            case 156 -> lIl(-335270917, var9 ^ -206233135);
            case 157 -> lIl(-335270916, var9 ^ 1213425616);
            case 158 -> lIl(-335270915, var9 ^ 286476765);
            case 159 -> lIl(-335270914, var9 ^ -2056666606);
            case 160 -> lIl(-335270913, var9 ^ 108543929);
            case 161 -> lIl(-335271040, var9 ^ 2078538729);
            case 162 -> lIl(-335271039, var9 ^ -2087122170);
            case 163 -> lIl(-335271038, var9 ^ -1393359565);
            case 164 -> lIl(-335271037, var9 ^ -1453755136);
            case 165 -> lIl(-335271036, var9 ^ -1356085087);
            case 166 -> lIl(-335271035, var9 ^ -2009867780);
            case 167 -> 3;
            case 168 -> lIl(-335271034, var9 ^ 2145871460);
            case 169 -> lIl(-335271033, var9 ^ -1535599153);
            case 170 -> lIl(-335271032, var9 ^ 629550676);
            case 171 -> lIl(-335271031, var9 ^ -1194677466);
            case 172 -> lIl(-335271030, var9 ^ -410921006);
            case 173 -> lIl(-335271029, var9 ^ -907838348);
            case 174 -> lIl(-335271028, var9 ^ 772165910);
            case 175 -> lIl(-335271027, var9 ^ 1441257292);
            case 176 -> lIl(-335271026, var9 ^ -707424113);
            case 177 -> lIl(-335271025, var9 ^ 1209443084);
            case 178 -> lIl(-335271024, var9 ^ -1845726662);
            case 179 -> lIl(-335271023, var9 ^ 1965650078);
            case 180 -> lIl(-335271022, var9 ^ -1772906154);
            case 181 -> lIl(-335271021, var9 ^ 229554990);
            case 182 -> lIl(-335271020, var9 ^ -1568255244);
            case 183 -> lIl(-335271019, var9 ^ 886532628);
            case 184 -> lIl(-335271018, var9 ^ -1241135671);
            case 185 -> lIl(-335271017, var9 ^ 1854325390);
            case 186 -> lIl(-335271016, var9 ^ 1276278634);
            case 187 -> lIl(-335271015, var9 ^ -190825144);
            case 188 -> lIl(-335271014, var9 ^ 1143684254);
            case 189 -> lIl(-335271013, var9 ^ 1651916590);
            case 190 -> lIl(-335271012, var9 ^ -1142809095);
            case 191 -> lIl(-335271011, var9 ^ 1368489196);
            case 192 -> lIl(-335271010, var9 ^ -393237958);
            case 193 -> lIl(-335271009, var9 ^ 1545290761);
            case 194 -> lIl(-335271008, var9 ^ 1588319315);
            case 195 -> lIl(-335271007, var9 ^ -220652444);
            case 196 -> lIl(-335271006, var9 ^ -601572211);
            case 197 -> lIl(-335271005, var9 ^ 999630414);
            case 198 -> lIl(-335271004, var9 ^ -1114712077);
            case 199 -> lIl(-335271003, var9 ^ -1128074398);
            case 200 -> lIl(-335271002, var9 ^ -1794735522);
            case 201 -> lIl(-335271001, var9 ^ -119490238);
            case 202 -> lIl(-335271000, var9 ^ -387495344);
            case 203 -> lIl(-335270999, var9 ^ 468812090);
            case 204 -> lIl(-335270998, var9 ^ 524252678);
            case 205 -> lIl(-335270997, var9 ^ -149045479);
            case 206 -> lIl(-335270996, var9 ^ -709483844);
            case 207 -> lIl(-335270995, var9 ^ 119639972);
            case 208 -> lIl(-335270994, var9 ^ 614706021);
            case 209 -> lIl(-335270993, var9 ^ 1167414727);
            case 210 -> lIl(-335270992, var9 ^ -1247904826);
            case 211 -> lIl(-335270991, var9 ^ -1747306017);
            case 212 -> lIl(-335270990, var9 ^ 1542146195);
            case 213 -> lIl(-335270989, var9 ^ -592257544);
            case 214 -> lIl(-335270988, var9 ^ 1246057430);
            case 215 -> lIl(-335270987, var9 ^ 188419558);
            case 216 -> lIl(-335270986, var9 ^ -1988601919);
            case 217 -> lIl(-335270985, var9 ^ -1755109159);
            case 218 -> lIl(-335270984, var9 ^ -1170655566);
            case 219 -> lIl(-335270983, var9 ^ 2147051468);
            case 220 -> lIl(-335270982, var9 ^ -1053395225);
            case 221 -> lIl(-335270981, var9 ^ 1831330811);
            case 222 -> lIl(-335270980, var9 ^ -1794550977);
            case 223 -> lIl(-335270979, var9 ^ -1382683188);
            case 224 -> lIl(-335270978, var9 ^ -279331632);
            case 225 -> lIl(-335270977, var9 ^ 170801179);
            case 226 -> lIl(-335271360, var9 ^ -2002879381);
            case 227 -> lIl(-335271359, var9 ^ -199897545);
            case 228 -> lIl(-335271358, var9 ^ 1377889204);
            case 229 -> lIl(-335271357, var9 ^ -1308141087);
            case 230 -> lIl(-335271356, var9 ^ 1419936639);
            case 231 -> lIl(-335271355, var9 ^ -2144153771);
            case 232 -> lIl(-335271354, var9 ^ -1473295536);
            case 233 -> lIl(-335271353, var9 ^ 1170135021);
            case 234 -> lIl(-335271352, var9 ^ 434550075);
            case 235 -> lIl(-335271351, var9 ^ -210747603);
            case 236 -> lIl(-335271350, var9 ^ -826978811);
            case 237 -> lIl(-335271349, var9 ^ 623460637);
            case 238 -> lIl(-335271348, var9 ^ -1812584767);
            case 239 -> lIl(-335271347, var9 ^ -1561843703);
            case 240 -> lIl(-335271346, var9 ^ -386467771);
            case 241 -> lIl(-335271345, var9 ^ 270104631);
            case 242 -> lIl(-335271344, var9 ^ 2103138912);
            case 243 -> lIl(-335271343, var9 ^ -833745671);
            case 244 -> lIl(-335271342, var9 ^ -1077684684);
            case 245 -> lIl(-335271341, var9 ^ 931470793);
            case 246 -> lIl(-335271340, var9 ^ -395012702);
            case 247 -> lIl(-335271339, var9 ^ -132921266);
            case 248 -> lIl(-335271338, var9 ^ 1913708885);
            case 249 -> lIl(-335271337, var9 ^ -1567758709);
            case 250 -> lIl(-335271336, var9 ^ -2029922618);
            case 251 -> lIl(-335271335, var9 ^ 454627570);
            case 252 -> lIl(-335271334, var9 ^ -2098511079);
            case 253 -> lIl(-335271333, var9 ^ 766450921);
            case 254 -> lIl(-335271332, var9 ^ -1565631150);
            default -> lIl(-335271331, var9 ^ -1974374902);
         };
         int var5 = (var1 & lIl(-335271330, var9 ^ -409996914)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & lIl(-335271329, var9 ^ -1985115997)) >>> lIl(-335271328, var9 ^ -1933020813)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & lIl(-335271327, var9 ^ 1999047392);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & lIl(-335271326, var9 ^ 165769753);
            }
         }

         II[var2] = new String(var3).intern();
      }

      return II[var2];
   }

   @Override
   public void IIIII(class_332 var1, int var2, int var3, float var4) {
      this.l(var1, false, var4);
   }

   private int Ill(class_332 var1, class_310 var2, double var3, float var5) {
      double var7 = 0.0;
      double var9 = 0.0;
      double var13 = var7 + var3 * 0.5;
      double var15 = var9 + var3 * 0.5;
      String[] var10000 = IIllllIl.IIIIl();
      double var17 = var3 * 0.5 - 5.0;
      double var19 = Math.max(1.0, this.III.IllI());
      String[] var6 = var10000;
      double var21 = Math.toRadians(var2.field_1724.method_36454());
      double var23 = Math.sin(var21);
      double var25 = Math.cos(var21);
      int var27 = 0;

      for (IlllIlll var29 : this.IIII) {
         double var30 = var29.I();
         double var32 = var29.l();
         double var34 = Math.hypot(var30, var32);
         if (Double.isFinite(var34)) {
            try {
               if (var34 > var19 && var6 == null) {
                  continue;
               }
            } catch (RuntimeException var49) {
               throw I(var49);
            }

            double var36 = -(var30 * var25 + var32 * var23);
            double var38 = -var30 * var23 + var32 * var25;
            double var40 = var36 / var19 * var17;
            double var42 = -var38 / var19 * var17;
            var40 = class_3532.method_15350(var40, -var17, var17);
            var42 = class_3532.method_15350(var42, -var17, var17);

            label46: {
               try {
                  if (var29.II()) {
                     var52 = IIIlIllII.ll(IIIlIllII.l(), lIl(-335271313, 778620956 ^ -868046282));
                     break label46;
                  }
               } catch (RuntimeException var48) {
                  throw I(var48);
               }

               var52 = IIIlllII.l(this.Il().getRGB(), lIl(-335271312, 778620956 ^ 1389731798));
            }

            int var44 = var52;

            label38: {
               try {
                  if (var29.II()) {
                     var53 = 3.2;
                     break label38;
                  }
               } catch (RuntimeException var47) {
                  throw I(var47);
               }

               var53 = 2.6;
            }

            double var45 = var53;
            IlIIlllIl.llIl(var1, var13 + var40 - var45 * 0.5, var15 + var42 - var45 * 0.5, var45, var45, 1.2, var44);
            var27++;
            if (var6 != null) {
               break;
            }
         }
      }

      return var27;
   }

   private double lII() {
      return this.lII.IllI() / 100.0;
   }
}
