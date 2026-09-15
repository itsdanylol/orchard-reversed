package k74.x;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1511;
import net.minecraft.class_1661;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_3965;
import net.minecraft.class_3966;
import net.minecraft.class_746;
import net.minecraft.class_7923;
import net.minecraft.class_239.class_240;

@Environment(EnvType.CLIENT)
public final class lIlIIIII extends IlIIIIIIl {
   private class_239 II;
   private int Il;
   private static final List<lIllll> lI;
   private long ll;
   private boolean III;
   private static final int IIl = 9;
   private static final IIIlIlIl IlI;
   private boolean Ill;
   private lIIIIIll lII;
   private long lIl;
   private class_2338 llI;
   private class_3965 lll;
   private final lllIIlII IIII;
   private static final String[] IIIl;
   private long IIlI;
   private static final IIIlIlIl IIll;
   private final lIIIIIlI IlII;
   private long IlIl;
   private static final IIIlIlIl IllI;
   private static final IIIlIlIl Illl;
   private long lIII;
   private static final long lIIl = 1000L;
   private static final int lIlI = 1;
   private static final IIIlIlIl lIll;
   private boolean I;
   private static final IIIlIlIl llII;
   private final lllIIlII llIl;
   private static final int[] IllII;
   private final lIlllIl lllI;
   private int llll;
   private final IllIII<IlIIIllII> IIIII;
   private final lIlllIl IIIIl;
   private boolean IIIlI;
   private static final String[] IIIll;
   private int IIlII;
   private static final double IIlIl = 0.1;
   private class_3965 IIllI;
   private int IIlll;
   private long IlIII;
   private static final IIIlIlIl IlIIl;
   private static final IIIlIlIl IlIlI;
   private static final String[] IllIl;
   private static final Object[] IlllI;
   private final lllIIlII IlIll;

   public boolean I(class_310 var1) {
      return this.IIIIlIl() && (this.IIIll() || this.IIIII(var1));
   }

   public lIlIIIII() {
      int var1 = 1426403239;
      super(
         IlIIllIII.Ill(lIlI(lIlII(-643051834, var1 ^ -194232596), lIlII(-643051833, var1 ^ 1349994828))),
         lllIIlIl.I,
         IlIIllIII.Ill(lIlI(lIlII(-643051836, var1 ^ -954344645), lIlII(-643051835, var1 ^ -444393265)))
      );
      this.IIIII = this.IllIIll(
         new IllIII<>(IlIIllIII.Ill(lIlI(lIlII(-643051838, var1 ^ 1509426135), lIlII(-643051837, var1 ^ 629524843))), IlIIIllII.class, IlIIIllII.l)
      );
      this.IIIIl = this.IllIIll(
         new lIlllIl(IlIIllIII.Ill(lIlI(lIlII(-643051840, var1 ^ -1144573836), lIlII(-643051839, var1 ^ -1418678923))), 0.0, 0.0, 0.0, 300.0, 5.0)
            .Ill(IlIIllIII.Ill(lIlI(lIlII(-643051778, var1 ^ -403949892), lIlII(-643051777, var1 ^ 379548661))))
      );
      this.lllI = this.IllIIll(
         new lIlllIl(IlIIllIII.Ill(lIlI(lIlII(-643051780, var1 ^ -969755207), lIlII(-643051779, var1 ^ 251788341))), 0.0, 0.0, 0.0, 300.0, 5.0)
            .Ill(IlIIllIII.Ill(lIlI(lIlII(-643051782, var1 ^ 510910870), lIlII(-643051781, var1 ^ 2093674805))))
      );
      this.IIII = this.IllIIll(new lllIIlII(IlIIllIII.Ill(lIlI(lIlII(-643051784, var1 ^ -2139636315), lIlII(-643051783, var1 ^ -1576173116))), true));
      this.IlII = this.IllIIll(
         new lIIIIIlI(IlIIllIII.Ill(lIlI(lIlII(-643051786, var1 ^ -1330998875), lIlII(-643051785, var1 ^ 1591981993))), lI, List.of(IlI, IlIlI, IllI, IlIIl))
      );
      this.IlIll = this.IllIIll(new lllIIlII(IlIIllIII.Ill(lIlI(lIlII(-643051788, var1 ^ -1859240175), lIlII(-643051787, var1 ^ -558327670))), false));
      this.llIl = this.IllIIll(new lllIIlII(IlIIllIII.Ill(lIlI(lIlII(-643051790, var1 ^ -915133647), lIlII(-643051789, var1 ^ -507737588))), true));
      this.lII = lIIIIIll.l;
      this.ll = Long.MIN_VALUE;
      this.IIlII = lIlII(-643051792, var1 ^ 923701975);
      this.llll = -1;
      this.Il = -1;
      this.IIlll = lIlII(-643051791, var1 ^ 493259828);
   }

   private static boolean II(class_1297 var0) {
      return var0 instanceof class_1511;
   }

   private static boolean Il(JsonElement var0) {
      return lI(var0, false);
   }

