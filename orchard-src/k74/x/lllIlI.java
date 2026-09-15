package k74.x;

import com.sun.jna.platform.win32.User32;
import com.sun.jna.platform.win32.BaseTSD.ULONG_PTR;
import com.sun.jna.platform.win32.WinDef.DWORD;
import com.sun.jna.platform.win32.WinDef.LONG;
import com.sun.jna.platform.win32.WinDef.WORD;
import com.sun.jna.platform.win32.WinUser.INPUT;
import com.sun.jna.platform.win32.WinUser.KEYBDINPUT;
import com.sun.jna.platform.win32.WinUser.MOUSEINPUT;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_3675.class_306;
import net.minecraft.class_3675.class_307;

@Environment(EnvType.CLIENT)
public final class lllIlI {
   private static final int I = 256;
   private static final int II = 128;
   private static final int Il = 0;
   private static final String[] lll;
   private static final int lI = 4;
   private static final int ll = 2;
   private static final Object[] IIII;
   private static final int[] llI;
   private static final int III = 16;
   private static final int IIl = 32;
   private static final int IlI = 64;
   private static final int Ill = 2;
   private static final boolean lII;
   private static final int l = 1;
   private static final int lIl = 8;

   private static void I(INPUT var0, IIlllIIl var1, boolean var2) {
      int var3 = llI(-1724800320, 1665442609 ^ -1609885126);
      if (var1.I()) {
         var3 |= 1;
      }

      if (var2) {
         var3 |= 2;
      }

      var0.type = new DWORD(1L);
      var0.input.setType(KEYBDINPUT.class);
      var0.input.ki = new KEYBDINPUT();
      var0.input.ki.wVk = new WORD(0L);
      var0.input.ki.wScan = new WORD(var1.l());
      var0.input.ki.dwFlags = new DWORD(var3);
      var0.input.ki.time = new DWORD(0L);
      var0.input.ki.dwExtraInfo = new ULONG_PTR(0L);
      var0.write();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = 1620265348;
      short var12 = 17886;
      int var11 = 0;
      int var8 = "\u0019▣뒆⋕듅⦆瓗⌬풅⡭㐜⋪㒱⣢瓿▛㒰⠥㓇⢶퓸⎜풨⎭㐂⋪".length();
      String var7 = "\u0019▣뒆⋕듅⦆瓗⌬풅⡭㐜⋪㒱⣢瓿▛㒰⠥㓇⢶퓸⎜풨⎭㐂⋪";
      String[] var10000 = new String[1];
      int var10 = 0;
      String[] var9 = var10000;

      do {
         char var13 = var7.charAt(var11);
         int var10001 = var11 + 1;
         int var10002 = var11 + 1;
         int var15 = 0;
         char[] var14 = var7.substring(var10001, var10002 + var13).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 7) {
               default -> 14;
               case 1 -> 16;
               case 2 -> 136;
               case 3 -> 103;
               case 4 -> 59;
               case 5 -> 95;
               case 6 -> 105;
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

      lll = var9;
      IIII = new Object[var9.length];
      byte var21 = 0;
      int var23 = 0;
      byte[] var30 = "$-\u0092<ÎL\u0015\u0099\u0014$\u000137)Á\u000e/òÊï\u0096ÊÜ\u0015ì\u0018ÅM¡\u0089Õa\u0093Þ¡ÓÛÉPQñ\u008cN-&Qui>\u0094O\\ßØ\u0019QÀgØ7ß\u0019k'\u0002y\u0090R?ª\u0007!\u001c\u0094\u0080ÂÊ¬3\u0007Ý\u008bÄÀ}\u0090¯nÌÍ\u008cWó\u0014?,>\u0088]W5x\u0014L\u0092ÁrsG¨®¡#X#\u0014oti4Ù\u0097{\u0017 ~Êb\u0098;PùuTiø/~Ó9$æ\u0084¯\u0013\u0087ï}\nf·\u001e[\u0093ÐÚ\u001dÉe »Iêýð\u0091å\u009c¨¢4ë\tß\u008f{\u008d\u00adßUV6{o\u009fíýîWµVe~Ig?»öãòù5\u0086Ê!á\u0099ºqLiÖ\u009e3\u000fÁ\u0099ð\u0080\u0006,¯T\u009dèä,¸ûÀ#x%)õ\u001c\u0018¬ðBÆ\u0099²Y\u009b\u0006\u0004Ë\u0095\u000eh´Q-\"ÇrùrådÌMþ6÷Í\u009bËÓßÈVí\u0017¿%$hl\nÏââ'Ú-Ø¡öÛÎ³*¡\u0018Sí\u0006\\½N^\u0016Qj\u009f\u0012¶«(ê"
         .getBytes("ISO-8859-1");
      llI = new int[78];

      int var46;
      do {
         llI[var21] = ((var30[var23] & 255) << 24 | (var30[var23 + 1] & 255) << 16 | (var30[var23 + 2] & 255) << 8 | var30[var23 + 3] & 255) ^ 2119402387;
         var21 += 1;
         var46 = var23 + 4;
         var23 += 4;
      } while (var46 < var30.length);

      String[] var0 = new String[2];
      int var4 = 0;
      String var3;
      int var5 = (var3 = lll(var17 ^ -10273704, '↭', (short)'\uddcf')).length();
      int var2 = llI(-1724800319, var17 ^ 1237153583);
      int var1 = -1;

      while (true) {
         label89: {
            int var22 = llI(-1724800318, var17 ^ -1814732171);
            char[] var47 = var3.substring(++var1, var1 + var2).toCharArray();
            int var57 = var47.length;
            int var6 = 0;
            var46 = var22;
            var36 = var47;
            var23 = var57;
            char[] var66;
            int var73;
            if (var57 <= 1) {
               var66 = var47;
               var57 = var22;
               var73 = var6;
            } else {
               var46 = var22;
               var23 = var57;
               if (var57 <= var6) {
                  break label89;
               }

               var66 = var47;
               var57 = var22;
               var73 = var6;
            }

            while (true) {
               var66[var73] = (char)(var66[var73] ^ var57 ^ switch (var6 % llI(-1724800317, var17 ^ -1327979587)) {
                  case 0 -> llI(-1724800316, var17 ^ -1476155327);
                  case 1 -> llI(-1724800315, var17 ^ 289128034);
                  case 2 -> llI(-1724800314, var17 ^ 1810474512);
                  case 3 -> llI(-1724800313, var17 ^ 645445473);
                  case 4 -> llI(-1724800312, var17 ^ 338674652);
                  case 5 -> llI(-1724800311, var17 ^ 1547186724);
                  default -> llI(-1724800310, var17 ^ 1987914834);
               });
               var6++;
               if (var46 == 0) {
                  var73 = var46;
                  var66 = var36;
                  var57 = var46;
               } else {
                  if (var23 <= var6) {
                     break;
                  }

                  var66 = var36;
                  var57 = var46;
                  var73 = var6;
               }
            }
         }

         String var50 = new String(var36).intern();
         byte var29 = -1;
         var0[var4++] = var50;
         if ((var1 += var2) >= var5) {
            lII = System.getProperty(IlIIllIII.lI(var0[0]), "").toLowerCase().contains(IlIIllIII.lI(var0[1]));
            return;
         }

         var2 = var3.charAt(var1);
      }
   }

   private static String lll(int var0, char var1, short var2) {
      int var3 = var1 ^ 8621;
      char[] var4 = lll[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])IIII[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         IIII[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 6;
      int var9 = 0;

      do {
         int var10 = var4[var9] + '\ue847';
         var10 += 17150;
         var10 ^= 21619;
         var10 += 55082;
         var10 ^= 2052;
         var10 ^= 46700;
         var10 ^= 38766;
         var10 ^= 28971;
         var10 ^= 53597;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   public static boolean l(class_310 param0, class_306 param1, boolean param2, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: getstatic k74/x/lllIlI.lII Z
      // 03: ifeq 35
      // 06: aload 1
      // 07: ifnull 35
      // 0a: goto 11
      // 0d: invokestatic k74/x/lllIlI.IlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10: athrow
      // 11: iload 2
      // 12: ifne 27
      // 15: goto 1c
      // 18: invokestatic k74/x/lllIlI.IlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b: athrow
      // 1c: iload 3
      // 1d: ifne 3b
      // 20: goto 27
      // 23: invokestatic k74/x/lllIlI.IlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26: athrow
      // 27: aload 0
      // 28: invokestatic k74/x/lllIlI.Il (Lnet/minecraft/class_310;)Z
      // 2b: ifne 3b
      // 2e: goto 35
      // 31: invokestatic k74/x/lllIlI.IlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 34: athrow
      // 35: bipush 0
      // 36: ireturn
      // 37: invokestatic k74/x/lllIlI.IlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a: athrow
      // 3b: aload 1
      // 3c: invokevirtual net/minecraft/class_3675$class_306.method_1442 ()Lnet/minecraft/class_3675$class_307;
      // 3f: getstatic net/minecraft/class_3675$class_307.field_1672 Lnet/minecraft/class_3675$class_307;
      // 42: if_acmpne 73
      // 45: aload 1
      // 46: invokevirtual net/minecraft/class_3675$class_306.method_1444 ()I
      // 49: invokestatic k74/x/lllIlI.IIl (I)Lk74/x/IIIIIll;
      // 4c: astore 4
      // 4e: aload 4
      // 50: ifnonnull 55
      // 53: bipush 0
      // 54: ireturn
      // 55: iload 2
      // 56: ifeq 65
      // 59: aload 4
      // 5b: invokevirtual k74/x/IIIIIll.II ()I
      // 5e: goto 6a
      // 61: invokestatic k74/x/lllIlI.IlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 64: athrow
      // 65: aload 4
      // 67: invokevirtual k74/x/IIIIIll.I ()I
      // 6a: aload 4
      // 6c: invokevirtual k74/x/IIIIIll.l ()I
      // 6f: invokestatic k74/x/lllIlI.ll (II)Z
      // 72: ireturn
      // 73: aload 1
      // 74: invokestatic k74/x/lllIlI.Ill (Lnet/minecraft/class_3675$class_306;)Lk74/x/IIlllIIl;
      // 77: astore 4
      // 79: aload 4
      // 7b: ifnull a2
      // 7e: aload 4
      // 80: iload 2
      // 81: ifne 93
      // 84: goto 8b
      // 87: invokestatic k74/x/lllIlI.IlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8a: athrow
      // 8b: bipush 1
      // 8c: goto 94
      // 8f: invokestatic k74/x/lllIlI.IlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 92: athrow
      // 93: bipush 0
      // 94: invokestatic k74/x/lllIlI.lIl (Lk74/x/IIlllIIl;Z)Z
      // 97: ifeq a2
      // 9a: bipush 1
      // 9b: goto a3
      // 9e: invokestatic k74/x/lllIlI.IlI (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a1: athrow
      // a2: bipush 0
      // a3: ireturn
      // a4: astore 4
      // a6: bipush 0
      // a7: ireturn
   }

   public static boolean II() {
      return lII;
   }

   private static boolean Il(class_310 var0) {
      return lII && var0 != null && var0.field_1755 == null && var0.method_1569() && var0.method_22683() != null;
   }

   private static void lI(INPUT var0, int var1, int var2) {
      var0.type = new DWORD(0L);
      var0.input.setType(MOUSEINPUT.class);
      var0.input.mi = new MOUSEINPUT();
      var0.input.mi.dx = new LONG(0L);
      var0.input.mi.dy = new LONG(0L);
      var0.input.mi.mouseData = new DWORD(var2);
      var0.input.mi.dwFlags = new DWORD(var1);
      var0.input.mi.time = new DWORD(0L);
      var0.input.mi.dwExtraInfo = new ULONG_PTR(0L);
      var0.write();
   }

   private static int llI(int var0, int var1) {
      int var2 = llI[var0 ^ -1724800320] ^ var1 ^ var0;
      var2 ^= 47486;
      var2 -= 54158;
      var2 -= 36945;
      var2 ^= 7766;
      var2 ^= 45771;
      var2 ^= 48365;
      var2 += 8033;
      return var2 + 33116;
   }

   private static boolean ll(int var0, int var1) {
      INPUT[] var2 = (INPUT[])new INPUT().toArray(1);
      lI(var2[0], var0, var1);
      return User32.INSTANCE.SendInput(new DWORD(1L), var2, var2[0].size()).intValue() == 1;
   }

   private lllIlI() {
   }

   private static int III(int var0) {
      int var1 = 1009685097;
      if ((var0 < llI(-1724800309, var1 ^ -48378428) || var0 > llI(-1724800308, var1 ^ -438765569))
         && (var0 < llI(-1724800307, var1 ^ 76849355) || var0 > llI(-1724800306, var1 ^ 455827889))) {
         if (var0 >= llI(-1724800305, var1 ^ 72725144) && var0 <= llI(-1724800304, var1 ^ -650819094)) {
            return llI(-1724800303, var1 ^ -454639914) + var0 - llI(-1724800302, var1 ^ -942122656);
         } else if (var0 >= llI(-1724800301, var1 ^ 299953538) && var0 <= llI(-1724800300, var1 ^ 113711691)) {
            return llI(-1724800299, var1 ^ -1495525747) + var0 - llI(-1724800298, var1 ^ 394351319);
         } else {
            return switch (var0) {
               case 32 -> llI(-1724800297, var1 ^ 676890509);
               case 39 -> llI(-1724800296, var1 ^ -440106181);
               case 44 -> llI(-1724800295, var1 ^ -298537601);
               case 45 -> llI(-1724800294, var1 ^ 1234021474);
               case 46 -> llI(-1724800293, var1 ^ -1662750546);
               case 47 -> llI(-1724800292, var1 ^ -132842211);
               case 59 -> llI(-1724800291, var1 ^ -1271345151);
               case 61 -> llI(-1724800290, var1 ^ 47956512);
               case 91 -> llI(-1724800289, var1 ^ 2066879604);
               case 92 -> llI(-1724800288, var1 ^ 1131908819);
               case 93 -> llI(-1724800287, var1 ^ -1374111822);
               case 96 -> llI(-1724800286, var1 ^ -198046451);
               case 256 -> llI(-1724800285, var1 ^ -5620283);
               case 257 -> llI(-1724800284, var1 ^ -926197790);
               case 258 -> llI(-1724800283, var1 ^ -785772956);
               case 259 -> llI(-1724800282, var1 ^ -2132842078);
               case 260 -> llI(-1724800281, var1 ^ -964305508);
               case 261 -> llI(-1724800280, var1 ^ 1610961521);
               case 262 -> llI(-1724800279, var1 ^ 735927560);
               case 263 -> llI(-1724800278, var1 ^ 1945013362);
               case 264 -> llI(-1724800277, var1 ^ -762103826);
               case 265 -> llI(-1724800276, var1 ^ 1457612741);
               case 266 -> llI(-1724800275, var1 ^ -1921334283);
               case 267 -> llI(-1724800274, var1 ^ 1151419760);
               case 268 -> llI(-1724800273, var1 ^ -1929777416);
               case 269 -> llI(-1724800272, var1 ^ -1526341698);
               case 280 -> llI(-1724800271, var1 ^ 1622825601);
               case 281 -> llI(-1724800270, var1 ^ 578371391);
               case 282 -> llI(-1724800269, var1 ^ -89317297);
               case 283 -> llI(-1724800268, var1 ^ -1442786984);
               case 284 -> llI(-1724800267, var1 ^ 1165997749);
               case 330 -> llI(-1724800266, var1 ^ 1119631828);
               case 331 -> llI(-1724800265, var1 ^ -136057521);
               case 332 -> llI(-1724800264, var1 ^ 866686328);
               case 333 -> llI(-1724800263, var1 ^ 546085530);
               case 334 -> llI(-1724800262, var1 ^ -26915617);
               case 335 -> llI(-1724800261, var1 ^ -1008711486);
               case 336 -> llI(-1724800260, var1 ^ 500501324);
               case 340 -> llI(-1724800259, var1 ^ 1078640064);
               case 341 -> llI(-1724800258, var1 ^ 1313001914);
               case 342 -> llI(-1724800257, var1 ^ -1973314614);
               case 343 -> llI(-1724800384, var1 ^ -1447703764);
               case 344 -> llI(-1724800383, var1 ^ -1082067832);
               case 345 -> llI(-1724800382, var1 ^ -306481944);
               case 346 -> llI(-1724800381, var1 ^ 278881976);
               case 347 -> llI(-1724800380, var1 ^ -1918783887);
               case 348 -> llI(-1724800379, var1 ^ -26684990);
               default -> -1;
            };
         }
      } else {
         return var0;
      }
   }

   private static IIIIIll IIl(int var0) {
      int var1 = 1573945321;

      return switch (var0) {
         case 0 -> new IIIIIll(2, 4, 0);
         case 1 -> new IIIIIll(llI(-1724800378, var1 ^ -1333938566), llI(-1724800377, var1 ^ -1654097575), 0);
         case 2 -> new IIIIIll(llI(-1724800376, var1 ^ 457477808), llI(-1724800375, var1 ^ 161019207), 0);
         case 3 -> new IIIIIll(llI(-1724800374, var1 ^ -379628992), llI(-1724800373, var1 ^ 133983627), 1);
         case 4 -> new IIIIIll(llI(-1724800372, var1 ^ -338113784), llI(-1724800371, var1 ^ 202972017), 2);
         default -> null;
      };
   }

   private static Throwable IlI(Throwable var0) {
      return var0;
   }

   private static IIlllIIl Ill(class_306 var0) {
      if (var0 != null && var0.method_1442() != class_307.field_1672) {
         int var1 = III(var0.method_1444());
         if (var1 < 0) {
            return null;
         } else {
            int var2 = User32.INSTANCE.MapVirtualKeyEx(var1, 0, User32.INSTANCE.GetKeyboardLayout(0));
            return var2 == 0 ? null : new IIlllIIl(var2, lII(var0.method_1444()));
         }
      } else {
         return null;
      }
   }

   private static boolean lII(int var0) {
      return switch (var0) {
         case 260, 261, 262, 263, 264, 265, 266, 267, 268, 269, 282, 283, 331, 335, 343, 345, 346, 347, 348 -> true;
         default -> false;
      };
   }

   private static boolean lIl(IIlllIIl var0, boolean var1) {
      INPUT[] var2 = (INPUT[])new INPUT().toArray(1);
      I(var2[0], var0, var1);
      return User32.INSTANCE.SendInput(new DWORD(1L), var2, var2[0].size()).intValue() == 1;
   }
}
