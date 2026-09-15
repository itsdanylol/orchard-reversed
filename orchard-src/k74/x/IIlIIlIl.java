package k74.x;

import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPromise;
import io.netty.util.concurrent.Future;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.channels.ClosedChannelException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;
import java.util.function.Predicate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2596;
import net.minecraft.class_2724;
import net.minecraft.class_2749;
import net.minecraft.class_2799;
import net.minecraft.class_2868;
import net.minecraft.class_2923;
import net.minecraft.class_2935;
import net.minecraft.class_2799.class_2800;

@Environment(EnvType.CLIENT)
public final class IIlIIlIl extends ChannelDuplexHandler {
   private volatile long II;
   private static final String[] IIIIII;
   private static final int Il = 512;
   private final AtomicBoolean l;
   private static volatile int lI;
   private static final String[] ll;
   private static volatile IllIlII III;
   private volatile ChannelHandlerContext IIl;
   private static final int IlI = 256;
   private static final long Ill;
   private volatile long lII;
   private volatile boolean lIl;
   private final ConcurrentLinkedQueue<IIllIIlI> llI;
   private static final Object[] IIIIIl;
   private static volatile int lll;
   private static final Object IIII;
   private volatile int IIIl;
   private static long IIlI;
   private final AtomicBoolean IIll;
   private static final int IlII = 1024;
   private static volatile boolean IlIl;
   private static volatile IlIllIIl IllI;
   private final AtomicLong Illl;
   private static volatile long lIII;
   private final AtomicBoolean lIIl;
   private static final int lIlI = 1024;
   private static final int lIll = 32;
   private final AtomicBoolean llII;
   private final Set<IIllIIlI> llIl;
   private volatile boolean lllI;
   private static final int[] lllll;
   private static volatile IlIllIIl llll;
   private static final Set<IIlIIlIl> IIIII;
   private static final int IIIIl = 16;
   private volatile long IIIlI;
   private volatile long IIIll;
   private static final ConcurrentHashMap<llll, Boolean> IIlII;
   private static final long IIlIl;
   private volatile boolean IIllI;
   private static volatile boolean IIlll;
   private volatile boolean IlIII;
   private final ConcurrentLinkedQueue<IIllIlIII> IlIIl;
   private static final int IlIlI = 10;
   private static final long IlIll;
   private static final int IllII = 4;
   private static final long IllIl = 60000L;
   private static volatile llIlllI IlllI;
   private static volatile long Illll;
   private final ConcurrentLinkedQueue<IIlIlII> lIIII;
   private static volatile long lIIIl;
   private static volatile boolean lIIlI;
   private static final String[] lIIll;
   private final ConcurrentLinkedQueue<IIlIlllIl> lIlII = new ConcurrentLinkedQueue<>();
   private static volatile IllIIlI lIlIl;
   private final ConcurrentLinkedQueue<IIllllllI> lIllI;
   private volatile boolean lIlll;
   private static final long llIII = 2500L;
   private final ConcurrentLinkedQueue<IIllllllI> llIIl;
   private final ConcurrentLinkedQueue<IIlIlllIl> llIlI = new ConcurrentLinkedQueue<>();
   private static volatile IllIlII I;
   private static volatile boolean llIll;
   private static volatile boolean lllII;
   private static volatile boolean lllIl;
   private final AtomicBoolean llllI;

   private boolean II(ChannelHandlerContext var1) {
      ArrayList var2 = new ArrayList(IlIIlII(-108480384, -1720239887 ^ 1149725382));

      while (var2.size() < IlIIlII(-108480383, -1720239887 ^ -1095511340)) {
         IIllllllI var3;
         IIllllllI var10000 = var3 = this.llIIl.poll();

         try {
            if (var10000 == null) {
               break;
            }

            var2.add(var3);
         } catch (CancellationException var7) {
            throw IIIlI(var7);
         }
      }

      boolean var4 = false;

      for (IIllllllI var6 : var2) {
         var4 |= this.IllIl(var1, var6.II, var6.Il);
      }

      return var4;
   }

   private void Il(ChannelHandlerContext var1) {
      try {
         this.llllI.set(false);
         this.IIll.set(false);
         this.lIIl.set(false);
         ArrayList var2 = new ArrayList();

         while (true) {
            IIllllllI var3;
            IIllllllI var10000 = var3 = this.llIIl.poll();

            try {
               if (var10000 == null) {
                  break;
               }

               var2.add(new IIllI(var3.II, var3.Il, var3.I, null));
            } catch (Exception var10) {
               throw IIIlI(var10);
            }
         }

         while (true) {
            IIllllllI var15;
            IIllllllI var16 = var15 = this.lIllI.poll();

            try {
               if (var16 == null) {
                  break;
               }

               var2.add(new IIllI(var15.II, var15.Il, var15.I, null));
            } catch (Exception var11) {
               throw IIIlI(var11);
            }
         }

         while (true) {
            IIllIIlI var4;
            IIllIIlI var17 = var4 = this.llI.poll();

            try {
               if (var17 == null) {
                  break;
               }

               this.llIl.remove(var4);
               var2.add(new IIllI(var4.Il, var4.I, var4.lI, var4));
            } catch (Exception var12) {
               throw IIIlI(var12);
            }
         }

         while (true) {
            IIlIlllIl var5;
            IIlIlllIl var18 = var5 = this.lIlII.poll();

            try {
               if (var18 == null) {
                  break;
               }

               var2.add(new IIllI(var5.Il, var5.II, var5.l, null));
            } catch (Exception var13) {
               throw IIIlI(var13);
            }
         }

         var2.sort(Comparator.comparingLong(IIllI::II));

         for (IIllI var7 : var2) {
            try {
               this.IllIl(var1, var7.II, var7.Il);
               if (var7.l != null) {
                  this.IIIlIIl(var7.l);
               }
            } catch (Exception var8) {
               throw IIIlI(var8);
            }
         }

         try {
            if (var1.channel().isOpen()) {
               var1.flush();
            }
         } catch (Exception var9) {
            throw IIIlI(var9);
         }

         this.lIl = false;
         llIllI();
      } catch (Exception var14) {
      }
   }

   private void lI(boolean var1, class_2596 var2, boolean var3, Future var4) throws Exception {
      try {
         if (!var4.isSuccess()) {
            return;
         }
      } catch (Exception var6) {
         throw IIIlI(var6);
      }

      try {
         if (var1) {
            this.IIlll(var2);
         }
      } catch (Exception var7) {
         throw IIIlI(var7);
      }

      try {
         if (var3) {
            this.IIIIIl(var2);
         }
      } catch (Exception var5) {
         throw IIIlI(var5);
      }
   }

   private static int IlIIlII(int var0, int var1) {
      int var2 = lllll[var0 ^ -108480384] ^ var1 ^ var0;
      var2 ^= 11850;
      var2 += 9785;
      var2 ^= 64701;
      var2 += 48508;
      var2 += 644;
      var2 -= 46190;
      var2 -= 56709;
      var2 ^= 44170;
      var2 += 41269;
      return var2 + 38822;
   }

   private static boolean ll(class_2596<?> param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: instanceof net/minecraft/class_2868
      // 04: ifne 15
      // 07: aload 0
      // 08: instanceof net/minecraft/class_2828
      // 0b: ifeq 1b
      // 0e: goto 15
      // 11: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: bipush 1
      // 16: ireturn
      // 17: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a: athrow
      // 1b: aload 0
      // 1c: instanceof net/minecraft/class_2824
      // 1f: ifne 28
      // 22: bipush 0
      // 23: ireturn
      // 24: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27: athrow
      // 28: invokestatic k74/x/IIIIIllII.III ()Lk74/x/IIIIIllII;
      // 2b: astore 1
      // 2c: aload 1
      // 2d: ifnonnull 38
      // 30: aconst_null
      // 31: goto 3c
      // 34: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37: athrow
      // 38: aload 1
      // 39: invokevirtual k74/x/IIIIIllII.II ()Lk74/x/lIIIlIlI;
      // 3c: astore 2
      // 3d: aload 2
      // 3e: ifnull 58
      // 41: aload 2
      // 42: aload 0
      // 43: invokevirtual k74/x/lIIIlIlI.IlIIlll (Lnet/minecraft/class_2596;)Z
      // 46: ifeq 58
      // 49: goto 50
      // 4c: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4f: athrow
      // 50: bipush 1
      // 51: goto 59
      // 54: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 57: athrow
      // 58: bipush 0
      // 59: ireturn
   }

   private boolean III(IIllIlIII var1) {
      try {
         if (this.IlIIl.size() >= IlIIlII(-108480382, -500558039 ^ 1767719515)) {
            return false;
         }
      } catch (CancellationException var2) {
         throw IIIlI(var2);
      }

      this.IlIIl.offer(var1);
      return true;
   }

   private void IIl(ChannelHandlerContext var1) {
      this.lIIl(var1);
   }

   private static boolean IlI(Object param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc_w 714704066
      // 03: istore 2
      // 04: aload 0
      // 05: ifnonnull 0e
      // 08: bipush 0
      // 09: ireturn
      // 0a: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d: athrow
      // 0e: aload 0
      // 0f: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 12: invokevirtual java/lang/Class.getSimpleName ()Ljava/lang/String;
      // 15: astore 1
      // 16: aload 1
      // 17: ldc_w -108480381
      // 1a: iload 2
      // 1b: ldc_w -1202613523
      // 1e: ixor
      // 1f: invokestatic k74/x/IIlIIlIl.IlIIlII (II)I
      // 22: ldc_w -108480380
      // 25: iload 2
      // 26: ldc_w -80931824
      // 29: ixor
      // 2a: invokestatic k74/x/IIlIIlIl.IlIIlII (II)I
      // 2d: invokestatic k74/x/IIlIIlIl.llIll (II)Ljava/lang/String;
      // 30: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 33: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 36: ifne e1
      // 39: aload 1
      // 3a: ldc_w -108480379
      // 3d: iload 2
      // 3e: ldc_w 757705253
      // 41: ixor
      // 42: invokestatic k74/x/IIlIIlIl.IlIIlII (II)I
      // 45: ldc_w -108480378
      // 48: iload 2
      // 49: ldc_w 1818508663
      // 4c: ixor
      // 4d: invokestatic k74/x/IIlIIlIl.IlIIlII (II)I
      // 50: invokestatic k74/x/IIlIIlIl.llIll (II)Ljava/lang/String;
      // 53: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 56: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 59: ifne e1
      // 5c: goto 63
      // 5f: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 1
      // 64: ldc_w -108480377
      // 67: iload 2
      // 68: ldc_w -845712018
      // 6b: ixor
      // 6c: invokestatic k74/x/IIlIIlIl.IlIIlII (II)I
      // 6f: ldc_w -108480376
      // 72: iload 2
      // 73: ldc_w 787697258
      // 76: ixor
      // 77: invokestatic k74/x/IIlIIlIl.IlIIlII (II)I
      // 7a: invokestatic k74/x/IIlIIlIl.llIll (II)Ljava/lang/String;
      // 7d: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 80: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 83: ifne e1
      // 86: goto 8d
      // 89: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8c: athrow
      // 8d: aload 1
      // 8e: ldc_w -108480375
      // 91: iload 2
      // 92: ldc_w 834705721
      // 95: ixor
      // 96: invokestatic k74/x/IIlIIlIl.IlIIlII (II)I
      // 99: ldc_w -108480374
      // 9c: iload 2
      // 9d: ldc_w 1094459122
      // a0: ixor
      // a1: invokestatic k74/x/IIlIIlIl.IlIIlII (II)I
      // a4: invokestatic k74/x/IIlIIlIl.llIll (II)Ljava/lang/String;
      // a7: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // aa: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // ad: ifne e1
      // b0: goto b7
      // b3: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b6: athrow
      // b7: aload 1
      // b8: ldc_w -108480373
      // bb: iload 2
      // bc: ldc_w 1386286533
      // bf: ixor
      // c0: invokestatic k74/x/IIlIIlIl.IlIIlII (II)I
      // c3: ldc_w -108480372
      // c6: iload 2
      // c7: ldc_w 371313776
      // ca: ixor
      // cb: invokestatic k74/x/IIlIIlIl.IlIIlII (II)I
      // ce: invokestatic k74/x/IIlIIlIl.llIll (II)Ljava/lang/String;
      // d1: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // d4: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // d7: ifeq e9
      // da: goto e1
      // dd: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // e0: athrow
      // e1: bipush 1
      // e2: goto ea
      // e5: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // e8: athrow
      // e9: bipush 0
      // ea: ireturn
   }

   public static long Ill() {
      return IIlI;
   }

   public static void lII() {
      lllII = true;
      llIll = true;
   }

   private void lIl(ChannelHandlerContext var1, long var2) {
      this.llllII(var1, var2);
   }

   private void llI(long param1, IlIllIIl param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/IIlIIlIl.IIl Lio/netty/channel/ChannelHandlerContext;
      // 04: astore 4
      // 06: aload 4
      // 08: ifnull 1c
      // 0b: aload 0
      // 0c: getfield k74/x/IIlIIlIl.llIIl Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 0f: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.isEmpty ()Z
      // 12: ifeq 21
      // 15: goto 1c
      // 18: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b: athrow
      // 1c: return
      // 1d: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: aload 0
      // 22: aload 4
      // 24: lload 1
      // 25: aload 3
      // 26: lconst_0
      // 27: invokevirtual k74/x/IIlIIlIl.llIl (Lio/netty/channel/ChannelHandlerContext;JLk74/x/IlIllIIl;J)V
      // 2a: return
   }

   private IIllllllI lll(Object var1, ChannelPromise var2, IlIllIIl var3) {
      return new IIllllllI(var1, var2, var3, System.nanoTime(), this.Illl.incrementAndGet());
   }

   private long IIII(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: instanceof net/minecraft/class_2596
      // 04: ifeq 0f
      // 07: aload 1
      // 08: checkcast net/minecraft/class_2596
      // 0b: astore 2
      // 0c: goto 11
      // 0f: lconst_0
      // 10: lreturn
      // 11: aload 2
      // 12: instanceof net/minecraft/class_2856
      // 15: ifeq 1e
      // 18: lconst_0
      // 19: lreturn
      // 1a: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: lconst_0
      // 1f: lstore 3
      // 20: invokestatic k74/x/IIIIlIIIl.IIlIl ()Lk74/x/IIIIlIIIl;
      // 23: astore 5
      // 25: aload 5
      // 27: invokevirtual k74/x/IIIIlIIIl.IIlll ()Z
      // 2a: ifeq 56
      // 2d: aload 5
      // 2f: invokevirtual k74/x/IIIIlIIIl.llII ()Z
      // 32: ifeq 56
      // 35: goto 3c
      // 38: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b: athrow
      // 3c: aload 2
      // 3d: invokeinterface net/minecraft/class_2596.method_55943 ()Z 1
      // 42: ifne 56
      // 45: goto 4c
      // 48: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4b: athrow
      // 4c: lload 3
      // 4d: aload 5
      // 4f: invokevirtual k74/x/IIIIlIIIl.IIIll ()J
      // 52: invokestatic java/lang/Math.max (JJ)J
      // 55: lstore 3
      // 56: aload 0
      // 57: invokevirtual k74/x/IIlIIlIl.IlIIIIl ()Lk74/x/Ill;
      // 5a: astore 6
      // 5c: aload 2
      // 5d: instanceof net/minecraft/class_2827
      // 60: ifeq 79
      // 63: aload 6
      // 65: ifnull 79
      // 68: goto 6f
      // 6b: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6e: athrow
      // 6f: lload 3
      // 70: aload 6
      // 72: invokevirtual k74/x/Ill.II ()J
      // 75: invokestatic java/lang/Math.max (JJ)J
      // 78: lstore 3
      // 79: lload 3
      // 7a: lreturn
   }