   private static String lIlIl(char var0, char var1, int var2) {
      int var3 = var0 ^ 12893;
      char[] var4 = IllIl[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])IlllI[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         IlllI[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 18784;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ '腣';
         var10 ^= 16739;
         var10 -= 50251;
         var10 ^= 48733;
         var10 += 783;
         var10 += 9120;
         var10 += 44210;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static boolean lI(JsonElement var0, boolean var1) {
      if (var0 == null) {
         return var1;
      } else {
         return var0.isJsonPrimitive() && var0.getAsJsonPrimitive().isBoolean() ? var0.getAsBoolean() : var1;
      }
   }

   private void ll(class_310 var1) {
      if (!IlllIlII.lllIl() && !this.lIII()) {
         if (this.llI != null && System.currentTimeMillis() >= this.IIlI) {
            class_3965 var2 = this.lll;
            if (var2 != null && (this.III || this.lll(var1, var2.method_17777()))) {
               boolean[] var3 = new boolean[]{false};
               boolean var4 = k74.x.IIll.lllIII(var1, this, this.llll, lIlIIIII::lIll);
               if (var3[0]) {
                  if (!var4) {
                     this.III();
                  } else {
                     k74.x.IIll.lllIl(var1, this, lllIII.I);
                     if (!this.llIl.IllI()) {
                        this.lII = lIIIIIll.III;
                     } else {
                        this.lII = lIIIIIll.IIl;
                        this.IIlII = var1.field_1724.field_6012 + 1;
                        this.IlIII = System.currentTimeMillis();
                     }
                  }
               }
            }
         }
      }
   }

   private void III() {
      this.lII = lIIIIIll.l;
      this.ll = Long.MIN_VALUE;
      this.IIlI = 0L;
      this.IlIII = 0L;
      this.lIl = 0L;
      this.IIlII = lIlII(-643051794, 2047138643 ^ 226837042);
      this.llll = -1;
      this.llI = null;
      this.Il = -1;
      this.IIIlI = false;
      this.III = false;
      this.IIlll = lIlII(-643051793, 2047138643 ^ -1940210952);
      this.Ill = false;
      this.IIllI = null;
      this.lll = null;
   }

   private long IIl() {
      return 1000L + 2L * this.IllI(this.IIIIl) + 3L * this.IllI(this.lllI);
   }

   private void Ill(JsonObject var1) {
      String[] var2 = IIllllIl.IIIIl();
      if (var1 != null && var1.has(IlIIllIII.lI(lIlI(lIlII(-643051796, -942628545 ^ -1077453116), lIlII(-643051795, -942628545 ^ 124114455))))) {
         JsonObject var3 = var1.getAsJsonObject(IlIIllIII.lI(lIlI(lIlII(-643051798, -942628545 ^ 935340532), lIlII(-643051797, -942628545 ^ 65116563))));
         if (var3 != null) {
            JsonElement var4 = IIIllll(var3, IIll.I());
            JsonElement var5 = IIIllll(var3, lIll.I());
            JsonElement var6 = IIIllll(var3, llII.I());
            if (IIIllll(var3, this.IlII.l()) == null) {
               if (var4 != null || var5 != null || var6 != null) {
                  JsonArray var14 = new JsonArray();
                  if (Il(var4)) {
                     var14.add(IlI.llIl());
                  }

                  if (Il(var5)) {
                     var14.add(IlIlI.llIl());
                  }

                  if (lI(var6, true)) {
                     var14.add(IllI.llIl());
                  }

                  var14.add(IlIIl.llIl());
                  IlllIII(var3, this.IlII.l(), var14);
                  IIIllII(var3, IIll.I());
                  IIIllII(var3, lIll.I());
                  IIIllII(var3, llII.I());
               }
            } else {
               if (var6 != null && var6.isJsonPrimitive() && var6.getAsJsonPrimitive().isBoolean()) {
                  JsonArray var7 = this.lllI(var3);
                  String var8 = IllI.llIl();
                  boolean var9 = false;

                  for (JsonElement var11 : var7) {
                     if (var11.isJsonPrimitive() && var11.getAsJsonPrimitive().isString() && var8.equals(var11.getAsString())) {
                        var9 = true;
                        if (var2 == null) {
                           break;
                        }
                     }

                     if (var2 != null) {
                        break;
                     }
                  }

                  label162: {
                     if (var6.getAsBoolean() && !var9) {
                        var7.add(var8);
                        if (var2 == null) {
                           break label162;
                        }
                     }

                     if (!var6.getAsBoolean() && var9) {
                        JsonArray var17 = new JsonArray();

                        for (JsonElement var12 : var7) {
                           if (!var12.isJsonPrimitive() || !var12.getAsJsonPrimitive().isString() || !var8.equals(var12.getAsString())) {
                              var17.add(var12);
                           }

                           if (var2 != null) {
                              break;
                           }
                        }

                        var7 = var17;
                     }
                  }

                  IlllIII(var3, this.IlII.l(), var7);
                  IIIllII(var3, llII.I());
               }

               JsonArray var13 = this.lllI(var3);
               String var15 = IlIIl.llIl();
               boolean var16 = false;

               for (JsonElement var20 : var13) {
                  if (var20.isJsonPrimitive() && var20.getAsJsonPrimitive().isString() && var15.equals(var20.getAsString())) {
                     var16 = true;
                     if (var2 == null) {
                        break;
                     }
                  }

                  if (var2 != null) {
                     break;
                  }
               }

               if (!var16) {
                  var13.add(var15);
                  IlllIII(var3, this.IlII.l(), var13);
               }
            }
         }
      }
   }

   private void lII(class_310 var1, class_239 var2) {
      if (var1 != null && var2 != null) {
         if (!this.I) {
            this.II = var1.field_1765;
         }

         var1.field_1765 = var2;
         this.I = true;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = -1227998129;
      short var18 = 5826;
      int var16 = 0;
      String[] var15 = new String[2];
      int var17 = 0;
      int var14 = "Ɣ怕疖敕딝䞵떖滕唐䞵ᖈ溵㖈払喗旕唟湥햻墥\uf58a姕\uf588斥镡断㖒敥\uf518姝镥壝唘思開揥ᔐ滝땢恅镣溥\uf5bb䞅㖺扽핤䘕ᕢ擕떖夅㖎䞅喀湭㕦接핦妍㕡揵唞壕\uf58b揕疓挭\uf592断ᕤ捍喖䞅㖎捍疔断閖旅\uf561拥㖌掅ᖀ掵ᖉ奍疺䙕㖀䟕햋䟭픝操閊䘍疖䐕ᔘ夵镧思\uf592䟝㖀壽唘䐍喗溭\uf596挝疻攍唐捅閒断喊接唙墵ᖺ捥\uf5bb抝㔐䟥ᖽ滍疒䐕㖗妭喖漥疀斅ᖉ斅ᖋ姍\uf510奵ᖍ墝핣妝픝攵핡夥햎䟵\uf592滝ᖎ旽疈挽疎摽ᕤ恝ᕤ塽锟捭喼䐅锝滥핧妅唐姝픐揭ᔐ漵떓旵疕漍ᖌ夵\uf594扅ᕥ敭딘䐕畢塍ᔐ怕㖕䐽疻溭\uf518妽畣奭ᖻ䞵햍墍唐䞽閻奭떈怍딐䑝햍戍㖀摍甙撵锝溥\uf562䞵떊斍핥抵㔞潝喁姕\uf510奵\uf596妵픟妍떍抅떻䘝閖戵閗挵㕢溅甘䐝喁敝唐塍閖擽땧䐕핡夝\uf597溝畢拍镢拝\uf561旭閊旝ᖎ䝭\uf58f斥唐䘅땧施\uf5bb墽疏䘅\uf5ba摍땧扽镥姵喍䘽甞䐕\uf594捽픞揵픞䟭疔夽㔘担떋抅딘戍픐湭픟斝畧䙽핡䘝떼戵喌挵떼溅\uf58f䟥㖑揕\uf589挽햻奵唐䟕햼拍閒䘍镣䞭떖䞭唑䟵땤䟽햹奕핢挽喈旽喈䐍畢揕啦奭㖍䐥疉摍햌壽疼塭\uf564䟵\uf592塭㖈䟵㖍拥떗壍떉妝閖墥喀戝㕣撵픞敍ᔘ䐝唐奍㖼挵喻抭疍擽ᕧ复㕣塵\uf519摽㕢摭\uf595)\uf11e篬\uf0e6㯂\ue64e\udbebﲎ篩都ﯸ﮶寠\ue676鯴\uf126ﯨｦᯭ\ue6be鯩\uf1a6\udbef\uf126鯅\ufdce㯸ﭖ宛ﮎ篹צּ寵\ue696᯳\uf1e6鯿ｎᮝ\ufbce鯭ﾶ"
         .length();
      String var13 = "Ɣ怕疖敕딝䞵떖滕唐䞵ᖈ溵㖈払喗旕唟湥햻墥\uf58a姕\uf588斥镡断㖒敥\uf518姝镥壝唘思開揥ᔐ滝땢恅镣溥\uf5bb䞅㖺扽핤䘕ᕢ擕떖夅㖎䞅喀湭㕦接핦妍㕡揵唞壕\uf58b揕疓挭\uf592断ᕤ捍喖䞅㖎捍疔断閖旅\uf561拥㖌掅ᖀ掵ᖉ奍疺䙕㖀䟕햋䟭픝操閊䘍疖䐕ᔘ夵镧思\uf592䟝㖀壽唘䐍喗溭\uf596挝疻攍唐捅閒断喊接唙墵ᖺ捥\uf5bb抝㔐䟥ᖽ滍疒䐕㖗妭喖漥疀斅ᖉ斅ᖋ姍\uf510奵ᖍ墝핣妝픝攵핡夥햎䟵\uf592滝ᖎ旽疈挽疎摽ᕤ恝ᕤ塽锟捭喼䐅锝滥핧妅唐姝픐揭ᔐ漵떓旵疕漍ᖌ夵\uf594扅ᕥ敭딘䐕畢塍ᔐ怕㖕䐽疻溭\uf518妽畣奭ᖻ䞵햍墍唐䞽閻奭떈怍딐䑝햍戍㖀摍甙撵锝溥\uf562䞵떊斍핥抵㔞潝喁姕\uf510奵\uf596妵픟妍떍抅떻䘝閖戵閗挵㕢溅甘䐝喁敝唐塍閖擽땧䐕핡夝\uf597溝畢拍镢拝\uf561旭閊旝ᖎ䝭\uf58f斥唐䘅땧施\uf5bb墽疏䘅\uf5ba摍땧扽镥姵喍䘽甞䐕\uf594捽픞揵픞䟭疔夽㔘担떋抅딘戍픐湭픟斝畧䙽핡䘝떼戵喌挵떼溅\uf58f䟥㖑揕\uf589挽햻奵唐䟕햼拍閒䘍镣䞭떖䞭唑䟵땤䟽햹奕핢挽喈旽喈䐍畢揕啦奭㖍䐥疉摍햌壽疼塭\uf564䟵\uf592塭㖈䟵㖍拥떗壍떉妝閖墥喀戝㕣撵픞敍ᔘ䐝唐奍㖼挵喻抭疍擽ᕧ复㕣塵\uf519摽㕢摭\uf595)\uf11e篬\uf0e6㯂\ue64e\udbebﲎ篩都ﯸ﮶寠\ue676鯴\uf126ﯨｦᯭ\ue6be鯩\uf1a6\udbef\uf126鯅\ufdce㯸ﭖ宛ﮎ篹צּ寵\ue696᯳\uf1e6鯿ｎᮝ\ufbce鯭ﾶ";

      do {
         int var21 = 0;
         char var19 = var13.charAt(var17);
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            char var22 = var20[var21];
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 3 | var22 << '\r') & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 3 | var22 >>> '\r') & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      IllIl = var15;
      IlllI = new Object[var15.length];
      int var9 = -172519215;
      byte[] var7 = "X½\u008c9i¨\u009d\u0085húk2ÖX_\u009dU5Úc\u008a´ ø\u0002\u00ad¹Z¶v\u000bR \u009b2K5\u0090í5Û\u0098Ï\u0087G«Imò@\u0000}E\u0080ydÂ\u0001,s¼\u0010äJù\u00ad0\"ðSØ\u001cþÓ\u0086?\u0089³Ï\u001bX\u0017]Nð\u001c_°\u0096vJ²\u009b4E¾r\u008b¿Y)n\u0088\"AúZ\u008a\u009c\u009aSÝß\u001f\u0085\u001c£aB\u001d= ¶¿Òi4\u009ea\u000b·>o\u0086bÔ@Õ42\u0089ç¼ë\u0098\u0094`\u001c\u0005ÓPs\u0006\u00904+$ë\u0082Z6M\u0010!Ø\u0004-\u0090\u0017É¹ï§¡ üO\u0093\u00adÎgZâ¬1èâ\u0016\u001b\u0080üô$bÆ\u0019¥½>Ò«õV¿ì©úÈ#ò!\u008a\u0017ÒM\u0015\bµZ\u0007KÞ\u0012´:@oëú@¬\u001bÏéìÖbQÿk¯mV~\u0089MäO\u008b>h\u001b\u0095åzv\u0099\u0012[O\u008a¨ñÆ\u009bu®y\u0015îí¦C\u0015ª\u009c_5]ã\u008a÷ÉC^Õ\u0091.\u0005\u001e\u0014\fÙMé\u0097+\u0015ÑÀèQuÆé\u0083\u009f`\u0084Ê;£Å\u0094\u0015\u0089-\u0015\u0092Ã],Yë\u001b¶ù|\u0015¹\u001a¹;\u009fÄqB\u009d\u0010Æ\r$ ò\fæ\u0086#\b86v¼\u0094 ?\u0013f\u009dì¨N\nç3\u008eÂp\\zCj\u001exºDYø/ú·äìÚyãÞ\u0010K\u0088áép !K\u0013F¹\u0006ÍC]´\u0097Ðo\u0090\b\u001d\u008aM\u0085!0TD\u00adS=ÌéÊmUGô\u007f[`&<*\u0004CK\u0002\u0017*\u001b~\u007fµ\u0086Ú\u0081&6.¡)Fö©±ö°\u0089\u007flÔ\u0091!\u0080«B7 3`\u008f\u0086\n2©ÒÅÝss\u009aØ¯ä\u008aÜ4\u0005×q$¤T\u001eDÜ\u0099á\u008e&Pît\u0015}GÜ\u008eÌÜÓ\u0099Ýtt_EJ\u0014®ÎÜ\u009c«³ÈAPÂ40+\u000eÞJ½¦\u009bEÌ\u0014\u008c+\u000fi ®#y,TæÓÍnÛ2óðé\u00033\u0094&\u008d¶÷§¬[\u0012Ô±Æé*È¡@\u0080<t>\u0004$ÿpùñç\f\u0099ú4-Ãþî\u009f\u0002\u000e¹a¸4U\u009e\fØ5%Ü:\u0012l¸\u001dOºÊL\u00880é1¸Ðüë@ïýF\u0080Ö\u0014Ûßo¸½\u0019\u00040Ø}MTñ&ºêbÜ#3_\u0083¼×zÐ\u0097Þaö\u00883\\b\u001b7\u0016ÀrØ¶yóaC\u008d\u0098}°¡0\u0004ö8ÛÃæÅE]2bÊõÅØ;ÒW(WÓ×\u0016\tT»ÃR\u007f~\u0083\u0087\u0018\u0012AQEùr÷f\u008fdQ\u001b\u0083|¼\u0013\u001b7C88\u009fCZ\u0010/IW¸7Ò\u0089\u009d#²Dx\u0082\u009a%\u000fZ\u0019Qe±\u0080\u0013\u0083ûø±q\u0095\u0091{E,`ùÒà·\u0018:©\u008dE\u000eu\u0010ý{±\r3\u001f.Ì \u0091\u0089ËfÏ\u001aÄRÑ+\u008bZa\u0081>ýÔ¯\u0095èáY~\\½Í6jD].\nNeº,\u0096Ü¸Cv6\u0086ßí\u001bß \u0012!LÎx\u0001\u008eFwäp\u00ad¬àû\u009b\u0083$7«íw²eb\u0098\u0010~®\u0084\u0000Ú\u001a.\u0083{\u0000\\\u0090\u000b®«\u001cô-?l\u001aÒ!\u0015ý×·c\u001dÝÔ2zõ§$\u0086\r@¢f)\u008dØßÂÞ3x\u0096é\u0017£\u0018n\u0091þéØ¾Éä\u0019Ûn\u0010ü(Ä°\u0088É_Q<¾ÅP\u0005ti¯\u0016\u0004l\u001b\u0014+HMvø1ÒÀ\u007f\u0003ðeÍÂ\u0015\u000b¯ü\t.>\u0093\u009fÉ.âh?ç\u008fóÖr`û\u000e\u008agÒ^\u0001íy\u0007¶Í\u0013mñ³Úà~D[+ÒEÒ<rÍ\u0087gÀO\u0092\\ÞxL-JÒ{L¨\u0015ÄÜZs\r¤7ÐÒj³dþ\u0080NzI³\u0015Âì·é\u0092å\u000fÊ§;Å*ò\u0080ÿYðÌ\u00adü¼\u0083\u0090ÚöÁ\u000eül~.Ü3\u0094Ìc¯ì\u0004·ý»Ï\u0083Óú\u0082¸s\u0084©Uk\u000em\u0007ìÕU?}Ì÷Ýáj!\u0099»a,\u00862ù\u0093Dâ\u009fÐ\u001a\u0014\u0000\u0094x\u0087Tô\u0085Î s\blòî\u0085\u0006ð¼fÊ#Y\u0018ö\n\u001aÛr\u0094\u000b\u001f´\u001b\u00ad>\u0014àã\u001e\rÄ<µ\u000fî7BÔ<8\u008a9Ã\u0017ÓáJÕÕnHe\" úúKC\u0016\u001ae?å\u0080~\u0006Ñ\u000fÛ\u0084L±ö\u009fOa\u009c\u0096\u009e×ò\u0084¤~S\u0013¤\u0081|\u0017>f\u008cs6/\u0086@\u000b6\u0018<-\u0083«\u001dJ\u0002ñÛ34M\u001d¡\u001e\u0001|\u0089¿\u0082£ä8É\u0097ô\u0087\u009f\u009dë\u0007À\u0082\u0091\u0090×8«)Â\u0003Ôs\u0015\u001b"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      IllII = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         IllII[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var5 = new String[lIlII(-643051810, var23 ^ 1032908623)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = lIlIl('㉝', '涅', var23 ^ 133982711)).length();
      int var1 = lIlII(-643051809, var23 ^ 210108151);
      int var25 = -1;

      label85:
      while (true) {
         int var10000 = lIlII(-643051812, var23 ^ 232196524);
         String var10001 = var2.substring(++var25, var25 + var1);
         byte var10002 = -1;

         while (true) {
            label80: {
               char[] var42 = var10001.toCharArray();
               int var10004 = var42.length;
               int var6 = 0;
               int var45 = var10000;
               var38 = var42;
               int var32 = var10004;
               char[] var54;
               int var10006;
               if (var10004 <= 1) {
                  var54 = var42;
                  var10004 = var10000;
                  var10006 = var6;
               } else {
                  var45 = var10000;
                  var32 = var10004;
                  if (var10004 <= var6) {
                     break label80;
                  }

                  var54 = var42;
                  var10004 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var54[var10006] = (char)(var54[var10006] ^ var10004 ^ switch (var6 % lIlII(-643051816, var23 ^ 1736497754)) {
                     case 0 -> lIlII(-643051815, var23 ^ -748984270);
                     case 1 -> lIlII(-643051818, var23 ^ -977907476);
                     case 2 -> lIlII(-643051817, var23 ^ 1354600350);
                     case 3 -> lIlII(-643051820, var23 ^ -1095389326);
                     case 4 -> lIlII(-643051819, var23 ^ 579218266);
                     case 5 -> lIlII(-643051822, var23 ^ -1754438888);
                     default -> lIlII(-643051821, var23 ^ 548215324);
                  });
                  var6++;
                  if (var45 == 0) {
                     var10006 = var45;
                     var54 = var38;
                     var10004 = var45;
                  } else {
                     if (var32 <= var6) {
                        break;
                     }

                     var54 = var38;
                     var10004 = var45;
                     var10006 = var6;
                  }
               }
            }

            String var47 = new String(var38).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var47;
                  if ((var25 += var1) >= var4) {
                     IIIll = var5;
                     IIIl = new String[lIlII(-643051813, var23 ^ -275135605)];
                     Illl = IlIIllIII.Ill(lIlI(lIlII(-643051824, var23 ^ -1490175543), lIlII(-643051823, var23 ^ 650298593)));
                     IlI = IlIIllIII.Ill(lIlI(lIlII(-643051826, var23 ^ -1669225204), lIlII(-643051825, var23 ^ -1786819369)));
                     IlIlI = IlIIllIII.Ill(lIlI(lIlII(-643051828, var23 ^ -1677781910), lIlII(-643051827, var23 ^ -325180474)));
                     IllI = IlIIllIII.Ill(lIlI(lIlII(-643051830, var23 ^ 1027329802), lIlII(-643051829, var23 ^ -1791964495)));
                     IlIIl = IlIIllIII.Ill(lIlI(lIlII(-643051832, var23 ^ -212148378), lIlII(-643051831, var23 ^ 31901375)));
                     lI = List.of(new lIllll(IlI, IlI), new lIllll(IlIlI, IlIlI), new lIllll(IllI, IllI), new lIllll(IlIIl, IlIIl));
                     IIll = IlI;
                     lIll = IlIlI;
                     llII = IllI;
                     return;
                  }

                  var1 = var2.charAt(var25);
                  break;
               default:
                  var5[var3++] = var47;
                  if ((var25 += var1) < var4) {
                     var1 = var2.charAt(var25);
                     continue label85;
                  }

                  var4 = (var2 = lIlIl('㉜', '왩', var23 ^ -1181527844)).length();
                  var1 = lIlII(-643051811, var23 ^ -1284162315);
                  var25 = -1;
            }

            var10000 = lIlII(-643051814, var23 ^ 806927004);
            var10001 = var2.substring(++var25, var25 + var1);
            var10002 = 0;
         }
      }
   }

   public boolean lIl() {
      return this.lII != lIIIIIll.l;
   }

   private void llI(class_310 var1) {
      long var2 = System.currentTimeMillis();
      if (var2 >= this.ll) {
         if (!IlllIlII.lllIl() && !this.lIII()) {
            class_3965 var4 = this.IIllI != null ? this.IIllI : this.IIlI(var1, this.IIllI == null ? null : this.IIllI.method_17777());
            if (var4 != null && this.Il >= 0) {
               boolean[] var5 = new boolean[]{false};
               boolean var6 = k74.x.IIll.lllIII(var1, this, this.Il, lIlIIIII::IIll);
               if (var5[0]) {
                  if (!var6) {
                     this.III();
                  } else {
                     this.III = true;
                     this.IIlll = var1.field_1724.field_6012 + lIlII(-643051800, -570551518 ^ 111678883);
                     this.lII = lIIIIIll.Il;
                     this.IllII(var1);
                  }
               }
            } else {
               this.III();
            }
         }
      }
   }

   private boolean lll(class_310 var1, class_2338 var2) {
      if (var1 != null && var1.field_1687 != null && var2 != null) {
         class_2680 var3 = var1.field_1687.method_8320(var2);
         return var3.method_27852(class_2246.field_10540) || var3.method_27852(class_2246.field_9987) && this.IlIll.IllI();
      } else {
         return false;
      }
   }

   private boolean IIII(class_746 var1) {
      if (var1 == null) {
         return false;
      } else {
         class_1799 var2 = var1.method_6047();
         if (var2.method_7960()) {
            return this.IlII.III(IllI) || this.IlII.III(IlIIl);
         } else if (var2.method_31574(class_1802.field_8301)) {
            return this.IlII.III(IllI);
         } else if (var2.method_31574(class_1802.field_8281)) {
            return this.IlII.III(IlIIl);
         } else {
            return this.IlII.III(IlIlI) && this.IIllI(var1) ? true : this.IlII.III(IlI) && var2.method_31574(class_1802.field_8288);
         }
      }
   }

   private boolean IIIl(class_310 var1, class_2338 var2) {
      class_2680 var3 = var1.field_1687.method_8320(var2);
      return var3.method_26215() || var3.method_45474();
   }

   private class_3965 IIlI(class_310 var1, class_2338 var2) {
      if (!(var1 != null && var2 != null && var1.field_1765 instanceof class_3965 var3)) {
         return null;
      } else {
         return var3.method_17783() == class_240.field_1332 && var2.equals(var3.method_17777()) ? var3 : null;
      }
   }

   private static boolean IIll(boolean[] var0, class_310 var1, class_3965 var2) {
      var0[0] = true;
      return k74.x.IIll.IlIIII(var1, var2);
   }

   private boolean IlII(class_310 var1, class_2338 var2) {
      return this.IIIIl(var1, var2.method_10084());
   }

   private int IlIl(class_1661 var1, class_1792 var2) {
      for (int var3 = 0; var3 < lIlII(-643051799, 1539262675 ^ -1014888733); var3++) {
         if (var1.method_5438(var3).method_31574(var2)) {
            return var3;
         }
      }

      return -1;
   }

   private static int lIlII(int var0, int var1) {
      int var2 = IllII[var0 ^ -643051810] ^ var1 ^ var0;
      var2 -= 23798;
      var2 += 6062;
      var2 -= 50557;
      var2 -= 56756;
      var2 ^= 52728;
      var2 += 51073;
      var2 ^= 17722;
      var2 += 42487;
      var2 ^= 23868;
      return var2 + 56648;
   }

   private long IllI(lIlllIl var1) {
      return Math.max(0L, Math.round(Math.max(var1.IIlI(), var1.IlI())));
   }

   private class_3965 Illl(class_2338 var1) {
      if (var1 == null) {
         return null;
      } else {
         class_243 var2 = new class_243(var1.method_10263() + 0.5, var1.method_10264() + 1.0, var1.method_10260() + 0.5);
         return new class_3965(var2, class_2350.field_11036, var1, false);
      }
   }

   private boolean lIII() {
      return k74.x.IIll.IllllI() != this.lIII || k74.x.IIll.IlIlll() != this.IlIl || k74.x.IIll.IIlIllI(class_310.method_1551());
   }

   private void lIIl(class_310 var1) {
      if (this.llI != null && this.llll >= 0) {
         this.lll = this.Illl(this.llI);
         this.Ill = k74.x.IIll.IIlII(var1.field_1724.method_31548()) != this.llll;
         this.IIlI = System.currentTimeMillis() + (this.Ill ? this.IllIl(this.IIIIl) : 0L) + this.IllIl(this.lllI);
         this.lII = lIIIIIll.ll;
      } else {
         this.III();
      }
   }

   private static String lIlI(int var0, int var1) {
      int var9 = 1225940178;
      int var2 = (var0 ^ lIlII(-643051802, var9 ^ -1599038178)) & lIlII(-643051801, var9 ^ -1622233167);
      if (IIIl[var2] == null) {
         char[] var3 = IIIll[var2].toCharArray();

         int var4 = switch (var3[0] & lIlII(-643051804, var9 ^ 1427696255)) {
            case 0 -> lIlII(-643051803, var9 ^ -123666825);
            case 1 -> lIlII(-643051806, var9 ^ 899437971);
            case 2 -> lIlII(-643051805, var9 ^ 331146815);
            case 3 -> lIlII(-643051808, var9 ^ 298805889);
            case 4 -> lIlII(-643051807, var9 ^ 253000119);
            case 5 -> lIlII(-643051874, var9 ^ 65231062);
            case 6 -> lIlII(-643051873, var9 ^ 274331453);
            case 7 -> lIlII(-643051876, var9 ^ 25471160);
            case 8 -> lIlII(-643051875, var9 ^ -1893732849);
            case 9 -> lIlII(-643051878, var9 ^ -639325966);
            case 10 -> lIlII(-643051877, var9 ^ -976986199);
            case 11 -> lIlII(-643051880, var9 ^ 268881834);
            case 12 -> lIlII(-643051879, var9 ^ -1004234777);
            case 13 -> lIlII(-643051882, var9 ^ -1611722030);
            case 14 -> lIlII(-643051881, var9 ^ 1136455522);
            case 15 -> lIlII(-643051884, var9 ^ -1310403977);
            case 16 -> lIlII(-643051883, var9 ^ 1923118991);
            case 17 -> lIlII(-643051886, var9 ^ 1936891218);
            case 18 -> lIlII(-643051885, var9 ^ 507197471);
            case 19 -> lIlII(-643051888, var9 ^ 1600459641);
            case 20 -> lIlII(-643051887, var9 ^ -1209757548);
            case 21 -> lIlII(-643051890, var9 ^ -941794709);
            case 22 -> lIlII(-643051889, var9 ^ -2125989056);
            case 23 -> lIlII(-643051892, var9 ^ -1891100436);
            case 24 -> lIlII(-643051891, var9 ^ -1586575809);
            case 25 -> lIlII(-643051894, var9 ^ -664005925);
            case 26 -> lIlII(-643051893, var9 ^ -1747639575);
            case 27 -> lIlII(-643051896, var9 ^ -1776844649);
            case 28 -> lIlII(-643051895, var9 ^ -1832307623);
            case 29 -> lIlII(-643051898, var9 ^ 644162108);
            case 30 -> lIlII(-643051897, var9 ^ -1986553003);
            case 31 -> lIlII(-643051900, var9 ^ 851380479);
            case 32 -> lIlII(-643051899, var9 ^ -1451245507);
            case 33 -> lIlII(-643051902, var9 ^ -963952240);
            case 34 -> lIlII(-643051901, var9 ^ -2071348755);
            case 35 -> lIlII(-643051904, var9 ^ -1022808143);
            case 36 -> lIlII(-643051903, var9 ^ 756412286);
            case 37 -> lIlII(-643051842, var9 ^ -485303290);
            case 38 -> lIlII(-643051841, var9 ^ -780541143);
            case 39 -> lIlII(-643051844, var9 ^ -355391538);
            case 40 -> lIlII(-643051843, var9 ^ -1984447830);
            case 41 -> lIlII(-643051846, var9 ^ 1471307715);
            case 42 -> lIlII(-643051845, var9 ^ 220293468);
            case 43 -> lIlII(-643051848, var9 ^ -1829992353);
            case 44 -> lIlII(-643051847, var9 ^ 533738473);
            case 45 -> lIlII(-643051850, var9 ^ -564374735);
            case 46 -> lIlII(-643051849, var9 ^ 1444464715);
            case 47 -> lIlII(-643051852, var9 ^ -810092591);
            case 48 -> lIlII(-643051851, var9 ^ -1047452643);
            case 49 -> 2;
            case 50 -> lIlII(-643051854, var9 ^ -1326103744);
            case 51 -> lIlII(-643051853, var9 ^ -1729746851);
            case 52 -> lIlII(-643051856, var9 ^ -460410032);
            case 53 -> lIlII(-643051855, var9 ^ 1081091076);
            case 54 -> lIlII(-643051858, var9 ^ -1269814549);
            case 55 -> lIlII(-643051857, var9 ^ 1817752497);
            case 56 -> lIlII(-643051860, var9 ^ 712539709);
            case 57 -> lIlII(-643051859, var9 ^ 1314923392);
            case 58 -> lIlII(-643051862, var9 ^ 833828302);
            case 59 -> lIlII(-643051861, var9 ^ -1450079192);
            case 60 -> lIlII(-643051864, var9 ^ -1866224889);
            case 61 -> lIlII(-643051863, var9 ^ 1596748011);
            case 62 -> lIlII(-643051866, var9 ^ 2731907);
            case 63 -> lIlII(-643051865, var9 ^ 271398448);
            case 64 -> lIlII(-643051868, var9 ^ 1300243009);
            case 65 -> lIlII(-643051867, var9 ^ -823179632);
            case 66 -> lIlII(-643051870, var9 ^ 51416153);
            case 67 -> lIlII(-643051869, var9 ^ -903908675);
            case 68 -> lIlII(-643051872, var9 ^ -407446963);
            case 69 -> lIlII(-643051871, var9 ^ 1445844310);
            case 70 -> lIlII(-643051938, var9 ^ 1199927888);
            case 71 -> lIlII(-643051937, var9 ^ -541387210);
            case 72 -> lIlII(-643051940, var9 ^ 1412275768);
            case 73 -> lIlII(-643051939, var9 ^ 691618366);
            case 74 -> lIlII(-643051942, var9 ^ 1489318640);
            case 75 -> lIlII(-643051941, var9 ^ -1808840239);
            case 76 -> lIlII(-643051944, var9 ^ 1013598003);
            case 77 -> lIlII(-643051943, var9 ^ -1904400288);
            case 78 -> lIlII(-643051946, var9 ^ -212752364);
            case 79 -> lIlII(-643051945, var9 ^ -472033392);
            case 80 -> lIlII(-643051948, var9 ^ 1228696643);
            case 81 -> lIlII(-643051947, var9 ^ -1476202492);
            case 82 -> lIlII(-643051950, var9 ^ -1715300978);
            case 83 -> lIlII(-643051949, var9 ^ 390590877);
            case 84 -> lIlII(-643051952, var9 ^ 917114987);
            case 85 -> lIlII(-643051951, var9 ^ 725084781);
            case 86 -> lIlII(-643051954, var9 ^ 1380991286);
            case 87 -> lIlII(-643051953, var9 ^ -1501217438);
            case 88 -> lIlII(-643051956, var9 ^ -1106349554);
            case 89 -> lIlII(-643051955, var9 ^ 1796607578);
            case 90 -> lIlII(-643051958, var9 ^ 1623535419);
            case 91 -> lIlII(-643051957, var9 ^ 1679793249);
            case 92 -> 1;
            case 93 -> lIlII(-643051960, var9 ^ -1807194216);
            case 94 -> lIlII(-643051959, var9 ^ -1364943677);
            case 95 -> lIlII(-643051962, var9 ^ 1120150525);
            case 96 -> lIlII(-643051961, var9 ^ -1595707443);
            case 97 -> lIlII(-643051964, var9 ^ -2017543950);
            case 98 -> lIlII(-643051963, var9 ^ -696699973);
            case 99 -> lIlII(-643051966, var9 ^ -1421225423);
            case 100 -> lIlII(-643051965, var9 ^ 1907485866);
            case 101 -> lIlII(-643051968, var9 ^ -596519724);
            case 102 -> lIlII(-643051967, var9 ^ 1093561633);
            case 103 -> lIlII(-643051906, var9 ^ 669516305);
            case 104 -> lIlII(-643051905, var9 ^ 1116491755);
            case 105 -> lIlII(-643051908, var9 ^ 1809299509);
            case 106 -> lIlII(-643051907, var9 ^ -131259077);
            case 107 -> lIlII(-643051910, var9 ^ -982336832);
            case 108 -> lIlII(-643051909, var9 ^ -534669542);
            case 109 -> lIlII(-643051912, var9 ^ -83391816);
            case 110 -> lIlII(-643051911, var9 ^ -963438493);
            case 111 -> lIlII(-643051914, var9 ^ -1942915849);
            case 112 -> lIlII(-643051913, var9 ^ 747173188);
            case 113 -> lIlII(-643051916, var9 ^ -646145310);
            case 114 -> lIlII(-643051915, var9 ^ 709898960);
            case 115 -> lIlII(-643051918, var9 ^ 1825167507);
            case 116 -> lIlII(-643051917, var9 ^ 2083801016);
            case 117 -> lIlII(-643051920, var9 ^ -1466708771);
            case 118 -> lIlII(-643051919, var9 ^ 1596537206);
            case 119 -> 5;
            case 120 -> lIlII(-643051922, var9 ^ -841395728);
            case 121 -> lIlII(-643051921, var9 ^ 1306987047);
            case 122 -> lIlII(-643051924, var9 ^ 556946553);
            case 123 -> lIlII(-643051923, var9 ^ -462257914);
            case 124 -> lIlII(-643051926, var9 ^ -2001710141);
            case 125 -> lIlII(-643051925, var9 ^ 1669592143);
            case 126 -> lIlII(-643051928, var9 ^ 362107899);
            case 127 -> lIlII(-643051927, var9 ^ 428719768);
            case 128 -> lIlII(-643051930, var9 ^ -2117713248);
            case 129 -> lIlII(-643051929, var9 ^ -1569831583);
            case 130 -> lIlII(-643051932, var9 ^ -1965143124);
            case 131 -> lIlII(-643051931, var9 ^ 583454778);
            case 132 -> lIlII(-643051934, var9 ^ 131248483);
            case 133 -> lIlII(-643051933, var9 ^ -495739869);
            case 134 -> lIlII(-643051936, var9 ^ -1783947397);
            case 135 -> lIlII(-643051935, var9 ^ -12548534);
            case 136 -> lIlII(-643052002, var9 ^ 420151034);
            case 137 -> lIlII(-643052001, var9 ^ -345730095);
            case 138 -> lIlII(-643052004, var9 ^ -539138389);
            case 139 -> lIlII(-643052003, var9 ^ 1209120699);
            case 140 -> lIlII(-643052006, var9 ^ -1604809131);
            case 141 -> lIlII(-643052005, var9 ^ -1803283907);
            case 142 -> lIlII(-643052008, var9 ^ -515895422);
            case 143 -> lIlII(-643052007, var9 ^ -2048930125);
            case 144 -> lIlII(-643052010, var9 ^ 192466239);
            case 145 -> lIlII(-643052009, var9 ^ 1441515239);
            case 146 -> lIlII(-643052012, var9 ^ 1272612877);
            case 147 -> lIlII(-643052011, var9 ^ -76530611);
            case 148 -> lIlII(-643052014, var9 ^ 1314821041);
            case 149 -> lIlII(-643052013, var9 ^ 2074639493);
            case 150 -> lIlII(-643052016, var9 ^ 658257087);
            case 151 -> lIlII(-643052015, var9 ^ -559141209);
            case 152 -> lIlII(-643052018, var9 ^ -728450887);
            case 153 -> lIlII(-643052017, var9 ^ 204323665);
            case 154 -> lIlII(-643052020, var9 ^ -322468405);
            case 155 -> lIlII(-643052019, var9 ^ 2011880737);
            case 156 -> lIlII(-643052022, var9 ^ -1999614385);
            case 157 -> lIlII(-643052021, var9 ^ -487551840);
            case 158 -> lIlII(-643052024, var9 ^ -317360431);
            case 159 -> lIlII(-643052023, var9 ^ 907148766);
            case 160 -> lIlII(-643052026, var9 ^ 433403053);
            case 161 -> lIlII(-643052025, var9 ^ 2005315808);
            case 162 -> lIlII(-643052028, var9 ^ -127330772);
            case 163 -> lIlII(-643052027, var9 ^ 880084644);
            case 164 -> lIlII(-643052030, var9 ^ -2132836256);
            case 165 -> lIlII(-643052029, var9 ^ -1699900738);
            case 166 -> lIlII(-643052032, var9 ^ 878321154);
            case 167 -> 3;
            case 168 -> lIlII(-643052031, var9 ^ -1211207982);
            case 169 -> lIlII(-643051970, var9 ^ 1221596881);
            case 170 -> lIlII(-643051969, var9 ^ 1296458155);
            case 171 -> lIlII(-643051972, var9 ^ 1193619650);
            case 172 -> lIlII(-643051971, var9 ^ 1867916816);
            case 173 -> lIlII(-643051974, var9 ^ -1749965917);
            case 174 -> lIlII(-643051973, var9 ^ -1283663280);
            case 175 -> lIlII(-643051976, var9 ^ 1479487554);
            case 176 -> lIlII(-643051975, var9 ^ 202904955);
            case 177 -> lIlII(-643051978, var9 ^ -2103470152);
            case 178 -> lIlII(-643051977, var9 ^ 1932114990);
            case 179 -> lIlII(-643051980, var9 ^ 2129188989);
            case 180 -> lIlII(-643051979, var9 ^ -1978848725);
            case 181 -> lIlII(-643051982, var9 ^ 712625139);
            case 182 -> lIlII(-643051981, var9 ^ -875708929);
            case 183 -> lIlII(-643051984, var9 ^ -889948318);
            case 184 -> lIlII(-643051983, var9 ^ 904333133);
            case 185 -> lIlII(-643051986, var9 ^ -2115688059);
            case 186 -> lIlII(-643051985, var9 ^ -678954327);
            case 187 -> lIlII(-643051988, var9 ^ 1211203283);
            case 188 -> lIlII(-643051987, var9 ^ 1788137225);
            case 189 -> lIlII(-643051990, var9 ^ -1879397082);
            case 190 -> lIlII(-643051989, var9 ^ -1814086568);
            case 191 -> lIlII(-643051992, var9 ^ 87567405);
            case 192 -> lIlII(-643051991, var9 ^ -221322056);
            case 193 -> lIlII(-643051994, var9 ^ 1764192439);
            case 194 -> lIlII(-643051993, var9 ^ 1644136688);
            case 195 -> lIlII(-643051996, var9 ^ 1219429057);
            case 196 -> lIlII(-643051995, var9 ^ -470371217);
            case 197 -> lIlII(-643051998, var9 ^ -1986202953);
            case 198 -> lIlII(-643051997, var9 ^ 1074887845);
            case 199 -> lIlII(-643052000, var9 ^ -1042624300);
            case 200 -> lIlII(-643051999, var9 ^ 1221423222);
            case 201 -> 0;
            case 202 -> lIlII(-643051554, var9 ^ 496419479);
            case 203 -> lIlII(-643051553, var9 ^ 145611260);
            case 204 -> lIlII(-643051556, var9 ^ -690206255);
            case 205 -> lIlII(-643051555, var9 ^ -507662347);
            case 206 -> lIlII(-643051558, var9 ^ 1580030279);
            case 207 -> lIlII(-643051557, var9 ^ -1756023595);
            case 208 -> lIlII(-643051560, var9 ^ 1218162799);
            case 209 -> lIlII(-643051559, var9 ^ 1685146892);
            case 210 -> lIlII(-643051562, var9 ^ -750643393);
            case 211 -> lIlII(-643051561, var9 ^ 1984358972);
            case 212 -> lIlII(-643051564, var9 ^ 2147405092);
            case 213 -> lIlII(-643051563, var9 ^ -1590417399);
            case 214 -> lIlII(-643051566, var9 ^ 437148473);
            case 215 -> lIlII(-643051565, var9 ^ 1448934148);
            case 216 -> lIlII(-643051568, var9 ^ 425843123);
            case 217 -> lIlII(-643051567, var9 ^ 1543503534);
            case 218 -> lIlII(-643051570, var9 ^ -455090488);
            case 219 -> lIlII(-643051569, var9 ^ 238903669);
            case 220 -> lIlII(-643051572, var9 ^ 1995814076);
            case 221 -> lIlII(-643051571, var9 ^ 557745260);
            case 222 -> lIlII(-643051574, var9 ^ 1618197173);
            case 223 -> lIlII(-643051573, var9 ^ 509105746);
            case 224 -> lIlII(-643051576, var9 ^ -1801715640);
            case 225 -> lIlII(-643051575, var9 ^ 1336163407);
            case 226 -> lIlII(-643051578, var9 ^ 1443290891);
            case 227 -> lIlII(-643051577, var9 ^ -254764366);
            case 228 -> lIlII(-643051580, var9 ^ -69369438);
            case 229 -> lIlII(-643051579, var9 ^ 1667385219);
            case 230 -> lIlII(-643051582, var9 ^ 86056377);
            case 231 -> lIlII(-643051581, var9 ^ -1704625591);
            case 232 -> lIlII(-643051584, var9 ^ -838499825);
            case 233 -> lIlII(-643051583, var9 ^ 981601146);
            case 234 -> lIlII(-643051522, var9 ^ 1746896485);
            case 235 -> lIlII(-643051521, var9 ^ 1783456785);
            case 236 -> lIlII(-643051524, var9 ^ -1180165210);
            case 237 -> lIlII(-643051523, var9 ^ -1863591816);
            case 238 -> lIlII(-643051526, var9 ^ 251272348);
            case 239 -> lIlII(-643051525, var9 ^ -2124661386);
            case 240 -> lIlII(-643051528, var9 ^ 2048006575);
            case 241 -> lIlII(-643051527, var9 ^ 1590538953);
            case 242 -> lIlII(-643051530, var9 ^ 1959149629);
            case 243 -> lIlII(-643051529, var9 ^ -1496741536);
            case 244 -> lIlII(-643051532, var9 ^ 1508298859);
            case 245 -> lIlII(-643051531, var9 ^ -802891861);
            case 246 -> lIlII(-643051534, var9 ^ -762043100);
            case 247 -> lIlII(-643051533, var9 ^ 1611352154);
            case 248 -> lIlII(-643051536, var9 ^ -1930729941);
            case 249 -> lIlII(-643051535, var9 ^ 2138144035);
            case 250 -> lIlII(-643051538, var9 ^ 1274993744);
            case 251 -> lIlII(-643051537, var9 ^ -700385899);
            case 252 -> lIlII(-643051540, var9 ^ -711942174);
            case 253 -> lIlII(-643051539, var9 ^ 69661652);
            case 254 -> lIlII(-643051542, var9 ^ 1049580711);
            default -> 4;
         };
         int var5 = (var1 & lIlII(-643051541, var9 ^ 1047559089)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & lIlII(-643051544, var9 ^ 1533578966)) >>> lIlII(-643051543, var9 ^ -1394702571)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & lIlII(-643051546, var9 ^ -1849221225);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & lIlII(-643051545, var9 ^ -1217221449);
            }
         }

         IIIl[var2] = new String(var3).intern();
      }

      return IIIl[var2];
   }

