package k74.x;

import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient.Redirect;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1011;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_2561;
import net.minecraft.class_2583;
import net.minecraft.class_310;
import net.minecraft.class_5250;
import net.minecraft.class_640;
import net.minecraft.class_7417;
import net.minecraft.class_8828;

@Environment(EnvType.CLIENT)
public final class IIlllllII extends IlIIIIIIl {
   private final IllIII<IIllIl> II;
   private String Il;
   private static final HttpClient lI;
   private static final IIIlIlIl ll;
   private static final int III = 64;
   private String IIl;
   private final lllIIllI IlI;
   private static final IIIlIlIl Ill;
   private final IllIII<IIIlllI> lII;
   private final IllIII<lIlIIlIl> lIl;
   private static final int[] IlllI;
   private volatile Object llI;
   private final IllIII<III> lll;
   private volatile boolean IIII;
   private final lllIIlII IIIl;
   private final Map<String, CompletableFuture<Object>> IIlI;
   private final Map<UUID, Integer> IIll;
   private final IllIII<IIIlIIIl> IlII;
   private final IllIII<IIIIl> I;
   private long IlIl;
   private UUID IllI;
   private String Illl;
   private String lIII;
   private static final Object[] lIIII;
   private String lIIl;
   private final AtomicInteger lIlI;
   private Pattern lIll;
   private static final String[] Illll;
   private final IllIII<lIlIIIIl> llII;
   private final lllIIllI llIl;
   private static final String[] lllI;
   private final lllIIlII llll;
   private static final IIIlIlIl IIIII;
   private volatile Map<String, String> IIIIl;
   private static final String[] IIIlI;
   private volatile Pattern IIIll;
   private static final int IIlII = 512;
   private static final int IIlIl = 512;
   private static volatile IIlllllII IIllI;
   private String IIlll;
   private final IllIII<IIIIlIII> IlIII;
   private String IlIIl;
   private String IlIlI;
   private static final IIIlIlIl IlIll;
   private static final int IllII = 262144;
   private final Map<String, String> IllIl;

   private boolean I(class_2583 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 1a
      // 04: aload 1
      // 05: invokevirtual net/minecraft/class_2583.method_27708 ()Lnet/minecraft/class_11719;
      // 08: ifnull 1a
      // 0b: goto 12
      // 0e: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11: athrow
      // 12: bipush 1
      // 13: goto 1b
      // 16: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19: athrow
      // 1a: bipush 0
      // 1b: ireturn
   }

   private boolean II() {
      try {
         if (this.IlII.IllI() != IIIlIIIl.I) {
            return true;
         }
      } catch (IllegalArgumentException var1) {
         throw IlIIII(var1);
      }

      return false;
   }

   @Override
   public void IlIlI(class_1297 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: instanceof net/minecraft/class_1657
      // 04: ifeq 0f
      // 07: aload 1
      // 08: checkcast net/minecraft/class_1657
      // 0b: astore 2
      // 0c: goto 10
      // 0f: return
      // 10: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 13: astore 3
      // 14: aload 3
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnull 2a
      // 1b: aload 2
      // 1c: aload 3
      // 1d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 20: if_acmpne 2f
      // 23: goto 2a
      // 26: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29: athrow
      // 2a: return
      // 2b: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: aload 0
      // 30: aload 2
      // 31: invokevirtual net/minecraft/class_1657.method_5667 ()Ljava/util/UUID;
      // 34: putfield k74/x/IIlllllII.IllI Ljava/util/UUID;
      // 37: aload 0
      // 38: aload 2
      // 39: invokevirtual net/minecraft/class_1657.method_7334 ()Lcom/mojang/authlib/GameProfile;
      // 3c: invokestatic k74/x/lIlIIIll.Ill (Lcom/mojang/authlib/GameProfile;)Ljava/lang/String;
      // 3f: putfield k74/x/IIlllllII.lIIl Ljava/lang/String;
      // 42: aload 0
      // 43: getfield k74/x/IIlllllII.IlIII Lk74/x/IllIII;
      // 46: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 49: getstatic k74/x/IIIIlIII.lI Lk74/x/IIIIlIII;
      // 4c: if_acmpne 72
      // 4f: aload 0
      // 50: getfield k74/x/IIlllllII.I Lk74/x/IllIII;
      // 53: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 56: getstatic k74/x/IIIIl.II Lk74/x/IIIIl;
      // 59: if_acmpne 72
      // 5c: goto 63
      // 5f: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: aload 0
      // 65: getfield k74/x/IIlllllII.lIIl Ljava/lang/String;
      // 68: putfield k74/x/IIlllllII.IlIIl Ljava/lang/String;
      // 6b: goto 72
      // 6e: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 71: athrow
      // 72: return
   }

   private static int Il(int var0, int var1) {
      return Math.max(var1, var0);
   }

   private Object lI(Object var1) {
      return var1 instanceof Optional var3 ? var3.orElse(null) : var1;
   }

