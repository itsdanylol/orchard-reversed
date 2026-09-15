package k74.x;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.awt.Color;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_3675.class_306;
import net.minecraft.class_3675.class_307;

@Environment(EnvType.CLIENT)
final class llIIlllI {
   private static final int[] ll;
   private static final String[] III;
   private final IllIlIll I;
   private static final String[] l;
   private static final String[] II;
   private boolean Il;
   private static final Object[] IIl;
   private final IIIIIllII lI;

   Map<String, Object> I(JsonObject var1) {
      return this.IIlIll(this::lIIll);
   }

   private Map II(JsonObject param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc 2111264126
      // 02: istore 5
      // 04: aload 0
      // 05: aload 1
      // 06: ldc -1834188245
      // 08: iload 5
      // 0a: ldc 562060064
      // 0c: ixor
      // 0d: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 10: ldc -1834188246
      // 12: iload 5
      // 14: ldc 502441091
      // 16: ixor
      // 17: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 1a: invokestatic k74/x/llIIlllI.IIllll (II)Ljava/lang/String;
      // 1d: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 20: invokevirtual k74/x/llIIlllI.lIllI (Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/lang/String;
      // 23: astore 2
      // 24: aload 2
      // 25: ifnull 69
      // 28: aload 2
      // 29: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 2c: invokevirtual java/lang/String.length ()I
      // 2f: ldc -1834188247
      // 31: iload 5
      // 33: ldc 123046861
      // 35: ixor
      // 36: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 39: if_icmple 69
      // 3c: goto 43
      // 3f: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 42: athrow
      // 43: new java/lang/IllegalArgumentException
      // 46: dup
      // 47: ldc -1834188248
      // 49: iload 5
      // 4b: ldc 1206442458
      // 4d: ixor
      // 4e: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 51: ldc -1834188241
      // 53: iload 5
      // 55: ldc -1048093643
      // 57: ixor
      // 58: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 5b: invokestatic k74/x/llIIlllI.IIllll (II)Ljava/lang/String;
      // 5e: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 61: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 64: athrow
      // 65: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 68: athrow
      // 69: aload 0
      // 6a: aload 2
      // 6b: invokevirtual k74/x/llIIlllI.IllIII (Ljava/lang/String;)Ljava/lang/String;
      // 6e: astore 3
      // 6f: aload 3
      // 70: invokevirtual java/lang/String.isBlank ()Z
      // 73: ifne 8e
      // 76: aload 3
      // 77: invokevirtual java/lang/String.length ()I
      // 7a: ldc -1834188242
      // 7c: iload 5
      // 7e: ldc -778440291
      // 80: ixor
      // 81: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 84: if_icmple b4
      // 87: goto 8e
      // 8a: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8d: athrow
      // 8e: new java/lang/IllegalArgumentException
      // 91: dup
      // 92: ldc -1834188243
      // 94: iload 5
      // 96: ldc 1092728176
      // 98: ixor
      // 99: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 9c: ldc -1834188244
      // 9e: iload 5
      // a0: ldc -1361299195
      // a2: ixor
      // a3: invokestatic k74/x/llIIlllI.Illlll (II)I
      // a6: invokestatic k74/x/llIIlllI.IIllll (II)Ljava/lang/String;
      // a9: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // ac: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // af: athrow
      // b0: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b3: athrow
      // b4: aload 0
      // b5: getfield k74/x/llIIlllI.I Lk74/x/IllIlIll;
      // b8: aload 3
      // b9: aload 0
      // ba: getfield k74/x/llIIlllI.lI Lk74/x/IIIIIllII;
      // bd: invokevirtual k74/x/IIIIIllII.II ()Lk74/x/lIIIlIlI;
      // c0: invokevirtual k74/x/IllIlIll.lIII (Ljava/lang/String;Lk74/x/lIIIlIlI;)Z
      // c3: istore 4
      // c5: iload 4
      // c7: ifne f0
      // ca: new java/lang/IllegalStateException
      // cd: dup
      // ce: ldc -1834188253
      // d0: iload 5
      // d2: ldc -1439153317
      // d4: ixor
      // d5: invokestatic k74/x/llIIlllI.Illlll (II)I
      // d8: ldc -1834188254
      // da: iload 5
      // dc: ldc 856265621
      // de: ixor
      // df: invokestatic k74/x/llIIlllI.Illlll (II)I
      // e2: invokestatic k74/x/llIIlllI.IIllll (II)Ljava/lang/String;
      // e5: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // e8: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // eb: athrow
      // ec: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ef: athrow
      // f0: aload 0
      // f1: invokevirtual k74/x/llIIlllI.lllI ()Ljava/util/Map;
      // f4: areturn
   }

   private Object Il(Object var1) {
      int var4 = 1609624215;
      if (var1 instanceof Color var6) {
         return this.lllIl(var6);
      } else if (var1 instanceof Enum var5) {
         LinkedHashMap var3 = new LinkedHashMap();
         var3.put(
            IlIIllIII.lI(IIllll(Illlll(-1834188255, var4 ^ 49351502), Illlll(-1834188256, var4 ^ 1777792754))),
            Integer.toString(var5.ordinal(), Illlll(-1834188249, var4 ^ -1804375543))
         );
         var3.put(IlIIllIII.lI(IIllll(Illlll(-1834188250, var4 ^ 1114864877), Illlll(-1834188251, var4 ^ 600724039))), var5.toString());
         return var3;
      } else {
         return var1 instanceof class_306 var2 ? this.lllII(var2) : var1;
      }
   }

   Map<String, Object> lI(int var1) {
      return this.IIlIll(this::lll);
   }

   private Path ll(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/llIIlllI.lI Lk74/x/IIIIIllII;
      // 04: invokevirtual k74/x/IIIIIllII.l ()V
      // 07: aload 0
      // 08: getfield k74/x/llIIlllI.lI Lk74/x/IIIIIllII;
      // 0b: invokevirtual k74/x/IIIIIllII.ll ()Lk74/x/IlllIlI;
      // 0e: aload 1
      // 0f: ifnull 20
      // 12: aload 1
      // 13: invokevirtual java/lang/String.isBlank ()Z
      // 16: ifeq 41
      // 19: goto 20
      // 1c: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: ldc -1834188233
      // 22: ldc 1250880704
      // 24: ldc 874783600
      // 26: ixor
      // 27: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 2a: ldc -1834188234
      // 2c: ldc 1250880704
      // 2e: ldc 1480144940
      // 30: ixor
      // 31: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 34: invokestatic k74/x/llIIlllI.IIllll (II)Ljava/lang/String;
      // 37: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 3a: goto 42
      // 3d: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40: athrow
      // 41: aload 1
      // 42: invokevirtual k74/x/IlllIlI.IlII (Ljava/lang/String;)Ljava/nio/file/Path;
      // 45: astore 2
      // 46: aload 0
      // 47: bipush 1
      // 48: putfield k74/x/llIIlllI.Il Z
      // 4b: aload 2
      // 4c: areturn
      // 4d: astore 2
      // 4e: new java/lang/IllegalStateException
      // 51: dup
      // 52: ldc -1834188235
      // 54: ldc 1250880704
      // 56: ldc 1387329790
      // 58: ixor
      // 59: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 5c: ldc -1834188236
      // 5e: ldc 1250880704
      // 60: ldc -2073493707
      // 62: ixor
      // 63: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 66: invokestatic k74/x/llIIlllI.IIllll (II)Ljava/lang/String;
      // 69: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 6c: aload 2
      // 6d: invokevirtual java/lang/Exception.getMessage ()Ljava/lang/String;
      // 70: astore 4
      // 72: astore 3
      // 73: new java/lang/StringBuilder
      // 76: dup
      // 77: invokespecial java/lang/StringBuilder.<init> ()V
      // 7a: aload 3
      // 7b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 7e: aload 4
      // 80: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 83: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 86: aload 2
      // 87: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 8a: athrow
   }