   private long IIIl(long var1, long var3, long var5) {
      try {
         if (var1 <= 0L) {
            return 0L;
         }
      } catch (CancellationException var7) {
         throw IIIlI(var7);
      }

      return Math.max(0L, var1 + var3 - var5);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var18 = 178386581;
      char[] var10001 = "ᜥᛒ".toCharArray();
      byte var14 = -1;
      char[] var9 = var10001;
      String var8 = "ᚉᙖᙔᛤᙢᘽᚉᙴ᚛ᛣᛴᚂᬾᚁᚔᘝᛤᚤᬎᘟᙿᘣᘿᚃᙷᘼ᚛ᚃᙆᘭᙞᘗᯌᙖ᮪᭡ᚑᘖᕣᙠᙫ᭝ᘭᙷᙅᛗᙵᚅᖠᚃᕤᛡᛮᙔᘚᛖ\u1bf5ᮑᮞᚸᙿᚑᘬᙐᘶᛛᬍ᭭ᘍᛓᚴ᭮ᙁᚤᘰᮨᔃᘙ\u16faᚾᚭᘛᔀᙶᚔᘃᚖᙿᘻᘫᘗᛝᛯᙔᙶᛙᙠᚮᕨᙜᙣᘕ᙭ᚒ\u16fd᙮ᙻᙍᚊᘢᘾᮨᙫ᭑ᘤᘏᙲᚡᙲᛥᙉᛡᛧᔽᚋ᚛ᛯᚸᙓᘈᙢ᭪ᘰ\u16faᘤᙍᘽᙻᛟᘢᯍᙚᮒᘡ\u16fcᚄᘞ\u16fb᛭ᘭᬶᘶᯌᮖᔃᙒᙟᘥᕦᘨᙕᘙᚻ᭬ᙉᮖᘱ᚛ᛘᛶᘷᚧᛒᙱᖡᘵᙉᙾᙵᙅᙉᘷᚘᙈᘨᘥᙀᘇᯌᘬᛁᘼᘣᚶᙆᙙᙘᗀᘒᛕᚵᙓᙧᙖᬅᘕᚴᘇᘕᛗᛌᗏᙽᚹᚸᙲᙉᚈᘾᮟᮧᙷᛚ᭥ᚳᙼᚃ\u16feᘱᗀᚣ\u16f9ᘠᙿᙞᙑᕥᮒᚈᘿᘒᙱᚰᙅᛸᙖᙷᛓᚊᮯ᛬ᘻᙸᘚᘁᛯᛩ᭥᚛ᛰᚺᙉᛰᙗᙵᘪᙖᛆᙁᘕᙥᘿᚷᛶᙽᗄᘠᘆᙃᚶᘬ\u16feᘕᚄᯄᛁᮩᘩᛄᚱ᚜ᛧᛍᘎᛜᗋᕢᘅᚻᘟᚏᚋᘉᛲᙺᘤᬹᛳᚪᙆᔇᙎᙾᘢᙍ\u16fdᙑᛝᙯ᭦\u1bf9ᛙᘤᘭᘲᘤᘪᚌᙓᗆᘐ\u16fdᘫᘨᮨᚬᖬᛱᚠᛑᮓᘹᚷᙕᘆᘘᘫᘭᙛᛸᘷᛷᙹᚇᘯᙷᘉᚻᚏᚈᬽ᭥ᛥ᮪ᚾᗀᚄᘒᚫᙵᔎᚁᙼᚃᯂ᙮ᘸᚮᙜᚠᕪᙏᛩ᭭ᘵᙌᚲᙷᚐᘚᙾᚱᘭ᛭ᙢᚇᛕ᭝ᕣ᛫ᔌᛙᙗᙆᕭᮟᙤᗅ\u16feᙀᙕᙛ᛬ᛕᘴᙖᚼᘭᚇᘦᚌᘹᚠᚣᛈᛪᙂᚌᕤ\u16ffᘝᛲᖯ᭣ᚉᘁᘝᙼᙝᚭᙁᔺᮭᛴᛤᘱᙒᘪᙅ᭯ᬿᘯᘑᚢᙕᙉᚲᘅᛗᙼᘲᘻ黱麮鸣鸓黬鸉鸝黸鹀麠黯鸚鹞鸉菳麂鸧鸯黎鹌鹴鴳麅鸧鹌麏鵢黰麉鹈黮鸜黾莞黛黮黏麨菆黳黦麦麉鸣麗鴽麽鹿黿黿黾麰鹩麃黃黱麈";
      short var7 = 5867;
      String[] var10 = new String[var9.length];

      while (true) {
         int var11 = 0;
         int var12 = 0;
         int var13 = 0;
         if (var14 == 0) {
            IIIIII = var10;
            IIIIIl = new Object[var10.length];
            int var22 = 0;
            byte var25 = 0;
            lllll = new int[327];
            byte[] var10002 = "¨\u009d\u0003¬R©»¿þ\u001a:á\u0018Z\u0092,¤ÙLl\u008d\"ªï3\u0090ã0m\u009ctÐq\u0007\n\u0015\u0091Ë\u0098\u008a\u001eÊ¤½òª\frIÕMH\u008avCN\u0093©v0\u0004\u0099\u0090\u000b]t7¾²#é.É\u000eÔ\u009a\u0087 \u008cG]ÃÀP¾æ-ILYWº<Nr¿îßÀ<¤\u0016¬Ç\u0005å$!S¯ÖÿØ¨ß7ÕÊ96æ[\u0002ýÅ.úÙ\u0013Êa\u007fÂ§N|¤\u008e\u0084G°\u0091e2¸\u0088\u00986öóè¢\u009cÖO\u001c\u0095\u000eQ´\u0095Ý\u0099ñÐHÃá\u0016\u007f\u0090GÒ\u008eÌ\u00905È\u0080Ý\\2ç2\u0098\u0011Éå@\u0002%S³\u0084Ö×¢¤\u001e\u001f\u0084«®\u0016û\u0093Ï\u001b\u0084ÒÅ©×Ó´\u0089Ü>Ò¾iõ\u0004\u0010È:'\u001f0\u00009ã(Ùh\u0004=Ó7\u00adÞ\u0004£Ð·\u0016_¸\u009f«pïé7\t)@\u0014Ì¹F\u0080¦¹±þy\u0012\u0012Õ\u0007ñô\u0002]b\u0092 éÜª\u0004\u007fW/vå\u0012ñ¥÷\u00026'h\u0006(ê²þµ¤¥·ª\u001fä~\u001c¨&õ\u001d9¦Ë\"ÍdWiþ±;Ø_v\u0084Ò?l\u008dqàd¦åÁ¼\u000bh\u008dX\u008c\u001d(\u001b¶¼ qõ_¬ÈØäMFt\u0001\u001bèð¾áÔiÉtýÿËtò?q4\u0019\u008a\u0016I~û¼íõÔZ\u008b\u0094`ÅÍ\u0000Ü*7\u0000\u0019ðUÂó\u009eo®\u0005Ô{Ñª)?\u0099V¯E>ä).ß\u0010¼\u0099M\u0018÷, «kó-dÆÍ\u0002ÕÀ\u001bø\u0003¤§ïq\u0018õ²\u0017c9Z\u0087Ýð9\u0081PØBÉ\u009fXJk³ «ÊÜÍ\u001eÕ·`\u008a):ÚÑùøG9íÔ\u0098\u0001\u0012û`[\\ÍÙWm\u0088þÓu\u0094_¡Ä\u0095å\u008ecàO[%D\u0097à0\u0012lA|äd\u008e\u0005P=¡&ËHÏÀFÃ,Ê\u000fì\u0019ê\u001a+·é;\u0080\u0013\u0003ÃÕ^áè\u001bãÇ!\u00ad®(ý\u0095Ð\u0019\u0003ì¬\u0096Ç$[JI$Ö©º©®sç.À\"t\u001e\u0006®¸Kº¼Ä\u000fX\nAY1ÝÛ©\u001cE\u0014\u0015f\u001c}\u008bsTu\u0089\u0013rú\u008fÆôòÞ>PáÉK\u0090\u001b&MVTÌy{h#\u0089N\u0019\u008fÐ\u0010×\u009cÖ_³\u0010S_äçe\u0014\u000e\u0016\u0004\u000f<`UnKë%zëÒïó»¢\u0084\u0081µº5\u001fq\u0010\u0085\u009bJ\u009fïJ\"1\u0086Ë\u0017¨#\u0010Ê¥~h¥ÀTÌ6ÿ.ÞO£óõAÏg\u000eêü\u0001\u0083Ý\fvc[Ï=\u0013ÂcÑùr\u0013\u0086\u0088±\u0010\u009c\u0096úý\"\u0084Y/\u0010\u00051è\u007fù~\u0098\u009d\u0095i«\u0017<ÑÂ\u0098×~¿3ÃÅã\u001eÓ\u0017Z\u0004\u001dW$îm\naÅ\n×_û,Úg8\ng$]haì0ô\u0090\u0012tPÕÓî¤Z\u0010\u008e\u0085\u001eÄ\u00061x\u0019ã/}D±8ZW\u0002\u0007\u0083¼íÎ\u007f\u0085\u0018pPl\u0011äsÏ%\u001e2\u001bÚ\u0003S£Cõÿ\u001eãhõlÒ\u008fL\u0097\u000f\u000f\u0088½\u0000\u0016l\u009en+ ×\u00adçj·\u0083Ê0úrvÏ\u001fÉ\u0011\u0006Â9\u0088ý#\u001dÎ®36\u0018¡ÅÍ4\u00adû>ïB\u001bÀji\r'ðA/\rm©\tÌË:\u008eÎ\\\tÆY ±,z¤ì3À\u00037Ë¬ä)íÚ2ÞµÅyC#3\u0015Ä¯îÿ\u0098Cda\u009b\u0011\u0016íçjÄ`eî\u008c\u0081ßhÛå\u0001\u00143ÜD\u0097ì¢gMHæ¨Ëô\u009a\u009dªC\u0082eÙ¶ÂºÇ¢<C©\"~¬\u0082>/\u0014Åï}7hð\u0083C\u00ad`ðå\u0085ZÎ¾<\u0005¯\\\u001cøK$YP\u0083\u0005ß\u008dÅUµMM4>½ï0ä\u0016í\u000bêÒÜà\u009céß\u000b¿<m°ã\u000eýå7\u0006\u0010j \u0084sùÙ;+gûQÉBß\u0012Ui\u000fÏÚ\u0097iúî\"D\u007fõpÂ7tK\b\u0093ËNT\u0086¤{¿\u000fäFëL|+©!´'n¤gxi\u001a5ä+Ø\u0002å\u0004&\u0012Á0\u0094*¼\u0080%u|\u009d=îÿKÐÌ=[ëtM\u00196Öi\u009d(A¬ôÅ'%\u0098\u0002k\u009e\u001cÓ\u0081É¿\u0086\u000e×O¦@\u009aBÉÓhÞ\u0013\u0000h@àTyÈ\u0007\u008d\u0007'T\u0001Òå¬A\u009a²ª\u0098)ÇC\u008bÑ\b\u008bOZRÖÈy\u0087ß\u00185²]}\u0007µ¨ÜÝ¨\u0094\u000f)\u0015\u0082D\u0000¢\u0012Y\u001cØ\u001dCWÊéL.èmÂrîIUq\u0082V{ûè¥ø?q²v\u009e\u0094OHE8\u001eJ5Î±éæ]\u0083I"
               .getBytes("ISO-8859-1");

            int var56;
            do {
               lllll[var22] = ((var10002[var25] & 255) << 24 | (var10002[var25 + 1] & 255) << 16 | (var10002[var25 + 2] & 255) << 8 | var10002[var25 + 3] & 255)
                  ^ 1931107773;
               var22 += 1;
               var56 = var25 + 4;
               var25 += 4;
            } while (var56 < var10002.length);

            String[] var5 = new String[IlIIlII(-108480102, var18 ^ 958917217)];
            int var3 = 0;
            String var2;
            int var4 = (var2 = IlIIlIl(var18 ^ 579665413, 34949, 3438)).length();
            int var1 = IlIIlII(-108480101, var18 ^ 1415939995);
            int var20 = -1;

            label101:
            while (true) {
               var22 = IlIIlII(-108480100, var18 ^ 1487012780);
               String var28 = var2.substring(++var20, var20 + var1);
               byte var40 = -1;

               while (true) {
                  label96: {
                     char[] var58 = var28.toCharArray();
                     int var70 = var58.length;
                     int var6 = 0;
                     var56 = var22;
                     var45 = var58;
                     int var33 = var70;
                     char[] var82;
                     int var89;
                     if (var70 <= 1) {
                        var82 = var58;
                        var70 = var22;
                        var89 = var6;
                     } else {
                        var56 = var22;
                        var33 = var70;
                        if (var70 <= var6) {
                           break label96;
                        }

                        var82 = var58;
                        var70 = var22;
                        var89 = var6;
                     }

                     while (true) {
                        var82[var89] = (char)(var82[var89] ^ var70 ^ switch (var6 % IlIIlII(-108480096, var18 ^ -1090768381)) {
                           case 0 -> IlIIlII(-108480095, var18 ^ -1018395714);
                           case 1 -> IlIIlII(-108480094, var18 ^ 55679598);
                           case 2 -> IlIIlII(-108480093, var18 ^ -2138605797);
                           case 3 -> IlIIlII(-108480092, var18 ^ 1117212005);
                           case 4 -> 4;
                           case 5 -> IlIIlII(-108480091, var18 ^ 852856835);
                           default -> IlIIlII(-108480090, var18 ^ 374443663);
                        });
                        var6++;
                        if (var56 == 0) {
                           var89 = var56;
                           var82 = var45;
                           var70 = var56;
                        } else {
                           if (var33 <= var6) {
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
                           ll = var5;
                           lIIll = new String[IlIIlII(-108480097, var18 ^ -1698136054)];
                           IIlIl = TimeUnit.MILLISECONDS.toNanos(1L);
                           IlIll = TimeUnit.MILLISECONDS.toNanos(12L);
                           Ill = TimeUnit.MILLISECONDS.toNanos(25L);
                           IIIII = ConcurrentHashMap.newKeySet();
                           IIII = new Object();
                           IlIl = false;
                           lllII = false;
                           llIll = false;
                           IIlll = false;
                           llll = IlIllIIl.II;
                           lIlIl = IllIIlI.I;
                           lIII = 500L;
                           IIlII = new ConcurrentHashMap<>();
                           return;
                        }

                        var1 = var2.charAt(var20);
                        break;
                     default:
                        var5[var3++] = var63;
                        if ((var20 += var1) < var4) {
                           var1 = var2.charAt(var20);
                           continue label101;
                        }

                        var4 = (var2 = IlIIlIl(var18 ^ 980068489, 6302, 3439)).length();
                        var1 = IlIIlII(-108480099, var18 ^ 128302080);
                        var20 = -1;
                  }

                  var22 = IlIIlII(-108480098, var18 ^ -1679327693);
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
               short var17 = switch (var16 % 6) {
                  default -> 92;
                  case 1 -> 57;
                  case 2 -> 147;
                  case 3 -> 207;
                  case 4 -> 248;
                  case 5 -> 58;
               };
               var15[var16] = (char)(var15[var16] ^ var17);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   private void IIlI(Throwable var1) {
      this.Illll(this.llIlI, var1);
      this.Illll(this.lIlII, var1);
      this.IIlIllI(var1);
      this.IIIll(this.llIIl, var1);
      this.IIIll(this.lIllI, var1);
   }

   private void IIll() {
      int var1 = this.llI.size();
      lI = var1;
      lll = Math.max(lll, var1);
   }

   public void write(ChannelHandlerContext param1, Object param2, ChannelPromise param3) throws Exception {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: invokestatic k74/x/IIllllI.II ()Z
      // 003: ifeq 014
      // 006: aload 1
      // 007: aload 2
      // 008: aload 3
      // 009: invokeinterface io/netty/channel/ChannelHandlerContext.write (Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)Lio/netty/channel/ChannelFuture; 3
      // 00e: pop
      // 00f: return
      // 010: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 013: athrow
      // 014: aload 0
      // 015: aload 1
      // 016: aload 2
      // 017: aload 3
      // 018: invokevirtual k74/x/IIlIIlIl.lIlIII (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)Lio/netty/channel/ChannelPromise;
      // 01b: astore 3
      // 01c: aload 2
      // 01d: invokestatic k74/x/IIlIIlIl.lIlllI (Ljava/lang/Object;)Z
      // 020: ifeq 05a
      // 023: aload 0
      // 024: new java/util/concurrent/CancellationException
      // 027: dup
      // 028: ldc_w -108480371
      // 02b: ldc_w 608608458
      // 02e: ldc_w 614623105
      // 031: ixor
      // 032: invokestatic k74/x/IIlIIlIl.IlIIlII (II)I
      // 035: ldc_w -108480370
      // 038: ldc_w 608608458
      // 03b: ldc_w -1031611175
      // 03e: ixor
      // 03f: invokestatic k74/x/IIlIIlIl.IlIIlII (II)I
      // 042: invokestatic k74/x/IIlIIlIl.llIll (II)Ljava/lang/String;
      // 045: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 048: invokespecial java/util/concurrent/CancellationException.<init> (Ljava/lang/String;)V
      // 04b: invokevirtual k74/x/IIlIIlIl.IIIIIIl (Ljava/lang/Throwable;)V
      // 04e: aload 0
      // 04f: aload 1
      // 050: aload 2
      // 051: aload 3
      // 052: invokevirtual k74/x/IIlIIlIl.IllIII (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)V
      // 055: return
      // 056: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 059: athrow
      // 05a: aload 2
      // 05b: instanceof net/minecraft/class_2813
      // 05e: ifne 06f
      // 061: aload 2
      // 062: instanceof net/minecraft/class_2815
      // 065: ifeq 0a8
      // 068: goto 06f
      // 06b: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06e: athrow
      // 06f: invokestatic k74/x/IIlIIlIl.IIlllI ()Z
      // 072: ifeq 0a8
      // 075: goto 07c
      // 078: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07b: athrow
      // 07c: aload 0
      // 07d: bipush 0
      // 07e: putfield k74/x/IIlIIlIl.IIllI Z
      // 081: aload 0
      // 082: bipush 0
      // 083: putfield k74/x/IIlIIlIl.lllI Z
      // 086: aload 0
      // 087: bipush 0
      // 088: putfield k74/x/IIlIIlIl.IlIII Z
      // 08b: aload 0
      // 08c: getfield k74/x/IIlIIlIl.llIlI Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 08f: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.isEmpty ()Z
      // 092: ifne 0a8
      // 095: goto 09c
      // 098: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09b: athrow
      // 09c: aload 0
      // 09d: aload 1
      // 09e: invokevirtual k74/x/IIlIIlIl.IIIIII (Lio/netty/channel/ChannelHandlerContext;)V
      // 0a1: goto 0a8
      // 0a4: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a7: athrow
      // 0a8: aload 2
      // 0a9: instanceof net/minecraft/class_2828
      // 0ac: ifeq 0c5
      // 0af: aload 0
      // 0b0: aload 1
      // 0b1: aload 2
      // 0b2: aload 3
      // 0b3: invokevirtual k74/x/IIlIIlIl.lllll (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)V
      // 0b6: aload 0
      // 0b7: bipush 1
      // 0b8: putfield k74/x/IIlIIlIl.IIllI Z
      // 0bb: aload 0
      // 0bc: bipush 1
      // 0bd: putfield k74/x/IIlIIlIl.lllI Z
      // 0c0: return
      // 0c1: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c4: athrow
      // 0c5: aload 2
      // 0c6: instanceof net/minecraft/class_9836
      // 0c9: ifeq 0d8
      // 0cc: aload 0
      // 0cd: aload 1
      // 0ce: aload 2
      // 0cf: aload 3
      // 0d0: invokevirtual k74/x/IIlIIlIl.llIlII (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)V
      // 0d3: return
      // 0d4: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d7: athrow
      // 0d8: aload 0
      // 0d9: getfield k74/x/IIlIIlIl.IIllI Z
      // 0dc: ifne 0ed
      // 0df: aload 0
      // 0e0: getfield k74/x/IIlIIlIl.lllI Z
      // 0e3: ifeq 115
      // 0e6: goto 0ed
      // 0e9: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ec: athrow
      // 0ed: aload 2
      // 0ee: invokestatic k74/x/IIlIIlIl.IIlIIII (Ljava/lang/Object;)Z
      // 0f1: ifeq 115
      // 0f4: goto 0fb
      // 0f7: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fa: athrow
      // 0fb: aload 0
      // 0fc: aload 2
      // 0fd: invokevirtual k74/x/IIlIIlIl.IIlIlIl (Ljava/lang/Object;)Z
      // 100: ifeq 115
      // 103: goto 10a
      // 106: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 109: athrow
      // 10a: aload 0
      // 10b: aload 2
      // 10c: aload 3
      // 10d: invokevirtual k74/x/IIlIIlIl.IlIlI (Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)V
      // 110: return
      // 111: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 114: athrow
      // 115: aload 0
      // 116: getfield k74/x/IIlIIlIl.llIlI Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 119: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.isEmpty ()Z
      // 11c: ifne 138
      // 11f: aload 2
      // 120: invokestatic k74/x/IIlIIlIl.lIlIl (Ljava/lang/Object;)Z
      // 123: ifne 138
      // 126: goto 12d
      // 129: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12c: athrow
      // 12d: aload 0
      // 12e: aload 2
      // 12f: aload 3
      // 130: invokevirtual k74/x/IIlIIlIl.IlIlI (Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)V
      // 133: return
      // 134: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 137: athrow
      // 138: aload 2
      // 139: instanceof net/minecraft/class_2868
      // 13c: ifeq 183
      // 13f: aload 0
      // 140: getfield k74/x/IIlIIlIl.IlIII Z
      // 143: ifne 169
      // 146: goto 14d
      // 149: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14c: athrow
      // 14d: aload 0
      // 14e: getfield k74/x/IIlIIlIl.IIllI Z
      // 151: ifne 169
      // 154: goto 15b
      // 157: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15a: athrow
      // 15b: aload 0
      // 15c: getfield k74/x/IIlIIlIl.lllI Z
      // 15f: ifeq 183
      // 162: goto 169
      // 165: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 168: athrow
      // 169: aload 0
      // 16a: aload 2
      // 16b: invokevirtual k74/x/IIlIIlIl.IIlIlIl (Ljava/lang/Object;)Z
      // 16e: ifeq 183
      // 171: goto 178
      // 174: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 177: athrow
      // 178: aload 0
      // 179: aload 2
      // 17a: aload 3
      // 17b: invokevirtual k74/x/IIlIIlIl.IlIlI (Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)V
      // 17e: return
      // 17f: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 182: athrow
      // 183: aload 0
      // 184: aload 1
      // 185: aload 2
      // 186: aload 3
      // 187: invokevirtual k74/x/IIlIIlIl.llIlIl (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)V
      // 18a: aload 2
      // 18b: invokestatic k74/x/IIlIIlIl.IIlIIII (Ljava/lang/Object;)Z
      // 18e: ifeq 19d
      // 191: aload 0
      // 192: bipush 1
      // 193: putfield k74/x/IIlIIlIl.IlIII Z
      // 196: goto 19d
      // 199: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19c: athrow
      // 19d: return
   }

   public static void IlII(IllIIlI var0) {
      IllIIlI var10000;
      label28: {
         try {
            if (var0 == null) {
               var10000 = IllIIlI.I;
               break label28;
            }
         } catch (CancellationException var3) {
            throw IIIlI(var3);
         }

         var10000 = var0;
      }

      IllIIlI var1 = var10000;

      try {
         if (lIlIl == var1) {
            return;
         }
      } catch (CancellationException var2) {
         throw IIIlI(var2);
      }

      lIlIl = var1;
      lIIlI();
   }

   private void IlIl(lIIllI var1, ChannelHandlerContext var2) {
      try {
         if (var1.Il()) {
            this.lIIlIl(var2);
         }
      } catch (CancellationException var4) {
         throw IIIlI(var4);
      }

      try {
         if (var1.I()) {
            this.l.set(false);
            this.IIlIIl(var2);
         }
      } catch (CancellationException var3) {
         throw IIIlI(var3);
      }
   }

   private void IllI(ChannelHandlerContext var1) {
      this.IlIIl(var1);
   }

   private static boolean Illl(class_2596<?> param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: instanceof net/minecraft/class_2828
      // 004: ifne 0bd
      // 007: aload 0
      // 008: instanceof net/minecraft/class_2833
      // 00b: ifne 0bd
      // 00e: goto 015
      // 011: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 014: athrow
      // 015: aload 0
      // 016: instanceof net/minecraft/class_9836
      // 019: ifne 0bd
      // 01c: goto 023
      // 01f: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 022: athrow
      // 023: aload 0
      // 024: instanceof net/minecraft/class_2824
      // 027: ifne 0bd
      // 02a: goto 031
      // 02d: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 030: athrow
      // 031: aload 0
      // 032: instanceof net/minecraft/class_2846
      // 035: ifne 0bd
      // 038: goto 03f
      // 03b: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03e: athrow
      // 03f: aload 0
      // 040: instanceof net/minecraft/class_2885
      // 043: ifne 0bd
      // 046: goto 04d
      // 049: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04c: athrow
      // 04d: aload 0
      // 04e: instanceof net/minecraft/class_2886
      // 051: ifne 0bd
      // 054: goto 05b
      // 057: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05a: athrow
      // 05b: aload 0
      // 05c: instanceof net/minecraft/class_2879
      // 05f: ifne 0bd
      // 062: goto 069
      // 065: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 068: athrow
      // 069: aload 0
      // 06a: instanceof net/minecraft/class_2868
      // 06d: ifne 0bd
      // 070: goto 077
      // 073: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 076: athrow
      // 077: aload 0
      // 078: instanceof net/minecraft/class_2848
      // 07b: ifne 0bd
      // 07e: goto 085
      // 081: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 084: athrow
      // 085: aload 0
      // 086: instanceof net/minecraft/class_2851
      // 089: ifne 0bd
      // 08c: goto 093
      // 08f: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 092: athrow
      // 093: aload 0
      // 094: instanceof net/minecraft/class_2813
      // 097: ifne 0bd
      // 09a: goto 0a1
      // 09d: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a0: athrow
      // 0a1: aload 0
      // 0a2: instanceof net/minecraft/class_2815
      // 0a5: ifne 0bd
      // 0a8: goto 0af
      // 0ab: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ae: athrow
      // 0af: aload 0
      // 0b0: instanceof net/minecraft/class_2799
      // 0b3: ifeq 0c3
      // 0b6: goto 0bd
      // 0b9: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bc: athrow
      // 0bd: bipush 1
      // 0be: ireturn
      // 0bf: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c2: athrow
      // 0c3: aload 0
      // 0c4: invokestatic k74/x/IIlIIlIl.lIlIll (Lnet/minecraft/class_2596;)Z
      // 0c7: ifne 100
      // 0ca: aload 0
      // 0cb: invokeinterface net/minecraft/class_2596.getClass ()Ljava/lang/Class; 1
      // 0d0: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 0d3: ldc_w -108480369
      // 0d6: ldc_w -1583043031
      // 0d9: ldc_w 800045614
      // 0dc: ixor
      // 0dd: invokestatic k74/x/IIlIIlIl.IlIIlII (II)I
      // 0e0: ldc_w -108480368
      // 0e3: ldc_w -1583043031
      // 0e6: ldc_w -1984039566
      // 0e9: ixor
      // 0ea: invokestatic k74/x/IIlIIlIl.IlIIlII (II)I
      // 0ed: invokestatic k74/x/IIlIIlIl.llIll (II)Ljava/lang/String;
      // 0f0: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0f3: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 0f6: ifeq 108
      // 0f9: goto 100
      // 0fc: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ff: athrow
      // 100: bipush 1
      // 101: goto 109
      // 104: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 107: athrow
      // 108: bipush 0
      // 109: ireturn
   }

   public static long lIII() {
      return Illll;
   }

   private void lIIl(ChannelHandlerContext var1) {
      try {
         IIllIlIII var2 = this.IlIIl.peek();
         if (var2 == null) {
            this.llII.set(false);
         } else {
            long var3 = this.IllII(var2.l, this.IIIlIlI(var2.I));
            if (var3 > 0L) {
               this.llII.set(false);
               this.lIllII(var1, var3);
            } else {
               try {
                  this.IlIIl.poll();
                  if (var1.channel().isOpen()) {
                     IIIlII(var1, var2.I);
                     this.lII = System.nanoTime();
                  }
               } catch (Exception var6) {
                  throw IIIlI(var6);
               }

               try {
                  this.llII.set(false);
                  if (!this.IlIIl.isEmpty()) {
                     this.IIlllII(var1);
                  }
               } catch (Exception var5) {
                  throw IIIlI(var5);
               }
            }
         }
      } catch (Exception var7) {
         this.llII.set(false);
         throw var7;
      }
   }

   public static void lIlI() {
      for (IIlIIlIl var1 : IIIII) {
         var1.llIIll();
      }
   }

   public static void lIll(long var0) {
      long var2 = System.currentTimeMillis() - Math.max(0L, var0);

      for (IIlIIlIl var5 : IIIII) {
         var5.lIlIIl(var2);
      }
   }

   private static boolean llII(class_2596 var0) {
      return false;
   }

   private void llIl(ChannelHandlerContext var1, long var2, IlIllIIl var4, long var5) {
      try {
         if (!this.llllI.compareAndSet(false, true)) {
            return;
         }
      } catch (CancellationException var10) {
         throw IIIlI(var10);
      }

      Runnable var7 = this::IIlllIl;

      try {
         if (var5 > 0L) {
            var1.executor().schedule(var7, Math.max(var5, IIlIl), TimeUnit.NANOSECONDS);
            return;
         }
      } catch (CancellationException var8) {
         throw IIIlI(var8);
      }

      try {
         if (var1.executor().inEventLoop()) {
            var7.run();
            return;
         }
      } catch (CancellationException var9) {
         throw IIIlI(var9);
      }

      var1.executor().execute(var7);
   }

   private void lllI(ChannelHandlerContext var1, long var2) {
      try {
         if (!this.l.compareAndSet(false, true)) {
            return;
         }
      } catch (CancellationException var7) {
         throw IIIlI(var7);
      }

      Runnable var4 = this::llIlI;

      try {
         if (var2 > 0L) {
            var1.executor().schedule(var4, Math.max(var2, IIlIl), TimeUnit.NANOSECONDS);
            return;
         }
      } catch (CancellationException var5) {
         throw IIIlI(var5);
      }

      try {
         if (var1.executor().inEventLoop()) {
            var4.run();
            return;
         }
      } catch (CancellationException var6) {
         throw IIIlI(var6);
      }

      var1.executor().execute(var4);
   }

   private void llll(ChannelHandlerContext var1) {
      try {
         if (!this.lIlII.isEmpty()) {
            this.lIIl.set(false);
            this.llIIII(var1);
         }
      } catch (CancellationException var3) {
         throw IIIlI(var3);
      }

      try {
         if (!this.llI.isEmpty()) {
            this.IIll.set(false);
            this.IlIIIll(var1);
         }
      } catch (CancellationException var4) {
         throw IIIlI(var4);
      }

      try {
         if (!this.IlIIl.isEmpty()) {
            this.llII.set(false);
            this.IIlllII(var1);
         }
      } catch (CancellationException var2) {
         throw IIIlI(var2);
      }
   }

   private void IIIII() {
      this.IlIII = false;
      this.lIlll = false;
      this.IIllI = false;
      this.lllI = false;
   }

   private boolean IIIIl(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: instanceof net/minecraft/class_2596
      // 04: ifeq 0f
      // 07: aload 1
      // 08: checkcast net/minecraft/class_2596
      // 0b: astore 2
      // 0c: goto 11
      // 0f: bipush 0
      // 10: ireturn
      // 11: aload 2
      // 12: instanceof net/minecraft/class_2856
      // 15: ifeq 1e
      // 18: bipush 0
      // 19: ireturn
      // 1a: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: invokestatic k74/x/IIIIlIIIl.IIlIl ()Lk74/x/IIIIlIIIl;
      // 21: astore 3
      // 22: aload 3
      // 23: invokevirtual k74/x/IIIIlIIIl.IIlll ()Z
      // 26: ifeq 5d
      // 29: aload 3
      // 2a: invokevirtual k74/x/IIIIlIIIl.IIIII ()Z
      // 2d: ifeq 5d
      // 30: goto 37
      // 33: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36: athrow
      // 37: aload 3
      // 38: invokevirtual k74/x/IIIIlIIIl.llII ()Z
      // 3b: ifeq 5d
      // 3e: goto 45
      // 41: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 44: athrow
      // 45: aload 2
      // 46: invokeinterface net/minecraft/class_2596.method_55943 ()Z 1
      // 4b: ifne 5d
      // 4e: goto 55
      // 51: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 54: athrow
      // 55: bipush 1
      // 56: goto 5e
      // 59: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5c: athrow
      // 5d: bipush 0
      // 5e: ireturn
   }

   private static Throwable IIIlI(Throwable var0) {
      return var0;
   }

   private void IIIll(ConcurrentLinkedQueue<IIllllllI> var1, Throwable var2) {
      while (true) {
         IIllllllI var3;
         IIllllllI var10000 = var3 = (IIllllllI)var1.poll();

         try {
            if (var10000 == null) {
               return;
            }

            var3.Il.tryFailure(var2);
         } catch (CancellationException var4) {
            throw IIIlI(var4);
         }
      }
   }

   private IIlIlllIl IIlII(Object var1, ChannelPromise var2) {
      return new IIlIlllIl(var1, var2, System.nanoTime(), this.Illl.incrementAndGet());
   }

   public static void IIlIl() {
      IIlll = true;
   }

   public static void IIllI(class_2596<?> param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic k74/x/IIllllI.II ()Z
      // 03: ifeq 0b
      // 06: return
      // 07: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a: athrow
      // 0b: invokestatic k74/x/IIll.IIllIIl ()Z
      // 0e: ifeq 34
      // 11: aload 0
      // 12: invokestatic k74/x/IIlIIlIl.IIlIIII (Ljava/lang/Object;)Z
      // 15: ifeq 34
      // 18: goto 1f
      // 1b: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 22: invokestatic k74/x/IIll.IIIIII (Lnet/minecraft/class_310;)Z
      // 25: ifne 34
      // 28: goto 2f
      // 2b: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: return
      // 30: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 33: athrow
      // 34: invokestatic k74/x/IIIIIllII.III ()Lk74/x/IIIIIllII;
      // 37: ifnull 4e
      // 3a: aload 0
      // 3b: invokestatic k74/x/IIll.IIlllll ()Z
      // 3e: invokestatic k74/x/IlllIlII.III ()Z
      // 41: invokestatic k74/x/IIlIIlIl.IIIIlI (Lnet/minecraft/class_2596;ZZ)Z
      // 44: ifne 53
      // 47: goto 4e
      // 4a: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4d: athrow
      // 4e: return
      // 4f: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 52: athrow
      // 53: getstatic k74/x/IIlIIlIl.IIlII Ljava/util/concurrent/ConcurrentHashMap;
      // 56: new k74/x/llll
      // 59: dup
      // 5a: aload 0
      // 5b: invokespecial k74/x/llll.<init> (Lnet/minecraft/class_2596;)V
      // 5e: getstatic java/lang/Boolean.TRUE Ljava/lang/Boolean;
      // 61: invokevirtual java/util/concurrent/ConcurrentHashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 64: pop
      // 65: bipush 1
      // 66: putstatic k74/x/IIlIIlIl.lllIl Z
      // 69: return
   }

   private void IIlll(Object var1) {
      if (var1 instanceof class_2935 var2) {
         IIIIlIIIl.IIlIl().IllIl(var2.method_12700());
      }
   }

   private Integer IlIII(Object var1) {
      return var1 instanceof class_2596 var2 ? IIlIll(var2) : null;
   }

   private void IlIIl(ChannelHandlerContext param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: bipush 0
      // 001: istore 2
      // 002: new java/util/ArrayList
      // 005: dup
      // 006: invokespecial java/util/ArrayList.<init> ()V
      // 009: astore 3
      // 00a: aload 0
      // 00b: getfield k74/x/IIlIIlIl.llllI Ljava/util/concurrent/atomic/AtomicBoolean;
      // 00e: bipush 0
      // 00f: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 012: aload 0
      // 013: getfield k74/x/IIlIIlIl.llIIl Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 016: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.poll ()Ljava/lang/Object;
      // 019: checkcast k74/x/IIllllllI
      // 01c: dup
      // 01d: astore 4
      // 01f: ifnull 089
      // 022: aload 4
      // 024: getfield k74/x/IIllllllI.lI Lk74/x/IlIllIIl;
      // 027: getstatic k74/x/IlIllIIl.l Lk74/x/IlIllIIl;
      // 02a: if_acmpne 065
      // 02d: goto 034
      // 030: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 033: athrow
      // 034: aload 4
      // 036: getfield k74/x/IIllllllI.II Ljava/lang/Object;
      // 039: instanceof net/minecraft/class_2851
      // 03c: ifeq 065
      // 03f: goto 046
      // 042: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 045: athrow
      // 046: iload 2
      // 047: ifeq 063
      // 04a: goto 051
      // 04d: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 050: athrow
      // 051: aload 4
      // 053: getfield k74/x/IIllllllI.Il Lio/netty/channel/ChannelPromise;
      // 056: invokeinterface io/netty/channel/ChannelPromise.trySuccess ()Z 1
      // 05b: pop
      // 05c: goto 012
      // 05f: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 062: athrow
      // 063: bipush 1
      // 064: istore 2
      // 065: aload 3
      // 066: aload 4
      // 068: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 06d: pop
      // 06e: aload 4
      // 070: getfield k74/x/IIllllllI.lI Lk74/x/IlIllIIl;
      // 073: getstatic k74/x/IlIllIIl.l Lk74/x/IlIllIIl;
      // 076: if_acmpne 012
      // 079: aload 4
      // 07b: getfield k74/x/IIllllllI.II Ljava/lang/Object;
      // 07e: instanceof net/minecraft/class_9836
      // 081: ifeq 012
      // 084: bipush 0
      // 085: istore 2
      // 086: goto 012
      // 089: bipush 0
      // 08a: istore 5
      // 08c: aload 3
      // 08d: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 092: astore 6
      // 094: aload 6
      // 096: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 09b: ifeq 0c1
      // 09e: aload 6
      // 0a0: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0a5: checkcast k74/x/IIllllllI
      // 0a8: astore 7
      // 0aa: iload 5
      // 0ac: aload 0
      // 0ad: aload 1
      // 0ae: aload 7
      // 0b0: getfield k74/x/IIllllllI.II Ljava/lang/Object;
      // 0b3: aload 7
      // 0b5: getfield k74/x/IIllllllI.Il Lio/netty/channel/ChannelPromise;
      // 0b8: invokevirtual k74/x/IIlIIlIl.IllIl (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)Z
      // 0bb: ior
      // 0bc: istore 5
      // 0be: goto 094
      // 0c1: iload 5
      // 0c3: ifeq 0f0
      // 0c6: aload 1
      // 0c7: invokeinterface io/netty/channel/ChannelHandlerContext.channel ()Lio/netty/channel/Channel; 1
      // 0cc: invokeinterface io/netty/channel/Channel.isOpen ()Z 1
      // 0d1: ifeq 0f0
      // 0d4: goto 0db
      // 0d7: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0da: athrow
      // 0db: aload 1
      // 0dc: invokeinterface io/netty/channel/ChannelHandlerContext.flush ()Lio/netty/channel/ChannelHandlerContext; 1
      // 0e1: pop
      // 0e2: aload 0
      // 0e3: invokestatic java/lang/System.nanoTime ()J
      // 0e6: putfield k74/x/IIlIIlIl.IIIll J
      // 0e9: goto 0f0
      // 0ec: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ef: athrow
      // 0f0: aload 0
      // 0f1: bipush 0
      // 0f2: putfield k74/x/IIlIIlIl.lIl Z
      // 0f5: invokestatic k74/x/IIlIIlIl.llIllI ()V
      // 0f8: goto 106
      // 0fb: astore 2
      // 0fc: aload 0
      // 0fd: getfield k74/x/IIlIIlIl.llllI Ljava/util/concurrent/atomic/AtomicBoolean;
      // 100: bipush 0
      // 101: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 104: aload 2
      // 105: athrow
      // 106: return
   }

   private void IlIlI(Object var1, ChannelPromise var2) {
      try {
         if (this.llIlI.size() >= IlIIlII(-108480367, 1025879345 ^ -93646433)) {
            var2.tryFailure(
               new IllegalStateException(IlIIllIII.lI(llIll(IlIIlII(-108480366, 1025879345 ^ 2126118323), IlIIlII(-108480365, 1025879345 ^ -806825706))))
            );
            return;
         }
      } catch (CancellationException var5) {
         throw IIIlI(var5);
      }

      boolean var3 = this.llIlI.isEmpty();

      try {
         this.llIlI.offer(this.IIlII(var1, var2));
         if (var3) {
            this.lIlll = false;
         }
      } catch (CancellationException var4) {
         throw IIIlI(var4);
      }
   }

   private long IlIll(Object var1) {
      return 0L;
   }

   private long IllII(long var1, long var3) {
      try {
         if (var3 <= 0L) {
            return 0L;
         }
      } catch (CancellationException var5) {
         throw IIIlI(var5);
      }

      return var1 + TimeUnit.MILLISECONDS.toNanos(var3) - System.nanoTime();
   }

   private boolean IllIl(ChannelHandlerContext param1, Object param2, ChannelPromise param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 19
      // 04: aload 1
      // 05: invokeinterface io/netty/channel/ChannelHandlerContext.channel ()Lio/netty/channel/Channel; 1
      // 0a: invokeinterface io/netty/channel/Channel.isOpen ()Z 1
      // 0f: ifne 2d
      // 12: goto 19
      // 15: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: aload 3
      // 1a: new java/nio/channels/ClosedChannelException
      // 1d: dup
      // 1e: invokespecial java/nio/channels/ClosedChannelException.<init> ()V
      // 21: invokeinterface io/netty/channel/ChannelPromise.tryFailure (Ljava/lang/Throwable;)Z 2
      // 26: pop
      // 27: bipush 0
      // 28: ireturn
      // 29: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c: athrow
      // 2d: aload 2
      // 2e: instanceof net/minecraft/class_2868
      // 31: ifeq 5d
      // 34: aload 2
      // 35: checkcast net/minecraft/class_2868
      // 38: astore 4
      // 3a: aload 4
      // 3c: invokevirtual net/minecraft/class_2868.method_12442 ()I
      // 3f: istore 5
      // 41: iload 5
      // 43: aload 0
      // 44: getfield k74/x/IIlIIlIl.IIIl I
      // 47: if_icmpne 57
      // 4a: aload 3
      // 4b: invokeinterface io/netty/channel/ChannelPromise.trySuccess ()Z 1
      // 50: pop
      // 51: bipush 1
      // 52: ireturn
      // 53: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 56: athrow
      // 57: aload 0
      // 58: iload 5
      // 5a: putfield k74/x/IIlIIlIl.IIIl I
      // 5d: aload 3
      // 5e: astore 4
      // 60: aload 2
      // 61: instanceof net/minecraft/class_2596
      // 64: ifeq c0
      // 67: aload 2
      // 68: checkcast net/minecraft/class_2596
      // 6b: astore 5
      // 6d: aload 5
      // 6f: instanceof net/minecraft/class_2935
      // 72: istore 6
      // 74: aload 5
      // 76: invokestatic k74/x/IIlIIlIl.ll (Lnet/minecraft/class_2596;)Z
      // 79: istore 7
      // 7b: iload 6
      // 7d: ifne 8c
      // 80: iload 7
      // 82: ifeq c0
      // 85: goto 8c
      // 88: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8b: athrow
      // 8c: aload 3
      // 8d: invokeinterface io/netty/channel/ChannelPromise.isVoid ()Z 1
      // 92: ifeq a9
      // 95: goto 9c
      // 98: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9b: athrow
      // 9c: aload 1
      // 9d: invokeinterface io/netty/channel/ChannelHandlerContext.newPromise ()Lio/netty/channel/ChannelPromise; 1
      // a2: goto aa
      // a5: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a8: athrow
      // a9: aload 3
      // aa: astore 4
      // ac: aload 4
      // ae: aload 0
      // af: iload 6
      // b1: aload 5
      // b3: iload 7
      // b5: invokedynamic operationComplete (Lk74/x/IIlIIlIl;ZLnet/minecraft/class_2596;Z)Lio/netty/util/concurrent/GenericFutureListener; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lio/netty/util/concurrent/Future;)V, k74/x/IIlIIlIl.lI (ZLnet/minecraft/class_2596;ZLio/netty/util/concurrent/Future;)V, (Lio/netty/util/concurrent/Future;)V ]
      // ba: invokeinterface io/netty/channel/ChannelPromise.addListener (Lio/netty/util/concurrent/GenericFutureListener;)Lio/netty/channel/ChannelPromise; 2
      // bf: pop
      // c0: aload 1
      // c1: aload 2
      // c2: aload 4
      // c4: invokeinterface io/netty/channel/ChannelHandlerContext.write (Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)Lio/netty/channel/ChannelFuture; 3
      // c9: pop
      // ca: bipush 1
      // cb: ireturn
      // cc: astore 5
      // ce: aload 4
      // d0: aload 5
      // d2: invokeinterface io/netty/channel/ChannelPromise.tryFailure (Ljava/lang/Throwable;)Z 2
      // d7: pop
      // d8: bipush 0
      // d9: ireturn
   }

   private void IlllI(ChannelHandlerContext var1) {
      try {
         if (!this.llIlI.isEmpty()) {
            this.IIIIII(var1);
         }
      } catch (Exception var6) {
         this.Illll(this.llIlI, var6);
      } finally {
         this.IIIII();
      }
   }

   private void Illll(ConcurrentLinkedQueue<IIlIlllIl> var1, Throwable var2) {
      while (true) {
         IIlIlllIl var3;
         IIlIlllIl var10000 = var3 = (IIlIlllIl)var1.poll();

         try {
            if (var10000 == null) {
               return;
            }

            var3.II.tryFailure(var2);
         } catch (CancellationException var4) {
            throw IIIlI(var4);
         }
      }
   }

   public static void lIIII() {
      lIIllI var0 = IIIIlIIIl.IIlIl().IIllI();

      try {
         if (var0.l()) {
            return;
         }
      } catch (CancellationException var3) {
         throw IIIlI(var3);
      }

      for (IIlIIlIl var2 : IIIII) {
         var2.IIlllll(var0);
      }
   }

   private long lIIIl(IIlIlllIl var1) {
      long var2 = this.IIII(var1.Il);

      try {
         if (var2 <= 0L) {
            return 0L;
         }
      } catch (CancellationException var6) {
         throw IIIlI(var6);
      }

      try {
         if (this.lIlII.size() > 4) {
            return 0L;
         }
      } catch (CancellationException var8) {
         throw IIIlI(var8);
      }

      long var4 = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - var1.I);

      try {
         if (var4 >= 2500L) {
            return var4;
         }
      } catch (CancellationException var7) {
         throw IIIlI(var7);
      }

      return Math.min(var2, 2500L);
   }

   public static void lIIlI() {
      for (IIlIIlIl var1 : IIIII) {
         var1.IIllIll();
      }
   }

   private void lIIll(ChannelHandlerContext var1, long var2) {
      try {
         if (!this.llllI.compareAndSet(false, true)) {
            return;
         }
      } catch (CancellationException var7) {
         throw IIIlI(var7);
      }

      Runnable var4 = this::IIlIlll;

      try {
         if (var2 > 0L) {
            var1.executor().schedule(var4, Math.max(var2, IIlIl), TimeUnit.NANOSECONDS);
            return;
         }
      } catch (CancellationException var5) {
         throw IIIlI(var5);
      }

      try {
         if (var1.executor().inEventLoop()) {
            var4.run();
            return;
         }
      } catch (CancellationException var6) {
         throw IIIlI(var6);
      }

      var1.executor().execute(var4);
   }

   private boolean lIlII(long param1, IlIllIIl param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/IIlIIlIl.llIIl Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 04: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.peek ()Ljava/lang/Object;
      // 07: checkcast k74/x/IIllllllI
      // 0a: astore 4
      // 0c: aload 4
      // 0e: ifnull 45
      // 11: aload 3
      // 12: ifnull 2c
      // 15: goto 1c
      // 18: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b: athrow
      // 1c: aload 4
      // 1e: getfield k74/x/IIllllllI.lI Lk74/x/IlIllIIl;
      // 21: aload 3
      // 22: if_acmpne 45
      // 25: goto 2c
      // 28: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b: athrow
      // 2c: aload 4
      // 2e: getfield k74/x/IIllllllI.l J
      // 31: lload 1
      // 32: lcmp
      // 33: ifgt 45
      // 36: goto 3d
      // 39: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c: athrow
      // 3d: bipush 1
      // 3e: goto 46
      // 41: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 44: athrow
      // 45: bipush 0
      // 46: ireturn
   }

   private static boolean lIlIl(Object param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: instanceof net/minecraft/class_2827
      // 04: ifne 85
      // 07: aload 0
      // 08: instanceof net/minecraft/class_6374
      // 0b: ifne 85
      // 0e: goto 15
      // 11: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: aload 0
      // 16: instanceof net/minecraft/class_2856
      // 19: ifne 85
      // 1c: goto 23
      // 1f: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22: athrow
      // 23: aload 0
      // 24: instanceof net/minecraft/class_2935
      // 27: ifne 85
      // 2a: goto 31
      // 2d: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 30: athrow
      // 31: aload 0
      // 32: instanceof net/minecraft/class_7640
      // 35: ifne 85
      // 38: goto 3f
      // 3b: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e: athrow
      // 3f: aload 0
      // 40: instanceof net/minecraft/class_8590
      // 43: ifne 85
      // 46: goto 4d
      // 49: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4c: athrow
      // 4d: aload 0
      // 4e: instanceof net/minecraft/class_8591
      // 51: ifne 85
      // 54: goto 5b
      // 57: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5a: athrow
      // 5b: aload 0
      // 5c: instanceof net/minecraft/class_2833
      // 5f: ifne 85
      // 62: goto 69
      // 65: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 68: athrow
      // 69: aload 0
      // 6a: instanceof net/minecraft/class_2813
      // 6d: ifne 85
      // 70: goto 77
      // 73: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 76: athrow
      // 77: aload 0
      // 78: instanceof net/minecraft/class_2815
      // 7b: ifeq 8d
      // 7e: goto 85
      // 81: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 84: athrow
      // 85: bipush 1
      // 86: goto 8e
      // 89: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8c: athrow
      // 8d: bipush 0
      // 8e: ireturn
   }

   private static void lIllI(class_2596 var0) {
      IIIIIllII var1 = IIIIIllII.III();

      lIIIlIlI var10000;
      label27: {
         try {
            if (var1 == null) {
               var10000 = null;
               break label27;
            }
         } catch (CancellationException var4) {
            throw IIIlI(var4);
         }

         var10000 = var1.II();
      }

      lIIIlIlI var2 = var10000;

      try {
         if (var2 != null) {
            var2.Illll(var0);
         }
      } catch (CancellationException var3) {
         throw IIIlI(var3);
      }
   }

   private long lIlll(IIllllllI param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 1f
      // 04: aload 1
      // 05: getfield k74/x/IIllllllI.lI Lk74/x/IlIllIIl;
      // 08: getstatic k74/x/IlIllIIl.l Lk74/x/IlIllIIl;
      // 0b: if_acmpne 1f
      // 0e: goto 15
      // 11: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: getstatic k74/x/IIlIIlIl.Ill J
      // 18: goto 22
      // 1b: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: getstatic k74/x/IIlIIlIl.IlIll J
      // 22: lreturn
   }

   public static void llIII(Predicate<class_2596<?>> var0, Consumer<class_2596<?>> var1) {
      llllll(var0, var1, IIlIIlIl::llIlll);
   }

   private void llIIl(ChannelHandlerContext var1) {
      this.IIIllIl(var1);
   }

   private void llIlI(ChannelHandlerContext var1) {
      this.IlIlIl(var1);
   }

   public void channelRead(ChannelHandlerContext param1, Object param2) throws Exception {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic k74/x/IIllllI.II ()Z
      // 003: ifeq 010
      // 006: aload 1
      // 007: aload 2
      // 008: invokestatic k74/x/IIlIIlIl.IIIlII (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;)V
      // 00b: return
      // 00c: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 00f: athrow
      // 010: aload 2
      // 011: invokestatic k74/x/IIlIIlIl.IIIlllI (Ljava/lang/Object;)Z
      // 014: ifeq 04c
      // 017: aload 0
      // 018: new java/util/concurrent/CancellationException
      // 01b: dup
      // 01c: ldc_w -108480364
      // 01f: ldc_w -1440103310
      // 022: ldc_w 2105049425
      // 025: ixor
      // 026: invokestatic k74/x/IIlIIlIl.IlIIlII (II)I
      // 029: ldc_w -108480363
      // 02c: ldc_w -1440103310
      // 02f: ldc_w 1638047131
      // 032: ixor
      // 033: invokestatic k74/x/IIlIIlIl.IlIIlII (II)I
      // 036: invokestatic k74/x/IIlIIlIl.llIll (II)Ljava/lang/String;
      // 039: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 03c: invokespecial java/util/concurrent/CancellationException.<init> (Ljava/lang/String;)V
      // 03f: invokevirtual k74/x/IIlIIlIl.IIIIIIl (Ljava/lang/Throwable;)V
      // 042: aload 1
      // 043: aload 2
      // 044: invokestatic k74/x/IIlIIlIl.IIIlII (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;)V
      // 047: return
      // 048: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04b: athrow
      // 04c: aload 2
      // 04d: invokestatic k74/x/IIlIIlIl.IlI (Ljava/lang/Object;)Z
      // 050: ifeq 05d
      // 053: aload 1
      // 054: aload 2
      // 055: invokestatic k74/x/IIlIIlIl.IIIlII (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;)V
      // 058: return
      // 059: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05c: athrow
      // 05d: aload 2
      // 05e: instanceof net/minecraft/class_2596
      // 061: ifeq 07c
      // 064: aload 2
      // 065: checkcast net/minecraft/class_2596
      // 068: astore 3
      // 069: aload 3
      // 06a: invokestatic k74/x/IIlIIlIl.IllllI (Lnet/minecraft/class_2596;)Z
      // 06d: ifeq 07c
      // 070: aload 0
      // 071: aload 1
      // 072: invokevirtual k74/x/IIlIIlIl.IIlIIl (Lio/netty/channel/ChannelHandlerContext;)V
      // 075: goto 07c
      // 078: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07b: athrow
      // 07c: aload 2
      // 07d: instanceof net/minecraft/class_2596
      // 080: ifeq 0a7
      // 083: aload 2
      // 084: checkcast net/minecraft/class_2596
      // 087: astore 3
      // 088: aload 3
      // 089: invokestatic k74/x/IIIIlIIIl.II (Lnet/minecraft/class_2596;)Z
      // 08c: ifeq 0a7
      // 08f: aload 3
      // 090: invokestatic k74/x/IIlIIlIl.llllIl (Lnet/minecraft/class_2596;)Z
      // 093: ifne 0a7
      // 096: goto 09d
      // 099: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09c: athrow
      // 09d: aload 1
      // 09e: aload 2
      // 09f: invokestatic k74/x/IIlIIlIl.IIIlII (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;)V
      // 0a2: return
      // 0a3: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a6: athrow
      // 0a7: getstatic k74/x/IIlIIlIl.IIlll Z
      // 0aa: ifeq 0da
      // 0ad: aload 0
      // 0ae: new k74/x/IIlIlII
      // 0b1: dup
      // 0b2: aload 2
      // 0b3: invokestatic java/lang/System.currentTimeMillis ()J
      // 0b6: invokespecial k74/x/IIlIlII.<init> (Ljava/lang/Object;J)V
      // 0b9: invokevirtual k74/x/IIlIIlIl.IlIlll (Lk74/x/IIlIlII;)Z
      // 0bc: ifne 0d9
      // 0bf: goto 0c6
      // 0c2: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c5: athrow
      // 0c6: aload 0
      // 0c7: aload 1
      // 0c8: invokevirtual k74/x/IIlIIlIl.IIlIIl (Lio/netty/channel/ChannelHandlerContext;)V
      // 0cb: aload 0
      // 0cc: pop
      // 0cd: aload 1
      // 0ce: aload 2
      // 0cf: invokestatic k74/x/IIlIIlIl.IIIlII (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;)V
      // 0d2: goto 0d9
      // 0d5: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d8: athrow
      // 0d9: return
      // 0da: aload 0
      // 0db: aload 1
      // 0dc: invokevirtual k74/x/IIlIIlIl.IIIlll (Lio/netty/channel/ChannelHandlerContext;)V
      // 0df: aload 0
      // 0e0: aload 2
      // 0e1: invokevirtual k74/x/IIlIIlIl.IllIlI (Ljava/lang/Object;)Z
      // 0e4: ifeq 114
      // 0e7: aload 0
      // 0e8: new k74/x/IIlIlII
      // 0eb: dup
      // 0ec: aload 2
      // 0ed: invokestatic java/lang/System.currentTimeMillis ()J
      // 0f0: invokespecial k74/x/IIlIlII.<init> (Ljava/lang/Object;J)V
      // 0f3: invokevirtual k74/x/IIlIIlIl.IlIlll (Lk74/x/IIlIlII;)Z
      // 0f6: ifne 113
      // 0f9: goto 100
      // 0fc: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ff: athrow
      // 100: aload 0
      // 101: aload 1
      // 102: invokevirtual k74/x/IIlIIlIl.IIlIIl (Lio/netty/channel/ChannelHandlerContext;)V
      // 105: aload 0
      // 106: pop
      // 107: aload 1
      // 108: aload 2
      // 109: invokestatic k74/x/IIlIIlIl.IIIlII (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;)V
      // 10c: goto 113
      // 10f: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 112: athrow
      // 113: return
      // 114: getstatic k74/x/IIlIIlIl.lllII Z
      // 117: ifeq 147
      // 11a: aload 0
      // 11b: new k74/x/IIlIlII
      // 11e: dup
      // 11f: aload 2
      // 120: invokestatic java/lang/System.currentTimeMillis ()J
      // 123: invokespecial k74/x/IIlIlII.<init> (Ljava/lang/Object;J)V
      // 126: invokevirtual k74/x/IIlIIlIl.IlIlll (Lk74/x/IIlIlII;)Z
      // 129: ifne 146
      // 12c: goto 133
      // 12f: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 132: athrow
      // 133: aload 0
      // 134: aload 1
      // 135: invokevirtual k74/x/IIlIIlIl.IIlIIl (Lio/netty/channel/ChannelHandlerContext;)V
      // 138: aload 0
      // 139: pop
      // 13a: aload 1
      // 13b: aload 2
      // 13c: invokestatic k74/x/IIlIIlIl.IIIlII (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;)V
      // 13f: goto 146
      // 142: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 145: athrow
      // 146: return
      // 147: aload 0
      // 148: aload 2
      // 149: invokevirtual k74/x/IIlIIlIl.IIIlIlI (Ljava/lang/Object;)J
      // 14c: lstore 3
      // 14d: lload 3
      // 14e: lconst_0
      // 14f: lcmp
      // 150: ifle 197
      // 153: aload 2
      // 154: instanceof net/minecraft/class_2923
      // 157: ifeq 173
      // 15a: goto 161
      // 15d: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 160: athrow
      // 161: aload 2
      // 162: checkcast net/minecraft/class_2923
      // 165: astore 5
      // 167: invokestatic k74/x/IIIIlIIIl.IIlIl ()Lk74/x/IIIIlIIIl;
      // 16a: aload 5
      // 16c: invokevirtual net/minecraft/class_2923.comp_2201 ()J
      // 16f: lload 3
      // 170: invokevirtual k74/x/IIIIlIIIl.l (JJ)V
      // 173: aload 0
      // 174: new k74/x/IIllIlIII
      // 177: dup
      // 178: aload 2
      // 179: invokestatic java/lang/System.nanoTime ()J
      // 17c: invokespecial k74/x/IIllIlIII.<init> (Ljava/lang/Object;J)V
      // 17f: invokevirtual k74/x/IIlIIlIl.III (Lk74/x/IIllIlIII;)Z
      // 182: ifne 191
      // 185: aload 0
      // 186: pop
      // 187: aload 1
      // 188: aload 2
      // 189: invokestatic k74/x/IIlIIlIl.IIIlII (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;)V
      // 18c: return
      // 18d: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 190: athrow
      // 191: aload 0
      // 192: aload 1
      // 193: invokevirtual k74/x/IIlIIlIl.IIlllII (Lio/netty/channel/ChannelHandlerContext;)V
      // 196: return
      // 197: aload 0
      // 198: pop
      // 199: aload 1
      // 19a: aload 2
      // 19b: invokestatic k74/x/IIlIIlIl.IIIlII (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;)V
      // 19e: return
   }

   private static String llIll(int var0, int var1) {
      int var9 = 227470647;
      int var2 = (var0 ^ IlIIlII(-108480362, var9 ^ -884654109)) & IlIIlII(-108480361, var9 ^ -1152201205);
      if (lIIll[var2] == null) {
         char[] var3 = ll[var2].toCharArray();

         int var4 = switch (var3[0] & IlIIlII(-108480360, var9 ^ -1774434937)) {
            case 0 -> IlIIlII(-108480359, var9 ^ -587918923);
            case 1 -> IlIIlII(-108480358, var9 ^ 2097584472);
            case 2 -> 5;
            case 3 -> IlIIlII(-108480357, var9 ^ 726422572);
            case 4 -> IlIIlII(-108480356, var9 ^ -1605673498);
            case 5 -> IlIIlII(-108480355, var9 ^ -1389787921);
            case 6 -> IlIIlII(-108480354, var9 ^ -1632059620);
            case 7 -> 1;
            case 8 -> IlIIlII(-108480353, var9 ^ -1110620165);
            case 9 -> IlIIlII(-108480352, var9 ^ 1797905452);
            case 10 -> IlIIlII(-108480351, var9 ^ -1169886712);
            case 11 -> IlIIlII(-108480350, var9 ^ -596834784);
            case 12 -> IlIIlII(-108480349, var9 ^ -931997657);
            case 13 -> IlIIlII(-108480348, var9 ^ -1066719764);
            case 14 -> 2;
            case 15 -> IlIIlII(-108480347, var9 ^ -1911532517);
            case 16 -> IlIIlII(-108480346, var9 ^ -466226579);
            case 17 -> IlIIlII(-108480345, var9 ^ -303174517);
            case 18 -> IlIIlII(-108480344, var9 ^ -314696593);
            case 19 -> IlIIlII(-108480343, var9 ^ -1465155912);
            case 20 -> IlIIlII(-108480342, var9 ^ 1855729079);
            case 21 -> IlIIlII(-108480341, var9 ^ -1435668235);
            case 22 -> IlIIlII(-108480340, var9 ^ 1294679497);
            case 23 -> 4;
            case 24 -> IlIIlII(-108480339, var9 ^ 617700229);
            case 25 -> IlIIlII(-108480338, var9 ^ -520981142);
            case 26 -> IlIIlII(-108480337, var9 ^ 954309108);
            case 27 -> IlIIlII(-108480336, var9 ^ -882414693);
            case 28 -> IlIIlII(-108480335, var9 ^ -632839203);
            case 29 -> IlIIlII(-108480334, var9 ^ -62385553);
            case 30 -> IlIIlII(-108480333, var9 ^ -2089782576);
            case 31 -> IlIIlII(-108480332, var9 ^ -63866725);
            case 32 -> IlIIlII(-108480331, var9 ^ -1355806302);
            case 33 -> IlIIlII(-108480330, var9 ^ -1528991902);
            case 34 -> IlIIlII(-108480329, var9 ^ 286702031);
            case 35 -> IlIIlII(-108480328, var9 ^ -1327914344);
            case 36 -> IlIIlII(-108480327, var9 ^ 1222870343);
            case 37 -> IlIIlII(-108480326, var9 ^ 1346033096);
            case 38 -> IlIIlII(-108480325, var9 ^ 1160809077);
            case 39 -> IlIIlII(-108480324, var9 ^ -1494802612);
            case 40 -> IlIIlII(-108480323, var9 ^ -805969157);
            case 41 -> IlIIlII(-108480322, var9 ^ -414659323);
            case 42 -> IlIIlII(-108480321, var9 ^ -1848331022);
            case 43 -> IlIIlII(-108480320, var9 ^ 955740432);
            case 44 -> IlIIlII(-108480319, var9 ^ 1046682414);
            case 45 -> IlIIlII(-108480318, var9 ^ -920796065);
            case 46 -> IlIIlII(-108480317, var9 ^ 1781971957);
            case 47 -> IlIIlII(-108480316, var9 ^ -1931353881);
            case 48 -> IlIIlII(-108480315, var9 ^ -356297559);
            case 49 -> IlIIlII(-108480314, var9 ^ -756563387);
            case 50 -> IlIIlII(-108480313, var9 ^ 1469405466);
            case 51 -> IlIIlII(-108480312, var9 ^ -1991882148);
            case 52 -> IlIIlII(-108480311, var9 ^ 1321522430);
            case 53 -> IlIIlII(-108480310, var9 ^ 1342770724);
            case 54 -> IlIIlII(-108480309, var9 ^ -850978777);
            case 55 -> IlIIlII(-108480308, var9 ^ -755214037);
            case 56 -> IlIIlII(-108480307, var9 ^ 1682676566);
            case 57 -> IlIIlII(-108480306, var9 ^ 1708792739);
            case 58 -> IlIIlII(-108480305, var9 ^ 1513019840);
            case 59 -> IlIIlII(-108480304, var9 ^ 287116459);
            case 60 -> IlIIlII(-108480303, var9 ^ -1598239749);
            case 61 -> IlIIlII(-108480302, var9 ^ -1428369057);
            case 62 -> IlIIlII(-108480301, var9 ^ 151247279);
            case 63 -> IlIIlII(-108480300, var9 ^ -1658715720);
            case 64 -> IlIIlII(-108480299, var9 ^ 275702860);
            case 65 -> IlIIlII(-108480298, var9 ^ 1707845552);
            case 66 -> IlIIlII(-108480297, var9 ^ -1002189653);
            case 67 -> IlIIlII(-108480296, var9 ^ 659518952);
            case 68 -> IlIIlII(-108480295, var9 ^ -1666268274);
            case 69 -> IlIIlII(-108480294, var9 ^ 2046317941);
            case 70 -> IlIIlII(-108480293, var9 ^ -972920483);
            case 71 -> IlIIlII(-108480292, var9 ^ -1315487604);
            case 72 -> IlIIlII(-108480291, var9 ^ -1281929495);
            case 73 -> IlIIlII(-108480290, var9 ^ 165127379);
            case 74 -> 0;
            case 75 -> IlIIlII(-108480289, var9 ^ 1856684590);
            case 76 -> IlIIlII(-108480288, var9 ^ -1005696886);
            case 77 -> IlIIlII(-108480287, var9 ^ 577251691);
            case 78 -> IlIIlII(-108480286, var9 ^ -1121010633);
            case 79 -> IlIIlII(-108480285, var9 ^ 1389673698);
            case 80 -> IlIIlII(-108480284, var9 ^ -2001305667);
            case 81 -> IlIIlII(-108480283, var9 ^ -427027569);
            case 82 -> IlIIlII(-108480282, var9 ^ -1399296982);
            case 83 -> IlIIlII(-108480281, var9 ^ 1373381682);
            case 84 -> IlIIlII(-108480280, var9 ^ -676953408);
            case 85 -> IlIIlII(-108480279, var9 ^ 1372413374);
            case 86 -> IlIIlII(-108480278, var9 ^ -998586170);
            case 87 -> IlIIlII(-108480277, var9 ^ -1882217094);
            case 88 -> IlIIlII(-108480276, var9 ^ 319852665);
            case 89 -> IlIIlII(-108480275, var9 ^ -1104232531);
            case 90 -> IlIIlII(-108480274, var9 ^ -1191675351);
            case 91 -> IlIIlII(-108480273, var9 ^ -599502305);
            case 92 -> IlIIlII(-108480272, var9 ^ 1612058486);
            case 93 -> IlIIlII(-108480271, var9 ^ 467330657);
            case 94 -> IlIIlII(-108480270, var9 ^ -1525447662);
            case 95 -> IlIIlII(-108480269, var9 ^ 675020342);
            case 96 -> IlIIlII(-108480268, var9 ^ -407123757);
            case 97 -> IlIIlII(-108480267, var9 ^ -876407203);
            case 98 -> IlIIlII(-108480266, var9 ^ -1540447343);
            case 99 -> IlIIlII(-108480265, var9 ^ -813484182);
            case 100 -> IlIIlII(-108480264, var9 ^ 1111059616);
            case 101 -> IlIIlII(-108480263, var9 ^ -2136701843);
            case 102 -> IlIIlII(-108480262, var9 ^ -1401177084);
            case 103 -> IlIIlII(-108480261, var9 ^ -2088507741);
            case 104 -> IlIIlII(-108480260, var9 ^ -1254435389);
            case 105 -> IlIIlII(-108480259, var9 ^ -266506716);
            case 106 -> IlIIlII(-108480258, var9 ^ -323216250);
            case 107 -> IlIIlII(-108480257, var9 ^ -318360785);
            case 108 -> IlIIlII(-108480512, var9 ^ -1733499211);
            case 109 -> IlIIlII(-108480511, var9 ^ 1014259130);
            case 110 -> IlIIlII(-108480510, var9 ^ 1787821281);
            case 111 -> IlIIlII(-108480509, var9 ^ -1668871362);
            case 112 -> IlIIlII(-108480508, var9 ^ 685645068);
            case 113 -> IlIIlII(-108480507, var9 ^ -1280609624);
            case 114 -> IlIIlII(-108480506, var9 ^ 1042321765);
            case 115 -> IlIIlII(-108480505, var9 ^ 1997514016);
            case 116 -> IlIIlII(-108480504, var9 ^ 1657277235);
            case 117 -> IlIIlII(-108480503, var9 ^ 1130606334);
            case 118 -> IlIIlII(-108480502, var9 ^ -1154030784);
            case 119 -> IlIIlII(-108480501, var9 ^ -1862771055);
            case 120 -> IlIIlII(-108480500, var9 ^ 1498289091);
            case 121 -> IlIIlII(-108480499, var9 ^ -2055843259);
            case 122 -> IlIIlII(-108480498, var9 ^ 2064584855);
            case 123 -> IlIIlII(-108480497, var9 ^ -1077421814);
            case 124 -> IlIIlII(-108480496, var9 ^ 835152666);
            case 125 -> IlIIlII(-108480495, var9 ^ -1035333008);
            case 126 -> IlIIlII(-108480494, var9 ^ -1613922842);
            case 127 -> IlIIlII(-108480493, var9 ^ 217941118);
            case 128 -> IlIIlII(-108480492, var9 ^ -1062715501);
            case 129 -> IlIIlII(-108480491, var9 ^ -1125327560);
            case 130 -> IlIIlII(-108480490, var9 ^ 968527038);
            case 131 -> IlIIlII(-108480489, var9 ^ -1555390168);
            case 132 -> IlIIlII(-108480488, var9 ^ 1828117025);
            case 133 -> IlIIlII(-108480487, var9 ^ 90754778);
            case 134 -> IlIIlII(-108480486, var9 ^ 225095315);
            case 135 -> IlIIlII(-108480485, var9 ^ -2106819667);
            case 136 -> IlIIlII(-108480484, var9 ^ -1975665636);
            case 137 -> IlIIlII(-108480483, var9 ^ -1725237757);
            case 138 -> IlIIlII(-108480482, var9 ^ 1673916607);
            case 139 -> IlIIlII(-108480481, var9 ^ 741342116);
            case 140 -> IlIIlII(-108480480, var9 ^ 281031906);
            case 141 -> IlIIlII(-108480479, var9 ^ 1634495889);
            case 142 -> IlIIlII(-108480478, var9 ^ -1350604010);
            case 143 -> IlIIlII(-108480477, var9 ^ -873206041);
            case 144 -> IlIIlII(-108480476, var9 ^ -1677403950);
            case 145 -> IlIIlII(-108480475, var9 ^ 1995802209);
            case 146 -> IlIIlII(-108480474, var9 ^ 1149495516);
            case 147 -> IlIIlII(-108480473, var9 ^ 856201381);
            case 148 -> IlIIlII(-108480472, var9 ^ -1825484122);
            case 149 -> IlIIlII(-108480471, var9 ^ -1019135521);
            case 150 -> IlIIlII(-108480470, var9 ^ -849770297);
            case 151 -> IlIIlII(-108480469, var9 ^ 166934732);
            case 152 -> IlIIlII(-108480468, var9 ^ 847008278);
            case 153 -> IlIIlII(-108480467, var9 ^ 1523727226);
            case 154 -> IlIIlII(-108480466, var9 ^ 1867226820);
            case 155 -> IlIIlII(-108480465, var9 ^ -1303970960);
            case 156 -> IlIIlII(-108480464, var9 ^ -584853834);
            case 157 -> IlIIlII(-108480463, var9 ^ 1310502074);
            case 158 -> IlIIlII(-108480462, var9 ^ 926961237);
            case 159 -> IlIIlII(-108480461, var9 ^ 959240857);
            case 160 -> IlIIlII(-108480460, var9 ^ -1843413916);
            case 161 -> IlIIlII(-108480459, var9 ^ -1511011402);
            case 162 -> IlIIlII(-108480458, var9 ^ 590119161);
            case 163 -> IlIIlII(-108480457, var9 ^ -1165988661);
            case 164 -> IlIIlII(-108480456, var9 ^ 183501722);
            case 165 -> IlIIlII(-108480455, var9 ^ -906813171);
            case 166 -> IlIIlII(-108480454, var9 ^ -2111920253);
            case 167 -> IlIIlII(-108480453, var9 ^ 567061522);
            case 168 -> IlIIlII(-108480452, var9 ^ 1225507518);
            case 169 -> IlIIlII(-108480451, var9 ^ 108732481);
            case 170 -> IlIIlII(-108480450, var9 ^ 289974784);
            case 171 -> IlIIlII(-108480449, var9 ^ -1457445637);
            case 172 -> IlIIlII(-108480448, var9 ^ 106729084);
            case 173 -> IlIIlII(-108480447, var9 ^ -1124031625);
            case 174 -> IlIIlII(-108480446, var9 ^ 1874442391);
            case 175 -> IlIIlII(-108480445, var9 ^ 801591856);
            case 176 -> IlIIlII(-108480444, var9 ^ 1921153235);
            case 177 -> IlIIlII(-108480443, var9 ^ -1346602713);
            case 178 -> IlIIlII(-108480442, var9 ^ -1568373472);
            case 179 -> IlIIlII(-108480441, var9 ^ 533192839);
            case 180 -> IlIIlII(-108480440, var9 ^ 420459919);
            case 181 -> IlIIlII(-108480439, var9 ^ -386807313);
            case 182 -> IlIIlII(-108480438, var9 ^ -1389341925);
            case 183 -> IlIIlII(-108480437, var9 ^ 586363848);
            case 184 -> IlIIlII(-108480436, var9 ^ 1713880002);
            case 185 -> IlIIlII(-108480435, var9 ^ 16408443);
            case 186 -> IlIIlII(-108480434, var9 ^ 94834111);
            case 187 -> IlIIlII(-108480433, var9 ^ 582270957);
            case 188 -> IlIIlII(-108480432, var9 ^ -77639271);
            case 189 -> IlIIlII(-108480431, var9 ^ 124167596);
            case 190 -> IlIIlII(-108480430, var9 ^ 680504565);
            case 191 -> IlIIlII(-108480429, var9 ^ 187472052);
            case 192 -> IlIIlII(-108480428, var9 ^ 1257791337);
            case 193 -> IlIIlII(-108480427, var9 ^ 725679648);
            case 194 -> IlIIlII(-108480426, var9 ^ -2013438168);
            case 195 -> IlIIlII(-108480425, var9 ^ -1919979679);
            case 196 -> IlIIlII(-108480424, var9 ^ 880063321);
            case 197 -> IlIIlII(-108480423, var9 ^ -262226671);
            case 198 -> IlIIlII(-108480422, var9 ^ 343790585);
            case 199 -> IlIIlII(-108480421, var9 ^ -667676481);
            case 200 -> IlIIlII(-108480420, var9 ^ 307510992);
            case 201 -> IlIIlII(-108480419, var9 ^ 1209650715);
            case 202 -> IlIIlII(-108480418, var9 ^ -1208202125);
            case 203 -> IlIIlII(-108480417, var9 ^ 2116125754);
            case 204 -> IlIIlII(-108480416, var9 ^ -2050973478);
            case 205 -> 3;
            case 206 -> IlIIlII(-108480415, var9 ^ -690975794);
            case 207 -> IlIIlII(-108480414, var9 ^ -651792062);
            case 208 -> IlIIlII(-108480413, var9 ^ -719813880);
            case 209 -> IlIIlII(-108480412, var9 ^ 989363619);
            case 210 -> IlIIlII(-108480411, var9 ^ 300849710);
            case 211 -> IlIIlII(-108480410, var9 ^ 969715988);
            case 212 -> IlIIlII(-108480409, var9 ^ -773164873);
            case 213 -> IlIIlII(-108480408, var9 ^ 1114469173);
            case 214 -> IlIIlII(-108480407, var9 ^ 1898308777);
            case 215 -> IlIIlII(-108480406, var9 ^ -909129796);
            case 216 -> IlIIlII(-108480405, var9 ^ -1798275633);
            case 217 -> IlIIlII(-108480404, var9 ^ 1328026079);
            case 218 -> IlIIlII(-108480403, var9 ^ 1359898502);
            case 219 -> IlIIlII(-108480402, var9 ^ -1504294955);
            case 220 -> IlIIlII(-108480401, var9 ^ 1002484019);
            case 221 -> IlIIlII(-108480400, var9 ^ -1135848694);
            case 222 -> IlIIlII(-108480399, var9 ^ -526329393);
            case 223 -> IlIIlII(-108480398, var9 ^ -470635747);
            case 224 -> IlIIlII(-108480397, var9 ^ -1618380297);
            case 225 -> IlIIlII(-108480396, var9 ^ 487403795);
            case 226 -> IlIIlII(-108480395, var9 ^ -1484038467);
            case 227 -> IlIIlII(-108480394, var9 ^ 2046267259);
            case 228 -> IlIIlII(-108480393, var9 ^ 1014255812);
            case 229 -> IlIIlII(-108480392, var9 ^ 531549607);
            case 230 -> IlIIlII(-108480391, var9 ^ -802666178);
            case 231 -> IlIIlII(-108480390, var9 ^ -448135509);
            case 232 -> IlIIlII(-108480389, var9 ^ 490343388);
            case 233 -> IlIIlII(-108480388, var9 ^ -1037819910);
            case 234 -> IlIIlII(-108480387, var9 ^ 994746256);
            case 235 -> IlIIlII(-108480386, var9 ^ -731806785);
            case 236 -> IlIIlII(-108480385, var9 ^ 1814450824);
            case 237 -> IlIIlII(-108480128, var9 ^ 1334529250);
            case 238 -> IlIIlII(-108480127, var9 ^ 995025840);
            case 239 -> IlIIlII(-108480126, var9 ^ -1654200686);
            case 240 -> IlIIlII(-108480125, var9 ^ -958416535);
            case 241 -> IlIIlII(-108480124, var9 ^ 620709054);
            case 242 -> IlIIlII(-108480123, var9 ^ 1555754140);
            case 243 -> IlIIlII(-108480122, var9 ^ 2101096950);
            case 244 -> IlIIlII(-108480121, var9 ^ 760672455);
            case 245 -> IlIIlII(-108480120, var9 ^ 1289552190);
            case 246 -> IlIIlII(-108480119, var9 ^ 1208461977);
            case 247 -> IlIIlII(-108480118, var9 ^ 1929997966);
            case 248 -> IlIIlII(-108480117, var9 ^ -1736485730);
            case 249 -> IlIIlII(-108480116, var9 ^ 1935458087);
            case 250 -> IlIIlII(-108480115, var9 ^ -939478335);
            case 251 -> IlIIlII(-108480114, var9 ^ -1647002942);
            case 252 -> IlIIlII(-108480113, var9 ^ 314784215);
            case 253 -> IlIIlII(-108480112, var9 ^ -2126870688);
            case 254 -> IlIIlII(-108480111, var9 ^ 521721200);
            default -> IlIIlII(-108480110, var9 ^ 977055717);
         };
         int var5 = (var1 & IlIIlII(-108480109, var9 ^ 300698474)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & IlIIlII(-108480108, var9 ^ 276121433)) >>> IlIIlII(-108480107, var9 ^ 1520943694)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & IlIIlII(-108480106, var9 ^ 136426433);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & IlIIlII(-108480105, var9 ^ 871044991);
            }
         }

         lIIll[var2] = new String(var3).intern();
      }

      return lIIll[var2];
   }

   public static void lllII() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic k74/x/IllIlII.l Lk74/x/IllIlII;
      // 03: bipush 1
      // 04: invokestatic k74/x/IIlIIlIl.IIIIIlI (Lk74/x/IllIlII;Z)Z
      // 07: pop
      // 08: invokestatic k74/x/IIlIIlIl.lIIIll ()V
      // 0b: invokestatic k74/x/IIlIIlIl.IlIllI ()V
      // 0e: invokestatic k74/x/IIlIIlIl.lIlI ()V
      // 11: invokestatic k74/x/IIlIIlIl.IIIIll ()V
      // 14: invokestatic k74/x/IIlIIlIl.IlIIll ()V
      // 17: goto 1b
      // 1a: astore 0
      // 1b: new java/util/ArrayList
      // 1e: dup
      // 1f: getstatic k74/x/IIlIIlIl.IIIII Ljava/util/Set;
      // 22: invokespecial java/util/ArrayList.<init> (Ljava/util/Collection;)V
      // 25: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 28: astore 0
      // 29: aload 0
      // 2a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2f: ifeq b1
      // 32: aload 0
      // 33: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 38: checkcast k74/x/IIlIIlIl
      // 3b: astore 1
      // 3c: aload 1
      // 3d: getfield k74/x/IIlIIlIl.IIl Lio/netty/channel/ChannelHandlerContext;
      // 40: astore 2
      // 41: aload 2
      // 42: ifnull a6
      // 45: aload 2
      // 46: invokeinterface io/netty/channel/ChannelHandlerContext.channel ()Lio/netty/channel/Channel; 1
      // 4b: ifnull a6
      // 4e: goto 55
      // 51: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 54: athrow
      // 55: aload 2
      // 56: invokeinterface io/netty/channel/ChannelHandlerContext.channel ()Lio/netty/channel/Channel; 1
      // 5b: invokeinterface io/netty/channel/Channel.isActive ()Z 1
      // 60: ifeq a6
      // 63: goto 6a
      // 66: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 69: athrow
      // 6a: aload 1
      // 6b: aload 2
      // 6c: invokedynamic run (Lk74/x/IIlIIlIl;Lio/netty/channel/ChannelHandlerContext;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, k74/x/IIlIIlIl.lIIllI (Lk74/x/IIlIIlIl;Lio/netty/channel/ChannelHandlerContext;)V, ()V ]
      // 71: astore 3
      // 72: aload 2
      // 73: invokeinterface io/netty/channel/ChannelHandlerContext.channel ()Lio/netty/channel/Channel; 1
      // 78: invokeinterface io/netty/channel/Channel.eventLoop ()Lio/netty/channel/EventLoop; 1
      // 7d: invokeinterface io/netty/channel/EventLoop.inEventLoop ()Z 1
      // 82: ifeq 92
      // 85: aload 3
      // 86: invokeinterface java/lang/Runnable.run ()V 1
      // 8b: goto a3
      // 8e: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 91: athrow
      // 92: aload 2
      // 93: invokeinterface io/netty/channel/ChannelHandlerContext.channel ()Lio/netty/channel/Channel; 1
      // 98: invokeinterface io/netty/channel/Channel.eventLoop ()Lio/netty/channel/EventLoop; 1
      // 9d: aload 3
      // 9e: invokeinterface io/netty/channel/EventLoop.execute (Ljava/lang/Runnable;)V 2
      // a3: goto aa
      // a6: aload 1
      // a7: invokevirtual k74/x/IIlIIlIl.lIllIl ()V
      // aa: goto ae
      // ad: astore 2
      // ae: goto 29
      // b1: getstatic k74/x/IIlIIlIl.IIIII Ljava/util/Set;
      // b4: invokeinterface java/util/Set.clear ()V 1
      // b9: invokestatic k74/x/IIlIIlIl.IIllIl ()V
      // bc: invokestatic k74/x/IIlIIlIl.lIIIIl ()V
      // bf: return
   }

   private void lllIl(ChannelHandlerContext param1, long param2, IlIllIIl param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: invokestatic k74/x/IIllllIl.IIIIl ()[Ljava/lang/String;
      // 003: astore 5
      // 005: aload 4
      // 007: getstatic k74/x/IlIllIIl.l Lk74/x/IlIllIIl;
      // 00a: if_acmpne 017
      // 00d: getstatic k74/x/IIlIIlIl.Ill J
      // 010: goto 01a
      // 013: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 016: athrow
      // 017: getstatic k74/x/IIlIIlIl.IlIll J
      // 01a: lstore 6
      // 01c: invokestatic java/lang/System.nanoTime ()J
      // 01f: lstore 8
      // 021: aload 0
      // 022: aload 0
      // 023: getfield k74/x/IIlIIlIl.IIIll J
      // 026: lload 6
      // 028: lload 8
      // 02a: invokevirtual k74/x/IIlIIlIl.IIIl (JJJ)J
      // 02d: lstore 10
      // 02f: lload 10
      // 031: lconst_0
      // 032: lcmp
      // 033: ifle 049
      // 036: aload 0
      // 037: getfield k74/x/IIlIIlIl.llllI Ljava/util/concurrent/atomic/AtomicBoolean;
      // 03a: bipush 0
      // 03b: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 03e: aload 0
      // 03f: aload 1
      // 040: lload 2
      // 041: aload 4
      // 043: lload 10
      // 045: invokevirtual k74/x/IIlIIlIl.llIl (Lio/netty/channel/ChannelHandlerContext;JLk74/x/IlIllIIl;J)V
      // 048: return
      // 049: aload 4
      // 04b: getstatic k74/x/IlIllIIl.l Lk74/x/IlIllIIl;
      // 04e: if_acmpne 065
      // 051: ldc_w -108480104
      // 054: ldc_w 520485897
      // 057: ldc_w 607922708
      // 05a: ixor
      // 05b: invokestatic k74/x/IIlIIlIl.IlIIlII (II)I
      // 05e: goto 072
      // 061: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 064: athrow
      // 065: ldc_w -108480103
      // 068: ldc_w 520485897
      // 06b: ldc_w 299344751
      // 06e: ixor
      // 06f: invokestatic k74/x/IIlIIlIl.IlIIlII (II)I
      // 072: istore 12
      // 074: bipush 0
      // 075: istore 13
      // 077: new java/util/ArrayList
      // 07a: dup
      // 07b: iload 12
      // 07d: invokespecial java/util/ArrayList.<init> (I)V
      // 080: astore 14
      // 082: aload 14
      // 084: invokeinterface java/util/List.size ()I 1
      // 089: iload 12
      // 08b: if_icmpge 16e
      // 08e: aload 0
      // 08f: getfield k74/x/IIlIIlIl.llIIl Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 092: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.peek ()Ljava/lang/Object;
      // 095: checkcast k74/x/IIllllllI
      // 098: dup
      // 099: astore 15
      // 09b: ifnull 16e
      // 09e: aload 4
      // 0a0: ifnull 0c7
      // 0a3: goto 0aa
      // 0a6: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a9: athrow
      // 0aa: aload 15
      // 0ac: getfield k74/x/IIllllllI.lI Lk74/x/IlIllIIl;
      // 0af: aload 4
      // 0b1: if_acmpeq 0c7
      // 0b4: goto 0bb
      // 0b7: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ba: athrow
      // 0bb: aload 5
      // 0bd: ifnull 16e
      // 0c0: goto 0c7
      // 0c3: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c6: athrow
      // 0c7: aload 15
      // 0c9: getfield k74/x/IIllllllI.l J
      // 0cc: lload 2
      // 0cd: lcmp
      // 0ce: ifle 0e4
      // 0d1: goto 0d8
      // 0d4: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d7: athrow
      // 0d8: aload 5
      // 0da: ifnull 16e
      // 0dd: goto 0e4
      // 0e0: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e3: athrow
      // 0e4: aload 0
      // 0e5: getfield k74/x/IIlIIlIl.llIIl Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 0e8: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.poll ()Ljava/lang/Object;
      // 0eb: checkcast k74/x/IIllllllI
      // 0ee: astore 15
      // 0f0: aload 15
      // 0f2: ifnonnull 101
      // 0f5: aload 5
      // 0f7: ifnull 16e
      // 0fa: goto 101
      // 0fd: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 100: athrow
      // 101: aload 15
      // 103: getfield k74/x/IIllllllI.lI Lk74/x/IlIllIIl;
      // 106: getstatic k74/x/IlIllIIl.l Lk74/x/IlIllIIl;
      // 109: if_acmpne 14b
      // 10c: goto 113
      // 10f: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 112: athrow
      // 113: aload 15
      // 115: getfield k74/x/IIllllllI.II Ljava/lang/Object;
      // 118: instanceof net/minecraft/class_2851
      // 11b: ifeq 14b
      // 11e: goto 125
      // 121: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 124: athrow
      // 125: iload 13
      // 127: ifeq 148
      // 12a: goto 131
      // 12d: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 130: athrow
      // 131: aload 15
      // 133: getfield k74/x/IIllllllI.Il Lio/netty/channel/ChannelPromise;
      // 136: invokeinterface io/netty/channel/ChannelPromise.trySuccess ()Z 1
      // 13b: pop
      // 13c: aload 5
      // 13e: ifnull 082
      // 141: goto 148
      // 144: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 147: athrow
      // 148: bipush 1
      // 149: istore 13
      // 14b: aload 14
      // 14d: aload 15
      // 14f: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 154: pop
      // 155: aload 15
      // 157: getfield k74/x/IIllllllI.lI Lk74/x/IlIllIIl;
      // 15a: getstatic k74/x/IlIllIIl.l Lk74/x/IlIllIIl;
      // 15d: if_acmpne 082
      // 160: aload 15
      // 162: getfield k74/x/IIllllllI.II Ljava/lang/Object;
      // 165: instanceof net/minecraft/class_9836
      // 168: ifeq 082
      // 16b: goto 16e
      // 16e: bipush 0
      // 16f: istore 16
      // 171: aload 14
      // 173: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 178: astore 17
      // 17a: aload 17
      // 17c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 181: ifeq 1a9
      // 184: aload 17
      // 186: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 18b: checkcast k74/x/IIllllllI
      // 18e: astore 18
      // 190: iload 16
      // 192: aload 0
      // 193: aload 1
      // 194: aload 18
      // 196: getfield k74/x/IIllllllI.II Ljava/lang/Object;
      // 199: aload 18
      // 19b: getfield k74/x/IIllllllI.Il Lio/netty/channel/ChannelPromise;
      // 19e: invokevirtual k74/x/IIlIIlIl.IllIl (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)Z
      // 1a1: ior
      // 1a2: istore 16
      // 1a4: aload 5
      // 1a6: ifnull 17a
      // 1a9: iload 16
      // 1ab: ifeq 1d8
      // 1ae: aload 1
      // 1af: invokeinterface io/netty/channel/ChannelHandlerContext.channel ()Lio/netty/channel/Channel; 1
      // 1b4: invokeinterface io/netty/channel/Channel.isOpen ()Z 1
      // 1b9: ifeq 1d8
      // 1bc: goto 1c3
      // 1bf: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c2: athrow
      // 1c3: aload 1
      // 1c4: invokeinterface io/netty/channel/ChannelHandlerContext.flush ()Lio/netty/channel/ChannelHandlerContext; 1
      // 1c9: pop
      // 1ca: aload 0
      // 1cb: invokestatic java/lang/System.nanoTime ()J
      // 1ce: putfield k74/x/IIlIIlIl.IIIll J
      // 1d1: goto 1d8
      // 1d4: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d7: athrow
      // 1d8: aload 0
      // 1d9: getfield k74/x/IIlIIlIl.llllI Ljava/util/concurrent/atomic/AtomicBoolean;
      // 1dc: bipush 0
      // 1dd: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 1e0: getstatic k74/x/IIlIIlIl.I Lk74/x/IllIlII;
      // 1e3: ifnull 247
      // 1e6: aload 0
      // 1e7: getfield k74/x/IIlIIlIl.llIIl Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 1ea: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.isEmpty ()Z
      // 1ed: ifne 247
      // 1f0: goto 1f7
      // 1f3: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f6: athrow
      // 1f7: aload 0
      // 1f8: aload 0
      // 1f9: getfield k74/x/IIlIIlIl.llIIl Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 1fc: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.peek ()Ljava/lang/Object;
      // 1ff: ifnull 22b
      // 202: goto 209
      // 205: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 208: athrow
      // 209: aload 0
      // 20a: getfield k74/x/IIlIIlIl.llIIl Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 20d: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.peek ()Ljava/lang/Object;
      // 210: checkcast k74/x/IIllllllI
      // 213: getfield k74/x/IIllllllI.lI Lk74/x/IlIllIIl;
      // 216: getstatic k74/x/IlIllIIl.l Lk74/x/IlIllIIl;
      // 219: if_acmpne 22b
      // 21c: goto 223
      // 21f: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 222: athrow
      // 223: bipush 1
      // 224: goto 22c
      // 227: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22a: athrow
      // 22b: bipush 0
      // 22c: putfield k74/x/IIlIIlIl.lIl Z
      // 22f: aload 0
      // 230: aload 1
      // 231: aload 0
      // 232: aload 0
      // 233: getfield k74/x/IIlIIlIl.llIIl Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 236: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.peek ()Ljava/lang/Object;
      // 239: checkcast k74/x/IIllllllI
      // 23c: invokevirtual k74/x/IIlIIlIl.lIlll (Lk74/x/IIllllllI;)J
      // 23f: invokevirtual k74/x/IIlIIlIl.lIIll (Lio/netty/channel/ChannelHandlerContext;J)V
      // 242: aload 5
      // 244: ifnull 269
      // 247: aload 0
      // 248: lload 2
      // 249: aload 4
      // 24b: invokevirtual k74/x/IIlIIlIl.lIlII (JLk74/x/IlIllIIl;)Z
      // 24e: ifeq 269
      // 251: goto 258
      // 254: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 257: athrow
      // 258: aload 0
      // 259: aload 1
      // 25a: lload 2
      // 25b: aload 4
      // 25d: lload 6
      // 25f: invokevirtual k74/x/IIlIIlIl.llIl (Lio/netty/channel/ChannelHandlerContext;JLk74/x/IlIllIIl;J)V
      // 262: goto 269
      // 265: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 268: athrow
      // 269: goto 279
      // 26c: astore 6
      // 26e: aload 0
      // 26f: getfield k74/x/IIlIIlIl.llllI Ljava/util/concurrent/atomic/AtomicBoolean;
      // 272: bipush 0
      // 273: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 276: aload 6
      // 278: athrow
      // 279: return
   }

   private void llllI() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/IIlIIlIl.IIl Lio/netty/channel/ChannelHandlerContext;
      // 04: astore 1
      // 05: aload 1
      // 06: ifnonnull 25
      // 09: aload 0
      // 0a: aload 0
      // 0b: getfield k74/x/IIlIIlIl.llIIl Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 0e: new java/nio/channels/ClosedChannelException
      // 11: dup
      // 12: invokespecial java/nio/channels/ClosedChannelException.<init> ()V
      // 15: invokevirtual k74/x/IIlIIlIl.IIIll (Ljava/util/concurrent/ConcurrentLinkedQueue;Ljava/lang/Throwable;)V
      // 18: aload 0
      // 19: bipush 0
      // 1a: putfield k74/x/IIlIIlIl.lIl Z
      // 1d: invokestatic k74/x/IIlIIlIl.llIllI ()V
      // 20: return
      // 21: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: aload 0
      // 26: aload 0
      // 27: getfield k74/x/IIlIIlIl.llIIl Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 2a: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.peek ()Ljava/lang/Object;
      // 2d: ifnull 52
      // 30: aload 0
      // 31: getfield k74/x/IIlIIlIl.llIIl Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 34: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.peek ()Ljava/lang/Object;
      // 37: checkcast k74/x/IIllllllI
      // 3a: getfield k74/x/IIllllllI.lI Lk74/x/IlIllIIl;
      // 3d: getstatic k74/x/IlIllIIl.l Lk74/x/IlIllIIl;
      // 40: if_acmpne 52
      // 43: goto 4a
      // 46: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 49: athrow
      // 4a: bipush 1
      // 4b: goto 53
      // 4e: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 51: athrow
      // 52: bipush 0
      // 53: putfield k74/x/IIlIIlIl.lIl Z
      // 56: aload 0
      // 57: aload 1
      // 58: lconst_0
      // 59: invokevirtual k74/x/IIlIIlIl.lIIll (Lio/netty/channel/ChannelHandlerContext;J)V
      // 5c: return
   }

   private static void I(Object var0) {
      if (var0 instanceof class_2596 var1) {
         llIlllI var2 = IlllI;

         try {
            if (var2 == null) {
               return;
            }
         } catch (CancellationException var3) {
            throw IIIlI(var3);
         }

         llIIIl(IIlIIlIl::IIIIllI);
      }
   }

   private void lllll(ChannelHandlerContext param1, Object param2, ChannelPromise param3) throws Exception {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: aload 2
      // 03: aload 3
      // 04: invokevirtual k74/x/IIlIIlIl.llIlIl (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)V
      // 07: invokestatic k74/x/IIll.lIIIII ()V
      // 0a: invokestatic k74/x/IIll.IIlIIll ()V
      // 0d: aload 0
      // 0e: getfield k74/x/IIlIIlIl.lIlll Z
      // 11: ifeq 36
      // 14: aload 0
      // 15: getfield k74/x/IIlIIlIl.llIlI Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 18: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.isEmpty ()Z
      // 1b: ifne 36
      // 1e: goto 25
      // 21: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: aload 0
      // 26: bipush 0
      // 27: putfield k74/x/IIlIIlIl.lllI Z
      // 2a: aload 0
      // 2b: aload 1
      // 2c: invokevirtual k74/x/IIlIIlIl.IIIIII (Lio/netty/channel/ChannelHandlerContext;)V
      // 2f: goto 36
      // 32: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 35: athrow
      // 36: aload 0
      // 37: bipush 0
      // 38: putfield k74/x/IIlIIlIl.IlIII Z
      // 3b: aload 0
      // 3c: bipush 0
      // 3d: putfield k74/x/IIlIIlIl.lIlll Z
      // 40: return
   }

   private void IIIIII(ChannelHandlerContext var1) throws Exception {
      while (true) {
         IIlIlllIl var2;
         IIlIlllIl var10000 = var2 = this.llIlI.poll();

         try {
            if (var10000 == null) {
               return;
            }

            this.llIlIl(var1, var2.I(), var2.II());
            if (!IIlIIII(var2.I())) {
               continue;
            }
         } catch (Exception var3) {
            throw IIIlI(var3);
         }

         this.IlIII = true;
      }
   }

   private void IIIIIl(class_2596<?> param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: invokedynamic run (Lnet/minecraft/class_2596;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, k74/x/IIlIIlIl.lIllI (Lnet/minecraft/class_2596;)V, ()V ]
      // 06: astore 2
      // 07: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 0a: astore 3
      // 0b: aload 3
      // 0c: ifnull 29
      // 0f: aload 3
      // 10: invokevirtual net/minecraft/class_310.method_18854 ()Z
      // 13: ifne 29
      // 16: goto 1d
      // 19: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: aload 3
      // 1e: aload 2
      // 1f: invokevirtual net/minecraft/class_310.execute (Ljava/lang/Runnable;)V
      // 22: goto 2f
      // 25: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28: athrow
      // 29: aload 2
      // 2a: invokeinterface java/lang/Runnable.run ()V 1
      // 2f: return
   }

   static boolean IIIIlI(class_2596<?> param0, boolean param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: ifnull 30
      // 04: aload 0
      // 05: instanceof net/minecraft/class_2868
      // 08: ifne 28
      // 0b: goto 12
      // 0e: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11: athrow
      // 12: iload 1
      // 13: ifne 28
      // 16: goto 1d
      // 19: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: iload 2
      // 1e: ifeq 30
      // 21: goto 28
      // 24: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27: athrow
      // 28: bipush 1
      // 29: goto 31
      // 2c: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f: athrow
      // 30: bipush 0
      // 31: ireturn
   }

   public static void IIIIll() {
      for (IIlIIlIl var1 : IIIII) {
         var1.IIlIIlI();
      }
   }

   public static void IIIlII(ChannelHandlerContext var0, Object var1) {
      Illlll(var1);
      var0.fireChannelRead(var1);
      IIllll(var1);
   }

   private void IIIlIl(ChannelHandlerContext param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/IIlIIlIl.IIll Ljava/util/concurrent/atomic/AtomicBoolean;
      // 04: bipush 0
      // 05: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 08: bipush 0
      // 09: istore 3
      // 0a: aload 0
      // 0b: getfield k74/x/IIlIIlIl.llI Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 0e: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.poll ()Ljava/lang/Object;
      // 11: checkcast k74/x/IIllIIlI
      // 14: dup
      // 15: astore 2
      // 16: ifnull 3c
      // 19: aload 0
      // 1a: getfield k74/x/IIlIIlIl.llIl Ljava/util/Set;
      // 1d: aload 2
      // 1e: invokeinterface java/util/Set.remove (Ljava/lang/Object;)Z 2
      // 23: pop
      // 24: iload 3
      // 25: aload 0
      // 26: aload 1
      // 27: aload 2
      // 28: getfield k74/x/IIllIIlI.Il Ljava/lang/Object;
      // 2b: aload 2
      // 2c: getfield k74/x/IIllIIlI.I Lio/netty/channel/ChannelPromise;
      // 2f: invokevirtual k74/x/IIlIIlIl.IllIl (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)Z
      // 32: ior
      // 33: istore 3
      // 34: aload 0
      // 35: aload 2
      // 36: invokevirtual k74/x/IIlIIlIl.IIIlIIl (Lk74/x/IIllIIlI;)V
      // 39: goto 0a
      // 3c: iload 3
      // 3d: ifeq 63
      // 40: aload 1
      // 41: invokeinterface io/netty/channel/ChannelHandlerContext.channel ()Lio/netty/channel/Channel; 1
      // 46: invokeinterface io/netty/channel/Channel.isOpen ()Z 1
      // 4b: ifeq 63
      // 4e: goto 55
      // 51: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 54: athrow
      // 55: aload 1
      // 56: invokeinterface io/netty/channel/ChannelHandlerContext.flush ()Lio/netty/channel/ChannelHandlerContext; 1
      // 5b: pop
      // 5c: goto 63
      // 5f: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: goto 6f
      // 66: astore 2
      // 67: aload 0
      // 68: getfield k74/x/IIlIIlIl.IIll Ljava/util/concurrent/atomic/AtomicBoolean;
      // 6b: bipush 0
      // 6c: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 6f: return
   }

   public static void IIIllI(long var0) {
      long var2 = Math.max(0L, Math.min(var0, 60000L));

      try {
         if (lIII == var2) {
            return;
         }
      } catch (CancellationException var4) {
         throw IIIlI(var4);
      }

      lIII = var2;
      lIIlI();
   }

   private void IIIlll(ChannelHandlerContext param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic k74/x/IIIIlIIIl.IIlIl ()Lk74/x/IIIIlIIIl;
      // 03: astore 2
      // 04: getstatic k74/x/IIlIIlIl.IIlll Z
      // 07: ifne 26
      // 0a: aload 2
      // 0b: invokevirtual k74/x/IIIIlIIIl.IIlll ()Z
      // 0e: ifne 2b
      // 11: goto 18
      // 14: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: aload 2
      // 19: invokevirtual k74/x/IIIIlIIIl.llll ()Z
      // 1c: ifne 2b
      // 1f: goto 26
      // 22: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25: athrow
      // 26: return
      // 27: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: invokestatic k74/x/IIlIIlIl.lIIII ()V
      // 2e: return
   }

   public static boolean IIlIII() {
      return lllII;
   }

   private void IIlIIl(ChannelHandlerContext var1) {
      while (true) {
         IIlIlII var2;
         IIlIlII var10000 = var2 = this.lIIII.poll();

         label20: {
            try {
               if (var10000 != null) {
                  if (!var1.channel().isOpen()) {
                     continue;
                  }
                  break label20;
               }
            } catch (CancellationException var3) {
               throw IIIlI(var3);
            }

            this.l.set(false);
            return;
         }

         IIIlII(var1, var2.I);
      }
   }

   public void handlerRemoved(ChannelHandlerContext var1) {
      try {
         this.IIl = null;
         IIIII.remove(this);
         this.lIllIl();
         if (IIIII.isEmpty()) {
            IIllIl();
            lIIIIl();
         }
      } catch (CancellationException var2) {
         throw IIIlI(var2);
      }
   }

   private void IIlIlI(ChannelHandlerContext param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/IIlIIlIl.llIIl Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 04: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.peek ()Ljava/lang/Object;
      // 07: checkcast k74/x/IIllllllI
      // 0a: astore 2
      // 0b: aload 2
      // 0c: ifnull 2c
      // 0f: aload 2
      // 10: getfield k74/x/IIllllllI.lI Lk74/x/IlIllIIl;
      // 13: getstatic k74/x/IlIllIIl.l Lk74/x/IlIllIIl;
      // 16: if_acmpne 2c
      // 19: goto 20
      // 1c: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: aload 0
      // 21: aload 1
      // 22: invokevirtual k74/x/IIlIIlIl.IIlIlII (Lio/netty/channel/ChannelHandlerContext;)Z
      // 25: goto 31
      // 28: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b: athrow
      // 2c: aload 0
      // 2d: aload 1
      // 2e: invokevirtual k74/x/IIlIIlIl.II (Lio/netty/channel/ChannelHandlerContext;)Z
      // 31: istore 3
      // 32: iload 3
      // 33: ifeq 60
      // 36: aload 1
      // 37: invokeinterface io/netty/channel/ChannelHandlerContext.channel ()Lio/netty/channel/Channel; 1
      // 3c: invokeinterface io/netty/channel/Channel.isOpen ()Z 1
      // 41: ifeq 60
      // 44: goto 4b
      // 47: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a: athrow
      // 4b: aload 1
      // 4c: invokeinterface io/netty/channel/ChannelHandlerContext.flush ()Lio/netty/channel/ChannelHandlerContext; 1
      // 51: pop
      // 52: aload 0
      // 53: invokestatic java/lang/System.nanoTime ()J
      // 56: putfield k74/x/IIlIIlIl.IIIll J
      // 59: goto 60
      // 5c: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5f: athrow
      // 60: aload 0
      // 61: getfield k74/x/IIlIIlIl.llllI Ljava/util/concurrent/atomic/AtomicBoolean;
      // 64: bipush 0
      // 65: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 68: aload 0
      // 69: getfield k74/x/IIlIIlIl.llIIl Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 6c: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.isEmpty ()Z
      // 6f: ifne 8c
      // 72: aload 0
      // 73: aload 1
      // 74: aload 0
      // 75: aload 0
      // 76: getfield k74/x/IIlIIlIl.llIIl Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 79: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.peek ()Ljava/lang/Object;
      // 7c: checkcast k74/x/IIllllllI
      // 7f: invokevirtual k74/x/IIlIIlIl.lIlll (Lk74/x/IIllllllI;)J
      // 82: invokevirtual k74/x/IIlIIlIl.lIIll (Lio/netty/channel/ChannelHandlerContext;J)V
      // 85: goto 94
      // 88: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8b: athrow
      // 8c: aload 0
      // 8d: bipush 0
      // 8e: putfield k74/x/IIlIIlIl.lIl Z
      // 91: invokestatic k74/x/IIlIIlIl.llIllI ()V
      // 94: goto a2
      // 97: astore 2
      // 98: aload 0
      // 99: getfield k74/x/IIlIIlIl.llllI Ljava/util/concurrent/atomic/AtomicBoolean;
      // 9c: bipush 0
      // 9d: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // a0: aload 2
      // a1: athrow
      // a2: return
   }

   private static Integer IIlIll(class_2596<?> param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: ldc_w 1494694002
      // 003: istore 4
      // 005: aload 0
      // 006: invokeinterface net/minecraft/class_2596.getClass ()Ljava/lang/Class; 1
      // 00b: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 00e: astore 1
      // 00f: aload 1
      // 010: ldc_w -108480089
      // 013: iload 4
      // 015: ldc_w 2138142846
      // 018: ixor
      // 019: invokestatic k74/x/IIlIIlIl.IlIIlII (II)I
      // 01c: ldc_w -108480088
      // 01f: iload 4
      // 021: ldc_w 165821455
      // 024: ixor
      // 025: invokestatic k74/x/IIlIIlIl.IlIIlII (II)I
      // 028: invokestatic k74/x/IIlIIlIl.llIll (II)Ljava/lang/String;
      // 02b: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 02e: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 031: ifne 0b8
      // 034: aload 1
      // 035: ldc_w -108480087
      // 038: iload 4
      // 03a: ldc_w 1301900843
      // 03d: ixor
      // 03e: invokestatic k74/x/IIlIIlIl.IlIIlII (II)I
      // 041: ldc_w -108480086
      // 044: iload 4
      // 046: ldc_w 440017253
      // 049: ixor
      // 04a: invokestatic k74/x/IIlIIlIl.IlIIlII (II)I
      // 04d: invokestatic k74/x/IIlIIlIl.llIll (II)Ljava/lang/String;
      // 050: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 053: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 056: ifeq 08c
      // 059: goto 060
      // 05c: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05f: athrow
      // 060: aload 1
      // 061: ldc_w -108480085
      // 064: iload 4
      // 066: ldc_w 80354070
      // 069: ixor
      // 06a: invokestatic k74/x/IIlIIlIl.IlIIlII (II)I
      // 06d: ldc_w -108480084
      // 070: iload 4
      // 072: ldc_w -1237829853
      // 075: ixor
      // 076: invokestatic k74/x/IIlIIlIl.IlIIlII (II)I
      // 079: invokestatic k74/x/IIlIIlIl.llIll (II)Ljava/lang/String;
      // 07c: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 07f: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 082: ifne 0b8
      // 085: goto 08c
      // 088: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08b: athrow
      // 08c: aload 1
      // 08d: ldc_w -108480083
      // 090: iload 4
      // 092: ldc_w -1151619270
      // 095: ixor
      // 096: invokestatic k74/x/IIlIIlIl.IlIIlII (II)I
      // 099: ldc_w -108480082
      // 09c: iload 4
      // 09e: ldc_w 1144672933
      // 0a1: ixor
      // 0a2: invokestatic k74/x/IIlIIlIl.IlIIlII (II)I
      // 0a5: invokestatic k74/x/IIlIIlIl.llIll (II)Ljava/lang/String;
      // 0a8: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0ab: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 0ae: ifeq 0c0
      // 0b1: goto 0b8
      // 0b4: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b7: athrow
      // 0b8: bipush 1
      // 0b9: goto 0c1
      // 0bc: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bf: athrow
      // 0c0: bipush 0
      // 0c1: istore 2
      // 0c2: iload 2
      // 0c3: ifne 0cc
      // 0c6: aconst_null
      // 0c7: areturn
      // 0c8: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0cb: athrow
      // 0cc: aload 0
      // 0cd: bipush 4
      // 0ce: anewarray 378
      // 0d1: dup
      // 0d2: bipush 0
      // 0d3: ldc_w -108480081
      // 0d6: iload 4
      // 0d8: ldc_w -1437746260
      // 0db: ixor
      // 0dc: invokestatic k74/x/IIlIIlIl.IlIIlII (II)I
      // 0df: ldc_w -108480080
      // 0e2: iload 4
      // 0e4: ldc_w -727520774
      // 0e7: ixor
      // 0e8: invokestatic k74/x/IIlIIlIl.IlIIlII (II)I
      // 0eb: invokestatic k74/x/IIlIIlIl.llIll (II)Ljava/lang/String;
      // 0ee: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0f1: aastore
      // 0f2: dup
      // 0f3: bipush 1
      // 0f4: ldc_w -108480079
      // 0f7: iload 4
      // 0f9: ldc_w 23072891
      // 0fc: ixor
      // 0fd: invokestatic k74/x/IIlIIlIl.IlIIlII (II)I
      // 100: ldc_w -108480078
      // 103: iload 4
      // 105: ldc_w -1228379448
      // 108: ixor
      // 109: invokestatic k74/x/IIlIIlIl.IlIIlII (II)I
      // 10c: invokestatic k74/x/IIlIIlIl.llIll (II)Ljava/lang/String;
      // 10f: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 112: aastore
      // 113: dup
      // 114: bipush 2
      // 115: ldc_w -108480077
      // 118: iload 4
      // 11a: ldc_w -96272690
      // 11d: ixor
      // 11e: invokestatic k74/x/IIlIIlIl.IlIIlII (II)I
      // 121: ldc_w -108480076
      // 124: iload 4
      // 126: ldc_w -42815702
      // 129: ixor
      // 12a: invokestatic k74/x/IIlIIlIl.IlIIlII (II)I
      // 12d: invokestatic k74/x/IIlIIlIl.llIll (II)Ljava/lang/String;
      // 130: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 133: aastore
      // 134: dup
      // 135: bipush 3
      // 136: ldc_w -108480075
      // 139: iload 4
      // 13b: ldc_w -1982371095
      // 13e: ixor
      // 13f: invokestatic k74/x/IIlIIlIl.IlIIlII (II)I
      // 142: ldc_w -108480074
      // 145: iload 4
      // 147: ldc_w 1442659584
      // 14a: ixor
      // 14b: invokestatic k74/x/IIlIIlIl.IlIIlII (II)I
      // 14e: invokestatic k74/x/IIlIIlIl.llIll (II)Ljava/lang/String;
      // 151: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 154: aastore
      // 155: invokestatic k74/x/IIlIIlIl.IIIlIII (Lnet/minecraft/class_2596;[Ljava/lang/String;)Ljava/lang/Integer;
      // 158: astore 3
      // 159: aload 3
      // 15a: ifnull 17e
      // 15d: aload 3
      // 15e: invokevirtual java/lang/Integer.intValue ()I
      // 161: ifge 17e
      // 164: goto 16b
      // 167: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16a: athrow
      // 16b: aload 3
      // 16c: invokevirtual java/lang/Integer.intValue ()I
      // 16f: aload 3
      // 170: invokevirtual java/lang/Integer.intValue ()I
      // 173: i2s
      // 174: if_icmpeq 184
      // 177: goto 17e
      // 17a: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17d: athrow
      // 17e: aconst_null
      // 17f: areturn
      // 180: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 183: athrow
      // 184: aload 3
      // 185: areturn
   }

   private void IIllII(ChannelHandlerContext var1, long var2) {
      try {
         if (!this.IIll.compareAndSet(false, true)) {
            return;
         }
      } catch (CancellationException var7) {
         throw IIIlI(var7);
      }

      Runnable var4 = this::IIIIlIl;

      try {
         if (var2 > 0L) {
            var1.executor().schedule(var4, Math.max(var2, IIlIl), TimeUnit.NANOSECONDS);
            return;
         }
      } catch (CancellationException var5) {
         throw IIIlI(var5);
      }

      try {
         if (var1.executor().inEventLoop()) {
            var4.run();
            return;
         }
      } catch (CancellationException var6) {
         throw IIIlI(var6);
      }

      var1.executor().execute(var4);
   }

   private static void IIllIl() {
      synchronized (IIII) {
         IlIl = false;
         III = null;
         I = null;
         IllI = null;
         llll = IlIllIIl.II;
         IIlll = false;
      }
   }

   private static boolean IIlllI() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 03: astore 0
      // 04: aload 0
      // 05: ifnull 1e
      // 08: aload 0
      // 09: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 0c: ifnull 1e
      // 0f: goto 16
      // 12: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: bipush 1
      // 17: goto 1f
      // 1a: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: bipush 0
      // 1f: ireturn
   }

   private static void IIllll(Object param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: instanceof net/minecraft/class_2708
      // 04: ifne 15
      // 07: aload 0
      // 08: instanceof net/minecraft/class_2724
      // 0b: ifeq 2b
      // 0e: goto 15
      // 11: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: aload 0
      // 16: instanceof net/minecraft/class_2596
      // 19: ifeq 2b
      // 1c: goto 23
      // 1f: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22: athrow
      // 23: aload 0
      // 24: checkcast net/minecraft/class_2596
      // 27: astore 1
      // 28: goto 2c
      // 2b: return
      // 2c: invokestatic k74/x/IIIIIllII.III ()Lk74/x/IIIIIllII;
      // 2f: astore 2
      // 30: aload 2
      // 31: ifnull 51
      // 34: aload 2
      // 35: invokevirtual k74/x/IIIIIllII.II ()Lk74/x/lIIIlIlI;
      // 38: ifnull 51
      // 3b: goto 42
      // 3e: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41: athrow
      // 42: aload 2
      // 43: invokevirtual k74/x/IIIIIllII.II ()Lk74/x/lIIIlIlI;
      // 46: aload 1
      // 47: invokevirtual k74/x/lIIIlIlI.llII (Lnet/minecraft/class_2596;)V
      // 4a: goto 51
      // 4d: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 50: athrow
      // 51: return
   }

   private boolean IlIIII(IIllllllI var1) {
      try {
         if (this.lIllI.size() >= IlIIlII(-108480073, -1298180818 ^ -230662923)) {
            return false;
         }
      } catch (CancellationException var2) {
         throw IIIlI(var2);
      }

      this.lIllI.offer(var1);
      return true;
   }

   public static int IlIIIl() {
      long var0 = 0L;

      for (IIlIIlIl var3 : IIIII) {
         var0 += var3.llIIl.size();
      }

      try {
         if (var0 > 2147483647L) {
            return IlIIlII(-108480072, 2100159966 ^ -1879761490);
         }
      } catch (CancellationException var4) {
         throw IIIlI(var4);
      }

      return (int)var0;
   }

   private static boolean IlIIlI(Object param0, IlIllIIl param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w 1109704469
      // 003: istore 4
      // 005: aload 1
      // 006: ifnull 01f
      // 009: aload 0
      // 00a: instanceof net/minecraft/class_2596
      // 00d: ifeq 01f
      // 010: goto 017
      // 013: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 016: athrow
      // 017: aload 0
      // 018: checkcast net/minecraft/class_2596
      // 01b: astore 2
      // 01c: goto 021
      // 01f: bipush 0
      // 020: ireturn
      // 021: aload 2
      // 022: instanceof net/minecraft/class_2856
      // 025: ifeq 02e
      // 028: bipush 0
      // 029: ireturn
      // 02a: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02d: athrow
      // 02e: aload 1
      // 02f: getstatic k74/x/IlIllIIl.II Lk74/x/IlIllIIl;
      // 032: if_acmpne 03b
      // 035: bipush 1
      // 036: ireturn
      // 037: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03a: athrow
      // 03b: aload 1
      // 03c: getstatic k74/x/IlIllIIl.Il Lk74/x/IlIllIIl;
      // 03f: if_acmpne 076
      // 042: aload 2
      // 043: instanceof net/minecraft/class_2828
      // 046: ifne 06c
      // 049: goto 050
      // 04c: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04f: athrow
      // 050: aload 2
      // 051: instanceof net/minecraft/class_2833
      // 054: ifne 06c
      // 057: goto 05e
      // 05a: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05d: athrow
      // 05e: aload 2
      // 05f: instanceof net/minecraft/class_9836
      // 062: ifeq 074
      // 065: goto 06c
      // 068: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06b: athrow
      // 06c: bipush 1
      // 06d: goto 075
      // 070: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 073: athrow
      // 074: bipush 0
      // 075: ireturn
      // 076: aload 1
      // 077: getstatic k74/x/IlIllIIl.l Lk74/x/IlIllIIl;
      // 07a: if_acmpne 086
      // 07d: aload 2
      // 07e: invokestatic k74/x/IIlIIlIl.Illl (Lnet/minecraft/class_2596;)Z
      // 081: ireturn
      // 082: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 085: athrow
      // 086: aload 2
      // 087: invokeinterface net/minecraft/class_2596.getClass ()Ljava/lang/Class; 1
      // 08c: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 08f: astore 3
      // 090: aload 3
      // 091: ldc_w -108480071
      // 094: iload 4
      // 096: ldc_w 354332481
      // 099: ixor
      // 09a: invokestatic k74/x/IIlIIlIl.IlIIlII (II)I
      // 09d: ldc_w -108480070
      // 0a0: iload 4
      // 0a2: ldc_w 509487775
      // 0a5: ixor
      // 0a6: invokestatic k74/x/IIlIIlIl.IlIIlII (II)I
      // 0a9: invokestatic k74/x/IIlIIlIl.llIll (II)Ljava/lang/String;
      // 0ac: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0af: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 0b2: ifne 139
      // 0b5: aload 3
      // 0b6: ldc_w -108480069
      // 0b9: iload 4
      // 0bb: ldc_w -938203018
      // 0be: ixor
      // 0bf: invokestatic k74/x/IIlIIlIl.IlIIlII (II)I
      // 0c2: ldc_w -108480068
      // 0c5: iload 4
      // 0c7: ldc_w -730974405
      // 0ca: ixor
      // 0cb: invokestatic k74/x/IIlIIlIl.IlIIlII (II)I
      // 0ce: invokestatic k74/x/IIlIIlIl.llIll (II)Ljava/lang/String;
      // 0d1: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0d4: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 0d7: ifne 139
      // 0da: goto 0e1
      // 0dd: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e0: athrow
      // 0e1: aload 3
      // 0e2: ldc_w -108480067
      // 0e5: iload 4
      // 0e7: ldc_w -1619209321
      // 0ea: ixor
      // 0eb: invokestatic k74/x/IIlIIlIl.IlIIlII (II)I
      // 0ee: ldc_w -108480066
      // 0f1: iload 4
      // 0f3: ldc_w 430175593
      // 0f6: ixor
      // 0f7: invokestatic k74/x/IIlIIlIl.IlIIlII (II)I
      // 0fa: invokestatic k74/x/IIlIIlIl.llIll (II)Ljava/lang/String;
      // 0fd: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 100: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 103: ifne 139
      // 106: goto 10d
      // 109: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10c: athrow
      // 10d: aload 3
      // 10e: ldc_w -108480065
      // 111: iload 4
      // 113: ldc_w -1168608399
      // 116: ixor
      // 117: invokestatic k74/x/IIlIIlIl.IlIIlII (II)I
      // 11a: ldc_w -108480064
      // 11d: iload 4
      // 11f: ldc_w 1187631699
      // 122: ixor
      // 123: invokestatic k74/x/IIlIIlIl.IlIIlII (II)I
      // 126: invokestatic k74/x/IIlIIlIl.llIll (II)Ljava/lang/String;
      // 129: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 12c: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 12f: ifeq 141
      // 132: goto 139
      // 135: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 138: athrow
      // 139: bipush 1
      // 13a: goto 142
      // 13d: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 140: athrow
      // 141: bipush 0
      // 142: ireturn
   }

   public static void IlIIll() {
      IlllI = null;
   }

   private long IlIlII(IIllIIlI var1) {
      long var2 = this.IlIll(var1.Il);

      try {
         if (var2 <= 0L) {
            return 0L;
         }
      } catch (CancellationException var9) {
         throw IIIlI(var9);
      }

      try {
         if (this.llI.size() > IlIIlII(-108480063, -1313058658 ^ 1060740278)) {
            return 0L;
         }
      } catch (CancellationException var6) {
         throw IIIlI(var6);
      }

      label40: {
         try {
            if (lIllll() != IllIIlI.II || !this.llIl.contains(var1)) {
               break label40;
            }
         } catch (CancellationException var8) {
            throw IIIlI(var8);
         }

         var2 = Math.min(60000L, var2 + IIllllI());
      }

      long var4 = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - var1.II);

      try {
         if (var4 >= 60000L) {
            return var4;
         }
      } catch (CancellationException var7) {
         throw IIIlI(var7);
      }

      return Math.min(var2, 60000L);
   }

   private void IlIlIl(ChannelHandlerContext param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic java/lang/System.nanoTime ()J
      // 03: lstore 2
      // 04: aload 0
      // 05: aload 0
      // 06: getfield k74/x/IIlIIlIl.II J
      // 09: getstatic k74/x/IIlIIlIl.IlIll J
      // 0c: lload 2
      // 0d: invokevirtual k74/x/IIlIIlIl.IIIl (JJJ)J
      // 10: lstore 4
      // 12: lload 4
      // 14: lconst_0
      // 15: lcmp
      // 16: ifle 29
      // 19: aload 0
      // 1a: getfield k74/x/IIlIIlIl.l Ljava/util/concurrent/atomic/AtomicBoolean;
      // 1d: bipush 0
      // 1e: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 21: aload 0
      // 22: aload 1
      // 23: lload 4
      // 25: invokevirtual k74/x/IIlIIlIl.lllI (Lio/netty/channel/ChannelHandlerContext;J)V
      // 28: return
      // 29: bipush 0
      // 2a: istore 6
      // 2c: iload 6
      // 2e: ldc_w -108480062
      // 31: ldc_w 751321921
      // 34: ldc_w 1725211118
      // 37: ixor
      // 38: invokestatic k74/x/IIlIIlIl.IlIIlII (II)I
      // 3b: if_icmpge 7b
      // 3e: aload 0
      // 3f: getfield k74/x/IIlIIlIl.lIIII Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 42: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.poll ()Ljava/lang/Object;
      // 45: checkcast k74/x/IIlIlII
      // 48: dup
      // 49: astore 7
      // 4b: ifnull 7b
      // 4e: aload 1
      // 4f: invokeinterface io/netty/channel/ChannelHandlerContext.channel ()Lio/netty/channel/Channel; 1
      // 54: invokeinterface io/netty/channel/Channel.isOpen ()Z 1
      // 59: ifeq 75
      // 5c: goto 63
      // 5f: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: pop
      // 65: aload 1
      // 66: aload 7
      // 68: getfield k74/x/IIlIlII.I Ljava/lang/Object;
      // 6b: invokestatic k74/x/IIlIIlIl.IIIlII (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;)V
      // 6e: goto 75
      // 71: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 74: athrow
      // 75: iinc 6 1
      // 78: goto 2c
      // 7b: iload 6
      // 7d: ifle 8e
      // 80: aload 0
      // 81: invokestatic java/lang/System.nanoTime ()J
      // 84: putfield k74/x/IIlIIlIl.II J
      // 87: goto 8e
      // 8a: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8d: athrow
      // 8e: aload 0
      // 8f: getfield k74/x/IIlIIlIl.l Ljava/util/concurrent/atomic/AtomicBoolean;
      // 92: bipush 0
      // 93: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 96: aload 0
      // 97: getfield k74/x/IIlIIlIl.lIIII Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 9a: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.isEmpty ()Z
      // 9d: ifne af
      // a0: aload 0
      // a1: aload 1
      // a2: getstatic k74/x/IIlIIlIl.IlIll J
      // a5: invokevirtual k74/x/IIlIIlIl.lllI (Lio/netty/channel/ChannelHandlerContext;J)V
      // a8: goto af
      // ab: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ae: athrow
      // af: goto bd
      // b2: astore 2
      // b3: aload 0
      // b4: getfield k74/x/IIlIIlIl.l Ljava/util/concurrent/atomic/AtomicBoolean;
      // b7: bipush 0
      // b8: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // bb: aload 2
      // bc: athrow
      // bd: return
   }

   public static void IlIllI() {
      lIIllI var0 = IIIIlIIIl.IIlIl().IIllI();

      try {
         for (IIlIIlIl var2 : IIIII) {
            var2.IIIIIll(var0);
         }
      } finally {
         IIlll = false;
      }
   }

   private void l() {
      ChannelHandlerContext var1 = this.IIl;

      try {
         if (var1 == null) {
            this.lIIII.clear();
            return;
         }
      } catch (CancellationException var2) {
         throw IIIlI(var2);
      }

      this.lllI(var1, 0L);
   }

   private boolean IlIlll(IIlIlII param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/IIlIIlIl.lIIII Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 04: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.size ()I
      // 07: ldc_w -108480061
      // 0a: ldc_w 1025998939
      // 0d: ldc_w -690054207
      // 10: ixor
      // 11: invokestatic k74/x/IIlIIlIl.IlIIlII (II)I
      // 14: if_icmplt 1d
      // 17: bipush 0
      // 18: ireturn
      // 19: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: aload 0
      // 1e: getfield k74/x/IIlIIlIl.lIIII Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 21: aload 1
      // 22: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.offer (Ljava/lang/Object;)Z
      // 25: pop
      // 26: aload 1
      // 27: ifnull 46
      // 2a: aload 1
      // 2b: invokevirtual k74/x/IIlIlII.l ()Ljava/lang/Object;
      // 2e: ifnull 46
      // 31: goto 38
      // 34: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37: athrow
      // 38: aload 1
      // 39: invokevirtual k74/x/IIlIlII.l ()Ljava/lang/Object;
      // 3c: invokestatic k74/x/IIlIIlIl.I (Ljava/lang/Object;)V
      // 3f: goto 46
      // 42: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 45: athrow
      // 46: bipush 1
      // 47: ireturn
   }

   private void IllIII(ChannelHandlerContext var1, Object var2, ChannelPromise var3) {
      ChannelPromise var10000;
      label16: {
         try {
            if (var3.isVoid()) {
               var10000 = var1.newPromise();
               break label16;
            }
         } catch (CancellationException var5) {
            throw IIIlI(var5);
         }

         var10000 = var3;
      }

      ChannelPromise var4 = var10000;
      var4.addListener(IIlIIlIl::lIlIlI);
      this.IllIl(var1, var2, var4);
   }

   public static boolean IllIIl(IllIlII param0, IlIllIIl param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: ifnonnull 0a
      // 04: bipush 0
      // 05: ireturn
      // 06: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09: athrow
      // 0a: aload 1
      // 0b: ifnonnull 18
      // 0e: getstatic k74/x/IlIllIIl.II Lk74/x/IlIllIIl;
      // 11: goto 19
      // 14: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: aload 1
      // 19: astore 2
      // 1a: getstatic k74/x/IIlIIlIl.IIII Ljava/lang/Object;
      // 1d: dup
      // 1e: astore 3
      // 1f: monitorenter
      // 20: getstatic k74/x/IIlIIlIl.IlIl Z
      // 23: ifeq 47
      // 26: getstatic k74/x/IIlIIlIl.III Lk74/x/IllIlII;
      // 29: aload 0
      // 2a: if_acmpne 43
      // 2d: getstatic k74/x/IIlIIlIl.llll Lk74/x/IlIllIIl;
      // 30: aload 2
      // 31: if_acmpne 43
      // 34: goto 3b
      // 37: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a: athrow
      // 3b: bipush 1
      // 3c: goto 44
      // 3f: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 42: athrow
      // 43: bipush 0
      // 44: aload 3
      // 45: monitorexit
      // 46: ireturn
      // 47: getstatic k74/x/IIlIIlIl.I Lk74/x/IllIlII;
      // 4a: ifnull 51
      // 4d: bipush 0
      // 4e: aload 3
      // 4f: monitorexit
      // 50: ireturn
      // 51: aload 0
      // 52: putstatic k74/x/IIlIIlIl.III Lk74/x/IllIlII;
      // 55: aload 2
      // 56: putstatic k74/x/IIlIIlIl.llll Lk74/x/IlIllIIl;
      // 59: bipush 1
      // 5a: putstatic k74/x/IIlIIlIl.IlIl Z
      // 5d: bipush 1
      // 5e: aload 3
      // 5f: monitorexit
      // 60: ireturn
      // 61: astore 4
      // 63: aload 3
      // 64: monitorexit
      // 65: aload 4
      // 67: athrow
   }

   private boolean IllIlI(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: instanceof net/minecraft/class_2596
      // 04: ifeq 0f
      // 07: aload 1
      // 08: checkcast net/minecraft/class_2596
      // 0b: astore 2
      // 0c: goto 11
      // 0f: bipush 0
      // 10: ireturn
      // 11: invokestatic k74/x/IIIIlIIIl.IIlIl ()Lk74/x/IIIIlIIIl;
      // 14: astore 3
      // 15: aload 3
      // 16: invokevirtual k74/x/IIIIlIIIl.IIlll ()Z
      // 19: ifeq 48
      // 1c: aload 3
      // 1d: invokevirtual k74/x/IIIIlIIIl.IIIII ()Z
      // 20: ifeq 48
      // 23: goto 2a
      // 26: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29: athrow
      // 2a: aload 3
      // 2b: invokevirtual k74/x/IIIIlIIIl.lllI ()Z
      // 2e: ifeq 48
      // 31: goto 38
      // 34: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37: athrow
      // 38: aload 2
      // 39: invokeinterface net/minecraft/class_2596.method_55943 ()Z 1
      // 3e: ifeq 4e
      // 41: goto 48
      // 44: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 47: athrow
      // 48: bipush 0
      // 49: ireturn
      // 4a: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4d: athrow
      // 4e: aload 3
      // 4f: invokevirtual k74/x/IIIIlIIIl.llI ()Z
      // 52: ifeq 63
      // 55: aload 2
      // 56: invokestatic k74/x/IIlIIlIl.llllIl (Lnet/minecraft/class_2596;)Z
      // 59: ifeq 6b
      // 5c: goto 63
      // 5f: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: bipush 1
      // 64: goto 6c
      // 67: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6a: athrow
      // 6b: bipush 0
      // 6c: ireturn
   }

   public static void IllIll() {
      try {
         if (IIllllI.II()) {
            return;
         }
      } catch (CancellationException var6) {
         throw IIIlI(var6);
      }

      IIlI++;

      for (IIlIIlIl var1 : IIIII) {
         ChannelHandlerContext var2 = var1.IIl;

         try {
            if (var2 == null) {
               continue;
            }
         } catch (CancellationException var4) {
            throw IIIlI(var4);
         }

         Runnable var3 = IIlIIlIl::IIIllll;

         try {
            if (var2.executor().inEventLoop()) {
               var3.run();
               continue;
            }
         } catch (CancellationException var5) {
            throw IIIlI(var5);
         }

         var2.executor().execute(var3);
      }
   }

   public static int IlllII() {
      return lll;
   }

   private boolean IlllIl(IIlIlllIl var1) {
      try {
         if (this.lIlII.size() >= 4) {
            return false;
         }
      } catch (CancellationException var2) {
         throw IIIlI(var2);
      }

      this.lIlII.offer(var1);
      return true;
   }

   private static boolean IllllI(class_2596<?> var0) {
      try {
         if (var0 == null) {
            return false;
         }
      } catch (Throwable var5) {
         throw IIIlI(var5);
      }

      llIlllI var1 = IlllI;

      try {
         if (var1 == null) {
            return false;
         }
      } catch (Throwable var4) {
         throw IIIlI(var4);
      }

      try {
         return var1.l().test(var0);
      } catch (Throwable var3) {
         return false;
      }
   }

   private static void Illlll(Object var0) {
      if (var0 instanceof class_2923 var1) {
         IIIIlIIIl var2 = IIIIlIIIl.IIlIl();
         var2.Illl(var1.comp_2201());
         var2.lI(var1);
      }
   }

   private static void lIIIII(ChannelHandlerContext var0, Object var1) {
      try {
         if (var0.channel().isOpen()) {
            var0.writeAndFlush(var1, var0.newPromise());
         }
      } catch (CancellationException var2) {
         throw IIIlI(var2);
      }
   }

   private static void lIIIIl() {
      IIlII.clear();
      lllIl = false;
   }

   private static void lIIIlI(class_2868 var0, Future var1) throws Exception {
      try {
         if (!var1.isSuccess()) {
            lllllll.Ill(var0.method_12442());
         }
      } catch (Exception var2) {
         throw IIIlI(var2);
      }
   }

   public static void lIIIll() {
      llIll = false;
      lllII = false;

      for (IIlIIlIl var1 : IIIII) {
         var1.l();
      }
   }

   public static void lIIlII(long var0, long var2) {
      lIIlI();
   }

   private void lIIlIl(ChannelHandlerContext param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 0
      // 01: istore 3
      // 02: aload 0
      // 03: getfield k74/x/IIlIIlIl.lIllI Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 06: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.poll ()Ljava/lang/Object;
      // 09: checkcast k74/x/IIllllllI
      // 0c: dup
      // 0d: astore 2
      // 0e: ifnull 24
      // 11: iload 3
      // 12: aload 0
      // 13: aload 1
      // 14: aload 2
      // 15: getfield k74/x/IIllllllI.II Ljava/lang/Object;
      // 18: aload 2
      // 19: getfield k74/x/IIllllllI.Il Lio/netty/channel/ChannelPromise;
      // 1c: invokevirtual k74/x/IIlIIlIl.IllIl (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)Z
      // 1f: ior
      // 20: istore 3
      // 21: goto 02
      // 24: iload 3
      // 25: ifeq 4b
      // 28: aload 1
      // 29: invokeinterface io/netty/channel/ChannelHandlerContext.channel ()Lio/netty/channel/Channel; 1
      // 2e: invokeinterface io/netty/channel/Channel.isOpen ()Z 1
      // 33: ifeq 4b
      // 36: goto 3d
      // 39: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c: athrow
      // 3d: aload 1
      // 3e: invokeinterface io/netty/channel/ChannelHandlerContext.flush ()Lio/netty/channel/ChannelHandlerContext; 1
      // 43: pop
      // 44: goto 4b
      // 47: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a: athrow
      // 4b: return
   }

   private static void lIIllI(IIlIIlIl var0, ChannelHandlerContext var1) {
      var0.lIIlll(var1);
   }

   private void lIIlll(ChannelHandlerContext param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual k74/x/IIlIIlIl.lIllIl ()V
      // 04: aload 1
      // 05: ifnull 42
      // 08: aload 1
      // 09: invokeinterface io/netty/channel/ChannelHandlerContext.pipeline ()Lio/netty/channel/ChannelPipeline; 1
      // 0e: ifnull 42
      // 11: goto 18
      // 14: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: aload 1
      // 19: invokeinterface io/netty/channel/ChannelHandlerContext.pipeline ()Lio/netty/channel/ChannelPipeline; 1
      // 1e: aload 0
      // 1f: invokeinterface io/netty/channel/ChannelPipeline.context (Lio/netty/channel/ChannelHandler;)Lio/netty/channel/ChannelHandlerContext; 2
      // 24: ifnull 42
      // 27: goto 2e
      // 2a: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d: athrow
      // 2e: aload 1
      // 2f: invokeinterface io/netty/channel/ChannelHandlerContext.pipeline ()Lio/netty/channel/ChannelPipeline; 1
      // 34: aload 0
      // 35: invokeinterface io/netty/channel/ChannelPipeline.remove (Lio/netty/channel/ChannelHandler;)Lio/netty/channel/ChannelPipeline; 2
      // 3a: pop
      // 3b: goto 42
      // 3e: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41: athrow
      // 42: goto 46
      // 45: astore 2
      // 46: return
   }

   private ChannelPromise lIlIII(ChannelHandlerContext var1, Object var2, ChannelPromise var3) {
      if (var2 instanceof class_2868 var4) {
         ChannelPromise var10000;
         label19: {
            try {
               if (var3.isVoid()) {
                  var10000 = var1.newPromise();
                  break label19;
               }
            } catch (CancellationException var6) {
               throw IIIlI(var6);
            }

            var10000 = var3;
         }

         ChannelPromise var5 = var10000;
         var5.addListener(IIlIIlIl::lIIIlI);
         return var5;
      } else {
         return var3;
      }
   }

   private void lIlIIl(long var1) {
      ChannelHandlerContext var3 = this.IIl;

      try {
         if (var3 == null) {
            this.lIIII.clear();
            return;
         }
      } catch (CancellationException var6) {
         throw IIIlI(var6);
      }

      Runnable var4 = this::lIl;

      try {
         if (var3.executor().inEventLoop()) {
            var4.run();
            return;
         }
      } catch (CancellationException var5) {
         throw IIIlI(var5);
      }

      var3.executor().execute(var4);
   }

   private static void lIlIlI(ChannelHandlerContext param0, Object param1, Future param2) throws Exception {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 2
      // 01: invokeinterface io/netty/util/concurrent/Future.isSuccess ()Z 1
      // 06: ifne 1e
      // 09: aload 0
      // 0a: invokeinterface io/netty/channel/ChannelHandlerContext.channel ()Lio/netty/channel/Channel; 1
      // 0f: invokeinterface io/netty/channel/Channel.isOpen ()Z 1
      // 14: ifne 23
      // 17: goto 1e
      // 1a: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: return
      // 1f: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22: athrow
      // 23: aload 0
      // 24: invokeinterface io/netty/channel/ChannelHandlerContext.executor ()Lio/netty/util/concurrent/EventExecutor; 1
      // 29: aload 0
      // 2a: aload 1
      // 2b: invokedynamic run (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, k74/x/IIlIIlIl.lIIIII (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;)V, ()V ]
      // 30: invokeinterface io/netty/util/concurrent/EventExecutor.execute (Ljava/lang/Runnable;)V 2
      // 35: return
   }

   private static boolean lIlIll(class_2596<?> var0) {
      try {
         if (IIlIll(var0) != null) {
            return true;
         }
      } catch (CancellationException var1) {
         throw IIIlI(var1);
      }

      return false;
   }

   private void lIllII(ChannelHandlerContext var1, long var2) {
      try {
         if (!this.llII.compareAndSet(false, true)) {
            return;
         }
      } catch (CancellationException var7) {
         throw IIIlI(var7);
      }

      Runnable var4 = this::IIl;

      try {
         if (var2 > 0L) {
            var1.executor().schedule(var4, Math.max(var2, IIlIl), TimeUnit.NANOSECONDS);
            return;
         }
      } catch (CancellationException var5) {
         throw IIIlI(var5);
      }

      try {
         if (var1.executor().inEventLoop()) {
            var4.run();
            return;
         }
      } catch (CancellationException var6) {
         throw IIIlI(var6);
      }

      var1.executor().execute(var4);
   }

   public void lIllIl() {
      IlIIll();
      this.IIlI(new ClosedChannelException());
      this.IlIIl.clear();
      this.lIIII.clear();
      this.llIl.clear();
      this.IlIII = false;
      this.lIlll = false;
      this.IIllI = false;
      this.lllI = false;
      this.lIIl.set(false);
      this.IIll.set(false);
      this.llII.set(false);
      this.llllI.set(false);
      this.l.set(false);
      this.lIl = false;
      this.IIIlI = 0L;
      this.lII = 0L;
      this.IIIll = 0L;
      this.II = 0L;
   }

   private static boolean lIlllI(Object var0) {
      if (var0 instanceof class_2799 var1) {
         try {
            if (var1.method_12119() == class_2800.field_12774) {
               return true;
            }
         } catch (CancellationException var2) {
            throw IIIlI(var2);
         }
      }

      return false;
   }

   public static IllIIlI lIllll() {
      return lIlIl;
   }

   private void llIIII(ChannelHandlerContext var1) {
      this.IIIIlll(var1, 0L);
   }

   private static void llIIIl(Runnable param0) {
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
      // 05: ifnull 22
      // 08: aload 1
      // 09: invokevirtual net/minecraft/class_310.method_18854 ()Z
      // 0c: ifne 22
      // 0f: goto 16
      // 12: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 1
      // 17: aload 0
      // 18: invokevirtual net/minecraft/class_310.execute (Ljava/lang/Runnable;)V
      // 1b: goto 28
      // 1e: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: aload 0
      // 23: invokeinterface java/lang/Runnable.run ()V 1
      // 28: return
   }

   public static boolean llIIlI() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic k74/x/IIlIIlIl.I Lk74/x/IllIlII;
      // 03: ifnull 1c
      // 06: getstatic k74/x/IIlIIlIl.IllI Lk74/x/IlIllIIl;
      // 09: getstatic k74/x/IlIllIIl.l Lk74/x/IlIllIIl;
      // 0c: if_acmpne 1c
      // 0f: goto 16
      // 12: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: bipush 1
      // 17: ireturn
      // 18: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b: athrow
      // 1c: getstatic k74/x/IIlIIlIl.IIIII Ljava/util/Set;
      // 1f: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 24: astore 0
      // 25: aload 0
      // 26: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2b: ifeq 76
      // 2e: aload 0
      // 2f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 34: checkcast k74/x/IIlIIlIl
      // 37: astore 1
      // 38: aload 1
      // 39: getfield k74/x/IIlIIlIl.lIl Z
      // 3c: ifeq 45
      // 3f: bipush 1
      // 40: ireturn
      // 41: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 44: athrow
      // 45: aload 1
      // 46: getfield k74/x/IIlIIlIl.llIIl Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 49: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.iterator ()Ljava/util/Iterator;
      // 4c: astore 2
      // 4d: aload 2
      // 4e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 53: ifeq 73
      // 56: aload 2
      // 57: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 5c: checkcast k74/x/IIllllllI
      // 5f: astore 3
      // 60: aload 3
      // 61: getfield k74/x/IIllllllI.lI Lk74/x/IlIllIIl;
      // 64: getstatic k74/x/IlIllIIl.l Lk74/x/IlIllIIl;
      // 67: if_acmpne 70
      // 6a: bipush 1
      // 6b: ireturn
      // 6c: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6f: athrow
      // 70: goto 4d
      // 73: goto 25
      // 76: bipush 0
      // 77: ireturn
   }