   private String ll() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/IIlllllII.IlIII Lk74/x/IllIII;
      // 04: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 07: getstatic k74/x/IIIIlIII.II Lk74/x/IIIIlIII;
      // 0a: if_acmpeq 16
      // 0d: aload 0
      // 0e: invokevirtual k74/x/IIlllllII.IIlIIl ()Ljava/lang/String;
      // 11: areturn
      // 12: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 19: astore 1
      // 1a: aload 1
      // 1b: ifnull 2c
      // 1e: aload 1
      // 1f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 22: ifnonnull 49
      // 25: goto 2c
      // 28: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b: athrow
      // 2c: aload 0
      // 2d: invokevirtual k74/x/IIlllllII.IIlIIl ()Ljava/lang/String;
      // 30: astore 2
      // 31: new java/lang/StringBuilder
      // 34: dup
      // 35: invokespecial java/lang/StringBuilder.<init> ()V
      // 38: aload 2
      // 39: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 3c: ldc "1"
      // 3e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 41: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 44: areturn
      // 45: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 48: athrow
      // 49: aload 0
      // 4a: aload 1
      // 4b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 4e: invokevirtual net/minecraft/class_746.method_7334 ()Lcom/mojang/authlib/GameProfile;
      // 51: invokevirtual k74/x/IIlllllII.lIIIl (Lcom/mojang/authlib/GameProfile;)Ljava/lang/String;
      // 54: areturn
   }

   private Object III(Optional var1) {
      return this.lI(var1);
   }

   private UUID IIl(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc -7214782
      // 002: istore 13
      // 004: aload 1
      // 005: ifnull 020
      // 008: aload 1
      // 009: invokevirtual java/lang/String.length ()I
      // 00c: ldc 1674634076
      // 00e: iload 13
      // 010: ldc -162563929
      // 012: ixor
      // 013: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 016: if_icmpeq 026
      // 019: goto 020
      // 01c: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01f: athrow
      // 020: aconst_null
      // 021: areturn
      // 022: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 025: athrow
      // 026: aload 1
      // 027: bipush 0
      // 028: ldc 1674634077
      // 02a: iload 13
      // 02c: ldc -216669115
      // 02e: ixor
      // 02f: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 032: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 035: ldc 1674634078
      // 037: iload 13
      // 039: ldc -2017965686
      // 03b: ixor
      // 03c: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 03f: ldc 1674634079
      // 041: iload 13
      // 043: ldc 434832526
      // 045: ixor
      // 046: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 049: invokestatic k74/x/IIlllllII.IIllI (II)Ljava/lang/String;
      // 04c: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 04f: aload 1
      // 050: ldc 1674634072
      // 052: iload 13
      // 054: ldc 1530032688
      // 056: ixor
      // 057: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 05a: ldc_w 1674634073
      // 05d: iload 13
      // 05f: ldc_w -775907896
      // 062: ixor
      // 063: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 066: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 069: ldc_w 1674634074
      // 06c: iload 13
      // 06e: ldc_w 614480464
      // 071: ixor
      // 072: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 075: ldc_w 1674634075
      // 078: iload 13
      // 07a: ldc_w 1676966868
      // 07d: ixor
      // 07e: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 081: invokestatic k74/x/IIlllllII.IIllI (II)Ljava/lang/String;
      // 084: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 087: aload 1
      // 088: ldc_w 1674634068
      // 08b: iload 13
      // 08d: ldc_w -1011177851
      // 090: ixor
      // 091: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 094: ldc_w 1674634069
      // 097: iload 13
      // 099: ldc_w 1559113284
      // 09c: ixor
      // 09d: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 0a0: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0a3: ldc_w 1674634070
      // 0a6: iload 13
      // 0a8: ldc_w 1613866739
      // 0ab: ixor
      // 0ac: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 0af: ldc_w 1674634071
      // 0b2: iload 13
      // 0b4: ldc_w -1179634169
      // 0b7: ixor
      // 0b8: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 0bb: invokestatic k74/x/IIlllllII.IIllI (II)Ljava/lang/String;
      // 0be: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0c1: aload 1
      // 0c2: ldc_w 1674634064
      // 0c5: iload 13
      // 0c7: ldc_w -2031873137
      // 0ca: ixor
      // 0cb: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 0ce: ldc_w 1674634065
      // 0d1: iload 13
      // 0d3: ldc_w 2068855784
      // 0d6: ixor
      // 0d7: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 0da: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0dd: ldc_w 1674634066
      // 0e0: iload 13
      // 0e2: ldc_w 1935867653
      // 0e5: ixor
      // 0e6: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 0e9: ldc_w 1674634067
      // 0ec: iload 13
      // 0ee: ldc_w 881475024
      // 0f1: ixor
      // 0f2: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 0f5: invokestatic k74/x/IIlllllII.IIllI (II)Ljava/lang/String;
      // 0f8: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0fb: aload 1
      // 0fc: ldc_w 1674634060
      // 0ff: iload 13
      // 101: ldc_w 1419846782
      // 104: ixor
      // 105: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 108: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 10b: astore 12
      // 10d: astore 11
      // 10f: astore 10
      // 111: astore 9
      // 113: astore 8
      // 115: astore 7
      // 117: astore 6
      // 119: astore 5
      // 11b: astore 4
      // 11d: new java/lang/StringBuilder
      // 120: dup
      // 121: invokespecial java/lang/StringBuilder.<init> ()V
      // 124: aload 4
      // 126: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 129: aload 5
      // 12b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 12e: aload 6
      // 130: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 133: aload 7
      // 135: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 138: aload 8
      // 13a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 13d: aload 9
      // 13f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 142: aload 10
      // 144: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 147: aload 11
      // 149: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 14c: aload 12
      // 14e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 151: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 154: astore 2
      // 155: aload 2
      // 156: invokestatic java/util/UUID.fromString (Ljava/lang/String;)Ljava/util/UUID;
      // 159: areturn
      // 15a: astore 3
      // 15b: aconst_null
      // 15c: areturn
   }

   private CompletionStage Ill(GameProfile var1) {
      try {
         if (var1 == null) {
            return CompletableFuture.completedFuture(null);
         }
      } catch (IllegalArgumentException var2) {
         throw IlIIII(var2);
      }

      return this.IIIIl(var1);
   }

   private Iterable<class_1657> lII(class_310 var1) {
      ArrayList var2 = new ArrayList();

      for (class_1297 var4 : var1.field_1687.method_18112()) {
         if (var4 instanceof class_1657 var5) {
            var2.add(var5);
         }
      }

      return var2;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = 472820975;
      int var8 = "̽굮\ued8f뇊햁녆픶궵▱딻ꔞ\ua7ce䖏맊춅낦紷ꭵ▱똛\ue51e냮薌꠪\uf587댆ᴴ롵ֳ뭛괞ꈎ붎밪嶇딆씲ꃵᶵ괛锚꿮춏븪㖁뚦봱뎵▷꒻\udd1bꞎ喍럪ඇ띆ഷ벵営낛洛ꅮ鶏뇊䖁뤆蔷ꪵ嶳넻贝ꍮﶋ듊\ued81ꮦ씲묕喲뉻ങꂮ㶉뾊\udd83\ua7e6崰몕떴뛻\udd18낮ᖌ띊\udd86ꎆ贷꠵▷룛씜뤎綋놪趃냦\ue532륕趲ꞻ\uf51f붎\udd89ꘊ\ued83륆蔰뱕햳낻ꔛ뿮㶎꣪㶀뙆䔶꧕営빛䴛ꐎ㖋\ua7ea햂벆䴴ꀕ▲멛픙몎斉ꌪ㖆띆崷ꅵ얳뙛딘둎㖏ꌊ趄ꩦ贳둕ֳꟻ唛됮㶉ꆪ閅냦紲ꍵ\uf5b6렻洘냮얎뼪涄ꨆ괶똕△ꨛ㔚둮䶎뺊綇뽆攵먵\uedb7ꪛⴝꩮ얊ꋊ喇뱦씰붕ֳ멻ട떮했겪㶀ꢦ申맵䖴ꆻ\ue51c곎薍ꟊ\uf580닆蔲깵얰ꣻ괘룮ﶏꡊ떁꽦Ա뼕疳ꋻ\ued1bꅎ붏ꉊ趀뤆鴰렕\uddb5빛洞걮떈깊붇뜆봱ꇕ鶰딻괜뼎궈낊\u0d84띦따轕\ue5b9荻䴕膮疆輪֎饦锹膕▿霻贑菎ք鑊붊豦䴸駕鶼講┐鵎閄銪綈赆ᔿ轕궾蛻┑誮떇饪ඉ鹦䔸麵\ue5b9鵛蔔鎎㖃閊֏躆费靕疺靛锐赎綇蟊疍覦씽陵ָ頛崖龮ᖅ靪鶈肦䴸衵涹鹻紗鳮綅腊ⶍ鈦活貕涸銛ⴐ谎떃鮪㶍视촺鱕薸鳻픒骎얁馊\ued8e趆甾苵斾騻\udd13聎㶆譪붎鵆┻衕궺镛蔖鶮㶃腪\udd89鸆\udd38鸕綽虻㔖驮鶀肪֏蚆ꔻ鎕喻霻ԕ訮閄踊綏鐆䔺襕鶽葛\ued10芮薃鞪喌荆洺鑕疼须洗龎喁顊ᖏ貦ᔾ鰕於霛洐鼮\udd83饪█聦紻蚕\uddbd髛Ԑ鬎\ue586顪උ豦贽饕綽麻딐蜎ඁ魪㖌谦괼赵嶾鳻봑莮疀鼪ﶊ錆䔿鰕언葻┑臮▀襪鶉跆紿菕喼闛봓蠎අ輪疍薆ꔺ馵閽騛┗蜎嶇諊ﶌ齦씹霵ﶽ蝻촐誎\ued81韊춈踦┻谕ꖻ賛ᔓ陮ⶇ蔊䖍躦唿诵㖸螻ᴐ迎薂תּ붑\ueba6Ԧ\ue435떠\uee9b䔌﵎ඛ\uf02a추\uf806ԥ\uf6f5䖢｛ഌ\ue52e궞\ue7ca▕\ue006\ue520\uf1f5斦\ufb1bഌ\uebae떘\ue18a閕\uf046ﴣ\ue8f5閠\uf21b㔈ￎ\ued9a\ue4ea붓\ue1e6ﴥ\ue8f5\uf5a3碌㴏\ue58e閟\ue52a㖕\ue406甥\ufe75춣\ue1db┋ﱎ▝\ueeea閒\ued06崦\uf8d5㖦\uee3b초\uf04e춞\ue9aaᖕ\ue746픡\ueef5춡\uf15b플\uf72eᶝ\ue96a햓\uece6픦\ue535鶦\ufb1b봈\uf0ce斜\ueaea嶖\uf4e6鴤\uf0b5閤\ue15bᴉ\uf4ce궜\uf8ca涓\uf606素\uf755떤\ue8db\uf509︮喟\ue62a\uf590ｦ攦\ue3d5ඥ瀞崌\ue76e햝\ue24a֔\uec86紣\uf155ᶢﯛ딈郞ඟ\ue4aa薐\ue7a6ⴣｕ閠\uf31b초\ue50e떞ﵪ떗ﭦ䔦\uf415ꖥ\ueb5b䴊ﰮᖜ頻䖓﹦蔠\uf135涤ﶛ納类춝\uf60a\ufd91\uf8e6蔧\ue895趢\uef5b\ue50d\uf0ee햝\ued8a㖕\ue206鴠\uebb5ꖧ糧ꔈ\ue68eᖝ\ue6eaⶕ\ue466㴤\uf8f5֤\uf73b蔋︮䖛\ufdeaᶗ\uf1a6䔠\uead5趣\uf47b崍\uf46e\u2d9a\ued2a▗ﻦണ\uf055붦\uf7bb㔌\uf84e\u0d98\ue10aඐ\ue266攣\ueb15㖢\uf61b洋\uf1ce趜\ueaca░\ue766産\ufdd5ᶤ\uf05b괎\ue08e궞\uf8ea閕\ue9e6┠ﭕ薡\uf4fb䴉\ue12eꖝ\uecea░牢紧\uecd5喣\ue55b蔍\ue5aeﶞ\ue56a궐\ueda6ഡ\uee75喥픻贂춎趗쥊䖜썦ഫ엕薩툻ꔄ쩎閒잪ᖘ숦锯쇵▯졛鴆쪮֔쾪떜ퟦ\u2d2f젵涬쇻㴀쿎\udd96츪ꖝ\uda46ꔩ픕ﶬ잛\ue505\uddee䶕킊嶙\udc86甬윕\uf5ae헻ആퟮ鶗쮊ᶛ셦紨숕趩셻%脜\uf105酸䄈荴톿龧ꄹ蜉㦗騜\ud902颸꤉鑴憼鹇\u193f齉覐顜㤂謘䤉苴禼觧夽骩㆔跼ℇ釸뤈裴妸詧"
         .length();
      short var12 = 26362;
      int var11 = 0;
      int var10 = 0;
      String[] var9 = new String[2];
      String var7 = "̽굮\ued8f뇊햁녆픶궵▱딻ꔞ\ua7ce䖏맊춅낦紷ꭵ▱똛\ue51e냮薌꠪\uf587댆ᴴ롵ֳ뭛괞ꈎ붎밪嶇딆씲ꃵᶵ괛锚꿮춏븪㖁뚦봱뎵▷꒻\udd1bꞎ喍럪ඇ띆ഷ벵営낛洛ꅮ鶏뇊䖁뤆蔷ꪵ嶳넻贝ꍮﶋ듊\ued81ꮦ씲묕喲뉻ങꂮ㶉뾊\udd83\ua7e6崰몕떴뛻\udd18낮ᖌ띊\udd86ꎆ贷꠵▷룛씜뤎綋놪趃냦\ue532륕趲ꞻ\uf51f붎\udd89ꘊ\ued83륆蔰뱕햳낻ꔛ뿮㶎꣪㶀뙆䔶꧕営빛䴛ꐎ㖋\ua7ea햂벆䴴ꀕ▲멛픙몎斉ꌪ㖆띆崷ꅵ얳뙛딘둎㖏ꌊ趄ꩦ贳둕ֳꟻ唛됮㶉ꆪ閅냦紲ꍵ\uf5b6렻洘냮얎뼪涄ꨆ괶똕△ꨛ㔚둮䶎뺊綇뽆攵먵\uedb7ꪛⴝꩮ얊ꋊ喇뱦씰붕ֳ멻ട떮했겪㶀ꢦ申맵䖴ꆻ\ue51c곎薍ꟊ\uf580닆蔲깵얰ꣻ괘룮ﶏꡊ떁꽦Ա뼕疳ꋻ\ued1bꅎ붏ꉊ趀뤆鴰렕\uddb5빛洞걮떈깊붇뜆봱ꇕ鶰딻괜뼎궈낊\u0d84띦따轕\ue5b9荻䴕膮疆輪֎饦锹膕▿霻贑菎ք鑊붊豦䴸駕鶼講┐鵎閄銪綈赆ᔿ轕궾蛻┑誮떇饪ඉ鹦䔸麵\ue5b9鵛蔔鎎㖃閊֏躆费靕疺靛锐赎綇蟊疍覦씽陵ָ頛崖龮ᖅ靪鶈肦䴸衵涹鹻紗鳮綅腊ⶍ鈦活貕涸銛ⴐ谎떃鮪㶍视촺鱕薸鳻픒骎얁馊\ued8e趆甾苵斾騻\udd13聎㶆譪붎鵆┻衕궺镛蔖鶮㶃腪\udd89鸆\udd38鸕綽虻㔖驮鶀肪֏蚆ꔻ鎕喻霻ԕ訮閄踊綏鐆䔺襕鶽葛\ued10芮薃鞪喌荆洺鑕疼须洗龎喁顊ᖏ貦ᔾ鰕於霛洐鼮\udd83饪█聦紻蚕\uddbd髛Ԑ鬎\ue586顪උ豦贽饕綽麻딐蜎ඁ魪㖌谦괼赵嶾鳻봑莮疀鼪ﶊ錆䔿鰕언葻┑臮▀襪鶉跆紿菕喼闛봓蠎අ輪疍薆ꔺ馵閽騛┗蜎嶇諊ﶌ齦씹霵ﶽ蝻촐誎\ued81韊춈踦┻谕ꖻ賛ᔓ陮ⶇ蔊䖍躦唿诵㖸螻ᴐ迎薂תּ붑\ueba6Ԧ\ue435떠\uee9b䔌﵎ඛ\uf02a추\uf806ԥ\uf6f5䖢｛ഌ\ue52e궞\ue7ca▕\ue006\ue520\uf1f5斦\ufb1bഌ\uebae떘\ue18a閕\uf046ﴣ\ue8f5閠\uf21b㔈ￎ\ued9a\ue4ea붓\ue1e6ﴥ\ue8f5\uf5a3碌㴏\ue58e閟\ue52a㖕\ue406甥\ufe75춣\ue1db┋ﱎ▝\ueeea閒\ued06崦\uf8d5㖦\uee3b초\uf04e춞\ue9aaᖕ\ue746픡\ueef5춡\uf15b플\uf72eᶝ\ue96a햓\uece6픦\ue535鶦\ufb1b봈\uf0ce斜\ueaea嶖\uf4e6鴤\uf0b5閤\ue15bᴉ\uf4ce궜\uf8ca涓\uf606素\uf755떤\ue8db\uf509︮喟\ue62a\uf590ｦ攦\ue3d5ඥ瀞崌\ue76e햝\ue24a֔\uec86紣\uf155ᶢﯛ딈郞ඟ\ue4aa薐\ue7a6ⴣｕ閠\uf31b초\ue50e떞ﵪ떗ﭦ䔦\uf415ꖥ\ueb5b䴊ﰮᖜ頻䖓﹦蔠\uf135涤ﶛ納类춝\uf60a\ufd91\uf8e6蔧\ue895趢\uef5b\ue50d\uf0ee햝\ued8a㖕\ue206鴠\uebb5ꖧ糧ꔈ\ue68eᖝ\ue6eaⶕ\ue466㴤\uf8f5֤\uf73b蔋︮䖛\ufdeaᶗ\uf1a6䔠\uead5趣\uf47b崍\uf46e\u2d9a\ued2a▗ﻦണ\uf055붦\uf7bb㔌\uf84e\u0d98\ue10aඐ\ue266攣\ueb15㖢\uf61b洋\uf1ce趜\ueaca░\ue766産\ufdd5ᶤ\uf05b괎\ue08e궞\uf8ea閕\ue9e6┠ﭕ薡\uf4fb䴉\ue12eꖝ\uecea░牢紧\uecd5喣\ue55b蔍\ue5aeﶞ\ue56a궐\ueda6ഡ\uee75喥픻贂춎趗쥊䖜썦ഫ엕薩툻ꔄ쩎閒잪ᖘ숦锯쇵▯졛鴆쪮֔쾪떜ퟦ\u2d2f젵涬쇻㴀쿎\udd96츪ꖝ\uda46ꔩ픕ﶬ잛\ue505\uddee䶕킊嶙\udc86甬윕\uf5ae헻ആퟮ鶗쮊ᶛ셦紨숕趩셻%脜\uf105酸䄈荴톿龧ꄹ蜉㦗騜\ud902颸꤉鑴憼鹇\u193f齉覐顜㤂謘䤉苴禼觧夽骩㆔跼ℇ釸뤈裴妸詧";

      do {
         char var13 = var7.charAt(var11);
         String var10000 = var7.substring(var11 + 1, var11 + 1 + var13);
         int var15 = 0;
         char[] var14 = var10000.toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 5) {
               default -> 217;
               case 1 -> 98;
               case 2 -> 93;
               case 3 -> 108;
               case 4 -> 241;
            }) ^ var16;
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 5 | var16 << 11) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 5 | var16 >>> 11) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      Illll = var9;
      lIIII = new Object[var9.length];
      int var22 = 0;
      IlllI = new int[394];
      int var10001 = 0;
      byte[] var10002 = "?ëRÖ:±Î\rN\u001c ³ÐNÌÃ\u0092\u0096X}\u0018d¿\u0088í\u0004SmªQ³\u009d\n\u001e\u008cÈ\u0095J\u0004\f©\u0095ÏÂp\u0015þBO@9Â²ô\u0011\u0098ºÆ\u00960ý/õ\u0091\u009d\u0005\u000e\u0013aÏµpü\u0016\u0083%òkçEY\f\u000bû¡\u0011xÛ?û\u0081Î\u0006Eq³\u0092Ìº§N\u009e¡¾\u001ea)\u008cÕ\u0015f\u0002ÐÃ*¶%\n\rì\u0080õã\u0012´²`\u007fã\u000e\u0087H\u009cidÜZî{\u0082áJ&\u009d<k'\u0099¢Y\u000b\u0081\u0000G\u008d\u0095\u001fQB\u008d`ª\u0089Æ¼\u00ad\u0097±·º\u007fÙ\u0017{ð¦p£áÄetùUµ\u008cF\u008d¹*¼hÕÎ¥¡Ý,j@·ño\u0006ö±\u0006ÌG[\u0082¡\bË|K\u0011¢ds\u000f\u000b\u0088Q\u000f\u0015iÊYS+\u0080úN¸|\u000er\rçW7*´£¡óBKú\u009b²\u0018\u0013¨_Í\u001a\u008f&ÔÈ-ã7yæC¿¿¯\u001c\r\u0086\\à¶\u0016¾\u0016ù\u0093Ü\u0085/Lk :\u009b\u008ayÅ\u0094\u0095¨¬ÕÓ¿êQ\u009fæZØ\u0099\u0085yØxzÐËÄ-&s¯7H^\bH¦\u001dÚ\n¨\u0095\u0082ÒkÜ\u009c\u001aN´\u008b¢\u001eSSÏ,Í\u001e\u009cùg_Ïäö:\u009e\t\u001f>ÁÞ\u0017\u0017Ð\u009aí\tÂ_#MÁ0\u0083Q\u001c§ÁFûÝ`T\u0015½å·üG\u008b'^\u0087Ò\u00071ñ\u0087\u009c\u0097gêï\u001fð}\u0090\u008f÷\u0015'R\u009aÀK2ßÏ\u0098\nW\u001fÐä\u00800\u009aB\u0003ë9X Ì°\u0011áØ\u0006^æÆ\u0006\u0089 O\u001fGÜ²\fË;f_Öé\u0001Ö\\\t%í$Ë\u001b-êL'Ã'\u009e\u0005\u0087åuÓ»îÇûè¾QM*\u0098å%ìo|Å\u00999@u\u008cÅäG?9>\u0018©®E¹M0´Ðc8G'ù9l· é)zI¸FeÚGm7\u0088\u008dZ§³\\8\u009f\u0099\u0092J\u009cLcRH\u0019\u007fä\u0096±¿¥Ë¯£àtÍÝ\u00adT\bÑ7Jö\u0096lNò\u009e\u0012ÍÁ\u0003²ÁÞþ?\u0097\u0092ÜÁºð°Øq\u0083¾xÐ(òÇì%(ó5@!\u009b\u0093\u00ad7\u008dêù-\u0007í\u009dÊ\bßÒ¥ÖÐ½\u001d\u0006=ËÊ=/\u0016®Õú\u0000\u0015²ÿ4Äó1OÐ¬+º\u008dxmR5¤ÑT½rà!\u0089 \nW¹Å<n§\u0098<\u0010ÚÉÊùìD;ìt\u0086 [\u008e\u0097Ï\u0088\u0095({\u0018RF\u0018t\u001dæÑÞøß\u0005ÀOîZH©8,à\fè\u0007\u0090¬úÕ\u0098Ø\u007fÎ\u0019`·ÚªnýÞlÔ\u008cÆ%Ø\u0012W\u0083ÆËê\u0007n\u008eé§8¸AA\u009ep:Äp×ÚµYÉó q\u0088\u0088Uh\u0011(éb\u009d\u0016è\u000fÓù\u007fOÚ\u0007\r\u0084ñ[\u0088\u0097wtÑÝ\u008aw¸í\u009aL\u0088t¶F>\u0007\u0086/Üuípyi×Î\u0081ÙÏ¤h~Äâ\b®%6+&Ë13É^\u009f\u001d\u0016U6\u0016\u0014\u001eg¸ô#¹W\u008a\u0084$\u0097²ch\u009fÎÚ\u008em\u009c¨z\u0002£<\u00ad¬àÏð!fÞñ\r,jrJù\u000b²®H@è²RÊ\u0012\u0091Ù!Õ\tizÍËD\u0014¢\u009b|\u0005AÀÌ\u0000õ\u0097¶MÆ£è6$\u0014¥)\u0005?hhø\b\u0082\u0011\u0095Uß\u0005ö\u008bì]h\u0094Þ^\u0081\u0096ël\u0096ÊQ\u001dÈlVã0\u0017\u000bp(a/g\r:a7\nÔ+\u0098õÌ\u0084t\u0092»NBÀ\u0012\\º\u0087n\u0015Íª\u001cÍ't\u0002\u001dp+\u008a\u0016âaá\u0012´ÛXb®èÿ-Â¢ÊP¬wwÓ\u0019\u001eÇ<ñ`/R\u000b\u0096çÕÚ\u0090Û¦1F:t\u0097\u0091¿\u0018\u008d\u0014õ\u0085\u000fÝÄ\\icú¢â$Å\u008f\u001b$i¡M=¤\u008c6Ó\u0014\u0094\u001a\u0098\u000fÉm6ÕÞ¸Êm³\u000e\u0083%ÿ;\u009bÎÅlDnI\u00ad\t¿\u0004¬}\u0092ÎÛxA\u0017T\u00adËù[¿Çæ$ÚÏ/÷{\u0013R°Bm½\u0019åE\u0088\u0091?¡\n\u0013çëßÍ,r.\u0013I&Í\u0096\u009aéQ´O/ê2\u0092Î\u0016T\b{\u000e}\u0098¯*wß BÞ«Vºü\u0082\u0002\u0003VY·õÚ\u000exªD¹\bÆå%\u0087\u0080¤Ð³)öÁâOØºÎ\u007fYÍ\u001fIã¦|ðéa\r<(ì,\u009cÚ\u0097\u0017âÒ\u0017æ\u001bû\u0007t\u0082\u0092\u0092\u00adóÂrÿ\u0019\u001b\u009c'bê|\u009f9Ú>\u008e\u009bâ\u0018îÇ\u008d\u0081bÚóºÈÊÔ~¸_\u008arÓ&\u0002ø\u009dÓb\u008f>\u0086Â\u000eÉ\fÌBç¥\u0015¨®ûsZ\u0089Ü¹?Yïe\u0082\u0001\u0015Û\u00163\u0000`\u0006\u0089\u0083NéçæR\u0005t\u0012l\u008dTÊ\ré\u0016¢\ru\u001fbÆuÂ<þÍ\u0007\u0086\u0006±õþM¦û?Ü\u0018¦Ú\u001dÉ#p\u008f%ü\u009eÏÖRQHO¥#ÁBfeÔ\u0090è\u0003t#:^8¿I|~Î\"(F\f-\u0096Þ\"\u0002\u0017#9\u001c%å\u0087\u001e\u0016`YÔFR}«Ëµêä%âÛÀ«x\u008fx[ó\u0003\u0003Ã¬\u000f%\u009cÑ?î\u0004\u000f\u0014Õ8«¨uÚ\u0096\u009f¶\u0002\fSQ \u0006è\u0085æQôë¬\u008a\u0007%\u0000n\u0083ô\u001cèÅ@]\u0082\u008fØ\\6¼Ój\u00adG3ì«;>\u009dd\u001ce\u0016ôò¤;]+\u0091ã¡b?\u001di¹MÉì\u008dÊj>m\u0082\u0089zÓN\u000f¶\u008e\u0093\u0092¢z\u008fôá?UZfý*\u009b\u0010ßÍ¾/\u0003|pxìywù:\u0014N\u0005èå\u000e\u0001\"\u0011ô£Í\u009a>7U£oJðõá"
         .getBytes("ISO-8859-1");

      int var55;
      do {
         IlllI[var22] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ -1441017474;
         var22 += 1;
         var55 = var10001 + 4;
         var10001 += 4;
      } while (var55 < var10002.length);

      String[] var5 = new String[IllllI(1674634111, var17 ^ -883865290)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = Illlll(472517404, (short)14969, -481405218)).length();
      int var1 = 4;
      int var19 = -1;

      label97:
      while (true) {
         var22 = IllllI(1674634104, var17 ^ 376459711);
         String var27 = var2.substring(++var19, var19 + var1);
         byte var39 = -1;

         while (true) {
            label92: {
               char[] var57 = var27.toCharArray();
               int var69 = var57.length;
               int var6 = 0;
               var55 = var22;
               var44 = var57;
               var10001 = var69;
               char[] var81;
               int var88;
               if (var69 <= 1) {
                  var81 = var57;
                  var69 = var22;
                  var88 = var6;
               } else {
                  var55 = var22;
                  var10001 = var69;
                  if (var69 <= var6) {
                     break label92;
                  }

                  var81 = var57;
                  var69 = var22;
                  var88 = var6;
               }

               while (true) {
                  var81[var88] = (char)(var81[var88] ^ var69 ^ switch (var6 % IllllI(1674634100, var17 ^ 1253172815)) {
                     case 0 -> IllllI(1674634101, var17 ^ -1766393748);
                     case 1 -> IllllI(1674634102, var17 ^ -1650390545);
                     case 2 -> IllllI(1674634103, var17 ^ 1029742430);
                     case 3 -> IllllI(1674634096, var17 ^ 1522046929);
                     case 4 -> IllllI(1674634097, var17 ^ 1332711260);
                     case 5 -> IllllI(1674634098, var17 ^ -1617483421);
                     default -> IllllI(1674634099, var17 ^ -1825453477);
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
                     lllI = var5;
                     IIIlI = new String[IllllI(1674634107, var17 ^ 894053666)];
                     Ill = IlIIllIII.Ill(IIllI(IllllI(1674634092, var17 ^ -2875405), IllllI(1674634093, var17 ^ -147372157)));
                     IlIll = IlIIllIII.Ill(IIllI(IllllI(1674634094, var17 ^ -1645591655), IllllI(1674634095, var17 ^ -592807381)));
                     IIIII = IlIIllIII.Ill(IIllI(IllllI(1674634088, var17 ^ 1832955425), IllllI(1674634089, var17 ^ 584056936)));
                     ll = IlIIllIII.Ill(IIllI(IllllI(1674634090, var17 ^ 1001998373), IllllI(1674634091, var17 ^ 621911338)));
                     lI = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(5L)).followRedirects(Redirect.NORMAL).build();
                     return;
                  }

                  var1 = var2.charAt(var19);
                  break;
               default:
                  var5[var3++] = var62;
                  if ((var19 += var1) < var4) {
                     var1 = var2.charAt(var19);
                     continue label97;
                  }

                  var4 = (var2 = Illlll(472517405, (short)-23088, -1918216141)).length();
                  var1 = IllllI(1674634105, var17 ^ -2008914828);
                  var19 = -1;
            }

            var22 = IllllI(1674634106, var17 ^ 710730324);
            var27 = var2.substring(++var19, var19 + var1);
            var39 = 0;
         }
      }
   }

   private boolean lIl(class_1011 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnonnull 0a
      // 04: bipush 0
      // 05: ireturn
      // 06: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09: athrow
      // 0a: aload 1
      // 0b: invokevirtual net/minecraft/class_1011.method_4307 ()I
      // 0e: istore 2
      // 0f: aload 1
      // 10: invokevirtual net/minecraft/class_1011.method_4323 ()I
      // 13: istore 3
      // 14: iload 2
      // 15: ldc_w 1674634061
      // 18: ldc_w 2075373185
      // 1b: ldc_w 743037171
      // 1e: ixor
      // 1f: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 22: if_icmpne 5d
      // 25: iload 3
      // 26: ldc_w 1674634062
      // 29: ldc_w 2075373185
      // 2c: ldc_w -1315901819
      // 2f: ixor
      // 30: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 33: if_icmpeq 55
      // 36: goto 3d
      // 39: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c: athrow
      // 3d: iload 3
      // 3e: ldc_w 1674634063
      // 41: ldc_w 2075373185
      // 44: ldc_w -1074951484
      // 47: ixor
      // 48: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 4b: if_icmpne 5d
      // 4e: goto 55
      // 51: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 54: athrow
      // 55: bipush 1
      // 56: goto 5e
      // 59: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5c: athrow
      // 5d: bipush 0
      // 5e: ireturn
   }

   private static int llI(Illl var0, Illl var1) {
      return Integer.compare(var1.I().length(), var0.I().length());
   }

   public Object lll(GameProfile param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual k74/x/IIlllllII.IIIIlIl ()Z
      // 04: ifeq 29
      // 07: aload 0
      // 08: getfield k74/x/IIlllllII.IIIl Lk74/x/lllIIlII;
      // 0b: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 0e: checkcast java/lang/Boolean
      // 11: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 14: ifeq 29
      // 17: goto 1e
      // 1a: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: aload 1
      // 1f: ifnonnull 2f
      // 22: goto 29
      // 25: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28: athrow
      // 29: aconst_null
      // 2a: areturn
      // 2b: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: aload 0
      // 30: aload 1
      // 31: invokevirtual k74/x/IIlllllII.lllI (Lcom/mojang/authlib/GameProfile;)Z
      // 34: ifeq 42
      // 37: aload 0
      // 38: getfield k74/x/IIlllllII.llI Ljava/lang/Object;
      // 3b: goto 43
      // 3e: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41: athrow
      // 42: aconst_null
      // 43: areturn
   }

   private CompletableFuture<GameProfile> IIII(String var1) {
      String var2 = URLEncoder.encode(var1, StandardCharsets.UTF_8);
      String var4 = Ill.llIl();
      HttpRequest var3 = HttpRequest.newBuilder(URI.create(var4 + var2)).timeout(Duration.ofSeconds(5L)).header(IIIII.llIl(), ll.llIl()).GET().build();
      return lI.sendAsync(var3, BodyHandlers.ofString()).thenApply(this::IIllIl).exceptionally(IIlllllII::lIlll);
   }

   public static void IIIl() {
      IIllI = null;
   }

   private boolean IIlI() {
      try {
         if (this.IlIII.IllI() != IIIIlIII.II) {
            return true;
         }
      } catch (IllegalArgumentException var1) {
         throw IlIIII(var1);
      }

      return false;
   }

   private String IIll(String var1, Pattern var2, Map<String, String> var3) {
      Matcher var4 = var2.matcher(var1);
      StringBuffer var5 = null;

      while (var4.find()) {
         String var6 = (String)var3.get(
            var4.group(IlIIllIII.lI(IIllI(IllllI(1674634056, -46990797 ^ -1844743768), IllllI(1674634057, -46990797 ^ 1779926368))))
         );

         try {
            if (var6 == null) {
               continue;
            }
         } catch (IllegalArgumentException var8) {
            throw IlIIII(var8);
         }

         if (var5 == null) {
            var5 = new StringBuffer(var1.length());
         }

         var4.appendReplacement(var5, Matcher.quoteReplacement(var6));
      }

      try {
         if (var5 == null) {
            return var1;
         }
      } catch (IllegalArgumentException var7) {
         throw IlIIII(var7);
      }

      var4.appendTail(var5);
      return var5.toString();
   }

   public String IlII(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokevirtual k74/x/IIlllllII.IIIIlIl ()Z
      // 004: ifeq 020
      // 007: aload 1
      // 008: ifnull 020
      // 00b: goto 012
      // 00e: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 011: athrow
      // 012: aload 1
      // 013: invokevirtual java/lang/String.isEmpty ()Z
      // 016: ifeq 026
      // 019: goto 020
      // 01c: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01f: athrow
      // 020: aload 1
      // 021: areturn
      // 022: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 025: athrow
      // 026: aload 0
      // 027: getfield k74/x/IIlllllII.IlIII Lk74/x/IllIII;
      // 02a: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 02d: getstatic k74/x/IIIIlIII.II Lk74/x/IIIIlIII;
      // 030: if_acmpne 03d
      // 033: aload 0
      // 034: aload 1
      // 035: invokevirtual k74/x/IIlllllII.lllll (Ljava/lang/String;)Ljava/lang/String;
      // 038: areturn
      // 039: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03c: athrow
      // 03d: aload 0
      // 03e: getfield k74/x/IIlllllII.IlIIl Ljava/lang/String;
      // 041: astore 2
      // 042: aload 0
      // 043: invokevirtual k74/x/IIlllllII.ll ()Ljava/lang/String;
      // 046: astore 3
      // 047: aload 2
      // 048: invokevirtual java/lang/String.isBlank ()Z
      // 04b: ifne 06b
      // 04e: aload 3
      // 04f: invokevirtual java/lang/String.isBlank ()Z
      // 052: ifne 06b
      // 055: goto 05c
      // 058: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05b: athrow
      // 05c: aload 2
      // 05d: aload 3
      // 05e: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 061: ifeq 071
      // 064: goto 06b
      // 067: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06a: athrow
      // 06b: aload 1
      // 06c: areturn
      // 06d: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 070: athrow
      // 071: aload 2
      // 072: aload 0
      // 073: getfield k74/x/IIlllllII.lIII Ljava/lang/String;
      // 076: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 079: ifeq 09c
      // 07c: aload 3
      // 07d: aload 0
      // 07e: getfield k74/x/IIlllllII.Illl Ljava/lang/String;
      // 081: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 084: ifeq 09c
      // 087: goto 08e
      // 08a: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08d: athrow
      // 08e: aload 0
      // 08f: getfield k74/x/IIlllllII.lIll Ljava/util/regex/Pattern;
      // 092: ifnonnull 117
      // 095: goto 09c
      // 098: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09b: athrow
      // 09c: aload 0
      // 09d: aload 2
      // 09e: putfield k74/x/IIlllllII.lIII Ljava/lang/String;
      // 0a1: aload 0
      // 0a2: aload 3
      // 0a3: putfield k74/x/IIlllllII.Illl Ljava/lang/String;
      // 0a6: aload 0
      // 0a7: ldc_w 1674634058
      // 0aa: ldc_w 153456231
      // 0ad: ldc_w 15437799
      // 0b0: ixor
      // 0b1: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 0b4: ldc_w 1674634059
      // 0b7: ldc_w 153456231
      // 0ba: ldc_w -961823209
      // 0bd: ixor
      // 0be: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 0c1: invokestatic k74/x/IIlllllII.IIllI (II)Ljava/lang/String;
      // 0c4: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0c7: aload 2
      // 0c8: invokestatic java/util/regex/Pattern.quote (Ljava/lang/String;)Ljava/lang/String;
      // 0cb: ldc_w 1674634052
      // 0ce: ldc_w 153456231
      // 0d1: ldc_w -1378044776
      // 0d4: ixor
      // 0d5: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 0d8: ldc_w 1674634053
      // 0db: ldc_w 153456231
      // 0de: ldc_w 1905219705
      // 0e1: ixor
      // 0e2: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 0e5: invokestatic k74/x/IIlllllII.IIllI (II)Ljava/lang/String;
      // 0e8: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0eb: astore 6
      // 0ed: astore 5
      // 0ef: astore 4
      // 0f1: new java/lang/StringBuilder
      // 0f4: dup
      // 0f5: invokespecial java/lang/StringBuilder.<init> ()V
      // 0f8: aload 4
      // 0fa: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0fd: aload 5
      // 0ff: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 102: aload 6
      // 104: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 107: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 10a: invokestatic java/util/regex/Pattern.compile (Ljava/lang/String;)Ljava/util/regex/Pattern;
      // 10d: putfield k74/x/IIlllllII.lIll Ljava/util/regex/Pattern;
      // 110: goto 117
      // 113: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 116: athrow
      // 117: aload 0
      // 118: getfield k74/x/IIlllllII.lIll Ljava/util/regex/Pattern;
      // 11b: aload 1
      // 11c: invokevirtual java/util/regex/Pattern.matcher (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
      // 11f: aload 3
      // 120: invokestatic java/util/regex/Matcher.quoteReplacement (Ljava/lang/String;)Ljava/lang/String;
      // 123: invokevirtual java/util/regex/Matcher.replaceAll (Ljava/lang/String;)Ljava/lang/String;
      // 126: areturn
   }

   private static int IlIl(int var0) {
      return Math.max(var0, 1);
   }

   private CompletableFuture<GameProfile> IllI(String var1) {
      return this.IIII(var1).thenCompose(this::Ill);
   }

   @Override
   public void IIlIl() {
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
      // 05: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 08: ifnonnull 10
      // 0b: return
      // 0c: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f: athrow
      // 10: aload 0
      // 11: aload 1
      // 12: invokevirtual k74/x/IIlllllII.llIlI (Lnet/minecraft/class_310;)Ljava/lang/String;
      // 15: astore 2
      // 16: aload 0
      // 17: aload 2
      // 18: putfield k74/x/IIlllllII.IlIIl Ljava/lang/String;
      // 1b: aload 0
      // 1c: aload 1
      // 1d: invokevirtual k74/x/IIlllllII.IIIlll (Lnet/minecraft/class_310;)V
      // 20: aload 0
      // 21: invokevirtual k74/x/IIlllllII.IIIIII ()Ljava/lang/String;
      // 24: astore 3
      // 25: aload 3
      // 26: astore 4
      // 28: aload 0
      // 29: getfield k74/x/IIlllllII.IIIl Lk74/x/lllIIlII;
      // 2c: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 2f: checkcast java/lang/Boolean
      // 32: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 35: ifeq 65
      // 38: aload 4
      // 3a: invokevirtual java/lang/String.isBlank ()Z
      // 3d: ifne 65
      // 40: goto 47
      // 43: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 46: athrow
      // 47: aload 2
      // 48: invokevirtual java/lang/String.isBlank ()Z
      // 4b: ifne 65
      // 4e: goto 55
      // 51: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 54: athrow
      // 55: aload 4
      // 57: aload 2
      // 58: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 5b: ifeq 6e
      // 5e: goto 65
      // 61: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 64: athrow
      // 65: aload 0
      // 66: invokevirtual k74/x/IIlllllII.IlIlIl ()V
      // 69: return
      // 6a: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6d: athrow
      // 6e: aload 4
      // 70: aload 0
      // 71: getfield k74/x/IIlllllII.IIl Ljava/lang/String;
      // 74: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 77: ifeq 95
      // 7a: invokestatic java/lang/System.currentTimeMillis ()J
      // 7d: aload 0
      // 7e: getfield k74/x/IIlllllII.IlIl J
      // 81: lsub
      // 82: ldc2_w 5000
      // 85: lcmp
      // 86: ifge 95
      // 89: goto 90
      // 8c: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8f: athrow
      // 90: return
      // 91: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 94: athrow
      // 95: aload 4
      // 97: aload 0
      // 98: getfield k74/x/IIlllllII.Il Ljava/lang/String;
      // 9b: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 9e: ifne af
      // a1: aload 0
      // a2: getfield k74/x/IIlllllII.IIII Z
      // a5: ifeq b4
      // a8: goto af
      // ab: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ae: athrow
      // af: return
      // b0: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b3: athrow
      // b4: aload 0
      // b5: aload 4
      // b7: putfield k74/x/IIlllllII.Il Ljava/lang/String;
      // ba: aload 0
      // bb: aconst_null
      // bc: putfield k74/x/IIlllllII.llI Ljava/lang/Object;
      // bf: aload 0
      // c0: bipush 1
      // c1: putfield k74/x/IIlllllII.IIII Z
      // c4: aload 0
      // c5: aload 1
      // c6: aload 4
      // c8: invokevirtual k74/x/IIlllllII.IlIlII (Lnet/minecraft/class_310;Ljava/lang/String;)Ljava/util/concurrent/CompletableFuture;
      // cb: aload 0
      // cc: aload 1
      // cd: aload 4
      // cf: invokedynamic accept (Lk74/x/IIlllllII;Lnet/minecraft/class_310;Ljava/lang/String;)Ljava/util/function/BiConsumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;Ljava/lang/Object;)V, k74/x/IIlllllII.IIIllI (Lnet/minecraft/class_310;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V, (Ljava/lang/Object;Ljava/lang/Throwable;)V ]
      // d4: invokevirtual java/util/concurrent/CompletableFuture.whenComplete (Ljava/util/function/BiConsumer;)Ljava/util/concurrent/CompletableFuture;
      // d7: pop
      // d8: return
   }

   @Override
   public void llIl() {
      this.IIlI.clear();
      this.IlIlIl();
      this.IlIIl = "";
      this.IllI = null;
      this.lIIl = "";
      this.IIl = "";
      this.IlIl = 0L;
      this.IIll.clear();
      this.lIlI.set(0);
      this.IIlll = "";
      this.lIlI();
   }

   private CompletableFuture Illl(class_310 var1, String var2) {
      CompletableFuture var3 = this.IIllII(var1, var2);
      var3.thenAccept(this::IlIIIl);
      return var3;
   }

   private Pattern lIII(List<Illl> var1) {
      int var10 = 646324786;

      try {
         if (var1.isEmpty()) {
            return null;
         }
      } catch (IllegalArgumentException var12) {
         throw IlIIII(var12);
      }

      StringBuilder var2 = new StringBuilder();

      for (Illl var4 : var1) {
         try {
            if (var2.length() > 0) {
               var2.append((char)IllllI(1674634054, var10 ^ 248697203));
            }
         } catch (IllegalArgumentException var11) {
            throw IlIIII(var11);
         }

         var2.append(Pattern.quote(var4.I()));
      }

      String var10000 = IlIIllIII.lI(IIllI(IllllI(1674634055, var10 ^ -978926465), IllllI(1674634048, var10 ^ -1066351375)));
      String var10001 = IlIIllIII.lI(IIllI(IllllI(1674634049, var10 ^ 901361595), IllllI(1674634050, var10 ^ -1874458455)));
      String var10002 = String.valueOf(var2);
      String var10003 = IlIIllIII.lI(IIllI(IllllI(1674634051, var10 ^ -1543388669), IllllI(1674634108, var10 ^ -205692960)));
      String var9 = IlIIllIII.lI(IIllI(IllllI(1674634109, var10 ^ -1931819455), IllllI(1674634110, var10 ^ 1247665776)));
      String var8 = var10003;
      String var7 = var10002;
      String var6 = var10001;
      String var5 = var10000;
      return Pattern.compile(var5 + var6 + var7 + var8 + var9);
   }

   private static int lIIl(int var0) {
      return Math.max(var0, 1);
   }

   private void lIlI() {
      this.IlIlI = "";
      this.IIIll = null;
      this.IIIIl = Map.of();
      synchronized (this.IllIl) {
         this.IllIl.clear();
      }
   }

   @Override
   public JsonObject IlIll() {
      return super.IlIll();
   }

   private boolean lIll() {
      try {
         if (this.IlIII.IllI() == IIIIlIII.lI) {
            return true;
         }
      } catch (IllegalArgumentException var1) {
         throw IlIIII(var1);
      }

      return false;
   }

   private void llII(CompletableFuture var1, String var2, HttpResponse var3) {
      try {
         var1.complete(this.IIIlII(var2, (byte[])var3.body()));
      } catch (LinkageError | RuntimeException var5) {
         var1.complete(null);
         this.IlIlllI(IllllI(1674634084, 2001295052 ^ 1315568682), var5);
      }
   }

   private boolean lllI(GameProfile param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 03: astore 2
      // 04: aload 2
      // 05: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 08: ifnonnull 11
      // 0b: bipush 0
      // 0c: ireturn
      // 0d: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10: athrow
      // 11: aload 0
      // 12: getfield k74/x/IIlllllII.IlIII Lk74/x/IllIII;
      // 15: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 18: getstatic k74/x/IIIIlIII.lI Lk74/x/IIIIlIII;
      // 1b: if_acmpne b7
      // 1e: aload 0
      // 1f: aload 2
      // 20: invokevirtual k74/x/IIlllllII.IllIII (Lnet/minecraft/class_310;)Lnet/minecraft/class_1657;
      // 23: astore 3
      // 24: aload 3
      // 25: ifnull 6b
      // 28: aload 3
      // 29: invokevirtual net/minecraft/class_1657.method_7334 ()Lcom/mojang/authlib/GameProfile;
      // 2c: invokestatic k74/x/lIlIIIll.Ill (Lcom/mojang/authlib/GameProfile;)Ljava/lang/String;
      // 2f: astore 4
      // 31: aload 3
      // 32: invokevirtual net/minecraft/class_1657.method_5667 ()Ljava/util/UUID;
      // 35: aload 1
      // 36: invokestatic k74/x/lIlIIIll.l (Lcom/mojang/authlib/GameProfile;)Ljava/util/UUID;
      // 39: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
      // 3c: ifne 61
      // 3f: aload 4
      // 41: invokevirtual java/lang/String.isBlank ()Z
      // 44: ifne 69
      // 47: goto 4e
      // 4a: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4d: athrow
      // 4e: aload 4
      // 50: aload 1
      // 51: invokestatic k74/x/lIlIIIll.Ill (Lcom/mojang/authlib/GameProfile;)Ljava/lang/String;
      // 54: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 57: ifeq 69
      // 5a: goto 61
      // 5d: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 60: athrow
      // 61: bipush 1
      // 62: goto 6a
      // 65: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 68: athrow
      // 69: bipush 0
      // 6a: ireturn
      // 6b: aload 0
      // 6c: getfield k74/x/IIlllllII.IllI Ljava/util/UUID;
      // 6f: ifnull 87
      // 72: aload 0
      // 73: getfield k74/x/IIlllllII.IllI Ljava/util/UUID;
      // 76: aload 1
      // 77: invokestatic k74/x/lIlIIIll.l (Lcom/mojang/authlib/GameProfile;)Ljava/util/UUID;
      // 7a: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
      // 7d: ifne ad
      // 80: goto 87
      // 83: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 86: athrow
      // 87: aload 0
      // 88: getfield k74/x/IIlllllII.lIIl Ljava/lang/String;
      // 8b: invokevirtual java/lang/String.isBlank ()Z
      // 8e: ifne b5
      // 91: goto 98
      // 94: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 97: athrow
      // 98: aload 0
      // 99: getfield k74/x/IIlllllII.lIIl Ljava/lang/String;
      // 9c: aload 1
      // 9d: invokestatic k74/x/lIlIIIll.Ill (Lcom/mojang/authlib/GameProfile;)Ljava/lang/String;
      // a0: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // a3: ifeq b5
      // a6: goto ad
      // a9: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ac: athrow
      // ad: bipush 1
      // ae: goto b6
      // b1: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b4: athrow
      // b5: bipush 0
      // b6: ireturn
      // b7: aload 2
      // b8: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // bb: invokevirtual net/minecraft/class_746.method_7334 ()Lcom/mojang/authlib/GameProfile;
      // be: invokestatic k74/x/lIlIIIll.Ill (Lcom/mojang/authlib/GameProfile;)Ljava/lang/String;
      // c1: astore 3
      // c2: aload 2
      // c3: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // c6: invokevirtual net/minecraft/class_746.method_5667 ()Ljava/util/UUID;
      // c9: aload 1
      // ca: invokestatic k74/x/lIlIIIll.l (Lcom/mojang/authlib/GameProfile;)Ljava/util/UUID;
      // cd: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
      // d0: ifne f3
      // d3: aload 3
      // d4: invokevirtual java/lang/String.isBlank ()Z
      // d7: ifne fb
      // da: goto e1
      // dd: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // e0: athrow
      // e1: aload 3
      // e2: aload 1
      // e3: invokestatic k74/x/lIlIIIll.Ill (Lcom/mojang/authlib/GameProfile;)Ljava/lang/String;
      // e6: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // e9: ifeq fb
      // ec: goto f3
      // ef: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // f2: athrow
      // f3: bipush 1
      // f4: goto fc
      // f7: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // fa: athrow
      // fb: bipush 0
      // fc: ireturn
   }

   private lIlIIll IIIII(class_2561 var1, String var2, String var3) {
      Object var4;
      boolean var5;
      class_2583 var6;
      var4 = var1.method_10851();
      var5 = false;
      var6 = var1.method_10866();
      label46:
      if (var4 instanceof class_8828 var7 && !this.I(var6)) {
         String var8 = var7.comp_737();

         try {
            if (var8 == null || !var8.contains(var2)) {
               break label46;
            }
         } catch (IllegalArgumentException var12) {
            throw IlIIII(var12);
         }

         String var9 = var8.replace(var2, var3);
         if (!var8.equals(var9)) {
            var4 = class_8828.method_54232(var9);
            var5 = true;
         }
      }

      class_5250 var13 = class_5250.method_43477((class_7417)var4).method_10862(var6);

      for (class_2561 var15 : var1.method_10855()) {
         lIlIIll var10 = this.IIIII(var15, var2, var3);
         var13.method_10852(var10.I());
         var5 |= var10.l();
      }

      lIlIIll var10000;
      lIlIIll var10001;
      Object var10002;
      label30: {
         try {
            var10000 = new lIlIIll;
            var10001 = var10000;
            if (var5) {
               var10002 = var13;
               break label30;
            }
         } catch (IllegalArgumentException var11) {
            throw IlIIII(var11);
         }

         var10002 = var1;
      }

      var10001./* $VF: Unable to resugar constructor */<init>((class_2561)var10002, var5);
      return var10000;
   }

   private CompletableFuture<GameProfile> IIIIl(GameProfile var1) {
      String var3 = lIlIIIll.l(var1)
         .toString()
         .replace(IlIIllIII.lI(IIllI(IllllI(1674634085, -390955552 ^ -2016094673), IllllI(1674634086, -390955552 ^ 617121861))), "");
      String var5 = IlIll.llIl();
      HttpRequest var4 = HttpRequest.newBuilder(URI.create(var5 + var3)).timeout(Duration.ofSeconds(5L)).header(IIIII.llIl(), ll.llIl()).GET().build();
      return lI.sendAsync(var4, BodyHandlers.ofString()).thenApply(IIlllllII::IIIIIl).exceptionally(IIlllllII::lIlII);
   }

   private void IIIlI(String param1, Throwable param2, Object param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: bipush 0
      // 02: putfield k74/x/IIlllllII.IIII Z
      // 05: aload 1
      // 06: aload 0
      // 07: getfield k74/x/IIlllllII.Il Ljava/lang/String;
      // 0a: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 0d: ifeq 27
      // 10: aload 0
      // 11: getfield k74/x/IIlllllII.IIIl Lk74/x/lllIIlII;
      // 14: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 17: checkcast java/lang/Boolean
      // 1a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1d: ifne 2c
      // 20: goto 27
      // 23: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26: athrow
      // 27: return
      // 28: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b: athrow
      // 2c: aload 2
      // 2d: ifnonnull 51
      // 30: aload 3
      // 31: ifnull 51
      // 34: goto 3b
      // 37: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a: athrow
      // 3b: aload 0
      // 3c: aload 3
      // 3d: putfield k74/x/IIlllllII.llI Ljava/lang/Object;
      // 40: aload 0
      // 41: ldc_w ""
      // 44: putfield k74/x/IIlllllII.IIl Ljava/lang/String;
      // 47: aload 0
      // 48: lconst_0
      // 49: putfield k74/x/IIlllllII.IlIl J
      // 4c: return
      // 4d: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 50: athrow
      // 51: aload 0
      // 52: aconst_null
      // 53: putfield k74/x/IIlllllII.llI Ljava/lang/Object;
      // 56: aload 0
      // 57: aload 1
      // 58: putfield k74/x/IIlllllII.IIl Ljava/lang/String;
      // 5b: aload 0
      // 5c: invokestatic java/lang/System.currentTimeMillis ()J
      // 5f: putfield k74/x/IIlllllII.IlIl J
      // 62: aload 0
      // 63: ldc_w ""
      // 66: putfield k74/x/IIlllllII.Il Ljava/lang/String;
      // 69: return
   }

   private boolean IIIll() {
      try {
         if (this.IlII.IllI() != IIIlIIIl.I) {
            return true;
         }
      } catch (IllegalArgumentException var1) {
         throw IlIIII(var1);
      }

      return false;
   }

   private class_2561 IIlII(class_2561 param1, String param2, String param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 28
      // 04: aload 2
      // 05: ifnull 28
      // 08: goto 0f
      // 0b: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e: athrow
      // 0f: aload 2
      // 10: invokevirtual java/lang/String.isBlank ()Z
      // 13: ifne 28
      // 16: goto 1d
      // 19: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: aload 3
      // 1e: ifnonnull 2e
      // 21: goto 28
      // 24: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27: athrow
      // 28: aload 1
      // 29: areturn
      // 2a: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d: athrow
      // 2e: aload 0
      // 2f: aload 1
      // 30: aload 2
      // 31: aload 3
      // 32: invokevirtual k74/x/IIlllllII.IIIII (Lnet/minecraft/class_2561;Ljava/lang/String;Ljava/lang/String;)Lk74/x/lIlIIll;
      // 35: astore 4
      // 37: aload 4
      // 39: invokevirtual k74/x/lIlIIll.l ()Z
      // 3c: ifeq 49
      // 3f: aload 4
      // 41: invokevirtual k74/x/lIlIIll.I ()Lnet/minecraft/class_2561;
      // 44: areturn
      // 45: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 48: athrow
      // 49: aload 3
      // 4a: invokestatic net/minecraft/class_2561.method_43470 (Ljava/lang/String;)Lnet/minecraft/class_5250;
      // 4d: aload 1
      // 4e: invokeinterface net/minecraft/class_2561.method_10866 ()Lnet/minecraft/class_2583; 1
      // 53: invokevirtual net/minecraft/class_5250.method_10862 (Lnet/minecraft/class_2583;)Lnet/minecraft/class_5250;
      // 56: areturn
   }

   private static String IIllI(int var0, int var1) {
      int var9 = 1679021205;
      int var2 = (var0 ^ IllllI(1674634087, var9 ^ 1549031743)) & IllllI(1674634080, var9 ^ 84950347);
      if (IIIlI[var2] == null) {
         char[] var3 = lllI[var2].toCharArray();

         int var4 = switch (var3[0] & IllllI(1674634081, var9 ^ -242748484)) {
            case 0 -> IllllI(1674634082, var9 ^ 433884199);
            case 1 -> IllllI(1674634083, var9 ^ 1245036446);
            case 2 -> IllllI(1674634012, var9 ^ -1623418637);
            case 3 -> IllllI(1674634013, var9 ^ -2031213583);
            case 4 -> IllllI(1674634014, var9 ^ 1700784192);
            case 5 -> IllllI(1674634015, var9 ^ -308698766);
            case 6 -> IllllI(1674634008, var9 ^ 1604342480);
            case 7 -> IllllI(1674634009, var9 ^ -466567601);
            case 8 -> IllllI(1674634010, var9 ^ -1414147336);
            case 9 -> IllllI(1674634011, var9 ^ 2104130807);
            case 10 -> IllllI(1674634004, var9 ^ 1757250667);
            case 11 -> IllllI(1674634005, var9 ^ -1749902422);
            case 12 -> IllllI(1674634006, var9 ^ -17578893);
            case 13 -> IllllI(1674634007, var9 ^ -1200125910);
            case 14 -> IllllI(1674634000, var9 ^ 150902731);
            case 15 -> IllllI(1674634001, var9 ^ 738096694);
            case 16 -> IllllI(1674634002, var9 ^ -2098345399);
            case 17 -> IllllI(1674634003, var9 ^ 1951768871);
            case 18 -> IllllI(1674633996, var9 ^ 444080037);
            case 19 -> IllllI(1674633997, var9 ^ -197405693);
            case 20 -> IllllI(1674633998, var9 ^ -88896278);
            case 21 -> IllllI(1674633999, var9 ^ 972722732);
            case 22 -> IllllI(1674633992, var9 ^ 479370356);
            case 23 -> IllllI(1674633993, var9 ^ 1282753568);
            case 24 -> IllllI(1674633994, var9 ^ 2129334428);
            case 25 -> IllllI(1674633995, var9 ^ -1421785021);
            case 26 -> IllllI(1674633988, var9 ^ -1227868999);
            case 27 -> IllllI(1674633989, var9 ^ 1530472758);
            case 28 -> IllllI(1674633990, var9 ^ -1942939148);
            case 29 -> IllllI(1674633991, var9 ^ -926218293);
            case 30 -> IllllI(1674633984, var9 ^ 218454578);
            case 31 -> IllllI(1674633985, var9 ^ 1655004963);
            case 32 -> IllllI(1674633986, var9 ^ -169392492);
            case 33 -> IllllI(1674633987, var9 ^ -1891220541);
            case 34 -> IllllI(1674634044, var9 ^ -272386230);
            case 35 -> IllllI(1674634045, var9 ^ 363669460);
            case 36 -> IllllI(1674634046, var9 ^ -705425181);
            case 37 -> IllllI(1674634047, var9 ^ -1549689830);
            case 38 -> IllllI(1674634040, var9 ^ 902619519);
            case 39 -> IllllI(1674634041, var9 ^ -1571057446);
            case 40 -> IllllI(1674634042, var9 ^ -1523374112);
            case 41 -> IllllI(1674634043, var9 ^ -924427058);
            case 42 -> IllllI(1674634036, var9 ^ -1914071532);
            case 43 -> IllllI(1674634037, var9 ^ 87672703);
            case 44 -> IllllI(1674634038, var9 ^ -770273858);
            case 45 -> IllllI(1674634039, var9 ^ 1372404185);
            case 46 -> IllllI(1674634032, var9 ^ -219502641);
            case 47 -> IllllI(1674634033, var9 ^ -1275194978);
            case 48 -> IllllI(1674634034, var9 ^ -1260386059);
            case 49 -> IllllI(1674634035, var9 ^ 1919488288);
            case 50 -> IllllI(1674634028, var9 ^ -1902896345);
            case 51 -> IllllI(1674634029, var9 ^ 1765826411);
            case 52 -> IllllI(1674634030, var9 ^ -1155022370);
            case 53 -> IllllI(1674634031, var9 ^ 1526984012);
            case 54 -> IllllI(1674634024, var9 ^ -1724046440);
            case 55 -> IllllI(1674634025, var9 ^ 503434530);
            case 56 -> IllllI(1674634026, var9 ^ -870084601);
            case 57 -> IllllI(1674634027, var9 ^ 670411784);
            case 58 -> IllllI(1674634020, var9 ^ -1780619226);
            case 59 -> IllllI(1674634021, var9 ^ 57354796);
            case 60 -> IllllI(1674634022, var9 ^ -1224475770);
            case 61 -> IllllI(1674634023, var9 ^ 786665165);
            case 62 -> IllllI(1674634016, var9 ^ 307465320);
            case 63 -> IllllI(1674634017, var9 ^ -1235144373);
            case 64 -> IllllI(1674634018, var9 ^ 1816051266);
            case 65 -> IllllI(1674634019, var9 ^ 396313395);
            case 66 -> IllllI(1674634204, var9 ^ -420060304);
            case 67 -> IllllI(1674634205, var9 ^ 352450536);
            case 68 -> IllllI(1674634206, var9 ^ 1049737206);
            case 69 -> IllllI(1674634207, var9 ^ 2069651096);
            case 70 -> IllllI(1674634200, var9 ^ 339991041);
            case 71 -> IllllI(1674634201, var9 ^ 1058119636);
            case 72 -> IllllI(1674634202, var9 ^ 142717925);
            case 73 -> IllllI(1674634203, var9 ^ 1790547812);
            case 74 -> IllllI(1674634196, var9 ^ 414866292);
            case 75 -> IllllI(1674634197, var9 ^ 7215028);
            case 76 -> IllllI(1674634198, var9 ^ -1229930663);
            case 77 -> IllllI(1674634199, var9 ^ -135421611);
            case 78 -> IllllI(1674634192, var9 ^ -1303192839);
            case 79 -> IllllI(1674634193, var9 ^ -9297922);
            case 80 -> IllllI(1674634194, var9 ^ 1701639904);
            case 81 -> IllllI(1674634195, var9 ^ 1047067737);
            case 82 -> IllllI(1674634188, var9 ^ 1089196027);
            case 83 -> IllllI(1674634189, var9 ^ -521678751);
            case 84 -> IllllI(1674634190, var9 ^ 1840356433);
            case 85 -> IllllI(1674634191, var9 ^ -1818427778);
            case 86 -> IllllI(1674634184, var9 ^ -1973976093);
            case 87 -> IllllI(1674634185, var9 ^ 720781295);
            case 88 -> IllllI(1674634186, var9 ^ -1781914280);
            case 89 -> IllllI(1674634187, var9 ^ -1592570151);
            case 90 -> IllllI(1674634180, var9 ^ -910837229);
            case 91 -> IllllI(1674634181, var9 ^ -540217835);
            case 92 -> IllllI(1674634182, var9 ^ 1439404861);
            case 93 -> IllllI(1674634183, var9 ^ 1526324286);
            case 94 -> 0;
            case 95 -> IllllI(1674634176, var9 ^ -2064207310);
            case 96 -> IllllI(1674634177, var9 ^ 1411106071);
            case 97 -> IllllI(1674634178, var9 ^ 1862861207);
            case 98 -> IllllI(1674634179, var9 ^ -2015619204);
            case 99 -> IllllI(1674634236, var9 ^ -522640435);
            case 100 -> IllllI(1674634237, var9 ^ -1592311427);
            case 101 -> IllllI(1674634238, var9 ^ -32654649);
            case 102 -> IllllI(1674634239, var9 ^ 709582009);
            case 103 -> IllllI(1674634232, var9 ^ -151561614);
            case 104 -> IllllI(1674634233, var9 ^ 549859111);
            case 105 -> IllllI(1674634234, var9 ^ 1915509095);
            case 106 -> IllllI(1674634235, var9 ^ -1759875374);
            case 107 -> IllllI(1674634228, var9 ^ -904257954);
            case 108 -> IllllI(1674634229, var9 ^ -1678968438);
            case 109 -> IllllI(1674634230, var9 ^ 371057335);
            case 110 -> IllllI(1674634231, var9 ^ -729396016);
            case 111 -> IllllI(1674634224, var9 ^ -974551027);
            case 112 -> IllllI(1674634225, var9 ^ 2052921070);
            case 113 -> IllllI(1674634226, var9 ^ 339632972);
            case 114 -> IllllI(1674634227, var9 ^ -1258829405);
            case 115 -> IllllI(1674634220, var9 ^ -1927033014);
            case 116 -> IllllI(1674634221, var9 ^ -1132699748);
            case 117 -> IllllI(1674634222, var9 ^ 1779097725);
            case 118 -> IllllI(1674634223, var9 ^ -1172207698);
            case 119 -> IllllI(1674634216, var9 ^ -1460430706);
            case 120 -> IllllI(1674634217, var9 ^ 770185201);
            case 121 -> IllllI(1674634218, var9 ^ -436426010);
            case 122 -> IllllI(1674634219, var9 ^ -1342676422);
            case 123 -> IllllI(1674634212, var9 ^ -555734272);
            case 124 -> IllllI(1674634213, var9 ^ 1081185522);
            case 125 -> IllllI(1674634214, var9 ^ -1714679773);
            case 126 -> IllllI(1674634215, var9 ^ -590370400);
            case 127 -> IllllI(1674634208, var9 ^ -362328316);
            case 128 -> IllllI(1674634209, var9 ^ 572310552);
            case 129 -> IllllI(1674634210, var9 ^ -2047034799);
            case 130 -> IllllI(1674634211, var9 ^ -1680494963);
            case 131 -> IllllI(1674634140, var9 ^ -626109030);
            case 132 -> IllllI(1674634141, var9 ^ 1125050271);
            case 133 -> IllllI(1674634142, var9 ^ -818872458);
            case 134 -> IllllI(1674634143, var9 ^ -2116059291);
            case 135 -> IllllI(1674634136, var9 ^ -2011102393);
            case 136 -> 3;
            case 137 -> IllllI(1674634137, var9 ^ -1552048181);
            case 138 -> IllllI(1674634138, var9 ^ 626188096);
            case 139 -> IllllI(1674634139, var9 ^ -665732917);
            case 140 -> IllllI(1674634132, var9 ^ -932542758);
            case 141 -> IllllI(1674634133, var9 ^ -463454678);
            case 142 -> IllllI(1674634134, var9 ^ -737553685);
            case 143 -> IllllI(1674634135, var9 ^ -1084852300);
            case 144 -> IllllI(1674634128, var9 ^ -2048356586);
            case 145 -> IllllI(1674634129, var9 ^ -1652398406);
            case 146 -> IllllI(1674634130, var9 ^ -1765538240);
            case 147 -> IllllI(1674634131, var9 ^ 1997552744);
            case 148 -> IllllI(1674634124, var9 ^ -1726536548);
            case 149 -> IllllI(1674634125, var9 ^ 213458238);
            case 150 -> IllllI(1674634126, var9 ^ 118495397);
            case 151 -> IllllI(1674634127, var9 ^ 1279375380);
            case 152 -> IllllI(1674634120, var9 ^ 1906262247);
            case 153 -> IllllI(1674634121, var9 ^ -704472720);
            case 154 -> IllllI(1674634122, var9 ^ 827232428);
            case 155 -> IllllI(1674634123, var9 ^ -2002230521);
            case 156 -> IllllI(1674634116, var9 ^ -94630868);
            case 157 -> IllllI(1674634117, var9 ^ 1854651299);
            case 158 -> 2;
            case 159 -> IllllI(1674634118, var9 ^ -1646911108);
            case 160 -> IllllI(1674634119, var9 ^ -1932065920);
            case 161 -> IllllI(1674634112, var9 ^ 945046644);
            case 162 -> IllllI(1674634113, var9 ^ 1502912722);
            case 163 -> IllllI(1674634114, var9 ^ 315535969);
            case 164 -> IllllI(1674634115, var9 ^ -1741385423);
            case 165 -> IllllI(1674634172, var9 ^ 1945307041);
            case 166 -> IllllI(1674634173, var9 ^ 686541632);
            case 167 -> IllllI(1674634174, var9 ^ 1183095673);
            case 168 -> IllllI(1674634175, var9 ^ 1466420791);
            case 169 -> IllllI(1674634168, var9 ^ 1389599036);
            case 170 -> IllllI(1674634169, var9 ^ 534819971);
            case 171 -> IllllI(1674634170, var9 ^ 1677857909);
            case 172 -> IllllI(1674634171, var9 ^ 2065904116);
            case 173 -> IllllI(1674634164, var9 ^ 987629177);
            case 174 -> IllllI(1674634165, var9 ^ 1135821448);
            case 175 -> IllllI(1674634166, var9 ^ 1473285068);
            case 176 -> IllllI(1674634167, var9 ^ 256803757);
            case 177 -> IllllI(1674634160, var9 ^ 212309755);
            case 178 -> IllllI(1674634161, var9 ^ 1051778381);
            case 179 -> IllllI(1674634162, var9 ^ 1341029189);
            case 180 -> IllllI(1674634163, var9 ^ -1323951739);
            case 181 -> IllllI(1674634156, var9 ^ 571371410);
            case 182 -> IllllI(1674634157, var9 ^ 892024025);
            case 183 -> IllllI(1674634158, var9 ^ 1697438364);
            case 184 -> IllllI(1674634159, var9 ^ -892089234);
            case 185 -> IllllI(1674634152, var9 ^ 649377172);
            case 186 -> IllllI(1674634153, var9 ^ 283510050);
            case 187 -> IllllI(1674634154, var9 ^ -392077074);
            case 188 -> IllllI(1674634155, var9 ^ -1618207493);
            case 189 -> IllllI(1674634148, var9 ^ 1968311426);
            case 190 -> IllllI(1674634149, var9 ^ 571311300);
            case 191 -> IllllI(1674634150, var9 ^ -1337462851);
            case 192 -> IllllI(1674634151, var9 ^ -419606733);
            case 193 -> IllllI(1674634144, var9 ^ -53546590);
            case 194 -> IllllI(1674634145, var9 ^ -1870347041);
            case 195 -> IllllI(1674634146, var9 ^ -28215312);
            case 196 -> IllllI(1674634147, var9 ^ 1262012217);
            case 197 -> IllllI(1674633820, var9 ^ -1555685257);
            case 198 -> IllllI(1674633821, var9 ^ 1504768376);
            case 199 -> IllllI(1674633822, var9 ^ -2001283938);
            case 200 -> IllllI(1674633823, var9 ^ 1667249502);
            case 201 -> IllllI(1674633816, var9 ^ -977817536);
            case 202 -> IllllI(1674633817, var9 ^ -550307122);
            case 203 -> IllllI(1674633818, var9 ^ 1576782687);
            case 204 -> IllllI(1674633819, var9 ^ 994438182);
            case 205 -> IllllI(1674633812, var9 ^ -1341992185);
            case 206 -> IllllI(1674633813, var9 ^ 1224894535);
            case 207 -> IllllI(1674633814, var9 ^ 521907160);
            case 208 -> IllllI(1674633815, var9 ^ 1693778489);
            case 209 -> IllllI(1674633808, var9 ^ 1220415224);
            case 210 -> IllllI(1674633809, var9 ^ 1058069161);
            case 211 -> IllllI(1674633810, var9 ^ -353606968);
            case 212 -> IllllI(1674633811, var9 ^ 1554330453);
            case 213 -> IllllI(1674633804, var9 ^ 1774046987);
            case 214 -> 5;
            case 215 -> 4;
            case 216 -> IllllI(1674633805, var9 ^ 1046634785);
            case 217 -> IllllI(1674633806, var9 ^ -13651876);
            case 218 -> IllllI(1674633807, var9 ^ -27550209);
            case 219 -> IllllI(1674633800, var9 ^ -1990305900);
            case 220 -> IllllI(1674633801, var9 ^ 109824512);
            case 221 -> IllllI(1674633802, var9 ^ 161072672);
            case 222 -> IllllI(1674633803, var9 ^ 1996279309);
            case 223 -> IllllI(1674633796, var9 ^ -1520627071);
            case 224 -> IllllI(1674633797, var9 ^ -496737616);
            case 225 -> IllllI(1674633798, var9 ^ 1271089878);
            case 226 -> IllllI(1674633799, var9 ^ -1021727220);
            case 227 -> IllllI(1674633792, var9 ^ 1103232335);
            case 228 -> IllllI(1674633793, var9 ^ -1626702557);
            case 229 -> IllllI(1674633794, var9 ^ 1097804181);
            case 230 -> IllllI(1674633795, var9 ^ -994246704);
            case 231 -> IllllI(1674633852, var9 ^ -429317921);
            case 232 -> IllllI(1674633853, var9 ^ 1622464648);
            case 233 -> IllllI(1674633854, var9 ^ 103706022);
            case 234 -> IllllI(1674633855, var9 ^ 801021998);
            case 235 -> IllllI(1674633848, var9 ^ 637116849);
            case 236 -> IllllI(1674633849, var9 ^ -1936893530);
            case 237 -> IllllI(1674633850, var9 ^ -1364980433);
            case 238 -> IllllI(1674633851, var9 ^ 75473270);
            case 239 -> IllllI(1674633844, var9 ^ -2010614219);
            case 240 -> IllllI(1674633845, var9 ^ 379520928);
            case 241 -> IllllI(1674633846, var9 ^ -1224505680);
            case 242 -> IllllI(1674633847, var9 ^ -151602148);
            case 243 -> IllllI(1674633840, var9 ^ -1528306768);
            case 244 -> IllllI(1674633841, var9 ^ -1969434739);
            case 245 -> IllllI(1674633842, var9 ^ 199958179);
            case 246 -> IllllI(1674633843, var9 ^ -1316981829);
            case 247 -> 1;
            case 248 -> IllllI(1674633836, var9 ^ -1152971529);
            case 249 -> IllllI(1674633837, var9 ^ 2060067724);
            case 250 -> IllllI(1674633838, var9 ^ -2001665688);
            case 251 -> IllllI(1674633839, var9 ^ -2144213045);
            case 252 -> IllllI(1674633832, var9 ^ -1457423474);
            case 253 -> IllllI(1674633833, var9 ^ -1061901304);
            case 254 -> IllllI(1674633834, var9 ^ -1873483300);
            default -> IllllI(1674633835, var9 ^ 1236939253);
         };
         int var5 = (var1 & IllllI(1674633828, var9 ^ -1202020670)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & IllllI(1674633829, var9 ^ -2011588511)) >>> IllllI(1674633830, var9 ^ -1338050461)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & IllllI(1674633831, var9 ^ -542678238);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & IllllI(1674633824, var9 ^ -1583560395);
            }
         }

         IIIlI[var2] = new String(var3).intern();
      }

      return IIIlI[var2];
   }

   public IIlllllII() {
      int var1 = 229298729;
      super(
         IlIIllIII.Ill(IIllI(IllllI(1674633825, var1 ^ -270406895), IllllI(1674633826, var1 ^ -1309914060))),
         lllIIlIl.IIl,
         IlIIllIII.Ill(IIllI(IllllI(1674633827, var1 ^ 963008598), IllllI(1674633756, var1 ^ 1494351148)))
      );
      this.IlIII = this.IllIIll(
         new IllIII<>(IlIIllIII.Ill(IIllI(IllllI(1674633757, var1 ^ -107898338), IllllI(1674633758, var1 ^ -136456330))), IIIIlIII.class, IIIIlIII.Il)
      );
      this.I = this.IllIIll(
         new IllIII<>(IlIIllIII.Ill(IIllI(IllllI(1674633759, var1 ^ 775421389), IllllI(1674633752, var1 ^ 1220906013))), IIIIl.class, k74.x.IIIIl.Il)
      );
      this.IlI = this.IllIIll(
         new lllIIllI(
            IlIIllIII.Ill(IIllI(IllllI(1674633753, var1 ^ -2103440695), IllllI(1674633754, var1 ^ 1578946107))),
            IlIIllIII.Ill(IIllI(IllllI(1674633755, var1 ^ -527867867), IllllI(1674633748, var1 ^ 1536746746)))
         )
      );
      this.IIIl = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IIllI(IllllI(1674633749, var1 ^ 1970713615), IllllI(1674633750, var1 ^ 1771720038))), false));
      this.llIl = this.IllIIll(new lllIIllI(IlIIllIII.Ill(IIllI(IllllI(1674633751, var1 ^ 1460799470), IllllI(1674633744, var1 ^ 913707855))), ""));
      this.IlII = this.IllIIll(
         new IllIII<>(IlIIllIII.Ill(IIllI(IllllI(1674633745, var1 ^ 921324639), IllllI(1674633746, var1 ^ -34944110))), IIIlIIIl.class, IIIlIIIl.I)
      );
      this.lll = this.IllIIll(
         new IllIII<>(IlIIllIII.Ill(IIllI(IllllI(1674633747, var1 ^ -984460106), IllllI(1674633740, var1 ^ 1026509582))), III.class, k74.x.III.ll)
      );
      this.llll = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IIllI(IllllI(1674633741, var1 ^ 1983490048), IllllI(1674633742, var1 ^ -410595620))), true));
      this.lIl = this.IllIIll(
         new IllIII<>(IlIIllIII.Ill(IIllI(IllllI(1674633743, var1 ^ 643199093), IllllI(1674633736, var1 ^ -1262806704))), lIlIIlIl.class, lIlIIlIl.I)
      );
      this.II = this.IllIIll(
         new IllIII<>(IlIIllIII.Ill(IIllI(IllllI(1674633737, var1 ^ -196542128), IllllI(1674633738, var1 ^ 1943057844))), IIllIl.class, IIllIl.l)
      );
      this.lII = this.IllIIll(
         new IllIII<>(IlIIllIII.Ill(IIllI(IllllI(1674633739, var1 ^ -86166177), IllllI(1674633732, var1 ^ -284276927))), IIIlllI.class, IIIlllI.Il)
      );
      this.llII = this.IllIIll(
         new IllIII<>(IlIIllIII.Ill(IIllI(IllllI(1674633733, var1 ^ 1337747835), IllllI(1674633734, var1 ^ 52508960))), lIlIIIIl.class, lIlIIIIl.Il)
      );
      this.IIlI = new ConcurrentHashMap<>();
      this.IIll = new ConcurrentHashMap<>();
      this.lIlI = new AtomicInteger();
      this.IllIl = new IIlIllllI(this, IllllI(1674633735, var1 ^ 1162947465), 0.75F, true);
      this.Il = "";
      this.IIl = "";
      this.lIII = "";
      this.Illl = "";
      this.IlIIl = "";
      this.IIlll = "";
      this.IlIlI = "";
      this.IIIIl = Map.of();
      this.lIIl = "";
      this.I.lIlI(this::lIll);
      this.IIIl.lIlI(this::IIlI);
      this.llIl.lIlI(this::IIlll);
      this.lll.lIlI(this::lIIlI);
      this.llll.lIlI(this::IIIIlI);
      this.lIl.lIlI(this::IIIll);
      this.II.lIlI(this::Illll);
      this.lII.lIlI(this::II);
      this.llII.lIlI(this::IIIlIl);
      IIllI = this;
   }

   private boolean IIlll() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/IIlllllII.IlIII Lk74/x/IllIII;
      // 04: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 07: getstatic k74/x/IIIIlIII.II Lk74/x/IIIIlIII;
      // 0a: if_acmpeq 2c
      // 0d: aload 0
      // 0e: getfield k74/x/IIlllllII.IIIl Lk74/x/lllIIlII;
      // 11: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 14: checkcast java/lang/Boolean
      // 17: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1a: ifeq 2c
      // 1d: goto 24
      // 20: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23: athrow
      // 24: bipush 1
      // 25: goto 2d
      // 28: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b: athrow
      // 2c: bipush 0
      // 2d: ireturn
   }

   private CompletableFuture<Object> IllII(class_310 var1, String var2) {
      String var3 = var2.trim();
      this.IIIIll(var3);
      return this.IIlI.computeIfAbsent(var3, this::Illl);
   }

   private boolean IllIl(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 12
      // 04: aload 1
      // 05: invokevirtual java/lang/String.isBlank ()Z
      // 08: ifeq 18
      // 0b: goto 12
      // 0e: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11: athrow
      // 12: bipush 0
      // 13: ireturn
      // 14: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: aload 1
      // 19: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 1c: invokestatic java/net/URI.create (Ljava/lang/String;)Ljava/net/URI;
      // 1f: astore 2
      // 20: aload 2
      // 21: invokevirtual java/net/URI.getScheme ()Ljava/lang/String;
      // 24: astore 3
      // 25: ldc_w 1674633728
      // 28: ldc_w 1314399440
      // 2b: ldc_w 1046579289
      // 2e: ixor
      // 2f: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 32: ldc_w 1674633729
      // 35: ldc_w 1314399440
      // 38: ldc_w -1504729555
      // 3b: ixor
      // 3c: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 3f: invokestatic k74/x/IIlllllII.IIllI (II)Ljava/lang/String;
      // 42: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 45: aload 3
      // 46: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 49: ifne 7a
      // 4c: ldc_w 1674633730
      // 4f: ldc_w 1314399440
      // 52: ldc_w 1532279260
      // 55: ixor
      // 56: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 59: ldc_w 1674633731
      // 5c: ldc_w 1314399440
      // 5f: ldc_w -1645513435
      // 62: ixor
      // 63: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 66: invokestatic k74/x/IIlllllII.IIllI (II)Ljava/lang/String;
      // 69: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 6c: aload 3
      // 6d: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 70: ifeq 90
      // 73: goto 7a
      // 76: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 79: athrow
      // 7a: aload 2
      // 7b: invokevirtual java/net/URI.getHost ()Ljava/lang/String;
      // 7e: ifnull 90
      // 81: goto 88
      // 84: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 87: athrow
      // 88: bipush 1
      // 89: goto 91
      // 8c: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8f: athrow
      // 90: bipush 0
      // 91: ireturn
      // 92: astore 2
      // 93: bipush 0
      // 94: ireturn
   }

   public boolean IlllI() {
      try {
         if (this.IlIII.IllI() == IIIIlIII.II) {
            return true;
         }
      } catch (IllegalArgumentException var1) {
         throw IlIIII(var1);
      }

      try {
         if (!this.IlIIl.isBlank()) {
            return true;
         }
      } catch (IllegalArgumentException var2) {
         throw IlIIII(var2);
      }

      return false;
   }

   private boolean Illll() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/IIlllllII.IlII Lk74/x/IllIII;
      // 04: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 07: getstatic k74/x/IIIlIIIl.I Lk74/x/IIIlIIIl;
      // 0a: if_acmpeq 2c
      // 0d: aload 0
      // 0e: getfield k74/x/IIlllllII.llll Lk74/x/lllIIlII;
      // 11: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 14: checkcast java/lang/Boolean
      // 17: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1a: ifeq 2c
      // 1d: goto 24
      // 20: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23: athrow
      // 24: bipush 1
      // 25: goto 2d
      // 28: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b: athrow
      // 2c: bipush 0
      // 2d: ireturn
   }

   private UUID lIIII(GameProfile param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnonnull 0a
      // 04: aconst_null
      // 05: areturn
      // 06: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09: athrow
      // 0a: aload 1
      // 0b: invokestatic k74/x/lIlIIIll.l (Lcom/mojang/authlib/GameProfile;)Ljava/util/UUID;
      // 0e: astore 2
      // 0f: aload 2
      // 10: ifnull 19
      // 13: aload 2
      // 14: areturn
      // 15: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: aload 1
      // 1a: invokestatic k74/x/lIlIIIll.Ill (Lcom/mojang/authlib/GameProfile;)Ljava/lang/String;
      // 1d: astore 3
      // 1e: aload 3
      // 1f: ifnull 30
      // 22: aload 3
      // 23: invokevirtual java/lang/String.isBlank ()Z
      // 26: ifeq 38
      // 29: goto 30
      // 2c: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f: athrow
      // 30: aconst_null
      // 31: goto 48
      // 34: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37: athrow
      // 38: aload 3
      // 39: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 3c: invokevirtual java/lang/String.toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
      // 3f: getstatic java/nio/charset/StandardCharsets.UTF_8 Ljava/nio/charset/Charset;
      // 42: invokevirtual java/lang/String.getBytes (Ljava/nio/charset/Charset;)[B
      // 45: invokestatic java/util/UUID.nameUUIDFromBytes ([B)Ljava/util/UUID;
      // 48: areturn
   }

   private String lIIIl(GameProfile param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual k74/x/IIlllllII.llIII ()V
      // 04: aload 0
      // 05: aload 1
      // 06: invokevirtual k74/x/IIlllllII.lIIII (Lcom/mojang/authlib/GameProfile;)Ljava/util/UUID;
      // 09: astore 2
      // 0a: aload 2
      // 0b: ifnonnull 17
      // 0e: aload 0
      // 0f: invokevirtual k74/x/IIlllllII.IIlIIl ()Ljava/lang/String;
      // 12: areturn
      // 13: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16: athrow
      // 17: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 1a: astore 3
      // 1b: aload 3
      // 1c: ifnull 7d
      // 1f: aload 3
      // 20: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 23: ifnull 7d
      // 26: goto 2d
      // 29: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c: athrow
      // 2d: aload 3
      // 2e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 31: invokevirtual net/minecraft/class_746.method_5667 ()Ljava/util/UUID;
      // 34: aload 2
      // 35: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
      // 38: ifeq 7d
      // 3b: goto 42
      // 3e: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41: athrow
      // 42: aload 0
      // 43: getfield k74/x/IIlllllII.IIll Ljava/util/Map;
      // 46: aload 2
      // 47: bipush 1
      // 48: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 4b: invokeinterface java/util/Map.putIfAbsent (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 50: pop
      // 51: aload 0
      // 52: getfield k74/x/IIlllllII.lIlI Ljava/util/concurrent/atomic/AtomicInteger;
      // 55: invokedynamic applyAsInt ()Ljava/util/function/IntUnaryOperator; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (I)I, k74/x/IIlllllII.IlIl (I)I, (I)I ]
      // 5a: invokevirtual java/util/concurrent/atomic/AtomicInteger.updateAndGet (Ljava/util/function/IntUnaryOperator;)I
      // 5d: pop
      // 5e: aload 0
      // 5f: invokevirtual k74/x/IIlllllII.IIlIIl ()Ljava/lang/String;
      // 62: astore 6
      // 64: new java/lang/StringBuilder
      // 67: dup
      // 68: invokespecial java/lang/StringBuilder.<init> ()V
      // 6b: aload 6
      // 6d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 70: ldc "1"
      // 72: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 75: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 78: areturn
      // 79: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7c: athrow
      // 7d: aload 0
      // 7e: getfield k74/x/IIlllllII.lIlI Ljava/util/concurrent/atomic/AtomicInteger;
      // 81: invokedynamic applyAsInt ()Ljava/util/function/IntUnaryOperator; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (I)I, k74/x/IIlllllII.lIIl (I)I, (I)I ]
      // 86: invokevirtual java/util/concurrent/atomic/AtomicInteger.updateAndGet (Ljava/util/function/IntUnaryOperator;)I
      // 89: pop
      // 8a: aload 0
      // 8b: getfield k74/x/IIlllllII.IIll Ljava/util/Map;
      // 8e: aload 2
      // 8f: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 94: checkcast java/lang/Integer
      // 97: astore 4
      // 99: aload 4
      // 9b: ifnonnull c4
      // 9e: aload 0
      // 9f: getfield k74/x/IIlllllII.lIlI Ljava/util/concurrent/atomic/AtomicInteger;
      // a2: invokevirtual java/util/concurrent/atomic/AtomicInteger.incrementAndGet ()I
      // a5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // a8: astore 4
      // aa: aload 0
      // ab: getfield k74/x/IIlllllII.IIll Ljava/util/Map;
      // ae: aload 2
      // af: aload 4
      // b1: invokeinterface java/util/Map.putIfAbsent (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // b6: checkcast java/lang/Integer
      // b9: astore 5
      // bb: aload 5
      // bd: ifnull c4
      // c0: aload 5
      // c2: astore 4
      // c4: aload 0
      // c5: invokevirtual k74/x/IIlllllII.IIlIIl ()Ljava/lang/String;
      // c8: aload 4
      // ca: astore 8
      // cc: astore 7
      // ce: new java/lang/StringBuilder
      // d1: dup
      // d2: invokespecial java/lang/StringBuilder.<init> ()V
      // d5: aload 7
      // d7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // da: aload 8
      // dc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // df: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // e2: areturn
   }

   private boolean lIIlI() {
      try {
         if (this.IlII.IllI() != IIIlIIIl.I) {
            return true;
         }
      } catch (IllegalArgumentException var1) {
         throw IlIIII(var1);
      }

      return false;
   }

   private class_640 lIIll(class_310 param1, String param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 2b
      // 04: aload 1
      // 05: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 08: ifnull 2b
      // 0b: goto 12
      // 0e: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11: athrow
      // 12: aload 2
      // 13: ifnull 2b
      // 16: goto 1d
      // 19: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: aload 2
      // 1e: invokevirtual java/lang/String.isBlank ()Z
      // 21: ifeq 31
      // 24: goto 2b
      // 27: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: aconst_null
      // 2c: areturn
      // 2d: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 30: athrow
      // 31: aload 1
      // 32: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 35: aload 2
      // 36: invokevirtual net/minecraft/class_634.method_73471 (Ljava/lang/String;)Lnet/minecraft/class_640;
      // 39: areturn
   }

   private static GameProfile lIlII(GameProfile var0, Throwable var1) {
      return var0;
   }

   private String lIlIl() {
      return this.IlIIl;
   }

   private static String Illlll(int var0, short var1, int var2) {
      int var7 = var0 ^ 472517404;
      char[] var6 = Illll[var7].toCharArray();
      StackTraceElement[] var8 = (StackTraceElement[])lIIII[var7];
      StackTraceElement[] var9;
      if (var8 != null) {
         var9 = var8;
      } else {
         var9 = new Throwable().getStackTrace();
         lIIII[var7] = var9;
      }

      StackTraceElement var10 = var9[1];
      int var4 = (var10.getClassName().hashCode() ^ var10.getMethodName().hashCode()) >> 16 ^ 41031;
      int var5 = 0;

      do {
         var6[var5] = (char)(var6[var5] ^ var5 ^ var2 ^ var4 ^ var0 ^ var1);
      } while (++var5 < var6.length);

      return new String(var6).intern();
   }

   private class_1657 lIllI(class_310 var1) {
      class_1657 var2 = null;
      double var3 = Double.MAX_VALUE;

      for (class_1657 var6 : this.lII(var1)) {
         if (var6 != var1.field_1724 && var6.method_5805()) {
            try {
               if (var6.method_31481()) {
                  continue;
               }
            } catch (IllegalArgumentException var9) {
               throw IlIIII(var9);
            }

            double var7 = var1.field_1724.method_5858(var6);
            if (var7 < var3) {
               var3 = var7;
               var2 = var6;
            }
         }
      }

      return var2;
   }

   private class_2561 l(class_2561 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/IIlllllII.IIIll Ljava/util/regex/Pattern;
      // 04: ifnull 1a
      // 07: aload 0
      // 08: getfield k74/x/IIlllllII.IIIIl Ljava/util/Map;
      // 0b: invokeinterface java/util/Map.isEmpty ()Z 1
      // 10: ifeq 20
      // 13: goto 1a
      // 16: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19: athrow
      // 1a: aload 1
      // 1b: areturn
      // 1c: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: aload 0
      // 21: aload 1
      // 22: invokevirtual k74/x/IIlllllII.IlIllI (Lnet/minecraft/class_2561;)Lk74/x/lIlIIll;
      // 25: astore 2
      // 26: aload 2
      // 27: invokevirtual k74/x/lIlIIll.l ()Z
      // 2a: ifeq 38
      // 2d: aload 2
      // 2e: invokevirtual k74/x/lIlIIll.I ()Lnet/minecraft/class_2561;
      // 31: goto 39
      // 34: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37: athrow
      // 38: aload 1
      // 39: areturn
   }

   private static GameProfile lIlll(Throwable var0) {
      return null;
   }

   private void llIII() {
      String var1 = this.IIlIIl();

      try {
         if (!var1.equals(this.IIlll)) {
            this.IIll.clear();
            this.lIlI.set(0);
            this.IIlll = var1;
            this.lIlI();
         }
      } catch (IllegalArgumentException var2) {
         throw IlIIII(var2);
      }
   }

   private void llIIl(class_1657 var1) {
      try {
         if (var1 == null) {
            return;
         }
      } catch (IllegalArgumentException var2) {
         throw IlIIII(var2);
      }

      this.IllI = var1.method_5667();
      this.lIIl = lIlIIIll.Ill(var1.method_7334());
   }

   private String llIlI(class_310 var1) {
      try {
         if (var1.field_1724 == null) {
            return "";
         }
      } catch (IllegalArgumentException var3) {
         throw IlIIII(var3);
      }

      if (this.IlIII.IllI() == IIIIlIII.lI) {
         class_1657 var2 = this.IllIII(var1);

         try {
            if (var2 != null) {
               this.llIIl(var2);
               return lIlIIIll.Ill(var2.method_7334());
            }
         } catch (IllegalArgumentException var4) {
            throw IlIIII(var4);
         }

         return this.lIIl;
      } else {
         return lIlIIIll.Ill(var1.field_1724.method_7334());
      }
   }

   public class_2561 llIll(GameProfile param1, class_2561 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokevirtual k74/x/IIlllllII.IIIIlIl ()Z
      // 004: ifeq 01d
      // 007: aload 2
      // 008: ifnull 01d
      // 00b: goto 012
      // 00e: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 011: athrow
      // 012: aload 1
      // 013: ifnonnull 023
      // 016: goto 01d
      // 019: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01c: athrow
      // 01d: aload 2
      // 01e: areturn
      // 01f: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 022: athrow
      // 023: aload 0
      // 024: getfield k74/x/IIlllllII.IlIII Lk74/x/IllIII;
      // 027: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 02a: getstatic k74/x/IIIIlIII.II Lk74/x/IIIIlIII;
      // 02d: if_acmpne 0cd
      // 030: aload 1
      // 031: invokestatic k74/x/lIlIIIll.Ill (Lcom/mojang/authlib/GameProfile;)Ljava/lang/String;
      // 034: astore 3
      // 035: aload 3
      // 036: ifnull 047
      // 039: aload 3
      // 03a: invokevirtual java/lang/String.isBlank ()Z
      // 03d: ifeq 04d
      // 040: goto 047
      // 043: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 046: athrow
      // 047: aload 2
      // 048: areturn
      // 049: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04c: athrow
      // 04d: aload 0
      // 04e: aload 1
      // 04f: invokevirtual k74/x/IIlllllII.lIIIl (Lcom/mojang/authlib/GameProfile;)Ljava/lang/String;
      // 052: astore 4
      // 054: aload 0
      // 055: getfield k74/x/IIlllllII.IlI Lk74/x/lllIIllI;
      // 058: invokevirtual k74/x/lllIIllI.II ()Lk74/x/IIIlIlIl;
      // 05b: invokevirtual k74/x/IIIlIlIl.lI ()Z
      // 05e: ifeq 064
      // 061: aload 3
      // 062: astore 4
      // 064: aload 0
      // 065: getfield k74/x/IIlllllII.IlII Lk74/x/IllIII;
      // 068: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 06b: getstatic k74/x/IIIlIIIl.I Lk74/x/IIIlIIIl;
      // 06e: if_acmpeq 0c4
      // 071: aload 4
      // 073: aload 0
      // 074: getfield k74/x/IIlllllII.IlII Lk74/x/IllIII;
      // 077: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 07a: checkcast k74/x/IIIlIIIl
      // 07d: aload 0
      // 07e: getfield k74/x/IIlllllII.lll Lk74/x/IllIII;
      // 081: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 084: checkcast k74/x/III
      // 087: aload 0
      // 088: getfield k74/x/IIlllllII.lIl Lk74/x/IllIII;
      // 08b: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 08e: checkcast k74/x/lIlIIlIl
      // 091: aload 0
      // 092: getfield k74/x/IIlllllII.II Lk74/x/IllIII;
      // 095: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 098: checkcast k74/x/IIllIl
      // 09b: aload 0
      // 09c: getfield k74/x/IIlllllII.lII Lk74/x/IllIII;
      // 09f: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 0a2: checkcast k74/x/IIIlllI
      // 0a5: aload 0
      // 0a6: getfield k74/x/IIlllllII.llII Lk74/x/IllIII;
      // 0a9: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 0ac: checkcast k74/x/lIlIIIIl
      // 0af: aload 0
      // 0b0: getfield k74/x/IIlllllII.llll Lk74/x/lllIIlII;
      // 0b3: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 0b6: checkcast java/lang/Boolean
      // 0b9: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0bc: invokestatic k74/x/lIlllll.lIlI (Ljava/lang/String;Lk74/x/IIIlIIIl;Lk74/x/III;Lk74/x/lIlIIlIl;Lk74/x/IIllIl;Lk74/x/IIIlllI;Lk74/x/lIlIIIIl;Z)Lnet/minecraft/class_2561;
      // 0bf: areturn
      // 0c0: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c3: athrow
      // 0c4: aload 0
      // 0c5: aload 2
      // 0c6: aload 3
      // 0c7: aload 4
      // 0c9: invokevirtual k74/x/IIlllllII.IIlII (Lnet/minecraft/class_2561;Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/class_2561;
      // 0cc: areturn
      // 0cd: aload 0
      // 0ce: aload 1
      // 0cf: invokevirtual k74/x/IIlllllII.lllI (Lcom/mojang/authlib/GameProfile;)Z
      // 0d2: ifne 0db
      // 0d5: aload 2
      // 0d6: areturn
      // 0d7: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0da: athrow
      // 0db: aload 0
      // 0dc: getfield k74/x/IIlllllII.IlII Lk74/x/IllIII;
      // 0df: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 0e2: getstatic k74/x/IIIlIIIl.I Lk74/x/IIIlIIIl;
      // 0e5: if_acmpeq 157
      // 0e8: aload 1
      // 0e9: invokestatic k74/x/lIlIIIll.Ill (Lcom/mojang/authlib/GameProfile;)Ljava/lang/String;
      // 0ec: astore 3
      // 0ed: aload 0
      // 0ee: getfield k74/x/IIlllllII.IlI Lk74/x/lllIIllI;
      // 0f1: invokevirtual k74/x/lllIIllI.II ()Lk74/x/IIIlIlIl;
      // 0f4: invokevirtual k74/x/IIIlIlIl.lI ()Z
      // 0f7: ifeq 102
      // 0fa: aload 3
      // 0fb: goto 106
      // 0fe: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 101: athrow
      // 102: aload 0
      // 103: invokevirtual k74/x/IIlllllII.ll ()Ljava/lang/String;
      // 106: astore 4
      // 108: aload 4
      // 10a: aload 0
      // 10b: getfield k74/x/IIlllllII.IlII Lk74/x/IllIII;
      // 10e: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 111: checkcast k74/x/IIIlIIIl
      // 114: aload 0
      // 115: getfield k74/x/IIlllllII.lll Lk74/x/IllIII;
      // 118: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 11b: checkcast k74/x/III
      // 11e: aload 0
      // 11f: getfield k74/x/IIlllllII.lIl Lk74/x/IllIII;
      // 122: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 125: checkcast k74/x/lIlIIlIl
      // 128: aload 0
      // 129: getfield k74/x/IIlllllII.II Lk74/x/IllIII;
      // 12c: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 12f: checkcast k74/x/IIllIl
      // 132: aload 0
      // 133: getfield k74/x/IIlllllII.lII Lk74/x/IllIII;
      // 136: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 139: checkcast k74/x/IIIlllI
      // 13c: aload 0
      // 13d: getfield k74/x/IIlllllII.llII Lk74/x/IllIII;
      // 140: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 143: checkcast k74/x/lIlIIIIl
      // 146: aload 0
      // 147: getfield k74/x/IIlllllII.llll Lk74/x/lllIIlII;
      // 14a: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 14d: checkcast java/lang/Boolean
      // 150: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 153: invokestatic k74/x/lIlllll.lIlI (Ljava/lang/String;Lk74/x/IIIlIIIl;Lk74/x/III;Lk74/x/lIlIIlIl;Lk74/x/IIllIl;Lk74/x/IIIlllI;Lk74/x/lIlIIIIl;Z)Lnet/minecraft/class_2561;
      // 156: areturn
      // 157: aload 0
      // 158: aload 2
      // 159: invokevirtual k74/x/IIlllllII.IlIIlI (Lnet/minecraft/class_2561;)Lnet/minecraft/class_2561;
      // 15c: areturn
   }

   private List<GameProfile> lllII(class_310 var1) {
      try {
         if (var1 == null) {
            return List.of();
         }
      } catch (IllegalArgumentException var9) {
         throw IlIIII(var9);
      }

      LinkedHashMap var2 = new LinkedHashMap();

      try {
         if (var1.field_1724 != null) {
            this.IIlIll(var2, var1.field_1724.method_7334());
         }
      } catch (IllegalArgumentException var7) {
         throw IlIIII(var7);
      }

      if (var1.field_1687 != null) {
         for (class_1657 var4 : var1.field_1687.method_18456()) {
            try {
               if (var4 != null) {
                  this.IIlIll(var2, var4.method_7334());
               }
            } catch (IllegalArgumentException var6) {
               throw IlIIII(var6);
            }
         }
      }

      if (var1.method_1562() != null) {
         for (class_640 var12 : var1.method_1562().method_2880()) {
            try {
               if (var12 != null) {
                  this.IIlIll(var2, var12.method_2966());
               }
            } catch (IllegalArgumentException var5) {
               throw IlIIII(var5);
            }
         }
      }

      ArrayList var11 = new ArrayList(var2.values());

      UUID var10000;
      label56: {
         try {
            if (var1.field_1724 == null) {
               var10000 = null;
               break label56;
            }
         } catch (IllegalArgumentException var8) {
            throw IlIIII(var8);
         }

         var10000 = var1.field_1724.method_5667();
      }

      UUID var13 = var10000;
      var11.sort(this::IlIlll);
      return var11;
   }

   private lIlIIll lllIl(class_2561 var1) {
      Object var2 = var1.method_10851();
      boolean var3 = false;
      class_2583 var4 = var1.method_10866();
      if (var2 instanceof class_8828 var5 && !this.I(var4)) {
         String var6 = var5.comp_737();
         String var7 = this.IlII(var6);
         if (!var6.equals(var7)) {
            var2 = class_8828.method_54232(var7);
            var3 = true;
         }
      }

      class_5250 var10 = class_5250.method_43477((class_7417)var2).method_10862(var4);

      for (class_2561 var12 : var1.method_10855()) {
         lIlIIll var8 = this.lllIl(var12);
         var10.method_10852(var8.I());
         var3 |= var8.l();
      }

      lIlIIll var10000;
      lIlIIll var10001;
      Object var10002;
      label27: {
         try {
            var10000 = new lIlIIll;
            var10001 = var10000;
            if (var3) {
               var10002 = var10;
               break label27;
            }
         } catch (IllegalArgumentException var9) {
            throw IlIIII(var9);
         }

         var10002 = var1;
      }

      var10001./* $VF: Unable to resugar constructor */<init>((class_2561)var10002, var3);
      return var10000;
   }

   private void llllI(class_310 var1) {
      ArrayList var3 = new ArrayList();
      LinkedHashMap var4 = new LinkedHashMap();
      String[] var10000 = IIllllIl.IIIIl();
      StringBuilder var5 = new StringBuilder();
      String[] var2 = var10000;

      for (GameProfile var7 : this.lllII(var1)) {
         String var8 = lIlIIIll.Ill(var7);
         if (var8 != null) {
            try {
               if (var8.isBlank() && var2 == null) {
                  continue;
               }
            } catch (IllegalArgumentException var14) {
               throw IlIIII(var14);
            }

            String var9 = this.lIIIl(var7);
            if (var9 != null && !var9.isBlank()) {
               try {
                  if (var8.equals(var9) && var2 == null) {
                     continue;
                  }
               } catch (IllegalArgumentException var13) {
                  throw IlIIII(var13);
               }

               var4.put(var8, var9);
               var3.add(new Illl(var8, var9));
               if (var2 != null) {
                  break;
               }
            }
         }
      }

      var3.sort(IIlllllII::llI);

      for (Illl var17 : var3) {
         var5.append(var17.I()).append('\u0000').append(var17.l()).append('\u0001');
         if (var2 != null) {
            break;
         }
      }

      String var16 = var5.toString();

      try {
         if (var16.equals(this.IlIlI)) {
            return;
         }
      } catch (IllegalArgumentException var12) {
         throw IlIIII(var12);
      }

      this.IlIlI = var16;
      this.IIIIl = Map.copyOf(var4);
      this.IIIll = this.lIII(var3);
      synchronized (this.IllIl) {
         this.IllIl.clear();
      }
   }

   private String lllll(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/IIlllllII.IIIll Ljava/util/regex/Pattern;
      // 04: astore 2
      // 05: aload 0
      // 06: getfield k74/x/IIlllllII.IIIIl Ljava/util/Map;
      // 09: astore 3
      // 0a: aload 2
      // 0b: ifnull 37
      // 0e: aload 3
      // 0f: invokeinterface java/util/Map.isEmpty ()Z 1
      // 14: ifne 37
      // 17: goto 1e
      // 1a: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: aload 1
      // 1f: ifnull 37
      // 22: goto 29
      // 25: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28: athrow
      // 29: aload 1
      // 2a: invokevirtual java/lang/String.isEmpty ()Z
      // 2d: ifeq 3d
      // 30: goto 37
      // 33: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36: athrow
      // 37: aload 1
      // 38: areturn
      // 39: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c: athrow
      // 3d: aload 1
      // 3e: invokevirtual java/lang/String.length ()I
      // 41: ldc_w 1674633788
      // 44: ldc_w -1712796527
      // 47: ldc_w -813380380
      // 4a: ixor
      // 4b: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 4e: if_icmpgt 81
      // 51: aload 0
      // 52: getfield k74/x/IIlllllII.IllIl Ljava/util/Map;
      // 55: dup
      // 56: astore 4
      // 58: monitorenter
      // 59: aload 0
      // 5a: getfield k74/x/IIlllllII.IllIl Ljava/util/Map;
      // 5d: aload 1
      // 5e: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 63: checkcast java/lang/String
      // 66: astore 5
      // 68: aload 5
      // 6a: ifnull 73
      // 6d: aload 5
      // 6f: aload 4
      // 71: monitorexit
      // 72: areturn
      // 73: aload 4
      // 75: monitorexit
      // 76: goto 81
      // 79: astore 6
      // 7b: aload 4
      // 7d: monitorexit
      // 7e: aload 6
      // 80: athrow
      // 81: aload 0
      // 82: aload 1
      // 83: aload 2
      // 84: aload 3
      // 85: invokevirtual k74/x/IIlllllII.IIll (Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;
      // 88: astore 4
      // 8a: aload 1
      // 8b: invokevirtual java/lang/String.length ()I
      // 8e: ldc_w 1674633789
      // 91: ldc_w -1712796527
      // 94: ldc_w -39799960
      // 97: ixor
      // 98: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 9b: if_icmpgt c1
      // 9e: aload 0
      // 9f: getfield k74/x/IIlllllII.IllIl Ljava/util/Map;
      // a2: dup
      // a3: astore 5
      // a5: monitorenter
      // a6: aload 0
      // a7: getfield k74/x/IIlllllII.IllIl Ljava/util/Map;
      // aa: aload 1
      // ab: aload 4
      // ad: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // b2: pop
      // b3: aload 5
      // b5: monitorexit
      // b6: goto c1
      // b9: astore 7
      // bb: aload 5
      // bd: monitorexit
      // be: aload 7
      // c0: athrow
      // c1: aload 4
      // c3: areturn
   }

   private static int IllllI(int var0, int var1) {
      int var2 = IlllI[var0 ^ 1674634076] ^ var1 ^ var0;
      var2 += 64251;
      var2 ^= 1025;
      var2 -= 41862;
      var2 ^= 51165;
      var2 -= 45825;
      var2 += 57793;
      var2 += 11332;
      var2 ^= 258;
      return var2 + 8388;
   }

   private String IIIIII() {
      String var1 = this.llIl.III().trim();

      try {
         if (var1.isEmpty()) {
            return this.IIlIIl();
         }
      } catch (IllegalArgumentException var2) {
         throw IlIIII(var2);
      }

      return var1;
   }

   private static GameProfile IIIIIl(GameProfile param0, HttpResponse param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w -2037087840
      // 003: istore 9
      // 005: aload 0
      // 006: astore 2
      // 007: aload 1
      // 008: invokeinterface java/net/http/HttpResponse.statusCode ()I 1
      // 00d: ldc_w 1674633790
      // 010: iload 9
      // 012: ldc_w 88846508
      // 015: ixor
      // 016: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 019: if_icmpne 042
      // 01c: aload 1
      // 01d: invokeinterface java/net/http/HttpResponse.body ()Ljava/lang/Object; 1
      // 022: ifnull 042
      // 025: goto 02c
      // 028: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02b: athrow
      // 02c: aload 1
      // 02d: invokeinterface java/net/http/HttpResponse.body ()Ljava/lang/Object; 1
      // 032: checkcast java/lang/String
      // 035: invokevirtual java/lang/String.isBlank ()Z
      // 038: ifeq 048
      // 03b: goto 042
      // 03e: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 041: athrow
      // 042: aload 2
      // 043: areturn
      // 044: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 047: athrow
      // 048: aload 1
      // 049: invokeinterface java/net/http/HttpResponse.body ()Ljava/lang/Object; 1
      // 04e: checkcast java/lang/String
      // 051: invokestatic com/google/gson/JsonParser.parseString (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 054: invokevirtual com/google/gson/JsonElement.getAsJsonObject ()Lcom/google/gson/JsonObject;
      // 057: astore 3
      // 058: aload 3
      // 059: ldc_w 1674633791
      // 05c: iload 9
      // 05e: ldc_w 1383776311
      // 061: ixor
      // 062: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 065: ldc_w 1674633784
      // 068: iload 9
      // 06a: ldc_w -936408052
      // 06d: ixor
      // 06e: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 071: invokestatic k74/x/IIlllllII.IIllI (II)Ljava/lang/String;
      // 074: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 077: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 07a: ifne 083
      // 07d: aload 2
      // 07e: areturn
      // 07f: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 082: athrow
      // 083: aload 3
      // 084: ldc_w 1674633785
      // 087: iload 9
      // 089: ldc_w 1134691194
      // 08c: ixor
      // 08d: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 090: ldc_w 1674633786
      // 093: iload 9
      // 095: ldc_w 481289791
      // 098: ixor
      // 099: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 09c: invokestatic k74/x/IIlllllII.IIllI (II)Ljava/lang/String;
      // 09f: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0a2: invokevirtual com/google/gson/JsonObject.getAsJsonArray (Ljava/lang/String;)Lcom/google/gson/JsonArray;
      // 0a5: invokevirtual com/google/gson/JsonArray.iterator ()Ljava/util/Iterator;
      // 0a8: astore 4
      // 0aa: aload 4
      // 0ac: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0b1: ifeq 1fe
      // 0b4: aload 4
      // 0b6: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0bb: checkcast com/google/gson/JsonElement
      // 0be: astore 5
      // 0c0: aload 5
      // 0c2: invokevirtual com/google/gson/JsonElement.isJsonObject ()Z
      // 0c5: ifne 0cf
      // 0c8: goto 0aa
      // 0cb: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ce: athrow
      // 0cf: aload 5
      // 0d1: invokevirtual com/google/gson/JsonElement.getAsJsonObject ()Lcom/google/gson/JsonObject;
      // 0d4: astore 6
      // 0d6: aload 6
      // 0d8: ldc_w 1674633787
      // 0db: iload 9
      // 0dd: ldc_w 1637840977
      // 0e0: ixor
      // 0e1: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 0e4: ldc_w 1674633780
      // 0e7: iload 9
      // 0e9: ldc_w 1078662085
      // 0ec: ixor
      // 0ed: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 0f0: invokestatic k74/x/IIlllllII.IIllI (II)Ljava/lang/String;
      // 0f3: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0f6: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 0f9: ifeq 0aa
      // 0fc: aload 6
      // 0fe: ldc_w 1674633781
      // 101: iload 9
      // 103: ldc_w 453604767
      // 106: ixor
      // 107: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 10a: ldc_w 1674633782
      // 10d: iload 9
      // 10f: ldc_w 641692485
      // 112: ixor
      // 113: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 116: invokestatic k74/x/IIlllllII.IIllI (II)Ljava/lang/String;
      // 119: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 11c: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 11f: ifne 129
      // 122: goto 0aa
      // 125: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 128: athrow
      // 129: aload 6
      // 12b: ldc_w 1674633783
      // 12e: iload 9
      // 130: ldc_w -1124874375
      // 133: ixor
      // 134: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 137: ldc_w 1674633776
      // 13a: iload 9
      // 13c: ldc_w 1236747039
      // 13f: ixor
      // 140: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 143: invokestatic k74/x/IIlllllII.IIllI (II)Ljava/lang/String;
      // 146: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 149: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 14c: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 14f: astore 7
      // 151: aload 6
      // 153: ldc_w 1674633777
      // 156: iload 9
      // 158: ldc_w -514462944
      // 15b: ixor
      // 15c: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 15f: ldc_w 1674633778
      // 162: iload 9
      // 164: ldc_w 983982320
      // 167: ixor
      // 168: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 16b: invokestatic k74/x/IIlllllII.IIllI (II)Ljava/lang/String;
      // 16e: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 171: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 174: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 177: astore 8
      // 179: aload 8
      // 17b: invokevirtual java/lang/String.isBlank ()Z
      // 17e: ifeq 188
      // 181: goto 0aa
      // 184: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 187: athrow
      // 188: aload 6
      // 18a: ldc_w 1674633779
      // 18d: iload 9
      // 18f: ldc_w -568134494
      // 192: ixor
      // 193: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 196: ldc_w 1674633772
      // 199: iload 9
      // 19b: ldc_w 1483063956
      // 19e: ixor
      // 19f: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 1a2: invokestatic k74/x/IIlllllII.IIllI (II)Ljava/lang/String;
      // 1a5: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 1a8: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 1ab: ifeq 1e9
      // 1ae: aload 2
      // 1af: aload 7
      // 1b1: new com/mojang/authlib/properties/Property
      // 1b4: dup
      // 1b5: aload 7
      // 1b7: aload 8
      // 1b9: aload 6
      // 1bb: ldc_w 1674633773
      // 1be: iload 9
      // 1c0: ldc_w 841931000
      // 1c3: ixor
      // 1c4: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 1c7: ldc_w 1674633774
      // 1ca: iload 9
      // 1cc: ldc_w -2044957906
      // 1cf: ixor
      // 1d0: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 1d3: invokestatic k74/x/IIlllllII.IIllI (II)Ljava/lang/String;
      // 1d6: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 1d9: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 1dc: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 1df: invokespecial com/mojang/authlib/properties/Property.<init> (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
      // 1e2: invokestatic k74/x/lIlIIIll.III (Lcom/mojang/authlib/GameProfile;Ljava/lang/String;Lcom/mojang/authlib/properties/Property;)Lcom/mojang/authlib/GameProfile;
      // 1e5: astore 2
      // 1e6: goto 1fb
      // 1e9: aload 2
      // 1ea: aload 7
      // 1ec: new com/mojang/authlib/properties/Property
      // 1ef: dup
      // 1f0: aload 7
      // 1f2: aload 8
      // 1f4: invokespecial com/mojang/authlib/properties/Property.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 1f7: invokestatic k74/x/lIlIIIll.III (Lcom/mojang/authlib/GameProfile;Ljava/lang/String;Lcom/mojang/authlib/properties/Property;)Lcom/mojang/authlib/GameProfile;
      // 1fa: astore 2
      // 1fb: goto 0aa
      // 1fe: aload 2
      // 1ff: areturn
   }

   private boolean IIIIlI() {
      try {
         if (this.IlII.IllI() != IIIlIIIl.I) {
            return true;
         }
      } catch (IllegalArgumentException var1) {
         throw IlIIII(var1);
      }

      return false;
   }

   private void IIIIll(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/IIlllllII.IIlI Ljava/util/Map;
      // 04: invokeinterface java/util/Map.size ()I 1
      // 09: ldc_w 1674633775
      // 0c: ldc_w -1333126391
      // 0f: ldc_w 737733253
      // 12: ixor
      // 13: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 16: if_icmplt 2d
      // 19: aload 0
      // 1a: getfield k74/x/IIlllllII.IIlI Ljava/util/Map;
      // 1d: aload 1
      // 1e: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 23: ifeq 32
      // 26: goto 2d
      // 29: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c: athrow
      // 2d: return
      // 2e: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getfield k74/x/IIlllllII.IIlI Ljava/util/Map;
      // 36: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 3b: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 40: astore 2
      // 41: aload 2
      // 42: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 47: ifeq 61
      // 4a: aload 0
      // 4b: getfield k74/x/IIlllllII.IIlI Ljava/util/Map;
      // 4e: aload 2
      // 4f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 54: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 59: pop
      // 5a: goto 61
      // 5d: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 60: athrow
      // 61: return
   }

   private Object IIIlII(String param1, byte[] param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w -1410655539
      // 003: istore 14
      // 005: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 008: astore 3
      // 009: aload 3
      // 00a: ifnull 01b
      // 00d: aload 3
      // 00e: invokevirtual net/minecraft/class_310.method_1531 ()Lnet/minecraft/class_1060;
      // 011: ifnonnull 021
      // 014: goto 01b
      // 017: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01a: athrow
      // 01b: aconst_null
      // 01c: areturn
      // 01d: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 020: athrow
      // 021: new java/io/ByteArrayInputStream
      // 024: dup
      // 025: aload 2
      // 026: invokespecial java/io/ByteArrayInputStream.<init> ([B)V
      // 029: astore 5
      // 02b: aload 5
      // 02d: invokestatic net/minecraft/class_1011.method_4309 (Ljava/io/InputStream;)Lnet/minecraft/class_1011;
      // 030: astore 4
      // 032: aload 5
      // 034: invokevirtual java/io/ByteArrayInputStream.close ()V
      // 037: goto 050
      // 03a: astore 6
      // 03c: aload 5
      // 03e: invokevirtual java/io/ByteArrayInputStream.close ()V
      // 041: goto 04d
      // 044: astore 7
      // 046: aload 6
      // 048: aload 7
      // 04a: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 04d: aload 6
      // 04f: athrow
      // 050: goto 057
      // 053: astore 5
      // 055: aconst_null
      // 056: areturn
      // 057: aload 0
      // 058: aload 4
      // 05a: invokevirtual k74/x/IIlllllII.lIl (Lnet/minecraft/class_1011;)Z
      // 05d: ifne 06b
      // 060: aload 4
      // 062: invokevirtual net/minecraft/class_1011.close ()V
      // 065: aconst_null
      // 066: areturn
      // 067: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06a: athrow
      // 06b: ldc_w 1674633768
      // 06e: iload 14
      // 070: ldc_w 921019763
      // 073: ixor
      // 074: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 077: ldc_w 1674633769
      // 07a: iload 14
      // 07c: ldc_w -104600291
      // 07f: ixor
      // 080: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 083: invokestatic k74/x/IIlllllII.IIllI (II)Ljava/lang/String;
      // 086: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 089: ldc_w 1674633770
      // 08c: iload 14
      // 08e: ldc_w 1764507646
      // 091: ixor
      // 092: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 095: ldc_w 1674633771
      // 098: iload 14
      // 09a: ldc_w -1057687910
      // 09d: ixor
      // 09e: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 0a1: invokestatic k74/x/IIlllllII.IIllI (II)Ljava/lang/String;
      // 0a4: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0a7: aload 1
      // 0a8: invokevirtual java/lang/String.hashCode ()I
      // 0ab: invokestatic java/lang/Integer.toUnsignedString (I)Ljava/lang/String;
      // 0ae: ldc_w 1674633764
      // 0b1: iload 14
      // 0b3: ldc_w 1018995921
      // 0b6: ixor
      // 0b7: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 0ba: ldc_w 1674633765
      // 0bd: iload 14
      // 0bf: ldc_w -194611343
      // 0c2: ixor
      // 0c3: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 0c6: invokestatic k74/x/IIlllllII.IIllI (II)Ljava/lang/String;
      // 0c9: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0cc: aload 4
      // 0ce: invokevirtual net/minecraft/class_1011.method_4307 ()I
      // 0d1: ldc_w 1674633766
      // 0d4: iload 14
      // 0d6: ldc_w 1901285784
      // 0d9: ixor
      // 0da: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 0dd: ldc_w 1674633767
      // 0e0: iload 14
      // 0e2: ldc_w -1548545383
      // 0e5: ixor
      // 0e6: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 0e9: invokestatic k74/x/IIlllllII.IIllI (II)Ljava/lang/String;
      // 0ec: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0ef: aload 4
      // 0f1: invokevirtual net/minecraft/class_1011.method_4323 ()I
      // 0f4: istore 13
      // 0f6: astore 12
      // 0f8: istore 11
      // 0fa: astore 10
      // 0fc: astore 9
      // 0fe: astore 8
      // 100: new java/lang/StringBuilder
      // 103: dup
      // 104: invokespecial java/lang/StringBuilder.<init> ()V
      // 107: aload 8
      // 109: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 10c: aload 9
      // 10e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 111: aload 10
      // 113: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 116: iload 11
      // 118: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 11b: aload 12
      // 11d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 120: iload 13
      // 122: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 125: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 128: invokestatic net/minecraft/class_2960.method_60655 (Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/class_2960;
      // 12b: astore 5
      // 12d: aload 3
      // 12e: invokevirtual net/minecraft/class_310.method_1531 ()Lnet/minecraft/class_1060;
      // 131: aload 5
      // 133: new net/minecraft/class_1043
      // 136: dup
      // 137: aload 5
      // 139: dup
      // 13a: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 13d: pop
      // 13e: invokedynamic get (Lnet/minecraft/class_2960;)Ljava/util/function/Supplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, net/minecraft/class_2960.toString ()Ljava/lang/String;, ()Ljava/lang/String; ]
      // 143: aload 4
      // 145: invokespecial net/minecraft/class_1043.<init> (Ljava/util/function/Supplier;Lnet/minecraft/class_1011;)V
      // 148: invokevirtual net/minecraft/class_1060.method_4616 (Lnet/minecraft/class_2960;Lnet/minecraft/class_1044;)V
      // 14b: new net/minecraft/class_12079$class_10726
      // 14e: dup
      // 14f: aload 5
      // 151: aload 5
      // 153: invokespecial net/minecraft/class_12079$class_10726.<init> (Lnet/minecraft/class_2960;Lnet/minecraft/class_2960;)V
      // 156: astore 6
      // 158: new net/minecraft/class_8685
      // 15b: dup
      // 15c: aload 6
      // 15e: aconst_null
      // 15f: aconst_null
      // 160: getstatic net/minecraft/class_7920.field_41123 Lnet/minecraft/class_7920;
      // 163: bipush 0
      // 164: invokespecial net/minecraft/class_8685.<init> (Lnet/minecraft/class_12079$class_12081;Lnet/minecraft/class_12079$class_12081;Lnet/minecraft/class_12079$class_12081;Lnet/minecraft/class_7920;Z)V
      // 167: areturn
   }

   private boolean IIIlIl() {
      try {
         if (this.IlII.IllI() != IIIlIIIl.I) {
            return true;
         }
      } catch (IllegalArgumentException var1) {
         throw IlIIII(var1);
      }

      return false;
   }

   private void IIIllI(class_310 var1, String var2, Object var3, Throwable var4) {
      var1.execute(this::IIIlI);
   }

   private void IIIlll(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield k74/x/IIlllllII.IlIII Lk74/x/IllIII;
      // 004: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 007: getstatic k74/x/IIIIlIII.II Lk74/x/IIIIlIII;
      // 00a: if_acmpeq 016
      // 00d: aload 0
      // 00e: invokevirtual k74/x/IIlllllII.lIlI ()V
      // 011: return
      // 012: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 015: athrow
      // 016: aload 0
      // 017: invokevirtual k74/x/IIlllllII.llIII ()V
      // 01a: bipush 0
      // 01b: istore 2
      // 01c: aload 0
      // 01d: getfield k74/x/IIlllllII.IIll Ljava/util/Map;
      // 020: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 025: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 02a: astore 3
      // 02b: aload 3
      // 02c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 031: ifeq 05d
      // 034: aload 3
      // 035: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 03a: checkcast java/lang/Integer
      // 03d: astore 4
      // 03f: aload 4
      // 041: ifnull 05a
      // 044: aload 4
      // 046: invokevirtual java/lang/Integer.intValue ()I
      // 049: iload 2
      // 04a: if_icmple 05a
      // 04d: goto 054
      // 050: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 053: athrow
      // 054: aload 4
      // 056: invokevirtual java/lang/Integer.intValue ()I
      // 059: istore 2
      // 05a: goto 02b
      // 05d: aload 1
      // 05e: ifnull 08a
      // 061: aload 1
      // 062: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 065: ifnull 08a
      // 068: goto 06f
      // 06b: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06e: athrow
      // 06f: aload 0
      // 070: getfield k74/x/IIlllllII.IIll Ljava/util/Map;
      // 073: aload 1
      // 074: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 077: invokevirtual net/minecraft/class_746.method_5667 ()Ljava/util/UUID;
      // 07a: bipush 1
      // 07b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 07e: invokeinterface java/util/Map.putIfAbsent (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 083: pop
      // 084: iload 2
      // 085: bipush 1
      // 086: invokestatic java/lang/Math.max (II)I
      // 089: istore 2
      // 08a: aload 0
      // 08b: aload 1
      // 08c: invokevirtual k74/x/IIlllllII.lllII (Lnet/minecraft/class_310;)Ljava/util/List;
      // 08f: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 094: astore 3
      // 095: aload 3
      // 096: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 09b: ifeq 110
      // 09e: aload 3
      // 09f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0a4: checkcast com/mojang/authlib/GameProfile
      // 0a7: astore 4
      // 0a9: aload 0
      // 0aa: aload 4
      // 0ac: invokevirtual k74/x/IIlllllII.lIIII (Lcom/mojang/authlib/GameProfile;)Ljava/util/UUID;
      // 0af: astore 5
      // 0b1: aload 5
      // 0b3: ifnull 095
      // 0b6: aload 1
      // 0b7: ifnull 0e5
      // 0ba: aload 1
      // 0bb: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0be: ifnull 0e5
      // 0c1: goto 0c8
      // 0c4: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c7: athrow
      // 0c8: aload 1
      // 0c9: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0cc: invokevirtual net/minecraft/class_746.method_5667 ()Ljava/util/UUID;
      // 0cf: aload 5
      // 0d1: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
      // 0d4: ifeq 0e5
      // 0d7: goto 0de
      // 0da: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0dd: athrow
      // 0de: goto 095
      // 0e1: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e4: athrow
      // 0e5: aload 0
      // 0e6: getfield k74/x/IIlllllII.IIll Ljava/util/Map;
      // 0e9: aload 5
      // 0eb: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 0f0: ifne 10d
      // 0f3: aload 0
      // 0f4: getfield k74/x/IIlllllII.IIll Ljava/util/Map;
      // 0f7: aload 5
      // 0f9: iinc 2 1
      // 0fc: iload 2
      // 0fd: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 100: invokeinterface java/util/Map.putIfAbsent (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 105: pop
      // 106: goto 10d
      // 109: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10c: athrow
      // 10d: goto 095
      // 110: iload 2
      // 111: istore 3
      // 112: aload 0
      // 113: getfield k74/x/IIlllllII.lIlI Ljava/util/concurrent/atomic/AtomicInteger;
      // 116: iload 3
      // 117: invokedynamic applyAsInt (I)Ljava/util/function/IntUnaryOperator; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (I)I, k74/x/IIlllllII.Il (II)I, (I)I ]
      // 11c: invokevirtual java/util/concurrent/atomic/AtomicInteger.updateAndGet (Ljava/util/function/IntUnaryOperator;)I
      // 11f: pop
      // 120: aload 0
      // 121: aload 1
      // 122: invokevirtual k74/x/IIlllllII.llllI (Lnet/minecraft/class_310;)V
      // 125: return
   }

   @Override
   public void IlIII() {
      this.IIlI.clear();
      this.Il = "";
      this.lIII = "";
      this.Illl = "";
      this.lIll = null;
      this.IlIIl = "";
      this.IIl = "";
      this.IlIl = 0L;
      this.IllI = null;
      this.lIIl = "";
      this.IIll.clear();
      this.lIlI.set(0);
      this.IIlll = "";
      this.lIlI();
   }

   private CompletionStage IIlIII(class_310 param1, String param2, HttpResponse param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 3
      // 01: invokeinterface java/net/http/HttpResponse.statusCode ()I 1
      // 06: ldc_w 1674633760
      // 09: ldc_w 1162312036
      // 0c: ldc_w 161604188
      // 0f: ixor
      // 10: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 13: if_icmplt 78
      // 16: aload 3
      // 17: invokeinterface java/net/http/HttpResponse.statusCode ()I 1
      // 1c: ldc_w 1674633761
      // 1f: ldc_w 1162312036
      // 22: ldc_w -973324308
      // 25: ixor
      // 26: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 29: if_icmpge 78
      // 2c: goto 33
      // 2f: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32: athrow
      // 33: aload 3
      // 34: invokeinterface java/net/http/HttpResponse.body ()Ljava/lang/Object; 1
      // 39: ifnull 78
      // 3c: goto 43
      // 3f: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 42: athrow
      // 43: aload 3
      // 44: invokeinterface java/net/http/HttpResponse.body ()Ljava/lang/Object; 1
      // 49: checkcast [B
      // 4c: arraylength
      // 4d: ifeq 78
      // 50: goto 57
      // 53: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 56: athrow
      // 57: aload 3
      // 58: invokeinterface java/net/http/HttpResponse.body ()Ljava/lang/Object; 1
      // 5d: checkcast [B
      // 60: arraylength
      // 61: ldc_w 1674633762
      // 64: ldc_w 1162312036
      // 67: ldc_w 787756221
      // 6a: ixor
      // 6b: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 6e: if_icmple 81
      // 71: goto 78
      // 74: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 77: athrow
      // 78: aconst_null
      // 79: invokestatic java/util/concurrent/CompletableFuture.completedFuture (Ljava/lang/Object;)Ljava/util/concurrent/CompletableFuture;
      // 7c: areturn
      // 7d: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 80: athrow
      // 81: new java/util/concurrent/CompletableFuture
      // 84: dup
      // 85: invokespecial java/util/concurrent/CompletableFuture.<init> ()V
      // 88: astore 4
      // 8a: aload 1
      // 8b: aload 0
      // 8c: aload 4
      // 8e: aload 2
      // 8f: aload 3
      // 90: invokedynamic run (Lk74/x/IIlllllII;Ljava/util/concurrent/CompletableFuture;Ljava/lang/String;Ljava/net/http/HttpResponse;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, k74/x/IIlllllII.llII (Ljava/util/concurrent/CompletableFuture;Ljava/lang/String;Ljava/net/http/HttpResponse;)V, ()V ]
      // 95: invokevirtual net/minecraft/class_310.execute (Ljava/lang/Runnable;)V
      // 98: goto a4
      // 9b: astore 5
      // 9d: aload 4
      // 9f: aconst_null
      // a0: invokevirtual java/util/concurrent/CompletableFuture.complete (Ljava/lang/Object;)Z
      // a3: pop
      // a4: aload 4
      // a6: areturn
   }

   public String IIlIIl() {
      String var1 = this.IlI.III().trim();

      try {
         if (var1.isEmpty()) {
            return IlIIllIII.lI(IIllI(IllllI(1674633763, -620117417 ^ 201528876), IllllI(1674633948, -620117417 ^ -1950331333)));
         }
      } catch (IllegalArgumentException var2) {
         throw IlIIII(var2);
      }

      return var1;
   }

   private class_1657 IIlIlI(class_310 param1, String param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 2b
      // 04: aload 1
      // 05: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 08: ifnull 2b
      // 0b: goto 12
      // 0e: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11: athrow
      // 12: aload 2
      // 13: ifnull 2b
      // 16: goto 1d
      // 19: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: aload 2
      // 1e: invokevirtual java/lang/String.isBlank ()Z
      // 21: ifeq 31
      // 24: goto 2b
      // 27: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: aconst_null
      // 2c: areturn
      // 2d: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 30: athrow
      // 31: aload 1
      // 32: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 35: invokevirtual net/minecraft/class_638.method_18456 ()Ljava/util/List;
      // 38: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 3d: astore 3
      // 3e: aload 3
      // 3f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 44: ifeq 92
      // 47: aload 3
      // 48: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 4d: checkcast net/minecraft/class_1657
      // 50: astore 4
      // 52: aload 4
      // 54: ifnull 3e
      // 57: aload 4
      // 59: invokevirtual net/minecraft/class_1657.method_7334 ()Lcom/mojang/authlib/GameProfile;
      // 5c: ifnonnull 66
      // 5f: goto 3e
      // 62: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 65: athrow
      // 66: aload 4
      // 68: invokevirtual net/minecraft/class_1657.method_7334 ()Lcom/mojang/authlib/GameProfile;
      // 6b: invokestatic k74/x/lIlIIIll.Ill (Lcom/mojang/authlib/GameProfile;)Ljava/lang/String;
      // 6e: astore 5
      // 70: aload 5
      // 72: invokevirtual java/lang/String.isBlank ()Z
      // 75: ifne 8f
      // 78: aload 5
      // 7a: aload 2
      // 7b: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 7e: ifeq 8f
      // 81: goto 88
      // 84: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 87: athrow
      // 88: aload 4
      // 8a: areturn
      // 8b: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8e: athrow
      // 8f: goto 3e
      // 92: aconst_null
      // 93: areturn
   }

   private void IIlIll(Map<UUID, GameProfile> param1, GameProfile param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 2
      // 02: invokevirtual k74/x/IIlllllII.lIIII (Lcom/mojang/authlib/GameProfile;)Ljava/util/UUID;
      // 05: astore 3
      // 06: aload 2
      // 07: invokestatic k74/x/lIlIIIll.Ill (Lcom/mojang/authlib/GameProfile;)Ljava/lang/String;
      // 0a: astore 4
      // 0c: aload 3
      // 0d: ifnull 2b
      // 10: aload 4
      // 12: ifnull 2b
      // 15: goto 1c
      // 18: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b: athrow
      // 1c: aload 4
      // 1e: invokevirtual java/lang/String.isBlank ()Z
      // 21: ifeq 30
      // 24: goto 2b
      // 27: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: return
      // 2c: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f: athrow
      // 30: aload 1
      // 31: aload 3
      // 32: aload 2
      // 33: invokeinterface java/util/Map.putIfAbsent (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 38: pop
      // 39: return
   }

   private CompletableFuture<Object> IIllII(class_310 var1, String var2) {
      HttpRequest var3;
      try {
         var3 = HttpRequest.newBuilder(URI.create(var2)).timeout(Duration.ofSeconds(8L)).header(IIIII.llIl(), ll.llIl()).GET().build();
      } catch (IllegalArgumentException var5) {
         return CompletableFuture.completedFuture(null);
      }

      return lI.sendAsync(var3, BodyHandlers.ofByteArray()).thenCompose(this::IIlIII).exceptionally(IIlllllII::IIllll);
   }

   private GameProfile IIllIl(HttpResponse param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w -1789018369
      // 003: istore 4
      // 005: aload 1
      // 006: invokeinterface java/net/http/HttpResponse.statusCode ()I 1
      // 00b: ldc_w 1674633949
      // 00e: iload 4
      // 010: ldc_w -1279809909
      // 013: ixor
      // 014: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 017: if_icmpne 040
      // 01a: aload 1
      // 01b: invokeinterface java/net/http/HttpResponse.body ()Ljava/lang/Object; 1
      // 020: ifnull 040
      // 023: goto 02a
      // 026: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 029: athrow
      // 02a: aload 1
      // 02b: invokeinterface java/net/http/HttpResponse.body ()Ljava/lang/Object; 1
      // 030: checkcast java/lang/String
      // 033: invokevirtual java/lang/String.isBlank ()Z
      // 036: ifeq 046
      // 039: goto 040
      // 03c: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03f: athrow
      // 040: aconst_null
      // 041: areturn
      // 042: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 045: athrow
      // 046: aload 1
      // 047: invokeinterface java/net/http/HttpResponse.body ()Ljava/lang/Object; 1
      // 04c: checkcast java/lang/String
      // 04f: invokestatic com/google/gson/JsonParser.parseString (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 052: invokevirtual com/google/gson/JsonElement.getAsJsonObject ()Lcom/google/gson/JsonObject;
      // 055: astore 2
      // 056: aload 2
      // 057: ldc_w 1674633950
      // 05a: iload 4
      // 05c: ldc_w -1939127434
      // 05f: ixor
      // 060: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 063: ldc_w 1674633951
      // 066: iload 4
      // 068: ldc_w -611988180
      // 06b: ixor
      // 06c: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 06f: invokestatic k74/x/IIlllllII.IIllI (II)Ljava/lang/String;
      // 072: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 075: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 078: ifeq 0a7
      // 07b: aload 2
      // 07c: ldc_w 1674633944
      // 07f: iload 4
      // 081: ldc_w 1515437477
      // 084: ixor
      // 085: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 088: ldc_w 1674633945
      // 08b: iload 4
      // 08d: ldc_w -1501481970
      // 090: ixor
      // 091: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 094: invokestatic k74/x/IIlllllII.IIllI (II)Ljava/lang/String;
      // 097: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 09a: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 09d: ifne 0ad
      // 0a0: goto 0a7
      // 0a3: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a6: athrow
      // 0a7: aconst_null
      // 0a8: areturn
      // 0a9: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ac: athrow
      // 0ad: aload 0
      // 0ae: aload 2
      // 0af: ldc_w 1674633946
      // 0b2: iload 4
      // 0b4: ldc_w -1572196667
      // 0b7: ixor
      // 0b8: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 0bb: ldc_w 1674633947
      // 0be: iload 4
      // 0c0: ldc_w 10775854
      // 0c3: ixor
      // 0c4: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 0c7: invokestatic k74/x/IIlllllII.IIllI (II)Ljava/lang/String;
      // 0ca: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0cd: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 0d0: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 0d3: invokevirtual k74/x/IIlllllII.IIl (Ljava/lang/String;)Ljava/util/UUID;
      // 0d6: astore 3
      // 0d7: aload 3
      // 0d8: ifnonnull 0e1
      // 0db: aconst_null
      // 0dc: areturn
      // 0dd: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e0: athrow
      // 0e1: new com/mojang/authlib/GameProfile
      // 0e4: dup
      // 0e5: aload 3
      // 0e6: aload 2
      // 0e7: ldc_w 1674633940
      // 0ea: iload 4
      // 0ec: ldc_w -1808004470
      // 0ef: ixor
      // 0f0: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 0f3: ldc_w 1674633941
      // 0f6: iload 4
      // 0f8: ldc_w 375786658
      // 0fb: ixor
      // 0fc: invokestatic k74/x/IIlllllII.IllllI (II)I
      // 0ff: invokestatic k74/x/IIlllllII.IIllI (II)Ljava/lang/String;
      // 102: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 105: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 108: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 10b: invokespecial com/mojang/authlib/GameProfile.<init> (Ljava/util/UUID;Ljava/lang/String;)V
      // 10e: areturn
   }

   public static IIlllllII IIlllI() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic k74/x/IIlllllII.IIllI Lk74/x/IIlllllII;
      // 03: astore 0
      // 04: aload 0
      // 05: ifnull 1e
      // 08: aload 0
      // 09: invokevirtual k74/x/IIlllllII.IIIIlIl ()Z
      // 0c: ifeq 1e
      // 0f: goto 16
      // 12: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: goto 1f
      // 1a: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: aconst_null
      // 1f: areturn
   }

   private static Object IIllll(Throwable var0) {
      return null;
   }

   private static Throwable IlIIII(Throwable var0) {
      return var0;
   }

   private void IlIIIl(String var1, CompletableFuture var2, Object var3) {
      try {
         if (var3 == null) {
            this.IIlI.remove(var1, var2);
         }
      } catch (IllegalArgumentException var4) {
         throw IlIIII(var4);
      }
   }

   public class_2561 IlIIlI(class_2561 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual k74/x/IIlllllII.IIIIlIl ()Z
      // 04: ifeq 12
      // 07: aload 1
      // 08: ifnonnull 18
      // 0b: goto 12
      // 0e: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11: athrow
      // 12: aload 1
      // 13: areturn
      // 14: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: aload 0
      // 19: getfield k74/x/IIlllllII.IlIII Lk74/x/IllIII;
      // 1c: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 1f: getstatic k74/x/IIIIlIII.II Lk74/x/IIIIlIII;
      // 22: if_acmpne 2f
      // 25: aload 0
      // 26: aload 1
      // 27: invokevirtual k74/x/IIlllllII.l (Lnet/minecraft/class_2561;)Lnet/minecraft/class_2561;
      // 2a: areturn
      // 2b: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: aload 0
      // 30: aload 1
      // 31: invokevirtual k74/x/IIlllllII.lllIl (Lnet/minecraft/class_2561;)Lk74/x/lIlIIll;
      // 34: astore 2
      // 35: aload 2
      // 36: invokevirtual k74/x/lIlIIll.l ()Z
      // 39: ifeq 47
      // 3c: aload 2
      // 3d: invokevirtual k74/x/lIlIIll.I ()Lnet/minecraft/class_2561;
      // 40: goto 48
      // 43: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 46: athrow
      // 47: aload 1
      // 48: areturn
   }

   private CompletionStage IlIIll(class_310 var1, GameProfile var2) {
      try {
         if (var2 == null) {
            return CompletableFuture.completedFuture(null);
         }
      } catch (IllegalArgumentException var3) {
         throw IlIIII(var3);
      }

      return var1.method_1582().method_52863(var2).thenApply(this::lI);
   }

   private CompletableFuture<Object> IlIlII(class_310 var1, String var2) {
      try {
         if (this.IllIl(var2)) {
            return this.IllII(var1, var2);
         }
      } catch (IllegalArgumentException var7) {
         throw IlIIII(var7);
      }

      class_640 var3 = this.lIIll(var1, var2);

      try {
         if (var3 != null) {
            return CompletableFuture.completedFuture(var3.method_52810());
         }
      } catch (IllegalArgumentException var6) {
         throw IlIIII(var6);
      }

      class_1657 var4 = this.IIlIlI(var1, var2);

      try {
         if (var4 != null) {
            return var1.method_1582().method_52863(var4.method_7334()).thenApply(this::III);
         }
      } catch (IllegalArgumentException var5) {
         throw IlIIII(var5);
      }

      return this.IllI(var2).thenCompose(this::IlIIll);
   }

   private void IlIlIl() {
      this.llI = null;
      this.IIII = false;
      this.Il = "";
   }

   private lIlIIll IlIllI(class_2561 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: invokeinterface net/minecraft/class_2561.method_10851 ()Lnet/minecraft/class_7417; 1
      // 06: astore 2
      // 07: bipush 0
      // 08: istore 3
      // 09: aload 1
      // 0a: invokeinterface net/minecraft/class_2561.method_10866 ()Lnet/minecraft/class_2583; 1
      // 0f: astore 4
      // 11: aload 2
      // 12: instanceof net/minecraft/class_8828
      // 15: ifeq 62
      // 18: aload 2
      // 19: checkcast net/minecraft/class_8828
      // 1c: astore 5
      // 1e: aload 0
      // 1f: aload 4
      // 21: invokevirtual k74/x/IIlllllII.I (Lnet/minecraft/class_2583;)Z
      // 24: ifne 62
      // 27: aload 5
      // 29: invokeinterface net/minecraft/class_8828.comp_737 ()Ljava/lang/String; 1
      // 2e: astore 6
      // 30: aload 0
      // 31: aload 6
      // 33: invokevirtual k74/x/IIlllllII.lllll (Ljava/lang/String;)Ljava/lang/String;
      // 36: astore 7
      // 38: aload 6
      // 3a: ifnull 62
      // 3d: aload 7
      // 3f: ifnull 62
      // 42: goto 49
      // 45: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 48: athrow
      // 49: aload 6
      // 4b: aload 7
      // 4d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 50: ifne 62
      // 53: goto 5a
      // 56: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 59: athrow
      // 5a: aload 7
      // 5c: invokestatic net/minecraft/class_8828.method_54232 (Ljava/lang/String;)Lnet/minecraft/class_8828;
      // 5f: astore 2
      // 60: bipush 1
      // 61: istore 3
      // 62: aload 2
      // 63: invokestatic net/minecraft/class_5250.method_43477 (Lnet/minecraft/class_7417;)Lnet/minecraft/class_5250;
      // 66: aload 4
      // 68: invokevirtual net/minecraft/class_5250.method_10862 (Lnet/minecraft/class_2583;)Lnet/minecraft/class_5250;
      // 6b: astore 5
      // 6d: aload 1
      // 6e: invokeinterface net/minecraft/class_2561.method_10855 ()Ljava/util/List; 1
      // 73: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 78: astore 6
      // 7a: aload 6
      // 7c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 81: ifeq ae
      // 84: aload 6
      // 86: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 8b: checkcast net/minecraft/class_2561
      // 8e: astore 7
      // 90: aload 0
      // 91: aload 7
      // 93: invokevirtual k74/x/IIlllllII.IlIllI (Lnet/minecraft/class_2561;)Lk74/x/lIlIIll;
      // 96: astore 8
      // 98: aload 5
      // 9a: aload 8
      // 9c: invokevirtual k74/x/lIlIIll.I ()Lnet/minecraft/class_2561;
      // 9f: invokevirtual net/minecraft/class_5250.method_10852 (Lnet/minecraft/class_2561;)Lnet/minecraft/class_5250;
      // a2: pop
      // a3: iload 3
      // a4: aload 8
      // a6: invokevirtual k74/x/lIlIIll.l ()Z
      // a9: ior
      // aa: istore 3
      // ab: goto 7a
      // ae: new k74/x/lIlIIll
      // b1: dup
      // b2: iload 3
      // b3: ifeq bf
      // b6: aload 5
      // b8: goto c0
      // bb: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // be: athrow
      // bf: aload 1
      // c0: iload 3
      // c1: invokespecial k74/x/lIlIIll.<init> (Lnet/minecraft/class_2561;Z)V
      // c4: areturn
   }

   private int IlIlll(UUID param1, GameProfile param2, GameProfile param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 2
      // 02: invokevirtual k74/x/IIlllllII.lIIII (Lcom/mojang/authlib/GameProfile;)Ljava/util/UUID;
      // 05: astore 4
      // 07: aload 0
      // 08: aload 3
      // 09: invokevirtual k74/x/IIlllllII.lIIII (Lcom/mojang/authlib/GameProfile;)Ljava/util/UUID;
      // 0c: astore 5
      // 0e: aload 1
      // 0f: ifnull 2a
      // 12: aload 1
      // 13: aload 4
      // 15: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
      // 18: ifeq 2a
      // 1b: goto 22
      // 1e: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: bipush 1
      // 23: goto 2b
      // 26: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29: athrow
      // 2a: bipush 0
      // 2b: istore 6
      // 2d: aload 1
      // 2e: ifnull 49
      // 31: aload 1
      // 32: aload 5
      // 34: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
      // 37: ifeq 49
      // 3a: goto 41
      // 3d: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 40: athrow
      // 41: bipush 1
      // 42: goto 4a
      // 45: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 48: athrow
      // 49: bipush 0
      // 4a: istore 7
      // 4c: iload 6
      // 4e: iload 7
      // 50: if_icmpeq 69
      // 53: iload 6
      // 55: ifeq 67
      // 58: goto 5f
      // 5b: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5e: athrow
      // 5f: bipush -1
      // 60: goto 68
      // 63: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 66: athrow
      // 67: bipush 1
      // 68: ireturn
      // 69: aload 2
      // 6a: invokestatic k74/x/lIlIIIll.Ill (Lcom/mojang/authlib/GameProfile;)Ljava/lang/String;
      // 6d: aload 3
      // 6e: invokestatic k74/x/lIlIIIll.Ill (Lcom/mojang/authlib/GameProfile;)Ljava/lang/String;
      // 71: invokevirtual java/lang/String.compareToIgnoreCase (Ljava/lang/String;)I
      // 74: ireturn
   }

   private class_1657 IllIII(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 04: ifnull 15
      // 07: aload 1
      // 08: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 0b: ifnonnull 1b
      // 0e: goto 15
      // 11: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: aconst_null
      // 16: areturn
      // 17: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a: athrow
      // 1b: aload 0
      // 1c: getfield k74/x/IIlllllII.I Lk74/x/IllIII;
      // 1f: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 22: getstatic k74/x/IIIIl.Il Lk74/x/IIIIl;
      // 25: if_acmpne 32
      // 28: aload 0
      // 29: aload 1
      // 2a: invokevirtual k74/x/IIlllllII.lIllI (Lnet/minecraft/class_310;)Lnet/minecraft/class_1657;
      // 2d: areturn
      // 2e: invokestatic k74/x/IIlllllII.IlIIII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: aload 1
      // 34: invokevirtual k74/x/IIlllllII.IllIIl (Lnet/minecraft/class_310;)Lnet/minecraft/class_1657;
      // 37: areturn
   }

   private class_1657 IllIIl(class_310 var1) {
      try {
         if (this.IllI == null) {
            return null;
         }
      } catch (IllegalArgumentException var5) {
         throw IlIIII(var5);
      }

      for (class_1657 var3 : this.lII(var1)) {
         try {
            if (var3.method_5667().equals(this.IllI)) {
               this.llIIl(var3);
               return var3;
            }
         } catch (IllegalArgumentException var4) {
            throw IlIIII(var4);
         }
      }

      return null;
   }
}
