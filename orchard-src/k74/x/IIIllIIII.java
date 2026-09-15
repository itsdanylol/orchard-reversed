package k74.x;

import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient.Redirect;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.time.Duration;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1011;
import net.minecraft.class_2960;
import net.minecraft.class_310;

@Environment(EnvType.CLIENT)
final class IIIllIIII {
   private static final HttpClient I;
   private volatile boolean II;
   private static final Object[] IllI;
   private static final ExecutorService Il;
   private static final int[] IlII;
   private boolean lI;
   private volatile String ll;
   private volatile boolean III;
   private static final class_2960 IIl;
   private static final long IlI = 2000L;
   private volatile Process Ill;
   private static final String[] l;
   private static String[] lII;
   private static final int lIl = 2097152;
   private static final String[] IlIl;
   private static final int llI = 32;
   private volatile CompletableFuture<?> lll;
   private volatile IlIIlIIl IIII;
   private volatile boolean IIIl;
   private final Map<String, IIIlII> IIlI = new IIIIIllIl(this, IIlII(801332720, -2091625139 ^ -1633295422), 0.75F, true);
   private static final String[] IIll;

   void I(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: bipush 0
      // 02: putfield k74/x/IIIllIIII.II Z
      // 05: aload 0
      // 06: getfield k74/x/IIIllIIII.Ill Ljava/lang/Process;
      // 09: astore 2
      // 0a: aload 2
      // 0b: ifnull 19
      // 0e: aload 2
      // 0f: invokevirtual java/lang/Process.destroy ()V
      // 12: goto 19
      // 15: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: aload 0
      // 1a: invokestatic k74/x/IlIIlIIl.lII ()Lk74/x/IlIIlIIl;
      // 1d: putfield k74/x/IIIllIIII.IIII Lk74/x/IlIIlIIl;
      // 20: aload 0
      // 21: getstatic k74/x/IIIllIIII.lII [Ljava/lang/String;
      // 24: ldc 801332676
      // 26: ldc 1745412294
      // 28: ldc 115882988
      // 2a: ixor
      // 2b: invokestatic k74/x/IIIllIIII.IIlII (II)I
      // 2e: aaload
      // 2f: putfield k74/x/IIIllIIII.ll Ljava/lang/String;
      // 32: aload 0
      // 33: getfield k74/x/IIIllIIII.lll Ljava/util/concurrent/CompletableFuture;
      // 36: astore 3
      // 37: aload 3
      // 38: ifnull 48
      // 3b: aload 3
      // 3c: bipush 1
      // 3d: invokevirtual java/util/concurrent/CompletableFuture.cancel (Z)Z
      // 40: pop
      // 41: goto 48
      // 44: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 47: athrow
      // 48: aload 1
      // 49: ifnull 6c
      // 4c: aload 0
      // 4d: getfield k74/x/IIIllIIII.lI Z
      // 50: ifeq 6c
      // 53: goto 5a
      // 56: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 59: athrow
      // 5a: aload 1
      // 5b: aload 0
      // 5c: aload 1
      // 5d: invokedynamic run (Lk74/x/IIIllIIII;Lnet/minecraft/class_310;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, k74/x/IIIllIIII.IIIII (Lnet/minecraft/class_310;)V, ()V ]
      // 62: invokevirtual net/minecraft/class_310.execute (Ljava/lang/Runnable;)V
      // 65: goto 6c
      // 68: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6b: athrow
      // 6c: return
   }

   private void l(class_310 var1, lIllIl var2) {
      this.llll(var1, var2);
   }

   private static String II(JsonObject param0, String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 05: astore 2
      // 06: aload 2
      // 07: ifnull 18
      // 0a: aload 2
      // 0b: invokevirtual com/google/gson/JsonElement.isJsonNull ()Z
      // 0e: ifeq 2d
      // 11: goto 18
      // 14: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: getstatic k74/x/IIIllIIII.lII [Ljava/lang/String;
      // 1b: ldc 801332677
      // 1d: ldc -1821136477
      // 1f: ldc 1219162682
      // 21: ixor
      // 22: invokestatic k74/x/IIIllIIII.IIlII (II)I
      // 25: aaload
      // 26: goto 31
      // 29: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c: athrow
      // 2d: aload 2
      // 2e: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 31: areturn
   }

   private void Il(class_310 var1) {
      String[] var2 = IIllllIl.IIIIl();

      while (this.II) {
         try {
            Path var3 = this.IlII();
            Runtime var10000 = Runtime.getRuntime();
            String[] var10001 = new String[IIlII(801332678, -1686438113 ^ -1731984080)];
            var10001[0] = IlIIllIII.lI(lII[2]);
            var10001[1] = IlIIllIII.lI(lII[4]);
            var10001[2] = IlIIllIII.lI(lII[IIlII(801332679, -1686438113 ^ 2053702155)]);
            var10001[3] = IlIIllIII.lI(lII[3]);
            var10001[4] = IlIIllIII.lI(lII[1]);
            var10001[5] = IlIIllIII.lI(lII[5]);
            var10001[IIlII(801332672, -1686438113 ^ 380571018)] = var3.toString();
            Process var4 = var10000.exec(var10001);
            this.Ill = var4;

            try {
               String var6;
               try (BufferedReader var5 = new BufferedReader(new InputStreamReader(var4.getInputStream(), StandardCharsets.UTF_8))) {
                  while (this.II && (var6 = var5.readLine()) != null) {
                     lIllIl var7 = IIl(var6);

                     try {
                        if (var7 != null) {
                           var1.execute(this::l);
                        }
                     } catch (Throwable var30) {
                        throw llII(var30);
                     }

                     if (var2 != null) {
                        break;
                     }
                  }
               }
            } finally {
               try {
                  var4.destroy();
                  if (!var4.waitFor(500L, TimeUnit.MILLISECONDS)) {
                     var4.destroyForcibly();
                  }
               } catch (Throwable var31) {
                  throw llII(var31);
               }
            }
         } catch (Exception var34) {
         } finally {
            this.Ill = null;
         }

         if (this.II) {
            try {
               Thread.sleep(2000L);
            } catch (InterruptedException var28) {
               Thread.currentThread().interrupt();
               return;
            }
         }
      }
   }

   private static IIIlII lI(boolean param0, HttpResponse param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc_w -1989914605
      // 03: istore 5
      // 05: aload 1
      // 06: invokeinterface java/net/http/HttpResponse.statusCode ()I 1
      // 0b: ldc_w 801332689
      // 0e: iload 5
      // 10: ldc_w -224962998
      // 13: ixor
      // 14: invokestatic k74/x/IIIllIIII.IIlII (II)I
      // 17: if_icmplt 68
      // 1a: aload 1
      // 1b: invokeinterface java/net/http/HttpResponse.statusCode ()I 1
      // 20: ldc_w 801332690
      // 23: iload 5
      // 25: ldc_w -930256690
      // 28: ixor
      // 29: invokestatic k74/x/IIIllIIII.IIlII (II)I
      // 2c: if_icmpge 68
      // 2f: goto 36
      // 32: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 35: athrow
      // 36: aload 1
      // 37: invokeinterface java/net/http/HttpResponse.body ()Ljava/lang/Object; 1
      // 3c: ifnull 68
      // 3f: goto 46
      // 42: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 45: athrow
      // 46: aload 1
      // 47: invokeinterface java/net/http/HttpResponse.body ()Ljava/lang/Object; 1
      // 4c: checkcast java/lang/String
      // 4f: invokevirtual java/lang/String.length ()I
      // 52: ldc_w 801332691
      // 55: iload 5
      // 57: ldc_w -1179682832
      // 5a: ixor
      // 5b: invokestatic k74/x/IIIllIIII.IIlII (II)I
      // 5e: if_icmple 70
      // 61: goto 68
      // 64: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 67: athrow
      // 68: getstatic k74/x/IIIlII.III Lk74/x/IIIlII;
      // 6b: areturn
      // 6c: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6f: athrow
      // 70: aload 1
      // 71: invokeinterface java/net/http/HttpResponse.body ()Ljava/lang/Object; 1
      // 76: checkcast java/lang/String
      // 79: invokestatic com/google/gson/JsonParser.parseString (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 7c: astore 2
      // 7d: iload 0
      // 7e: ifeq a0
      // 81: aload 2
      // 82: invokevirtual com/google/gson/JsonElement.getAsJsonArray ()Lcom/google/gson/JsonArray;
      // 85: astore 4
      // 87: aload 4
      // 89: invokevirtual com/google/gson/JsonArray.isEmpty ()Z
      // 8c: ifeq 93
      // 8f: getstatic k74/x/IIIlII.III Lk74/x/IIIlII;
      // 92: areturn
      // 93: aload 4
      // 95: bipush 0
      // 96: invokevirtual com/google/gson/JsonArray.get (I)Lcom/google/gson/JsonElement;
      // 99: invokevirtual com/google/gson/JsonElement.getAsJsonObject ()Lcom/google/gson/JsonObject;
      // 9c: astore 3
      // 9d: goto a5
      // a0: aload 2
      // a1: invokevirtual com/google/gson/JsonElement.getAsJsonObject ()Lcom/google/gson/JsonObject;
      // a4: astore 3
      // a5: aload 3
      // a6: getstatic k74/x/IIIllIIII.lII [Ljava/lang/String;
      // a9: ldc_w 801332700
      // ac: iload 5
      // ae: ldc_w 2068405869
      // b1: ixor
      // b2: invokestatic k74/x/IIIllIIII.IIlII (II)I
      // b5: aaload
      // b6: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // b9: invokestatic k74/x/IIIllIIII.II (Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/lang/String;
      // bc: aload 3
      // bd: getstatic k74/x/IIIllIIII.lII [Ljava/lang/String;
      // c0: ldc_w 801332701
      // c3: iload 5
      // c5: ldc_w -336023882
      // c8: ixor
      // c9: invokestatic k74/x/IIIllIIII.IIlII (II)I
      // cc: aaload
      // cd: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // d0: invokestatic k74/x/IIIllIIII.II (Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/lang/String;
      // d3: invokestatic k74/x/IIIlII.II (Ljava/lang/String;Ljava/lang/String;)Lk74/x/IIIlII;
      // d6: areturn
      // d7: astore 2
      // d8: getstatic k74/x/IIIlII.III Lk74/x/IIIlII;
      // db: areturn
   }

   private static int IIlII(int var0, int var1) {
      int var2 = IlII[var0 ^ 801332676] ^ var1 ^ var0;
      var2 += 55864;
      var2 += 8579;
      var2 -= 39396;
      var2 += 22630;
      var2 += 26290;
      var2 += 9091;
      var2 += 17220;
      var2 ^= 53857;
      return var2 - 50601;
   }

