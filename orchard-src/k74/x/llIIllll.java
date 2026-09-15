package k74.x;

import java.awt.Color;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1109;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1676;
import net.minecraft.class_243;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_3414;

@Environment(EnvType.CLIENT)
public final class llIIllll extends IlIIIIIIl {
   private final IIlIII I;
   private static final String[] lll;
   private final Map<Integer, llIl> II;
   private static final String[] Il;
   private static final IIIlIlIl lI;
   private long ll;
   private final lllIIlII III;
   private static final Object[] IIII;
   private static final String[] IIl;
   private static final double IlI = 16.0;
   private static final int[] llI;
   private static final IIIlIlIl Ill;
   private static final long lII = 2500L;
   private final lllIIlII lIl;

   private boolean I(byte var1) {
      return var1 == 2
         || var1 == ll(-969491662, -230288964 ^ -120070172)
         || var1 == ll(-969491661, -230288964 ^ 629541053)
         || var1 == ll(-969491664, -230288964 ^ -1476231075);
   }

   private static int ll(int var0, int var1) {
      int var2 = llI[var0 ^ -969491662] ^ var1 ^ var0;
      var2 += 28887;
      var2 ^= 46910;
      var2 ^= 40865;
      var2 -= 12319;
      var2 ^= 46069;
      var2 += 42975;
      var2 += 40685;
      var2 -= 7223;
      var2 ^= 4103;
      return var2 - 7490;
   }

   @Override
   public void IIlIl() {
      this.Il(class_310.method_1551());
   }

   @Override
   public void IlIlI(class_1297 var1) {
      if (var1 instanceof class_1309 var2 && !var2.method_31481()) {
         this.II();
      }
   }

   private static class_3414 l() {
      return class_3414.method_47908(class_2960.method_60655(lI.llIl(), Ill.llIl()));
   }

   @Override
   public void lllIlI(class_1297 var1, byte var2) {
      if (var1 instanceof class_1309 var3 && !var3.method_31481() && this.I(var2)) {
         class_310 var4 = class_310.method_1551();
         if (var4 != null && var4.field_1724 != null && var1 != var4.field_1724) {
            long var5 = System.currentTimeMillis();
            class_243 var7 = new class_243(var1.method_23317(), var1.method_23318(), var1.method_23321());

            for (llIl var9 : this.II.values()) {
               if (var5 - var9.l() <= 2500L && var9.I().method_1025(var7) <= 16.0) {
                  this.II();
                  return;
               }
            }
         }
      }
   }

   private void II() {
      this.ll = System.currentTimeMillis();
      if (this.III.IllI()) {
         class_310 var1 = class_310.method_1551();
         if (var1 != null && var1.method_1483() != null) {
            var1.method_1483().method_4873(class_1109.method_4757(l(), 1.0F, 1.0F));
         }
      }
   }

