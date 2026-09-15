package k74.x;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1268;
import net.minecraft.class_1701;
import net.minecraft.class_1747;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2680;
import net.minecraft.class_2885;
import net.minecraft.class_310;
import net.minecraft.class_3965;

@Environment(EnvType.CLIENT)
public final class IIlI extends IlIIIIIIl {
   private static final int[] IIIlI;
   private static final IIIlIlIl II;
   private int Il;
   private final IllIII<IllIIlII> lI;
   private final Map<class_2338, Integer> ll;
   private final IllIII<lIIllIlI> III;
   private int IIl;
   private final Set<Integer> IlI;
   private final lllIIlII Ill;
   private int lII;
   private final Map<Integer, Boolean> lIl;
   private final IIlIII llI;
   private static final String[] lll;
   private final IlIIIllll IIII;
   private final Set<Integer> I;
   private static final float IIIl = 11.5F;
   private static final String[] IIIll;
   private static final int IIlI = 4;
   private int IIll;
   private boolean IlII;
   private int IlIl;
   private final IIlIII IllI;
   private long Illl;
   private static final int lIII = 6;
   private final IIlIII lIIl;
   private long lIlI;
   private static final Object[] IIlII;
   private static final float lIll = 0.25F;
   private static final double llII = 20.25;
   private long llIl;
   private final lIlllIl lllI;
   private final lIlllIl llll;
   private static final String[] IIIII;
   private static final double IIIIl = 10.0;

   private static boolean I(class_310 var0, Integer var1) {
      return var0.field_1687.method_8469(var1) == null;
   }

   private boolean l(class_310 var1, IlIIIIlI var2) {
      return k74.x.IIll.IlIIII(var1, var2.II());
   }

   @Override
   public void IIlIl() {
      int var12 = 1144840143;
      String[] var10000 = llIllIlI.IIlII();
      class_310 var2 = class_310.method_1551();
      String[] var1 = var10000;
      if (!this.ll(var2)) {
         this.lIIl(var2, Illll(1021705040, var12 ^ -940723014), -1, Float.NaN);
      } else {
         label130: {
            this.IlllI(var2);
            this.IIll(var2);
            if (this.IlII) {
               if (var2.field_1724.field_6012 - this.IIl <= 4) {
                  break label130;
               }

               this.lIIl(var2, Illll(1021705041, var12 ^ -1716041823), -1, var2.field_1724.field_6012 - this.IIl);
               this.lIlI++;
               this.IlII = false;
               if (var1 == null) {
                  break label130;
               }
            }

            if (!lIIIllII.ll(var2) && !k74.x.IIll.IIlllll()) {
               boolean var3 = false;
               class_238 var4 = var2.field_1724.method_5829().method_1014(10.0);
               List var5 = var2.field_1687.method_8390(class_1701.class, var4, IIlI::II);
               this.lIIl(var2, var5.isEmpty() ? Illll(1021705044, var12 ^ -743582021) : Illll(1021705045, var12 ^ -1806212681), -1, var5.size());

               for (class_1701 var7 : var5) {
                  if (this.I.contains(var7.method_5628())) {
                     this.lIIl(var2, Illll(1021705046, var12 ^ -1188495943), var7.method_5628(), 0.0F);
                     if (var1 != null) {
                        continue;
                     }
                  }

                  if (this.IlI.contains(var7.method_5628())) {
                     this.lIIl(var2, Illll(1021705047, var12 ^ 1808409288), var7.method_5628(), 0.0F);
                     if (var1 != null) {
                        continue;
                     }
                  }

                  this.lIIl(var2, Illll(1021705048, var12 ^ -1445660200), var7.method_5628(), var2.field_1724.method_5739(var7));
                  float var8 = Math.max(this.IllIl(var2, var7, null), IIIIllIlI.ll(var2.field_1724, var7.method_73189(), this.IllII(var7)));
                  this.lIIl(var2, Illll(1021705049, var12 ^ -1894597097), var7.method_5628(), var8);
                  if (this.lI.IllI() == IllIIlII.II && !llI(var8, var2.field_1724.method_6032(), var2.field_1724.method_6067())) {
                     this.lIIl(var2, Illll(1021705050, var12 ^ -349086932), var7.method_5628(), var2.field_1724.method_6032() + var2.field_1724.method_6067());
                     if (var1 != null) {
                        continue;
                     }
                  }

                  boolean var9 = this.lIl.computeIfAbsent(var7.method_5628(), this::IllI);
                  if (!var9) {
                     this.lIIl(var2, Illll(1021705051, var12 ^ -897222453), var7.method_5628(), this.llI.IllI().floatValue());
                     if (var1 != null) {
                        continue;
                     }
                  }

                  IlIIIIlI var10 = this.llII(var2, var7);
                  int var11 = this.Ill(var2);
                  if (var11 < 0) {
                     this.lIIl(var2, Illll(1021705052, var12 ^ -479550735), var7.method_5628(), this.lIIl.IllI().floatValue());
                     if (var1 != null) {
                        continue;
                     }
                  }

                  if (var10 == null) {
                     this.lIIl(var2, Illll(1021705053, var12 ^ -710897926), var7.method_5628(), 0.0F);
                     if (var1 != null) {
                        continue;
                     }
                  }

                  if (var10 != null && var11 >= 0) {
                     var3 = true;
                     if (!this.Il(var2, var7.method_5628(), var11)) {
                        this.lIIl(var2, Illll(1021705054, var12 ^ 1055344977), var7.method_5628(), 0.0F);
                        return;
                     }

                     if (this.III.IllI() == lIIllIlI.II) {
                        this.lIIl(var2, Illll(1021705055, var12 ^ 1476364469), var7.method_5628(), 0.0F);
                        this.IIllI(var2, var7, var11, var10);
                        return;
                     }

                     if (this.IIlII(var2, var7, var11, var10)) {
                        this.lIIl(var2, Illll(1021705024, var12 ^ 340635829), var7.method_5628(), var11 + 1.0F);
                        this.lIII();
                        return;
                     }

                     this.lIIl(var2, Illll(1021705025, var12 ^ -453291902), var7.method_5628(), 0.0F);
                  }

                  if (var1 == null) {
                     break;
                  }
               }

               if (!var3) {
                  this.lIII();
               }

               this.IIII.IIlIl();
               return;
            }

            this.lIIl(var2, Illll(1021705043, var12 ^ -1802910652), -1, k74.x.IIll.IIlllll() ? 1.0F : 0.0F);
            this.lIII();
            return;
         }

         this.lIIl(var2, Illll(1021705042, var12 ^ -1031813988), -1, var2.field_1724.field_6012 - this.IIl);
      }
   }

   private static boolean II(class_1701 var0) {
      return var0.method_5805() && !var0.method_31481();
   }

   private boolean Il(class_310 var1, int var2, int var3) {
      long var4 = System.currentTimeMillis();
      if (this.lII != var2) {
         this.lII = var2;
         boolean var6 = k74.x.IIll.lIIlI(var1) != var3;
         this.llIl = var4 + (var6 ? this.lIl(this.llll) : 0L);
         this.Illl = Long.MIN_VALUE;
      }

      if (var4 < this.llIl) {
         return false;
      } else {
         if (this.Illl == Long.MIN_VALUE) {
            this.Illl = var4 + this.lIl(this.lllI);
         }

         return var4 >= this.Illl;
      }
   }

