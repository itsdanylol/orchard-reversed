package k74.x;

import com.google.gson.JsonObject;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1661;
import net.minecraft.class_1792;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3965;
import net.minecraft.class_3966;

@Environment(EnvType.CLIENT)
public final class llIIlIII extends IlIIIIIIl {
   private int II;
   private static final double Il = 4.0;
   private static String[] lI;
   private long ll;
   private static final String[] III;
   private final lllIIlII IIl;
   private static final Object[] lIlI;
   private final lIlllIl IlI;
   private static final int[] lIII;
   private static final long Ill = 8000L;
   private int lII;
   private final lllIIlII lIl;
   private static final String[] lIIl;
   private class_243 llI;
   private final lIlllIl lll;
   private final lllIIlII IIII;
   private static final String[] IIIl;
   private final IllIII<lllIIIlI> IIlI;
   private static final int IIll = 1;
   private int IlII;
   private int IlIl;
   private final lllIIlII IllI;
   private class_3965 Illl;
   private static final int I = 1;

   private boolean I(class_310 param1, class_2338 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: aload 1
      // 01: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 04: aload 2
      // 05: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 08: astore 3
      // 09: aload 3
      // 0a: invokevirtual net/minecraft/class_2680.method_26215 ()Z
      // 0d: ifne 1e
      // 10: aload 3
      // 11: invokevirtual net/minecraft/class_2680.method_45474 ()Z
      // 14: ifeq 45
      // 17: goto 1e
      // 1a: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: aload 1
      // 1f: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 22: aconst_null
      // 23: new net/minecraft/class_238
      // 26: dup
      // 27: aload 2
      // 28: invokespecial net/minecraft/class_238.<init> (Lnet/minecraft/class_2338;)V
      // 2b: invokevirtual net/minecraft/class_638.method_8335 (Lnet/minecraft/class_1297;Lnet/minecraft/class_238;)Ljava/util/List;
      // 2e: invokeinterface java/util/List.isEmpty ()Z 1
      // 33: ifeq 45
      // 36: goto 3d
      // 39: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c: athrow
      // 3d: bipush 1
      // 3e: goto 46
      // 41: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 44: athrow
      // 45: bipush 0
      // 46: ireturn
   }

   private void II(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 20
      // 04: aload 1
      // 05: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 08: ifnull 20
      // 0b: goto 12
      // 0e: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11: athrow
      // 12: aload 1
      // 13: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 16: ifnonnull 25
      // 19: goto 20
      // 1c: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: return
      // 21: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: aload 1
      // 26: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 29: getfield net/minecraft/class_746.field_6012 I
      // 2c: aload 0
      // 2d: getfield k74/x/llIIlIII.IlIl I
      // 30: if_icmpge 38
      // 33: return
      // 34: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37: athrow
      // 38: aload 1
      // 39: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
      // 3c: astore 3
      // 3d: aload 3
      // 3e: instanceof net/minecraft/class_3965
      // 41: ifeq 53
      // 44: aload 3
      // 45: checkcast net/minecraft/class_3965
      // 48: astore 2
      // 49: aload 2
      // 4a: invokevirtual net/minecraft/class_3965.method_17783 ()Lnet/minecraft/class_239$class_240;
      // 4d: getstatic net/minecraft/class_239$class_240.field_1332 Lnet/minecraft/class_239$class_240;
      // 50: if_acmpeq 58
      // 53: return
      // 54: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 57: athrow
      // 58: aload 0
      // 59: aload 1
      // 5a: aload 2
      // 5b: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 5e: invokevirtual k74/x/llIIlIII.llI (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 61: ifne 69
      // 64: return
      // 65: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 68: athrow
      // 69: aload 0
      // 6a: aload 1
      // 6b: invokevirtual k74/x/llIIlIII.IllI (Lnet/minecraft/class_310;)I
      // 6e: istore 3
      // 6f: iload 3
      // 70: ifge 78
      // 73: return
      // 74: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 77: athrow
      // 78: aload 0
      // 79: aload 2
      // 7a: putfield k74/x/llIIlIII.Illl Lnet/minecraft/class_3965;
      // 7d: aload 0
      // 7e: iload 3
      // 7f: putfield k74/x/llIIlIII.II I
      // 82: aload 0
      // 83: aload 1
      // 84: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 87: getfield net/minecraft/class_746.field_6012 I
      // 8a: putfield k74/x/llIIlIII.IlII I
      // 8d: aload 0
      // 8e: aload 1
      // 8f: invokevirtual k74/x/llIIlIII.lIll (Lnet/minecraft/class_310;)V
      // 92: return
   }