   private void llIIll() {
      ChannelHandlerContext var1 = this.IIl;

      try {
         if (var1 == null) {
            this.IIlIllI(new ClosedChannelException());
            this.IIll.set(false);
            return;
         }
      } catch (CancellationException var4) {
         throw IIIlI(var4);
      }

      Runnable var2 = this::IIIlIl;

      try {
         if (var1.executor().inEventLoop()) {
            var2.run();
            return;
         }
      } catch (CancellationException var3) {
         throw IIIlI(var3);
      }

      var1.executor().execute(var2);
   }

   private void llIlII(ChannelHandlerContext param1, Object param2, ChannelPromise param3) throws Exception {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/IIlIIlIl.lIlll Z
      // 04: ifeq 29
      // 07: aload 0
      // 08: getfield k74/x/IIlIIlIl.llIlI Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 0b: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.isEmpty ()Z
      // 0e: ifne 29
      // 11: goto 18
      // 14: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: aload 0
      // 19: bipush 0
      // 1a: putfield k74/x/IIlIIlIl.lllI Z
      // 1d: aload 0
      // 1e: aload 1
      // 1f: invokevirtual k74/x/IIlIIlIl.IIIIII (Lio/netty/channel/ChannelHandlerContext;)V
      // 22: goto 29
      // 25: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28: athrow
      // 29: aload 0
      // 2a: aload 1
      // 2b: aload 2
      // 2c: aload 3
      // 2d: invokevirtual k74/x/IIlIIlIl.llIlIl (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)V
      // 30: aload 0
      // 31: bipush 0
      // 32: putfield k74/x/IIlIIlIl.IIllI Z
      // 35: aload 0
      // 36: bipush 0
      // 37: putfield k74/x/IIlIIlIl.lllI Z
      // 3a: aload 0
      // 3b: bipush 0
      // 3c: putfield k74/x/IIlIIlIl.IlIII Z
      // 3f: aload 0
      // 40: aload 0
      // 41: getfield k74/x/IIlIIlIl.llIlI Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 44: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.isEmpty ()Z
      // 47: ifne 52
      // 4a: bipush 1
      // 4b: goto 53
      // 4e: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 51: athrow
      // 52: bipush 0
      // 53: putfield k74/x/IIlIIlIl.lIlll Z
      // 56: return
   }

