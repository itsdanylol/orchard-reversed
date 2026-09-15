package k74.x;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking.Context;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.class_2540;
import net.minecraft.class_2561;
import net.minecraft.class_2817;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_642;
import net.minecraft.class_746;
import net.minecraft.class_8710;
import net.minecraft.class_9139;
import net.minecraft.class_8710.class_9154;

@Environment(EnvType.CLIENT)
public final class IlllI extends IlIIIIIIl {
   private static final IIIlIlIl II;
   static final byte Il = 0;
   private static final Set<String> lI;
   private static volatile Boolean ll;
   private boolean III;
   private static volatile Boolean IIl;
   private static final IIIlIlIl IlI;
   private static final IIIlIlIl Ill;
   private byte[] lII;
   private static final Set<String> lIl;
   private static volatile Constructor<?> llI;
   private static final Object[] IlIll;
   private static final IIIlIlIl lll;
   static final byte IIII = 15;
   static final byte IIIl = 7;
   private long IIlI;
   private static final String[] IIll;
   private static final IIIlIlIl IlII;
   private static final ConcurrentMap<String, Long> IlIl;
   private IIIllIlII IllI;
   private static final String[] Illl;
   static final byte lIII = 7;
   private static final long lIIl = 10000L;
   private static final IIIlIlIl lIlI;
   private final lllIIlII lIll;
   private static final long llII = 10000L;
   private static final String[] IlIlI;
   private static final ThreadLocal<Boolean> llIl;
   static final byte lllI = 2;
   static final byte llll = 1;
   private static volatile Field IIIII;
   private static final Queue<String> IIIIl;
   private static final IIIlIlIl IIIlI;
   private final lllIIlII IIIll;
   private final lllIIlII IIlII;
   private static final IIIlIlIl IIlIl;
   private final IllIII<IIIllIlII> I;
   private static final IIIlIlIl IIllI;
   private static final int[] IlIIl;
   private static final IIIlIlIl IIlll;
   static final byte IlIII = 1;

   @Override
   public void IIlIl() {
      this.III();
      this.lIIII();
      if (this.IIIIlIl() && this.IIlII.IllI()) {
         class_310 var1 = class_310.method_1551();
         if (var1 != null && var1.field_1724 != null) {
            String var2;
            while ((var2 = IIIIl.poll()) != null) {
               class_746 var10000 = var1.field_1724;
               String var3 = IlIIllIII.lI(lll(lIlll(-975560723, -1134501237 ^ 1724543777), lIlll(-975560724, -1134501237 ^ 865946513)));
               var10000.method_7353(class_2561.method_43470(var3 + var2), true);
            }
         }
      } else {
         IIIIl.clear();
      }
   }

   public static byte[] I() {
      ByteArrayOutputStream var0 = new ByteArrayOutputStream(lIlll(-975560721, 376461277 ^ 140739147));
      var0.write(1);
      var0.write(1);
      String[] var1 = IIlIl.llIl().split(IlIIllIII.lI(lll(lIlll(-975560722, 376461277 ^ 1572867736), lIlll(-975560727, 376461277 ^ -1844377479))));
      II(var0, var1.length);

      for (String var5 : var1) {
         IIlII(var0, var5);
      }

      var0.write(2);
      IIlII(var0, IlII.llIl());
      return var0.toByteArray();
   }

   public static byte[] l() {
      int var3 = -810114942;
      ByteArrayOutputStream var0 = new ByteArrayOutputStream(lIlll(-975560728, var3 ^ 1040676612));
      DataOutputStream var1 = new DataOutputStream(var0);

      try {
         var1.writeByte(1);
         var1.writeUTF(IlIIllIII.lI(lll(lIlll(-975560725, var3 ^ 1996835477), lIlll(-975560726, var3 ^ 98823577))));
         var1.writeUTF(IlIIllIII.lI(lll(lIlll(-975560731, var3 ^ -2117203586), lIlll(-975560732, var3 ^ -1038794842))));
         var1.close();
      } catch (IOException var4) {
      }

      return var0.toByteArray();
   }

   private static void II(ByteArrayOutputStream var0, int var1) {
      while ((var1 & lIlll(-975560729, 1645394934 ^ -149990182)) != 0) {
         var0.write(var1 & lIlll(-975560730, 1645394934 ^ 367283993) | lIlll(-975560735, 1645394934 ^ 686304474));
         var1 >>>= lIlll(-975560736, 1645394934 ^ -1729015916);
      }

      var0.write(var1);
   }

   public boolean Il() {
      return this.IIIll.IllI();
   }

   private static boolean lI(byte[] param0, class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w 363567952
      // 003: istore 12
      // 005: getstatic k74/x/IlllI.llI Ljava/lang/reflect/Constructor;
      // 008: astore 2
      // 009: aload 2
      // 00a: ifnonnull 0da
      // 00d: getstatic k74/x/IlllI.lll Lk74/x/IIIlIlIl;
      // 010: invokevirtual k74/x/IIIlIlIl.llIl ()Ljava/lang/String;
      // 013: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 016: astore 3
      // 017: aload 3
      // 018: invokevirtual java/lang/Class.getDeclaredConstructors ()[Ljava/lang/reflect/Constructor;
      // 01b: astore 4
      // 01d: aload 4
      // 01f: arraylength
      // 020: istore 5
      // 022: bipush 0
      // 023: istore 6
      // 025: iload 6
      // 027: iload 5
      // 029: if_icmpge 07d
      // 02c: aload 4
      // 02e: iload 6
      // 030: aaload
      // 031: astore 7
      // 033: aload 7
      // 035: invokevirtual java/lang/reflect/Constructor.getParameterTypes ()[Ljava/lang/Class;
      // 038: astore 8
      // 03a: aload 8
      // 03c: arraylength
      // 03d: bipush 2
      // 03e: if_icmpne 077
      // 041: ldc_w net/minecraft/class_8710$class_9154
      // 044: aload 8
      // 046: bipush 0
      // 047: aaload
      // 048: invokevirtual java/lang/Class.isAssignableFrom (Ljava/lang/Class;)Z
      // 04b: ifeq 077
      // 04e: goto 055
      // 051: invokestatic k74/x/IlllI.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 054: athrow
      // 055: aload 8
      // 057: bipush 1
      // 058: aaload
      // 059: ldc_w [B
      // 05c: if_acmpne 077
      // 05f: goto 066
      // 062: invokestatic k74/x/IlllI.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 065: athrow
      // 066: aload 7
      // 068: bipush 1
      // 069: invokevirtual java/lang/reflect/Constructor.setAccessible (Z)V
      // 06c: aload 7
      // 06e: putstatic k74/x/IlllI.llI Ljava/lang/reflect/Constructor;
      // 071: aload 7
      // 073: astore 2
      // 074: goto 07d
      // 077: iinc 6 1
      // 07a: goto 025
      // 07d: aload 2
      // 07e: ifnonnull 0da
      // 081: ldc_w -975560733
      // 084: iload 12
      // 086: ldc_w 666641322
      // 089: ixor
      // 08a: invokestatic k74/x/IlllI.lIlll (II)I
      // 08d: ldc_w -975560734
      // 090: iload 12
      // 092: ldc_w 709605675
      // 095: ixor
      // 096: invokestatic k74/x/IlllI.lIlll (II)I
      // 099: invokestatic k74/x/IlllI.lll (II)Ljava/lang/String;
      // 09c: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 09f: ldc_w -975560707
      // 0a2: iload 12
      // 0a4: ldc_w 552252698
      // 0a7: ixor
      // 0a8: invokestatic k74/x/IlllI.lIlll (II)I
      // 0ab: ldc_w -975560708
      // 0ae: iload 12
      // 0b0: ldc_w 1415898625
      // 0b3: ixor
      // 0b4: invokestatic k74/x/IlllI.lIlll (II)I
      // 0b7: invokestatic k74/x/IlllI.lll (II)Ljava/lang/String;
      // 0ba: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0bd: astore 10
      // 0bf: astore 9
      // 0c1: new java/lang/StringBuilder
      // 0c4: dup
      // 0c5: invokespecial java/lang/StringBuilder.<init> ()V
      // 0c8: aload 9
      // 0ca: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0cd: aload 10
      // 0cf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0d2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0d5: invokestatic k74/x/IlllI.IIlI (Ljava/lang/String;)V
      // 0d8: bipush 0
      // 0d9: ireturn
      // 0da: aload 2
      // 0db: bipush 2
      // 0dc: anewarray 303
      // 0df: dup
      // 0e0: bipush 0
      // 0e1: new net/minecraft/class_8710$class_9154
      // 0e4: dup
      // 0e5: ldc_w -975560705
      // 0e8: iload 12
      // 0ea: ldc_w 1844403382
      // 0ed: ixor
      // 0ee: invokestatic k74/x/IlllI.lIlll (II)I
      // 0f1: ldc_w -975560706
      // 0f4: iload 12
      // 0f6: ldc_w -569242537
      // 0f9: ixor
      // 0fa: invokestatic k74/x/IlllI.lIlll (II)I
      // 0fd: invokestatic k74/x/IlllI.lll (II)Ljava/lang/String;
      // 100: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 103: ldc_w -975560711
      // 106: iload 12
      // 108: ldc_w 1354611947
      // 10b: ixor
      // 10c: invokestatic k74/x/IlllI.lIlll (II)I
      // 10f: ldc_w -975560712
      // 112: iload 12
      // 114: ldc_w 292550739
      // 117: ixor
      // 118: invokestatic k74/x/IlllI.lIlll (II)I
      // 11b: invokestatic k74/x/IlllI.lll (II)Ljava/lang/String;
      // 11e: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 121: invokestatic net/minecraft/class_2960.method_60655 (Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/class_2960;
      // 124: invokespecial net/minecraft/class_8710$class_9154.<init> (Lnet/minecraft/class_2960;)V
      // 127: aastore
      // 128: dup
      // 129: bipush 1
      // 12a: aload 0
      // 12b: aastore
      // 12c: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 12f: checkcast net/minecraft/class_8710
      // 132: astore 3
      // 133: aload 1
      // 134: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 137: new net/minecraft/class_2817
      // 13a: dup
      // 13b: aload 3
      // 13c: invokespecial net/minecraft/class_2817.<init> (Lnet/minecraft/class_8710;)V
      // 13f: invokevirtual net/minecraft/class_634.method_52787 (Lnet/minecraft/class_2596;)V
      // 142: bipush 1
      // 143: ireturn
      // 144: astore 2
      // 145: ldc_w -975560709
      // 148: iload 12
      // 14a: ldc_w 338173443
      // 14d: ixor
      // 14e: invokestatic k74/x/IlllI.lIlll (II)I
      // 151: ldc_w -975560710
      // 154: iload 12
      // 156: ldc_w -961611798
      // 159: ixor
      // 15a: invokestatic k74/x/IlllI.lIlll (II)I
      // 15d: invokestatic k74/x/IlllI.lll (II)Ljava/lang/String;
      // 160: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 163: aload 2
      // 164: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 167: invokevirtual java/lang/Class.getSimpleName ()Ljava/lang/String;
      // 16a: astore 11
      // 16c: astore 10
      // 16e: new java/lang/StringBuilder
      // 171: dup
      // 172: invokespecial java/lang/StringBuilder.<init> ()V
      // 175: aload 10
      // 177: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 17a: aload 11
      // 17c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 17f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 182: invokestatic k74/x/IlllI.IIlI (Ljava/lang/String;)V
      // 185: bipush 0
      // 186: ireturn
   }

