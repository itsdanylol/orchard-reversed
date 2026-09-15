package k74.x;

import com.mojang.authlib.GameProfile;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1011;
import net.minecraft.class_310;
import net.minecraft.class_7920;
import net.minecraft.class_8685;
import net.minecraft.class_12079.class_12081;

@Environment(EnvType.CLIENT)
public final class IIlllII extends IlIIIIIIl {
   private static final Map<IIllIlIll, class_12081> I;
   private static final Object[] IIll;
   private boolean II;
   private final IllIII<IIllIlIll> Il;
   private IIllIlIll lI;
   private static final int ll = 22;
   private static final int[] IIIl;
   private static final int III = 32;
   private String IIl;
   private static final int IlI = 17;
   private static final String[] IIlI;
   private static String[] Ill;
   private class_8685 lII;
   private static final int lIl = 64;
   private static final String[] llI;
   private class_8685 lll;
   private static final String[] IIII;

   private static class_12081 I(IIllIlIll param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic k74/x/IIlllII.Ill [Ljava/lang/String;
      // 003: bipush 2
      // 004: aaload
      // 005: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 008: getstatic k74/x/IIlllII.Ill [Ljava/lang/String;
      // 00b: bipush 0
      // 00c: aaload
      // 00d: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 010: aload 0
      // 011: invokevirtual k74/x/IIllIlIll.I ()Ljava/lang/String;
      // 014: getstatic k74/x/IIlllII.Ill [Ljava/lang/String;
      // 017: bipush 3
      // 018: aaload
      // 019: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 01c: astore 12
      // 01e: astore 11
      // 020: astore 10
      // 022: new java/lang/StringBuilder
      // 025: dup
      // 026: invokespecial java/lang/StringBuilder.<init> ()V
      // 029: aload 10
      // 02b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 02e: aload 11
      // 030: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 033: aload 12
      // 035: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 038: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 03b: invokestatic net/minecraft/class_2960.method_60655 (Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/class_2960;
      // 03e: astore 1
      // 03f: getstatic k74/x/IIlllII.Ill [Ljava/lang/String;
      // 042: bipush 2
      // 043: aaload
      // 044: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 047: getstatic k74/x/IIlllII.Ill [Ljava/lang/String;
      // 04a: bipush 4
      // 04b: aaload
      // 04c: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 04f: aload 0
      // 050: invokevirtual k74/x/IIllIlIll.I ()Ljava/lang/String;
      // 053: astore 12
      // 055: astore 11
      // 057: new java/lang/StringBuilder
      // 05a: dup
      // 05b: invokespecial java/lang/StringBuilder.<init> ()V
      // 05e: aload 11
      // 060: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 063: aload 12
      // 065: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 068: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 06b: invokestatic net/minecraft/class_2960.method_60655 (Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/class_2960;
      // 06e: astore 2
      // 06f: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 072: astore 3
      // 073: aload 3
      // 074: ifnonnull 085
      // 077: new net/minecraft/class_12079$class_10726
      // 07a: dup
      // 07b: aload 2
      // 07c: aload 1
      // 07d: invokespecial net/minecraft/class_12079$class_10726.<init> (Lnet/minecraft/class_2960;Lnet/minecraft/class_2960;)V
      // 080: areturn
      // 081: invokestatic k74/x/IIlllII.IIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 084: athrow
      // 085: aload 3
      // 086: invokevirtual net/minecraft/class_310.method_1531 ()Lnet/minecraft/class_1060;
      // 089: astore 4
      // 08b: aload 4
      // 08d: ifnull 09e
      // 090: aload 3
      // 091: invokevirtual net/minecraft/class_310.method_1478 ()Lnet/minecraft/class_3300;
      // 094: ifnonnull 0ac
      // 097: goto 09e
      // 09a: invokestatic k74/x/IIlllII.IIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09d: athrow
      // 09e: new net/minecraft/class_12079$class_10726
      // 0a1: dup
      // 0a2: aload 2
      // 0a3: aload 1
      // 0a4: invokespecial net/minecraft/class_12079$class_10726.<init> (Lnet/minecraft/class_2960;Lnet/minecraft/class_2960;)V
      // 0a7: areturn
      // 0a8: invokestatic k74/x/IIlllII.IIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ab: athrow
      // 0ac: getstatic k74/x/IIlllII.Ill [Ljava/lang/String;
      // 0af: bipush 2
      // 0b0: aaload
      // 0b1: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0b4: getstatic k74/x/IIlllII.Ill [Ljava/lang/String;
      // 0b7: bipush 1
      // 0b8: aaload
      // 0b9: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0bc: aload 0
      // 0bd: invokevirtual k74/x/IIllIlIll.I ()Ljava/lang/String;
      // 0c0: astore 13
      // 0c2: astore 12
      // 0c4: new java/lang/StringBuilder
      // 0c7: dup
      // 0c8: invokespecial java/lang/StringBuilder.<init> ()V
      // 0cb: aload 12
      // 0cd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0d0: aload 13
      // 0d2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0d5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0d8: invokestatic net/minecraft/class_2960.method_60655 (Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/class_2960;
      // 0db: astore 5
      // 0dd: aload 3
      // 0de: invokevirtual net/minecraft/class_310.method_1478 ()Lnet/minecraft/class_3300;
      // 0e1: aload 1
      // 0e2: invokeinterface net/minecraft/class_3300.method_14486 (Lnet/minecraft/class_2960;)Ljava/util/Optional; 2
      // 0e7: astore 6
      // 0e9: aload 6
      // 0eb: invokevirtual java/util/Optional.isEmpty ()Z
      // 0ee: ifeq 0ff
      // 0f1: new net/minecraft/class_12079$class_10726
      // 0f4: dup
      // 0f5: aload 2
      // 0f6: aload 1
      // 0f7: invokespecial net/minecraft/class_12079$class_10726.<init> (Lnet/minecraft/class_2960;Lnet/minecraft/class_2960;)V
      // 0fa: areturn
      // 0fb: invokestatic k74/x/IIlllII.IIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fe: athrow
      // 0ff: aload 6
      // 101: invokevirtual java/util/Optional.get ()Ljava/lang/Object;
      // 104: checkcast net/minecraft/class_3298
      // 107: invokevirtual net/minecraft/class_3298.method_14482 ()Ljava/io/InputStream;
      // 10a: astore 7
      // 10c: aload 7
      // 10e: invokestatic net/minecraft/class_1011.method_4309 (Ljava/io/InputStream;)Lnet/minecraft/class_1011;
      // 111: astore 8
      // 113: aload 8
      // 115: invokestatic k74/x/IIlllII.II (Lnet/minecraft/class_1011;)Lnet/minecraft/class_1011;
      // 118: astore 8
      // 11a: aload 4
      // 11c: aload 5
      // 11e: new net/minecraft/class_1043
      // 121: dup
      // 122: aload 5
      // 124: dup
      // 125: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 128: pop
      // 129: invokedynamic get (Lnet/minecraft/class_2960;)Ljava/util/function/Supplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, net/minecraft/class_2960.toString ()Ljava/lang/String;, ()Ljava/lang/String; ]
      // 12e: aload 8
      // 130: invokespecial net/minecraft/class_1043.<init> (Ljava/util/function/Supplier;Lnet/minecraft/class_1011;)V
      // 133: invokevirtual net/minecraft/class_1060.method_4616 (Lnet/minecraft/class_2960;Lnet/minecraft/class_1044;)V
      // 136: new net/minecraft/class_12079$class_10726
      // 139: dup
      // 13a: aload 5
      // 13c: aload 5
      // 13e: invokespecial net/minecraft/class_12079$class_10726.<init> (Lnet/minecraft/class_2960;Lnet/minecraft/class_2960;)V
      // 141: astore 9
      // 143: aload 7
      // 145: ifnull 154
      // 148: aload 7
      // 14a: invokevirtual java/io/InputStream.close ()V
      // 14d: goto 154
      // 150: invokestatic k74/x/IIlllII.IIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 153: athrow
      // 154: aload 9
      // 156: areturn
      // 157: astore 8
      // 159: aload 7
      // 15b: ifnull 16f
      // 15e: aload 7
      // 160: invokevirtual java/io/InputStream.close ()V
      // 163: goto 16f
      // 166: astore 9
      // 168: aload 8
      // 16a: aload 9
      // 16c: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 16f: aload 8
      // 171: athrow
      // 172: astore 7
      // 174: new net/minecraft/class_12079$class_10726
      // 177: dup
      // 178: aload 2
      // 179: aload 1
      // 17a: invokespecial net/minecraft/class_12079$class_10726.<init> (Lnet/minecraft/class_2960;Lnet/minecraft/class_2960;)V
      // 17d: areturn
   }

   private void l(class_310 var1, Optional var2, Throwable var3) {
      var1.execute(this::ll);
   }

   private static String IlII(int var0, char var1, short var2) {
      int var3 = var1 ^ '骴';
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 22652;
      int var9 = 0;

      do {
         int var10 = var4[var9] - '\ue2ab';
         var10 -= 38209;
         var10 -= 30162;
         var10 ^= 862;
         var10 += 46346;
         var10 += 41220;
         var10 -= 8085;
         var10 += 55702;
         var10 += 53296;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static class_1011 II(class_1011 var0) {
      int var2 = var0.method_4307();
      int var3 = var0.method_4323();
      int var4 = (int)Math.max(64L, lI(var2 * 64L, 22L));
      int var5 = (int)Math.max(32L, lI(var3 * 32L, 17L));
      String[] var10000 = IIllllIl.IIIIl();
      int var6 = Math.max(var2, (int)Math.ceil(var4 * 0.34375));
      String[] var1 = var10000;
      int var7 = Math.max(var3, (int)Math.ceil(var5 * 0.53125));
      if (var4 < var6) {
         var4 = var6;
      }

      if (var5 < var7) {
         var5 = var7;
      }

      class_1011 var8 = new class_1011(var4, var5, true);
      int var9 = Math.max(0, (var6 - var2) / 2);
      int var10 = Math.max(0, (var7 - var3) / 2);
      int var11 = 0;

      label34:
      while (var11 < var2) {
         int var12 = 0;

         while (true) {
            if (var12 < var3) {
               var8.method_61941(var9 + var11, var10 + var12, var0.method_61940(var11, var12));
               var12++;
               if (var1 == null) {
                  continue;
               }
            }

            var11++;
            if (var1 != null) {
               break label34;
            }
            break;
         }
      }

      var0.close();
      return var8;
   }

   @Override
   public String IlIIl() {
      return this.Il.IllI().lI();
   }

   public void Il(String var1) {
   }

   private static long lI(long var0, long var2) {
      return (var0 + var2 - 1L) / var2;
   }

   private void ll(Throwable var1, Optional var2) {
      String[] var3 = IIllllIl.IIIIl();
      this.II = false;
      if (var1 == null) {
         if ((var2 instanceof Optional ? var2.orElse(null) : var2) instanceof class_8685 var5 && var3 == null) {
            this.lll = var5;
            this.lI = this.Il.IllI();
            this.lII = lIl(var5, this.lI);
         }
      }
   }

   private static String III(char[] var0, long var1, int var3) {
      int var4 = IIll(-1960370988, -1120828264 ^ -130541538) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & IIll(-1960370987, -1120828264 ^ 1250554653);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   @Override
   public void llIl() {
      this.lII = null;
      this.II = false;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = 1842343718;
      String[] var15 = new String[2];
      int var17 = 0;
      int var16 = 0;
      short var18 = 9703;
      int var14 = "}\u173bཹ㉑ᏼᶞꗧ蛀櫌ႈ\ud9a0쀋▱굪\ue850骿涀鶾뤖꛷媸癀䠓\udcbeଓ贈웯넻\uf482જ뱷彏䣀퇃\uec2e뤁\udb4e뱜Ḭѭ颴\uefd5ّ觮\ueb90ଔ嵏䖸疢\uf284돓ｨ聼ق펣\ud812ⳃ얚ᰖ\u05cb䎼謇퇀궤踌愙೧⒩\ue7f1椁㙰８煿䛺瞝峳臚⳧垮䁽튦䥗\u0cf9ह릻꿗ᚮ디┹桞쨇홰뿿赪ܱ赨锖硙坵괐㤯\uedc4瞧ⶵ隟埢죉⾶㇡뿑\u200b\ue489楪倚嬥ꃧ㥋趮댯ᆗ㠕靳\u10c6컈\uf1c4⽇\u0019\uefed릃咗\u0a84液镊\uf268⼇\udf0f\uf542ꜗ뺷䤓ⰹ炝ꄌ깴욎ࡌ凴惇㞗纵뛣㬽"
         .length();
      String var13 = "}\u173bཹ㉑ᏼᶞꗧ蛀櫌ႈ\ud9a0쀋▱굪\ue850骿涀鶾뤖꛷媸癀䠓\udcbeଓ贈웯넻\uf482જ뱷彏䣀퇃\uec2e뤁\udb4e뱜Ḭѭ颴\uefd5ّ觮\ueb90ଔ嵏䖸疢\uf284돓ｨ聼ق펣\ud812ⳃ얚ᰖ\u05cb䎼謇퇀궤踌愙೧⒩\ue7f1椁㙰８煿䛺瞝峳臚⳧垮䁽튦䥗\u0cf9ह릻꿗ᚮ디┹桞쨇홰뿿赪ܱ赨锖硙坵괐㤯\uedc4瞧ⶵ隟埢죉⾶㇡뿑\u200b\ue489楪倚嬥ꃧ㥋趮댯ᆗ㠕靳\u10c6컈\uf1c4⽇\u0019\uefed릃咗\u0a84液镊\uf268⼇\udf0f\uf542ꜗ뺷䤓ⰹ炝ꄌ깴욎ࡌ凴惇㞗纵뛣㬽";

      do {
         char var19 = var13.charAt(var17);
         int var10001 = var17 + 1;
         int var21 = 0;
         char[] var20 = var13.substring(var10001, var10001 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 5) {
               default -> 153;
               case 1 -> 107;
               case 2 -> 38;
               case 3 -> 175;
               case 4 -> 173;
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

      IIlI = var15;
      IIll = new Object[var15.length];
      int var9 = 14080116;
      byte[] var7 = "F×Åe\u0083·Àmã\u0005 \u001e¯vàÆ\u0015\u009aº\u0087l\u0018ÝØ\u0001\u0088\u0094\u009f,Y½R\u0092;að·\u0002²÷mv\u0097eãõÆ\u0097\u0017\u008bÃ¸üI±Të¥2úü®y^´\u0089³\u0004Êp\u0000ø\u0013ÔN\u0013.T7»&ÿ\u0087ª\u0014\u008eÉ4\u0083÷OuÔ\u009d/î7\u0012\r1x\u009dpü?\u001dJ1\f¢Js_Õ<ó\u008e3?\u009d\u0017äÒ\u0083\t\u0012¶\fj²k\u001fc¡ýÓ\u0007\u0010Ë=¦[î9Qq\u0016°\u0081\u0089[\u0094¨<1ö¨Ô\u0096\u0086\u0090P\u001dø¢PDúqOoÁÞ\u007fs¶,·;\u0017\u0083®Í<w\u0017{R=:³\u008e\u001e\u000fDü\u0097F¦\f»BÂ\u008d\u0096õ;\u0081\u0090#ÉËOÉvW»q\u0007%,\u0010\u001b\u000e\u001d«\u008aÝ\u009aÑ\u0012Ö\u008f\u0017\u001dö0ß\u0083ü\u0007øöþf§_ñüì\u001e¥¼· àÝµµÀchó\u0006«¢Ê©Ê\f¾\u001a89Hë¶\u0098y@¯\u0017\u0089p6Æy õ'['\u0090\u0082I\u0014ö=\u000bLMq¼Ä.\u0086\t\u008f\u0007²ú\u009dmâ(S\u0000Æë©.]W§N\u008f\u008b\u001fK FæVw~5ô¬ÛJ\u0011pûBýëÍ(\u00881Ýü:VV\u0094\n\u009b®Ú\u0011\u008e5ÄÝém\u0080¯â\u009dÁ¡ï®\u009b>½;´á\b8²93kJ\u0018\u0099\u0090¶S\u00992¿³`\u0096 NQY\u009f=\u00ad\u000b\u0099Zþõthï\u0010³\u0018©l3z¾.6\u001fÙO*q9\u009c\u0093\u0087\u00936\u0017\u0004£åÁ\u009bÁOì½«ÔÇ¹UU\n\u0012È»}é\u009b6 öÎFÆôå]a\u0016G\u0088\u0093ç\u0013²\u00074@q9\u009b-¾kaêg\rtJ«¦ín:ã\u0082c#\u0000ô@i?âUÞ%\\ðÑ\u008dVÓ£Ò#Ìðn)û\r\u0010¸îÕÆËû\u008d¨\u0083¾ÏÜ\u0017¨Îï\u001bR`Lg´\u000b\fÌ\u000e¤\u009cêHê\u0006j\u007f|¼\u0018©?\u0097\u0001Å¦2Ê¶\u0091/-,z;\u009b\u001e\u007fàÐ\u0012±MR7Qo\u0014yôÝ\u0097\u00124ÔnïH¡\u000fp}\u009d\u000bÑ2v\u0011\u008f§É4\u0000Õ\t\u000b¦`\u00878'ã\u008bV\u0092±²|ãËóFë\u00ad»i\u009bÓk\u0081!å¯X\u008eª}\u001dL\u0000DÙ WAg\u0013»ªÅ\u0085kÒoJàèÔ\u0080c\u0010.®ÿªláß8t¬«JÄZ\u0095§\u008b\u001a\u0004íV1?\u001a\u0097#Æ\u0088µ\u0094ÀÙ¨\u0004Îc\u00adª¾±ÔD²®DÔfÓ_\u0003Á3M¢\u008ePfªRC\u009fSCJ\u0010ù×¼E¢\u0081q\u0000\u0084\u0015¾;Î\"\u0014\u00adÒ\u007fèb\u00005t\u008b\u0018\u0087\u009a\u0005PdA\u0093\u001cu=Xoª<§ñ!U.\t:Ú\u0003«ç9:þß\u0099\u000b\u008aW;ö}q±Ï\u008f6H@Ñ\t\u0019\u009e\u009a*d\u0007#(Á\u0089ù`óëþãî\u0097\u0003Á\u001dt\u0005P\f\u0007:u«ÅVí%\u008a?\u0092¥òÛtè\ryQî*é\u0086¬ÿt2\u0097\u0012X:\u0007_â>\u0003\u0005\u0004¦otÜ8:û\u001bÃ_Mö\u0084\u001c\u0001,ÖMåÝj\u0005\"w¼ù¾íàÆ_veÿÙQ\u0083\u0081täµ\u0011åQÅ\u0094\r\u009e@½£d)À;[(ßwÄ´/döµJY%}M¨\u009fqMÿÉ\u00ad\u0081F#åÊ\u000b´ö\u009aßf\u0094éµDUþ\u0011\u009b\u0016tk\u0018ÒjÜÊy3ùHÿ\bÎ\u008cu¤¦Äâ~°qí\u001a~(ý\u0019\u0012üÐç\u009f\u0097\u0087!\u0086ö×\u001d0¬U%\u0091ú_DvÒU6\u008d\u009aþÝ¶Ù&£®pÄÖ\u008b/È³'\u009f\u0004¹\u001f\u001dý^zJ\u0091¬)\u001dPvù¿\u0007þç\u0001YM$Á\u0088>²jrW8`\u001dSç\u009eR<\u008b\u0097þN°ð\u0004\u0089âºÝ§I¡\u0005af\b?b\u0097\u0007+Õ¾Ø\u001cøÎµþ$Dz¹ð\u007fÈ!qfKz\u0006G8Cè¢H\u008bßC¤ ÁI45\u001b-2\u009d\n\u0013P¬²BÃb·´¡ \u0005õPÛÝûÓ\u0086\u0087\u001fù\u0002£ßók4B?×nT\u0093i<\u009fAS\u008c¶\u0011\u0082²\u0001{1;\u009e^WYG\u0012#ÿ¸(ù\nµÂèùcÛf\u0081\u0091¡°Å\r2tï\u009e\f\tØÇªð\u0089OtTã"
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

      String[] var5 = new String[IIll(-1960370997, var23 ^ 282259179)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = IlII(var23 ^ -904811517, '骴', (short)'쯾')).length();
      int var1 = IIll(-1960370956, var23 ^ 1936864215);
      int var25 = -1;

      label93:
      while (true) {
         int var28 = IIll(-1960370955, var23 ^ 2053219809);
         String var30 = var2.substring(++var25, var25 + var1);
         byte var10002 = -1;

         while (true) {
            label88: {
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
                     break label88;
                  }

                  var57 = var45;
                  var10004 = var28;
                  var10006 = var6;
               }

               while (true) {
                  var57[var10006] = (char)(var57[var10006] ^ var10004 ^ switch (var6 % IIll(-1960370959, var23 ^ -1740045498)) {
                     case 0 -> IIll(-1960370958, var23 ^ -1308857967);
                     case 1 -> IIll(-1960370957, var23 ^ -1324036472);
                     case 2 -> IIll(-1960370948, var23 ^ -1987033640);
                     case 3 -> IIll(-1960370947, var23 ^ -1148183311);
                     case 4 -> IIll(-1960370946, var23 ^ 1754216365);
                     case 5 -> IIll(-1960370945, var23 ^ -943772719);
                     default -> IIll(-1960370952, var23 ^ 897016631);
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
                     llI = var5;
                     IIII = new String[IIll(-1960370960, var23 ^ 1219579500)];
                     Ill = new String[IIll(-1960370951, var23 ^ -1704028696)];
                     Ill();
                     I = new ConcurrentHashMap<>();
                     return;
                  }

                  var1 = var2.charAt(var25);
                  break;
               default:
                  var5[var3++] = var50;
                  if ((var25 += var1) < var4) {
                     var1 = var2.charAt(var25);
                     continue label93;
                  }

                  var4 = (var2 = IlII(var23 ^ 1864346993, '骵', (short)'\udb9c')).length();
                  var1 = IIll(-1960370954, var23 ^ 516985831);
                  var25 = -1;
            }

            var28 = IIll(-1960370953, var23 ^ -1080314276);
            var30 = var2.substring(++var25, var25 + var1);
            var10002 = 0;
         }
      }
   }

   private void IIl() {
      class_310 var1 = class_310.method_1551();
      if (var1.field_1724 != null && var1.method_1582() != null) {
         if (this.Il.IllI() == IIllIlIll.lI) {
            this.lII = null;
            this.II = false;
         } else {
            GameProfile var2 = var1.field_1724.method_7334();
            String var3 = lIlIIIll.l(var2) == null ? lIlIIIll.Ill(var2) : lIlIIIll.l(var2).toString();
            boolean var4 = !var3.equals(this.IIl);
            boolean var5 = this.Il.IllI() != this.lI;
            if (var4) {
               this.IIl = var3;
               this.lll = null;
               this.lII = null;
            }

            if (var5 && this.lll != null) {
               this.lI = this.Il.IllI();
               this.lII = lIl(this.lll, this.lI);
            }

            if ((this.lll == null || var4) && !this.II) {
               this.II = true;
               var1.method_1582().method_52863(var2).whenComplete(this::l);
            }
         }
      } else {
         this.lll = null;
         this.lII = null;
         this.II = false;
         this.IIl = Ill[IIll(-1960370986, 1923854481 ^ -442390691)];
      }
   }

   private static void Ill() {
      int var0 = -1563819123;
      Ill[0] = III(
         IIII(IIll(-1960370985, var0 ^ 2041612159), IIll(-1960370992, var0 ^ -1017350939)).toCharArray(), 42621L, IIll(-1960370991, var0 ^ 1141510104)
      );
      Ill[1] = III(IIII(IIll(-1960370990, var0 ^ -682691804), IIll(-1960370989, var0 ^ -90433187)).toCharArray(), 38146L, IIll(-1960370980, var0 ^ 1423974405));
      Ill[2] = III(IIII(IIll(-1960370979, var0 ^ 1640289602), IIll(-1960370978, var0 ^ -1146050427)).toCharArray(), 64048L, IIll(-1960370977, var0 ^ 515834690));
      Ill[3] = III(IIII(IIll(-1960370984, var0 ^ -1051876341), IIll(-1960370983, var0 ^ 714038754)).toCharArray(), 8893L, IIll(-1960370982, var0 ^ 1182795918));
      Ill[4] = III(IIII(IIll(-1960370981, var0 ^ 711466728), IIll(-1960371004, var0 ^ 1649399001)).toCharArray(), 25291L, IIll(-1960371003, var0 ^ -1707175795));
      Ill[5] = III(
         IIII(IIll(-1960371002, var0 ^ -988665415), IIll(-1960371001, var0 ^ -124588632)).toCharArray(), 29201L, IIll(-1960371008, var0 ^ -2143605107)
      );
      Ill[IIll(-1960371007, var0 ^ -1035240068)] = III("".toCharArray(), 90111L, IIll(-1960371006, var0 ^ -2136033720));
      Ill[IIll(-1960371005, var0 ^ 39361445)] = III(
         IIII(IIll(-1960370996, var0 ^ -506172782), IIll(-1960370995, var0 ^ -1369905903)).toCharArray(), 17497L, IIll(-1960370994, var0 ^ 1265584087)
      );
      Ill[IIll(-1960370993, var0 ^ -630718917)] = III(
         IIII(IIll(-1960371000, var0 ^ -1995220143), IIll(-1960370999, var0 ^ 1492479121)).toCharArray(), 75661L, IIll(-1960370998, var0 ^ -1623815489)
      );
   }

   private static class_12081 lII(IIllIlIll var0) {
      return I.computeIfAbsent(var0, IIlllII::I);
   }

   @Override
   public void IlIII() {
      this.IIl();
   }

   private static class_8685 lIl(class_8685 var0, IIllIlIll var1) {
      if (var0 != null && var1 != IIllIlIll.lI) {
         class_12081 var2 = lII(var1);
         return new class_8685(var0.comp_1626(), var2, var0.comp_1628(), var0.comp_1629() == null ? class_7920.field_41123 : var0.comp_1629(), var0.comp_1630());
      } else {
         return var0;
      }
   }

   public Object llI(GameProfile var1, Object var2) {
      if (!this.IIlI(var1)) {
         return var2;
      } else if (this.Il.IllI() == IIllIlIll.lI) {
         return var2;
      } else {
         class_8685 var3 = var2 instanceof class_8685 var4 ? var4 : this.lll;
         if (var3 == null) {
            this.IIl();
            return var2;
         } else {
            IIllIlIll var5 = this.Il.IllI();
            if (this.lII == null || this.lI != var5 || this.lll != var3) {
               this.lll = var3;
               this.lI = var5;
               this.lII = lIl(var3, var5);
            }

            return this.lII;
         }
      }
   }

   public IIlllII() {
      super(IlIIllIII.Ill(Ill[IIll(-1960370950, -1232617606 ^ -1247841320)]), lllIIlIl.IIl, IlIIllIII.Ill(Ill[IIll(-1960370949, -1232617606 ^ -5063926)]));
      this.Il = this.IllIIll(new IllIII<>(IlIIllIII.Ill(Ill[5]), IIllIlIll.class, IIllIlIll.lI));
      this.lI = IIllIlIll.lI;
      this.IIl = Ill[IIll(-1960370972, -1232617606 ^ -595112858)];
   }

   public void lll() {
   }

   private static String IIII(int var0, int var1) {
      int var9 = -496708218;
      int var2 = (var0 ^ IIll(-1960370971, var9 ^ 19797900)) & IIll(-1960370970, var9 ^ 757714384);
      if (IIII[var2] == null) {
         char[] var3 = llI[var2].toCharArray();

         int var4 = switch (var3[0] & IIll(-1960370969, var9 ^ 10377693)) {
            case 0 -> IIll(-1960370976, var9 ^ 105425755);
            case 1 -> IIll(-1960370975, var9 ^ -643689365);
            case 2 -> IIll(-1960370974, var9 ^ 756704702);
            case 3 -> IIll(-1960370973, var9 ^ -1166313084);
            case 4 -> IIll(-1960370964, var9 ^ -1950291799);
            case 5 -> IIll(-1960370963, var9 ^ 213545140);
            case 6 -> IIll(-1960370962, var9 ^ 427589443);
            case 7 -> IIll(-1960370961, var9 ^ -1498095278);
            case 8 -> IIll(-1960370968, var9 ^ -1852599207);
            case 9 -> IIll(-1960370967, var9 ^ -255050261);
            case 10 -> IIll(-1960370966, var9 ^ 1787264324);
            case 11 -> IIll(-1960370965, var9 ^ 719110709);
            case 12 -> IIll(-1960371052, var9 ^ 1272895431);
            case 13 -> IIll(-1960371051, var9 ^ -184315617);
            case 14 -> IIll(-1960371050, var9 ^ 1036626040);
            case 15 -> IIll(-1960371049, var9 ^ 1550310489);
            case 16 -> IIll(-1960371056, var9 ^ -1370346826);
            case 17 -> IIll(-1960371055, var9 ^ 552803128);
            case 18 -> IIll(-1960371054, var9 ^ 964488126);
            case 19 -> IIll(-1960371053, var9 ^ -1599267951);
            case 20 -> IIll(-1960371044, var9 ^ 1665939719);
            case 21 -> IIll(-1960371043, var9 ^ 115944199);
            case 22 -> IIll(-1960371042, var9 ^ 1616275667);
            case 23 -> IIll(-1960371041, var9 ^ -618996042);
            case 24 -> IIll(-1960371048, var9 ^ -1192400020);
            case 25 -> IIll(-1960371047, var9 ^ -1848010700);
            case 26 -> IIll(-1960371046, var9 ^ -74888256);
            case 27 -> IIll(-1960371045, var9 ^ -1767012065);
            case 28 -> IIll(-1960371068, var9 ^ -1204406973);
            case 29 -> IIll(-1960371067, var9 ^ -656086540);
            case 30 -> IIll(-1960371066, var9 ^ -573889171);
            case 31 -> IIll(-1960371065, var9 ^ -1071899576);
            case 32 -> IIll(-1960371072, var9 ^ 1657256138);
            case 33 -> IIll(-1960371071, var9 ^ -2028234529);
            case 34 -> IIll(-1960371070, var9 ^ 1803595551);
            case 35 -> IIll(-1960371069, var9 ^ 509263793);
            case 36 -> IIll(-1960371060, var9 ^ -1405274854);
            case 37 -> IIll(-1960371059, var9 ^ -1661940590);
            case 38 -> IIll(-1960371058, var9 ^ -2015012936);
            case 39 -> IIll(-1960371057, var9 ^ 1266814932);
            case 40 -> IIll(-1960371064, var9 ^ 965345214);
            case 41 -> IIll(-1960371063, var9 ^ 931450123);
            case 42 -> IIll(-1960371062, var9 ^ -1462347394);
            case 43 -> IIll(-1960371061, var9 ^ 2002999903);
            case 44 -> IIll(-1960371020, var9 ^ -1353184918);
            case 45 -> IIll(-1960371019, var9 ^ -1896680732);
            case 46 -> IIll(-1960371018, var9 ^ -973975490);
            case 47 -> IIll(-1960371017, var9 ^ 621540461);
            case 48 -> IIll(-1960371024, var9 ^ -667272308);
            case 49 -> IIll(-1960371023, var9 ^ -1413060156);
            case 50 -> IIll(-1960371022, var9 ^ -862611649);
            case 51 -> IIll(-1960371021, var9 ^ -24874210);
            case 52 -> IIll(-1960371012, var9 ^ -1899884973);
            case 53 -> IIll(-1960371011, var9 ^ -321565633);
            case 54 -> IIll(-1960371010, var9 ^ -1984811533);
            case 55 -> IIll(-1960371009, var9 ^ -413991133);
            case 56 -> IIll(-1960371016, var9 ^ 301487314);
            case 57 -> IIll(-1960371015, var9 ^ -1832351780);
            case 58 -> IIll(-1960371014, var9 ^ 229256566);
            case 59 -> IIll(-1960371013, var9 ^ 734049822);
            case 60 -> IIll(-1960371036, var9 ^ 792606368);
            case 61 -> IIll(-1960371035, var9 ^ -2069636681);
            case 62 -> IIll(-1960371034, var9 ^ 2146456786);
            case 63 -> IIll(-1960371033, var9 ^ 1621435770);
            case 64 -> IIll(-1960371040, var9 ^ 1653489640);
            case 65 -> IIll(-1960371039, var9 ^ -2144539949);
            case 66 -> IIll(-1960371038, var9 ^ 1903742990);
            case 67 -> IIll(-1960371037, var9 ^ -1574235309);
            case 68 -> IIll(-1960371028, var9 ^ 222747752);
            case 69 -> IIll(-1960371027, var9 ^ -142539305);
            case 70 -> IIll(-1960371026, var9 ^ -501102566);
            case 71 -> IIll(-1960371025, var9 ^ 2063948010);
            case 72 -> IIll(-1960371032, var9 ^ 336085175);
            case 73 -> IIll(-1960371031, var9 ^ 1646988105);
            case 74 -> IIll(-1960371030, var9 ^ 1950268446);
            case 75 -> IIll(-1960371029, var9 ^ -895765534);
            case 76 -> IIll(-1960371116, var9 ^ -1061633919);
            case 77 -> IIll(-1960371115, var9 ^ -1247309238);
            case 78 -> IIll(-1960371114, var9 ^ -1081053609);
            case 79 -> IIll(-1960371113, var9 ^ 780515115);
            case 80 -> 0;
            case 81 -> IIll(-1960371120, var9 ^ 1569779531);
            case 82 -> IIll(-1960371119, var9 ^ 366325200);
            case 83 -> IIll(-1960371118, var9 ^ -2117882767);
            case 84 -> IIll(-1960371117, var9 ^ -1925643542);
            case 85 -> IIll(-1960371108, var9 ^ -237016694);
            case 86 -> IIll(-1960371107, var9 ^ 1516619502);
            case 87 -> IIll(-1960371106, var9 ^ 2082703600);
            case 88 -> IIll(-1960371105, var9 ^ -65790410);
            case 89 -> IIll(-1960371112, var9 ^ -1899864669);
            case 90 -> IIll(-1960371111, var9 ^ -1750154147);
            case 91 -> IIll(-1960371110, var9 ^ 1558049772);
            case 92 -> IIll(-1960371109, var9 ^ -1152968629);
            case 93 -> IIll(-1960371132, var9 ^ 225778964);
            case 94 -> IIll(-1960371131, var9 ^ 1182389142);
            case 95 -> IIll(-1960371130, var9 ^ -1000590570);
            case 96 -> IIll(-1960371129, var9 ^ -2112711129);
            case 97 -> IIll(-1960371136, var9 ^ 24729484);
            case 98 -> IIll(-1960371135, var9 ^ -125556051);
            case 99 -> IIll(-1960371134, var9 ^ -1726275657);
            case 100 -> IIll(-1960371133, var9 ^ -1648734019);
            case 101 -> IIll(-1960371124, var9 ^ -2015050380);
            case 102 -> IIll(-1960371123, var9 ^ -1569998887);
            case 103 -> IIll(-1960371122, var9 ^ -1647508754);
            case 104 -> IIll(-1960371121, var9 ^ -1370717847);
            case 105 -> IIll(-1960371128, var9 ^ -1057369324);
            case 106 -> IIll(-1960371127, var9 ^ -360142573);
            case 107 -> IIll(-1960371126, var9 ^ -796864704);
            case 108 -> IIll(-1960371125, var9 ^ -1003256);
            case 109 -> IIll(-1960371084, var9 ^ 390760243);
            case 110 -> IIll(-1960371083, var9 ^ -823801781);
            case 111 -> IIll(-1960371082, var9 ^ -1960353086);
            case 112 -> IIll(-1960371081, var9 ^ 1338717512);
            case 113 -> IIll(-1960371088, var9 ^ -243738203);
            case 114 -> IIll(-1960371087, var9 ^ 1408108904);
            case 115 -> IIll(-1960371086, var9 ^ -115244360);
            case 116 -> IIll(-1960371085, var9 ^ 1122697481);
            case 117 -> IIll(-1960371076, var9 ^ -1195008628);
            case 118 -> IIll(-1960371075, var9 ^ -91570937);
            case 119 -> IIll(-1960371074, var9 ^ -490223583);
            case 120 -> IIll(-1960371073, var9 ^ 1379006380);
            case 121 -> IIll(-1960371080, var9 ^ 493971056);
            case 122 -> IIll(-1960371079, var9 ^ -1067819611);
            case 123 -> IIll(-1960371078, var9 ^ 21537998);
            case 124 -> IIll(-1960371077, var9 ^ 603955919);
            case 125 -> IIll(-1960371100, var9 ^ 1047505955);
            case 126 -> IIll(-1960371099, var9 ^ 1002560673);
            case 127 -> IIll(-1960371098, var9 ^ 1110429815);
            case 128 -> IIll(-1960371097, var9 ^ -759233445);
            case 129 -> IIll(-1960371104, var9 ^ -915889406);
            case 130 -> IIll(-1960371103, var9 ^ -607523666);
            case 131 -> IIll(-1960371102, var9 ^ -255774525);
            case 132 -> IIll(-1960371101, var9 ^ 154673516);
            case 133 -> IIll(-1960371092, var9 ^ -2037205612);
            case 134 -> IIll(-1960371091, var9 ^ -741743785);
            case 135 -> IIll(-1960371090, var9 ^ -1762691269);
            case 136 -> IIll(-1960371089, var9 ^ -1381678879);
            case 137 -> IIll(-1960371096, var9 ^ 1001987452);
            case 138 -> IIll(-1960371095, var9 ^ -194291861);
            case 139 -> IIll(-1960371094, var9 ^ 494134650);
            case 140 -> IIll(-1960371093, var9 ^ -1824848361);
            case 141 -> IIll(-1960371180, var9 ^ 91690962);
            case 142 -> IIll(-1960371179, var9 ^ -838547165);
            case 143 -> IIll(-1960371178, var9 ^ 832193403);
            case 144 -> IIll(-1960371177, var9 ^ -1201514338);
            case 145 -> IIll(-1960371184, var9 ^ -1782544914);
            case 146 -> IIll(-1960371183, var9 ^ -1399472845);
            case 147 -> 3;
            case 148 -> IIll(-1960371182, var9 ^ -1646184961);
            case 149 -> IIll(-1960371181, var9 ^ 1612059317);
            case 150 -> IIll(-1960371172, var9 ^ 1508136084);
            case 151 -> IIll(-1960371171, var9 ^ -692425908);
            case 152 -> IIll(-1960371170, var9 ^ 150030416);
            case 153 -> IIll(-1960371169, var9 ^ -1857533382);
            case 154 -> IIll(-1960371176, var9 ^ 529662585);
            case 155 -> IIll(-1960371175, var9 ^ 2106950077);
            case 156 -> IIll(-1960371174, var9 ^ 23634763);
            case 157 -> IIll(-1960371173, var9 ^ -496094562);
            case 158 -> IIll(-1960371196, var9 ^ -1856956581);
            case 159 -> IIll(-1960371195, var9 ^ 1396543027);
            case 160 -> IIll(-1960371194, var9 ^ 475328538);
            case 161 -> IIll(-1960371193, var9 ^ 1689262073);
            case 162 -> IIll(-1960371200, var9 ^ -1693305918);
            case 163 -> IIll(-1960371199, var9 ^ -1132272501);
            case 164 -> IIll(-1960371198, var9 ^ 1763659860);
            case 165 -> IIll(-1960371197, var9 ^ -2077009671);
            case 166 -> IIll(-1960371188, var9 ^ -913744633);
            case 167 -> IIll(-1960371187, var9 ^ -1821391736);
            case 168 -> IIll(-1960371186, var9 ^ -491300326);
            case 169 -> IIll(-1960371185, var9 ^ 1836097968);
            case 170 -> IIll(-1960371192, var9 ^ -610408788);
            case 171 -> IIll(-1960371191, var9 ^ -1756908542);
            case 172 -> IIll(-1960371190, var9 ^ 1941309564);
            case 173 -> IIll(-1960371189, var9 ^ -1273176564);
            case 174 -> IIll(-1960371148, var9 ^ 679904230);
            case 175 -> IIll(-1960371147, var9 ^ -920844295);
            case 176 -> IIll(-1960371146, var9 ^ 1329258885);
            case 177 -> 5;
            case 178 -> IIll(-1960371145, var9 ^ -493889619);
            case 179 -> IIll(-1960371152, var9 ^ 1933223795);
            case 180 -> IIll(-1960371151, var9 ^ -1678433749);
            case 181 -> IIll(-1960371150, var9 ^ 890194686);
            case 182 -> IIll(-1960371149, var9 ^ -1389344134);
            case 183 -> IIll(-1960371140, var9 ^ -508570042);
            case 184 -> IIll(-1960371139, var9 ^ -224536631);
            case 185 -> IIll(-1960371138, var9 ^ -816963803);
            case 186 -> IIll(-1960371137, var9 ^ 1056183083);
            case 187 -> IIll(-1960371144, var9 ^ 1772277644);
            case 188 -> IIll(-1960371143, var9 ^ -800553072);
            case 189 -> IIll(-1960371142, var9 ^ -1646291549);
            case 190 -> IIll(-1960371141, var9 ^ 1225651872);
            case 191 -> IIll(-1960371164, var9 ^ 590296950);
            case 192 -> IIll(-1960371163, var9 ^ -2014284549);
            case 193 -> IIll(-1960371162, var9 ^ -42749737);
            case 194 -> IIll(-1960371161, var9 ^ 1252072304);
            case 195 -> IIll(-1960371168, var9 ^ 1864605154);
            case 196 -> IIll(-1960371167, var9 ^ 1491539755);
            case 197 -> IIll(-1960371166, var9 ^ 816808100);
            case 198 -> IIll(-1960371165, var9 ^ 639274939);
            case 199 -> IIll(-1960371156, var9 ^ -398221438);
            case 200 -> IIll(-1960371155, var9 ^ -2070433105);
            case 201 -> IIll(-1960371154, var9 ^ 167568702);
            case 202 -> IIll(-1960371153, var9 ^ 278771090);
            case 203 -> IIll(-1960371160, var9 ^ -1496893579);
            case 204 -> IIll(-1960371159, var9 ^ 126958934);
            case 205 -> IIll(-1960371158, var9 ^ -524732553);
            case 206 -> 2;
            case 207 -> IIll(-1960371157, var9 ^ 468818984);
            case 208 -> IIll(-1960370732, var9 ^ 548554021);
            case 209 -> IIll(-1960370731, var9 ^ 941336467);
            case 210 -> IIll(-1960370730, var9 ^ 491039730);
            case 211 -> IIll(-1960370729, var9 ^ -1309382685);
            case 212 -> IIll(-1960370736, var9 ^ -1988714943);
            case 213 -> IIll(-1960370735, var9 ^ -333319426);
            case 214 -> IIll(-1960370734, var9 ^ -1082772812);
            case 215 -> IIll(-1960370733, var9 ^ 1876190414);
            case 216 -> IIll(-1960370724, var9 ^ 1902787288);
            case 217 -> IIll(-1960370723, var9 ^ -1297421376);
            case 218 -> IIll(-1960370722, var9 ^ 604049549);
            case 219 -> IIll(-1960370721, var9 ^ -1374978391);
            case 220 -> IIll(-1960370728, var9 ^ 1911894326);
            case 221 -> IIll(-1960370727, var9 ^ 503094710);
            case 222 -> IIll(-1960370726, var9 ^ 647718795);
            case 223 -> IIll(-1960370725, var9 ^ 1959902749);
            case 224 -> IIll(-1960370748, var9 ^ -540383654);
            case 225 -> IIll(-1960370747, var9 ^ -261923591);
            case 226 -> IIll(-1960370746, var9 ^ 23873604);
            case 227 -> IIll(-1960370745, var9 ^ 682852101);
            case 228 -> IIll(-1960370752, var9 ^ 1490984362);
            case 229 -> IIll(-1960370751, var9 ^ -770581774);
            case 230 -> IIll(-1960370750, var9 ^ -375176682);
            case 231 -> IIll(-1960370749, var9 ^ -266331937);
            case 232 -> IIll(-1960370740, var9 ^ -783081348);
            case 233 -> 4;
            case 234 -> IIll(-1960370739, var9 ^ 874768494);
            case 235 -> IIll(-1960370738, var9 ^ -707836979);
            case 236 -> IIll(-1960370737, var9 ^ -547399968);
            case 237 -> IIll(-1960370744, var9 ^ -1151730089);
            case 238 -> IIll(-1960370743, var9 ^ -2059677721);
            case 239 -> IIll(-1960370742, var9 ^ -727187028);
            case 240 -> IIll(-1960370741, var9 ^ 583680808);
            case 241 -> IIll(-1960370700, var9 ^ 1664858335);
            case 242 -> 1;
            case 243 -> IIll(-1960370699, var9 ^ 1840833984);
            case 244 -> IIll(-1960370698, var9 ^ -1986895389);
            case 245 -> IIll(-1960370697, var9 ^ 1234700766);
            case 246 -> IIll(-1960370704, var9 ^ -732645992);
            case 247 -> IIll(-1960370703, var9 ^ -1023931660);
            case 248 -> IIll(-1960370702, var9 ^ 153759926);
            case 249 -> IIll(-1960370701, var9 ^ 544923921);
            case 250 -> IIll(-1960370692, var9 ^ -1760538010);
            case 251 -> IIll(-1960370691, var9 ^ 137704699);
            case 252 -> IIll(-1960370690, var9 ^ -780582652);
            case 253 -> IIll(-1960370689, var9 ^ 776182309);
            case 254 -> IIll(-1960370696, var9 ^ 598313944);
            default -> IIll(-1960370695, var9 ^ -173013589);
         };
         int var5 = (var1 & IIll(-1960370694, var9 ^ 130732932)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & IIll(-1960370693, var9 ^ -1688634705)) >>> IIll(-1960370716, var9 ^ 140995248)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & IIll(-1960370715, var9 ^ 1371640791);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & IIll(-1960370714, var9 ^ -652265538);
            }
         }

         IIII[var2] = new String(var3).intern();
      }

      return IIII[var2];
   }

   private static Throwable IIIl(Throwable var0) {
      return var0;
   }

   private static int IIll(int var0, int var1) {
      int var2 = IIIl[var0 ^ -1960370988] ^ var1 ^ var0;
      var2 ^= 9625;
      var2 ^= 29081;
      var2 -= 44079;
      var2 += 57873;
      var2 += 29446;
      var2 += 40147;
      var2 += 63216;
      var2 += 2677;
      return var2 ^ 28310;
   }

   @Override
   public void IIlIl() {
      this.IIl();
   }

   private boolean IIlI(GameProfile var1) {
      class_310 var2 = class_310.method_1551();
      return this.IIIIlIl()
         && var1 != null
         && var2.field_1724 != null
         && var2.field_1724.method_7334() != null
         && lIlIIIll.l(var2.field_1724.method_7334()) != null
         && lIlIIIll.l(var2.field_1724.method_7334()).equals(lIlIIIll.l(var1));
   }
}