   private Map III(JsonObject var1) {
      int var4 = -689961056;
      this.ll(IlIIllIII.lI(IIllll(Illlll(-1834188277, var4 ^ 653225383), Illlll(-1834188278, var4 ^ 35537206))));
      String var2 = this.IllIII(this.lIllI(var1, IlIIllIII.lI(IIllll(Illlll(-1834188279, var4 ^ 185447276), Illlll(-1834188280, var4 ^ -2045081279)))));
      boolean var3 = this.I.lI(var2, this.lI.II());

      try {
         if (!var3) {
            throw new IllegalStateException(IlIIllIII.lI(IIllll(Illlll(-1834188273, var4 ^ -1468501299), Illlll(-1834188274, var4 ^ -605931681))));
         }
      } catch (IllegalStateException var5) {
         throw llII(var5);
      }

      this.lI.l();
      return this.lllI();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = 1145085422;
      int var10001 = "ಟ։ꂷؐ\ue06fїꁖԁ悋ټ恇\u0603\u2068չ悱՜恐ڏ\ue060ҩ₊ݜ\ue075܇恛۵患\u0600ꁠاꁡЁ悕ې\u206dݛ\ue076֡\ue0baޘꁗփ恫ӱ\ue0a8а\ue071\u074b\ue06aߑ\u209e،ꁛг\u2072֑ꂤؘ恞ԟ恘ԝ悷ߌ⁐ݻ\ue073ӹꂐМ恏ܻ\ue04d֩ₖߤ\ue074Џ⁻ّꂐ٬ꁠՏꁮҙꂈӀ\u2072Ջ\ue04cו患Ҭ\ue076܋\ue044ֽ\ue08fӜ\u2061ٓꁀݕ₅ؔ\ue053\u07b7恶ف悆٘ꁑ߃\u2060Խꂄٌꁹߗ⁴ׁ\ue09b۬⁁փ\ue06aߥ₲Әꁁٗ恺ӥ₽Ѭ⁙ܗ⁑ݙ悪а\ue045ۯ⁀ہ₤Р\ue058\u05fbꁃڑ₹Ӥ恿ԳꁡޕꂜҼꁄ֗\ue06d۱ꂴլꁳѫ⁖ԙ\ue0acڠ\ue05bߋꁬ٭ꂆߴꁂֿꁌԝ\ue098Ӹ⁚׳\ue075֡\ue093ۘ恛ڣ⁐өꂗڜ恂קꁥՍ悎֤ꁒޯ\ue07cԵ\ue086\u05f8⁁ҫ恎۵ₒ۴ꁺܛꁼץ\ue0abѰ\ue066җ\ue055ב\ue08bٰ\ue06cۧꁝՙ悛ج⁚ݏ\u2061ґꂼܰ\u206eط⁀ױꂐؘ\ue04bۋ恡ӕₔ֔恕ֻ\ue079С\ue099Ԅꁰݫ⁔ԁ悡٨恒ջꁋޱꂝܐ\ue056ٷ⁋ԍꂑ\u05f8\ue05eܻꁹލ\u209dЀꁉܣ恛ٕꂨ٬⁅ۓ\ue062՝₸Ԥ\ue04dзꁽе悔Ҩ⁖ۣ\ue056ډ悧Ҁ恹سꁗޙꂨфꁂد\u206bݵ₷Մꁡ߳\ue047ّ\ue09dѼꁳڇ⁔֥\ue082\u05c8ꁿس\ue04aӑ₈܄ꁵӓ恀ݡ\ue0b5ܠ恙ߟ⁏ߡ₦ؠꁙշꁂܭꂲ٤ꁕջ⁷܁ꂮԨ\ue049ӷꁓ٥ꂿڌ⁹շ恗ݝ\ue08cܸꁔԿꁥڥ₦֜\ue072ݟ\ue06aح₣\u07b8\ue046ګꁃ߭\ue085Ӡ\ue075ڃ恨֩ꂱդ\ue053ޗ恔\u07b5₥ވꁷ؇\ue078ҵ\ue0b8٨⁙\u05ebꁺӉ₲ڈ\ue044ݧꁖ٥₦݄\ue047؋\ue06aӁ悄\u0558ꁒ؋\ue07aؽ悙ؐ\ue062\u05ff⁆ّ悯՜\ue054Ч\ue055ձ₻ߠꁎ҃⁹щꂗԨ恉٫恮ЍꂰҤ\ue075ۣ\ue073ۑꂋݠꁹԃꁦә₢ް\ue04aܯ恳Ѝ₀ش\ue041ۛ⁆ӱ悛҄\ue06dѧ\ue06cם\ue0a8ӄꁃݓ恘ѡ\ue0b6Иꁴӏ恩Щ₤٤ꁋݳ\ue07dн\u209eָꁨۛ恎\u05fdₕԤ恕ӿ⁕ݩꂶۼ\ue040ӯ⁂ީ\ue084لⁱݓ恌݁ₕܬ恖ߓ\ue05dڹ悿Ԝ恠ד⁒߱\ue086Ҭꁡܟ\ue04aݽ\ue0a3ՔꁜܻꁤՉ悹\u05fc⁴۫ꁿܡꂝڸ恾ܗ⁎ѽ₅ذ\ue054ӯꁨԁ悳Մ恷ۣ⁌ٍ悋ݨ⁻֯恲Ե₻ް恬ڧ恭߅\ue08cנ\ue040ٷꁍԵ\ue0b2\u07fcꁏԧ\ue05aڑ\ue0a6֨\ue06fݧ⁶߹\ue088؈\ue059ދ恿ܝ\ue09fڀ恓ޟꁇߩ\ue092є⁛ҧ恜ܹ\u209dԐ\ue06d֗\ue07dݥꂑո恛ܷꁤӍ\ue0a5Ԩꁬһꁟލꂔмꁑ߃ꁗح悠ی\ue07e߳⁀ѥ悷ӸꁀЇ恱ӝ悩ެ\ue067ҏꁡЭ\ue0b2Ԑ\u206e՛恠ס\ue0b6ب恄ߛꁒޥ₅ސ\ue076ًꁤڭ悥ӄ息ڻ\ue06bѱ悫ݰꁿ֫恸Ӂ悵݀⁽ڛ\u2062\u07b9悆ߘꁼЯ\ue06eډ\ue09cԼ⁾\u05fbꁄޑ₹ڀ\ue052ܿ⁓ݍꂌФ⁋яꁘڝ\ue0baڸ\ue051ѻ⁙ҭ\ue0a8ՀꁞгꁆځₑӔꁥЛꁅځ悢֠ꁿ׃ꁒѡ₳ل恙س\ue07fݵꂽ֨恣ԧ⁁ӝꂐׄ\u206cڇ\ue065ӽ\ue083ӄ\ue042Ѓ\u2062ֹꂳߜꁑг恫ՙ悼\u07b8\ue041ғꁝޕ₁р\ue07dգꁾש\ue09f܈恸ѫ\ue041ߥ\ue087ۀ\u2064ݟꁍљ€ڜ⁛ڷ\ue047ىₘє\ue065Ի\ue061ԍꂗ\u05ccꁈЯ恖ӕꂿרꁦߗ⁰ܕ悄ߌꁥӻ恮م\u208f܈\ue04cշ\ue06eݡ\ue0a3֤\ue046һꁴݽꂉڸꁊп\u2066م悾ո\ue065ث\u2069ܱ₉ް\u2069Ӌ\ue077ۡ悄\u058cꁗݧ恄݅ꂐ۸\ue068ޯ\ue05cӑ\ue087۠⁉د恄ٵꂸޜ\u2068ѳ恾Եꂯې⁁߇ꁁ҅₧ִꁃ۳ꁫߩ₭И\ue07fܣ⁋ց₄ш\ue05dڛ⁙Ս₼܄ꁴڻꁩѝ₱ܼ恘ݓ⁔ѕ₳ՠ\ue05fܿ恑܉ꂟߌ恗ߋ恋ߍꂟָ恧у⁕ڑ₁ט\u206eݏ\ue066ׁ\ue095݄恞ދ恎ס悎ը恳ߏ\ue074٩\ue0bbФ\ue056\u05eb\ue05bӹ\ue091ڀ\ue068ѓ\ue045Э\ue09a֬\ue062ܟꁞԅ悡ސꁚݓ恵ە€ژ恐ׯⁿс\ue0aaܘꁺӏꁻׅꂬؼ恺ۣ\ue04cߥ悆И恴ً\ue07cڑ\ue0a9Ҁꁭݗ恞ؙꂫؐ⁵чꁬҽꂑش\ue068ݓ\ue07dԡꂪڜ\u2062ڛ恵ѝ₿Ѥꁭ׃\ue060݁ꂉҤ恐ֻ⁙ޅꂊє恉ٛꁛڝ悰ݨ\ue04bҫꁹ۽₈հ\ue074ؿ恝э₸ּꁤ؟ꁶҝ悐ӄ恑\u05ebꁰԕ悢ڸ⁸ݣ⁼ݍꂄڸ\ue05cԏ⁼Ձ悭\u05f8ꁳҟ⁌Ա悸ܼꁓѣ ֑₥ݨ⁏ޛ恽ޝ₤Ԝ⁻֧⁞ԕₐ܈\ue064ޟꁻށꂿՔꁤد\u2073ڑꂆؠ⁐ҟ⁝ݙ悻߰\ue073ܫꁉ߱ꂄՌꁨ߫ꁥэ\ue0a6ݰ⁺ۧ⁷ӽ₺Ԍꁮу⁄ԕ\ue0b1ܨ恬ۇ恻ԝꂵҘ⁄گ\ue07cޱ₿ՠ恮яꁑХ₼٬恠ԓ恇ߕꂙܘꁪݧ\ue079Ս悆ݜ恕ѿꁃ٩\ue09d֔\ue06bѫ⁘ֹꂵјꁸп恢ޙ悿ݤ⁛ܧ恵Э₨ߐ恬߯\ue076҉₌٬\ue068܋恤ѥꂱ\u05f8恝ٗ恝ҝ₱\u0604⁾Էꁵکₑ\u07b4⁒Ӄ恦թꂍؼ⁈ғ⁹ѡꂗظꁦً\u206fչ\ue0a4݄恒\u074b\ue040ۭꂣՔꁃݣ\ue06eܽ\ue098ߠ\ue057܋⁌ٕ\ue0b0ڴ⁂ܻ\ue067ԡ悗Ԭ\ue048ݻ\ue074ߩꂿШ\ue05dԫ⁗ٙ悤߸ꁅҟ恦ٍ悋״⁵҃ꁩСꂗ߈恐Л\ue079ܑꂠ\u07bc⁖ԗ恵٥\ue0b0դꁘٟ\ue04aء\ue081Ԅꁘؿ恍ґ\ue0afޘ\ue04f۫ꁿݍ₸ּ\u2073у⁂ڕꂄ٠恰׃ꁅә\ue09fҜ恒߫\ue04e۩\ue0b1ڸ⁃گ恭ґ\ue083Ҵ恬߃⁼ڝꂞސ恦ҟ\u206bӑꂷА⁊п\ue05fߥꂅ֨恎ӯ\u2069ܑ₇Ӭꁖۯ\ue046б\ue09cӼ⁵܋息؉悓Ќꁣܟ恐ؙꂷݜ恊ۿ恵ݕ\ue0bcڬ\ue069ڷ恠݉\ue086֔⁺ۗ恛Љ\ue09aۈꁂѳ恓ޙ\u209fڠꁺۛ恐Ե\ue0b9߰ꁂҧꁨۍꂑҀ恄ڟ恠ґ\ue0b9ь\ue05cҧꁘ֙\ue0acڬ\ue074ڣ\ue061ѝꂞԼꁀУ\ue04dح₻۸⁴ۏ\ue065ߵₛ֜ꁪׇꁄֵ₹ф⁃܃恫݉\ue0aa݄ꁮ՛\ue077ڽ\ue0abՈ\ue06eۯ\u206d֍ꂳҸꁥ\u05f7\ue05eޡ悤Ќ恸ӗꁧթꂑܜ⁐߷恩՝\ue098҄ꁉԳ\ue06dܝ悞ь恹֯\ue05aޅꂐٜⁿӷ⁛ޝ悛Ҭ\ue050ۻꁴۥꂓܜꁉէ\ue04bޙꂰҐꁑ٣恸߽\ue080ٔ⁋\u0557恧ҩꂽј恌ٳ\ue063ԝ悺\u07b4恃ևꁸܡ悎ݤꁃғ\u2060ۙ₳ؠ\ue067ދ⁔\u0601\ue080Մ恼҃\ue042߭\ue0bdۤ恙ҿ⁸ֽ悑ۨ⁋߇⁗ۉ₸\u05cc恠\u05ff\ue071ّ悾݈ꁅ՟恑ѭ悦Ռ恡ѫ\ue079թ悼Ѹ\u206c׃ꁳҩₘӄ⁚ڟ恏с₃հ\ue064އꁁ۽悒Դ\ue059Ѓ\ue04eݹꂿҤ\ue051֣\ue060օꂖߨ\ue072Ӄ恤ݹ\ue09fشꁞك\ue079ە悯ހꁑү恃ڱ\ue0bcԘꁍۃ恬ٝ悞ۘꁶԻ恥١₋դ恺֛恀ܕ\ue08bؤꁃ۫⁃ԕₕل恭ܓ恵ۉꂼް⁐گ\ue050ى₄Ҙꁋٟ⁂ٕ悬ל\ue067ܯꁢӑꂵӜꁸЛꁹЙꂛм恡ٗ恊Ե\ue09f\u074c⁘۫⁅ԁꂹ\u061c恂ַꁧށ\ue0a3ސ⁰ԻꁢН₡ь⁇ݫ\ue041ށ₼\u05c8恧\u058b⁽ّꂦҰ\ue050ܟ\ue075҅\ue0b5Մ\ue049Փ\ue066ݱ\ue09eѸ⁒տꁫ؝ꂁ֨ꁸدꁘ۽\ue09aب\ue04eևꁇڵ\ue0a8۸ꁟދ\ue068ݱ₂ܠꁗݫ⁖ށꂋҨ\ue073ݓ\ue06aֹꂫ֔\u206dӇ⁖љ₉Р\u2063\u07bb恺۱\ue097Ӱꁷׇ恃ڱ悾ڼ\u2061\u07b3ꁀٹ\ue0a4Р\ue067җꁨэꂇ߀ꁎֿꁹЁ悎Ҍ Ы\u2072ۡ\ue088Ԍ恦Ӄ恙ܙ₽ݸꁪ׳恪ݝ\ue095݀ꁓԯꁹԙ₋ј\ue04bݧ恀ߑ₡\u05cc\ue062ٻ恔ۡ\ue09dӰꁑדꁕԽ悊׀\ue046܇恒ڕ悅ݴ恓ү⁴ݵꂀЈꁠܫ\ue054ܡ\ue095ܼ\ue068܇恫ޭ₆Ь\u206cЇ\ue064ݡₓ٠\ue046؏ꁾٕ\ue0a1ڀ恄Ыꁨځ\ue090ܰ\u2072\u07bf\ue04bމ悱܀恗П⁆މ₮հ⁴Г\ue074֭₿Ӹ\ue047ѣ⁶խ\ue0b8٨恠ٓ恄؍悇ڴꁱҷ\ue052ܑꂄۤ恔߃ꁝбꂗߨꁼק⁉ߩ\ue0a8҈ꁈד恏н₳ڸ\ue07aݟ⁈ҝꂚܰꁉݓⁱו\ue08fڬ\u2067ګ\ue054ԡ₡רꁇד⁛ӹ\ue093Ь恢۷\ue050ۙ\ue090ޔꁘًꁿս悗ר恿ۛꁺߕₗِꁧ߿⁅ݭꂤӠ\ue063ރ\ue078ֹꂐ\u05cc⁐ҧ\u2063ٕ₂Ӵ\ue06dط恘ׁꂟِ\ue045Я\ue073߁\ue0aaۘ\ue04d҃\ue057љ₊\u05c8ꁈߗ\ue077ޕ\ue09cմ恚گ恋щꂩݼ\u2072Ջꁞӝ悽״恲ڿ\ue064ڭ悑ߤ恶ҧꁏБ\ue096րꁭ߯恐݁₴ո\ue05b܃恆Սꂲب恲ރꁥّ悈Ѹ⁌ݛ\u2069ܝ\ue093Мꁻ\u07bb恨ܽ₽\u058cꁊ\u07b3\ue04eٝ\ue093Դ⁞ү\ue077ա\ue092\u05fc恅ի⁞څ\ue09bۀꁁ\u05f7恰ՙ\ue0a7ӌ⁈߳恚҅\ue083֬\ue046ۗꁉԱ悔Ԩ⁓ݷ恝؉ꂣؼ恳ճ恅؉\ue099Ԩ⁎ӓꁌ֑\ue0aaܬ\ue051׃\u2067Щ悛Ь⁁ߣ恝۽ꂮ\u07bcꁂգ\ue07cҥ悱Ր\ue049֏\u2073ߍₜԜꁨؗ恈ܑꂮؐ\ue078ޏ恖ѭ悂Ј恏ݯ⁚߱ꂸՌ恴ӟ⁂\u05f9ꂋ߀恄ޗ\ue055ۡ₅ۼ恫ӯꁐԵ\ue0b5Ә\ue064ݯ⁍ӵꂗԼ息ԗ\ue04eإꂣߨꁤڋꁡڭ悈۔\ue048۷ꁐߕꂙް\ue043Տ恈ݡₗѸ\ue060ћ\u2065Թ\ue0a8Ԕ恣տꁝڽ您߰ꁎܯ\ue06eҥ悾ݔ恅ѻ恎יꂭԔꁘޟ\ue046رₐр\ue04bݛꁸҍ\u209dؠ⁒ؗꁑܵ₾ܨꁃߧꁍޥ₢֘恋އ⁶߹\ue0bcӌ\ue061ׯ⁷ء\ue090ּ恫Իꁿݝꂢڬ恧Ӈꁣک₵ՠ恁շ恐б\ue0a1݄恔ߣ\ue051ۑ悔ސ\ue048ڣꁍ\u0605ꂌ݄ꁾً\u2068Թ₸܄恭֯ꁡةꂮ۠ꁌҧ\ue06cԙ悾\u07bcꁬѓ\ue06eѕ₢Шꁷч恉ة\u209dѨ恷\u05cb\ue059ؽ悳߸⁜ҏⁱ֡ꂔܜ⁍ҟꁱ՝悲ܼ\u2064ߋꁏؙꂓդꁸտꁼԥ\ue098Ѽ恛އꁛԑ₎ӌꁾѳ恓Й₩ܨ\u2065ۯꁿԍ₤Ѵ恮ٗ\u2062ҍ\ue0b9Ԙ恝їꁣӍ\u209fشꁡܷ\u2062؉\ue08eذꁩڃꁿߡꂋڀꁞߋꁿӡꂢи⁾ֻꁘݵ₀ވ恗\u07fb恮ܩꂓ݄⁆ѳ恶ۑ悐ք⁰\u05cb\ue040ڭꂳټꁁӧ\ue068Щꂓܨ恊Ӄ⁞ܙ₨Ш\ue06fԷꁕߵₙ٨\ue06aқ\u2068ۥ悋ޜ⁖ԋ⁃յ\ue0aeܠ⁊տꁩҹꂡ׀恢ۿꁫߕꂎܠꁯݯ⁗ߕ悴ެꁞѷ\u2068\u0605患ڠ\ue043׃⁹۹悋ܰ⁵أ恜֝ꂩܴ⁞ҧ\ue056ׁ\ue0a4ސꁃً恶ҥꂂݔ恳߫ꁐߕ₆ۀ⁹ѣ\u206cޭ₰ބꁝڻꁯم悬Ѭꁠ֛恣۽悒ؔ\ue070ۏ\ue066ץ悇ۄꁇѿ恁ܹ\u209eԌꁵң\ue045ڵꂪӬ\ue041җ\ue071کꂧը⁍ғ\ue047ؽ悬\u05ec恲߯\ue072ݕꂿԸ⁺ѳ息ݙꂀӌ⁀ܿꁡߑ悅ۜ恉ћ恥ե\u209eوꁓҗꁧٽꂘܸ恬٣ꁱץꂋԈꁧݟ\ue065ڕ悉ܜ\ue055ܫ\ue049ٝ₋ڈ\ue07eد\ue057١ꂔݔ\ue061כ恌Б\u209e܀⁉ާ恓Չ\ue0aeД\u2069ثꁿةꂺݰꁆ߳ꁍݡ悳ِ恄އ恃Б\ue089м恔֗\ue071ؕ悯Ьꁐң\ue05a֑悏ܤꁁޯ\ue059ԡ悛\u05f8ꁳӻ\ue07eە\ue093Ф\ue05c\u05fb⁏ݭ₠Ҕ恓ַꁊЁ悩ڐꁦۃꁤفꂏܴ\ue072׃\ue067֕悿ڤ\ue053ԫ恱ߡ悡а\u206eӻ⁛ݭ悡҄\ue042ڏ恔ڡ\ue0aeЈ\u2065҃\ue054֩ꂅִ⁍ї\ue04eҭ\u209fԘ⁆݃ꁕѹꂯߨꁂܟꁕс\ue090ِꁗܯꁱՕ\u208fތ恭ٛ\ue073э₈݀\u2062ۋꁚӑ₶ް\ue072\u05cf\ue059ԍ₃Ө⁇ߣ\ue072ݵ\ue086ۜꁼз\ue067Աₐڰ⁵ӏ⁸ۭₔҌ恻ӏ⁄ڙ悪\u074c恱ޓꁓׅ悏Դ⁴ۛ恛ءꂂݐ\ue07cև恢ׅꂓՠ恫ӫ恓ԭꂺؠ恗ӧ\ue06eڥ\ue0b5،⁖\u0557恖م₴\u05ecꁗڟ⁉ߙ悅҈恁ԣꁪݥ\ue0a0Ӭ恀٧恻߭ꂙׄ\ue05e֛\ue074ܙꂉ۰\ue051ӛ\ue051ڭ\ue080\u0604ꁾՏ\ue048ޕꂻЬꁺݏ恍عₒрꁀ֧恨߁ꂟѬ⁒џꁧ\u05cd₅ِꁹէ\ue050ҙ\ue09aڴ\u2066ݓ恱ؕ\ue08aҴ恉ҧ⁰ҝ\ue094݈⁗ړ\ue063Эꂗݠ恷үꁮ٩ꂙаꁦ\u05fb恘ޑ\u209e۰ꁯի⁝ҽ\ue08bҜ\ue076ګ\ue068ޝ悈Ҩꁰ֯恐ݙꂑ\u05c8\u2066ا恽Э悑ՠ\ue04dҿꁤӱꂏٌ⁃ܧ恑ѭₑ݀ꁬػ\u206bם\ue085ܨ恫٣ ݵꂨЈꁑқ\ue063܍\ue0bdܐꁆҫ⁻ڭ悅ٔꁰГ⁑Х悌҄ꁌы⁛ؽₗ\u07fc恷ޏꁜֹ\ue09eՠ\ue04eثꁙԡꂛӌ⁗ܟ⁕ӝꂍ٘ꁢދ恸םₙݨꁉы恲҉悽֘\u206aԫ\u2064й悿ݐ\ue05eޏꁊ\u0601ₙМ\ue06eЧ⁽Ё\ue0a8ޘꁼٛ恐ՙꂮҌꁺԟꁧܝꂭ߰⁴ҫ\ue06dӍ₋Ҡ⁙ݛꁶҕ\ue0b3\u07b8\ue058ןꁝ֡ꂿ֘\ue07fܓ恇әꂯҜ\ue072ԓ\ue054ڵ\ue097Ӕ⁄ӳ息ҭ€Քⁱѓꁡڹ悏Ј⁂כꁜҡꂁѸ\ue076ڇꁂݝ悦Ը⁔\u0603⁔߹ꂃڐ\ue077ݫ恫ҙ\ue08aӬ\ue06bҗ恽Э₍ٜ恜\u0557\u2061مꂇ߀\u206e֗⁒ׅꂉݴ\ue07dןꁀڽꂭ֬恒\u058b恍ԍ悒ڸ\ue05dһ恽ڹ悳ۨ\u2062ԣ\ue06eՉꂬۄꁜҳꁛҡ悇Ԡ\ue053۳\ue046ڝ\ue09b\u05cc恣ك恂Ӆ悭ո恩ѧꁫ\u07b9ₑٰ恟ٻ恜ر₾ޠ恈گ恮ֱ\ue098۬ꁣя⁵ݱ患״⁂Я恜ؙꂕ\u0590%䉦ᓴ䌧吹䂠퐳䎒哟䉓퐼䇸鐰䁊ᓠ䀗퐻䃔鐿䆶ᓎ䆷퐺䂌鐉䆖ᓇ䍟吊䋜ᐴ䇲哞䉻吳䍰ᐜ䋶"
         .length();
      int var17 = 0;
      short var18 = 24827;
      int var14 = var10001;
      String[] var15 = new String[2];
      int var16 = 0;
      String var13 = "ಟ։ꂷؐ\ue06fїꁖԁ悋ټ恇\u0603\u2068չ悱՜恐ڏ\ue060ҩ₊ݜ\ue075܇恛۵患\u0600ꁠاꁡЁ悕ې\u206dݛ\ue076֡\ue0baޘꁗփ恫ӱ\ue0a8а\ue071\u074b\ue06aߑ\u209e،ꁛг\u2072֑ꂤؘ恞ԟ恘ԝ悷ߌ⁐ݻ\ue073ӹꂐМ恏ܻ\ue04d֩ₖߤ\ue074Џ⁻ّꂐ٬ꁠՏꁮҙꂈӀ\u2072Ջ\ue04cו患Ҭ\ue076܋\ue044ֽ\ue08fӜ\u2061ٓꁀݕ₅ؔ\ue053\u07b7恶ف悆٘ꁑ߃\u2060Խꂄٌꁹߗ⁴ׁ\ue09b۬⁁փ\ue06aߥ₲Әꁁٗ恺ӥ₽Ѭ⁙ܗ⁑ݙ悪а\ue045ۯ⁀ہ₤Р\ue058\u05fbꁃڑ₹Ӥ恿ԳꁡޕꂜҼꁄ֗\ue06d۱ꂴլꁳѫ⁖ԙ\ue0acڠ\ue05bߋꁬ٭ꂆߴꁂֿꁌԝ\ue098Ӹ⁚׳\ue075֡\ue093ۘ恛ڣ⁐өꂗڜ恂קꁥՍ悎֤ꁒޯ\ue07cԵ\ue086\u05f8⁁ҫ恎۵ₒ۴ꁺܛꁼץ\ue0abѰ\ue066җ\ue055ב\ue08bٰ\ue06cۧꁝՙ悛ج⁚ݏ\u2061ґꂼܰ\u206eط⁀ױꂐؘ\ue04bۋ恡ӕₔ֔恕ֻ\ue079С\ue099Ԅꁰݫ⁔ԁ悡٨恒ջꁋޱꂝܐ\ue056ٷ⁋ԍꂑ\u05f8\ue05eܻꁹލ\u209dЀꁉܣ恛ٕꂨ٬⁅ۓ\ue062՝₸Ԥ\ue04dзꁽе悔Ҩ⁖ۣ\ue056ډ悧Ҁ恹سꁗޙꂨфꁂد\u206bݵ₷Մꁡ߳\ue047ّ\ue09dѼꁳڇ⁔֥\ue082\u05c8ꁿس\ue04aӑ₈܄ꁵӓ恀ݡ\ue0b5ܠ恙ߟ⁏ߡ₦ؠꁙշꁂܭꂲ٤ꁕջ⁷܁ꂮԨ\ue049ӷꁓ٥ꂿڌ⁹շ恗ݝ\ue08cܸꁔԿꁥڥ₦֜\ue072ݟ\ue06aح₣\u07b8\ue046ګꁃ߭\ue085Ӡ\ue075ڃ恨֩ꂱդ\ue053ޗ恔\u07b5₥ވꁷ؇\ue078ҵ\ue0b8٨⁙\u05ebꁺӉ₲ڈ\ue044ݧꁖ٥₦݄\ue047؋\ue06aӁ悄\u0558ꁒ؋\ue07aؽ悙ؐ\ue062\u05ff⁆ّ悯՜\ue054Ч\ue055ձ₻ߠꁎ҃⁹щꂗԨ恉٫恮ЍꂰҤ\ue075ۣ\ue073ۑꂋݠꁹԃꁦә₢ް\ue04aܯ恳Ѝ₀ش\ue041ۛ⁆ӱ悛҄\ue06dѧ\ue06cם\ue0a8ӄꁃݓ恘ѡ\ue0b6Иꁴӏ恩Щ₤٤ꁋݳ\ue07dн\u209eָꁨۛ恎\u05fdₕԤ恕ӿ⁕ݩꂶۼ\ue040ӯ⁂ީ\ue084لⁱݓ恌݁ₕܬ恖ߓ\ue05dڹ悿Ԝ恠ד⁒߱\ue086Ҭꁡܟ\ue04aݽ\ue0a3ՔꁜܻꁤՉ悹\u05fc⁴۫ꁿܡꂝڸ恾ܗ⁎ѽ₅ذ\ue054ӯꁨԁ悳Մ恷ۣ⁌ٍ悋ݨ⁻֯恲Ե₻ް恬ڧ恭߅\ue08cנ\ue040ٷꁍԵ\ue0b2\u07fcꁏԧ\ue05aڑ\ue0a6֨\ue06fݧ⁶߹\ue088؈\ue059ދ恿ܝ\ue09fڀ恓ޟꁇߩ\ue092є⁛ҧ恜ܹ\u209dԐ\ue06d֗\ue07dݥꂑո恛ܷꁤӍ\ue0a5Ԩꁬһꁟލꂔмꁑ߃ꁗح悠ی\ue07e߳⁀ѥ悷ӸꁀЇ恱ӝ悩ެ\ue067ҏꁡЭ\ue0b2Ԑ\u206e՛恠ס\ue0b6ب恄ߛꁒޥ₅ސ\ue076ًꁤڭ悥ӄ息ڻ\ue06bѱ悫ݰꁿ֫恸Ӂ悵݀⁽ڛ\u2062\u07b9悆ߘꁼЯ\ue06eډ\ue09cԼ⁾\u05fbꁄޑ₹ڀ\ue052ܿ⁓ݍꂌФ⁋яꁘڝ\ue0baڸ\ue051ѻ⁙ҭ\ue0a8ՀꁞгꁆځₑӔꁥЛꁅځ悢֠ꁿ׃ꁒѡ₳ل恙س\ue07fݵꂽ֨恣ԧ⁁ӝꂐׄ\u206cڇ\ue065ӽ\ue083ӄ\ue042Ѓ\u2062ֹꂳߜꁑг恫ՙ悼\u07b8\ue041ғꁝޕ₁р\ue07dգꁾש\ue09f܈恸ѫ\ue041ߥ\ue087ۀ\u2064ݟꁍљ€ڜ⁛ڷ\ue047ىₘє\ue065Ի\ue061ԍꂗ\u05ccꁈЯ恖ӕꂿרꁦߗ⁰ܕ悄ߌꁥӻ恮م\u208f܈\ue04cշ\ue06eݡ\ue0a3֤\ue046һꁴݽꂉڸꁊп\u2066م悾ո\ue065ث\u2069ܱ₉ް\u2069Ӌ\ue077ۡ悄\u058cꁗݧ恄݅ꂐ۸\ue068ޯ\ue05cӑ\ue087۠⁉د恄ٵꂸޜ\u2068ѳ恾Եꂯې⁁߇ꁁ҅₧ִꁃ۳ꁫߩ₭И\ue07fܣ⁋ց₄ш\ue05dڛ⁙Ս₼܄ꁴڻꁩѝ₱ܼ恘ݓ⁔ѕ₳ՠ\ue05fܿ恑܉ꂟߌ恗ߋ恋ߍꂟָ恧у⁕ڑ₁ט\u206eݏ\ue066ׁ\ue095݄恞ދ恎ס悎ը恳ߏ\ue074٩\ue0bbФ\ue056\u05eb\ue05bӹ\ue091ڀ\ue068ѓ\ue045Э\ue09a֬\ue062ܟꁞԅ悡ސꁚݓ恵ە€ژ恐ׯⁿс\ue0aaܘꁺӏꁻׅꂬؼ恺ۣ\ue04cߥ悆И恴ً\ue07cڑ\ue0a9Ҁꁭݗ恞ؙꂫؐ⁵чꁬҽꂑش\ue068ݓ\ue07dԡꂪڜ\u2062ڛ恵ѝ₿Ѥꁭ׃\ue060݁ꂉҤ恐ֻ⁙ޅꂊє恉ٛꁛڝ悰ݨ\ue04bҫꁹ۽₈հ\ue074ؿ恝э₸ּꁤ؟ꁶҝ悐ӄ恑\u05ebꁰԕ悢ڸ⁸ݣ⁼ݍꂄڸ\ue05cԏ⁼Ձ悭\u05f8ꁳҟ⁌Ա悸ܼꁓѣ ֑₥ݨ⁏ޛ恽ޝ₤Ԝ⁻֧⁞ԕₐ܈\ue064ޟꁻށꂿՔꁤد\u2073ڑꂆؠ⁐ҟ⁝ݙ悻߰\ue073ܫꁉ߱ꂄՌꁨ߫ꁥэ\ue0a6ݰ⁺ۧ⁷ӽ₺Ԍꁮу⁄ԕ\ue0b1ܨ恬ۇ恻ԝꂵҘ⁄گ\ue07cޱ₿ՠ恮яꁑХ₼٬恠ԓ恇ߕꂙܘꁪݧ\ue079Ս悆ݜ恕ѿꁃ٩\ue09d֔\ue06bѫ⁘ֹꂵјꁸп恢ޙ悿ݤ⁛ܧ恵Э₨ߐ恬߯\ue076҉₌٬\ue068܋恤ѥꂱ\u05f8恝ٗ恝ҝ₱\u0604⁾Էꁵکₑ\u07b4⁒Ӄ恦թꂍؼ⁈ғ⁹ѡꂗظꁦً\u206fչ\ue0a4݄恒\u074b\ue040ۭꂣՔꁃݣ\ue06eܽ\ue098ߠ\ue057܋⁌ٕ\ue0b0ڴ⁂ܻ\ue067ԡ悗Ԭ\ue048ݻ\ue074ߩꂿШ\ue05dԫ⁗ٙ悤߸ꁅҟ恦ٍ悋״⁵҃ꁩСꂗ߈恐Л\ue079ܑꂠ\u07bc⁖ԗ恵٥\ue0b0դꁘٟ\ue04aء\ue081Ԅꁘؿ恍ґ\ue0afޘ\ue04f۫ꁿݍ₸ּ\u2073у⁂ڕꂄ٠恰׃ꁅә\ue09fҜ恒߫\ue04e۩\ue0b1ڸ⁃گ恭ґ\ue083Ҵ恬߃⁼ڝꂞސ恦ҟ\u206bӑꂷА⁊п\ue05fߥꂅ֨恎ӯ\u2069ܑ₇Ӭꁖۯ\ue046б\ue09cӼ⁵܋息؉悓Ќꁣܟ恐ؙꂷݜ恊ۿ恵ݕ\ue0bcڬ\ue069ڷ恠݉\ue086֔⁺ۗ恛Љ\ue09aۈꁂѳ恓ޙ\u209fڠꁺۛ恐Ե\ue0b9߰ꁂҧꁨۍꂑҀ恄ڟ恠ґ\ue0b9ь\ue05cҧꁘ֙\ue0acڬ\ue074ڣ\ue061ѝꂞԼꁀУ\ue04dح₻۸⁴ۏ\ue065ߵₛ֜ꁪׇꁄֵ₹ф⁃܃恫݉\ue0aa݄ꁮ՛\ue077ڽ\ue0abՈ\ue06eۯ\u206d֍ꂳҸꁥ\u05f7\ue05eޡ悤Ќ恸ӗꁧթꂑܜ⁐߷恩՝\ue098҄ꁉԳ\ue06dܝ悞ь恹֯\ue05aޅꂐٜⁿӷ⁛ޝ悛Ҭ\ue050ۻꁴۥꂓܜꁉէ\ue04bޙꂰҐꁑ٣恸߽\ue080ٔ⁋\u0557恧ҩꂽј恌ٳ\ue063ԝ悺\u07b4恃ևꁸܡ悎ݤꁃғ\u2060ۙ₳ؠ\ue067ދ⁔\u0601\ue080Մ恼҃\ue042߭\ue0bdۤ恙ҿ⁸ֽ悑ۨ⁋߇⁗ۉ₸\u05cc恠\u05ff\ue071ّ悾݈ꁅ՟恑ѭ悦Ռ恡ѫ\ue079թ悼Ѹ\u206c׃ꁳҩₘӄ⁚ڟ恏с₃հ\ue064އꁁ۽悒Դ\ue059Ѓ\ue04eݹꂿҤ\ue051֣\ue060օꂖߨ\ue072Ӄ恤ݹ\ue09fشꁞك\ue079ە悯ހꁑү恃ڱ\ue0bcԘꁍۃ恬ٝ悞ۘꁶԻ恥١₋դ恺֛恀ܕ\ue08bؤꁃ۫⁃ԕₕل恭ܓ恵ۉꂼް⁐گ\ue050ى₄Ҙꁋٟ⁂ٕ悬ל\ue067ܯꁢӑꂵӜꁸЛꁹЙꂛм恡ٗ恊Ե\ue09f\u074c⁘۫⁅ԁꂹ\u061c恂ַꁧށ\ue0a3ސ⁰ԻꁢН₡ь⁇ݫ\ue041ށ₼\u05c8恧\u058b⁽ّꂦҰ\ue050ܟ\ue075҅\ue0b5Մ\ue049Փ\ue066ݱ\ue09eѸ⁒տꁫ؝ꂁ֨ꁸدꁘ۽\ue09aب\ue04eևꁇڵ\ue0a8۸ꁟދ\ue068ݱ₂ܠꁗݫ⁖ށꂋҨ\ue073ݓ\ue06aֹꂫ֔\u206dӇ⁖љ₉Р\u2063\u07bb恺۱\ue097Ӱꁷׇ恃ڱ悾ڼ\u2061\u07b3ꁀٹ\ue0a4Р\ue067җꁨэꂇ߀ꁎֿꁹЁ悎Ҍ Ы\u2072ۡ\ue088Ԍ恦Ӄ恙ܙ₽ݸꁪ׳恪ݝ\ue095݀ꁓԯꁹԙ₋ј\ue04bݧ恀ߑ₡\u05cc\ue062ٻ恔ۡ\ue09dӰꁑדꁕԽ悊׀\ue046܇恒ڕ悅ݴ恓ү⁴ݵꂀЈꁠܫ\ue054ܡ\ue095ܼ\ue068܇恫ޭ₆Ь\u206cЇ\ue064ݡₓ٠\ue046؏ꁾٕ\ue0a1ڀ恄Ыꁨځ\ue090ܰ\u2072\u07bf\ue04bމ悱܀恗П⁆މ₮հ⁴Г\ue074֭₿Ӹ\ue047ѣ⁶խ\ue0b8٨恠ٓ恄؍悇ڴꁱҷ\ue052ܑꂄۤ恔߃ꁝбꂗߨꁼק⁉ߩ\ue0a8҈ꁈד恏н₳ڸ\ue07aݟ⁈ҝꂚܰꁉݓⁱו\ue08fڬ\u2067ګ\ue054ԡ₡רꁇד⁛ӹ\ue093Ь恢۷\ue050ۙ\ue090ޔꁘًꁿս悗ר恿ۛꁺߕₗِꁧ߿⁅ݭꂤӠ\ue063ރ\ue078ֹꂐ\u05cc⁐ҧ\u2063ٕ₂Ӵ\ue06dط恘ׁꂟِ\ue045Я\ue073߁\ue0aaۘ\ue04d҃\ue057љ₊\u05c8ꁈߗ\ue077ޕ\ue09cմ恚گ恋щꂩݼ\u2072Ջꁞӝ悽״恲ڿ\ue064ڭ悑ߤ恶ҧꁏБ\ue096րꁭ߯恐݁₴ո\ue05b܃恆Սꂲب恲ރꁥّ悈Ѹ⁌ݛ\u2069ܝ\ue093Мꁻ\u07bb恨ܽ₽\u058cꁊ\u07b3\ue04eٝ\ue093Դ⁞ү\ue077ա\ue092\u05fc恅ի⁞څ\ue09bۀꁁ\u05f7恰ՙ\ue0a7ӌ⁈߳恚҅\ue083֬\ue046ۗꁉԱ悔Ԩ⁓ݷ恝؉ꂣؼ恳ճ恅؉\ue099Ԩ⁎ӓꁌ֑\ue0aaܬ\ue051׃\u2067Щ悛Ь⁁ߣ恝۽ꂮ\u07bcꁂգ\ue07cҥ悱Ր\ue049֏\u2073ߍₜԜꁨؗ恈ܑꂮؐ\ue078ޏ恖ѭ悂Ј恏ݯ⁚߱ꂸՌ恴ӟ⁂\u05f9ꂋ߀恄ޗ\ue055ۡ₅ۼ恫ӯꁐԵ\ue0b5Ә\ue064ݯ⁍ӵꂗԼ息ԗ\ue04eإꂣߨꁤڋꁡڭ悈۔\ue048۷ꁐߕꂙް\ue043Տ恈ݡₗѸ\ue060ћ\u2065Թ\ue0a8Ԕ恣տꁝڽ您߰ꁎܯ\ue06eҥ悾ݔ恅ѻ恎יꂭԔꁘޟ\ue046رₐр\ue04bݛꁸҍ\u209dؠ⁒ؗꁑܵ₾ܨꁃߧꁍޥ₢֘恋އ⁶߹\ue0bcӌ\ue061ׯ⁷ء\ue090ּ恫Իꁿݝꂢڬ恧Ӈꁣک₵ՠ恁շ恐б\ue0a1݄恔ߣ\ue051ۑ悔ސ\ue048ڣꁍ\u0605ꂌ݄ꁾً\u2068Թ₸܄恭֯ꁡةꂮ۠ꁌҧ\ue06cԙ悾\u07bcꁬѓ\ue06eѕ₢Шꁷч恉ة\u209dѨ恷\u05cb\ue059ؽ悳߸⁜ҏⁱ֡ꂔܜ⁍ҟꁱ՝悲ܼ\u2064ߋꁏؙꂓդꁸտꁼԥ\ue098Ѽ恛އꁛԑ₎ӌꁾѳ恓Й₩ܨ\u2065ۯꁿԍ₤Ѵ恮ٗ\u2062ҍ\ue0b9Ԙ恝їꁣӍ\u209fشꁡܷ\u2062؉\ue08eذꁩڃꁿߡꂋڀꁞߋꁿӡꂢи⁾ֻꁘݵ₀ވ恗\u07fb恮ܩꂓ݄⁆ѳ恶ۑ悐ք⁰\u05cb\ue040ڭꂳټꁁӧ\ue068Щꂓܨ恊Ӄ⁞ܙ₨Ш\ue06fԷꁕߵₙ٨\ue06aқ\u2068ۥ悋ޜ⁖ԋ⁃յ\ue0aeܠ⁊տꁩҹꂡ׀恢ۿꁫߕꂎܠꁯݯ⁗ߕ悴ެꁞѷ\u2068\u0605患ڠ\ue043׃⁹۹悋ܰ⁵أ恜֝ꂩܴ⁞ҧ\ue056ׁ\ue0a4ސꁃً恶ҥꂂݔ恳߫ꁐߕ₆ۀ⁹ѣ\u206cޭ₰ބꁝڻꁯم悬Ѭꁠ֛恣۽悒ؔ\ue070ۏ\ue066ץ悇ۄꁇѿ恁ܹ\u209eԌꁵң\ue045ڵꂪӬ\ue041җ\ue071کꂧը⁍ғ\ue047ؽ悬\u05ec恲߯\ue072ݕꂿԸ⁺ѳ息ݙꂀӌ⁀ܿꁡߑ悅ۜ恉ћ恥ե\u209eوꁓҗꁧٽꂘܸ恬٣ꁱץꂋԈꁧݟ\ue065ڕ悉ܜ\ue055ܫ\ue049ٝ₋ڈ\ue07eد\ue057١ꂔݔ\ue061כ恌Б\u209e܀⁉ާ恓Չ\ue0aeД\u2069ثꁿةꂺݰꁆ߳ꁍݡ悳ِ恄އ恃Б\ue089м恔֗\ue071ؕ悯Ьꁐң\ue05a֑悏ܤꁁޯ\ue059ԡ悛\u05f8ꁳӻ\ue07eە\ue093Ф\ue05c\u05fb⁏ݭ₠Ҕ恓ַꁊЁ悩ڐꁦۃꁤفꂏܴ\ue072׃\ue067֕悿ڤ\ue053ԫ恱ߡ悡а\u206eӻ⁛ݭ悡҄\ue042ڏ恔ڡ\ue0aeЈ\u2065҃\ue054֩ꂅִ⁍ї\ue04eҭ\u209fԘ⁆݃ꁕѹꂯߨꁂܟꁕс\ue090ِꁗܯꁱՕ\u208fތ恭ٛ\ue073э₈݀\u2062ۋꁚӑ₶ް\ue072\u05cf\ue059ԍ₃Ө⁇ߣ\ue072ݵ\ue086ۜꁼз\ue067Աₐڰ⁵ӏ⁸ۭₔҌ恻ӏ⁄ڙ悪\u074c恱ޓꁓׅ悏Դ⁴ۛ恛ءꂂݐ\ue07cև恢ׅꂓՠ恫ӫ恓ԭꂺؠ恗ӧ\ue06eڥ\ue0b5،⁖\u0557恖م₴\u05ecꁗڟ⁉ߙ悅҈恁ԣꁪݥ\ue0a0Ӭ恀٧恻߭ꂙׄ\ue05e֛\ue074ܙꂉ۰\ue051ӛ\ue051ڭ\ue080\u0604ꁾՏ\ue048ޕꂻЬꁺݏ恍عₒрꁀ֧恨߁ꂟѬ⁒џꁧ\u05cd₅ِꁹէ\ue050ҙ\ue09aڴ\u2066ݓ恱ؕ\ue08aҴ恉ҧ⁰ҝ\ue094݈⁗ړ\ue063Эꂗݠ恷үꁮ٩ꂙаꁦ\u05fb恘ޑ\u209e۰ꁯի⁝ҽ\ue08bҜ\ue076ګ\ue068ޝ悈Ҩꁰ֯恐ݙꂑ\u05c8\u2066ا恽Э悑ՠ\ue04dҿꁤӱꂏٌ⁃ܧ恑ѭₑ݀ꁬػ\u206bם\ue085ܨ恫٣ ݵꂨЈꁑқ\ue063܍\ue0bdܐꁆҫ⁻ڭ悅ٔꁰГ⁑Х悌҄ꁌы⁛ؽₗ\u07fc恷ޏꁜֹ\ue09eՠ\ue04eثꁙԡꂛӌ⁗ܟ⁕ӝꂍ٘ꁢދ恸םₙݨꁉы恲҉悽֘\u206aԫ\u2064й悿ݐ\ue05eޏꁊ\u0601ₙМ\ue06eЧ⁽Ё\ue0a8ޘꁼٛ恐ՙꂮҌꁺԟꁧܝꂭ߰⁴ҫ\ue06dӍ₋Ҡ⁙ݛꁶҕ\ue0b3\u07b8\ue058ןꁝ֡ꂿ֘\ue07fܓ恇әꂯҜ\ue072ԓ\ue054ڵ\ue097Ӕ⁄ӳ息ҭ€Քⁱѓꁡڹ悏Ј⁂כꁜҡꂁѸ\ue076ڇꁂݝ悦Ը⁔\u0603⁔߹ꂃڐ\ue077ݫ恫ҙ\ue08aӬ\ue06bҗ恽Э₍ٜ恜\u0557\u2061مꂇ߀\u206e֗⁒ׅꂉݴ\ue07dןꁀڽꂭ֬恒\u058b恍ԍ悒ڸ\ue05dһ恽ڹ悳ۨ\u2062ԣ\ue06eՉꂬۄꁜҳꁛҡ悇Ԡ\ue053۳\ue046ڝ\ue09b\u05cc恣ك恂Ӆ悭ո恩ѧꁫ\u07b9ₑٰ恟ٻ恜ر₾ޠ恈گ恮ֱ\ue098۬ꁣя⁵ݱ患״⁂Я恜ؙꂕ\u0590%䉦ᓴ䌧吹䂠퐳䎒哟䉓퐼䇸鐰䁊ᓠ䀗퐻䃔鐿䆶ᓎ䆷퐺䂌鐉䆖ᓇ䍟吊䋜ᐴ䇲哞䉻吳䍰ᐜ䋶";

      do {
         char var19 = var13.charAt(var17);
         int var21 = 0;
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 6) {
               default -> 91;
               case 1 -> 210;
               case 2 -> 18;
               case 3 -> 2;
               case 4 -> 173;
               case 5 -> 24;
            }) ^ var22;
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

