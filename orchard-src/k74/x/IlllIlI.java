package k74.x;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.DosFileAttributeView;
import java.util.Map.Entry;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.minecraft.class_3675;
import net.minecraft.class_3675.class_306;

@Environment(EnvType.CLIENT)
public final class IlllIlI {
   private static final long II;
   private static final IIIlIlIl Il;
   private static final long lI;
   private static final Gson ll;
   private static final long III;
   private static final long IIl;
   private boolean IlI;
   private static final IIIlIlIl Ill;
   private static final IIIlIlIl lII;
   private static final long lIl;
   private static final long llI;
   private static final long lll;
   private static final IIIlIlIl IIII;
   private boolean IIIl;
   private JsonObject IIlI;
   private lllIIlIl IIll;
   private static final String[] IlII;
   private static final long IlIl;
   private static final IIIlIlIl IllI;
   private static final IIIlIlIl Illl;
   private static final IIIlIlIl lIII;
   private static final IIIlIlIl lIIl;
   private static final long lIlI;
   private static final long l;
   private static final long lIll;
   private static final IIIlIlIl llII;
   private static final IIIlIlIl llIl;
   private static final long lllI;
   private static final long llll;
   private static final long IIIII;
   private static final long IIIIl;
   private static final long IIIlI;
   private boolean IIIll;
   private static final long IIlII;
   private class_306 IIlIl;
   private static final long IIllI;
   private static final IIIlIlIl IIlll;
   private static final IIIlIlIl IlIII;
   private static final long IlIIl;
   private static final IIIlIlIl IlIlI;
   private static final IIIlIlIl IlIll;
   private static final IIIlIlIl IllII;
   private static final IIIlIlIl IllIl;
   private static final IIIlIlIl IlllI;
   private static final IIIlIlIl Illll;
   private volatile IIlIIll lIIII;
   private long lIIIl;
   private static final IIIlIlIl lIIlI;
   private static final long lIIll;
   private static final long lIlII;
   private static final int[] IIllll;
   private static final IIIlIlIl lIlIl;
   private static final IIIlIlIl lIllI;
   private static final IIIlIlIl lIlll;
   private static final IIIlIlIl llIII;
   private static final long llIIl;
   private final Path llIlI;
   private static final Object[] IlIIIl;
   private static final long llIll;
   private final Path lllII = FabricLoader.getInstance().getGameDir();
   private static final IIIlIlIl lllIl;
   private static final long llllI;
   private static final IIIlIlIl lllll;
   private static final long IIIIII;
   private static final IIIlIlIl I;
   private static final Gson IIIIIl;
   private FileSystem IIIIlI;
   private static final String[] IIIIll;
   private static final IIIlIlIl IIIlII;
   private static final IIIlIlIl IIIlIl;
   private static final long IIIllI;
   private static final long IIIlll;
   private static final IIIlIlIl IIlIII;
   private static final long IIlIIl;
   private class_306 IIlIlI;
   private static final IIIlIlIl IIlIll;
   private lllIllII IIllII;
   private static final String[] IlIIII;
   private static final IIIlIlIl IIllIl;
   private static final IIIlIlIl IIlllI;

