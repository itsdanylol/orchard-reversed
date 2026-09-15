package k74.x;

import java.lang.ref.WeakReference;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Environment(EnvType.CLIENT)
public final class llllIlII {
   private static volatile WeakReference<IllIlIII> I;
   private static final Logger II;
   private static final IIIlIlIl Il;
   private static final String[] lI;
   private static final IIIlIlIl ll;
   private static final String[] IIII;
   private static final String[] III;
   private static final IIIlIlIl l;
   private static final IIIlIlIl IIl;
   private static final IIIlIlIl IlI;
   private static final float Ill = 6.0F;
   private static final Object[] IIIl;
   private static final float lII = 8.0F;
   private static final int[] lll;
   private static final IIIlIlIl lIl;
   private static final IIIlIlIl llI;

   static void I() {
      synchronized (llllIlII.class) {
         I.clear();
         I = new WeakReference<>(null);
      }
   }

   private static String Illl(int var0, int var1, char var2) {
      int var3 = var0 ^ 15935;
      char[] var4 = IIII[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])IIIl[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         IIIl[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 10946;
      int var9 = 0;

      do {
         int var10 = var4[var9] - '袵';
         var10 += 59623;
         var10 += 45443;
         var10 += 8709;
         var10 += 60709;
         var10 -= 10473;
         var10 -= 54382;
         var10 ^= 10295;
         var10 -= 41436;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var1 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static int IllI(int var0, int var1) {
      int var2 = lll[var0 ^ 729282906] ^ var1 ^ var0;
      var2 ^= 15093;
      var2 -= 18468;
      var2 += 39762;
      var2 ^= 15346;
      var2 -= 5239;
      var2 += 55228;
      return var2 + 56483;
   }

   private static String l(String var0) {
      int var10 = -1624153737;
      String var1 = var0.replace((char)IllI(729282881, var10 ^ -860934992), (char)IllI(729282886, var10 ^ -344993310));
      int var2 = var1.indexOf(IllI(729282887, var10 ^ -471838205));
      String var3 = var2 >= 0 ? var1.substring(0, var2) : "";
      String var4 = var2 >= 0 ? var1.substring(var2 + 1) : var1;
      String var5;
      if (var3.isEmpty()) {
         var5 = "";
      } else if (lIl.IlI(var3)) {
         var5 = Il.llIl();
      } else if (llI.IlI(var3)) {
         var5 = ll.llIl();
      } else {
         var5 = IlII(var3.replace((char)IllI(729282884, var10 ^ -680802855), (char)IllI(729282885, var10 ^ -1543607545)));
      }

      String var6 = IlII(
         var4.replace((char)IllI(729282938, var10 ^ 1702051004), (char)IllI(729282939, var10 ^ -222342725))
            .replace((char)IllI(729282936, var10 ^ 1512216137), (char)IllI(729282937, var10 ^ -1988934876))
            .replace((char)IllI(729282942, var10 ^ -118990250), (char)IllI(729282943, var10 ^ -1579091828))
      );
      if (var6.isBlank()) {
         return var5;
      } else if (var5.isBlank()) {
         return var6;
      } else {
         String var8 = IlIIllIII.lI(IIll(IllI(729282940, var10 ^ 1865322599), IllI(729282941, var10 ^ 2002396916)));
         return var5 + var8 + var6;
      }
   }

   private static void II(Set var0, ModContainer var1) {
      var1.findPath(IIl.llIl()).ifPresent(llllIlII::ll);
   }

   private static IllIlIII Il() {
      IllIlIII var0 = I.get();
      if (var0 != null) {
         return var0;
      } else {
         synchronized (llllIlII.class) {
            var0 = I.get();
            if (var0 == null) {
               var0 = IIl();
               I = new WeakReference<>(var0);
            }

            return var0;
         }
      }
   }

   private static float lI(int var0, int var1, float var2) {
      return var2 * ((float)var0 / var1);
   }

   private static void ll(Set var0, Path var1) {
      IIlI(var0, var1);
   }

   private static void III(Path var0, List var1, Path var2) {
      IlI(var0, var2).ifPresent(var1::add);
   }

   private static IllIlIII IIl() {
      int var14 = 933699332;
      LinkedHashSet var0 = new LinkedHashSet();
      IIlI(
         var0,
         Paths.get(
            IlIIllIII.lI(IIll(IllI(729282930, var14 ^ 1583668537), IllI(729282931, var14 ^ -54008368))),
            IlIIllIII.lI(IIll(IllI(729282928, var14 ^ -1916883088), IllI(729282929, var14 ^ -192765636))),
            IlIIllIII.lI(IIll(IllI(729282934, var14 ^ 2136828001), IllI(729282935, var14 ^ -1730123413))),
            IlIIllIII.lI(IIll(IllI(729282932, var14 ^ 1030381657), IllI(729282933, var14 ^ -568627129))),
            IIl.llIl()
         )
      );
      IIlI(
         var0,
         Paths.get(
            IlIIllIII.lI(IIll(IllI(729282922, var14 ^ -818116029), IllI(729282923, var14 ^ -290944957))),
            IlIIllIII.lI(IIll(IllI(729282920, var14 ^ 1445819800), IllI(729282921, var14 ^ 528626412))),
            IlIIllIII.lI(IIll(IllI(729282926, var14 ^ 1311519808), IllI(729282927, var14 ^ 363271359))),
            IIl.llIl()
         )
      );
      FabricLoader.getInstance()
         .getModContainer(IlIIllIII.lI(IIll(IllI(729282924, var14 ^ 1838707151), IllI(729282925, var14 ^ 2122156204))))
         .ifPresent(llllIlII::II);
      ArrayList var1 = new ArrayList();

      for (Path var3 : var0) {
         var1.addAll(lll(var3));
      }

      if (var1.isEmpty()) {
         var1.addAll(llI());
      }

      var1.sort(Comparator.comparing(IlIIII::II, String.CASE_INSENSITIVE_ORDER));
      IlIIII var15 = null;
      LinkedHashMap var16 = new LinkedHashMap();
      ArrayList var4 = new ArrayList(var1.size());
      LinkedHashMap var5 = new LinkedHashMap();

      for (IlIIII var7 : var1) {
         int var8 = var16.merge(var7.II(), 1, Integer::sum);
         IlIIII var10000;
         if (var8 > 1) {
            String var10001 = var7.II();
            String var10002 = IlIIllIII.lI(IIll(IllI(729282914, var14 ^ 795863380), IllI(729282915, var14 ^ -2057763469)));
            String var13 = IlIIllIII.lI(IIll(IllI(729282912, var14 ^ -418264319), IllI(729282913, var14 ^ -1714781607)));
            String var11 = var10002;
            String var10 = var10001;
            var10000 = var7.IIII(var10 + var11 + var8 + var13);
         } else {
            var10000 = var7;
         }

         IlIIII var9 = var10000;
         var4.add(var9);
         var5.put(var9.lI(), var9);
         if (var15 == null) {
            var15 = var9;
         }
      }

      return new IllIlIII(List.copyOf(var4), Map.copyOf(var5), var15);
   }

   private static Optional<IlIIII> IlI(Path param0, Path param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w -1670020150
      // 003: istore 9
      // 005: aload 0
      // 006: aload 1
      // 007: invokeinterface java/nio/file/Path.relativize (Ljava/nio/file/Path;)Ljava/nio/file/Path; 2
      // 00c: invokeinterface java/nio/file/Path.toString ()Ljava/lang/String; 1
      // 011: ldc_w 729282918
      // 014: iload 9
      // 016: ldc_w -820579279
      // 019: ixor
      // 01a: invokestatic k74/x/llllIlII.IllI (II)I
      // 01d: ldc_w 729282919
      // 020: iload 9
      // 022: ldc_w -951628984
      // 025: ixor
      // 026: invokestatic k74/x/llllIlII.IllI (II)I
      // 029: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 02c: astore 2
      // 02d: aload 2
      // 02e: ldc_w 729282916
      // 031: iload 9
      // 033: ldc_w 1012616473
      // 036: ixor
      // 037: invokestatic k74/x/llllIlII.IllI (II)I
      // 03a: ldc_w 729282917
      // 03d: iload 9
      // 03f: ldc_w -1512170383
      // 042: ixor
      // 043: invokestatic k74/x/llllIlII.IllI (II)I
      // 046: invokestatic k74/x/llllIlII.IIll (II)Ljava/lang/String;
      // 049: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 04c: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 04f: ifeq 05a
      // 052: invokestatic java/util/Optional.empty ()Ljava/util/Optional;
      // 055: areturn
      // 056: invokestatic k74/x/llllIlII.IlIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 059: athrow
      // 05a: aload 1
      // 05b: bipush 0
      // 05c: anewarray 481
      // 05f: invokestatic java/nio/file/Files.newInputStream (Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/InputStream;
      // 062: astore 3
      // 063: aload 3
      // 064: invokestatic net/minecraft/class_1011.method_4309 (Ljava/io/InputStream;)Lnet/minecraft/class_1011;
      // 067: astore 4
      // 069: aload 4
      // 06b: ifnull 08c
      // 06e: aload 4
      // 070: invokevirtual net/minecraft/class_1011.method_4307 ()I
      // 073: ifle 08c
      // 076: goto 07d
      // 079: invokestatic k74/x/llllIlII.IlIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07c: athrow
      // 07d: aload 4
      // 07f: invokevirtual net/minecraft/class_1011.method_4323 ()I
      // 082: ifgt 0b4
      // 085: goto 08c
      // 088: invokestatic k74/x/llllIlII.IlIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08b: athrow
      // 08c: invokestatic java/util/Optional.empty ()Ljava/util/Optional;
      // 08f: astore 5
      // 091: aload 4
      // 093: ifnull 0a2
      // 096: aload 4
      // 098: invokevirtual net/minecraft/class_1011.close ()V
      // 09b: goto 0a2
      // 09e: invokestatic k74/x/llllIlII.IlIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a1: athrow
      // 0a2: aload 3
      // 0a3: ifnull 0b1
      // 0a6: aload 3
      // 0a7: invokevirtual java/io/InputStream.close ()V
      // 0aa: goto 0b1
      // 0ad: invokestatic k74/x/llllIlII.IlIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b0: athrow
      // 0b1: aload 5
      // 0b3: areturn
      // 0b4: aload 2
      // 0b5: bipush 0
      // 0b6: aload 2
      // 0b7: invokevirtual java/lang/String.length ()I
      // 0ba: bipush 4
      // 0bb: isub
      // 0bc: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0bf: astore 5
      // 0c1: aload 4
      // 0c3: invokevirtual net/minecraft/class_1011.method_4307 ()I
      // 0c6: aload 4
      // 0c8: invokevirtual net/minecraft/class_1011.method_4323 ()I
      // 0cb: ldc 8.0
      // 0cd: invokestatic k74/x/llllIlII.lI (IIF)F
      // 0d0: fstore 6
      // 0d2: aload 4
      // 0d4: invokevirtual net/minecraft/class_1011.method_4307 ()I
      // 0d7: aload 4
      // 0d9: invokevirtual net/minecraft/class_1011.method_4323 ()I
      // 0dc: ldc 6.0
      // 0de: invokestatic k74/x/llllIlII.lI (IIF)F
      // 0e1: fstore 7
      // 0e3: new k74/x/IlIIII
      // 0e6: dup
      // 0e7: aload 5
      // 0e9: aload 5
      // 0eb: invokestatic k74/x/llllIlII.l (Ljava/lang/String;)Ljava/lang/String;
      // 0ee: getstatic k74/x/llllIlII.IlI Lk74/x/IIIlIlIl;
      // 0f1: aload 2
      // 0f2: invokestatic k74/x/IlIIllIII.lII (Ljava/lang/String;)Lk74/x/IIIlIlIl;
      // 0f5: invokevirtual k74/x/IIIlIlIl.IIll (Lk74/x/IIIlIlIl;)Lk74/x/IIIlIlIl;
      // 0f8: aload 4
      // 0fa: invokevirtual net/minecraft/class_1011.method_4307 ()I
      // 0fd: aload 4
      // 0ff: invokevirtual net/minecraft/class_1011.method_4323 ()I
      // 102: fload 6
      // 104: ldc 8.0
      // 106: fload 7
      // 108: ldc 6.0
      // 10a: invokespecial k74/x/IlIIII.<init> (Ljava/lang/String;Ljava/lang/String;Lk74/x/IIIlIlIl;IIFFFF)V
      // 10d: invokestatic java/util/Optional.of (Ljava/lang/Object;)Ljava/util/Optional;
      // 110: astore 8
      // 112: aload 4
      // 114: ifnull 123
      // 117: aload 4
      // 119: invokevirtual net/minecraft/class_1011.close ()V
      // 11c: goto 123
      // 11f: invokestatic k74/x/llllIlII.IlIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 122: athrow
      // 123: aload 3
      // 124: ifnull 132
      // 127: aload 3
      // 128: invokevirtual java/io/InputStream.close ()V
      // 12b: goto 132
      // 12e: invokestatic k74/x/llllIlII.IlIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 131: athrow
      // 132: aload 8
      // 134: areturn
      // 135: astore 5
      // 137: aload 4
      // 139: ifnull 14d
      // 13c: aload 4
      // 13e: invokevirtual net/minecraft/class_1011.close ()V
      // 141: goto 14d
      // 144: astore 6
      // 146: aload 5
      // 148: aload 6
      // 14a: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 14d: aload 5
      // 14f: athrow
      // 150: astore 4
      // 152: aload 3
      // 153: ifnull 166
      // 156: aload 3
      // 157: invokevirtual java/io/InputStream.close ()V
      // 15a: goto 166
      // 15d: astore 5
      // 15f: aload 4
      // 161: aload 5
      // 163: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 166: aload 4
      // 168: athrow
      // 169: astore 3
      // 16a: getstatic k74/x/llllIlII.II Lorg/slf4j/Logger;
      // 16d: ldc_w 729282842
      // 170: iload 9
      // 172: ldc_w 1566986963
      // 175: ixor
      // 176: invokestatic k74/x/llllIlII.IllI (II)I
      // 179: ldc_w 729282843
      // 17c: iload 9
      // 17e: ldc_w -1678644938
      // 181: ixor
      // 182: invokestatic k74/x/llllIlII.IllI (II)I
      // 185: invokestatic k74/x/llllIlII.IIll (II)Ljava/lang/String;
      // 188: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 18b: aload 1
      // 18c: aload 3
      // 18d: invokeinterface org/slf4j/Logger.warn (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V 4
      // 192: invokestatic java/util/Optional.empty ()Ljava/util/Optional;
      // 195: areturn
   }

   private static boolean Ill(Path var0) {
      return Files.isRegularFile(var0);
   }

   public static IlIIII lII(String var0) {
      return Il().lI(var0);
   }

   private static boolean lIl(Path var0) {
      return var0.getFileName()
         .toString()
         .toLowerCase(Locale.ROOT)
         .endsWith(IlIIllIII.lI(IIll(IllI(729282840, -681002110 ^ 1418024193), IllI(729282841, -681002110 ^ -1957630267))));
   }

   private static List<IlIIII> llI() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: ldc_w -1872494437
      // 003: istore 14
      // 005: invokestatic k74/x/IIllllIl.IIIIl ()[Ljava/lang/String;
      // 008: new java/util/ArrayList
      // 00b: dup
      // 00c: invokespecial java/util/ArrayList.<init> ()V
      // 00f: astore 1
      // 010: ldc_w 729282846
      // 013: iload 14
      // 015: ldc_w 177358273
      // 018: ixor
      // 019: invokestatic k74/x/llllIlII.IllI (II)I
      // 01c: anewarray 135
      // 01f: dup
      // 020: bipush 0
      // 021: ldc_w 729282847
      // 024: iload 14
      // 026: ldc_w 1375284751
      // 029: ixor
      // 02a: invokestatic k74/x/llllIlII.IllI (II)I
      // 02d: ldc_w 729282844
      // 030: iload 14
      // 032: ldc_w -1364711654
      // 035: ixor
      // 036: invokestatic k74/x/llllIlII.IllI (II)I
      // 039: invokestatic k74/x/llllIlII.IIll (II)Ljava/lang/String;
      // 03c: invokestatic k74/x/IlIIllIII.Ill (Ljava/lang/String;)Lk74/x/IIIlIlIl;
      // 03f: aastore
      // 040: dup
      // 041: bipush 1
      // 042: ldc_w 729282845
      // 045: iload 14
      // 047: ldc_w 1219902921
      // 04a: ixor
      // 04b: invokestatic k74/x/llllIlII.IllI (II)I
      // 04e: ldc_w 729282834
      // 051: iload 14
      // 053: ldc_w -716692970
      // 056: ixor
      // 057: invokestatic k74/x/llllIlII.IllI (II)I
      // 05a: invokestatic k74/x/llllIlII.IIll (II)Ljava/lang/String;
      // 05d: invokestatic k74/x/IlIIllIII.Ill (Ljava/lang/String;)Lk74/x/IIIlIlIl;
      // 060: aastore
      // 061: dup
      // 062: bipush 2
      // 063: ldc_w 729282835
      // 066: iload 14
      // 068: ldc_w 2096076386
      // 06b: ixor
      // 06c: invokestatic k74/x/llllIlII.IllI (II)I
      // 06f: ldc_w 729282832
      // 072: iload 14
      // 074: ldc_w -84198031
      // 077: ixor
      // 078: invokestatic k74/x/llllIlII.IllI (II)I
      // 07b: invokestatic k74/x/llllIlII.IIll (II)Ljava/lang/String;
      // 07e: invokestatic k74/x/IlIIllIII.Ill (Ljava/lang/String;)Lk74/x/IIIlIlIl;
      // 081: aastore
      // 082: dup
      // 083: bipush 3
      // 084: ldc_w 729282833
      // 087: iload 14
      // 089: ldc_w -1427282154
      // 08c: ixor
      // 08d: invokestatic k74/x/llllIlII.IllI (II)I
      // 090: ldc_w 729282838
      // 093: iload 14
      // 095: ldc_w 1227798266
      // 098: ixor
      // 099: invokestatic k74/x/llllIlII.IllI (II)I
      // 09c: invokestatic k74/x/llllIlII.IIll (II)Ljava/lang/String;
      // 09f: invokestatic k74/x/IlIIllIII.Ill (Ljava/lang/String;)Lk74/x/IIIlIlIl;
      // 0a2: aastore
      // 0a3: dup
      // 0a4: bipush 4
      // 0a5: ldc_w 729282839
      // 0a8: iload 14
      // 0aa: ldc_w 1847442130
      // 0ad: ixor
      // 0ae: invokestatic k74/x/llllIlII.IllI (II)I
      // 0b1: ldc_w 729282836
      // 0b4: iload 14
      // 0b6: ldc_w -981005414
      // 0b9: ixor
      // 0ba: invokestatic k74/x/llllIlII.IllI (II)I
      // 0bd: invokestatic k74/x/llllIlII.IIll (II)Ljava/lang/String;
      // 0c0: invokestatic k74/x/IlIIllIII.Ill (Ljava/lang/String;)Lk74/x/IIIlIlIl;
      // 0c3: aastore
      // 0c4: dup
      // 0c5: bipush 5
      // 0c6: ldc_w 729282837
      // 0c9: iload 14
      // 0cb: ldc_w -1240934007
      // 0ce: ixor
      // 0cf: invokestatic k74/x/llllIlII.IllI (II)I
      // 0d2: ldc_w 729282826
      // 0d5: iload 14
      // 0d7: ldc_w 977751283
      // 0da: ixor
      // 0db: invokestatic k74/x/llllIlII.IllI (II)I
      // 0de: invokestatic k74/x/llllIlII.IIll (II)Ljava/lang/String;
      // 0e1: invokestatic k74/x/IlIIllIII.Ill (Ljava/lang/String;)Lk74/x/IIIlIlIl;
      // 0e4: aastore
      // 0e5: dup
      // 0e6: ldc_w 729282827
      // 0e9: iload 14
      // 0eb: ldc_w -247496877
      // 0ee: ixor
      // 0ef: invokestatic k74/x/llllIlII.IllI (II)I
      // 0f2: ldc_w 729282824
      // 0f5: iload 14
      // 0f7: ldc_w -240984876
      // 0fa: ixor
      // 0fb: invokestatic k74/x/llllIlII.IllI (II)I
      // 0fe: ldc_w 729282825
      // 101: iload 14
      // 103: ldc_w 391295935
      // 106: ixor
      // 107: invokestatic k74/x/llllIlII.IllI (II)I
      // 10a: invokestatic k74/x/llllIlII.IIll (II)Ljava/lang/String;
      // 10d: invokestatic k74/x/IlIIllIII.Ill (Ljava/lang/String;)Lk74/x/IIIlIlIl;
      // 110: aastore
      // 111: dup
      // 112: ldc_w 729282830
      // 115: iload 14
      // 117: ldc_w 793877224
      // 11a: ixor
      // 11b: invokestatic k74/x/llllIlII.IllI (II)I
      // 11e: ldc_w 729282831
      // 121: iload 14
      // 123: ldc_w -1848247074
      // 126: ixor
      // 127: invokestatic k74/x/llllIlII.IllI (II)I
      // 12a: ldc_w 729282828
      // 12d: iload 14
      // 12f: ldc_w -546553702
      // 132: ixor
      // 133: invokestatic k74/x/llllIlII.IllI (II)I
      // 136: invokestatic k74/x/llllIlII.IIll (II)Ljava/lang/String;
      // 139: invokestatic k74/x/IlIIllIII.Ill (Ljava/lang/String;)Lk74/x/IIIlIlIl;
      // 13c: aastore
      // 13d: dup
      // 13e: ldc_w 729282829
      // 141: iload 14
      // 143: ldc_w -1017839770
      // 146: ixor
      // 147: invokestatic k74/x/llllIlII.IllI (II)I
      // 14a: ldc_w 729282818
      // 14d: iload 14
      // 14f: ldc_w 1511779779
      // 152: ixor
      // 153: invokestatic k74/x/llllIlII.IllI (II)I
      // 156: ldc_w 729282819
      // 159: iload 14
      // 15b: ldc_w 473602724
      // 15e: ixor
      // 15f: invokestatic k74/x/llllIlII.IllI (II)I
      // 162: invokestatic k74/x/llllIlII.IIll (II)Ljava/lang/String;
      // 165: invokestatic k74/x/IlIIllIII.Ill (Ljava/lang/String;)Lk74/x/IIIlIlIl;
      // 168: aastore
      // 169: dup
      // 16a: ldc_w 729282816
      // 16d: iload 14
      // 16f: ldc_w -2077962167
      // 172: ixor
      // 173: invokestatic k74/x/llllIlII.IllI (II)I
      // 176: ldc_w 729282817
      // 179: iload 14
      // 17b: ldc_w 1310196628
      // 17e: ixor
      // 17f: invokestatic k74/x/llllIlII.IllI (II)I
      // 182: ldc_w 729282822
      // 185: iload 14
      // 187: ldc_w -1219781453
      // 18a: ixor
      // 18b: invokestatic k74/x/llllIlII.IllI (II)I
      // 18e: invokestatic k74/x/llllIlII.IIll (II)Ljava/lang/String;
      // 191: invokestatic k74/x/IlIIllIII.Ill (Ljava/lang/String;)Lk74/x/IIIlIlIl;
      // 194: aastore
      // 195: dup
      // 196: ldc_w 729282823
      // 199: iload 14
      // 19b: ldc_w -580783134
      // 19e: ixor
      // 19f: invokestatic k74/x/llllIlII.IllI (II)I
      // 1a2: ldc_w 729282820
      // 1a5: iload 14
      // 1a7: ldc_w 1844033213
      // 1aa: ixor
      // 1ab: invokestatic k74/x/llllIlII.IllI (II)I
      // 1ae: ldc_w 729282821
      // 1b1: iload 14
      // 1b3: ldc_w -573364100
      // 1b6: ixor
      // 1b7: invokestatic k74/x/llllIlII.IllI (II)I
      // 1ba: invokestatic k74/x/llllIlII.IIll (II)Ljava/lang/String;
      // 1bd: invokestatic k74/x/IlIIllIII.Ill (Ljava/lang/String;)Lk74/x/IIIlIlIl;
      // 1c0: aastore
      // 1c1: dup
      // 1c2: ldc_w 729282874
      // 1c5: iload 14
      // 1c7: ldc_w -565150382
      // 1ca: ixor
      // 1cb: invokestatic k74/x/llllIlII.IllI (II)I
      // 1ce: ldc_w 729282875
      // 1d1: iload 14
      // 1d3: ldc_w 1198250154
      // 1d6: ixor
      // 1d7: invokestatic k74/x/llllIlII.IllI (II)I
      // 1da: ldc_w 729282872
      // 1dd: iload 14
      // 1df: ldc_w -578854052
      // 1e2: ixor
      // 1e3: invokestatic k74/x/llllIlII.IllI (II)I
      // 1e6: invokestatic k74/x/llllIlII.IIll (II)Ljava/lang/String;
      // 1e9: invokestatic k74/x/IlIIllIII.Ill (Ljava/lang/String;)Lk74/x/IIIlIlIl;
      // 1ec: aastore
      // 1ed: dup
      // 1ee: ldc_w 729282873
      // 1f1: iload 14
      // 1f3: ldc_w -2075129962
      // 1f6: ixor
      // 1f7: invokestatic k74/x/llllIlII.IllI (II)I
      // 1fa: ldc_w 729282878
      // 1fd: iload 14
      // 1ff: ldc_w -369929600
      // 202: ixor
      // 203: invokestatic k74/x/llllIlII.IllI (II)I
      // 206: ldc_w 729282879
      // 209: iload 14
      // 20b: ldc_w 334719324
      // 20e: ixor
      // 20f: invokestatic k74/x/llllIlII.IllI (II)I
      // 212: invokestatic k74/x/llllIlII.IIll (II)Ljava/lang/String;
      // 215: invokestatic k74/x/IlIIllIII.Ill (Ljava/lang/String;)Lk74/x/IIIlIlIl;
      // 218: aastore
      // 219: dup
      // 21a: ldc_w 729282876
      // 21d: iload 14
      // 21f: ldc_w 259565626
      // 222: ixor
      // 223: invokestatic k74/x/llllIlII.IllI (II)I
      // 226: ldc_w 729282877
      // 229: iload 14
      // 22b: ldc_w -11167069
      // 22e: ixor
      // 22f: invokestatic k74/x/llllIlII.IllI (II)I
      // 232: ldc_w 729282866
      // 235: iload 14
      // 237: ldc_w 239692381
      // 23a: ixor
      // 23b: invokestatic k74/x/llllIlII.IllI (II)I
      // 23e: invokestatic k74/x/llllIlII.IIll (II)Ljava/lang/String;
      // 241: invokestatic k74/x/IlIIllIII.Ill (Ljava/lang/String;)Lk74/x/IIIlIlIl;
      // 244: aastore
      // 245: dup
      // 246: ldc_w 729282867
      // 249: iload 14
      // 24b: ldc_w 2076701059
      // 24e: ixor
      // 24f: invokestatic k74/x/llllIlII.IllI (II)I
      // 252: ldc_w 729282864
      // 255: iload 14
      // 257: ldc_w 2020372855
      // 25a: ixor
      // 25b: invokestatic k74/x/llllIlII.IllI (II)I
      // 25e: ldc_w 729282865
      // 261: iload 14
      // 263: ldc_w 643521837
      // 266: ixor
      // 267: invokestatic k74/x/llllIlII.IllI (II)I
      // 26a: invokestatic k74/x/llllIlII.IIll (II)Ljava/lang/String;
      // 26d: invokestatic k74/x/IlIIllIII.Ill (Ljava/lang/String;)Lk74/x/IIIlIlIl;
      // 270: aastore
      // 271: dup
      // 272: ldc_w 729282870
      // 275: iload 14
      // 277: ldc_w 208113263
      // 27a: ixor
      // 27b: invokestatic k74/x/llllIlII.IllI (II)I
      // 27e: ldc_w 729282871
      // 281: iload 14
      // 283: ldc_w 219711245
      // 286: ixor
      // 287: invokestatic k74/x/llllIlII.IllI (II)I
      // 28a: ldc_w 729282868
      // 28d: iload 14
      // 28f: ldc_w -1676355199
      // 292: ixor
      // 293: invokestatic k74/x/llllIlII.IllI (II)I
      // 296: invokestatic k74/x/llllIlII.IIll (II)Ljava/lang/String;
      // 299: invokestatic k74/x/IlIIllIII.Ill (Ljava/lang/String;)Lk74/x/IIIlIlIl;
      // 29c: aastore
      // 29d: dup
      // 29e: ldc_w 729282869
      // 2a1: iload 14
      // 2a3: ldc_w 1964369172
      // 2a6: ixor
      // 2a7: invokestatic k74/x/llllIlII.IllI (II)I
      // 2aa: ldc_w 729282858
      // 2ad: iload 14
      // 2af: ldc_w 1727996445
      // 2b2: ixor
      // 2b3: invokestatic k74/x/llllIlII.IllI (II)I
      // 2b6: ldc_w 729282859
      // 2b9: iload 14
      // 2bb: ldc_w -530846464
      // 2be: ixor
      // 2bf: invokestatic k74/x/llllIlII.IllI (II)I
      // 2c2: invokestatic k74/x/llllIlII.IIll (II)Ljava/lang/String;
      // 2c5: invokestatic k74/x/IlIIllIII.Ill (Ljava/lang/String;)Lk74/x/IIIlIlIl;
      // 2c8: aastore
      // 2c9: dup
      // 2ca: ldc_w 729282856
      // 2cd: iload 14
      // 2cf: ldc_w 1992847867
      // 2d2: ixor
      // 2d3: invokestatic k74/x/llllIlII.IllI (II)I
      // 2d6: ldc_w 729282857
      // 2d9: iload 14
      // 2db: ldc_w -663968371
      // 2de: ixor
      // 2df: invokestatic k74/x/llllIlII.IllI (II)I
      // 2e2: ldc_w 729282862
      // 2e5: iload 14
      // 2e7: ldc_w 1652537962
      // 2ea: ixor
      // 2eb: invokestatic k74/x/llllIlII.IllI (II)I
      // 2ee: invokestatic k74/x/llllIlII.IIll (II)Ljava/lang/String;
      // 2f1: invokestatic k74/x/IlIIllIII.Ill (Ljava/lang/String;)Lk74/x/IIIlIlIl;
      // 2f4: aastore
      // 2f5: dup
      // 2f6: ldc_w 729282863
      // 2f9: iload 14
      // 2fb: ldc_w 1893991143
      // 2fe: ixor
      // 2ff: invokestatic k74/x/llllIlII.IllI (II)I
      // 302: ldc_w 729282860
      // 305: iload 14
      // 307: ldc_w 337542248
      // 30a: ixor
      // 30b: invokestatic k74/x/llllIlII.IllI (II)I
      // 30e: ldc_w 729282861
      // 311: iload 14
      // 313: ldc_w -498578649
      // 316: ixor
      // 317: invokestatic k74/x/llllIlII.IllI (II)I
      // 31a: invokestatic k74/x/llllIlII.IIll (II)Ljava/lang/String;
      // 31d: invokestatic k74/x/IlIIllIII.Ill (Ljava/lang/String;)Lk74/x/IIIlIlIl;
      // 320: aastore
      // 321: invokestatic java/util/List.of ([Ljava/lang/Object;)Ljava/util/List;
      // 324: astore 2
      // 325: astore 0
      // 326: aload 2
      // 327: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 32c: astore 3
      // 32d: aload 3
      // 32e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 333: ifeq 4e7
      // 336: aload 3
      // 337: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 33c: checkcast k74/x/IIIlIlIl
      // 33f: astore 4
      // 341: aload 4
      // 343: invokevirtual k74/x/IIIlIlIl.llIl ()Ljava/lang/String;
      // 346: astore 5
      // 348: getstatic k74/x/llllIlII.IIl Lk74/x/IIIlIlIl;
      // 34b: invokevirtual k74/x/IIIlIlIl.llIl ()Ljava/lang/String;
      // 34e: ldc_w 729282850
      // 351: iload 14
      // 353: ldc_w 1756544691
      // 356: ixor
      // 357: invokestatic k74/x/llllIlII.IllI (II)I
      // 35a: ldc_w 729282851
      // 35d: iload 14
      // 35f: ldc_w 687300160
      // 362: ixor
      // 363: invokestatic k74/x/llllIlII.IllI (II)I
      // 366: invokestatic k74/x/llllIlII.IIll (II)Ljava/lang/String;
      // 369: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 36c: aload 5
      // 36e: astore 13
      // 370: astore 12
      // 372: astore 11
      // 374: new java/lang/StringBuilder
      // 377: dup
      // 378: invokespecial java/lang/StringBuilder.<init> ()V
      // 37b: aload 11
      // 37d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 380: aload 12
      // 382: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 385: aload 13
      // 387: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 38a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 38d: astore 6
      // 38f: ldc k74/x/llllIlII
      // 391: invokevirtual java/lang/Class.getClassLoader ()Ljava/lang/ClassLoader;
      // 394: aload 6
      // 396: invokevirtual java/lang/ClassLoader.getResourceAsStream (Ljava/lang/String;)Ljava/io/InputStream;
      // 399: astore 7
      // 39b: aload 7
      // 39d: ifnonnull 3b5
      // 3a0: aload 7
      // 3a2: ifnull 3b1
      // 3a5: aload 7
      // 3a7: invokevirtual java/io/InputStream.close ()V
      // 3aa: goto 3b1
      // 3ad: invokestatic k74/x/llllIlII.IlIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b0: athrow
      // 3b1: aload 0
      // 3b2: ifnull 32d
      // 3b5: aload 7
      // 3b7: invokestatic net/minecraft/class_1011.method_4309 (Ljava/io/InputStream;)Lnet/minecraft/class_1011;
      // 3ba: astore 8
      // 3bc: aload 8
      // 3be: ifnull 3df
      // 3c1: aload 8
      // 3c3: invokevirtual net/minecraft/class_1011.method_4307 ()I
      // 3c6: ifle 3df
      // 3c9: goto 3d0
      // 3cc: invokestatic k74/x/llllIlII.IlIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3cf: athrow
      // 3d0: aload 8
      // 3d2: invokevirtual net/minecraft/class_1011.method_4323 ()I
      // 3d5: ifgt 405
      // 3d8: goto 3df
      // 3db: invokestatic k74/x/llllIlII.IlIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3de: athrow
      // 3df: aload 8
      // 3e1: ifnull 3f0
      // 3e4: aload 8
      // 3e6: invokevirtual net/minecraft/class_1011.close ()V
      // 3e9: goto 3f0
      // 3ec: invokestatic k74/x/llllIlII.IlIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3ef: athrow
      // 3f0: aload 7
      // 3f2: ifnull 401
      // 3f5: aload 7
      // 3f7: invokevirtual java/io/InputStream.close ()V
      // 3fa: goto 401
      // 3fd: invokestatic k74/x/llllIlII.IlIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 400: athrow
      // 401: aload 0
      // 402: ifnull 32d
      // 405: aload 5
      // 407: bipush 0
      // 408: aload 5
      // 40a: invokevirtual java/lang/String.length ()I
      // 40d: bipush 4
      // 40e: isub
      // 40f: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 412: astore 9
      // 414: aload 1
      // 415: new k74/x/IlIIII
      // 418: dup
      // 419: aload 9
      // 41b: aload 9
      // 41d: invokestatic k74/x/llllIlII.l (Ljava/lang/String;)Ljava/lang/String;
      // 420: getstatic k74/x/llllIlII.IlI Lk74/x/IIIlIlIl;
      // 423: aload 5
      // 425: invokestatic k74/x/IlIIllIII.lII (Ljava/lang/String;)Lk74/x/IIIlIlIl;
      // 428: invokevirtual k74/x/IIIlIlIl.IIll (Lk74/x/IIIlIlIl;)Lk74/x/IIIlIlIl;
      // 42b: aload 8
      // 42d: invokevirtual net/minecraft/class_1011.method_4307 ()I
      // 430: aload 8
      // 432: invokevirtual net/minecraft/class_1011.method_4323 ()I
      // 435: aload 8
      // 437: invokevirtual net/minecraft/class_1011.method_4307 ()I
      // 43a: aload 8
      // 43c: invokevirtual net/minecraft/class_1011.method_4323 ()I
      // 43f: ldc 8.0
      // 441: invokestatic k74/x/llllIlII.lI (IIF)F
      // 444: ldc 8.0
      // 446: aload 8
      // 448: invokevirtual net/minecraft/class_1011.method_4307 ()I
      // 44b: aload 8
      // 44d: invokevirtual net/minecraft/class_1011.method_4323 ()I
      // 450: ldc 6.0
      // 452: invokestatic k74/x/llllIlII.lI (IIF)F
      // 455: ldc 6.0
      // 457: invokespecial k74/x/IlIIII.<init> (Ljava/lang/String;Ljava/lang/String;Lk74/x/IIIlIlIl;IIFFFF)V
      // 45a: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 45f: pop
      // 460: aload 8
      // 462: ifnull 488
      // 465: aload 8
      // 467: invokevirtual net/minecraft/class_1011.close ()V
      // 46a: goto 488
      // 46d: astore 9
      // 46f: aload 8
      // 471: ifnull 485
      // 474: aload 8
      // 476: invokevirtual net/minecraft/class_1011.close ()V
      // 479: goto 485
      // 47c: astore 10
      // 47e: aload 9
      // 480: aload 10
      // 482: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 485: aload 9
      // 487: athrow
      // 488: aload 7
      // 48a: ifnull 4b4
      // 48d: aload 7
      // 48f: invokevirtual java/io/InputStream.close ()V
      // 492: goto 4b4
      // 495: invokestatic k74/x/llllIlII.IlIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 498: athrow
      // 499: astore 8
      // 49b: aload 7
      // 49d: ifnull 4b1
      // 4a0: aload 7
      // 4a2: invokevirtual java/io/InputStream.close ()V
      // 4a5: goto 4b1
      // 4a8: astore 9
      // 4aa: aload 8
      // 4ac: aload 9
      // 4ae: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 4b1: aload 8
      // 4b3: athrow
      // 4b4: goto 4e3
      // 4b7: astore 7
      // 4b9: getstatic k74/x/llllIlII.II Lorg/slf4j/Logger;
      // 4bc: ldc_w 729282848
      // 4bf: iload 14
      // 4c1: ldc_w 469118307
      // 4c4: ixor
      // 4c5: invokestatic k74/x/llllIlII.IllI (II)I
      // 4c8: ldc_w 729282849
      // 4cb: iload 14
      // 4cd: ldc_w -93570511
      // 4d0: ixor
      // 4d1: invokestatic k74/x/llllIlII.IllI (II)I
      // 4d4: invokestatic k74/x/llllIlII.IIll (II)Ljava/lang/String;
      // 4d7: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 4da: aload 5
      // 4dc: aload 7
      // 4de: invokeinterface org/slf4j/Logger.warn (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V 4
      // 4e3: aload 0
      // 4e4: ifnull 32d
      // 4e7: aload 1
      // 4e8: areturn
   }

   private static List<IlIIII> lll(Path var0) {
      ArrayList var1 = new ArrayList();

      try (Stream var2 = Files.walk(var0)) {
         var2.filter(llllIlII::Ill).filter(llllIlII::lIl).forEach(llllIlII::III);
      } catch (Exception var7) {
         II.warn(IlIIllIII.lI(IIll(IllI(729282854, 286126828 ^ 52280598), IllI(729282855, 286126828 ^ 353134731))), var0, var7);
      }

      return var1;
   }

   public static IlIIII IIII() {
      return Il().Il();
   }

   public static List<String> IIIl() {
      return Il().l();
   }

   private static void IIlI(Set<Path> var0, Path var1) {
      try {
         if (var1 == null) {
            return;
         }
      } catch (Exception var4) {
         throw IlIl(var4);
      }

      try {
         if (Files.isDirectory(var1)) {
            var0.add(var1.toAbsolutePath().normalize());
         }
      } catch (Exception var3) {
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = 1751361052;
      int var17 = 0;
      int var16 = 0;
      String[] var10002 = new String[2];
      short var18 = 16227;
      String[] var15 = var10002;
      int var14 = "ҽ坏篔嫯鏖䬯⏑夯鏖唏寊✯돑Ⱟ⯖减及嫯\ue3cb\u2e6f揕䏯珈卯ﯖ⊯ௐ䛏䏔序\uf3d5∯寈⧏毖墯取䛯䏔≏㏕厏菑儯ϑ咏ꏕ弯돗䓏㏖式㯗⳯毗兏\u0bd1⧏寕刏䯈䀏ꏖ䚯揈厯䯕䐯쏕⫯폖⹏䯖Ⅿ\ue3d7卯及啯㯈喏㯔厏\uf3d4劯\u0bd1徯⏈䔏돑嚯取⣯珈Ⅿ\ue3d5巯寈嚯䯑⼏⯊唏寑∏㯕副寑≏ꯊ咏揖䮏\uebd0娏ꯔ⽯㯈厏돗娏ϕ倯쯐⋏Ꮚ妏䏖䐏ꯖ儏믕堏㯋唏ᯋ峯毗䒏鯗䭯鏊⺯篋徯鯑⤏ொ䔯菕䭯ﯕ䗏폖\u2d2fꏋ囯毑䚯\uf3d5\u208f鯔小ϖ⪯쏉壯⏋䮏쯋婯䏊ⶏ⯔䌯\uf3d5嚏珋䮏ோ垯篋忏ϑ儏\uebd6倯쯐壏䏕卯쯋堯鏗庯㏖吏⯗呏䏋孯⯋坯ﯗ哯菋⳯又帯ϕⅯ鯗峯⯕䘏寖协寋ⵏ\udbc9⠏\uebd4⊏\ufbd2像菋䕏诈⪯폖䒏믖⠏㏊徏珕冏菗寏\uebd2ⶏ\ufbd2堯⏕岏菔䚯珗喯篑娏鯈傏受⢯⏋⫯诖媏菈Ɐ⯊❏寑劏毋匯ϊ凯ϔ⻯\u0bd6娏鯕嬏\udbc9\u2daf⏋⼏⯗傏受⋏쯐Ɐꯖ⳯ꏕ呏䏊劯Ꮛ䏏揋䙏\uf3d7\u2e6f受嘯篗嘯\ue3c9孏揊忏诈⩏ﯗ⺯珔启菈≯ᯖⰏ䏔姯诗❏\u0bd5喏ꯖ✏㏋⠯篖屏䯈⫯⏋⡯䯕䎯篗孯ᯕ↯篕䛯쏋劏ꏔ➯䏊姏ꯗ嫏ﯗ壯㏋协\uf3d4匏菑䓏毋像又劏ꏈ姯揊⟏珈⥏\ue3c9堯Ꮧ䏏篈⼏폒䛏폕忏\ue3cb峏돗冯쏐䐏ϋ䕏㯊岯㯗嘯돕䏯篊嚏䏊ⳏ㯔䬯폔喏珋䎯比彯\ufbd0喏ꏑ崏돈䕏诊僯鏈僯揕⸏\uebc9姏鏊媯ﯖ⧯⏊勯ϋ䌏Ꮧ嫯寈媯受呏篊ℯ䯗䚯ꏔ⳯ோ帯揕∯ϊ嶯珋䎏Ꮤ嗯鯊䘯ϖ娏毖刏\uebd6嶯揖䍯ﯗ䑯寔䓯\uebd2\u2dcf폗倏ꯊ囏揗⊯ோ夏믗䔯㏈囯㯑⸏\uf3d5⾏⏈⤏믔⣏\udbd2⪏ϕ廯돊䍯쯕坯믖倯ϑ幏揖⾯ꏋ宏㯑孯诋⿏诋彏㏕⋏믊哏돊⃯揕䓏珖嚏寖埯篕忯寖噏⯕Ⅿ쯉⫯诈∯篑⨯又⦏取嘯毖⽯䏕埏揗䙯ꯖ⨯菗娏珑ⷯꏋ䕯⏋䭏폕⳯⯋倏篕夏⏊ⵯ鏑䁏⏕⢏䯋孏폔⩏ꯔ嶏ϔ\u20cf\u0bd1宏鏊吏揗倏\uf3d0✯鯖廯Ꮚ⠯\ue3d7䙏寋劏菊嵏\uebc9婏ϗ⽏\uf3d0䍏䯖⥏鯑巯믗哏쏔嬏ꯕⰏௐ奯诋嚏ϊ⊯\ufbd2唏쯉䗏ᯔ喏⯖⧏⏋䕏篔䭯ோ倏⯋姏䯊ℯᯖ䚏ᯑ䯯ﯖ帯폋⧯ꏖ嚏ϕ䔯ꏗⴏꯖ咯ோ䚯䏑⪯菋䗯⯋岯䯈䔏ꏕ⥯揊⥏毖䐯ꏕ娏ꯔ圏珑⊏ꯋ呏寕嘯폖ⳏ\ufbc9剏Ꮤ䚯寑嚯菖幯鏕僯ﯔ嫏\ufbc9䖯菑䐏\uebd6⃯\udbd7劏㏑坏\ufbd0帏䏕哯䯑䔏⏔䛏쏗夏诖彏䏕䔯쏖䛯又䀏믑婏㏖ℏ믑䮏㏔\u2fef寈媯篕⻏ϔ奏\ue3d6嫏돗嚏䏊䑏揖嗏诊⤏\ue3d5䒏\udbd2䔏揕嬯叕崏믕➯寊⩯\uf3d6寯揈Ⰿ诊兏篑䗏\uf3d5婯⯔嫏Ꮡ⣏⏖≏㯑䗏发䍏䯈⟯폗⺯Ꮦ問Ꮤ寏ꯈ倏㏑启䯔⨏Ꮛ䓯\uebd5䮯揗娯ﯗⰯ又庯诈↯寗劯㯔偯毈厏㯕垯䯕䎯ꏊ喏믔倏ꯈ哏揕䗯\u0bd1孯평囯毑\u208fᯖ像㏗ⲯ珈⺯ꯈ≏寖⪯\uf3d4₯\ufbd0ⶏ鏕⢯友⋯鯊副⯊堏鯊咯㏑⢏ொ崯ϗ傏⯈⥯篑嚏Ꮛ塏比⣯\ufbd0勯鏖塯ﯔ\u218f译噏\u0bd4廏쏖≯\uf3d5䭯폋兏䏋寯ꯕ⇯ϗ⥯鯗⇏ꏋ∏䯔⾏䏕⤯폐䚏⏊坏믑寯믗屯比嗯Ꮥ幯䏗⡏鯖墯ᯐ\u2e6f䯔Ⱟ鏊式鯊崯믕岯寗勏폕墯毋冏寗⫏쏔嬏Ꮤ䒏䏖减⏕孏쏋孏珑䭏\uf3d2勏珕启믔䙏쯕䬯㏈墏Ꮦ⨏菔䛯菈䕯㏕哏寔尯鯕\u2e6f揔䚯\ufbd0冯폐䏏\ue3d5䛏폐圏㏋壏菊問Ꮤ䏏珕⇯鯊Ⅿ揊≯䏕䬯쯖䏏篔䍏믗喏믔\u208f\uf3d6堯돖剏䏋⪯쏉偯ꯑ岯ﯔ孏诊\u2daf毋䕯菈⊏比↯䯕妏䯔勏鯊婯돗匏Ꮛ埏\ue3d5Ɐ䯗⠯\udbd5孯㏋匯揕唏폋兏䯕⨯寔彯돕嗏篈⡏诋嫏寑囏\ufbc9䑏ꯗ䚏揖❏⏈坏篑䯯䯑彯돕∯\udbd2徏돑⫏ꏈ䙏ϑ䘏篊⩯㏗嚏⯈ⳏ珕媏寖䒯⯊䚯珖媯믖⥯珗儯ϗ䯯䯔嗯쯐✯菊唯珑\u2d2f⏑\u2d2f受\u2daf鏕宏Ꮥ式ꏕ䐯\uf3d6䒯毖䌏⏖\u2e6f䯖Ⅿ䯊寏\udbd7刯\udbd5嗏\uebd0⾯믋⡏菈⠏毋凯揕⽏ϋ堏\uf3d5ⴏ\uebd4䭯揋⤏믊⫯Ꮡ劏揕喯㏑ⵯ⯑喯쯉⢯⏋䏏ꯊ匏쏖劯Ꮡ⇏鏋嫯䯈⪯菊⻏돔\u208f\uebd0ⷯϖ夯돈⽯쏕勏菗嘯鯗➯ﯔ⊏쯐媏\u0bd4喏ꯊ⅏돋偯毖奏䯊⧏\ue3d4ⱏ䏕刯篔䓯篊垯篑䒯䏊嫏돔⢯䏈嫯毗䚏诔嫯폋䛏ϖ⿏\ue3d6呏\uebd0ℯ쏉哏돊圯\rṩ䩁Щ먻ᓩ懲\u05c9婄ᘉᩅᛩ쩅ѩ"
         .length();
      String var13 = "ҽ坏篔嫯鏖䬯⏑夯鏖唏寊✯돑Ⱟ⯖减及嫯\ue3cb\u2e6f揕䏯珈卯ﯖ⊯ௐ䛏䏔序\uf3d5∯寈⧏毖墯取䛯䏔≏㏕厏菑儯ϑ咏ꏕ弯돗䓏㏖式㯗⳯毗兏\u0bd1⧏寕刏䯈䀏ꏖ䚯揈厯䯕䐯쏕⫯폖⹏䯖Ⅿ\ue3d7卯及啯㯈喏㯔厏\uf3d4劯\u0bd1徯⏈䔏돑嚯取⣯珈Ⅿ\ue3d5巯寈嚯䯑⼏⯊唏寑∏㯕副寑≏ꯊ咏揖䮏\uebd0娏ꯔ⽯㯈厏돗娏ϕ倯쯐⋏Ꮚ妏䏖䐏ꯖ儏믕堏㯋唏ᯋ峯毗䒏鯗䭯鏊⺯篋徯鯑⤏ொ䔯菕䭯ﯕ䗏폖\u2d2fꏋ囯毑䚯\uf3d5\u208f鯔小ϖ⪯쏉壯⏋䮏쯋婯䏊ⶏ⯔䌯\uf3d5嚏珋䮏ோ垯篋忏ϑ儏\uebd6倯쯐壏䏕卯쯋堯鏗庯㏖吏⯗呏䏋孯⯋坯ﯗ哯菋⳯又帯ϕⅯ鯗峯⯕䘏寖协寋ⵏ\udbc9⠏\uebd4⊏\ufbd2像菋䕏诈⪯폖䒏믖⠏㏊徏珕冏菗寏\uebd2ⶏ\ufbd2堯⏕岏菔䚯珗喯篑娏鯈傏受⢯⏋⫯诖媏菈Ɐ⯊❏寑劏毋匯ϊ凯ϔ⻯\u0bd6娏鯕嬏\udbc9\u2daf⏋⼏⯗傏受⋏쯐Ɐꯖ⳯ꏕ呏䏊劯Ꮛ䏏揋䙏\uf3d7\u2e6f受嘯篗嘯\ue3c9孏揊忏诈⩏ﯗ⺯珔启菈≯ᯖⰏ䏔姯诗❏\u0bd5喏ꯖ✏㏋⠯篖屏䯈⫯⏋⡯䯕䎯篗孯ᯕ↯篕䛯쏋劏ꏔ➯䏊姏ꯗ嫏ﯗ壯㏋协\uf3d4匏菑䓏毋像又劏ꏈ姯揊⟏珈⥏\ue3c9堯Ꮧ䏏篈⼏폒䛏폕忏\ue3cb峏돗冯쏐䐏ϋ䕏㯊岯㯗嘯돕䏯篊嚏䏊ⳏ㯔䬯폔喏珋䎯比彯\ufbd0喏ꏑ崏돈䕏诊僯鏈僯揕⸏\uebc9姏鏊媯ﯖ⧯⏊勯ϋ䌏Ꮧ嫯寈媯受呏篊ℯ䯗䚯ꏔ⳯ோ帯揕∯ϊ嶯珋䎏Ꮤ嗯鯊䘯ϖ娏毖刏\uebd6嶯揖䍯ﯗ䑯寔䓯\uebd2\u2dcf폗倏ꯊ囏揗⊯ோ夏믗䔯㏈囯㯑⸏\uf3d5⾏⏈⤏믔⣏\udbd2⪏ϕ廯돊䍯쯕坯믖倯ϑ幏揖⾯ꏋ宏㯑孯诋⿏诋彏㏕⋏믊哏돊⃯揕䓏珖嚏寖埯篕忯寖噏⯕Ⅿ쯉⫯诈∯篑⨯又⦏取嘯毖⽯䏕埏揗䙯ꯖ⨯菗娏珑ⷯꏋ䕯⏋䭏폕⳯⯋倏篕夏⏊ⵯ鏑䁏⏕⢏䯋孏폔⩏ꯔ嶏ϔ\u20cf\u0bd1宏鏊吏揗倏\uf3d0✯鯖廯Ꮚ⠯\ue3d7䙏寋劏菊嵏\uebc9婏ϗ⽏\uf3d0䍏䯖⥏鯑巯믗哏쏔嬏ꯕⰏௐ奯诋嚏ϊ⊯\ufbd2唏쯉䗏ᯔ喏⯖⧏⏋䕏篔䭯ோ倏⯋姏䯊ℯᯖ䚏ᯑ䯯ﯖ帯폋⧯ꏖ嚏ϕ䔯ꏗⴏꯖ咯ோ䚯䏑⪯菋䗯⯋岯䯈䔏ꏕ⥯揊⥏毖䐯ꏕ娏ꯔ圏珑⊏ꯋ呏寕嘯폖ⳏ\ufbc9剏Ꮤ䚯寑嚯菖幯鏕僯ﯔ嫏\ufbc9䖯菑䐏\uebd6⃯\udbd7劏㏑坏\ufbd0帏䏕哯䯑䔏⏔䛏쏗夏诖彏䏕䔯쏖䛯又䀏믑婏㏖ℏ믑䮏㏔\u2fef寈媯篕⻏ϔ奏\ue3d6嫏돗嚏䏊䑏揖嗏诊⤏\ue3d5䒏\udbd2䔏揕嬯叕崏믕➯寊⩯\uf3d6寯揈Ⰿ诊兏篑䗏\uf3d5婯⯔嫏Ꮡ⣏⏖≏㯑䗏发䍏䯈⟯폗⺯Ꮦ問Ꮤ寏ꯈ倏㏑启䯔⨏Ꮛ䓯\uebd5䮯揗娯ﯗⰯ又庯诈↯寗劯㯔偯毈厏㯕垯䯕䎯ꏊ喏믔倏ꯈ哏揕䗯\u0bd1孯평囯毑\u208fᯖ像㏗ⲯ珈⺯ꯈ≏寖⪯\uf3d4₯\ufbd0ⶏ鏕⢯友⋯鯊副⯊堏鯊咯㏑⢏ொ崯ϗ傏⯈⥯篑嚏Ꮛ塏比⣯\ufbd0勯鏖塯ﯔ\u218f译噏\u0bd4廏쏖≯\uf3d5䭯폋兏䏋寯ꯕ⇯ϗ⥯鯗⇏ꏋ∏䯔⾏䏕⤯폐䚏⏊坏믑寯믗屯比嗯Ꮥ幯䏗⡏鯖墯ᯐ\u2e6f䯔Ⱟ鏊式鯊崯믕岯寗勏폕墯毋冏寗⫏쏔嬏Ꮤ䒏䏖减⏕孏쏋孏珑䭏\uf3d2勏珕启믔䙏쯕䬯㏈墏Ꮦ⨏菔䛯菈䕯㏕哏寔尯鯕\u2e6f揔䚯\ufbd0冯폐䏏\ue3d5䛏폐圏㏋壏菊問Ꮤ䏏珕⇯鯊Ⅿ揊≯䏕䬯쯖䏏篔䍏믗喏믔\u208f\uf3d6堯돖剏䏋⪯쏉偯ꯑ岯ﯔ孏诊\u2daf毋䕯菈⊏比↯䯕妏䯔勏鯊婯돗匏Ꮛ埏\ue3d5Ɐ䯗⠯\udbd5孯㏋匯揕唏폋兏䯕⨯寔彯돕嗏篈⡏诋嫏寑囏\ufbc9䑏ꯗ䚏揖❏⏈坏篑䯯䯑彯돕∯\udbd2徏돑⫏ꏈ䙏ϑ䘏篊⩯㏗嚏⯈ⳏ珕媏寖䒯⯊䚯珖媯믖⥯珗儯ϗ䯯䯔嗯쯐✯菊唯珑\u2d2f⏑\u2d2f受\u2daf鏕宏Ꮥ式ꏕ䐯\uf3d6䒯毖䌏⏖\u2e6f䯖Ⅿ䯊寏\udbd7刯\udbd5嗏\uebd0⾯믋⡏菈⠏毋凯揕⽏ϋ堏\uf3d5ⴏ\uebd4䭯揋⤏믊⫯Ꮡ劏揕喯㏑ⵯ⯑喯쯉⢯⏋䏏ꯊ匏쏖劯Ꮡ⇏鏋嫯䯈⪯菊⻏돔\u208f\uebd0ⷯϖ夯돈⽯쏕勏菗嘯鯗➯ﯔ⊏쯐媏\u0bd4喏ꯊ⅏돋偯毖奏䯊⧏\ue3d4ⱏ䏕刯篔䓯篊垯篑䒯䏊嫏돔⢯䏈嫯毗䚏诔嫯폋䛏ϖ⿏\ue3d6呏\uebd0ℯ쏉哏돊圯\rṩ䩁Щ먻ᓩ懲\u05c9婄ᘉᩅᛩ쩅ѩ";

      do {
         char var19 = var13.charAt(var17);
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();
         int var21 = 0;

         do {
            char var22 = var20[var21];
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 5 | var22 << 11) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 5 | var22 >>> 11) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      IIII = var15;
      IIIl = new Object[var15.length];
      int var9 = -714783225;
      byte[] var7 = "0d\fåp±\u000enl\u001dÅo\u001afe\u0015DsP\u0089¬Æ'Ê\u008e<&Ü2QÒ\u009e@[â\u001b\u0095úÙ\u009b\u001b\\H\u0015¼'¥¢«\u0010\u0001D\u00006;q\u0088\u008d(ýÙ\bÐ[q;ý(©\u0007s\u00831ó\u0003Ñ¶\u0094³óê\u0095\u008f\u0014z\u0019äS«_\u001c°ãf½®úFñKÏß\u0005®ë®\u001cúRrÀ,u²=¦}=¾FI¶)\u009f=#\u0087[û®ÐÄlb½ÙÄÿz=\u0017®¯Df5¶ú?=\u0014êñójgé\u0087Ñµh/YNÊ\u008c ß»õ*òÂÉ*ÚI\u0016íã®«ÿ\u0003\u000b!åÐèP\u0088\u0083ùw\u000e'Øãr\u0081`fñð)É½\u008axg±Â#ì\u0085.[ÓôEH5½ \u0019$lé³\u0012¥ÎÑZNª¯\u0081<ÿR\u008fú7ZÞE\u0090¡ÂTe8DÉåÀÿJ\u0006\u0006h·\u0088\u0082\u0001tA]×V\u0080\u009b\u001aÈ\u001dÀqµ\u008c?#`åÙ>§¦DÀ\u009d{íg\f9kpÀÄ;eýsØ¦\u009f£ÿ\u0095 \u0092T\f=\u00ad'\u0080Cý«Ïðý`·ò\u008f`*F\u008e\u0086Ú*;¾Ù\u00170\u0000]f\u0084Nä\u0082ÕRÜr¦Ë\u0093w\u0092\u008d²\u0016~\u0015¬]\u0085ß\u0090\u0099Û&Àó%Lé~.üa,ÏL[\u0082POØð¢ÖãC\nLô\"Â\u0015Ø\u008anx{ÈÚ\u0082{Èn\u009eð%ÆnÝ\u0000ù\u009fÁÔaêO|\u007féäë'·ÓØs\u009dï\u0003\u0097\u009c\u0090\u001d\u0012\r\u009f1jä\u009dhä÷w¸xqÐ\u0013Ïç@ü\u0017Iä>9óôÇãál\u008f\u000b\u0085\u0096æ!sÃ¸Éù:$÷¹|\u0019i\u008a~·-kçÊ \u0013üÕ?\u0005îbxïS¼$R\bJðb\n\u0086\u008d©ÈÉ¼Õ|Ý<g8Æ\u0016n6®5\u008f\u008dr;k0\u0084Å|¸ûª[j\"\u008bÝ¿,ÆÏÎÁ\u000f\u00133o±3NMÊá-¢é\u00150Lê^\u0018À\bûÆ\u001c\u0098|p\u0091ýéú\u0087¬\u0006\u0003?F\u007f/såøî$wtP\u001f\u001a\u0014B\u001dSVF<\u0085\u009eÑe-¡ð/¾\r1ÔÆ~\u008d\u0099ßjé\u001fò\u000f°Ç/¶g\u0002Ë´\u0093«b¼\u0010\u001c*æ\u0099.\u009fR\u0015¯`4\nÎ\u0094³\u001a;ç]ät%¯\u0016V3Â6OH\u0097\u008eØú4ÍG\u0088\u0019\u0097*\u008e\u00adôX\u009cY;\u001e~ÇÇÛÛ\u0019r\n~ê\u0004ÔSþ `ÞBfÁ\u0018éíàý®¢üc\fv£],µlâRsb»\u009d\u0018\u0002(1\u0018[k\u001aoS[\u0087\u009fn\\<¹\u008e½³\u0092Îjlîæ\u0000\u0001Úá±þ\u0097ñÐG\u0006:+\f¥«ô\u001d±,'8\u009c\u0088S\u008dý¨^\u0013cÍEÕßîÊ6\u008dÔ2÷I§Út\fK¾úÅlC\u0087ÀãÈ\u0083w\u0010#\u0014}c¹d\n.ìL?å\u0000\u001c\u0018\u0011e\u000fÞy÷&¨\u008amó'æÛG\u0086ÃÇOÞÏ¶Ê0\u0097\u0012ç|\u0015¶\u000fá.1¯x÷¿¦º\rû·Ó*\u0017z{`¹\u001eJ\u009e\u0098h\u0088¼J\u0004c\u008dßì×X:2æ\u009fö\u0013¿3èô@Æ½-øCûaÙ=;Ä\u0093`\u0005F\bþ>\u0081ç|rúÿËÝ\u001f.Vþë\"\u0017»¥¡A|«\u001c)U$(¬J(\u0003QÃL$ýÃv^ß\u0005@q<å¢Õq@\u0089¤-y{ÍÊ!L\u008c\u009fG$un\u0083\u0000¶#Wº\u000fÆ\u009dÌø\u0013`MR\u0083X%FDA)\u0097\u0015ÈS[õqQ\u007f\u00839Bó\u007f\"N6\u001e,\u0098dN\u000e9\u00950~Þÿu6Æ/azÚ×û÷\u0082\u0004\noÕDp\u0005Dq\u001d\u000fÄúy©I\u0011ÿq£HÉý%¥%\u00adÉU\u0017vyù\u0004Üv0\u0003¡ÐÞWnÛ³a\u008b\"\u0097Þs\u008c=k¹\u000bC3{Üéç#É\u0089\u0093\u00adbNs\u0092Qc«\u008aØ;\f\u008aÁA¶Å§«Â7À¡\u0086ô%\u0086\u0000Ù7.w>\u0006\u001f²¢Ò\u0087\u0002L¿]\u0089[:Ï´\u0094e>¥\u0088é\u0006jH÷htý\"x\\\u0082\u0087@>\u0003H\u00018WÄ]\u0007U1¼@´3cà~?´·\u0087\u0010;GWpÉ\u0016\u001e*µï¡KDÀÆ9@\u0081\u0000\u0097·ÑÃC'D¯{ý+\u0018<\u0007+<tòÜ¹OÜØ\u0016\u0018\\À\u001b¦>s>\u0015\u0094~R\u0092EÁ#X:»\u0082»\u0014£'â\u0082)?ìðOÂg\u0013Ó[Å(\"U9\u007fÞzìô<E2óQçûonnU\u000f¯Rñ\u000bu_,fªÓ^\u0017|}A\u0081£.ù3\r /°Ç\u0085Ê\u009a\u00ad\u008b\u0006\u001f\u008bqEH\u0098LY´^\u0085Á\u0011\u000e!4ÇÉo\u008cê É\u0093\u0017[¬µÃßI!Ó\u0081DVÜ\"]oF\u0000WÜ\u009c_l¬íú\u0012 \u0017\u008f^%\u0012\u0014\u001cÁ\u0001@À\u0099?¨¡\u0010ëþ\u0001m§g}oh\fÿý\u0010Âìb\u0001\u0087ùË\u0006+\u008b£½ôòS÷\u0093K(°èà\u0017¸A\u008aÉîæ\u0006óÀ\u0002\u0017k\u0086À\t·J\u0090D¸¾\u0085\u0088û\u0007®è!o©\u009c\\©T\u001dÓ\u008e1\u0015Â²SvM @Ý©ÙÙbG\u0013,-\u008f\u007fíT\u0004ëYy7Ó#ç_nÙ]´\rº©jE'öãâ\u0000\u0001E\u0083¼&G`\u0081È \u008bª\u008eyMôú"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      lll = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         lll[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var5 = new String[IllI(729282906, var23 ^ 1508583385)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = Illl(15935, var23 ^ 1735714657, '㘯')).length();
      int var1 = IllI(729282907, var23 ^ 423503231);
      int var25 = -1;

      label86:
      while (true) {
         int var10000 = IllI(729282904, var23 ^ 93515424);
         String var10001 = var2.substring(++var25, var25 + var1);
         byte var35 = -1;

         while (true) {
            label81: {
               char[] var44 = var10001.toCharArray();
               int var10004 = var44.length;
               int var6 = 0;
               int var47 = var10000;
               var40 = var44;
               int var33 = var10004;
               char[] var56;
               int var10006;
               if (var10004 <= 1) {
                  var56 = var44;
                  var10004 = var10000;
                  var10006 = var6;
               } else {
                  var47 = var10000;
                  var33 = var10004;
                  if (var10004 <= var6) {
                     break label81;
                  }

                  var56 = var44;
                  var10004 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var56[var10006] = (char)(var56[var10006] ^ var10004 ^ switch (var6 % IllI(729282908, var23 ^ -407695919)) {
                     case 0 -> IllI(729282909, var23 ^ 1541339577);
                     case 1 -> 2;
                     case 2 -> IllI(729282898, var23 ^ 701811103);
                     case 3 -> IllI(729282899, var23 ^ -59379106);
                     case 4 -> IllI(729282896, var23 ^ 1926456103);
                     case 5 -> IllI(729282897, var23 ^ -710373817);
                     default -> IllI(729282902, var23 ^ -1029756213);
                  });
                  var6++;
                  if (var47 == 0) {
                     var10006 = var47;
                     var56 = var40;
                     var10004 = var47;
                  } else {
                     if (var33 <= var6) {
                        break;
                     }

                     var56 = var40;
                     var10004 = var47;
                     var10006 = var6;
                  }
               }
            }

            String var49 = new String(var40).intern();
            switch (var35) {
               case 0:
                  var5[var3++] = var49;
                  if ((var25 += var1) >= var4) {
                     III = var5;
                     lI = new String[IllI(729282911, var23 ^ -985068301)];
                     var10000 = IllI(729282903, var23 ^ 1773733768);
                     II = LoggerFactory.getLogger(llllIlII.class);
                     l = IlIIllIII.Ill(IIll(var10000, IllI(729282900, var23 ^ -519952515)));
                     IIl = IlIIllIII.Ill(IIll(IllI(729282901, var23 ^ -1333269281), IllI(729282890, var23 ^ 414505126)));
                     IlI = IlIIllIII.Ill(IIll(IllI(729282891, var23 ^ -1064808669), IllI(729282888, var23 ^ 1484533597)));
                     lIl = IlIIllIII.Ill(IIll(IllI(729282889, var23 ^ -551841961), IllI(729282894, var23 ^ -2095489486)));
                     llI = IlIIllIII.Ill(IIll(IllI(729282895, var23 ^ 328653048), IllI(729282892, var23 ^ -1026544824)));
                     Il = IlIIllIII.Ill(IIll(IllI(729282893, var23 ^ -1964408565), IllI(729282882, var23 ^ -1815473814)));
                     ll = IlIIllIII.Ill(IIll(IllI(729282883, var23 ^ -1504691939), IllI(729282880, var23 ^ -2111739674)));
                     I = new WeakReference<>(null);
                     return;
                  }

                  var1 = var2.charAt(var25);
                  break;
               default:
                  var5[var3++] = var49;
                  if ((var25 += var1) < var4) {
                     var1 = var2.charAt(var25);
                     continue label86;
                  }

                  var4 = (var2 = Illl(15934, var23 ^ -1355038953, '灘')).length();
                  var1 = IllI(729282905, var23 ^ 1944669702);
                  var25 = -1;
            }

            var10000 = IllI(729282910, var23 ^ 771521293);
            var10001 = var2.substring(++var25, var25 + var1);
            var35 = 0;
         }
      }
   }

   private static String IIll(int var0, int var1) {
      int var9 = 923042075;
      int var2 = (var0 ^ IllI(729282852, var9 ^ -642013193)) & IllI(729282853, var9 ^ 1692485259);
      if (lI[var2] == null) {
         char[] var3 = III[var2].toCharArray();

         int var4 = switch (var3[0] & IllI(729283034, var9 ^ 1424131337)) {
            case 0 -> IllI(729283035, var9 ^ -1625240994);
            case 1 -> IllI(729283032, var9 ^ -476786414);
            case 2 -> IllI(729283033, var9 ^ 1372636634);
            case 3 -> IllI(729283038, var9 ^ 1490985589);
            case 4 -> IllI(729283039, var9 ^ -1184534039);
            case 5 -> IllI(729283036, var9 ^ 1574471880);
            case 6 -> IllI(729283037, var9 ^ 1246820440);
            case 7 -> IllI(729283026, var9 ^ 1837248188);
            case 8 -> IllI(729283027, var9 ^ -346611553);
            case 9 -> IllI(729283024, var9 ^ -114900253);
            case 10 -> IllI(729283025, var9 ^ 635134759);
            case 11 -> IllI(729283030, var9 ^ 94781821);
            case 12 -> IllI(729283031, var9 ^ -674913990);
            case 13 -> IllI(729283028, var9 ^ 601378587);
            case 14 -> IllI(729283029, var9 ^ 1760611354);
            case 15 -> IllI(729283018, var9 ^ -852615326);
            case 16 -> IllI(729283019, var9 ^ 1251515884);
            case 17 -> IllI(729283016, var9 ^ -552432691);
            case 18 -> IllI(729283017, var9 ^ 820722876);
            case 19 -> IllI(729283022, var9 ^ 1237811038);
            case 20 -> IllI(729283023, var9 ^ -838457276);
            case 21 -> IllI(729283020, var9 ^ 1119359906);
            case 22 -> IllI(729283021, var9 ^ 581570819);
            case 23 -> IllI(729283010, var9 ^ 1622032155);
            case 24 -> IllI(729283011, var9 ^ -1472632527);
            case 25 -> IllI(729283008, var9 ^ -1760025625);
            case 26 -> IllI(729283009, var9 ^ 1004132535);
            case 27 -> IllI(729283014, var9 ^ 1214616923);
            case 28 -> IllI(729283015, var9 ^ 1543576630);
            case 29 -> IllI(729283012, var9 ^ 962120448);
            case 30 -> IllI(729283013, var9 ^ -2138111728);
            case 31 -> IllI(729283066, var9 ^ -2105825493);
            case 32 -> IllI(729283067, var9 ^ -1963454312);
            case 33 -> IllI(729283064, var9 ^ -797891964);
            case 34 -> IllI(729283065, var9 ^ 1694344190);
            case 35 -> IllI(729283070, var9 ^ 48415428);
            case 36 -> IllI(729283071, var9 ^ -2047723616);
            case 37 -> IllI(729283068, var9 ^ 1795979357);
            case 38 -> IllI(729283069, var9 ^ -1711384048);
            case 39 -> IllI(729283058, var9 ^ -186757915);
            case 40 -> IllI(729283059, var9 ^ -1587096463);
            case 41 -> IllI(729283056, var9 ^ 35996764);
            case 42 -> IllI(729283057, var9 ^ 796862127);
            case 43 -> IllI(729283062, var9 ^ -1692642261);
            case 44 -> IllI(729283063, var9 ^ 1876106651);
            case 45 -> IllI(729283060, var9 ^ -248522790);
            case 46 -> IllI(729283061, var9 ^ 798623480);
            case 47 -> IllI(729283050, var9 ^ -588458074);
            case 48 -> IllI(729283051, var9 ^ -934780100);
            case 49 -> IllI(729283048, var9 ^ 1955515652);
            case 50 -> IllI(729283049, var9 ^ -553262334);
            case 51 -> IllI(729283054, var9 ^ -1739915338);
            case 52 -> IllI(729283055, var9 ^ 983478075);
            case 53 -> IllI(729283052, var9 ^ 442327245);
            case 54 -> IllI(729283053, var9 ^ 1687904619);
            case 55 -> IllI(729283042, var9 ^ -1410331013);
            case 56 -> IllI(729283043, var9 ^ 133191536);
            case 57 -> IllI(729283040, var9 ^ 747065495);
            case 58 -> IllI(729283041, var9 ^ -1317573202);
            case 59 -> IllI(729283046, var9 ^ 173116761);
            case 60 -> IllI(729283047, var9 ^ -2055552506);
            case 61 -> IllI(729283044, var9 ^ 1510402687);
            case 62 -> IllI(729283045, var9 ^ 926081663);
            case 63 -> IllI(729282970, var9 ^ -931136203);
            case 64 -> IllI(729282971, var9 ^ 1911437013);
            case 65 -> IllI(729282968, var9 ^ 978167708);
            case 66 -> IllI(729282969, var9 ^ 727261383);
            case 67 -> IllI(729282974, var9 ^ 242517113);
            case 68 -> IllI(729282975, var9 ^ -1156207633);
            case 69 -> IllI(729282972, var9 ^ 629915998);
            case 70 -> IllI(729282973, var9 ^ -482876899);
            case 71 -> IllI(729282962, var9 ^ 6674654);
            case 72 -> IllI(729282963, var9 ^ -1046369396);
            case 73 -> IllI(729282960, var9 ^ 1122256704);
            case 74 -> IllI(729282961, var9 ^ -869437459);
            case 75 -> IllI(729282966, var9 ^ -1322717239);
            case 76 -> IllI(729282967, var9 ^ -1247865963);
            case 77 -> IllI(729282964, var9 ^ 580218722);
            case 78 -> IllI(729282965, var9 ^ 1390551788);
            case 79 -> IllI(729282954, var9 ^ 2060970282);
            case 80 -> IllI(729282955, var9 ^ 720376570);
            case 81 -> IllI(729282952, var9 ^ 959871577);
            case 82 -> 0;
            case 83 -> IllI(729282953, var9 ^ 272665030);
            case 84 -> IllI(729282958, var9 ^ -976229825);
            case 85 -> IllI(729282959, var9 ^ 1903083621);
            case 86 -> IllI(729282956, var9 ^ 2033632108);
            case 87 -> IllI(729282957, var9 ^ -52913175);
            case 88 -> IllI(729282946, var9 ^ -778823227);
            case 89 -> IllI(729282947, var9 ^ 956899941);
            case 90 -> IllI(729282944, var9 ^ -1718553566);
            case 91 -> IllI(729282945, var9 ^ -1873670557);
            case 92 -> IllI(729282950, var9 ^ -2126829105);
            case 93 -> IllI(729282951, var9 ^ 1284730060);
            case 94 -> IllI(729282948, var9 ^ 681742951);
            case 95 -> IllI(729282949, var9 ^ 1583394844);
            case 96 -> IllI(729283002, var9 ^ 848003457);
            case 97 -> IllI(729283003, var9 ^ -633381990);
            case 98 -> IllI(729283000, var9 ^ 68064062);
            case 99 -> IllI(729283001, var9 ^ 626474945);
            case 100 -> IllI(729283006, var9 ^ -1029125399);
            case 101 -> IllI(729283007, var9 ^ 454053804);
            case 102 -> 4;
            case 103 -> IllI(729283004, var9 ^ 1462841712);
            case 104 -> IllI(729283005, var9 ^ -226792441);
            case 105 -> IllI(729282994, var9 ^ 1893790316);
            case 106 -> IllI(729282995, var9 ^ -1223724998);
            case 107 -> IllI(729282992, var9 ^ -870856947);
            case 108 -> IllI(729282993, var9 ^ 700865085);
            case 109 -> IllI(729282998, var9 ^ -573957217);
            case 110 -> IllI(729282999, var9 ^ -1823915284);
            case 111 -> IllI(729282996, var9 ^ -1644944003);
            case 112 -> 2;
            case 113 -> IllI(729282997, var9 ^ 314613917);
            case 114 -> IllI(729282986, var9 ^ 518741376);
            case 115 -> IllI(729282987, var9 ^ 2060251556);
            case 116 -> IllI(729282984, var9 ^ 1085723458);
            case 117 -> IllI(729282985, var9 ^ 1989751011);
            case 118 -> IllI(729282990, var9 ^ -1807909562);
            case 119 -> IllI(729282991, var9 ^ -1085529733);
            case 120 -> IllI(729282988, var9 ^ 1294321175);
            case 121 -> IllI(729282989, var9 ^ 2053411741);
            case 122 -> IllI(729282978, var9 ^ 312304256);
            case 123 -> IllI(729282979, var9 ^ 912142265);
            case 124 -> IllI(729282976, var9 ^ -1930966329);
            case 125 -> IllI(729282977, var9 ^ -99606697);
            case 126 -> IllI(729282982, var9 ^ 2075823990);
            case 127 -> IllI(729282983, var9 ^ 330188796);
            case 128 -> IllI(729282980, var9 ^ 528423351);
            case 129 -> IllI(729282981, var9 ^ 1706292931);
            case 130 -> IllI(729282650, var9 ^ 1737985692);
            case 131 -> IllI(729282651, var9 ^ 1947955860);
            case 132 -> IllI(729282648, var9 ^ 2027822167);
            case 133 -> IllI(729282649, var9 ^ -1366539520);
            case 134 -> IllI(729282654, var9 ^ 259863086);
            case 135 -> IllI(729282655, var9 ^ -401115300);
            case 136 -> IllI(729282652, var9 ^ -255366038);
            case 137 -> IllI(729282653, var9 ^ -331352493);
            case 138 -> IllI(729282642, var9 ^ -1259599769);
            case 139 -> IllI(729282643, var9 ^ -475237770);
            case 140 -> IllI(729282640, var9 ^ 1922633913);
            case 141 -> IllI(729282641, var9 ^ -233671610);
            case 142 -> IllI(729282646, var9 ^ 2147086974);
            case 143 -> IllI(729282647, var9 ^ -1784626136);
            case 144 -> IllI(729282644, var9 ^ 323823668);
            case 145 -> IllI(729282645, var9 ^ -4385501);
            case 146 -> IllI(729282634, var9 ^ 1326516525);
            case 147 -> IllI(729282635, var9 ^ 1087901326);
            case 148 -> IllI(729282632, var9 ^ -432645504);
            case 149 -> IllI(729282633, var9 ^ -312777787);
            case 150 -> IllI(729282638, var9 ^ 343921534);
            case 151 -> IllI(729282639, var9 ^ -1160419691);
            case 152 -> IllI(729282636, var9 ^ 1034632867);
            case 153 -> IllI(729282637, var9 ^ -368973087);
            case 154 -> IllI(729282626, var9 ^ -10379701);
            case 155 -> 5;
            case 156 -> IllI(729282627, var9 ^ 1420197561);
            case 157 -> IllI(729282624, var9 ^ 1737205330);
            case 158 -> IllI(729282625, var9 ^ -288157965);
            case 159 -> IllI(729282630, var9 ^ -139871431);
            case 160 -> IllI(729282631, var9 ^ -1857826868);
            case 161 -> IllI(729282628, var9 ^ -162952401);
            case 162 -> IllI(729282629, var9 ^ 325976769);
            case 163 -> IllI(729282682, var9 ^ 29784708);
            case 164 -> IllI(729282683, var9 ^ 821539054);
            case 165 -> IllI(729282680, var9 ^ -462487538);
            case 166 -> 3;
            case 167 -> IllI(729282681, var9 ^ -1984590983);
            case 168 -> IllI(729282686, var9 ^ 203929323);
            case 169 -> IllI(729282687, var9 ^ 1406576687);
            case 170 -> IllI(729282684, var9 ^ -538023936);
            case 171 -> IllI(729282685, var9 ^ -1048544952);
            case 172 -> IllI(729282674, var9 ^ 345005786);
            case 173 -> IllI(729282675, var9 ^ -1314376795);
            case 174 -> IllI(729282672, var9 ^ 2129213996);
            case 175 -> IllI(729282673, var9 ^ -223016305);
            case 176 -> IllI(729282678, var9 ^ 122965388);
            case 177 -> IllI(729282679, var9 ^ 93056448);
            case 178 -> IllI(729282676, var9 ^ 157071914);
            case 179 -> IllI(729282677, var9 ^ 651381390);
            case 180 -> IllI(729282666, var9 ^ 1176574929);
            case 181 -> IllI(729282667, var9 ^ 475917820);
            case 182 -> IllI(729282664, var9 ^ 2108476697);
            case 183 -> IllI(729282665, var9 ^ 262701926);
            case 184 -> IllI(729282670, var9 ^ -1587553088);
            case 185 -> IllI(729282671, var9 ^ 1976518344);
            case 186 -> IllI(729282668, var9 ^ 1293231807);
            case 187 -> IllI(729282669, var9 ^ 183445037);
            case 188 -> IllI(729282658, var9 ^ 1109053874);
            case 189 -> IllI(729282659, var9 ^ 2033505682);
            case 190 -> IllI(729282656, var9 ^ 783601030);
            case 191 -> IllI(729282657, var9 ^ -1864994546);
            case 192 -> IllI(729282662, var9 ^ 595358704);
            case 193 -> IllI(729282663, var9 ^ -1532113908);
            case 194 -> IllI(729282660, var9 ^ 1859303930);
            case 195 -> IllI(729282661, var9 ^ -1912819984);
            case 196 -> IllI(729282586, var9 ^ -731241253);
            case 197 -> IllI(729282587, var9 ^ -635944356);
            case 198 -> IllI(729282584, var9 ^ 1375461088);
            case 199 -> IllI(729282585, var9 ^ -205508832);
            case 200 -> IllI(729282590, var9 ^ 261608377);
            case 201 -> IllI(729282591, var9 ^ -635686417);
            case 202 -> IllI(729282588, var9 ^ 68901941);
            case 203 -> IllI(729282589, var9 ^ -846765088);
            case 204 -> IllI(729282578, var9 ^ 1676124828);
            case 205 -> IllI(729282579, var9 ^ -941394106);
            case 206 -> 1;
            case 207 -> IllI(729282576, var9 ^ 445556514);
            case 208 -> IllI(729282577, var9 ^ 1761571258);
            case 209 -> IllI(729282582, var9 ^ 2003414597);
            case 210 -> IllI(729282583, var9 ^ -807731171);
            case 211 -> IllI(729282580, var9 ^ 425249308);
            case 212 -> IllI(729282581, var9 ^ -59592800);
            case 213 -> IllI(729282570, var9 ^ 821528233);
            case 214 -> IllI(729282571, var9 ^ 1939905141);
            case 215 -> IllI(729282568, var9 ^ 1868321578);
            case 216 -> IllI(729282569, var9 ^ -134675481);
            case 217 -> IllI(729282574, var9 ^ 36684963);
            case 218 -> IllI(729282575, var9 ^ -1174229572);
            case 219 -> IllI(729282572, var9 ^ -1509992730);
            case 220 -> IllI(729282573, var9 ^ -2094280050);
            case 221 -> IllI(729282562, var9 ^ 389778438);
            case 222 -> IllI(729282563, var9 ^ 1614032863);
            case 223 -> IllI(729282560, var9 ^ 1504579001);
            case 224 -> IllI(729282561, var9 ^ -361475359);
            case 225 -> IllI(729282566, var9 ^ -1710884966);
            case 226 -> IllI(729282567, var9 ^ 385843882);
            case 227 -> IllI(729282564, var9 ^ 335156745);
            case 228 -> IllI(729282565, var9 ^ -135705277);
            case 229 -> IllI(729282618, var9 ^ -1344820566);
            case 230 -> IllI(729282619, var9 ^ 637793155);
            case 231 -> IllI(729282616, var9 ^ 1531931334);
            case 232 -> IllI(729282617, var9 ^ 1501561130);
            case 233 -> IllI(729282622, var9 ^ -872886461);
            case 234 -> IllI(729282623, var9 ^ 1424591501);
            case 235 -> IllI(729282620, var9 ^ -34724110);
            case 236 -> IllI(729282621, var9 ^ -1789528353);
            case 237 -> IllI(729282610, var9 ^ 1696571064);
            case 238 -> IllI(729282611, var9 ^ 509142411);
            case 239 -> IllI(729282608, var9 ^ 558908342);
            case 240 -> IllI(729282609, var9 ^ -16325529);
            case 241 -> IllI(729282614, var9 ^ -987230219);
            case 242 -> IllI(729282615, var9 ^ 1567542718);
            case 243 -> IllI(729282612, var9 ^ -2120049198);
            case 244 -> IllI(729282613, var9 ^ -1906931463);
            case 245 -> IllI(729282602, var9 ^ -839933180);
            case 246 -> IllI(729282603, var9 ^ 394765322);
            case 247 -> IllI(729282600, var9 ^ 1782667735);
            case 248 -> IllI(729282601, var9 ^ -446284662);
            case 249 -> IllI(729282606, var9 ^ -195407523);
            case 250 -> IllI(729282607, var9 ^ 2076721908);
            case 251 -> IllI(729282604, var9 ^ -1624124376);
            case 252 -> IllI(729282605, var9 ^ 1912286744);
            case 253 -> IllI(729282594, var9 ^ -1181229031);
            case 254 -> IllI(729282595, var9 ^ 839078961);
            default -> IllI(729282592, var9 ^ 20655798);
         };
         int var5 = (var1 & IllI(729282593, var9 ^ 1770445602)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & IllI(729282598, var9 ^ -2098939951)) >>> IllI(729282599, var9 ^ 1554852508)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & IllI(729282596, var9 ^ -720764293);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & IllI(729282597, var9 ^ 1936440925);
            }
         }

         lI[var2] = new String(var3).intern();
      }

      return lI[var2];
   }

   private static String IlII(String var0) {
      if (var0 != null && !var0.isBlank()) {
         String[] var1 = var0.trim().split(IlIIllIII.lI(IIll(IllI(729282778, 1201931256 ^ 19405060), IllI(729282779, 1201931256 ^ -423561668))));
         StringBuilder var2 = new StringBuilder();

         for (String var6 : var1) {
            if (!var6.isBlank()) {
               if (var2.length() > 0) {
                  var2.append((char)IllI(729282776, 1201931256 ^ 1057323956));
               }

               String var7 = var6.toLowerCase(Locale.ROOT);
               var2.append(Character.toUpperCase(var7.charAt(0)));
               if (var7.length() > 1) {
                  var2.append(var7.substring(1));
               }
            }
         }

         return var2.toString();
      } else {
         return "";
      }
   }

   private static Throwable IlIl(Throwable var0) {
      return var0;
   }

   private llllIlII() {
   }
}