      III = var15;
      IIl = new Object[var15.length];
      int var9 = -1991791574;
      byte[] var7 = "¸C#\u0097{ÏG\u000e\u009e\u0096E`Þ+¡iXD\u0098!HZ?7ØâÌ{7\u001fMÿ3û9%U5\u0090t¹\u0015Ì\u001a-ìª\u009c/\u0097\u0005Sù\u0097º\u0087gÕÌÑÃÏn#\u0015\u008aå\u0099=vKçé\u0016~KÑâ»²Â:µ³>°H\u0091\u00894J\u008c6©3 dµq*&r¸BFBeê\u0094\u001d±t\u009a¾ì+\t\\³}ü*;\u0011*ò\u0087¢\u0014\u001bFø0ê\u0007³9ù\u0099'K\u001080\u009a\u008cY¬é\u0016~\u001c\u0082\u0098ù´×%\u000fÈÄ?B¤s\u0085Ô\u0094\u0088\u0016\u0085&X8WÐæ\u0091_ý!'l\u001f\u001f\fs(BDÚY\u009d\u0085\u0093\u0082\u0094ÄÿB\u0098Æ\u000f4\u0088î\u009dÏ\u008b\u00810\u009e¨\u000f \u009fS\u0086k§þ\u0094°\u0018c\u0095÷£:\u008c²DN¦s\u0003\u0089_\r\u0005{fØ¥óó£\u0019÷e\u0082Än\\\u0085¾\u008a»I\u0002W;Ü¢\u0094D.\b\u0016÷h<E¨±#F®z.x\u0092üC\tÞ\u0090ËTÔê<ØE\u0019ecY\u009b\u008eÐ\u0084\u0086<\u001f\u0090oø\nJÔô\u0083â?\u001e\u0082\u001f>8o\u0016:\u0015ÆÕX¤56<ëØáy\"«\u0011\\B\u0084\u0017ö~=\u0092ó\u001cX\u009b\u0001¥\u0005\u0010\u0081.\u0002ÞmP\u0099*Ñ´\u0002\u0001ÃI|\u0083÷Þ\u0083Ø%)C\u0005Ì!D\u0099µÚA.¹.×S·1V\u000e9ØîB+óXØO\nÆ+\u009a\u0099;\u0004í\u0087¦Zãæ\u001fÚ\u0000I¿vN\u0097\u0099³ÌÈÜØ:\u001cü¼C.\u008di\u0019hHÎã3\u0086/Wè-B\u0018ÁdÝÊ}\u0001¬¡\u0015:\u009eÎÜ\u000e¾Ìíê\u001eÁ\u007fbS7\u009eì\u009d \u0086xP&Î\b\u0086Oë_N7´t¨îþ¡°\nq\u00966Cï£i»(\u00ad%ÝÖû³Ô\u0087\u001e\u0014£ÏS\u0016-¦ lÊ>\u0007·¥\u008ctÚÒçy\u0097Í)ÒÏwð]BÏÁÒµüáÜ×y1.5viºèRy\u001f\u000eú!¢sÁó/^t»Í\u009fw©\u001a\u001e'÷\u0085\u009c[\u001b²!¤¹\u0014YÃçÌ\u0092bí*ô\nÃfú/´Å?2[=\u001e\u0012ù¸¹\u008aûO\u0097$ \u0096Ý\u0087\u009eôU\u009eg\u0086*ÓÒ\u0010\u0081\u0093*j&Ì\u001c»³Ì\u0011?\u0000÷\"\u009fZ\u0002:¼9¦\u0087ÇÆVhô@c\u000e¨Ð¤Á¨$Blõ\u0006á§Ó,îZ¬\u008d{Ô½¾îAh\b\u0013\u0082\b\u0004\u008a±<Ñqn@+G\u0013*@«Ì«LÖÄ\u0089ù³.\u0012ën*ÚÖ¶k$\r(±ó\u0011|Yfk\u009bõGK\u0004õ(K\u0087\u0089ÿqª\u008ePÔh'\u0001¼\u008d6\u0085\u000fE¤Ø$\u0082¨á|ôáÎï \"³íß\u009b\u0083C\fQÃN\u000f²\u0098\f\nòÏ\"5\u008d\u009fcÆË¦\u008bN#\u001aöLÝr@Æ\u0080\u008c\u0097\u009e\u0089-r,¦\u0085{'\u00010É\u007f\u0005\u0090\u0006Îªµë\u0083íùl¤éß\u0007_\u0017~\u000b\u0001Î'Ä\u008aiW ¼I\u0082\u0082×~îEÆ\u0091#RrÂØ\u0004\bo\u001d`ª?X\u008dX½ûRµ\u008c$\u001c\u001c§\u0006\u008el\u0082,\u0014JÒ,ÅýCáZÒ\u001c\u000b\u0019[+¦w¤{)\\èøeÂS·\u008aZÛ\u0093\u0010\u0018\tÎYÆ\u000f¢Ë'SàË\u0002µkÏ\u0013âä©A\"÷)\u0019è\b6³ïCiï\u0013E\u0085yC,-0e\u000b\u008a\u001eº\u009fÔPXý\u0087\u009dxq¦öñ\u001b\n®ù²ÀÂ¨\u008e\u0089dÆ\u0096A\u0010ãE¢¤J\u009eQðÇ.F\u008fü\u0097\u0093â'¯!\u0085\u0005\u009dúHñ¡k\u001c¹©7aCÝ¾\u0004¿\u0091\u0083ñX»ÉT\u009féõ\u00adß\u0004&©Ò\t\u0095úÀG²þÁ\u008bÑ:\u0092þ§\u0084\u008a\u0000\u009b¾4\u0098«S\u001b\u0014>Ñ\u0099\u000fYôtP=\u0017Û·{\nÆ».\u0012~m\u00adòß\u0080â8\u0018Ã,?¬'PÐ0±[Ü\u0013{L9ÐÎ\u0084\u0018¯d\u000f\u0081ë(]IQ»ð·¥\"[ch\bYUMÕ\u0014êª¨ká Ì\u0085ê{¾- ©qÜ8ÃH\u0006þ\u001cì\u0089®\u0017Ï\u001bYè¡ÅÝ5 `ÇO{µ\u0010c0ÓÂ<½}\u008aÊ\u000b\u000eê\u0082G½±_}æ2gðä\u0082\u0093ù®ÎÎ@ü¸AºÀéÄ¹æYXÛ\u0087Ï\u0011¼q\u009e\u0092ÎÞ\u008d\u001aK¡y?Â\u0086z0U\u0080ßA5ç\u0086uïðn[\u000fªu\rY¸¹ë×¨\u0095\u008b<¿?\u0010ýßH¹2\u0095i\fËò\u008a2\u0081©õáq}é´\u00116\u0081\u0090ñÓ\u009byàÏ\u0099-$A.Â\"Ù×¾\u000f\u00adÄÉ\u001dó\u009a½\u0097=ß8Û\u0090_÷ª¤÷\u008a\u009a\u0087#ÜG\u00903\u0017\u0099-#\u000b4:µ\u009dSHÚ\u0000\u0086\u0087uöV£\u001b£×\u0011_©yè\u0089wå}SÐ\u009c\u0017\f\u0088D\u0005Ô!{¹\u001bé\u008cÎ\"É\u0081\u0010\\êË\u0015Bl\u009cX\tÏã\tj@\nÑ#¬;äæ(k»ð.`ºC4ÿÃ^\u0010,\u008dºÄûg9\b\u0011µà¯\u000f\u0097Ï\u0093ÚM\u001eÅ 2¨\u001d/ò\u0019/#í\u0013_xïAª5o\u0096¿ö+é¬\tHç\u0014\u0099»h[©ÚÖAñ¹\b\u0098\u009a\u0080\u0098BÒ`¶´¶\fÖu\u009b\tí\u009f\u000b\u0015;\u0018E\t·`ü%º¨Ú\u0086@w¸å1Â\u008c\u000b\u0001\u009d\u009bï8\u0098=Â8\u009c>nÆ7&¥Am\u001c\u0080_Ô;ôn½e\u008c\u009dí\u001aw«:¤J>t¿GÕQ\u0010>¬öm)Ýñd\u007fëN#2Áæ\u0092\u0018\u008bWË-å>\">\u0099¾\u0082$Sý\r\u000fY\u0089Å+É·Ü«ÂPZ\u000f§¤:\u00adß#´»-°\"¡Çöb)ìG!²]0Öµ\u008f\u008b\u0016V\u009b-5>\u0012O£\u00adÙáï¯ÍQ\bûä\u0085w\u0081îRl¤\u0082Z\u0005ìÈ\u008f\u0014}Ð\u001eZ]g%ðÈê\u00ad\u0083SÂår¦z«ðÂu|\u0088|Å0Ä©\u0093½\u0019Ö\u009c¯\u008b«\u009f¹ff¢òÌkúh´?g\r£C64ù²\u0091&bVM¸v`à±\b8ó\u0089Tô¢\n\u008cåK\u0014¨\u0081¿tPN\u008eU¾V¯`®\u007fB8+ñ¼uw\u0011bqu§ÁÀê/\u008d\n\u009ew\u0092[{b\u00864\u0085\u009eoÊ\u007f\u0014ü[\u001b~\u0003\u0003\u0000¡I³°\u0096'_ëú£\u0091\u0014'9Ñ âc¢ü#\u001dòL*\u0088\u0088Y\u0006\u0013\u009d7\u0010ÐÐ\u007f\u000eË \u009bxÌ\u009b¯ob\u001arX¦8ÈwM\r%\u0084v@N\nÝ÷í'ºµFhM^\u0017]½`\t\u0082û\b~?Ñ\u0005\t\u008a>í\u0015Ãæ6ñ{IRr¶§ãgÆ\\-[ub´®õÈ]!u\u008fý\u001dçv»\u0015z\u001aW\u008c\u001b²æN}\u001f\u0004È\u00ad/\tè\u001c$\u0098ê©}Xq¦5\u0084tHu\u001dp\u008f\u009a¬\"Âå-Á=\u00ad\u0015^¾º\u0089\u001eQc00Ùª´ú\u0001Cd_o¤F´\u0092p\u0011Î¨Ù\u00adã-al¨3§L\u0017\u008dN\u00007Qîi2À\u0014µ\tªÁ\u0081÷\u0080Ð{\u0001?U=ú\u0081\u008c¿û\u008f~\u000b\u0015\t\u0085\u0016«Zö$\u000b¹ÕK=H\n§=Ô\u0014Xö\u00832\u0095»\u0087m=\u0087\u0013èûa\u001f\u0096Ë£ÓâpØ(\u0004Úêè\u0014F»\u00117Ðs`ÌZ/¶\u0015ZbÀe_\u0095\u0018\t°%ª\u0014<Ô>\u0095ÙÆ\u008eõùÍãÀ:G\u0019X×ìü¨³>S\u001bÔ¬+ýèÛ\u001d\u0015,ÄöYøÝ\u0091e,I¿?ºË\u0092\u0087YaQ-HþíF\r¡H*ýPÏ¼Nm\u0010ôûS¥)\u000eÈ\u0088(P\u0080Î6~l@W.íòP{\u0084e\u009aBM\u00139\u00995\u0096®d\u0086º³Ç«\u009d=µ\u0013Ã\u009d\tÈ^ Æîz?\u0002ø)\u0090 ½\u0006nw\u0088Uì8DÔ¶6Vt\u001e_Õ\u0080\u0006;ú·R\\â¤AÁVéö\u0089ê±\u0007)Ç\rü\u0003ÁªI\u001b}ý¶l\u0091gDÙØA\u0081Ê#:ÿS^\u008b[\u0001ö\u0089ú\u0083\u001fErr\u000bu[ï\u009b#@\u008c¢t[\u0085ÿóÛ\u0082u\u009fy y8Y\u0000q\u0007\u0098Ñê\u0081Ñx\u000e\u0003¨½ Ý¸é¥\u00148\u009eÜ¾T±g®Yä\u0096\u0010\u001d\u0010\u0019\u0000\u000eÞ_EIGî¬\u0091ÍhS\u008d%måaTÕ\u008aG\u009f{¯Á;ÎÈ\u0082\u0088D©\u009e\u0014DÄc¯\u0011\u0094Þ¤1\u0083\u001bl2\u0015\u00adFxq<0§÷®qûu\u0087\u0084n/\u008aï\u0016 L\u001d2ýÓ´²ÇW\u000f\u0006Ã\nl*Bî8öØ\u0018®±<e/r@Ïû\u0013\u009f\u0094Ñó\u0089Öôs\u0098R\u009a÷0\\³QÃ$#ýÒ%i?yB$¬úvi£µ!Ñ\u0011\"yöå|â1@ßû\u0099TZ®\u008fª\u009d<\u0015\r*I'Ä\u0019\u008a¸þ-kDCÚïw\u001eµ÷bç\u009e\u0084î\u000f1\u009c\u0016Tºá \u0097q\u0015\u008b:½\u0088§\u0016§³&j\u008a¶ZxfaõDz SD\tu`\u0095½E\u001d\nÞÏI\u0000Ñö\u0089¸\u0089;\u00925\u009e\u001e\u0017ÔY\\K\u0011¸9\t==I\u0087Øù\u0090»\u0088.´1_¡y\u0095¶£\u009fs¢\u0089s\u008b\u0007¹.þ \u008d&\u0016p\u0092\u008d¹Øó\u0012ÂS\u0017xÜ¬WGU¿_ ¾vøïg½o\u0016p\u0007]¦\u0013[GÊ!\u000e¯^Î\u0081%/\u0082gYßµ{J\u009c½îl+\u0014\u009aÆÍ)Ð¶\u000e\u009c\u001dCC\u0004Rð1\u0002c zoü\u0016dz«ë\u0096.\u001f<÷O2/Ñë\u001aq\u0016Õ*\u0014Åè´Û 8\u001b\u008e©X\u009cöÁ\u0005 ö¢Â<§7\u0007]ê\u0082B)U\f^^KqÊÞk~c@÷R¸ à;Q\u0084Ù¨ØI$øº\u0094å\u0095K\u0090Ç\u008e\u0095èE\u0016Þ\u0002\n\u001aú\u009eÿW§chP¯R9§fs\u007fxWâäA×6â@p\u0094\u000e\u008býh\u0085Å%\u000bT½¼*ÑF\u0007Þ¨\n\u008efÝO/\fÈxã.\u0095®\u0015L\u0010=(\u009bR¥5h0\u009aH\u0097Î\u0085þ&[Q\u0094M#.\u0080JzÅ(§\u0090û\u008eÄ·I\u0015Ä÷¿ºôÀ1\u0019Ú{\u0000¯Þ\u008fT/\u0087¡ßÝ¬V¨Ø&?ùR`ù\u0090ø\u009b~¢\u0012;±íÖÝF;ù\u008bFteYw+\u0099\u001aÜÌ³Â\u000b\u00039\u000e\u0014ê\"\rß\u008d|\u0015\u001fÚo®5\u0088ºý{`_9íK>Ö\u00008(ÙÕáþ.\u009címlÆ\u001e\u0003.¢úgbðôÔ\u001f¥6\u0080\u0094¡ß8Ñ$ÒÃÁg\u008d\u009eðEÒU\b{ú\u0097I\u001eZß\u0091$)d«2)\u0083xwdøBÿ'K\u0019\u009aÆ\u0080SØ\u00841\u00160,·;¡j!\u0005»¾3èK ×&2\u0097\u001d¬\u0005|@ä\u0095°æ\u009f©\u0099\t4²ÄIY\u008dþM\u009aï¸\u009f¶ºf\f\b?Y\u0003\u001e]Wö\fZy³Qþ\u001eæ\u008b\u009aútÔgE~Ï\u0004Â·vüO\u0098Í"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      ll = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         ll[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var5 = new String[Illlll(-1834188252, var23 ^ 1671129673)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = lIIIII(973275269, var23 ^ -1611547287)).length();
      int var1 = Illlll(-1834188229, var23 ^ -1243677350);
      int var25 = -1;

      label98:
      while (true) {
         int var28 = Illlll(-1834188230, var23 ^ -1658696597);
         String var30 = var2.substring(++var25, var25 + var1);
         byte var10002 = -1;

         while (true) {
            label93: {
               char[] var45 = var30.toCharArray();
               int var10004 = var45.length;
               int var6 = 0;
               int var48 = var28;
               var41 = var45;
               var10001 = var10004;
               char[] var57;
               int var10006;
               if (var10004 <= 1) {
                  var57 = var45;
                  var10004 = var28;
                  var10006 = var6;
               } else {
                  var48 = var28;
                  var10001 = var10004;
                  if (var10004 <= var6) {
                     break label93;
                  }

                  var57 = var45;
                  var10004 = var28;
                  var10006 = var6;
               }

               while (true) {
                  var57[var10006] = (char)(var57[var10006] ^ var10004 ^ switch (var6 % Illlll(-1834188226, var23 ^ -1629204828)) {
                     case 0 -> Illlll(-1834188227, var23 ^ 694178387);
                     case 1 -> Illlll(-1834188228, var23 ^ -1761790969);
                     case 2 -> Illlll(-1834188237, var23 ^ -991856932);
                     case 3 -> Illlll(-1834188238, var23 ^ -2044280889);
                     case 4 -> 4;
                     case 5 -> Illlll(-1834188239, var23 ^ -434740278);
                     default -> Illlll(-1834188240, var23 ^ 877246185);
                  });
                  var6++;
                  if (var48 == 0) {
                     var10006 = var48;
                     var57 = var41;
                     var10004 = var48;
                  } else {
                     if (var10001 <= var6) {
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
                     II = new String[Illlll(-1834188225, var23 ^ 1651421634)];
                     return;
                  }

                  var1 = var2.charAt(var25);
                  break;
               default:
                  var5[var3++] = var50;
                  if ((var25 += var1) < var4) {
                     var1 = var2.charAt(var25);
                     continue label98;
                  }

                  var4 = (var2 = lIIIII(973275268, var23 ^ 1317920435)).length();
                  var1 = Illlll(-1834188231, var23 ^ 1229092962);
                  var25 = -1;
            }

            var28 = Illlll(-1834188232, var23 ^ 1907794774);
            var30 = var2.substring(++var25, var25 + var1);
            var10002 = 0;
         }
      }
   }

   private Map IIl(String var1) {
      Path var2 = this.ll(var1);
      return this.IllIl(IlIIllIII.lI(IIllll(Illlll(-1834188275, -516764586 ^ -2017585130), Illlll(-1834188276, -516764586 ^ -771517856))), var2.toString());
   }

   private IlIIIIIl IlI() {
      IlIIIIIl var1 = this.lI.II().IIlIII();

      try {
         if (var1 == null) {
            throw new IllegalStateException(IlIIllIII.lI(IIllll(Illlll(-1834188285, -1724167304 ^ -1190124269), Illlll(-1834188286, -1724167304 ^ 246022209))));
         } else {
            return var1;
         }
      } catch (IllegalStateException var2) {
         throw llII(var2);
      }
   }

   Map<String, Object> Ill() {
      return this.IIlIll(this::llIII);
   }

   Map<String, Object> lII(JsonObject var1) {
      return this.IlIlI(IlIIllIII.lI(IIllll(Illlll(-1834188287, -1525637074 ^ -921564582), Illlll(-1834188288, -1525637074 ^ 423364231))), this::II);
   }

   private static String lIl(lllIIlIl var0) {
      int var1 = -57259256;

      try {
         switch (lllIIIll.I[var0.ordinal()]) {
            case 1:
               return IlIIllIII.lI(IIllll(Illlll(-1834188281, var1 ^ -32295094), Illlll(-1834188282, var1 ^ 967170259)));
            case 2:
               return IlIIllIII.lI(IIllll(Illlll(-1834188283, var1 ^ 126753781), Illlll(-1834188284, var1 ^ 1522932317)));
            case 3:
               return IlIIllIII.lI(IIllll(Illlll(-1834188261, var1 ^ -2063075451), Illlll(-1834188262, var1 ^ -1941568105)));
            case 4:
               return IlIIllIII.lI(IIllll(Illlll(-1834188263, var1 ^ -2142999765), Illlll(-1834188264, var1 ^ -1871938978)));
            case 5:
               return IlIIllIII.lI(IIllll(Illlll(-1834188257, var1 ^ -1828497806), Illlll(-1834188258, var1 ^ 1332872264)));
            case 6:
               return IlIIllIII.lI(IIllll(Illlll(-1834188259, var1 ^ 1258556609), Illlll(-1834188260, var1 ^ 434705545)));
            default:
               throw new MatchException(null, null);
         }
      } catch (IllegalStateException var2) {
         throw llII(var2);
      }
   }

   Map<String, Object> llI() {
      return this.IIlIll(this::lIlll);
   }

   private Map lll(int var1) {
      int var5 = 1332625742;
      LinkedHashMap var2 = new LinkedHashMap();
      var2.put(IlIIllIII.lI(IIllll(Illlll(-1834188269, var5 ^ -923821625), Illlll(-1834188270, var5 ^ -1846107654))), true);
      var2.put(IlIIllIII.lI(IIllll(Illlll(-1834188271, var5 ^ -438559400), Illlll(-1834188272, var5 ^ 572898138))), var1);
      var2.put(IlIIllIII.lI(IIllll(Illlll(-1834188265, var5 ^ -803424988), Illlll(-1834188266, var5 ^ 1485418425))), true);
      var2.put(IlIIllIII.lI(IIllll(Illlll(-1834188267, var5 ^ 1545596040), Illlll(-1834188268, var5 ^ -987357726))), false);
      var2.put(IlIIllIII.lI(IIllll(Illlll(-1834188181, var5 ^ 566305891), Illlll(-1834188182, var5 ^ -62793327))), this.lllII(this.lI.ll().IllIII()));
      Path var3 = this.lI.ll().IIlI();

      LinkedHashMap var10000;
      String var10001;
      String var10002;
      label39: {
         try {
            var10000 = var2;
            var10001 = IlIIllIII.lI(IIllll(Illlll(-1834188183, var5 ^ 1061045230), Illlll(-1834188184, var5 ^ -1114778788)));
            if (var3 == null) {
               var10002 = null;
               break label39;
            }
         } catch (IllegalStateException var8) {
            throw llII(var8);
         }

         var10002 = var3.toString();
      }

      label32: {
         try {
            var10000.put(var10001, var10002);
            var2.put(IlIIllIII.lI(IIllll(Illlll(-1834188177, var5 ^ -288170178), Illlll(-1834188178, var5 ^ -304839688))), IIllIl(this.lI.ll().IlllIl()));
            var2.put(IlIIllIII.lI(IIllll(Illlll(-1834188179, var5 ^ -739732872), Illlll(-1834188180, var5 ^ -1566304295))), this.lI.ll().III());
            var2.put(IlIIllIII.lI(IIllll(Illlll(-1834188189, var5 ^ -5338951), Illlll(-1834188190, var5 ^ 1933542935))), this.lIIlI());
            if (this.lI.II() == null) {
               var9 = null;
               break label32;
            }
         } catch (IllegalStateException var7) {
            throw llII(var7);
         }

         var9 = this.lI.II().IlIIll();
      }

      IIIlIIII var4 = var9;

      try {
         if (var4 != null) {
            var2.put(IlIIllIII.lI(IIllll(Illlll(-1834188191, var5 ^ -937167460), Illlll(-1834188192, var5 ^ 2080282003))), this.IIlIII(var4));
         }

         return var2;
      } catch (IllegalStateException var6) {
         throw llII(var6);
      }
   }

   private int IIII(JsonObject param1, String param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 34
      // 04: aload 1
      // 05: aload 2
      // 06: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 09: ifeq 34
      // 0c: goto 13
      // 0f: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: aload 1
      // 14: aload 2
      // 15: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 18: invokevirtual com/google/gson/JsonElement.isJsonNull ()Z
      // 1b: ifne 34
      // 1e: goto 25
      // 21: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: aload 1
      // 26: aload 2
      // 27: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 2a: invokevirtual com/google/gson/JsonElement.getAsInt ()I
      // 2d: goto 35
      // 30: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33: athrow
      // 34: iload 3
      // 35: ireturn
   }

   private Color IIIl(JsonElement param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w 173267481
      // 003: istore 7
      // 005: aload 1
      // 006: ifnull 017
      // 009: aload 1
      // 00a: invokevirtual com/google/gson/JsonElement.isJsonNull ()Z
      // 00d: ifeq 053
      // 010: goto 017
      // 013: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 016: athrow
      // 017: new java/awt/Color
      // 01a: dup
      // 01b: ldc_w -1834188185
      // 01e: iload 7
      // 020: ldc_w -237555893
      // 023: ixor
      // 024: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 027: ldc_w -1834188186
      // 02a: iload 7
      // 02c: ldc_w -468872122
      // 02f: ixor
      // 030: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 033: ldc_w -1834188187
      // 036: iload 7
      // 038: ldc_w 1839562671
      // 03b: ixor
      // 03c: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 03f: ldc_w -1834188188
      // 042: iload 7
      // 044: ldc_w 1817738888
      // 047: ixor
      // 048: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 04b: invokespecial java/awt/Color.<init> (IIII)V
      // 04e: areturn
      // 04f: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 052: athrow
      // 053: aload 1
      // 054: invokevirtual com/google/gson/JsonElement.isJsonObject ()Z
      // 057: ifeq 13d
      // 05a: aload 1
      // 05b: invokevirtual com/google/gson/JsonElement.getAsJsonObject ()Lcom/google/gson/JsonObject;
      // 05e: astore 2
      // 05f: aload 0
      // 060: aload 2
      // 061: ldc_w -1834188165
      // 064: iload 7
      // 066: ldc_w -2125345621
      // 069: ixor
      // 06a: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 06d: ldc_w -1834188166
      // 070: iload 7
      // 072: ldc_w 680710140
      // 075: ixor
      // 076: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 079: invokestatic k74/x/llIIlllI.IIllll (II)Ljava/lang/String;
      // 07c: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 07f: ldc_w -1834188167
      // 082: iload 7
      // 084: ldc_w -613319610
      // 087: ixor
      // 088: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 08b: invokevirtual k74/x/llIIlllI.IIII (Lcom/google/gson/JsonObject;Ljava/lang/String;I)I
      // 08e: istore 3
      // 08f: aload 0
      // 090: aload 2
      // 091: ldc_w -1834188168
      // 094: iload 7
      // 096: ldc_w 916884652
      // 099: ixor
      // 09a: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 09d: ldc_w -1834188161
      // 0a0: iload 7
      // 0a2: ldc_w -1163275922
      // 0a5: ixor
      // 0a6: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 0a9: invokestatic k74/x/llIIlllI.IIllll (II)Ljava/lang/String;
      // 0ac: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0af: ldc_w -1834188162
      // 0b2: iload 7
      // 0b4: ldc_w 1783674580
      // 0b7: ixor
      // 0b8: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 0bb: invokevirtual k74/x/llIIlllI.IIII (Lcom/google/gson/JsonObject;Ljava/lang/String;I)I
      // 0be: istore 4
      // 0c0: aload 0
      // 0c1: aload 2
      // 0c2: ldc_w -1834188163
      // 0c5: iload 7
      // 0c7: ldc_w -741012770
      // 0ca: ixor
      // 0cb: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 0ce: ldc_w -1834188164
      // 0d1: iload 7
      // 0d3: ldc_w -1227075144
      // 0d6: ixor
      // 0d7: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 0da: invokestatic k74/x/llIIlllI.IIllll (II)Ljava/lang/String;
      // 0dd: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0e0: ldc_w -1834188173
      // 0e3: iload 7
      // 0e5: ldc_w -346570359
      // 0e8: ixor
      // 0e9: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 0ec: invokevirtual k74/x/llIIlllI.IIII (Lcom/google/gson/JsonObject;Ljava/lang/String;I)I
      // 0ef: istore 5
      // 0f1: aload 0
      // 0f2: aload 2
      // 0f3: ldc_w -1834188174
      // 0f6: iload 7
      // 0f8: ldc_w -325477429
      // 0fb: ixor
      // 0fc: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 0ff: ldc_w -1834188175
      // 102: iload 7
      // 104: ldc_w -2003640946
      // 107: ixor
      // 108: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 10b: invokestatic k74/x/llIIlllI.IIllll (II)Ljava/lang/String;
      // 10e: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 111: ldc_w -1834188176
      // 114: iload 7
      // 116: ldc_w -330923027
      // 119: ixor
      // 11a: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 11d: invokevirtual k74/x/llIIlllI.IIII (Lcom/google/gson/JsonObject;Ljava/lang/String;I)I
      // 120: istore 6
      // 122: new java/awt/Color
      // 125: dup
      // 126: iload 3
      // 127: invokestatic k74/x/llIIlllI.lIlI (I)I
      // 12a: iload 4
      // 12c: invokestatic k74/x/llIIlllI.lIlI (I)I
      // 12f: iload 5
      // 131: invokestatic k74/x/llIIlllI.lIlI (I)I
      // 134: iload 6
      // 136: invokestatic k74/x/llIIlllI.lIlI (I)I
      // 139: invokespecial java/awt/Color.<init> (IIII)V
      // 13c: areturn
      // 13d: aload 1
      // 13e: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 141: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 144: astore 2
      // 145: aload 2
      // 146: ldc_w -1834188169
      // 149: iload 7
      // 14b: ldc_w -1832645106
      // 14e: ixor
      // 14f: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 152: ldc_w -1834188170
      // 155: iload 7
      // 157: ldc_w 1839184035
      // 15a: ixor
      // 15b: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 15e: invokestatic k74/x/llIIlllI.IIllll (II)Ljava/lang/String;
      // 161: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 164: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 167: ifeq 170
      // 16a: aload 2
      // 16b: bipush 1
      // 16c: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 16f: astore 2
      // 170: aload 2
      // 171: ldc_w -1834188171
      // 174: iload 7
      // 176: ldc_w -1388145829
      // 179: ixor
      // 17a: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 17d: invokestatic java/lang/Long.parseLong (Ljava/lang/String;I)J
      // 180: lstore 3
      // 181: aload 2
      // 182: invokevirtual java/lang/String.length ()I
      // 185: ldc_w -1834188172
      // 188: iload 7
      // 18a: ldc_w -1428229037
      // 18d: ixor
      // 18e: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 191: if_icmple 1a3
      // 194: new java/awt/Color
      // 197: dup
      // 198: lload 3
      // 199: l2i
      // 19a: bipush 1
      // 19b: invokespecial java/awt/Color.<init> (IZ)V
      // 19e: areturn
      // 19f: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a2: athrow
      // 1a3: new java/awt/Color
      // 1a6: dup
      // 1a7: lload 3
      // 1a8: l2i
      // 1a9: ldc_w -1834188213
      // 1ac: iload 7
      // 1ae: ldc_w -1368791398
      // 1b1: ixor
      // 1b2: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 1b5: ior
      // 1b6: bipush 1
      // 1b7: invokespecial java/awt/Color.<init> (IZ)V
      // 1ba: areturn
   }

   private Map IIlI(JsonObject var1) {
      int var3 = -1707662914;
      IIIIIlII var2 = this.IIIll(this.lIllI(var1, IlIIllIII.lI(IIllll(Illlll(-1834188214, var3 ^ -1452230009), Illlll(-1834188215, var3 ^ -674077821)))));
      var2.lllI(
         this.l(var1, IlIIllIII.lI(IIllll(Illlll(-1834188216, var3 ^ -1872680987), Illlll(-1834188209, var3 ^ -654028056))), var2.lll()),
         this.l(var1, IlIIllIII.lI(IIllll(Illlll(-1834188210, var3 ^ -1207396454), Illlll(-1834188211, var3 ^ 1160222567))), var2.ll())
      );
      this.lI.l();
      return this.IllI(false);
   }

   private Map IIll(JsonObject var1) {
      String var2 = this.IllIII(
         this.lIllI(var1, IlIIllIII.lI(IIllll(Illlll(-1834188212, -1224933417 ^ -189648481), Illlll(-1834188221, -1224933417 ^ -1295234812))))
      );
      boolean var3 = this.I.Ill(var2);

      try {
         if (!var3) {
            throw new IllegalStateException(IlIIllIII.lI(IIllll(Illlll(-1834188222, -1224933417 ^ -308372183), Illlll(-1834188223, -1224933417 ^ -883219553))));
         }
      } catch (IllegalStateException var4) {
         throw llII(var4);
      }

      return this.lllI();
   }

   private List<Map<String, Object>> IlII(lIIIIIlI var1) {
      ArrayList var2 = new ArrayList();

      for (lIllll var4 : var1.IIll()) {
         LinkedHashMap var5 = new LinkedHashMap();
         var5.put(IlIIllIII.lI(IIllll(Illlll(-1834188224, 363818200 ^ 761494374), Illlll(-1834188217, 363818200 ^ -218523288))), var4.III());
         var5.put(IlIIllIII.lI(IIllll(Illlll(-1834188218, 363818200 ^ 2094160173), Illlll(-1834188219, 363818200 ^ 1183513482))), var4.IlI());
         var2.add(var5);
      }

      return var2;
   }

   Map<String, Object> IlIl(JsonObject var1) {
      return this.IIlIll(this::llllI);
   }

   private Map<String, Object> IllI(boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w -506772733
      // 003: istore 23
      // 005: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 008: astore 2
      // 009: iload 1
      // 00a: ifeq 024
      // 00d: aload 2
      // 00e: ifnull 024
      // 011: goto 018
      // 014: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 017: athrow
      // 018: aload 2
      // 019: lconst_0
      // 01a: invokestatic k74/x/IlIIIlIll.l (Lnet/minecraft/class_310;J)V
      // 01d: goto 024
      // 020: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 023: athrow
      // 024: ldc_w -1834188220
      // 027: iload 23
      // 029: ldc_w -2081387781
      // 02c: ixor
      // 02d: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 030: istore 3
      // 031: ldc_w -1834188197
      // 034: iload 23
      // 036: ldc_w 681427551
      // 039: ixor
      // 03a: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 03d: istore 4
      // 03f: aload 2
      // 040: ifnull 062
      // 043: aload 2
      // 044: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
      // 047: ifnull 062
      // 04a: goto 051
      // 04d: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 050: athrow
      // 051: aload 2
      // 052: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
      // 055: invokevirtual net/minecraft/class_1041.method_4486 ()I
      // 058: istore 3
      // 059: aload 2
      // 05a: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
      // 05d: invokevirtual net/minecraft/class_1041.method_4502 ()I
      // 060: istore 4
      // 062: new java/util/ArrayList
      // 065: dup
      // 066: invokespecial java/util/ArrayList.<init> ()V
      // 069: astore 5
      // 06b: aload 0
      // 06c: getfield k74/x/llIIlllI.lI Lk74/x/IIIIIllII;
      // 06f: invokevirtual k74/x/IIIIIllII.II ()Lk74/x/lIIIlIlI;
      // 072: invokevirtual k74/x/lIIIlIlI.IIllI ()Ljava/util/List;
      // 075: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 07a: astore 6
      // 07c: aload 6
      // 07e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 083: ifeq 12b
      // 086: aload 6
      // 088: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 08d: checkcast k74/x/IIIIIlII
      // 090: astore 7
      // 092: aload 2
      // 093: ifnull 11a
      // 096: aload 2
      // 097: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
      // 09a: ifnull 11a
      // 09d: goto 0a4
      // 0a0: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a3: athrow
      // 0a4: aload 7
      // 0a6: invokeinterface k74/x/IIIIIlII.lll ()D 1
      // 0ab: dstore 8
      // 0ad: aload 7
      // 0af: invokeinterface k74/x/IIIIIlII.ll ()D 1
      // 0b4: dstore 10
      // 0b6: dconst_0
      // 0b7: iload 3
      // 0b8: i2d
      // 0b9: aload 7
      // 0bb: invokeinterface k74/x/IIIIIlII.IIllI ()D 1
      // 0c0: dsub
      // 0c1: invokestatic java/lang/Math.max (DD)D
      // 0c4: dstore 12
      // 0c6: dconst_0
      // 0c7: iload 4
      // 0c9: i2d
      // 0ca: aload 7
      // 0cc: invokeinterface k74/x/IIIIIlII.IIIl ()D 1
      // 0d1: dsub
      // 0d2: invokestatic java/lang/Math.max (DD)D
      // 0d5: dstore 14
      // 0d7: dconst_0
      // 0d8: dload 8
      // 0da: dload 12
      // 0dc: invokestatic java/lang/Math.min (DD)D
      // 0df: invokestatic java/lang/Math.max (DD)D
      // 0e2: dstore 16
      // 0e4: dconst_0
      // 0e5: dload 10
      // 0e7: dload 14
      // 0e9: invokestatic java/lang/Math.min (DD)D
      // 0ec: invokestatic java/lang/Math.max (DD)D
      // 0ef: dstore 18
      // 0f1: dload 16
      // 0f3: dload 8
      // 0f5: dcmpl
      // 0f6: ifne 108
      // 0f9: dload 18
      // 0fb: dload 10
      // 0fd: dcmpl
      // 0fe: ifeq 11a
      // 101: goto 108
      // 104: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 107: athrow
      // 108: aload 7
      // 10a: dload 16
      // 10c: dload 18
      // 10e: invokeinterface k74/x/IIIIIlII.lllI (DD)V 5
      // 113: goto 11a
      // 116: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 119: athrow
      // 11a: aload 5
      // 11c: aload 0
      // 11d: aload 7
      // 11f: invokevirtual k74/x/llIIlllI.lIIIl (Lk74/x/IIIIIlII;)Ljava/util/Map;
      // 122: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 127: pop
      // 128: goto 07c
      // 12b: invokestatic k74/x/IlIIIlIll.I ()Lk74/x/IIIIlll;
      // 12e: astore 6
      // 130: new java/util/LinkedHashMap
      // 133: dup
      // 134: invokespecial java/util/LinkedHashMap.<init> ()V
      // 137: astore 7
      // 139: aload 7
      // 13b: ldc_w -1834188198
      // 13e: iload 23
      // 140: ldc_w 1627563549
      // 143: ixor
      // 144: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 147: ldc_w -1834188199
      // 14a: iload 23
      // 14c: ldc_w 74690733
      // 14f: ixor
      // 150: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 153: invokestatic k74/x/llIIlllI.IIllll (II)Ljava/lang/String;
      // 156: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 159: bipush 1
      // 15a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 15d: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 162: pop
      // 163: aload 7
      // 165: ldc_w -1834188200
      // 168: iload 23
      // 16a: ldc_w 1061266086
      // 16d: ixor
      // 16e: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 171: ldc_w -1834188193
      // 174: iload 23
      // 176: ldc_w -190931499
      // 179: ixor
      // 17a: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 17d: invokestatic k74/x/llIIlllI.IIllll (II)Ljava/lang/String;
      // 180: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 183: iload 3
      // 184: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 187: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 18c: pop
      // 18d: aload 7
      // 18f: ldc_w -1834188194
      // 192: iload 23
      // 194: ldc_w -272519919
      // 197: ixor
      // 198: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 19b: ldc_w -1834188195
      // 19e: iload 23
      // 1a0: ldc_w -1737309463
      // 1a3: ixor
      // 1a4: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 1a7: invokestatic k74/x/llIIlllI.IIllll (II)Ljava/lang/String;
      // 1aa: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 1ad: iload 4
      // 1af: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1b2: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 1b7: pop
      // 1b8: aload 7
      // 1ba: ldc_w -1834188196
      // 1bd: iload 23
      // 1bf: ldc_w -381497448
      // 1c2: ixor
      // 1c3: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 1c6: ldc_w -1834188205
      // 1c9: iload 23
      // 1cb: ldc_w 2106582176
      // 1ce: ixor
      // 1cf: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 1d2: invokestatic k74/x/llIIlllI.IIllll (II)Ljava/lang/String;
      // 1d5: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 1d8: aload 6
      // 1da: ifnull 1e5
      // 1dd: bipush 1
      // 1de: goto 1e6
      // 1e1: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e4: athrow
      // 1e5: bipush 0
      // 1e6: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1e9: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 1ee: pop
      // 1ef: aload 7
      // 1f1: ldc_w -1834188206
      // 1f4: iload 23
      // 1f6: ldc_w 223944800
      // 1f9: ixor
      // 1fa: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 1fd: ldc_w -1834188207
      // 200: iload 23
      // 202: ldc_w 1519494217
      // 205: ixor
      // 206: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 209: invokestatic k74/x/llIIlllI.IIllll (II)Ljava/lang/String;
      // 20c: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 20f: aload 6
      // 211: ifnonnull 21c
      // 214: lconst_0
      // 215: goto 221
      // 218: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21b: athrow
      // 21c: aload 6
      // 21e: invokevirtual k74/x/IIIIlll.II ()J
      // 221: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 224: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 229: pop
      // 22a: aload 7
      // 22c: ldc_w -1834188208
      // 22f: iload 23
      // 231: ldc_w 1903657339
      // 234: ixor
      // 235: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 238: ldc_w -1834188201
      // 23b: iload 23
      // 23d: ldc_w 1536193552
      // 240: ixor
      // 241: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 244: invokestatic k74/x/llIIlllI.IIllll (II)Ljava/lang/String;
      // 247: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 24a: aload 6
      // 24c: ifnonnull 257
      // 24f: aconst_null
      // 250: goto 292
      // 253: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 256: athrow
      // 257: ldc_w -1834188202
      // 25a: iload 23
      // 25c: ldc_w -1813435291
      // 25f: ixor
      // 260: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 263: ldc_w -1834188203
      // 266: iload 23
      // 268: ldc_w 1497995605
      // 26b: ixor
      // 26c: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 26f: invokestatic k74/x/llIIlllI.IIllll (II)Ljava/lang/String;
      // 272: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 275: aload 6
      // 277: invokevirtual k74/x/IIIIlll.II ()J
      // 27a: lstore 21
      // 27c: astore 20
      // 27e: new java/lang/StringBuilder
      // 281: dup
      // 282: invokespecial java/lang/StringBuilder.<init> ()V
      // 285: aload 20
      // 287: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 28a: lload 21
      // 28c: invokevirtual java/lang/StringBuilder.append (J)Ljava/lang/StringBuilder;
      // 28f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 292: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 297: pop
      // 298: aload 7
      // 29a: ldc_w -1834188204
      // 29d: iload 23
      // 29f: ldc_w -1459965538
      // 2a2: ixor
      // 2a3: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 2a6: ldc_w -1834188117
      // 2a9: iload 23
      // 2ab: ldc_w -26423493
      // 2ae: ixor
      // 2af: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 2b2: invokestatic k74/x/llIIlllI.IIllll (II)Ljava/lang/String;
      // 2b5: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 2b8: aload 5
      // 2ba: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 2bf: pop
      // 2c0: aload 7
      // 2c2: areturn
   }

   private Map Illl(JsonObject var1) {
      this.lI.ll().Illll(this.lIIl(var1));
      this.lI.l();
      return this.IllIl(
         IlIIllIII.lI(IIllll(Illlll(-1834188118, 671654882 ^ -771216191), Illlll(-1834188119, 671654882 ^ -1626701299))), this.lllII(this.lI.ll().IllIII())
      );
   }

   Map<String, Object> lIII() {
      return this.IIlIll(this::IIlIlI);
   }

   private static String lIIIII(int var0, int var1) {
      int var3 = var0 ^ 973275269;
      char[] var4 = III[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])IIl[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         IIl[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 845051041;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 149;
            case 1 -> 228;
            case 2 -> 97;
            case 3 -> 70;
            case 4 -> 180;
            case 5 -> 178;
            case 6 -> 13;
            case 7 -> 194;
            case 8 -> 164;
            case 9 -> 233;
            case 10 -> 168;
            case 11 -> 82;
            case 12 -> 133;
            case 13 -> 13;
            case 14 -> 141;
            case 15 -> 86;
            case 16 -> 204;
            case 17 -> 86;
            case 18 -> 126;
            case 19 -> 104;
            case 20 -> 172;
            case 21 -> 111;
            case 22 -> 174;
            case 23 -> 216;
            case 24 -> 57;
            case 25 -> 247;
            case 26 -> 5;
            case 27 -> 162;
            case 28 -> 207;
            case 29 -> 120;
            case 30 -> 83;
            case 31 -> 103;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private class_306 lIIl(JsonObject param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w -1897025099
      // 003: istore 4
      // 005: aload 0
      // 006: aload 1
      // 007: ldc_w -1834188120
      // 00a: iload 4
      // 00c: ldc_w 1251301332
      // 00f: ixor
      // 010: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 013: ldc_w -1834188113
      // 016: iload 4
      // 018: ldc_w 1833851806
      // 01b: ixor
      // 01c: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 01f: invokestatic k74/x/llIIlllI.IIllll (II)Ljava/lang/String;
      // 022: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 025: invokevirtual k74/x/llIIlllI.IIIIll (Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/lang/String;
      // 028: astore 2
      // 029: aload 2
      // 02a: ifnonnull 051
      // 02d: aload 0
      // 02e: aload 1
      // 02f: ldc_w -1834188114
      // 032: iload 4
      // 034: ldc_w 505630627
      // 037: ixor
      // 038: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 03b: ldc_w -1834188115
      // 03e: iload 4
      // 040: ldc_w 326037645
      // 043: ixor
      // 044: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 047: invokestatic k74/x/llIIlllI.IIllll (II)Ljava/lang/String;
      // 04a: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 04d: invokevirtual k74/x/llIIlllI.IIIIll (Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/lang/String;
      // 050: astore 2
      // 051: aload 0
      // 052: aload 1
      // 053: ldc_w -1834188116
      // 056: iload 4
      // 058: ldc_w -1204361908
      // 05b: ixor
      // 05c: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 05f: ldc_w -1834188125
      // 062: iload 4
      // 064: ldc_w 935022763
      // 067: ixor
      // 068: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 06b: invokestatic k74/x/llIIlllI.IIllll (II)Ljava/lang/String;
      // 06e: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 071: bipush -1
      // 072: invokevirtual k74/x/llIIlllI.IIII (Lcom/google/gson/JsonObject;Ljava/lang/String;I)I
      // 075: istore 3
      // 076: iload 3
      // 077: iflt 0dd
      // 07a: aload 2
      // 07b: ifnull 0dd
      // 07e: goto 085
      // 081: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 084: athrow
      // 085: ldc_w -1834188126
      // 088: iload 4
      // 08a: ldc_w -1202953520
      // 08d: ixor
      // 08e: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 091: ldc_w -1834188127
      // 094: iload 4
      // 096: ldc_w 1238496011
      // 099: ixor
      // 09a: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 09d: invokestatic k74/x/llIIlllI.IIllll (II)Ljava/lang/String;
      // 0a0: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0a3: aload 2
      // 0a4: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 0a7: ifne 0dd
      // 0aa: goto 0b1
      // 0ad: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b0: athrow
      // 0b1: ldc_w -1834188128
      // 0b4: iload 4
      // 0b6: ldc_w 1154280383
      // 0b9: ixor
      // 0ba: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 0bd: ldc_w -1834188121
      // 0c0: iload 4
      // 0c2: ldc_w -804134763
      // 0c5: ixor
      // 0c6: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 0c9: invokestatic k74/x/llIIlllI.IIllll (II)Ljava/lang/String;
      // 0cc: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0cf: aload 2
      // 0d0: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 0d3: ifeq 0e5
      // 0d6: goto 0dd
      // 0d9: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0dc: athrow
      // 0dd: getstatic net/minecraft/class_3675.field_16237 Lnet/minecraft/class_3675$class_306;
      // 0e0: areturn
      // 0e1: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e4: athrow
      // 0e5: ldc_w -1834188122
      // 0e8: iload 4
      // 0ea: ldc_w 1979147308
      // 0ed: ixor
      // 0ee: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 0f1: ldc_w -1834188123
      // 0f4: iload 4
      // 0f6: ldc_w 930457088
      // 0f9: ixor
      // 0fa: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 0fd: invokestatic k74/x/llIIlllI.IIllll (II)Ljava/lang/String;
      // 100: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 103: aload 2
      // 104: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 107: ifeq 113
      // 10a: iload 3
      // 10b: invokestatic k74/x/IIll.IlIlIlI (I)Lnet/minecraft/class_3675$class_306;
      // 10e: areturn
      // 10f: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 112: athrow
      // 113: iload 3
      // 114: invokestatic k74/x/IIll.IIllIll (I)Lnet/minecraft/class_3675$class_306;
      // 117: areturn
   }

   private static int lIlI(int var0) {
      return Math.max(0, Math.min(Illlll(-1834188124, 1881514562 ^ -1150333808), var0));
   }

   Map<String, Object> lIll() {
      return this.IIlIll(this::lllI);
   }

   private static Exception llII(Exception var0) {
      return var0;
   }

   Map<String, Object> llIl(JsonObject var1) {
      return this.IlIlI(IlIIllIII.lI(IIllll(Illlll(-1834188101, 722742234 ^ 44003677), Illlll(-1834188102, 722742234 ^ -719434399))), this::IIlI);
   }

   private Map<String, Object> lllI() {
      Map var1 = this.IllIl(IlIIllIII.lI(IIllll(Illlll(-1834188103, 17599673 ^ 1619326994), Illlll(-1834188104, 17599673 ^ -1463414650))), this.I.IIIl());
      var1.put(IlIIllIII.lI(IIllll(Illlll(-1834188097, 17599673 ^ -247373818), Illlll(-1834188098, 17599673 ^ -696928151))), this.I.IIll(this.lI.II()));
      return var1;
   }

   Map<String, Object> llll() {
      return this.IIlIll(this::IlIIl);
   }

   private static String IIIII(lllIIlIl var0) {
      int var1 = -780235335;

      try {
         switch (lllIIIll.I[var0.ordinal()]) {
            case 1:
               return IlIIllIII.lI(IIllll(Illlll(-1834188099, var1 ^ 530491543), Illlll(-1834188100, var1 ^ 1401972518)));
            case 2:
               return IlIIllIII.lI(IIllll(Illlll(-1834188109, var1 ^ -262827257), Illlll(-1834188110, var1 ^ 141824795)));
            case 3:
               return IlIIllIII.lI(IIllll(Illlll(-1834188111, var1 ^ -1915541278), Illlll(-1834188112, var1 ^ -2063410711)));
            case 4:
               return IlIIllIII.lI(IIllll(Illlll(-1834188105, var1 ^ -1548278186), Illlll(-1834188106, var1 ^ -1052825909)));
            case 5:
               return IlIIllIII.lI(IIllll(Illlll(-1834188107, var1 ^ -1287622149), Illlll(-1834188108, var1 ^ 636194349)));
            case 6:
               return IlIIllIII.lI(IIllll(Illlll(-1834188149, var1 ^ 1598841485), Illlll(-1834188150, var1 ^ -1898374551)));
            default:
               throw new MatchException(null, null);
         }
      } catch (IllegalStateException var2) {
         throw llII(var2);
      }
   }

   Map<String, Object> IIIIl(JsonObject var1) {
      return this.IIlIll(this::IlllI);
   }

   Map<String, Object> IIIlI(String var1) {
      return this.IIlIll(this::IIl);
   }

   private IIIIIlII IIIll(String var1) {
      for (IIIIIlII var3 : this.lI.II().IIllI()) {
         if (var3 instanceof IlIIIIIIl var4) {
            try {
               if (var4.IIIlIlI().equalsIgnoreCase(var1)) {
                  return var3;
               }
            } catch (IllegalStateException var7) {
               throw llII(var7);
            }
         }
      }

      String var5 = IlIIllIII.lI(IIllll(Illlll(-1834188151, 1411172501 ^ -1895297014), Illlll(-1834188152, 1411172501 ^ 793955840)));
      throw new IllegalArgumentException(var5 + var1);
   }

   Map<String, Object> IIlII() {
      return this.IIlIll(this::IlIIll);
   }

   Map<String, Object> IIlIl(JsonObject var1) {
      return this.IlIlI(IlIIllIII.lI(IIllll(Illlll(-1834188145, -573125645 ^ -2047131645), Illlll(-1834188146, -573125645 ^ 33245944))), this::IIll);
   }

   private IlIIIIIIl IIllI(String param1) {
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
      // 05: invokevirtual java/lang/String.isBlank ()Z
      // 08: ifeq 3e
      // 0b: goto 12
      // 0e: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11: athrow
      // 12: new java/lang/IllegalArgumentException
      // 15: dup
      // 16: ldc_w -1834188147
      // 19: ldc_w -2117443598
      // 1c: ldc_w -1851908149
      // 1f: ixor
      // 20: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 23: ldc_w -1834188148
      // 26: ldc_w -2117443598
      // 29: ldc_w 854690916
      // 2c: ixor
      // 2d: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 30: invokestatic k74/x/llIIlllI.IIllll (II)Ljava/lang/String;
      // 33: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 36: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 39: athrow
      // 3a: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d: athrow
      // 3e: aload 0
      // 3f: getfield k74/x/llIIlllI.lI Lk74/x/IIIIIllII;
      // 42: invokevirtual k74/x/IIIIIllII.II ()Lk74/x/lIIIlIlI;
      // 45: invokevirtual k74/x/lIIIlIlI.IIIlll ()Ljava/util/List;
      // 48: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 4d: astore 2
      // 4e: aload 2
      // 4f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 54: ifeq 75
      // 57: aload 2
      // 58: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 5d: checkcast k74/x/IlIIIIIIl
      // 60: astore 3
      // 61: aload 3
      // 62: invokevirtual k74/x/IlIIIIIIl.IIIlIlI ()Ljava/lang/String;
      // 65: aload 1
      // 66: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 69: ifeq 72
      // 6c: aload 3
      // 6d: areturn
      // 6e: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 71: athrow
      // 72: goto 4e
      // 75: new java/lang/IllegalArgumentException
      // 78: dup
      // 79: ldc_w -1834188157
      // 7c: ldc_w -2117443598
      // 7f: ldc_w -839241186
      // 82: ixor
      // 83: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 86: ldc_w -1834188158
      // 89: ldc_w -2117443598
      // 8c: ldc_w -1864879949
      // 8f: ixor
      // 90: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 93: invokestatic k74/x/llIIlllI.IIllll (II)Ljava/lang/String;
      // 96: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 99: aload 1
      // 9a: astore 5
      // 9c: astore 4
      // 9e: new java/lang/StringBuilder
      // a1: dup
      // a2: invokespecial java/lang/StringBuilder.<init> ()V
      // a5: aload 4
      // a7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // aa: aload 5
      // ac: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // af: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // b2: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // b5: athrow
   }

   private Map<String, Object> IIlll(lllIIlIl var1) {
      int var6 = 1657244022;
      LinkedHashMap var2 = new LinkedHashMap();
      var2.put(IlIIllIII.lI(IIllll(Illlll(-1834188159, var6 ^ 1442794063), Illlll(-1834188160, var6 ^ -710916869))), IIllIl(var1));
      var2.put(IlIIllIII.lI(IIllll(Illlll(-1834188153, var6 ^ 997018475), Illlll(-1834188154, var6 ^ 287632982))), IIIII(var1));
      String var10001 = IlIIllIII.lI(IIllll(Illlll(-1834188155, var6 ^ -1898500213), Illlll(-1834188156, var6 ^ 1174163208)));
      String var10002 = IlIIllIII.lI(IIllll(Illlll(-1834188133, var6 ^ -956767774), Illlll(-1834188134, var6 ^ -1399623333)));
      String var10003 = lIl(var1);
      String var5 = IlIIllIII.lI(IIllll(Illlll(-1834188135, var6 ^ 765426828), Illlll(-1834188136, var6 ^ 254415462)));
      String var4 = var10003;
      String var3 = var10002;
      var2.put(var10001, var3 + var4 + var5);
      return var2;
   }

   private Map IlIII(JsonObject var1) {
      return this.IlI().IllIl(this.lIllI(var1, IlIIllIII.lI(IIllll(Illlll(-1834188129, 214745038 ^ -97258812), Illlll(-1834188130, 214745038 ^ 839800448)))));
   }

   private Map IlIIl() {
      int var3 = 196624655;
      LinkedHashMap var1 = new LinkedHashMap();
      lIIIlIll var2 = this.lI.II().IlIIlII();

      LinkedHashMap var10000;
      String var10001;
      Map var10002;
      label17: {
         try {
            var1.put(IlIIllIII.lI(IIllll(Illlll(-1834188131, var3 ^ -878623206), Illlll(-1834188132, var3 ^ 482176808))), true);
            var1.put(IlIIllIII.lI(IIllll(Illlll(-1834188141, var3 ^ -1983384228), Illlll(-1834188142, var3 ^ -1461206141))), null);
            var1.put(IlIIllIII.lI(IIllll(Illlll(-1834188143, var3 ^ -941102502), Illlll(-1834188144, var3 ^ 282983837))), List.of());
            var1.put(IlIIllIII.lI(IIllll(Illlll(-1834188137, var3 ^ -1082653040), Illlll(-1834188138, var3 ^ -300918007))), null);
            var1.put(
               IlIIllIII.lI(IIllll(Illlll(-1834188139, var3 ^ 1789078383), Illlll(-1834188140, var3 ^ 931668218))),
               Map.of(
                  IlIIllIII.lI(IIllll(Illlll(-1834188053, var3 ^ 248551959), Illlll(-1834188054, var3 ^ -558070083))),
                  false,
                  IlIIllIII.lI(IIllll(Illlll(-1834188055, var3 ^ 1547809458), Illlll(-1834188056, var3 ^ 1827649930))),
                  0,
                  IlIIllIII.lI(IIllll(Illlll(-1834188049, var3 ^ 753036783), Illlll(-1834188050, var3 ^ 2007000085))),
                  IlIIllIII.lI(IIllll(Illlll(-1834188051, var3 ^ 546200426), Illlll(-1834188052, var3 ^ -1892641448))),
                  IlIIllIII.lI(IIllll(Illlll(-1834188061, var3 ^ 1227301775), Illlll(-1834188062, var3 ^ -178591550))),
                  ""
               )
            );
            var10000 = var1;
            var10001 = IlIIllIII.lI(IIllll(Illlll(-1834188063, var3 ^ -1645434060), Illlll(-1834188064, var3 ^ 1664837504)));
            if (var2 == null) {
               var10002 = Map.of(IlIIllIII.lI(IIllll(Illlll(-1834188057, var3 ^ -1025621437), Illlll(-1834188058, var3 ^ 1792490048))), false);
               break label17;
            }
         } catch (IllegalStateException var4) {
            throw llII(var4);
         }

         var10002 = var2.lII();
      }

      var10000.put(var10001, var10002);
      return var1;
   }

   private Map<String, Object> IlIlI(String var1, Supplier<Map<String, Object>> var2) {
      return this.IIlIll(this::llIlI);
   }

   Map<String, Object> IlIll() {
      return this.IIlIll(this::IIIlll);
   }

   private Map<String, Object> IllII(IlIIIIIIl var1, boolean var2) {
      int var8 = -143514303;
      LinkedHashMap var3 = new LinkedHashMap();

      label54: {
         try {
            var3.put(IlIIllIII.lI(IIllll(Illlll(-1834188059, var8 ^ 598701891), Illlll(-1834188060, var8 ^ 2090753494))), var1.IIIlIlI());
            var3.put(IlIIllIII.lI(IIllll(Illlll(-1834188037, var8 ^ -1500673396), Illlll(-1834188038, var8 ^ 368440694))), var1.IllIlI());
            var3.put(IlIIllIII.lI(IIllll(Illlll(-1834188039, var8 ^ -866036126), Illlll(-1834188040, var8 ^ -1835872828))), var1.IlIllII());
            var3.put(IlIIllIII.lI(IIllll(Illlll(-1834188033, var8 ^ 883065744), Illlll(-1834188034, var8 ^ -1145460807))), var1.IlllIl());
            var3.put(IlIIllIII.lI(IIllll(Illlll(-1834188035, var8 ^ -1847271672), Illlll(-1834188036, var8 ^ -48078049))), IIllIl(var1.IllIlII()));
            var3.put(IlIIllIII.lI(IIllll(Illlll(-1834188045, var8 ^ 808744997), Illlll(-1834188046, var8 ^ -882713368))), var1.IlIIlIl());
            var3.put(IlIIllIII.lI(IIllll(Illlll(-1834188047, var8 ^ 235316177), Illlll(-1834188048, var8 ^ -1273646898))), var1.IIIIlIl());
            var3.put(IlIIllIII.lI(IIllll(Illlll(-1834188041, var8 ^ -399196411), Illlll(-1834188042, var8 ^ -930809859))), var1.IIlIIll());
            var3.put(IlIIllIII.lI(IIllll(Illlll(-1834188043, var8 ^ 367551936), Illlll(-1834188044, var8 ^ 1064486989))), this.lllII(var1.IlIIlII()));
            if (var1 instanceof IlIIIIIl) {
               var3.put(
                  IlIIllIII.lI(IIllll(Illlll(-1834188085, var8 ^ 1067711332), Illlll(-1834188086, var8 ^ -230924174))),
                  IlIIllIII.lI(IIllll(Illlll(-1834188087, var8 ^ 410997257), Illlll(-1834188088, var8 ^ -1257172828)))
               );
               break label54;
            }
         } catch (IllegalStateException var11) {
            throw llII(var11);
         }

         try {
            if (var1 instanceof llIIlIl) {
               var3.put(
                  IlIIllIII.lI(IIllll(Illlll(-1834188081, var8 ^ 976937588), Illlll(-1834188082, var8 ^ 1990524622))),
                  IlIIllIII.lI(IIllll(Illlll(-1834188083, var8 ^ -1724067148), Illlll(-1834188084, var8 ^ 58630106)))
               );
            }
         } catch (IllegalStateException var9) {
            throw llII(var9);
         }
      }

      List var4 = var1.llIIIl();

      LinkedHashMap var10000;
      String var10001;
      boolean var10002;
      label46: {
         try {
            var10000 = var3;
            var10001 = IlIIllIII.lI(IIllll(Illlll(-1834188093, var8 ^ 1252001365), Illlll(-1834188094, var8 ^ 666790675)));
            if (!var4.isEmpty()) {
               var10002 = true;
               break label46;
            }
         } catch (IllegalStateException var10) {
            throw llII(var10);
         }

         var10002 = false;
      }

      var10000.put(var10001, var10002);
      if (var1 instanceof IIIIIlII var5) {
         var3.put(IlIIllIII.lI(IIllll(Illlll(-1834188095, var8 ^ -664489141), Illlll(-1834188096, var8 ^ 596258531))), this.lIIIl(var5));
      }

      if (var2) {
         ArrayList var12 = new ArrayList();

         for (IIllllIl var7 : var4) {
            var12.add(this.IlIlIl(var7));
         }

         var3.put(IlIIllIII.lI(IIllll(Illlll(-1834188089, var8 ^ -1171838147), Illlll(-1834188090, var8 ^ 981462284))), var12);
      }

      return var3;
   }

   private Map<String, Object> IllIl(String var1, Object var2) {
      LinkedHashMap var3 = new LinkedHashMap();
      var3.put(IlIIllIII.lI(IIllll(Illlll(-1834188091, -2036208103 ^ 1409691302), Illlll(-1834188092, -2036208103 ^ 190492538))), true);
      var3.put(var1, var2);
      return var3;
   }

   private Map IlllI(JsonObject var1) {
      return this.IlI()
         .lIl(
            this.lIllI(var1, IlIIllIII.lI(IIllll(Illlll(-1834188069, -1577024256 ^ -1016208056), Illlll(-1834188070, -1577024256 ^ 1797570410)))),
            this.lIIl(var1)
         );
   }

   Map<String, Object> Illll(boolean var1) {
      return this.IIlIll(this::IIIlIl);
   }

   Map<String, Object> lIIII() {
      int var2 = 1497100931;
      LinkedHashMap var1 = new LinkedHashMap();
      var1.put(IlIIllIII.lI(IIllll(Illlll(-1834188071, var2 ^ 925984718), Illlll(-1834188072, var2 ^ -1769931000))), false);
      var1.put(
         IlIIllIII.lI(IIllll(Illlll(-1834188065, var2 ^ 984786544), Illlll(-1834188066, var2 ^ -467244106))),
         IlIIllIII.lI(IIllll(Illlll(-1834188067, var2 ^ -1216272879), Illlll(-1834188068, var2 ^ -2112737805)))
      );
      return var1;
   }

   private Map<String, Object> lIIIl(IIIIIlII var1) {
      int var4 = 1753598386;
      LinkedHashMap var2 = new LinkedHashMap();
      if (var1 instanceof IlIIIIIIl var3) {
         var2.put(IlIIllIII.lI(IIllll(Illlll(-1834188077, var4 ^ 99951366), Illlll(-1834188078, var4 ^ -847170034))), var3.IIIlIlI());
         var2.put(IlIIllIII.lI(IIllll(Illlll(-1834188079, var4 ^ 775270182), Illlll(-1834188080, var4 ^ 580811368))), var3.IllIlI());
         var2.put(IlIIllIII.lI(IIllll(Illlll(-1834188073, var4 ^ -903997129), Illlll(-1834188074, var4 ^ 527680260))), IIllIl(var3.IllIlII()));
         var2.put(IlIIllIII.lI(IIllll(Illlll(-1834188075, var4 ^ -1391139843), Illlll(-1834188076, var4 ^ 1993990339))), var3.IIIIlIl());
         var2.put(IlIIllIII.lI(IIllll(Illlll(-1834187989, var4 ^ -410165715), Illlll(-1834187990, var4 ^ -1141886533))), var3.IIlIIll());
      } else {
         var2.put(IlIIllIII.lI(IIllll(Illlll(-1834187991, var4 ^ 848649211), Illlll(-1834187992, var4 ^ 257985546))), var1.getClass().getSimpleName());
         var2.put(IlIIllIII.lI(IIllll(Illlll(-1834187985, var4 ^ 1170570159), Illlll(-1834187986, var4 ^ -2034015300))), var1.getClass().getSimpleName());
         var2.put(IlIIllIII.lI(IIllll(Illlll(-1834187987, var4 ^ -1439156653), Illlll(-1834187988, var4 ^ 426452246))), IIllIl(lllIIlIl.II));
         var2.put(IlIIllIII.lI(IIllll(Illlll(-1834187997, var4 ^ 1047471645), Illlll(-1834187998, var4 ^ 1571521130))), true);
         var2.put(IlIIllIII.lI(IIllll(Illlll(-1834187999, var4 ^ 722824590), Illlll(-1834188000, var4 ^ 388974324))), false);
      }

      var2.put(IlIIllIII.lI(IIllll(Illlll(-1834187993, var4 ^ 667090028), Illlll(-1834187994, var4 ^ -1304392052))), var1.lll());
      var2.put(IlIIllIII.lI(IIllll(Illlll(-1834187995, var4 ^ -714763479), Illlll(-1834187996, var4 ^ -1316605302))), var1.ll());
      var2.put(IlIIllIII.lI(IIllll(Illlll(-1834187973, var4 ^ -140828199), Illlll(-1834187974, var4 ^ -1568454667))), var1.IIllI());
      var2.put(IlIIllIII.lI(IIllll(Illlll(-1834187975, var4 ^ 560151500), Illlll(-1834187976, var4 ^ 1856581097))), var1.IIIl());
      return var2;
   }

   private String lIIlI() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc_w -1287441753
      // 03: istore 3
      // 04: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 07: astore 1
      // 08: aload 1
      // 09: ifnonnull 2d
      // 0c: ldc_w -1834187969
      // 0f: iload 3
      // 10: ldc_w 2070459363
      // 13: ixor
      // 14: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 17: ldc_w -1834187970
      // 1a: iload 3
      // 1b: ldc_w 126344501
      // 1e: ixor
      // 1f: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 22: invokestatic k74/x/llIIlllI.IIllll (II)Ljava/lang/String;
      // 25: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 28: areturn
      // 29: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c: athrow
      // 2d: aload 1
      // 2e: invokevirtual net/minecraft/class_310.method_1558 ()Lnet/minecraft/class_642;
      // 31: astore 2
      // 32: aload 2
      // 33: ifnull 5e
      // 36: aload 2
      // 37: getfield net/minecraft/class_642.field_3761 Ljava/lang/String;
      // 3a: ifnull 5e
      // 3d: goto 44
      // 40: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 43: athrow
      // 44: aload 2
      // 45: getfield net/minecraft/class_642.field_3761 Ljava/lang/String;
      // 48: invokevirtual java/lang/String.isBlank ()Z
      // 4b: ifne 5e
      // 4e: goto 55
      // 51: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 54: athrow
      // 55: aload 2
      // 56: getfield net/minecraft/class_642.field_3761 Ljava/lang/String;
      // 59: areturn
      // 5a: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5d: athrow
      // 5e: aload 1
      // 5f: invokevirtual net/minecraft/class_310.method_1542 ()Z
      // 62: ifeq 86
      // 65: ldc_w -1834187971
      // 68: iload 3
      // 69: ldc_w 210439454
      // 6c: ixor
      // 6d: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 70: ldc_w -1834187972
      // 73: iload 3
      // 74: ldc_w 460249030
      // 77: ixor
      // 78: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 7b: invokestatic k74/x/llIIlllI.IIllll (II)Ljava/lang/String;
      // 7e: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 81: areturn
      // 82: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 85: athrow
      // 86: ldc_w -1834187981
      // 89: iload 3
      // 8a: ldc_w -749752270
      // 8d: ixor
      // 8e: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 91: ldc_w -1834187982
      // 94: iload 3
      // 95: ldc_w 1490428566
      // 98: ixor
      // 99: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 9c: invokestatic k74/x/llIIlllI.IIllll (II)Ljava/lang/String;
      // 9f: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // a2: areturn
   }

   private Map lIIll(JsonObject var1) {
      return this.IlI()
         .IIll(this.IIIIll(var1, IlIIllIII.lI(IIllll(Illlll(-1834187983, 1867771470 ^ -703687898), Illlll(-1834187984, 1867771470 ^ -2079392635)))));
   }

   Map<String, Object> lIlII(JsonObject var1) {
      return this.IIlIll(this::III);
   }

   private void lIlIl(String var1) {
      try {
         if (this.Il) {
            return;
         }
      } catch (IllegalStateException var2) {
         throw llII(var2);
      }

      llIIlllI var10000;
      String var10001;
      label22: {
         try {
            var10000 = this;
            if (var1 == null) {
               var10001 = IlIIllIII.lI(IIllll(Illlll(-1834187977, 956511322 ^ -2039188874), Illlll(-1834187978, 956511322 ^ 2075989668)));
               break label22;
            }
         } catch (IllegalStateException var3) {
            throw llII(var3);
         }

         var10001 = var1;
      }

      var10000.ll(var10001);
      this.Il = true;
   }

   private String lIllI(JsonObject param1, String param2) {
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
      // 03: invokevirtual k74/x/llIIlllI.IIIIll (Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/lang/String;
      // 06: astore 3
      // 07: aload 3
      // 08: ifnull 19
      // 0b: aload 3
      // 0c: invokevirtual java/lang/String.isBlank ()Z
      // 0f: ifeq 5e
      // 12: goto 19
      // 15: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18: athrow
      // 19: new java/lang/IllegalArgumentException
      // 1c: dup
      // 1d: ldc_w -1834187979
      // 20: ldc_w -542495002
      // 23: ldc_w 794077450
      // 26: ixor
      // 27: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 2a: ldc_w -1834187980
      // 2d: ldc_w -542495002
      // 30: ldc_w 1348424901
      // 33: ixor
      // 34: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 37: invokestatic k74/x/llIIlllI.IIllll (II)Ljava/lang/String;
      // 3a: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 3d: aload 2
      // 3e: astore 5
      // 40: astore 4
      // 42: new java/lang/StringBuilder
      // 45: dup
      // 46: invokespecial java/lang/StringBuilder.<init> ()V
      // 49: aload 4
      // 4b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 4e: aload 5
      // 50: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 53: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 56: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 59: athrow
      // 5a: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5d: athrow
      // 5e: aload 3
      // 5f: areturn
   }

   private Map lIlll() {
      try {
         this.lI.l();
         this.lI.ll().IlII(IlIIllIII.lI(IIllll(Illlll(-1834188021, -1511798685 ^ -1004691992), Illlll(-1834188022, -1511798685 ^ 1817681633))));
         Path var1 = this.lI.ll().llll(this.lI.II());
         this.lI.l();
         this.Il = true;
         return this.IllIl(IlIIllIII.lI(IIllll(Illlll(-1834188023, -1511798685 ^ -1647368960), Illlll(-1834188024, -1511798685 ^ 1191775743))), var1.toString());
      } catch (Exception var2) {
         throw new IllegalStateException(var2.getMessage(), var2);
      }
   }

   private Map llIII() {
      int var7 = -1819344278;
      LinkedHashMap var1 = new LinkedHashMap();
      ArrayList var2 = new ArrayList();

      for (lllIIlIl var6 : lllIIlIl.values()) {
         var2.add(this.IIlll(var6));
      }

      ArrayList var8 = new ArrayList();

      for (IlIIIIIIl var10 : this.lI.II().IIIlll()) {
         var8.add(this.IllII(var10, true));
      }

      var1.put(IlIIllIII.lI(IIllll(Illlll(-1834188017, var7 ^ -30065773), Illlll(-1834188018, var7 ^ 1824700711))), true);
      var1.put(IlIIllIII.lI(IIllll(Illlll(-1834188019, var7 ^ -1304028619), Illlll(-1834188020, var7 ^ 391955441))), var2);
      var1.put(IlIIllIII.lI(IIllll(Illlll(-1834188029, var7 ^ -1031057588), Illlll(-1834188030, var7 ^ -1537640826))), var8);
      return var1;
   }

   Map<String, Object> llIIl(JsonObject var1) {
      return this.IlIlI(IlIIllIII.lI(IIllll(Illlll(-1834188031, -2131969572 ^ 426925375), Illlll(-1834188032, -2131969572 ^ -1779659142))), this::IlIIlI);
   }

   private Map llIlI(String var1, Supplier var2) {
      this.lIlIl(var1);
      return (Map<String, Object>)var2.get();
   }

   Map<String, Object> llIll(JsonObject var1) {
      return this.IIlIll(this::IllllI);
   }

   private Map<String, Object> lllII(class_306 var1) {
      int var4 = -693931108;
      LinkedHashMap var2 = new LinkedHashMap();
      boolean var3 = IIll.IIlll(var1);

      LinkedHashMap var10000;
      String var10001;
      String var10002;
      label51: {
         try {
            var2.put(IlIIllIII.lI(IIllll(Illlll(-1834188025, var4 ^ -1895431442), Illlll(-1834188026, var4 ^ -729477803))), var3);
            var10000 = var2;
            var10001 = IlIIllIII.lI(IIllll(Illlll(-1834188027, var4 ^ -701116997), Illlll(-1834188028, var4 ^ 1669777660)));
            if (var3) {
               var10002 = "";
               break label51;
            }
         } catch (IllegalStateException var8) {
            throw llII(var8);
         }

         var10002 = IIll.lI(var1);
      }

      label55: {
         try {
            var10000.put(var10001, var10002);
            var10000 = var2;
            var10001 = IlIIllIII.lI(IIllll(Illlll(-1834188005, var4 ^ -837869751), Illlll(-1834188006, var4 ^ 228691988)));
            if (var3) {
               var10002 = IlIIllIII.lI(IIllll(Illlll(-1834188007, var4 ^ -722598536), Illlll(-1834188008, var4 ^ 1250383894)));
               break label55;
            }
         } catch (IllegalStateException var7) {
            throw llII(var7);
         }

         try {
            if (var1.method_1442() == class_307.field_1672) {
               var10002 = IlIIllIII.lI(IIllll(Illlll(-1834188001, var4 ^ 1126813102), Illlll(-1834188002, var4 ^ -331696243)));
               break label55;
            }
         } catch (IllegalStateException var6) {
            throw llII(var6);
         }

         var10002 = IlIIllIII.lI(IIllll(Illlll(-1834188003, var4 ^ -1815190964), Illlll(-1834188004, var4 ^ 1261576746)));
      }

      label31: {
         try {
            var10000.put(var10001, var10002);
            var10000 = var2;
            var10001 = IlIIllIII.lI(IIllll(Illlll(-1834188013, var4 ^ -1301799850), Illlll(-1834188014, var4 ^ 718171884)));
            if (var3) {
               var14 = -1;
               break label31;
            }
         } catch (IllegalStateException var5) {
            throw llII(var5);
         }

         var14 = var1.method_1444();
      }

      var10000.put(var10001, var14);
      return var2;
   }

   private Map<String, Object> lllIl(Color var1) {
      int var4 = -1473032984;
      LinkedHashMap var2 = new LinkedHashMap();

      Color var10000;
      label17: {
         try {
            if (var1 == null) {
               var10000 = new Color(
                  Illlll(-1834188015, var4 ^ -1136030661),
                  Illlll(-1834188016, var4 ^ -430777748),
                  Illlll(-1834188009, var4 ^ -190956315),
                  Illlll(-1834188010, var4 ^ -458073073)
               );
               break label17;
            }
         } catch (IllegalStateException var5) {
            throw llII(var5);
         }

         var10000 = var1;
      }

      Color var3 = var10000;
      var2.put(IlIIllIII.lI(IIllll(Illlll(-1834188011, var4 ^ -216498519), Illlll(-1834188012, var4 ^ 1821414977))), var3.getRed());
      var2.put(IlIIllIII.lI(IIllll(Illlll(-1834187925, var4 ^ -649174372), Illlll(-1834187926, var4 ^ -1095910459))), var3.getGreen());
      var2.put(IlIIllIII.lI(IIllll(Illlll(-1834187927, var4 ^ -439185542), Illlll(-1834187928, var4 ^ -835599560))), var3.getBlue());
      var2.put(IlIIllIII.lI(IIllll(Illlll(-1834187921, var4 ^ 2057760906), Illlll(-1834187922, var4 ^ -1615022477))), var3.getAlpha());
      var2.put(
         IlIIllIII.lI(IIllll(Illlll(-1834187923, var4 ^ -2084680607), Illlll(-1834187924, var4 ^ 218738640))),
         String.format(
            IlIIllIII.lI(IIllll(Illlll(-1834187933, var4 ^ -1779376964), Illlll(-1834187934, var4 ^ -505160487))),
            var3.getRed(),
            var3.getGreen(),
            var3.getBlue()
         )
      );
      return var2;
   }

   private Map llllI(JsonObject var1) {
      return this.IlI()
         .lllIl(this.lIllI(var1, IlIIllIII.lI(IIllll(Illlll(-1834187935, 1584855347 ^ 1241017069), Illlll(-1834187936, 1584855347 ^ -2017622698)))));
   }

   private Map lllll(JsonObject param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w -713286584
      // 003: istore 7
      // 005: aload 0
      // 006: aload 0
      // 007: aload 1
      // 008: ldc_w -1834187929
      // 00b: iload 7
      // 00d: ldc_w -1590180236
      // 010: ixor
      // 011: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 014: ldc_w -1834187930
      // 017: iload 7
      // 019: ldc_w -1784706145
      // 01c: ixor
      // 01d: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 020: invokestatic k74/x/llIIlllI.IIllll (II)Ljava/lang/String;
      // 023: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 026: invokevirtual k74/x/llIIlllI.lIllI (Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/lang/String;
      // 029: invokevirtual k74/x/llIIlllI.IIllI (Ljava/lang/String;)Lk74/x/IlIIIIIIl;
      // 02c: astore 2
      // 02d: aload 0
      // 02e: aload 1
      // 02f: invokevirtual k74/x/llIIlllI.lIIl (Lcom/google/gson/JsonObject;)Lnet/minecraft/class_3675$class_306;
      // 032: astore 3
      // 033: aload 0
      // 034: aload 1
      // 035: ldc_w -1834187931
      // 038: iload 7
      // 03a: ldc_w -1236537776
      // 03d: ixor
      // 03e: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 041: ldc_w -1834187932
      // 044: iload 7
      // 046: ldc_w 1587819297
      // 049: ixor
      // 04a: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 04d: invokestatic k74/x/llIIlllI.IIllll (II)Ljava/lang/String;
      // 050: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 053: invokevirtual k74/x/llIIlllI.IIIIll (Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/lang/String;
      // 056: astore 4
      // 058: aload 4
      // 05a: ifnull 06c
      // 05d: aload 4
      // 05f: invokevirtual java/lang/String.isBlank ()Z
      // 062: ifeq 0a5
      // 065: goto 06c
      // 068: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06b: athrow
      // 06c: aload 2
      // 06d: aload 3
      // 06e: invokevirtual k74/x/IlIIIIIIl.IlIllll (Lnet/minecraft/class_3675$class_306;)V
      // 071: aload 0
      // 072: getfield k74/x/llIIlllI.lI Lk74/x/IIIIIllII;
      // 075: invokevirtual k74/x/IIIIIllII.l ()V
      // 078: aload 0
      // 079: ldc_w -1834187909
      // 07c: iload 7
      // 07e: ldc_w 474692342
      // 081: ixor
      // 082: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 085: ldc_w -1834187910
      // 088: iload 7
      // 08a: ldc_w 199072842
      // 08d: ixor
      // 08e: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 091: invokestatic k74/x/llIIlllI.IIllll (II)Ljava/lang/String;
      // 094: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 097: aload 0
      // 098: aload 2
      // 099: bipush 1
      // 09a: invokevirtual k74/x/llIIlllI.IllII (Lk74/x/IlIIIIIIl;Z)Ljava/util/Map;
      // 09d: invokevirtual k74/x/llIIlllI.IllIl (Ljava/lang/String;Ljava/lang/Object;)Ljava/util/Map;
      // 0a0: areturn
      // 0a1: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a4: athrow
      // 0a5: aload 0
      // 0a6: aload 2
      // 0a7: aload 4
      // 0a9: invokevirtual k74/x/llIIlllI.IlIlll (Lk74/x/IlIIIIIIl;Ljava/lang/String;)Lk74/x/IIllllIl;
      // 0ac: astore 5
      // 0ae: aload 5
      // 0b0: instanceof k74/x/lIllIlII
      // 0b3: ifeq 0c0
      // 0b6: aload 5
      // 0b8: checkcast k74/x/lIllIlII
      // 0bb: astore 6
      // 0bd: goto 0e6
      // 0c0: new java/lang/IllegalArgumentException
      // 0c3: dup
      // 0c4: ldc_w -1834187911
      // 0c7: iload 7
      // 0c9: ldc_w 2041721511
      // 0cc: ixor
      // 0cd: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 0d0: ldc_w -1834187912
      // 0d3: iload 7
      // 0d5: ldc_w -1239581056
      // 0d8: ixor
      // 0d9: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 0dc: invokestatic k74/x/llIIlllI.IIllll (II)Ljava/lang/String;
      // 0df: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0e2: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 0e5: athrow
      // 0e6: aload 6
      // 0e8: aload 3
      // 0e9: invokevirtual k74/x/lIllIlII.lI (Lnet/minecraft/class_3675$class_306;)V
      // 0ec: aload 0
      // 0ed: getfield k74/x/llIIlllI.lI Lk74/x/IIIIIllII;
      // 0f0: invokevirtual k74/x/IIIIIllII.l ()V
      // 0f3: aload 0
      // 0f4: ldc_w -1834187905
      // 0f7: iload 7
      // 0f9: ldc_w -1837916849
      // 0fc: ixor
      // 0fd: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 100: ldc_w -1834187906
      // 103: iload 7
      // 105: ldc_w -540517277
      // 108: ixor
      // 109: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 10c: invokestatic k74/x/llIIlllI.IIllll (II)Ljava/lang/String;
      // 10f: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 112: aload 0
      // 113: aload 5
      // 115: invokevirtual k74/x/llIIlllI.IlIlIl (Lk74/x/IIllllIl;)Ljava/util/Map;
      // 118: invokevirtual k74/x/llIIlllI.IllIl (Ljava/lang/String;Ljava/lang/Object;)Ljava/util/Map;
      // 11b: areturn
   }

   Map<String, Object> IIIIII(JsonObject var1) {
      return this.IlIlI(IlIIllIII.lI(IIllll(Illlll(-1834187907, 856586910 ^ 1066606636), Illlll(-1834187908, 856586910 ^ -1438050068))), this::IllIIl);
   }

   private void IIIIIl(IIllllIl<?> param1, JsonElement param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w -1326458290
      // 003: istore 7
      // 005: aload 1
      // 006: instanceof k74/x/lllIIlII
      // 009: ifeq 034
      // 00c: aload 1
      // 00d: checkcast k74/x/lllIIlII
      // 010: astore 3
      // 011: aload 3
      // 012: aload 2
      // 013: ifnull 02c
      // 016: aload 2
      // 017: invokevirtual com/google/gson/JsonElement.getAsBoolean ()Z
      // 01a: ifeq 02c
      // 01d: goto 024
      // 020: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 023: athrow
      // 024: bipush 1
      // 025: goto 02d
      // 028: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02b: athrow
      // 02c: bipush 0
      // 02d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 030: invokevirtual k74/x/lllIIlII.Il (Ljava/lang/Object;)V
      // 033: return
      // 034: aload 1
      // 035: instanceof k74/x/IIlIII
      // 038: ifeq 04c
      // 03b: aload 1
      // 03c: checkcast k74/x/IIlIII
      // 03f: astore 3
      // 040: aload 3
      // 041: aload 2
      // 042: invokevirtual com/google/gson/JsonElement.getAsDouble ()D
      // 045: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 048: invokevirtual k74/x/IIlIII.Ill (Ljava/lang/Double;)V
      // 04b: return
      // 04c: aload 1
      // 04d: instanceof k74/x/lIlllIl
      // 050: ifeq 0ed
      // 053: aload 1
      // 054: checkcast k74/x/lIlllIl
      // 057: astore 3
      // 058: aload 2
      // 059: ifnull 06a
      // 05c: aload 2
      // 05d: invokevirtual com/google/gson/JsonElement.isJsonArray ()Z
      // 060: ifne 094
      // 063: goto 06a
      // 066: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 069: athrow
      // 06a: new java/lang/IllegalArgumentException
      // 06d: dup
      // 06e: ldc_w -1834187917
      // 071: iload 7
      // 073: ldc_w 1140293434
      // 076: ixor
      // 077: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 07a: ldc_w -1834187918
      // 07d: iload 7
      // 07f: ldc_w -1362062692
      // 082: ixor
      // 083: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 086: invokestatic k74/x/llIIlllI.IIllll (II)Ljava/lang/String;
      // 089: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 08c: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 08f: athrow
      // 090: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 093: athrow
      // 094: aload 2
      // 095: invokevirtual com/google/gson/JsonElement.getAsJsonArray ()Lcom/google/gson/JsonArray;
      // 098: astore 4
      // 09a: aload 4
      // 09c: invokevirtual com/google/gson/JsonArray.size ()I
      // 09f: bipush 2
      // 0a0: if_icmpge 0cd
      // 0a3: new java/lang/IllegalArgumentException
      // 0a6: dup
      // 0a7: ldc_w -1834187919
      // 0aa: iload 7
      // 0ac: ldc_w -304079126
      // 0af: ixor
      // 0b0: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 0b3: ldc_w -1834187920
      // 0b6: iload 7
      // 0b8: ldc_w -1697039800
      // 0bb: ixor
      // 0bc: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 0bf: invokestatic k74/x/llIIlllI.IIllll (II)Ljava/lang/String;
      // 0c2: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0c5: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 0c8: athrow
      // 0c9: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cc: athrow
      // 0cd: aload 3
      // 0ce: bipush 2
      // 0cf: newarray 7
      // 0d1: dup
      // 0d2: bipush 0
      // 0d3: aload 4
      // 0d5: bipush 0
      // 0d6: invokevirtual com/google/gson/JsonArray.get (I)Lcom/google/gson/JsonElement;
      // 0d9: invokevirtual com/google/gson/JsonElement.getAsDouble ()D
      // 0dc: dastore
      // 0dd: dup
      // 0de: bipush 1
      // 0df: aload 4
      // 0e1: bipush 1
      // 0e2: invokevirtual com/google/gson/JsonArray.get (I)Lcom/google/gson/JsonElement;
      // 0e5: invokevirtual com/google/gson/JsonElement.getAsDouble ()D
      // 0e8: dastore
      // 0e9: invokevirtual k74/x/lIlllIl.III ([D)V
      // 0ec: return
      // 0ed: aload 1
      // 0ee: instanceof k74/x/lIIIIIlI
      // 0f1: ifeq 165
      // 0f4: aload 1
      // 0f5: checkcast k74/x/lIIIIIlI
      // 0f8: astore 3
      // 0f9: new java/util/ArrayList
      // 0fc: dup
      // 0fd: invokespecial java/util/ArrayList.<init> ()V
      // 100: astore 4
      // 102: aload 2
      // 103: ifnull 15e
      // 106: aload 2
      // 107: invokevirtual com/google/gson/JsonElement.isJsonArray ()Z
      // 10a: ifeq 15e
      // 10d: goto 114
      // 110: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 113: athrow
      // 114: aload 2
      // 115: invokevirtual com/google/gson/JsonElement.getAsJsonArray ()Lcom/google/gson/JsonArray;
      // 118: invokevirtual com/google/gson/JsonArray.iterator ()Ljava/util/Iterator;
      // 11b: astore 5
      // 11d: aload 5
      // 11f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 124: ifeq 15e
      // 127: aload 5
      // 129: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 12e: checkcast com/google/gson/JsonElement
      // 131: astore 6
      // 133: aload 6
      // 135: ifnull 15b
      // 138: aload 6
      // 13a: invokevirtual com/google/gson/JsonElement.isJsonPrimitive ()Z
      // 13d: ifeq 15b
      // 140: goto 147
      // 143: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 146: athrow
      // 147: aload 4
      // 149: aload 6
      // 14b: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 14e: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 153: pop
      // 154: goto 15b
      // 157: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15a: athrow
      // 15b: goto 11d
      // 15e: aload 3
      // 15f: aload 4
      // 161: invokevirtual k74/x/lIIIIIlI.IIII (Ljava/util/Collection;)V
      // 164: return
      // 165: aload 1
      // 166: instanceof k74/x/IllIII
      // 169: ifeq 1e2
      // 16c: aload 1
      // 16d: checkcast k74/x/IllIII
      // 170: astore 3
      // 171: aload 3
      // 172: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 175: ifnonnull 1a2
      // 178: new java/lang/IllegalArgumentException
      // 17b: dup
      // 17c: ldc_w -1834187913
      // 17f: iload 7
      // 181: ldc_w 1151803123
      // 184: ixor
      // 185: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 188: ldc_w -1834187914
      // 18b: iload 7
      // 18d: ldc_w 1102686517
      // 190: ixor
      // 191: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 194: invokestatic k74/x/llIIlllI.IIllll (II)Ljava/lang/String;
      // 197: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 19a: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 19d: athrow
      // 19e: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a1: athrow
      // 1a2: aload 3
      // 1a3: aload 2
      // 1a4: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 1a7: invokevirtual k74/x/IllIII.IlI (Ljava/lang/String;)Ljava/lang/Enum;
      // 1aa: astore 4
      // 1ac: aload 4
      // 1ae: ifnonnull 1db
      // 1b1: new java/lang/IllegalArgumentException
      // 1b4: dup
      // 1b5: ldc_w -1834187915
      // 1b8: iload 7
      // 1ba: ldc_w 217200791
      // 1bd: ixor
      // 1be: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 1c1: ldc_w -1834187916
      // 1c4: iload 7
      // 1c6: ldc_w 1569835962
      // 1c9: ixor
      // 1ca: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 1cd: invokestatic k74/x/llIIlllI.IIllll (II)Ljava/lang/String;
      // 1d0: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 1d3: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 1d6: athrow
      // 1d7: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1da: athrow
      // 1db: aload 3
      // 1dc: aload 4
      // 1de: invokevirtual k74/x/IllIII.lII (Ljava/lang/Enum;)V
      // 1e1: return
      // 1e2: aload 1
      // 1e3: instanceof k74/x/lllIIllI
      // 1e6: ifeq 216
      // 1e9: aload 1
      // 1ea: checkcast k74/x/lllIIllI
      // 1ed: astore 3
      // 1ee: aload 3
      // 1ef: aload 2
      // 1f0: ifnull 201
      // 1f3: aload 2
      // 1f4: invokevirtual com/google/gson/JsonElement.isJsonNull ()Z
      // 1f7: ifeq 20e
      // 1fa: goto 201
      // 1fd: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 200: athrow
      // 201: ldc_w ""
      // 204: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 207: goto 212
      // 20a: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20d: athrow
      // 20e: aload 2
      // 20f: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 212: invokevirtual k74/x/lllIIllI.I (Ljava/lang/String;)V
      // 215: return
      // 216: aload 1
      // 217: instanceof k74/x/IllIlIl
      // 21a: ifeq 2ad
      // 21d: aload 1
      // 21e: checkcast k74/x/IllIlIl
      // 221: astore 3
      // 222: new java/util/ArrayList
      // 225: dup
      // 226: invokespecial java/util/ArrayList.<init> ()V
      // 229: astore 4
      // 22b: aload 2
      // 22c: ifnull 28a
      // 22f: aload 2
      // 230: invokevirtual com/google/gson/JsonElement.isJsonArray ()Z
      // 233: ifeq 28a
      // 236: goto 23d
      // 239: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23c: athrow
      // 23d: aload 2
      // 23e: invokevirtual com/google/gson/JsonElement.getAsJsonArray ()Lcom/google/gson/JsonArray;
      // 241: invokevirtual com/google/gson/JsonArray.iterator ()Ljava/util/Iterator;
      // 244: astore 5
      // 246: aload 5
      // 248: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 24d: ifeq 287
      // 250: aload 5
      // 252: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 257: checkcast com/google/gson/JsonElement
      // 25a: astore 6
      // 25c: aload 6
      // 25e: ifnull 284
      // 261: aload 6
      // 263: invokevirtual com/google/gson/JsonElement.isJsonPrimitive ()Z
      // 266: ifeq 284
      // 269: goto 270
      // 26c: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26f: athrow
      // 270: aload 4
      // 272: aload 6
      // 274: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 277: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 27c: pop
      // 27d: goto 284
      // 280: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 283: athrow
      // 284: goto 246
      // 287: goto 2a6
      // 28a: aload 2
      // 28b: ifnull 2a6
      // 28e: aload 2
      // 28f: invokevirtual com/google/gson/JsonElement.isJsonPrimitive ()Z
      // 292: ifeq 2a6
      // 295: goto 29c
      // 298: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29b: athrow
      // 29c: aload 3
      // 29d: aload 2
      // 29e: invokevirtual k74/x/IllIlIl.ll (Lcom/google/gson/JsonElement;)V
      // 2a1: return
      // 2a2: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a5: athrow
      // 2a6: aload 3
      // 2a7: aload 4
      // 2a9: invokevirtual k74/x/IllIlIl.lII (Ljava/util/List;)V
      // 2ac: return
      // 2ad: aload 1
      // 2ae: instanceof k74/x/IIIlIIlll
      // 2b1: ifeq 2c3
      // 2b4: aload 1
      // 2b5: checkcast k74/x/IIIlIIlll
      // 2b8: astore 3
      // 2b9: aload 3
      // 2ba: aload 0
      // 2bb: aload 2
      // 2bc: invokevirtual k74/x/llIIlllI.IIIl (Lcom/google/gson/JsonElement;)Ljava/awt/Color;
      // 2bf: invokevirtual k74/x/IIIlIIlll.Il (Ljava/lang/Object;)V
      // 2c2: return
      // 2c3: aload 1
      // 2c4: instanceof k74/x/lIllIlII
      // 2c7: ifeq 318
      // 2ca: aload 1
      // 2cb: checkcast k74/x/lIllIlII
      // 2ce: astore 3
      // 2cf: aload 2
      // 2d0: ifnull 2f2
      // 2d3: aload 2
      // 2d4: invokevirtual com/google/gson/JsonElement.isJsonObject ()Z
      // 2d7: ifeq 2f2
      // 2da: goto 2e1
      // 2dd: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e0: athrow
      // 2e1: aload 3
      // 2e2: aload 0
      // 2e3: aload 2
      // 2e4: invokevirtual com/google/gson/JsonElement.getAsJsonObject ()Lcom/google/gson/JsonObject;
      // 2e7: invokevirtual k74/x/llIIlllI.lIIl (Lcom/google/gson/JsonObject;)Lnet/minecraft/class_3675$class_306;
      // 2ea: invokevirtual k74/x/lIllIlII.lI (Lnet/minecraft/class_3675$class_306;)V
      // 2ed: return
      // 2ee: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f1: athrow
      // 2f2: new java/lang/IllegalArgumentException
      // 2f5: dup
      // 2f6: ldc_w -1834187957
      // 2f9: iload 7
      // 2fb: ldc_w -2049418265
      // 2fe: ixor
      // 2ff: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 302: ldc_w -1834187958
      // 305: iload 7
      // 307: ldc_w -1340252888
      // 30a: ixor
      // 30b: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 30e: invokestatic k74/x/llIIlllI.IIllll (II)Ljava/lang/String;
      // 311: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 314: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 317: athrow
      // 318: new java/lang/IllegalArgumentException
      // 31b: dup
      // 31c: ldc_w -1834187959
      // 31f: iload 7
      // 321: ldc_w -284435827
      // 324: ixor
      // 325: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 328: ldc_w -1834187960
      // 32b: iload 7
      // 32d: ldc_w -289880600
      // 330: ixor
      // 331: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 334: invokestatic k74/x/llIIlllI.IIllll (II)Ljava/lang/String;
      // 337: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 33a: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 33d: athrow
   }

   private Map<String, Object> IIIIlI(IllIII<?> var1, Enum<?> var2) {
      LinkedHashMap var3 = new LinkedHashMap();

      LinkedHashMap var10000;
      String var10001;
      String var10002;
      label17: {
         try {
            var3.put(IlIIllIII.lI(IIllll(Illlll(-1834187953, 1291072573 ^ 1807616617), Illlll(-1834187954, 1291072573 ^ 626683838))), var1.III(var2));
            var10000 = var3;
            var10001 = IlIIllIII.lI(IIllll(Illlll(-1834187955, 1291072573 ^ -807854376), Illlll(-1834187956, 1291072573 ^ 486577587)));
            if (var2 == null) {
               var10002 = "";
               break label17;
            }
         } catch (IllegalStateException var4) {
            throw llII(var4);
         }

         var10002 = var2.toString();
      }

      var10000.put(var10001, var10002);
      return var3;
   }

   private String IIIIll(JsonObject param1, String param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 34
      // 04: aload 1
      // 05: aload 2
      // 06: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 09: ifeq 34
      // 0c: goto 13
      // 0f: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: aload 1
      // 14: aload 2
      // 15: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 18: invokevirtual com/google/gson/JsonElement.isJsonNull ()Z
      // 1b: ifne 34
      // 1e: goto 25
      // 21: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: aload 1
      // 26: aload 2
      // 27: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 2a: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 2d: goto 35
      // 30: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33: athrow
      // 34: aconst_null
      // 35: areturn
   }

   private Map IIIlII(String var1) {
      IlIIIIIIl var2 = this.IIllI(var1);
      LinkedHashMap var3 = new LinkedHashMap();
      var3.put(IlIIllIII.lI(IIllll(Illlll(-1834187965, 1802532490 ^ 413911850), Illlll(-1834187966, 1802532490 ^ -1032134646))), true);
      var3.put(IlIIllIII.lI(IIllll(Illlll(-1834187967, 1802532490 ^ -1110686187), Illlll(-1834187968, 1802532490 ^ 2105361602))), this.IllII(var2, true));
      return var3;
   }

   private Map IIIlIl(boolean var1) {
      return this.IllI(var1);
   }

   Map<String, Object> IIIllI(JsonObject var1) {
      return this.IlIlI(IlIIllIII.lI(IIllll(Illlll(-1834187961, 522501340 ^ 371445221), Illlll(-1834187962, 522501340 ^ 342955332))), this::lllll);
   }

   private Map IIIlll() {
      return this.IllIl(
         IlIIllIII.lI(IIllll(Illlll(-1834187963, -342719347 ^ 1611667370), Illlll(-1834187964, -342719347 ^ 611264683))), this.I.IIll(this.lI.II())
      );
   }

   private Map<String, Object> IIlIII(IIIlIIII var1) {
      int var4 = 1684089783;
      LinkedHashMap var2 = new LinkedHashMap();
      IIllllIIl var3 = var1.IIIIIl();

      LinkedHashMap var10000;
      String var10001;
      String var10002;
      label29: {
         try {
            var10000 = var2;
            var10001 = IlIIllIII.lI(IIllll(Illlll(-1834187941, var4 ^ -929951104), Illlll(-1834187942, var4 ^ 991816353)));
            if (var3 == null) {
               var10002 = IlIIllIII.lI(IIllll(Illlll(-1834187943, var4 ^ 1520649247), Illlll(-1834187944, var4 ^ 964496484)));
               break label29;
            }
         } catch (IllegalStateException var6) {
            throw llII(var6);
         }

         var10002 = IIllIl(var3);
      }

      label22: {
         try {
            var10000.put(var10001, var10002);
            var10000 = var2;
            var10001 = IlIIllIII.lI(IIllll(Illlll(-1834187937, var4 ^ 15549665), Illlll(-1834187938, var4 ^ 524085883)));
            if (var3 == null) {
               var10002 = IlIIllIII.lI(IIllll(Illlll(-1834187939, var4 ^ -1935442782), Illlll(-1834187940, var4 ^ 1986498410)));
               break label22;
            }
         } catch (IllegalStateException var5) {
            throw llII(var5);
         }

         var10002 = var3.toString();
      }

      var10000.put(var10001, var10002);
      var2.put(IlIIllIII.lI(IIllll(Illlll(-1834187949, var4 ^ -1790042740), Illlll(-1834187950, var4 ^ -1983725820))), this.lllIl(var1.lIlll()));
      var2.put(IlIIllIII.lI(IIllll(Illlll(-1834187951, var4 ^ -1513115935), Illlll(-1834187952, var4 ^ 104188296))), this.lllIl(var1.lIII()));
      var2.put(IlIIllIII.lI(IIllll(Illlll(-1834187945, var4 ^ 1699005467), Illlll(-1834187946, var4 ^ 1955319363))), this.lllIl(var1.lIIII()));
      var2.put(IlIIllIII.lI(IIllll(Illlll(-1834187947, var4 ^ 1867357683), Illlll(-1834187948, var4 ^ 1112386747))), this.lllIl(var1.IIII()));
      var2.put(IlIIllIII.lI(IIllll(Illlll(-1834187861, var4 ^ -290246125), Illlll(-1834187862, var4 ^ 624230007))), this.lllIl(var1.IIl()));
      var2.put(IlIIllIII.lI(IIllll(Illlll(-1834187863, var4 ^ 2809227), Illlll(-1834187864, var4 ^ -1947904097))), this.lllIl(var1.IIIl()));
      var2.put(IlIIllIII.lI(IIllll(Illlll(-1834187857, var4 ^ 216590363), Illlll(-1834187858, var4 ^ -136399305))), this.lllIl(var1.IllI()));
      var2.put(IlIIllIII.lI(IIllll(Illlll(-1834187859, var4 ^ -901025026), Illlll(-1834187860, var4 ^ -945786387))), this.lllIl(var1.IlIl()));
      return var2;
   }

   Map<String, Object> IIlIIl() {
      return this.IIlIll(this::IIllII);
   }

   private Map IIlIlI() {
      this.lI.l();
      return this.IllIl(IlIIllIII.lI(IIllll(Illlll(-1834187869, 1869583858 ^ -1244180748), Illlll(-1834187870, 1869583858 ^ -1566131182))), true);
   }

   private <T> T IIlIll(Supplier<T> var1) {
      class_310 var2 = class_310.method_1551();

      try {
         if (var2 == null) {
            return (T)var1.get();
         }
      } catch (Exception var6) {
         throw llII(var6);
      }

      try {
         if (var2.method_18854()) {
            return (T)var1.get();
         }
      } catch (Exception var7) {
         throw llII(var7);
      }

      CompletableFuture var3 = new CompletableFuture();
      var2.execute(llIIlllI::IlIIIl);

      try {
         return (T)var3.get(3L, TimeUnit.SECONDS);
      } catch (Exception var5) {
         throw new IllegalStateException(var5.getMessage(), var5);
      }
   }

   private Map IIllII() {
      return this.IlI().II();
   }

   private static String IIllIl(Enum<?> var0) {
      try {
         if (var0 == null) {
            return "";
         }
      } catch (IllegalStateException var1) {
         throw llII(var1);
      }

      return new StringBuilder(4)
         .append((char)Illlll(-1834187871, -269550895 ^ 1947283320))
         .append(Integer.toString(var0.ordinal(), Illlll(-1834187872, -269550895 ^ 960206857)))
         .toString();
   }

   Map<String, Object> IIlllI(JsonObject var1) {
      return this.IlIlI(IlIIllIII.lI(IIllll(Illlll(-1834187865, 317768224 ^ -294668261), Illlll(-1834187866, 317768224 ^ -620626032))), this::Illl);
   }

   private static String IIllll(int var0, int var1) {
      int var9 = -434075669;
      int var2 = (var0 ^ Illlll(-1834187867, var9 ^ 1017976728)) & Illlll(-1834187868, var9 ^ -644292465);
      if (II[var2] == null) {
         char[] var3 = l[var2].toCharArray();

         int var4 = switch (var3[0] & Illlll(-1834187845, var9 ^ 225285464)) {
            case 0 -> Illlll(-1834187846, var9 ^ 704490306);
            case 1 -> Illlll(-1834187847, var9 ^ -1443476370);
            case 2 -> Illlll(-1834187848, var9 ^ 227785206);
            case 3 -> Illlll(-1834187841, var9 ^ -1343537258);
            case 4 -> Illlll(-1834187842, var9 ^ -1189499849);
            case 5 -> Illlll(-1834187843, var9 ^ -1544295700);
            case 6 -> Illlll(-1834187844, var9 ^ 735598788);
            case 7 -> Illlll(-1834187853, var9 ^ -1335283907);
            case 8 -> Illlll(-1834187854, var9 ^ -1212442824);
            case 9 -> Illlll(-1834187855, var9 ^ 1420766792);
            case 10 -> Illlll(-1834187856, var9 ^ 1009143018);
            case 11 -> Illlll(-1834187849, var9 ^ -1343357628);
            case 12 -> Illlll(-1834187850, var9 ^ -1376170708);
            case 13 -> Illlll(-1834187851, var9 ^ -103769909);
            case 14 -> Illlll(-1834187852, var9 ^ -2082844745);
            case 15 -> Illlll(-1834187893, var9 ^ -1498003970);
            case 16 -> Illlll(-1834187894, var9 ^ -285437183);
            case 17 -> Illlll(-1834187895, var9 ^ 2145649262);
            case 18 -> Illlll(-1834187896, var9 ^ 1599284879);
            case 19 -> Illlll(-1834187889, var9 ^ -891375298);
            case 20 -> Illlll(-1834187890, var9 ^ 1375135256);
            case 21 -> Illlll(-1834187891, var9 ^ -1538345139);
            case 22 -> Illlll(-1834187892, var9 ^ -1069449266);
            case 23 -> Illlll(-1834187901, var9 ^ 2129735436);
            case 24 -> Illlll(-1834187902, var9 ^ -1415077659);
            case 25 -> Illlll(-1834187903, var9 ^ -727141616);
            case 26 -> Illlll(-1834187904, var9 ^ -1448363483);
            case 27 -> Illlll(-1834187897, var9 ^ 1687613030);
            case 28 -> Illlll(-1834187898, var9 ^ 1775138116);
            case 29 -> Illlll(-1834187899, var9 ^ 1028854191);
            case 30 -> Illlll(-1834187900, var9 ^ 1090660618);
            case 31 -> Illlll(-1834187877, var9 ^ -1331349083);
            case 32 -> Illlll(-1834187878, var9 ^ 1417258915);
            case 33 -> Illlll(-1834187879, var9 ^ 1658104990);
            case 34 -> Illlll(-1834187880, var9 ^ 986158720);
            case 35 -> Illlll(-1834187873, var9 ^ -157936070);
            case 36 -> Illlll(-1834187874, var9 ^ -411104429);
            case 37 -> Illlll(-1834187875, var9 ^ -2088015768);
            case 38 -> Illlll(-1834187876, var9 ^ 1287276980);
            case 39 -> Illlll(-1834187885, var9 ^ 1419476825);
            case 40 -> Illlll(-1834187886, var9 ^ 2104894584);
            case 41 -> Illlll(-1834187887, var9 ^ -209164056);
            case 42 -> Illlll(-1834187888, var9 ^ 324432419);
            case 43 -> Illlll(-1834187881, var9 ^ -1510620290);
            case 44 -> Illlll(-1834187882, var9 ^ 767104653);
            case 45 -> 3;
            case 46 -> Illlll(-1834187883, var9 ^ 1973831665);
            case 47 -> Illlll(-1834187884, var9 ^ 1622289199);
            case 48 -> Illlll(-1834187797, var9 ^ -1671706278);
            case 49 -> Illlll(-1834187798, var9 ^ 382224224);
            case 50 -> Illlll(-1834187799, var9 ^ 2083979344);
            case 51 -> Illlll(-1834187800, var9 ^ -1552044176);
            case 52 -> Illlll(-1834187793, var9 ^ -1810677228);
            case 53 -> Illlll(-1834187794, var9 ^ -124284388);
            case 54 -> Illlll(-1834187795, var9 ^ 621661849);
            case 55 -> Illlll(-1834187796, var9 ^ -531120607);
            case 56 -> Illlll(-1834187805, var9 ^ 556396077);
            case 57 -> Illlll(-1834187806, var9 ^ 683447324);
            case 58 -> Illlll(-1834187807, var9 ^ 69697868);
            case 59 -> Illlll(-1834187808, var9 ^ 316984348);
            case 60 -> Illlll(-1834187801, var9 ^ 218080138);
            case 61 -> Illlll(-1834187802, var9 ^ 2063107086);
            case 62 -> Illlll(-1834187803, var9 ^ 1834359113);
            case 63 -> Illlll(-1834187804, var9 ^ 1519533015);
            case 64 -> Illlll(-1834187781, var9 ^ 1970867764);
            case 65 -> Illlll(-1834187782, var9 ^ -2042470444);
            case 66 -> Illlll(-1834187783, var9 ^ 149547911);
            case 67 -> Illlll(-1834187784, var9 ^ 630109764);
            case 68 -> Illlll(-1834187777, var9 ^ 1786338615);
            case 69 -> Illlll(-1834187778, var9 ^ 1602845934);
            case 70 -> Illlll(-1834187779, var9 ^ -2133912080);
            case 71 -> Illlll(-1834187780, var9 ^ 1038424393);
            case 72 -> Illlll(-1834187789, var9 ^ -2012549540);
            case 73 -> Illlll(-1834187790, var9 ^ -1043191493);
            case 74 -> Illlll(-1834187791, var9 ^ 2038255138);
            case 75 -> Illlll(-1834187792, var9 ^ -1265369167);
            case 76 -> Illlll(-1834187785, var9 ^ -999804636);
            case 77 -> Illlll(-1834187786, var9 ^ 2002171837);
            case 78 -> Illlll(-1834187787, var9 ^ -134455755);
            case 79 -> Illlll(-1834187788, var9 ^ 2008802000);
            case 80 -> Illlll(-1834187829, var9 ^ -448612335);
            case 81 -> Illlll(-1834187830, var9 ^ 2016299782);
            case 82 -> Illlll(-1834187831, var9 ^ 428270911);
            case 83 -> Illlll(-1834187832, var9 ^ 2133530806);
            case 84 -> Illlll(-1834187825, var9 ^ -1357179826);
            case 85 -> Illlll(-1834187826, var9 ^ 504399725);
            case 86 -> Illlll(-1834187827, var9 ^ -1421255856);
            case 87 -> Illlll(-1834187828, var9 ^ -1543399414);
            case 88 -> Illlll(-1834187837, var9 ^ 1245774083);
            case 89 -> Illlll(-1834187838, var9 ^ -1917931412);
            case 90 -> Illlll(-1834187839, var9 ^ -1060032387);
            case 91 -> Illlll(-1834187840, var9 ^ 1066997357);
            case 92 -> Illlll(-1834187833, var9 ^ -1131509029);
            case 93 -> Illlll(-1834187834, var9 ^ 1398222305);
            case 94 -> Illlll(-1834187835, var9 ^ -610359158);
            case 95 -> Illlll(-1834187836, var9 ^ 58161183);
            case 96 -> Illlll(-1834187813, var9 ^ 1838176884);
            case 97 -> Illlll(-1834187814, var9 ^ -1874588082);
            case 98 -> Illlll(-1834187815, var9 ^ -1427263765);
            case 99 -> Illlll(-1834187816, var9 ^ 794128669);
            case 100 -> Illlll(-1834187809, var9 ^ 831737632);
            case 101 -> Illlll(-1834187810, var9 ^ -1887822604);
            case 102 -> Illlll(-1834187811, var9 ^ 1406822913);
            case 103 -> Illlll(-1834187812, var9 ^ -1038046744);
            case 104 -> Illlll(-1834187821, var9 ^ -1460305160);
            case 105 -> Illlll(-1834187822, var9 ^ -2098956266);
            case 106 -> Illlll(-1834187823, var9 ^ 1029783085);
            case 107 -> Illlll(-1834187824, var9 ^ -2085051505);
            case 108 -> Illlll(-1834187817, var9 ^ -1924524907);
            case 109 -> Illlll(-1834187818, var9 ^ 196152041);
            case 110 -> Illlll(-1834187819, var9 ^ 1489119072);
            case 111 -> Illlll(-1834187820, var9 ^ -1142863640);
            case 112 -> Illlll(-1834188757, var9 ^ 1245620221);
            case 113 -> Illlll(-1834188758, var9 ^ -702528322);
            case 114 -> Illlll(-1834188759, var9 ^ -2130274969);
            case 115 -> Illlll(-1834188760, var9 ^ -2057749130);
            case 116 -> Illlll(-1834188753, var9 ^ 299694979);
            case 117 -> Illlll(-1834188754, var9 ^ 497211388);
            case 118 -> Illlll(-1834188755, var9 ^ -774476640);
            case 119 -> Illlll(-1834188756, var9 ^ 707844651);
            case 120 -> Illlll(-1834188765, var9 ^ -366978311);
            case 121 -> Illlll(-1834188766, var9 ^ 319016912);
            case 122 -> Illlll(-1834188767, var9 ^ 1660443358);
            case 123 -> Illlll(-1834188768, var9 ^ -1272888061);
            case 124 -> Illlll(-1834188761, var9 ^ -1034862457);
            case 125 -> 4;
            case 126 -> Illlll(-1834188762, var9 ^ 440250595);
            case 127 -> Illlll(-1834188763, var9 ^ -1474289497);
            case 128 -> Illlll(-1834188764, var9 ^ 1017235061);
            case 129 -> Illlll(-1834188741, var9 ^ -1933449648);
            case 130 -> Illlll(-1834188742, var9 ^ -504087931);
            case 131 -> Illlll(-1834188743, var9 ^ 460114336);
            case 132 -> Illlll(-1834188744, var9 ^ -23286603);
            case 133 -> Illlll(-1834188737, var9 ^ 1362089050);
            case 134 -> Illlll(-1834188738, var9 ^ 701098029);
            case 135 -> Illlll(-1834188739, var9 ^ 522269323);
            case 136 -> Illlll(-1834188740, var9 ^ -194123834);
            case 137 -> Illlll(-1834188749, var9 ^ -1823396739);
            case 138 -> Illlll(-1834188750, var9 ^ -1123310126);
            case 139 -> Illlll(-1834188751, var9 ^ -1867294281);
            case 140 -> Illlll(-1834188752, var9 ^ 1394168968);
            case 141 -> Illlll(-1834188745, var9 ^ -277737013);
            case 142 -> Illlll(-1834188746, var9 ^ 1243544994);
            case 143 -> Illlll(-1834188747, var9 ^ -846704118);
            case 144 -> Illlll(-1834188748, var9 ^ 314631248);
            case 145 -> Illlll(-1834188789, var9 ^ -1491267972);
            case 146 -> Illlll(-1834188790, var9 ^ -1977856236);
            case 147 -> 0;
            case 148 -> Illlll(-1834188791, var9 ^ -872259083);
            case 149 -> Illlll(-1834188792, var9 ^ 1113796159);
            case 150 -> Illlll(-1834188785, var9 ^ -261856223);
            case 151 -> Illlll(-1834188786, var9 ^ 1739480431);
            case 152 -> Illlll(-1834188787, var9 ^ 286104026);
            case 153 -> Illlll(-1834188788, var9 ^ -1801821092);
            case 154 -> Illlll(-1834188797, var9 ^ -1199055925);
            case 155 -> Illlll(-1834188798, var9 ^ -1626756769);
            case 156 -> Illlll(-1834188799, var9 ^ -1045882971);
            case 157 -> Illlll(-1834188800, var9 ^ 1544865365);
            case 158 -> Illlll(-1834188793, var9 ^ 2013987342);
            case 159 -> Illlll(-1834188794, var9 ^ 732176575);
            case 160 -> Illlll(-1834188795, var9 ^ 73033763);
            case 161 -> Illlll(-1834188796, var9 ^ 1473783785);
            case 162 -> Illlll(-1834188773, var9 ^ -696112626);
            case 163 -> Illlll(-1834188774, var9 ^ 1982480819);
            case 164 -> Illlll(-1834188775, var9 ^ -2110637256);
            case 165 -> Illlll(-1834188776, var9 ^ -1251589951);
            case 166 -> Illlll(-1834188769, var9 ^ -1502232162);
            case 167 -> Illlll(-1834188770, var9 ^ -339569244);
            case 168 -> Illlll(-1834188771, var9 ^ -1288489570);
            case 169 -> Illlll(-1834188772, var9 ^ 264772680);
            case 170 -> Illlll(-1834188781, var9 ^ -1468201723);
            case 171 -> Illlll(-1834188782, var9 ^ -8228676);
            case 172 -> Illlll(-1834188783, var9 ^ 1701889985);
            case 173 -> Illlll(-1834188784, var9 ^ 1135989834);
            case 174 -> Illlll(-1834188777, var9 ^ 952849322);
            case 175 -> Illlll(-1834188778, var9 ^ -1989206322);
            case 176 -> Illlll(-1834188779, var9 ^ -1949393637);
            case 177 -> Illlll(-1834188780, var9 ^ 1195799234);
            case 178 -> Illlll(-1834188693, var9 ^ 2003825610);
            case 179 -> Illlll(-1834188694, var9 ^ 561287840);
            case 180 -> Illlll(-1834188695, var9 ^ 1987025596);
            case 181 -> Illlll(-1834188696, var9 ^ -235961633);
            case 182 -> Illlll(-1834188689, var9 ^ -1655882639);
            case 183 -> Illlll(-1834188690, var9 ^ 980230077);
            case 184 -> 1;
            case 185 -> Illlll(-1834188691, var9 ^ 95210968);
            case 186 -> Illlll(-1834188692, var9 ^ -2082118120);
            case 187 -> Illlll(-1834188701, var9 ^ 27042431);
            case 188 -> Illlll(-1834188702, var9 ^ -544410215);
            case 189 -> Illlll(-1834188703, var9 ^ 369918229);
            case 190 -> Illlll(-1834188704, var9 ^ -1134513918);
            case 191 -> Illlll(-1834188697, var9 ^ -1402084328);
            case 192 -> Illlll(-1834188698, var9 ^ 304679961);
            case 193 -> Illlll(-1834188699, var9 ^ 37412551);
            case 194 -> Illlll(-1834188700, var9 ^ 1199397012);
            case 195 -> Illlll(-1834188677, var9 ^ -1364864345);
            case 196 -> Illlll(-1834188678, var9 ^ 1371093660);
            case 197 -> Illlll(-1834188679, var9 ^ -413840532);
            case 198 -> Illlll(-1834188680, var9 ^ -2005696380);
            case 199 -> Illlll(-1834188673, var9 ^ -1376442913);
            case 200 -> Illlll(-1834188674, var9 ^ -894007043);
            case 201 -> Illlll(-1834188675, var9 ^ -1414916921);
            case 202 -> Illlll(-1834188676, var9 ^ -967331930);
            case 203 -> Illlll(-1834188685, var9 ^ -1763001799);
            case 204 -> Illlll(-1834188686, var9 ^ -2127598401);
            case 205 -> Illlll(-1834188687, var9 ^ 395925891);
            case 206 -> Illlll(-1834188688, var9 ^ 1929916093);
            case 207 -> Illlll(-1834188681, var9 ^ -174428613);
            case 208 -> Illlll(-1834188682, var9 ^ 2008253464);
            case 209 -> Illlll(-1834188683, var9 ^ 767488070);
            case 210 -> Illlll(-1834188684, var9 ^ -1569193272);
            case 211 -> Illlll(-1834188725, var9 ^ -1595215);
            case 212 -> Illlll(-1834188726, var9 ^ -983363234);
            case 213 -> Illlll(-1834188727, var9 ^ -1052871732);
            case 214 -> Illlll(-1834188728, var9 ^ 1088038132);
            case 215 -> Illlll(-1834188721, var9 ^ -634605233);
            case 216 -> Illlll(-1834188722, var9 ^ 1045508275);
            case 217 -> Illlll(-1834188723, var9 ^ 1123804273);
            case 218 -> Illlll(-1834188724, var9 ^ -1650405732);
            case 219 -> Illlll(-1834188733, var9 ^ -1948063645);
            case 220 -> Illlll(-1834188734, var9 ^ -1704557183);
            case 221 -> Illlll(-1834188735, var9 ^ 845720755);
            case 222 -> Illlll(-1834188736, var9 ^ -1055900222);
            case 223 -> Illlll(-1834188729, var9 ^ -804161824);
            case 224 -> Illlll(-1834188730, var9 ^ 2071340082);
            case 225 -> Illlll(-1834188731, var9 ^ -129862070);
            case 226 -> Illlll(-1834188732, var9 ^ -1223306873);
            case 227 -> Illlll(-1834188709, var9 ^ 541976747);
            case 228 -> Illlll(-1834188710, var9 ^ 2127965698);
            case 229 -> Illlll(-1834188711, var9 ^ -573597199);
            case 230 -> Illlll(-1834188712, var9 ^ 1486524523);
            case 231 -> Illlll(-1834188705, var9 ^ -1626863351);
            case 232 -> Illlll(-1834188706, var9 ^ 679295947);
            case 233 -> Illlll(-1834188707, var9 ^ 465483852);
            case 234 -> Illlll(-1834188708, var9 ^ 794778527);
            case 235 -> Illlll(-1834188717, var9 ^ -656709395);
            case 236 -> Illlll(-1834188718, var9 ^ -1211932058);
            case 237 -> Illlll(-1834188719, var9 ^ -1666125352);
            case 238 -> Illlll(-1834188720, var9 ^ 866653940);
            case 239 -> Illlll(-1834188713, var9 ^ -1193984891);
            case 240 -> Illlll(-1834188714, var9 ^ 1931580799);
            case 241 -> Illlll(-1834188715, var9 ^ -1078151051);
            case 242 -> Illlll(-1834188716, var9 ^ -1517864539);
            case 243 -> 5;
            case 244 -> Illlll(-1834188629, var9 ^ -2004723193);
            case 245 -> Illlll(-1834188630, var9 ^ 1683352570);
            case 246 -> 2;
            case 247 -> Illlll(-1834188631, var9 ^ 2022985211);
            case 248 -> Illlll(-1834188632, var9 ^ 188841072);
            case 249 -> Illlll(-1834188625, var9 ^ -1083112952);
            case 250 -> Illlll(-1834188626, var9 ^ -587511429);
            case 251 -> Illlll(-1834188627, var9 ^ -742222281);
            case 252 -> Illlll(-1834188628, var9 ^ -1961913749);
            case 253 -> Illlll(-1834188637, var9 ^ -1674966219);
            case 254 -> Illlll(-1834188638, var9 ^ 1533561671);
            default -> Illlll(-1834188639, var9 ^ -1173547036);
         };
         int var5 = (var1 & Illlll(-1834188640, var9 ^ 1065195614)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & Illlll(-1834188633, var9 ^ 73114889)) >>> Illlll(-1834188634, var9 ^ 746598380)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & Illlll(-1834188635, var9 ^ -1555199435);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & Illlll(-1834188636, var9 ^ -1582601184);
            }
         }

         II[var2] = new String(var3).intern();
      }

      return II[var2];
   }

   private List<Map<String, Object>> IlIIII(IllIII<?> var1) {
      ArrayList var2 = new ArrayList();
      Enum var3 = (Enum)var1.IllI();

      Enum[] var10000;
      label51: {
         try {
            if (var3 == null) {
               var10000 = new Enum[0];
               break label51;
            }
         } catch (IllegalStateException var12) {
            throw llII(var12);
         }

         var10000 = (Enum[])var3.getDeclaringClass().getEnumConstants();
      }

      Enum[] var4 = var10000;

      try {
         if (var4 == null) {
            return var2;
         }
      } catch (IllegalStateException var11) {
         throw llII(var11);
      }

      for (Enum var8 : var4) {
         if (var8 instanceof lIllIIIl var9) {
            try {
               if (!var9.II()) {
                  continue;
               }
            } catch (IllegalStateException var10) {
               throw llII(var10);
            }
         }

         LinkedHashMap var13 = new LinkedHashMap();
         var13.put(IlIIllIII.lI(IIllll(Illlll(-1834188613, 766169103 ^ 1087206481), Illlll(-1834188614, 766169103 ^ -1888576948))), var1.III(var8));
         var13.put(IlIIllIII.lI(IIllll(Illlll(-1834188615, 766169103 ^ 1150871581), Illlll(-1834188616, 766169103 ^ -1530126517))), var8.toString());
         var2.add(var13);
      }

      return var2;
   }

   private static void IlIIIl(CompletableFuture var0, Supplier var1) {
      try {
         var0.complete(var1.get());
      } catch (Throwable var3) {
         var0.completeExceptionally(var3);
      }
   }

   llIIlllI(IIIIIllII var1) {
      this.lI = var1;
      this.I = new IllIlIll(var1.ll());
   }

   private Map IlIIlI(JsonObject var1) {
      int var3 = -1122380860;
      IlIIIIIIl var2 = this.IIllI(this.lIllI(var1, IlIIllIII.lI(IIllll(Illlll(-1834188609, var3 ^ -1440792615), Illlll(-1834188610, var3 ^ 1316295165)))));

      try {
         if (!var2.IIlIIll()) {
            throw new IllegalArgumentException(IlIIllIII.lI(IIllll(Illlll(-1834188611, var3 ^ 239774717), Illlll(-1834188612, var3 ^ 112030983))));
         }
      } catch (IllegalStateException var4) {
         throw llII(var4);
      }

      label24: {
         try {
            if (var1.has(IlIIllIII.lI(IIllll(Illlll(-1834188621, var3 ^ -1578985011), Illlll(-1834188622, var3 ^ 907770229))))) {
               var2.IlIllIl(var1.get(IlIIllIII.lI(IIllll(Illlll(-1834188623, var3 ^ 78376233), Illlll(-1834188624, var3 ^ 516368510)))).getAsBoolean());
               break label24;
            }
         } catch (IllegalStateException var5) {
            throw llII(var5);
         }

         var2.IIlIIlI();
      }

      this.lI.l();
      return this.IllIl(IlIIllIII.lI(IIllll(Illlll(-1834188617, var3 ^ -162319613), Illlll(-1834188618, var3 ^ 2082623294))), this.IllII(var2, true));
   }

   private Map IlIIll() {
      int var6 = -504338428;
      LinkedHashMap var1 = new LinkedHashMap();
      ArrayList var2 = new ArrayList();

      for (IlIIIIIIl var4 : this.lI.II().IIIlll()) {
         LinkedHashMap var5 = new LinkedHashMap();
         var5.put(IlIIllIII.lI(IIllll(Illlll(-1834188619, var6 ^ 1547432488), Illlll(-1834188620, var6 ^ -1333370489))), var4.IIIlIlI());
         var5.put(IlIIllIII.lI(IIllll(Illlll(-1834188661, var6 ^ 1775194830), Illlll(-1834188662, var6 ^ 1020671866))), var4.IllIlI());
         var5.put(IlIIllIII.lI(IIllll(Illlll(-1834188663, var6 ^ -1276454315), Illlll(-1834188664, var6 ^ 1185366801))), IIllIl(var4.IllIlII()));
         var5.put(IlIIllIII.lI(IIllll(Illlll(-1834188657, var6 ^ -170570950), Illlll(-1834188658, var6 ^ 631154408))), this.lllII(var4.IlIIlII()));
         var2.add(var5);
      }

      var1.put(IlIIllIII.lI(IIllll(Illlll(-1834188659, var6 ^ 327171867), Illlll(-1834188660, var6 ^ -294513035))), true);
      var1.put(IlIIllIII.lI(IIllll(Illlll(-1834188669, var6 ^ 957549041), Illlll(-1834188670, var6 ^ 708167051))), this.lllII(this.lI.ll().IllIII()));
      var1.put(IlIIllIII.lI(IIllll(Illlll(-1834188671, var6 ^ 1962054617), Illlll(-1834188672, var6 ^ 287428054))), var2);
      return var1;
   }

   private String IlIlII(String var1) {
      String var2 = var1.toLowerCase(Locale.ROOT);
      String var10000 = var2.substring(0, 1).toUpperCase(Locale.ROOT);
      String var4 = var2.substring(1);
      String var3 = var10000;
      return var3 + var4;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private Map<String, Object> IlIlIl(IIllllIl<?> var1) {
      String[] var2;
      LinkedHashMap var3;
      int var14;
      label145: {
         var14 = -90663727;
         String[] var10000 = IIllllIl.IIIIl();
         var3 = new LinkedHashMap();
         var2 = var10000;
         var3.put(IlIIllIII.lI(IIllll(Illlll(-1834188665, var14 ^ -986938449), Illlll(-1834188666, var14 ^ 1876654098))), var1.llIl());
         var3.put(IlIIllIII.lI(IIllll(Illlll(-1834188667, var14 ^ -397557973), Illlll(-1834188668, var14 ^ -399583019))), this.IllIll(var1));
         var3.put(IlIIllIII.lI(IIllll(Illlll(-1834188645, var14 ^ -1178878413), Illlll(-1834188646, var14 ^ -200399862))), var1.lIll());
         Object var4 = var1 instanceof lIIIIIlI var5 ? var5.IIIl() : var1.IllI();
         Object var31 = var1 instanceof lIIIIIlI var6 ? var6.I() : var1.IlIl();
         if (var1 instanceof IllIII var32) {
            try {
               var3.put(
                  IlIIllIII.lI(IIllll(Illlll(-1834188647, var14 ^ 1266738276), Illlll(-1834188648, var14 ^ 1442705071))), this.IIIIlI(var32, (Enum<?>)var4)
               );
               var3.put(
                  IlIIllIII.lI(IIllll(Illlll(-1834188641, var14 ^ 1978849477), Illlll(-1834188642, var14 ^ -371294389))), this.IIIIlI(var32, (Enum<?>)var31)
               );
               if (var2 == null) {
                  break label145;
               }
            } catch (IllegalStateException var30) {
               throw llII(var30);
            }
         }

         try {
            var3.put(IlIIllIII.lI(IIllll(Illlll(-1834188643, var14 ^ -21501399), Illlll(-1834188644, var14 ^ -953823870))), this.Il(var4));
            var3.put(IlIIllIII.lI(IIllll(Illlll(-1834188653, var14 ^ 980681664), Illlll(-1834188654, var14 ^ -82192642))), this.Il(var31));
         } catch (IllegalStateException var15) {
            throw llII(var15);
         }
      }

      if (var1 instanceof IIlIII var33) {
         try {
            var3.put(IlIIllIII.lI(IIllll(Illlll(-1834188655, var14 ^ -654168104), Illlll(-1834188656, var14 ^ 1536857268))), var33.llI());
            var3.put(IlIIllIII.lI(IIllll(Illlll(-1834188649, var14 ^ 345392106), Illlll(-1834188650, var14 ^ 505698147))), var33.lI());
            var3.put(IlIIllIII.lI(IIllll(Illlll(-1834188651, var14 ^ 1994134764), Illlll(-1834188652, var14 ^ -657137269))), var33.II());
            var3.put(IlIIllIII.lI(IIllll(Illlll(-1834188565, var14 ^ 1643441859), Illlll(-1834188566, var14 ^ 87201138))), var33.I());
            if (var2 == null) {
               return var3;
            }
         } catch (IllegalStateException var29) {
            throw llII(var29);
         }
      }

      label150: {
         try {
            if (!(var1 instanceof lIlllIl)) {
               break label150;
            }
         } catch (IllegalStateException var28) {
            throw llII(var28);
         }

         lIlllIl var7 = (lIlllIl)var1;

         try {
            var3.put(IlIIllIII.lI(IIllll(Illlll(-1834188567, var14 ^ -53688967), Illlll(-1834188568, var14 ^ 268912101))), var7.IIlI());
            var3.put(IlIIllIII.lI(IIllll(Illlll(-1834188561, var14 ^ -1689677673), Illlll(-1834188562, var14 ^ 1244735493))), var7.IlI());
            var3.put(IlIIllIII.lI(IIllll(Illlll(-1834188563, var14 ^ -808796890), Illlll(-1834188564, var14 ^ 1232693764))), var7.llI());
            var3.put(IlIIllIII.lI(IIllll(Illlll(-1834188573, var14 ^ -1010592242), Illlll(-1834188574, var14 ^ -688608946))), var7.IIIl());
            var3.put(IlIIllIII.lI(IIllll(Illlll(-1834188575, var14 ^ -1960661868), Illlll(-1834188576, var14 ^ -246524851))), var7.IIll());
            var3.put(IlIIllIII.lI(IIllll(Illlll(-1834188569, var14 ^ 1277791416), Illlll(-1834188570, var14 ^ 773250968))), var7.lll());
            if (var2 == null) {
               return var3;
            }
         } catch (IllegalStateException var27) {
            throw llII(var27);
         }
      }

      label151: {
         try {
            if (!(var1 instanceof IllIII)) {
               break label151;
            }
         } catch (IllegalStateException var26) {
            throw llII(var26);
         }

         IllIII var8 = (IllIII)var1;

         try {
            var3.put(IlIIllIII.lI(IIllll(Illlll(-1834188571, var14 ^ -804698932), Illlll(-1834188572, var14 ^ -1172145083))), this.IlIIII(var8));
            if (var2 == null) {
               return var3;
            }
         } catch (IllegalStateException var25) {
            throw llII(var25);
         }
      }

      label152: {
         try {
            if (!(var1 instanceof lIIIIIlI)) {
               break label152;
            }
         } catch (IllegalStateException var24) {
            throw llII(var24);
         }

         lIIIIIlI var9 = (lIIIIIlI)var1;

         try {
            var3.put(IlIIllIII.lI(IIllll(Illlll(-1834188549, var14 ^ 1034041708), Illlll(-1834188550, var14 ^ 1682518342))), this.IlII(var9));
            if (var2 == null) {
               return var3;
            }
         } catch (IllegalStateException var23) {
            throw llII(var23);
         }
      }

      label153: {
         try {
            if (!(var1 instanceof lIllIlII)) {
               break label153;
            }
         } catch (IllegalStateException var22) {
            throw llII(var22);
         }

         lIllIlII var10 = (lIllIlII)var1;

         try {
            var3.put(IlIIllIII.lI(IIllll(Illlll(-1834188551, var14 ^ -1904789566), Illlll(-1834188552, var14 ^ -1446671521))), this.lllII(var10.IllI()));
            if (var2 == null) {
               return var3;
            }
         } catch (IllegalStateException var21) {
            throw llII(var21);
         }
      }

      label154: {
         try {
            if (!(var1 instanceof IIIlIIlll)) {
               break label154;
            }
         } catch (IllegalStateException var20) {
            throw llII(var20);
         }

         IIIlIIlll var11 = (IIIlIIlll)var1;

         try {
            var3.put(IlIIllIII.lI(IIllll(Illlll(-1834188545, var14 ^ -382533486), Illlll(-1834188546, var14 ^ 558029002))), this.lllIl(var11.IllI()));
            if (var2 == null) {
               return var3;
            }
         } catch (IllegalStateException var19) {
            throw llII(var19);
         }
      }

      label155: {
         try {
            if (!(var1 instanceof IllIlIl)) {
               break label155;
            }
         } catch (IllegalStateException var18) {
            throw llII(var18);
         }

         IllIlIl var12 = (IllIlIl)var1;

         try {
            var3.put(IlIIllIII.lI(IIllll(Illlll(-1834188547, var14 ^ 1703678988), Illlll(-1834188548, var14 ^ -1848072794))), var12.IIlI());
            if (var2 == null) {
               return var3;
            }
         } catch (IllegalStateException var17) {
            throw llII(var17);
         }
      }

      try {
         if (!(var1 instanceof IlIllIII)) {
            return var3;
         }
      } catch (IllegalStateException var16) {
         throw llII(var16);
      }

      IlIllIII var13 = (IlIllIII)var1;
      var3.put(IlIIllIII.lI(IIllll(Illlll(-1834188557, var14 ^ -1085053734), Illlll(-1834188558, var14 ^ 1210344390))), var13.lI());
      return var3;
   }

   Map<String, Object> IlIllI(String var1) {
      return this.IIlIll(this::IIIlII);
   }

   private IIllllIl<?> IlIlll(IlIIIIIIl param1, String param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 2
      // 01: ifnull 12
      // 04: aload 2
      // 05: invokevirtual java/lang/String.isBlank ()Z
      // 08: ifeq 3e
      // 0b: goto 12
      // 0e: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11: athrow
      // 12: new java/lang/IllegalArgumentException
      // 15: dup
      // 16: ldc_w -1834188559
      // 19: ldc_w 1934246779
      // 1c: ldc_w -1465434205
      // 1f: ixor
      // 20: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 23: ldc_w -1834188560
      // 26: ldc_w 1934246779
      // 29: ldc_w 1859012356
      // 2c: ixor
      // 2d: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 30: invokestatic k74/x/llIIlllI.IIllll (II)Ljava/lang/String;
      // 33: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 36: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 39: athrow
      // 3a: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d: athrow
      // 3e: aload 1
      // 3f: invokevirtual k74/x/IlIIIIIIl.llIIIl ()Ljava/util/List;
      // 42: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 47: astore 3
      // 48: aload 3
      // 49: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 4e: ifeq 72
      // 51: aload 3
      // 52: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 57: checkcast k74/x/IIllllIl
      // 5a: astore 4
      // 5c: aload 4
      // 5e: invokevirtual k74/x/IIllllIl.llIl ()Ljava/lang/String;
      // 61: aload 2
      // 62: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 65: ifeq 6f
      // 68: aload 4
      // 6a: areturn
      // 6b: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6e: athrow
      // 6f: goto 48
      // 72: new java/lang/IllegalArgumentException
      // 75: dup
      // 76: ldc_w -1834188553
      // 79: ldc_w 1934246779
      // 7c: ldc_w -369328963
      // 7f: ixor
      // 80: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 83: ldc_w -1834188554
      // 86: ldc_w 1934246779
      // 89: ldc_w -649265244
      // 8c: ixor
      // 8d: invokestatic k74/x/llIIlllI.Illlll (II)I
      // 90: invokestatic k74/x/llIIlllI.IIllll (II)Ljava/lang/String;
      // 93: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 96: aload 2
      // 97: astore 6
      // 99: astore 5
      // 9b: new java/lang/StringBuilder
      // 9e: dup
      // 9f: invokespecial java/lang/StringBuilder.<init> ()V
      // a2: aload 5
      // a4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // a7: aload 6
      // a9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // ac: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // af: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // b2: athrow
   }

   private static int Illlll(int var0, int var1) {
      int var2 = ll[var0 ^ -1834188245] ^ var1 ^ var0;
      var2 ^= 23364;
      var2 += 50811;
      var2 -= 43781;
      var2 ^= 55562;
      var2 += 39002;
      var2 -= 43276;
      var2 ^= 59277;
      var2 -= 56622;
      var2 ^= 22769;
      return var2 + 61360;
   }

   private String IllIII(String var1) {
      try {
         if (var1 == null) {
            return IlIIllIII.lI("");
         }
      } catch (IllegalStateException var3) {
         throw llII(var3);
      }

      String var2 = var1.replaceAll(
            IlIIllIII.lI(IIllll(Illlll(-1834188555, 1094092138 ^ -484880077), Illlll(-1834188556, 1094092138 ^ 480850892))), IlIIllIII.lI("")
         )
         .trim();
      if (var2.length() > Illlll(-1834188597, 1094092138 ^ -771127999)) {
         var2 = var2.substring(0, Illlll(-1834188598, 1094092138 ^ 2045685656));
      }

      return var2;
   }

   private Map IllIIl(JsonObject var1) {
      int var5 = -1395738057;
      IlIIIIIIl var2 = this.IIllI(this.lIllI(var1, IlIIllIII.lI(IIllll(Illlll(-1834188599, var5 ^ 1138339073), Illlll(-1834188600, var5 ^ 1546684121)))));
      IIllllIl var3 = this.IlIlll(
         var2, this.lIllI(var1, IlIIllIII.lI(IIllll(Illlll(-1834188593, var5 ^ -1755846846), Illlll(-1834188594, var5 ^ -1459667077))))
      );
      if (var3 instanceof IlIllIII var4) {
         var4.II();
         this.lI.l();
         return this.IllIl(IlIIllIII.lI(IIllll(Illlll(-1834188605, var5 ^ -1517181555), Illlll(-1834188606, var5 ^ -1222805504))), this.IlIlIl(var3));
      } else {
         throw new IllegalArgumentException(IlIIllIII.lI(IIllll(Illlll(-1834188595, var5 ^ 2102534587), Illlll(-1834188596, var5 ^ 867844216))));
      }
   }

   private Map IllIlI(JsonObject var1) {
      int var4 = -46026431;
      IlIIIIIIl var2 = this.IIllI(this.lIllI(var1, IlIIllIII.lI(IIllll(Illlll(-1834188607, var4 ^ -860593825), Illlll(-1834188608, var4 ^ -2051489082)))));
      IIllllIl var3 = this.IlIlll(var2, this.lIllI(var1, IlIIllIII.lI(IIllll(Illlll(-1834188601, var4 ^ -548695289), Illlll(-1834188602, var4 ^ 1146109129)))));
      this.IIIIIl(var3, var1.get(IlIIllIII.lI(IIllll(Illlll(-1834188603, var4 ^ -375305606), Illlll(-1834188604, var4 ^ -1134382953)))));
      this.lI.l();
      return this.IllIl(IlIIllIII.lI(IIllll(Illlll(-1834188581, var4 ^ -1198872348), Illlll(-1834188582, var4 ^ -1032284042))), this.IlIlIl(var3));
   }

   private String IllIll(IIllllIl<?> var1) {
      int var2 = 1408197635;

      try {
         if (var1 instanceof lllIIlII) {
            return IlIIllIII.lI(IIllll(Illlll(-1834188583, var2 ^ -797518386), Illlll(-1834188584, var2 ^ -232181508)));
         }
      } catch (IllegalStateException var7) {
         throw llII(var7);
      }

      try {
         if (var1 instanceof IIlIII) {
            return IlIIllIII.lI(IIllll(Illlll(-1834188577, var2 ^ -872292701), Illlll(-1834188578, var2 ^ -1449056448)));
         }
      } catch (IllegalStateException var12) {
         throw llII(var12);
      }

      try {
         if (var1 instanceof lIlllIl) {
            return IlIIllIII.lI(IIllll(Illlll(-1834188579, var2 ^ -1814945330), Illlll(-1834188580, var2 ^ -2049826613)));
         }
      } catch (IllegalStateException var6) {
         throw llII(var6);
      }

      try {
         if (var1 instanceof IllIII) {
            return IlIIllIII.lI(IIllll(Illlll(-1834188589, var2 ^ -1063273191), Illlll(-1834188590, var2 ^ -1222378272)));
         }
      } catch (IllegalStateException var11) {
         throw llII(var11);
      }

      try {
         if (var1 instanceof lIIIIIlI) {
            return IlIIllIII.lI(IIllll(Illlll(-1834188591, var2 ^ 759024083), Illlll(-1834188592, var2 ^ 1870644902)));
         }
      } catch (IllegalStateException var5) {
         throw llII(var5);
      }

      try {
         if (var1 instanceof lIllIlII) {
            return IlIIllIII.lI(IIllll(Illlll(-1834188585, var2 ^ -2015888072), Illlll(-1834188586, var2 ^ -378654359)));
         }
      } catch (IllegalStateException var10) {
         throw llII(var10);
      }

      try {
         if (var1 instanceof IIIlIIlll) {
            return IlIIllIII.lI(IIllll(Illlll(-1834188587, var2 ^ 205879823), Illlll(-1834188588, var2 ^ -61116481)));
         }
      } catch (IllegalStateException var4) {
         throw llII(var4);
      }

      try {
         if (var1 instanceof lllIIllI) {
            return IlIIllIII.lI(IIllll(Illlll(-1834188501, var2 ^ -2056496811), Illlll(-1834188502, var2 ^ -1299766957)));
         }
      } catch (IllegalStateException var9) {
         throw llII(var9);
      }

      try {
         if (var1 instanceof IllIlIl) {
            return IlIIllIII.lI(IIllll(Illlll(-1834188503, var2 ^ 575385237), Illlll(-1834188504, var2 ^ -509772500)));
         }
      } catch (IllegalStateException var3) {
         throw llII(var3);
      }

      try {
         if (var1 instanceof IlIllIII) {
            return IlIIllIII.lI(IIllll(Illlll(-1834188497, var2 ^ 88018385), Illlll(-1834188498, var2 ^ 973433063)));
         }
      } catch (IllegalStateException var8) {
         throw llII(var8);
      }

      return IlIIllIII.lI(IIllll(Illlll(-1834188499, var2 ^ 1480841150), Illlll(-1834188500, var2 ^ -228438007)));
   }

   Map<String, Object> IlllII(JsonObject var1) {
      return this.IlIlI(IlIIllIII.lI(IIllll(Illlll(-1834188509, 678847625 ^ -214218987), Illlll(-1834188510, 678847625 ^ 1858797566))), this::IllIlI);
   }

   Map<String, Object> IlllIl(JsonObject var1) {
      return this.IIlIll(this::IlIII);
   }

   private double l(JsonObject param1, String param2, double param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 34
      // 04: aload 1
      // 05: aload 2
      // 06: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 09: ifeq 34
      // 0c: goto 13
      // 0f: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: aload 1
      // 14: aload 2
      // 15: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 18: invokevirtual com/google/gson/JsonElement.isJsonNull ()Z
      // 1b: ifne 34
      // 1e: goto 25
      // 21: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: aload 1
      // 26: aload 2
      // 27: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 2a: invokevirtual com/google/gson/JsonElement.getAsDouble ()D
      // 2d: goto 35
      // 30: invokestatic k74/x/llIIlllI.llII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33: athrow
      // 34: dload 3
      // 35: dreturn
   }

   private Map IllllI(JsonObject var1) {
      int var3 = -1060477807;
      this.ll(IlIIllIII.lI(IIllll(Illlll(-1834188511, var3 ^ 2124937380), Illlll(-1834188512, var3 ^ -624930056))));
      boolean var2 = this.I
         .lIl(this.lIllI(var1, IlIIllIII.lI(IIllll(Illlll(-1834188505, var3 ^ -1104920957), Illlll(-1834188506, var3 ^ 1134205694)))), this.lI.II());

      try {
         if (!var2) {
            throw new IllegalStateException(IlIIllIII.lI(IIllll(Illlll(-1834188507, var3 ^ 538770572), Illlll(-1834188508, var3 ^ -661585375))));
         }
      } catch (IllegalStateException var4) {
         throw llII(var4);
      }

      this.lI.l();
      return this.lllI();
   }
}
