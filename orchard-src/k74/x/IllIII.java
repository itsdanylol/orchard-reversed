package k74.x;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class IllIII<E extends Enum<E>> extends IIllllIl<E> {
   private static final int[] l;
   private final Class<E> I;

   public IllIII(Object var1, Class<E> var2, E var3) {
      super(var1, (E)var3);
      this.I = var2;
   }

   public void I() {
      Enum[] var2 = this.I.getEnumConstants();
      String[] var10000 = IIllllIl.IIIIl();
      int var3 = this.IllI().ordinal();
      int var4 = 0;
      String[] var1 = var10000;

      while (var4 < var2.length) {
         var3 = (var3 + 1) % var2.length;

         try {
            if (this.II((E)var2[var3])) {
               this.lII((E)var2[var3]);
               return;
            }
         } catch (NumberFormatException var5) {
            throw Ill(var5);
         }

         var4++;
         if (var1 != null) {
            break;
         }
      }
   }

   private static int lIl(int var0, int var1) {
      int var2 = l[var0 ^ -1488743371] ^ var1 ^ var0;
      var2 += 54190;
      var2 += 28115;
      var2 ^= 26435;
      var2 ^= 41430;
      var2 += 52756;
      var2 += 57798;
      var2 += 59586;
      var2 -= 30148;
      var2 -= 4681;
      return var2 - 61406;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private boolean II(E var1) {
      if (var1 instanceof lIllIIIl var2) {
         try {
            if (!var2.II()) {
               return false;
            }
         } catch (NumberFormatException var4) {
            throw Ill(var4);
         }
      }

      try {
         return true;
      } catch (NumberFormatException var3) {
         throw Ill(var3);
      }
   }

   public IllIII(String var1, Class<E> var2, E var3) {
      this((Object)var1, var2, (E)var3);
   }

   private E lI(E var1) {
      return (E)(var1 instanceof lIllIIIl var2 ? var2.Il() : var1);
   }

   public String III(Enum<?> param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 16
      // 04: aload 0
      // 05: getfield k74/x/IllIII.I Ljava/lang/Class;
      // 08: aload 1
      // 09: invokevirtual java/lang/Class.isInstance (Ljava/lang/Object;)Z
      // 0c: ifne 1d
      // 0f: goto 16
      // 12: invokestatic k74/x/IllIII.Ill (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 15: athrow
      // 16: ldc ""
      // 18: areturn
      // 19: invokestatic k74/x/IllIII.Ill (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 1c: athrow
      // 1d: new java/lang/StringBuilder
      // 20: dup
      // 21: bipush 4
      // 22: invokespecial java/lang/StringBuilder.<init> (I)V
      // 25: ldc -1488743371
      // 27: ldc -1526094045
      // 29: ldc -283060480
      // 2b: ixor
      // 2c: invokestatic k74/x/IllIII.lIl (II)I
      // 2f: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 32: aload 1
      // 33: invokevirtual java/lang/Enum.ordinal ()I
      // 36: ldc -1488743372
      // 38: ldc -1526094045
      // 3a: ldc -591838261
      // 3c: ixor
      // 3d: invokestatic k74/x/IllIII.lIl (II)I
      // 40: invokestatic java/lang/Integer.toString (II)Ljava/lang/String;
      // 43: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 46: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 49: areturn
   }

   public E IlI(String param1) {
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
      // 09: invokevirtual java/lang/String.isBlank ()Z
      // 0c: ifeq 1c
      // 0f: goto 16
      // 12: invokestatic k74/x/IllIII.Ill (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 15: athrow
      // 16: aconst_null
      // 17: areturn
      // 18: invokestatic k74/x/IllIII.Ill (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 1b: athrow
      // 1c: aload 0
      // 1d: getfield k74/x/IllIII.I Ljava/lang/Class;
      // 20: invokevirtual java/lang/Class.getEnumConstants ()[Ljava/lang/Object;
      // 23: checkcast [Ljava/lang/Enum;
      // 26: astore 3
      // 27: aload 1
      // 28: invokevirtual java/lang/String.length ()I
      // 2b: bipush 1
      // 2c: if_icmple 79
      // 2f: aload 1
      // 30: bipush 0
      // 31: invokevirtual java/lang/String.charAt (I)C
      // 34: ldc -1488743369
      // 36: ldc -1688875831
      // 38: ldc -1842424326
      // 3a: ixor
      // 3b: invokestatic k74/x/IllIII.lIl (II)I
      // 3e: if_icmpne 79
      // 41: goto 48
      // 44: invokestatic k74/x/IllIII.Ill (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 47: athrow
      // 48: aload 1
      // 49: bipush 1
      // 4a: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 4d: ldc -1488743370
      // 4f: ldc -1688875831
      // 51: ldc 1023486914
      // 53: ixor
      // 54: invokestatic k74/x/IllIII.lIl (II)I
      // 57: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;I)I
      // 5a: istore 4
      // 5c: iload 4
      // 5e: iflt 74
      // 61: iload 4
      // 63: aload 3
      // 64: arraylength
      // 65: if_icmpge 74
      // 68: goto 6f
      // 6b: invokestatic k74/x/IllIII.Ill (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 6e: athrow
      // 6f: aload 3
      // 70: iload 4
      // 72: aaload
      // 73: areturn
      // 74: goto 79
      // 77: astore 4
      // 79: aload 3
      // 7a: astore 4
      // 7c: aload 4
      // 7e: arraylength
      // 7f: istore 5
      // 81: bipush 0
      // 82: istore 6
      // 84: iload 6
      // 86: iload 5
      // 88: if_icmpge a9
      // 8b: aload 4
      // 8d: iload 6
      // 8f: aaload
      // 90: astore 7
      // 92: aload 7
      // 94: aload 1
      // 95: invokestatic k74/x/IllIl.l (Ljava/lang/Enum;Ljava/lang/String;)Z
      // 98: ifeq a2
      // 9b: aload 7
      // 9d: areturn
      // 9e: invokestatic k74/x/IllIII.Ill (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // a1: athrow
      // a2: iinc 6 1
      // a5: aload 2
      // a6: ifnull 84
      // a9: aconst_null
      // aa: areturn
   }

   private static NumberFormatException Ill(NumberFormatException var0) {
      return var0;
   }

   static {
      int var2 = -1646877961;
      byte[] var0 = "\u008f@\u0091A¼Ù\nNÌ\u0012øSc=\t¯".getBytes("ISO-8859-1");
      int var1 = var0.length / 4;
      l = new int[var1];
      byte var3 = 0;
      int var4 = 0;

      do {
         int var5 = (var0[var3] & 255) << 24 | (var0[var3 + 1] & 255) << 16 | (var0[var3 + 2] & 255) << 8 | var0[var3 + 3] & 255;
         var5 ^= var2;
         l[var4] = var5;
         var3 += 4;
      } while (++var4 < var1);
   }

   @Override
   public JsonElement IIl() {
      return new JsonPrimitive(this.III(this.IllI()));
   }

   @Override
   public void ll(JsonElement var1) {
      try {
         if (var1 == null || !var1.isJsonPrimitive()) {
            return;
         }
      } catch (NumberFormatException var4) {
         throw Ill(var4);
      }

      Enum var2 = this.IlI(var1.getAsString());

      try {
         if (var2 != null) {
            this.lII((E)var2);
         }
      } catch (NumberFormatException var3) {
         throw Ill(var3);
      }
   }

   public void lII(E var1) {
      super.Il(this.lI((E)var1));
   }
}