   private void llIlIl(ChannelHandlerContext param1, Object param2, ChannelPromise param3) throws Exception {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: aload 1
      // 002: invokevirtual k74/x/IIlIIlIl.IIIlll (Lio/netty/channel/ChannelHandlerContext;)V
      // 005: aload 0
      // 006: aload 2
      // 007: invokevirtual k74/x/IIlIIlIl.lllIIl (Ljava/lang/Object;)Z
      // 00a: ifeq 01a
      // 00d: aload 0
      // 00e: aload 1
      // 00f: aload 2
      // 010: aload 3
      // 011: invokevirtual k74/x/IIlIIlIl.IllIl (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)Z
      // 014: pop
      // 015: return
      // 016: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 019: athrow
      // 01a: aload 0
      // 01b: aload 2
      // 01c: invokevirtual k74/x/IIlIIlIl.IIIIl (Ljava/lang/Object;)Z
      // 01f: ifeq 04f
      // 022: aload 0
      // 023: aload 0
      // 024: aload 2
      // 025: aload 3
      // 026: getstatic k74/x/IlIllIIl.II Lk74/x/IlIllIIl;
      // 029: invokevirtual k74/x/IIlIIlIl.lll (Ljava/lang/Object;Lio/netty/channel/ChannelPromise;Lk74/x/IlIllIIl;)Lk74/x/IIllllllI;
      // 02c: invokevirtual k74/x/IIlIIlIl.IlIIII (Lk74/x/IIllllllI;)Z
      // 02f: ifne 04e
      // 032: goto 039
      // 035: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 038: athrow
      // 039: aload 3
      // 03a: new java/lang/IllegalStateException
      // 03d: dup
      // 03e: invokespecial java/lang/IllegalStateException.<init> ()V
      // 041: invokeinterface io/netty/channel/ChannelPromise.tryFailure (Ljava/lang/Throwable;)Z 2
      // 046: pop
      // 047: goto 04e
      // 04a: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04d: athrow
      // 04e: return
      // 04f: aload 2
      // 050: instanceof net/minecraft/class_2935
      // 053: ifeq 067
      // 056: aload 2
      // 057: checkcast net/minecraft/class_2935
      // 05a: astore 4
      // 05c: invokestatic k74/x/IIIIlIIIl.IIlIl ()Lk74/x/IIIIlIIIl;
      // 05f: aload 4
      // 061: invokevirtual net/minecraft/class_2935.method_12700 ()J
      // 064: invokevirtual k74/x/IIIIlIIIl.lll (J)V
      // 067: aload 2
      // 068: invokestatic k74/x/IIlIIlIl.IIllIIl (Ljava/lang/Object;)Lk74/x/IlIllIIl;
      // 06b: astore 4
      // 06d: aload 4
      // 06f: ifnull 0af
      // 072: aload 0
      // 073: aload 0
      // 074: aload 2
      // 075: aload 3
      // 076: aload 4
      // 078: invokevirtual k74/x/IIlIIlIl.lll (Ljava/lang/Object;Lio/netty/channel/ChannelPromise;Lk74/x/IlIllIIl;)Lk74/x/IIllllllI;
      // 07b: invokevirtual k74/x/IIlIIlIl.lllIII (Lk74/x/IIllllllI;)Z
      // 07e: ifne 09d
      // 081: goto 088
      // 084: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 087: athrow
      // 088: aload 3
      // 089: new java/lang/IllegalStateException
      // 08c: dup
      // 08d: invokespecial java/lang/IllegalStateException.<init> ()V
      // 090: invokeinterface io/netty/channel/ChannelPromise.tryFailure (Ljava/lang/Throwable;)Z 2
      // 095: pop
      // 096: goto 0ae
      // 099: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09c: athrow
      // 09d: getstatic k74/x/IIlIIlIl.I Lk74/x/IllIlII;
      // 0a0: ifnull 0ae
      // 0a3: aload 0
      // 0a4: invokevirtual k74/x/IIlIIlIl.llllI ()V
      // 0a7: goto 0ae
      // 0aa: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ad: athrow
      // 0ae: return
      // 0af: aload 0
      // 0b0: aload 2
      // 0b1: invokevirtual k74/x/IIlIIlIl.IIII (Ljava/lang/Object;)J
      // 0b4: lstore 5
      // 0b6: lload 5
      // 0b8: lconst_0
      // 0b9: lcmp
      // 0ba: ifgt 0ca
      // 0bd: aload 0
      // 0be: aload 1
      // 0bf: aload 2
      // 0c0: aload 3
      // 0c1: invokevirtual k74/x/IIlIIlIl.IllIl (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)Z
      // 0c4: pop
      // 0c5: return
      // 0c6: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c9: athrow
      // 0ca: aload 2
      // 0cb: instanceof net/minecraft/class_2935
      // 0ce: ifeq 0e4
      // 0d1: aload 2
      // 0d2: checkcast net/minecraft/class_2935
      // 0d5: astore 7
      // 0d7: invokestatic k74/x/IIIIlIIIl.IIlIl ()Lk74/x/IIIIlIIIl;
      // 0da: aload 7
      // 0dc: invokevirtual net/minecraft/class_2935.method_12700 ()J
      // 0df: lload 5
      // 0e1: invokevirtual k74/x/IIIIlIIIl.IlIII (JJ)V
      // 0e4: aload 0
      // 0e5: aload 0
      // 0e6: aload 2
      // 0e7: aload 3
      // 0e8: invokevirtual k74/x/IIlIIlIl.IIlII (Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)Lk74/x/IIlIlllIl;
      // 0eb: invokevirtual k74/x/IIlIIlIl.IlllIl (Lk74/x/IIlIlllIl;)Z
      // 0ee: ifne 104
      // 0f1: aload 3
      // 0f2: new java/lang/IllegalStateException
      // 0f5: dup
      // 0f6: invokespecial java/lang/IllegalStateException.<init> ()V
      // 0f9: invokeinterface io/netty/channel/ChannelPromise.tryFailure (Ljava/lang/Throwable;)Z 2
      // 0fe: pop
      // 0ff: return
      // 100: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 103: athrow
      // 104: aload 0
      // 105: aload 1
      // 106: invokevirtual k74/x/IIlIIlIl.llIIII (Lio/netty/channel/ChannelHandlerContext;)V
      // 109: return
   }