   @Override
   public void llIl() {
      this.ll = 0L;
      this.II.clear();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = -1829261091;
      short var18 = 5126;
      int var17 = 0;
      int var16 = 0;
      int var14 = "\u0091䤲둕䦀㓕䟏铄䔥\ue4e0䶕\ua4ca亲\u2458仐擖䨟䓎䗅㓢䃕듁䜲员䮠㓙䃿ᓏ䎅듧䵕蓀䪢瑘䀐擐䏯㓀䨅哨䦵꓁䗒쑚䴀䓑䝏쓁亥\ue4ea䭥쓆䑢љ亰哓䟿ᓎ佅ᓦ䛕\ue4cb䭢\uf456䚐ꓝ䪯\ue4ca䕅哩䌵哅䴂ᑐ䛀蓔䯿蓁䋕瓯䤅퓌䀒葖䍐\uf4d8䂿쓏䰕哩䂅㓆䐂둗䈐듘䊯擆俕擦䥵\uf4c5䶢䑗䒰ᓟ䂏\ue4c1䧵ⓡ䱥Ⓠ䕂둗䟀㓝䟏擏䛥ⓨ䵵铆䩢\uf457仰ⓜ䬟哋䧥瓠䷅擁䘂푚䷀ꓕ䧟ᓀ亵瓪䉥铀䮲呐䆰瓝䒿\u0015ꎯꦰꆭ⤼꺒ᤢꌸ⤍ꯈ\ue926ꯟ\ud9b7꒝줾ꅒ褨ꑸ䤊꼨뤧꺟"
         .length();
      String var13 = "\u0091䤲둕䦀㓕䟏铄䔥\ue4e0䶕\ua4ca亲\u2458仐擖䨟䓎䗅㓢䃕듁䜲员䮠㓙䃿ᓏ䎅듧䵕蓀䪢瑘䀐擐䏯㓀䨅哨䦵꓁䗒쑚䴀䓑䝏쓁亥\ue4ea䭥쓆䑢љ亰哓䟿ᓎ佅ᓦ䛕\ue4cb䭢\uf456䚐ꓝ䪯\ue4ca䕅哩䌵哅䴂ᑐ䛀蓔䯿蓁䋕瓯䤅퓌䀒葖䍐\uf4d8䂿쓏䰕哩䂅㓆䐂둗䈐듘䊯擆俕擦䥵\uf4c5䶢䑗䒰ᓟ䂏\ue4c1䧵ⓡ䱥Ⓠ䕂둗䟀㓝䟏擏䛥ⓨ䵵铆䩢\uf457仰ⓜ䬟哋䧥瓠䷅擁䘂푚䷀ꓕ䧟ᓀ亵瓪䉥铀䮲呐䆰瓝䒿\u0015ꎯꦰꆭ⤼꺒ᤢꌸ⤍ꯈ\ue926ꯟ\ud9b7꒝줾ꅒ褨ꑸ䤊꼨뤧꺟";
      String[] var15 = new String[2];

      do {
         char var19 = var13.charAt(var17);
         int var21 = 0;
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 5) {
               default -> 134;
               case 1 -> 17;
               case 2 -> 164;
               case 3 -> 145;
               case 4 -> 139;
            }) ^ var22;
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 4 | var22 << 12) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 4 | var22 >>> 12) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      lll = var15;
      IIII = new Object[var15.length];
      int var9 = 1269464915;
      byte[] var7 = "xó2Ö¥¢å\u0091(&miK.ÈÿT\u0005\u0091{+Ý\r\u0011\u0004nE¦KÛëQVùs\r\u00152\u0015$ÖNYfþq\u001eÙF\u008dWïÚ\u000f'\u008a`\u0081Ýª¾\u0013T[NF\u008eÆ<\b\u008doÜ\n(Uqvá\u0095\taAVbx pÕ°\u001aãEºuÈ\u0084\u0094ÖM\u009d¢¿À#X\u0016t\u009c\u009f_\u008a@Z\rN8\u0094\u009dõXþáÀÇ#Ú6Ý©c7DFE^°(#£´Å&<'§>Á\u001b\u0099×óF\u0095û\rCÛl\u0012\u008e(&,\u008d¨²\\ó[8¯ÿO¸²\u0001R\u009f¿ÐW'\u0087\u001e\u0082p?¡\u00994S^ÂAê\"¶©WÁï\u008a¶ý{Fu\u0016\u0015°è[x\u0083\u009a!\u008eu~êÇÑK\u000bñh'È¥¤Mé×kw¿[bÒÕïíí>Ñ&\u008eÎWlü¬Êmôµµ8ÛÀZÏ0¦[\u001ap\r%\u0083ìçÊ\u0016!\u0010»¶÷»°è\u009d\"0^©\u0016ñSs\u0098\u008c\u0016öD\u009dR\u008blèF8ê6Øy\u009c(D÷Ïß\u00100\u0099+]ñ¸}\u0013\bbx¶ØÅÂIxúøNW\u0094\u0091ñ?\u001b\rX\u0086>\u009d¨+N²»©\u001eVõK8©_$èYà¸~-êEÆ¤ë\\ÔxÒ`þr.ÿ?^I&Î&\u008f\u0087>iòÈ\u009eÔêÛ¯\u0090/©Ò\u0089\u0092z5\u0011C\n\u0012èÁí\"\u0088-õ_¯o\u0092\u0010ñOEp\u000fE[SñEqó4»èú\u0081°öÍ\u0096\u008eqÕ\u008c\u000f«\bÚpõ;2\u009d\u008cTÍkªN¼\u001c\u001bHø`)/â\u0091('òð%\u001aõè\u001aÍ©iXm¢\u0016pK7\t\u0019óB\u000eÅ]¤¥B\u0094þÆ\u0083\f\u0015\u0099\u0091\n\u0013©\u001cúØa\u009aDõ²\u0002(j\u00130ÎèÎÖ\u009e\u0087â)ðfÞ\u001aÆÀ6Àæ\bû.ÿ\u009e% ë½\u0003\u0084.³Ä¥\u008a³\u0085\u007fÞ\u0007+£¯wÆmsþçÔtÁHøûw\u001dìÛäü´§1Î©s\u0016óõ£]\u00903\u009cÆO<\u001d\u0018W}¥þå\u0087Ë{ýóc\t\tn4\u0083|)\u009fÔÒg;®3>N\u0099\u0092<ïøû^k;(Íq#Åa\u0080\u009cbVjG\u0018$à÷ô<ð\u0089\u0001Ìîk\u0086?¶\f\u0082\u0085?\u0003Ä±e\u0013ñAc\u001eÖ'ÝDµr\bÖ\u00873ß5PK\u007f!ÃÇr¡&Åù\u001frk\u0084ÚM`OYÇ«ZóÂ]»;hk³<.y<\u009dòp=+\fDiP\u009aoõt¦Ô°ø3\u0014ÕÕ\u001cTÜìIT\u0083ÆÚº\u009fn\u001bE\u0019Já`Ç\u0099\u0014ÔG»\u0017\u008f\u0006\u0005æ\u0080ÇCËÕ2\u0002\u001fR\u009b\u0017$5¤ºñ\u0017 ¾Ê}ÏD¨\u0099K]½.A¤î\n·?\\\u009a \u0088Ò4»r\r\u009c#\u0007è\\Wa\u0005V\\¾\u0014O\u008e\u0084\u0019û¿ê`ï$wãñO\u0004íÃñ\u0097¨aÕÔ¿Îó\u000fð)òAµCîß\u0088Ùä\u00912\u0080{(î\u00adëhü03dheÝç(Öm(BP\u0016\u008fÞØ\u008d^À¯>t£kM\u0086\u0018Z\u0013ëå\u009b\u0003:âÙ\u0013\u0014\u00ad±Á.#ÍÖõ}µzX\u009c\u0092Ë»ñ:7CDÀ©¸(ÔG;\u009fòÿ\u0099ÿ#\u0006Þ\u001f\u0018uÝ«\u0006Hò7CYvªE\u0094²éÇ3\u0007¾0§é|7\u0082ëg)Í\u0018¥B\u0013$dz\u0019ÌfN+\u001e\u009c)m\u0016LÇ\\Y\u0096ÆWyçÎòêòÁ¼Q«ã@7{Æ<ø.\u001aYLÐ{àÃG^D\u0093(m¾J\\MS\u0015ÑªÅTR¡n»R0CÏ`#\u0005´î Ç¹¤jÑ\\Å%×ÀëQñ)9pÆ\u0013÷µÆå\u0089(O/èjU{Êñ\u008aÈ\u0089|®\u009dÖ\u0085\u008f,MÆD´?\u0012\u0011´^g\u0003\t§\u0083yó*Á.=\u0081Ï\u0097\u001dOº\u000emÃ¹]\u0091\u0001Æ\n%\u0007×!Ç\u0017\u0016\u0010EìG\u008bvãuËOo\u0001\r\u008dwÊ"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      llI = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         llI[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var5 = new String[ll(-969491663, var23 ^ -1413773988)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = III((short)-23153, 1557172828, '⋇')).length();
      int var1 = ll(-969491658, var23 ^ -1265574541);
      int var25 = -1;

      label97:
      while (true) {
         int var28 = ll(-969491657, var23 ^ -884457091);
         String var10001 = var2.substring(++var25, var25 + var1);
         byte var10002 = -1;

         while (true) {
            label92: {
               char[] var44 = var10001.toCharArray();
               int var10004 = var44.length;
               int var6 = 0;
               int var47 = var28;
               var40 = var44;
               int var34 = var10004;
               char[] var56;
               int var10006;
               if (var10004 <= 1) {
                  var56 = var44;
                  var10004 = var28;
                  var10006 = var6;
               } else {
                  var47 = var28;
                  var34 = var10004;
                  if (var10004 <= var6) {
                     break label92;
                  }

                  var56 = var44;
                  var10004 = var28;
                  var10006 = var6;
               }

               while (true) {
                  var56[var10006] = (char)(var56[var10006] ^ var10004 ^ switch (var6 % ll(-969491653, var23 ^ -173582196)) {
                     case 0 -> ll(-969491656, var23 ^ 920327429);
                     case 1 -> ll(-969491655, var23 ^ 518280050);
                     case 2 -> ll(-969491650, var23 ^ -1508371245);
                     case 3 -> ll(-969491649, var23 ^ 983198656);
                     case 4 -> ll(-969491652, var23 ^ -2146132339);
                     case 5 -> ll(-969491651, var23 ^ 1585846343);
                     default -> ll(-969491678, var23 ^ -1361853739);
                  });
                  var6++;
                  if (var47 == 0) {
                     var10006 = var47;
                     var56 = var40;
                     var10004 = var47;
                  } else {
                     if (var34 <= var6) {
                        break;
                     }

                     var56 = var40;
                     var10004 = var47;
                     var10006 = var6;
                  }
               }
            }

            String var49 = new String(var40).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var49;
                  if ((var25 += var1) >= var4) {
                     IIl = var5;
                     Il = new String[ll(-969491654, var23 ^ -1234420059)];
                     lI = IlIIllIII.Ill(lI(ll(-969491677, var23 ^ -593743711), ll(-969491680, var23 ^ 1016989413)));
                     Ill = IlIIllIII.Ill(lI(ll(-969491679, var23 ^ -1847436186), ll(-969491674, var23 ^ -369882987)));
                     return;
                  }

                  var1 = var2.charAt(var25);
                  break;
               default:
                  var5[var3++] = var49;
                  if ((var25 += var1) < var4) {
                     var1 = var2.charAt(var25);
                     continue label97;
                  }

                  var4 = (var2 = III((short)20003, 1557172829, '\u17fb')).length();
                  var1 = ll(-969491660, var23 ^ -453310412);
                  var25 = -1;
            }

            var28 = ll(-969491659, var23 ^ -1420908798);
            var10001 = var2.substring(++var25, var25 + var1);
            var10002 = 0;
         }
      }
   }

   private void Il(class_310 var1) {
      String[] var2 = IIllllIl.IIIIl();
      if (var1 != null && var1.field_1724 != null && var1.field_1687 != null) {
         long var3 = System.currentTimeMillis();
         Iterator var5 = this.II.entrySet().iterator();

         while (var5.hasNext()) {
            if (var3 - ((llIl)((Entry)var5.next()).getValue()).l() > 2500L) {
               var5.remove();
               if (var2 != null) {
                  break;
               }
            }
         }

         for (class_1297 var7 : var1.field_1687.method_18112()) {
            if (var7 instanceof class_1676 var8 && (var8.method_24921() == var1.field_1724 || var2 != null)) {
               this.II.put(var7.method_5628(), new llIl(new class_243(var7.method_23317(), var7.method_23318(), var7.method_23321()), var3));
               if (var2 != null) {
                  break;
               }
            }
         }
      } else {
         this.II.clear();
      }
   }

   private static String III(short var0, int var1, char var2) {
      int var7 = var1 ^ 1557172828;
      char[] var6 = lll[var7].toCharArray();
      StackTraceElement[] var8 = (StackTraceElement[])IIII[var7];
      StackTraceElement[] var9;
      if (var8 != null) {
         var9 = var8;
      } else {
         var9 = new Throwable().getStackTrace();
         IIII[var7] = var9;
      }

      StackTraceElement var10 = var9[1];
      int var4 = (var10.getClassName().hashCode() ^ var10.getMethodName().hashCode()) >> 16 ^ 18935;

      for (int var5 = 0; var5 < var6.length; var5++) {
         var6[var5] = (char)(var6[var5] ^ 17024 ^ var1 ^ var2 ^ var4 ^ var0);
      }

      return new String(var6).intern();
   }

   @Override
   public void llll(class_332 var1, int var2, int var3, float var4) {
      if (this.lIl.IllI() && this.ll > 0L) {
         long var5 = System.currentTimeMillis();
         long var7 = Math.max(1L, Math.round(this.I.IllI()));
         long var9 = var5 - this.ll;
         if (var9 <= var7) {
            class_310 var11 = class_310.method_1551();
            if (var11 != null && var11.method_22683() != null) {
               double var12 = (double)var9 / var7;
               int var14 = (int)Math.round((1.0 - var12) * 255.0);
               IIIIIllII var15 = IIIIIllII.III();
               Color var16 = var15 != null && var15.II() != null && var15.II().IIlIIll() != null ? var15.II().IIlIIll().lIlI() : Color.WHITE;
               int var17 = IllIIlIl.lll(var16, var14).getRGB();
               double var18 = var11.method_22683().method_4486() * 0.5;
               double var20 = var11.method_22683().method_4502() * 0.5;
               double var22 = 3.5 + var12 * 1.0;
               double var24 = 5.0;
               IlIIlllIl.IlIIIl(var1, var18 - var22 - var24, var20 - var22 - var24, var18 - var22, var20 - var22, 0.9, var17);
               IlIIlllIl.IlIIIl(var1, var18 + var22, var20 - var22, var18 + var22 + var24, var20 - var22 - var24, 0.9, var17);
               IlIIlllIl.IlIIIl(var1, var18 - var22 - var24, var20 + var22 + var24, var18 - var22, var20 + var22, 0.9, var17);
               IlIIlllIl.IlIIIl(var1, var18 + var22, var20 + var22, var18 + var22 + var24, var20 + var22 + var24, 0.9, var17);
            }
         }
      }
   }

   public llIIllll() {
      int var1 = -1942929336;
      super(
         IlIIllIII.Ill(lI(ll(-969491673, var1 ^ -1674908374), ll(-969491676, var1 ^ 736255864))),
         lllIIlIl.IIl,
         IlIIllIII.Ill(lI(ll(-969491675, var1 ^ -1142409058), ll(-969491670, var1 ^ 2059808758)))
      );
      this.III = this.IllIIll(new lllIIlII(IlIIllIII.Ill(lI(ll(-969491669, var1 ^ 1676735170), ll(-969491672, var1 ^ -586649782))), true));
      this.lIl = this.IllIIll(new lllIIlII(IlIIllIII.Ill(lI(ll(-969491671, var1 ^ 1657606801), ll(-969491666, var1 ^ -1106658130))), true));
      this.I = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(lI(ll(-969491665, var1 ^ -960048986), ll(-969491668, var1 ^ -1498511423))), 220.0, 60.0, 1000.0, 10.0)
            .IIIl(IlIIllIII.Ill(lI(ll(-969491667, var1 ^ 963745589), ll(-969491694, var1 ^ 603649334))))
      );
      this.II = new HashMap<>();
   }

   private static String lI(int var0, int var1) {
      int var9 = -52177595;
      int var2 = (var0 ^ ll(-969491693, var9 ^ -892953293)) & ll(-969491696, var9 ^ 1051200384);
      if (Il[var2] == null) {
         char[] var3 = IIl[var2].toCharArray();

         int var4 = switch (var3[0] & ll(-969491695, var9 ^ 977538846)) {
            case 0 -> ll(-969491690, var9 ^ -1457121136);
            case 1 -> ll(-969491689, var9 ^ -1793527390);
            case 2 -> ll(-969491692, var9 ^ -938159413);
            case 3 -> ll(-969491691, var9 ^ -849720766);
            case 4 -> ll(-969491686, var9 ^ 11079574);
            case 5 -> ll(-969491685, var9 ^ 53056722);
            case 6 -> ll(-969491688, var9 ^ 2111443266);
            case 7 -> ll(-969491687, var9 ^ 1909362959);
            case 8 -> ll(-969491682, var9 ^ -1881949740);
            case 9 -> ll(-969491681, var9 ^ 1591083518);
            case 10 -> ll(-969491684, var9 ^ -1878828547);
            case 11 -> ll(-969491683, var9 ^ 790109565);
            case 12 -> ll(-969491710, var9 ^ -800888768);
            case 13 -> ll(-969491709, var9 ^ -1405645009);
            case 14 -> ll(-969491712, var9 ^ 1332650821);
            case 15 -> ll(-969491711, var9 ^ 1945792473);
            case 16 -> ll(-969491706, var9 ^ -1735092561);
            case 17 -> ll(-969491705, var9 ^ -705058135);
            case 18 -> ll(-969491708, var9 ^ -1357950203);
            case 19 -> ll(-969491707, var9 ^ 1682372567);
            case 20 -> ll(-969491702, var9 ^ -2056237407);
            case 21 -> ll(-969491701, var9 ^ 1176797913);
            case 22 -> ll(-969491704, var9 ^ 1733706439);
            case 23 -> ll(-969491703, var9 ^ 836389591);
            case 24 -> ll(-969491698, var9 ^ 1533985845);
            case 25 -> ll(-969491697, var9 ^ -1336934377);
            case 26 -> ll(-969491700, var9 ^ 1087784203);
            case 27 -> ll(-969491699, var9 ^ 575357982);
            case 28 -> ll(-969491598, var9 ^ 993271515);
            case 29 -> ll(-969491597, var9 ^ 1323035001);
            case 30 -> ll(-969491600, var9 ^ 685390892);
            case 31 -> ll(-969491599, var9 ^ -2086360442);
            case 32 -> ll(-969491594, var9 ^ 1766535373);
            case 33 -> ll(-969491593, var9 ^ -1640329168);
            case 34 -> ll(-969491596, var9 ^ 892456615);
            case 35 -> ll(-969491595, var9 ^ -1397655786);
            case 36 -> ll(-969491590, var9 ^ -1737460290);
            case 37 -> ll(-969491589, var9 ^ 369963244);
            case 38 -> ll(-969491592, var9 ^ -904104738);
            case 39 -> ll(-969491591, var9 ^ -496406967);
            case 40 -> ll(-969491586, var9 ^ 1689779816);
            case 41 -> ll(-969491585, var9 ^ 313090739);
            case 42 -> ll(-969491588, var9 ^ 1096693286);
            case 43 -> ll(-969491587, var9 ^ 397048786);
            case 44 -> ll(-969491614, var9 ^ 922498550);
            case 45 -> ll(-969491613, var9 ^ -319184965);
            case 46 -> ll(-969491616, var9 ^ 1262706904);
            case 47 -> ll(-969491615, var9 ^ 1954113666);
            case 48 -> ll(-969491610, var9 ^ 437311282);
            case 49 -> ll(-969491609, var9 ^ -1785957917);
            case 50 -> ll(-969491612, var9 ^ -1340305818);
            case 51 -> ll(-969491611, var9 ^ -1070359170);
            case 52 -> ll(-969491606, var9 ^ -1864901496);
            case 53 -> ll(-969491605, var9 ^ -1238862195);
            case 54 -> ll(-969491608, var9 ^ 1725482679);
            case 55 -> ll(-969491607, var9 ^ -257110961);
            case 56 -> ll(-969491602, var9 ^ 1210434278);
            case 57 -> ll(-969491601, var9 ^ 1526330461);
            case 58 -> ll(-969491604, var9 ^ 1894975707);
            case 59 -> ll(-969491603, var9 ^ -1310760772);
            case 60 -> ll(-969491630, var9 ^ 1084729833);
            case 61 -> ll(-969491629, var9 ^ -1326918450);
            case 62 -> ll(-969491632, var9 ^ 274055969);
            case 63 -> ll(-969491631, var9 ^ 554763831);
            case 64 -> ll(-969491626, var9 ^ 1544076260);
            case 65 -> ll(-969491625, var9 ^ -1148163439);
            case 66 -> ll(-969491628, var9 ^ -1670781129);
            case 67 -> ll(-969491627, var9 ^ -1408695212);
            case 68 -> ll(-969491622, var9 ^ -785495661);
            case 69 -> ll(-969491621, var9 ^ -1636800785);
            case 70 -> ll(-969491624, var9 ^ -24220438);
            case 71 -> ll(-969491623, var9 ^ -579836993);
            case 72 -> ll(-969491618, var9 ^ 2109054426);
            case 73 -> ll(-969491617, var9 ^ 1946195677);
            case 74 -> ll(-969491620, var9 ^ 1125623323);
            case 75 -> ll(-969491619, var9 ^ 1527589227);
            case 76 -> ll(-969491646, var9 ^ -2040833881);
            case 77 -> ll(-969491645, var9 ^ -1246513703);
            case 78 -> ll(-969491648, var9 ^ -632533577);
            case 79 -> ll(-969491647, var9 ^ -1069730396);
            case 80 -> ll(-969491642, var9 ^ -965129867);
            case 81 -> ll(-969491641, var9 ^ -1587300380);
            case 82 -> ll(-969491644, var9 ^ -1452025440);
            case 83 -> ll(-969491643, var9 ^ -1804284208);
            case 84 -> ll(-969491638, var9 ^ 1126711587);
            case 85 -> ll(-969491637, var9 ^ -484229162);
            case 86 -> ll(-969491640, var9 ^ -977919920);
            case 87 -> ll(-969491639, var9 ^ 2109941400);
            case 88 -> ll(-969491634, var9 ^ -752513872);
            case 89 -> ll(-969491633, var9 ^ 444591979);
            case 90 -> ll(-969491636, var9 ^ -2104180902);
            case 91 -> ll(-969491635, var9 ^ -2070773584);
            case 92 -> ll(-969491534, var9 ^ 1952008407);
            case 93 -> ll(-969491533, var9 ^ -898327726);
            case 94 -> ll(-969491536, var9 ^ -1494534689);
            case 95 -> ll(-969491535, var9 ^ 1080682725);
            case 96 -> ll(-969491530, var9 ^ 268880712);
            case 97 -> ll(-969491529, var9 ^ 2129131333);
            case 98 -> ll(-969491532, var9 ^ 1212227451);
            case 99 -> ll(-969491531, var9 ^ 1753865726);
            case 100 -> ll(-969491526, var9 ^ 1897857891);
            case 101 -> ll(-969491525, var9 ^ 1698440450);
            case 102 -> ll(-969491528, var9 ^ -1607275068);
            case 103 -> ll(-969491527, var9 ^ 70430164);
            case 104 -> ll(-969491522, var9 ^ 1350959793);
            case 105 -> ll(-969491521, var9 ^ 569827503);
            case 106 -> ll(-969491524, var9 ^ -41955688);
            case 107 -> ll(-969491523, var9 ^ -96440827);
            case 108 -> ll(-969491550, var9 ^ 1979071293);
            case 109 -> ll(-969491549, var9 ^ 1432736809);
            case 110 -> ll(-969491552, var9 ^ 699459554);
            case 111 -> ll(-969491551, var9 ^ -40379559);
            case 112 -> ll(-969491546, var9 ^ 769439437);
            case 113 -> ll(-969491545, var9 ^ 306670069);
            case 114 -> ll(-969491548, var9 ^ -1818660439);
            case 115 -> ll(-969491547, var9 ^ 729793282);
            case 116 -> ll(-969491542, var9 ^ 1174068186);
            case 117 -> ll(-969491541, var9 ^ -309842097);
            case 118 -> ll(-969491544, var9 ^ -1174250982);
            case 119 -> ll(-969491543, var9 ^ 290845849);
            case 120 -> ll(-969491538, var9 ^ -1255204225);
            case 121 -> ll(-969491537, var9 ^ -1072122835);
            case 122 -> ll(-969491540, var9 ^ 1635376534);
            case 123 -> ll(-969491539, var9 ^ -440791308);
            case 124 -> ll(-969491566, var9 ^ -6099957);
            case 125 -> ll(-969491565, var9 ^ 236799154);
            case 126 -> ll(-969491568, var9 ^ -456773190);
            case 127 -> ll(-969491567, var9 ^ 1853283607);
            case 128 -> ll(-969491562, var9 ^ 2114463887);
            case 129 -> ll(-969491561, var9 ^ 1625989271);
            case 130 -> ll(-969491564, var9 ^ 948808192);
            case 131 -> ll(-969491563, var9 ^ -1316819461);
            case 132 -> ll(-969491558, var9 ^ -342697528);
            case 133 -> ll(-969491557, var9 ^ -308285248);
            case 134 -> 0;
            case 135 -> ll(-969491560, var9 ^ 1405459471);
            case 136 -> ll(-969491559, var9 ^ -2041077296);
            case 137 -> ll(-969491554, var9 ^ 1370782011);
            case 138 -> ll(-969491553, var9 ^ -241113835);
            case 139 -> ll(-969491556, var9 ^ -65007693);
            case 140 -> ll(-969491555, var9 ^ 2006865074);
            case 141 -> ll(-969491582, var9 ^ 173761625);
            case 142 -> ll(-969491581, var9 ^ -1042747653);
            case 143 -> ll(-969491584, var9 ^ -730666018);
            case 144 -> ll(-969491583, var9 ^ 901402300);
            case 145 -> ll(-969491578, var9 ^ 1035798299);
            case 146 -> ll(-969491577, var9 ^ -1306733360);
            case 147 -> ll(-969491580, var9 ^ -1280695034);
            case 148 -> ll(-969491579, var9 ^ -405685156);
            case 149 -> ll(-969491574, var9 ^ 2079686860);
            case 150 -> ll(-969491573, var9 ^ 1048122801);
            case 151 -> ll(-969491576, var9 ^ 1532245281);
            case 152 -> ll(-969491575, var9 ^ 1382903645);
            case 153 -> ll(-969491570, var9 ^ 222821543);
            case 154 -> ll(-969491569, var9 ^ 300891616);
            case 155 -> ll(-969491572, var9 ^ -1748252737);
            case 156 -> ll(-969491571, var9 ^ 1226322471);
            case 157 -> ll(-969491470, var9 ^ -918929760);
            case 158 -> ll(-969491469, var9 ^ -2004562029);
            case 159 -> ll(-969491472, var9 ^ 1237511585);
            case 160 -> ll(-969491471, var9 ^ -1132251534);
            case 161 -> ll(-969491466, var9 ^ 362155487);
            case 162 -> ll(-969491465, var9 ^ 708564833);
            case 163 -> ll(-969491468, var9 ^ -1371542511);
            case 164 -> ll(-969491467, var9 ^ 1103466201);
            case 165 -> ll(-969491462, var9 ^ -975398052);
            case 166 -> ll(-969491461, var9 ^ -819607756);
            case 167 -> ll(-969491464, var9 ^ 968783290);
            case 168 -> ll(-969491463, var9 ^ 772404384);
            case 169 -> ll(-969491458, var9 ^ 905128932);
            case 170 -> ll(-969491457, var9 ^ -1383674165);
            case 171 -> ll(-969491460, var9 ^ -639619993);
            case 172 -> ll(-969491459, var9 ^ -767610149);
            case 173 -> ll(-969491486, var9 ^ 343880);
            case 174 -> ll(-969491485, var9 ^ 829114858);
            case 175 -> ll(-969491488, var9 ^ -1426666830);
            case 176 -> ll(-969491487, var9 ^ -1048197867);
            case 177 -> ll(-969491482, var9 ^ 2132181132);
            case 178 -> ll(-969491481, var9 ^ 1532336390);
            case 179 -> ll(-969491484, var9 ^ 2106513865);
            case 180 -> ll(-969491483, var9 ^ 2092997741);
            case 181 -> ll(-969491478, var9 ^ 1616817747);
            case 182 -> ll(-969491477, var9 ^ 1779438628);
            case 183 -> ll(-969491480, var9 ^ -173422699);
            case 184 -> ll(-969491479, var9 ^ 1709823234);
            case 185 -> ll(-969491474, var9 ^ -1109049019);
            case 186 -> ll(-969491473, var9 ^ 1399194008);
            case 187 -> ll(-969491476, var9 ^ -475436192);
            case 188 -> ll(-969491475, var9 ^ -1743849455);
            case 189 -> ll(-969491502, var9 ^ 65005125);
            case 190 -> ll(-969491501, var9 ^ -1326085558);
            case 191 -> ll(-969491504, var9 ^ -1022935351);
            case 192 -> ll(-969491503, var9 ^ -1653947540);
            case 193 -> ll(-969491498, var9 ^ -1917074363);
            case 194 -> 2;
            case 195 -> ll(-969491497, var9 ^ -1651143841);
            case 196 -> ll(-969491500, var9 ^ 1336870221);
            case 197 -> ll(-969491499, var9 ^ 1484020502);
            case 198 -> ll(-969491494, var9 ^ -187057559);
            case 199 -> ll(-969491493, var9 ^ 1161484219);
            case 200 -> ll(-969491496, var9 ^ -1178443107);
            case 201 -> ll(-969491495, var9 ^ 658050598);
            case 202 -> ll(-969491490, var9 ^ -910510299);
            case 203 -> 5;
            case 204 -> ll(-969491489, var9 ^ 1897453989);
            case 205 -> ll(-969491492, var9 ^ -2007026138);
            case 206 -> ll(-969491491, var9 ^ -77820603);
            case 207 -> ll(-969491518, var9 ^ -965537309);
            case 208 -> ll(-969491517, var9 ^ -671644883);
            case 209 -> ll(-969491520, var9 ^ 439599296);
            case 210 -> ll(-969491519, var9 ^ -1115252557);
            case 211 -> ll(-969491514, var9 ^ 694703454);
            case 212 -> ll(-969491513, var9 ^ 208290143);
            case 213 -> ll(-969491516, var9 ^ 1134136412);
            case 214 -> ll(-969491515, var9 ^ -1650111345);
            case 215 -> ll(-969491510, var9 ^ -1756541113);
            case 216 -> ll(-969491509, var9 ^ -1516260076);
            case 217 -> ll(-969491512, var9 ^ -476616124);
            case 218 -> ll(-969491511, var9 ^ -757551009);
            case 219 -> 4;
            case 220 -> ll(-969491506, var9 ^ -638005451);
            case 221 -> 3;
            case 222 -> ll(-969491505, var9 ^ 2087441452);
            case 223 -> ll(-969491508, var9 ^ 852525782);
            case 224 -> ll(-969491507, var9 ^ -826909286);
            case 225 -> ll(-969491918, var9 ^ -1300690523);
            case 226 -> ll(-969491917, var9 ^ -674367696);
            case 227 -> ll(-969491920, var9 ^ 1849843762);
            case 228 -> ll(-969491919, var9 ^ -904789767);
            case 229 -> ll(-969491914, var9 ^ 818640085);
            case 230 -> ll(-969491913, var9 ^ -577440047);
            case 231 -> ll(-969491916, var9 ^ 1272281642);
            case 232 -> ll(-969491915, var9 ^ -533038343);
            case 233 -> 1;
            case 234 -> ll(-969491910, var9 ^ -850507585);
            case 235 -> ll(-969491909, var9 ^ -1959409224);
            case 236 -> ll(-969491912, var9 ^ 1228440545);
            case 237 -> ll(-969491911, var9 ^ 1608376889);
            case 238 -> ll(-969491906, var9 ^ 1497484359);
            case 239 -> ll(-969491905, var9 ^ 2141724358);
            case 240 -> ll(-969491908, var9 ^ 1217584796);
            case 241 -> ll(-969491907, var9 ^ 1214554617);
            case 242 -> ll(-969491934, var9 ^ -1045508136);
            case 243 -> ll(-969491933, var9 ^ -604312165);
            case 244 -> ll(-969491936, var9 ^ 71934038);
            case 245 -> ll(-969491935, var9 ^ 538770973);
            case 246 -> ll(-969491930, var9 ^ 28141029);
            case 247 -> ll(-969491929, var9 ^ -902490581);
            case 248 -> ll(-969491932, var9 ^ -1623886198);
            case 249 -> ll(-969491931, var9 ^ -1920433961);
            case 250 -> ll(-969491926, var9 ^ -143522820);
            case 251 -> ll(-969491925, var9 ^ -1598248674);
            case 252 -> ll(-969491928, var9 ^ 429680525);
            case 253 -> ll(-969491927, var9 ^ -2131956947);
            case 254 -> ll(-969491922, var9 ^ -753915574);
            default -> ll(-969491921, var9 ^ -2069614788);
         };
         int var5 = (var1 & ll(-969491924, var9 ^ -1354350839)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & ll(-969491923, var9 ^ -1631206055)) >>> ll(-969491950, var9 ^ 100125293)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & ll(-969491949, var9 ^ 1171146529);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & ll(-969491952, var9 ^ -2096341015);
            }
         }

         Il[var2] = new String(var3).intern();
      }

      return Il[var2];
   }
}