   private boolean lI(class_310 var1, IlIIIIlI var2) {
      return this.l(var1, var2);
   }

   private boolean ll(class_310 var1) {
      return this.IIIIlIl()
         && var1 != null
         && var1.field_1724 != null
         && var1.field_1687 != null
         && var1.field_1761 != null
         && var1.field_1755 == null
         && var1.field_1724.method_5805();
   }

   private float III(class_1701 var1) {
      double var2 = var1.method_18798().method_37267();
      return (float)(4.0 + 1.5 * Math.min(var2, 5.0));
   }

   private boolean IIl(class_310 var1, int var2, int var3, IlIIIIlI var4) {
      if (!(
         var1.field_1687.method_8469(var2) instanceof class_1701 var6
            && !var6.method_31481()
            && !this.I.contains(var2)
            && this.lll(var1, var3)
            && this.IlII(var1, var4.I())
      )) {
         this.lIIl(var1, Illll(1021705026, -1025646263 ^ -1119907120), var2, var3 + 1.0F);
         return false;
      } else {
         return k74.x.IIll.lIIlI(var1) == var3 ? this.l(var1, var4) : k74.x.IIll.lllIII(var1, this, var3, this::lI);
      }
   }

   private int Ill(class_310 var1) {
      int var2 = (int)Math.round(this.lIIl.IllI()) - 1;
      return this.lll(var1, var2) ? var2 : -1;
   }

   private static boolean lII(class_310 var0, Integer var1) {
      return var0.field_1687.method_8469(var1) == null;
   }

   @Override
   public void llIl() {
      this.lIlI++;
      this.IIIll();
      this.IIII.lIIl();
      this.IIII.IIlIl();
      k74.x.IIll.lllIl(class_310.method_1551(), this, lllIII.II);
   }

   @Override
   public void llllII(class_2596<?> var1) {
      if (var1 instanceof class_2885 var2) {
         class_310 var3 = class_310.method_1551();
         if (this.IIIIlIl() && var3 != null && var3.field_1724 != null) {
            class_1799 var4 = var2.method_12546() == class_1268.field_5810 ? var3.field_1724.method_6079() : this.IIIlI(var3);
            if (var4 != null && var4.method_31574(class_1802.field_8069)) {
               this.ll.put(var2.method_12543().method_17777().method_10062(), var3.field_1724.field_6012);
            }
         }
      }
   }