   private static String IIlIl(int var0, int var1) {
      int var3 = var0 ^ 1927025357;
      char[] var4 = IlIl[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])IllI[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         IllI[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 1036598022;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 143;
            case 1 -> 122;
            case 2 -> 155;
            case 3 -> 225;
            case 4 -> 10;
            case 5 -> 234;
            case 6 -> 184;
            case 7 -> 103;
            case 8 -> 106;
            case 9 -> 165;
            case 10 -> 221;
            case 11 -> 200;
            case 12 -> 234;
            case 13 -> 173;
            case 14 -> 146;
            case 15 -> 108;
            case 16 -> 40;
            case 17 -> 193;
            case 18 -> 188;
            case 19 -> 126;
            case 20 -> 228;
            case 21 -> 215;
            case 22 -> 196;
            case 23 -> 75;
            case 24 -> 133;
            case 25 -> 64;
            case 26 -> 48;
            case 27 -> 191;
            case 28 -> 209;
            case 29 -> 134;
            case 30 -> 163;
            case 31 -> 51;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static Thread ll(Runnable var0) {
      Thread var1 = new Thread(var0, IlIIllIII.lI(lII[0]));
      var1.setDaemon(true);
      return var1;
   }

   void III(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: bipush 1
      // 02: putfield k74/x/IIIllIIII.II Z
      // 05: aload 0
      // 06: getfield k74/x/IIIllIIII.III Z
      // 09: ifne 17
      // 0c: aload 1
      // 0d: ifnonnull 1c
      // 10: goto 17
      // 13: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16: athrow
      // 17: return
      // 18: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b: athrow
      // 1c: aload 0
      // 1d: bipush 1
      // 1e: putfield k74/x/IIIllIIII.III Z
      // 21: aload 0
      // 22: aload 1
      // 23: invokedynamic run (Lk74/x/IIIllIIII;Lnet/minecraft/class_310;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, k74/x/IIIllIIII.lIlI (Lnet/minecraft/class_310;)V, ()V ]
      // 28: getstatic k74/x/IIIllIIII.Il Ljava/util/concurrent/ExecutorService;
      // 2b: invokestatic java/util/concurrent/CompletableFuture.runAsync (Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletableFuture;
      // 2e: aload 0
      // 2f: invokedynamic accept (Lk74/x/IIIllIIII;)Ljava/util/function/BiConsumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;Ljava/lang/Object;)V, k74/x/IIIllIIII.IIll (Ljava/lang/Void;Ljava/lang/Throwable;)V, (Ljava/lang/Void;Ljava/lang/Throwable;)V ]
      // 34: invokevirtual java/util/concurrent/CompletableFuture.whenComplete (Ljava/util/function/BiConsumer;)Ljava/util/concurrent/CompletableFuture;
      // 37: pop
      // 38: return
   }

   static lIllIl IIl(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w -966409428
      // 003: istore 9
      // 005: aload 0
      // 006: ifnull 031
      // 009: aload 0
      // 00a: invokevirtual java/lang/String.isBlank ()Z
      // 00d: ifne 031
      // 010: goto 017
      // 013: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 016: athrow
      // 017: aload 0
      // 018: invokevirtual java/lang/String.length ()I
      // 01b: ldc_w 801332702
      // 01e: iload 9
      // 020: ldc_w 849248283
      // 023: ixor
      // 024: invokestatic k74/x/IIIllIIII.IIlII (II)I
      // 027: if_icmple 037
      // 02a: goto 031
      // 02d: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 030: athrow
      // 031: aconst_null
      // 032: areturn
      // 033: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 036: athrow
      // 037: aload 0
      // 038: invokestatic com/google/gson/JsonParser.parseString (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 03b: invokevirtual com/google/gson/JsonElement.getAsJsonObject ()Lcom/google/gson/JsonObject;
      // 03e: astore 1
      // 03f: aload 1
      // 040: getstatic k74/x/IIIllIIII.lII [Ljava/lang/String;
      // 043: ldc_w 801332703
      // 046: iload 9
      // 048: ldc_w 687416865
      // 04b: ixor
      // 04c: invokestatic k74/x/IIIllIIII.IIlII (II)I
      // 04f: aaload
      // 050: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 053: invokestatic k74/x/IIIllIIII.IIIlI (Lcom/google/gson/JsonObject;Ljava/lang/String;)Z
      // 056: istore 2
      // 057: iload 2
      // 058: ifne 05f
      // 05b: invokestatic k74/x/lIllIl.lI ()Lk74/x/lIllIl;
      // 05e: areturn
      // 05f: aload 1
      // 060: getstatic k74/x/IIIllIIII.lII [Ljava/lang/String;
      // 063: ldc_w 801332696
      // 066: iload 9
      // 068: ldc_w 1554554121
      // 06b: ixor
      // 06c: invokestatic k74/x/IIIllIIII.IIlII (II)I
      // 06f: aaload
      // 070: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 073: invokestatic k74/x/IIIllIIII.II (Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/lang/String;
      // 076: astore 3
      // 077: aload 1
      // 078: getstatic k74/x/IIIllIIII.lII [Ljava/lang/String;
      // 07b: ldc_w 801332697
      // 07e: iload 9
      // 080: ldc_w -768426522
      // 083: ixor
      // 084: invokestatic k74/x/IIIllIIII.IIlII (II)I
      // 087: aaload
      // 088: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 08b: invokestatic k74/x/IIIllIIII.II (Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/lang/String;
      // 08e: astore 4
      // 090: aload 1
      // 091: getstatic k74/x/IIIllIIII.lII [Ljava/lang/String;
      // 094: ldc_w 801332698
      // 097: iload 9
      // 099: ldc_w 1199249766
      // 09c: ixor
      // 09d: invokestatic k74/x/IIIllIIII.IIlII (II)I
      // 0a0: aaload
      // 0a1: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0a4: invokestatic k74/x/IIIllIIII.II (Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/lang/String;
      // 0a7: astore 5
      // 0a9: aload 3
      // 0aa: invokevirtual java/lang/String.isBlank ()Z
      // 0ad: ifne 0bf
      // 0b0: aload 4
      // 0b2: invokevirtual java/lang/String.isBlank ()Z
      // 0b5: ifeq 0c1
      // 0b8: goto 0bf
      // 0bb: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0be: athrow
      // 0bf: aconst_null
      // 0c0: areturn
      // 0c1: aconst_null
      // 0c2: astore 6
      // 0c4: aload 1
      // 0c5: getstatic k74/x/IIIllIIII.lII [Ljava/lang/String;
      // 0c8: ldc_w 801332699
      // 0cb: iload 9
      // 0cd: ldc_w -1347442271
      // 0d0: ixor
      // 0d1: invokestatic k74/x/IIIllIIII.IIlII (II)I
      // 0d4: aaload
      // 0d5: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0d8: invokestatic k74/x/IIIllIIII.II (Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/lang/String;
      // 0db: astore 7
      // 0dd: aload 7
      // 0df: invokevirtual java/lang/String.isBlank ()Z
      // 0e2: ifne 112
      // 0e5: aload 7
      // 0e7: invokevirtual java/lang/String.length ()I
      // 0ea: ldc_w 801332708
      // 0ed: iload 9
      // 0ef: ldc_w -1715660157
      // 0f2: ixor
      // 0f3: invokestatic k74/x/IIIllIIII.IIlII (II)I
      // 0f6: if_icmpgt 112
      // 0f9: goto 100
      // 0fc: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ff: athrow
      // 100: invokestatic java/util/Base64.getDecoder ()Ljava/util/Base64$Decoder;
      // 103: aload 7
      // 105: invokevirtual java/util/Base64$Decoder.decode (Ljava/lang/String;)[B
      // 108: astore 6
      // 10a: goto 112
      // 10d: astore 8
      // 10f: aconst_null
      // 110: astore 6
      // 112: new k74/x/lIllIl
      // 115: dup
      // 116: bipush 1
      // 117: aload 3
      // 118: aload 4
      // 11a: aload 5
      // 11c: aload 1
      // 11d: getstatic k74/x/IIIllIIII.lII [Ljava/lang/String;
      // 120: ldc_w 801332709
      // 123: iload 9
      // 125: ldc_w 64330727
      // 128: ixor
      // 129: invokestatic k74/x/IIIllIIII.IIlII (II)I
      // 12c: aaload
      // 12d: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 130: invokestatic k74/x/IIIllIIII.II (Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/lang/String;
      // 133: aload 1
      // 134: getstatic k74/x/IIIllIIII.lII [Ljava/lang/String;
      // 137: ldc_w 801332710
      // 13a: iload 9
      // 13c: ldc_w -1680227323
      // 13f: ixor
      // 140: invokestatic k74/x/IIIllIIII.IIlII (II)I
      // 143: aaload
      // 144: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 147: invokestatic k74/x/IIIllIIII.IIII (Lcom/google/gson/JsonObject;Ljava/lang/String;)J
      // 14a: aload 1
      // 14b: getstatic k74/x/IIIllIIII.lII [Ljava/lang/String;
      // 14e: ldc_w 801332711
      // 151: iload 9
      // 153: ldc_w -384022981
      // 156: ixor
      // 157: invokestatic k74/x/IIIllIIII.IIlII (II)I
      // 15a: aaload
      // 15b: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 15e: invokestatic k74/x/IIIllIIII.IIII (Lcom/google/gson/JsonObject;Ljava/lang/String;)J
      // 161: aload 1
      // 162: getstatic k74/x/IIIllIIII.lII [Ljava/lang/String;
      // 165: ldc_w 801332704
      // 168: iload 9
      // 16a: ldc_w -241748690
      // 16d: ixor
      // 16e: invokestatic k74/x/IIIllIIII.IIlII (II)I
      // 171: aaload
      // 172: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 175: invokestatic k74/x/IIIllIIII.IIIlI (Lcom/google/gson/JsonObject;Ljava/lang/String;)Z
      // 178: aload 6
      // 17a: invokespecial k74/x/lIllIl.<init> (ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZ[B)V
      // 17d: areturn
      // 17e: astore 1
      // 17f: aconst_null
      // 180: areturn
   }

   private boolean IlI(class_310 param1, byte[] param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: ldc_w -1165151832
      // 003: istore 7
      // 005: aload 1
      // 006: ifnull 03b
      // 009: aload 1
      // 00a: invokevirtual net/minecraft/class_310.method_1531 ()Lnet/minecraft/class_1060;
      // 00d: ifnull 03b
      // 010: goto 017
      // 013: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 016: athrow
      // 017: aload 2
      // 018: arraylength
      // 019: ifeq 03b
      // 01c: goto 023
      // 01f: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 022: athrow
      // 023: aload 2
      // 024: arraylength
      // 025: ldc_w 801332705
      // 028: iload 7
      // 02a: ldc_w -665175925
      // 02d: ixor
      // 02e: invokestatic k74/x/IIIllIIII.IIlII (II)I
      // 031: if_icmple 041
      // 034: goto 03b
      // 037: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03a: athrow
      // 03b: bipush 0
      // 03c: ireturn
      // 03d: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 040: athrow
      // 041: new java/io/ByteArrayInputStream
      // 044: dup
      // 045: aload 2
      // 046: invokespecial java/io/ByteArrayInputStream.<init> ([B)V
      // 049: astore 4
      // 04b: aload 4
      // 04d: invokestatic net/minecraft/class_1011.method_4309 (Ljava/io/InputStream;)Lnet/minecraft/class_1011;
      // 050: astore 3
      // 051: aload 4
      // 053: invokevirtual java/io/ByteArrayInputStream.close ()V
      // 056: goto 06f
      // 059: astore 5
      // 05b: aload 4
      // 05d: invokevirtual java/io/ByteArrayInputStream.close ()V
      // 060: goto 06c
      // 063: astore 6
      // 065: aload 5
      // 067: aload 6
      // 069: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 06c: aload 5
      // 06e: athrow
      // 06f: goto 076
      // 072: astore 4
      // 074: bipush 0
      // 075: ireturn
      // 076: aload 3
      // 077: ifnull 0e2
      // 07a: aload 3
      // 07b: invokevirtual net/minecraft/class_1011.method_4307 ()I
      // 07e: ldc_w 801332706
      // 081: iload 7
      // 083: ldc_w 1791511267
      // 086: ixor
      // 087: invokestatic k74/x/IIIllIIII.IIlII (II)I
      // 08a: if_icmplt 0e2
      // 08d: goto 094
      // 090: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 093: athrow
      // 094: aload 3
      // 095: invokevirtual net/minecraft/class_1011.method_4323 ()I
      // 098: ldc_w 801332707
      // 09b: iload 7
      // 09d: ldc_w -718783478
      // 0a0: ixor
      // 0a1: invokestatic k74/x/IIIllIIII.IIlII (II)I
      // 0a4: if_icmplt 0e2
      // 0a7: goto 0ae
      // 0aa: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ad: athrow
      // 0ae: aload 3
      // 0af: invokevirtual net/minecraft/class_1011.method_4307 ()I
      // 0b2: ldc_w 801332716
      // 0b5: iload 7
      // 0b7: ldc_w -2017389325
      // 0ba: ixor
      // 0bb: invokestatic k74/x/IIIllIIII.IIlII (II)I
      // 0be: if_icmpgt 0e2
      // 0c1: goto 0c8
      // 0c4: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c7: athrow
      // 0c8: aload 3
      // 0c9: invokevirtual net/minecraft/class_1011.method_4323 ()I
      // 0cc: ldc_w 801332717
      // 0cf: iload 7
      // 0d1: ldc_w 398505950
      // 0d4: ixor
      // 0d5: invokestatic k74/x/IIIllIIII.IIlII (II)I
      // 0d8: if_icmple 0fa
      // 0db: goto 0e2
      // 0de: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e1: athrow
      // 0e2: aload 3
      // 0e3: ifnull 0f8
      // 0e6: goto 0ed
      // 0e9: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ec: athrow
      // 0ed: aload 3
      // 0ee: invokevirtual net/minecraft/class_1011.close ()V
      // 0f1: goto 0f8
      // 0f4: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f7: athrow
      // 0f8: bipush 0
      // 0f9: ireturn
      // 0fa: aload 3
      // 0fb: invokestatic k74/x/IIIllIIII.IIlI (Lnet/minecraft/class_1011;)V
      // 0fe: aload 0
      // 0ff: getfield k74/x/IIIllIIII.lI Z
      // 102: ifeq 116
      // 105: aload 1
      // 106: invokevirtual net/minecraft/class_310.method_1531 ()Lnet/minecraft/class_1060;
      // 109: getstatic k74/x/IIIllIIII.IIl Lnet/minecraft/class_2960;
      // 10c: invokevirtual net/minecraft/class_1060.method_4615 (Lnet/minecraft/class_2960;)V
      // 10f: goto 116
      // 112: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 115: athrow
      // 116: aload 1
      // 117: invokevirtual net/minecraft/class_310.method_1531 ()Lnet/minecraft/class_1060;
      // 11a: getstatic k74/x/IIIllIIII.IIl Lnet/minecraft/class_2960;
      // 11d: new net/minecraft/class_1043
      // 120: dup
      // 121: getstatic k74/x/IIIllIIII.IIl Lnet/minecraft/class_2960;
      // 124: dup
      // 125: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 128: pop
      // 129: invokedynamic get (Lnet/minecraft/class_2960;)Ljava/util/function/Supplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, net/minecraft/class_2960.toString ()Ljava/lang/String;, ()Ljava/lang/String; ]
      // 12e: aload 3
      // 12f: invokespecial net/minecraft/class_1043.<init> (Ljava/util/function/Supplier;Lnet/minecraft/class_1011;)V
      // 132: invokevirtual net/minecraft/class_1060.method_4616 (Lnet/minecraft/class_2960;Lnet/minecraft/class_1044;)V
      // 135: aload 0
      // 136: bipush 1
      // 137: putfield k74/x/IIIllIIII.lI Z
      // 13a: bipush 1
      // 13b: ireturn
   }

   IlIIlIIl Ill() {
      return this.IIII;
   }

   private static String lII(String var0) {
      try {
         if (var0 == null) {
            return lII[IIlII(801332718, 399141333 ^ 392448008)];
         }
      } catch (IllegalArgumentException var1) {
         throw llII(var1);
      }

      return var0.strip();
   }

   private static IIIlII lIl(Throwable var0) {
      return IIIlII.III;
   }

   private static IIIlII llI(Throwable var0) {
      return IIIlII.III;
   }

   private static String lll(char[] var0, long var1, int var3) {
      int var4 = IIlII(801332719, 676804840 ^ 568097187) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & IIlII(801332712, 676804840 ^ 221369071);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private static long IIII(JsonObject param0, String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 05: astore 2
      // 06: aload 2
      // 07: ifnull 18
      // 0a: aload 2
      // 0b: invokevirtual com/google/gson/JsonElement.isJsonNull ()Z
      // 0e: ifeq 1e
      // 11: goto 18
      // 14: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: lconst_0
      // 19: lreturn
      // 1a: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: aload 2
      // 1f: invokevirtual com/google/gson/JsonElement.getAsLong ()J
      // 22: lreturn
      // 23: astore 3
      // 24: lconst_0
      // 25: lreturn
   }

   private void IIIl(String var1, IIIlII var2) {
      Map var10000;
      String var10001;
      IIIlII var10002;
      label16: {
         try {
            var10000 = this.IIlI;
            var10001 = var1;
            if (var2 == null) {
               var10002 = IIIlII.III;
               break label16;
            }
         } catch (IllegalArgumentException var3) {
            throw llII(var3);
         }

         var10002 = var2;
      }

      var10000.put(var10001, var10002);
   }

   private static void IIlI(class_1011 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual net/minecraft/class_1011.method_4307 ()I
      // 04: istore 2
      // 05: aload 0
      // 06: invokevirtual net/minecraft/class_1011.method_4323 ()I
      // 09: istore 3
      // 0a: ldc2_w 2.0
      // 0d: iload 2
      // 0e: iload 3
      // 0f: invokestatic java/lang/Math.min (II)I
      // 12: i2d
      // 13: ldc2_w 0.105
      // 16: dmul
      // 17: invokestatic java/lang/Math.max (DD)D
      // 1a: dstore 4
      // 1c: invokestatic k74/x/IIllllIl.IIIIl ()[Ljava/lang/String;
      // 1f: bipush 0
      // 20: istore 6
      // 22: astore 1
      // 23: iload 6
      // 25: iload 3
      // 26: if_icmpge cf
      // 29: bipush 0
      // 2a: istore 7
      // 2c: iload 7
      // 2e: iload 2
      // 2f: if_icmpge c8
      // 32: iload 7
      // 34: i2d
      // 35: ldc2_w 0.5
      // 38: dadd
      // 39: iload 2
      // 3a: iload 7
      // 3c: isub
      // 3d: i2d
      // 3e: ldc2_w 0.5
      // 41: dsub
      // 42: invokestatic java/lang/Math.min (DD)D
      // 45: dstore 8
      // 47: iload 6
      // 49: i2d
      // 4a: ldc2_w 0.5
      // 4d: dadd
      // 4e: iload 3
      // 4f: iload 6
      // 51: isub
      // 52: i2d
      // 53: ldc2_w 0.5
      // 56: dsub
      // 57: invokestatic java/lang/Math.min (DD)D
      // 5a: dstore 10
      // 5c: dload 8
      // 5e: dload 4
      // 60: dcmpl
      // 61: ifge c1
      // 64: dload 10
      // 66: dload 4
      // 68: dcmpl
      // 69: iflt 7a
      // 6c: goto 73
      // 6f: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 72: athrow
      // 73: goto c1
      // 76: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 79: athrow
      // 7a: dload 4
      // 7c: dload 8
      // 7e: dsub
      // 7f: dstore 12
      // 81: dload 4
      // 83: dload 10
      // 85: dsub
      // 86: dstore 14
      // 88: dload 12
      // 8a: dload 12
      // 8c: dmul
      // 8d: dload 14
      // 8f: dload 14
      // 91: dmul
      // 92: dadd
      // 93: dload 4
      // 95: dload 4
      // 97: dmul
      // 98: dcmpl
      // 99: ifle c1
      // 9c: aload 0
      // 9d: iload 7
      // 9f: iload 6
      // a1: aload 0
      // a2: iload 7
      // a4: iload 6
      // a6: invokevirtual net/minecraft/class_1011.method_61940 (II)I
      // a9: ldc_w 801332713
      // ac: ldc_w 323785941
      // af: ldc_w -1846493775
      // b2: ixor
      // b3: invokestatic k74/x/IIIllIIII.IIlII (II)I
      // b6: iand
      // b7: invokevirtual net/minecraft/class_1011.method_61941 (III)V
      // ba: goto c1
      // bd: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c0: athrow
      // c1: iinc 7 1
      // c4: aload 1
      // c5: ifnull 2c
      // c8: iinc 6 1
      // cb: aload 1
      // cc: ifnull 23
      // cf: return
   }

   private void IIll(Void var1, Throwable var2) {
      this.III = false;
   }

   private Path IlII() throws IOException {
      int var6 = -465978192;
      Path var1 = Path.of(
         System.getProperty(IlIIllIII.lI(lII[IIlII(801332714, var6 ^ -1850967705)]), IlIIllIII.lI(lII[IIlII(801332715, var6 ^ -1713745448)])),
         IlIIllIII.lI(lII[IIlII(801332724, var6 ^ -1236478747)])
      );
      Files.createDirectories(var1);
      Path var2 = var1.resolve(IlIIllIII.lI(lII[IIlII(801332725, var6 ^ 1270670532)]));

      try (InputStream var3 = IIIllIIII.class.getResourceAsStream(IlIIllIII.lI(lII[IIlII(801332726, var6 ^ -171546858)]))) {
         try {
            if (var3 == null) {
               throw new IOException(IlIIllIII.lI(lII[IIlII(801332727, var6 ^ -185118147)]));
            }
         } catch (Throwable var8) {
            throw llII(var8);
         }

         Files.copy(var3, var2, StandardCopyOption.REPLACE_EXISTING);
      }

      return var2;
   }

   IIIllIIII() {
      this.IIII = IlIIlIIl.lII();
      this.IIIl = true;
      this.ll = lII[IIlII(801332721, -2091625139 ^ 1000149718)];
   }

   private void IlIl(IlIIlIIl var1, IIIlII var2) {
      this.IIIl(var1.IlI(), var2);
      IlIIlIIl var3 = this.IIII;

      try {
         if (var3.IlI().equals(var1.IlI())) {
            this.IIII = var3.lIl(var2);
         }
      } catch (IllegalArgumentException var4) {
         throw llII(var4);
      }
   }

   private static CompletableFuture<IIIlII> IllI(URI var0, boolean var1) {
      HttpRequest var2 = HttpRequest.newBuilder(var0)
         .timeout(Duration.ofSeconds(8L))
         .header(IlIIllIII.lI(lII[IIlII(801332722, 1044618878 ^ 1781980677)]), IlIIllIII.lI(lII[IIlII(801332723, 1044618878 ^ -462845217)]))
         .GET()
         .build();
      return I.sendAsync(var2, BodyHandlers.ofString(StandardCharsets.UTF_8)).thenApply(IIIllIIII::lI).exceptionally(IIIllIIII::lIl);
   }

   private static String Illl(String var0) {
      try {
         if (var0 == null) {
            return URLEncoder.encode(lII[IIlII(801332732, 1637700056 ^ -1048561848)], StandardCharsets.UTF_8);
         }
      } catch (IllegalArgumentException var1) {
         throw llII(var1);
      }

      return URLEncoder.encode(var0, StandardCharsets.UTF_8);
   }

   private static CompletionStage lIII(IlIIlIIl var0, IIIlII var1) {
      try {
         if (!var1.IlI()) {
            return CompletableFuture.completedFuture(var1);
         }
      } catch (IllegalArgumentException var7) {
         throw llII(var7);
      }

      String var10000 = IlIIllIII.lI(lII[IIlII(801332733, -962721021 ^ 552257375)]);
      String var10001 = Illl(var0.IIIl());
      String var10002 = IlIIllIII.lI(lII[IIlII(801332734, -962721021 ^ 1111108079)]);
      String var6 = Illl(var0.II());
      String var5 = var10002;
      String var4 = var10001;
      String var3 = var10000;
      URI var2 = URI.create(var3 + var4 + var5 + var6);
      return IllI(var2, true);
   }

   void lIIl(boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: iload 1
      // 02: putfield k74/x/IIIllIIII.IIIl Z
      // 05: aload 0
      // 06: getfield k74/x/IIIllIIII.IIII Lk74/x/IlIIlIIl;
      // 09: astore 2
      // 0a: iload 1
      // 0b: ifeq 3c
      // 0e: aload 2
      // 0f: invokevirtual k74/x/IlIIlIIl.Ill ()Z
      // 12: ifeq 3c
      // 15: goto 1c
      // 18: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b: athrow
      // 1c: aload 2
      // 1d: invokevirtual k74/x/IlIIlIIl.IIl ()Lk74/x/IIIlII;
      // 20: invokevirtual k74/x/IIIlII.IlI ()Z
      // 23: ifeq 3c
      // 26: goto 2d
      // 29: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c: athrow
      // 2d: aload 0
      // 2e: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 31: aload 2
      // 32: invokevirtual k74/x/IIIllIIII.lIll (Lnet/minecraft/class_310;Lk74/x/IlIIlIIl;)V
      // 35: goto 3c
      // 38: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b: athrow
      // 3c: return
   }

   private void lIlI(class_310 var1) {
      this.Il(var1);
   }

   private void lIll(class_310 param1, IlIIlIIl param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/IIIllIIII.IIIl Z
      // 04: ifeq 35
      // 07: aload 1
      // 08: ifnull 35
      // 0b: goto 12
      // 0e: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11: athrow
      // 12: aload 2
      // 13: invokevirtual k74/x/IlIIlIIl.Ill ()Z
      // 16: ifeq 35
      // 19: goto 20
      // 1c: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: aload 2
      // 21: invokevirtual k74/x/IlIIlIIl.IlI ()Ljava/lang/String;
      // 24: aload 0
      // 25: getfield k74/x/IIIllIIII.ll Ljava/lang/String;
      // 28: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2b: ifeq 3a
      // 2e: goto 35
      // 31: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 34: athrow
      // 35: return
      // 36: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39: athrow
      // 3a: aload 0
      // 3b: getfield k74/x/IIIllIIII.IIlI Ljava/util/Map;
      // 3e: aload 2
      // 3f: invokevirtual k74/x/IlIIlIIl.IlI ()Ljava/lang/String;
      // 42: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 47: checkcast k74/x/IIIlII
      // 4a: astore 3
      // 4b: aload 3
      // 4c: ifnull 5d
      // 4f: aload 0
      // 50: aload 2
      // 51: aload 3
      // 52: invokevirtual k74/x/IlIIlIIl.lIl (Lk74/x/IIIlII;)Lk74/x/IlIIlIIl;
      // 55: putfield k74/x/IIIllIIII.IIII Lk74/x/IlIIlIIl;
      // 58: return
      // 59: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5c: athrow
      // 5d: aload 0
      // 5e: aload 2
      // 5f: invokevirtual k74/x/IlIIlIIl.IlI ()Ljava/lang/String;
      // 62: putfield k74/x/IIIllIIII.ll Ljava/lang/String;
      // 65: aload 0
      // 66: aload 2
      // 67: invokestatic k74/x/IIIllIIII.IIIll (Lk74/x/IlIIlIIl;)Ljava/util/concurrent/CompletableFuture;
      // 6a: invokedynamic apply ()Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, k74/x/IIIllIIII.llI (Ljava/lang/Throwable;)Lk74/x/IIIlII;, (Ljava/lang/Throwable;)Lk74/x/IIIlII; ]
      // 6f: invokevirtual java/util/concurrent/CompletableFuture.exceptionally (Ljava/util/function/Function;)Ljava/util/concurrent/CompletableFuture;
      // 72: aload 0
      // 73: aload 1
      // 74: aload 2
      // 75: invokedynamic accept (Lk74/x/IIIllIIII;Lnet/minecraft/class_310;Lk74/x/IlIIlIIl;)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, k74/x/IIIllIIII.lllI (Lnet/minecraft/class_310;Lk74/x/IlIIlIIl;Lk74/x/IIIlII;)V, (Lk74/x/IIIlII;)V ]
      // 7a: invokevirtual java/util/concurrent/CompletableFuture.thenAccept (Ljava/util/function/Consumer;)Ljava/util/concurrent/CompletableFuture;
      // 7d: putfield k74/x/IIIllIIII.lll Ljava/util/concurrent/CompletableFuture;
      // 80: return
   }

   private static Throwable llII(Throwable var0) {
      return var0;
   }

   private static void llIl() {
      int var0 = 17334717;
      lII[0] = lll(IIIIl(IIlII(801332735, var0 ^ 1834810530), IIlII(801332728, var0 ^ -951527847)).toCharArray(), 42194L, IIlII(801332729, var0 ^ -606483884));
      lII[1] = lll(IIIIl(IIlII(801332730, var0 ^ 43158881), IIlII(801332731, var0 ^ 543030032)).toCharArray(), 86283L, IIlII(801332612, var0 ^ 250162045));
      lII[2] = lll(IIIIl(IIlII(801332613, var0 ^ 1405755841), IIlII(801332614, var0 ^ -2107117513)).toCharArray(), 96494L, IIlII(801332615, var0 ^ -1806574818));
      lII[3] = lll(IIIIl(IIlII(801332608, var0 ^ 339405389), IIlII(801332609, var0 ^ 574734499)).toCharArray(), 5020L, IIlII(801332610, var0 ^ -1005276229));
      lII[4] = lll(IIIIl(IIlII(801332611, var0 ^ -107643889), IIlII(801332620, var0 ^ 296335956)).toCharArray(), 32360L, IIlII(801332621, var0 ^ -1016491966));
      lII[5] = lll(IIIIl(IIlII(801332622, var0 ^ -207429431), IIlII(801332623, var0 ^ 1165381654)).toCharArray(), 66387L, IIlII(801332616, var0 ^ 573893173));
      lII[IIlII(801332617, var0 ^ 408509850)] = lll(
         IIIIl(IIlII(801332618, var0 ^ -1692173530), IIlII(801332619, var0 ^ 788132067)).toCharArray(), 47885L, IIlII(801332628, var0 ^ -197697471)
      );
      lII[IIlII(801332629, var0 ^ -1810657027)] = lll(
         IIIIl(IIlII(801332630, var0 ^ -1132549296), IIlII(801332631, var0 ^ 2092629434)).toCharArray(), 62833L, IIlII(801332624, var0 ^ -632866086)
      );
      lII[IIlII(801332625, var0 ^ -1614561461)] = lll(
         IIIIl(IIlII(801332626, var0 ^ 962689316), IIlII(801332627, var0 ^ 2114955094)).toCharArray(), 31679L, IIlII(801332636, var0 ^ 1247766118)
      );
      lII[IIlII(801332637, var0 ^ 1493710294)] = lll(
         IIIIl(IIlII(801332638, var0 ^ 252804848), IIlII(801332639, var0 ^ 1670130524)).toCharArray(), 87196L, IIlII(801332632, var0 ^ -1596696205)
      );
      lII[IIlII(801332633, var0 ^ 413588861)] = lll(
         IIIIl(IIlII(801332634, var0 ^ 532774205), IIlII(801332635, var0 ^ -1009930534)).toCharArray(), 5570L, IIlII(801332644, var0 ^ 1140027988)
      );
      lII[IIlII(801332645, var0 ^ -1410694903)] = lll(
         IIIIl(IIlII(801332646, var0 ^ 88126921), IIlII(801332647, var0 ^ -1432610430)).toCharArray(), 98445L, IIlII(801332640, var0 ^ -1308507753)
      );
      lII[IIlII(801332641, var0 ^ 850631278)] = lll(
         IIIIl(IIlII(801332642, var0 ^ 172688926), IIlII(801332643, var0 ^ -614208104)).toCharArray(), 98876L, IIlII(801332652, var0 ^ 768576120)
      );
      lII[IIlII(801332653, var0 ^ 1503341264)] = lll(
         IIIIl(IIlII(801332654, var0 ^ -1345750867), IIlII(801332655, var0 ^ 1962484022)).toCharArray(), 35843L, IIlII(801332648, var0 ^ -429070154)
      );
      lII[IIlII(801332649, var0 ^ 326667913)] = lll(
         IIIIl(IIlII(801332650, var0 ^ 307692811), IIlII(801332651, var0 ^ -141360676)).toCharArray(), 20688L, IIlII(801332660, var0 ^ 940102485)
      );
      lII[IIlII(801332661, var0 ^ 1409889143)] = lll(
         IIIIl(IIlII(801332662, var0 ^ -629059323), IIlII(801332663, var0 ^ -752122212)).toCharArray(), 98415L, IIlII(801332656, var0 ^ -875681767)
      );
      lII[IIlII(801332657, var0 ^ 293195002)] = lll(
         IIIIl(IIlII(801332658, var0 ^ 724673519), IIlII(801332659, var0 ^ 444381664)).toCharArray(), 58574L, IIlII(801332668, var0 ^ -1404507064)
      );
      lII[IIlII(801332669, var0 ^ 625084341)] = lll(
         IIIIl(IIlII(801332670, var0 ^ 1025343949), IIlII(801332671, var0 ^ 1913567428)).toCharArray(), 8211L, IIlII(801332664, var0 ^ -284822024)
      );
      lII[IIlII(801332665, var0 ^ 1895175666)] = lll(
         IIIIl(IIlII(801332666, var0 ^ 481817728), IIlII(801332667, var0 ^ -935532218)).toCharArray(), 89819L, IIlII(801332548, var0 ^ 60208711)
      );
      lII[IIlII(801332549, var0 ^ 2131433083)] = lll(
         IIIIl(IIlII(801332550, var0 ^ 1114473210), IIlII(801332551, var0 ^ -1733060212)).toCharArray(), 85545L, IIlII(801332544, var0 ^ 326621333)
      );
      lII[IIlII(801332545, var0 ^ 1938658195)] = lll("".toCharArray(), 80320L, IIlII(801332546, var0 ^ 1203297434));
      lII[IIlII(801332547, var0 ^ -1872354466)] = lll(
         IIIIl(IIlII(801332556, var0 ^ -1272637533), IIlII(801332557, var0 ^ -425602037)).toCharArray(), 51160L, IIlII(801332558, var0 ^ 236108821)
      );
      lII[IIlII(801332559, var0 ^ -1614452499)] = lll(
         IIIIl(IIlII(801332552, var0 ^ 1453556602), IIlII(801332553, var0 ^ -2127623207)).toCharArray(), 92243L, IIlII(801332554, var0 ^ -104492055)
      );
      lII[IIlII(801332555, var0 ^ -1523018767)] = lll(
         IIIIl(IIlII(801332564, var0 ^ 244688880), IIlII(801332565, var0 ^ 714903035)).toCharArray(), 59255L, IIlII(801332566, var0 ^ 252205374)
      );
      lII[IIlII(801332567, var0 ^ 525681242)] = lll(
         IIIIl(IIlII(801332560, var0 ^ -2052124719), IIlII(801332561, var0 ^ 1152100281)).toCharArray(), 64386L, IIlII(801332562, var0 ^ 1199472778)
      );
      lII[IIlII(801332563, var0 ^ -1390189672)] = lll(
         IIIIl(IIlII(801332572, var0 ^ -320726006), IIlII(801332573, var0 ^ -1937818454)).toCharArray(), 21567L, IIlII(801332574, var0 ^ 1039853313)
      );
      lII[IIlII(801332575, var0 ^ -1110113697)] = lll(
         IIIIl(IIlII(801332568, var0 ^ -1863903703), IIlII(801332569, var0 ^ -1925498936)).toCharArray(), 92492L, IIlII(801332570, var0 ^ 483345461)
      );
      lII[IIlII(801332571, var0 ^ 1470891911)] = lll(
         IIIIl(IIlII(801332580, var0 ^ 912375398), IIlII(801332581, var0 ^ -1729128850)).toCharArray(), 69282L, IIlII(801332582, var0 ^ 1213979276)
      );
      lII[IIlII(801332583, var0 ^ 654173158)] = lll(
         IIIIl(IIlII(801332576, var0 ^ -1043489222), IIlII(801332577, var0 ^ -210159722)).toCharArray(), 32822L, IIlII(801332578, var0 ^ 318199856)
      );
      lII[IIlII(801332579, var0 ^ -756311994)] = lll(
         IIIIl(IIlII(801332588, var0 ^ 917231431), IIlII(801332589, var0 ^ -441805474)).toCharArray(), 20781L, IIlII(801332590, var0 ^ 164193678)
      );
      lII[IIlII(801332591, var0 ^ -1895993238)] = lll(
         IIIIl(IIlII(801332584, var0 ^ 1051066294), IIlII(801332585, var0 ^ -1392367279)).toCharArray(), 97011L, IIlII(801332586, var0 ^ 2144739999)
      );
      lII[IIlII(801332587, var0 ^ -1814545176)] = lll(
         IIIIl(IIlII(801332596, var0 ^ -940468504), IIlII(801332597, var0 ^ -1132303183)).toCharArray(), 4799L, IIlII(801332598, var0 ^ 1309028558)
      );
      lII[IIlII(801332599, var0 ^ 14095586)] = lll(
         IIIIl(IIlII(801332592, var0 ^ 426282731), IIlII(801332593, var0 ^ -787464272)).toCharArray(), 22509L, IIlII(801332594, var0 ^ -646143595)
      );
      lII[IIlII(801332595, var0 ^ -367289827)] = lll(
         IIIIl(IIlII(801332604, var0 ^ 1947235719), IIlII(801332605, var0 ^ 393242901)).toCharArray(), 75357L, IIlII(801332606, var0 ^ -1802693138)
      );
      lII[IIlII(801332607, var0 ^ 625381391)] = lll(
         IIIIl(IIlII(801332600, var0 ^ -438339484), IIlII(801332601, var0 ^ -1788384692)).toCharArray(), 23927L, IIlII(801332602, var0 ^ 633139139)
      );
   }

   private void lllI(class_310 var1, IlIIlIIl var2, IIIlII var3) {
      var1.execute(this::IlIl);
   }

   private void llll(class_310 param1, lIllIl param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic k74/x/IIllllIl.IIIIl ()[Ljava/lang/String;
      // 03: astore 3
      // 04: aload 0
      // 05: getfield k74/x/IIIllIIII.II Z
      // 08: ifne 10
      // 0b: return
      // 0c: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f: athrow
      // 10: aload 2
      // 11: invokevirtual k74/x/lIllIl.II ()Z
      // 14: ifne 23
      // 17: aload 0
      // 18: invokestatic k74/x/IlIIlIIl.lII ()Lk74/x/IlIIlIIl;
      // 1b: putfield k74/x/IIIllIIII.IIII Lk74/x/IlIIlIIl;
      // 1e: return
      // 1f: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22: athrow
      // 23: aload 0
      // 24: getfield k74/x/IIIllIIII.lI Z
      // 27: ifeq 34
      // 2a: getstatic k74/x/IIIllIIII.IIl Lnet/minecraft/class_2960;
      // 2d: goto 35
      // 30: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 33: athrow
      // 34: aconst_null
      // 35: astore 4
      // 37: aload 2
      // 38: invokevirtual k74/x/lIllIl.Ill ()[B
      // 3b: ifnull 5a
      // 3e: aload 0
      // 3f: aload 1
      // 40: aload 2
      // 41: invokevirtual k74/x/lIllIl.Ill ()[B
      // 44: invokevirtual k74/x/IIIllIIII.IlI (Lnet/minecraft/class_310;[B)Z
      // 47: ifeq 75
      // 4a: goto 51
      // 4d: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 50: athrow
      // 51: getstatic k74/x/IIIllIIII.IIl Lnet/minecraft/class_2960;
      // 54: astore 4
      // 56: aload 3
      // 57: ifnull 75
      // 5a: aload 2
      // 5b: invokevirtual k74/x/lIllIl.III ()Ljava/lang/String;
      // 5e: aload 0
      // 5f: getfield k74/x/IIIllIIII.IIII Lk74/x/IlIIlIIl;
      // 62: invokevirtual k74/x/IlIIlIIl.IlI ()Ljava/lang/String;
      // 65: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 68: ifne 75
      // 6b: goto 72
      // 6e: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 71: athrow
      // 72: aconst_null
      // 73: astore 4
      // 75: aload 0
      // 76: getfield k74/x/IIIllIIII.IIlI Ljava/util/Map;
      // 79: aload 2
      // 7a: invokevirtual k74/x/lIllIl.III ()Ljava/lang/String;
      // 7d: getstatic k74/x/IIIlII.III Lk74/x/IIIlII;
      // 80: invokeinterface java/util/Map.getOrDefault (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 85: checkcast k74/x/IIIlII
      // 88: astore 5
      // 8a: new k74/x/IlIIlIIl
      // 8d: dup
      // 8e: bipush 1
      // 8f: aload 2
      // 90: invokevirtual k74/x/lIllIl.III ()Ljava/lang/String;
      // 93: aload 2
      // 94: invokevirtual k74/x/lIllIl.IIl ()Ljava/lang/String;
      // 97: invokestatic k74/x/IIIllIIII.lII (Ljava/lang/String;)Ljava/lang/String;
      // 9a: aload 2
      // 9b: invokevirtual k74/x/lIllIl.lII ()Ljava/lang/String;
      // 9e: invokestatic k74/x/IIIllIIII.lII (Ljava/lang/String;)Ljava/lang/String;
      // a1: aload 2
      // a2: invokevirtual k74/x/lIllIl.Il ()Ljava/lang/String;
      // a5: invokestatic k74/x/IIIllIIII.lII (Ljava/lang/String;)Ljava/lang/String;
      // a8: lconst_0
      // a9: aload 2
      // aa: invokevirtual k74/x/lIllIl.lIl ()J
      // ad: invokestatic java/lang/Math.max (JJ)J
      // b0: lconst_0
      // b1: aload 2
      // b2: invokevirtual k74/x/lIllIl.l ()J
      // b5: invokestatic java/lang/Math.max (JJ)J
      // b8: aload 2
      // b9: invokevirtual k74/x/lIllIl.I ()Z
      // bc: invokestatic java/lang/System.currentTimeMillis ()J
      // bf: aload 4
      // c1: aload 5
      // c3: invokespecial k74/x/IlIIlIIl.<init> (ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZJLnet/minecraft/class_2960;Lk74/x/IIIlII;)V
      // c6: astore 6
      // c8: aload 0
      // c9: aload 6
      // cb: putfield k74/x/IIIllIIII.IIII Lk74/x/IlIIlIIl;
      // ce: aload 0
      // cf: getfield k74/x/IIIllIIII.IIIl Z
      // d2: ifeq f2
      // d5: aload 5
      // d7: invokevirtual k74/x/IIIlII.IlI ()Z
      // da: ifeq f2
      // dd: goto e4
      // e0: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // e3: athrow
      // e4: aload 0
      // e5: aload 1
      // e6: aload 6
      // e8: invokevirtual k74/x/IIIllIIII.lIll (Lnet/minecraft/class_310;Lk74/x/IlIIlIIl;)V
      // eb: goto f2
      // ee: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // f1: athrow
      // f2: return
   }

   private void IIIII(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/IIIllIIII.lI Z
      // 04: ifeq 2b
      // 07: aload 1
      // 08: invokevirtual net/minecraft/class_310.method_1531 ()Lnet/minecraft/class_1060;
      // 0b: ifnull 2b
      // 0e: goto 15
      // 11: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: aload 1
      // 16: invokevirtual net/minecraft/class_310.method_1531 ()Lnet/minecraft/class_1060;
      // 19: getstatic k74/x/IIIllIIII.IIl Lnet/minecraft/class_2960;
      // 1c: invokevirtual net/minecraft/class_1060.method_4615 (Lnet/minecraft/class_2960;)V
      // 1f: aload 0
      // 20: bipush 0
      // 21: putfield k74/x/IIIllIIII.lI Z
      // 24: goto 2b
      // 27: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: return
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = 1160506268;
      int var16 = 0;
      String[] var15 = new String[2];
      int var17 = 0;
      int var14 = "ʣ캷빤鈒㸔⡽䷥ḟ≕\uf7b9硱ꮋ痱먞\udd3c韉窀㤲\uea62鎚鳗턙Ⲧ䯜ℐꎍ⯕퇀鰳宫瀶瀡匚㫝갰嵯硴䩹ↄ\ue36cႣ팧漖膲\u135c勽ⷶ햭ᰢ\ude6b駄ꦞﾾნ緇蝄軈種\ue0d3\ueb5f뾉颒䁻폫\ue4ddǩ䡒둘ܥ壪윟擶┓鉀貺䴠\u208f۳ꢮ癱曏拱\uee98叫秉✉뛿᷽櫖留찔㦧\ue9caᔀ耋醓\u1c8e頧咃龳䰼\uec23쐺夳琯옼溬壚⼡띙ꏆ都坏\uf3c7ㄞœ缸➆䜃뇨ᭀ쇂\uee01ဍ䳠ጼ쬦⻁镃耣⤏ꔛ㳬㕺磊\uf20f쿎∡౨㈕拳䞚۳蟬\u0fde汈韣ᨌ貀㏚ﭯ꼯䱨\ue132㈔寏猚韸\uea85쵐\uef0f㷟囈礈簠ⶊ绫宨\ue21d蛻峭亥悶瞳ઇȇ䡝鼢賆ꛚ䱾\ue87e冂줳鋉\udf77퓢ㆿ\uf340騧柄㱅䎎먄\udec3솘퉿玼쩑\ue531ᦪ啔ﴵ掽\udba2Dꙕ㶂\uf8d7腌ᣪ瓺\uec9c㾃މڐꎓᇆ\udf9a⚾\ua637ঢ়倇s襳揤ᨹഄ곌\ue778\uf64aᏠ葧댲\ue413㨾ዜ㻳굒롪埣낍ǖ\udc81癥躍뜍㬡푺⪬⳺獛洭桕၇꣐ࡡ軗\ue31a㵿釣怇臱뢦ⱝ愡쀠\uf041ೊ憴ꈹと㒍\udc9c緬㡽泒᧧\udc45凔\u31ec\udb51뗯咶휪⥉趇袢ꜟ溹鳂ﳜ憕\ue9e0顯闖⊱㮂ꪙꨔ¯\u1af5ҵፍ\ua4ca蟵\ue97cꁧ갎闣\u008a烦㞷輜굴奜鑅㝢挵ⶕ굆䦄曎᧧◝Ꮺ碼烽\u0fdd挴ﵳ曃㌠㦼干嗴鵮唡덳\u0bdd텂왧䲶矿㲼\ue75e߾靲場왭⟕\ue0c4\ue0fd\ue2f7\u2eff֢\uef6fꔫꂦ\u0b7bꞛ㖖삸㾫깙㢧遼簾螠㠡\uf041\u09d2埾姯벜䟓\ue47d揌趢֟첄㪇믋굓墩씵⊑ᨻꩦ諥覇嗓찔题帹⃜엯\ufb1b᷁Ꭹ䎻ᑟ前죅礂㸃싐濰쏋鲽掿홓ꐘ廉㸵ꪸ墦\udccdන\uf01b\uda80犐\uf275稹뭍턄\u1f58龳䶓Έ㜸炧\udcc6툕\u0c53縯㱷鮛琢ꅟ䜹䱘✌㠽덬져议婝ꨀ⌹紌喊ಳ湁僓-쭡湋䖕ꆢ䓩涔\uecb3圳愱ឈ݈쮠쬎奜즻釦Т햇᷎랄愳㽉꺑肻朷ⱶᦂ탦䁀ㆷ깡젼┦䚪豟㮆븵嚤⥧\ud8f0䫋ꊆ嶬㱽㿯\ud884\uec06፣ꤤࡡ䣑뫟傆槠婉嫈䳍\ue062Ɲ\u0e6f㺘ᕔ婀嵺\ueb2f驟ꕋ堄漕䰫\ue3cd飐\ue8d5㱑\udbd3ᴧ㬕媇䤡\uf505塱\uf34b퉽筲㹶㭛⦣ᛠ℣쓫뉔⬵垿\u0a5f\uf4d2榐⤽⥔饐횾莑풝᭫櫮库蕂讍摿풍ﭷ\u1776闐榐㵕甙쉲\ue5c8畹\ue380粆㡫恭哶긤냮潿\ue895ᩬᆞ絡賥핱⾋㔌ᄃꨗ\u09d6ᩗ湚ﳀ썦붎ጳﻩ\ue083㘐曺㤡剄藚ﺝ销解뀨哫瘟\uf8c7繙廩褕엙芄骏쮔\ue327欆弸빾\ud84f뉒쭫ꟼ왗熏酘\u0bdc삁ꌖ樜퀩첸┢䱱琁쀱⡴珣乬뭽㦱 뢼曠ᡊ喰\ue521䝅⩓ೊ행ᤳ걺壠㳁仾厠￦\uef1b첤貛五邃ձ퐳謚\uda06ꍑ슥\uf604\uf5fa%\ude62뇛㣾딓\ue38cි뇃ﾵ㻊謁\ue71b쌡\udbc7芢覌肬鑗\uf5ceꇍ䙺嶁蜟쌌涉灦ꩡ셥﨤ၳ玚뾲啲\udecf\ud85dṧ\ue43e喵"
         .length();
      String var13 = "ʣ캷빤鈒㸔⡽䷥ḟ≕\uf7b9硱ꮋ痱먞\udd3c韉窀㤲\uea62鎚鳗턙Ⲧ䯜ℐꎍ⯕퇀鰳宫瀶瀡匚㫝갰嵯硴䩹ↄ\ue36cႣ팧漖膲\u135c勽ⷶ햭ᰢ\ude6b駄ꦞﾾნ緇蝄軈種\ue0d3\ueb5f뾉颒䁻폫\ue4ddǩ䡒둘ܥ壪윟擶┓鉀貺䴠\u208f۳ꢮ癱曏拱\uee98叫秉✉뛿᷽櫖留찔㦧\ue9caᔀ耋醓\u1c8e頧咃龳䰼\uec23쐺夳琯옼溬壚⼡띙ꏆ都坏\uf3c7ㄞœ缸➆䜃뇨ᭀ쇂\uee01ဍ䳠ጼ쬦⻁镃耣⤏ꔛ㳬㕺磊\uf20f쿎∡౨㈕拳䞚۳蟬\u0fde汈韣ᨌ貀㏚ﭯ꼯䱨\ue132㈔寏猚韸\uea85쵐\uef0f㷟囈礈簠ⶊ绫宨\ue21d蛻峭亥悶瞳ઇȇ䡝鼢賆ꛚ䱾\ue87e冂줳鋉\udf77퓢ㆿ\uf340騧柄㱅䎎먄\udec3솘퉿玼쩑\ue531ᦪ啔ﴵ掽\udba2Dꙕ㶂\uf8d7腌ᣪ瓺\uec9c㾃މڐꎓᇆ\udf9a⚾\ua637ঢ়倇s襳揤ᨹഄ곌\ue778\uf64aᏠ葧댲\ue413㨾ዜ㻳굒롪埣낍ǖ\udc81癥躍뜍㬡푺⪬⳺獛洭桕၇꣐ࡡ軗\ue31a㵿釣怇臱뢦ⱝ愡쀠\uf041ೊ憴ꈹと㒍\udc9c緬㡽泒᧧\udc45凔\u31ec\udb51뗯咶휪⥉趇袢ꜟ溹鳂ﳜ憕\ue9e0顯闖⊱㮂ꪙꨔ¯\u1af5ҵፍ\ua4ca蟵\ue97cꁧ갎闣\u008a烦㞷輜굴奜鑅㝢挵ⶕ굆䦄曎᧧◝Ꮺ碼烽\u0fdd挴ﵳ曃㌠㦼干嗴鵮唡덳\u0bdd텂왧䲶矿㲼\ue75e߾靲場왭⟕\ue0c4\ue0fd\ue2f7\u2eff֢\uef6fꔫꂦ\u0b7bꞛ㖖삸㾫깙㢧遼簾螠㠡\uf041\u09d2埾姯벜䟓\ue47d揌趢֟첄㪇믋굓墩씵⊑ᨻꩦ諥覇嗓찔题帹⃜엯\ufb1b᷁Ꭹ䎻ᑟ前죅礂㸃싐濰쏋鲽掿홓ꐘ廉㸵ꪸ墦\udccdන\uf01b\uda80犐\uf275稹뭍턄\u1f58龳䶓Έ㜸炧\udcc6툕\u0c53縯㱷鮛琢ꅟ䜹䱘✌㠽덬져议婝ꨀ⌹紌喊ಳ湁僓-쭡湋䖕ꆢ䓩涔\uecb3圳愱ឈ݈쮠쬎奜즻釦Т햇᷎랄愳㽉꺑肻朷ⱶᦂ탦䁀ㆷ깡젼┦䚪豟㮆븵嚤⥧\ud8f0䫋ꊆ嶬㱽㿯\ud884\uec06፣ꤤࡡ䣑뫟傆槠婉嫈䳍\ue062Ɲ\u0e6f㺘ᕔ婀嵺\ueb2f驟ꕋ堄漕䰫\ue3cd飐\ue8d5㱑\udbd3ᴧ㬕媇䤡\uf505塱\uf34b퉽筲㹶㭛⦣ᛠ℣쓫뉔⬵垿\u0a5f\uf4d2榐⤽⥔饐횾莑풝᭫櫮库蕂讍摿풍ﭷ\u1776闐榐㵕甙쉲\ue5c8畹\ue380粆㡫恭哶긤냮潿\ue895ᩬᆞ絡賥핱⾋㔌ᄃꨗ\u09d6ᩗ湚ﳀ썦붎ጳﻩ\ue083㘐曺㤡剄藚ﺝ销解뀨哫瘟\uf8c7繙廩褕엙芄骏쮔\ue327欆弸빾\ud84f뉒쭫ꟼ왗熏酘\u0bdc삁ꌖ樜퀩첸┢䱱琁쀱⡴珣乬뭽㦱 뢼曠ᡊ喰\ue521䝅⩓ೊ행ᤳ걺壠㳁仾厠￦\uef1b첤貛五邃ձ퐳謚\uda06ꍑ슥\uf604\uf5fa%\ude62뇛㣾딓\ue38cි뇃ﾵ㻊謁\ue71b쌡\udbc7芢覌肬鑗\uf5ceꇍ䙺嶁蜟쌌涉灦ꩡ셥﨤ၳ玚뾲啲\udecf\ud85dṧ\ue43e喵";
      short var18 = 12489;

      do {
         char var19 = var13.charAt(var17);
         int var10001 = var17 + 1;
         int var21 = 0;
         char[] var20 = var13.substring(var10001, var10001 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 7) {
               default -> 42;
               case 1 -> 118;
               case 2 -> 57;
               case 3 -> 74;
               case 4 -> 21;
               case 5 -> 72;
               case 6 -> 172;
            }) ^ var22;
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 3 | var22 << 13) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 3 | var22 >>> 13) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      IlIl = var15;
      IllI = new Object[var15.length];
      int var9 = -1016639821;
      byte[] var7 = "}ºX{È\u0083ØÉ\u0010äyAòI~x\u009e\u008fqþ\u0017\u000bPMlÓÃp\u0011\u0001Ç¶ðÓÔöu0cõ\u001dç\u001bD<\u0095¸ÁÔ \r\u000b¶ÿ¹³ÿÁH\u0083\u0086ËWÄ Ñ¶ÚWU\u0012Lì\u0088\u0091\u008cÄ°ø£ñ\u0085U6h©\u0099aR³§BÜq$\u0011áw\u008d\nqÆ}Ñ\u0018s\u0086\býÆfF\u0089\u0097Ýk\u0007\rý¿\u0092DY=z\u0090éÄ³VÐ|ÖêÛ¿Næ\u0084X<#\u0006`$¨uq\u008em\u008acÃ\u001fø\u0000|ÿ\u008eè.\u0016®\u0016¾\u0017\r:\u0013ô¢¦íå?\u00836<tOnæª-fÏY{n¹qÂA/ôâ¼ßÄÃ\u0002¥G\u0010\u0003\u0094r'\u000e«*>«\u0093ÄÿG/Ã&Ép\u0097ü³Gåùõ.Pæ\u0097þ¾K\u007f\u000e\u0013x*äM\u009f\u0016ýr¹\u0010Àb¥Íñf¼C\u009aíãA\u0098Îf\u00905ºm¼\u0082\u008dÅ\u0006h\u0005í0\u0013µ\u0091~O¿\u0000ëÇ\u0093\u00ad\u0003û¯ÿ\u009e·@äáð\u000e\u0013W$ºGÓ\u0006(û\n\u000b_\u0005\u0089q\u0094ä<«\u008dCÕ[\u0004\u0084\u0086A\u0092}®,E\u00adnè´\u0093\u0097úþù\u008d\u0091½Î+3\u0097Ð\u0093£\fÝß.ÇòKZ7X\u001dC\u0090\u0003qÞ/º\u0003èæE\nôßö\r\u0093\u0093ÏÑ\u009f\u0085\u0014\u0001wÝZ¹¸\u0083½\u0017\u0012[<G0×ZÌì\u0097¨ á\u0098ß\u0018\u0019èêÉ1\u0002ô\u0000\u009d\u001acKÉ(R½\u009b\u0096if«*i\u009fúP\u0001\u0001*\u008c\u000e\u0000\u0005ê\u009eåÁ~á.vâ]F[1ïÈÓ¿â>\u0087e\u0006Äu\u0098|\u0003+Îg9cM\b÷Ðzö°r÷´7\u0010\u0005#/Oo*`\\ßÌNT:\u0000b¤\u0017a\u000eå\u001aUÚn\u0098 \u0001<ÉÁmY\u0014\u0017P?lç\u008aá\u009c\u000f\u0086è-ôaß\u0091ú*Ð¢,\u00824!:¦wù\u0081\u000b\r#\u0080;´\u0012F\u008d\u0097j\u0084Dñm^\u0093|\u0099#ÎVÖ¦·j\u008e_\u001cÇHã8Îµª7\u0086\u0093ë\r\u0007_é\u0097ýáèVù¢\u001e¢xó\n¿q~(þ°ókaÓþ·W?é\u009a¯\u0087\u001fâ\u0082µø-\u009fi5÷áÓ·|Eþ\u001a=$3PXuC>¢vðBÎ4¯þaÓ\u009fqyá+A\u008a§Õ/ÄÀ¹\u0085Ú$ù9|\b\u0006K}\u008c]d\u001e\u009c¯mû,÷\u0011\u0086¿Pi*r\u0018\u0081m\u0081\u008a!~Õ£xÌQ.\u009b/YøÓ\"\u0012\u0085\ti\u000b:`ÉÃBKÓiÎ\u001e¿øI\u0087\u0095fB\u009aß\u0005\"\u001a \f\u0012õo7\u0014\u008d\u008a÷\u008d\u0096{\u00875q\u00ad\u0005\u008få\u0090\u0080\u0088Ò\"%àÎ\\\u0098\u0099%\u001d¼p\u0083c\"Aû'\u0006\u0087\u0017ÛÑH\u008dr\u0081Öeó¢\u00152üÛÁK½¶è!§ÿ]Öñ§\u001d\u00ad½Ð\u001cA\u0015Pg\u0084{\u0011\u0002\u0090Lù|òtÍc\u0086R=1\u001d[\u0012ï\u0010y\u0003Ä(\u001f\u001aÓü\u009d`Éðì \u0098\u008b\u009b\u0093Ûaã©3ø,\u0003\u0010m4\b\"45H`G¦\u009a¤\u0007\u0019\u0016¼²DÞ\t¯£m»#Y\u0087\u0002\u008båûY\u0014\u0007\u008dÎòÛ»\u0006\"i»\u0086y1z|±ÂÂáÞ²sÝ§\u008fK\u001a\u0001oé\u0011'ÏÝ9ê\u0095k±\u009b\u0002\u001f_^\b\u0080¬«Æ7ÝÏ¶¤ð\\ô\u001aT\u000ebü\u008dkºRâ%ÐÒU\u008c\u001fè\u001bLI\u0017#àp(\u008b\u0080Ý±5Ü¸^¶#Í+p\u0083J¤Dà¿ºÐ]°\u001d¸Í®\u0098\u000eêuÇ¹ìy¨UiÅt×-íèU@\u009a\u0004à¶T\u00adøG*Ð!\u009bØF*ÊBóÀ\u009b¿-ÊFSrB\u0010\u0087\u001d\u0006$²æaÉ\\ÈÐÙ\u008a>\u000bl&\u0088ôÆk²k\u0001\u009f¥Û7â\u0090\u0087È2£\u0000|\u0011öæ$¦wûÕ0¾\u0088í\u0097\u0011\u0080\u0005\u0002K|!\u0091Á\u0092§\t\u008e\u0095:è<\u007f\u00ad\u0095´²\u0098AùÉHóª\u0006\u0091¦[Ç8\\à,E\u0083\u0085\u009dÝ}\u0006\u000b\u001dNI÷äçÈ\u007fÐ\u0098âq\u009f\u009fE\u0099ßæ\u009a\u007fYáuÞè¢à'Éx£tÚ-ïü\u0091T|L \u001aâ\u0098CÔ«»Æõ\u0011\u0084õ\u0080²\u0083×\u0010&ÌõÄ|ç§}\u0019d³×xÑx±Q5CôL\u008fÀ²¤\u0082øå5ã\u0085A\u0086YrdÃºYóR,¥\u0014UA¤l\u0087øàTÈµ\u00adºõÉLûx«rÂäªåEêñ\u0090íÌâú2\u0015Ç;m\"Éã\u0001\b|Ê\nå3\u0089GSâ@#R\u001cZ«Ù\u0098pY\u0016b\u001f\u0006²bêT\r\u0015§Ä\u008cÐÝ,ÉÄÿ¸D_`öÁ+\u0018\"\u0000\u0095ñ\u008f3®\u00ad¤Ô¦\u008dfí\u00adñ\u0085ÌôÅ\u0089\u00ad®¦ÈN-\bNÌ7øuA6aºî\tÊÿÑ\u0018\u0086ÛÐ\fXÅ\u000b\u0088\u001c¶ÁT\u008dJ\u009câ+Õ`|éèÙ\u0097!m%õß\u00107M\u009b|*\u0083H¨\u0014\u009cÖè\u0019\u0096r£ó\t\bT©x|q8G5\u001eê<ÎâØ\u009aï\u0018(\u0086h\u009aR÷?®¬:\u0099\u0081ÀnñY'ÞüÀ|W,\n\u0000\u0082\u00169qïÑú\u008bÚ-={3\u0095&»>êR\u009bÌ\u0088!\u0099c»CmÔ}\u0010|\\³Í<\u0003Æ§ÙÍSô`\u00960Ï\u00adO\u0085\u0095ÓG¹\u001dN´-l\u000fX¸\u0004õ\f3z\u008e5}Çª7\u0090KµZ,!¡C+\u009e\u001f\u0004ÅûxôÚaH\u009b\u0005\u0081-=#¦(ÞõEü¹\u0006DJ0»éMaf<m\u001b,; z\u0004%#Ä»êðNÛ\u007f0\u0092\rôK®\u0005 é\u0006\u0088ëYp¨Ý>:Ð\u001a×\u0098ªÖ\u001bÎ\u008d(Q¦6Ý=\u0094\u008cØ|w&Í\u0013.í¾rÀÏþÞ\u0012Þ;Ó`\u008boê¶Y(\u001a\u0099<·«ks¨\u008d»\u0087ô\u001c\u0084Ù\u0086pZß\u009eV\\s\u0002N\u0015L¯\u008a\"Z°\u0013\u0093\u0019R:\n\u009aÅªjìÏÁÐâC#y\u009a\\\u0085>C\u009d\u0003ë;.R¸Û£q9\u0080ã9ís\u0094urÎToêÂø\u001e¹\f\n\u0095ãìM/f\u0010ÕddA\u0010\u0004D1icïÓM*\u008a)ÊvuT+ßö\u008bsêúvÉe±ÀoJHºHLl|v9¨»j\u001f\u0012®Y$\u0085ùï\b{çZ"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      IlII = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         IlII[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var5 = new String[IIlII(801332673, var23 ^ 1098524503)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = IIlIl(1927025357, var23 ^ -255205252)).length();
      int var1 = IIlII(801332674, var23 ^ 983739327);
      int var25 = -1;

      label100:
      while (true) {
         int var28 = IIlII(801332675, var23 ^ 1198567238);
         String var30 = var2.substring(++var25, var25 + var1);
         byte var10002 = -1;

         while (true) {
            label95: {
               char[] var45 = var30.toCharArray();
               int var10004 = var45.length;
               int var6 = 0;
               int var48 = var28;
               var41 = var45;
               int var35 = var10004;
               char[] var57;
               int var10006;
               if (var10004 <= 1) {
                  var57 = var45;
                  var10004 = var28;
                  var10006 = var6;
               } else {
                  var48 = var28;
                  var35 = var10004;
                  if (var10004 <= var6) {
                     break label95;
                  }

                  var57 = var45;
                  var10004 = var28;
                  var10006 = var6;
               }

               while (true) {
                  var57[var10006] = (char)(var57[var10006] ^ var10004 ^ switch (var6 % IIlII(801332687, var23 ^ 1793380410)) {
                     case 0 -> IIlII(801332680, var23 ^ -2108589737);
                     case 1 -> 2;
                     case 2 -> IIlII(801332681, var23 ^ -527511926);
                     case 3 -> IIlII(801332682, var23 ^ -1448075162);
                     case 4 -> IIlII(801332683, var23 ^ -793100506);
                     case 5 -> IIlII(801332692, var23 ^ -157229561);
                     default -> IIlII(801332693, var23 ^ 19162453);
                  });
                  var6++;
                  if (var48 == 0) {
                     var10006 = var48;
                     var57 = var41;
                     var10004 = var48;
                  } else {
                     if (var35 <= var6) {
                        break;
                     }

                     var57 = var41;
                     var10004 = var48;
                     var10006 = var6;
                  }
               }
            }

            String var50 = new String(var41).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var50;
                  if ((var25 += var1) >= var4) {
                     l = var5;
                     IIll = new String[IIlII(801332686, var23 ^ 1268149329)];
                     lII = new String[IIlII(801332694, var23 ^ -1158027646)];
                     llIl();
                     IIl = class_2960.method_60655(
                        IlIIllIII.lI(lII[IIlII(801332695, var23 ^ -1832808524)]), IlIIllIII.lI(lII[IIlII(801332688, var23 ^ -1477172699)])
                     );
                     Il = Executors.newSingleThreadExecutor(IIIllIIII::ll);
                     I = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(5L)).followRedirects(Redirect.NORMAL).build();
                     return;
                  }

                  var1 = var2.charAt(var25);
                  break;
               default:
                  var5[var3++] = var50;
                  if ((var25 += var1) < var4) {
                     var1 = var2.charAt(var25);
                     continue label100;
                  }

                  var4 = (var2 = IIlIl(1927025356, var23 ^ 1017746631)).length();
                  var1 = IIlII(801332684, var23 ^ -1499284429);
                  var25 = -1;
            }

            var28 = IIlII(801332685, var23 ^ 591465232);
            var30 = var2.substring(++var25, var25 + var1);
            var10002 = 0;
         }
      }
   }

   private static String IIIIl(int var0, int var1) {
      int var9 = 2025188401;
      int var2 = (var0 ^ IIlII(801332603, var9 ^ -345550403)) & IIlII(801332484, var9 ^ 1309581769);
      if (IIll[var2] == null) {
         char[] var3 = l[var2].toCharArray();

         int var4 = switch (var3[0] & IIlII(801332485, var9 ^ -210348151)) {
            case 0 -> IIlII(801332486, var9 ^ -677384100);
            case 1 -> IIlII(801332487, var9 ^ 1236175249);
            case 2 -> IIlII(801332480, var9 ^ 1835558254);
            case 3 -> IIlII(801332481, var9 ^ -1163402537);
            case 4 -> IIlII(801332482, var9 ^ -365357634);
            case 5 -> IIlII(801332483, var9 ^ -906346206);
            case 6 -> IIlII(801332492, var9 ^ -1339148117);
            case 7 -> IIlII(801332493, var9 ^ -586722817);
            case 8 -> IIlII(801332494, var9 ^ -1800231633);
            case 9 -> IIlII(801332495, var9 ^ -856498602);
            case 10 -> IIlII(801332488, var9 ^ -1141689618);
            case 11 -> IIlII(801332489, var9 ^ 998832041);
            case 12 -> IIlII(801332490, var9 ^ 2062410561);
            case 13 -> 1;
            case 14 -> IIlII(801332491, var9 ^ -1835826667);
            case 15 -> IIlII(801332500, var9 ^ -1500711684);
            case 16 -> IIlII(801332501, var9 ^ 1457418123);
            case 17 -> IIlII(801332502, var9 ^ 2030068586);
            case 18 -> IIlII(801332503, var9 ^ 1747672039);
            case 19 -> IIlII(801332496, var9 ^ 1899794363);
            case 20 -> IIlII(801332497, var9 ^ 187073521);
            case 21 -> IIlII(801332498, var9 ^ 1266153620);
            case 22 -> IIlII(801332499, var9 ^ -130806187);
            case 23 -> IIlII(801332508, var9 ^ -1025733769);
            case 24 -> IIlII(801332509, var9 ^ 1761549656);
            case 25 -> IIlII(801332510, var9 ^ 1674396743);
            case 26 -> IIlII(801332511, var9 ^ 596587790);
            case 27 -> IIlII(801332504, var9 ^ -246713283);
            case 28 -> IIlII(801332505, var9 ^ 2102641016);
            case 29 -> IIlII(801332506, var9 ^ -1243161229);
            case 30 -> IIlII(801332507, var9 ^ 106188948);
            case 31 -> IIlII(801332516, var9 ^ -319953854);
            case 32 -> IIlII(801332517, var9 ^ -1867094261);
            case 33 -> IIlII(801332518, var9 ^ -434011863);
            case 34 -> IIlII(801332519, var9 ^ -790016559);
            case 35 -> IIlII(801332512, var9 ^ -798422287);
            case 36 -> IIlII(801332513, var9 ^ 294896361);
            case 37 -> IIlII(801332514, var9 ^ -1458656213);
            case 38 -> IIlII(801332515, var9 ^ 405984399);
            case 39 -> IIlII(801332524, var9 ^ 552955585);
            case 40 -> IIlII(801332525, var9 ^ -2097261202);
            case 41 -> IIlII(801332526, var9 ^ -1227449980);
            case 42 -> IIlII(801332527, var9 ^ 6220002);
            case 43 -> IIlII(801332520, var9 ^ 1957703232);
            case 44 -> IIlII(801332521, var9 ^ -347875095);
            case 45 -> IIlII(801332522, var9 ^ 1546828935);
            case 46 -> IIlII(801332523, var9 ^ -820040162);
            case 47 -> IIlII(801332532, var9 ^ 1908105719);
            case 48 -> IIlII(801332533, var9 ^ -1755184107);
            case 49 -> IIlII(801332534, var9 ^ 957175348);
            case 50 -> IIlII(801332535, var9 ^ -1178934351);
            case 51 -> IIlII(801332528, var9 ^ -2081145017);
            case 52 -> IIlII(801332529, var9 ^ 2093780970);
            case 53 -> IIlII(801332530, var9 ^ 1130688673);
            case 54 -> IIlII(801332531, var9 ^ -623202810);
            case 55 -> IIlII(801332540, var9 ^ 895045957);
            case 56 -> IIlII(801332541, var9 ^ 1084223618);
            case 57 -> IIlII(801332542, var9 ^ -810839145);
            case 58 -> IIlII(801332543, var9 ^ -784388525);
            case 59 -> IIlII(801332536, var9 ^ 1985461910);
            case 60 -> IIlII(801332537, var9 ^ -203318945);
            case 61 -> IIlII(801332538, var9 ^ -1403610082);
            case 62 -> IIlII(801332539, var9 ^ -1011213952);
            case 63 -> IIlII(801332420, var9 ^ 523787329);
            case 64 -> IIlII(801332421, var9 ^ -2084949011);
            case 65 -> IIlII(801332422, var9 ^ 1863304286);
            case 66 -> IIlII(801332423, var9 ^ -971557624);
            case 67 -> IIlII(801332416, var9 ^ -1144067591);
            case 68 -> IIlII(801332417, var9 ^ 767927300);
            case 69 -> IIlII(801332418, var9 ^ -1741690503);
            case 70 -> IIlII(801332419, var9 ^ 1176843423);
            case 71 -> IIlII(801332428, var9 ^ 430800617);
            case 72 -> IIlII(801332429, var9 ^ 1995003544);
            case 73 -> IIlII(801332430, var9 ^ -1920026406);
            case 74 -> IIlII(801332431, var9 ^ -1556109261);
            case 75 -> IIlII(801332424, var9 ^ 1441013183);
            case 76 -> IIlII(801332425, var9 ^ -484723411);
            case 77 -> IIlII(801332426, var9 ^ -645631148);
            case 78 -> IIlII(801332427, var9 ^ -835435055);
            case 79 -> IIlII(801332436, var9 ^ -77022500);
            case 80 -> IIlII(801332437, var9 ^ -923857066);
            case 81 -> IIlII(801332438, var9 ^ -1660332743);
            case 82 -> IIlII(801332439, var9 ^ 471115693);
            case 83 -> IIlII(801332432, var9 ^ -714636340);
            case 84 -> IIlII(801332433, var9 ^ 2054124734);
            case 85 -> IIlII(801332434, var9 ^ 546525244);
            case 86 -> IIlII(801332435, var9 ^ -1434594202);
            case 87 -> IIlII(801332444, var9 ^ -444967760);
            case 88 -> IIlII(801332445, var9 ^ 1469105128);
            case 89 -> IIlII(801332446, var9 ^ -547493401);
            case 90 -> IIlII(801332447, var9 ^ -1842988676);
            case 91 -> IIlII(801332440, var9 ^ -1041636444);
            case 92 -> IIlII(801332441, var9 ^ 807946861);
            case 93 -> IIlII(801332442, var9 ^ -1950141440);
            case 94 -> IIlII(801332443, var9 ^ -294474518);
            case 95 -> IIlII(801332452, var9 ^ 1843686914);
            case 96 -> 3;
            case 97 -> IIlII(801332453, var9 ^ 572036608);
            case 98 -> 2;
            case 99 -> IIlII(801332454, var9 ^ -1550802344);
            case 100 -> IIlII(801332455, var9 ^ -1986073409);
            case 101 -> IIlII(801332448, var9 ^ 779529706);
            case 102 -> IIlII(801332449, var9 ^ -242206842);
            case 103 -> IIlII(801332450, var9 ^ 506567174);
            case 104 -> IIlII(801332451, var9 ^ -1949779061);
            case 105 -> IIlII(801332460, var9 ^ -929322781);
            case 106 -> IIlII(801332461, var9 ^ -2079071336);
            case 107 -> IIlII(801332462, var9 ^ 396579332);
            case 108 -> IIlII(801332463, var9 ^ -1988677131);
            case 109 -> IIlII(801332456, var9 ^ -1068189885);
            case 110 -> IIlII(801332457, var9 ^ 2053867396);
            case 111 -> IIlII(801332458, var9 ^ -647190883);
            case 112 -> IIlII(801332459, var9 ^ 1294174149);
            case 113 -> IIlII(801332468, var9 ^ 386454988);
            case 114 -> IIlII(801332469, var9 ^ 1921761561);
            case 115 -> IIlII(801332470, var9 ^ 322832677);
            case 116 -> IIlII(801332471, var9 ^ 987378173);
            case 117 -> IIlII(801332464, var9 ^ 660648523);
            case 118 -> IIlII(801332465, var9 ^ -814904831);
            case 119 -> IIlII(801332466, var9 ^ 1577908096);
            case 120 -> IIlII(801332467, var9 ^ -306832335);
            case 121 -> IIlII(801332476, var9 ^ -1470814090);
            case 122 -> IIlII(801332477, var9 ^ 969136077);
            case 123 -> IIlII(801332478, var9 ^ 1051645425);
            case 124 -> IIlII(801332479, var9 ^ -334000632);
            case 125 -> IIlII(801332472, var9 ^ -1554326490);
            case 126 -> IIlII(801332473, var9 ^ -1641660479);
            case 127 -> IIlII(801332474, var9 ^ 323223561);
            case 128 -> 4;
            case 129 -> IIlII(801332475, var9 ^ -1891267777);
            case 130 -> IIlII(801332356, var9 ^ -2128682346);
            case 131 -> IIlII(801332357, var9 ^ -1492285359);
            case 132 -> IIlII(801332358, var9 ^ 2116569564);
            case 133 -> IIlII(801332359, var9 ^ 1227263262);
            case 134 -> IIlII(801332352, var9 ^ 1670625385);
            case 135 -> IIlII(801332353, var9 ^ -1898120417);
            case 136 -> IIlII(801332354, var9 ^ 940388954);
            case 137 -> IIlII(801332355, var9 ^ 972240052);
            case 138 -> IIlII(801332364, var9 ^ -1300823497);
            case 139 -> IIlII(801332365, var9 ^ 2106420594);
            case 140 -> IIlII(801332366, var9 ^ -645031918);
            case 141 -> IIlII(801332367, var9 ^ 1727714441);
            case 142 -> IIlII(801332360, var9 ^ -415255751);
            case 143 -> IIlII(801332361, var9 ^ -1574204280);
            case 144 -> IIlII(801332362, var9 ^ 800068556);
            case 145 -> IIlII(801332363, var9 ^ -1429968430);
            case 146 -> IIlII(801332372, var9 ^ 1803191274);
            case 147 -> IIlII(801332373, var9 ^ 1480712131);
            case 148 -> IIlII(801332374, var9 ^ -1085670238);
            case 149 -> IIlII(801332375, var9 ^ -2042461359);
            case 150 -> IIlII(801332368, var9 ^ -1491356602);
            case 151 -> IIlII(801332369, var9 ^ -968763594);
            case 152 -> IIlII(801332370, var9 ^ 633502570);
            case 153 -> IIlII(801332371, var9 ^ -1478981195);
            case 154 -> IIlII(801332380, var9 ^ 718869310);
            case 155 -> IIlII(801332381, var9 ^ -2048477108);
            case 156 -> IIlII(801332382, var9 ^ -1158154447);
            case 157 -> IIlII(801332383, var9 ^ -1142740362);
            case 158 -> IIlII(801332376, var9 ^ 1617392265);
            case 159 -> IIlII(801332377, var9 ^ -1430520658);
            case 160 -> IIlII(801332378, var9 ^ -150120036);
            case 161 -> IIlII(801332379, var9 ^ 194222842);
            case 162 -> IIlII(801332388, var9 ^ -1300737417);
            case 163 -> IIlII(801332389, var9 ^ 1310370841);
            case 164 -> IIlII(801332390, var9 ^ 1554183492);
            case 165 -> IIlII(801332391, var9 ^ 1097606794);
            case 166 -> IIlII(801332384, var9 ^ 2138285880);
            case 167 -> IIlII(801332385, var9 ^ 1920533368);
            case 168 -> IIlII(801332386, var9 ^ -1729725774);
            case 169 -> IIlII(801332387, var9 ^ -1030287825);
            case 170 -> IIlII(801332396, var9 ^ 1403537392);
            case 171 -> IIlII(801332397, var9 ^ -2116829730);
            case 172 -> IIlII(801332398, var9 ^ -1284137866);
            case 173 -> IIlII(801332399, var9 ^ 1130961630);
            case 174 -> IIlII(801332392, var9 ^ 957894266);
            case 175 -> IIlII(801332393, var9 ^ -942281981);
            case 176 -> IIlII(801332394, var9 ^ -1417575474);
            case 177 -> IIlII(801332395, var9 ^ 1278315804);
            case 178 -> IIlII(801332404, var9 ^ 397958753);
            case 179 -> IIlII(801332405, var9 ^ 1802331426);
            case 180 -> IIlII(801332406, var9 ^ 436249438);
            case 181 -> IIlII(801332407, var9 ^ -533373387);
            case 182 -> IIlII(801332400, var9 ^ 282912584);
            case 183 -> IIlII(801332401, var9 ^ -791570373);
            case 184 -> IIlII(801332402, var9 ^ -266077751);
            case 185 -> IIlII(801332403, var9 ^ -225654491);
            case 186 -> IIlII(801332412, var9 ^ 104533242);
            case 187 -> IIlII(801332413, var9 ^ 397656246);
            case 188 -> IIlII(801332414, var9 ^ 1475130381);
            case 189 -> IIlII(801332415, var9 ^ -1306385888);
            case 190 -> IIlII(801332408, var9 ^ 192496218);
            case 191 -> IIlII(801332409, var9 ^ -962530235);
            case 192 -> IIlII(801332410, var9 ^ -1196897463);
            case 193 -> IIlII(801332411, var9 ^ 626745121);
            case 194 -> IIlII(801332292, var9 ^ 1689766195);
            case 195 -> IIlII(801332293, var9 ^ -1629273840);
            case 196 -> IIlII(801332294, var9 ^ -438694691);
            case 197 -> IIlII(801332295, var9 ^ -1042750972);
            case 198 -> IIlII(801332288, var9 ^ -558538766);
            case 199 -> IIlII(801332289, var9 ^ -894674300);
            case 200 -> IIlII(801332290, var9 ^ 1961604628);
            case 201 -> IIlII(801332291, var9 ^ 320579994);
            case 202 -> IIlII(801332300, var9 ^ 594834560);
            case 203 -> IIlII(801332301, var9 ^ 1188188228);
            case 204 -> IIlII(801332302, var9 ^ 1127319490);
            case 205 -> IIlII(801332303, var9 ^ -1755941019);
            case 206 -> IIlII(801332296, var9 ^ 568314302);
            case 207 -> IIlII(801332297, var9 ^ 646846215);
            case 208 -> IIlII(801332298, var9 ^ 116677892);
            case 209 -> IIlII(801332299, var9 ^ 1268086373);
            case 210 -> IIlII(801332308, var9 ^ 1210832180);
            case 211 -> IIlII(801332309, var9 ^ -1683904159);
            case 212 -> IIlII(801332310, var9 ^ 1534950646);
            case 213 -> IIlII(801332311, var9 ^ 541161337);
            case 214 -> IIlII(801332304, var9 ^ -2098595366);
            case 215 -> IIlII(801332305, var9 ^ 849337151);
            case 216 -> IIlII(801332306, var9 ^ 1440064084);
            case 217 -> IIlII(801332307, var9 ^ -1132996427);
            case 218 -> IIlII(801332316, var9 ^ 1881276243);
            case 219 -> IIlII(801332317, var9 ^ 977881048);
            case 220 -> IIlII(801332318, var9 ^ 1450966609);
            case 221 -> IIlII(801332319, var9 ^ 395859104);
            case 222 -> IIlII(801332312, var9 ^ 2025955100);
            case 223 -> IIlII(801332313, var9 ^ 422559082);
            case 224 -> IIlII(801332314, var9 ^ -1241666528);
            case 225 -> IIlII(801332315, var9 ^ -1198524103);
            case 226 -> IIlII(801332324, var9 ^ -2124862612);
            case 227 -> IIlII(801332325, var9 ^ 1903578551);
            case 228 -> IIlII(801332326, var9 ^ -1065090785);
            case 229 -> IIlII(801332327, var9 ^ -430640101);
            case 230 -> IIlII(801332320, var9 ^ 2003545054);
            case 231 -> IIlII(801332321, var9 ^ 464891361);
            case 232 -> IIlII(801332322, var9 ^ 1035148746);
            case 233 -> IIlII(801332323, var9 ^ 637149772);
            case 234 -> IIlII(801332332, var9 ^ -506647669);
            case 235 -> IIlII(801332333, var9 ^ 2021419816);
            case 236 -> IIlII(801332334, var9 ^ 1374021890);
            case 237 -> 5;
            case 238 -> 0;
            case 239 -> IIlII(801332335, var9 ^ -1048207785);
            case 240 -> IIlII(801332328, var9 ^ -1438674464);
            case 241 -> IIlII(801332329, var9 ^ 1217849545);
            case 242 -> IIlII(801332330, var9 ^ -288280076);
            case 243 -> IIlII(801332331, var9 ^ 1745111388);
            case 244 -> IIlII(801332340, var9 ^ 962046641);
            case 245 -> IIlII(801332341, var9 ^ 450294462);
            case 246 -> IIlII(801332342, var9 ^ 1375863051);
            case 247 -> IIlII(801332343, var9 ^ 513653810);
            case 248 -> IIlII(801332336, var9 ^ 67481909);
            case 249 -> IIlII(801332337, var9 ^ 1968603071);
            case 250 -> IIlII(801332338, var9 ^ -32727425);
            case 251 -> IIlII(801332339, var9 ^ 1149854355);
            case 252 -> IIlII(801332348, var9 ^ 260780770);
            case 253 -> IIlII(801332349, var9 ^ 1873495008);
            case 254 -> IIlII(801332350, var9 ^ 134258951);
            default -> IIlII(801332351, var9 ^ 1097161631);
         };
         int var5 = (var1 & IIlII(801332344, var9 ^ 496641986)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & IIlII(801332345, var9 ^ -1273436773)) >>> IIlII(801332346, var9 ^ -2129323989)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & IIlII(801332347, var9 ^ 241087365);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & IIlII(801332228, var9 ^ 564644317);
            }
         }

         IIll[var2] = new String(var3).intern();
      }