   @Override
   public void llIl() {
      this.Illll(class_310.method_1551());
      this.III();
   }

   private static boolean lIll(boolean[] var0, class_310 var1, class_3965 var2) {
      var0[0] = true;
      return k74.x.IIll.IlIIII(var1, var2);
   }

   private class_1511 llII(class_310 var1) {
      if (var1 != null && var1.field_1687 != null && this.llI != null) {
         class_238 var2 = new class_238(this.llI.method_10084()).method_1014(1.0);
         class_1511 var3 = null;
         double var4 = Double.MAX_VALUE;
         class_243 var6 = class_243.method_24953(this.llI.method_10084());

         for (class_1297 var8 : var1.field_1687.method_8333(null, var2, lIlIIIII::II)) {
            if (var8 instanceof class_1511 var9 && !var9.method_31481()) {
               double var10 = var9.method_5829().method_1005().method_1025(var6);
               if (var10 < var4) {
                  var4 = var10;
                  var3 = var9;
               }
            }
         }

         return var3;
      } else {
         return null;
      }
   }

   @Override
   public void IIlIl() {
      class_310 var1 = class_310.method_1551();
      if (this.lII != lIIIIIll.l) {
         long var2 = System.currentTimeMillis();
         if (!this.IIlII(var1) || var2 - this.lIl > this.IIl()) {
            this.III();
         }
      }
   }