   private long lIl(lIlllIl var1) {
      double var2 = var1.IIlI();
      double var4 = var1.IlI();
      return var2 == var4 ? Math.max(0L, Math.round(var2)) : Math.max(0L, Math.round(ThreadLocalRandom.current().nextDouble(var2, var4)));
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = 468083555;
      int var10 = 0;
      String[] var9 = new String[2];
      int var10001 = "ă㳑돿㼊\uf370㳭猵㶥㏖㻞獂㻕㌛㻕돷㴮㍁㵑猈㷍珚㶎獳㼡\uf323㸍珝㱾\uf37a㽁댹㺭\uf3ed㲮덥㺹猹㲱\uf3ed㶚\uf358㱵猅㸝\uf3c1㽎㍱㹭\uf30a㵍㏳㳆㍎㵭㌰㵑㏾㹚\uf374㼅猿㳩\uf3e9㹆獼㿡㌩㳕㏇㵦덨㾥㌱㾥珯㺢덆㵡㌐㺹\uf3d3㶶덖㱩㌀㵩㏦㿢獟㻝猭㴉㏰㴖덊㼡댡㻹㏤㺺㍇㺝댪㼝돭㺂㍂㰽㌜㳥㏨㸞㍚㴱\uf30e㹥돳㱆덑㽹㌌㷝珩㸾\uf343㹉\uf317㴑珓㵺㍐㲩댢㶙㏰㴖㍽㵵㌪㲽\uf3d9㴶獵㾁猙㳱\uf3f5㰒獼㱝猔㲵돽㵂㍜㽉댸㲥\uf3f2㴪獰㼥댥㸙\uf3c8㾚덉㽱\uf304㳉돊㰎던㻡댕㱽珑㼺㍲㶵댠㰥珗㸲㍨㿩\uf323㿙돟㴚獍㼍猖㻝\uf3e0㸾獐㸅㌁㵱돁㱮獇㶕댿㾑돞㰚\uf351㲩㌿㳩\uf3db㼶덆㰁\uf327㼕\uf3e7㵶덊㷍猴㳽珣㹖덚㴁猫㰕돲㵂\uf368㷉猪㲕㏣㲦델㶡㌉㹵돫㼺\uf360㻕㌄㷽珩㶲獅㵥\uf30a㺥珠㷚㍊㬡덣㥭\u0019ⵕ\uf2c1Ⳓ뉒ⲕ爕ⵁ\uf2daⶾ㉛⽹爯ⶥ\uf2c3ⰶ뉥⾹爡⽭㋕⹂뉿Ⰹ爹⹍"
         .length();
      short var12 = 29043;
      int var8 = var10001;
      String var7 = "ă㳑돿㼊\uf370㳭猵㶥㏖㻞獂㻕㌛㻕돷㴮㍁㵑猈㷍珚㶎獳㼡\uf323㸍珝㱾\uf37a㽁댹㺭\uf3ed㲮덥㺹猹㲱\uf3ed㶚\uf358㱵猅㸝\uf3c1㽎㍱㹭\uf30a㵍㏳㳆㍎㵭㌰㵑㏾㹚\uf374㼅猿㳩\uf3e9㹆獼㿡㌩㳕㏇㵦덨㾥㌱㾥珯㺢덆㵡㌐㺹\uf3d3㶶덖㱩㌀㵩㏦㿢獟㻝猭㴉㏰㴖덊㼡댡㻹㏤㺺㍇㺝댪㼝돭㺂㍂㰽㌜㳥㏨㸞㍚㴱\uf30e㹥돳㱆덑㽹㌌㷝珩㸾\uf343㹉\uf317㴑珓㵺㍐㲩댢㶙㏰㴖㍽㵵㌪㲽\uf3d9㴶獵㾁猙㳱\uf3f5㰒獼㱝猔㲵돽㵂㍜㽉댸㲥\uf3f2㴪獰㼥댥㸙\uf3c8㾚덉㽱\uf304㳉돊㰎던㻡댕㱽珑㼺㍲㶵댠㰥珗㸲㍨㿩\uf323㿙돟㴚獍㼍猖㻝\uf3e0㸾獐㸅㌁㵱돁㱮獇㶕댿㾑돞㰚\uf351㲩㌿㳩\uf3db㼶덆㰁\uf327㼕\uf3e7㵶덊㷍猴㳽珣㹖덚㴁猫㰕돲㵂\uf368㷉猪㲕㏣㲦델㶡㌉㹵돫㼺\uf360㻕㌄㷽珩㶲獅㵥\uf30a㺥珠㷚㍊㬡덣㥭\u0019ⵕ\uf2c1Ⳓ뉒ⲕ爕ⵁ\uf2daⶾ㉛⽹爯ⶥ\uf2c3ⰶ뉥⾹爡⽭㋕⹂뉿Ⰹ爹⹍";
      int var11 = 0;

      do {
         char var13 = var7.charAt(var11);
         int var15 = 0;
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 6) {
               default -> 74;
               case 1 -> 11;
               case 2 -> 221;
               case 3 -> 169;
               case 4 -> 42;
               case 5 -> 212;
            }) ^ var16;
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 2 | var16 << 14) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 2 | var16 >>> 14) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      IIIll = var9;
      IIlII = new Object[var9.length];
      int var21 = 0;
      int var24 = 0;
      IIIlI = new int[342];
      byte[] var10002 = "®^M ð\u0004¾¥«Ì=\u009aý:=Iº\u001e/Ëýä\u0098ÇÐ\u009b\u0004Á\u0002yÛ°Àg\u0000·æ¡Gv\u0082\u0082¢O£6\u0081\u00ad\u008aÙ[o¼\u0013wdWT°Ã>Lq<}þI\u0015\u008dH©\"RmUàéÅ·ÒrW$õô'\u0012A\u0006A.FÍåHþÁùgsÙ[©Â8\\Ø¥{\u001cþÈ\u009døm+$¯¬á1Xu\u009d-0\\\f²Æ{D\u001f\u001a{y®î\nã,QÉy7µµ\u009e\u001f\u0014\u009cÈHî\t3ì\u0011¶\u008cÀZ\u0087.AP\u0018©aÇ×\u0094l!Ãâi¶xò[àY¤ mg\u0005WäÎ\\%¢\b¨²Û\u00ad¸j9\u0006ø\u000f\u0089\u008bµ\u008crÃ\u0014¡\u009cC\u0010é¬Ê2ÇbãÂS~ÍýëîÊ5R\u0085\u0093\r\u0001YZ\u008c\u0082íÏÏ°\nóêe\u001a\u008a\u0010ß\u000f\u0088×µbU×!\u0003½\u0095,ù\u001fþâ¤ý/¥\u0004%\u0085± \u0001ä\u0083lª#ËB~Ç¯A\u0087d\u008aâ&Y&`\u0007'mV¥\u0093@ÖF\u0010¬D\u0000Ñ¦\u00adÒSæz±)×\u0001®2\u001cd\\Ù8¥\u0092lj¥\\oÀm&\u008eýP°Æ\u008a3Ú'C\u009c\u009b\u009c\u009a4Þ¬\u0013»£Äßì\"Ñl\u009e'y\u0013éÞ\t\u0090\u0088ßjÉ±\u001bðWm\u007fÉÆ\u0018\u0094\u008f2 £\u0092ô\u001f\u0097tûÀ\u0002%z;@Jô,Ú£*ÄJg«*ê\u0081'B\u009d}OÃgë\"QÉâù§öK\u0018úÍ\u007fã\u0082¥dÙ\u0011¼\u0085¹»\u000eO;\u0082(\u0093´Ù\u0096¯Êé÷[(qBà\u009aj[òÔ\u0097ò\u0018\u007f×2L0$\u0002¤¸61þ\u008cc\u001c\t\"rÂVË-µóõ\u009eåVøÄè¬/·ß7µx|\\±Ú/Ü\u0005YF\u009fÝ\u0086\u0093(ÿ\u00ad\u0096\u008fsõtG¨Êî=ñÊ\u0013î\u0005\u0096\u0097©¥6(Ec#Mt¡ÿ\u0086¼ýUA³î\u0018\u00189\u0099\u0082iIö¶Tß\u0087¦¸÷jGU7öè«\u000b:\u001e\u0098n0\u0081\u0013*r=\n\t\u0006#å\n\u0082\u009dÎJ¶¼R)\u008f×À$F×Xg¦hip³Z\bK\u00116ý>ÃÖJ3ü]!<\u009c\u0000ÕH/þî\u008eSn\u001d\tSùW\u0007¥wÙ\u0012\u0094¡IP\u0083H6\u0017;\u0016Ã\u0087!õ\u001f\u0014¤%\u0084Y3¨î+h\"Rü\u000b¡*h0K,r¼/ûë)\u0001RJÈ\u0002`\u0018þ°\u0092IÏBà\u0094e\u0018,ØÐwì\u009bX\u00adÌ°º\u0089ç\u009dHu\u0092ù*U¸¦hø\u0099\u008f\u0093ë¸i\u0094.ÕµH\u0098DÞ¢ãse\u0000\u0019\u001c¯\u001aèdéç÷]ZÛÑÒ\u0085qñ»\u0086\u00130×\u0000\u001bÐ¨*]\u0090\u0089âyãë\b9åMVÒKv| }°½ô}Il\u000eÊ\bÕ\u009a\t)\u009cîïâÆm@\u0017¢,Xóà(@!2æVP\thÜ\"\u007f\u001c¬a!@S&4aô\u008f%«,*ÈÞÛ\r\u0089·.mD\u0096\u0016¼»@\r\u0092£\u0016T¨\u0089Ý<~\u00ad\u0003KÂ»c\u0016re\u0091I²@ºãß?L\u0011øztJ\u007fî[ÈÔó\u0003\u008cõ,À\\²Ö\u0096ß\u0010ÙÉàî\u008fIÉ\u0082\u0088:¡óÚ½\u009f\u0011p£\u00951¼²û.!ÚR)\u0017$}U¿å\u00ad*¡º\u0002Ò\u009b;\rO?;\u007fNÓ{÷\u008fÛ7T0¸+s\u0000m\u0010Gk\u008f¿±Cõñ\u0095\u008d\u009eW\u0007ÄV\u0005£~\u0019´ÂÉ×.|Té\u0005\u008c\u001eo±\u00adÐ\u0096\u0091)\u0093\u000f\u0000\u0004¶Þè¶u^H÷9\u0006)J×9sSó \n\u0099\u0092*½\u008dX\u008aª\u0089$æ-\u0006¼\u0007§\u009a:GÂ\u00076\u0017\u009eû§Ö7\u0085\u0096eû\u0085É{\u008eÝD\r\u007f>\u0017ÃX_Yjð\u0095mÀ´æÓ¢z\u0091K1\u0091Ñâ\u0081Ã}c¡\u0010û\u0007Ò'\u008a\fÜÎñÁm\u0090µy¨.^Gv{\u0088\u001a\u0014RM!ÿä¨\u0014£\u0099OõTn\u0004¹/è\u0092¥Y¾\u00807SDvñ\u00168ð\u001a¦©\u000bÂÝÑ@ÏÓ*ßÈ\u001bVÉÔ_?{<\u0086\u0094aÝ;8µÀ#ç Iã\u008d½\u001a¸»\u0088FbÛ\u009f\u009e¤\u00ad[×ø\u0019Óâ}y¤ý\u001f¾ÏdFY{×\u0093\u0099¶øßÙ q¥JÔ×\u009c7°~\u007fF\u008e¡1/4a\u0083\u0016ÇîdC\u0000DÝã_k\u001c-R\u000baã½:\u001bô\u0016G\u00ad\u008e[è¼G¯\u008dæ»Çé\u0087ìC]ýsgÊL;\u008f\u0013 ´{úT«¨Ê\u0005\u001aÚ\u001eWH3\u0080\u0018\u0012¢\u0098\u009d\u008cºú÷\u0081þø\u0098\u0090\u0014á5)¾áØð\u0007\u0004°Õ\u0080oÏ¸YÚïä&9ÞÛ\u0002Å\u00852-\u001b\u008cÌí\u001d8\u00917j\u001d"
         .getBytes("ISO-8859-1");

      int var55;
      do {
         IIIlI[var21] = ((var10002[var24] & 255) << 24 | (var10002[var24 + 1] & 255) << 16 | (var10002[var24 + 2] & 255) << 8 | var10002[var24 + 3] & 255)
            ^ 292201214;
         var21 += 1;
         var55 = var24 + 4;
         var24 += 4;
      } while (var55 < var10002.length);

      String[] var5 = new String[Illll(1021704726, var17 ^ -1648259343)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = lIIII(44, -780769371, -1861457655, (byte)-116, 57367674)).length();
      int var1 = Illll(1021704727, var17 ^ 749951648);
      int var19 = -1;

      label103:
      while (true) {
         var21 = Illll(1021704728, var17 ^ 2119877880);
         String var27 = var2.substring(++var19, var19 + var1);
         byte var39 = -1;

         while (true) {
            label98: {
               char[] var57 = var27.toCharArray();
               int var69 = var57.length;
               int var6 = 0;
               var55 = var21;
               var44 = var57;
               var24 = var69;
               char[] var81;
               int var88;
               if (var69 <= 1) {
                  var81 = var57;
                  var69 = var21;
                  var88 = var6;
               } else {
                  var55 = var21;
                  var24 = var69;
                  if (var69 <= var6) {
                     break label98;
                  }

                  var81 = var57;
                  var69 = var21;
                  var88 = var6;
               }

               while (true) {
                  var81[var88] = (char)(var81[var88] ^ var69 ^ switch (var6 % Illll(1021704731, var17 ^ -1214792600)) {
                     case 0 -> Illll(1021704732, var17 ^ -1501715013);
                     case 1 -> Illll(1021704733, var17 ^ 534226200);
                     case 2 -> Illll(1021704734, var17 ^ -965853170);
                     case 3 -> Illll(1021704735, var17 ^ -471258347);
                     case 4 -> Illll(1021704704, var17 ^ -1909416385);
                     case 5 -> Illll(1021704705, var17 ^ -766542574);
                     default -> Illll(1021704706, var17 ^ -311721656);
                  });
                  var6++;
                  if (var55 == 0) {
                     var88 = var55;
                     var81 = var44;
                     var69 = var55;
                  } else {
                     if (var24 <= var6) {
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
                     IIIII = var5;
                     lll = new String[Illll(1021704730, var17 ^ -1160528369)];
                     II = IlIIllIII.Ill(Illl(Illll(1021704707, var17 ^ -71576662), Illll(1021704708, var17 ^ 91990293)));
                     return;
                  }

                  var1 = var2.charAt(var19);
                  break;
               default:
                  var5[var3++] = var62;
                  if ((var19 += var1) < var4) {
                     var1 = var2.charAt(var19);
                     continue label103;
                  }

                  var4 = (var2 = lIIII((byte)-60, -780769372, -989008810, (byte)-67, -89316743)).length();
                  var1 = 4;
                  var19 = -1;
            }

            var21 = Illll(1021704729, var17 ^ 617339955);
            var27 = var2.substring(++var19, var19 + var1);
            var39 = 0;
         }
      }
   }

   static boolean llI(float var0, float var1, float var2) {
      return Float.isFinite(var0) && var0 >= Math.max(0.0F, var1) + Math.max(0.0F, var2);
   }

   private boolean lll(class_310 var1, int var2) {
      if (var1 != null && var1.field_1724 != null && var2 >= 0 && var2 < Illll(1021705027, -1304236684 ^ 1980267619)) {
         class_1799 var3 = var1.field_1724.method_31548().method_5438(var2);
         return var3 != null && !var3.method_7960() && var3.method_7909() instanceof class_1747;
      } else {
         return false;
      }
   }

   static boolean IIII(double var0, double var2) {
      if (var0 >= 100.0) {
         return true;
      } else {
         return var0 <= 0.0 ? false : var2 < var0;
      }
   }

   private static class_2350 IIIl(double var0, double var2) {
      if (Math.abs(var0) >= Math.abs(var2)) {
         return var0 >= 0.0 ? class_2350.field_11034 : class_2350.field_11039;
      } else {
         return var2 >= 0.0 ? class_2350.field_11035 : class_2350.field_11043;
      }
   }

   static boolean IIlI(double var0, double var2, double var4, double var6, double var8, double var10) {
      double var12 = var4 - var0;
      double var14 = var6 - var2;
      double var16 = var8 - var0;
      double var18 = var10 - var2;
      double var20 = var12 * var12 + var14 * var14;
      double var22 = var16 * var12 + var18 * var14;
      return var20 > 1.0E-6 && var22 > 0.0 && var22 < var20;
   }

   private void IIll(class_310 var1) {
      this.I.removeIf(IIlI::IIIIl);
      this.IlI.removeIf(IIlI::I);
      this.lIl.keySet().removeIf(IIlI::lII);
   }

   private boolean IlII(class_310 var1, class_2338 var2) {
      return var1 != null
         && var1.field_1687 != null
         && var2 != null
         && (
            var1.field_1687.method_8320(var2).method_26215()
               || var1.field_1687.method_8320(var2).method_45474()
               || k74.x.IIll.lIIlIl(var1.field_1687.method_8320(var2))
         );
   }

   private boolean IlIl(class_310 var1, long var2, int var4, int var5, IlIIIIlI var6) {
      return this.lIlI(var1, var2, var4, var5, var6);
   }

   private Boolean IllI(Integer var1) {
      return this.lIll();
   }

   @Override
   public void IlIII() {
      this.IIIll();
      this.IIII.IIIIIII();
   }

   private static String Illl(int var0, int var1) {
      int var9 = -134741825;
      int var2 = (var0 ^ Illll(1021705028, var9 ^ 1474268736)) & Illll(1021705029, var9 ^ 777046987);
      if (lll[var2] == null) {
         char[] var3 = IIIII[var2].toCharArray();

         int var4 = switch (var3[0] & Illll(1021705030, var9 ^ -600438577)) {
            case 0 -> Illll(1021705031, var9 ^ 395472632);
            case 1 -> Illll(1021705032, var9 ^ 462307835);
            case 2 -> Illll(1021705033, var9 ^ 53251870);
            case 3 -> Illll(1021705034, var9 ^ -500433155);
            case 4 -> Illll(1021705035, var9 ^ -1586767864);
            case 5 -> Illll(1021705036, var9 ^ 1200573323);
            case 6 -> Illll(1021705037, var9 ^ -19363210);
            case 7 -> Illll(1021705038, var9 ^ -349219879);
            case 8 -> Illll(1021705039, var9 ^ -146310520);
            case 9 -> Illll(1021705072, var9 ^ 1756454208);
            case 10 -> Illll(1021705073, var9 ^ -982688297);
            case 11 -> Illll(1021705074, var9 ^ 1956195351);
            case 12 -> Illll(1021705075, var9 ^ -165220599);
            case 13 -> Illll(1021705076, var9 ^ -306015426);
            case 14 -> Illll(1021705077, var9 ^ -983320058);
            case 15 -> Illll(1021705078, var9 ^ -1835454581);
            case 16 -> Illll(1021705079, var9 ^ 912691454);
            case 17 -> Illll(1021705080, var9 ^ 439197972);
            case 18 -> Illll(1021705081, var9 ^ -1691926919);
            case 19 -> Illll(1021705082, var9 ^ -1146031855);
            case 20 -> Illll(1021705083, var9 ^ -1235819128);
            case 21 -> Illll(1021705084, var9 ^ -1279172872);
            case 22 -> Illll(1021705085, var9 ^ -2120777918);
            case 23 -> Illll(1021705086, var9 ^ 2048541113);
            case 24 -> Illll(1021705087, var9 ^ -1919686458);
            case 25 -> Illll(1021705056, var9 ^ -2806121);
            case 26 -> Illll(1021705057, var9 ^ 1756138333);
            case 27 -> Illll(1021705058, var9 ^ -1337057241);
            case 28 -> Illll(1021705059, var9 ^ -704729667);
            case 29 -> Illll(1021705060, var9 ^ 1443226892);
            case 30 -> Illll(1021705061, var9 ^ 2079024386);
            case 31 -> Illll(1021705062, var9 ^ 870051059);
            case 32 -> Illll(1021705063, var9 ^ 487965963);
            case 33 -> Illll(1021705064, var9 ^ -1995838598);
            case 34 -> Illll(1021705065, var9 ^ 832171202);
            case 35 -> Illll(1021705066, var9 ^ -1997359708);
            case 36 -> Illll(1021705067, var9 ^ -617710507);
            case 37 -> Illll(1021705068, var9 ^ 1486547399);
            case 38 -> Illll(1021705069, var9 ^ 1786631584);
            case 39 -> Illll(1021705070, var9 ^ -1083331354);
            case 40 -> Illll(1021705071, var9 ^ 91794953);
            case 41 -> Illll(1021704976, var9 ^ 1863676784);
            case 42 -> Illll(1021704977, var9 ^ -76244045);
            case 43 -> Illll(1021704978, var9 ^ -158451319);
            case 44 -> Illll(1021704979, var9 ^ 953408403);
            case 45 -> Illll(1021704980, var9 ^ 2138243960);
            case 46 -> Illll(1021704981, var9 ^ 1800873901);
            case 47 -> Illll(1021704982, var9 ^ 1494977586);
            case 48 -> Illll(1021704983, var9 ^ 288708747);
            case 49 -> Illll(1021704984, var9 ^ 1966514529);
            case 50 -> 4;
            case 51 -> Illll(1021704985, var9 ^ 1351942373);
            case 52 -> Illll(1021704986, var9 ^ -65592887);
            case 53 -> Illll(1021704987, var9 ^ -1222540508);
            case 54 -> Illll(1021704988, var9 ^ -1700699955);
            case 55 -> Illll(1021704989, var9 ^ 1983063605);
            case 56 -> Illll(1021704990, var9 ^ 2094724270);
            case 57 -> Illll(1021704991, var9 ^ 1007523681);
            case 58 -> Illll(1021704960, var9 ^ 225871883);
            case 59 -> Illll(1021704961, var9 ^ -971801882);
            case 60 -> Illll(1021704962, var9 ^ -489507645);
            case 61 -> Illll(1021704963, var9 ^ -1328383365);
            case 62 -> Illll(1021704964, var9 ^ 437911580);
            case 63 -> Illll(1021704965, var9 ^ 656905763);
            case 64 -> Illll(1021704966, var9 ^ 1346698250);
            case 65 -> Illll(1021704967, var9 ^ -1712603821);
            case 66 -> 3;
            case 67 -> Illll(1021704968, var9 ^ 1078196388);
            case 68 -> Illll(1021704969, var9 ^ -909343458);
            case 69 -> Illll(1021704970, var9 ^ 94045331);
            case 70 -> Illll(1021704971, var9 ^ -1226243595);
            case 71 -> Illll(1021704972, var9 ^ -912328550);
            case 72 -> Illll(1021704973, var9 ^ 1258289542);
            case 73 -> Illll(1021704974, var9 ^ 331758951);
            case 74 -> Illll(1021704975, var9 ^ -1927652938);
            case 75 -> Illll(1021705008, var9 ^ 477082364);
            case 76 -> Illll(1021705009, var9 ^ -396917420);
            case 77 -> Illll(1021705010, var9 ^ 778613063);
            case 78 -> Illll(1021705011, var9 ^ 565650613);
            case 79 -> Illll(1021705012, var9 ^ -1605605842);
            case 80 -> Illll(1021705013, var9 ^ 777780276);
            case 81 -> Illll(1021705014, var9 ^ -256676838);
            case 82 -> Illll(1021705015, var9 ^ 1901972534);
            case 83 -> Illll(1021705016, var9 ^ -46810216);
            case 84 -> Illll(1021705017, var9 ^ -1783348849);
            case 85 -> Illll(1021705018, var9 ^ -131666107);
            case 86 -> Illll(1021705019, var9 ^ 600887457);
            case 87 -> Illll(1021705020, var9 ^ -1030886454);
            case 88 -> Illll(1021705021, var9 ^ 972391329);
            case 89 -> Illll(1021705022, var9 ^ 57055770);
            case 90 -> Illll(1021705023, var9 ^ 1674324021);
            case 91 -> Illll(1021704992, var9 ^ -504033539);
            case 92 -> Illll(1021704993, var9 ^ 1856942250);
            case 93 -> Illll(1021704994, var9 ^ 278843771);
            case 94 -> Illll(1021704995, var9 ^ -234462194);
            case 95 -> Illll(1021704996, var9 ^ 1075674513);
            case 96 -> Illll(1021704997, var9 ^ 249615541);
            case 97 -> Illll(1021704998, var9 ^ -1516235758);
            case 98 -> Illll(1021704999, var9 ^ -363649794);
            case 99 -> Illll(1021705000, var9 ^ 1648433131);
            case 100 -> Illll(1021705001, var9 ^ 1444166383);
            case 101 -> Illll(1021705002, var9 ^ -133831574);
            case 102 -> Illll(1021705003, var9 ^ 291148730);
            case 103 -> Illll(1021705004, var9 ^ 803849058);
            case 104 -> Illll(1021705005, var9 ^ 582209117);
            case 105 -> Illll(1021705006, var9 ^ -171902560);
            case 106 -> Illll(1021705007, var9 ^ 1863277247);
            case 107 -> Illll(1021705168, var9 ^ 1806502252);
            case 108 -> Illll(1021705169, var9 ^ -550608888);
            case 109 -> Illll(1021705170, var9 ^ 133281069);
            case 110 -> Illll(1021705171, var9 ^ 635089045);
            case 111 -> Illll(1021705172, var9 ^ -1451076965);
            case 112 -> Illll(1021705173, var9 ^ 1925040226);
            case 113 -> Illll(1021705174, var9 ^ 733820366);
            case 114 -> Illll(1021705175, var9 ^ -538857106);
            case 115 -> Illll(1021705176, var9 ^ 2134969872);
            case 116 -> Illll(1021705177, var9 ^ -1185649792);
            case 117 -> Illll(1021705178, var9 ^ 2072551668);
            case 118 -> Illll(1021705179, var9 ^ 656566267);
            case 119 -> Illll(1021705180, var9 ^ 879705686);
            case 120 -> Illll(1021705181, var9 ^ 1140150191);
            case 121 -> Illll(1021705182, var9 ^ 750875245);
            case 122 -> Illll(1021705183, var9 ^ 1574018778);
            case 123 -> Illll(1021705152, var9 ^ -1339001926);
            case 124 -> Illll(1021705153, var9 ^ 748653910);
            case 125 -> Illll(1021705154, var9 ^ -529940765);
            case 126 -> Illll(1021705155, var9 ^ -352963133);
            case 127 -> Illll(1021705156, var9 ^ -1471533963);
            case 128 -> Illll(1021705157, var9 ^ -598424798);
            case 129 -> Illll(1021705158, var9 ^ 1491789884);
            case 130 -> Illll(1021705159, var9 ^ 1825272989);
            case 131 -> Illll(1021705160, var9 ^ 1436608146);
            case 132 -> Illll(1021705161, var9 ^ -1667203450);
            case 133 -> Illll(1021705162, var9 ^ 2082426788);
            case 134 -> Illll(1021705163, var9 ^ 1764568686);
            case 135 -> Illll(1021705164, var9 ^ -884876446);
            case 136 -> Illll(1021705165, var9 ^ 430009370);
            case 137 -> Illll(1021705166, var9 ^ 640288683);
            case 138 -> Illll(1021705167, var9 ^ 1182266145);
            case 139 -> Illll(1021705200, var9 ^ -175519630);
            case 140 -> Illll(1021705201, var9 ^ -1994835012);
            case 141 -> Illll(1021705202, var9 ^ -1987153453);
            case 142 -> Illll(1021705203, var9 ^ 2130771965);
            case 143 -> Illll(1021705204, var9 ^ 1322676191);
            case 144 -> Illll(1021705205, var9 ^ 1497305148);
            case 145 -> Illll(1021705206, var9 ^ -513677960);
            case 146 -> Illll(1021705207, var9 ^ -75351687);
            case 147 -> Illll(1021705208, var9 ^ 2119344781);
            case 148 -> Illll(1021705209, var9 ^ -371210106);
            case 149 -> Illll(1021705210, var9 ^ -1303022564);
            case 150 -> Illll(1021705211, var9 ^ -774501178);
            case 151 -> Illll(1021705212, var9 ^ -365163820);
            case 152 -> Illll(1021705213, var9 ^ 1717099985);
            case 153 -> Illll(1021705214, var9 ^ -210340651);
            case 154 -> Illll(1021705215, var9 ^ 309675717);
            case 155 -> Illll(1021705184, var9 ^ 617067719);
            case 156 -> Illll(1021705185, var9 ^ 355845806);
            case 157 -> Illll(1021705186, var9 ^ -1083241850);
            case 158 -> Illll(1021705187, var9 ^ 167824066);
            case 159 -> Illll(1021705188, var9 ^ -2099582427);
            case 160 -> Illll(1021705189, var9 ^ 1627308337);
            case 161 -> Illll(1021705190, var9 ^ -1845316532);
            case 162 -> Illll(1021705191, var9 ^ -266166725);
            case 163 -> Illll(1021705192, var9 ^ -1299202076);
            case 164 -> Illll(1021705193, var9 ^ 1235001059);
            case 165 -> 5;
            case 166 -> Illll(1021705194, var9 ^ 1314517994);
            case 167 -> Illll(1021705195, var9 ^ -1829805441);
            case 168 -> Illll(1021705196, var9 ^ 2022987205);
            case 169 -> Illll(1021705197, var9 ^ -630310352);
            case 170 -> Illll(1021705198, var9 ^ -1063304571);
            case 171 -> 2;
            case 172 -> Illll(1021705199, var9 ^ 1031830320);
            case 173 -> Illll(1021705104, var9 ^ 27718666);
            case 174 -> Illll(1021705105, var9 ^ -1417241113);
            case 175 -> Illll(1021705106, var9 ^ -918031877);
            case 176 -> Illll(1021705107, var9 ^ -1045983719);
            case 177 -> Illll(1021705108, var9 ^ -2014859310);
            case 178 -> Illll(1021705109, var9 ^ -1550529102);
            case 179 -> Illll(1021705110, var9 ^ -476943403);
            case 180 -> Illll(1021705111, var9 ^ 138170371);
            case 181 -> Illll(1021705112, var9 ^ -99969320);
            case 182 -> Illll(1021705113, var9 ^ 772435727);
            case 183 -> Illll(1021705114, var9 ^ -725799370);
            case 184 -> Illll(1021705115, var9 ^ 1082003249);
            case 185 -> Illll(1021705116, var9 ^ 882427122);
            case 186 -> 0;
            case 187 -> Illll(1021705117, var9 ^ -1221119505);
            case 188 -> Illll(1021705118, var9 ^ -164637418);
            case 189 -> Illll(1021705119, var9 ^ -231274734);
            case 190 -> Illll(1021705088, var9 ^ 1008825911);
            case 191 -> Illll(1021705089, var9 ^ -1297415094);
            case 192 -> Illll(1021705090, var9 ^ -958707886);
            case 193 -> Illll(1021705091, var9 ^ -1708916622);
            case 194 -> Illll(1021705092, var9 ^ -1148999220);
            case 195 -> Illll(1021705093, var9 ^ 1901792440);
            case 196 -> Illll(1021705094, var9 ^ 78392110);
            case 197 -> Illll(1021705095, var9 ^ 1834568465);
            case 198 -> Illll(1021705096, var9 ^ 1281464848);
            case 199 -> Illll(1021705097, var9 ^ -1703234436);
            case 200 -> Illll(1021705098, var9 ^ -870085015);
            case 201 -> Illll(1021705099, var9 ^ 122378329);
            case 202 -> Illll(1021705100, var9 ^ -650320740);
            case 203 -> Illll(1021705101, var9 ^ -1184803778);
            case 204 -> Illll(1021705102, var9 ^ 1262392535);
            case 205 -> Illll(1021705103, var9 ^ 1620375924);
            case 206 -> Illll(1021705136, var9 ^ -1771643237);
            case 207 -> Illll(1021705137, var9 ^ -1371711157);
            case 208 -> Illll(1021705138, var9 ^ -2118126934);
            case 209 -> Illll(1021705139, var9 ^ -637807673);
            case 210 -> Illll(1021705140, var9 ^ 439063798);
            case 211 -> Illll(1021705141, var9 ^ 1286092392);
            case 212 -> Illll(1021705142, var9 ^ 328714463);
            case 213 -> Illll(1021705143, var9 ^ -1816222663);
            case 214 -> Illll(1021705144, var9 ^ -522791587);
            case 215 -> Illll(1021705145, var9 ^ 1743271855);
            case 216 -> Illll(1021705146, var9 ^ 2044860396);
            case 217 -> Illll(1021705147, var9 ^ 1754007738);
            case 218 -> 1;
            case 219 -> Illll(1021705148, var9 ^ 2428868);
            case 220 -> Illll(1021705149, var9 ^ -32869383);
            case 221 -> Illll(1021705150, var9 ^ 1071254709);
            case 222 -> Illll(1021705151, var9 ^ 1618343093);
            case 223 -> Illll(1021705120, var9 ^ -512071316);
            case 224 -> Illll(1021705121, var9 ^ -519542740);
            case 225 -> Illll(1021705122, var9 ^ -1585403530);
            case 226 -> Illll(1021705123, var9 ^ -316467563);
            case 227 -> Illll(1021705124, var9 ^ -251386144);
            case 228 -> Illll(1021705125, var9 ^ -902803981);
            case 229 -> Illll(1021705126, var9 ^ 1707500801);
            case 230 -> Illll(1021705127, var9 ^ 736275228);
            case 231 -> Illll(1021705128, var9 ^ -1921981709);
            case 232 -> Illll(1021705129, var9 ^ -539731805);
            case 233 -> Illll(1021705130, var9 ^ 1857417128);
            case 234 -> Illll(1021705131, var9 ^ -200576347);
            case 235 -> Illll(1021705132, var9 ^ -537184074);
            case 236 -> Illll(1021705133, var9 ^ 1809512059);
            case 237 -> Illll(1021705134, var9 ^ 1264497943);
            case 238 -> Illll(1021705135, var9 ^ -629960627);
            case 239 -> Illll(1021704784, var9 ^ 851530436);
            case 240 -> Illll(1021704785, var9 ^ -1837097280);
            case 241 -> Illll(1021704786, var9 ^ -214044521);
            case 242 -> Illll(1021704787, var9 ^ -1457204171);
            case 243 -> Illll(1021704788, var9 ^ -789662363);
            case 244 -> Illll(1021704789, var9 ^ 1744470001);
            case 245 -> Illll(1021704790, var9 ^ 1895695153);
            case 246 -> Illll(1021704791, var9 ^ -143549602);
            case 247 -> Illll(1021704792, var9 ^ 2112691681);
            case 248 -> Illll(1021704793, var9 ^ 409997684);
            case 249 -> Illll(1021704794, var9 ^ 1150058496);
            case 250 -> Illll(1021704795, var9 ^ -302861850);
            case 251 -> Illll(1021704796, var9 ^ 569568799);
            case 252 -> Illll(1021704797, var9 ^ 1420452831);
            case 253 -> Illll(1021704798, var9 ^ -1521930113);
            case 254 -> Illll(1021704799, var9 ^ -2111275458);
            default -> Illll(1021704768, var9 ^ 719473383);
         };
         int var5 = (var1 & Illll(1021704769, var9 ^ 1855058988)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & Illll(1021704770, var9 ^ -1595501636)) >>> Illll(1021704771, var9 ^ 1269220858)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & Illll(1021704772, var9 ^ 420103210);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & Illll(1021704773, var9 ^ -896786344);
            }
         }

         lll[var2] = new String(var3).intern();
      }

      return lll[var2];
   }

   public IIlI() {
      int var1 = -125033536;
      super(
         IlIIllIII.Ill(Illl(Illll(1021704774, var1 ^ 225870866), Illll(1021704775, var1 ^ -468909721))),
         lllIIlIl.I,
         IlIIllIII.Ill(Illl(Illll(1021704776, var1 ^ -1169559193), Illll(1021704777, var1 ^ 77766458)))
      );
      this.lI = this.IllIIll(
         new IllIII<>(IlIIllIII.Ill(Illl(Illll(1021704778, var1 ^ 1366594260), Illll(1021704779, var1 ^ -2024902810))), IllIIlII.class, IllIIlII.II)
      );
      this.llI = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(Illl(Illll(1021704780, var1 ^ -833315738), Illll(1021704781, var1 ^ -1280114002))), 100.0, 0.0, 100.0, 1.0)
            .IIIl(IlIIllIII.Ill(Illl(Illll(1021704782, var1 ^ 1157116388), Illll(1021704783, var1 ^ 1032976002))))
      );
      this.lIIl = this.IllIIll(new IIlIII(IlIIllIII.Ill(Illl(Illll(1021704816, var1 ^ -1803763800), Illll(1021704817, var1 ^ 1854551956))), 9.0, 1.0, 9.0, 1.0));
      this.llll = this.IllIIll(
         new lIlllIl(IlIIllIII.Ill(Illl(Illll(1021704818, var1 ^ 302813784), Illll(1021704819, var1 ^ -2080958645))), 0.0, 0.0, 0.0, 300.0, 5.0)
            .Ill(IlIIllIII.Ill(Illl(Illll(1021704820, var1 ^ -71547094), Illll(1021704821, var1 ^ 2304054))))
      );
      this.lllI = this.IllIIll(
         new lIlllIl(IlIIllIII.Ill(Illl(Illll(1021704822, var1 ^ 2083871917), Illll(1021704823, var1 ^ 361216480))), 0.0, 0.0, 0.0, 500.0, 5.0)
            .Ill(IlIIllIII.Ill(Illl(Illll(1021704824, var1 ^ -1096985151), Illll(1021704825, var1 ^ -306799498))))
      );
      this.III = this.IllIIll(
         new IllIII<>(IlIIllIII.Ill(Illl(Illll(1021704826, var1 ^ -849559270), Illll(1021704827, var1 ^ 1488849811))), lIIllIlI.class, lIIllIlI.l)
      );
      this.IllI = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(Illl(Illll(1021704828, var1 ^ -1854615920), Illll(1021704829, var1 ^ -245137466))), 50.0, 1.0, 100.0, 1.0).lIlI(this::lllI)
      );
      this.Ill = this.IllIIll(new lllIIlII(IlIIllIII.Ill(Illl(Illll(1021704830, var1 ^ -2019074295), Illll(1021704831, var1 ^ -858721143))), false));
      this.IIII = new IlIIIllll();
      this.ll = new HashMap<>();
      this.I = new HashSet<>();
      this.IlI = new HashSet<>();
      this.lIl = new HashMap<>();
      this.IIl = Illll(1021704800, var1 ^ 749205808);
      this.lII = Illll(1021704801, var1 ^ -338927512);
      this.llIl = Long.MIN_VALUE;
      this.Illl = Long.MIN_VALUE;
      this.Il = Illll(1021704802, var1 ^ 209245118);
      this.IIll = Illll(1021704803, var1 ^ -860488461);
      this.IlIl = Illll(1021704804, var1 ^ -1935444594);
   }

   private void lIII() {
      this.lII = Illll(1021704805, -181666108 ^ 309333682);
      this.llIl = Long.MIN_VALUE;
      this.Illl = Long.MIN_VALUE;
   }

   private void lIIl(class_310 var1, int var2, int var3, float var4) {
      if (this.Ill.IllI() && var1 != null && var1.field_1724 != null) {
         int var5 = var1.field_1724.field_6012;
         if (this.Il != var2
            || this.IIll != var3
            || this.IlIl == Illll(1021704806, 1339083659 ^ -705719779)
            || var5 - this.IlIl >= Illll(1021704807, 1339083659 ^ 617696600)) {
            this.Il = var2;
            this.IIll = var3;
            this.IlIl = var5;
            PrintStream var10000 = System.out;
            String var6 = II.llIl();
            var10000.println(var6 + var2 + ":" + var5 + ":" + var3 + ":" + var4);
         }
      }
   }

   private boolean lIlI(class_310 var1, long var2, int var4, int var5, IlIIIIlI var6) {
      if (var2 == this.lIlI && this.IlII && this.ll(var1)) {
         this.IlII = false;
         boolean var7 = this.IIl(var1, var4, var5, var6);
         if (var7) {
            this.IlI.add(var4);
         }

         this.lIIl(var1, var7 ? Illll(1021704809, 1910184995 ^ 1251202409) : Illll(1021704810, 1910184995 ^ 525631442), var4, var5 + 1.0F);
         return var7;
      } else {
         this.lIIl(var1, Illll(1021704808, 1910184995 ^ 1935694573), var4, var2 == this.lIlI ? 1.0F : 0.0F);
         return false;
      }
   }

   private boolean lIll() {
      return IIII(this.llI.IllI(), ThreadLocalRandom.current().nextDouble(100.0));
   }

   private IlIIIIlI llII(class_310 var1, class_1701 var2) {
      class_2338 var3 = var1.field_1724.method_24515();
      class_2350 var4 = IIIl(var2.method_23317() - var1.field_1724.method_23317(), var2.method_23321() - var1.field_1724.method_23321());
      class_2338 var5 = var3.method_10093(var4);
      IlIIIIlI var6 = null;
      float var7 = Float.POSITIVE_INFINITY;
      float var8 = this.IllIl(var1, var2, null);
      boolean var9 = false;

      for (class_2338 var11 : List.of(var5, var5.method_10084())) {
         class_243 var12 = class_243.method_24953(var11);
         if (IIlI(var1.field_1724.method_23317(), var1.field_1724.method_23321(), var2.method_23317(), var2.method_23321(), var12.field_1352, var12.field_1350)
            )
          {
            IlIIIIlI var13 = this.IIIII(var1, var11);
            if (var13 != null) {
               var9 = true;
               float var14 = this.IllIl(var1, var2, var11);
               if (var8 - var14 >= 0.25F && var14 < var7) {
                  var7 = var14;
                  var6 = var13;
               }
            }
         }
      }

      if (var6 == null && var9) {
         this.lIIl(var1, Illll(1021704811, -1691246640 ^ 1440863148), var2.method_5628(), var8);
      }

      return var6;
   }

   private boolean lllI() {
      return this.III.IllI() == lIIllIlI.II;
   }

   private IlIIIIlI IIIII(class_310 var1, class_2338 var2) {
      if (this.IlII(var1, var2) && var1.field_1687.method_8335(null, new class_238(var2)).isEmpty()) {
         for (class_2350 var6 : class_2350.values()) {
            class_2338 var7 = var2.method_10093(var6);
            class_2680 var8 = var1.field_1687.method_8320(var7);
            if (!var8.method_26215() && !var8.method_26220(var1.field_1687, var7).method_1110()) {
               class_2350 var9 = var6.method_10153();
               class_243 var10 = class_243.method_24953(var7).method_1019(class_243.method_24954(var9.method_62675()).method_1021(0.5));
               if (!(var1.field_1724.method_33571().method_1025(var10) > 20.25)) {
                  return new IlIIIIlI(var2.method_10062(), var10, new class_3965(var10, var9, var7.method_10062(), false));
               }
            }
         }

         return null;
      } else {
         return null;
      }
   }

   private static boolean IIIIl(class_310 var0, Integer var1) {
      return var0.field_1687.method_8469(var1) == null;
   }

   private class_1799 IIIlI(class_310 var1) {
      int var2 = k74.x.IIll.lIIlI(var1);
      return var2 >= 0 && var2 < Illll(1021704812, -1998467781 ^ -2009275984) ? var1.field_1724.method_31548().method_5438(var2) : class_1799.field_8037;
   }

   private static String lIIII(byte var0, int var1, int var2, byte var3, int var4) {
      int var9 = var1 ^ -780769371;
      char[] var8 = IIIll[var9].toCharArray();
      StackTraceElement[] var10 = (StackTraceElement[])IIlII[var9];
      StackTraceElement[] var11;
      if (var10 != null) {
         var11 = var10;
      } else {
         var11 = new Throwable().getStackTrace();
         IIlII[var9] = var11;
      }

      StackTraceElement var12 = var11[1];
      int var6 = (var12.getClassName().hashCode() ^ var12.getMethodName().hashCode()) >> 16 ^ 49241;

      for (int var7 = 0; var7 < var8.length; var7++) {
         var8[var7] = (char)(var8[var7] ^ var7 ^ var2 ^ var3 ^ var1 ^ var4 ^ var0 ^ var6);
      }

      return new String(var8).intern();
   }

   private void IIIll() {
      this.ll.clear();
      this.I.clear();
      this.IlI.clear();
      this.lIl.clear();
      this.IlII = false;
      this.IIl = Illll(1021704813, 1937111802 ^ 1028122371);
      this.lIII();
      this.Il = Illll(1021704814, 1937111802 ^ 720149174);
      this.IIll = Illll(1021704815, 1937111802 ^ 1352742310);
      this.IlIl = Illll(1021704720, 1937111802 ^ -1722462077);
      this.IIII.IIlIl();
   }

   private boolean IIlII(class_310 var1, class_1701 var2, int var3, IlIIIIlI var4) {
      long var5 = ++this.lIlI;
      int var7 = var2.method_5628();
      float[] var8 = IlllIlII.lIII(var1, var4.l());
      if (var8 == null) {
         this.lIIl(var1, Illll(1021704721, -509417244 ^ 2011833951), var7, 0.0F);
         return false;
      } else {
         this.IlII = true;
         this.IIl = var1.field_1724.field_6012;
         boolean var9 = IlllIlII.IlII(var1, Illll(1021704722, -509417244 ^ 544117524), var8[0], var8[1], this::IlIl);
         if (!var9) {
            this.lIIl(var1, Illll(1021704723, -509417244 ^ -1085667945), var7, 0.0F);
            if (var5 == this.lIlI) {
               this.IlII = false;
               this.IIl = Illll(1021704724, -509417244 ^ 2007161951);
            }

            return false;
         } else {
            return true;
         }
      }
   }

   private static int Illll(int var0, int var1) {
      int var2 = IIIlI[var0 ^ 1021705040] ^ var1 ^ var0;
      var2 ^= 50265;
      var2 ^= 29046;
      var2 ^= 41293;
      var2 ^= 23033;
      var2 ^= 37350;
      return var2 ^ 41740;
   }

   private void IIllI(class_310 var1, class_1701 var2, int var3, IlIIIIlI var4) {
      float var5 = this.IIII.IIIllII(var1, var4.II(), this.IllI.IllI().floatValue());
      boolean var6 = var5 <= 1.0F
         || var1.field_1765 instanceof class_3965 var7
            && var7.method_17777().equals(var4.II().method_17777())
            && var7.method_17780() == var4.II().method_17780();
      if (!var6) {
         this.lIIl(var1, Illll(1021704725, 1502170560 ^ -1065512807), var2.method_5628(), var5);
      } else {
         this.IIII.IIlIl();
         if (this.IIl(var1, var2.method_5628(), var3, var4)) {
            this.IlI.add(var2.method_5628());
            this.lIII();
         }
      }
   }

   private boolean IIlll(class_1701 var1) {
      return var1.method_5805() && !var1.method_31481() && !this.I.contains(var1.method_5628());
   }

   private float IllII(class_1701 var1) {
      return Math.max(11.5F, this.III(var1));
   }

   private float IllIl(class_310 var1, class_1701 var2, class_2338 var3) {
      return IIIIllIlI.lII(var1.field_1724, var2.method_73189(), this.IllII(var2), var3);
   }

   private void IlllI(class_310 var1) {
      Iterator var2 = this.ll.entrySet().iterator();

      while (var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         if (var1.field_1724.field_6012 - (Integer)var3.getValue() > Illll(1021704709, 105778620 ^ -1158266835)) {
            var2.remove();
         } else {
            class_238 var4 = new class_238((class_2338)var3.getKey()).method_1014(1.5);
            List var5 = var1.field_1687.method_8390(class_1701.class, var4, this::IIlll);
            if (!var5.isEmpty()) {
               this.I.add(((class_1701)var5.get(0)).method_5628());
               var2.remove();
            }
         }
      }
   }
}