   public IIlIIlIl() {
      this.llI = new ConcurrentLinkedQueue<>();
      this.IlIIl = new ConcurrentLinkedQueue<>();
      this.llIIl = new ConcurrentLinkedQueue<>();
      this.lIllI = new ConcurrentLinkedQueue<>();
      this.lIIII = new ConcurrentLinkedQueue<>();
      this.llIl = ConcurrentHashMap.newKeySet();
      this.lIIl = new AtomicBoolean();
      this.IIll = new AtomicBoolean();
      this.llII = new AtomicBoolean();
      this.llllI = new AtomicBoolean();
      this.l = new AtomicBoolean();
      this.Illl = new AtomicLong();
      this.IIIl = -1;
   }

   private static void llIllI() {
      synchronized (IIII) {
         if (I != null) {
            for (IIlIIlIl var2 : IIIII) {
               if (!var2.llIIl.isEmpty()) {
                  return;
               }
            }

            I = null;
            IllI = null;
         }
      }
   }

   private static boolean llIlll(class_2596 var0) {
      return false;
   }

   private boolean lllIII(IIllllllI var1) {
      try {
         if (this.llIIl.size() >= IlIIlII(-108480060, -1879790700 ^ -1079910133)) {
            return false;
         }
      } catch (CancellationException var2) {
         throw IIIlI(var2);
      }

      this.llIIl.offer(var1);
      return true;
   }