   private JsonArray lllI(JsonObject var1) {
      JsonArray var2 = new JsonArray();
      JsonElement var3 = IIIllll(var1, this.IlII.l());
      if (var3 != null && var3.isJsonArray()) {
         for (JsonElement var7 : var3.getAsJsonArray()) {
            var2.add(var7);
         }

         return var2;
      } else {
         for (lIllll var5 : lI) {
            var2.add(var5.IlI());
         }

         return var2;
      }
   }

   public boolean IIIII(class_310 var1) {
      if (this.IIlII(var1) && this.lII == lIIIIIll.l && (!this.IIII.IllI() || var1.field_1724.method_24828())) {
         boolean var2 = var1.field_1690.field_1886.method_1434() || k74.x.IIll.IIIIIlI(var1.field_1690.field_1886) > 0;
         boolean var3 = var1.field_1690.field_1904.method_1434() || k74.x.IIll.IIIIIlI(var1.field_1690.field_1904) > 0;
         IlIIIllII var4 = this.IIIII.IllI();
         return (var4 == IlIIIllII.Il ? !var2 : !var3) ? false : this.IIlll(var1);
      } else {
         return false;
      }
   }

   @Override
   public void IlllII(JsonObject var1) {
      int var2 = -1413461773;
      this.Ill(var1);
      super.IlllII(var1);
      this.IIIlIIl(var1, Illl.llIl(), new lIlllIl[]{this.IIIIl, this.lllI});
      this.IIIlIIl(var1, IlIIllIII.lI(lIlI(lIlII(-643051548, var2 ^ 840962453), lIlII(-643051547, var2 ^ -1259801226))), new lIlllIl[]{this.IIIIl});
      this.IIIlIIl(var1, IlIIllIII.lI(lIlI(lIlII(-643051550, var2 ^ -650321590), lIlII(-643051549, var2 ^ 241388338))), new lIlllIl[]{this.lllI});
      this.IIIlIIl(var1, IlIIllIII.lI(lIlI(lIlII(-643051552, var2 ^ -1676007006), lIlII(-643051551, var2 ^ -1935367316))), new lIlllIl[]{this.lllI});
      this.IIIlIIl(var1, IlIIllIII.lI(lIlI(lIlII(-643051618, var2 ^ -1826283313), lIlII(-643051617, var2 ^ 374089305))), new lIlllIl[]{this.lllI});
   }

