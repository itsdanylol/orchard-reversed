package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum III {
   l,
   II,
   Il,
   lI,
   ll,
   III,
   IIl,
   IlI,
   Ill,
   lII,
   lIl,
   llI,
   lll,
   IIII,
   IIlI,
   IIll,
   IlII,
   IlIl,
   IllI,
   Illl,
   lIII,
   lIIl;

   private final IIIlIlIl I;
   private static final int[] lIlI;
   private static final Object[] llII;
   private static final III[] IIIl;
   private static final String[] lIll;

   @Override
   public String toString() {
      return this.I.llIl();
   }

   private III(IIIlIlIl var3) {
      this.I = var3;
   }

   public IIIlIlIl I() {
      return this.I;
   }

   private static String lI(int var0, int var1) {
      int var3 = var0 ^ -1484475822;
      char[] var4 = lIll[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])llII[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         llII[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -1963440257;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 81;
            case 1 -> 96;
            case 2 -> 49;
            case 3 -> 0;
            case 4 -> 120;
            case 5 -> 208;
            case 6 -> 70;
            case 7 -> 22;
            case 8 -> 250;
            case 9 -> 253;
            case 10 -> 228;
            case 11 -> 13;
            case 12 -> 121;
            case 13 -> 200;
            case 14 -> 205;
            case 15 -> 233;
            case 16 -> 107;
            case 17 -> 88;
            case 18 -> 236;
            case 19 -> 187;
            case 20 -> 160;
            case 21 -> 111;
            case 22 -> 205;
            case 23 -> 199;
            case 24 -> 168;
            case 25 -> 88;
            case 26 -> 250;
            case 27 -> 205;
            case 28 -> 250;
            case 29 -> 241;
            case 30 -> 100;
            case 31 -> 207;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   public static III l(String var0) {
      return Enum.valueOf(III.class, var0);
   }

   private static III[] II() {
      int var0 = -1473900521;
      III[] var10000 = new III[Il(694862529, var0 ^ 1681452037)];
      var10000[0] = ll;
      var10000[1] = lI;
      var10000[2] = IlIl;
      var10000[3] = IIlI;
      var10000[4] = III;
      var10000[5] = Il;
      var10000[Il(694862528, var0 ^ 2108440546)] = Ill;
      var10000[Il(694862531, var0 ^ -152353419)] = IIl;
      var10000[Il(694862530, var0 ^ 268158319)] = lIl;
      var10000[Il(694862533, var0 ^ -1993955766)] = lIIl;
      var10000[Il(694862532, var0 ^ 2097050156)] = IlII;
      var10000[Il(694862535, var0 ^ -572098481)] = llI;
      var10000[Il(694862534, var0 ^ 1113958542)] = IlI;
      var10000[Il(694862537, var0 ^ 1343298911)] = lll;
      var10000[Il(694862536, var0 ^ 1324886351)] = II;
      var10000[Il(694862539, var0 ^ 847425716)] = Illl;
      var10000[Il(694862538, var0 ^ 1934691662)] = lIII;
      var10000[Il(694862541, var0 ^ -1052237048)] = l;
      var10000[Il(694862540, var0 ^ -1690907295)] = IIII;
      var10000[Il(694862543, var0 ^ 1359425064)] = IIll;
      var10000[Il(694862542, var0 ^ 76764153)] = lII;
      var10000[Il(694862545, var0 ^ -574480310)] = IllI;
      return var10000;
   }

   private static int Il(int var0, int var1) {
      int var2 = lIlI[var0 ^ 694862529] ^ var1 ^ var0;
      var2 += 37537;
      var2 ^= 32663;
      var2 ^= 1724;
      var2 -= 48670;
      var2 += 3879;
      var2 -= 11953;
      return var2 + 49487;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var23 = 252186294;
      int var10001 = "Ś⺲좰ⵂ좽⼒ࢧ⹂\ue8b0⣂좫⧪袶\u2e62⢩⩪⢫Ⰺ⢶⭲䢫⥲⢱⭲袦⦚ꢽ⯒ꢫ⡺袯⳺梨ⷂ⢶⺺ꢴⳂ\ue8a8⾲\ue8b2⭊ࢡ⭊좾⾪⢤⣢\ue8a0⹊⢰⪪梥⨒⢹⪂袨⣲좻⨚ࢮ⢂ꢣ⾺梤⻲⢼Ⳛ\ue8b2Ⲻ袪ⷺ좳⭚ꢪ⠒\ue8b5⼢\ue8ab⩚ࢭ⽚⢷⭂梨⡒좰⣢䢥⧚ࢷ⮲좨⨪ꢭⷊ\ue8a5⹊좱ⴚ䢰⺪\ue8a9Ⱂꢱ⣺⢮⡪ࢳⲪ⢨⥺\ue8a9⾲\ue8b8⭒䢧⤚䢺⤺䢥⥊ࢶ⯊ࢪ⫒袭ⵂꢥ⾒梲ⵒ袱⿊ࢪ⾲袿⢺좯⣺⢱⽊⢬⪒ࢦⱊ⢿⡺ࢦ⤚䢽⩲梮⥪⢶⯲⢥⬺梢⸪袧⾢䢿ⶢࢲⰊࢪ\u2d7aࢰ⡚ꢮ⠒袵Ⳓ袦⩺좦⿊ꢴ⡪梩⥢좰⣢梥⧒ꢷ⭲ꢩ⨢⢬ⱊ梫ⵒࢽⴂ袷⽢\ue8a1ⵂ袶⡒ࢩ⬒梼\u2efa梥⮢袯Ⱚ⢸⡒ࢧ⦊䢰⪺\ue8a5⥚袸⨚䢪⤚梡⸪袥\u2d6a䢼⽲ꢲⰪ⢨ⷢ䢱⠪ꢪ⮲䢻⼚被⤊ࢮⰺ⢸⮂ࢣ⤊⢱⭂좣⦚ꢽ⯒좩⤊袨Ⳃ梪ⷂ⢶⺂梲Ⳃ被\u2e6a⢷⯊⢥⬂ࢾ⾪ࢪ⥚䢩Ⳃ袴⫊䢧⤚䢲⩪\ue8a7⠒梽⥚䢤⯲\ue8a1⼲⢩⿊좱Ⲻ좳⻊\ue8adⴢ袱⣒좯⮪䢴⽊\ue8a2⩲\ue8a0⹊⢰⬺좧⫒袹⪚\ue8a8⥊ꢸ⨚ࢥ⮺\ue8a1\u2fdaࢫ\u2efa䢾⽪䢽⽢ꢧ⺒ꢽ⭲䢯⫢ꢳⷂ⢤⫂\ue8a1⾊䢷⩺䢬⥚䢿⩪袪⯺\ue8b8\u0011~㠀˖\ud80c\u0016堑6堍\u07be렑ގ᠄Ć㠒ߖ᠔Ά"
         .length();
      short var18 = 16698;
      int var14 = var10001;
      String[] var28 = new String[2];
      int var17 = 0;
      String[] var15 = var28;
      String var13 = "Ś⺲좰ⵂ좽⼒ࢧ⹂\ue8b0⣂좫⧪袶\u2e62⢩⩪⢫Ⰺ⢶⭲䢫⥲⢱⭲袦⦚ꢽ⯒ꢫ⡺袯⳺梨ⷂ⢶⺺ꢴⳂ\ue8a8⾲\ue8b2⭊ࢡ⭊좾⾪⢤⣢\ue8a0⹊⢰⪪梥⨒⢹⪂袨⣲좻⨚ࢮ⢂ꢣ⾺梤⻲⢼Ⳛ\ue8b2Ⲻ袪ⷺ좳⭚ꢪ⠒\ue8b5⼢\ue8ab⩚ࢭ⽚⢷⭂梨⡒좰⣢䢥⧚ࢷ⮲좨⨪ꢭⷊ\ue8a5⹊좱ⴚ䢰⺪\ue8a9Ⱂꢱ⣺⢮⡪ࢳⲪ⢨⥺\ue8a9⾲\ue8b8⭒䢧⤚䢺⤺䢥⥊ࢶ⯊ࢪ⫒袭ⵂꢥ⾒梲ⵒ袱⿊ࢪ⾲袿⢺좯⣺⢱⽊⢬⪒ࢦⱊ⢿⡺ࢦ⤚䢽⩲梮⥪⢶⯲⢥⬺梢⸪袧⾢䢿ⶢࢲⰊࢪ\u2d7aࢰ⡚ꢮ⠒袵Ⳓ袦⩺좦⿊ꢴ⡪梩⥢좰⣢梥⧒ꢷ⭲ꢩ⨢⢬ⱊ梫ⵒࢽⴂ袷⽢\ue8a1ⵂ袶⡒ࢩ⬒梼\u2efa梥⮢袯Ⱚ⢸⡒ࢧ⦊䢰⪺\ue8a5⥚袸⨚䢪⤚梡⸪袥\u2d6a䢼⽲ꢲⰪ⢨ⷢ䢱⠪ꢪ⮲䢻⼚被⤊ࢮⰺ⢸⮂ࢣ⤊⢱⭂좣⦚ꢽ⯒좩⤊袨Ⳃ梪ⷂ⢶⺂梲Ⳃ被\u2e6a⢷⯊⢥⬂ࢾ⾪ࢪ⥚䢩Ⳃ袴⫊䢧⤚䢲⩪\ue8a7⠒梽⥚䢤⯲\ue8a1⼲⢩⿊좱Ⲻ좳⻊\ue8adⴢ袱⣒좯⮪䢴⽊\ue8a2⩲\ue8a0⹊⢰⬺좧⫒袹⪚\ue8a8⥊ꢸ⨚ࢥ⮺\ue8a1\u2fdaࢫ\u2efa䢾⽪䢽⽢ꢧ⺒ꢽ⭲䢯⫢ꢳⷂ⢤⫂\ue8a1⾊䢷⩺䢬⥚䢿⩪袪⯺\ue8b8\u0011~㠀˖\ud80c\u0016堑6堍\u07be렑ގ᠄Ć㠒ߖ᠔Ά";
      int var16 = 0;

      do {
         char var19 = var13.charAt(var17);
         int var21 = 0;
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

      lIll = var15;
      llII = new Object[var15.length];
      int var9 = -1047664385;
      byte[] var7 = "Û\u0006\u0004\u008fÂ\u0092×\u0019IÕ\u00adô°Å-ì6\u0018NÏÃÀ\u009a§bØ\u0090Îý[@\rï/õÒñÆÁÄ\u008d¼X5ÌoåÍ~vË\u008d$\b%Úî9Æ©»\u00ad»zbüÈ×\u008a\u0097îßC\u0089±ý\u0098n\u001fAß3¦ý\u0083«¢¿\u0099\nüoM\u0015\u0002\u0082Pc]%\u0091» \u0002\b-7ñ\u0005m\u001aþ\u0001\u0091\u0082·\u009d\u0006\u001b\u009d\u001aôKh³ðÆrgÈ+@L\u001eC\u007f\u009e<\u0095¼y\u00072lÅý\u0014cæÄ\u0002¢\u000fßýÎLb\u00ad\u009aÊã1\u000bdIYÁG^ àÕ8fÌ)Ðz\u0088îØ\u001cÕ\u008a÷\u009dnº.\u007fu.A±×.\u001f\u0096¼\u0006hÛÑ{\u0093qöZæÉìèð\u0017³i4ÿü?×\u008e\u0097³\u001dÖ\u0007ÛAvÃ¶¹{Û¯ã\u0018Á\fÏ²£1\\%\u0091TI¨Ú\u0019\u008f/@\u0085\u0087x·\u0099\u0091\u0099¹:¢yy-\u0007W;\u0002ln\u0012e÷\u009af\u008d\u009c»\u001c\u0083h;\u008b¦2ÈÝM\u0010ùB´Pwe\u0089Ç\u0087ï$\u0005Èa+!üÆ\u009bêÒ\u0093Sd#`\u0001·ä\u008f<ê\u0019=eÆ\u009b\u0013"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      lIlI = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         lIlI[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var0 = new String[Il(694862544, var23 ^ -1836639925)];
      int var4 = 0;
      String var3;
      int var5 = (var3 = lI(-1484475822, var23 ^ -1654766030)).length();
      int var2 = 3;
      int var25 = -1;

      label90:
      while (true) {
         int var10000 = Il(694862547, var23 ^ 1536771691);
         String var29 = var3.substring(++var25, var25 + var2);
         byte var10002 = -1;

         while (true) {
            label85: {
               char[] var44 = var29.toCharArray();
               int var10004 = var44.length;
               int var6 = 0;
               int var47 = var10000;
               var40 = var44;
               var10001 = var10004;
               char[] var56;
               int var10006;
               if (var10004 <= 1) {
                  var56 = var44;
                  var10004 = var10000;
                  var10006 = var6;
               } else {
                  var47 = var10000;
                  var10001 = var10004;
                  if (var10004 <= var6) {
                     break label85;
                  }

                  var56 = var44;
                  var10004 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var56[var10006] = (char)(var56[var10006] ^ var10004 ^ switch (var6 % Il(694862548, var23 ^ -1682221944)) {
                     case 0 -> Il(694862551, var23 ^ -2128999856);
                     case 1 -> Il(694862550, var23 ^ 1426453846);
                     case 2 -> Il(694862553, var23 ^ 1215539986);
                     case 3 -> Il(694862552, var23 ^ -1985227211);
                     case 4 -> Il(694862555, var23 ^ 272482413);
                     case 5 -> Il(694862554, var23 ^ 494791886);
                     default -> Il(694862557, var23 ^ 427914436);
                  });
                  var6++;
                  if (var47 == 0) {
                     var10006 = var47;
                     var56 = var40;
                     var10004 = var47;
                  } else {
                     if (var10001 <= var6) {
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
                  var0[var4++] = var49;
                  if ((var25 += var2) >= var5) {
                     ll = new III(IlIIllIII.Ill(var0[2]));
                     lI = new III(IlIIllIII.Ill(var0[Il(694862558, var23 ^ -1411370921)]));
                     IlIl = new III(IlIIllIII.Ill(var0[Il(694862560, var23 ^ 1410250108)]));
                     IIlI = new III(IlIIllIII.Ill(var0[Il(694862562, var23 ^ 1628947583)]));
                     III = new III(IlIIllIII.Ill(var0[Il(694862564, var23 ^ -19598072)]));
                     Il = new III(IlIIllIII.Ill(var0[Il(694862567, var23 ^ 399444951)]));
                     Ill = new III(IlIIllIII.Ill(var0[Il(694862569, var23 ^ -755775835)]));
                     IIl = new III(IlIIllIII.Ill(var0[Il(694862570, var23 ^ -852979495)]));
                     lIl = new III(IlIIllIII.Ill(var0[Il(694862572, var23 ^ -154604847)]));
                     lIIl = new III(IlIIllIII.Ill(var0[Il(694862577, var23 ^ 911296475)]));
                     IlII = new III(IlIIllIII.Ill(var0[Il(694862578, var23 ^ 1669564318)]));
                     llI = new III(IlIIllIII.Ill(var0[Il(694862583, var23 ^ 1898187237)]));
                     IlI = new III(IlIIllIII.Ill(var0[Il(694862584, var23 ^ -1018068755)]));
                     lll = new III(IlIIllIII.Ill(var0[Il(694862589, var23 ^ 350176434)]));
                     II = new III(IlIIllIII.Ill(var0[4]));
                     Illl = new III(IlIIllIII.Ill(var0[Il(694862464, var23 ^ -2122223680)]));
                     lIII = new III(IlIIllIII.Ill(var0[Il(694862469, var23 ^ 444373109)]));
                     l = new III(IlIIllIII.Ill(var0[5]));
                     IIII = new III(IlIIllIII.Ill(var0[Il(694862472, var23 ^ 1426067083)]));
                     IIll = new III(IlIIllIII.Ill(var0[Il(694862477, var23 ^ 1008025113)]));
                     lII = new III(IlIIllIII.Ill(var0[Il(694862478, var23 ^ 1265947908)]));
                     IllI = new III(IlIIllIII.Ill(var0[Il(694862483, var23 ^ 2111204730)]));
                     IIIl = II();
                     return;
                  }

                  var2 = var3.charAt(var25);
                  break;
               default:
                  var0[var4++] = var49;
                  if ((var25 += var2) < var5) {
                     var2 = var3.charAt(var25);
                     continue label90;
                  }

                  var5 = (var3 = lI(-1484475821, var23 ^ 417929366)).length();
                  var2 = Il(694862546, var23 ^ -2139166345);
                  var25 = -1;
            }

            var10000 = Il(694862549, var23 ^ -953986926);
            var29 = var3.substring(++var25, var25 + var2);
            var10002 = 0;
         }
      }
   }
}