   private boolean lllIIl(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic k74/x/IIIIlIIIl.IIlIl ()Lk74/x/IIIIlIIIl;
      // 03: astore 2
      // 04: aload 2
      // 05: invokevirtual k74/x/IIIIlIIIl.IIlll ()Z
      // 08: ifeq 4b
      // 0b: aload 2
      // 0c: invokevirtual k74/x/IIIIlIIIl.IIIII ()Z
      // 0f: ifeq 4b
      // 12: goto 19
      // 15: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: aload 2
      // 1a: invokevirtual k74/x/IIIIlIIIl.lllI ()Z
      // 1d: ifeq 4b
      // 20: goto 27
      // 23: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26: athrow
      // 27: aload 2
      // 28: invokevirtual k74/x/IIIIlIIIl.llII ()Z
      // 2b: ifne 4b
      // 2e: goto 35
      // 31: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 34: athrow
      // 35: aload 1
      // 36: instanceof net/minecraft/class_2596
      // 39: ifeq 4b
      // 3c: goto 43
      // 3f: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 42: athrow
      // 43: aload 1
      // 44: checkcast net/minecraft/class_2596
      // 47: astore 3
      // 48: goto 4d
      // 4b: bipush 0
      // 4c: ireturn
      // 4d: aload 3
      // 4e: instanceof net/minecraft/class_6374
      // 51: ifne 9a
      // 54: aload 3
      // 55: instanceof net/minecraft/class_2827
      // 58: ifne 9a
      // 5b: goto 62
      // 5e: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 61: athrow
      // 62: aload 3
      // 63: instanceof net/minecraft/class_8590
      // 66: ifne 9a
      // 69: goto 70
      // 6c: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6f: athrow
      // 70: aload 3
      // 71: instanceof net/minecraft/class_8591
      // 74: ifne 9a
      // 77: goto 7e
      // 7a: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7d: athrow
      // 7e: aload 3
      // 7f: instanceof net/minecraft/class_7640
      // 82: ifne 9a
      // 85: goto 8c
      // 88: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8b: athrow
      // 8c: aload 3
      // 8d: invokestatic k74/x/IIlIIlIl.lIlIll (Lnet/minecraft/class_2596;)Z
      // 90: ifeq a2
      // 93: goto 9a
      // 96: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 99: athrow
      // 9a: bipush 1
      // 9b: goto a3
      // 9e: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a1: athrow
      // a2: bipush 0
      // a3: ireturn
   }