   private Path I() throws IOException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual k74/x/IlllIlI.IIlI ()Ljava/nio/file/Path;
      // 04: astore 1
      // 05: aload 1
      // 06: ifnull 1b
      // 09: aload 1
      // 0a: bipush 0
      // 0b: anewarray 116
      // 0e: invokestatic java/nio/file/Files.isDirectory (Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
      // 11: ifne 21
      // 14: goto 1b
      // 17: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a: athrow
      // 1b: aconst_null
      // 1c: areturn
      // 1d: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: aload 1
      // 22: invokestatic java/nio/file/Files.list (Ljava/nio/file/Path;)Ljava/util/stream/Stream;
      // 25: astore 2
      // 26: aload 2
      // 27: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, k74/x/IlllIlI.IlIlII (Ljava/nio/file/Path;)Z, (Ljava/nio/file/Path;)Z ]
      // 2c: invokeinterface java/util/stream/Stream.filter (Ljava/util/function/Predicate;)Ljava/util/stream/Stream; 2
      // 31: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, k74/x/IlllIlI.IIlIl (Ljava/nio/file/Path;)Z, (Ljava/nio/file/Path;)Z ]
      // 36: invokeinterface java/util/stream/Stream.filter (Ljava/util/function/Predicate;)Ljava/util/stream/Stream; 2
      // 3b: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, k74/x/IlllIlI.lIlll (Ljava/nio/file/Path;)Z, (Ljava/nio/file/Path;)Z ]
      // 40: invokeinterface java/util/stream/Stream.filter (Ljava/util/function/Predicate;)Ljava/util/stream/Stream; 2
      // 45: aload 0
      // 46: invokedynamic applyAsLong (Lk74/x/IlllIlI;)Ljava/util/function/ToLongFunction; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)J, k74/x/IlllIlI.IIIIl (Ljava/nio/file/Path;)J, (Ljava/nio/file/Path;)J ]
      // 4b: invokestatic java/util/Comparator.comparingLong (Ljava/util/function/ToLongFunction;)Ljava/util/Comparator;
      // 4e: invokeinterface java/util/stream/Stream.max (Ljava/util/Comparator;)Ljava/util/Optional; 2
      // 53: aconst_null
      // 54: invokevirtual java/util/Optional.orElse (Ljava/lang/Object;)Ljava/lang/Object;
      // 57: checkcast java/nio/file/Path
      // 5a: astore 3
      // 5b: aload 2
      // 5c: ifnull 6c
      // 5f: aload 2
      // 60: invokeinterface java/util/stream/Stream.close ()V 1
      // 65: goto 6c
      // 68: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6b: athrow
      // 6c: aload 3
      // 6d: areturn
      // 6e: astore 3
      // 6f: aload 2
      // 70: ifnull 84
      // 73: aload 2
      // 74: invokeinterface java/util/stream/Stream.close ()V 1
      // 79: goto 84
      // 7c: astore 4
      // 7e: aload 3
      // 7f: aload 4
      // 81: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 84: aload 3
      // 85: athrow
   }

   public void II(lIIIlIlI param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/IlllIlI.lIIII Lk74/x/IIlIIll;
      // 04: astore 2
      // 05: aload 2
      // 06: ifnull 27
      // 09: aload 0
      // 0a: getfield k74/x/IlllIlI.IIIl Z
      // 0d: ifne 27
      // 10: goto 17
      // 13: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16: athrow
      // 17: aload 2
      // 18: invokeinterface k74/x/IIlIIll.l ()Z 1
      // 1d: ifne 2c
      // 20: goto 27
      // 23: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26: athrow
      // 27: return
      // 28: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b: athrow
      // 2c: aload 0
      // 2d: bipush 1
      // 2e: putfield k74/x/IlllIlI.IIIl Z
      // 31: aload 2
      // 32: invokeinterface k74/x/IIlIIll.I ()Ljava/lang/String; 1
      // 37: astore 3
      // 38: aload 3
      // 39: ifnonnull ae
      // 3c: aload 0
      // 3d: invokevirtual k74/x/IlllIlI.IIII ()Ljava/nio/file/Path;
      // 40: astore 4
      // 42: aload 4
      // 44: ifnull ad
      // 47: aload 4
      // 49: bipush 0
      // 4a: anewarray 116
      // 4d: invokestatic java/nio/file/Files.isRegularFile (Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
      // 50: ifeq ad
      // 53: goto 5a
      // 56: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 59: athrow
      // 5a: getstatic k74/x/IlllIlI.ll Lcom/google/gson/Gson;
      // 5d: aload 4
      // 5f: invokestatic java/nio/file/Files.readString (Ljava/nio/file/Path;)Ljava/lang/String;
      // 62: ldc com/google/gson/JsonElement
      // 64: invokevirtual com/google/gson/Gson.fromJson (Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
      // 67: checkcast com/google/gson/JsonElement
      // 6a: astore 5
      // 6c: aload 5
      // 6e: ifnull a8
      // 71: aload 5
      // 73: invokevirtual com/google/gson/JsonElement.isJsonObject ()Z
      // 76: ifeq a8
      // 79: goto 80
      // 7c: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7f: athrow
      // 80: aload 2
      // 81: getstatic k74/x/IlllIlI.ll Lcom/google/gson/Gson;
      // 84: aload 5
      // 86: invokevirtual com/google/gson/Gson.toJson (Lcom/google/gson/JsonElement;)Ljava/lang/String;
      // 89: invokeinterface k74/x/IIlIIll.II (Ljava/lang/String;)Z 2
      // 8e: ifeq a8
      // 91: goto 98
      // 94: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 97: athrow
      // 98: aload 0
      // 99: invokevirtual k74/x/IlllIlI.IllIll ()V
      // 9c: aload 0
      // 9d: bipush 1
      // 9e: putfield k74/x/IlllIlI.IIIl Z
      // a1: goto a8
      // a4: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a7: athrow
      // a8: goto ad
      // ab: astore 5
      // ad: return
      // ae: aload 0
      // af: bipush 1
      // b0: putfield k74/x/IlllIlI.IIIl Z
      // b3: getstatic k74/x/IlllIlI.ll Lcom/google/gson/Gson;
      // b6: aload 3
      // b7: ldc com/google/gson/JsonElement
      // b9: invokevirtual com/google/gson/Gson.fromJson (Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
      // bc: checkcast com/google/gson/JsonElement
      // bf: astore 4
      // c1: aload 4
      // c3: ifnull e6
      // c6: aload 4
      // c8: invokevirtual com/google/gson/JsonElement.isJsonObject ()Z
      // cb: ifeq e6
      // ce: goto d5
      // d1: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // d4: athrow
      // d5: aload 0
      // d6: aload 4
      // d8: invokevirtual com/google/gson/JsonElement.getAsJsonObject ()Lcom/google/gson/JsonObject;
      // db: aload 1
      // dc: invokevirtual k74/x/IlllIlI.IIlIIl (Lcom/google/gson/JsonObject;Lk74/x/lIIIlIlI;)V
      // df: goto e6
      // e2: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // e5: athrow
      // e6: goto eb
      // e9: astore 4
      // eb: aload 0
      // ec: invokevirtual k74/x/IlllIlI.IllIll ()V
      // ef: return
   }

   public lllIllII Il() {
      return this.IIllII;
   }

   private static String lI(JsonObject param0, JsonObject param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc_w 801259282
      // 03: istore 4
      // 05: aload 0
      // 06: invokestatic k74/x/IlllIlI.IIlIlI (Lcom/google/gson/JsonObject;)Z
      // 09: istore 2
      // 0a: aload 0
      // 0b: invokestatic k74/x/IlllIlI.IIIlII (Lcom/google/gson/JsonObject;)Z
      // 0e: istore 3
      // 0f: iload 2
      // 10: ifeq 41
      // 13: iload 3
      // 14: ifeq 41
      // 17: goto 1e
      // 1a: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: ldc_w 288491210
      // 21: iload 4
      // 23: ldc_w 1024363390
      // 26: ixor
      // 27: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 2a: ldc_w 288491211
      // 2d: iload 4
      // 2f: ldc_w -1021821641
      // 32: ixor
      // 33: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 36: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 39: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 3c: areturn
      // 3d: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 40: athrow
      // 41: iload 3
      // 42: ifeq 68
      // 45: ldc_w 288491208
      // 48: iload 4
      // 4a: ldc_w 1915735905
      // 4d: ixor
      // 4e: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 51: ldc_w 288491209
      // 54: iload 4
      // 56: ldc_w -1650684786
      // 59: ixor
      // 5a: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 5d: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 60: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 63: areturn
      // 64: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 67: athrow
      // 68: iload 2
      // 69: ifeq 8f
      // 6c: ldc_w 288491214
      // 6f: iload 4
      // 71: ldc_w -427006434
      // 74: ixor
      // 75: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 78: ldc_w 288491215
      // 7b: iload 4
      // 7d: ldc_w 93134516
      // 80: ixor
      // 81: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 84: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 87: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 8a: areturn
      // 8b: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8e: athrow
      // 8f: ldc_w 288491212
      // 92: iload 4
      // 94: ldc_w 644967959
      // 97: ixor
      // 98: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 9b: ldc_w 288491213
      // 9e: iload 4
      // a0: ldc_w 1168066761
      // a3: ixor
      // a4: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // a7: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // aa: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // ad: areturn
   }

   private static JsonObject ll(JsonObject param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: ifnull 32
      // 04: aload 0
      // 05: ldc_w 288491202
      // 08: ldc_w -929562279
      // 0b: ldc_w -1434585260
      // 0e: ixor
      // 0f: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 12: ldc_w 288491203
      // 15: ldc_w -929562279
      // 18: ldc_w -492860028
      // 1b: ixor
      // 1c: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 1f: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 22: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 25: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 28: ifne 3e
      // 2b: goto 32
      // 2e: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: new com/google/gson/JsonObject
      // 35: dup
      // 36: invokespecial com/google/gson/JsonObject.<init> ()V
      // 39: areturn
      // 3a: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3d: athrow
      // 3e: aload 0
      // 3f: ldc_w 288491200
      // 42: ldc_w -929562279
      // 45: ldc_w -1959003519
      // 48: ixor
      // 49: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 4c: ldc_w 288491201
      // 4f: ldc_w -929562279
      // 52: ldc_w -673376820
      // 55: ixor
      // 56: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 59: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 5c: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 5f: invokevirtual com/google/gson/JsonObject.getAsJsonObject (Ljava/lang/String;)Lcom/google/gson/JsonObject;
      // 62: invokevirtual com/google/gson/JsonObject.deepCopy ()Lcom/google/gson/JsonObject;
      // 65: areturn
   }

   public String III() {
      try {
         if (this.IIIll) {
            return llIl(this.lIIIl);
         }
      } catch (MatchException var1) {
         throw l(var1);
      }

      return null;
   }

   public Path IIl(lllIllII var1) {
      try {
         if (var1 == null) {
            return null;
         }
      } catch (MatchException var2) {
         throw l(var2);
      }

      try {
         switch (var1) {
            case I:
               return this.llIlI;
            case l:
               return this.lllII.resolve(IIII.llIl());
            case II:
               return this.IlIllI();
            case Il:
               return this.lll();
            default:
               throw new MatchException(null, null);
         }
      } catch (MatchException var3) {
         throw l(var3);
      }
   }

   private void IlI() {
      try {
         Files.deleteIfExists(this.lllII.resolve(Il.llIl()));
      } catch (IOException var2) {
      }
   }

   public JsonObject Ill() {
      try {
         if (this.IIlI == null) {
            return new JsonObject();
         }
      } catch (MatchException var1) {
         throw l(var1);
      }

      return this.IIlI.deepCopy();
   }

   private lllIllII lII(String var1) {
      lllIllII[] var2 = lllIllII.values();

      try {
         label50: {
            int var3 = Integer.parseInt(var1);

            try {
               if (var3 < 0 || var3 >= var2.length) {
                  break label50;
               }
            } catch (NumberFormatException var8) {
               throw l(var8);
            }

            return var2[var3];
         }
      } catch (NumberFormatException var9) {
      }

      for (lllIllII var6 : var2) {
         try {
            if (k74.x.IllIl.l(var6, var1)) {
               return var6;
            }
         } catch (NumberFormatException var7) {
            throw l(var7);
         }
      }

      return null;
   }

   public void lIl(lIIIlIlI param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual k74/x/IlllIlI.IIII ()Ljava/nio/file/Path;
      // 04: astore 2
      // 05: aload 2
      // 06: ifnull 1b
      // 09: aload 2
      // 0a: bipush 0
      // 0b: anewarray 116
      // 0e: invokestatic java/nio/file/Files.exists (Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
      // 11: ifne 20
      // 14: goto 1b
      // 17: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a: athrow
      // 1b: return
      // 1c: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: getstatic k74/x/IlllIlI.IIIIIl Lcom/google/gson/Gson;
      // 23: aload 2
      // 24: invokestatic java/nio/file/Files.readString (Ljava/nio/file/Path;)Ljava/lang/String;
      // 27: ldc com/google/gson/JsonElement
      // 29: invokevirtual com/google/gson/Gson.fromJson (Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
      // 2c: checkcast com/google/gson/JsonElement
      // 2f: astore 3
      // 30: aload 3
      // 31: ifnull 42
      // 34: aload 3
      // 35: invokevirtual com/google/gson/JsonElement.isJsonObject ()Z
      // 38: ifne 43
      // 3b: goto 42
      // 3e: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41: athrow
      // 42: return
      // 43: aload 0
      // 44: aload 3
      // 45: invokevirtual com/google/gson/JsonElement.getAsJsonObject ()Lcom/google/gson/JsonObject;
      // 48: aload 1
      // 49: invokevirtual k74/x/IlllIlI.IIlIIl (Lcom/google/gson/JsonObject;Lk74/x/lIIIlIlI;)V
      // 4c: goto 50
      // 4f: astore 3
      // 50: return
   }

   public void llI() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/IlllIlI.lIIII Lk74/x/IIlIIll;
      // 04: ifnonnull 0c
      // 07: return
      // 08: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b: athrow
      // 0c: bipush 2
      // 0d: anewarray 191
      // 10: dup
      // 11: bipush 0
      // 12: aload 0
      // 13: invokevirtual k74/x/IlllIlI.IIllI ()Ljava/nio/file/Path;
      // 16: aastore
      // 17: dup
      // 18: bipush 1
      // 19: aload 0
      // 1a: invokevirtual k74/x/IlllIlI.IlllI ()Ljava/nio/file/Path;
      // 1d: aastore
      // 1e: astore 1
      // 1f: aload 1
      // 20: arraylength
      // 21: istore 2
      // 22: bipush 0
      // 23: istore 3
      // 24: iload 3
      // 25: iload 2
      // 26: if_icmpge b4
      // 29: aload 1
      // 2a: iload 3
      // 2b: aaload
      // 2c: astore 4
      // 2e: aload 4
      // 30: ifnull ae
      // 33: aload 4
      // 35: bipush 0
      // 36: anewarray 116
      // 39: invokestatic java/nio/file/Files.isDirectory (Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
      // 3c: ifne 4d
      // 3f: goto 46
      // 42: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 45: athrow
      // 46: goto ae
      // 49: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4c: athrow
      // 4d: aload 4
      // 4f: invokestatic java/nio/file/Files.list (Ljava/nio/file/Path;)Ljava/util/stream/Stream;
      // 52: astore 5
      // 54: aload 5
      // 56: invokeinterface java/util/stream/Stream.findAny ()Ljava/util/Optional; 1
      // 5b: invokevirtual java/util/Optional.isEmpty ()Z
      // 5e: ifne 77
      // 61: aload 5
      // 63: ifnull 74
      // 66: aload 5
      // 68: invokeinterface java/util/stream/Stream.close ()V 1
      // 6d: goto 74
      // 70: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 73: athrow
      // 74: goto ae
      // 77: aload 4
      // 79: invokestatic java/nio/file/Files.deleteIfExists (Ljava/nio/file/Path;)Z
      // 7c: pop
      // 7d: aload 5
      // 7f: ifnull a9
      // 82: aload 5
      // 84: invokeinterface java/util/stream/Stream.close ()V 1
      // 89: goto a9
      // 8c: astore 6
      // 8e: aload 5
      // 90: ifnull a6
      // 93: aload 5
      // 95: invokeinterface java/util/stream/Stream.close ()V 1
      // 9a: goto a6
      // 9d: astore 7
      // 9f: aload 6
      // a1: aload 7
      // a3: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // a6: aload 6
      // a8: athrow
      // a9: goto ae
      // ac: astore 5
      // ae: iinc 3 1
      // b1: goto 24
      // b4: return
   }

   public IlllIlI() {
      this.llIlI = FabricLoader.getInstance().getConfigDir();
      this.IIll = lllIIlIl.IlI;
      this.IIlIlI = k74.x.IIll.IIllIll(lIIIIl(288491206, -968186224 ^ 1159005377));
      this.IIlIl = class_3675.field_16237;
      this.IIlI = new JsonObject();
      this.IlIIll();
      this.IlIlI();
      this.IllII();
      this.IIllII = lllIllII.l;
      this.lIll();
      this.IlI();
      this.lllll();
   }

   private Path lll() {
      return IIIllI();
   }

   public Path IIII() {
      return this.IIlIll(lllIllII.l);
   }

   public Path IIIl() {
      return this.IIllI();
   }

   public Path IIlI() {
      return this.IlllI();
   }

   private void IIll(Path param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 16
      // 04: aload 1
      // 05: bipush 0
      // 06: anewarray 116
      // 09: invokestatic java/nio/file/Files.isDirectory (Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
      // 0c: ifne 1b
      // 0f: goto 16
      // 12: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: return
      // 17: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a: athrow
      // 1b: aload 1
      // 1c: invokestatic java/nio/file/Files.list (Ljava/nio/file/Path;)Ljava/util/stream/Stream;
      // 1f: astore 2
      // 20: aload 2
      // 21: invokeinterface java/util/stream/Stream.findAny ()Ljava/util/Optional; 1
      // 26: invokevirtual java/util/Optional.isEmpty ()Z
      // 29: ifeq 31
      // 2c: aload 1
      // 2d: invokestatic java/nio/file/Files.deleteIfExists (Ljava/nio/file/Path;)Z
      // 30: pop
      // 31: aload 2
      // 32: ifnull 5a
      // 35: aload 2
      // 36: invokeinterface java/util/stream/Stream.close ()V 1
      // 3b: goto 5a
      // 3e: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41: athrow
      // 42: astore 3
      // 43: aload 2
      // 44: ifnull 58
      // 47: aload 2
      // 48: invokeinterface java/util/stream/Stream.close ()V 1
      // 4d: goto 58
      // 50: astore 4
      // 52: aload 3
      // 53: aload 4
      // 55: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 58: aload 3
      // 59: athrow
      // 5a: goto 5e
      // 5d: astore 2
      // 5e: return
   }

   public Path IlII(String param1) throws IOException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w -1976741284
      // 003: istore 13
      // 005: aload 0
      // 006: invokevirtual k74/x/IlllIlI.IIII ()Ljava/nio/file/Path;
      // 009: astore 2
      // 00a: aload 2
      // 00b: ifnull 020
      // 00e: aload 2
      // 00f: bipush 0
      // 010: anewarray 116
      // 013: invokestatic java/nio/file/Files.exists (Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
      // 016: ifne 04a
      // 019: goto 020
      // 01c: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01f: athrow
      // 020: new java/io/IOException
      // 023: dup
      // 024: ldc_w 288491207
      // 027: iload 13
      // 029: ldc_w -1294073295
      // 02c: ixor
      // 02d: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 030: ldc_w 288491204
      // 033: iload 13
      // 035: ldc_w -151520114
      // 038: ixor
      // 039: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 03c: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 03f: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 042: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 045: athrow
      // 046: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 049: athrow
      // 04a: aload 0
      // 04b: invokevirtual k74/x/IlllIlI.IIlI ()Ljava/nio/file/Path;
      // 04e: astore 3
      // 04f: aload 3
      // 050: ifnonnull 07d
      // 053: new java/io/IOException
      // 056: dup
      // 057: ldc_w 288491205
      // 05a: iload 13
      // 05c: ldc_w 462030318
      // 05f: ixor
      // 060: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 063: ldc_w 288491226
      // 066: iload 13
      // 068: ldc_w -1529360886
      // 06b: ixor
      // 06c: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 06f: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 072: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 075: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 078: athrow
      // 079: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07c: athrow
      // 07d: aload 3
      // 07e: bipush 0
      // 07f: anewarray 469
      // 082: invokestatic java/nio/file/Files.createDirectories (Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;
      // 085: pop
      // 086: aload 1
      // 087: ifnull 098
      // 08a: aload 1
      // 08b: invokevirtual java/lang/String.isBlank ()Z
      // 08e: ifeq 0bd
      // 091: goto 098
      // 094: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 097: athrow
      // 098: ldc_w 288491227
      // 09b: iload 13
      // 09d: ldc_w -136645919
      // 0a0: ixor
      // 0a1: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 0a4: ldc_w 288491224
      // 0a7: iload 13
      // 0a9: ldc_w -963692647
      // 0ac: ixor
      // 0ad: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 0b0: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 0b3: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0b6: goto 0fd
      // 0b9: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bc: athrow
      // 0bd: aload 1
      // 0be: ldc_w 288491225
      // 0c1: iload 13
      // 0c3: ldc_w -802267097
      // 0c6: ixor
      // 0c7: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 0ca: ldc_w 288491230
      // 0cd: iload 13
      // 0cf: ldc_w 1311471062
      // 0d2: ixor
      // 0d3: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 0d6: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 0d9: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0dc: ldc_w 288491231
      // 0df: iload 13
      // 0e1: ldc_w -1195871221
      // 0e4: ixor
      // 0e5: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 0e8: ldc_w 288491228
      // 0eb: iload 13
      // 0ed: ldc_w 235377805
      // 0f0: ixor
      // 0f1: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 0f4: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 0f7: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0fa: invokevirtual java/lang/String.replaceAll (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 0fd: astore 4
      // 0ff: invokestatic java/time/LocalDateTime.now ()Ljava/time/LocalDateTime;
      // 102: getstatic k74/x/IlllIlI.IlIll Lk74/x/IIIlIlIl;
      // 105: invokevirtual k74/x/IIIlIlIl.llIl ()Ljava/lang/String;
      // 108: invokestatic java/time/format/DateTimeFormatter.ofPattern (Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;
      // 10b: invokevirtual java/time/LocalDateTime.format (Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;
      // 10e: astore 5
      // 110: aload 3
      // 111: aload 2
      // 112: invokeinterface java/nio/file/Path.getFileName ()Ljava/nio/file/Path; 1
      // 117: invokestatic java/lang/String.valueOf (Ljava/lang/Object;)Ljava/lang/String;
      // 11a: ldc_w 288491229
      // 11d: iload 13
      // 11f: ldc_w -1527147469
      // 122: ixor
      // 123: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 126: ldc_w 288491218
      // 129: iload 13
      // 12b: ldc_w 1435340884
      // 12e: ixor
      // 12f: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 132: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 135: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 138: aload 5
      // 13a: ldc_w 288491219
      // 13d: iload 13
      // 13f: ldc_w 531961377
      // 142: ixor
      // 143: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 146: ldc_w 288491216
      // 149: iload 13
      // 14b: ldc_w 803051778
      // 14e: ixor
      // 14f: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 152: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 155: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 158: aload 4
      // 15a: ldc_w 288491217
      // 15d: iload 13
      // 15f: ldc_w 918933783
      // 162: ixor
      // 163: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 166: ldc_w 288491222
      // 169: iload 13
      // 16b: ldc_w -711605640
      // 16e: ixor
      // 16f: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 172: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 175: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 178: astore 12
      // 17a: astore 11
      // 17c: astore 10
      // 17e: astore 9
      // 180: astore 8
      // 182: astore 7
      // 184: new java/lang/StringBuilder
      // 187: dup
      // 188: invokespecial java/lang/StringBuilder.<init> ()V
      // 18b: aload 7
      // 18d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 190: aload 8
      // 192: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 195: aload 9
      // 197: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 19a: aload 10
      // 19c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 19f: aload 11
      // 1a1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1a4: aload 12
      // 1a6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1a9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1ac: invokeinterface java/nio/file/Path.resolve (Ljava/lang/String;)Ljava/nio/file/Path; 2
      // 1b1: astore 6
      // 1b3: aload 2
      // 1b4: aload 6
      // 1b6: bipush 1
      // 1b7: anewarray 541
      // 1ba: dup
      // 1bb: bipush 0
      // 1bc: getstatic java/nio/file/StandardCopyOption.REPLACE_EXISTING Ljava/nio/file/StandardCopyOption;
      // 1bf: aastore
      // 1c0: invokestatic java/nio/file/Files.copy (Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;
      // 1c3: pop
      // 1c4: aload 6
      // 1c6: areturn
   }

   public void IlIl(IIlIIll var1) {
      this.lIIII = var1;
   }

   public void IllI(JsonObject var1) {
      IlllIlI var10000;
      JsonObject var10001;
      label16: {
         try {
            var10000 = this;
            if (var1 == null) {
               var10001 = new JsonObject();
               break label16;
            }
         } catch (MatchException var2) {
            throw l(var2);
         }

         var10001 = var1.deepCopy();
      }

      var10000.IIlI = var10001;
   }

   public void Illl(class_306 var1) {
      IlllIlI var10000;
      class_306 var10001;
      label16: {
         try {
            var10000 = this;
            if (var1 == null) {
               var10001 = class_3675.field_16237;
               break label16;
            }
         } catch (MatchException var2) {
            throw l(var2);
         }

         var10001 = var1;
      }

      var10000.IIlIl = var10001;
   }

   private static void lIII(JsonObject param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w -1604572540
      // 003: istore 7
      // 005: aload 0
      // 006: getstatic k74/x/IlllIlI.IIl J
      // 009: invokestatic k74/x/IlllIlI.IlIIIl (Lcom/google/gson/JsonObject;J)Z
      // 00c: ifne 014
      // 00f: return
      // 010: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 013: athrow
      // 014: aload 0
      // 015: getstatic k74/x/IlllIlI.IIl J
      // 018: invokestatic k74/x/IlllIlI.lIIII (Lcom/google/gson/JsonObject;J)Lcom/google/gson/JsonObject;
      // 01b: astore 1
      // 01c: aload 1
      // 01d: ifnull 04c
      // 020: aload 1
      // 021: ldc_w 288491223
      // 024: iload 7
      // 026: ldc_w 540242175
      // 029: ixor
      // 02a: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 02d: ldc_w 288491220
      // 030: iload 7
      // 032: ldc_w 1519667403
      // 035: ixor
      // 036: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 039: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 03c: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 03f: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 042: ifne 051
      // 045: goto 04c
      // 048: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04b: athrow
      // 04c: return
      // 04d: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 050: athrow
      // 051: aload 1
      // 052: ldc_w 288491221
      // 055: iload 7
      // 057: ldc_w -844190864
      // 05a: ixor
      // 05b: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 05e: ldc_w 288491242
      // 061: iload 7
      // 063: ldc_w 732606801
      // 066: ixor
      // 067: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 06a: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 06d: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 070: invokevirtual com/google/gson/JsonObject.getAsJsonObject (Ljava/lang/String;)Lcom/google/gson/JsonObject;
      // 073: astore 2
      // 074: getstatic k74/x/IlllIlI.IIlllI Lk74/x/IIIlIlIl;
      // 077: invokevirtual k74/x/IIIlIlIl.I ()J
      // 07a: lstore 3
      // 07b: aload 2
      // 07c: lload 3
      // 07d: invokestatic k74/x/IlIIIIIIl.IIllIlI (Lcom/google/gson/JsonObject;J)Lcom/google/gson/JsonElement;
      // 080: astore 5
      // 082: aload 5
      // 084: ifnull 096
      // 087: aload 5
      // 089: invokevirtual com/google/gson/JsonElement.isJsonPrimitive ()Z
      // 08c: ifne 09b
      // 08f: goto 096
      // 092: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 095: athrow
      // 096: return
      // 097: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09a: athrow
      // 09b: aload 5
      // 09d: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 0a0: astore 6
      // 0a2: ldc_w 288491243
      // 0a5: iload 7
      // 0a7: ldc_w 853509296
      // 0aa: ixor
      // 0ab: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 0ae: ldc_w 288491240
      // 0b1: iload 7
      // 0b3: ldc_w 2009863554
      // 0b6: ixor
      // 0b7: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 0ba: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 0bd: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0c0: aload 6
      // 0c2: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 0c5: ifeq 0f7
      // 0c8: aload 2
      // 0c9: lload 3
      // 0ca: new com/google/gson/JsonPrimitive
      // 0cd: dup
      // 0ce: ldc_w 288491241
      // 0d1: iload 7
      // 0d3: ldc_w -2027364825
      // 0d6: ixor
      // 0d7: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 0da: ldc_w 288491246
      // 0dd: iload 7
      // 0df: ldc_w 1743390479
      // 0e2: ixor
      // 0e3: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 0e6: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 0e9: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0ec: invokespecial com/google/gson/JsonPrimitive.<init> (Ljava/lang/String;)V
      // 0ef: invokestatic k74/x/IlIIIIIIl.IlllIII (Lcom/google/gson/JsonObject;JLcom/google/gson/JsonElement;)V
      // 0f2: return
      // 0f3: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f6: athrow
      // 0f7: ldc_w 288491247
      // 0fa: iload 7
      // 0fc: ldc_w 864629414
      // 0ff: ixor
      // 100: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 103: ldc_w 288491244
      // 106: iload 7
      // 108: ldc_w 1395532603
      // 10b: ixor
      // 10c: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 10f: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 112: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 115: aload 6
      // 117: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 11a: ifne 14a
      // 11d: ldc_w 288491245
      // 120: iload 7
      // 122: ldc_w 415839858
      // 125: ixor
      // 126: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 129: ldc_w 288491234
      // 12c: iload 7
      // 12e: ldc_w -1426687056
      // 131: ixor
      // 132: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 135: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 138: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 13b: aload 6
      // 13d: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 140: ifeq 17b
      // 143: goto 14a
      // 146: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 149: athrow
      // 14a: aload 2
      // 14b: lload 3
      // 14c: new com/google/gson/JsonPrimitive
      // 14f: dup
      // 150: ldc_w 288491235
      // 153: iload 7
      // 155: ldc_w -1566780988
      // 158: ixor
      // 159: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 15c: ldc_w 288491232
      // 15f: iload 7
      // 161: ldc_w 65232439
      // 164: ixor
      // 165: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 168: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 16b: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 16e: invokespecial com/google/gson/JsonPrimitive.<init> (Ljava/lang/String;)V
      // 171: invokestatic k74/x/IlIIIIIIl.IlllIII (Lcom/google/gson/JsonObject;JLcom/google/gson/JsonElement;)V
      // 174: goto 17b
      // 177: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17a: athrow
      // 17b: return
   }

   public Path lIIl(lllIllII var1) {
      Path var2 = this.IIl(var1);

      try {
         if (var2 == null) {
            return null;
         }
      } catch (MatchException var3) {
         throw l(var3);
      }

      return var2.resolve(this.IlIlIl(var1));
   }

   private static long lIlI(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: ifnull 56
      // 04: aload 0
      // 05: invokevirtual java/lang/String.length ()I
      // 08: ldc_w 288491233
      // 0b: ldc_w -1186376621
      // 0e: ldc_w 850544774
      // 11: ixor
      // 12: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 15: if_icmpne 56
      // 18: goto 1f
      // 1b: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: aload 0
      // 20: bipush 0
      // 21: invokevirtual java/lang/String.charAt (I)C
      // 24: ldc_w 288491238
      // 27: ldc_w -1186376621
      // 2a: ldc_w 1790708475
      // 2d: ixor
      // 2e: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 31: if_icmpne 56
      // 34: goto 3b
      // 37: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a: athrow
      // 3b: aload 0
      // 3c: bipush 1
      // 3d: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 40: ldc_w 288491239
      // 43: ldc_w -1186376621
      // 46: ldc_w 740608934
      // 49: ixor
      // 4a: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 4d: invokestatic java/lang/Long.parseUnsignedLong (Ljava/lang/String;I)J
      // 50: lreturn
      // 51: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 54: athrow
      // 55: astore 1
      // 56: aload 0
      // 57: invokestatic k74/x/IlIIllIII.IlIl (Ljava/lang/String;)J
      // 5a: lreturn
   }

   private void lIll() {
      Path var1 = this.IIllll();

      try {
         if (var1 == null) {
            return;
         }
      } catch (IOException var6) {
         throw l(var6);
      }

      JsonObject var2 = new JsonObject();

      try {
         if (this.IIllII != null) {
            var2.addProperty(
               IlIIllIII.lI(IIIIlI(lIIIIl(288491236, -708272700 ^ -1481645409), lIIIIl(288491237, -708272700 ^ -2029714239))), this.IIllII.ordinal()
            );
         }
      } catch (IOException var5) {
         throw l(var5);
      }

      try {
         Files.createDirectories(var1.getParent());
         Files.writeString(var1, IIIIIl.toJson(var2));
      } catch (IOException var4) {
      }
   }

   public boolean llII() {
      return false;
   }

   static String llIl(long var0) {
      int var10000 = lIIIIl(288491258, 1806491196 ^ -1988000477);
      String var2 = Long.toUnsignedString(var0, lIIIIl(288491259, 1806491196 ^ 1523297222));
      String var3 = IlIIllIII.lI(IIIIlI(var10000, lIIIIl(288491256, 1806491196 ^ 46189124)))
         .substring(0, lIIIIl(288491257, 1806491196 ^ 199181867) - var2.length());
      return var3 + var2;
   }

   public JsonObject lllI(lIIIlIlI var1) {
      int var10 = 1464694300;
      JsonObject var2 = new JsonObject();
      JsonObject var3 = new JsonObject();

      try {
         var3.addProperty(IlIIllIII.lI(IIIIlI(lIIIIl(288491262, var10 ^ 337620207), lIIIIl(288491263, var10 ^ 1641014188))), this.IIll.ordinal());
         if (this.IIIll) {
            var3.addProperty(IlIIllIII.lI(IIIIlI(lIIIIl(288491260, var10 ^ -267957794), lIIIIl(288491261, var10 ^ 1223362088))), llIl(this.lIIIl));
         }
      } catch (MatchException var14) {
         throw l(var14);
      }

      JsonElement var4 = k74.x.IIll.IIIlIll(this.IIlIlI);

      try {
         if (var4 != null) {
            var3.add(IlIIllIII.lI(IIIIlI(lIIIIl(288491250, var10 ^ -36888957), lIIIIl(288491251, var10 ^ -147168171))), var4);
         }
      } catch (MatchException var13) {
         throw l(var13);
      }

      JsonElement var5 = k74.x.IIll.IIIlIll(this.IIlIl);

      try {
         if (var5 != null) {
            var3.add(IlIIllIII.lI(IIIIlI(lIIIIl(288491248, var10 ^ 795138839), lIIIIl(288491249, var10 ^ -1541267048))), var5);
         }
      } catch (MatchException var11) {
         throw l(var11);
      }

      JsonObject var10000;
      String var10001;
      JsonObject var10002;
      label46: {
         try {
            var2.add(IlIIllIII.lI(IIIIlI(lIIIIl(288491254, var10 ^ -2013272260), lIIIIl(288491255, var10 ^ -983053530))), var3);
            var10000 = var2;
            var10001 = Illlll();
            if (this.IIlI == null) {
               var10002 = new JsonObject();
               break label46;
            }
         } catch (MatchException var12) {
            throw l(var12);
         }

         var10002 = this.IIlI.deepCopy();
      }

      var10000.add(var10001, var10002);
      JsonObject var6 = new JsonObject();

      for (IlIIIIIIl var9 : var1.IIIlll()) {
         var6.add(llIl(var9.IIllllI()), var9.IlIll());
      }

      var2.add(IlIIllIII.lI(IIIIlI(lIIIIl(288491252, var10 ^ -171707535), lIIIIl(288491253, var10 ^ 2061488339))), var6);
      return var2;
   }

   public Path llll(lIIIlIlI var1) throws IOException {
      Path var2 = this.I();

      try {
         if (var2 == null) {
            throw new IOException(IlIIllIII.lI(IIIIlI(lIIIIl(288491146, -2134623721 ^ 1109765793), lIIIIl(288491147, -2134623721 ^ 626661836))));
         }
      } catch (IOException var5) {
         throw l(var5);
      }

      Path var3 = this.IIII();

      try {
         if (var3 == null) {
            throw new IOException(IlIIllIII.lI(IIIIlI(lIIIIl(288491144, -2134623721 ^ 493158772), lIIIIl(288491145, -2134623721 ^ -963932996))));
         }
      } catch (IOException var4) {
         throw l(var4);
      }

      Files.createDirectories(var3.getParent());
      Files.copy(var2, var3, StandardCopyOption.REPLACE_EXISTING);
      this.lIl(var1);
      return var2;
   }

   static void IIIII(JsonObject var0, long var1) {
      var0.remove(llIl(var1));
      String var3 = null;

      for (String var5 : var0.keySet()) {
         if (IlIIllIII.IlIl(var5) == var1) {
            var3 = var5;
            break;
         }
      }

      try {
         if (var3 != null) {
            var0.remove(var3);
         }
      } catch (MatchException var6) {
         throw l(var6);
      }
   }

   private long IIIIl(Path var1) {
      try {
         return Files.getLastModifiedTime(var1).toMillis();
      } catch (IOException var3) {
         return 0L;
      }
   }

   public String IIIlI(lllIllII var1) {
      int var2 = 966279989;

      try {
         switch (var1) {
            case I:
               return IlIIllIII.lI(IIIIlI(lIIIIl(288491150, var2 ^ 1828585568), lIIIIl(288491151, var2 ^ -1883560338)));
            case l:
               return IlIIllIII.lI(IIIIlI(lIIIIl(288491148, var2 ^ -1092109068), lIIIIl(288491149, var2 ^ 1089285656)));
            case II:
               return IlIIllIII.lI(IIIIlI(lIIIIl(288491138, var2 ^ 175251285), lIIIIl(288491139, var2 ^ -1115888415)));
            case Il:
               return lIIl.llIl();
            default:
               throw new MatchException(null, null);
         }
      } catch (MatchException var3) {
         throw l(var3);
      }
   }

   private static Path IIIll(ModContainer var0) {
      return (Path)var0.getOrigin().getPaths().get(0);
   }

   private static JsonObject IIlII(JsonObject param0, JsonObject param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc_w -338070785
      // 03: istore 4
      // 05: new com/google/gson/JsonObject
      // 08: dup
      // 09: invokespecial com/google/gson/JsonObject.<init> ()V
      // 0c: astore 3
      // 0d: aload 3
      // 0e: ldc_w 288491136
      // 11: iload 4
      // 13: ldc_w -1229511954
      // 16: ixor
      // 17: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 1a: ldc_w 288491137
      // 1d: iload 4
      // 1f: ldc_w 1122450223
      // 22: ixor
      // 23: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 26: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 29: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 2c: iload 2
      // 2d: ifeq 68
      // 30: aload 1
      // 31: ldc_w 288491142
      // 34: iload 4
      // 36: ldc_w -702748932
      // 39: ixor
      // 3a: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 3d: ldc_w 288491143
      // 40: iload 4
      // 42: ldc_w 105700631
      // 45: ixor
      // 46: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 49: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 4c: invokestatic k74/x/IlIIllIII.Ill (Ljava/lang/String;)Lk74/x/IIIlIlIl;
      // 4f: invokevirtual k74/x/IIIlIlIl.I ()J
      // 52: bipush 1
      // 53: invokestatic k74/x/IlllIlI.IlllII (Lcom/google/gson/JsonObject;JZ)Z
      // 56: ifeq 68
      // 59: goto 60
      // 5c: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5f: athrow
      // 60: bipush 1
      // 61: goto 69
      // 64: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 67: athrow
      // 68: bipush 0
      // 69: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 6c: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/Boolean;)V
      // 6f: aload 0
      // 70: aload 3
      // 71: invokestatic k74/x/IlllIlI.IlIIl (Lcom/google/gson/JsonObject;Lcom/google/gson/JsonObject;)V
      // 74: aload 3
      // 75: ldc_w 288491140
      // 78: iload 4
      // 7a: ldc_w -1246780177
      // 7d: ixor
      // 7e: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 81: ldc_w 288491141
      // 84: iload 4
      // 86: ldc_w 917291589
      // 89: ixor
      // 8a: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 8d: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 90: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 93: new com/google/gson/JsonObject
      // 96: dup
      // 97: invokespecial com/google/gson/JsonObject.<init> ()V
      // 9a: invokevirtual com/google/gson/JsonObject.add (Ljava/lang/String;Lcom/google/gson/JsonElement;)V
      // 9d: aload 3
      // 9e: areturn
   }

   private static boolean IIlIl(Path var0) {
      return var0.getFileName().toString().endsWith(IlIIllIII.lI(IIIIlI(lIIIIl(288491162, 529313133 ^ 185427263), lIIIIl(288491163, 529313133 ^ 1869438576))));
   }

   public Path IIllI() {
      Path var1 = this.IIl(lllIllII.l);

      try {
         if (var1 == null) {
            return null;
         }
      } catch (MatchException var2) {
         throw l(var2);
      }

      return var1.resolve(IllIl.llIl());
   }

   private static long IIlll(long param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: lload 0
      // 01: getstatic k74/x/IlllIlI.IlIIl J
      // 04: lcmp
      // 05: ifne 10
      // 08: getstatic k74/x/IlllIlI.IIIlll J
      // 0b: lreturn
      // 0c: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f: athrow
      // 10: lload 0
      // 11: getstatic k74/x/IlllIlI.lIlI J
      // 14: lcmp
      // 15: ifne 20
      // 18: getstatic k74/x/IlllIlI.llIIl J
      // 1b: lreturn
      // 1c: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: lload 0
      // 21: getstatic k74/x/IlllIlI.lIlII J
      // 24: lcmp
      // 25: ifeq 37
      // 28: lload 0
      // 29: getstatic k74/x/IlllIlI.lIll J
      // 2c: lcmp
      // 2d: ifne 3f
      // 30: goto 37
      // 33: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36: athrow
      // 37: getstatic k74/x/IlllIlI.llI J
      // 3a: lreturn
      // 3b: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e: athrow
      // 3f: lload 0
      // 40: getstatic k74/x/IlllIlI.l J
      // 43: lcmp
      // 44: ifne 4f
      // 47: getstatic k74/x/IlllIlI.IIIllI J
      // 4a: lreturn
      // 4b: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e: athrow
      // 4f: lload 0
      // 50: getstatic k74/x/IlllIlI.lll J
      // 53: lcmp
      // 54: ifne 5f
      // 57: getstatic k74/x/IlllIlI.llllI J
      // 5a: lreturn
      // 5b: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5e: athrow
      // 5f: lload 0
      // 60: getstatic k74/x/IlllIlI.IIIII J
      // 63: lcmp
      // 64: ifne 6f
      // 67: getstatic k74/x/IlllIlI.lI J
      // 6a: lreturn
      // 6b: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6e: athrow
      // 6f: lload 0
      // 70: getstatic k74/x/IlllIlI.IIIIl J
      // 73: lcmp
      // 74: ifne 7f
      // 77: getstatic k74/x/IlllIlI.IIIlI J
      // 7a: lreturn
      // 7b: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7e: athrow
      // 7f: lload 0
      // 80: getstatic k74/x/IlllIlI.IIlIIl J
      // 83: lcmp
      // 84: ifne 8f
      // 87: getstatic k74/x/IlllIlI.lIIll J
      // 8a: lreturn
      // 8b: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8e: athrow
      // 8f: lload 0
      // 90: getstatic k74/x/IlllIlI.llll J
      // 93: lcmp
      // 94: ifne 9f
      // 97: getstatic k74/x/IlllIlI.IIlII J
      // 9a: lreturn
      // 9b: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9e: athrow
      // 9f: lload 0
      // a0: getstatic k74/x/IlllIlI.IIllI J
      // a3: lcmp
      // a4: ifne af
      // a7: getstatic k74/x/IlllIlI.II J
      // aa: lreturn
      // ab: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ae: athrow
      // af: lload 0
      // b0: lreturn
   }

   private void IlIII(Path param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 16
      // 04: aload 1
      // 05: bipush 0
      // 06: anewarray 116
      // 09: invokestatic java/nio/file/Files.isDirectory (Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
      // 0c: ifne 1b
      // 0f: goto 16
      // 12: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: return
      // 17: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a: athrow
      // 1b: aload 0
      // 1c: aload 1
      // 1d: invokevirtual k74/x/IlllIlI.lllII (Ljava/nio/file/Path;)V
      // 20: aload 0
      // 21: aload 1
      // 22: getstatic k74/x/IlllIlI.Illll Lk74/x/IIIlIlIl;
      // 25: getstatic k74/x/IlllIlI.llII Lk74/x/IIIlIlIl;
      // 28: bipush 1
      // 29: invokevirtual k74/x/IlllIlI.IlIIlI (Ljava/nio/file/Path;Lk74/x/IIIlIlIl;Lk74/x/IIIlIlIl;Z)V
      // 2c: aload 0
      // 2d: aload 1
      // 2e: bipush 1
      // 2f: invokevirtual k74/x/IlllIlI.IIllIl (Ljava/nio/file/Path;Z)V
      // 32: aload 0
      // 33: aload 1
      // 34: invokevirtual k74/x/IlllIlI.IIll (Ljava/nio/file/Path;)V
      // 37: return
   }

   private static void IlIIl(JsonObject param0, JsonObject param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc_w 1792410643
      // 03: istore 2
      // 04: aload 0
      // 05: ifnull 7c
      // 08: aload 0
      // 09: ldc_w 288491160
      // 0c: iload 2
      // 0d: ldc_w 695004842
      // 10: ixor
      // 11: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 14: ldc_w 288491161
      // 17: iload 2
      // 18: ldc_w -1842799268
      // 1b: ixor
      // 1c: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 1f: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 22: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 25: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 28: ifeq 7c
      // 2b: goto 32
      // 2e: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 1
      // 33: ldc_w 288491166
      // 36: iload 2
      // 37: ldc_w 814598780
      // 3a: ixor
      // 3b: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 3e: ldc_w 288491167
      // 41: iload 2
      // 42: ldc_w -54125220
      // 45: ixor
      // 46: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 49: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 4c: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 4f: aload 0
      // 50: ldc_w 288491164
      // 53: iload 2
      // 54: ldc_w 984901282
      // 57: ixor
      // 58: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 5b: ldc_w 288491165
      // 5e: iload 2
      // 5f: ldc_w 1418184485
      // 62: ixor
      // 63: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 66: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 69: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 6c: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 6f: invokevirtual com/google/gson/JsonElement.deepCopy ()Lcom/google/gson/JsonElement;
      // 72: invokevirtual com/google/gson/JsonObject.add (Ljava/lang/String;Lcom/google/gson/JsonElement;)V
      // 75: goto 7c
      // 78: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7b: athrow
      // 7c: return
   }

   private void IlIlI() {
      try {
         Path var1 = this.IIl(lllIllII.l);
         if (var1 == null) {
            return;
         }

         Files.createDirectories(var1);
         DosFileAttributeView var2 = Files.getFileAttributeView(var1, DosFileAttributeView.class);

         try {
            if (var2 != null) {
               var2.setHidden(false);
               var2.setSystem(false);
            }
         } catch (IOException var7) {
            throw l(var7);
         }

         if (this.lIIII == null) {
            Path var3 = this.IIllI();

            try {
               if (var3 != null) {
                  Files.createDirectories(var3);
               }
            } catch (IOException var8) {
               throw l(var8);
            }

            Path var4 = this.IlllI();

            try {
               if (var4 != null) {
                  Files.createDirectories(var4);
               }
            } catch (IOException var6) {
               throw l(var6);
            }
         }

         Path var10 = this.llIlI();

         try {
            if (var10 != null) {
               Files.createDirectories(var10);
            }
         } catch (IOException var5) {
            throw l(var5);
         }
      } catch (IOException var9) {
      }
   }

   static void IlIll(JsonObject param0, long param1, long param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: lload 1
      // 02: invokestatic k74/x/IlllIlI.llIII (Lcom/google/gson/JsonObject;J)Lcom/google/gson/JsonElement;
      // 05: astore 5
      // 07: aload 5
      // 09: ifnull 29
      // 0c: aload 0
      // 0d: lload 3
      // 0e: invokestatic k74/x/IlllIlI.IlIIIl (Lcom/google/gson/JsonObject;J)Z
      // 11: ifne 29
      // 14: goto 1b
      // 17: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a: athrow
      // 1b: aload 0
      // 1c: lload 3
      // 1d: aload 5
      // 1f: invokestatic k74/x/IlllIlI.IIllII (Lcom/google/gson/JsonObject;JLcom/google/gson/JsonElement;)V
      // 22: goto 29
      // 25: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28: athrow
      // 29: return
   }

   private void IllII() {
      this.IlIIlI(this.IIl(lllIllII.Il), Illll, llII, true);
      this.IIllIl(this.llIlI, true);
      this.IlIIlI(this.lllII.resolve(IIIlII.llIl()), Illll, llII, true);
      this.IlIIlI(this.IIl(lllIllII.I), Illll, llII, true);
      this.IlIII(this.llIlI.resolve(llIII.llIl()));
      this.IlIII(this.llIlI.resolve(IIllIl.llIl()));
      this.IlIII(this.lllII.resolve(llIII.llIl()));
      this.IlIII(this.lllII.resolve(IIllIl.llIl()));
      this.IlIIlI(this.IlIllI(), Illll, llII, false);
      this.IIIlIl();
   }

   private void IllIl(Path var1, boolean var2, Path var3) {
      this.IIIIII(var3, var1, var2);
   }

   public Path IlllI() {
      Path var1 = this.IIl(lllIllII.l);

      try {
         if (var1 == null) {
            return null;
         }
      } catch (MatchException var2) {
         throw l(var2);
      }

      return var1.resolve(lIlll.llIl());
   }

   public void Illll(class_306 var1) {
      IlllIlI var10000;
      class_306 var10001;
      label16: {
         try {
            var10000 = this;
            if (var1 == null) {
               var10001 = class_3675.field_16237;
               break label16;
            }
         } catch (MatchException var2) {
            throw l(var2);
         }

         var10001 = var1;
      }

      var10000.IIlIlI = var10001;
   }

   static JsonObject lIIII(JsonObject param0, long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: lload 1
      // 02: invokestatic k74/x/IlllIlI.llIII (Lcom/google/gson/JsonObject;J)Lcom/google/gson/JsonElement;
      // 05: astore 3
      // 06: aload 3
      // 07: ifnull 23
      // 0a: aload 3
      // 0b: invokevirtual com/google/gson/JsonElement.isJsonObject ()Z
      // 0e: ifeq 23
      // 11: goto 18
      // 14: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: aload 3
      // 19: invokevirtual com/google/gson/JsonElement.getAsJsonObject ()Lcom/google/gson/JsonObject;
      // 1c: goto 24
      // 1f: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22: athrow
      // 23: aconst_null
      // 24: areturn
   }

   private static String lIIIl() {
      return IlIIllIII.lI(IIIIlI(lIIIIl(288491154, 135198243 ^ -1508213635), lIIIIl(288491155, 135198243 ^ -2041984721)));
   }

   private FileSystem lIIlI() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc_w -1553404453
      // 03: istore 6
      // 05: aload 0
      // 06: getfield k74/x/IlllIlI.IIIIlI Ljava/nio/file/FileSystem;
      // 09: ifnull 26
      // 0c: aload 0
      // 0d: getfield k74/x/IlllIlI.IIIIlI Ljava/nio/file/FileSystem;
      // 10: invokevirtual java/nio/file/FileSystem.isOpen ()Z
      // 13: ifeq 26
      // 16: goto 1d
      // 19: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: aload 0
      // 1e: getfield k74/x/IlllIlI.IIIIlI Ljava/nio/file/FileSystem;
      // 21: areturn
      // 22: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25: athrow
      // 26: aload 0
      // 27: invokevirtual k74/x/IlllIlI.IllIIl ()Ljava/nio/file/Path;
      // 2a: astore 1
      // 2b: aload 1
      // 2c: ifnull 41
      // 2f: aload 1
      // 30: bipush 0
      // 31: anewarray 116
      // 34: invokestatic java/nio/file/Files.exists (Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
      // 37: ifne 47
      // 3a: goto 41
      // 3d: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 40: athrow
      // 41: aconst_null
      // 42: areturn
      // 43: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 46: athrow
      // 47: ldc_w 288491152
      // 4a: iload 6
      // 4c: ldc_w 1002086658
      // 4f: ixor
      // 50: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 53: ldc_w 288491153
      // 56: iload 6
      // 58: ldc_w -1581304258
      // 5b: ixor
      // 5c: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 5f: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 62: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 65: aload 1
      // 66: invokeinterface java/nio/file/Path.toUri ()Ljava/net/URI; 1
      // 6b: invokestatic java/lang/String.valueOf (Ljava/lang/Object;)Ljava/lang/String;
      // 6e: astore 5
      // 70: astore 4
      // 72: new java/lang/StringBuilder
      // 75: dup
      // 76: invokespecial java/lang/StringBuilder.<init> ()V
      // 79: aload 4
      // 7b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 7e: aload 5
      // 80: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 83: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 86: invokestatic java/net/URI.create (Ljava/lang/String;)Ljava/net/URI;
      // 89: astore 2
      // 8a: aload 0
      // 8b: aload 2
      // 8c: ldc_w 288491158
      // 8f: iload 6
      // 91: ldc_w 1941676527
      // 94: ixor
      // 95: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 98: ldc_w 288491159
      // 9b: iload 6
      // 9d: ldc_w 952549125
      // a0: ixor
      // a1: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // a4: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // a7: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // aa: ldc_w 288491156
      // ad: iload 6
      // af: ldc_w -1232209012
      // b2: ixor
      // b3: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // b6: ldc_w 288491157
      // b9: iload 6
      // bb: ldc_w -1741920213
      // be: ixor
      // bf: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // c2: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // c5: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // c8: invokestatic java/util/Map.of (Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;
      // cb: invokestatic java/nio/file/FileSystems.newFileSystem (Ljava/net/URI;Ljava/util/Map;)Ljava/nio/file/FileSystem;
      // ce: putfield k74/x/IlllIlI.IIIIlI Ljava/nio/file/FileSystem;
      // d1: aload 0
      // d2: bipush 1
      // d3: putfield k74/x/IlllIlI.IlI Z
      // d6: goto e7
      // d9: astore 3
      // da: aload 0
      // db: aload 2
      // dc: invokestatic java/nio/file/FileSystems.getFileSystem (Ljava/net/URI;)Ljava/nio/file/FileSystem;
      // df: putfield k74/x/IlllIlI.IIIIlI Ljava/nio/file/FileSystem;
      // e2: aload 0
      // e3: bipush 0
      // e4: putfield k74/x/IlllIlI.IlI Z
      // e7: aload 0
      // e8: getfield k74/x/IlllIlI.IIIIlI Ljava/nio/file/FileSystem;
      // eb: areturn
      // ec: astore 2
      // ed: aconst_null
      // ee: areturn
   }

   private static boolean lIIll(Path var0) {
      return Files.isRegularFile(var0);
   }

   public class_306 lIlII() {
      return this.IIlIl;
   }

   private String lIlIl(lllIllII var1) {
      try {
         if (var1 == lllIllII.l) {
            return Illl.llIl();
         }
      } catch (MatchException var2) {
         throw l(var2);
      }

      return Illll.llIl();
   }

   public void lIllI(lllIllII param1, lIIIlIlI param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: putfield k74/x/IlllIlI.IIllII Lk74/x/lllIllII;
      // 05: aload 0
      // 06: getfield k74/x/IlllIlI.IIllII Lk74/x/lllIllII;
      // 09: getstatic k74/x/lllIllII.l Lk74/x/lllIllII;
      // 0c: if_acmpeq 1d
      // 0f: aload 0
      // 10: getstatic k74/x/lllIllII.l Lk74/x/lllIllII;
      // 13: putfield k74/x/IlllIlI.IIllII Lk74/x/lllIllII;
      // 16: goto 1d
      // 19: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: aload 0
      // 1e: invokevirtual k74/x/IlllIlI.lIll ()V
      // 21: aload 0
      // 22: invokevirtual k74/x/IlllIlI.IIII ()Ljava/nio/file/Path;
      // 25: astore 3
      // 26: aload 3
      // 27: ifnull 48
      // 2a: aload 3
      // 2b: bipush 0
      // 2c: anewarray 116
      // 2f: invokestatic java/nio/file/Files.exists (Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
      // 32: ifeq 48
      // 35: goto 3c
      // 38: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b: athrow
      // 3c: aload 0
      // 3d: aload 2
      // 3e: invokevirtual k74/x/IlllIlI.lIl (Lk74/x/lIIIlIlI;)V
      // 41: goto 4d
      // 44: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 47: athrow
      // 48: aload 0
      // 49: aload 2
      // 4a: invokevirtual k74/x/IlllIlI.llllI (Lk74/x/lIIIlIlI;)V
      // 4d: return
   }

   private static int lIIIIl(int var0, int var1) {
      int var2 = IIllll[var0 ^ 288491210] ^ var1 ^ var0;
      var2 += 59674;
      var2 += 59236;
      var2 -= 39287;
      var2 -= 51958;
      var2 += 23491;
      var2 ^= 13867;
      var2 += 57199;
      return var2 + 54257;
   }

   private static boolean lIlll(Path var0) {
      try {
         if (!var0.getFileName()
            .toString()
            .contains(IlIIllIII.lI(IIIIlI(lIIIIl(288491178, 1691654871 ^ -1295739693), lIIIIl(288491179, 1691654871 ^ 733667307))))) {
            return true;
         }
      } catch (MatchException var1) {
         throw l(var1);
      }

      return false;
   }

   static JsonElement llIII(JsonObject var0, long var1) {
      try {
         if (var0 == null) {
            return null;
         }
      } catch (MatchException var8) {
         throw l(var8);
      }

      String var3 = llIl(var1);

      try {
         if (var0.has(var3)) {
            return var0.get(var3);
         }
      } catch (MatchException var7) {
         throw l(var7);
      }

      for (Entry var5 : var0.entrySet()) {
         try {
            if (IlIIllIII.IlIl((String)var5.getKey()) == var1) {
               return (JsonElement)var5.getValue();
            }
         } catch (MatchException var6) {
            throw l(var6);
         }
      }

      return null;
   }

   private void llIIl(Path var1, boolean var2, Path var3) {
      this.IIIIII(var3, var1.resolve(var3.getFileName()), var2);
   }

   public Path llIlI() {
      Path var1 = this.IIl(lllIllII.l);

      try {
         if (var1 == null) {
            return null;
         }
      } catch (MatchException var2) {
         throw l(var2);
      }

      return var1.resolve(IIlIII.llIl());
   }

   private void llIll(Path param1, Path param2, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 21
      // 04: aload 2
      // 05: ifnull 21
      // 08: goto 0f
      // 0b: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e: athrow
      // 0f: aload 1
      // 10: bipush 0
      // 11: anewarray 116
      // 14: invokestatic java/nio/file/Files.isDirectory (Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
      // 17: ifne 26
      // 1a: goto 21
      // 1d: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: return
      // 22: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25: athrow
      // 26: aload 2
      // 27: bipush 0
      // 28: anewarray 469
      // 2b: invokestatic java/nio/file/Files.createDirectories (Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;
      // 2e: pop
      // 2f: aload 1
      // 30: invokestatic java/nio/file/Files.list (Ljava/nio/file/Path;)Ljava/util/stream/Stream;
      // 33: astore 4
      // 35: aload 4
      // 37: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, k74/x/IlllIlI.lIIIII (Ljava/nio/file/Path;)Z, (Ljava/nio/file/Path;)Z ]
      // 3c: invokeinterface java/util/stream/Stream.filter (Ljava/util/function/Predicate;)Ljava/util/stream/Stream; 2
      // 41: aload 0
      // 42: aload 2
      // 43: iload 3
      // 44: invokedynamic accept (Lk74/x/IlllIlI;Ljava/nio/file/Path;Z)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, k74/x/IlllIlI.llIIl (Ljava/nio/file/Path;ZLjava/nio/file/Path;)V, (Ljava/nio/file/Path;)V ]
      // 49: invokeinterface java/util/stream/Stream.forEach (Ljava/util/function/Consumer;)V 2
      // 4e: aload 4
      // 50: ifnull 7a
      // 53: aload 4
      // 55: invokeinterface java/util/stream/Stream.close ()V 1
      // 5a: goto 7a
      // 5d: astore 5
      // 5f: aload 4
      // 61: ifnull 77
      // 64: aload 4
      // 66: invokeinterface java/util/stream/Stream.close ()V 1
      // 6b: goto 77
      // 6e: astore 6
      // 70: aload 5
      // 72: aload 6
      // 74: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 77: aload 5
      // 79: athrow
      // 7a: goto 7f
      // 7d: astore 4
      // 7f: return
   }

   private void lllII(Path param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokevirtual k74/x/IlllIlI.lll ()Ljava/nio/file/Path;
      // 004: astore 2
      // 005: aload 1
      // 006: ifnull 014
      // 009: aload 2
      // 00a: ifnonnull 019
      // 00d: goto 014
      // 010: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 013: athrow
      // 014: return
      // 015: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 018: athrow
      // 019: aload 1
      // 01a: invokeinterface java/nio/file/Path.toAbsolutePath ()Ljava/nio/file/Path; 1
      // 01f: invokeinterface java/nio/file/Path.normalize ()Ljava/nio/file/Path; 1
      // 024: aload 2
      // 025: invokeinterface java/nio/file/Path.toAbsolutePath ()Ljava/nio/file/Path; 1
      // 02a: invokeinterface java/nio/file/Path.normalize ()Ljava/nio/file/Path; 1
      // 02f: invokeinterface java/nio/file/Path.equals (Ljava/lang/Object;)Z 2
      // 034: ifeq 03c
      // 037: return
      // 038: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03b: athrow
      // 03c: aload 0
      // 03d: aload 1
      // 03e: getstatic k74/x/IlllIlI.Illl Lk74/x/IIIlIlIl;
      // 041: invokevirtual k74/x/IIIlIlIl.llIl ()Ljava/lang/String;
      // 044: invokeinterface java/nio/file/Path.resolve (Ljava/lang/String;)Ljava/nio/file/Path; 2
      // 049: aload 0
      // 04a: getstatic k74/x/lllIllII.l Lk74/x/lllIllII;
      // 04d: invokevirtual k74/x/IlllIlI.IIlIll (Lk74/x/lllIllII;)Ljava/nio/file/Path;
      // 050: bipush 1
      // 051: invokevirtual k74/x/IlllIlI.IIIIII (Ljava/nio/file/Path;Ljava/nio/file/Path;Z)Z
      // 054: pop
      // 055: aload 0
      // 056: aload 1
      // 057: getstatic k74/x/IlllIlI.IllIl Lk74/x/IIIlIlIl;
      // 05a: invokevirtual k74/x/IIIlIlIl.llIl ()Ljava/lang/String;
      // 05d: invokeinterface java/nio/file/Path.resolve (Ljava/lang/String;)Ljava/nio/file/Path; 2
      // 062: aload 0
      // 063: invokevirtual k74/x/IlllIlI.IIllI ()Ljava/nio/file/Path;
      // 066: bipush 1
      // 067: invokevirtual k74/x/IlllIlI.llIll (Ljava/nio/file/Path;Ljava/nio/file/Path;Z)V
      // 06a: aload 0
      // 06b: aload 1
      // 06c: getstatic k74/x/IlllIlI.IlIII Lk74/x/IIIlIlIl;
      // 06f: invokevirtual k74/x/IIIlIlIl.llIl ()Ljava/lang/String;
      // 072: invokeinterface java/nio/file/Path.resolve (Ljava/lang/String;)Ljava/nio/file/Path; 2
      // 077: aload 0
      // 078: invokevirtual k74/x/IlllIlI.IIllI ()Ljava/nio/file/Path;
      // 07b: bipush 1
      // 07c: invokevirtual k74/x/IlllIlI.llIll (Ljava/nio/file/Path;Ljava/nio/file/Path;Z)V
      // 07f: aload 0
      // 080: aload 1
      // 081: getstatic k74/x/IlllIlI.IIlIII Lk74/x/IIIlIlIl;
      // 084: invokevirtual k74/x/IIIlIlIl.llIl ()Ljava/lang/String;
      // 087: invokeinterface java/nio/file/Path.resolve (Ljava/lang/String;)Ljava/nio/file/Path; 2
      // 08c: aload 0
      // 08d: invokevirtual k74/x/IlllIlI.llIlI ()Ljava/nio/file/Path;
      // 090: bipush 1
      // 091: invokevirtual k74/x/IlllIlI.llIll (Ljava/nio/file/Path;Ljava/nio/file/Path;Z)V
      // 094: aload 0
      // 095: aload 1
      // 096: getstatic k74/x/IlllIlI.IllIl Lk74/x/IIIlIlIl;
      // 099: invokevirtual k74/x/IIIlIlIl.llIl ()Ljava/lang/String;
      // 09c: invokeinterface java/nio/file/Path.resolve (Ljava/lang/String;)Ljava/nio/file/Path; 2
      // 0a1: getstatic k74/x/IlllIlI.IIlIII Lk74/x/IIIlIlIl;
      // 0a4: invokevirtual k74/x/IIIlIlIl.llIl ()Ljava/lang/String;
      // 0a7: invokeinterface java/nio/file/Path.resolve (Ljava/lang/String;)Ljava/nio/file/Path; 2
      // 0ac: aload 0
      // 0ad: invokevirtual k74/x/IlllIlI.llIlI ()Ljava/nio/file/Path;
      // 0b0: bipush 1
      // 0b1: invokevirtual k74/x/IlllIlI.llIll (Ljava/nio/file/Path;Ljava/nio/file/Path;Z)V
      // 0b4: aload 0
      // 0b5: aload 1
      // 0b6: getstatic k74/x/IlllIlI.lIlll Lk74/x/IIIlIlIl;
      // 0b9: invokevirtual k74/x/IIIlIlIl.llIl ()Ljava/lang/String;
      // 0bc: invokeinterface java/nio/file/Path.resolve (Ljava/lang/String;)Ljava/nio/file/Path; 2
      // 0c1: aload 0
      // 0c2: invokevirtual k74/x/IlllIlI.IlllI ()Ljava/nio/file/Path;
      // 0c5: bipush 1
      // 0c6: invokevirtual k74/x/IlllIlI.llIll (Ljava/nio/file/Path;Ljava/nio/file/Path;Z)V
      // 0c9: aload 0
      // 0ca: aload 1
      // 0cb: getstatic k74/x/IlllIlI.IIlIll Lk74/x/IIIlIlIl;
      // 0ce: invokevirtual k74/x/IIIlIlIl.llIl ()Ljava/lang/String;
      // 0d1: invokeinterface java/nio/file/Path.resolve (Ljava/lang/String;)Ljava/nio/file/Path; 2
      // 0d6: aload 0
      // 0d7: invokevirtual k74/x/IlllIlI.IlllI ()Ljava/nio/file/Path;
      // 0da: bipush 1
      // 0db: invokevirtual k74/x/IlllIlI.llIll (Ljava/nio/file/Path;Ljava/nio/file/Path;Z)V
      // 0de: aload 0
      // 0df: aload 1
      // 0e0: getstatic k74/x/IlllIlI.lllIl Lk74/x/IIIlIlIl;
      // 0e3: invokevirtual k74/x/IIIlIlIl.llIl ()Ljava/lang/String;
      // 0e6: invokeinterface java/nio/file/Path.resolve (Ljava/lang/String;)Ljava/nio/file/Path; 2
      // 0eb: aload 0
      // 0ec: invokevirtual k74/x/IlllIlI.IIllll ()Ljava/nio/file/Path;
      // 0ef: bipush 1
      // 0f0: invokevirtual k74/x/IlllIlI.IIIIII (Ljava/nio/file/Path;Ljava/nio/file/Path;Z)Z
      // 0f3: pop
      // 0f4: aload 0
      // 0f5: aload 1
      // 0f6: getstatic k74/x/IlllIlI.IllIl Lk74/x/IIIlIlIl;
      // 0f9: invokevirtual k74/x/IIIlIlIl.llIl ()Ljava/lang/String;
      // 0fc: invokeinterface java/nio/file/Path.resolve (Ljava/lang/String;)Ljava/nio/file/Path; 2
      // 101: getstatic k74/x/IlllIlI.IIlIII Lk74/x/IIIlIlIl;
      // 104: invokevirtual k74/x/IIIlIlIl.llIl ()Ljava/lang/String;
      // 107: invokeinterface java/nio/file/Path.resolve (Ljava/lang/String;)Ljava/nio/file/Path; 2
      // 10c: invokevirtual k74/x/IlllIlI.IIll (Ljava/nio/file/Path;)V
      // 10f: aload 0
      // 110: aload 1
      // 111: getstatic k74/x/IlllIlI.IllIl Lk74/x/IIIlIlIl;
      // 114: invokevirtual k74/x/IIIlIlIl.llIl ()Ljava/lang/String;
      // 117: invokeinterface java/nio/file/Path.resolve (Ljava/lang/String;)Ljava/nio/file/Path; 2
      // 11c: invokevirtual k74/x/IlllIlI.IIll (Ljava/nio/file/Path;)V
      // 11f: aload 0
      // 120: aload 1
      // 121: getstatic k74/x/IlllIlI.IlIII Lk74/x/IIIlIlIl;
      // 124: invokevirtual k74/x/IIIlIlIl.llIl ()Ljava/lang/String;
      // 127: invokeinterface java/nio/file/Path.resolve (Ljava/lang/String;)Ljava/nio/file/Path; 2
      // 12c: invokevirtual k74/x/IlllIlI.IIll (Ljava/nio/file/Path;)V
      // 12f: aload 0
      // 130: aload 1
      // 131: getstatic k74/x/IlllIlI.IIlIII Lk74/x/IIIlIlIl;
      // 134: invokevirtual k74/x/IIIlIlIl.llIl ()Ljava/lang/String;
      // 137: invokeinterface java/nio/file/Path.resolve (Ljava/lang/String;)Ljava/nio/file/Path; 2
      // 13c: invokevirtual k74/x/IlllIlI.IIll (Ljava/nio/file/Path;)V
      // 13f: aload 0
      // 140: aload 1
      // 141: getstatic k74/x/IlllIlI.lIlll Lk74/x/IIIlIlIl;
      // 144: invokevirtual k74/x/IIIlIlIl.llIl ()Ljava/lang/String;
      // 147: invokeinterface java/nio/file/Path.resolve (Ljava/lang/String;)Ljava/nio/file/Path; 2
      // 14c: invokevirtual k74/x/IlllIlI.IIll (Ljava/nio/file/Path;)V
      // 14f: aload 0
      // 150: aload 1
      // 151: getstatic k74/x/IlllIlI.IIlIll Lk74/x/IIIlIlIl;
      // 154: invokevirtual k74/x/IIIlIlIl.llIl ()Ljava/lang/String;
      // 157: invokeinterface java/nio/file/Path.resolve (Ljava/lang/String;)Ljava/nio/file/Path; 2
      // 15c: invokevirtual k74/x/IlllIlI.IIll (Ljava/nio/file/Path;)V
      // 15f: aload 0
      // 160: aload 1
      // 161: invokevirtual k74/x/IlllIlI.IIll (Ljava/nio/file/Path;)V
      // 164: return
   }

   private lllIIlIl lllIl(String var1) {
      lllIIlIl[] var2 = lllIIlIl.values();

      try {
         label60: {
            int var3 = Integer.parseInt(var1);

            try {
               if (var3 < 0 || var3 >= var2.length) {
                  break label60;
               }
            } catch (NumberFormatException var9) {
               throw l(var9);
            }

            return var2[var3];
         }
      } catch (NumberFormatException var10) {
      }

      try {
         if (IlIIllIII.lI(IIIIlI(lIIIIl(288491176, 3007598 ^ 32724526), lIIIIl(288491177, 3007598 ^ -688739406))).equalsIgnoreCase(var1)) {
            return lllIIlIl.Ill;
         }
      } catch (NumberFormatException var8) {
         throw l(var8);
      }

      for (lllIIlIl var6 : var2) {
         try {
            if (k74.x.IllIl.l(var6, var1)) {
               return var6;
            }
         } catch (NumberFormatException var7) {
            throw l(var7);
         }
      }

      return lllIIlIl.IlI;
   }

   public void llllI(lIIIlIlI param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: invokevirtual k74/x/IlllIlI.lllI (Lk74/x/lIIIlIlI;)Lcom/google/gson/JsonObject;
      // 05: astore 2
      // 06: aload 0
      // 07: getfield k74/x/IlllIlI.lIIII Lk74/x/IIlIIll;
      // 0a: astore 3
      // 0b: aload 3
      // 0c: ifnull 3d
      // 0f: aload 3
      // 10: invokeinterface k74/x/IIlIIll.l ()Z 1
      // 15: ifne 24
      // 18: goto 1f
      // 1b: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: return
      // 20: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23: athrow
      // 24: aload 3
      // 25: getstatic k74/x/IlllIlI.ll Lcom/google/gson/Gson;
      // 28: aload 2
      // 29: invokevirtual com/google/gson/Gson.toJson (Lcom/google/gson/JsonElement;)Ljava/lang/String;
      // 2c: invokeinterface k74/x/IIlIIll.II (Ljava/lang/String;)Z 2
      // 31: ifeq 3d
      // 34: aload 0
      // 35: invokevirtual k74/x/IlllIlI.IllIll ()V
      // 38: return
      // 39: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c: athrow
      // 3d: aload 0
      // 3e: invokevirtual k74/x/IlllIlI.IIII ()Ljava/nio/file/Path;
      // 41: astore 4
      // 43: aload 4
      // 45: ifnonnull 4d
      // 48: return
      // 49: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4c: athrow
      // 4d: aload 4
      // 4f: invokeinterface java/nio/file/Path.getParent ()Ljava/nio/file/Path; 1
      // 54: bipush 0
      // 55: anewarray 469
      // 58: invokestatic java/nio/file/Files.createDirectories (Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;
      // 5b: pop
      // 5c: aload 4
      // 5e: getstatic k74/x/IlllIlI.IIIIIl Lcom/google/gson/Gson;
      // 61: aload 2
      // 62: invokevirtual com/google/gson/Gson.toJson (Lcom/google/gson/JsonElement;)Ljava/lang/String;
      // 65: bipush 0
      // 66: anewarray 672
      // 69: invokestatic java/nio/file/Files.writeString (Ljava/nio/file/Path;Ljava/lang/CharSequence;[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;
      // 6c: pop
      // 6d: goto 72
      // 70: astore 5
      // 72: return
   }

   public void lllll() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/IlllIlI.IIIIlI Ljava/nio/file/FileSystem;
      // 04: ifnull 3f
      // 07: aload 0
      // 08: getfield k74/x/IlllIlI.IIIIlI Ljava/nio/file/FileSystem;
      // 0b: invokevirtual java/nio/file/FileSystem.isOpen ()Z
      // 0e: ifeq 3f
      // 11: goto 18
      // 14: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: aload 0
      // 19: getfield k74/x/IlllIlI.IlI Z
      // 1c: ifeq 35
      // 1f: goto 26
      // 22: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25: athrow
      // 26: aload 0
      // 27: getfield k74/x/IlllIlI.IIIIlI Ljava/nio/file/FileSystem;
      // 2a: invokevirtual java/nio/file/FileSystem.close ()V
      // 2d: goto 35
      // 30: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 33: athrow
      // 34: astore 1
      // 35: aload 0
      // 36: aconst_null
      // 37: putfield k74/x/IlllIlI.IIIIlI Ljava/nio/file/FileSystem;
      // 3a: aload 0
      // 3b: bipush 0
      // 3c: putfield k74/x/IlllIlI.IlI Z
      // 3f: return
   }

   private boolean IIIIII(Path param1, Path param2, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 21
      // 04: aload 2
      // 05: ifnull 21
      // 08: goto 0f
      // 0b: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e: athrow
      // 0f: aload 1
      // 10: bipush 0
      // 11: anewarray 116
      // 14: invokestatic java/nio/file/Files.isRegularFile (Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
      // 17: ifne 27
      // 1a: goto 21
      // 1d: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: bipush 0
      // 22: ireturn
      // 23: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26: athrow
      // 27: aload 1
      // 28: invokeinterface java/nio/file/Path.toAbsolutePath ()Ljava/nio/file/Path; 1
      // 2d: invokeinterface java/nio/file/Path.normalize ()Ljava/nio/file/Path; 1
      // 32: aload 2
      // 33: invokeinterface java/nio/file/Path.toAbsolutePath ()Ljava/nio/file/Path; 1
      // 38: invokeinterface java/nio/file/Path.normalize ()Ljava/nio/file/Path; 1
      // 3d: invokeinterface java/nio/file/Path.equals (Ljava/lang/Object;)Z 2
      // 42: ifeq 4b
      // 45: bipush 0
      // 46: ireturn
      // 47: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a: athrow
      // 4b: bipush 0
      // 4c: istore 4
      // 4e: aload 2
      // 4f: invokeinterface java/nio/file/Path.getParent ()Ljava/nio/file/Path; 1
      // 54: bipush 0
      // 55: anewarray 469
      // 58: invokestatic java/nio/file/Files.createDirectories (Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;
      // 5b: pop
      // 5c: aload 2
      // 5d: bipush 0
      // 5e: anewarray 116
      // 61: invokestatic java/nio/file/Files.exists (Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
      // 64: ifne a1
      // 67: aload 1
      // 68: invokeinterface java/nio/file/Path.getFileSystem ()Ljava/nio/file/FileSystem; 1
      // 6d: aload 2
      // 6e: invokeinterface java/nio/file/Path.getFileSystem ()Ljava/nio/file/FileSystem; 1
      // 73: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 76: ifeq 91
      // 79: goto 80
      // 7c: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7f: athrow
      // 80: aload 1
      // 81: aload 2
      // 82: bipush 0
      // 83: anewarray 541
      // 86: invokestatic java/nio/file/Files.copy (Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;
      // 89: pop
      // 8a: goto 9e
      // 8d: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 90: athrow
      // 91: aload 2
      // 92: aload 1
      // 93: invokestatic java/nio/file/Files.readString (Ljava/nio/file/Path;)Ljava/lang/String;
      // 96: bipush 0
      // 97: anewarray 672
      // 9a: invokestatic java/nio/file/Files.writeString (Ljava/nio/file/Path;Ljava/lang/CharSequence;[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;
      // 9d: pop
      // 9e: bipush 1
      // 9f: istore 4
      // a1: iload 3
      // a2: ifeq bd
      // a5: iload 4
      // a7: ifeq bd
      // aa: goto b1
      // ad: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b0: athrow
      // b1: aload 1
      // b2: invokestatic java/nio/file/Files.deleteIfExists (Ljava/nio/file/Path;)Z
      // b5: pop
      // b6: goto bd
      // b9: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // bc: athrow
      // bd: goto c4
      // c0: astore 5
      // c2: bipush 0
      // c3: ireturn
      // c4: iload 4
      // c6: ireturn
   }

   private static void IIIIIl(JsonObject var0) {
      try {
         IIIII(var0, lIl);
         if (!IlIIIl(var0, lllI)) {
            return;
         }
      } catch (MatchException var7) {
         throw l(var7);
      }

      JsonObject var1 = lIIII(var0, lllI);

      try {
         if (var1 == null) {
            IIIII(var0, lllI);
            return;
         }
      } catch (MatchException var4) {
         throw l(var4);
      }

      JsonObject var10000;
      label40: {
         try {
            if (var1.has(IlIIllIII.lI(IIIIlI(lIIIIl(288491182, 1668084894 ^ 528654730), lIIIIl(288491183, 1668084894 ^ -2063491678))))) {
               var10000 = var1.getAsJsonObject(IlIIllIII.lI(IIIIlI(lIIIIl(288491180, 1668084894 ^ 1223064910), lIIIIl(288491181, 1668084894 ^ -949600677))));
               break label40;
            }
         } catch (MatchException var6) {
            throw l(var6);
         }

         var10000 = new JsonObject();
      }

      JsonObject var2 = var10000;
      boolean var3 = IIlIlI(var1);

      try {
         if (!IlIIIl(var0, llIll)) {
            IIllII(var0, llIll, IIlII(var1, var2, var3));
         }
      } catch (MatchException var5) {
         throw l(var5);
      }

      IIIII(var0, lllI);
   }

   private static String IIIIlI(int var0, int var1) {
      int var9 = -1098435420;
      int var2 = (var0 ^ lIIIIl(288491170, var9 ^ 1234823118)) & lIIIIl(288491171, var9 ^ 1093840877);
      if (IlII[var2] == null) {
         char[] var3 = IIIIll[var2].toCharArray();

         int var4 = switch (var3[0] & lIIIIl(288491168, var9 ^ 1527173041)) {
            case 0 -> lIIIIl(288491169, var9 ^ -1318875668);
            case 1 -> lIIIIl(288491174, var9 ^ -2139213341);
            case 2 -> lIIIIl(288491175, var9 ^ -2025516495);
            case 3 -> lIIIIl(288491172, var9 ^ 1555152326);
            case 4 -> lIIIIl(288491173, var9 ^ -272424500);
            case 5 -> lIIIIl(288491194, var9 ^ 1348445455);
            case 6 -> lIIIIl(288491195, var9 ^ 141406595);
            case 7 -> lIIIIl(288491192, var9 ^ 1193266388);
            case 8 -> lIIIIl(288491193, var9 ^ -480466529);
            case 9 -> lIIIIl(288491198, var9 ^ 1206715581);
            case 10 -> lIIIIl(288491199, var9 ^ 511948446);
            case 11 -> lIIIIl(288491196, var9 ^ -582794564);
            case 12 -> lIIIIl(288491197, var9 ^ -1752506569);
            case 13 -> lIIIIl(288491186, var9 ^ -302540208);
            case 14 -> lIIIIl(288491187, var9 ^ 336293727);
            case 15 -> lIIIIl(288491184, var9 ^ 1307740366);
            case 16 -> lIIIIl(288491185, var9 ^ 378460538);
            case 17 -> 4;
            case 18 -> lIIIIl(288491190, var9 ^ -1964686327);
            case 19 -> lIIIIl(288491191, var9 ^ -1678639007);
            case 20 -> lIIIIl(288491188, var9 ^ -241692070);
            case 21 -> lIIIIl(288491189, var9 ^ 1462119685);
            case 22 -> 2;
            case 23 -> lIIIIl(288491082, var9 ^ 1290072711);
            case 24 -> lIIIIl(288491083, var9 ^ 2130383389);
            case 25 -> lIIIIl(288491080, var9 ^ 172233445);
            case 26 -> lIIIIl(288491081, var9 ^ -592094651);
            case 27 -> lIIIIl(288491086, var9 ^ 732342069);
            case 28 -> lIIIIl(288491087, var9 ^ -2017343019);
            case 29 -> lIIIIl(288491084, var9 ^ 2095878787);
            case 30 -> lIIIIl(288491085, var9 ^ -1210203572);
            case 31 -> lIIIIl(288491074, var9 ^ -1110359392);
            case 32 -> lIIIIl(288491075, var9 ^ 688671022);
            case 33 -> lIIIIl(288491072, var9 ^ -2125504898);
            case 34 -> lIIIIl(288491073, var9 ^ -637874115);
            case 35 -> lIIIIl(288491078, var9 ^ -1781727336);
            case 36 -> lIIIIl(288491079, var9 ^ -1282738146);
            case 37 -> lIIIIl(288491076, var9 ^ 73536175);
            case 38 -> lIIIIl(288491077, var9 ^ 466910255);
            case 39 -> lIIIIl(288491098, var9 ^ 668847347);
            case 40 -> lIIIIl(288491099, var9 ^ -2032913334);
            case 41 -> lIIIIl(288491096, var9 ^ 837635221);
            case 42 -> lIIIIl(288491097, var9 ^ -443990814);
            case 43 -> lIIIIl(288491102, var9 ^ 295449616);
            case 44 -> lIIIIl(288491103, var9 ^ 1372568200);
            case 45 -> lIIIIl(288491100, var9 ^ 1907417997);
            case 46 -> lIIIIl(288491101, var9 ^ -1112006835);
            case 47 -> lIIIIl(288491090, var9 ^ -1613561999);
            case 48 -> lIIIIl(288491091, var9 ^ 255102740);
            case 49 -> lIIIIl(288491088, var9 ^ -1958267364);
            case 50 -> lIIIIl(288491089, var9 ^ 2063435969);
            case 51 -> lIIIIl(288491094, var9 ^ -1847978627);
            case 52 -> lIIIIl(288491095, var9 ^ -1812187852);
            case 53 -> lIIIIl(288491092, var9 ^ -82448371);
            case 54 -> lIIIIl(288491093, var9 ^ 2039518387);
            case 55 -> lIIIIl(288491114, var9 ^ -898703683);
            case 56 -> lIIIIl(288491115, var9 ^ 371183138);
            case 57 -> lIIIIl(288491112, var9 ^ 162840722);
            case 58 -> lIIIIl(288491113, var9 ^ 1677558903);
            case 59 -> lIIIIl(288491118, var9 ^ -556794930);
            case 60 -> lIIIIl(288491119, var9 ^ -1548239301);
            case 61 -> lIIIIl(288491116, var9 ^ -502501152);
            case 62 -> lIIIIl(288491117, var9 ^ -432684612);
            case 63 -> lIIIIl(288491106, var9 ^ -40165198);
            case 64 -> lIIIIl(288491107, var9 ^ 1942346937);
            case 65 -> lIIIIl(288491104, var9 ^ 1338566403);
            case 66 -> lIIIIl(288491105, var9 ^ -876565150);
            case 67 -> lIIIIl(288491110, var9 ^ -1431758374);
            case 68 -> lIIIIl(288491111, var9 ^ -539023174);
            case 69 -> lIIIIl(288491108, var9 ^ 1623327022);
            case 70 -> lIIIIl(288491109, var9 ^ -1089740285);
            case 71 -> lIIIIl(288491130, var9 ^ -844722333);
            case 72 -> lIIIIl(288491131, var9 ^ -438767210);
            case 73 -> lIIIIl(288491128, var9 ^ -1111136085);
            case 74 -> lIIIIl(288491129, var9 ^ 635312111);
            case 75 -> lIIIIl(288491134, var9 ^ -2110383977);
            case 76 -> lIIIIl(288491135, var9 ^ -2015572342);
            case 77 -> lIIIIl(288491132, var9 ^ 664687072);
            case 78 -> lIIIIl(288491133, var9 ^ -366034308);
            case 79 -> lIIIIl(288491122, var9 ^ -482317741);
            case 80 -> lIIIIl(288491123, var9 ^ 657910579);
            case 81 -> lIIIIl(288491120, var9 ^ -1112689385);
            case 82 -> lIIIIl(288491121, var9 ^ 422161406);
            case 83 -> lIIIIl(288491126, var9 ^ 1473314660);
            case 84 -> lIIIIl(288491127, var9 ^ 1663592208);
            case 85 -> lIIIIl(288491124, var9 ^ 153782388);
            case 86 -> lIIIIl(288491125, var9 ^ 891123412);
            case 87 -> lIIIIl(288491018, var9 ^ 750718006);
            case 88 -> lIIIIl(288491019, var9 ^ 1644965370);
            case 89 -> lIIIIl(288491016, var9 ^ -882395588);
            case 90 -> lIIIIl(288491017, var9 ^ -1057119163);
            case 91 -> lIIIIl(288491022, var9 ^ -761881497);
            case 92 -> lIIIIl(288491023, var9 ^ -680896738);
            case 93 -> lIIIIl(288491020, var9 ^ -98435656);
            case 94 -> lIIIIl(288491021, var9 ^ 1218208584);
            case 95 -> lIIIIl(288491010, var9 ^ -662433260);
            case 96 -> 3;
            case 97 -> lIIIIl(288491011, var9 ^ -463182971);
            case 98 -> lIIIIl(288491008, var9 ^ 944336001);
            case 99 -> lIIIIl(288491009, var9 ^ -386494058);
            case 100 -> lIIIIl(288491014, var9 ^ -769156272);
            case 101 -> lIIIIl(288491015, var9 ^ 894215965);
            case 102 -> lIIIIl(288491012, var9 ^ 1545014148);
            case 103 -> lIIIIl(288491013, var9 ^ -985738595);
            case 104 -> lIIIIl(288491034, var9 ^ 1650071066);
            case 105 -> lIIIIl(288491035, var9 ^ 955212245);
            case 106 -> lIIIIl(288491032, var9 ^ -530691369);
            case 107 -> lIIIIl(288491033, var9 ^ 458895315);
            case 108 -> lIIIIl(288491038, var9 ^ 144113045);
            case 109 -> lIIIIl(288491039, var9 ^ -2031900788);
            case 110 -> lIIIIl(288491036, var9 ^ 1192368019);
            case 111 -> lIIIIl(288491037, var9 ^ 1589311872);
            case 112 -> lIIIIl(288491026, var9 ^ -1887413952);
            case 113 -> lIIIIl(288491027, var9 ^ 1555237592);
            case 114 -> lIIIIl(288491024, var9 ^ 99808202);
            case 115 -> lIIIIl(288491025, var9 ^ 2130074253);
            case 116 -> lIIIIl(288491030, var9 ^ 1639132707);
            case 117 -> lIIIIl(288491031, var9 ^ 499366824);
            case 118 -> lIIIIl(288491028, var9 ^ -1518740285);
            case 119 -> lIIIIl(288491029, var9 ^ 1547766777);
            case 120 -> lIIIIl(288491050, var9 ^ -1277499987);
            case 121 -> lIIIIl(288491051, var9 ^ 514057503);
            case 122 -> lIIIIl(288491048, var9 ^ 834881127);
            case 123 -> lIIIIl(288491049, var9 ^ 492799804);
            case 124 -> lIIIIl(288491054, var9 ^ -1587414867);
            case 125 -> lIIIIl(288491055, var9 ^ -136883025);
            case 126 -> lIIIIl(288491052, var9 ^ -2035878180);
            case 127 -> lIIIIl(288491053, var9 ^ 819091731);
            case 128 -> lIIIIl(288491042, var9 ^ 127051242);
            case 129 -> lIIIIl(288491043, var9 ^ 1043457445);
            case 130 -> lIIIIl(288491040, var9 ^ 1628928054);
            case 131 -> 1;
            case 132 -> lIIIIl(288491041, var9 ^ 488009952);
            case 133 -> lIIIIl(288491046, var9 ^ -1751992505);
            case 134 -> lIIIIl(288491047, var9 ^ -394946442);
            case 135 -> lIIIIl(288491044, var9 ^ -2017182140);
            case 136 -> lIIIIl(288491045, var9 ^ -1034716630);
            case 137 -> lIIIIl(288491066, var9 ^ -1808233606);
            case 138 -> lIIIIl(288491067, var9 ^ -309023434);
            case 139 -> lIIIIl(288491064, var9 ^ 55843608);
            case 140 -> lIIIIl(288491065, var9 ^ -516934514);
            case 141 -> lIIIIl(288491070, var9 ^ 901614016);
            case 142 -> lIIIIl(288491071, var9 ^ -51440984);
            case 143 -> lIIIIl(288491068, var9 ^ 209167621);
            case 144 -> lIIIIl(288491069, var9 ^ 1299298847);
            case 145 -> lIIIIl(288491058, var9 ^ 669979543);
            case 146 -> 5;
            case 147 -> lIIIIl(288491059, var9 ^ 1603186451);
            case 148 -> lIIIIl(288491056, var9 ^ -2054707086);
            case 149 -> lIIIIl(288491057, var9 ^ -1838268603);
            case 150 -> lIIIIl(288491062, var9 ^ -747520368);
            case 151 -> lIIIIl(288491063, var9 ^ -1629317550);
            case 152 -> lIIIIl(288491060, var9 ^ -1128264);
            case 153 -> lIIIIl(288491061, var9 ^ 460182582);
            case 154 -> lIIIIl(288491466, var9 ^ 1143769164);
            case 155 -> lIIIIl(288491467, var9 ^ -248372796);
            case 156 -> lIIIIl(288491464, var9 ^ 1761614258);
            case 157 -> lIIIIl(288491465, var9 ^ 805574913);
            case 158 -> lIIIIl(288491470, var9 ^ 1101959111);
            case 159 -> lIIIIl(288491471, var9 ^ -1946349788);
            case 160 -> lIIIIl(288491468, var9 ^ 1759613367);
            case 161 -> lIIIIl(288491469, var9 ^ -820788008);
            case 162 -> lIIIIl(288491458, var9 ^ -885884243);
            case 163 -> lIIIIl(288491459, var9 ^ -1891993123);
            case 164 -> lIIIIl(288491456, var9 ^ 1307550455);
            case 165 -> lIIIIl(288491457, var9 ^ -1138638871);
            case 166 -> lIIIIl(288491462, var9 ^ 1306268093);
            case 167 -> lIIIIl(288491463, var9 ^ -1219797586);
            case 168 -> lIIIIl(288491460, var9 ^ 2007256342);
            case 169 -> lIIIIl(288491461, var9 ^ 2105320919);
            case 170 -> lIIIIl(288491482, var9 ^ 2043936579);
            case 171 -> lIIIIl(288491483, var9 ^ -1040173674);
            case 172 -> lIIIIl(288491480, var9 ^ 1085293465);
            case 173 -> lIIIIl(288491481, var9 ^ -464527902);
            case 174 -> lIIIIl(288491486, var9 ^ -1400960314);
            case 175 -> lIIIIl(288491487, var9 ^ -330352047);
            case 176 -> lIIIIl(288491484, var9 ^ 1298007334);
            case 177 -> lIIIIl(288491485, var9 ^ 63192981);
            case 178 -> lIIIIl(288491474, var9 ^ -314679043);
            case 179 -> lIIIIl(288491475, var9 ^ 1756390934);
            case 180 -> lIIIIl(288491472, var9 ^ -1299091216);
            case 181 -> lIIIIl(288491473, var9 ^ 223127646);
            case 182 -> lIIIIl(288491478, var9 ^ 1069738128);
            case 183 -> lIIIIl(288491479, var9 ^ 2084631523);
            case 184 -> lIIIIl(288491476, var9 ^ 536106106);
            case 185 -> lIIIIl(288491477, var9 ^ -2044307485);
            case 186 -> lIIIIl(288491498, var9 ^ -1425175599);
            case 187 -> lIIIIl(288491499, var9 ^ -1580822572);
            case 188 -> lIIIIl(288491496, var9 ^ 340279247);
            case 189 -> lIIIIl(288491497, var9 ^ 494571218);
            case 190 -> lIIIIl(288491502, var9 ^ -518714802);
            case 191 -> lIIIIl(288491503, var9 ^ 1717827279);
            case 192 -> lIIIIl(288491500, var9 ^ -601804012);
            case 193 -> lIIIIl(288491501, var9 ^ -1098523523);
            case 194 -> lIIIIl(288491490, var9 ^ 1066502127);
            case 195 -> lIIIIl(288491491, var9 ^ 1639964270);
            case 196 -> lIIIIl(288491488, var9 ^ 770956973);
            case 197 -> lIIIIl(288491489, var9 ^ -1567542619);
            case 198 -> lIIIIl(288491494, var9 ^ 1255967566);
            case 199 -> lIIIIl(288491495, var9 ^ -880675439);
            case 200 -> lIIIIl(288491492, var9 ^ -359981567);
            case 201 -> lIIIIl(288491493, var9 ^ 295537070);
            case 202 -> lIIIIl(288491514, var9 ^ -2046307671);
            case 203 -> lIIIIl(288491515, var9 ^ 200845288);
            case 204 -> lIIIIl(288491512, var9 ^ 618520818);
            case 205 -> lIIIIl(288491513, var9 ^ 22838209);
            case 206 -> lIIIIl(288491518, var9 ^ -1315459874);
            case 207 -> lIIIIl(288491519, var9 ^ -1965140521);
            case 208 -> lIIIIl(288491516, var9 ^ -1857410836);
            case 209 -> lIIIIl(288491517, var9 ^ -568565096);
            case 210 -> lIIIIl(288491506, var9 ^ -1036558060);
            case 211 -> lIIIIl(288491507, var9 ^ 1796121035);
            case 212 -> lIIIIl(288491504, var9 ^ 1117055002);
            case 213 -> lIIIIl(288491505, var9 ^ 452782600);
            case 214 -> lIIIIl(288491510, var9 ^ 2061697723);
            case 215 -> lIIIIl(288491511, var9 ^ 1187790049);
            case 216 -> lIIIIl(288491508, var9 ^ 1052053624);
            case 217 -> lIIIIl(288491509, var9 ^ -556497312);
            case 218 -> lIIIIl(288491402, var9 ^ 394241577);
            case 219 -> lIIIIl(288491403, var9 ^ -1102759090);
            case 220 -> lIIIIl(288491400, var9 ^ -829676926);
            case 221 -> lIIIIl(288491401, var9 ^ -1112753802);
            case 222 -> lIIIIl(288491406, var9 ^ -1918195285);
            case 223 -> lIIIIl(288491407, var9 ^ -615019403);
            case 224 -> lIIIIl(288491404, var9 ^ 1210771601);
            case 225 -> lIIIIl(288491405, var9 ^ -1214711262);
            case 226 -> lIIIIl(288491394, var9 ^ 731737911);
            case 227 -> lIIIIl(288491395, var9 ^ -196984458);
            case 228 -> lIIIIl(288491392, var9 ^ -453366316);
            case 229 -> lIIIIl(288491393, var9 ^ 1641003216);
            case 230 -> lIIIIl(288491398, var9 ^ -415570404);
            case 231 -> lIIIIl(288491399, var9 ^ -1042809142);
            case 232 -> lIIIIl(288491396, var9 ^ -1052498310);
            case 233 -> lIIIIl(288491397, var9 ^ 115901134);
            case 234 -> lIIIIl(288491418, var9 ^ 1654649728);
            case 235 -> lIIIIl(288491419, var9 ^ 1681136309);
            case 236 -> lIIIIl(288491416, var9 ^ -1837945552);
            case 237 -> lIIIIl(288491417, var9 ^ 1628374762);
            case 238 -> lIIIIl(288491422, var9 ^ -747201928);
            case 239 -> lIIIIl(288491423, var9 ^ 2001634826);
            case 240 -> lIIIIl(288491420, var9 ^ 1025120748);
            case 241 -> lIIIIl(288491421, var9 ^ -521295817);
            case 242 -> lIIIIl(288491410, var9 ^ 2031668000);
            case 243 -> lIIIIl(288491411, var9 ^ -1875156364);
            case 244 -> lIIIIl(288491408, var9 ^ -497271101);
            case 245 -> lIIIIl(288491409, var9 ^ 822904409);
            case 246 -> lIIIIl(288491414, var9 ^ 150451969);
            case 247 -> 0;
            case 248 -> lIIIIl(288491415, var9 ^ 1382280628);
            case 249 -> lIIIIl(288491412, var9 ^ 610864842);
            case 250 -> lIIIIl(288491413, var9 ^ 1465153444);
            case 251 -> lIIIIl(288491434, var9 ^ 2133346419);
            case 252 -> lIIIIl(288491435, var9 ^ -2006400830);
            case 253 -> lIIIIl(288491432, var9 ^ -1261537623);
            case 254 -> lIIIIl(288491433, var9 ^ 1175308170);
            default -> lIIIIl(288491438, var9 ^ -72690919);
         };
         int var5 = (var1 & lIIIIl(288491439, var9 ^ -381120737)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & lIIIIl(288491436, var9 ^ 2025146845)) >>> lIIIIl(288491437, var9 ^ -205293595)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & lIIIIl(288491426, var9 ^ -1679053450);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & lIIIIl(288491427, var9 ^ -467684820);
            }
         }

         IlII[var2] = new String(var3).intern();
      }

      return IlII[var2];
   }

   private Path IIIIll() {
      return IIIlll(Ill);
   }

   private static boolean IIIlII(JsonObject param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: ifnull 32
      // 04: aload 0
      // 05: ldc_w 288491424
      // 08: ldc_w -1125435129
      // 0b: ldc_w -2029407055
      // 0e: ixor
      // 0f: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 12: ldc_w 288491425
      // 15: ldc_w -1125435129
      // 18: ldc_w 2144681557
      // 1b: ixor
      // 1c: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 1f: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 22: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 25: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 28: ifne 38
      // 2b: goto 32
      // 2e: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: bipush 0
      // 33: ireturn
      // 34: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37: athrow
      // 38: aload 0
      // 39: ldc_w 288491430
      // 3c: ldc_w -1125435129
      // 3f: ldc_w 1272667743
      // 42: ixor
      // 43: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 46: ldc_w 288491431
      // 49: ldc_w -1125435129
      // 4c: ldc_w 856359282
      // 4f: ixor
      // 50: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 53: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 56: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 59: invokevirtual com/google/gson/JsonObject.getAsJsonObject (Ljava/lang/String;)Lcom/google/gson/JsonObject;
      // 5c: astore 1
      // 5d: aload 1
      // 5e: invokevirtual com/google/gson/JsonObject.keySet ()Ljava/util/Set;
      // 61: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 66: astore 2
      // 67: aload 2
      // 68: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 6d: ifeq a8
      // 70: aload 2
      // 71: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 76: checkcast java/lang/String
      // 79: astore 3
      // 7a: aload 1
      // 7b: aload 3
      // 7c: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 7f: invokevirtual com/google/gson/JsonElement.isJsonPrimitive ()Z
      // 82: ifne 8c
      // 85: goto 67
      // 88: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8b: athrow
      // 8c: aload 1
      // 8d: aload 3
      // 8e: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 91: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 94: astore 4
      // 96: aload 4
      // 98: invokevirtual java/lang/String.isBlank ()Z
      // 9b: ifne a0
      // 9e: bipush 1
      // 9f: ireturn
      // a0: goto a5
      // a3: astore 4
      // a5: goto 67
      // a8: bipush 0
      // a9: ireturn
   }

   private void IIIlIl() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getstatic k74/x/IlllIlI.IllI Lk74/x/IIIlIlIl;
      // 04: invokestatic k74/x/IlllIlI.IIIlll (Lk74/x/IIIlIlIl;)Ljava/nio/file/Path;
      // 07: invokevirtual k74/x/IlllIlI.lllII (Ljava/nio/file/Path;)V
      // 0a: aload 0
      // 0b: getstatic k74/x/IlllIlI.llIl Lk74/x/IIIlIlIl;
      // 0e: invokestatic k74/x/IlllIlI.IIIlll (Lk74/x/IIIlIlIl;)Ljava/nio/file/Path;
      // 11: invokevirtual k74/x/IlllIlI.lllII (Ljava/nio/file/Path;)V
      // 14: aload 0
      // 15: getstatic k74/x/IlllIlI.llIII Lk74/x/IIIlIlIl;
      // 18: invokestatic k74/x/IlllIlI.IIIlll (Lk74/x/IIIlIlIl;)Ljava/nio/file/Path;
      // 1b: invokevirtual k74/x/IlllIlI.IlIII (Ljava/nio/file/Path;)V
      // 1e: aload 0
      // 1f: getstatic k74/x/IlllIlI.IIllIl Lk74/x/IIIlIlIl;
      // 22: invokestatic k74/x/IlllIlI.IIIlll (Lk74/x/IIIlIlIl;)Ljava/nio/file/Path;
      // 25: invokevirtual k74/x/IlllIlI.IlIII (Ljava/nio/file/Path;)V
      // 28: aload 0
      // 29: invokevirtual k74/x/IlllIlI.IIIIll ()Ljava/nio/file/Path;
      // 2c: astore 1
      // 2d: aload 0
      // 2e: invokevirtual k74/x/IlllIlI.lll ()Ljava/nio/file/Path;
      // 31: astore 2
      // 32: aload 1
      // 33: ifnull 41
      // 36: aload 2
      // 37: ifnonnull 46
      // 3a: goto 41
      // 3d: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 40: athrow
      // 41: return
      // 42: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 45: athrow
      // 46: aload 1
      // 47: invokeinterface java/nio/file/Path.toAbsolutePath ()Ljava/nio/file/Path; 1
      // 4c: invokeinterface java/nio/file/Path.normalize ()Ljava/nio/file/Path; 1
      // 51: aload 2
      // 52: invokeinterface java/nio/file/Path.toAbsolutePath ()Ljava/nio/file/Path; 1
      // 57: invokeinterface java/nio/file/Path.normalize ()Ljava/nio/file/Path; 1
      // 5c: invokeinterface java/nio/file/Path.equals (Ljava/lang/Object;)Z 2
      // 61: istore 3
      // 62: aload 0
      // 63: aload 1
      // 64: getstatic k74/x/IlllIlI.lIIlI Lk74/x/IIIlIlIl;
      // 67: getstatic k74/x/IlllIlI.IIIlIl Lk74/x/IIIlIlIl;
      // 6a: bipush 1
      // 6b: invokevirtual k74/x/IlllIlI.IlIIlI (Ljava/nio/file/Path;Lk74/x/IIIlIlIl;Lk74/x/IIIlIlIl;Z)V
      // 6e: aload 0
      // 6f: aload 1
      // 70: getstatic k74/x/IlllIlI.lllll Lk74/x/IIIlIlIl;
      // 73: invokevirtual k74/x/IIIlIlIl.llIl ()Ljava/lang/String;
      // 76: invokeinterface java/nio/file/Path.resolve (Ljava/lang/String;)Ljava/nio/file/Path; 2
      // 7b: aload 0
      // 7c: invokevirtual k74/x/IlllIlI.IIllll ()Ljava/nio/file/Path;
      // 7f: bipush 1
      // 80: invokevirtual k74/x/IlllIlI.IIIIII (Ljava/nio/file/Path;Ljava/nio/file/Path;Z)Z
      // 83: pop
      // 84: iload 3
      // 85: ifne 94
      // 88: aload 0
      // 89: aload 1
      // 8a: invokevirtual k74/x/IlllIlI.IIll (Ljava/nio/file/Path;)V
      // 8d: goto 94
      // 90: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 93: athrow
      // 94: return
   }

   public static Path IIIllI() {
      return IIIlll(lIIl);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = -41041089;
      int var10 = 0;
      short var12 = 24229;
      int var8 = "ߎѲ\ue883ٕ\ue88d\bꡓȢ䢑ս\ue893\u0018桓Ͳ\u088fӥ䢖ɐꡁڊ\u0891ύࢆĘ\ue85dǺ⢊ĥ⢎ňꡔ߂䢁إ梀ܨ衏݊ꢊɭ袘θࡁܪ\u0891̅䢜\b⡐Һ⢈ݕ梙ؘ⡔Ċ袏ʝ⢇Ȱ졌Һ⢂ߵ⢀߰桝ª⢈ʽꢔט桋Ѳ좜\u07b5\ue89a٨衍Ƃ\ue88cԍ좃ʸ\ue849܊䢍Н⢏\u0530\ue846ϲꢟܭꢜ͘ꡑƒ袐ڥ좁\u0600\ue857Ϻ袝ą梖ְ졘Ӳꢎ\u07bdࢄH࡞Ϛ\ue88b֕\u088fװꡇº梞ߕ䢃Ð䡀ъ袍M䢐Ǩࡍ\u05ca\ue884ܝ⢍٘ꡙ݂梓͝梍Ő\ue856\u0092\ue88dԽ좛֨⡈۪䢕օꢋۀ\ue85eȚ䢉ɭ⢕ߐࡒϲ\u088fҥ梋\u0590ꡘǢࢂí࢞@䡄:⢟؝ꢟր⡋ۊ좝ҵ좙è졗ʪ袛\u008d좏۸衊Ţ梎ͭ梑ƨ졀ղ袍ەꢔ؈ꡈв\ue884ܭ梖ň\ue840Œ䢝٥⢂ՠꡅŲ梆սࢀʰ\ue849¢梖؝ꢉÀ\ue844ق\ue88f̵ꢙ\u0018䡈҂ꢒӅꢘԠ䡖ג袖}梍Ѱ졄ޚ⢜˅ࢇߠࡏۂ梔͵⢗ઐꡲྂ\ue8a8\u0a3d梦क़桤෪被ࡥ䢲స⡯ࢪ\ue8b4ഝ梸ਈ졨\u0bba\ue8b0்梭༈졿൚좱ഽ\ue8b1เ䡠ഢ좡७⢡ම衩ప䢿\u0b7d좵௨⡮ഢ⢦\u0b65좯ઐ⡦຺ࢪ७袴ঀ졮\u0be2梲\u0cc5梬ࢸ衩ࢲ좴ਵꢫ\u0a80\u086eบ梬\u098d䢲રࡩऺ梿૭梭ธ䡺ऺࢲ\u0de5\ue8a9\u0b98桥໒ࢲໝ梤൘\ua87eࡪꢩ৵ࢻஈ⡥\u0fe2\ue8aaࢽ좮ཐ桨າ\ue8ad༝梲\u0c70衢ࡢࢽ\u0cfd⢸ന졳༢\ue8bfಽࢲଈ桲\u0bba䢾༅ꢬุ衧ࠚ袥\u0fed袲๘⡩\u0a62袥্梶ര\ua87bࡪ좴ຍꢶ༨졪ऺ좧\u0be5梼༨桶ஂࢵക⢡ୈ䡼๚⢦ࡍ梻\u0e00\ue87eੂ⢱෭\ue8b9ഈ\ue87d੪ꢣ\u0b65䢭ඨ\ue871࠺ꢧໝ䢠ऐ桶ऊꢯഝ좮ఐ衫ฒ좴ઝ\ue8a6ຘ衻ࢂꢽథ梾ਠ䡻ഊࢶऽ\ue8b6ศ桹\u0cda袣\u0e3d좢࿘\ue86bࡲꢫ\u0d0d좺૨\ue866\u0ef2䢮వ좡\u0a60䡽ࡢꢶঝ䢸ภ졪࣒ࢳவ䢼നꡪข䢠ࢽꢴन桭લ⢡ྭꢬะ졺โ䢴\u0dcd䢳\u0b98\ue87dࡂࢤႍ裔ᜈ⠚Ᏺ⣇᜕\ua8c9ᑨ\ue81aᓊ棝\u139dࣆဘ栚ቂ棗እ죓ᆀ蠈ᆺ⣒ᆅ\ue8ddዘꠋដ꣒ᎍ䣃ፘ\ue806ᇊ裒ᎍ죇ᅸ⠌ဪࣙပ⣀ᅘࠟឺ\ue8c9ᙝ죍ៈ⠊ᇊ䣍ᅅ\ua8cdዐ䠃ᑚ裆ၽࣈᚨꠁᖊ棜ᚍ\ue8c1ၠ栄ᄂ࣓\u139d\ue8dcᐈ젝ᘒ\ua8caᐭ⣂ᄈࠗည⣕Ꮵ裕ဠꠟᝪ\ue8d2ᝍ\ua8dfᕨ⠞ဲ检ᐥ裚ဘꠎგ꣖ᑵࣅᙠ⠞ᗲ⣔ᒭ\ue8cbᄨ⠝Ꮢ\ua8c9ᖵ棎ᙈ䠒ᅚ\ue8d7ပ\ue8d8Ᏸ\ue816፲䣝Ꮭ䣗ၠ⠂ᜂ裗ᆅ⣞፸젎ᛪ棂ვ\ue8d0በ젏ែ裉ኍ\ue8d7ሐ젇ᖢࣉቅ꣗ዸ\ue809Ꮢ\ue8c8ᄝ࣏ᒸ䠘ᐲ꣕ᇵࣞᛐ栒ᆂ補ድ裇ᘘ\ue80fኲ裌ᑕ⣊Ⴈ⠆ጢ裋ផ䣖შꠈᒚ棁ᗕ\ua8c6ᕐꠍዲ\ua8c6ჭ⣌ᅸꠕ\u175a\ue8ceᚍ⣇ᘘ䠟ᒚ裁ဍ꣔ᕠ⠏ዒ꣙ႝ\ua8c6ᘠꠔᄊ\ua8cc፭裀ᕰ젅ယ죌\u173d棐ម젋ᚚ棆ᚭࣅᇠ\ue81eႢ䣅\u1755죂ᒰꠁᕒ죆ᏽ䣇ᙐ⠊ဂ\ua8deዝ裉០\ue80bᏚ裙ቭ棙ᆠ\ue812ᮚ棹ổࣱṘ⠶Ὂ⣰ẅ\ue8f4ᨘ䠧ᣂ裱ᮍ\ue8ebᮀ젳᪲䣱ᮅ꣢᪠蠥ᣊࣱᥥ⣠ᶠ栥᭒\ue8efḽ䣳᩸䠥ᵲ⣩ᩍ棳᭰栫᪺᳝꣰⣤ὰ栮ᡒࣶᢍ䣦ᩐ\ue835᠊䣵\u18ad裬᪨蠧ᯂ\ue8e3ᷭ棳᭐⠦᭚棡\u187d䣤ᶀ栺Ṃ\ue8ff᪵棥Ὠ蠧ᶢ棡Ὕ棱ἠ꠷ᩂ꣦\u192d\ue8e1ᠸ⠴ᤂ\ue8fcἝ棣Ằ젿\u19ca\ue8f9ᵍ裫Ḹ꠱ᡊ⣺᳕棴᪘⠥᭪裠\u19ad棬ᶨ࠴ᯒ죢ὕ죥Ố젺᠒꣫ᷥ森᷈䠲ᮊ裾ᭅ裨᳸栤ᥲ\ue8e7ᾝ죩᳠蠶\u197a䣲\u1add죹Ḱ䠡ᩪ⣡\u1add䣢ᯈ\ue83eᰪ꣢᧥ꣵᴰ\u082fᨚ䣮ἕ䣰ὠ꠲Ṣ죣ᬭ⣿ᦀࠤṒ裺ῥ꣨ᨐ栱ᷚ⣤ᴝ裳ᧀ䠳ᶺ⣫ᦅ꣺᧠栲Ὺ꣡Ჵ\ue8f9ᷨ\ue830Ịࣺᥕ⣮ᾨ젹ᵂࣰ᭥裤Ṹ젫ᶲ\ue8f1ἥ棬ᾈ栴ᰲ࣠᪭죽\u1f58栣ᣢ棭Ჽ棹᪀⠹ᯚ죰ᤅ⣧Ḡ栧ᨲ죣᧥죫Ỡ䠽᧢棶᩵棲Რ⠻\u197a\ue8e5ṥࣴᵘ䠿ᴒ⣧\u1fd5製ᬐ젣ᩒ죴᭝꣺≰\ua8c8⑊⠜╵젍⟘\ua8da⋂栞⊝蠒⍐⣓⇢ꠀ⏍蠇✸꣎∪⠝⍝蠐␘棖ↂ\ue81b♅䠟₨棑⚢栍♭\ue804╰\ue8c2∂䠂▥\ue80d┠꣐≒⠍❕䠍ⓐ棂⌲ࠇ▅\ue80eↈ꣑☪栕⇍젅∈\ua8db⏂젞⁅ࠝ♈⣕⚒蠐␕栞Ⅰ죑Ⓔ정┥䠛⛸\ue8ce\u2452栁₭\ue800ⅰ装Kࠁ↝ꠅ⒀ꣀ⚪栕┝栌⒰⣉⒊ࠚ⛥栋⛰棌₂蠝≍젘⊸ࣁ➚젉↝ࠂ⇈裌◺蠃⇥栏⃠죝⊒䠃⃕절⃠\ue8d8‒䠞⓽栐⎰죎\u2062⠆✝䠒ℐ꣏≒栐₥䠋⇐ࣇ⌂蠘⋅栜⛠⣎⟒蠂⛅\ue812┨\ue8df⍪ࠟ☍젏⎐\ua8c6➢䠆⅕⠏₀⣀☲\ue812⃝栓⎀\ua8db⚊蠒⛵⠊⏈ࣈ⎒젍⟅蠍▰⣌⏺젅⚍ꠍ◐棟\u20f2栓⊝접⛈棐⎊⠄\u209dꠜ⃠䣍➲젟\u2065젏╘棃╲ࠝ⏵젗∰⣀⇂蠃\u243d栁\u2060죂⊊栉❭蠒ₐ裛\u20c2䠒≅䠂⚨棒♲䠔\u242dࠁ⁸\ue8c4│\ue80b⍭⠝⍰\ua8cb⃢栟⏥栜⅘࣊☂䠓\u2e75蠹⹘⣱⯲\ue83d\u2ffd蠭⣨裭⼢䠷ⴭ栿⭘裹ⶪ栶ⷅ\ue834⸸࣡⮂栽⦕⠽⪘裡⾊根ⷝ栣⾐裣ⰒࠩⰍ䠹⻰ꣵⱂ젼ⶅ蠪⮠죢ⵚ核⿕꠨ⵀ⣷⾢젶⭝\ue83b⡈裭⸊젫⣥⠧⾈ࣨ⽺ꠣ⾅⠥⨰\ue8ec⫢䠮⨍⠭Ⲁ⣣⹒ࠨ⼕\ua82eⲨ䣾⮚\ue83d⧝⠲ⵈ\ue8eb⼚\ue832⽕䠩⽨棽⾲\ue830\u2fe5栩⪐ꣴⶂ࠶ⶭ䠭⡠죸⮚蠲ⵍ䠤⡀䣼⺲꠱⢥栽ⴰ꣩ⶺ⠺⡍젨Ⲁ꣺⻢䠵⫵⠻⭰\ue8eb⡂젧⾽蠥⮘\u08e2⢢⠳⥕\ue82f⧈꣫⬚蠧⯍栤ⴠ\ue8e2Ⲃ栧⽭젣⡘裵⪊젶⫍\ue832⿀裣⻊校\u2d6d꠰⫈죫Ⳋ࠽⥵⠩ⷰ꣠⡂蠺ⰵ䠯ⷠ䣩⣊⠠⸝࠺⿰࣬⤲栤\u2e75䠾ⴐ⣴⫪蠠⫕\ue832ⶐ⣲⧒⠬⠽栲Ⰸ棨ⱚ⠤⭕젢⡈࣬ⶊ࠲⡕䠻⫨裸⠚\ua83d⮍ࠤ⼘棳\u2d72\ua83d⨵ꠧ⭀棴⽲栬ⰵ꠴ⱐ⣰⥚䠭⢝⠾⽀棻⨚\ue82b⫍蠵ⶀ棱⡲⠣Ⳮ꠨\u2fd8죲⼊\u082f⡽⠻⧈꣪㐂䡁ュ䡙㉀梃㐲졉そꡗヸꢇ㍒\ue841ぅࡄ㛠ꢟ㉺䡗㔽졟〰\ue899㝊࡛㙅\ue84a㚈梖㗒\ue847㈕\ue852㎠䢕㎚⡛㋭衉㛀\ue887㔚⡑㗕桌㍠梚㋂졒㛍衜㎨\ue885を⡜㙝術〸ࢂㄚ졏㓥⡀㎨⢝㘪⡆㏵ࡌ【\ue899㔒衐㞵桘㑰⢍㈚⡁㒍桀グ\ue896㌂ꡐㆍꡆ㇐좁㋪䡈ぅ⡌㌠\ue890㔲\ue85b㟅\ue847㑨䢝㏢ࡅ㉅\u085c㛠\ue894㌒䡞㋥졔㊈梍ヂ졟㜽⡔㒈⢗㟲衊ねꡐ㏐袍げ⡅㚥ꡕ㚈⢉㊂졅㊅⡋㉀ꢘ㍒桁㒍⡏㖈⢄ㄪࡒ㒥졍㘈좌㎂䡁㝝ꡎ㉠⢌㝂\ue848㑍ࡃ㍰좊㝚ꡒさ䡈㔈梄ㅚ\ue842㚽\ue854㛈梈㉲ࡉ㟵ࡁ㚘\ue89e㓊\ue85fㅭࡕ〸ࢃ㐊衂㏽衞ㇰ좋㘒䡓㗍࡞㐠좌ㄒ䡙㝝桅㞐\u0893㑚ࡊ㗭䡐㘰ꢟ㉢졄㍅ꡟ㙘袖㊪桗㛕⡞㓈\ue891㔺ꡌ㟥䡑㛰袄《䡉きࡘ㒐\ue89cあ衃㎥䡎㙸⢁㒒⡎㚅䡜㟰䢟㘒ꡃ㏝\ue859㏠梋〪\ue857㎅⡙㥸ࢠ㼚ꡬ㯭⡠㢐좨㬂䡸㬍衻㠈⢶㸊桠㺥\ue87b㤈⢷㪺衰㬽䡷㥨\ue8b3㰚⡬㷕⡶㺨䢥㫲\u086e㱵衣㸀梷㫚⡠㬭档㯘梢㢲桿㻍졸㰨梩㽲\ue86b㮽졹㯘䢹㹚\ue873㱵⡻㴠䢢㫂꡵㮽졪㡀⢸㿊졻㲥桼㷠⢲㲺ꡢ㰍䡼㶐⢾㦺ꡧ㹥ꡨ㳨⢺㷺䡼㿽桹㬈좮㦚䡽㨅존㧀⢤㣂졯㮝\ue878㵀ࢹ㢒衳㯽桮㳐ꢲ㽊ࡨ㮝\ue875㱸䢻㤂桻㢝䡺㾰⢴㯺\ue876㫽衢㣠ꢺ㤚⡮㤵ꡮ㯠\ue8b3㡺⡧㫽졵㭸⢴㣊ࡶ㯍衩㧸ࢲ㢲⡶㯥衯㿀ꢺ㳚꡷㢕ࡢ㲠좢㴂\u086e㺝ࡸ㳐梡㰂桶㩕ࡼ㻀ࢠ㷲䡺㷍\ue86e㰸ࢣ㱲桡㺍⡤㢨좣㬊졭㾕⡼㸐袠㨊ꡤ㲽졧㶠좭㾒衢㧕\u086c㭘䢡㶢桿㨝䡫㽐梳\u0019駎竩鶙嫦鯄ᨽ魾뫫飉\udaf6鹼㨱鰎\udaed鴩뫹髌ᨡ駆\ufae2鵙\udae8鸼먷麖"
         .length();
      String var7 = "ߎѲ\ue883ٕ\ue88d\bꡓȢ䢑ս\ue893\u0018桓Ͳ\u088fӥ䢖ɐꡁڊ\u0891ύࢆĘ\ue85dǺ⢊ĥ⢎ňꡔ߂䢁إ梀ܨ衏݊ꢊɭ袘θࡁܪ\u0891̅䢜\b⡐Һ⢈ݕ梙ؘ⡔Ċ袏ʝ⢇Ȱ졌Һ⢂ߵ⢀߰桝ª⢈ʽꢔט桋Ѳ좜\u07b5\ue89a٨衍Ƃ\ue88cԍ좃ʸ\ue849܊䢍Н⢏\u0530\ue846ϲꢟܭꢜ͘ꡑƒ袐ڥ좁\u0600\ue857Ϻ袝ą梖ְ졘Ӳꢎ\u07bdࢄH࡞Ϛ\ue88b֕\u088fװꡇº梞ߕ䢃Ð䡀ъ袍M䢐Ǩࡍ\u05ca\ue884ܝ⢍٘ꡙ݂梓͝梍Ő\ue856\u0092\ue88dԽ좛֨⡈۪䢕օꢋۀ\ue85eȚ䢉ɭ⢕ߐࡒϲ\u088fҥ梋\u0590ꡘǢࢂí࢞@䡄:⢟؝ꢟր⡋ۊ좝ҵ좙è졗ʪ袛\u008d좏۸衊Ţ梎ͭ梑ƨ졀ղ袍ەꢔ؈ꡈв\ue884ܭ梖ň\ue840Œ䢝٥⢂ՠꡅŲ梆սࢀʰ\ue849¢梖؝ꢉÀ\ue844ق\ue88f̵ꢙ\u0018䡈҂ꢒӅꢘԠ䡖ג袖}梍Ѱ졄ޚ⢜˅ࢇߠࡏۂ梔͵⢗ઐꡲྂ\ue8a8\u0a3d梦क़桤෪被ࡥ䢲స⡯ࢪ\ue8b4ഝ梸ਈ졨\u0bba\ue8b0்梭༈졿൚좱ഽ\ue8b1เ䡠ഢ좡७⢡ම衩ప䢿\u0b7d좵௨⡮ഢ⢦\u0b65좯ઐ⡦຺ࢪ७袴ঀ졮\u0be2梲\u0cc5梬ࢸ衩ࢲ좴ਵꢫ\u0a80\u086eบ梬\u098d䢲રࡩऺ梿૭梭ธ䡺ऺࢲ\u0de5\ue8a9\u0b98桥໒ࢲໝ梤൘\ua87eࡪꢩ৵ࢻஈ⡥\u0fe2\ue8aaࢽ좮ཐ桨າ\ue8ad༝梲\u0c70衢ࡢࢽ\u0cfd⢸ന졳༢\ue8bfಽࢲଈ桲\u0bba䢾༅ꢬุ衧ࠚ袥\u0fed袲๘⡩\u0a62袥্梶ര\ua87bࡪ좴ຍꢶ༨졪ऺ좧\u0be5梼༨桶ஂࢵക⢡ୈ䡼๚⢦ࡍ梻\u0e00\ue87eੂ⢱෭\ue8b9ഈ\ue87d੪ꢣ\u0b65䢭ඨ\ue871࠺ꢧໝ䢠ऐ桶ऊꢯഝ좮ఐ衫ฒ좴ઝ\ue8a6ຘ衻ࢂꢽథ梾ਠ䡻ഊࢶऽ\ue8b6ศ桹\u0cda袣\u0e3d좢࿘\ue86bࡲꢫ\u0d0d좺૨\ue866\u0ef2䢮వ좡\u0a60䡽ࡢꢶঝ䢸ภ졪࣒ࢳவ䢼നꡪข䢠ࢽꢴन桭લ⢡ྭꢬะ졺โ䢴\u0dcd䢳\u0b98\ue87dࡂࢤႍ裔ᜈ⠚Ᏺ⣇᜕\ua8c9ᑨ\ue81aᓊ棝\u139dࣆဘ栚ቂ棗እ죓ᆀ蠈ᆺ⣒ᆅ\ue8ddዘꠋដ꣒ᎍ䣃ፘ\ue806ᇊ裒ᎍ죇ᅸ⠌ဪࣙပ⣀ᅘࠟឺ\ue8c9ᙝ죍ៈ⠊ᇊ䣍ᅅ\ua8cdዐ䠃ᑚ裆ၽࣈᚨꠁᖊ棜ᚍ\ue8c1ၠ栄ᄂ࣓\u139d\ue8dcᐈ젝ᘒ\ua8caᐭ⣂ᄈࠗည⣕Ꮵ裕ဠꠟᝪ\ue8d2ᝍ\ua8dfᕨ⠞ဲ检ᐥ裚ဘꠎგ꣖ᑵࣅᙠ⠞ᗲ⣔ᒭ\ue8cbᄨ⠝Ꮢ\ua8c9ᖵ棎ᙈ䠒ᅚ\ue8d7ပ\ue8d8Ᏸ\ue816፲䣝Ꮭ䣗ၠ⠂ᜂ裗ᆅ⣞፸젎ᛪ棂ვ\ue8d0በ젏ែ裉ኍ\ue8d7ሐ젇ᖢࣉቅ꣗ዸ\ue809Ꮢ\ue8c8ᄝ࣏ᒸ䠘ᐲ꣕ᇵࣞᛐ栒ᆂ補ድ裇ᘘ\ue80fኲ裌ᑕ⣊Ⴈ⠆ጢ裋ផ䣖შꠈᒚ棁ᗕ\ua8c6ᕐꠍዲ\ua8c6ჭ⣌ᅸꠕ\u175a\ue8ceᚍ⣇ᘘ䠟ᒚ裁ဍ꣔ᕠ⠏ዒ꣙ႝ\ua8c6ᘠꠔᄊ\ua8cc፭裀ᕰ젅ယ죌\u173d棐ម젋ᚚ棆ᚭࣅᇠ\ue81eႢ䣅\u1755죂ᒰꠁᕒ죆ᏽ䣇ᙐ⠊ဂ\ua8deዝ裉០\ue80bᏚ裙ቭ棙ᆠ\ue812ᮚ棹ổࣱṘ⠶Ὂ⣰ẅ\ue8f4ᨘ䠧ᣂ裱ᮍ\ue8ebᮀ젳᪲䣱ᮅ꣢᪠蠥ᣊࣱᥥ⣠ᶠ栥᭒\ue8efḽ䣳᩸䠥ᵲ⣩ᩍ棳᭰栫᪺᳝꣰⣤ὰ栮ᡒࣶᢍ䣦ᩐ\ue835᠊䣵\u18ad裬᪨蠧ᯂ\ue8e3ᷭ棳᭐⠦᭚棡\u187d䣤ᶀ栺Ṃ\ue8ff᪵棥Ὠ蠧ᶢ棡Ὕ棱ἠ꠷ᩂ꣦\u192d\ue8e1ᠸ⠴ᤂ\ue8fcἝ棣Ằ젿\u19ca\ue8f9ᵍ裫Ḹ꠱ᡊ⣺᳕棴᪘⠥᭪裠\u19ad棬ᶨ࠴ᯒ죢ὕ죥Ố젺᠒꣫ᷥ森᷈䠲ᮊ裾ᭅ裨᳸栤ᥲ\ue8e7ᾝ죩᳠蠶\u197a䣲\u1add죹Ḱ䠡ᩪ⣡\u1add䣢ᯈ\ue83eᰪ꣢᧥ꣵᴰ\u082fᨚ䣮ἕ䣰ὠ꠲Ṣ죣ᬭ⣿ᦀࠤṒ裺ῥ꣨ᨐ栱ᷚ⣤ᴝ裳ᧀ䠳ᶺ⣫ᦅ꣺᧠栲Ὺ꣡Ჵ\ue8f9ᷨ\ue830Ịࣺᥕ⣮ᾨ젹ᵂࣰ᭥裤Ṹ젫ᶲ\ue8f1ἥ棬ᾈ栴ᰲ࣠᪭죽\u1f58栣ᣢ棭Ჽ棹᪀⠹ᯚ죰ᤅ⣧Ḡ栧ᨲ죣᧥죫Ỡ䠽᧢棶᩵棲Რ⠻\u197a\ue8e5ṥࣴᵘ䠿ᴒ⣧\u1fd5製ᬐ젣ᩒ죴᭝꣺≰\ua8c8⑊⠜╵젍⟘\ua8da⋂栞⊝蠒⍐⣓⇢ꠀ⏍蠇✸꣎∪⠝⍝蠐␘棖ↂ\ue81b♅䠟₨棑⚢栍♭\ue804╰\ue8c2∂䠂▥\ue80d┠꣐≒⠍❕䠍ⓐ棂⌲ࠇ▅\ue80eↈ꣑☪栕⇍젅∈\ua8db⏂젞⁅ࠝ♈⣕⚒蠐␕栞Ⅰ죑Ⓔ정┥䠛⛸\ue8ce\u2452栁₭\ue800ⅰ装Kࠁ↝ꠅ⒀ꣀ⚪栕┝栌⒰⣉⒊ࠚ⛥栋⛰棌₂蠝≍젘⊸ࣁ➚젉↝ࠂ⇈裌◺蠃⇥栏⃠죝⊒䠃⃕절⃠\ue8d8‒䠞⓽栐⎰죎\u2062⠆✝䠒ℐ꣏≒栐₥䠋⇐ࣇ⌂蠘⋅栜⛠⣎⟒蠂⛅\ue812┨\ue8df⍪ࠟ☍젏⎐\ua8c6➢䠆⅕⠏₀⣀☲\ue812⃝栓⎀\ua8db⚊蠒⛵⠊⏈ࣈ⎒젍⟅蠍▰⣌⏺젅⚍ꠍ◐棟\u20f2栓⊝접⛈棐⎊⠄\u209dꠜ⃠䣍➲젟\u2065젏╘棃╲ࠝ⏵젗∰⣀⇂蠃\u243d栁\u2060죂⊊栉❭蠒ₐ裛\u20c2䠒≅䠂⚨棒♲䠔\u242dࠁ⁸\ue8c4│\ue80b⍭⠝⍰\ua8cb⃢栟⏥栜⅘࣊☂䠓\u2e75蠹⹘⣱⯲\ue83d\u2ffd蠭⣨裭⼢䠷ⴭ栿⭘裹ⶪ栶ⷅ\ue834⸸࣡⮂栽⦕⠽⪘裡⾊根ⷝ栣⾐裣ⰒࠩⰍ䠹⻰ꣵⱂ젼ⶅ蠪⮠죢ⵚ核⿕꠨ⵀ⣷⾢젶⭝\ue83b⡈裭⸊젫⣥⠧⾈ࣨ⽺ꠣ⾅⠥⨰\ue8ec⫢䠮⨍⠭Ⲁ⣣⹒ࠨ⼕\ua82eⲨ䣾⮚\ue83d⧝⠲ⵈ\ue8eb⼚\ue832⽕䠩⽨棽⾲\ue830\u2fe5栩⪐ꣴⶂ࠶ⶭ䠭⡠죸⮚蠲ⵍ䠤⡀䣼⺲꠱⢥栽ⴰ꣩ⶺ⠺⡍젨Ⲁ꣺⻢䠵⫵⠻⭰\ue8eb⡂젧⾽蠥⮘\u08e2⢢⠳⥕\ue82f⧈꣫⬚蠧⯍栤ⴠ\ue8e2Ⲃ栧⽭젣⡘裵⪊젶⫍\ue832⿀裣⻊校\u2d6d꠰⫈죫Ⳋ࠽⥵⠩ⷰ꣠⡂蠺ⰵ䠯ⷠ䣩⣊⠠⸝࠺⿰࣬⤲栤\u2e75䠾ⴐ⣴⫪蠠⫕\ue832ⶐ⣲⧒⠬⠽栲Ⰸ棨ⱚ⠤⭕젢⡈࣬ⶊ࠲⡕䠻⫨裸⠚\ua83d⮍ࠤ⼘棳\u2d72\ua83d⨵ꠧ⭀棴⽲栬ⰵ꠴ⱐ⣰⥚䠭⢝⠾⽀棻⨚\ue82b⫍蠵ⶀ棱⡲⠣Ⳮ꠨\u2fd8죲⼊\u082f⡽⠻⧈꣪㐂䡁ュ䡙㉀梃㐲졉そꡗヸꢇ㍒\ue841ぅࡄ㛠ꢟ㉺䡗㔽졟〰\ue899㝊࡛㙅\ue84a㚈梖㗒\ue847㈕\ue852㎠䢕㎚⡛㋭衉㛀\ue887㔚⡑㗕桌㍠梚㋂졒㛍衜㎨\ue885を⡜㙝術〸ࢂㄚ졏㓥⡀㎨⢝㘪⡆㏵ࡌ【\ue899㔒衐㞵桘㑰⢍㈚⡁㒍桀グ\ue896㌂ꡐㆍꡆ㇐좁㋪䡈ぅ⡌㌠\ue890㔲\ue85b㟅\ue847㑨䢝㏢ࡅ㉅\u085c㛠\ue894㌒䡞㋥졔㊈梍ヂ졟㜽⡔㒈⢗㟲衊ねꡐ㏐袍げ⡅㚥ꡕ㚈⢉㊂졅㊅⡋㉀ꢘ㍒桁㒍⡏㖈⢄ㄪࡒ㒥졍㘈좌㎂䡁㝝ꡎ㉠⢌㝂\ue848㑍ࡃ㍰좊㝚ꡒさ䡈㔈梄ㅚ\ue842㚽\ue854㛈梈㉲ࡉ㟵ࡁ㚘\ue89e㓊\ue85fㅭࡕ〸ࢃ㐊衂㏽衞ㇰ좋㘒䡓㗍࡞㐠좌ㄒ䡙㝝桅㞐\u0893㑚ࡊ㗭䡐㘰ꢟ㉢졄㍅ꡟ㙘袖㊪桗㛕⡞㓈\ue891㔺ꡌ㟥䡑㛰袄《䡉きࡘ㒐\ue89cあ衃㎥䡎㙸⢁㒒⡎㚅䡜㟰䢟㘒ꡃ㏝\ue859㏠梋〪\ue857㎅⡙㥸ࢠ㼚ꡬ㯭⡠㢐좨㬂䡸㬍衻㠈⢶㸊桠㺥\ue87b㤈⢷㪺衰㬽䡷㥨\ue8b3㰚⡬㷕⡶㺨䢥㫲\u086e㱵衣㸀梷㫚⡠㬭档㯘梢㢲桿㻍졸㰨梩㽲\ue86b㮽졹㯘䢹㹚\ue873㱵⡻㴠䢢㫂꡵㮽졪㡀⢸㿊졻㲥桼㷠⢲㲺ꡢ㰍䡼㶐⢾㦺ꡧ㹥ꡨ㳨⢺㷺䡼㿽桹㬈좮㦚䡽㨅존㧀⢤㣂졯㮝\ue878㵀ࢹ㢒衳㯽桮㳐ꢲ㽊ࡨ㮝\ue875㱸䢻㤂桻㢝䡺㾰⢴㯺\ue876㫽衢㣠ꢺ㤚⡮㤵ꡮ㯠\ue8b3㡺⡧㫽졵㭸⢴㣊ࡶ㯍衩㧸ࢲ㢲⡶㯥衯㿀ꢺ㳚꡷㢕ࡢ㲠좢㴂\u086e㺝ࡸ㳐梡㰂桶㩕ࡼ㻀ࢠ㷲䡺㷍\ue86e㰸ࢣ㱲桡㺍⡤㢨좣㬊졭㾕⡼㸐袠㨊ꡤ㲽졧㶠좭㾒衢㧕\u086c㭘䢡㶢桿㨝䡫㽐梳\u0019駎竩鶙嫦鯄ᨽ魾뫫飉\udaf6鹼㨱鰎\udaed鴩뫹髌ᨡ駆\ufae2鵙\udae8鸼먷麖";
      int var11 = 0;
      String[] var9 = new String[2];

      do {
         char var13 = var7.charAt(var11);
         int var15 = 0;
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 6) {
               default -> 128;
               case 1 -> 152;
               case 2 -> 47;
               case 3 -> 136;
               case 4 -> 98;
               case 5 -> 88;
            }) ^ var16;
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 3 | var16 << 13) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 3 | var16 >>> 13) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      IlIIII = var9;
      IlIIIl = new Object[var9.length];
      int var21 = 0;
      int var10001 = 0;
      byte[] var10002 = "?f6íÁpé¿pGrc\u009fô\u0089×ääÛ\u001a\u0007å\u001bë$\u0019Ó\u0088G÷Ö¾OOt\"\u0007\u00ad\u0097\fn\tyõ2ï\u000fF®õ\u000e÷\u0015YÒZQp2\u0094¼\rÕÛ\u0003P\u008cjP]\"\u0018a\u000bHÃw©°\u009eé¬ÝÝ\u001f?¤T©\u0080\t[\u0003~Dàò\n\u0082Õ¸2ÆJ\u0088Zm\u0094\u0091B\u00014r\u0012\u0004\t\u00adÅØA×by\u0089@X\u0003Ì¦\\\u0080-¿),¢ú:\u0089\u0093\nÞv\u0002ê\u001cLG¾\u007f\u009a,ÞØ2\u009d\u0095?\u009eÁ'\u0000êÊ/jyº\u008e\u0015½z¦Q±mþ_ò\u0083¸Ç2J_Íý\u000e\u007fg0CÏ\u0087Ù\u009f\u001cÍØYDÆ\u000b\u009cMÙ5·nøXî\u001b(\u00949\u008aà½å2\f\u0098§\u0087*ê\u0019\u008dÝª\u0002U\u0083/KÞÅlþý\u0018\u0013×¿\u0080\u0096J\u008f$\u0007®\u0000;\u008c.ïK\u0016Ö\u00884ÝX°\u000b¹4kåjÍxÌÁí\u009b\u0089\u0018¢ªÕ}\u0000Tßý\n\u001e@ÞC©NWcpÄÒ9\u0084\u0094õÇ\u0010o\u0016nÀ?\u008d\u0082sÜTyðß«-9+J\u008f]HØ/n\u0010h\u0015ÕUæÚwñLÅ»ºæÜ}Èà\u0019\u0013û<§\u0083¾\b\u0086£í(\u0001µxÎ¥/}å§ýyÎ¨¶\u0004H58O\u0094\u008a\u0016î/Îûº\u008c«bÄSÝ,t0\nûuö\u008aQD×WËÇr\u0081\u0006 \u000b\u0091\u0089 ÑzÚ´Q\u001eÒ\u001c6\u0095È+WÊ\"N\u0014È\u0013S¨Í\u0014h\u008b[Ï\u009c%E|î¹ÛÃr=\u009d\u009b@)\nÔ2T/pq1\u0002ÔÀ\u009câ\u008d®.YNnÚg\u0004§F\r~Ú\u0002Ã\u0087&÷èÞß\u0010`\u0085£AÐ\u0019ÈÜ¸\bß\u0098:bµ\u008a\u0006Ä\u000b´pßÉk[íÖ\u008az\u0099i\u008aÜO\u0098Âª¸\u008b?Â\u0014ìQ\u0004ïÁ\n9$ð[\u008b.üÚóº!Ñ÷\u0012bÆ+J×H)\u0006ágó §`c\u0097O\u008aî\u0088ùäs´ðT»\u0015ù¬V¢ÀÔ»v¤¥/\u0082±\u00ad\u008bÂâ\"¼â\u009d{j.\u0095\u0086è\fÿg²\u009c\u0019\u0017\u0016\u0018j®ééÐ\u0010 \u0002÷\u008cí\u0000Ñ\u00adbh8húê½\f\u0088YCG\u0001\u00852V\u0095\u009a\u0099XõðÐ\u001c<MâcW0\u009a&þq!éYu\u0018Y¼n¶¹.àèD\nÜå\u007fóXí5í9\u0084\u0080ELò°aóï\u0098\u0085,&zf^\u008b\u0016Ûvõi\u000f.èðå¶ó\u008el\u0011\u001b\u0080±\u0014ñV·´³É×y\u0003[ÈpmòQ´\u001bs=.\u0080-\u0088\u008a\u00043\u0090Äýgkð\u0005ÿ\u0015\u009a\u0007\u0010N¦0îª¿\u0092\u0094Öñ!µ\u0094XJ.¨SÐ<FA»\u0005\u0092DGÎÅi\feâÛ±û'K©\u008aZwIûê«dõ\u0007{Û\bVA\n\u0003_¦a?/Ï:\u0093\u0083V\u0013JJñw\u008e «Âù\u00adssÓ>\u0088w¶6\u009b»dC\u0015Î>\u0017Ô?\u008f#Í\u0097a´\u001c\u00adÁ\u0012Ï\u009e\u0092ÿ\u0096ßktíÛÂÖò\u009e¶Q\u008eî\"s6TDsÏl\u0093ú ÷}\u001a\u008d\u008e}J¢îÞ<\u008er\u001f¤2L`¨dúÌª\u0015\u008bo;£ÿÁ\u001b\u0094¿=ô\u00ad\u001c}'ò:à¿\u008e;è´\u0004¿/y{X\u0000Y\u0014é¦ÍQ~â§\u0007\u0015\u0013\u00ad~¹5m\u0090y\u0083Ér\u001d\u00ad ¦\u0090\u0011¢oÂ\u008aß\u009fZ=\u0004Þ\\\"6´Â\u008aaÌ£6«\u0016ª0Ù\u0001C§Z@\\&à\rÏ\u000e½lÃPÞ\u0088@L4×\u0001\u0011©b\u001f¸ºú-\u0080§£)\u0080,Ò\u0083\u0016*\u0018Ð\u0096ÛûÌ\b\u009b\\>]OX\u001fã\u0006\u001c\u0017àSÞÂ;\u0017/\f'ªÞñ\u0088\u008f$fÄ\u008fä\u0089Ô\u0093îQ<hêþgWQ-¬\u009cÓ\u009dÚ¤wbDf?R\u0093p\u007fb£¨Þs\u009d\t\u0090é¦[~\u0013øÝû\u009dÿÒ!¼é:\u009ea1d¬ïqÞïmj^\u008cÙÍ£\u0015\u000bÎ\u00818 \u0012r2ë\u0016\u0087\u0087e¦ü\u008eW\u0017âr8\u0093zõNo\u001fO\f«\b-¨E\u009e¬¼\u001e²ò\u0092G\u008f¾ÞGu1¼«þÙñ\u0013+X¬l9y¦\u0086/\u0082°\u00104\u0015*K\u0004\u0098Õ>¼·ðxÝ\u0092qâ§\"º5T\u0019óÌÏ\u0002g±\u0082M1û\u0090Q\u001aø¸ø#8(Ñ¹qW\u0089Ñs\u0082éÎ\u009btÕá¥(\u00ad\u0098\u0088OMù\u001fÁ\u0084R?}-h¢\u009a]¡»9.\u0081 ã\u001e\u00870|Hz\u0015\u009bÛ\u0007qN$µc\u001c¸°öÚgoÙ2w×´Ròâ!]t\u0017\u007fÞRúgïRi¾k\u0095Å\u001a´ñ²jA÷\u0019\u0083H\u0001^´Ôò\"\u009f#@[\u0003ûäc\u001f¤®7\u0080¯sÀ1\u0001ê5S;\u0003\u0016ûYqq¦®¢!\u001f~\u009bÚ.0ÁNtÀ·D\u0097)Äyîtì\u0005ÑJ\u001bEYR'ãïÒÕ ^\u0097h\u0087J.ze\u0016kë\u009bÑª`îïÜ\bÆ4\u000fw2+T\u0016H\u000eûî\u0094\u001dáÚ\u009aä\u0013¢J\"ÀÁ\u00070¢\u008cþ\u0019V~~«Æ¥\u009eOÎÚ\u008a\u00adu\\Ì\u0001´\u0012\\\bÒÞiËjVÅÛ6öCc}\u0012^\"|±´{\u008f\f\u0095×½\u009edÙÍ21\u0096Ì\u008f\u0000X+b\u007f\f<I¬\u001bÏ¾ÔË\u008d2\tbè°\u008a®'3\u0015W\u0013õ\\ô\u001eØí\u0005Øª]h·ôN(ùÖ1ã»\u0006\u00844F{·ì\u00139Ë\u0084ÙjÀÂÌ~;Ø\u0086XÅQ\u000f\u0016y¹ñG\u0014&m`\u0090_ÇG-\u001e\u0013=ùir\u0088\u008c{\u008aÇGÊâ=¿¢Çï=¹mÐÃÛü\u000eÉ»Åÿv3TìCÏ\u0099¶ÇK\u001cÔ*7]®µ\u001elÏ3>Ù¢ÛV\u0080\u001auD\u0094\u0084¡¯`[®Þ\u0015ê\u008e¿\u001b³\b\u008d¬VÞ\u0080)\u0094AÚ@~ 0Ä<\u0083¦ßâ\u001a»\u0080(¶L\"[^qö\u0017ögm«m½¼Ì®v-SÿIÅÛ\u008cÏ\u0018\u0096I¼\u008c\u009a\u0080ÚÐÏÜ\u0099þ\t@\u008aÍ\u0000®\u0003¥>.\u0019È(¼Ì¥¯g?GÔ\"ãµü\u0015³@~É#ìñ¦×zæÎ¦¡P[,ÔÉ\u00ad\u0081\u0080ú\t°Û]\u0019Çê~Ã\u0000\"«\u0081£<k\tlM\f\n»5\u00ad\u009dY\u0017½W\u0005*ÆS<Ôö§ëìòçùÈæø$½X4\u0012ê«\u0019ó{ýê¾¢¼´\u0014§:×?0\u0018\rºkW¶áÐkÎ\u0006\u0082\u001e\"»\t8L\u000fjµ\u0004Üe<ó7cÔ!\u008aöãbSì\u0091\u0015\u0090v»¸?\u001a¦\u008dN÷ûn¬¥!\u0095\u0004N(¸PÃ\\\u0017eÌ\u008dý#Â\u0016Øë\u0083\u0083{Ñò^e\u0097\u001eCá\u001cMÈKÆÚ+·^\u00005\u0003ÚC\t\u0011\\\u0005{C:Ê¡ø\u0083³\u00187ÎÜW@ÓXÇªÉÌ¶\u0003\u008b(£§?.\u000b¬\u0010`¨\u00adEÐra \u0002Ò°\rïx\u0088(Ôü½ó\u0089°Þ³§©[¿\u000fa\u0087ÎNZt¸\u0099Ê\u008enWæ¬\u0085<Ö\u0087\u0089äxl~Rò#HsÔÄ\u0019\u0014\u0097NPÕ©\u001f8+\u0019Rìû°\u0086 /Ðê\u0013>úó®æß¦;o¾§>Û2õv\u0019\\\t\u0000\u0010îXÆ\u00980\u0082Ð\u0084\u0095\u009d\u008b\u0004=\t%8ûÕ±e\u0098åTÔc\u000eÓ\u0003'x\u000e?91×þkøo¥µ;\u0018È\f\u0005\u0010q\rÛ\u0083\u000f\nnj\u001e\t\u0000\u0002Â¬ï\u0000è3©Üa\u00ad\n\u0007\u008c\u0012Å]×Ýº^\u009e`\u009cUL:óN\f?ßâry*kC<_ôJ\u0099@ÖÅKÑPºIQhàèÝ©£ Íbæ\u001c}ûG\f[Ãò\u0017\u0018o'\u00841õ¥\u008e{4.\u0092\u0003R¯\u0099F%â\u0005\u0015öe\u0018è÷óï~&`8Î\u008b\u0015\u0003G\u0005H¿0gÓVKï7\u0011\u0004/\u0095h¹9\u007fôrÇÙV<«\\\u0080y,\u0017÷fÈ¿5`AéÛ3\u001bð \u001d««\u0005¢\u008bo©ÊòiÂ\u009a#\u00ad¤×<\u0085ê\u001av,c~->Ìãt¸¾\u0094ÑQ"
         .getBytes("ISO-8859-1");
      IIllll = new int[585];

      int var55;
      do {
         IIllll[var21] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ -1016784481;
         var21 += 1;
         var55 = var10001 + 4;
         var10001 += 4;
      } while (var55 < var10002.length);

      String[] var5 = new String[lIIIIl(288491358, var17 ^ 1487607062)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = lIIIlI((short)9203, -1638166309, (byte)124, -338748287)).length();
      int var1 = lIIIIl(288491359, var17 ^ 392209838);
      int var19 = -1;

      label100:
      while (true) {
         var21 = lIIIIl(288491356, var17 ^ -308753325);
         String var27 = var2.substring(++var19, var19 + var1);
         byte var39 = -1;

         while (true) {
            label95: {
               char[] var57 = var27.toCharArray();
               int var69 = var57.length;
               int var6 = 0;
               var55 = var21;
               var44 = var57;
               var10001 = var69;
               char[] var81;
               int var88;
               if (var69 <= 1) {
                  var81 = var57;
                  var69 = var21;
                  var88 = var6;
               } else {
                  var55 = var21;
                  var10001 = var69;
                  if (var69 <= var6) {
                     break label95;
                  }

                  var81 = var57;
                  var69 = var21;
                  var88 = var6;
               }

               while (true) {
                  var81[var88] = (char)(var81[var88] ^ var69 ^ switch (var6 % lIIIIl(288491344, var17 ^ 793861148)) {
                     case 0 -> lIIIIl(288491345, var17 ^ 1013227828);
                     case 1 -> lIIIIl(288491350, var17 ^ 1725965403);
                     case 2 -> lIIIIl(288491351, var17 ^ 67983785);
                     case 3 -> lIIIIl(288491348, var17 ^ 2123526432);
                     case 4 -> lIIIIl(288491349, var17 ^ 521424967);
                     case 5 -> lIIIIl(288491370, var17 ^ 1929132453);
                     default -> lIIIIl(288491371, var17 ^ -900584532);
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
                  if ((var19 += var1) >= var4) {
                     IIIIll = var5;
                     IlII = new String[lIIIIl(288491347, var17 ^ -554773164)];
                     var21 = lIIIIl(288491368, var17 ^ 1418129231);
                     IIIIIl = new GsonBuilder().setPrettyPrinting().create();
                     Illll = IlIIllIII.Ill(IIIIlI(var21, lIIIIl(288491369, var17 ^ -1953917902)));
                     llII = IlIIllIII.Ill(IIIIlI(lIIIIl(288491374, var17 ^ 984219457), lIIIIl(288491375, var17 ^ 1664033811)));
                     IIII = IlIIllIII.Ill(IIIIlI(lIIIIl(288491372, var17 ^ -2030452600), lIIIIl(288491373, var17 ^ 1147598493)));
                     IlIII = IlIIllIII.Ill(IIIIlI(lIIIIl(288491362, var17 ^ -1375244065), lIIIIl(288491363, var17 ^ -324771176)));
                     IIIlII = IlIIllIII.Ill(IIIIlI(lIIIIl(288491360, var17 ^ 842922860), lIIIIl(288491361, var17 ^ -124700353)));
                     lIlII = IlIIllIII.Ill(IIIIlI(lIIIIl(288491366, var17 ^ -1954991689), lIIIIl(288491367, var17 ^ -942554704))).I();
                     lIll = IlIIllIII.Ill(IIIIlI(lIIIIl(288491364, var17 ^ 2068512058), lIIIIl(288491365, var17 ^ 478780372))).I();
                     llI = IlIIllIII.Ill(IIIIlI(lIIIIl(288491386, var17 ^ -2082993779), lIIIIl(288491387, var17 ^ 195803536))).I();
                     IlIIl = IlIIllIII.Ill(IIIIlI(lIIIIl(288491384, var17 ^ 1181678789), lIIIIl(288491385, var17 ^ 1252479967))).I();
                     IIIlll = IlIIllIII.Ill(IIIIlI(lIIIIl(288491390, var17 ^ 536598914), 3)).I();
                     lIlI = IlIIllIII.Ill(IIIIlI(lIIIIl(288491391, var17 ^ -647509400), lIIIIl(288491388, var17 ^ -796309808))).I();
                     llIIl = IlIIllIII.Ill(IIIIlI(lIIIIl(288491389, var17 ^ -301377027), lIIIIl(288491378, var17 ^ -124025034))).I();
                     l = IlIIllIII.Ill(IIIIlI(lIIIIl(288491379, var17 ^ 2134933252), lIIIIl(288491376, var17 ^ 67493878))).I();
                     IIIllI = IlIIllIII.Ill(IIIIlI(lIIIIl(288491377, var17 ^ 741536518), lIIIIl(288491382, var17 ^ -1360129872))).I();
                     lIII = IlIIllIII.Ill(IIIIlI(lIIIIl(288491383, var17 ^ 562141005), lIIIIl(288491380, var17 ^ 921293288)));
                     lll = IlIIllIII.Ill(IIIIlI(lIIIIl(288491381, var17 ^ -2139329394), lIIIIl(288491274, var17 ^ 428525290))).I();
                     llllI = IlIIllIII.Ill(IIIIlI(lIIIIl(288491275, var17 ^ 707719405), lIIIIl(288491272, var17 ^ -1925270458))).I();
                     IIIII = IlIIllIII.Ill(IIIIlI(lIIIIl(288491273, var17 ^ -1360773009), lIIIIl(288491278, var17 ^ 2074515110))).I();
                     lI = IlIIllIII.Ill(IIIIlI(lIIIIl(288491279, var17 ^ -1154601887), lIIIIl(288491276, var17 ^ -600974220))).I();
                     IIIIl = IlIIllIII.Ill(IIIIlI(lIIIIl(288491277, var17 ^ 2109348225), lIIIIl(288491266, var17 ^ 1836072469))).I();
                     IIIlI = IlIIllIII.Ill(IIIIlI(lIIIIl(288491267, var17 ^ 376732844), lIIIIl(288491264, var17 ^ 645964415))).I();
                     IIlIIl = IlIIllIII.Ill(IIIIlI(lIIIIl(288491265, var17 ^ 583055857), lIIIIl(288491270, var17 ^ 920645349))).I();
                     lIIll = IlIIllIII.Ill(IIIIlI(lIIIIl(288491271, var17 ^ -2011999593), lIIIIl(288491268, var17 ^ 2067706561))).I();
                     llll = IlIIllIII.Ill(IIIIlI(lIIIIl(288491269, var17 ^ 768474679), lIIIIl(288491290, var17 ^ 1821575322))).I();
                     IIlII = IlIIllIII.Ill(IIIIlI(lIIIIl(288491291, var17 ^ -353337593), lIIIIl(288491288, var17 ^ -936722615))).I();
                     IIllI = IlIIllIII.Ill(IIIIlI(lIIIIl(288491289, var17 ^ -2020499019), lIIIIl(288491294, var17 ^ -1142314027))).I();
                     II = IlIIllIII.Ill(IIIIlI(lIIIIl(288491295, var17 ^ -838468726), lIIIIl(288491292, var17 ^ -395594773))).I();
                     lllI = IlIIllIII.Ill(IIIIlI(lIIIIl(288491293, var17 ^ 1696832665), lIIIIl(288491282, var17 ^ -321639802))).I();
                     llIll = IlIIllIII.Ill(IIIIlI(lIIIIl(288491283, var17 ^ 67554019), lIIIIl(288491280, var17 ^ 860176807))).I();
                     IIl = IlIIllIII.Ill(IIIIlI(lIIIIl(288491281, var17 ^ 1093849191), lIIIIl(288491286, var17 ^ 1805596217))).I();
                     IIlllI = IlIIllIII.Ill(IIIIlI(lIIIIl(288491287, var17 ^ 1990856398), lIIIIl(288491284, var17 ^ 726292589)));
                     lIl = IlIIllIII.Ill(IIIIlI(lIIIIl(288491285, var17 ^ -239975285), lIIIIl(288491306, var17 ^ -123762260))).I();
                     IlIl = IlIIllIII.Ill(IIIIlI(lIIIIl(288491307, var17 ^ -1943001654), lIIIIl(288491304, var17 ^ 1574606638))).I();
                     IIIIII = IlIIllIII.Ill(IIIIlI(lIIIIl(288491305, var17 ^ -956322944), lIIIIl(288491310, var17 ^ 1398574941))).I();
                     III = IlIIllIII.Ill(IIIIlI(lIIIIl(288491311, var17 ^ -1908222130), lIIIIl(288491308, var17 ^ -1815687310))).I();
                     lII = IlIIllIII.Ill(IIIIlI(lIIIIl(288491309, var17 ^ 409765414), lIIIIl(288491298, var17 ^ -74448448)));
                     IlllI = IlIIllIII.Ill(IIIIlI(lIIIIl(288491299, var17 ^ -450585927), lIIIIl(288491296, var17 ^ -650763444)));
                     lIlIl = IlIIllIII.Ill(IIIIlI(lIIIIl(288491297, var17 ^ -1419478403), lIIIIl(288491302, var17 ^ 1910501913)));
                     IlIlI = IlIIllIII.Ill(IIIIlI(lIIIIl(288491303, var17 ^ -938438969), lIIIIl(288491300, var17 ^ -2023285859)));
                     Ill = IlIIllIII.Ill(IIIIlI(lIIIIl(288491301, var17 ^ 395151843), lIIIIl(288491322, var17 ^ 1713650295)));
                     llIl = IlIIllIII.Ill(IIIIlI(lIIIIl(288491323, var17 ^ 1937801095), lIIIIl(288491320, var17 ^ -611601197)));
                     IllI = IlIIllIII.Ill(IIIIlI(lIIIIl(288491321, var17 ^ 2022311406), lIIIIl(288491326, var17 ^ -1572445829)));
                     llIII = IlIIllIII.Ill(IIIIlI(lIIIIl(288491327, var17 ^ 43470095), lIIIIl(288491324, var17 ^ -1464901384)));
                     IIllIl = IlIIllIII.Ill(IIIIlI(lIIIIl(288491325, var17 ^ 748335918), lIIIIl(288491314, var17 ^ 1626974867)));
                     lIllI = IlIIllIII.Ill(IIIIlI(lIIIIl(288491315, var17 ^ 2038234887), lIIIIl(288491312, var17 ^ -1314708416)));
                     IllII = IlIIllIII.Ill(IIIIlI(lIIIIl(288491313, var17 ^ -1974208371), lIIIIl(288491318, var17 ^ 447298290)));
                     lIIlI = IlIIllIII.Ill(IIIIlI(lIIIIl(288491319, var17 ^ 915129799), lIIIIl(288491316, var17 ^ 111200984)));
                     IIIlIl = IlIIllIII.Ill(IIIIlI(lIIIIl(288491317, var17 ^ -1471463914), lIIIIl(288490698, var17 ^ 570752531)));
                     lllll = IlIIllIII.Ill(IIIIlI(lIIIIl(288490699, var17 ^ 82008725), lIIIIl(288490696, var17 ^ 1198106731)));
                     IIlIll = IlIIllIII.Ill(IIIIlI(lIIIIl(288490697, var17 ^ 2033744785), lIIIIl(288490702, var17 ^ -915030877)));
                     lIIl = IlIIllIII.Ill(IIIIlI(lIIIIl(288490703, var17 ^ 1621222260), lIIIIl(288490700, var17 ^ 13473021)));
                     Illl = IlIIllIII.Ill(IIIIlI(lIIIIl(288490701, var17 ^ 718597555), lIIIIl(288490690, var17 ^ 260146580)));
                     IllIl = IlIIllIII.Ill(IIIIlI(lIIIIl(288490691, var17 ^ 1853914609), lIIIIl(288490688, var17 ^ -489512728)));
                     IIlIII = IlIIllIII.Ill(IIIIlI(lIIIIl(288490689, var17 ^ -1943125102), lIIIIl(288490694, var17 ^ 1048503861)));
                     lllIl = IlIIllIII.Ill(IIIIlI(lIIIIl(288490695, var17 ^ -526019618), lIIIIl(288490692, var17 ^ 1169838036)));
                     lIlll = IlIIllIII.Ill(IIIIlI(lIIIIl(288490693, var17 ^ -315726236), lIIIIl(288490714, var17 ^ 737230872)));
                     IIlll = IlIIllIII.Ill(IIIIlI(lIIIIl(288490715, var17 ^ 1220679481), lIIIIl(288490712, var17 ^ -1289138143)));
                     I = IlIIllIII.Ill(IIIIlI(lIIIIl(288490713, var17 ^ -144749263), lIIIIl(288490718, var17 ^ -384406548)));
                     Il = IlIIllIII.Ill(IIIIlI(lIIIIl(288490719, var17 ^ -1143002039), lIIIIl(288490716, var17 ^ 1696388537)));
                     IlIll = IlIIllIII.Ill(IIIIlI(lIIIIl(288490717, var17 ^ -601730157), lIIIIl(288490706, var17 ^ -570675881)));
                     ll = new Gson();
                     return;
                  }

                  var1 = var2.charAt(var19);
                  break;
               default:
                  var5[var3++] = var62;
                  if ((var19 += var1) < var4) {
                     var1 = var2.charAt(var19);
                     continue label100;
                  }

                  var4 = (var2 = lIIIlI((short)11412, -1638166310, (byte)-117, 976519112)).length();
                  var1 = lIIIIl(288491357, var17 ^ 1058723419);
                  var19 = -1;
            }

            var21 = lIIIIl(288491346, var17 ^ 14988466);
            var27 = var2.substring(++var19, var19 + var1);
            var39 = 0;
         }
      }
   }

   private static Throwable l(Throwable var0) {
      return var0;
   }

   private static Path IIIlll(IIIlIlIl param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic k74/x/IlllIlI.IIlll Lk74/x/IIIlIlIl;
      // 03: invokevirtual k74/x/IIIlIlIl.llIl ()Ljava/lang/String;
      // 06: invokestatic java/lang/System.getenv (Ljava/lang/String;)Ljava/lang/String;
      // 09: astore 1
      // 0a: aload 1
      // 0b: ifnull 1c
      // 0e: aload 1
      // 0f: invokevirtual java/lang/String.isBlank ()Z
      // 12: ifeq 3e
      // 15: goto 1c
      // 18: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b: athrow
      // 1c: getstatic k74/x/IlllIlI.I Lk74/x/IIIlIlIl;
      // 1f: invokevirtual k74/x/IIIlIlIl.llIl ()Ljava/lang/String;
      // 22: invokestatic java/lang/System.getProperty (Ljava/lang/String;)Ljava/lang/String;
      // 25: astore 1
      // 26: aload 1
      // 27: ifnull 38
      // 2a: aload 1
      // 2b: invokevirtual java/lang/String.isBlank ()Z
      // 2e: ifeq 3e
      // 31: goto 38
      // 34: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37: athrow
      // 38: aconst_null
      // 39: areturn
      // 3a: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3d: athrow
      // 3e: aload 1
      // 3f: bipush 1
      // 40: anewarray 255
      // 43: dup
      // 44: bipush 0
      // 45: aload 0
      // 46: invokevirtual k74/x/IIIlIlIl.llIl ()Ljava/lang/String;
      // 49: aastore
      // 4a: invokestatic java/nio/file/Path.of (Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
      // 4d: areturn
   }

   public void IIlIII(lllIIlIl var1, IlIIIIIIl var2) {
      IlllIlI var10000;
      lllIIlIl var10001;
      label40: {
         try {
            var10000 = this;
            if (var1 == null) {
               var10001 = lllIIlIl.IlI;
               break label40;
            }
         } catch (MatchException var5) {
            throw l(var5);
         }

         var10001 = var1;
      }

      label33: {
         try {
            var10000.IIll = var10001;
            var10000 = this;
            if (var2 != null) {
               var8 = true;
               break label33;
            }
         } catch (MatchException var4) {
            throw l(var4);
         }

         var8 = false;
      }

      label26: {
         try {
            var10000.IIIll = var8;
            var10000 = this;
            if (var2 == null) {
               var9 = 0L;
               break label26;
            }
         } catch (MatchException var3) {
            throw l(var3);
         }

         var9 = var2.IIllllI();
      }

      var10000.lIIIl = var9;
   }

   private void IIlIIl(JsonObject param1, lIIIlIlI param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: ldc_w -1157261879
      // 003: istore 8
      // 005: invokestatic k74/x/IIllllIl.IIIIl ()[Ljava/lang/String;
      // 008: astore 3
      // 009: aload 1
      // 00a: ldc_w 288491428
      // 00d: iload 8
      // 00f: ldc_w 1470637590
      // 012: ixor
      // 013: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 016: ldc_w 288491429
      // 019: iload 8
      // 01b: ldc_w 441546650
      // 01e: ixor
      // 01f: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 022: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 025: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 028: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 02b: ifne 05a
      // 02e: aload 1
      // 02f: ldc_w 288491450
      // 032: iload 8
      // 034: ldc_w -388907608
      // 037: ixor
      // 038: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 03b: ldc_w 288491451
      // 03e: iload 8
      // 040: ldc_w 858856000
      // 043: ixor
      // 044: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 047: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 04a: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 04d: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 050: ifeq 2a3
      // 053: goto 05a
      // 056: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 059: athrow
      // 05a: aload 1
      // 05b: ldc_w 288491448
      // 05e: iload 8
      // 060: ldc_w 1277541341
      // 063: ixor
      // 064: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 067: ldc_w 288491449
      // 06a: iload 8
      // 06c: ldc_w -899453084
      // 06f: ixor
      // 070: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 073: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 076: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 079: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 07c: ifeq 0af
      // 07f: goto 086
      // 082: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 085: athrow
      // 086: aload 1
      // 087: ldc_w 288491454
      // 08a: iload 8
      // 08c: ldc_w -2064441732
      // 08f: ixor
      // 090: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 093: ldc_w 288491455
      // 096: iload 8
      // 098: ldc_w 1220978108
      // 09b: ixor
      // 09c: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 09f: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 0a2: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0a5: invokevirtual com/google/gson/JsonObject.getAsJsonObject (Ljava/lang/String;)Lcom/google/gson/JsonObject;
      // 0a8: goto 0d1
      // 0ab: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ae: athrow
      // 0af: aload 1
      // 0b0: ldc_w 288491452
      // 0b3: iload 8
      // 0b5: ldc_w -1066742407
      // 0b8: ixor
      // 0b9: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 0bc: ldc_w 288491453
      // 0bf: iload 8
      // 0c1: ldc_w 1626143429
      // 0c4: ixor
      // 0c5: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 0c8: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 0cb: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0ce: invokevirtual com/google/gson/JsonObject.getAsJsonObject (Ljava/lang/String;)Lcom/google/gson/JsonObject;
      // 0d1: astore 4
      // 0d3: aload 4
      // 0d5: ldc_w 288491442
      // 0d8: iload 8
      // 0da: ldc_w -2064567277
      // 0dd: ixor
      // 0de: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 0e1: ldc_w 288491443
      // 0e4: iload 8
      // 0e6: ldc_w 656114203
      // 0e9: ixor
      // 0ea: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 0ed: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 0f0: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0f3: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 0f6: ifeq 12e
      // 0f9: aload 0
      // 0fa: aload 0
      // 0fb: aload 4
      // 0fd: ldc_w 288491440
      // 100: iload 8
      // 102: ldc_w -1707425328
      // 105: ixor
      // 106: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 109: ldc_w 288491441
      // 10c: iload 8
      // 10e: ldc_w 147529819
      // 111: ixor
      // 112: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 115: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 118: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 11b: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 11e: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 121: invokevirtual k74/x/IlllIlI.lllIl (Ljava/lang/String;)Lk74/x/lllIIlIl;
      // 124: putfield k74/x/IlllIlI.IIll Lk74/x/lllIIlIl;
      // 127: goto 12e
      // 12a: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12d: athrow
      // 12e: aload 4
      // 130: ldc_w 288491446
      // 133: iload 8
      // 135: ldc_w -1533116314
      // 138: ixor
      // 139: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 13c: ldc_w 288491447
      // 13f: iload 8
      // 141: ldc_w 430845909
      // 144: ixor
      // 145: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 148: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 14b: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 14e: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 151: ifeq 190
      // 154: aload 0
      // 155: aload 4
      // 157: ldc_w 288491444
      // 15a: iload 8
      // 15c: ldc_w -187688300
      // 15f: ixor
      // 160: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 163: ldc_w 288491445
      // 166: iload 8
      // 168: ldc_w -553489357
      // 16b: ixor
      // 16c: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 16f: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 172: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 175: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 178: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 17b: invokestatic k74/x/IlllIlI.lIlI (Ljava/lang/String;)J
      // 17e: invokestatic k74/x/IlllIlI.IIlll (J)J
      // 181: putfield k74/x/IlllIlI.lIIIl J
      // 184: aload 0
      // 185: bipush 1
      // 186: putfield k74/x/IlllIlI.IIIll Z
      // 189: goto 190
      // 18c: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18f: athrow
      // 190: aload 4
      // 192: ldc_w 288491338
      // 195: iload 8
      // 197: ldc_w 679206399
      // 19a: ixor
      // 19b: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 19e: ldc_w 288491339
      // 1a1: iload 8
      // 1a3: ldc_w -1532582727
      // 1a6: ixor
      // 1a7: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 1aa: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 1ad: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 1b0: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 1b3: ifeq 1eb
      // 1b6: aload 0
      // 1b7: aload 4
      // 1b9: ldc_w 288491336
      // 1bc: iload 8
      // 1be: ldc_w 640006231
      // 1c1: ixor
      // 1c2: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 1c5: ldc_w 288491337
      // 1c8: iload 8
      // 1ca: ldc_w -1514499776
      // 1cd: ixor
      // 1ce: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 1d1: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 1d4: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 1d7: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 1da: invokestatic k74/x/IIll.IIIlII (Lcom/google/gson/JsonElement;)Lnet/minecraft/class_3675$class_306;
      // 1dd: putfield k74/x/IlllIlI.IIlIlI Lnet/minecraft/class_3675$class_306;
      // 1e0: aload 3
      // 1e1: ifnull 24c
      // 1e4: goto 1eb
      // 1e7: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ea: athrow
      // 1eb: aload 4
      // 1ed: ldc_w 288491342
      // 1f0: iload 8
      // 1f2: ldc_w 1676927707
      // 1f5: ixor
      // 1f6: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 1f9: ldc_w 288491343
      // 1fc: iload 8
      // 1fe: ldc_w 1312999055
      // 201: ixor
      // 202: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 205: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 208: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 20b: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 20e: ifeq 24c
      // 211: goto 218
      // 214: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 217: athrow
      // 218: aload 0
      // 219: aload 4
      // 21b: ldc_w 288491340
      // 21e: iload 8
      // 220: ldc_w 1022525080
      // 223: ixor
      // 224: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 227: ldc_w 288491341
      // 22a: iload 8
      // 22c: ldc_w 1658921997
      // 22f: ixor
      // 230: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 233: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 236: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 239: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 23c: invokevirtual com/google/gson/JsonElement.getAsInt ()I
      // 23f: invokestatic k74/x/IIll.IIllIll (I)Lnet/minecraft/class_3675$class_306;
      // 242: putfield k74/x/IlllIlI.IIlIlI Lnet/minecraft/class_3675$class_306;
      // 245: goto 24c
      // 248: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24b: athrow
      // 24c: aload 4
      // 24e: ldc_w 288491330
      // 251: iload 8
      // 253: ldc_w 1084159275
      // 256: ixor
      // 257: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 25a: ldc_w 288491331
      // 25d: iload 8
      // 25f: ldc_w -1876390986
      // 262: ixor
      // 263: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 266: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 269: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 26c: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 26f: ifeq 2a3
      // 272: aload 0
      // 273: aload 4
      // 275: ldc_w 288491328
      // 278: iload 8
      // 27a: ldc_w -317130111
      // 27d: ixor
      // 27e: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 281: ldc_w 288491329
      // 284: iload 8
      // 286: ldc_w -1352189141
      // 289: ixor
      // 28a: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 28d: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 290: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 293: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 296: invokestatic k74/x/IIll.IIIlII (Lcom/google/gson/JsonElement;)Lnet/minecraft/class_3675$class_306;
      // 299: putfield k74/x/IlllIlI.IIlIl Lnet/minecraft/class_3675$class_306;
      // 29c: goto 2a3
      // 29f: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a2: athrow
      // 2a3: aload 1
      // 2a4: invokestatic k74/x/IlllIlI.Illlll ()Ljava/lang/String;
      // 2a7: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 2aa: ifeq 2da
      // 2ad: aload 1
      // 2ae: invokestatic k74/x/IlllIlI.Illlll ()Ljava/lang/String;
      // 2b1: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 2b4: invokevirtual com/google/gson/JsonElement.isJsonObject ()Z
      // 2b7: ifeq 2da
      // 2ba: goto 2c1
      // 2bd: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c0: athrow
      // 2c1: aload 0
      // 2c2: aload 1
      // 2c3: invokestatic k74/x/IlllIlI.Illlll ()Ljava/lang/String;
      // 2c6: invokevirtual com/google/gson/JsonObject.getAsJsonObject (Ljava/lang/String;)Lcom/google/gson/JsonObject;
      // 2c9: invokevirtual com/google/gson/JsonObject.deepCopy ()Lcom/google/gson/JsonObject;
      // 2cc: putfield k74/x/IlllIlI.IIlI Lcom/google/gson/JsonObject;
      // 2cf: aload 3
      // 2d0: ifnull 314
      // 2d3: goto 2da
      // 2d6: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d9: athrow
      // 2da: aload 1
      // 2db: invokestatic k74/x/IlllIlI.lIIIl ()Ljava/lang/String;
      // 2de: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 2e1: ifeq 314
      // 2e4: goto 2eb
      // 2e7: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2ea: athrow
      // 2eb: aload 1
      // 2ec: invokestatic k74/x/IlllIlI.lIIIl ()Ljava/lang/String;
      // 2ef: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 2f2: invokevirtual com/google/gson/JsonElement.isJsonObject ()Z
      // 2f5: ifeq 314
      // 2f8: goto 2ff
      // 2fb: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2fe: athrow
      // 2ff: aload 0
      // 300: aload 1
      // 301: invokestatic k74/x/IlllIlI.lIIIl ()Ljava/lang/String;
      // 304: invokevirtual com/google/gson/JsonObject.getAsJsonObject (Ljava/lang/String;)Lcom/google/gson/JsonObject;
      // 307: invokevirtual com/google/gson/JsonObject.deepCopy ()Lcom/google/gson/JsonObject;
      // 30a: putfield k74/x/IlllIlI.IIlI Lcom/google/gson/JsonObject;
      // 30d: goto 314
      // 310: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 313: athrow
      // 314: aload 1
      // 315: ldc_w 288491334
      // 318: iload 8
      // 31a: ldc_w -59779926
      // 31d: ixor
      // 31e: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 321: ldc_w 288491335
      // 324: iload 8
      // 326: ldc_w -392942687
      // 329: ixor
      // 32a: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 32d: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 330: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 333: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 336: ifeq 42f
      // 339: aload 1
      // 33a: ldc_w 288491332
      // 33d: iload 8
      // 33f: ldc_w -831895701
      // 342: ixor
      // 343: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 346: ldc_w 288491333
      // 349: iload 8
      // 34b: ldc_w -2133439788
      // 34e: ixor
      // 34f: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 352: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 355: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 358: invokevirtual com/google/gson/JsonObject.getAsJsonObject (Ljava/lang/String;)Lcom/google/gson/JsonObject;
      // 35b: astore 4
      // 35d: aload 4
      // 35f: getstatic k74/x/IlllIlI.IIIIII J
      // 362: getstatic k74/x/IlllIlI.III J
      // 365: invokestatic k74/x/IlllIlI.IlIll (Lcom/google/gson/JsonObject;JJ)V
      // 368: aload 4
      // 36a: getstatic k74/x/IlllIlI.IlIIl J
      // 36d: getstatic k74/x/IlllIlI.IIIlll J
      // 370: invokestatic k74/x/IlllIlI.IlIll (Lcom/google/gson/JsonObject;JJ)V
      // 373: aload 4
      // 375: getstatic k74/x/IlllIlI.lIlI J
      // 378: getstatic k74/x/IlllIlI.llIIl J
      // 37b: invokestatic k74/x/IlllIlI.IlIll (Lcom/google/gson/JsonObject;JJ)V
      // 37e: aload 4
      // 380: getstatic k74/x/IlllIlI.l J
      // 383: getstatic k74/x/IlllIlI.IIIllI J
      // 386: invokestatic k74/x/IlllIlI.IlIll (Lcom/google/gson/JsonObject;JJ)V
      // 389: aload 4
      // 38b: getstatic k74/x/IlllIlI.lll J
      // 38e: getstatic k74/x/IlllIlI.llllI J
      // 391: invokestatic k74/x/IlllIlI.IlIll (Lcom/google/gson/JsonObject;JJ)V
      // 394: aload 4
      // 396: getstatic k74/x/IlllIlI.IIIII J
      // 399: getstatic k74/x/IlllIlI.lI J
      // 39c: invokestatic k74/x/IlllIlI.IlIll (Lcom/google/gson/JsonObject;JJ)V
      // 39f: aload 4
      // 3a1: getstatic k74/x/IlllIlI.IIIIl J
      // 3a4: getstatic k74/x/IlllIlI.IIIlI J
      // 3a7: invokestatic k74/x/IlllIlI.IlIll (Lcom/google/gson/JsonObject;JJ)V
      // 3aa: aload 4
      // 3ac: getstatic k74/x/IlllIlI.IIlIIl J
      // 3af: getstatic k74/x/IlllIlI.lIIll J
      // 3b2: invokestatic k74/x/IlllIlI.IlIll (Lcom/google/gson/JsonObject;JJ)V
      // 3b5: aload 4
      // 3b7: getstatic k74/x/IlllIlI.llll J
      // 3ba: getstatic k74/x/IlllIlI.IIlII J
      // 3bd: invokestatic k74/x/IlllIlI.IlIll (Lcom/google/gson/JsonObject;JJ)V
      // 3c0: aload 4
      // 3c2: getstatic k74/x/IlllIlI.IIllI J
      // 3c5: getstatic k74/x/IlllIlI.II J
      // 3c8: invokestatic k74/x/IlllIlI.IlIll (Lcom/google/gson/JsonObject;JJ)V
      // 3cb: aload 4
      // 3cd: invokestatic k74/x/IlllIlI.IllIlI (Lcom/google/gson/JsonObject;)V
      // 3d0: aload 4
      // 3d2: invokestatic k74/x/IlllIlI.IIIIIl (Lcom/google/gson/JsonObject;)V
      // 3d5: aload 4
      // 3d7: invokestatic k74/x/IlllIlI.lIII (Lcom/google/gson/JsonObject;)V
      // 3da: aload 4
      // 3dc: invokestatic k74/x/IlllIlI.IlIIII (Lcom/google/gson/JsonObject;)V
      // 3df: aload 4
      // 3e1: invokestatic k74/x/IlllIlI.IllllI (Lcom/google/gson/JsonObject;)V
      // 3e4: aload 2
      // 3e5: invokevirtual k74/x/lIIIlIlI.IIIlll ()Ljava/util/List;
      // 3e8: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 3ed: astore 5
      // 3ef: aload 5
      // 3f1: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3f6: ifeq 42f
      // 3f9: aload 5
      // 3fb: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 400: checkcast k74/x/IlIIIIIIl
      // 403: astore 6
      // 405: aload 4
      // 407: aload 6
      // 409: invokevirtual k74/x/IlIIIIIIl.IIllllI ()J
      // 40c: invokestatic k74/x/IlllIlI.lIIII (Lcom/google/gson/JsonObject;J)Lcom/google/gson/JsonObject;
      // 40f: astore 7
      // 411: aload 7
      // 413: ifnull 42b
      // 416: aload 6
      // 418: aload 7
      // 41a: invokevirtual k74/x/IlIIIIIIl.IlllII (Lcom/google/gson/JsonObject;)V
      // 41d: aload 6
      // 41f: aload 7
      // 421: invokevirtual k74/x/IlIIIIIIl.IllIIII (Lcom/google/gson/JsonObject;)V
      // 424: goto 42b
      // 427: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 42a: athrow
      // 42b: aload 3
      // 42c: ifnull 3ef
      // 42f: goto 434
      // 432: astore 4
      // 434: return
   }

   private static boolean IIlIlI(JsonObject param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: ifnull 6b
      // 04: aload 0
      // 05: ldc_w 288491354
      // 08: ldc_w -1856505314
      // 0b: ldc_w -68591809
      // 0e: ixor
      // 0f: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 12: ldc_w 288491355
      // 15: ldc_w -1856505314
      // 18: ldc_w -596792309
      // 1b: ixor
      // 1c: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 1f: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 22: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 25: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 28: ifeq 6b
      // 2b: goto 32
      // 2e: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: ldc_w 288491352
      // 36: ldc_w -1856505314
      // 39: ldc_w -70227971
      // 3c: ixor
      // 3d: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 40: ldc_w 288491353
      // 43: ldc_w -1856505314
      // 46: ldc_w -2130432349
      // 49: ixor
      // 4a: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 4d: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 50: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 53: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 56: invokevirtual com/google/gson/JsonElement.getAsBoolean ()Z
      // 59: ifeq 6b
      // 5c: goto 63
      // 5f: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: bipush 1
      // 64: goto 6c
      // 67: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6a: athrow
      // 6b: bipush 0
      // 6c: ireturn
   }

   private static String lIIIlI(short var0, int var1, byte var2, int var3) {
      int var8 = var1 ^ -1638166309;
      char[] var7 = IlIIII[var8].toCharArray();
      StackTraceElement[] var9 = (StackTraceElement[])IlIIIl[var8];
      StackTraceElement[] var10;
      if (var9 != null) {
         var10 = var9;
      } else {
         var10 = new Throwable().getStackTrace();
         IlIIIl[var8] = var10;
      }

      StackTraceElement var11 = var10[1];
      int var5 = (var11.getClassName().hashCode() ^ var11.getMethodName().hashCode()) >> 16 ^ 52934;

      for (int var6 = 0; var6 < var7.length; var6++) {
         var7[var6] = (char)(var7[var6] ^ '觳' ^ var6 ^ var2 ^ var1 ^ var5 ^ var0 ^ var3);
      }

      return new String(var7).intern();
   }

   public Path IIlIll(lllIllII var1) {
      Path var2 = this.IIl(var1);

      try {
         if (var2 == null) {
            return null;
         }
      } catch (MatchException var3) {
         throw l(var3);
      }

      return var2.resolve(this.lIlIl(var1));
   }

   static void IIllII(JsonObject var0, long var1, JsonElement var3) {
      var0.add(llIl(var1), var3);
   }

   private void IIllIl(Path param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnonnull 09
      // 04: return
      // 05: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08: athrow
      // 09: aload 0
      // 0a: getstatic k74/x/lllIllII.l Lk74/x/lllIllII;
      // 0d: invokevirtual k74/x/IlllIlI.IIlIll (Lk74/x/lllIllII;)Ljava/nio/file/Path;
      // 10: astore 3
      // 11: aload 3
      // 12: ifnull 27
      // 15: aload 3
      // 16: bipush 0
      // 17: anewarray 116
      // 1a: invokestatic java/nio/file/Files.exists (Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
      // 1d: ifeq 2c
      // 20: goto 27
      // 23: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26: athrow
      // 27: return
      // 28: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b: athrow
      // 2c: bipush 3
      // 2d: anewarray 255
      // 30: dup
      // 31: bipush 0
      // 32: getstatic k74/x/IlllIlI.lIllI Lk74/x/IIIlIlIl;
      // 35: invokevirtual k74/x/IIIlIlIl.llIl ()Ljava/lang/String;
      // 38: aastore
      // 39: dup
      // 3a: bipush 1
      // 3b: getstatic k74/x/IlllIlI.IllII Lk74/x/IIIlIlIl;
      // 3e: invokevirtual k74/x/IIIlIlIl.llIl ()Ljava/lang/String;
      // 41: aastore
      // 42: dup
      // 43: bipush 2
      // 44: ldc_w 288490707
      // 47: ldc_w 1011284660
      // 4a: ldc_w 461508735
      // 4d: ixor
      // 4e: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 51: ldc_w 288490704
      // 54: ldc_w 1011284660
      // 57: ldc_w 418167981
      // 5a: ixor
      // 5b: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 5e: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 61: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 64: aastore
      // 65: invokestatic java/util/stream/Stream.of ([Ljava/lang/Object;)Ljava/util/stream/Stream;
      // 68: aload 1
      // 69: dup
      // 6a: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 6d: pop
      // 6e: invokedynamic apply (Ljava/nio/file/Path;)Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, java/nio/file/Path.resolve (Ljava/lang/String;)Ljava/nio/file/Path;, (Ljava/lang/String;)Ljava/nio/file/Path; ]
      // 73: invokeinterface java/util/stream/Stream.map (Ljava/util/function/Function;)Ljava/util/stream/Stream; 2
      // 78: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, k74/x/IlllIlI.lIIll (Ljava/nio/file/Path;)Z, (Ljava/nio/file/Path;)Z ]
      // 7d: invokeinterface java/util/stream/Stream.filter (Ljava/util/function/Predicate;)Ljava/util/stream/Stream; 2
      // 82: aload 0
      // 83: invokedynamic applyAsLong (Lk74/x/IlllIlI;)Ljava/util/function/ToLongFunction; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)J, k74/x/IlllIlI.IIIIl (Ljava/nio/file/Path;)J, (Ljava/nio/file/Path;)J ]
      // 88: invokestatic java/util/Comparator.comparingLong (Ljava/util/function/ToLongFunction;)Ljava/util/Comparator;
      // 8b: invokeinterface java/util/stream/Stream.max (Ljava/util/Comparator;)Ljava/util/Optional; 2
      // 90: aload 0
      // 91: aload 3
      // 92: iload 2
      // 93: invokedynamic accept (Lk74/x/IlllIlI;Ljava/nio/file/Path;Z)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, k74/x/IlllIlI.IllIl (Ljava/nio/file/Path;ZLjava/nio/file/Path;)V, (Ljava/nio/file/Path;)V ]
      // 98: invokevirtual java/util/Optional.ifPresent (Ljava/util/function/Consumer;)V
      // 9b: return
   }

   public String IIlllI(lllIllII var1) {
      int var6 = -348919027;
      if (var1 == lllIllII.II) {
         Path var9 = this.IllIIl();

         try {
            if (var9 != null) {
               String var11 = var9.getFileName().toString();
               String var10001 = IlIIllIII.lI(IIIIlI(lIIIIl(288490705, var6 ^ 1786145760), lIIIIl(288490710, var6 ^ -181343698)));
               String var5 = lIlIl.llIl();
               String var4 = var10001;
               String var3 = var11;
               return var3 + var4 + var5;
            }
         } catch (MatchException var7) {
            throw l(var7);
         }

         return IlIIllIII.lI(IIIIlI(lIIIIl(288490711, var6 ^ 1804823681), lIIIIl(288490708, var6 ^ -732135849)));
      } else {
         Path var2 = this.IIl(var1);

         try {
            if (var2 == null) {
               return IlIIllIII.lI(IIIIlI(lIIIIl(288490709, var6 ^ 455292169), lIIIIl(288490730, var6 ^ -1509562466)));
            }
         } catch (MatchException var8) {
            throw l(var8);
         }

         return var2.toAbsolutePath().normalize().toString();
      }
   }

   private Path IIllll() {
      Path var1 = this.lll();

      try {
         if (var1 == null) {
            return null;
         }
      } catch (MatchException var2) {
         throw l(var2);
      }

      return var1.resolve(lllIl.llIl());
   }

   private static void IlIIII(JsonObject param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getstatic k74/x/IlllIlI.IlIl J
      // 04: invokestatic k74/x/IlllIlI.IlIIIl (Lcom/google/gson/JsonObject;J)Z
      // 07: ifne 0f
      // 0a: return
      // 0b: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e: athrow
      // 0f: aload 0
      // 10: getstatic k74/x/IlllIlI.IlIl J
      // 13: invokestatic k74/x/IlllIlI.lIIII (Lcom/google/gson/JsonObject;J)Lcom/google/gson/JsonObject;
      // 16: astore 1
      // 17: aload 1
      // 18: ifnull 49
      // 1b: aload 1
      // 1c: ldc_w 288490731
      // 1f: ldc_w 1508128908
      // 22: ldc_w 1321072262
      // 25: ixor
      // 26: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 29: ldc_w 288490728
      // 2c: ldc_w 1508128908
      // 2f: ldc_w 1267843844
      // 32: ixor
      // 33: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 36: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 39: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 3c: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 3f: ifne 4e
      // 42: goto 49
      // 45: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 48: athrow
      // 49: return
      // 4a: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4d: athrow
      // 4e: aload 1
      // 4f: ldc_w 288490729
      // 52: ldc_w 1508128908
      // 55: ldc_w 224711627
      // 58: ixor
      // 59: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 5c: ldc_w 288490734
      // 5f: ldc_w 1508128908
      // 62: ldc_w 1209128250
      // 65: ixor
      // 66: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 69: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 6c: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 6f: invokevirtual com/google/gson/JsonObject.getAsJsonObject (Ljava/lang/String;)Lcom/google/gson/JsonObject;
      // 72: astore 2
      // 73: getstatic k74/x/IlllIlI.IlllI Lk74/x/IIIlIlIl;
      // 76: invokevirtual k74/x/IIIlIlIl.I ()J
      // 79: lstore 3
      // 7a: getstatic k74/x/IlllIlI.lII Lk74/x/IIIlIlIl;
      // 7d: invokevirtual k74/x/IIIlIlIl.I ()J
      // 80: lstore 5
      // 82: aload 2
      // 83: lload 3
      // 84: invokestatic k74/x/IlIIIIIIl.IIllIlI (Lcom/google/gson/JsonObject;J)Lcom/google/gson/JsonElement;
      // 87: ifnull 95
      // 8a: aload 2
      // 8b: lload 5
      // 8d: invokestatic k74/x/IlIIIIIIl.IIIllII (Lcom/google/gson/JsonObject;J)V
      // 90: return
      // 91: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 94: athrow
      // 95: aload 2
      // 96: lload 5
      // 98: invokestatic k74/x/IlIIIIIIl.IIllIlI (Lcom/google/gson/JsonObject;J)Lcom/google/gson/JsonElement;
      // 9b: astore 7
      // 9d: aload 7
      // 9f: ifnonnull a7
      // a2: return
      // a3: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a6: athrow
      // a7: aload 7
      // a9: ifnull f7
      // ac: aload 7
      // ae: invokevirtual com/google/gson/JsonElement.isJsonPrimitive ()Z
      // b1: ifeq f7
      // b4: goto bb
      // b7: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ba: athrow
      // bb: aload 7
      // bd: invokevirtual com/google/gson/JsonElement.getAsJsonPrimitive ()Lcom/google/gson/JsonPrimitive;
      // c0: invokevirtual com/google/gson/JsonPrimitive.isNumber ()Z
      // c3: ifeq f7
      // c6: goto cd
      // c9: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // cc: athrow
      // cd: aload 7
      // cf: invokevirtual com/google/gson/JsonElement.getAsDouble ()D
      // d2: dstore 8
      // d4: dconst_1
      // d5: ldc2_w 100.0
      // d8: ldc2_w 101.0
      // db: dload 8
      // dd: dsub
      // de: invokestatic java/lang/Math.min (DD)D
      // e1: invokestatic java/lang/Math.max (DD)D
      // e4: dstore 10
      // e6: aload 2
      // e7: lload 3
      // e8: new com/google/gson/JsonPrimitive
      // eb: dup
      // ec: dload 10
      // ee: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // f1: invokespecial com/google/gson/JsonPrimitive.<init> (Ljava/lang/Number;)V
      // f4: invokestatic k74/x/IlIIIIIIl.IlllIII (Lcom/google/gson/JsonObject;JLcom/google/gson/JsonElement;)V
      // f7: aload 2
      // f8: lload 5
      // fa: invokestatic k74/x/IlIIIIIIl.IIIllII (Lcom/google/gson/JsonObject;J)V
      // fd: return
   }

   static boolean IlIIIl(JsonObject var0, long var1) {
      try {
         if (llIII(var0, var1) != null) {
            return true;
         }
      } catch (MatchException var3) {
         throw l(var3);
      }

      return false;
   }

   private void IlIIlI(Path var1, IIIlIlIl var2, IIIlIlIl var3, boolean var4) {
      try {
         if (var1 == null) {
            return;
         }
      } catch (MatchException var8) {
         throw l(var8);
      }

      this.IIIIII(var1.resolve(var2.llIl()), this.IIlIll(lllIllII.l), var4);
      Path var5 = var1.resolve(var3.llIl());
      this.llIll(var5, this.IIllI(), var4);
      this.llIll(var5.resolve(IIlIII.llIl()), this.llIlI(), var4);
      this.llIll(var1.resolve(IIlIll.llIl()), this.IlllI(), var4);
      Path var6 = var1.resolve(IlIII.llIl());

      try {
         this.llIll(var6, this.IIllI(), var4);
         if (var4) {
            this.IIll(var5.resolve(IIlIII.llIl()));
            this.IIll(var5);
            this.IIll(var6);
            this.IIll(var1.resolve(IIlIll.llIl()));
         }
      } catch (MatchException var7) {
         throw l(var7);
      }
   }

   private void IlIIll() {
      Path var1 = this.IIllll();

      label87: {
         try {
            if (var1 != null && Files.exists(var1)) {
               break label87;
            }
         } catch (Exception var9) {
            throw l(var9);
         }

         Path var2 = this.IIIIll();

         Path var10000;
         label74: {
            try {
               if (var2 == null) {
                  var10000 = null;
                  break label74;
               }
            } catch (Exception var8) {
               throw l(var8);
            }

            var10000 = var2.resolve(lllll.llIl());
         }

         var1 = var10000;
      }

      label88: {
         try {
            if (var1 != null && Files.exists(var1)) {
               break label88;
            }
         } catch (Exception var7) {
            throw l(var7);
         }

         var1 = this.lllII.resolve(Il.llIl());

         try {
            if (!Files.exists(var1)) {
               return;
            }
         } catch (Exception var4) {
            throw l(var4);
         }
      }

      try {
         JsonElement var10 = (JsonElement)IIIIIl.fromJson(Files.readString(var1), JsonElement.class);

         try {
            if (var10 == null || !var10.isJsonObject()) {
               return;
            }
         } catch (Exception var5) {
            throw l(var5);
         }

         JsonObject var3 = var10.getAsJsonObject();
         if (!var3.has(IlIIllIII.lI(IIIIlI(lIIIIl(288490735, 1054888511 ^ -1979054996), lIIIIl(288490732, 1054888511 ^ 1486577351))))) {
            return;
         }

         this.IIllII = this.lII(
            var3.get(IlIIllIII.lI(IIIIlI(lIIIIl(288490733, 1054888511 ^ 1511766659), lIIIIl(288490722, 1054888511 ^ -73969443)))).getAsString()
         );
      } catch (Exception var6) {
      }
   }

   private static boolean IlIlII(Path var0) {
      return Files.isRegularFile(var0);
   }

   private String IlIlIl(lllIllII var1) {
      try {
         if (var1 == lllIllII.l) {
            return IllIl.llIl();
         }
      } catch (MatchException var2) {
         throw l(var2);
      }

      return llII.llIl();
   }

   private Path IlIllI() {
      FileSystem var1 = this.lIIlI();

      try {
         if (var1 == null) {
            return null;
         }
      } catch (MatchException var6) {
         throw l(var6);
      }

      Path var2 = var1.getPath(lIlIl.llIl());

      try {
         if (Files.exists(var2.resolve(this.lIlIl(lllIllII.II)))) {
            return var2;
         }
      } catch (MatchException var5) {
         throw l(var5);
      }

      Path var3 = var1.getPath(IlIlI.llIl());

      try {
         if (Files.exists(var3)) {
            return var3;
         }
      } catch (MatchException var4) {
         throw l(var4);
      }

      return var2;
   }

   private static JsonElement IlIlll(JsonObject param0, JsonObject param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc_w -880800947
      // 03: istore 2
      // 04: aload 0
      // 05: ifnull 5a
      // 08: aload 0
      // 09: ldc_w 288490723
      // 0c: iload 2
      // 0d: ldc_w -957879969
      // 10: ixor
      // 11: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 14: ldc_w 288490720
      // 17: iload 2
      // 18: ldc_w -94939684
      // 1b: ixor
      // 1c: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 1f: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 22: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 25: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 28: ifeq 5a
      // 2b: goto 32
      // 2e: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: ldc_w 288490721
      // 36: iload 2
      // 37: ldc_w -361674646
      // 3a: ixor
      // 3b: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 3e: ldc_w 288490726
      // 41: iload 2
      // 42: ldc_w -248342144
      // 45: ixor
      // 46: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 49: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 4c: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 4f: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 52: invokevirtual com/google/gson/JsonElement.deepCopy ()Lcom/google/gson/JsonElement;
      // 55: areturn
      // 56: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 59: athrow
      // 5a: aload 1
      // 5b: ifnull b0
      // 5e: aload 1
      // 5f: ldc_w 288490727
      // 62: iload 2
      // 63: ldc_w 1645968955
      // 66: ixor
      // 67: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 6a: ldc_w 288490724
      // 6d: iload 2
      // 6e: ldc_w 1750188683
      // 71: ixor
      // 72: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 75: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 78: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 7b: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 7e: ifeq b0
      // 81: goto 88
      // 84: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 87: athrow
      // 88: aload 1
      // 89: ldc_w 288490725
      // 8c: iload 2
      // 8d: ldc_w 1948899635
      // 90: ixor
      // 91: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 94: ldc_w 288490746
      // 97: iload 2
      // 98: ldc_w 2137838425
      // 9b: ixor
      // 9c: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 9f: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // a2: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // a5: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // a8: invokevirtual com/google/gson/JsonElement.deepCopy ()Lcom/google/gson/JsonElement;
      // ab: areturn
      // ac: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // af: athrow
      // b0: aconst_null
      // b1: areturn
   }

   public class_306 IllIII() {
      return this.IIlIlI;
   }

   private Path IllIIl() {
      return FabricLoader.getInstance()
         .getModContainer(IlIIllIII.lI(IIIIlI(lIIIIl(288490747, 502640722 ^ 894092843), lIIIIl(288490744, 502640722 ^ 683105542))))
         .map(IlllIlI::IIIll)
         .orElse(null);
   }

   private static void IllIlI(JsonObject param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w -450685526
      // 003: istore 6
      // 005: aload 0
      // 006: getstatic k74/x/IlllIlI.llI J
      // 009: invokestatic k74/x/IlllIlI.IlIIIl (Lcom/google/gson/JsonObject;J)Z
      // 00c: ifeq 014
      // 00f: return
      // 010: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 013: athrow
      // 014: aload 0
      // 015: getstatic k74/x/IlllIlI.lIlII J
      // 018: invokestatic k74/x/IlllIlI.lIIII (Lcom/google/gson/JsonObject;J)Lcom/google/gson/JsonObject;
      // 01b: astore 1
      // 01c: aload 0
      // 01d: getstatic k74/x/IlllIlI.lIll J
      // 020: invokestatic k74/x/IlllIlI.lIIII (Lcom/google/gson/JsonObject;J)Lcom/google/gson/JsonObject;
      // 023: astore 2
      // 024: aload 1
      // 025: ifnonnull 038
      // 028: aload 2
      // 029: ifnonnull 038
      // 02c: goto 033
      // 02f: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 032: athrow
      // 033: return
      // 034: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 037: athrow
      // 038: new com/google/gson/JsonObject
      // 03b: dup
      // 03c: invokespecial com/google/gson/JsonObject.<init> ()V
      // 03f: astore 3
      // 040: aload 3
      // 041: ldc_w 288490745
      // 044: iload 6
      // 046: ldc_w 670544795
      // 049: ixor
      // 04a: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 04d: ldc_w 288490750
      // 050: iload 6
      // 052: ldc_w -263773993
      // 055: ixor
      // 056: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 059: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 05c: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 05f: aload 1
      // 060: invokestatic k74/x/IlllIlI.IIlIlI (Lcom/google/gson/JsonObject;)Z
      // 063: ifne 074
      // 066: aload 2
      // 067: invokestatic k74/x/IlllIlI.IIlIlI (Lcom/google/gson/JsonObject;)Z
      // 06a: ifeq 07c
      // 06d: goto 074
      // 070: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 073: athrow
      // 074: bipush 1
      // 075: goto 07d
      // 078: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07b: athrow
      // 07c: bipush 0
      // 07d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 080: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/Boolean;)V
      // 083: aload 1
      // 084: aload 2
      // 085: invokestatic k74/x/IlllIlI.IlIlll (Lcom/google/gson/JsonObject;Lcom/google/gson/JsonObject;)Lcom/google/gson/JsonElement;
      // 088: astore 4
      // 08a: aload 4
      // 08c: ifnull 0ba
      // 08f: aload 3
      // 090: ldc_w 288490751
      // 093: iload 6
      // 095: ldc_w -875655127
      // 098: ixor
      // 099: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 09c: ldc_w 288490748
      // 09f: iload 6
      // 0a1: ldc_w 2008649609
      // 0a4: ixor
      // 0a5: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 0a8: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 0ab: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0ae: aload 4
      // 0b0: invokevirtual com/google/gson/JsonObject.add (Ljava/lang/String;Lcom/google/gson/JsonElement;)V
      // 0b3: goto 0ba
      // 0b6: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b9: athrow
      // 0ba: new com/google/gson/JsonObject
      // 0bd: dup
      // 0be: invokespecial com/google/gson/JsonObject.<init> ()V
      // 0c1: astore 5
      // 0c3: aload 5
      // 0c5: ldc_w 288490749
      // 0c8: iload 6
      // 0ca: ldc_w -1631421861
      // 0cd: ixor
      // 0ce: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 0d1: ldc_w 288490738
      // 0d4: iload 6
      // 0d6: ldc_w -645013296
      // 0d9: ixor
      // 0da: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 0dd: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 0e0: invokestatic k74/x/IlIIllIII.Ill (Ljava/lang/String;)Lk74/x/IIIlIlIl;
      // 0e3: invokevirtual k74/x/IIIlIlIl.I ()J
      // 0e6: new com/google/gson/JsonPrimitive
      // 0e9: dup
      // 0ea: aload 1
      // 0eb: aload 2
      // 0ec: invokestatic k74/x/IlllIlI.lI (Lcom/google/gson/JsonObject;Lcom/google/gson/JsonObject;)Ljava/lang/String;
      // 0ef: invokespecial com/google/gson/JsonPrimitive.<init> (Ljava/lang/String;)V
      // 0f2: invokestatic k74/x/IlIIIIIIl.IlllIII (Lcom/google/gson/JsonObject;JLcom/google/gson/JsonElement;)V
      // 0f5: aload 3
      // 0f6: ldc_w 288490739
      // 0f9: iload 6
      // 0fb: ldc_w -1607422773
      // 0fe: ixor
      // 0ff: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 102: ldc_w 288490736
      // 105: iload 6
      // 107: ldc_w 1023134609
      // 10a: ixor
      // 10b: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 10e: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 111: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 114: aload 5
      // 116: invokevirtual com/google/gson/JsonObject.add (Ljava/lang/String;Lcom/google/gson/JsonElement;)V
      // 119: aload 3
      // 11a: ldc_w 288490737
      // 11d: iload 6
      // 11f: ldc_w -1632289256
      // 122: ixor
      // 123: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 126: ldc_w 288490742
      // 129: iload 6
      // 12b: ldc_w 1223750068
      // 12e: ixor
      // 12f: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 132: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 135: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 138: aload 1
      // 139: invokestatic k74/x/IlllIlI.ll (Lcom/google/gson/JsonObject;)Lcom/google/gson/JsonObject;
      // 13c: invokevirtual com/google/gson/JsonObject.add (Ljava/lang/String;Lcom/google/gson/JsonElement;)V
      // 13f: aload 0
      // 140: getstatic k74/x/IlllIlI.llI J
      // 143: aload 3
      // 144: invokestatic k74/x/IlllIlI.IIllII (Lcom/google/gson/JsonObject;JLcom/google/gson/JsonElement;)V
      // 147: return
   }

   private void IllIll() {
      Path var1 = this.IIII();

      try {
         if (var1 == null) {
            return;
         }
      } catch (IOException var4) {
         throw l(var4);
      }

      try {
         Files.deleteIfExists(var1);
      } catch (IOException var3) {
      }
   }

   private static boolean IlllII(JsonObject param0, long param1, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: lload 1
      // 02: invokestatic k74/x/IlIIIIIIl.IIllIlI (Lcom/google/gson/JsonObject;J)Lcom/google/gson/JsonElement;
      // 05: astore 4
      // 07: aload 4
      // 09: ifnull 1b
      // 0c: aload 4
      // 0e: invokevirtual com/google/gson/JsonElement.isJsonPrimitive ()Z
      // 11: ifne 21
      // 14: goto 1b
      // 17: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a: athrow
      // 1b: iload 3
      // 1c: ireturn
      // 1d: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: aload 4
      // 23: invokevirtual com/google/gson/JsonElement.getAsBoolean ()Z
      // 26: ireturn
      // 27: astore 5
      // 29: iload 3
      // 2a: ireturn
   }

   public lllIIlIl IlllIl() {
      return this.IIll;
   }

   private static void IllllI(JsonObject param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w 95065565
      // 003: istore 7
      // 005: aload 0
      // 006: getstatic k74/x/IlllIlI.IIIllI J
      // 009: invokestatic k74/x/IlllIlI.IlIIIl (Lcom/google/gson/JsonObject;J)Z
      // 00c: ifne 014
      // 00f: return
      // 010: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 013: athrow
      // 014: aload 0
      // 015: getstatic k74/x/IlllIlI.IIIllI J
      // 018: invokestatic k74/x/IlllIlI.lIIII (Lcom/google/gson/JsonObject;J)Lcom/google/gson/JsonObject;
      // 01b: astore 1
      // 01c: aload 1
      // 01d: ifnull 04c
      // 020: aload 1
      // 021: ldc_w 288490743
      // 024: iload 7
      // 026: ldc_w -546906709
      // 029: ixor
      // 02a: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 02d: ldc_w 288490740
      // 030: iload 7
      // 032: ldc_w 492854217
      // 035: ixor
      // 036: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 039: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 03c: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 03f: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 042: ifne 051
      // 045: goto 04c
      // 048: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04b: athrow
      // 04c: return
      // 04d: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 050: athrow
      // 051: aload 1
      // 052: ldc_w 288490741
      // 055: iload 7
      // 057: ldc_w -214757835
      // 05a: ixor
      // 05b: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 05e: ldc_w 288490634
      // 061: iload 7
      // 063: ldc_w 136128494
      // 066: ixor
      // 067: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 06a: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 06d: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 070: invokevirtual com/google/gson/JsonObject.getAsJsonObject (Ljava/lang/String;)Lcom/google/gson/JsonObject;
      // 073: astore 2
      // 074: getstatic k74/x/IlllIlI.lIII Lk74/x/IIIlIlIl;
      // 077: invokevirtual k74/x/IIIlIlIl.I ()J
      // 07a: lstore 3
      // 07b: aload 2
      // 07c: lload 3
      // 07d: invokestatic k74/x/IlIIIIIIl.IIllIlI (Lcom/google/gson/JsonObject;J)Lcom/google/gson/JsonElement;
      // 080: astore 5
      // 082: aload 5
      // 084: ifnull 096
      // 087: aload 5
      // 089: invokevirtual com/google/gson/JsonElement.isJsonPrimitive ()Z
      // 08c: ifne 09b
      // 08f: goto 096
      // 092: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 095: athrow
      // 096: return
      // 097: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09a: athrow
      // 09b: aload 5
      // 09d: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 0a0: astore 6
      // 0a2: ldc_w 288490635
      // 0a5: iload 7
      // 0a7: ldc_w 765632039
      // 0aa: ixor
      // 0ab: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 0ae: ldc_w 288490632
      // 0b1: iload 7
      // 0b3: ldc_w -2117456303
      // 0b6: ixor
      // 0b7: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 0ba: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 0bd: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0c0: aload 6
      // 0c2: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 0c5: ifne 0f5
      // 0c8: ldc_w 288490633
      // 0cb: iload 7
      // 0cd: ldc_w -358992241
      // 0d0: ixor
      // 0d1: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 0d4: ldc_w 288490638
      // 0d7: iload 7
      // 0d9: ldc_w -1932229102
      // 0dc: ixor
      // 0dd: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 0e0: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 0e3: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0e6: aload 6
      // 0e8: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 0eb: ifeq 126
      // 0ee: goto 0f5
      // 0f1: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f4: athrow
      // 0f5: aload 2
      // 0f6: lload 3
      // 0f7: new com/google/gson/JsonPrimitive
      // 0fa: dup
      // 0fb: ldc_w 288490639
      // 0fe: iload 7
      // 100: ldc_w -1038457908
      // 103: ixor
      // 104: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 107: ldc_w 288490636
      // 10a: iload 7
      // 10c: ldc_w 1266589243
      // 10f: ixor
      // 110: invokestatic k74/x/IlllIlI.lIIIIl (II)I
      // 113: invokestatic k74/x/IlllIlI.IIIIlI (II)Ljava/lang/String;
      // 116: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 119: invokespecial com/google/gson/JsonPrimitive.<init> (Ljava/lang/String;)V
      // 11c: invokestatic k74/x/IlIIIIIIl.IlllIII (Lcom/google/gson/JsonObject;JLcom/google/gson/JsonElement;)V
      // 11f: goto 126
      // 122: invokestatic k74/x/IlllIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 125: athrow
      // 126: return
   }

   private static String Illlll() {
      return IlIIllIII.lI(IIIIlI(lIIIIl(288490637, 307661068 ^ -216040039), lIIIIl(288490626, 307661068 ^ -2123847626)));
   }

   private static boolean lIIIII(Path var0) {
      return Files.isRegularFile(var0);
   }
}