   public IlllI() {
      int var1 = 376783472;
      super(
         IlIIllIII.Ill(lll(lIlll(-975560715, var1 ^ 1019744991), lIlll(-975560716, var1 ^ 1745470478))),
         lllIIlIl.IlI,
         IlIIllIII.Ill(lll(lIlll(-975560713, var1 ^ -1966899495), lIlll(-975560714, var1 ^ -2046568653)))
      );
      this.I = new IllIII<>(IlIIllIII.Ill(lll(lIlll(-975560719, var1 ^ 438716227), lIlll(-975560720, var1 ^ -331698732))), IIIllIlII.class, IIIllIlII.l);
      this.IIIll = this.IllIIll(new lllIIlII(IlIIllIII.Ill(lll(lIlll(-975560717, var1 ^ -253213789), lIlll(-975560718, var1 ^ 1792763284))), true));
      this.lIll = this.IllIIll(new lllIIlII(IlIIllIII.Ill(lll(lIlll(-975560755, var1 ^ 454800612), lIlll(-975560756, var1 ^ -957189368))), false));
      this.IIlII = this.IllIIll(new lllIIlII(IlIIllIII.Ill(lll(lIlll(-975560753, var1 ^ 424003490), lIlll(-975560754, var1 ^ -452444726))), true));
      IIl();
      this.III();
   }

   private static boolean ll(IIIlIlIl var0) {
      try {
         return FabricLoader.getInstance().isModLoaded(var0.llIl());
      } catch (Throwable var2) {
         return false;
      }
   }

   private void III() {
      IIIllIlII var1 = this.I.IllI();
      boolean var2 = this.IIIIlIl() && this.IIIll.IllI();
      if (var1 != this.IllI || var2 != this.III) {
         this.IllI = var1;
         this.III = var2;
         boolean var3 = var1 == IIIllIlII.Il || var1 == IIIllIlII.l;
         IIIlI(IIIllllII.l, IIIllllII::I, IIllI, var2 && var3 && !IlllI());
         IIIlI(IIIIllII.II, IIIIllII::I, II, var2 && var1 == IIIllIlII.l && !IIll());
      }
   }