   private static String IIIII(int var0, int var1) {
      int var3 = var0 ^ -2095471935;
      char[] var4 = lIIl[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])lIlI[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         lIlI[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 554086168;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 156;
            case 1 -> 215;
            case 2 -> 191;
            case 3 -> 28;
            case 4 -> 54;
            case 5 -> 170;
            case 6 -> 215;
            case 7 -> 136;
            case 8 -> 26;
            case 9 -> 167;
            case 10 -> 249;
            case 11 -> 16;
            case 12 -> 39;
            case 13 -> 5;
            case 14 -> 159;
            case 15 -> 9;
            case 16 -> 102;
            case 17 -> 79;
            case 18 -> 146;
            case 19 -> 171;
            case 20 -> 4;
            case 21 -> 33;
            case 22 -> 11;
            case 23 -> 242;
            case 24 -> 26;
            case 25 -> 146;
            case 26 -> 58;
            case 27 -> 59;
            case 28 -> 251;
            case 29 -> 245;
            case 30 -> 186;
            case 31 -> 63;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   public llIIlIII() {
      int var1 = 865383771;
      super(IlIIllIII.Ill(lI[1]), lllIIlIl.I, IlIIllIII.Ill(lI[3]));
      this.IIlI = this.IllIIll(new IllIII<>(IlIIllIII.Ill(lI[2]), lllIIIlI.class, lllIIIlI.I));
      this.IllI = this.IllIIll(new lllIIlII(IlIIllIII.Ill(lI[lllI(-1642667416, var1 ^ -1563640870)]), false));
      lIlllIl var10002 = new lIlllIl(IlIIllIII.Ill(lI[lllI(-1642667415, var1 ^ 1683051850)]), 1.0, 1.0, 1.0, 4.0, 1.0);
      IlIIllIII.lI(lI[4]);
      this.IlI = this.IllIIll(var10002.lI(IIlI(lllI(-1642667414, var1 ^ 1287432460), lllI(-1642667413, var1 ^ 128914415))));
      var10002 = new lIlllIl(IlIIllIII.Ill(lI[lllI(-1642667412, var1 ^ 639944686)]), 1.0, 1.0, 1.0, 4.0, 1.0);
      IlIIllIII.lI(lI[4]);
      this.lll = this.IllIIll(var10002.lI(IIlI(lllI(-1642667411, var1 ^ 140042044), lllI(-1642667410, var1 ^ 539531597))));
      this.IIII = new lllIIlII(IlIIllIII.Ill(lI[lllI(-1642667409, var1 ^ -599467356)]), true);
      this.IIl = this.IllIIll(new lllIIlII(IlIIllIII.Ill(lI[5]), true));
      this.II = -1;
      this.IlII = lllI(-1642667424, var1 ^ 1973248638);
      this.lIl = this.IllIIll(new lllIIlII(IIlI(lllI(-1642667423, var1 ^ -1883880913), lllI(-1642667422, var1 ^ -1270495670)), false));
   }

   private void Il(JsonObject param1, String param2, lIlllIl param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: invokestatic k74/x/IIllllIl.IIIIl ()[Ljava/lang/String;
      // 03: astore 4
      // 05: aload 1
      // 06: ifnull 2a
      // 09: aload 2
      // 0a: ifnull 2a
      // 0d: goto 14
      // 10: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13: athrow
      // 14: aload 1
      // 15: getstatic k74/x/llIIlIII.lI [Ljava/lang/String;
      // 18: bipush 0
      // 19: aaload
      // 1a: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 1d: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 20: ifne 2f
      // 23: goto 2a
      // 26: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29: athrow
      // 2a: return
      // 2b: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: aload 1
      // 30: getstatic k74/x/llIIlIII.lI [Ljava/lang/String;
      // 33: bipush 0
      // 34: aaload
      // 35: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 38: invokevirtual com/google/gson/JsonObject.getAsJsonObject (Ljava/lang/String;)Lcom/google/gson/JsonObject;
      // 3b: astore 5
      // 3d: aload 5
      // 3f: aload 2
      // 40: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 43: astore 6
      // 45: aload 6
      // 47: ifnull 59
      // 4a: aload 6
      // 4c: invokevirtual com/google/gson/JsonElement.isJsonNull ()Z
      // 4f: ifeq 5e
      // 52: goto 59
      // 55: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 58: athrow
      // 59: return
      // 5a: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5d: athrow
      // 5e: aload 6
      // 60: invokevirtual com/google/gson/JsonElement.isJsonArray ()Z
      // 63: ifeq a8
      // 66: aload 6
      // 68: invokevirtual com/google/gson/JsonElement.getAsJsonArray ()Lcom/google/gson/JsonArray;
      // 6b: astore 7
      // 6d: aload 7
      // 6f: invokevirtual com/google/gson/JsonArray.size ()I
      // 72: bipush 2
      // 73: if_icmplt a3
      // 76: aload 7
      // 78: bipush 0
      // 79: invokevirtual com/google/gson/JsonArray.get (I)Lcom/google/gson/JsonElement;
      // 7c: invokevirtual com/google/gson/JsonElement.getAsDouble ()D
      // 7f: invokestatic k74/x/llIIlIII.Illl (D)D
      // 82: dstore 8
      // 84: aload 7
      // 86: bipush 1
      // 87: invokevirtual com/google/gson/JsonArray.get (I)Lcom/google/gson/JsonElement;
      // 8a: invokevirtual com/google/gson/JsonElement.getAsDouble ()D
      // 8d: invokestatic k74/x/llIIlIII.Illl (D)D
      // 90: dstore 10
      // 92: aload 3
      // 93: bipush 2
      // 94: newarray 7
      // 96: dup
      // 97: bipush 0
      // 98: dload 8
      // 9a: dastore
      // 9b: dup
      // 9c: bipush 1
      // 9d: dload 10
      // 9f: dastore
      // a0: invokevirtual k74/x/lIlllIl.III ([D)V
      // a3: aload 4
      // a5: ifnull d2
      // a8: aload 6
      // aa: invokevirtual com/google/gson/JsonElement.isJsonPrimitive ()Z
      // ad: ifeq d2
      // b0: goto b7
      // b3: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b6: athrow
      // b7: aload 6
      // b9: invokevirtual com/google/gson/JsonElement.getAsDouble ()D
      // bc: invokestatic k74/x/llIIlIII.Illl (D)D
      // bf: dstore 7
      // c1: aload 3
      // c2: bipush 2
      // c3: newarray 7
      // c5: dup
      // c6: bipush 0
      // c7: dload 7
      // c9: dastore
      // ca: dup
      // cb: bipush 1
      // cc: dload 7
      // ce: dastore
      // cf: invokevirtual k74/x/lIlllIl.III ([D)V
      // d2: goto d7
      // d5: astore 7
      // d7: return
   }

   private void lI() {
      this.IlIl = 0;
      this.lII = 0;
   }

   private boolean ll(class_310 param1) {
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
      // 0e: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11: athrow
      // 12: aload 1
      // 13: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 16: ifnull 63
      // 19: goto 20
      // 1c: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: aload 1
      // 21: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 24: ifnull 63
      // 27: goto 2e
      // 2a: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d: athrow
      // 2e: aload 1
      // 2f: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 32: ifnull 63
      // 35: goto 3c
      // 38: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b: athrow
      // 3c: aload 1
      // 3d: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 40: ifnonnull 63
      // 43: goto 4a
      // 46: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 49: athrow
      // 4a: aload 1
      // 4b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 4e: invokevirtual net/minecraft/class_746.method_5805 ()Z
      // 51: ifeq 63
      // 54: goto 5b
      // 57: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5a: athrow
      // 5b: bipush 1
      // 5c: goto 64
      // 5f: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: bipush 0
      // 64: ireturn
   }

   @Override
   public void llIl() {
      this.lI();
      this.Ill();
   }

   private boolean l() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/llIIlIII.llI Lnet/minecraft/class_243;
      // 04: ifnull 25
      // 07: invokestatic java/lang/System.currentTimeMillis ()J
      // 0a: aload 0
      // 0b: getfield k74/x/llIIlIII.ll J
      // 0e: lsub
      // 0f: ldc2_w 8000
      // 12: lcmp
      // 13: ifgt 25
      // 16: goto 1d
      // 19: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: bipush 1
      // 1e: goto 26
      // 21: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: bipush 0
      // 26: ireturn
   }

   private boolean III(class_310 param1, class_3966 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/llIIlIII.lIl Lk74/x/lllIIlII;
      // 04: invokevirtual k74/x/IIllllIl.IllI ()Ljava/lang/Object;
      // 07: checkcast java/lang/Boolean
      // 0a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0d: ifeq 41
      // 10: aload 1
      // 11: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 14: aload 2
      // 15: invokevirtual net/minecraft/class_3966.method_17782 ()Lnet/minecraft/class_1297;
      // 18: invokevirtual net/minecraft/class_1297.method_73189 ()Lnet/minecraft/class_243;
      // 1b: ldc_w 6.0
      // 1e: invokestatic k74/x/IIIIllIlI.I (Lnet/minecraft/class_1309;Lnet/minecraft/class_243;F)F
      // 21: aload 1
      // 22: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 25: invokevirtual net/minecraft/class_746.method_6032 ()F
      // 28: aload 1
      // 29: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 2c: invokevirtual net/minecraft/class_746.method_6067 ()F
      // 2f: fadd
      // 30: fcmpg
      // 31: iflt 41
      // 34: goto 3b
      // 37: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a: athrow
      // 3b: bipush 0
      // 3c: ireturn
      // 3d: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 40: athrow
      // 41: aload 1
      // 42: aload 2
      // 43: invokestatic k74/x/IIll.lIlIIl (Lnet/minecraft/class_310;Lnet/minecraft/class_3966;)Z
      // 46: ireturn
   }

   private void IIl(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic k74/x/IIllllIl.IIIIl ()[Ljava/lang/String;
      // 03: astore 2
      // 04: aload 1
      // 05: ifnull 16
      // 08: aload 1
      // 09: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0c: ifnonnull 1b
      // 0f: goto 16
      // 12: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: return
      // 17: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a: athrow
      // 1b: aload 1
      // 1c: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 1f: getfield net/minecraft/class_746.field_6012 I
      // 22: aload 0
      // 23: getfield k74/x/llIIlIII.lII I
      // 26: if_icmpge 2e
      // 29: return
      // 2a: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d: athrow
      // 2e: aconst_null
      // 2f: astore 3
      // 30: aload 1
      // 31: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
      // 34: astore 7
      // 36: aload 7
      // 38: instanceof net/minecraft/class_3966
      // 3b: ifeq 78
      // 3e: aload 7
      // 40: checkcast net/minecraft/class_3966
      // 43: astore 4
      // 45: aload 4
      // 47: invokevirtual net/minecraft/class_3966.method_17782 ()Lnet/minecraft/class_1297;
      // 4a: astore 7
      // 4c: aload 7
      // 4e: instanceof net/minecraft/class_1511
      // 51: ifeq 78
      // 54: aload 7
      // 56: checkcast net/minecraft/class_1511
      // 59: astore 5
      // 5b: aload 5
      // 5d: invokevirtual net/minecraft/class_1511.method_31481 ()Z
      // 60: ifne ae
      // 63: aload 5
      // 65: invokevirtual net/minecraft/class_1511.method_5805 ()Z
      // 68: ifeq ae
      // 6b: goto 72
      // 6e: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 71: athrow
      // 72: aload 4
      // 74: astore 3
      // 75: goto ae
      // 78: aload 1
      // 79: getfield net/minecraft/class_310.field_1692 Lnet/minecraft/class_1297;
      // 7c: astore 7
      // 7e: aload 7
      // 80: instanceof net/minecraft/class_1511
      // 83: ifeq ae
      // 86: aload 7
      // 88: checkcast net/minecraft/class_1511
      // 8b: astore 6
      // 8d: aload 6
      // 8f: invokevirtual net/minecraft/class_1511.method_31481 ()Z
      // 92: ifne ae
      // 95: aload 6
      // 97: invokevirtual net/minecraft/class_1511.method_5805 ()Z
      // 9a: ifeq ae
      // 9d: goto a4
      // a0: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a3: athrow
      // a4: new net/minecraft/class_3966
      // a7: dup
      // a8: aload 6
      // aa: invokespecial net/minecraft/class_3966.<init> (Lnet/minecraft/class_1297;)V
      // ad: astore 3
      // ae: aload 3
      // af: ifnonnull b7
      // b2: return
      // b3: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b6: athrow
      // b7: aload 0
      // b8: aload 1
      // b9: aload 3
      // ba: invokespecial k74/x/llIIlIII.III (Lnet/minecraft/class_310;Lnet/minecraft/class_3966;)Z
      // bd: ifeq d8
      // c0: aload 0
      // c1: aload 0
      // c2: aload 1
      // c3: aload 0
      // c4: getfield k74/x/llIIlIII.lll Lk74/x/lIlllIl;
      // c7: invokevirtual k74/x/llIIlIII.IlII (Lnet/minecraft/class_310;Lk74/x/lIlllIl;)I
      // ca: putfield k74/x/llIIlIII.lII I
      // cd: aload 2
      // ce: ifnull ec
      // d1: goto d8
      // d4: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // d7: athrow
      // d8: aload 0
      // d9: aload 1
      // da: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // dd: getfield net/minecraft/class_746.field_6012 I
      // e0: bipush 1
      // e1: iadd
      // e2: putfield k74/x/llIIlIII.lII I
      // e5: goto ec
      // e8: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // eb: athrow
      // ec: return
   }

   @Override
   public void lllIlI(class_1297 var1, byte var2) {
   }

   private void Ill() {
      this.llI = null;
      this.ll = 0L;
   }

   private static String lII(char[] var0, long var1, int var3) {
      int var4 = lllI(-1642667421, 1368789584 ^ 1936688173) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & lllI(-1642667420, 1368789584 ^ -2140807925);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   @Override
   public void IlIII() {
      this.lI();
      this.Ill();
   }

   private int lIl(class_1661 param1, class_1792 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 0f
      // 04: aload 2
      // 05: ifnonnull 15
      // 08: goto 0f
      // 0b: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e: athrow
      // 0f: bipush -1
      // 10: ireturn
      // 11: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: bipush 0
      // 16: istore 3
      // 17: iload 3
      // 18: ldc_w -1642667419
      // 1b: ldc_w -894961100
      // 1e: ldc_w 334346056
      // 21: ixor
      // 22: invokestatic k74/x/llIIlIII.lllI (II)I
      // 25: if_icmpge 47
      // 28: aload 1
      // 29: iload 3
      // 2a: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 2d: aload 2
      // 2e: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 31: ifeq 41
      // 34: goto 3b
      // 37: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a: athrow
      // 3b: iload 3
      // 3c: ireturn
      // 3d: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 40: athrow
      // 41: iinc 3 1
      // 44: goto 17
      // 47: bipush -1
      // 48: ireturn
   }

   private boolean llI(class_310 param1, class_2338 param2) {
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
      // 05: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 08: ifnull 1d
      // 0b: goto 12
      // 0e: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11: athrow
      // 12: aload 2
      // 13: ifnonnull 23
      // 16: goto 1d
      // 19: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: bipush 0
      // 1e: ireturn
      // 1f: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22: athrow
      // 23: aload 1
      // 24: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 27: aload 2
      // 28: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 2b: astore 3
      // 2c: aload 3
      // 2d: getstatic net/minecraft/class_2246.field_10540 Lnet/minecraft/class_2248;
      // 30: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 33: ifne 4d
      // 36: aload 3
      // 37: getstatic net/minecraft/class_2246.field_9987 Lnet/minecraft/class_2248;
      // 3a: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 3d: ifne 4d
      // 40: goto 47
      // 43: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 46: athrow
      // 47: bipush 0
      // 48: ireturn
      // 49: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4c: athrow
      // 4d: aload 0
      // 4e: aload 1
      // 4f: aload 2
      // 50: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
      // 53: invokevirtual k74/x/llIIlIII.I (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 56: ifne 5f
      // 59: bipush 0
      // 5a: ireturn
      // 5b: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5e: athrow
      // 5f: aload 2
      // 60: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
      // 63: invokestatic net/minecraft/class_243.method_24953 (Lnet/minecraft/class_2382;)Lnet/minecraft/class_243;
      // 66: astore 4
      // 68: aload 0
      // 69: getfield k74/x/llIIlIII.lIl Lk74/x/lllIIlII;
      // 6c: invokevirtual k74/x/IIllllIl.IllI ()Ljava/lang/Object;
      // 6f: checkcast java/lang/Boolean
      // 72: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 75: ifeq c3
      // 78: aload 1
      // 79: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 7c: ifnull c3
      // 7f: goto 86
      // 82: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 85: athrow
      // 86: aload 1
      // 87: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 8a: aload 4
      // 8c: ldc_w 6.0
      // 8f: invokestatic k74/x/IIIIllIlI.IlI (Lnet/minecraft/class_1309;Lnet/minecraft/class_243;F)F
      // 92: fstore 5
      // 94: aload 1
      // 95: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 98: invokevirtual net/minecraft/class_746.method_6032 ()F
      // 9b: aload 1
      // 9c: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 9f: invokevirtual net/minecraft/class_746.method_6067 ()F
      // a2: fadd
      // a3: fstore 6
      // a5: fload 6
      // a7: ldc_w 4.0
      // aa: fcmpg
      // ab: ifge c3
      // ae: fload 5
      // b0: fload 6
      // b2: fcmpl
      // b3: iflt c3
      // b6: goto bd
      // b9: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // bc: athrow
      // bd: bipush 0
      // be: ireturn
      // bf: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c2: athrow
      // c3: bipush 1
      // c4: ireturn
   }

   private static void lll() {
      int var0 = 2130317016;
      lI[0] = lII(
         IIlI(lllI(-1642667418, var0 ^ -1520258395), lllI(-1642667417, var0 ^ 1586934282)).toCharArray(), 69953L, lllI(-1642667400, var0 ^ -1554714888)
      );
      lI[1] = lII(IIlI(lllI(-1642667399, var0 ^ -73531408), lllI(-1642667398, var0 ^ -333712354)).toCharArray(), 6431L, lllI(-1642667397, var0 ^ 205103079));
      lI[2] = lII(IIlI(lllI(-1642667396, var0 ^ 1087778492), lllI(-1642667395, var0 ^ -134356253)).toCharArray(), 55377L, lllI(-1642667394, var0 ^ -723331668));
      lI[3] = lII(IIlI(lllI(-1642667393, var0 ^ -182448720), lllI(-1642667408, var0 ^ 1346834313)).toCharArray(), 6525L, lllI(-1642667407, var0 ^ 1666383241));
      lI[4] = lII(IIlI(lllI(-1642667406, var0 ^ 750079822), lllI(-1642667405, var0 ^ 123139807)).toCharArray(), 21558L, lllI(-1642667404, var0 ^ 1569031297));
      lI[5] = lII(IIlI(lllI(-1642667403, var0 ^ 805509226), lllI(-1642667402, var0 ^ -723555636)).toCharArray(), 57832L, lllI(-1642667401, var0 ^ -2132352));
      lI[lllI(-1642667448, var0 ^ -405130531)] = lII(
         IIlI(lllI(-1642667447, var0 ^ -1252407973), lllI(-1642667446, var0 ^ -748986122)).toCharArray(), 72906L, lllI(-1642667445, var0 ^ -1354313727)
      );
      lI[lllI(-1642667444, var0 ^ 917535922)] = lII(
         IIlI(lllI(-1642667443, var0 ^ -1831511671), lllI(-1642667442, var0 ^ 1748829647)).toCharArray(), 51882L, lllI(-1642667441, var0 ^ 372073716)
      );
      lI[lllI(-1642667456, var0 ^ 85364062)] = lII(
         IIlI(lllI(-1642667455, var0 ^ -604653722), lllI(-1642667454, var0 ^ 1321756151)).toCharArray(), 63814L, lllI(-1642667453, var0 ^ -991536783)
      );
      lI[lllI(-1642667452, var0 ^ -1205446227)] = lII(
         IIlI(lllI(-1642667451, var0 ^ 819000002), lllI(-1642667450, var0 ^ 562040471)).toCharArray(), 82326L, lllI(-1642667449, var0 ^ -1813182898)
      );
   }

   @Override
   public void IllIll(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic k74/x/IIll.llIIll ()Z
      // 03: ifeq 0f
      // 06: aload 0
      // 07: invokevirtual k74/x/llIIlIII.lI ()V
      // 0a: return
      // 0b: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e: athrow
      // 0f: aload 0
      // 10: aload 1
      // 11: invokevirtual k74/x/llIIlIII.ll (Lnet/minecraft/class_310;)Z
      // 14: ifne 25
      // 17: aload 0
      // 18: aload 1
      // 19: invokevirtual k74/x/llIIlIII.IIIl (Lnet/minecraft/class_310;)V
      // 1c: aload 0
      // 1d: invokevirtual k74/x/llIIlIII.lI ()V
      // 20: return
      // 21: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: aload 0
      // 26: aload 1
      // 27: invokespecial k74/x/llIIlIII.lIII (Lnet/minecraft/class_310;)V
      // 2a: aload 0
      // 2b: aload 1
      // 2c: invokevirtual k74/x/llIIlIII.IlIl (Lnet/minecraft/class_310;)Z
      // 2f: ifne 3c
      // 32: aload 0
      // 33: aload 1
      // 34: invokevirtual k74/x/llIIlIII.IIIl (Lnet/minecraft/class_310;)V
      // 37: return
      // 38: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b: athrow
      // 3c: aload 0
      // 3d: getfield k74/x/llIIlIII.IllI Lk74/x/lllIIlII;
      // 40: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 43: checkcast java/lang/Boolean
      // 46: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 49: ifeq 6b
      // 4c: aload 1
      // 4d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 50: invokevirtual net/minecraft/class_746.method_24828 ()Z
      // 53: ifne 6b
      // 56: goto 5d
      // 59: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5c: athrow
      // 5d: aload 0
      // 5e: aload 1
      // 5f: invokevirtual k74/x/llIIlIII.IIIl (Lnet/minecraft/class_310;)V
      // 62: aload 0
      // 63: invokevirtual k74/x/llIIlIII.lI ()V
      // 66: return
      // 67: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6a: athrow
      // 6b: aload 0
      // 6c: aload 1
      // 6d: invokevirtual k74/x/llIIlIII.IIl (Lnet/minecraft/class_310;)V
      // 70: aload 0
      // 71: aload 1
      // 72: invokevirtual k74/x/llIIlIII.II (Lnet/minecraft/class_310;)V
      // 75: return
   }

   private static int lllI(int var0, int var1) {
      int var2 = lIII[var0 ^ -1642667416] ^ var1 ^ var0;
      var2 -= 34389;
      var2 ^= 16964;
      var2 += 22672;
      var2 -= 63880;
      var2 -= 25244;
      var2 ^= 7468;
      return var2 - 15632;
   }

   @Override
   public void IlllII(JsonObject var1) {
      super.IlllII(var1);
      this.Il(var1, IlIIllIII.lI(lI[lllI(-1642667432, 1002640669 ^ 976411174)]), this.IlI);
      this.Il(var1, IlIIllIII.lI(lI[lllI(-1642667431, 1002640669 ^ 683932350)]), this.lll);
   }

   private int IIII(lIlllIl var1) {
      double var2 = var1.IIlI();
      double var4 = var1.IlI();

      try {
         if (var2 == var4) {
            return Math.max(1, (int)Math.round(var2));
         }
      } catch (MatchException var6) {
         throw llII(var6);
      }

      return Math.max(1, (int)Math.round(ThreadLocalRandom.current().nextDouble(var2, var4)));
   }

   private void IIIl(class_310 var1) {
      k74.x.IIll.lllIl(var1, this, lllIII.II);
      this.lIIl();
   }

   private static String IIlI(int var0, int var1) {
      int var9 = 1970280734;
      int var2 = (var0 ^ lllI(-1642667433, var9 ^ 2116435431)) & lllI(-1642667480, var9 ^ -1089495540);
      if (III[var2] == null) {
         char[] var3 = IIIl[var2].toCharArray();

         int var4 = switch (var3[0] & lllI(-1642667479, var9 ^ -1476907815)) {
            case 0 -> lllI(-1642667478, var9 ^ -1141781542);
            case 1 -> 2;
            case 2 -> lllI(-1642667477, var9 ^ 411196795);
            case 3 -> lllI(-1642667476, var9 ^ -414667962);
            case 4 -> lllI(-1642667475, var9 ^ 1242164531);
            case 5 -> lllI(-1642667474, var9 ^ 1432959884);
            case 6 -> lllI(-1642667473, var9 ^ 1172743232);
            case 7 -> lllI(-1642667488, var9 ^ -892181136);
            case 8 -> lllI(-1642667487, var9 ^ -1169323221);
            case 9 -> lllI(-1642667486, var9 ^ 121798825);
            case 10 -> lllI(-1642667485, var9 ^ 1026965859);
            case 11 -> lllI(-1642667484, var9 ^ -520079703);
            case 12 -> lllI(-1642667483, var9 ^ 398115109);
            case 13 -> lllI(-1642667482, var9 ^ -601546279);
            case 14 -> lllI(-1642667481, var9 ^ -812049955);
            case 15 -> lllI(-1642667464, var9 ^ 736044177);
            case 16 -> lllI(-1642667463, var9 ^ -1890462326);
            case 17 -> lllI(-1642667462, var9 ^ 92341805);
            case 18 -> lllI(-1642667461, var9 ^ 222770916);
            case 19 -> lllI(-1642667460, var9 ^ 1020377881);
            case 20 -> lllI(-1642667459, var9 ^ -1969350514);
            case 21 -> lllI(-1642667458, var9 ^ -1938102007);
            case 22 -> lllI(-1642667457, var9 ^ -1126996722);
            case 23 -> lllI(-1642667472, var9 ^ -1421553115);
            case 24 -> lllI(-1642667471, var9 ^ 468241127);
            case 25 -> lllI(-1642667470, var9 ^ -339565942);
            case 26 -> lllI(-1642667469, var9 ^ -5585452);
            case 27 -> lllI(-1642667468, var9 ^ -203764796);
            case 28 -> lllI(-1642667467, var9 ^ -1973402682);
            case 29 -> lllI(-1642667466, var9 ^ -697005945);
            case 30 -> lllI(-1642667465, var9 ^ 1847938158);
            case 31 -> lllI(-1642667512, var9 ^ -1195515775);
            case 32 -> lllI(-1642667511, var9 ^ -679978329);
            case 33 -> lllI(-1642667510, var9 ^ 1124641081);
            case 34 -> lllI(-1642667509, var9 ^ 1370987683);
            case 35 -> lllI(-1642667508, var9 ^ 1737863039);
            case 36 -> lllI(-1642667507, var9 ^ 157548711);
            case 37 -> lllI(-1642667506, var9 ^ -512519276);
            case 38 -> lllI(-1642667505, var9 ^ 1533034836);
            case 39 -> lllI(-1642667520, var9 ^ -1315665777);
            case 40 -> lllI(-1642667519, var9 ^ 1132412796);
            case 41 -> lllI(-1642667518, var9 ^ -346431973);
            case 42 -> lllI(-1642667517, var9 ^ 268529044);
            case 43 -> lllI(-1642667516, var9 ^ 1304990247);
            case 44 -> lllI(-1642667515, var9 ^ 1112774138);
            case 45 -> lllI(-1642667514, var9 ^ -1489409621);
            case 46 -> lllI(-1642667513, var9 ^ 1700077238);
            case 47 -> lllI(-1642667496, var9 ^ 1958422705);
            case 48 -> lllI(-1642667495, var9 ^ -1432178958);
            case 49 -> lllI(-1642667494, var9 ^ -645699101);
            case 50 -> lllI(-1642667493, var9 ^ 1961457183);
            case 51 -> lllI(-1642667492, var9 ^ 1860621230);
            case 52 -> lllI(-1642667491, var9 ^ 544722819);
            case 53 -> lllI(-1642667490, var9 ^ -1661356506);
            case 54 -> lllI(-1642667489, var9 ^ -740038802);
            case 55 -> lllI(-1642667504, var9 ^ 1482370618);
            case 56 -> lllI(-1642667503, var9 ^ -2039784750);
            case 57 -> lllI(-1642667502, var9 ^ 43340143);
            case 58 -> lllI(-1642667501, var9 ^ -640713740);
            case 59 -> lllI(-1642667500, var9 ^ -1383495205);
            case 60 -> lllI(-1642667499, var9 ^ -262643928);
            case 61 -> lllI(-1642667498, var9 ^ -373192625);
            case 62 -> lllI(-1642667497, var9 ^ -441902790);
            case 63 -> lllI(-1642667288, var9 ^ 1486629711);
            case 64 -> lllI(-1642667287, var9 ^ -69818762);
            case 65 -> lllI(-1642667286, var9 ^ 403352878);
            case 66 -> lllI(-1642667285, var9 ^ -1041330053);
            case 67 -> 0;
            case 68 -> lllI(-1642667284, var9 ^ -1326515240);
            case 69 -> lllI(-1642667283, var9 ^ 1129819105);
            case 70 -> lllI(-1642667282, var9 ^ 1181500609);
            case 71 -> lllI(-1642667281, var9 ^ 410348494);
            case 72 -> lllI(-1642667296, var9 ^ -375253577);
            case 73 -> lllI(-1642667295, var9 ^ -1037717982);
            case 74 -> lllI(-1642667294, var9 ^ -1279066359);
            case 75 -> lllI(-1642667293, var9 ^ 2008445254);
            case 76 -> lllI(-1642667292, var9 ^ -1418408072);
            case 77 -> lllI(-1642667291, var9 ^ -712477738);
            case 78 -> lllI(-1642667290, var9 ^ 31978692);
            case 79 -> lllI(-1642667289, var9 ^ -1684329894);
            case 80 -> lllI(-1642667272, var9 ^ -2099901062);
            case 81 -> lllI(-1642667271, var9 ^ -1160221685);
            case 82 -> lllI(-1642667270, var9 ^ 539359905);
            case 83 -> lllI(-1642667269, var9 ^ -2061914285);
            case 84 -> lllI(-1642667268, var9 ^ 1522372673);
            case 85 -> lllI(-1642667267, var9 ^ -183771244);
            case 86 -> lllI(-1642667266, var9 ^ -619761220);
            case 87 -> lllI(-1642667265, var9 ^ -1426272524);
            case 88 -> lllI(-1642667280, var9 ^ 969495693);
            case 89 -> lllI(-1642667279, var9 ^ 1559169854);
            case 90 -> lllI(-1642667278, var9 ^ -720018611);
            case 91 -> lllI(-1642667277, var9 ^ -1814822301);
            case 92 -> lllI(-1642667276, var9 ^ 474606166);
            case 93 -> lllI(-1642667275, var9 ^ 1636726194);
            case 94 -> lllI(-1642667274, var9 ^ -2063741776);
            case 95 -> lllI(-1642667273, var9 ^ -320982858);
            case 96 -> lllI(-1642667320, var9 ^ -1774283544);
            case 97 -> lllI(-1642667319, var9 ^ 2072250694);
            case 98 -> lllI(-1642667318, var9 ^ -1424072066);
            case 99 -> 3;
            case 100 -> lllI(-1642667317, var9 ^ -1805286680);
            case 101 -> lllI(-1642667316, var9 ^ 105540164);
            case 102 -> lllI(-1642667315, var9 ^ 302357739);
            case 103 -> lllI(-1642667314, var9 ^ 26898743);
            case 104 -> lllI(-1642667313, var9 ^ 35253701);
            case 105 -> lllI(-1642667328, var9 ^ 2098340005);
            case 106 -> lllI(-1642667327, var9 ^ -1422637849);
            case 107 -> lllI(-1642667326, var9 ^ 1802256876);
            case 108 -> lllI(-1642667325, var9 ^ 792431714);
            case 109 -> lllI(-1642667324, var9 ^ 1840747898);
            case 110 -> lllI(-1642667323, var9 ^ 668773571);
            case 111 -> lllI(-1642667322, var9 ^ -1013557440);
            case 112 -> lllI(-1642667321, var9 ^ 581121071);
            case 113 -> lllI(-1642667304, var9 ^ -489441922);
            case 114 -> lllI(-1642667303, var9 ^ 789173141);
            case 115 -> lllI(-1642667302, var9 ^ -1945006997);
            case 116 -> lllI(-1642667301, var9 ^ -2041225531);
            case 117 -> lllI(-1642667300, var9 ^ -1381605234);
            case 118 -> lllI(-1642667299, var9 ^ -256105460);
            case 119 -> lllI(-1642667298, var9 ^ 518591837);
            case 120 -> lllI(-1642667297, var9 ^ -954964119);
            case 121 -> lllI(-1642667312, var9 ^ -1365569740);
            case 122 -> lllI(-1642667311, var9 ^ -42265506);
            case 123 -> lllI(-1642667310, var9 ^ -894214724);
            case 124 -> lllI(-1642667309, var9 ^ 1881510381);
            case 125 -> lllI(-1642667308, var9 ^ 657481563);
            case 126 -> lllI(-1642667307, var9 ^ 272111362);
            case 127 -> lllI(-1642667306, var9 ^ 1999941698);
            case 128 -> lllI(-1642667305, var9 ^ -1617106232);
            case 129 -> lllI(-1642667352, var9 ^ -1815221176);
            case 130 -> lllI(-1642667351, var9 ^ 1055686013);
            case 131 -> lllI(-1642667350, var9 ^ -377496124);
            case 132 -> lllI(-1642667349, var9 ^ 469513263);
            case 133 -> lllI(-1642667348, var9 ^ -1162318600);
            case 134 -> 5;
            case 135 -> lllI(-1642667347, var9 ^ 571722728);
            case 136 -> lllI(-1642667346, var9 ^ 1464047891);
            case 137 -> lllI(-1642667345, var9 ^ 1924111848);
            case 138 -> lllI(-1642667360, var9 ^ 805693816);
            case 139 -> lllI(-1642667359, var9 ^ -827079595);
            case 140 -> lllI(-1642667358, var9 ^ 261717362);
            case 141 -> lllI(-1642667357, var9 ^ 422180960);
            case 142 -> lllI(-1642667356, var9 ^ -202463350);
            case 143 -> lllI(-1642667355, var9 ^ 540537402);
            case 144 -> lllI(-1642667354, var9 ^ 200661019);
            case 145 -> lllI(-1642667353, var9 ^ 1578521658);
            case 146 -> lllI(-1642667336, var9 ^ 1521431835);
            case 147 -> lllI(-1642667335, var9 ^ 1550930779);
            case 148 -> lllI(-1642667334, var9 ^ 1057847668);
            case 149 -> lllI(-1642667333, var9 ^ 23155139);
            case 150 -> lllI(-1642667332, var9 ^ -251808730);
            case 151 -> lllI(-1642667331, var9 ^ -909529154);
            case 152 -> lllI(-1642667330, var9 ^ 187113458);
            case 153 -> lllI(-1642667329, var9 ^ 2006315431);
            case 154 -> lllI(-1642667344, var9 ^ 712103716);
            case 155 -> lllI(-1642667343, var9 ^ -1816948227);
            case 156 -> lllI(-1642667342, var9 ^ 332025700);
            case 157 -> lllI(-1642667341, var9 ^ -253511890);
            case 158 -> lllI(-1642667340, var9 ^ -243590216);
            case 159 -> lllI(-1642667339, var9 ^ 850944758);
            case 160 -> lllI(-1642667338, var9 ^ 2024934549);
            case 161 -> lllI(-1642667337, var9 ^ 1758428613);
            case 162 -> lllI(-1642667384, var9 ^ -355088871);
            case 163 -> lllI(-1642667383, var9 ^ 818536968);
            case 164 -> lllI(-1642667382, var9 ^ -1122860234);
            case 165 -> lllI(-1642667381, var9 ^ 325868964);
            case 166 -> lllI(-1642667380, var9 ^ 1107535033);
            case 167 -> lllI(-1642667379, var9 ^ 1119222200);
            case 168 -> lllI(-1642667378, var9 ^ 802687288);
            case 169 -> lllI(-1642667377, var9 ^ 1655799187);
            case 170 -> lllI(-1642667392, var9 ^ 1475928940);
            case 171 -> lllI(-1642667391, var9 ^ 1814812259);
            case 172 -> lllI(-1642667390, var9 ^ -1388942291);
            case 173 -> lllI(-1642667389, var9 ^ -379821747);
            case 174 -> lllI(-1642667388, var9 ^ -2096387005);
            case 175 -> lllI(-1642667387, var9 ^ 592157539);
            case 176 -> lllI(-1642667386, var9 ^ -850808895);
            case 177 -> lllI(-1642667385, var9 ^ 809678251);
            case 178 -> lllI(-1642667368, var9 ^ 1114610822);
            case 179 -> lllI(-1642667367, var9 ^ -734680235);
            case 180 -> lllI(-1642667366, var9 ^ -172236910);
            case 181 -> lllI(-1642667365, var9 ^ 420461310);
            case 182 -> lllI(-1642667364, var9 ^ -1733461006);
            case 183 -> lllI(-1642667363, var9 ^ -1488838329);
            case 184 -> lllI(-1642667362, var9 ^ -462281215);
            case 185 -> lllI(-1642667361, var9 ^ 1512130333);
            case 186 -> lllI(-1642667376, var9 ^ -1598538542);
            case 187 -> lllI(-1642667375, var9 ^ 1731884411);
            case 188 -> lllI(-1642667374, var9 ^ 569021855);
            case 189 -> lllI(-1642667373, var9 ^ -1598603079);
            case 190 -> lllI(-1642667372, var9 ^ 881391363);
            case 191 -> lllI(-1642667371, var9 ^ -960522404);
            case 192 -> lllI(-1642667370, var9 ^ -1143248060);
            case 193 -> lllI(-1642667369, var9 ^ 1706657227);
            case 194 -> lllI(-1642667160, var9 ^ 758113422);
            case 195 -> lllI(-1642667159, var9 ^ -458939657);
            case 196 -> lllI(-1642667158, var9 ^ 1663359252);
            case 197 -> lllI(-1642667157, var9 ^ 794054912);
            case 198 -> lllI(-1642667156, var9 ^ -2012689200);
            case 199 -> lllI(-1642667155, var9 ^ 922801100);
            case 200 -> lllI(-1642667154, var9 ^ -9970955);
            case 201 -> lllI(-1642667153, var9 ^ 117705640);
            case 202 -> lllI(-1642667168, var9 ^ 1881037971);
            case 203 -> lllI(-1642667167, var9 ^ -1614810989);
            case 204 -> lllI(-1642667166, var9 ^ 724045529);
            case 205 -> lllI(-1642667165, var9 ^ -1634807768);
            case 206 -> lllI(-1642667164, var9 ^ -98215021);
            case 207 -> lllI(-1642667163, var9 ^ 374711564);
            case 208 -> lllI(-1642667162, var9 ^ -1571468540);
            case 209 -> lllI(-1642667161, var9 ^ 618592672);
            case 210 -> lllI(-1642667144, var9 ^ -1491004063);
            case 211 -> lllI(-1642667143, var9 ^ -1264990251);
            case 212 -> lllI(-1642667142, var9 ^ -1766144672);
            case 213 -> lllI(-1642667141, var9 ^ 1591021862);
            case 214 -> 4;
            case 215 -> lllI(-1642667140, var9 ^ -163957560);
            case 216 -> lllI(-1642667139, var9 ^ 2101370296);
            case 217 -> lllI(-1642667138, var9 ^ -876287096);
            case 218 -> lllI(-1642667137, var9 ^ 1481696820);
            case 219 -> lllI(-1642667152, var9 ^ 1843289171);
            case 220 -> lllI(-1642667151, var9 ^ 1996564126);
            case 221 -> lllI(-1642667150, var9 ^ -1914228832);
            case 222 -> lllI(-1642667149, var9 ^ 2086634894);
            case 223 -> lllI(-1642667148, var9 ^ -1474224426);
            case 224 -> lllI(-1642667147, var9 ^ -17839835);
            case 225 -> lllI(-1642667146, var9 ^ -913448512);
            case 226 -> lllI(-1642667145, var9 ^ -873007424);
            case 227 -> lllI(-1642667192, var9 ^ 1779538657);
            case 228 -> lllI(-1642667191, var9 ^ 894685014);
            case 229 -> lllI(-1642667190, var9 ^ 1696152307);
            case 230 -> lllI(-1642667189, var9 ^ 1518197067);
            case 231 -> lllI(-1642667188, var9 ^ -1706897888);
            case 232 -> lllI(-1642667187, var9 ^ 582146362);
            case 233 -> lllI(-1642667186, var9 ^ -8179018);
            case 234 -> lllI(-1642667185, var9 ^ -1294689788);
            case 235 -> lllI(-1642667200, var9 ^ -84238961);
            case 236 -> lllI(-1642667199, var9 ^ 1835948202);
            case 237 -> lllI(-1642667198, var9 ^ -1106034904);
            case 238 -> lllI(-1642667197, var9 ^ -2101543524);
            case 239 -> lllI(-1642667196, var9 ^ 1119593918);
            case 240 -> lllI(-1642667195, var9 ^ 1224593951);
            case 241 -> 1;
            case 242 -> lllI(-1642667194, var9 ^ 456909046);
            case 243 -> lllI(-1642667193, var9 ^ 1520303193);
            case 244 -> lllI(-1642667176, var9 ^ -434080489);
            case 245 -> lllI(-1642667175, var9 ^ -603682503);
            case 246 -> lllI(-1642667174, var9 ^ -749475570);
            case 247 -> lllI(-1642667173, var9 ^ -1252992431);
            case 248 -> lllI(-1642667172, var9 ^ -818469155);
            case 249 -> lllI(-1642667171, var9 ^ 943455692);
            case 250 -> lllI(-1642667170, var9 ^ 53386838);
            case 251 -> lllI(-1642667169, var9 ^ 821883822);
            case 252 -> lllI(-1642667184, var9 ^ 1485402453);
            case 253 -> lllI(-1642667183, var9 ^ 2088514758);
            case 254 -> lllI(-1642667182, var9 ^ -1236353760);
            default -> lllI(-1642667181, var9 ^ -911067395);
         };
         int var5 = (var1 & lllI(-1642667180, var9 ^ 525671512)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & lllI(-1642667179, var9 ^ 1061967006)) >>> lllI(-1642667178, var9 ^ -722077084)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & lllI(-1642667177, var9 ^ 231238418);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & lllI(-1642667224, var9 ^ 1424344459);
            }
         }

         III[var2] = new String(var3).intern();
      }

      return III[var2];
   }

   private void IIll(class_243 var1) {
      this.llI = var1;
      this.ll = System.currentTimeMillis();
   }

   private int IlII(class_310 param1, lIlllIl param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 2
      // 02: invokevirtual k74/x/llIIlIII.IIII (Lk74/x/lIlllIl;)I
      // 05: istore 3
      // 06: aload 1
      // 07: ifnull 28
      // 0a: aload 1
      // 0b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0e: ifnull 28
      // 11: goto 18
      // 14: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: aload 1
      // 19: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 1c: getfield net/minecraft/class_746.field_6012 I
      // 1f: iload 3
      // 20: iadd
      // 21: goto 29
      // 24: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27: athrow
      // 28: bipush 0
      // 29: ireturn
   }

   public boolean IlIl(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 12
      // 04: aload 1
      // 05: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 08: ifnonnull 18
      // 0b: goto 12
      // 0e: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11: athrow
      // 12: bipush 0
      // 13: ireturn
      // 14: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: aload 0
      // 19: getfield k74/x/llIIlIII.IIlI Lk74/x/IllIII;
      // 1c: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 1f: checkcast k74/x/lllIIIlI
      // 22: invokevirtual k74/x/lllIIIlI.ordinal ()I
      // 25: tableswitch 27 0 2 41 45 108
      // 40: new java/lang/MatchException
      // 43: dup
      // 44: aconst_null
      // 45: aconst_null
      // 46: invokespecial java/lang/MatchException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 49: athrow
      // 4a: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4d: athrow
      // 4e: bipush 1
      // 4f: goto cd
      // 52: aload 1
      // 53: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 56: getfield net/minecraft/class_315.field_1886 Lnet/minecraft/class_304;
      // 59: ifnull 70
      // 5c: aload 1
      // 5d: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 60: getfield net/minecraft/class_315.field_1886 Lnet/minecraft/class_304;
      // 63: invokevirtual net/minecraft/class_304.method_1434 ()Z
      // 66: ifne 85
      // 69: goto 70
      // 6c: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6f: athrow
      // 70: aload 1
      // 71: aload 1
      // 72: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 75: getfield net/minecraft/class_315.field_1886 Lnet/minecraft/class_304;
      // 78: invokestatic k74/x/IIll.IlIllll (Lnet/minecraft/class_310;Lnet/minecraft/class_304;)Z
      // 7b: ifeq 8d
      // 7e: goto 85
      // 81: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 84: athrow
      // 85: bipush 1
      // 86: goto cd
      // 89: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8c: athrow
      // 8d: bipush 0
      // 8e: goto cd
      // 91: aload 1
      // 92: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 95: getfield net/minecraft/class_315.field_1904 Lnet/minecraft/class_304;
      // 98: ifnull af
      // 9b: aload 1
      // 9c: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 9f: getfield net/minecraft/class_315.field_1904 Lnet/minecraft/class_304;
      // a2: invokevirtual net/minecraft/class_304.method_1434 ()Z
      // a5: ifne c4
      // a8: goto af
      // ab: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ae: athrow
      // af: aload 1
      // b0: aload 1
      // b1: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // b4: getfield net/minecraft/class_315.field_1904 Lnet/minecraft/class_304;
      // b7: invokestatic k74/x/IIll.IlIllll (Lnet/minecraft/class_310;Lnet/minecraft/class_304;)Z
      // ba: ifeq cc
      // bd: goto c4
      // c0: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c3: athrow
      // c4: bipush 1
      // c5: goto cd
      // c8: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // cb: athrow
      // cc: bipush 0
      // cd: ireturn
   }

   private int IllI(class_310 param1) {
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
      // 05: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 08: ifnonnull 18
      // 0b: goto 12
      // 0e: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11: athrow
      // 12: bipush -1
      // 13: ireturn
      // 14: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: aload 1
      // 19: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 1c: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 1f: astore 2
      // 20: aload 2
      // 21: invokestatic k74/x/IIlllIllI.Il (Lnet/minecraft/class_1661;)I
      // 24: istore 3
      // 25: iload 3
      // 26: iflt 5c
      // 29: iload 3
      // 2a: ldc_w -1642667223
      // 2d: ldc_w -1653186299
      // 30: ldc_w -355199994
      // 33: ixor
      // 34: invokestatic k74/x/llIIlIII.lllI (II)I
      // 37: if_icmpge 5c
      // 3a: goto 41
      // 3d: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 40: athrow
      // 41: aload 2
      // 42: iload 3
      // 43: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 46: getstatic net/minecraft/class_1802.field_8301 Lnet/minecraft/class_1792;
      // 49: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 4c: ifeq 5c
      // 4f: goto 56
      // 52: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 55: athrow
      // 56: iload 3
      // 57: ireturn
      // 58: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5b: athrow
      // 5c: aload 0
      // 5d: getfield k74/x/llIIlIII.IIl Lk74/x/lllIIlII;
      // 60: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 63: checkcast java/lang/Boolean
      // 66: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 69: ifne 72
      // 6c: bipush -1
      // 6d: ireturn
      // 6e: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 71: athrow
      // 72: aload 0
      // 73: aload 2
      // 74: getstatic net/minecraft/class_1802.field_8301 Lnet/minecraft/class_1792;
      // 77: invokevirtual k74/x/llIIlIII.lIl (Lnet/minecraft/class_1661;Lnet/minecraft/class_1792;)I
      // 7a: ireturn
   }

   private static double Illl(double var0) {
      try {
         if (var0 > 4.0) {
            return Math.max(1.0, Math.min(4.0, (double)Math.round(var0 / 50.0)));
         }
      } catch (MatchException var2) {
         throw llII(var2);
      }

      return Math.max(1.0, Math.min(4.0, var0));
   }

   private void lIII(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 04: getfield net/minecraft/class_746.field_6012 I
      // 07: istore 2
      // 08: aload 0
      // 09: getfield k74/x/llIIlIII.IlII I
      // 0c: iload 2
      // 0d: if_icmpgt 37
      // 10: aload 0
      // 11: getfield k74/x/llIIlIII.IlIl I
      // 14: iload 2
      // 15: bipush 4
      // 16: iadd
      // 17: if_icmpgt 37
      // 1a: goto 21
      // 1d: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: aload 0
      // 22: getfield k74/x/llIIlIII.lII I
      // 25: iload 2
      // 26: bipush 4
      // 27: iadd
      // 28: if_icmpgt 37
      // 2b: goto 32
      // 2e: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: return
      // 33: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36: athrow
      // 37: aload 0
      // 38: aload 1
      // 39: invokevirtual k74/x/llIIlIII.IIIl (Lnet/minecraft/class_310;)V
      // 3c: aload 0
      // 3d: invokevirtual k74/x/llIIlIII.lI ()V
      // 40: return
   }

   private void lIIl() {
      this.Illl = null;
      this.II = -1;
      this.IlII = lllI(-1642667222, -144983014 ^ -1711282732);
   }

   private double lIlI(class_1657 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 12
      // 04: aload 0
      // 05: getfield k74/x/llIIlIII.llI Lnet/minecraft/class_243;
      // 08: ifnonnull 1a
      // 0b: goto 12
      // 0e: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11: athrow
      // 12: ldc2_w Infinity
      // 15: dreturn
      // 16: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19: athrow
      // 1a: new net/minecraft/class_243
      // 1d: dup
      // 1e: aload 1
      // 1f: invokevirtual net/minecraft/class_1657.method_23317 ()D
      // 22: aload 1
      // 23: invokevirtual net/minecraft/class_1657.method_23318 ()D
      // 26: aload 1
      // 27: invokevirtual net/minecraft/class_1657.method_23321 ()D
      // 2a: invokespecial net/minecraft/class_243.<init> (DDD)V
      // 2d: astore 2
      // 2e: aload 2
      // 2f: aload 0
      // 30: getfield k74/x/llIIlIII.llI Lnet/minecraft/class_243;
      // 33: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // 36: invokestatic java/lang/Math.sqrt (D)D
      // 39: dreturn
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var24 = -112115596;
      byte var20 = -1;
      short var13 = 5778;
      String var14 = "\uedf1\ued6b\uedb8\ued8d\uedcb\uedbc\ued1b\ued14\ued29\ued32\ued82\ued07ﭨ颥䅸弫\ueddfꄊ躐黢ᘘ雐혝\udcb1볁栧勭뢥轥꿁厸Ց䩧ꢞ넟厒\uf4c0\uedadȃ暅鈟獗蒫檢钎廿Α豰軺⋫ⷶ咑鿭핻\ue70e\ue336່紾\uef18\ue397恇淞秹ഀ\u0dc9傈䣊㝌\udabe\uf723訿헛\ufff4홢䌄ꬣ᷼㎱\u0ee2臭㮡쓚퀻㿌쭈畝̮ᵆ靊鈟\ued91\ued95\ued19\ued69\ued38\ued7b\uede1\ued74\uedd1\ued17\ued23\ued84\ued51\ued7a\ued3d\uedca\ued6c\ued92\ued8d\uf366\uec9a뤭맸沂䚈襳麊蝋監籖瑳⊇驮ᅱἨ\uedf6ꍩ뱮凿첷낝⋔弇蛇◘\udb87畍〺嘊ꤞ䫖䌞\ued2e䚸쭝욒䘒ﰎ叮꼽蔒냼䥑\uf16e\uf501㘾\ued51שּׂ\uda9eȶ瓀ⵌ蕈沘䨫漧嬇ᴳ\ue955몋獔\ued14⧦俊蹪ꘇ尔\ue934꩑戾홲潧掷뤜㍐鄖\uf12b⿵\uedef쑀ൃ悡猃\ue52eᕗड퓈쎞遇\uefce롘죹膟\u0a0e옲묎ᕔꎶ쁇隔䮵ዓ돂䙶់靟㮼\u0ef7ཱЋ瀂柚\uf3d0땫ᤝ䴡㿿垂ꎝ备䅚Ცℯ账门䥞篪ꄍ";
      char[] var15 = "Ñ\u001d".toCharArray();
      String[] var16 = new String[var15.length];

      while (true) {
         int var17 = 0;
         char var18 = 0;
         char var19 = '\u0000';
         if (var20 == 0) {
            lIIl = var16;
            lIlI = new Object[var16.length];
            int var9 = 493765676;
            byte[] var7 = "\u0012!O'Ô¼¡´üQ\u00195·B\u00adH\u0096É3\u0014¸µo\u0005\u0090Å1Êl©.cEp\u0096\u0080?[ò!\u0004¨\tâú\u000eÒ\u0018R\u008a\u0082[Z3\f×Xá¹(£\u0016\u009b\u008c\u0003¡\u00add\u0006\u001eôh\u0011\u0098ÈZV\u001df\u008b½U%\u0018\n~¨ü6Y\u001fq\b£\u0006,\u00adÄ\u0018\u0003óú\u0004NÑ6DéúÕG\u0012»ý34Í\u0080\u0013À)\\ø\u0006ÖI\u008cp\u001aY}¾HÚÎÏ.Û¼H\u008d¦Ñ^Ë33êoVR\u001a\u0095¾KYÏ\u001baÔø\u0095Â\u000b&v¼Å³H¥\u008b d\u0010¬E¥\u0016ÿÍSùQÜ\u0003I\u0005kt\u008f(\u0082\u0088\u008e¯\u0090y®7K8GÍÀµÊÝmËó<\u0019\b¥2©\u0015ú¹É\u0096¦³hÃT\u001cô½âKt²]=R8ajs&\u001e²ÞÏ\u008a\u0099eX\u008bî\u0088/!¡I\u0005É^Qñx\u008aMø\u0098Cî\u008b\n^\u0011Aø\u0099¼\u0000ºm£`oß³ï÷\u0004<Û12LDØ\u009bñK×\u008fË?\u00160\u0017\te\u0015á³\u0092\u0080*,v\u00899\u0090J\u000fÝÖqByX\u008dyó\u0088^ÁûNn\u0016ÊØèi|\u0097O¬zs»\u001eJÚ6\u008e]M\u0081êíá\u0099\u0084\u001dËñZ\t£\u0096\u0001\u0005Ó\u00934|i\u0014Ì }Û\u0011\u0098,\u001bcN´²\u0091!q\t\u0019µ\u0001ýP§¾Ïë\u0091\u009cüÛÿmW\u008a\u0017zÄè\u00adi\u0013IG\u009dÛoµvgº\u001dP\u0089\u0014æ\b>Õ»ÁÆT´ZÂüQ0<C\u0093\\M\u0004\u0082²p{\\«ý\u0086/\u008a:j\u0082à$#\u0098ï\u008b\u007fÖ~\u009cÃjðå»%ê´ý®R}µpb\t_ô\u009c\u0006h/Æ)ü[\u0080Úc\u0006Q\fu\u001fÈÛ©\u0013 N\u001c®\u0095x_\rßõkî\u0003þz7çÇ\u0091Fç¨\u00adµ^óÓ°e\u0013\u000eî|?T\u001f«A-4,ùðEË§\f\u0081¿\"5]}\u009c>#\u0081 ¶÷î§ m\u0092y\u0018tß^ÏLÑ?vÖ,©Üs\u0010ü\f¬´ÃØ\u0003\u0002\u008b\t-\u0006bå\\õ\u0099\fÏÀ\u0007Ðªæ_©#\u001c;leÝQfê@¹\u0018\u0097\u0087\"prô\u009bD\u001a×cÚ`7Æ\u0005\u008d\u008dZË]\u00175\u0081blÕ*ðC9\u0003ä\fÏm÷\u0093):ô\u0010µÞ\u008b\u001brA]=\u0017×\u009de\u0012\u0084Ù2Û®\u009b¾Æ\u000eÑÕû?5\u009f\u0004\u0007ÔªgG\u0014Úæ\\Ù\u0000\u008b\u009dz\u0018Û\u0081p\\\f\b[¯3 \u0006µwmèàG\u00901\u001d4áX\u0092\\z\u000brGq<º\u000eô\u0086,ÂoÑ9\b\u0089æ1D¿\u0081=ãÈi\u0095¹\u008aeÄ»àÈå.\u008a\u001fv\u0085¡íõ`øL±>MÔ\u001a\u0093¨¡JÎ©\u0084¦Å\u0085Æ\f¾ì8º\u0097\bù\u0090%\u0010ï «\u008a\u0005çÿæÖ>¡\týü\u008bí¨\u001f\u0007Æ¬¦g\u008eªx\u0004çÉ\u0004*C÷h\u0002+\u0006ôæµ?Àü¸ý.Mb\u0081\u009c¦iÜx\u0082|eºÂÊåÃ\u0018Á\u0006êà»\u0007rL\u0010Ä±1Þ\u008e»[+\u009eÆ.Ü\u001cÜ\u0095ÅÆÀµºK\u001bÐ4åe\n$´\nó(´¼«$ÙÑZ\u0004\u0094¸.v¡ñ»-\u009a\"\u0085·[?;\u0093\u001fU9\u0019u\u0002ÿ ÕBÌÐ;@üúÆKâR´fÄØ\"<ÿ¸\u0003²\u0087âï\u0006é+n¤(ÅQKr³\u0012{t·¬(\u0013ýV±k;\u00913&\u0011×ãÆðV¾\u00170Â\u0081 ©0¶Ä\u0089MÒ8f\u0093°Ý\u0090Û&¶\u0007\u0012¬pú\u0095-\u008b!Ù]\u0003=~\u0001\u0095aÁ\t\u0081ç\tn\u0083~ñ\r]¼\u0086\u0017\u000e\u009di¶¢KÝ!\\\u0012h\u0087\u0082ú\f,\t¯à\\ð\bT\\\u001d@Ò× \fQ(C:B\u0090\u0095%`³\u009cþ¨ÜC2\u00003mn\u008bI\u000f}=Í¹b®Y´\u0001\u009b×\u000eb\u0081\br\u0006{î}E\u008aV×o^(H\u009a\bæ\u009az?\u0084·¼=ÿ¤\u0016\u009c\u0018ÈJÃZ\u0096Ê\u0093\u0010h3¬t\u008a,lK\u009c)Ô»\u008fE\t\u008ak$DÝÈ¼\fóÏi\u009bg\u0001%H\u001amätµ¯\u0090´²÷\u0096¾ô\u0080\u0000í2²?¬\u0094®½\u0010)#7*\rÛ'%Z°\u0091CY\u0089\u001a9>p\u008dÎ2¯hõ'Í#Æõ ï®\u0080'8\u008aufÎ@Gä¢?»d\u0018é\\IvÉF\u0002±\"ü£áûÁ>?¢ì\u0090ÙôÛ5ämÝ\u0019!"
               .getBytes("ISO-8859-1");
            int var8 = var7.length / 4;
            lIII = new int[var8];
            byte var10 = 0;
            int var11 = 0;

            do {
               int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
               var12 ^= var9;
               lIII[var11] = var12;
               var10 += 4;
            } while (++var11 < var8);

            String[] var5 = new String[lllI(-1642667430, var24 ^ 823150105)];
            int var3 = 0;
            String var2;
            int var4 = (var2 = IIIII(-2095471935, var24 ^ -471312528)).length();
            int var1 = 5;
            int var26 = -1;

            label100:
            while (true) {
               int var29 = lllI(-1642667429, var24 ^ -1164065634);
               String var10001 = var2.substring(++var26, var26 + var1);
               byte var10002 = -1;

               while (true) {
                  label95: {
                     char[] var45 = var10001.toCharArray();
                     int var10004 = var45.length;
                     int var6 = 0;
                     int var48 = var29;
                     var41 = var45;
                     int var35 = var10004;
                     char[] var57;
                     int var10006;
                     if (var10004 <= 1) {
                        var57 = var45;
                        var10004 = var29;
                        var10006 = var6;
                     } else {
                        var48 = var29;
                        var35 = var10004;
                        if (var10004 <= var6) {
                           break label95;
                        }

                        var57 = var45;
                        var10004 = var29;
                        var10006 = var6;
                     }

                     while (true) {
                        var57[var10006] = (char)(var57[var10006] ^ var10004 ^ switch (var6 % lllI(-1642667425, var24 ^ -1279350956)) {
                           case 0 -> lllI(-1642667440, var24 ^ 317413922);
                           case 1 -> lllI(-1642667439, var24 ^ -1902779473);
                           case 2 -> 2;
                           case 3 -> lllI(-1642667438, var24 ^ 244994828);
                           case 4 -> lllI(-1642667437, var24 ^ 672164857);
                           case 5 -> lllI(-1642667436, var24 ^ 151916678);
                           default -> lllI(-1642667435, var24 ^ -1528329407);
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
                        if ((var26 += var1) >= var4) {
                           IIIl = var5;
                           III = new String[lllI(-1642667426, var24 ^ -750912663)];
                           lI = new String[lllI(-1642667434, var24 ^ 527469059)];
                           lll();
                           return;
                        }

                        var1 = var2.charAt(var26);
                        break;
                     default:
                        var5[var3++] = var50;
                        if ((var26 += var1) < var4) {
                           var1 = var2.charAt(var26);
                           continue label100;
                        }

                        var4 = (var2 = IIIII(-2095471936, var24 ^ 1125006531)).length();
                        var1 = lllI(-1642667428, var24 ^ 400817409);
                        var26 = -1;
                  }

                  var29 = lllI(-1642667427, var24 ^ 1663083746);
                  var10001 = var2.substring(++var26, var26 + var1);
                  var10002 = 0;
               }
            }
         }

         do {
            var19 = var15[var17];
            char[] var21 = var14.substring(var18, var18 + var19).toCharArray();
            int var22 = 0;

            do {
               short var23 = switch (var22 % 6) {
                  default -> 55;
                  case 1 -> 190;
                  case 2 -> 141;
                  case 3 -> 153;
                  case 4 -> 32;
                  case 5 -> 158;
               };
               var21[var22] = (char)(var21[var22] ^ var23 ^ var13);
            } while (++var22 < var21.length);

            var16[var17] = new String(var21).intern();
            var18 += var19;
         } while (++var17 < var15.length);

         var20 = 0;
      }
   }

   private void lIll(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic k74/x/IIllllIl.IIIIl ()[Ljava/lang/String;
      // 003: astore 2
      // 004: aload 0
      // 005: getfield k74/x/llIIlIII.II I
      // 008: iflt 019
      // 00b: aload 0
      // 00c: getfield k74/x/llIIlIII.Illl Lnet/minecraft/class_3965;
      // 00f: ifnonnull 022
      // 012: goto 019
      // 015: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 018: athrow
      // 019: aload 0
      // 01a: invokevirtual k74/x/llIIlIII.lIIl ()V
      // 01d: return
      // 01e: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 021: athrow
      // 022: aload 1
      // 023: ifnull 049
      // 026: aload 1
      // 027: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 02a: ifnull 049
      // 02d: goto 034
      // 030: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 033: athrow
      // 034: aload 1
      // 035: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 038: getfield net/minecraft/class_746.field_6012 I
      // 03b: aload 0
      // 03c: getfield k74/x/llIIlIII.IlII I
      // 03f: if_icmpge 04e
      // 042: goto 049
      // 045: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 048: athrow
      // 049: return
      // 04a: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04d: athrow
      // 04e: aload 0
      // 04f: getfield k74/x/llIIlIII.Illl Lnet/minecraft/class_3965;
      // 052: astore 3
      // 053: aload 0
      // 054: getfield k74/x/llIIlIII.II I
      // 057: istore 4
      // 059: aload 1
      // 05a: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
      // 05d: astore 6
      // 05f: aload 6
      // 061: instanceof net/minecraft/class_3965
      // 064: ifeq 0a3
      // 067: aload 6
      // 069: checkcast net/minecraft/class_3965
      // 06c: astore 5
      // 06e: aload 5
      // 070: invokevirtual net/minecraft/class_3965.method_17783 ()Lnet/minecraft/class_239$class_240;
      // 073: getstatic net/minecraft/class_239$class_240.field_1332 Lnet/minecraft/class_239$class_240;
      // 076: if_acmpne 0a3
      // 079: aload 3
      // 07a: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 07d: aload 5
      // 07f: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 082: invokevirtual net/minecraft/class_2338.equals (Ljava/lang/Object;)Z
      // 085: ifeq 0a3
      // 088: goto 08f
      // 08b: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08e: athrow
      // 08f: aload 0
      // 090: aload 1
      // 091: aload 5
      // 093: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 096: invokevirtual k74/x/llIIlIII.llI (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 099: ifne 0ac
      // 09c: goto 0a3
      // 09f: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a2: athrow
      // 0a3: aload 0
      // 0a4: invokevirtual k74/x/llIIlIII.lIIl ()V
      // 0a7: return
      // 0a8: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ab: athrow
      // 0ac: aload 1
      // 0ad: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0b0: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 0b3: iload 4
      // 0b5: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 0b8: getstatic net/minecraft/class_1802.field_8301 Lnet/minecraft/class_1792;
      // 0bb: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 0be: ifne 0d8
      // 0c1: aload 0
      // 0c2: aload 1
      // 0c3: invokevirtual k74/x/llIIlIII.IIIl (Lnet/minecraft/class_310;)V
      // 0c6: aload 0
      // 0c7: aload 1
      // 0c8: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0cb: getfield net/minecraft/class_746.field_6012 I
      // 0ce: bipush 1
      // 0cf: iadd
      // 0d0: putfield k74/x/llIIlIII.IlIl I
      // 0d3: return
      // 0d4: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d7: athrow
      // 0d8: aload 1
      // 0d9: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0dc: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 0df: invokestatic k74/x/IIll.IIlII (Lnet/minecraft/class_1661;)I
      // 0e2: istore 6
      // 0e4: iload 6
      // 0e6: iload 4
      // 0e8: if_icmpeq 0fd
      // 0eb: aload 1
      // 0ec: iload 4
      // 0ee: bipush 1
      // 0ef: invokestatic k74/x/IIll.lIIIlII (Lnet/minecraft/class_310;IZ)V
      // 0f2: aload 1
      // 0f3: invokestatic k74/x/IIll.IllIIII (Lnet/minecraft/class_310;)V
      // 0f6: goto 0fd
      // 0f9: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fc: athrow
      // 0fd: aload 1
      // 0fe: aload 5
      // 100: invokestatic k74/x/IIll.IlIIII (Lnet/minecraft/class_310;Lnet/minecraft/class_3965;)Z
      // 103: istore 7
      // 105: iload 7
      // 107: ifeq 135
      // 10a: aload 0
      // 10b: aload 5
      // 10d: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 110: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
      // 113: invokestatic net/minecraft/class_243.method_24953 (Lnet/minecraft/class_2382;)Lnet/minecraft/class_243;
      // 116: invokevirtual k74/x/llIIlIII.IIll (Lnet/minecraft/class_243;)V
      // 119: aload 0
      // 11a: aload 0
      // 11b: aload 1
      // 11c: aload 0
      // 11d: getfield k74/x/llIIlIII.IlI Lk74/x/lIlllIl;
      // 120: invokevirtual k74/x/llIIlIII.IlII (Lnet/minecraft/class_310;Lk74/x/lIlllIl;)I
      // 123: putfield k74/x/llIIlIII.IlIl I
      // 126: aload 0
      // 127: invokevirtual k74/x/llIIlIII.lIIl ()V
      // 12a: aload 2
      // 12b: ifnull 14d
      // 12e: goto 135
      // 131: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 134: athrow
      // 135: aload 0
      // 136: aload 1
      // 137: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 13a: getfield net/minecraft/class_746.field_6012 I
      // 13d: bipush 1
      // 13e: iadd
      // 13f: putfield k74/x/llIIlIII.IlIl I
      // 142: aload 0
      // 143: invokevirtual k74/x/llIIlIII.lIIl ()V
      // 146: goto 14d
      // 149: invokestatic k74/x/llIIlIII.llII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14c: athrow
      // 14d: return
   }

   private static Throwable llII(Throwable var0) {
      return var0;
   }

   @Override
   public void IIlIl() {
   }
}