   public static long lllIlI() {
      return lIIIl;
   }

   public static boolean lllIll(IllIlII param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: ifnull 27
      // 04: getstatic k74/x/IIlIIlIl.IlIl Z
      // 07: ifeq 27
      // 0a: goto 11
      // 0d: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10: athrow
      // 11: getstatic k74/x/IIlIIlIl.III Lk74/x/IllIlII;
      // 14: aload 0
      // 15: if_acmpne 27
      // 18: goto 1f
      // 1b: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: bipush 1
      // 20: goto 28
      // 23: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26: athrow
      // 27: bipush 0
      // 28: ireturn
   }

   private void llllII(ChannelHandlerContext var1, long var2) {
      while (true) {
         IIlIlII var4;
         IIlIlII var10000 = var4 = this.lIIII.peek();

         try {
            if (var10000 == null || var4.l > var2) {
               return;
            }
         } catch (CancellationException var5) {
            throw IIIlI(var5);
         }

         var4 = this.lIIII.poll();
         if (var4 != null && var1.channel().isOpen()) {
            IIIlII(var1, var4.I);
         }
      }
   }

   private static boolean llllIl(class_2596<?> var0) {
      try {
         if (var0 == null) {
            return false;
         }
      } catch (Throwable var5) {
         throw IIIlI(var5);
      }

      llIlllI var1 = IlllI;

      try {
         if (var1 == null) {
            return false;
         }
      } catch (Throwable var4) {
         throw IIIlI(var4);
      }

      try {
         return var1.II().test(var0);
      } catch (Throwable var3) {
         return false;
      }
   }