   public static void IIl() {
      if (!IlllI()) {
         Illl(IIIllllII.l, IIIllllII.II, IIllI);
      }

      if (!IIll()) {
         Illl(IIIIllII.II, IIIIllII.l, II);
      }

      Illl(lIlIlIl.II, lIlIlIl.l, IlI);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = -403072920;
      int var10001 = "י먆\uebda욊ꯒ볂⯇쟢⯜붺ꯗ뭶\uebd2봢\uebcf뱚殠웖\uec72왶⮢봶Ɀ먮ⱳ쐶ꯖ붖걽뭺⯋벲ꮹ먲ⱄ뷂ⱄ볶毉뱪\uebc8렞\uebd4뷾ꯆ쐺毗웾毗먲ꯝ뷎\uec74웲\uebba욾\uebb5왒毝쟒殁먢\uebca윞\uebcc욪Ⱪ볾Ɑ뱖걭뵂\ueb82욮ꮼ볮ꯋ뮊\uec69윾殣쐂\uebcf붦\uec74먢ⱪ볖\ueba0뵾걾뮺毙뷆ⱦ뮦母볮\uec65쐾⮷믊毌믆\ueba4웖ꯋ뷖汦뵚ꯆ웎汲붺걧뱞걧벆ⱥ봊⯋웖\uebda먒⯇봶ⱱ윮\ueba4렖ꮢ볲毟렖汴벒⮂벒Ɒ믊\uec73붺毘먪걬봒\uec67뮾ꯉ웲\uebc8웶\uec40벺걽벒汭봚汰웚殡뵊汴왲걦뷾걫쑊⮤뱪⮷뵲毞읆⮻뮦ꯏ먪毚웮毈뷎毙뱺⯍붖ꯝ뷂毈볆ꯇ멎\uebbb욪\uec7f뷲汳볚汳벢\uebd6붎⯔뭚\uebc5뭒\uebc9뵺Ⱬ윆⯈웒⮠뭪걳뷢汬먒\ueba1웶汳붪\uec43벪毙벦\uebbc봺⯇왢ⱄ먮汀뵖汩쐂Ɀ붦\uec70붪ꯖ벪\uebc6벂毖먎毙벦ꯎ윎⮷뭪汦뵒\uec6d붺걨쟞\uebdf웖毆볞⯅뱚ꯉ윮\uebd1붶ꮻ볞ⱥ봖\ueba1읎⯏붞\uec6e왞\uec6f윶⯝뵒\uebd0욆\uebcd벪\uec66벾汭뱞\uebd0뭪汪윺⮼쟚ꯗ웎\uec68욾\uec72멆汩먪\uebc8뷲ꮣ먊汾볞汨렦⯝뷪殂멎\uebce붦걄쟮ⱴ벂ꮵ뭶比웢毙먢\uec6a쟞ꯈ쐾毇렒Ɐ렢ꯛ왪毑읆\uec6e벚汪쐆\uebc8뭒汽렖걮먾⯎볚\uebdd봒\uebd2욒毗뷺\uec72봒\uec73붲ꮢ뱲⮁윮\uec7e뱞汀먒ꯕ뵺殶렚段웊每봂毗웖毖뮒\uec69벢ꮡ봮汧렒毕먺\uebce왢걩읆\uebba웦\ueba2렢毞렒汥먖ꯔ읎毜윮汥욢⮤멆毚뮾\uebd7뷒ⱥ쑆\uec73왢毕윶걱뷲\uebcb윞⯗윂\uebd1뷂Ⱪ뮮Ⱪ웞殻뵞\uebb9봦걥뮚⯆멂汳먎\uebbc욾毞렦\uec73봒殣뷢殶욪걃웂\uec6d렦\uebb5뭦毎벶\uebce읆毋뷲⯇읎⯘뷮걀먾汫뷪毉욲毇욲\uec7d뭞毚웪\uec43읊汫봢\uebbb뮦毞붖ꯆ벆汫뭲Ⱨ윂殁뵪Ɐ읂ꯖ벶汴쐲毈뱖ⱳ뮪\uebda볒ⱃ욾毈욢⮡먎殹볒⯍웶殤왮⮁뱲汴뮺汄뮒殸먖殹벎汭쐆\uebd0쟾ⱥ뵦毖뭞\uebd9쏶殁윆毓벎걭붾ꯆ쟲\uebc5뭮汄윢毙쟒ꯈ뭲ꮶ욲ꯒ욪⯓봊ꮵ뷲\uebd4멆⯚볦\uec6a쟲\ueb81윂\uebb7붂毙쟮ꯟ뱶⮂봎ꯚ벊汃윆ⱽ욚\uec7e쐲\uebd1뷖걲봖\uec6a쟒ꯈ붆⮷왚⯍쑊汧뮒\uebbb렢⯕왢⯑뱺毖쟦ꯆ윂ꯜ뵚\uec6a뮺Ɱ뷾⮹쟢ꮹ붢毚뵚\uebd1멆\uec6c뷾ꮻ먲⯝뭚⯏뭞殼볢건먎毎뵪ꯏ욖殸볦⯅봂殸뱺汪뵲汫먾毟웮\uebb7벂\uebda붮ꮹ봞⮣뮚段뵮\uebba욆\uec7d봢걾붒汯뮪걪웒汃봺ꯞ뭚⯞뮒\uebd4뷊汬믆걿뱖ꯐ쟪\uec66뵺\ueba3뮦殤욞⯓뷢毛웎汦붞毟웢\uec71뱶汴쟲ꯞ뮪ꮶ먢ꯆ볚⮠욪比볶毜뵢毖벊\ueba3볖⯕뵶ꯕ뵚ꯞ뵚殁쟮\uebdb뱾\uebba읆ⱃ렮毓욲\uebc5렖\uebcf뵾\uebd1뮪\uec6b봶ꯇ쑂\uebde멊\uec7e볞⯌붖\uec7f벆\uebc6붶\ueba2볒毐먺ⱬ욖\uebd9뵆⯇벢\ueb81웂殻먒ꯏ쐎ꯘ왒\uec43붖汩붾ꯌ볾ꯎ뵦⯑뮮Ⱪ윦毗렮ꯋ먎毙욚Ɱ윖\uebd9윂ⱪ봊汰뭞毈볦걿윦\uebce욞\ueb81뮺ⱴ멎ꮻ먆⯖붲ⱬ쑆⮹뭾⯈욒ⱽ웮殤뱺汱뷲ⱀ렚\uebdc뵆ꮸ읊⯙웺\uec40쑂汬멎ⱬ먢ⱱ봞걄뷒\uebc8뵦\uebc9뱖毇쐾⯚쟞⯞먂毖뷊\uebca먢⮹뭖ꯆ윊殢벒걲벆殁뭞\uebcf볦毎웒汽봾殷뵞\uec6a봮\uec7f왲⮢뮒⮹욞⯓뮊⯇뵎ꮠ뮚걱먺汳윎毗뵂걨욒ⱦ볲汲왲ꮡ릖⮺먲\uebd6윊殁먶ꮻ믆\uebda쟺⯓렦\uebd3뮪ꯅ윮ꯟ쐆Ⱪ멊Ɀ뮒ⱄ뷎\ueba1웒⮼쟢\uebca렞Ɑ멎\uebd6멆⮡욮거뱢ꯗ붞\uec73웎\ueb82볢汪벮⯖뮢걱쟪毌뷦殼뵆\ueba0붎걦벲毉왢ꯏ쟦汭뵎汲뱲\uec6f뮢毗렖⮂봮⯎웞ꯜ뮖毉먞\uec72욶⯐욊殂뷺⯐벶ꮼ뵞\uec72먾⮡웊\ueba3쐾\uebcd왞\uec40뵆⯔뮮\uebc8쐆ꮢ먦殢뭢⯙벎\uec72뷆ⱳ웒\uec68뮦ꯍ붶걪쟚⯎쟚\uebd1뮂ꮹ뵶汱뱺ⱪ볾殡볎ꯞ붦殸쑊\ueba4믊毓붶Ɐ쐾\uebba윚汽렞\uec44욖ꯖ쟢건뮎\uec69윖⮤붾\uebd2뵞\uec72먎\uec71욆\uec71뮢ꯓ볾ⱨ먚Ɀ뵲ꮺ윾⯆뷖거뱒ꮁ쑊ⱄ먖\uec69붶거벂毐뱪\uebdb뮎毓왚⯟볦⯞먚⮺뷪\ueba0뷊걫쐺\uebd4욚건멂\uebc5쟞\uebd3먎汥웚ꯉ뮾毈쐲殶먖毇멎ⱀ봾⮤웊ꯈ볢每먺걾뵦汽봒\uebcb뷶ꯜ뮊⯙쟪ꯜ뵲ꯖ웦殁붒汯볲毘쟪\uec67벶⯜뮾⯚벆ⱱ욒⯑볾毉벒\uec7e뵺\uebd6윊毌왺\uebbb먪\uebba멊Ⱪ웊汴왢\uebc8붶\uebba왒⯍뱲\uebb8먖毆욂汄뷂⮺쐲ꮁ윶ꯆ왖걥뵲汳쟢\uebb6붊⯊믂ꯎ붮汴뱮\uebdc뭾ꯇ웊⯝뮲汯봆⮺붦ꯎ읆\uebdd웒ꯊ볎\uebba윎\uec7d왮\uebcb뵦\uec43뵲⮠벦ꯒ윎汯윪\uec6c뭢毇먖⮤뭞段웊걨뱪걦웾Ɐ뷦ꮢ뵶毋웪毟붚殡욪거벎殺웦⮹붚\uec72뱖Ⱬ웂\uebca쟚ⱱ쐾Ɱ왞⯚뵂ꯈ뱢걲윆毓벖殂볞毙볺\uebcf봪\uec6f볾毙볮比먊\uebb5뭶毌웦건뭶汩웮ꯑ욞Ɐ뷚毟뷢毒왪Ɐ볶\uebd7뵞\uec71왦殺먶毙뵲殶욊毘웺毖뮖\ueba4뱪⯇쟢殂쐶걽뷦⯇웎Ⱪ윪\ueba0쟖⯆붂ꯆ뷊ⱳ욺Ⱳ윺毟믊ꮹ쐾汥먆⮸웶⮻뵢Ɒ뮒毚벖걨뵎⮣뭢거쟶\uebcd붦ꮠ쟲\ueba1뮂⮤볖\ueba3볺汪쐎⯛벖\uec70욆ⱨ먒ⱃ뷆ⱃ봆\uebc7웶\uebb6믂殠믆\uebc9멊ꮼ벊毈웞\uec43먞Ⱨ웾毙뵚殻벖毛먶⯅벺⯉뵆\uebc8쟪汥쐾걃쑆\uec6b먆Ɑ뷆\uec68윒毋붺ꮂ뵮殷벞\uebd1욚ꯖ뵂毕벞汨뭲⯚뱶段붎ꯆ믂ꯖ웺汥웶ⱴ쑆\uebce욞汳욶걫왒殠먆汽윞毑뷞汪왢⯛쟾ꯘ벖\uebdb렦ꯙ붂⯌윶⮢뱪Ɀ뷶⯛뱲⮠봦殢뷺毌뵶汮뮪⮡벞\uebcc왢\uebd5왪\u001d\udb5a깥\uda2e귅\ue666ⷋ\udd0a\u2e72\udd7e깪\udb6e\u2e6f\ue44a\u2dd7\udd86\u2e72\ue66a湰\ue6d6\ueddf\ue7de\uedb9\ue69eⷑ\ue6ae\uedd3\udd42\u2dd7\ue6f6"
         .length();
      short var18 = 15998;
      String[] var10002 = new String[2];
      int var16 = 0;
      String[] var15 = var10002;
      int var14 = var10001;
      String var13 = "י먆\uebda욊ꯒ볂⯇쟢⯜붺ꯗ뭶\uebd2봢\uebcf뱚殠웖\uec72왶⮢봶Ɀ먮ⱳ쐶ꯖ붖걽뭺⯋벲ꮹ먲ⱄ뷂ⱄ볶毉뱪\uebc8렞\uebd4뷾ꯆ쐺毗웾毗먲ꯝ뷎\uec74웲\uebba욾\uebb5왒毝쟒殁먢\uebca윞\uebcc욪Ⱪ볾Ɑ뱖걭뵂\ueb82욮ꮼ볮ꯋ뮊\uec69윾殣쐂\uebcf붦\uec74먢ⱪ볖\ueba0뵾걾뮺毙뷆ⱦ뮦母볮\uec65쐾⮷믊毌믆\ueba4웖ꯋ뷖汦뵚ꯆ웎汲붺걧뱞걧벆ⱥ봊⯋웖\uebda먒⯇봶ⱱ윮\ueba4렖ꮢ볲毟렖汴벒⮂벒Ɒ믊\uec73붺毘먪걬봒\uec67뮾ꯉ웲\uebc8웶\uec40벺걽벒汭봚汰웚殡뵊汴왲걦뷾걫쑊⮤뱪⮷뵲毞읆⮻뮦ꯏ먪毚웮毈뷎毙뱺⯍붖ꯝ뷂毈볆ꯇ멎\uebbb욪\uec7f뷲汳볚汳벢\uebd6붎⯔뭚\uebc5뭒\uebc9뵺Ⱬ윆⯈웒⮠뭪걳뷢汬먒\ueba1웶汳붪\uec43벪毙벦\uebbc봺⯇왢ⱄ먮汀뵖汩쐂Ɀ붦\uec70붪ꯖ벪\uebc6벂毖먎毙벦ꯎ윎⮷뭪汦뵒\uec6d붺걨쟞\uebdf웖毆볞⯅뱚ꯉ윮\uebd1붶ꮻ볞ⱥ봖\ueba1읎⯏붞\uec6e왞\uec6f윶⯝뵒\uebd0욆\uebcd벪\uec66벾汭뱞\uebd0뭪汪윺⮼쟚ꯗ웎\uec68욾\uec72멆汩먪\uebc8뷲ꮣ먊汾볞汨렦⯝뷪殂멎\uebce붦걄쟮ⱴ벂ꮵ뭶比웢毙먢\uec6a쟞ꯈ쐾毇렒Ɐ렢ꯛ왪毑읆\uec6e벚汪쐆\uebc8뭒汽렖걮먾⯎볚\uebdd봒\uebd2욒毗뷺\uec72봒\uec73붲ꮢ뱲⮁윮\uec7e뱞汀먒ꯕ뵺殶렚段웊每봂毗웖毖뮒\uec69벢ꮡ봮汧렒毕먺\uebce왢걩읆\uebba웦\ueba2렢毞렒汥먖ꯔ읎毜윮汥욢⮤멆毚뮾\uebd7뷒ⱥ쑆\uec73왢毕윶걱뷲\uebcb윞⯗윂\uebd1뷂Ⱪ뮮Ⱪ웞殻뵞\uebb9봦걥뮚⯆멂汳먎\uebbc욾毞렦\uec73봒殣뷢殶욪걃웂\uec6d렦\uebb5뭦毎벶\uebce읆毋뷲⯇읎⯘뷮걀먾汫뷪毉욲毇욲\uec7d뭞毚웪\uec43읊汫봢\uebbb뮦毞붖ꯆ벆汫뭲Ⱨ윂殁뵪Ɐ읂ꯖ벶汴쐲毈뱖ⱳ뮪\uebda볒ⱃ욾毈욢⮡먎殹볒⯍웶殤왮⮁뱲汴뮺汄뮒殸먖殹벎汭쐆\uebd0쟾ⱥ뵦毖뭞\uebd9쏶殁윆毓벎걭붾ꯆ쟲\uebc5뭮汄윢毙쟒ꯈ뭲ꮶ욲ꯒ욪⯓봊ꮵ뷲\uebd4멆⯚볦\uec6a쟲\ueb81윂\uebb7붂毙쟮ꯟ뱶⮂봎ꯚ벊汃윆ⱽ욚\uec7e쐲\uebd1뷖걲봖\uec6a쟒ꯈ붆⮷왚⯍쑊汧뮒\uebbb렢⯕왢⯑뱺毖쟦ꯆ윂ꯜ뵚\uec6a뮺Ɱ뷾⮹쟢ꮹ붢毚뵚\uebd1멆\uec6c뷾ꮻ먲⯝뭚⯏뭞殼볢건먎毎뵪ꯏ욖殸볦⯅봂殸뱺汪뵲汫먾毟웮\uebb7벂\uebda붮ꮹ봞⮣뮚段뵮\uebba욆\uec7d봢걾붒汯뮪걪웒汃봺ꯞ뭚⯞뮒\uebd4뷊汬믆걿뱖ꯐ쟪\uec66뵺\ueba3뮦殤욞⯓뷢毛웎汦붞毟웢\uec71뱶汴쟲ꯞ뮪ꮶ먢ꯆ볚⮠욪比볶毜뵢毖벊\ueba3볖⯕뵶ꯕ뵚ꯞ뵚殁쟮\uebdb뱾\uebba읆ⱃ렮毓욲\uebc5렖\uebcf뵾\uebd1뮪\uec6b봶ꯇ쑂\uebde멊\uec7e볞⯌붖\uec7f벆\uebc6붶\ueba2볒毐먺ⱬ욖\uebd9뵆⯇벢\ueb81웂殻먒ꯏ쐎ꯘ왒\uec43붖汩붾ꯌ볾ꯎ뵦⯑뮮Ⱪ윦毗렮ꯋ먎毙욚Ɱ윖\uebd9윂ⱪ봊汰뭞毈볦걿윦\uebce욞\ueb81뮺ⱴ멎ꮻ먆⯖붲ⱬ쑆⮹뭾⯈욒ⱽ웮殤뱺汱뷲ⱀ렚\uebdc뵆ꮸ읊⯙웺\uec40쑂汬멎ⱬ먢ⱱ봞걄뷒\uebc8뵦\uebc9뱖毇쐾⯚쟞⯞먂毖뷊\uebca먢⮹뭖ꯆ윊殢벒걲벆殁뭞\uebcf볦毎웒汽봾殷뵞\uec6a봮\uec7f왲⮢뮒⮹욞⯓뮊⯇뵎ꮠ뮚걱먺汳윎毗뵂걨욒ⱦ볲汲왲ꮡ릖⮺먲\uebd6윊殁먶ꮻ믆\uebda쟺⯓렦\uebd3뮪ꯅ윮ꯟ쐆Ⱪ멊Ɀ뮒ⱄ뷎\ueba1웒⮼쟢\uebca렞Ɑ멎\uebd6멆⮡욮거뱢ꯗ붞\uec73웎\ueb82볢汪벮⯖뮢걱쟪毌뷦殼뵆\ueba0붎걦벲毉왢ꯏ쟦汭뵎汲뱲\uec6f뮢毗렖⮂봮⯎웞ꯜ뮖毉먞\uec72욶⯐욊殂뷺⯐벶ꮼ뵞\uec72먾⮡웊\ueba3쐾\uebcd왞\uec40뵆⯔뮮\uebc8쐆ꮢ먦殢뭢⯙벎\uec72뷆ⱳ웒\uec68뮦ꯍ붶걪쟚⯎쟚\uebd1뮂ꮹ뵶汱뱺ⱪ볾殡볎ꯞ붦殸쑊\ueba4믊毓붶Ɐ쐾\uebba윚汽렞\uec44욖ꯖ쟢건뮎\uec69윖⮤붾\uebd2뵞\uec72먎\uec71욆\uec71뮢ꯓ볾ⱨ먚Ɀ뵲ꮺ윾⯆뷖거뱒ꮁ쑊ⱄ먖\uec69붶거벂毐뱪\uebdb뮎毓왚⯟볦⯞먚⮺뷪\ueba0뷊걫쐺\uebd4욚건멂\uebc5쟞\uebd3먎汥웚ꯉ뮾毈쐲殶먖毇멎ⱀ봾⮤웊ꯈ볢每먺걾뵦汽봒\uebcb뷶ꯜ뮊⯙쟪ꯜ뵲ꯖ웦殁붒汯볲毘쟪\uec67벶⯜뮾⯚벆ⱱ욒⯑볾毉벒\uec7e뵺\uebd6윊毌왺\uebbb먪\uebba멊Ⱪ웊汴왢\uebc8붶\uebba왒⯍뱲\uebb8먖毆욂汄뷂⮺쐲ꮁ윶ꯆ왖걥뵲汳쟢\uebb6붊⯊믂ꯎ붮汴뱮\uebdc뭾ꯇ웊⯝뮲汯봆⮺붦ꯎ읆\uebdd웒ꯊ볎\uebba윎\uec7d왮\uebcb뵦\uec43뵲⮠벦ꯒ윎汯윪\uec6c뭢毇먖⮤뭞段웊걨뱪걦웾Ɐ뷦ꮢ뵶毋웪毟붚殡욪거벎殺웦⮹붚\uec72뱖Ⱬ웂\uebca쟚ⱱ쐾Ɱ왞⯚뵂ꯈ뱢걲윆毓벖殂볞毙볺\uebcf봪\uec6f볾毙볮比먊\uebb5뭶毌웦건뭶汩웮ꯑ욞Ɐ뷚毟뷢毒왪Ɐ볶\uebd7뵞\uec71왦殺먶毙뵲殶욊毘웺毖뮖\ueba4뱪⯇쟢殂쐶걽뷦⯇웎Ⱪ윪\ueba0쟖⯆붂ꯆ뷊ⱳ욺Ⱳ윺毟믊ꮹ쐾汥먆⮸웶⮻뵢Ɒ뮒毚벖걨뵎⮣뭢거쟶\uebcd붦ꮠ쟲\ueba1뮂⮤볖\ueba3볺汪쐎⯛벖\uec70욆ⱨ먒ⱃ뷆ⱃ봆\uebc7웶\uebb6믂殠믆\uebc9멊ꮼ벊毈웞\uec43먞Ⱨ웾毙뵚殻벖毛먶⯅벺⯉뵆\uebc8쟪汥쐾걃쑆\uec6b먆Ɑ뷆\uec68윒毋붺ꮂ뵮殷벞\uebd1욚ꯖ뵂毕벞汨뭲⯚뱶段붎ꯆ믂ꯖ웺汥웶ⱴ쑆\uebce욞汳욶걫왒殠먆汽윞毑뷞汪왢⯛쟾ꯘ벖\uebdb렦ꯙ붂⯌윶⮢뱪Ɀ뷶⯛뱲⮠봦殢뷺毌뵶汮뮪⮡벞\uebcc왢\uebd5왪\u001d\udb5a깥\uda2e귅\ue666ⷋ\udd0a\u2e72\udd7e깪\udb6e\u2e6f\ue44a\u2dd7\udd86\u2e72\ue66a湰\ue6d6\ueddf\ue7de\uedb9\ue69eⷑ\ue6ae\uedd3\udd42\u2dd7\ue6f6";
      int var17 = 0;

      do {
         char var19 = var13.charAt(var17);
         var10001 = var17 + 1;
         int var36 = var17 + 1;
         int var21 = 0;
         char[] var20 = var13.substring(var10001, var36 + var19).toCharArray();

         do {
            char var22 = var20[var21];
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

      IlIlI = var15;
      IlIll = new Object[var15.length];
      int var9 = -839453027;
      byte[] var7 = "-ywµx/5³éÀ9m¼c¿ýs²Ð¿\u0006b:\u0086O`\f\u00ad=\u0086\u0001l¹«Oíúpi`bÎ\rã\u0080%\u0019\"½)zå\r0\u00161ÅÄ^áÈ3ö\u00adÂ\u0092Èí¶\u001c4§\u008f\u0097!ç<jR5²ÅÁ\u001bó\u0017³\u0098öPcE$Ö\u0083«Ýn¶\u0007\u0089¯\t\u0019keÚ\u0000g¥3Hû\u0080ã\u0088\r\u009c\u0099\u0019\u0011Nçx\u008b}Â½ú½\u0010¯'Tä\u0098øãcR\u0004®\u0099½,çüÿrÔ\u0086B_7¡à*mÂÛ?%åñ(«Oó\u0006\u0097S±\u001a7;ð\f\u0081P:ÑÌ^ú\u0097r\u0014Ûân\tË\u001dÁ\u0080wç\u001fy\u0096\u0084O\u0004 à\u001e\u0016ç[F\u0010VËñ£a\u000e;\u0003E¯*SCÈ\u0017»ç\u0081=¨»·cÒ\u001a.Hl\u0082B«I/Y\u0017ÏÚ\u000f}1g\båí*p\u0007\u0085|ô\u0089A©\u0004uë//Ã4e\u0089:o\u009c&¸3FpZ\u000b1}ÑSo\u0083]½\u009b¢ËwQ©L\u0096Gµã\u009f\u0004\u008d1\u0090Dòk@\nn/Ì'\u00ad#öÊÙÈß»ÕWÅË×\"wzo¿yö+åì*{´VJÏV\u009d$\u0007H\u009b\u000f\u0004Oß¡ëÑÝ\u001e'ylª\u0089\u009c\u007f\u008b\u0099\u0090ó²zú]ô\u008a*(`÷2ùI¥\u0001Q{O\u000b:I9§*t\u0094Ç£j1#èÍW<ds\u000bªÙ¹\u0086ø1ÕÌ\u0017wÿ\u000b\u008an½H\u007fii/+|\u007f\u0086?\u008dÂñ\u009f\u0085\u008a!7{WZ\u0088\u0084÷³â\fºG 4\u0011µl>\u001b!\u001f^$~(:Û\u009aém\u0011Ê\u0002Ôá\u001d\u0081·+Ìý~Y\u0094P\u008a\u0083Jô\u0087½\u0086\f\u0004\u001d\u0086y¤îö\u009cae\u0097Ó¸Ú\u000f¬\u0005âz\u0096\u0088ÀÙo{ü\rAscÖÍDêÎÂ4¢Ä!E\u00adûv<½ëL\u0001¦:4¬«*`nd\u0000;ÁòÜa&\u0007\u0089Ç\u0090\u0088'\u0019\u0015Drq¤qUó#R¦5;§É>\u008cyË®®qFØ}ðÇ®j(\u0007[35)t®\u0089\u008cEb\u0087Y\n-\u009c³¤\n\u000e½Ù\u0012Ãïm8\u0019xQý\u001f±\u008fÌ>\u0019\u0087·rYÝwr£\u000e\u0002TF{÷\u0086\u0096\u009c(C\u0083ê¥uk¨ç|ö\u007fKN*\u0098¬íÏ?o°ÄÉ\u0087þ³ÊLç\u000bàCRT\u0002RÜÙ|dÝÚÛ_|yei¡ýGÈª\u0007\u0081)\u0090 ê\u00982ªEÁbD3;2f\u0099l\u0002S\u009b?¹?\u0018B\u0012ìNÇí¶\u0099U÷®\u0097\u0095M¯Ï\u009aé\u0099o\u0092ÔÁ:&\u0094OKthà\u0084\u0081ÓTbÙ'pì{Ñ\u008b]\u0083½ m¢Ì\u000e\u001fT{\tÙç\u001fk\u009a\u0099æÒ*Û\t)9i²£ã\u0084:««<i\u008fm\u0090\u0086z1â³\nt¶<\u0080±\u0004\u0085T\u0095¾\u009bdúL\r\u0000ËÒ\u0089&\u0007Ë\u0090C\u0016Ê1`Ù§\u0098¾\r¶4 zO\u0011y=kÀD9\u0014IqÔe\u0000O\u001bÏÓ:ë\u008fõA©Jø±-Ú0\u009cý\u00977Æê_\r\u0099-Ýe~\u0091\u0004\u0093â?%\u0095ÁÓ.½3þ û´\u0014H\u0093\u0087_\u009aë\u0080V\u001aìM\u0082È\u0016ÐÖ_WJ\u0010¿A_s©¾\u0010¬a\u008f\u0013Ó\u008d©¹âÁ\u001d\u0080íøNF\u001dLÔîÞ\u008dð\u001f\u001aÈ\u0004\u0089r\u0017ýü(\u0010YH\u007fZY\u001ao\u009cáC=*\u000bãa\u0004^Y0¥I\u001b\u0014Úà@ïþ:YLW\rô7@ös»\u000b!ªàÑÂ²\u0093mÑµÀtý;}\rDÐ\u0090b\u0097\u0019²\u0096î\u0007Ê¿*liÐz¸ö2ñNÃ\\Gùä\u0094Þ\"T¶>®«\u0081\u001b\u0003\u008b´gkOq\u0083Zlæ5\u009d\u008bÒö\u001eàøMQ¼7\u007f\u0013\u009a¬\u0013\f\u0001ZÔË\u001bÕðÁývµço\u008a*\u0010ø|\u000e£¹\u0083\u001e}\u0019ù\u0019u\u001d¹²k\u0019\u0095*ÏsM5µHº\u0004So\u000bÂq[m\u0087 ÇÂ¨\u001c<\u008f\"ÁXd\u0089¯\tL \u0082\u0083ð\u009bÜ\u0016¼;ö\u000f¹\u000f9D\rña÷Z\f\u0015Ûºå°\u001caè3Â º\u0000\u00181_\u001e\u0019é\u008d\"\tàû\u008dT(Puv\u0090v4wK\u0003DÙèx9\u0010èéz¸E^öQ@)3JÍÈ\u0087\u008bK\u008e\u00adÇt\u0082è\u001dn9\u0013È¢r9\u008bM\u0015kñ\u0014\u0002\u0002-\u009f\u0097\u0084géU\u0001\fz\u0001\u0094zëªoÑÖª\u0091{\u001co«ß\u009f\\ÿPÉq:'8\u0085$ð\u0018ö5r¥i`¥\u0012mPÕæ\"\u008eÃ\u00108×@©\u0086e)6o\\ò1iÐ+r\u008a!\u0004\u00addÛð\u00807\u0092½öL \u0086imz»«\u0088¿\u00adÞT\u0099ô\u009e)\u0099óÀ\rb¸\u0088íd^û¼Z\u008e¯I*u½\u0010æ\u0084§\u009b\u008dÎsü\b\u009c\u0093}F©&ý\u0089\u001f%&KÙ\u0089wÕÙï\u0087Q¶ ÿÂ¹pP\u001b\u0093*jTÜ\u0019n\u0006Å\u00ade$\u001ez\u009a\u00824\u0097\u001fu^Sb1ùÔ\bS£ ?\u0081\u00ad\u0084Îl\u000e¹MÜÛ¿\u000föû4\b®F\u0014\u0089)KýîÑ¢Ñ\u0006×\u007f\u0084é\u001dC\u0007´\u0013²ZjÎ\u009c\u0092×,ÝH<?o~\\Ö%ÕÜ¡ýLwGÅqhaðX\u000b½\r\u0090Éÿ¯é]lò\"c}f® \u001fì¬\u0019c\u0082#ØQËÁ÷#\u0098ÊÆOq·/v1)HiÜ\u00148}r\n\u000f\u0015\u007f\u009eÐ\u0093a\u0088\u0006"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      IlIIl = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         IlIIl[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var5 = new String[lIlll(-975560759, var23 ^ 1020102978)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = llIII((short)'댧', 37980, var23 ^ -1541865902)).length();
      int var1 = lIlll(-975560760, var23 ^ 1660877914);
      int var25 = -1;

      label89:
      while (true) {
         int var10000 = lIlll(-975560757, var23 ^ 1327354964);
         String var29 = var2.substring(++var25, var25 + var1);
         byte var37 = -1;

         while (true) {
            label84: {
               char[] var46 = var29.toCharArray();
               int var10004 = var46.length;
               int var6 = 0;
               int var49 = var10000;
               var42 = var46;
               var10001 = var10004;
               char[] var58;
               int var10006;
               if (var10004 <= 1) {
                  var58 = var46;
                  var10004 = var10000;
                  var10006 = var6;
               } else {
                  var49 = var10000;
                  var10001 = var10004;
                  if (var10004 <= var6) {
                     break label84;
                  }

                  var58 = var46;
                  var10004 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var58[var10006] = (char)(var58[var10006] ^ var10004 ^ switch (var6 % lIlll(-975560761, var23 ^ 381495725)) {
                     case 0 -> lIlll(-975560762, var23 ^ 169692839);
                     case 1 -> 4;
                     case 2 -> lIlll(-975560767, var23 ^ 480978326);
                     case 3 -> lIlll(-975560768, var23 ^ -1041880246);
                     case 4 -> lIlll(-975560765, var23 ^ -2024251091);
                     case 5 -> lIlll(-975560766, var23 ^ -230392789);
                     default -> lIlll(-975560739, var23 ^ 233567698);
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
                     IIll = var5;
                     Illl = new String[lIlll(-975560764, var23 ^ 947993155)];
                     IIllI = IlIIllIII.Ill(lll(lIlll(-975560740, var23 ^ -147519647), lIlll(-975560737, var23 ^ -1805312819)));
                     Ill = IlIIllIII.Ill(lll(lIlll(-975560738, var23 ^ -265000959), lIlll(-975560743, var23 ^ 1265370919)));
                     II = IlIIllIII.Ill(lll(lIlll(-975560744, var23 ^ -606347890), lIlll(-975560741, var23 ^ 504426973)));
                     IlI = IlIIllIII.Ill(lll(lIlll(-975560742, var23 ^ -1090507495), lIlll(-975560747, var23 ^ -667143920)));
                     IIlIl = IlIIllIII.Ill(lll(lIlll(-975560748, var23 ^ -1860708788), lIlll(-975560745, var23 ^ -1488426981)));
                     IlII = IlIIllIII.Ill(lll(lIlll(-975560746, var23 ^ 1046614736), lIlll(-975560751, var23 ^ 1384207996)));
                     lIlI = IlIIllIII.Ill(lll(lIlll(-975560752, var23 ^ 1228779823), lIlll(-975560749, var23 ^ 525779338)));
                     lll = IlIIllIII.Ill(lll(lIlll(-975560750, var23 ^ 416256984), lIlll(-975560787, var23 ^ 1613515245)));
                     IIlll = IlIIllIII.Ill(lll(lIlll(-975560788, var23 ^ -459063473), lIlll(-975560785, var23 ^ 341732336)));
                     IIIlI = IlIIllIII.Ill(lll(lIlll(-975560786, var23 ^ 1072253687), lIlll(-975560791, var23 ^ -1726989354)));
                     lIl = ConcurrentHashMap.newKeySet();
                     lI = ConcurrentHashMap.newKeySet();
                     IlIl = new ConcurrentHashMap<>();
                     llIl = ThreadLocal.withInitial(IlllI::IIIll);
                     IIIIl = new ConcurrentLinkedQueue<>();
                     return;
                  }

                  var1 = var2.charAt(var25);
                  break;
               default:
                  var5[var3++] = var51;
                  if ((var25 += var1) < var4) {
                     var1 = var2.charAt(var25);
                     continue label89;
                  }

                  var4 = (var2 = llIII((short)2472, 37981, var23 ^ 651476417)).length();
                  var1 = lIlll(-975560758, var23 ^ 977778893);
                  var25 = -1;
            }

            var10000 = lIlll(-975560763, var23 ^ 789549058);
            var29 = var2.substring(++var25, var25 + var1);
            var37 = 0;
         }
      }
   }

   public boolean Ill(String var1) {
      int var3 = -2081777940;
      if (var1 != null && !var1.isEmpty()) {
         String var2 = var1.toLowerCase();
         return var2.contains(IlIIllIII.lI(lll(lIlll(-975560792, var3 ^ 1384203259), lIlll(-975560789, var3 ^ 73619540))))
            || var2.contains(IlIIllIII.lI(lll(lIlll(-975560790, var3 ^ 166208491), lIlll(-975560795, var3 ^ -144364055))))
            || var2.contains(IlIIllIII.lI(lll(lIlll(-975560796, var3 ^ -688781480), lIlll(-975560793, var3 ^ -579482157))));
      } else {
         return false;
      }
   }

   public boolean lII(String var1) {
      int var3 = 1231296141;
      if (this.Il() && var1 != null) {
         String var2 = var1.toLowerCase();
         return var2.startsWith(IlIIllIII.lI(lll(lIlll(-975560794, var3 ^ 190083008), lIlll(-975560799, var3 ^ 864523692))))
            || var2.startsWith(IlIIllIII.lI(lll(lIlll(-975560800, var3 ^ 1289531602), lIlll(-975560797, var3 ^ -795237424))))
            || var2.startsWith(IlIIllIII.lI(lll(lIlll(-975560798, var3 ^ 328467992), lIlll(-975560771, var3 ^ 1736395128))))
            || var2.equals(IlIIllIII.lI(lll(lIlll(-975560772, var3 ^ 1809855749), lIlll(-975560769, var3 ^ 1771378567))))
            || var2.equals(IlIIllIII.lI(lll(lIlll(-975560770, var3 ^ -787969662), lIlll(-975560775, var3 ^ -1789742897))))
            || var2.equals(IlIIllIII.lI(lll(lIlll(-975560776, var3 ^ -989616507), lIlll(-975560773, var3 ^ 1910585637))))
            || var2.equals(IlIIllIII.lI(lll(lIlll(-975560774, var3 ^ -1174443158), lIlll(-975560779, var3 ^ -1158024772))))
            || var2.equals(IlIIllIII.lI(lll(lIlll(-975560780, var3 ^ 1432759650), lIlll(-975560777, var3 ^ -1714508795))))
            || var2.equals(IlIIllIII.lI(lll(lIlll(-975560778, var3 ^ 925601790), lIlll(-975560783, var3 ^ 656892412))))
            || var2.equals(IlIIllIII.lI(lll(lIlll(-975560784, var3 ^ -1001542244), lIlll(-975560781, var3 ^ 882683288))))
            || var2.equals(IlIIllIII.lI(lll(lIlll(-975560782, var3 ^ 1233455414), lIlll(-975560819, var3 ^ 464945838))));
      } else {
         return false;
      }
   }

   public boolean lIl() {
      return this.lIll.IllI();
   }

   public static void llI(List<class_2960> var0) {
      String[] var1 = llIllIlI.IIlII();
      if (var0 != null && !var0.isEmpty()) {
         StringBuilder var2 = new StringBuilder();

         for (class_2960 var4 : var0) {
            if (var2.length() > 0) {
               var2.append(IlIIllIII.lI(lll(lIlll(-975560820, -1477309400 ^ 522899638), lIlll(-975560817, -1477309400 ^ 1770416885))));
            }

            var2.append(var4.toString());
            if (var1 == null) {
               break;
            }
         }

         String var10000 = IlIIllIII.lI(lll(lIlll(-975560818, -1477309400 ^ -991540937), lIlll(-975560823, -1477309400 ^ 1627546606)));
         String var10 = String.valueOf(var2);
         String var9 = var10000;
         IIlI(var9 + var10);
         String var11 = IIllI.llIl();
         if (lIlII(var0, var11) && IIIII(var11)) {
            long var12 = System.currentTimeMillis();
            Long var6 = IlIl.get(var11);
            if (var6 == null || var12 - var6 >= 10000L) {
               IlIl.put(var11, var12);
               IIIIIllII var7 = IIIIIllII.III();
               IlllI var8 = var7 != null && var7.II() != null ? var7.II().IIllll() : null;
               if (var8 != null) {
                  var8.llII(lIll());
               }
            }
         }
      }
   }

   private static String lll(int var0, int var1) {
      int var9 = 1513360134;
      int var2 = (var0 ^ lIlll(-975560824, var9 ^ -86275819)) & lIlll(-975560821, var9 ^ 1504850079);
      if (Illl[var2] == null) {
         char[] var3 = IIll[var2].toCharArray();

         int var4 = switch (var3[0] & lIlll(-975560822, var9 ^ 723507186)) {
            case 0 -> lIlll(-975560827, var9 ^ 1643157023);
            case 1 -> lIlll(-975560828, var9 ^ -1502771200);
            case 2 -> lIlll(-975560825, var9 ^ -442986580);
            case 3 -> lIlll(-975560826, var9 ^ -2100520242);
            case 4 -> lIlll(-975560831, var9 ^ 735603694);
            case 5 -> lIlll(-975560832, var9 ^ 1551393673);
            case 6 -> lIlll(-975560829, var9 ^ -1932485313);
            case 7 -> lIlll(-975560830, var9 ^ -143695169);
            case 8 -> lIlll(-975560803, var9 ^ 503704082);
            case 9 -> lIlll(-975560804, var9 ^ -356003164);
            case 10 -> lIlll(-975560801, var9 ^ 411818166);
            case 11 -> lIlll(-975560802, var9 ^ -1929856920);
            case 12 -> lIlll(-975560807, var9 ^ -741352310);
            case 13 -> lIlll(-975560808, var9 ^ 923698233);
            case 14 -> lIlll(-975560805, var9 ^ 1743073881);
            case 15 -> lIlll(-975560806, var9 ^ -1335468544);
            case 16 -> lIlll(-975560811, var9 ^ 1629134769);
            case 17 -> lIlll(-975560812, var9 ^ 968322128);
            case 18 -> lIlll(-975560809, var9 ^ -418160216);
            case 19 -> lIlll(-975560810, var9 ^ 736879123);
            case 20 -> lIlll(-975560815, var9 ^ 731791941);
            case 21 -> lIlll(-975560816, var9 ^ 1534822237);
            case 22 -> lIlll(-975560813, var9 ^ 976509218);
            case 23 -> lIlll(-975560814, var9 ^ -1572084713);
            case 24 -> lIlll(-975560851, var9 ^ -680433189);
            case 25 -> lIlll(-975560852, var9 ^ 1955107348);
            case 26 -> lIlll(-975560849, var9 ^ -1599695403);
            case 27 -> lIlll(-975560850, var9 ^ 2066391727);
            case 28 -> lIlll(-975560855, var9 ^ 1663425912);
            case 29 -> lIlll(-975560856, var9 ^ 1774625587);
            case 30 -> 3;
            case 31 -> lIlll(-975560853, var9 ^ 1452397920);
            case 32 -> lIlll(-975560854, var9 ^ 1185671162);
            case 33 -> lIlll(-975560859, var9 ^ -1747760596);
            case 34 -> lIlll(-975560860, var9 ^ -2021160812);
            case 35 -> lIlll(-975560857, var9 ^ -1378080851);
            case 36 -> lIlll(-975560858, var9 ^ 1904656576);
            case 37 -> lIlll(-975560863, var9 ^ 606107152);
            case 38 -> lIlll(-975560864, var9 ^ -1963003026);
            case 39 -> lIlll(-975560861, var9 ^ -543800631);
            case 40 -> lIlll(-975560862, var9 ^ -132856362);
            case 41 -> lIlll(-975560835, var9 ^ 198367917);
            case 42 -> 1;
            case 43 -> lIlll(-975560836, var9 ^ 1691970100);
            case 44 -> lIlll(-975560833, var9 ^ 1716078832);
            case 45 -> lIlll(-975560834, var9 ^ -348152580);
            case 46 -> lIlll(-975560839, var9 ^ 1783204651);
            case 47 -> lIlll(-975560840, var9 ^ -1430465104);
            case 48 -> lIlll(-975560837, var9 ^ -2070722439);
            case 49 -> lIlll(-975560838, var9 ^ 564299003);
            case 50 -> lIlll(-975560843, var9 ^ -185742431);
            case 51 -> lIlll(-975560844, var9 ^ 507767947);
            case 52 -> lIlll(-975560841, var9 ^ 272561310);
            case 53 -> lIlll(-975560842, var9 ^ 1116397239);
            case 54 -> lIlll(-975560847, var9 ^ -709485758);
            case 55 -> lIlll(-975560848, var9 ^ 476588575);
            case 56 -> 2;
            case 57 -> lIlll(-975560845, var9 ^ -1268756159);
            case 58 -> lIlll(-975560846, var9 ^ -197488147);
            case 59 -> lIlll(-975560883, var9 ^ 250209307);
            case 60 -> lIlll(-975560884, var9 ^ -342093563);
            case 61 -> 0;
            case 62 -> lIlll(-975560881, var9 ^ 997969537);
            case 63 -> lIlll(-975560882, var9 ^ 772621170);
            case 64 -> lIlll(-975560887, var9 ^ -967900899);
            case 65 -> lIlll(-975560888, var9 ^ 1536732501);
            case 66 -> lIlll(-975560885, var9 ^ -2021701120);
            case 67 -> lIlll(-975560886, var9 ^ 1658357320);
            case 68 -> lIlll(-975560891, var9 ^ 1764648643);
            case 69 -> lIlll(-975560892, var9 ^ 506309209);
            case 70 -> lIlll(-975560889, var9 ^ -1509448396);
            case 71 -> lIlll(-975560890, var9 ^ -102386601);
            case 72 -> lIlll(-975560895, var9 ^ 1956348553);
            case 73 -> lIlll(-975560896, var9 ^ 2000468427);
            case 74 -> lIlll(-975560893, var9 ^ -729644961);
            case 75 -> lIlll(-975560894, var9 ^ 1352675006);
            case 76 -> lIlll(-975560867, var9 ^ -1436102658);
            case 77 -> lIlll(-975560868, var9 ^ -1928495377);
            case 78 -> lIlll(-975560865, var9 ^ 128067514);
            case 79 -> lIlll(-975560866, var9 ^ -371925698);
            case 80 -> lIlll(-975560871, var9 ^ -880898770);
            case 81 -> lIlll(-975560872, var9 ^ -25370990);
            case 82 -> lIlll(-975560869, var9 ^ -1828740078);
            case 83 -> lIlll(-975560870, var9 ^ 1101603129);
            case 84 -> lIlll(-975560875, var9 ^ 461288242);
            case 85 -> lIlll(-975560876, var9 ^ 57703586);
            case 86 -> lIlll(-975560873, var9 ^ 36205318);
            case 87 -> lIlll(-975560874, var9 ^ 881357800);
            case 88 -> lIlll(-975560879, var9 ^ 1826472031);
            case 89 -> lIlll(-975560880, var9 ^ -492006732);
            case 90 -> lIlll(-975560877, var9 ^ 1298360093);
            case 91 -> lIlll(-975560878, var9 ^ -108707843);
            case 92 -> lIlll(-975560915, var9 ^ -586441377);
            case 93 -> lIlll(-975560916, var9 ^ 649749895);
            case 94 -> lIlll(-975560913, var9 ^ 227165075);
            case 95 -> lIlll(-975560914, var9 ^ -1543982386);
            case 96 -> lIlll(-975560919, var9 ^ -1539440342);
            case 97 -> lIlll(-975560920, var9 ^ -964857743);
            case 98 -> lIlll(-975560917, var9 ^ 2144156987);
            case 99 -> lIlll(-975560918, var9 ^ -2065789106);
            case 100 -> lIlll(-975560923, var9 ^ 235168323);
            case 101 -> lIlll(-975560924, var9 ^ 105699854);
            case 102 -> lIlll(-975560921, var9 ^ 579499655);
            case 103 -> lIlll(-975560922, var9 ^ -673840015);
            case 104 -> lIlll(-975560927, var9 ^ -1483517935);
            case 105 -> lIlll(-975560928, var9 ^ 760669660);
            case 106 -> lIlll(-975560925, var9 ^ -109946780);
            case 107 -> lIlll(-975560926, var9 ^ -920802680);
            case 108 -> lIlll(-975560899, var9 ^ -1389612070);
            case 109 -> lIlll(-975560900, var9 ^ -1948242574);
            case 110 -> lIlll(-975560897, var9 ^ -286184296);
            case 111 -> lIlll(-975560898, var9 ^ -851557954);
            case 112 -> lIlll(-975560903, var9 ^ 334123211);
            case 113 -> lIlll(-975560904, var9 ^ -1919047242);
            case 114 -> lIlll(-975560901, var9 ^ -723874459);
            case 115 -> lIlll(-975560902, var9 ^ -371264772);
            case 116 -> lIlll(-975560907, var9 ^ -600603583);
            case 117 -> lIlll(-975560908, var9 ^ -486789496);
            case 118 -> lIlll(-975560905, var9 ^ -1760794114);
            case 119 -> lIlll(-975560906, var9 ^ -330388272);
            case 120 -> lIlll(-975560911, var9 ^ 483015874);
            case 121 -> lIlll(-975560912, var9 ^ 823816477);
            case 122 -> lIlll(-975560909, var9 ^ 1796061441);
            case 123 -> lIlll(-975560910, var9 ^ 885668915);
            case 124 -> lIlll(-975560947, var9 ^ -747182619);
            case 125 -> lIlll(-975560948, var9 ^ 1339605983);
            case 126 -> lIlll(-975560945, var9 ^ 1815398485);
            case 127 -> lIlll(-975560946, var9 ^ -1642510606);
            case 128 -> lIlll(-975560951, var9 ^ 435400325);
            case 129 -> lIlll(-975560952, var9 ^ 716733635);
            case 130 -> lIlll(-975560949, var9 ^ 766639207);
            case 131 -> lIlll(-975560950, var9 ^ -530239999);
            case 132 -> lIlll(-975560955, var9 ^ 2100410743);
            case 133 -> lIlll(-975560956, var9 ^ -403220154);
            case 134 -> lIlll(-975560953, var9 ^ -225161406);
            case 135 -> lIlll(-975560954, var9 ^ -1119123566);
            case 136 -> lIlll(-975560959, var9 ^ -1103860943);
            case 137 -> lIlll(-975560960, var9 ^ 335880319);
            case 138 -> lIlll(-975560957, var9 ^ 755637829);
            case 139 -> lIlll(-975560958, var9 ^ -335893996);
            case 140 -> lIlll(-975560931, var9 ^ 1127836482);
            case 141 -> lIlll(-975560932, var9 ^ -1292030323);
            case 142 -> lIlll(-975560929, var9 ^ 613806414);
            case 143 -> lIlll(-975560930, var9 ^ 1372583588);
            case 144 -> lIlll(-975560935, var9 ^ -442975012);
            case 145 -> lIlll(-975560936, var9 ^ -1215792598);
            case 146 -> lIlll(-975560933, var9 ^ -287650687);
            case 147 -> lIlll(-975560934, var9 ^ 1317462634);
            case 148 -> lIlll(-975560939, var9 ^ -187219128);
            case 149 -> lIlll(-975560940, var9 ^ -1225573483);
            case 150 -> lIlll(-975560937, var9 ^ -318236447);
            case 151 -> lIlll(-975560938, var9 ^ -190074397);
            case 152 -> lIlll(-975560943, var9 ^ 1506846306);
            case 153 -> lIlll(-975560944, var9 ^ -564336035);
            case 154 -> lIlll(-975560941, var9 ^ 117913503);
            case 155 -> lIlll(-975560942, var9 ^ 527731469);
            case 156 -> lIlll(-975560979, var9 ^ 405249198);
            case 157 -> lIlll(-975560980, var9 ^ -1768232436);
            case 158 -> lIlll(-975560977, var9 ^ 2104984938);
            case 159 -> lIlll(-975560978, var9 ^ -1269468766);
            case 160 -> lIlll(-975560983, var9 ^ -1439868854);
            case 161 -> lIlll(-975560984, var9 ^ -1047644302);
            case 162 -> lIlll(-975560981, var9 ^ 353490199);
            case 163 -> lIlll(-975560982, var9 ^ -484131992);
            case 164 -> lIlll(-975560987, var9 ^ 1409512240);
            case 165 -> lIlll(-975560988, var9 ^ -1884073721);
            case 166 -> lIlll(-975560985, var9 ^ 55338690);
            case 167 -> lIlll(-975560986, var9 ^ -1368632482);
            case 168 -> lIlll(-975560991, var9 ^ -962030019);
            case 169 -> lIlll(-975560992, var9 ^ -141884988);
            case 170 -> lIlll(-975560989, var9 ^ 812398036);
            case 171 -> lIlll(-975560990, var9 ^ -1291378888);
            case 172 -> lIlll(-975560963, var9 ^ -61087945);
            case 173 -> lIlll(-975560964, var9 ^ -1099085003);
            case 174 -> lIlll(-975560961, var9 ^ -1578713823);
            case 175 -> lIlll(-975560962, var9 ^ 1727804786);
            case 176 -> lIlll(-975560967, var9 ^ 1813680503);
            case 177 -> lIlll(-975560968, var9 ^ 1250454193);
            case 178 -> lIlll(-975560965, var9 ^ -1122002091);
            case 179 -> lIlll(-975560966, var9 ^ 241066893);
            case 180 -> lIlll(-975560971, var9 ^ -788652383);
            case 181 -> lIlll(-975560972, var9 ^ -654680573);
            case 182 -> lIlll(-975560969, var9 ^ -956402988);
            case 183 -> lIlll(-975560970, var9 ^ 1653910227);
            case 184 -> lIlll(-975560975, var9 ^ 414145852);
            case 185 -> lIlll(-975560976, var9 ^ -24581070);
            case 186 -> lIlll(-975560973, var9 ^ -591623645);
            case 187 -> lIlll(-975560974, var9 ^ 220210552);
            case 188 -> lIlll(-975561011, var9 ^ -1311021046);
            case 189 -> lIlll(-975561012, var9 ^ 1824490244);
            case 190 -> lIlll(-975561009, var9 ^ 49196029);
            case 191 -> lIlll(-975561010, var9 ^ 795088838);
            case 192 -> lIlll(-975561015, var9 ^ 1911643277);
            case 193 -> lIlll(-975561016, var9 ^ 1541955118);
            case 194 -> lIlll(-975561013, var9 ^ -1801196897);
            case 195 -> lIlll(-975561014, var9 ^ -871318249);
            case 196 -> lIlll(-975561019, var9 ^ -1204003377);
            case 197 -> lIlll(-975561020, var9 ^ 503023149);
            case 198 -> lIlll(-975561017, var9 ^ -1641691203);
            case 199 -> lIlll(-975561018, var9 ^ -1375742344);
            case 200 -> lIlll(-975561023, var9 ^ -1275197123);
            case 201 -> lIlll(-975561024, var9 ^ -1880225938);
            case 202 -> lIlll(-975561021, var9 ^ 548655064);
            case 203 -> lIlll(-975561022, var9 ^ -661555223);
            case 204 -> lIlll(-975560995, var9 ^ -1718571890);
            case 205 -> lIlll(-975560996, var9 ^ -381808646);
            case 206 -> lIlll(-975560993, var9 ^ -1795747902);
            case 207 -> lIlll(-975560994, var9 ^ -681598246);
            case 208 -> lIlll(-975560999, var9 ^ 1538695312);
            case 209 -> 5;
            case 210 -> lIlll(-975561000, var9 ^ -1632819799);
            case 211 -> lIlll(-975560997, var9 ^ 711765018);
            case 212 -> lIlll(-975560998, var9 ^ 2134943);
            case 213 -> lIlll(-975561003, var9 ^ 1174047036);
            case 214 -> lIlll(-975561004, var9 ^ -1104198324);
            case 215 -> lIlll(-975561001, var9 ^ -1804817691);
            case 216 -> lIlll(-975561002, var9 ^ -971574277);
            case 217 -> lIlll(-975561007, var9 ^ -1345685381);
            case 218 -> lIlll(-975561008, var9 ^ 696258198);
            case 219 -> lIlll(-975561005, var9 ^ -1393844795);
            case 220 -> lIlll(-975561006, var9 ^ 966593724);
            case 221 -> lIlll(-975561043, var9 ^ -1036635901);
            case 222 -> lIlll(-975561044, var9 ^ 1016921262);
            case 223 -> lIlll(-975561041, var9 ^ 104364254);
            case 224 -> lIlll(-975561042, var9 ^ 1387735479);
            case 225 -> lIlll(-975561047, var9 ^ -1748967457);
            case 226 -> lIlll(-975561048, var9 ^ -1994915958);
            case 227 -> lIlll(-975561045, var9 ^ -1735048660);
            case 228 -> lIlll(-975561046, var9 ^ -851249843);
            case 229 -> lIlll(-975561051, var9 ^ -47054456);
            case 230 -> lIlll(-975561052, var9 ^ 589625260);
            case 231 -> lIlll(-975561049, var9 ^ 2057784853);
            case 232 -> lIlll(-975561050, var9 ^ -925970117);
            case 233 -> lIlll(-975561055, var9 ^ -250227068);
            case 234 -> lIlll(-975561056, var9 ^ 2110558804);
            case 235 -> lIlll(-975561053, var9 ^ -1931261428);
            case 236 -> lIlll(-975561054, var9 ^ 1981245388);
            case 237 -> lIlll(-975561027, var9 ^ 1062867365);
            case 238 -> lIlll(-975561028, var9 ^ 224496021);
            case 239 -> lIlll(-975561025, var9 ^ -681816864);
            case 240 -> lIlll(-975561026, var9 ^ 306854170);
            case 241 -> lIlll(-975561031, var9 ^ 873690666);
            case 242 -> lIlll(-975561032, var9 ^ 873735987);
            case 243 -> lIlll(-975561029, var9 ^ -815832854);
            case 244 -> lIlll(-975561030, var9 ^ -910615549);
            case 245 -> lIlll(-975561035, var9 ^ -144095068);
            case 246 -> lIlll(-975561036, var9 ^ -2020451759);
            case 247 -> lIlll(-975561033, var9 ^ 1264795897);
            case 248 -> lIlll(-975561034, var9 ^ 539595564);
            case 249 -> lIlll(-975561039, var9 ^ -1518635838);
            case 250 -> lIlll(-975561040, var9 ^ -347160143);
            case 251 -> lIlll(-975561037, var9 ^ 620282489);
            case 252 -> lIlll(-975561038, var9 ^ -432116179);
            case 253 -> lIlll(-975561075, var9 ^ 2017331445);
            case 254 -> lIlll(-975561076, var9 ^ -61749417);
            default -> 4;
         };
         int var5 = (var1 & lIlll(-975561073, var9 ^ 1868470130)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & lIlll(-975561074, var9 ^ 1233896009)) >>> lIlll(-975561079, var9 ^ -113512111)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & lIlll(-975561080, var9 ^ -1423816128);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & lIlll(-975561077, var9 ^ -1980129860);
            }
         }

         Illl[var2] = new String(var3).intern();
      }

      return Illl[var2];
   }

   public static byte[] IIII(int var0) {
      int var8 = 2120263181;
      ByteArrayOutputStream var1 = new ByteArrayOutputStream(lIlll(-975561078, var8 ^ 193453360));
      var1.write(lIlll(-975561083, var8 ^ -51571111));
      II(var1, var0);
      String[] var2 = lIlI.llIl().split(IlIIllIII.lI(lll(lIlll(-975561084, var8 ^ -1203071626), lIlll(-975561081, var8 ^ -636457110))));
      II(var1, var2.length);

      for (String var6 : var2) {
         int var7 = var6.indexOf(IlIIllIII.lI(lll(lIlll(-975561082, var8 ^ 136234249), lIlll(-975561087, var8 ^ -440570172))).charAt(0));
         IIlII(var1, var7 > 0 ? var6.substring(0, var7) : var6);
         IIlII(var1, var7 > 0 && var7 + 1 < var6.length() ? var6.substring(var7 + 1) : IlIIllIII.lI(""));
      }

      return var1.toByteArray();
   }

   public boolean IIIl(String var1) {
      return var1 != null && this.I.IllI() == IIIllIlII.l ? IlllI() && var1.startsWith(Ill.llIl()) : false;
   }

   public static void IIlI(String var0) {
      IIIIIllII var1 = IIIIIllII.III();
      if (var1 != null && var1.II() != null) {
         IlllI var2 = var1.II().IIllll();
         if (var2 != null && var2.IIIIlIl() && var2.lllI()) {
            class_310 var3 = class_310.method_1551();
            if (var3 != null && var3.field_1724 != null) {
               class_746 var10000 = var3.field_1724;
               String var4 = IlIIllIII.lI(lll(lIlll(-975561088, -1594892219 ^ -1947748298), lIlll(-975561085, -1594892219 ^ -1580755006)));
               var10000.method_7353(class_2561.method_43470(var4 + var0), true);
               return;
            }

            IIIIl.offer(var0);
         }
      }
   }

   public static boolean IIll() {
      Boolean var0 = ll;
      if (var0 == null) {
         var0 = ll(IIIlI);
         ll = var0;
      }

      return var0;
   }

   public static void IlII() {
      lI.clear();
      lIl.clear();
      IlIl.clear();
      IIIIl.clear();
      llI = null;
      IIIII = null;
      IIl = null;
      ll = null;
   }

   public static boolean IlIl() {
      IIIIIllII var0 = IIIIIllII.III();
      if (var0 != null && var0.II() != null) {
         IlllI var1 = var0.II().IIllll();
         return var1 != null && var1.IIIIlIl() && var1.Il() && var1.lIllI() ? var1.IllI() == IIIllIlII.l : false;
      } else {
         return false;
      }
   }

   public IIIllIlII IllI() {
      return this.I.IllI();
   }

   private static <T extends class_8710> void Illl(class_9154<T> var0, class_9139<class_2540, T> var1, IIIlIlIl var2) {
      try {
         if (!lIl.add(var2.llIl())) {
            return;
         }
      } catch (Throwable var6) {
         throw lIIl(var6);
      }

      try {
         PayloadTypeRegistry.playS2C().register(var0, var1);
      } catch (Throwable var5) {
      }

      try {
         PayloadTypeRegistry.playC2S().register(var0, var1);
      } catch (Throwable var4) {
      }
   }

   public static boolean lIII(class_2960 var0) {
      return var0 == null
         ? false
         : IlIIllIII.lI(lll(lIlll(-975561086, 1573052887 ^ 72815258), lIlll(-975561059, 1573052887 ^ -2091193864))).equals(var0.method_12836())
            && IlIIllIII.lI(lll(lIlll(-975561060, 1573052887 ^ 2075383561), lIlll(-975561057, 1573052887 ^ 2104417332))).equals(var0.method_12832());
   }

   private static Throwable lIIl(Throwable var0) {
      return var0;
   }

   static boolean lIlI() {
      return llIl.get();
   }

   public static byte[] lIll() {
      return new byte[]{0, (byte)lIlll(-975561058, 1229243400 ^ -1546379119)};
   }

   private void llII(byte[] var1) {
      this.lII = var1;
      this.IIlI = System.currentTimeMillis();
   }

   public boolean lllI() {
      return this.IIlII.IllI();
   }

   private static boolean IIIII(String var0) {
      if (var0 == null) {
         return false;
      } else {
         IIIIIllII var1 = IIIIIllII.III();
         if (var1 != null && var1.II() != null) {
            IlllI var2 = var1.II().IIllll();
            return var2 != null && var2.IIIIlIl() && var2.Il() && var2.lIllI() ? var2.lIIll(var0) : false;
         } else {
            return false;
         }
      }
   }

   public static boolean IIIIl(byte[] var0) {
      return var0 != null && var0.length > 0 && (var0[0] & lIlll(-975561063, -1703809096 ^ 2115000800)) == 0;
   }

   @Override
   public void llIl() {
      super.llIl();
      this.III();
   }

   private static <T extends class_8710> void IIIlI(class_9154<T> param0, Function<T, byte[]> param1, IIIlIlIl param2, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 3
      // 01: ifeq 40
      // 04: getstatic k74/x/IlllI.lI Ljava/util/Set;
      // 07: aload 2
      // 08: invokevirtual k74/x/IIIlIlIl.llIl ()Ljava/lang/String;
      // 0b: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 10: ifeq 1f
      // 13: goto 1a
      // 16: invokestatic k74/x/IlllI.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19: athrow
      // 1a: return
      // 1b: invokestatic k74/x/IlllI.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: aload 0
      // 20: aload 2
      // 21: aload 1
      // 22: invokedynamic receive (Lk74/x/IIIlIlIl;Ljava/util/function/Function;)Lnet/fabricmc/fabric/api/client/networking/v1/ClientPlayNetworking$PlayPayloadHandler; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lnet/minecraft/class_8710;Lnet/fabricmc/fabric/api/client/networking/v1/ClientPlayNetworking$Context;)V, k74/x/IlllI.lIlIl (Lk74/x/IIIlIlIl;Ljava/util/function/Function;Lnet/minecraft/class_8710;Lnet/fabricmc/fabric/api/client/networking/v1/ClientPlayNetworking$Context;)V, (Lnet/minecraft/class_8710;Lnet/fabricmc/fabric/api/client/networking/v1/ClientPlayNetworking$Context;)V ]
      // 27: invokestatic net/fabricmc/fabric/api/client/networking/v1/ClientPlayNetworking.registerGlobalReceiver (Lnet/minecraft/class_8710$class_9154;Lnet/fabricmc/fabric/api/client/networking/v1/ClientPlayNetworking$PlayPayloadHandler;)Z
      // 2a: pop
      // 2b: getstatic k74/x/IlllI.lI Ljava/util/Set;
      // 2e: aload 2
      // 2f: invokevirtual k74/x/IIIlIlIl.llIl ()Ljava/lang/String;
      // 32: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 37: pop
      // 38: goto 61
      // 3b: astore 4
      // 3d: goto 61
      // 40: getstatic k74/x/IlllI.lI Ljava/util/Set;
      // 43: aload 2
      // 44: invokevirtual k74/x/IIIlIlIl.llIl ()Ljava/lang/String;
      // 47: invokeinterface java/util/Set.remove (Ljava/lang/Object;)Z 2
      // 4c: ifne 54
      // 4f: return
      // 50: invokestatic k74/x/IlllI.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 53: athrow
      // 54: aload 0
      // 55: invokevirtual net/minecraft/class_8710$class_9154.comp_2242 ()Lnet/minecraft/class_2960;
      // 58: invokestatic net/fabricmc/fabric/api/client/networking/v1/ClientPlayNetworking.unregisterGlobalReceiver (Lnet/minecraft/class_2960;)Lnet/fabricmc/fabric/api/client/networking/v1/ClientPlayNetworking$PlayPayloadHandler;
      // 5b: pop
      // 5c: goto 61
      // 5f: astore 4
      // 61: return
   }

   private static Boolean IIIll() {
      return Boolean.FALSE;
   }

   @Override
   public void IlIII() {
      super.IlIII();
      this.III();
   }

   @Override
   public String IlIIl() {
      return "";
   }

   private static void IIlII(ByteArrayOutputStream var0, String var1) {
      byte[] var2 = var1.getBytes(StandardCharsets.UTF_8);
      II(var0, var2.length);
      var0.write(var2, 0, var2.length);
   }

   private static String llIII(short var0, int var1, int var2) {
      int var3 = var1 ^ 37980;
      char[] var4 = IlIlI[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])IlIll[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         IlIll[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 30755;
      int var9 = 0;

      do {
         int var10 = var4[var9] - 29230;
         var10 += 502;
         var10 += 32204;
         var10 ^= 16212;
         var10 += 19832;
         var10 -= 384;
         var10 -= 21328;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   public static byte[] IIllI(class_8710 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: ifnull 11
      // 04: invokestatic k74/x/IlllI.IlllI ()Z
      // 07: ifne 17
      // 0a: goto 11
      // 0d: invokestatic k74/x/IlllI.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10: athrow
      // 11: aconst_null
      // 12: areturn
      // 13: invokestatic k74/x/IlllI.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16: athrow
      // 17: aload 0
      // 18: invokeinterface net/minecraft/class_8710.getClass ()Ljava/lang/Class; 1
      // 1d: astore 1
      // 1e: aload 1
      // 1f: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 22: getstatic k74/x/IlllI.lll Lk74/x/IIIlIlIl;
      // 25: invokevirtual k74/x/IIIlIlIl.llIl ()Ljava/lang/String;
      // 28: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2b: ifne 30
      // 2e: aconst_null
      // 2f: areturn
      // 30: getstatic k74/x/IlllI.IIIII Ljava/lang/reflect/Field;
      // 33: astore 2
      // 34: aload 2
      // 35: ifnonnull 79
      // 38: aload 1
      // 39: invokevirtual java/lang/Class.getDeclaredFields ()[Ljava/lang/reflect/Field;
      // 3c: astore 3
      // 3d: aload 3
      // 3e: arraylength
      // 3f: istore 4
      // 41: bipush 0
      // 42: istore 5
      // 44: iload 5
      // 46: iload 4
      // 48: if_icmpge 73
      // 4b: aload 3
      // 4c: iload 5
      // 4e: aaload
      // 4f: astore 6
      // 51: aload 6
      // 53: invokevirtual java/lang/reflect/Field.getType ()Ljava/lang/Class;
      // 56: ldc_w [B
      // 59: if_acmpne 6d
      // 5c: aload 6
      // 5e: bipush 1
      // 5f: invokevirtual java/lang/reflect/Field.setAccessible (Z)V
      // 62: aload 6
      // 64: putstatic k74/x/IlllI.IIIII Ljava/lang/reflect/Field;
      // 67: aload 6
      // 69: astore 2
      // 6a: goto 73
      // 6d: iinc 5 1
      // 70: goto 44
      // 73: aload 2
      // 74: ifnonnull 79
      // 77: aconst_null
      // 78: areturn
      // 79: aload 2
      // 7a: aload 0
      // 7b: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 7e: checkcast [B
      // 81: areturn
      // 82: astore 1
      // 83: aconst_null
      // 84: areturn
   }

   public static boolean IIlll(IIIllIlII var0, String var1) {
      if (var0 == null || var1 == null) {
         return false;
      } else if (var0 == IIIllIlII.l) {
         return var1.equals(IIllI.llIl()) || var1.equals(II.llIl());
      } else {
         return var0 == IIIllIlII.Il ? var1.equals(IIllI.llIl()) : false;
      }
   }

   public static String IllII(byte[] var0) {
      int var6 = 550140411;
      if (var0 != null && var0.length != 0) {
         StringBuilder var1 = new StringBuilder(var0.length * 3);

         for (byte var5 : var0) {
            if (var1.length() > 0) {
               var1.append(IlIIllIII.lI(lll(lIlll(-975561062, var6 ^ -394862486), lIlll(-975561067, var6 ^ 20816988))));
            }

            var1.append(Character.forDigit(var5 >> 4 & lIlll(-975561068, var6 ^ 1994708643), lIlll(-975561065, var6 ^ -1864569924)));
            var1.append(Character.forDigit(var5 & lIlll(-975561066, var6 ^ -1226194211), lIlll(-975561071, var6 ^ 1779698203)));
         }

         return var1.toString();
      } else {
         return IlIIllIII.lI(lll(lIlll(-975561064, var6 ^ 428149831), lIlll(-975561061, var6 ^ -70978390)));
      }
   }

   public static boolean IllIl(byte[] var0) {
      return var0 != null && var0.length >= 2 && (var0[0] & lIlll(-975561072, 514127187 ^ 383316021)) == lIlll(-975561069, 514127187 ^ -2054867944);
   }

   private static int lIlll(int var0, int var1) {
      int var2 = IlIIl[var0 ^ -975560723] ^ var1 ^ var0;
      var2 -= 62431;
      var2 ^= 1500;
      var2 ^= 6959;
      var2 ^= 10830;
      var2 += 23940;
      var2 += 37561;
      var2 += 38141;
      return var2 + 22235;
   }

   public static boolean IlllI() {
      Boolean var0 = IIl;
      if (var0 == null) {
         var0 = ll(IIlll);
         IIl = var0;
      }

      return var0;
   }

   public static void Illll(String var0, byte[] var1, class_310 var2) {
      int var7 = 1131714402;
      String var10000 = IlIIllIII.lI(lll(lIlll(-975561070, var7 ^ -910041440), lIlll(-975561107, var7 ^ -1421100401)));
      String var10002 = IlIIllIII.lI(lll(lIlll(-975561108, var7 ^ -685419617), lIlll(-975561105, var7 ^ -445850263)));
      String var6 = IllII(var1);
      String var5 = var10002;
      String var3 = var10000;
      IIlI(var3 + var0 + var5 + var6);
      if (IIIII(var0)) {
         if (IIIIl(var1)) {
            lIIlI(var0, I(), var2);
            String var4 = IlIIllIII.lI(lll(lIlll(-975561106, var7 ^ -1757431143), lIlll(-975561111, var7 ^ -69782352)));
            IIlI(var4 + var0);
         } else {
            if (IllIl(var1)) {
               lIIlI(var0, IIII(var1[1] & lIlll(-975561112, var7 ^ -1030335895)), var2);
            }
         }
      }
   }

   private void lIIII() {
      byte[] var1 = this.lII;
      if (var1 != null) {
         class_310 var2 = class_310.method_1551();
         if (var2 != null && var2.method_1562() != null) {
            this.lII = null;
            lIIlI(IIllI.llIl(), var1, var2);
         } else {
            if (System.currentTimeMillis() - this.IIlI > 10000L) {
               this.lII = null;
            }
         }
      }
   }

   public String lIIIl() {
      return this.I.IllI().Il();
   }

   private static boolean lIIlI(String var0, byte[] var1, class_310 var2) {
      String[] var3 = llIllIlI.IIlII();
      if (var2 != null && var2.method_1562() != null) {
         llIl.set(Boolean.TRUE);

         boolean var5;
         try {
            boolean var4;
            label81: {
               if (var0.equals(II.llIl())) {
                  var2.method_1562().method_52787(new class_2817(new IIIIllII(var1)));
                  var4 = true;
                  if (var3 != null) {
                     break label81;
                  }
               }

               if (var0.startsWith(Ill.llIl())) {
                  if (IlllI()) {
                     var4 = lI(var1, var2);
                     if (var3 != null) {
                        break label81;
                     }
                  }

                  var2.method_1562().method_52787(new class_2817(new IIIllllII(var1)));
                  var4 = true;
                  if (var3 != null) {
                     break label81;
                  }
               }

               if (var0.equals(IlI.llIl())) {
                  var2.method_1562().method_52787(new class_2817(new lIlIlIl(var1)));
                  var4 = true;
                  if (var3 != null) {
                     break label81;
                  }
               }

               var4 = false;
            }

            if (var4) {
               String var10000 = IlIIllIII.lI(lll(lIlll(-975561109, 1892875406 ^ -287502548), lIlll(-975561110, 1892875406 ^ -93092898)));
               String var10002 = IlIIllIII.lI(lll(lIlll(-975561115, 1892875406 ^ -1837202068), lIlll(-975561116, 1892875406 ^ 341933058)));
               String var10 = IllII(var1);
               String var9 = var10002;
               String var7 = var10000;
               IIlI(var7 + var0 + var9 + var10);
            }

            var5 = var4;
         } finally {
            llIl.set(Boolean.FALSE);
         }

         return var5;
      } else {
         return false;
      }
   }

   public boolean lIIll(String var1) {
      return IIlll(this.I.IllI(), var1);
   }

   private static boolean lIlII(List<class_2960> var0, String var1) {
      for (class_2960 var3 : var0) {
         if (var1.equals(var3.toString())) {
            return true;
         }
      }

      return false;
   }

   private static void lIlIl(IIIlIlIl var0, Function var1, class_8710 var2, Context var3) {
      Illll(var0.llIl(), (byte[])var1.apply(var2), var3.client());
   }

   public boolean lIllI() {
      if (!this.IIIIlIl()) {
         return false;
      } else if (!this.lIll.IllI()) {
         return true;
      } else {
         class_310 var1 = class_310.method_1551();
         if (var1 == null) {
            return true;
         } else {
            class_642 var2 = var1.method_1558();
            if (var2 == null && var1.method_1562() != null) {
               var2 = var1.method_1562().method_45734();
            }

            return var2 != null && var2.field_3761 != null ? this.Ill(var2.field_3761) : true;
         }
      }
   }
}
