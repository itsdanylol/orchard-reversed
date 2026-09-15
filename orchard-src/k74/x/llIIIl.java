package k74.x;

import java.awt.Color;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1309;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_640;
import net.minecraft.class_742;
import net.minecraft.class_7532;

@Environment(EnvType.CLIENT)
public final class llIIIl extends IlIIIIIIl implements IIIIIlII {
   private static final IIIllIIl II;
   private double Il;
   private static final int[] llIl;
   private static final String[] lI;
   private final IllIII<lIIIlII> ll;
   private int III;
   private static final String[] IIl;
   private static final double IlI = 10.0;
   private static final double Ill = 0.05;
   private static final Object[] llll;
   private static final long lII = 250L;
   private IIlllIIII lIl;
   private final IllIII<l> llI;
   private final IIlIII lll;
   private double IIII;
   private final lllIIlII IIIl;
   private final IllIlI<Integer> IIlI;
   private final IIIlIIlll IIll;
   private int IlII;
   private static final String[] lllI;
   private static final double IlIl = 12.0;
   private final IIlIII IllI;
   private long Illl;
   private final IIIlIIII lIII;
   private final IlIIl lIIl;
   private final IIlIII lIlI;
   private static final float I = 10.0F;
   private long lIll;
   private final IllIII<lllllIl> llII;

   private String II(class_310 param1, class_1309 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc 216084099
      // 02: istore 7
      // 04: aload 0
      // 05: getfield k74/x/llIIIl.lIIl Lk74/x/IlIIl;
      // 08: ifnull 5c
      // 0b: aload 0
      // 0c: getfield k74/x/llIIIl.lIIl Lk74/x/IlIIl;
      // 0f: invokevirtual k74/x/IlIIl.lIII ()Lnet/minecraft/class_1309;
      // 12: aload 2
      // 13: if_acmpne 5c
      // 16: goto 1d
      // 19: invokestatic k74/x/llIIIl.IIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1c: athrow
      // 1d: aload 0
      // 1e: getfield k74/x/llIIIl.lIIl Lk74/x/IlIIl;
      // 21: invokevirtual k74/x/IlIIl.llI ()D
      // 24: invokestatic java/lang/Math.round (D)J
      // 27: ldc 148518468
      // 29: iload 7
      // 2b: ldc 439903412
      // 2d: ixor
      // 2e: invokestatic k74/x/llIIIl.l (II)I
      // 31: ldc 148518469
      // 33: iload 7
      // 35: ldc -1309672759
      // 37: ixor
      // 38: invokestatic k74/x/llIIIl.l (II)I
      // 3b: invokestatic k74/x/llIIIl.IlII (II)Ljava/lang/String;
      // 3e: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 41: astore 5
      // 43: lstore 3
      // 44: new java/lang/StringBuilder
      // 47: dup
      // 48: invokespecial java/lang/StringBuilder.<init> ()V
      // 4b: lload 3
      // 4c: invokevirtual java/lang/StringBuilder.append (J)Ljava/lang/StringBuilder;
      // 4f: aload 5
      // 51: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 54: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 57: areturn
      // 58: invokestatic k74/x/llIIIl.IIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 5b: athrow
      // 5c: aload 1
      // 5d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 60: ifnonnull 82
      // 63: ldc 148518470
      // 65: iload 7
      // 67: ldc 1856091354
      // 69: ixor
      // 6a: invokestatic k74/x/llIIIl.l (II)I
      // 6d: ldc 148518471
      // 6f: iload 7
      // 71: ldc 1533987697
      // 73: ixor
      // 74: invokestatic k74/x/llIIIl.l (II)I
      // 77: invokestatic k74/x/llIIIl.IlII (II)Ljava/lang/String;
      // 7a: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 7d: areturn
      // 7e: invokestatic k74/x/llIIIl.IIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 81: athrow
      // 82: aload 1
      // 83: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 86: aload 2
      // 87: invokevirtual net/minecraft/class_746.method_5739 (Lnet/minecraft/class_1297;)F
      // 8a: invokestatic java/lang/Math.round (F)I
      // 8d: ldc 148518464
      // 8f: iload 7
      // 91: ldc 1681463420
      // 93: ixor
      // 94: invokestatic k74/x/llIIIl.l (II)I
      // 97: ldc 148518465
      // 99: iload 7
      // 9b: ldc -1855293305
      // 9d: ixor
      // 9e: invokestatic k74/x/llIIIl.l (II)I
      // a1: invokestatic k74/x/llIIIl.IlII (II)Ljava/lang/String;
      // a4: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // a7: astore 6
      // a9: istore 5
      // ab: new java/lang/StringBuilder
      // ae: dup
      // af: invokespecial java/lang/StringBuilder.<init> ()V
      // b2: iload 5
      // b4: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // b7: aload 6
      // b9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // bc: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // bf: areturn
   }