   private boolean IIIIl(class_310 var1, class_2338 var2) {
      class_2680 var3 = var1.field_1687.method_8320(var2);
      return (var3.method_26215() || var3.method_45474()) && var1.field_1687.method_8335(null, new class_238(var2)).isEmpty();
   }

   private boolean IIIlI(class_310 var1, class_2338 var2) {
      class_2680 var3 = var1.field_1687.method_8320(var2);
      return !var3.method_27852(class_2246.field_10540)
         && (!var3.method_27852(class_2246.field_9987) || this.IlIll.IllI())
         && !var3.method_27852(class_2246.field_23152);
   }

   public boolean IIIll() {
      return this.lIl();
   }

   private boolean IIlII(class_310 var1) {
      return var1 != null
         && var1.field_1724 != null
         && var1.field_1687 != null
         && var1.field_1761 != null
         && var1.field_1690 != null
         && var1.field_1755 == null
         && var1.field_1724.method_5805();
   }

   private boolean IIllI(class_746 var1) {
      class_1799 var2 = var1 == null ? class_1799.field_8037 : var1.method_6047();
      return !var2.method_7960()
         && class_7923.field_41178
            .method_10221(var2.method_7909())
            .method_12832()
            .endsWith(IlIIllIII.lI(lIlI(lIlII(-643051620, 1155582348 ^ 1009492785), lIlII(-643051619, 1155582348 ^ -1131452667))));
   }