      return IIll[var2];
   }

   private static boolean IIIlI(JsonObject param0, String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 05: astore 2
      // 06: aload 2
      // 07: ifnull 2e
      // 0a: aload 2
      // 0b: invokevirtual com/google/gson/JsonElement.isJsonNull ()Z
      // 0e: ifne 2e
      // 11: goto 18
      // 14: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: aload 2
      // 19: invokevirtual com/google/gson/JsonElement.getAsBoolean ()Z
      // 1c: ifeq 2e
      // 1f: goto 26
      // 22: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25: athrow
      // 26: bipush 1
      // 27: goto 2f
      // 2a: invokestatic k74/x/IIIllIIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d: athrow
      // 2e: bipush 0
      // 2f: ireturn
   }

   private static CompletableFuture<IIIlII> IIIll(IlIIlIIl var0) {
      int var12 = -1693423425;
      String var10000 = IlIIllIII.lI(lII[IIlII(801332229, var12 ^ -1004104106)]);
      String var10001 = Illl(var0.IIIl());
      String var10002 = IlIIllIII.lI(lII[IIlII(801332230, var12 ^ -1310568822)]);
      String var10003 = Illl(var0.II());
      String var10004 = IlIIllIII.lI(lII[IIlII(801332231, var12 ^ -1755817025)]);
      String var10005 = Illl(var0.IIII());
      String var10006 = IlIIllIII.lI(lII[IIlII(801332224, var12 ^ -1395717112)]);
      long var10 = Math.max(0L, Math.round(var0.III() / 1000.0));
      String var9 = var10006;
      String var8 = var10005;
      String var7 = var10004;
      String var6 = var10003;
      String var5 = var10002;
      String var4 = var10001;
      String var3 = var10000;
      String var1 = var3 + var4 + var5 + var6 + var7 + var8 + var9 + var10;
      var4 = IlIIllIII.lI(lII[IIlII(801332225, var12 ^ -2144268929)]);
      URI var2 = URI.create(var4 + var1);
      return IllI(var2, false).thenCompose(IIIllIIII::lIII);
   }
}