   private static String IllII(short var0, char var1, int var2) {
      int var3 = var1 ^ 12620;
      char[] var4 = lllI[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])llll[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         llll[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 14106;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ '\uf868';
         var10 += 23955;
         var10 ^= 42169;
         var10 ^= 48824;
         var10 ^= 54694;
         var10 += 3510;
         var10 ^= 64646;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private double Il(long var1) {
      try {
         if (this.Illl <= 0L) {
            this.Illl = var1;
            return 0.0;
         }
      } catch (MatchException var5) {
         throw IIl(var5);
      }

      long var3 = Math.max(0L, var1 - this.Illl);
      this.Illl = var1;
      return Math.min(0.05, var3 / 1000.0);
   }

   private void lI() {
      this.III = l(148518466, -1812970905 ^ 1860646858);
      this.IIII = 0.0;
      this.Il = 0.0;
      this.Illl = 0L;
   }

   @Override
   public double ll() {
      return this.IllI.IllI();
   }

   private boolean III(class_1309 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/llIIIl.lIl Lk74/x/IIlllIIII;
      // 04: ifnull 42
      // 07: aload 1
      // 08: ifnull 42
      // 0b: goto 12
      // 0e: invokestatic k74/x/llIIIl.IIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: aload 0
      // 13: getfield k74/x/llIIIl.IlII I
      // 16: aload 1
      // 17: invokevirtual net/minecraft/class_1309.method_5628 ()I
      // 1a: if_icmpne 42
      // 1d: goto 24
      // 20: invokestatic k74/x/llIIIl.IIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 23: athrow
      // 24: invokestatic java/lang/System.currentTimeMillis ()J
      // 27: aload 0
      // 28: getfield k74/x/llIIIl.lIll J
      // 2b: lsub
      // 2c: ldc2_w 250
      // 2f: lcmp
      // 30: ifgt 42
      // 33: goto 3a
      // 36: invokestatic k74/x/llIIIl.IIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 39: athrow
      // 3a: bipush 1
      // 3b: goto 43
      // 3e: invokestatic k74/x/llIIIl.IIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 41: athrow
      // 42: bipush 0
      // 43: ireturn
   }

   private static MatchException IIl(MatchException var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var24 = 1663948418;
      char[] var15 = "磂硈".toCharArray();
      short var13 = 30817;
      byte var20 = -1;
      String var14 = "\ude16\udd5c\udd52\udd4d\udd08\udd82\udd33\udd6b\ude74\ude71\udd85\udd66\uddee\udd49\uddfb\ude36\udebb\udd91\udcae\udd6d\udd71\udd71\udda9\uddfd\udcfe\ude17\udd65\udd6b\ude72\udd8e\uddf6\uddac\udde1\ude09\ude5b\uddff\udd43\udd89\ude7b\udd9b\uddfc\udecf\udd34\udd98\udd1f\udd24\uddfb\uddb6\udd4a\udd05\ude7e\udd7f\ude1a\udd38\udd61\udd52\udd77\udd5f\uddd4\ude5b\uddf6\udc00\ude4f\udd80\uddaa\udde0\uddd5\udd76\udd9f\udd83\uddf3\udc13\udded\ude7f\udd83\udd83\uddd1\udda7\udda5\udd83\ude66\udd71\udd3f\uddc3\udd83\udde8\udde5\udd59\uddf2\ude57\udd5d\udd67\udd29\uddde\udd0c\udd82\udd26\uddfe\uddd3\udd14\udca5\ude99\udd59\uddd3\uddbb\uddea\ude99\uddb2\ude03\uddfd\udd29\uddda\uddfb\uddd2\udcfe\udde8\udd5a\udd7f\udd8a\ude2e\udd01\udc0c\udd76\udddb\udd41\ude64\udec4\uddfe\udcaf\udd83\udde1\udd5e\uddc6\udd3a\udd83\uddc1\udd26\ude4e\uddd6\udd83\udd0a\udd37\udd23\uddf8\udd83\udd05\udd64\uddfe\udda9\udd83\uddc3\uddda\ude65\ude0a\ude57\uddd4\uddfd\udd51\uddc5\ude7a\uddb2\udd6d\udda8ᛁᔍᚋᚏᘁ\u1716ᚆᛨᘻᚙᚻᙧᙜᙢᛘᛰᛳᝌᘐ\u16f9ᘧᚭᘇᚑᚔᘭវ\u177cᜃ\u175bᛞᙛᚤᜥᜮᛳᙆᚯᛝᚸᚕ";
      String[] var16 = new String[var15.length];

      while (true) {
         int var17 = 0;
         int var18 = 0;
         int var19 = 0;
         if (var20 == 0) {
            lllI = var16;
            llll = new Object[var16.length];
            int var9 = -524466342;
            byte[] var7 = "þ¿\u008cÛUkö©\u008a&\\®¿ê®;\u0080¾ð\buíà\u0019\u0095q½¸\u009c\u0091b\u008c\u0090\u0003ùÏºN\u0003Ræ¢\u0001 `÷\u0096øH\u009f<\u0098àTRÖ×\u0086u¤lÂ\u0005Öfu´Þ\u001d\u008d¦½!\u0090\u0084ê\u009e^|æ#\u0097Ò¶.\u0011\fh(P77îê[\u008f·»§Õ$\u0013c\u001d\u000bí^©`D\u0002ø\\¤!\u008di¢ò\u0017ìá\u0083\u0019÷u]<nÝà~\u00ad)$Èü\u009fk¾ýn\u001fcý\u0096}\u008b7+\u0094Oö©¨\u0095°¸y\bwÿ\u0003\u0018Ü\u0080\u0094\u008e\u0086\u009c;ëw\u0090ÊaÆÚ.Úá\u0085f\u0013ù\u0001Þ\u0091B\u00847*zµ¬[?\u001c\u0099§Cþ¸\u00866q¾[\u001c2\u001f\u008a÷a¢ÚâÏ=3¾¶Æô@`\u0016¥³;\u0089;¢¢^ÿåÑíó\u0086\u008c!qÚ\\8\"í[à,8U\u008eð\u0082+ÌF\u009bò©u\u0019]TÎºn¶WÕá\u0083V¸åFv¯z33=ÿ±\u0001\b¬³¦£2.g\u000fâ)#e\u0001\u0014\u001f\u009b¯H>Ï\u0088\u0016\u0019ÅV¸®¿\u0088®\u0012ÓÝ3øÈ\u0090n%°üî<:ÑHÓ\u0019\u0092\u0014\u001a1Ïã²¼\u0082û\u0094s\u001bÖç²W\u0086\u0012\u008bäå.¸Ð\u0096ÈãL\u0081B<\u0015\u0004w\u00adù«\u008bó\u009f(>\u001c\u0013æ\u008d\rÆ`û(B¡!¢}çÊc\u0012Á\u0086õd3û²\u0080\u0001Ðo\u008f%=·â:ù\u008cH§¬&\";»)\u0093\u0007=1\u0087\\¯S\u007f\u008b'ã#è|Eð±9SV\u0084¶\u0089\u009a$ÒÎ\u0013¼\u0088'\u0004~\u0095?\f\u008eñ\u008aF\u001fç\u0010GÑ@\u008d\u0089Aï\u0002\\\u0091h]µVù) t\u0092j}ûk\u0083ý\u0089ºîè¯Í\u000fÃy;q\u0088\u000b(@¾Ã\u001d¢~*zUq;.\räx×Êg`\u0017\tbÃn\u0094%bô\u0015æR\u0090³\u0089p.g\u008f4µGr!Â\\J(\u0094\u0092ðÑ\u0019ÕM|Z\u0083µ-H°(\u0017}7Ì¼B²&0\u0085C\u000e¢_k\u001e»»i\u001cjç?\u0099~vû¥\u008cu9õ\u00adêÚ½¢a\u008f\u008c*O«\u0096¡0\u000emùRÂw\u0083è\u0012È\u0013÷G®ß®0\u0090cáy\u0006',§\u0090³\u0092Û\u008fo·ï)\u001d\u0004AHÒ\u0010\t«\u001e0]\u001bÕN2\u00816Á\u0094ôèÛ>4ksãwâÝ-\u008cr\u001d\næåð\u007f¯ S\u0011Ó#£\u0007×z9Ì{§½$\u0004«0`Vå×ö9V\u0003s\u0010ëm\u0091¨¡&æ\u009f\"\u0013v\u0016\u0086m1D\u0083\u0090v^\u001fgªÅ\u0092AØ\u009d\f =¤÷ÊÒõY\u008e\u0085\u0005Ü:|T[Î#\u0095'çTyGM\u009féþt_K>b\u0007\u0087\u0092\u0092¢[û}g6u\u0080à:Ù\u0094ðnX\u0087¦ýfD\u0013\u0012¤G\u000föVBoê÷óW¶\u0006\fÌÉ\u0087\u001b¹\u0081m\u0017Ye½&=Æ¯a\u001bAÕ)\u0089\u0087\u0080ã:°17ÏÏ_Á\t¯ÎÉKo\u009bLã7\u0083¥ì:\u0010\u001c<¥*Ì:d\u0092ó´§éÙE\u000e¬(\u0011;´Á|\u001c\u008eÙáÍ^XGí«îZÊ\u0085µ\u0089\u000b'\u0012<Ç\u008d\u0002vê\u0094£CeêæVèG\u008fg\u0098-röã©»\u0081o\\\u0087@N\u0001I\u0001Oð¹-¯,ß=Zë\u009dyM\u0016°\u0018\u001fçD¹\n\u0000¬\\ãä\u0005`\u0085\u001d9ìó²\u0084'\u0010ÿ Eñ)Fm\u0001(n£%^^[ð\u001bR\u0015W\u0093\u0014\u0010\u0088\u009d^ûÈÆQ³\"\u009a\u000e\nÁGÀ?G\u009fa\u0091&iºÛa-æ-M\u0090\u0005ð\u0018\u000bT.ö\u008cv\u001e\u00ad8·þ\u00adDj\fó\u0003!\u000b6Î\u001c\u0082:\u0019\u0099(0¶OÍê=K\u000eØ÷VhÝm\u0013Ê\u0099õb°Ò\u0019`\u0081Ä\u009e;»O=t\u0086éva\u0093ª\u009cªÐzxÇ8§ ®\t;Å´Ù\u0080\u0015\u0088â&/ß©d\u0082Ô]óci-±&|\\_\u009f\u0014\u001cÑ¨Æ}³\u0089Ëh×³ý\u0081\u0082#k»\u008di3].×D\u001b\u009fö\u0090l\u009a!?z\u001f¿\u008eúàJ¬û\u0081þ\u0012\u0089\u009d\u001e\b±Þq\u0085\u0014Ì\u0097ÆÓÁS\u0093pKæÝèæó\u0003-d\u0012Ï\u008fÀÔc\\àÂü3äï¸Än\u0002\u008e\u0091\t¾cÀIÉ\u0088MA\u0089\u008d®rËu\u0019«æ\u0084)\u0099Ü\u0084\u0007páñ:\u007f¡\u0002\u001d\u0011M\u008a\u00004¬îvkLh\"ô·\u008eU(pÜ+q\u001a\u0004\u0006\byü|ÜkË%.YæÜl¡DÞIq²(e¤d[qP-ã\\òèk>\u0088=\u0010\u0015Ã²´!\u0011#K@¥\u0085ÜQv\u0091å¡ÕÄïÍÕJsT\u0013\u001d8\u0000ü\u009c&èÖ9¢(?\u0083oÆ3Ló\u008cc \u0005}wn¥±hÛ"
               .getBytes("ISO-8859-1");
            int var8 = var7.length / 4;
            llIl = new int[var8];
            byte var10 = 0;
            int var11 = 0;

            do {
               int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
               var12 ^= var9;
               llIl[var11] = var12;
               var10 += 4;
            } while (++var11 < var8);

            String[] var5 = new String[l(148518782, var24 ^ -1772465653)];
            int var3 = 0;
            String var2;
            int var4 = (var2 = IllII((short)8830, 'ㅌ', var24 ^ 872517303)).length();
            int var1 = l(148518783, var24 ^ -1954565292);
            int var26 = -1;

            label98:
            while (true) {
               int var29 = l(148518776, var24 ^ -48213160);
               String var10001 = var2.substring(++var26, var26 + var1);
               byte var10002 = -1;

               while (true) {
                  label93: {
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
                           break label93;
                        }

                        var57 = var45;
                        var10004 = var29;
                        var10006 = var6;
                     }

                     while (true) {
                        var57[var10006] = (char)(var57[var10006] ^ var10004 ^ switch (var6 % l(148518779, var24 ^ -1606810177)) {
                           case 0 -> l(148518660, var24 ^ -1924962650);
                           case 1 -> l(148518661, var24 ^ -141069210);
                           case 2 -> l(148518662, var24 ^ -1369094571);
                           case 3 -> l(148518663, var24 ^ 1462222501);
                           case 4 -> l(148518656, var24 ^ 1426222704);
                           case 5 -> l(148518657, var24 ^ -1557218319);
                           default -> l(148518658, var24 ^ -801484849);
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
                           IIl = var5;
                           lI = new String[l(148518778, var24 ^ -563908775)];
                           II = IIIllIIl.IlI;
                           return;
                        }

                        var1 = var2.charAt(var26);
                        break;
                     default:
                        var5[var3++] = var50;
                        if ((var26 += var1) < var4) {
                           var1 = var2.charAt(var26);
                           continue label98;
                        }

                        var4 = (var2 = IllII((short)11369, 'ㅍ', var24 ^ -239804882)).length();
                        var1 = 4;
                        var26 = -1;
                  }

                  var29 = l(148518777, var24 ^ -1447057307);
                  var10001 = var2.substring(++var26, var26 + var1);
                  var10002 = 0;
               }
            }
         }

         do {
            var19 = var15[var17] ^ var13;
            char[] var21 = var14.substring(var18, var18 + var19).toCharArray();
            int var22 = 0;

            do {
               short var23 = switch (var22 % 5) {
                  default -> 57;
                  case 1 -> 149;
                  case 2 -> 76;
                  case 3 -> 41;
                  case 4 -> 121;
               };
               var21[var22] = (char)(var21[var22] ^ var23);
            } while (++var22 < var21.length);

            var16[var17] = new String(var21).intern();
            var18 += var19;
         } while (++var17 < var15.length);

         var20 = 0;
      }
   }

   @Override
   public void IlI(lIIlIl param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aconst_null
      // 02: putfield k74/x/llIIIl.lIl Lk74/x/IIlllIIII;
      // 05: aload 0
      // 06: invokevirtual k74/x/llIIIl.IIIIlIl ()Z
      // 09: ifeq 31
      // 0c: aload 0
      // 0d: getfield k74/x/llIIIl.IIIl Lk74/x/lllIIlII;
      // 10: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 13: checkcast java/lang/Boolean
      // 16: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 19: ifeq 31
      // 1c: goto 23
      // 1f: invokestatic k74/x/llIIIl.IIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 22: athrow
      // 23: aload 1
      // 24: invokestatic k74/x/IlIII.IIIIII (Ljava/lang/Object;)Z
      // 27: ifne 36
      // 2a: goto 31
      // 2d: invokestatic k74/x/llIIIl.IIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 30: athrow
      // 31: return
      // 32: invokestatic k74/x/llIIIl.IIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 35: athrow
      // 36: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 39: astore 2
      // 3a: aload 0
      // 3b: aload 2
      // 3c: invokevirtual k74/x/llIIIl.IllI (Lnet/minecraft/class_310;)Lnet/minecraft/class_1309;
      // 3f: astore 3
      // 40: aload 2
      // 41: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 44: ifnull 52
      // 47: aload 3
      // 48: ifnonnull 72
      // 4b: goto 52
      // 4e: invokestatic k74/x/llIIIl.IIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 51: athrow
      // 52: aload 0
      // 53: aconst_null
      // 54: putfield k74/x/llIIIl.lIl Lk74/x/IIlllIIII;
      // 57: aload 0
      // 58: ldc_w 148518467
      // 5b: ldc_w 564462450
      // 5e: ldc_w -716002838
      // 61: ixor
      // 62: invokestatic k74/x/llIIIl.l (II)I
      // 65: putfield k74/x/llIIIl.IlII I
      // 68: aload 0
      // 69: lconst_0
      // 6a: putfield k74/x/llIIIl.lIll J
      // 6d: return
      // 6e: invokestatic k74/x/llIIIl.IIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 71: athrow
      // 72: aload 2
      // 73: invokestatic k74/x/IIll.IlIIlI (Lnet/minecraft/class_310;)F
      // 76: fstore 4
      // 78: aload 0
      // 79: aload 1
      // 7a: aload 2
      // 7b: aload 3
      // 7c: fload 4
      // 7e: invokevirtual k74/x/llIIIl.IIlll (Lk74/x/lIIlIl;Lnet/minecraft/class_310;Lnet/minecraft/class_1309;F)Lk74/x/IIlllIIII;
      // 81: astore 5
      // 83: aload 0
      // 84: aload 5
      // 86: putfield k74/x/llIIIl.lIl Lk74/x/IIlllIIII;
      // 89: aload 0
      // 8a: aload 5
      // 8c: ifnull 99
      // 8f: invokestatic java/lang/System.currentTimeMillis ()J
      // 92: goto 9a
      // 95: invokestatic k74/x/llIIIl.IIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 98: athrow
      // 99: lconst_0
      // 9a: putfield k74/x/llIIIl.lIll J
      // 9d: return
   }

   private double Ill(double param1, double param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: dload 1
      // 01: invokestatic java/lang/Double.isFinite (D)Z
      // 04: ifeq 22
      // 07: dload 3
      // 08: invokestatic java/lang/Double.isFinite (D)Z
      // 0b: ifeq 22
      // 0e: goto 15
      // 11: invokestatic k74/x/llIIIl.IIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 14: athrow
      // 15: dload 3
      // 16: dconst_0
      // 17: dcmpg
      // 18: ifgt 28
      // 1b: goto 22
      // 1e: invokestatic k74/x/llIIIl.IIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 21: athrow
      // 22: dload 1
      // 23: dreturn
      // 24: invokestatic k74/x/llIIIl.IIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 27: athrow
      // 28: dload 1
      // 29: dload 3
      // 2a: dmul
      // 2b: invokestatic java/lang/Math.round (D)J
      // 2e: l2d
      // 2f: dload 3
      // 30: ddiv
      // 31: dreturn
   }

   private boolean lII() {
      try {
         if (this.llI.IllI() == k74.x.l.l) {
            return true;
         }
      } catch (MatchException var1) {
         throw IIl(var1);
      }

      return false;
   }

   public llIIIl(IlIIl var1, IIIlIIII var2) {
      int var3 = -1481953317;
      super(
         IlIIllIII.Ill(IlII(l(148518476, var3 ^ -540143369), l(148518477, var3 ^ -175930908))),
         lllIIlIl.II,
         IlIIllIII.Ill(IlII(l(148518478, var3 ^ -1452284064), l(148518479, var3 ^ 792328830)))
      );
      this.llII = this.IllIIll(new IllIII<>(IlIIllIII.Ill(IlII(l(148518472, var3 ^ 122869154), l(148518473, var3 ^ -1348866036))), lllllIl.class, lllllIl.l));
      this.IIIl = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IlII(l(148518474, var3 ^ -1739875173), l(148518475, var3 ^ 588017838))), false));
      this.ll = this.IllIIll(new IllIII<>(IlIIllIII.Ill(IlII(l(148518484, var3 ^ 699948540), l(148518485, var3 ^ 1379951901))), lIIIlII.class, lIIIlII.lI));
      this.llI = this.IllIIll(new IllIII<>(IlIIllIII.Ill(IlII(l(148518486, var3 ^ 1851616706), l(148518487, var3 ^ -778838710))), l.class, k74.x.l.II));
      this.IIll = this.IllIIll(new IIIlIIlll(IlIIllIII.Ill(IlII(l(148518480, var3 ^ 1817850978), l(148518481, var3 ^ 1641833660))), Color.WHITE));
      this.lll = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(IlII(l(148518482, var3 ^ 1738399240), l(148518483, var3 ^ -1591470674))), 300.0, 0.0, 4000.0, 1.0)
            .IIIl(IlIIllIII.Ill(IlII(l(148518492, var3 ^ -126467816), l(148518493, var3 ^ 1809661532))))
      );
      this.IllI = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(IlII(l(148518494, var3 ^ 1142994844), l(148518495, var3 ^ 797592663))), 300.0, 0.0, 4000.0, 1.0)
            .IIIl(IlIIllIII.Ill(IlII(l(148518488, var3 ^ 325699773), l(148518489, var3 ^ 644814980))))
      );
      this.lIlI = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(IlII(l(148518490, var3 ^ -1557370316), l(148518491, var3 ^ -1195670125))), 100.0, 60.0, 200.0, 5.0)
            .IIIl(IlIIllIII.Ill(IlII(l(148518500, var3 ^ 554699107), l(148518501, var3 ^ -488158260))))
      );
      this.IIlI = new IllIlI<>();
      this.IlII = l(148518502, var3 ^ 861047892);
      this.III = l(148518503, var3 ^ 849606792);
      this.lIIl = var1;
      this.lIII = var2;
      this.ll.lIlI(this.IIIl::IllI);
      this.IIll.lIlI(this::lII);
   }

   private void lIl(class_332 var1, class_310 var2, class_1309 var3, llllI var4, double var5, boolean var7) {
      int var23 = -1980890649;
      Color var8 = this.IIlI();
      Color var9 = this.IIlII();
      double var10 = var4.I();
      double var12 = var4.l();
      double var14 = 46.0;
      double var16 = var10 - var14 - 9.0;
      long var10000 = Math.round(var5 * 100.0);
      String var10001 = IlIIllIII.lI(IlII(l(148518496, var23 ^ -1675707720), l(148518497, var23 ^ 1453545449)));
      String var22 = this.II(var2, var3);
      String var21 = var10001;
      long var19 = var10000;
      String var18 = var19 + var21 + var22;
      IIIlIllII.llI(var1, II, 0.0, 0.0, var10, var12, var7);
      IIIlIllII.I(var1, 6.0, 6.0, 34.0, 34.0, 5.0);
      this.lIII(var1, var3, l(148518498, var23 ^ -1759420078), l(148518499, var23 ^ -785338162), l(148518508, var23 ^ 376949476));
      IlIIlllIl.IIll(var1, var2.field_1772, var3.method_5477().getString(), var14, 6.0, IIIlIllII.lII(l(148518509, var23 ^ -1123525042)));
      IlIIlllIl.IIll(var1, var2.field_1772, var18, var14, 18.0, IIIlIllII.IIII(l(148518510, var23 ^ -418057491)));
      IlIIlllIl.llIl(var1, var14, 34.0, var16, 5.0, 2.5, IIIlllII.l(0, l(148518511, var23 ^ 370672598)));
      IlIIlllIl.lllIII(var1, var14, 34.0, var16 * this.IIII, 5.0, 2.5, var8.getRGB(), var9.getRGB());
   }

   private void llI(class_332 var1, class_310 var2, class_1309 var3, llllI var4, double var5, boolean var7) {
      int var22 = 274472894;
      Color var8 = this.IIlI();
      Color var9 = this.IIlII();
      double var10 = var4.I();
      double var12 = var4.l();
      double var14 = 42.0;
      double var16 = var10 - var14 - 7.0;
      long var10000 = Math.round(var5 * 100.0);
      String var21 = IlIIllIII.lI(IlII(l(148518504, var22 ^ 1054931026), l(148518505, var22 ^ 431770080)));
      long var19 = var10000;
      String var18 = var19 + var21;
      IIIlIllII.llI(var1, II, 0.0, 0.0, var10, var12, var7);
      IIIlIllII.I(var1, 4.0, 4.0, 32.0, 32.0, 4.0);
      this.lIII(var1, var3, 5, 5, l(148518506, var22 ^ 20646192));
      IlIIlllIl.IIll(var1, var2.field_1772, var3.method_5477().getString(), var14, 5.0, IIIlIllII.lII(l(148518507, var22 ^ -1161894987)));
      IlIIlllIl.llIl(var1, var14, 20.0, var16, 5.0, 2.5, IIIlllII.l(0, l(148518516, var22 ^ -2104525906)));
      IlIIlllIl.lllIII(var1, var14, 20.0, var16 * this.IIII, 5.0, 2.5, var8.getRGB(), var9.getRGB());
      IlIIlllIl.IIll(var1, var2.field_1772, var18, var14, 29.0, IIIlIllII.IIII(l(148518517, var22 ^ -953790739)));
      IlIIlllIl.IlI(var1, var2.field_1772, this.II(var2, var3), var10 - 7.0, 29.0, IIIlIllII.IIII(l(148518518, var22 ^ -1144754213)));
   }

   @Override
   public double lll() {
      return this.lll.IllI();
   }

   private double IIII(double var1) {
      try {
         if (this.lIl == null) {
            return this.ll();
         }
      } catch (MatchException var8) {
         throw IIl(var8);
      }

      double var3 = var1 * this.IIIll();
      double var5 = 8.0;

      try {
         switch ((lIIIlII)this.ll.IllI()) {
            case I:
            case Il:
            case lI:
               return this.lIl.I() + (this.lIl.Il() - var3) * 0.5;
            case II:
               return this.lIl.I() - var3 - var5;
            default:
               throw new MatchException(null, null);
         }
      } catch (MatchException var7) {
         throw IIl(var7);
      }
   }

   @Override
   public double IIIl() {
      return this.lIIl(this.IIIIl(class_310.method_1551())).l() * this.IIIll();
   }

   private Color IIlI() {
      try {
         if (this.llI.IllI() == k74.x.l.l) {
            return this.IIll.IllI();
         }
      } catch (MatchException var1) {
         throw IIl(var1);
      }

      return IIIlIllII.l();
   }

   private void IIll(class_1309 var1, double var2, double var4, double var6) {
      try {
         if (var1 == null) {
            this.III = l(148518519, -1319188934 ^ -280383423);
            this.IIII = 0.0;
            this.Il = 0.0;
            return;
         }
      } catch (MatchException var8) {
         throw IIl(var8);
      }

      try {
         if (this.III != var1.method_5628()) {
            this.III = var1.method_5628();
            this.IIII = var2;
            this.Il = var4;
            return;
         }
      } catch (MatchException var9) {
         throw IIl(var9);
      }

      this.IIII = this.IIIlI(this.IIII, var2, 10.0, var6);
      this.Il = this.IIIlI(this.Il, var4, 12.0, var6);
   }

   private static String IlII(int var0, int var1) {
      int var9 = 286764822;
      int var2 = (var0 ^ l(148518512, var9 ^ -448563646)) & l(148518513, var9 ^ 236176887);
      if (lI[var2] == null) {
         char[] var3 = IIl[var2].toCharArray();

         int var4 = switch (var3[0] & l(148518514, var9 ^ 465459485)) {
            case 0 -> l(148518515, var9 ^ 1204265261);
            case 1 -> l(148518524, var9 ^ -1190039231);
            case 2 -> l(148518525, var9 ^ 1246424633);
            case 3 -> l(148518526, var9 ^ 1540569433);
            case 4 -> l(148518527, var9 ^ 480283247);
            case 5 -> l(148518520, var9 ^ 2147305172);
            case 6 -> l(148518521, var9 ^ 590176014);
            case 7 -> l(148518522, var9 ^ 338331599);
            case 8 -> l(148518523, var9 ^ -1054545599);
            case 9 -> l(148518404, var9 ^ 2069539637);
            case 10 -> l(148518405, var9 ^ 1652805290);
            case 11 -> 3;
            case 12 -> l(148518406, var9 ^ -533974096);
            case 13 -> l(148518407, var9 ^ 1126158737);
            case 14 -> l(148518400, var9 ^ 747693171);
            case 15 -> l(148518401, var9 ^ 1100226826);
            case 16 -> l(148518402, var9 ^ 1443583151);
            case 17 -> l(148518403, var9 ^ -997271949);
            case 18 -> l(148518412, var9 ^ -237120351);
            case 19 -> l(148518413, var9 ^ 1514359095);
            case 20 -> l(148518414, var9 ^ -158118228);
            case 21 -> l(148518415, var9 ^ -1670351900);
            case 22 -> l(148518408, var9 ^ 1658728377);
            case 23 -> l(148518409, var9 ^ 922317213);
            case 24 -> l(148518410, var9 ^ 1009246082);
            case 25 -> l(148518411, var9 ^ 1190775084);
            case 26 -> l(148518420, var9 ^ 715936870);
            case 27 -> l(148518421, var9 ^ 836831576);
            case 28 -> l(148518422, var9 ^ 1234012466);
            case 29 -> l(148518423, var9 ^ -1012912170);
            case 30 -> l(148518416, var9 ^ -521964684);
            case 31 -> l(148518417, var9 ^ -927038417);
            case 32 -> l(148518418, var9 ^ 1173593304);
            case 33 -> l(148518419, var9 ^ -1972719198);
            case 34 -> l(148518428, var9 ^ 1260839490);
            case 35 -> l(148518429, var9 ^ 1922400957);
            case 36 -> l(148518430, var9 ^ 1101132039);
            case 37 -> 2;
            case 38 -> l(148518431, var9 ^ 440264231);
            case 39 -> l(148518424, var9 ^ -983276638);
            case 40 -> l(148518425, var9 ^ 1418251424);
            case 41 -> l(148518426, var9 ^ 183390104);
            case 42 -> l(148518427, var9 ^ -446529142);
            case 43 -> l(148518436, var9 ^ -189331686);
            case 44 -> l(148518437, var9 ^ -785135881);
            case 45 -> l(148518438, var9 ^ 1527545992);
            case 46 -> l(148518439, var9 ^ -1704745269);
            case 47 -> l(148518432, var9 ^ 202724478);
            case 48 -> l(148518433, var9 ^ 1274111576);
            case 49 -> l(148518434, var9 ^ -1761721838);
            case 50 -> l(148518435, var9 ^ 1318280518);
            case 51 -> l(148518444, var9 ^ 1966719040);
            case 52 -> l(148518445, var9 ^ -548184862);
            case 53 -> l(148518446, var9 ^ -790470482);
            case 54 -> l(148518447, var9 ^ -923386897);
            case 55 -> l(148518440, var9 ^ -1441862648);
            case 56 -> l(148518441, var9 ^ 441618277);
            case 57 -> l(148518442, var9 ^ -1132341717);
            case 58 -> l(148518443, var9 ^ -1440226452);
            case 59 -> l(148518452, var9 ^ 1894466553);
            case 60 -> l(148518453, var9 ^ 929225474);
            case 61 -> l(148518454, var9 ^ -562751124);
            case 62 -> l(148518455, var9 ^ -964826631);
            case 63 -> l(148518448, var9 ^ 1933015201);
            case 64 -> l(148518449, var9 ^ -382290214);
            case 65 -> l(148518450, var9 ^ 1962419811);
            case 66 -> l(148518451, var9 ^ -80873847);
            case 67 -> l(148518460, var9 ^ -1530645876);
            case 68 -> l(148518461, var9 ^ -799992953);
            case 69 -> l(148518462, var9 ^ -1827890072);
            case 70 -> l(148518463, var9 ^ 2056056338);
            case 71 -> l(148518456, var9 ^ 395954423);
            case 72 -> l(148518457, var9 ^ -156098823);
            case 73 -> l(148518458, var9 ^ -1996919710);
            case 74 -> l(148518459, var9 ^ -1177574283);
            case 75 -> l(148518596, var9 ^ 1527729527);
            case 76 -> l(148518597, var9 ^ -1409262504);
            case 77 -> l(148518598, var9 ^ -191553593);
            case 78 -> l(148518599, var9 ^ 857081795);
            case 79 -> l(148518592, var9 ^ -267148244);
            case 80 -> l(148518593, var9 ^ 1834223009);
            case 81 -> l(148518594, var9 ^ -325634696);
            case 82 -> l(148518595, var9 ^ 1257772958);
            case 83 -> l(148518604, var9 ^ -1627499624);
            case 84 -> l(148518605, var9 ^ -1107081728);
            case 85 -> l(148518606, var9 ^ -1522839581);
            case 86 -> l(148518607, var9 ^ 1803662931);
            case 87 -> l(148518600, var9 ^ 742136597);
            case 88 -> l(148518601, var9 ^ 2059684445);
            case 89 -> l(148518602, var9 ^ 1230598161);
            case 90 -> l(148518603, var9 ^ -826418376);
            case 91 -> l(148518612, var9 ^ 1264015173);
            case 92 -> l(148518613, var9 ^ -1166031439);
            case 93 -> l(148518614, var9 ^ -1838162892);
            case 94 -> l(148518615, var9 ^ -1871901248);
            case 95 -> l(148518608, var9 ^ -957867688);
            case 96 -> l(148518609, var9 ^ 47508398);
            case 97 -> l(148518610, var9 ^ -1065039129);
            case 98 -> l(148518611, var9 ^ 600622393);
            case 99 -> l(148518620, var9 ^ 1996311988);
            case 100 -> l(148518621, var9 ^ 1390921435);
            case 101 -> l(148518622, var9 ^ -149119350);
            case 102 -> l(148518623, var9 ^ 990307353);
            case 103 -> l(148518616, var9 ^ -340167624);
            case 104 -> l(148518617, var9 ^ -1092634491);
            case 105 -> l(148518618, var9 ^ -908000211);
            case 106 -> l(148518619, var9 ^ -2139668420);
            case 107 -> l(148518628, var9 ^ 1591858997);
            case 108 -> l(148518629, var9 ^ 587074333);
            case 109 -> l(148518630, var9 ^ 374897281);
            case 110 -> l(148518631, var9 ^ -1204177650);
            case 111 -> l(148518624, var9 ^ -254117512);
            case 112 -> l(148518625, var9 ^ -1536511234);
            case 113 -> l(148518626, var9 ^ -873443043);
            case 114 -> l(148518627, var9 ^ 1837469614);
            case 115 -> l(148518636, var9 ^ -951776193);
            case 116 -> l(148518637, var9 ^ 436634909);
            case 117 -> 1;
            case 118 -> l(148518638, var9 ^ -721611427);
            case 119 -> l(148518639, var9 ^ -208174566);
            case 120 -> l(148518632, var9 ^ -2032220281);
            case 121 -> l(148518633, var9 ^ -392018715);
            case 122 -> l(148518634, var9 ^ -22667968);
            case 123 -> l(148518635, var9 ^ 889897170);
            case 124 -> l(148518644, var9 ^ -579482407);
            case 125 -> l(148518645, var9 ^ -1725464042);
            case 126 -> l(148518646, var9 ^ 256389420);
            case 127 -> l(148518647, var9 ^ -1973318601);
            case 128 -> l(148518640, var9 ^ 1759102346);
            case 129 -> l(148518641, var9 ^ 535709059);
            case 130 -> l(148518642, var9 ^ -1889017483);
            case 131 -> l(148518643, var9 ^ -935991512);
            case 132 -> l(148518652, var9 ^ -1892714300);
            case 133 -> l(148518653, var9 ^ 1404368157);
            case 134 -> l(148518654, var9 ^ 569142092);
            case 135 -> l(148518655, var9 ^ -992636699);
            case 136 -> l(148518648, var9 ^ 730087065);
            case 137 -> l(148518649, var9 ^ 2088024921);
            case 138 -> l(148518650, var9 ^ -2061157187);
            case 139 -> l(148518651, var9 ^ -622575382);
            case 140 -> l(148518532, var9 ^ -1391976375);
            case 141 -> l(148518533, var9 ^ 1721276722);
            case 142 -> l(148518534, var9 ^ -1506125386);
            case 143 -> l(148518535, var9 ^ -17369674);
            case 144 -> l(148518528, var9 ^ 1529520053);
            case 145 -> l(148518529, var9 ^ -1639509467);
            case 146 -> l(148518530, var9 ^ 424394440);
            case 147 -> l(148518531, var9 ^ 153042837);
            case 148 -> l(148518540, var9 ^ 1603010972);
            case 149 -> l(148518541, var9 ^ -362560536);
            case 150 -> l(148518542, var9 ^ -158912017);
            case 151 -> l(148518543, var9 ^ -1768189813);
            case 152 -> l(148518536, var9 ^ -1362665096);
            case 153 -> l(148518537, var9 ^ 901308423);
            case 154 -> l(148518538, var9 ^ 1089473279);
            case 155 -> l(148518539, var9 ^ -1609246185);
            case 156 -> l(148518548, var9 ^ -994588427);
            case 157 -> l(148518549, var9 ^ -500125097);
            case 158 -> l(148518550, var9 ^ 1895229418);
            case 159 -> l(148518551, var9 ^ -1010739513);
            case 160 -> l(148518544, var9 ^ 918436031);
            case 161 -> l(148518545, var9 ^ -253843109);
            case 162 -> l(148518546, var9 ^ -1306592048);
            case 163 -> l(148518547, var9 ^ 440853562);
            case 164 -> l(148518556, var9 ^ 357267336);
            case 165 -> l(148518557, var9 ^ -975942326);
            case 166 -> l(148518558, var9 ^ -1021971057);
            case 167 -> l(148518559, var9 ^ 1305906816);
            case 168 -> l(148518552, var9 ^ -1132475630);
            case 169 -> l(148518553, var9 ^ -397749453);
            case 170 -> l(148518554, var9 ^ -2056394438);
            case 171 -> l(148518555, var9 ^ 414988568);
            case 172 -> l(148518564, var9 ^ -1097020233);
            case 173 -> l(148518565, var9 ^ -1547967755);
            case 174 -> l(148518566, var9 ^ 1887060004);
            case 175 -> l(148518567, var9 ^ -977868193);
            case 176 -> l(148518560, var9 ^ -1885604913);
            case 177 -> l(148518561, var9 ^ -1173058057);
            case 178 -> l(148518562, var9 ^ -1348919174);
            case 179 -> l(148518563, var9 ^ -1628878133);
            case 180 -> l(148518572, var9 ^ 261279473);
            case 181 -> l(148518573, var9 ^ 2015247183);
            case 182 -> l(148518574, var9 ^ -1187027218);
            case 183 -> l(148518575, var9 ^ -130115585);
            case 184 -> l(148518568, var9 ^ -723629104);
            case 185 -> 4;
            case 186 -> l(148518569, var9 ^ -1003779065);
            case 187 -> l(148518570, var9 ^ -2143522442);
            case 188 -> l(148518571, var9 ^ -512851831);
            case 189 -> l(148518580, var9 ^ 1081829375);
            case 190 -> l(148518581, var9 ^ -1517124792);
            case 191 -> l(148518582, var9 ^ -1712031141);
            case 192 -> l(148518583, var9 ^ 360895754);
            case 193 -> l(148518576, var9 ^ -564029339);
            case 194 -> l(148518577, var9 ^ -1132441920);
            case 195 -> l(148518578, var9 ^ -1804578875);
            case 196 -> l(148518579, var9 ^ 1515469074);
            case 197 -> l(148518588, var9 ^ -1568572378);
            case 198 -> l(148518589, var9 ^ -332990489);
            case 199 -> l(148518590, var9 ^ -369493279);
            case 200 -> l(148518591, var9 ^ 45719898);
            case 201 -> l(148518584, var9 ^ 1247018478);
            case 202 -> l(148518585, var9 ^ -206561195);
            case 203 -> l(148518586, var9 ^ -969475862);
            case 204 -> l(148518587, var9 ^ 1750535784);
            case 205 -> l(148518724, var9 ^ 571493162);
            case 206 -> l(148518725, var9 ^ -734202342);
            case 207 -> l(148518726, var9 ^ 157904185);
            case 208 -> l(148518727, var9 ^ -678958420);
            case 209 -> l(148518720, var9 ^ -404988384);
            case 210 -> l(148518721, var9 ^ 131867147);
            case 211 -> l(148518722, var9 ^ -176003631);
            case 212 -> l(148518723, var9 ^ -230184820);
            case 213 -> l(148518732, var9 ^ 2068545461);
            case 214 -> l(148518733, var9 ^ -784216041);
            case 215 -> l(148518734, var9 ^ 882596702);
            case 216 -> l(148518735, var9 ^ -139881995);
            case 217 -> l(148518728, var9 ^ -1850995893);
            case 218 -> l(148518729, var9 ^ 870880004);
            case 219 -> l(148518730, var9 ^ 1235451729);
            case 220 -> l(148518731, var9 ^ 2025192244);
            case 221 -> l(148518740, var9 ^ 1111382861);
            case 222 -> l(148518741, var9 ^ 2140672217);
            case 223 -> l(148518742, var9 ^ 1792801417);
            case 224 -> l(148518743, var9 ^ 688594516);
            case 225 -> l(148518736, var9 ^ -1042888993);
            case 226 -> l(148518737, var9 ^ -263544664);
            case 227 -> l(148518738, var9 ^ 552694626);
            case 228 -> l(148518739, var9 ^ 458705207);
            case 229 -> l(148518748, var9 ^ 1343612012);
            case 230 -> l(148518749, var9 ^ -1534982883);
            case 231 -> l(148518750, var9 ^ -725598047);
            case 232 -> l(148518751, var9 ^ -1523648051);
            case 233 -> l(148518744, var9 ^ -442446261);
            case 234 -> l(148518745, var9 ^ -2067599392);
            case 235 -> l(148518746, var9 ^ -1851337309);
            case 236 -> l(148518747, var9 ^ 2029208965);
            case 237 -> l(148518756, var9 ^ 1123815351);
            case 238 -> l(148518757, var9 ^ -1537232613);
            case 239 -> l(148518758, var9 ^ -487681992);
            case 240 -> l(148518759, var9 ^ -1779742906);
            case 241 -> 0;
            case 242 -> l(148518752, var9 ^ -2089887422);
            case 243 -> l(148518753, var9 ^ 59845737);
            case 244 -> l(148518754, var9 ^ 49322014);
            case 245 -> l(148518755, var9 ^ 1894545431);
            case 246 -> l(148518764, var9 ^ 1219434488);
            case 247 -> l(148518765, var9 ^ -306318996);
            case 248 -> l(148518766, var9 ^ 716190997);
            case 249 -> l(148518767, var9 ^ -1992654807);
            case 250 -> l(148518760, var9 ^ 295146921);
            case 251 -> l(148518761, var9 ^ -736790548);
            case 252 -> l(148518762, var9 ^ 1991357017);
            case 253 -> 5;
            case 254 -> l(148518763, var9 ^ -1517181920);
            default -> l(148518772, var9 ^ -896169606);
         };
         int var5 = (var1 & l(148518773, var9 ^ 1025468327)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & l(148518774, var9 ^ 1752946761)) >>> l(148518775, var9 ^ 960016294)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & l(148518768, var9 ^ -1271862111);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & l(148518769, var9 ^ 1459859032);
            }
         }

         lI[var2] = new String(var3).intern();
      }

      return lI[var2];
   }

   private void IlIl(class_332 param1, boolean param2, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: invokestatic k74/x/IIllllIl.IIIIl ()[Ljava/lang/String;
      // 003: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 006: astore 5
      // 008: astore 4
      // 00a: aload 5
      // 00c: getfield net/minecraft/class_310.field_1772 Lnet/minecraft/class_327;
      // 00f: ifnonnull 017
      // 012: return
      // 013: invokestatic k74/x/llIIIl.IIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 016: athrow
      // 017: iload 2
      // 018: ifeq 028
      // 01b: aload 0
      // 01c: aload 5
      // 01e: invokevirtual k74/x/llIIIl.IIIIl (Lnet/minecraft/class_310;)Lnet/minecraft/class_1309;
      // 021: goto 02e
      // 024: invokestatic k74/x/llIIIl.IIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 027: athrow
      // 028: aload 0
      // 029: aload 5
      // 02b: invokevirtual k74/x/llIIIl.IllI (Lnet/minecraft/class_310;)Lnet/minecraft/class_1309;
      // 02e: astore 6
      // 030: aload 6
      // 032: ifnonnull 03e
      // 035: aload 0
      // 036: invokevirtual k74/x/llIIIl.lI ()V
      // 039: return
      // 03a: invokestatic k74/x/llIIIl.IIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 03d: athrow
      // 03e: invokestatic java/lang/System.currentTimeMillis ()J
      // 041: lstore 7
      // 043: aload 0
      // 044: lload 7
      // 046: invokevirtual k74/x/llIIIl.Il (J)D
      // 049: dstore 9
      // 04b: aload 0
      // 04c: aload 6
      // 04e: invokevirtual k74/x/llIIIl.lIIl (Lnet/minecraft/class_1309;)Lk74/x/llllI;
      // 051: astore 11
      // 053: aload 0
      // 054: invokevirtual k74/x/llIIIl.IIIll ()D
      // 057: dstore 12
      // 059: aload 0
      // 05a: invokevirtual k74/x/llIIIl.lll ()D
      // 05d: dstore 14
      // 05f: aload 0
      // 060: invokevirtual k74/x/llIIIl.ll ()D
      // 063: dstore 16
      // 065: iload 2
      // 066: ifne 11d
      // 069: aload 0
      // 06a: getfield k74/x/llIIIl.IIIl Lk74/x/lllIIlII;
      // 06d: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 070: checkcast java/lang/Boolean
      // 073: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 076: ifeq 11d
      // 079: goto 080
      // 07c: invokestatic k74/x/llIIIl.IIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 07f: athrow
      // 080: aload 5
      // 082: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 085: ifnull 11d
      // 088: goto 08f
      // 08b: invokestatic k74/x/llIIIl.IIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 08e: athrow
      // 08f: aload 6
      // 091: aload 5
      // 093: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 096: if_acmpeq 11d
      // 099: goto 0a0
      // 09c: invokestatic k74/x/llIIIl.IIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 09f: athrow
      // 0a0: aload 0
      // 0a1: aload 6
      // 0a3: invokevirtual k74/x/llIIIl.III (Lnet/minecraft/class_1309;)Z
      // 0a6: ifne 0b5
      // 0a9: goto 0b0
      // 0ac: invokestatic k74/x/llIIIl.IIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0af: athrow
      // 0b0: return
      // 0b1: invokestatic k74/x/llIIIl.IIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0b4: athrow
      // 0b5: aload 0
      // 0b6: aload 11
      // 0b8: invokevirtual k74/x/llllI.I ()D
      // 0bb: invokevirtual k74/x/llIIIl.I (D)D
      // 0be: dstore 14
      // 0c0: aload 0
      // 0c1: aload 11
      // 0c3: invokevirtual k74/x/llllI.l ()D
      // 0c6: invokevirtual k74/x/llIIIl.IIII (D)D
      // 0c9: dstore 16
      // 0cb: aload 5
      // 0cd: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
      // 0d0: ifnull 11d
      // 0d3: dconst_0
      // 0d4: aload 5
      // 0d6: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
      // 0d9: invokevirtual net/minecraft/class_1041.method_4486 ()I
      // 0dc: i2d
      // 0dd: aload 11
      // 0df: invokevirtual k74/x/llllI.I ()D
      // 0e2: dload 12
      // 0e4: dmul
      // 0e5: dsub
      // 0e6: invokestatic java/lang/Math.max (DD)D
      // 0e9: dstore 18
      // 0eb: dconst_0
      // 0ec: aload 5
      // 0ee: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
      // 0f1: invokevirtual net/minecraft/class_1041.method_4502 ()I
      // 0f4: i2d
      // 0f5: aload 11
      // 0f7: invokevirtual k74/x/llllI.l ()D
      // 0fa: dload 12
      // 0fc: dmul
      // 0fd: dsub
      // 0fe: invokestatic java/lang/Math.max (DD)D
      // 101: dstore 20
      // 103: dconst_0
      // 104: dload 14
      // 106: dload 18
      // 108: invokestatic java/lang/Math.min (DD)D
      // 10b: invokestatic java/lang/Math.max (DD)D
      // 10e: dstore 14
      // 110: dconst_0
      // 111: dload 16
      // 113: dload 20
      // 115: invokestatic java/lang/Math.min (DD)D
      // 118: invokestatic java/lang/Math.max (DD)D
      // 11b: dstore 16
      // 11d: aload 0
      // 11e: dload 14
      // 120: dload 12
      // 122: invokevirtual k74/x/llIIIl.Ill (DD)D
      // 125: dstore 14
      // 127: aload 0
      // 128: dload 16
      // 12a: dload 12
      // 12c: invokevirtual k74/x/llIIIl.Ill (DD)D
      // 12f: dstore 16
      // 131: dconst_0
      // 132: dconst_1
      // 133: aload 6
      // 135: invokevirtual net/minecraft/class_1309.method_6032 ()F
      // 138: aload 6
      // 13a: invokevirtual net/minecraft/class_1309.method_6067 ()F
      // 13d: fadd
      // 13e: fconst_1
      // 13f: aload 6
      // 141: invokevirtual net/minecraft/class_1309.method_6063 ()F
      // 144: aload 6
      // 146: invokevirtual net/minecraft/class_1309.method_6067 ()F
      // 149: fadd
      // 14a: invokestatic java/lang/Math.max (FF)F
      // 14d: fdiv
      // 14e: f2d
      // 14f: invokestatic java/lang/Math.min (DD)D
      // 152: invokestatic java/lang/Math.max (DD)D
      // 155: dstore 18
      // 157: dconst_0
      // 158: aload 6
      // 15a: invokevirtual net/minecraft/class_1309.method_6032 ()F
      // 15d: aload 6
      // 15f: invokevirtual net/minecraft/class_1309.method_6067 ()F
      // 162: fadd
      // 163: f2d
      // 164: invokestatic java/lang/Math.max (DD)D
      // 167: dstore 20
      // 169: aload 0
      // 16a: aload 6
      // 16c: dload 18
      // 16e: dload 20
      // 170: dload 9
      // 172: invokevirtual k74/x/llIIIl.IIll (Lnet/minecraft/class_1309;DDD)V
      // 175: aload 0
      // 176: getfield k74/x/llIIIl.IIII D
      // 179: dstore 22
      // 17b: aload 0
      // 17c: getfield k74/x/llIIIl.Il D
      // 17f: dstore 24
      // 181: aload 1
      // 182: invokestatic k74/x/IlIIlllIl.IIllll (Lnet/minecraft/class_332;)V
      // 185: aload 1
      // 186: dload 14
      // 188: dload 16
      // 18a: invokestatic k74/x/IlIIlllIl.IlIIlI (Lnet/minecraft/class_332;DD)V
      // 18d: aload 1
      // 18e: dload 12
      // 190: dload 12
      // 192: invokestatic k74/x/IlIIlllIl.llIIIl (Lnet/minecraft/class_332;DD)V
      // 195: aload 0
      // 196: getfield k74/x/llIIIl.llII Lk74/x/IllIII;
      // 199: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 19c: checkcast k74/x/lllllIl
      // 19f: invokevirtual k74/x/lllllIl.ordinal ()I
      // 1a2: tableswitch 99 0 2 26 52 78
      // 1bc: aload 0
      // 1bd: aload 1
      // 1be: aload 5
      // 1c0: aload 6
      // 1c2: aload 11
      // 1c4: dload 24
      // 1c6: iload 3
      // 1c7: invokevirtual k74/x/llIIIl.lIll (Lnet/minecraft/class_332;Lnet/minecraft/class_310;Lnet/minecraft/class_1309;Lk74/x/llllI;DZ)V
      // 1ca: aload 4
      // 1cc: ifnull 205
      // 1cf: goto 1d6
      // 1d2: invokestatic k74/x/llIIIl.IIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1d5: athrow
      // 1d6: aload 0
      // 1d7: aload 1
      // 1d8: aload 5
      // 1da: aload 6
      // 1dc: aload 11
      // 1de: dload 22
      // 1e0: iload 3
      // 1e1: invokevirtual k74/x/llIIIl.llI (Lnet/minecraft/class_332;Lnet/minecraft/class_310;Lnet/minecraft/class_1309;Lk74/x/llllI;DZ)V
      // 1e4: aload 4
      // 1e6: ifnull 205
      // 1e9: goto 1f0
      // 1ec: invokestatic k74/x/llIIIl.IIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1ef: athrow
      // 1f0: aload 0
      // 1f1: aload 1
      // 1f2: aload 5
      // 1f4: aload 6
      // 1f6: aload 11
      // 1f8: dload 22
      // 1fa: iload 3
      // 1fb: invokevirtual k74/x/llIIIl.lIl (Lnet/minecraft/class_332;Lnet/minecraft/class_310;Lnet/minecraft/class_1309;Lk74/x/llllI;DZ)V
      // 1fe: goto 205
      // 201: invokestatic k74/x/llIIIl.IIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 204: athrow
      // 205: aload 1
      // 206: invokestatic k74/x/IlIIlllIl.lIIIll (Lnet/minecraft/class_332;)V
      // 209: return
   }

   private class_1309 IllI(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/llIIIl.lIIl Lk74/x/IlIIl;
      // 04: ifnonnull 0f
      // 07: aconst_null
      // 08: goto 16
      // 0b: invokestatic k74/x/llIIIl.IIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0e: athrow
      // 0f: aload 0
      // 10: getfield k74/x/llIIIl.lIIl Lk74/x/IlIIl;
      // 13: invokevirtual k74/x/IlIIl.lIII ()Lnet/minecraft/class_1309;
      // 16: astore 2
      // 17: aload 2
      // 18: ifnull 37
      // 1b: aload 2
      // 1c: invokevirtual net/minecraft/class_1309.method_5805 ()Z
      // 1f: ifeq 37
      // 22: goto 29
      // 25: invokestatic k74/x/llIIIl.IIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 28: athrow
      // 29: aload 2
      // 2a: invokevirtual net/minecraft/class_1309.method_31481 ()Z
      // 2d: ifeq 4d
      // 30: goto 37
      // 33: invokestatic k74/x/llIIIl.IIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 36: athrow
      // 37: aload 0
      // 38: getfield k74/x/llIIIl.lIIl Lk74/x/IlIIl;
      // 3b: ifnull 4d
      // 3e: goto 45
      // 41: invokestatic k74/x/llIIIl.IIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 44: athrow
      // 45: aload 0
      // 46: getfield k74/x/llIIIl.lIIl Lk74/x/IlIIl;
      // 49: invokevirtual k74/x/IlIIl.l ()Lnet/minecraft/class_1309;
      // 4c: astore 2
      // 4d: aload 2
      // 4e: ifnull 6d
      // 51: aload 2
      // 52: invokevirtual net/minecraft/class_1309.method_5805 ()Z
      // 55: ifeq 6d
      // 58: goto 5f
      // 5b: invokestatic k74/x/llIIIl.IIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 5e: athrow
      // 5f: aload 2
      // 60: invokevirtual net/minecraft/class_1309.method_31481 ()Z
      // 63: ifeq 73
      // 66: goto 6d
      // 69: invokestatic k74/x/llIIIl.IIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 6c: athrow
      // 6d: aconst_null
      // 6e: areturn
      // 6f: invokestatic k74/x/llIIIl.IIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 72: athrow
      // 73: aload 1
      // 74: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 77: ifnull 95
      // 7a: aload 1
      // 7b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 7e: aload 2
      // 7f: invokevirtual net/minecraft/class_746.method_5739 (Lnet/minecraft/class_1297;)F
      // 82: ldc 10.0
      // 84: fcmpl
      // 85: ifle 95
      // 88: goto 8f
      // 8b: invokestatic k74/x/llIIIl.IIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 8e: athrow
      // 8f: aconst_null
      // 90: areturn
      // 91: invokestatic k74/x/llIIIl.IIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 94: athrow
      // 95: aload 2
      // 96: areturn
   }

   @Override
   public void Illl(class_332 var1, int var2, int var3, float var4, boolean var5) {
      this.IlIl(var1, true, var5);
   }

   private void lIII(class_332 var1, class_1309 var2, int var3, int var4, int var5) {
      if (var2 instanceof class_742 var6) {
         class_310 var7 = class_310.method_1551();

         class_640 var10000;
         label26: {
            try {
               if (var7.method_1562() == null) {
                  var10000 = null;
                  break label26;
               }
            } catch (MatchException var10) {
               throw IIl(var10);
            }

            var10000 = var7.method_1562().method_2871(var6.method_5667());
         }

         class_640 var8 = var10000;

         try {
            if (var8 != null) {
               class_7532.method_52722(var1, var8.method_52810(), var3, var4, var5);
               return;
            }
         } catch (MatchException var9) {
            throw IIl(var9);
         }
      }

      IlIIlllIl.llIl(var1, var3, var4, var5, var5, 4.0, IIIlllII.l(l(148518770, -1580329795 ^ 1359166209), l(148518771, -1580329795 ^ 1613824267)));
      IlIIlllIl.lIIll(
         var1,
         class_310.method_1551().field_1772,
         IlIIllIII.lI(IlII(l(148518780, -1580329795 ^ 1322794348), l(148518781, -1580329795 ^ 1943491121))),
         var3,
         var4,
         var5,
         var5,
         -1
      );
   }

   private llllI lIIl(class_1309 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 003: astore 2
      // 004: aload 2
      // 005: getfield net/minecraft/class_310.field_1772 Lnet/minecraft/class_327;
      // 008: ifnull 016
      // 00b: aload 1
      // 00c: ifnonnull 07c
      // 00f: goto 016
      // 012: invokestatic k74/x/llIIIl.IIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 015: athrow
      // 016: aload 0
      // 017: getfield k74/x/llIIIl.llII Lk74/x/IllIII;
      // 01a: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 01d: checkcast k74/x/lllllIl
      // 020: invokevirtual k74/x/lllllIl.ordinal ()I
      // 023: tableswitch 29 0 2 43 59 75
      // 03c: invokestatic k74/x/llIIIl.IIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 03f: athrow
      // 040: new java/lang/MatchException
      // 043: dup
      // 044: aconst_null
      // 045: aconst_null
      // 046: invokespecial java/lang/MatchException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 049: athrow
      // 04a: invokestatic k74/x/llIIIl.IIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 04d: athrow
      // 04e: new k74/x/llllI
      // 051: dup
      // 052: ldc2_w 192.0
      // 055: ldc2_w 58.0
      // 058: invokespecial k74/x/llllI.<init> (DD)V
      // 05b: goto 07b
      // 05e: new k74/x/llllI
      // 061: dup
      // 062: ldc2_w 148.0
      // 065: ldc2_w 40.0
      // 068: invokespecial k74/x/llllI.<init> (DD)V
      // 06b: goto 07b
      // 06e: new k74/x/llllI
      // 071: dup
      // 072: ldc2_w 170.0
      // 075: ldc2_w 46.0
      // 078: invokespecial k74/x/llllI.<init> (DD)V
      // 07b: areturn
      // 07c: aload 2
      // 07d: getfield net/minecraft/class_310.field_1772 Lnet/minecraft/class_327;
      // 080: aload 1
      // 081: invokevirtual net/minecraft/class_1309.method_5477 ()Lnet/minecraft/class_2561;
      // 084: invokeinterface net/minecraft/class_2561.getString ()Ljava/lang/String; 1
      // 089: invokestatic k74/x/IlIIlllIl.IIl (Lnet/minecraft/class_327;Ljava/lang/String;)I
      // 08c: i2d
      // 08d: dstore 3
      // 08e: aload 0
      // 08f: getfield k74/x/llIIIl.llII Lk74/x/IllIII;
      // 092: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 095: checkcast k74/x/lllllIl
      // 098: invokevirtual k74/x/lllllIl.ordinal ()I
      // 09b: tableswitch 25 0 2 39 63 87
      // 0b4: new java/lang/MatchException
      // 0b7: dup
      // 0b8: aconst_null
      // 0b9: aconst_null
      // 0ba: invokespecial java/lang/MatchException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 0bd: athrow
      // 0be: invokestatic k74/x/llIIIl.IIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0c1: athrow
      // 0c2: new k74/x/llllI
      // 0c5: dup
      // 0c6: ldc2_w 192.0
      // 0c9: dload 3
      // 0ca: ldc2_w 76.0
      // 0cd: dadd
      // 0ce: invokestatic java/lang/Math.max (DD)D
      // 0d1: ldc2_w 58.0
      // 0d4: invokespecial k74/x/llllI.<init> (DD)V
      // 0d7: goto 107
      // 0da: new k74/x/llllI
      // 0dd: dup
      // 0de: ldc2_w 148.0
      // 0e1: dload 3
      // 0e2: ldc2_w 50.0
      // 0e5: dadd
      // 0e6: invokestatic java/lang/Math.max (DD)D
      // 0e9: ldc2_w 40.0
      // 0ec: invokespecial k74/x/llllI.<init> (DD)V
      // 0ef: goto 107
      // 0f2: new k74/x/llllI
      // 0f5: dup
      // 0f6: ldc2_w 170.0
      // 0f9: dload 3
      // 0fa: ldc2_w 74.0
      // 0fd: dadd
      // 0fe: invokestatic java/lang/Math.max (DD)D
      // 101: ldc2_w 46.0
      // 104: invokespecial k74/x/llllI.<init> (DD)V
      // 107: areturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private String lIlI(class_310 var1, class_1309 var2) {
      label33:
      if (var2 instanceof class_742 var3) {
         try {
            if (var1.method_1562() == null) {
               break label33;
            }
         } catch (MatchException var9) {
            throw IIl(var9);
         }

         class_640 var4 = var1.method_1562().method_2871(var3.method_5667());

         int var10000;
         label25: {
            try {
               if (var4 == null) {
                  var10000 = 0;
                  break label25;
               }
            } catch (MatchException var8) {
               throw IIl(var8);
            }

            var10000 = var4.method_2959();
         }

         String var6 = IlIIllIII.lI(IlII(l(148518669, 1066244691 ^ -939617866), l(148518670, 1066244691 ^ 1674156229)));
         int var5 = var10000;
         return var5 + var6;
      }

      try {
         return IlIIllIII.lI(IlII(l(148518659, 1066244691 ^ 884449505), l(148518668, 1066244691 ^ -1126765846)));
      } catch (MatchException var7) {
         throw IIl(var7);
      }
   }

   private void lIll(class_332 var1, class_310 var2, class_1309 var3, llllI var4, double var5, boolean var7) {
      int var23 = -42811396;
      Color var8 = this.IIlI();
      Color var9 = this.IIlII();
      double var10 = var4.I();
      double var12 = var4.l();
      double var14 = 60.0;
      double var16 = var10 - var14 - 10.0;
      double var10000 = Math.round(var5 * 10.0) / 10.0;
      String var22 = IlIIllIII.lI(IlII(l(148518671, var23 ^ 1582620125), l(148518664, var23 ^ -918145743)));
      double var20 = var10000;
      String var18 = var20 + var22;
      String var19 = this.II(var2, var3);
      IIIlIllII.llI(var1, II, 0.0, 0.0, var10, var12, var7);
      IIIlIllII.I(var1, 8.0, 8.0, 42.0, 42.0, 5.0);
      this.lIII(var1, var3, l(148518665, var23 ^ -256531587), l(148518666, var23 ^ -86400016), l(148518667, var23 ^ 1715496325));
      IlIIlllIl.IIll(var1, var2.field_1772, var3.method_5477().getString(), var14, 7.0, IIIlIllII.lII(l(148518676, var23 ^ 756320574)));
      IlIIlllIl.llIl(var1, var14, 25.0, var16, 6.0, 3.0, IIIlllII.l(0, l(148518677, var23 ^ 872194257)));
      IlIIlllIl.lllIII(var1, var14, 25.0, var16 * this.IIII, 6.0, 3.0, var8.getRGB(), var9.getRGB());
      IlIIlllIl.IIll(var1, var2.field_1772, var18, var14, 39.0, IIIlIllII.IIII(l(148518678, var23 ^ -1220785710)));
      IlIIlllIl.IlI(var1, var2.field_1772, var19, var10 - 10.0, 39.0, IIIlIllII.IIII(l(148518679, var23 ^ 2060600604)));
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
      // 02: invokevirtual k74/x/llIIIl.lll ()D
      // 05: dcmpl
      // 06: iflt 4b
      // 09: dload 1
      // 0a: aload 0
      // 0b: invokevirtual k74/x/llIIIl.lll ()D
      // 0e: aload 0
      // 0f: invokevirtual k74/x/llIIIl.IIllI ()D
      // 12: dadd
      // 13: dcmpg
      // 14: ifgt 4b
      // 17: goto 1e
      // 1a: invokestatic k74/x/llIIIl.IIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1d: athrow
      // 1e: dload 3
      // 1f: aload 0
      // 20: invokevirtual k74/x/llIIIl.ll ()D
      // 23: dcmpl
      // 24: iflt 4b
      // 27: goto 2e
      // 2a: invokestatic k74/x/llIIIl.IIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2d: athrow
      // 2e: dload 3
      // 2f: aload 0
      // 30: invokevirtual k74/x/llIIIl.ll ()D
      // 33: aload 0
      // 34: invokevirtual k74/x/llIIIl.IIIl ()D
      // 37: dadd
      // 38: dcmpg
      // 39: ifgt 4b
      // 3c: goto 43
      // 3f: invokestatic k74/x/llIIIl.IIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 42: athrow
      // 43: bipush 1
      // 44: goto 4c
      // 47: invokestatic k74/x/llIIIl.IIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 4a: athrow
      // 4b: bipush 0
      // 4c: ireturn
   }

   @Override
   public void llIl() {
      this.IIlI.l();
      this.lIl = null;
      this.IlII = l(148518672, 2017833920 ^ -475063897);
      this.lIll = 0L;
      this.III = l(148518673, 2017833920 ^ 358485480);
      this.IIII = 0.0;
      this.Il = 0.0;
      this.Illl = 0L;
   }

   private double I(double var1) {
      try {
         if (this.lIl == null) {
            return this.lll();
         }
      } catch (MatchException var8) {
         throw IIl(var8);
      }

      double var3 = var1 * this.IIIll();
      double var5 = 8.0;

      try {
         switch ((lIIIlII)this.ll.IllI()) {
            case I:
            case II:
               return this.lIl.l() + (this.lIl.II() - var3) * 0.5;
            case Il:
               return this.lIl.l() - var3 - var5;
            case lI:
               return this.lIl.l() + this.lIl.II() + var5;
            default:
               throw new MatchException(null, null);
         }
      } catch (MatchException var7) {
         throw IIl(var7);
      }
   }

   @Override
   public void lllI(double var1, double var3) {
      double var5 = Double.MAX_VALUE;
      double var7 = Double.MAX_VALUE;
      class_310 var9 = class_310.method_1551();

      label18: {
         try {
            if (var9 == null || var9.method_22683() == null) {
               break label18;
            }
         } catch (MatchException var10) {
            throw IIl(var10);
         }

         var5 = Math.max(0.0, var9.method_22683().method_4486() - this.IIllI());
         var7 = Math.max(0.0, var9.method_22683().method_4502() - this.IIIl());
      }

      this.lll.Ill(Math.max(0.0, Math.min(var1, var5)));
      this.IllI.Ill(Math.max(0.0, Math.min(var3, var7)));
   }

   @Override
   public void llll(class_332 var1, int var2, int var3, float var4) {
      this.IlIl(var1, false, false);
   }

   @Override
   public void IIIII(class_332 var1, int var2, int var3, float var4) {
      this.IlIl(var1, false, false);
   }

   private class_1309 IIIIl(class_310 var1) {
      class_1309 var2 = this.IllI(var1);

      try {
         if (var2 != null) {
            return var2;
         }
      } catch (MatchException var3) {
         throw IIl(var3);
      }

      return var1.field_1724;
   }

   private double IIIlI(double param1, double param3, double param5, double param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: dload 1
      // 01: invokestatic java/lang/Double.isFinite (D)Z
      // 04: ifeq 15
      // 07: dload 3
      // 08: invokestatic java/lang/Double.isFinite (D)Z
      // 0b: ifne 1b
      // 0e: goto 15
      // 11: invokestatic k74/x/llIIIl.IIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 14: athrow
      // 15: dload 3
      // 16: dreturn
      // 17: invokestatic k74/x/llIIIl.IIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1a: athrow
      // 1b: dload 3
      // 1c: dload 1
      // 1d: dsub
      // 1e: invokestatic java/lang/Math.abs (D)D
      // 21: ldc2_w 0.001
      // 24: dcmpg
      // 25: ifge 2e
      // 28: dload 3
      // 29: dreturn
      // 2a: invokestatic k74/x/llIIIl.IIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2d: athrow
      // 2e: dload 7
      // 30: dconst_0
      // 31: dcmpg
      // 32: ifgt 3b
      // 35: dload 1
      // 36: dreturn
      // 37: invokestatic k74/x/llIIIl.IIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 3a: athrow
      // 3b: dload 1
      // 3c: dload 3
      // 3d: dload 5
      // 3f: dload 7
      // 41: invokestatic k74/x/IllllllI.IlI (DDDD)D
      // 44: dreturn
   }

   private double IIIll() {
      return this.lIlI.IllI() / 100.0;
   }

   private static int l(int var0, int var1) {
      int var2 = llIl[var0 ^ 148518468] ^ var1 ^ var0;
      var2 -= 6011;
      var2 += 10814;
      var2 -= 52708;
      var2 -= 55568;
      var2 ^= 24910;
      var2 ^= 16200;
      var2 -= 60220;
      return var2 + 28770;
   }

   private Color IIlII() {
      try {
         if (this.llI.IllI() == k74.x.l.l) {
            return IIIlllII.I(this.IIll.IllI(), 0.22);
         }
      } catch (MatchException var1) {
         throw IIl(var1);
      }

      return IIIlIllII.IIlI();
   }

   @Override
   public void IIlIl() {
      try {
         if (!this.IIIIlIl()) {
            this.IIlI.l();
         }
      } catch (MatchException var1) {
         throw IIl(var1);
      }
   }

   @Override
   public double IIllI() {
      return this.lIIl(this.IIIIl(class_310.method_1551())).I() * this.IIIll();
   }

   private IIlllIIII IIlll(lIIlIl var1, class_310 var2, class_1309 var3, float var4) {
      String[] var10000 = IIllllIl.IIIIl();
      class_243 var6 = IlIII.IIll(var3, var4);
      double var7 = var3.method_17682();
      String[] var5 = var10000;
      class_243 var9 = new class_243(var6.field_1352, var6.field_1351, var6.field_1350);
      class_243 var10 = new class_243(var6.field_1352, var6.field_1351 + var7, var6.field_1350);
      class_243 var11 = new class_243(var6.field_1352, var6.field_1351 + var7 * 0.5, var6.field_1350);
      IlIllIIII var12 = IlIII.IlIll(var1, var9);
      IlIllIIII var13 = IlIII.IlIll(var1, var10);

      double var14;
      double var16;
      double var18;
      double var20;
      label39: {
         label34: {
            try {
               if (var12 == null || var13 == null) {
                  break label34;
               }
            } catch (MatchException var32) {
               throw IIl(var32);
            }

            double var22 = (var12.II() + var13.II()) * 0.5;
            var16 = Math.min(var12.l(), var13.l());
            var20 = Math.max(var12.l(), var13.l());
            double var24 = Math.max(8.0, var20 - var16);
            double var26 = Math.max(6.0, var24 * 0.48);
            var14 = var22 - var26 * 0.5;
            var18 = var22 + var26 * 0.5;
            if (var5 == null) {
               break label39;
            }
         }

         IlIllIIII var33 = IlIII.IlIll(var1, var11);

         try {
            if (var33 == null) {
               this.IlII = l(148518674, -2016323312 ^ 1241970830);
               return null;
            }
         } catch (MatchException var31) {
            throw IIl(var31);
         }

         double var23 = Math.max(1.0, (double)var2.field_1724.method_5739(var3));
         double var25 = var2.method_22683().method_4502() * 0.9 / var23;
         double var27 = Math.max(8.0, var25);
         double var29 = Math.max(6.0, var27 * 0.48);
         var14 = var33.II() - var29 * 0.5;
         var18 = var33.II() + var29 * 0.5;
         var16 = var33.l() - var27 * 0.5;
         var20 = var33.l() + var27 * 0.5;
      }

      double var34 = var2.field_1724.method_5858(var3);
      llIIIIll var35 = this.IIlI.II(var3.method_5628(), new llIIIIll(var14, var16, var18, var20), var34);
      this.IlII = var3.method_5628();
      this.lIll = System.currentTimeMillis();
      return new IIlllIIII(var35.II(), var35.lI(), Math.max(1.0, var35.Il()), Math.max(1.0, var35.ll()));
   }
}