   @Override
   public void IlIII() {
      this.III();
   }

   private boolean IIlll(class_310 var1) {
      if (!lIIIllII.ll(var1) && this.IIII(var1.field_1724) && var1.field_1765 instanceof class_3965 var2 && var2.method_17783() == class_240.field_1332) {
         boolean var6 = this.lll(var1, var2.method_17777());
         if (!var6 && !this.IIIlI(var1, var2.method_17777())) {
            return false;
         } else {
            class_2338 var4 = var6 ? var2.method_17777().method_10062() : var2.method_17777().method_10093(var2.method_17780()).method_10062();
            if (var6) {
               if (!this.IlII(var1, var4)) {
                  return false;
               }
            } else if (!this.IIIl(var1, var4) || !this.IlII(var1, var4)) {
               return false;
            }

            class_1661 var5 = var1.field_1724.method_31548();
            return (var6 || this.IlIl(var5, class_1802.field_8281) >= 0) && this.IlIl(var5, class_1802.field_8301) >= 0;
         }
      } else {
         return false;
      }
   }

   private void IllII(class_310 var1) {
      if (this.llI == null || var1 == null || var1.field_1724 == null || var1.field_1687 == null) {
         this.III();
      } else if (!this.lll(var1, this.llI)) {
         if (var1.field_1724.field_6012 > this.IIlll) {
            this.III();
         }
      } else {
         this.lII = lIIIIIll.I;
         this.lll = this.Illl(this.llI);
         this.IIlI = System.currentTimeMillis();
         this.lIIl(var1);
         if (this.lII == lIIIIIll.ll) {
            this.ll(var1);
         }
      }
   }