   private static String IlIIlIl(int var0, int var1, int var2) {
      int var3 = var2 ^ 3438;
      char[] var4 = IIIIII[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])IIIIIl[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         IIIIIl[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 665;
      int var9 = 0;

      do {
         int var10 = var4[var9] - 10678;
         var10 -= 34353;
         var10 -= 53513;
         var10 ^= 37474;
         var10 += 58276;
         var10 += 60982;
         var10 += 51212;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private void lllllI(ChannelHandlerContext var1) {
      try {
         if (lIllll() == IllIIlI.II) {
            this.IIIllII(var1);
         } else {
            IIllIIlI var2 = this.llI.peek();
            if (var2 == null) {
               this.IIll.set(false);
            } else {
               long var3 = this.IllII(var2.II, this.IlIlII(var2));
               if (var3 > 0L) {
                  this.IIll.set(false);
                  this.IIllII(var1, var3);
               } else {
                  try {
                     this.llI.poll();
                     this.llIl.remove(var2);
                     if (this.IllIl(var1, var2.Il, var2.I)) {
                        var1.flush();
                     }
                  } catch (Exception var6) {
                     throw IIIlI(var6);
                  }

                  try {
                     this.IIIlIIl(var2);
                     this.IIll.set(false);
                     if (!this.llI.isEmpty()) {
                        this.IlIIIll(var1);
                     }
                  } catch (Exception var5) {
                     throw IIIlI(var5);
                  }
               }
            }
         }
      } catch (Exception var7) {
         this.IIll.set(false);
         throw var7;
      }
   }

   public static void llllll(Predicate<class_2596<?>> param0, Consumer<class_2596<?>> param1, Predicate<class_2596<?>> param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: ifnull 0f
      // 04: aload 1
      // 05: ifnonnull 18
      // 08: goto 0f
      // 0b: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e: athrow
      // 0f: aconst_null
      // 10: putstatic k74/x/IIlIIlIl.IlllI Lk74/x/llIlllI;
      // 13: return
      // 14: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: new k74/x/llIlllI
      // 1b: dup
      // 1c: aload 0
      // 1d: aload 1
      // 1e: aload 2
      // 1f: ifnonnull 2e
      // 22: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, k74/x/IIlIIlIl.llII (Lnet/minecraft/class_2596;)Z, (Lnet/minecraft/class_2596;)Z ]
      // 27: goto 2f
      // 2a: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d: athrow
      // 2e: aload 2
      // 2f: invokespecial k74/x/llIlllI.<init> (Ljava/util/function/Predicate;Ljava/util/function/Consumer;Ljava/util/function/Predicate;)V
      // 32: putstatic k74/x/IIlIIlIl.IlllI Lk74/x/llIlllI;
      // 35: return
   }

   public static int IIIIIII() {
      return lI;
   }

   private void IIIIIIl(Throwable var1) {
      IlIIll();
      IlIlIllII.l().lI();
      this.IIlI(var1);
      this.IlIIl.clear();
      this.lIIII.clear();
      this.llIl.clear();
      this.IIIII();
      lIIIIl();
      this.lIIl.set(false);
      this.IIll.set(false);
      this.llII.set(false);
      this.llllI.set(false);
      this.l.set(false);
      this.lIl = false;
      this.IIIlI = 0L;
      this.lII = 0L;
      this.IIIll = 0L;
      this.II = 0L;
      lllII = false;
      llIll = false;
      this.IIIl = -1;
      IIllIl();
      IIIIlIIIl var2 = IIIIlIIIl.IIlIl();

      try {
         var2.IIlI(false);
         var2.IIllI();
         if (IIIIIllII.III() != null) {
            k74.x.IIll.IlIIlll();
            IlllIlII.lIIll();
         }
      } catch (CancellationException var3) {
         throw IIIlI(var3);
      }
   }

   public static boolean IIIIIlI(IllIlII var0, boolean var1) {
      try {
         if (var0 == null) {
            return false;
         }
      } catch (CancellationException var6) {
         throw IIIlI(var6);
      }

      synchronized (IIII) {
         if (!IlIl || III != var0) {
            return false;
         }

         IlIl = false;
         III = null;
         I = var0;
         IllI = llll;
      }

      for (IIlIIlIl var3 : IIIII) {
         try {
            if (var1) {
               var3.IIlIIll();
               continue;
            }
         } catch (CancellationException var4) {
            throw IIIlI(var4);
         }

         var3.llllI();
      }

      llIllI();
      return true;
   }

   private void IIIIIll(lIIllI param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/IIlIIlIl.IIl Lio/netty/channel/ChannelHandlerContext;
      // 04: astore 2
      // 05: aload 2
      // 06: ifnonnull 43
      // 09: aload 1
      // 0a: invokevirtual k74/x/lIIllI.Il ()Z
      // 0d: ifeq 2d
      // 10: goto 17
      // 13: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16: athrow
      // 17: aload 0
      // 18: aload 0
      // 19: getfield k74/x/IIlIIlIl.lIllI Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 1c: new java/nio/channels/ClosedChannelException
      // 1f: dup
      // 20: invokespecial java/nio/channels/ClosedChannelException.<init> ()V
      // 23: invokevirtual k74/x/IIlIIlIl.IIIll (Ljava/util/concurrent/ConcurrentLinkedQueue;Ljava/lang/Throwable;)V
      // 26: goto 2d
      // 29: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c: athrow
      // 2d: aload 1
      // 2e: invokevirtual k74/x/lIIllI.I ()Z
      // 31: ifeq 42
      // 34: aload 0
      // 35: getfield k74/x/IIlIIlIl.lIIII Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 38: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.clear ()V
      // 3b: goto 42
      // 3e: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41: athrow
      // 42: return
      // 43: aload 0
      // 44: aload 1
      // 45: aload 2
      // 46: invokedynamic run (Lk74/x/IIlIIlIl;Lk74/x/lIIllI;Lio/netty/channel/ChannelHandlerContext;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, k74/x/IIlIIlIl.IlIl (Lk74/x/lIIllI;Lio/netty/channel/ChannelHandlerContext;)V, ()V ]
      // 4b: astore 3
      // 4c: aload 2
      // 4d: invokeinterface io/netty/channel/ChannelHandlerContext.executor ()Lio/netty/util/concurrent/EventExecutor; 1
      // 52: invokeinterface io/netty/util/concurrent/EventExecutor.inEventLoop ()Z 1
      // 57: ifeq 65
      // 5a: aload 3
      // 5b: invokeinterface java/lang/Runnable.run ()V 1
      // 60: return
      // 61: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 64: athrow
      // 65: aload 2
      // 66: invokeinterface io/netty/channel/ChannelHandlerContext.executor ()Lio/netty/util/concurrent/EventExecutor; 1
      // 6b: aload 3
      // 6c: invokeinterface io/netty/util/concurrent/EventExecutor.submit (Ljava/lang/Runnable;)Lio/netty/util/concurrent/Future; 2
      // 71: invokeinterface io/netty/util/concurrent/Future.syncUninterruptibly ()Lio/netty/util/concurrent/Future; 1
      // 76: pop
      // 77: return
   }

   static void IIIIlII() {
      IIllIl();
   }

   private void IIIIlIl(ChannelHandlerContext var1) {
      this.lllllI(var1);
   }

   private static void IIIIllI(llIlllI var0, class_2596 var1) {
      try {
         if (IlllI != var0) {
            return;
         }
      } catch (Throwable var4) {
         throw IIIlI(var4);
      }

      try {
         var0.I().accept(var1);
      } catch (Throwable var3) {
      }
   }

   private void IIIIlll(ChannelHandlerContext var1, long var2) {
      try {
         if (!this.lIIl.compareAndSet(false, true)) {
            return;
         }
      } catch (CancellationException var7) {
         throw IIIlI(var7);
      }

      Runnable var4 = this::llIIl;

      try {
         if (var2 > 0L) {
            var1.executor().schedule(var4, Math.max(var2, IIlIl), TimeUnit.NANOSECONDS);
            return;
         }
      } catch (CancellationException var5) {
         throw IIIlI(var5);
      }

      try {
         if (var1.executor().inEventLoop()) {
            var4.run();
            return;
         }
      } catch (CancellationException var6) {
         throw IIIlI(var6);
      }

      var1.executor().execute(var4);
   }

   private static Integer IIIlIII(class_2596<?> var0, String... var1) {
      for (String var5 : var1) {
         try {
            Method var6 = var0.getClass().getMethod(var5);
            if (var6.invoke(var0) instanceof Number var13) {
               return var13.intValue();
            }
         } catch (ReflectiveOperationException var10) {
         }

         try {
            Field var11 = var0.getClass().getDeclaredField(var5);
            var11.setAccessible(true);
            if (var11.get(var0) instanceof Number var8) {
               return var8.intValue();
            }
         } catch (ReflectiveOperationException var9) {
         }
      }

      return null;
   }

   private void IIIlIIl(IIllIIlI var1) {
      try {
         if (var1 == null) {
            return;
         }
      } catch (CancellationException var7) {
         throw IIIlI(var7);
      }

      long var2 = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - var1.Il());
      long var4 = Illll;

      long var10000;
      label21: {
         try {
            if (var4 <= 0L) {
               var10000 = var2;
               break label21;
            }
         } catch (CancellationException var6) {
            throw IIIlI(var6);
         }

         var10000 = (long)(var4 * 0.85 + var2 * 0.15);
      }

      Illll = var10000;
      lIIIl = System.currentTimeMillis();
      lI = this.llI.size();
   }

   private long IIIlIlI(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: instanceof net/minecraft/class_2596
      // 04: ifeq 0f
      // 07: aload 1
      // 08: checkcast net/minecraft/class_2596
      // 0b: astore 2
      // 0c: goto 11
      // 0f: lconst_0
      // 10: lreturn
      // 11: invokestatic k74/x/IIIIlIIIl.IIlIl ()Lk74/x/IIIIlIIIl;
      // 14: astore 3
      // 15: aload 3
      // 16: invokevirtual k74/x/IIIIlIIIl.IIlll ()Z
      // 19: ifeq 3a
      // 1c: aload 3
      // 1d: invokevirtual k74/x/IIIIlIIIl.lllI ()Z
      // 20: ifeq 3a
      // 23: goto 2a
      // 26: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29: athrow
      // 2a: aload 2
      // 2b: invokeinterface net/minecraft/class_2596.method_55943 ()Z 1
      // 30: ifeq 40
      // 33: goto 3a
      // 36: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39: athrow
      // 3a: lconst_0
      // 3b: lreturn
      // 3c: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3f: athrow
      // 40: lconst_0
      // 41: aload 3
      // 42: invokevirtual k74/x/IIIIlIIIl.lIlI ()J
      // 45: invokestatic java/lang/Math.max (JJ)J
      // 48: lreturn
   }

   public static boolean IIIlIll() {
      return IlIl;
   }

   private void IIIllII(ChannelHandlerContext param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aconst_null
      // 001: astore 2
      // 002: ldc2_w 9223372036854775807
      // 005: lstore 3
      // 006: aload 0
      // 007: getfield k74/x/IIlIIlIl.llI Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 00a: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.iterator ()Ljava/util/Iterator;
      // 00d: astore 5
      // 00f: aload 5
      // 011: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 016: ifeq 092
      // 019: aload 5
      // 01b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 020: checkcast k74/x/IIllIIlI
      // 023: astore 6
      // 025: aload 0
      // 026: aload 6
      // 028: getfield k74/x/IIllIIlI.II J
      // 02b: aload 0
      // 02c: aload 6
      // 02e: invokevirtual k74/x/IIlIIlIl.IlIlII (Lk74/x/IIllIIlI;)J
      // 031: invokevirtual k74/x/IIlIIlIl.IllII (JJ)J
      // 034: lstore 7
      // 036: lload 7
      // 038: lconst_0
      // 039: lcmp
      // 03a: ifgt 088
      // 03d: aload 2
      // 03e: ifnull 082
      // 041: goto 048
      // 044: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 047: athrow
      // 048: aload 6
      // 04a: getfield k74/x/IIllIIlI.l I
      // 04d: aload 2
      // 04e: getfield k74/x/IIllIIlI.l I
      // 051: if_icmpgt 082
      // 054: goto 05b
      // 057: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05a: athrow
      // 05b: aload 6
      // 05d: getfield k74/x/IIllIIlI.l I
      // 060: aload 2
      // 061: getfield k74/x/IIllIIlI.l I
      // 064: if_icmpne 08f
      // 067: goto 06e
      // 06a: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06d: athrow
      // 06e: aload 6
      // 070: getfield k74/x/IIllIIlI.II J
      // 073: aload 2
      // 074: getfield k74/x/IIllIIlI.II J
      // 077: lcmp
      // 078: ifle 08f
      // 07b: goto 082
      // 07e: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 081: athrow
      // 082: aload 6
      // 084: astore 2
      // 085: goto 08f
      // 088: lload 3
      // 089: lload 7
      // 08b: invokestatic java/lang/Math.min (JJ)J
      // 08e: lstore 3
      // 08f: goto 00f
      // 092: aload 2
      // 093: ifnonnull 0cd
      // 096: aload 0
      // 097: getfield k74/x/IIlIIlIl.IIll Ljava/util/concurrent/atomic/AtomicBoolean;
      // 09a: bipush 0
      // 09b: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 09e: aload 0
      // 09f: getfield k74/x/IIlIIlIl.llI Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 0a2: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.isEmpty ()Z
      // 0a5: ifne 0cc
      // 0a8: goto 0af
      // 0ab: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ae: athrow
      // 0af: aload 0
      // 0b0: aload 1
      // 0b1: lload 3
      // 0b2: ldc2_w 9223372036854775807
      // 0b5: lcmp
      // 0b6: ifne 0c8
      // 0b9: goto 0c0
      // 0bc: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bf: athrow
      // 0c0: lconst_0
      // 0c1: goto 0c9
      // 0c4: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c7: athrow
      // 0c8: lload 3
      // 0c9: invokevirtual k74/x/IIlIIlIl.IIllII (Lio/netty/channel/ChannelHandlerContext;J)V
      // 0cc: return
      // 0cd: aload 0
      // 0ce: getfield k74/x/IIlIIlIl.llI Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 0d1: aload 2
      // 0d2: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.remove (Ljava/lang/Object;)Z
      // 0d5: ifne 0fe
      // 0d8: aload 0
      // 0d9: getfield k74/x/IIlIIlIl.IIll Ljava/util/concurrent/atomic/AtomicBoolean;
      // 0dc: bipush 0
      // 0dd: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 0e0: aload 0
      // 0e1: getfield k74/x/IIlIIlIl.llI Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 0e4: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.isEmpty ()Z
      // 0e7: ifne 0fd
      // 0ea: goto 0f1
      // 0ed: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f0: athrow
      // 0f1: aload 0
      // 0f2: aload 1
      // 0f3: invokevirtual k74/x/IIlIIlIl.IlIIIll (Lio/netty/channel/ChannelHandlerContext;)V
      // 0f6: goto 0fd
      // 0f9: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fc: athrow
      // 0fd: return
      // 0fe: aload 0
      // 0ff: aload 2
      // 100: getfield k74/x/IIllIIlI.l I
      // 103: invokevirtual k74/x/IIlIIlIl.IlIIIII (I)V
      // 106: aload 0
      // 107: getfield k74/x/IIlIIlIl.llIl Ljava/util/Set;
      // 10a: aload 2
      // 10b: invokeinterface java/util/Set.remove (Ljava/lang/Object;)Z 2
      // 110: pop
      // 111: aload 0
      // 112: aload 1
      // 113: aload 2
      // 114: getfield k74/x/IIllIIlI.Il Ljava/lang/Object;
      // 117: aload 2
      // 118: getfield k74/x/IIllIIlI.I Lio/netty/channel/ChannelPromise;
      // 11b: invokevirtual k74/x/IIlIIlIl.IllIl (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)Z
      // 11e: ifeq 12f
      // 121: aload 1
      // 122: invokeinterface io/netty/channel/ChannelHandlerContext.flush ()Lio/netty/channel/ChannelHandlerContext; 1
      // 127: pop
      // 128: goto 12f
      // 12b: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12e: athrow
      // 12f: aload 0
      // 130: aload 2
      // 131: invokevirtual k74/x/IIlIIlIl.IIIlIIl (Lk74/x/IIllIIlI;)V
      // 134: aload 0
      // 135: getfield k74/x/IIlIIlIl.IIll Ljava/util/concurrent/atomic/AtomicBoolean;
      // 138: bipush 0
      // 139: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 13c: aload 0
      // 13d: getfield k74/x/IIlIIlIl.llI Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 140: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.isEmpty ()Z
      // 143: ifne 152
      // 146: aload 0
      // 147: aload 1
      // 148: invokevirtual k74/x/IIlIIlIl.IlIIIll (Lio/netty/channel/ChannelHandlerContext;)V
      // 14b: goto 152
      // 14e: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 151: athrow
      // 152: return
   }

   private void IIIllIl(ChannelHandlerContext var1) {
      try {
         IIlIlllIl var2 = this.lIlII.peek();
         if (var2 == null) {
            this.lIIl.set(false);
         } else {
            long var3 = this.IllII(var2.I, this.lIIIl(var2));
            if (var3 > 0L) {
               this.lIIl.set(false);
               this.IIIIlll(var1, var3);
            } else {
               try {
                  this.lIlII.poll();
                  if (this.IllIl(var1, var2.Il, var2.II)) {
                     var1.flush();
                     this.IIIlI = System.nanoTime();
                  }
               } catch (Exception var6) {
                  throw IIIlI(var6);
               }

               try {
                  this.lIIl.set(false);
                  if (!this.lIlII.isEmpty()) {
                     this.llIIII(var1);
                  }
               } catch (Exception var5) {
                  throw IIIlI(var5);
               }
            }
         }
      } catch (Exception var7) {
         this.lIIl.set(false);
         throw var7;
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private static boolean IIIlllI(Object var0) {
      label33: {
         try {
            if (var0 instanceof class_2724) {
               break label33;
            }

            if (!(var0 instanceof class_2749)) {
               return false;
            }
         } catch (CancellationException var4) {
            throw IIIlI(var4);
         }

         class_2749 var1 = (class_2749)var0;

         try {
            if (!(var1.method_11833() <= 0.0F)) {
               return false;
            }
         } catch (CancellationException var3) {
            throw IIIlI(var3);
         }
      }

      try {
         return true;
      } catch (CancellationException var2) {
         throw IIIlI(var2);
      }
   }

   private static void IIIllll(IIlIIlIl var0, ChannelHandlerContext var1) {
      var0.IlllI(var1);
   }

   private static boolean IIlIIII(Object param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: instanceof net/minecraft/class_2824
      // 04: ifne 5b
      // 07: aload 0
      // 08: instanceof net/minecraft/class_2885
      // 0b: ifne 5b
      // 0e: goto 15
      // 11: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: aload 0
      // 16: instanceof net/minecraft/class_2886
      // 19: ifne 5b
      // 1c: goto 23
      // 1f: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22: athrow
      // 23: aload 0
      // 24: instanceof net/minecraft/class_2846
      // 27: ifne 5b
      // 2a: goto 31
      // 2d: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 30: athrow
      // 31: aload 0
      // 32: instanceof net/minecraft/class_2879
      // 35: ifne 5b
      // 38: goto 3f
      // 3b: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e: athrow
      // 3f: aload 0
      // 40: instanceof net/minecraft/class_2848
      // 43: ifne 5b
      // 46: goto 4d
      // 49: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4c: athrow
      // 4d: aload 0
      // 4e: instanceof net/minecraft/class_2799
      // 51: ifeq 63
      // 54: goto 5b
      // 57: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5a: athrow
      // 5b: bipush 1
      // 5c: goto 64
      // 5f: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: bipush 0
      // 64: ireturn
   }

   public static void IIlIIIl(IllIlII var0, long var1) {
      IlIllIIl var3;
      synchronized (IIII) {
         label36: {
            if (IlIl) {
               try {
                  if (var0 != null && III == var0) {
                     break label36;
                  }
               } catch (CancellationException var10) {
                  throw IIIlI(var10);
               }
            }

            return;
         }

         var3 = llll;
      }

      long var12 = Math.max(0L, var1);
      long var6 = System.nanoTime() - TimeUnit.MILLISECONDS.toNanos(var12);

      for (IIlIIlIl var9 : IIIII) {
         var9.llI(var6, var3);
      }
   }

   private void IIlIIlI() {
      ChannelHandlerContext var1 = this.IIl;

      try {
         if (var1 == null) {
            this.IIlI(new ClosedChannelException());
            this.llllI.set(false);
            this.IIll.set(false);
            this.lIIl.set(false);
            this.lIl = false;
            return;
         }
      } catch (InterruptedException var6) {
         throw IIIlI(var6);
      }

      Runnable var2 = this::Il;

      try {
         if (var1.executor().inEventLoop()) {
            var2.run();
            return;
         }
      } catch (InterruptedException var5) {
         throw IIIlI(var5);
      }

      try {
         var1.executor().submit(var2).sync();
      } catch (InterruptedException var4) {
         Thread.currentThread().interrupt();
      }
   }

   private void IIlIIll() {
      ChannelHandlerContext var1 = this.IIl;

      try {
         if (var1 == null) {
            this.IIIll(this.llIIl, new ClosedChannelException());
            this.llllI.set(false);
            this.lIl = false;
            llIllI();
            return;
         }
      } catch (InterruptedException var6) {
         throw IIIlI(var6);
      }

      Runnable var2 = this::IllI;

      try {
         if (var1.executor().inEventLoop()) {
            var2.run();
            return;
         }
      } catch (InterruptedException var5) {
         throw IIIlI(var5);
      }

      try {
         var1.executor().submit(var2).sync();
      } catch (InterruptedException var4) {
         Thread.currentThread().interrupt();
         this.IIIll(this.llIIl, var4);
         this.llllI.set(false);
         this.lIl = false;
         llIllI();
      }
   }

   private boolean IIlIlII(ChannelHandlerContext param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: bipush 0
      // 001: istore 2
      // 002: bipush 0
      // 003: istore 3
      // 004: new java/util/ArrayList
      // 007: dup
      // 008: ldc_w -108480059
      // 00b: ldc_w 895653295
      // 00e: ldc_w 1975612722
      // 011: ixor
      // 012: invokestatic k74/x/IIlIIlIl.IlIIlII (II)I
      // 015: invokespecial java/util/ArrayList.<init> (I)V
      // 018: astore 4
      // 01a: iload 2
      // 01b: ldc_w -108480058
      // 01e: ldc_w 895653295
      // 021: ldc_w -1504557167
      // 024: ixor
      // 025: invokestatic k74/x/IIlIIlIl.IlIIlII (II)I
      // 028: if_icmpge 0d9
      // 02b: aload 0
      // 02c: getfield k74/x/IIlIIlIl.llIIl Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 02f: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.peek ()Ljava/lang/Object;
      // 032: checkcast k74/x/IIllllllI
      // 035: dup
      // 036: astore 5
      // 038: ifnull 0d9
      // 03b: aload 5
      // 03d: getfield k74/x/IIllllllI.lI Lk74/x/IlIllIIl;
      // 040: getstatic k74/x/IlIllIIl.l Lk74/x/IlIllIIl;
      // 043: if_acmpeq 05f
      // 046: goto 04d
      // 049: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04c: athrow
      // 04d: iload 2
      // 04e: ifle 05f
      // 051: goto 058
      // 054: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 057: athrow
      // 058: goto 0d9
      // 05b: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05e: athrow
      // 05f: aload 0
      // 060: getfield k74/x/IIlIIlIl.llIIl Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 063: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.poll ()Ljava/lang/Object;
      // 066: checkcast k74/x/IIllllllI
      // 069: astore 5
      // 06b: aload 5
      // 06d: ifnonnull 077
      // 070: goto 0d9
      // 073: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 076: athrow
      // 077: iinc 2 1
      // 07a: aload 5
      // 07c: getfield k74/x/IIllllllI.lI Lk74/x/IlIllIIl;
      // 07f: getstatic k74/x/IlIllIIl.l Lk74/x/IlIllIIl;
      // 082: if_acmpne 0b6
      // 085: aload 5
      // 087: getfield k74/x/IIllllllI.II Ljava/lang/Object;
      // 08a: instanceof net/minecraft/class_2851
      // 08d: ifeq 0b6
      // 090: goto 097
      // 093: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 096: athrow
      // 097: iload 3
      // 098: ifeq 0b4
      // 09b: goto 0a2
      // 09e: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a1: athrow
      // 0a2: aload 5
      // 0a4: getfield k74/x/IIllllllI.Il Lio/netty/channel/ChannelPromise;
      // 0a7: invokeinterface io/netty/channel/ChannelPromise.trySuccess ()Z 1
      // 0ac: pop
      // 0ad: goto 01a
      // 0b0: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b3: athrow
      // 0b4: bipush 1
      // 0b5: istore 3
      // 0b6: aload 4
      // 0b8: aload 5
      // 0ba: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0bf: pop
      // 0c0: aload 5
      // 0c2: getfield k74/x/IIllllllI.lI Lk74/x/IlIllIIl;
      // 0c5: getstatic k74/x/IlIllIIl.l Lk74/x/IlIllIIl;
      // 0c8: if_acmpne 01a
      // 0cb: aload 5
      // 0cd: getfield k74/x/IIllllllI.II Ljava/lang/Object;
      // 0d0: instanceof net/minecraft/class_9836
      // 0d3: ifeq 01a
      // 0d6: goto 0d9
      // 0d9: bipush 0
      // 0da: istore 6
      // 0dc: aload 4
      // 0de: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0e3: astore 7
      // 0e5: aload 7
      // 0e7: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0ec: ifeq 112
      // 0ef: aload 7
      // 0f1: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0f6: checkcast k74/x/IIllllllI
      // 0f9: astore 8
      // 0fb: iload 6
      // 0fd: aload 0
      // 0fe: aload 1
      // 0ff: aload 8
      // 101: getfield k74/x/IIllllllI.II Ljava/lang/Object;
      // 104: aload 8
      // 106: getfield k74/x/IIllllllI.Il Lio/netty/channel/ChannelPromise;
      // 109: invokevirtual k74/x/IIlIIlIl.IllIl (Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Object;Lio/netty/channel/ChannelPromise;)Z
      // 10c: ior
      // 10d: istore 6
      // 10f: goto 0e5
      // 112: iload 6
      // 114: ireturn
   }

   private boolean IIlIlIl(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic k74/x/IIll.IIllIIl ()Z
      // 03: ifeq 2a
      // 06: aload 1
      // 07: invokestatic k74/x/IIlIIlIl.IIlIIII (Ljava/lang/Object;)Z
      // 0a: ifeq 2a
      // 0d: goto 14
      // 10: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13: athrow
      // 14: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 17: invokestatic k74/x/IIll.IIIIII (Lnet/minecraft/class_310;)Z
      // 1a: ifne 2a
      // 1d: goto 24
      // 20: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23: athrow
      // 24: bipush 0
      // 25: ireturn
      // 26: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29: athrow
      // 2a: getstatic k74/x/IIlIIlIl.lIIlI Z
      // 2d: ifeq 36
      // 30: bipush 1
      // 31: ireturn
      // 32: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 35: athrow
      // 36: bipush 0
      // 37: istore 2
      // 38: getstatic k74/x/IIlIIlIl.lllIl Z
      // 3b: ifeq 80
      // 3e: aload 1
      // 3f: instanceof net/minecraft/class_2596
      // 42: ifeq 80
      // 45: goto 4c
      // 48: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4b: athrow
      // 4c: aload 1
      // 4d: checkcast net/minecraft/class_2596
      // 50: astore 3
      // 51: getstatic k74/x/IIlIIlIl.IIlII Ljava/util/concurrent/ConcurrentHashMap;
      // 54: new k74/x/llll
      // 57: dup
      // 58: aload 3
      // 59: invokespecial k74/x/llll.<init> (Lnet/minecraft/class_2596;)V
      // 5c: invokevirtual java/util/concurrent/ConcurrentHashMap.remove (Ljava/lang/Object;)Ljava/lang/Object;
      // 5f: ifnull 6a
      // 62: bipush 1
      // 63: goto 6b
      // 66: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 69: athrow
      // 6a: bipush 0
      // 6b: istore 2
      // 6c: getstatic k74/x/IIlIIlIl.IIlII Ljava/util/concurrent/ConcurrentHashMap;
      // 6f: invokevirtual java/util/concurrent/ConcurrentHashMap.isEmpty ()Z
      // 72: ifeq 80
      // 75: bipush 0
      // 76: putstatic k74/x/IIlIIlIl.lllIl Z
      // 79: goto 80
      // 7c: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7f: athrow
      // 80: iload 2
      // 81: ifne bd
      // 84: aload 1
      // 85: instanceof net/minecraft/class_2868
      // 88: ifne bd
      // 8b: goto 92
      // 8e: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 91: athrow
      // 92: invokestatic k74/x/IIll.IIlllll ()Z
      // 95: ifne bd
      // 98: goto 9f
      // 9b: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9e: athrow
      // 9f: invokestatic k74/x/IlllIlII.III ()Z
      // a2: ifne bd
      // a5: goto ac
      // a8: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ab: athrow
      // ac: aload 0
      // ad: getfield k74/x/IIlIIlIl.llIlI Ljava/util/concurrent/ConcurrentLinkedQueue;
      // b0: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.isEmpty ()Z
      // b3: ifne c5
      // b6: goto bd
      // b9: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // bc: athrow
      // bd: bipush 1
      // be: goto c6
      // c1: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c4: athrow
      // c5: bipush 0
      // c6: ireturn
   }

   private void IIlIllI(Throwable var1) {
      while (true) {
         IIllIIlI var2;
         IIllIIlI var10000 = var2 = this.llI.poll();

         try {
            if (var10000 == null) {
               return;
            }

            this.llIl.remove(var2);
            var2.I.tryFailure(var1);
         } catch (CancellationException var3) {
            throw IIIlI(var3);
         }
      }
   }

   private void IIlIlll(ChannelHandlerContext var1) {
      this.IIlIlI(var1);
   }

   static void IIllIII(boolean var0) {
      lIIlI = var0;
   }

   private static IlIllIIl IIllIIl(Object param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic k74/x/IIlIIlIl.IlIl Z
      // 03: ifne 19
      // 06: getstatic k74/x/IIlIIlIl.I Lk74/x/IllIlII;
      // 09: ifnonnull 19
      // 0c: goto 13
      // 0f: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aconst_null
      // 14: areturn
      // 15: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: getstatic k74/x/IIlIIlIl.IIII Ljava/lang/Object;
      // 1c: dup
      // 1d: astore 1
      // 1e: monitorenter
      // 1f: getstatic k74/x/IIlIIlIl.IlIl Z
      // 22: ifeq 35
      // 25: aload 0
      // 26: getstatic k74/x/IIlIIlIl.llll Lk74/x/IlIllIIl;
      // 29: invokestatic k74/x/IIlIIlIl.IlIIlI (Ljava/lang/Object;Lk74/x/IlIllIIl;)Z
      // 2c: ifeq 35
      // 2f: getstatic k74/x/IIlIIlIl.llll Lk74/x/IlIllIIl;
      // 32: aload 1
      // 33: monitorexit
      // 34: areturn
      // 35: getstatic k74/x/IIlIIlIl.I Lk74/x/IllIlII;
      // 38: ifnull 52
      // 3b: aload 0
      // 3c: getstatic k74/x/IIlIIlIl.IllI Lk74/x/IlIllIIl;
      // 3f: invokestatic k74/x/IIlIIlIl.IlIIlI (Ljava/lang/Object;Lk74/x/IlIllIIl;)Z
      // 42: ifeq 52
      // 45: goto 4c
      // 48: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4b: athrow
      // 4c: getstatic k74/x/IIlIIlIl.IllI Lk74/x/IlIllIIl;
      // 4f: aload 1
      // 50: monitorexit
      // 51: areturn
      // 52: aconst_null
      // 53: aload 1
      // 54: monitorexit
      // 55: areturn
      // 56: astore 2
      // 57: aload 1
      // 58: monitorexit
      // 59: aload 2
      // 5a: athrow
   }

   public static void IIllIlI() {
      lIIlI();
   }

   private void IIllIll() {
      ChannelHandlerContext var1 = this.IIl;

      try {
         if (var1 == null) {
            return;
         }
      } catch (CancellationException var4) {
         throw IIIlI(var4);
      }

      Runnable var2 = this::llll;

      try {
         if (var1.executor().inEventLoop()) {
            var2.run();
            return;
         }
      } catch (CancellationException var3) {
         throw IIIlI(var3);
      }

      var1.executor().execute(var2);
   }

   private void IIlllII(ChannelHandlerContext var1) {
      this.lIllII(var1, 0L);
   }

   private void IIlllIl(ChannelHandlerContext var1, long var2, IlIllIIl var4) {
      this.lllIl(var1, var2, var4);
   }

   public static long IIllllI() {
      return lIII;
   }

   private void IIlllll(lIIllI param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/IIlIIlIl.IIl Lio/netty/channel/ChannelHandlerContext;
      // 04: astore 2
      // 05: aload 2
      // 06: ifnonnull 43
      // 09: aload 1
      // 0a: invokevirtual k74/x/lIIllI.Il ()Z
      // 0d: ifeq 2d
      // 10: goto 17
      // 13: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16: athrow
      // 17: aload 0
      // 18: aload 0
      // 19: getfield k74/x/IIlIIlIl.lIllI Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 1c: new java/nio/channels/ClosedChannelException
      // 1f: dup
      // 20: invokespecial java/nio/channels/ClosedChannelException.<init> ()V
      // 23: invokevirtual k74/x/IIlIIlIl.IIIll (Ljava/util/concurrent/ConcurrentLinkedQueue;Ljava/lang/Throwable;)V
      // 26: goto 2d
      // 29: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c: athrow
      // 2d: aload 1
      // 2e: invokevirtual k74/x/lIIllI.I ()Z
      // 31: ifeq 42
      // 34: aload 0
      // 35: getfield k74/x/IIlIIlIl.lIIII Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 38: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.clear ()V
      // 3b: goto 42
      // 3e: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41: athrow
      // 42: return
      // 43: aload 1
      // 44: invokevirtual k74/x/lIIllI.Il ()Z
      // 47: ifeq 79
      // 4a: aload 0
      // 4b: aload 2
      // 4c: invokedynamic run (Lk74/x/IIlIIlIl;Lio/netty/channel/ChannelHandlerContext;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, k74/x/IIlIIlIl.IlIIIlI (Lio/netty/channel/ChannelHandlerContext;)V, ()V ]
      // 51: astore 3
      // 52: aload 2
      // 53: invokeinterface io/netty/channel/ChannelHandlerContext.executor ()Lio/netty/util/concurrent/EventExecutor; 1
      // 58: invokeinterface io/netty/util/concurrent/EventExecutor.inEventLoop ()Z 1
      // 5d: ifeq 6d
      // 60: aload 3
      // 61: invokeinterface java/lang/Runnable.run ()V 1
      // 66: goto 79
      // 69: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6c: athrow
      // 6d: aload 2
      // 6e: invokeinterface io/netty/channel/ChannelHandlerContext.executor ()Lio/netty/util/concurrent/EventExecutor; 1
      // 73: aload 3
      // 74: invokeinterface io/netty/util/concurrent/EventExecutor.execute (Ljava/lang/Runnable;)V 2
      // 79: aload 1
      // 7a: invokevirtual k74/x/lIIllI.Il ()Z
      // 7d: ifeq a5
      // 80: aload 0
      // 81: getfield k74/x/IIlIIlIl.lIlII Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 84: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.isEmpty ()Z
      // 87: ifne a5
      // 8a: goto 91
      // 8d: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 90: athrow
      // 91: aload 0
      // 92: getfield k74/x/IIlIIlIl.lIIl Ljava/util/concurrent/atomic/AtomicBoolean;
      // 95: bipush 0
      // 96: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 99: aload 0
      // 9a: aload 2
      // 9b: invokevirtual k74/x/IIlIIlIl.llIIII (Lio/netty/channel/ChannelHandlerContext;)V
      // 9e: goto a5
      // a1: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a4: athrow
      // a5: aload 1
      // a6: invokevirtual k74/x/lIIllI.I ()Z
      // a9: ifeq b7
      // ac: aload 0
      // ad: invokevirtual k74/x/IIlIIlIl.l ()V
      // b0: goto b7
      // b3: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b6: athrow
      // b7: aload 1
      // b8: invokevirtual k74/x/lIIllI.I ()Z
      // bb: ifeq e3
      // be: aload 0
      // bf: getfield k74/x/IIlIIlIl.IlIIl Ljava/util/concurrent/ConcurrentLinkedQueue;
      // c2: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.isEmpty ()Z
      // c5: ifne e3
      // c8: goto cf
      // cb: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ce: athrow
      // cf: aload 0
      // d0: getfield k74/x/IIlIIlIl.llII Ljava/util/concurrent/atomic/AtomicBoolean;
      // d3: bipush 0
      // d4: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // d7: aload 0
      // d8: aload 2
      // d9: invokevirtual k74/x/IIlIIlIl.IIlllII (Lio/netty/channel/ChannelHandlerContext;)V
      // dc: goto e3
      // df: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // e2: athrow
      // e3: return
   }

   private void IlIIIII(int var1) {
      for (IIllIIlI var3 : this.llI) {
         try {
            if (var3.l < var1) {
               this.llIl.add(var3);
            }
         } catch (CancellationException var4) {
            throw IIIlI(var4);
         }
      }
   }

   private Ill IlIIIIl() {
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
      // 05: ifnonnull 0e
      // 08: aconst_null
      // 09: areturn
      // 0a: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d: athrow
      // 0e: aload 1
      // 0f: invokevirtual k74/x/IIIIIllII.II ()Lk74/x/lIIIlIlI;
      // 12: invokevirtual k74/x/lIIIlIlI.ll ()Lk74/x/Ill;
      // 15: astore 2
      // 16: aload 2
      // 17: ifnull 28
      // 1a: aload 2
      // 1b: invokevirtual k74/x/Ill.IIIIlIl ()Z
      // 1e: ifne 2e
      // 21: goto 28
      // 24: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27: athrow
      // 28: aconst_null
      // 29: areturn
      // 2a: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d: athrow
      // 2e: aload 2
      // 2f: invokevirtual k74/x/Ill.IIIl ()Z
      // 32: ifeq 3d
      // 35: aload 2
      // 36: goto 3e
      // 39: invokestatic k74/x/IIlIIlIl.IIIlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c: athrow
      // 3d: aconst_null
      // 3e: areturn
   }

   private void IlIIIlI(ChannelHandlerContext var1) {
      this.lIIlIl(var1);
   }

   private void IlIIIll(ChannelHandlerContext var1) {
      this.IIllII(var1, 0L);
   }

   public void handlerAdded(ChannelHandlerContext var1) {
      if (IIllllI.II()) {
         try {
            var1.pipeline().remove(this);
         } catch (Throwable var3) {
         }
      } else {
         this.IIl = var1;
         IIIII.add(this);
      }
   }
}