   private void l(class_310 var1) {
      if (var1 != null && var1.field_1724 != null) {
         class_1511 var2 = this.llII(var1);
         if (var2 != null && !var2.method_31481()) {
            if (var1.field_1765 instanceof class_3966 var3 && var3.method_17782() != var2) {
               this.IlIII = System.currentTimeMillis();
            } else {
               class_3966 var6 = null;
               if (var1.field_1765 instanceof class_3966 var7 && var7.method_17782() == var2) {
                  var6 = var7;
               } else {
                  class_3966 var8 = k74.x.IIll.lIlll(var1, var1.field_1724.method_55755());
                  if (var8 != null && var8.method_17782() == var2) {
                     var6 = var8;
                  }
               }

               if (var6 == null) {
                  this.IlIII = System.currentTimeMillis();
               } else {
                  this.IlIII = System.currentTimeMillis();
                  if (k74.x.IIll.lIlIIl(var1, var6)) {
                     this.III();
                  } else {
                     this.IIlII = var1.field_1724.field_6012 + 1;
                  }
               }
            }
         } else {
            this.IlIII = System.currentTimeMillis();
         }
      }
   }

   private long IllIl(lIlllIl var1) {
      double var2 = var1.IIlI();
      double var4 = var1.IlI();
      return var2 == var4 ? Math.max(0L, Math.round(var2)) : Math.max(0L, Math.round(ThreadLocalRandom.current().nextDouble(var2, var4)));
   }

   static class_243 IlllI(class_243 var0, class_238 var1) {
      return new class_243(
         class_3532.method_15350(var0.field_1352, var1.field_1323, var1.field_1320),
         class_3532.method_15350(var0.field_1351, var1.field_1322, var1.field_1325),
         class_3532.method_15350(var0.field_1350, var1.field_1321, var1.field_1324)
      );
   }

   private void Illll(class_310 var1) {
      if (this.I && var1 != null) {
         var1.field_1765 = this.II;
      }

      this.II = null;
      this.I = false;
   }

   private class_243 lIIII(class_310 var1, class_1511 var2) {
      if (var1 != null && var1.field_1724 != null && var2 != null && !var2.method_31481()) {
         class_243 var3 = this.lIIll(var1);
         class_238 var4 = var2.method_5829();
         class_243 var5 = IlllI(var3, var4);
         double var6 = var1.field_1724.method_55755();
         double var8 = var6 - 0.1;
         return !(var8 <= 0.0) && !(var3.method_1025(var5) > var8 * var8) ? var5.method_35590(var4.method_1005(), 1.0E-4) : null;
      } else {
         return null;
      }
   }

   private void lIIIl(class_310 var1) {
      if (this.IIIII(var1)) {
         class_3965 var2 = (class_3965)var1.field_1765;
         boolean var3 = this.lll(var1, var2.method_17777());
         class_2338 var4 = var3 ? var2.method_17777().method_10062() : var2.method_17777().method_10093(var2.method_17780()).method_10062();
         class_1661 var5 = var1.field_1724.method_31548();
         int var6 = var3 ? -1 : this.IlIl(var5, class_1802.field_8281);
         int var7 = this.IlIl(var5, class_1802.field_8301);
         this.lIIlI(var1);
         if (var1.field_1724 != null && var1.field_1724.method_6115()) {
            var1.field_1724.method_6075();
         }

         this.llll = var7;
         this.llI = var4;
         this.lll = this.Illl(var4);
         this.IIllI = var3 ? null : var2;
         this.lIl = System.currentTimeMillis();
         this.ll = Long.MIN_VALUE;
         if (var3) {
            this.lIIl(var1);
            if (this.lII == lIIIIIll.ll) {
               this.ll(var1);
            }
         } else {
            this.Il = var6;
            this.IIIlI = k74.x.IIll.IIlII(var1.field_1724.method_31548()) != var6;
            this.ll = System.currentTimeMillis() + (this.IIIlI ? this.IllIl(this.IIIIl) : 0L) + this.IllIl(this.lllI);
            this.lII = lIIIIIll.II;
            this.llI(var1);
         }
      }
   }

   @Override
   public void IllIll(class_310 var1) {
      if (!this.IIlII(var1)) {
         this.Illll(var1);
         this.III();
      } else {
         this.lIII = k74.x.IIll.IllllI();
         this.IlIl = k74.x.IIll.IlIlll();
         if (this.IIII.IllI() && !var1.field_1724.method_24828()) {
            this.Illll(var1);
            this.III();
         } else if (this.lII != lIIIIIll.l) {
            this.lIIlI(var1);
            if (var1.field_1724 != null && var1.field_1724.method_6115()) {
               var1.field_1724.method_6075();
            }

            long var2 = System.currentTimeMillis();
            if (this.lII == lIIIIIll.II) {
               this.llI(var1);
            } else if (this.lII == lIIIIIll.Il) {
               this.IllII(var1);
            } else if (this.lII == lIIIIIll.I && var2 >= this.IIlI) {
               this.lIIl(var1);
            } else if (this.lII == lIIIIIll.ll) {
               this.ll(var1);
            } else if (this.lII == lIIIIIll.IIl && var2 >= this.IlIII && var1.field_1724.field_6012 >= this.IIlII) {
               this.l(var1);
            }
         } else {
            this.lIIIl(var1);
         }
      }
   }

   private void lIIlI(class_310 var1) {
      if (var1 != null && var1.field_1690 != null) {
         if (var1.field_1690.field_1886 != null) {
            k74.x.IIll.lIIIIlI(var1.field_1690.field_1886);
            var1.field_1690.field_1886.method_23481(false);
         }

         if (var1.field_1690.field_1904 != null) {
            k74.x.IIll.lIIIIlI(var1.field_1690.field_1904);
            var1.field_1690.field_1904.method_23481(false);
         }
      }
   }

   @Override
   public void llIIII(class_310 var1) {
      this.Illll(var1);
      if (this.lII == lIIIIIll.III) {
         this.III();
      }
   }

   private class_243 lIIll(class_310 var1) {
      class_746 var2 = var1.field_1724;
      class_243 var3 = var2.method_33571();
      class_243 var4 = new class_243(var2.method_23317(), var2.method_23318(), var2.method_23321());
      return new class_243(IIlllIllI.IIl(var2), IIlllIllI.lIlI(var2), IIlllIllI.lIIl(var2)).method_1019(var3.method_1020(var4));
   }
}
