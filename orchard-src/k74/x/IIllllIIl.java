package k74.x;

import java.awt.Color;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum IIllllIIl implements lIllIIIl {
   I,
   II,
   Il,
   lI,
   ll,
   III,
   Ill,
   lII;
   private static final IIllllIIl[] l;
   private static final String[] llI;
   private static final Object[] lll;
   private static final int[] lIl;
   private final Color IIl;
   private final IIIlIlIl IlI;

   private static String IIl(int var0, byte var1, short var2, int var3, int var4, char var5) {
      int var10 = var3 ^ -2038303555;
      char[] var9 = llI[var10].toCharArray();
      StackTraceElement[] var11 = (StackTraceElement[])lll[var10];
      StackTraceElement[] var12;
      if (var11 != null) {
         var12 = var11;
      } else {
         var12 = new Throwable().getStackTrace();
         lll[var10] = var12;
      }

      StackTraceElement var13 = var12[1];
      int var7 = (var13.getClassName().hashCode() ^ var13.getMethodName().hashCode()) >> 16 ^ 20382;

      for (int var8 = 0; var8 < var9.length; var8++) {
         var9[var8] = (char)(var9[var8] ^ switch (var8 % 17) {
            default -> 42;
            case 1 -> 151;
            case 2 -> 85;
            case 3 -> 252;
            case 4 -> 152;
            case 5 -> 188;
            case 6 -> 206;
            case 7 -> 181;
            case 8 -> 200;
            case 9 -> 247;
            case 10 -> 77;
            case 11 -> 59;
            case 12 -> 187;
            case 13 -> 57;
            case 14 -> 32;
            case 15 -> 220;
            case 16 -> 196;
         } ^ 26092 ^ var8 ^ var4 ^ var1 ^ var5 ^ var7 ^ var3 ^ var0 ^ var2);
      }

      return new String(var9).intern();
   }

   @Override
   public String toString() {
      return this.IlI.llIl();
   }

   public static IIllllIIl I(String var0) {
      return Enum.valueOf(IIllllIIl.class, var0);
   }

   public IIIlIlIl l() {
      return this.IlI;
   }

   private static int III(int var0, int var1) {
      int var2 = lIl[var0 ^ -1981701534] ^ var1 ^ var0;
      var2 += 12529;
      var2 += 4474;
      var2 -= 38413;
      var2 -= 42444;
      var2 -= 5394;
      var2 -= 37206;
      return var2 ^ 52021;
   }

   public Color lI(Color var1) {
      return this.IIl == null ? var1 : this.IIl;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var17 = -961681808;
      short var12 = 8325;
      int var11 = 0;
      int var10 = 0;
      int var10001 = "e懞ᦙ戎撚摶禒柆練敎馝惎妇曮妄悦妛摮㦋斞㦍柦㦝擎禟斦릗暞妆怦\ud993憖妈晎馑惎\ud995扎禔敆妔斎릘搮㦜扶妁朎妄慾馐朾禀擞\ud981曾聯放\ud995杖릚杮릎揆㦜捦福摆\ud99d恖馞憮妕敞릘杮\ud99d曖ᦖ据馌杞閭戮\ud99c搶ᦄ李\ud98b斶禝柞香搆\ud993擎馀懖妙掎禎擮\r扣涜恛趘杫\u2d9b枻ඛ斓ඖ挳ⶉ曻"
         .length();
      String[] var9 = new String[2];
      int var8 = var10001;
      String var7 = "e懞ᦙ戎撚摶禒柆練敎馝惎妇曮妄悦妛摮㦋斞㦍柦㦝擎禟斦릗暞妆怦\ud993憖妈晎馑惎\ud995扎禔敆妔斎릘搮㦜扶妁朎妄慾馐朾禀擞\ud981曾聯放\ud995杖릚杮릎揆㦜捦福摆\ud99d恖馞憮妕敞릘杮\ud99d曖ᦖ据馌杞閭戮\ud99c搶ᦄ李\ud98b斶禝柞香搆\ud993擎馀懖妙掎禎擮\r扣涜恛趘杫\u2d9b枻ඛ斓ඖ挳ⶉ曻";

      do {
         char var13 = var7.charAt(var11);
         int var15 = 0;
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            char var16 = var14[var15];
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 3 | var16 << '\r') & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 3 | var16 >>> '\r') & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      llI = var9;
      lll = new Object[var9.length];
      int var10000 = 0;
      int var22 = 0;
      lIl = new int[56];
      byte[] var10002 = "!.Éë\u0013g\u001bötÒ<á1\u009fµ\u0084¾F\u009b©.\u00886m%1ô\u009cmn{@\u009d\u008d\u000f\u007f\u000b¯\u0083}õ:\u0088ó¯.Ò-!0æd²M\u0002\u0011áý\u0006á\u009a( ø6>IQHr'Õ\u0099:0ÑîÃ\u0090-+9uÞ3ä\u0007\u009a\u008e\u00816ä\u0090\u008bÄÑáü?}D\u009bø0é×É\u0006Ô\u00ad$¿Á7£wP\rø\u008a9,IØNö:\u0089]\u0002\u0012±Î!Ôýò»HÚ\fC,öÂ:F\u0006 \u0001¥\u0012¼Ùpx£\u001a£Ò!\u009b\u0016£éé`3%aà¶\u0006w\u007f&\u0011\u0007bnÜ ½h?\u0088\u008a¯\u0099;.¤ÁGKeB\u0002ë\u0084T\u0099D\u0095¨FcP\u0013\u0001ô>>\u0002\u001e°^\u009eÚ\u0010éulY"
         .getBytes("ISO-8859-1");

      int var53;
      do {
         lIl[var10000] = ((var10002[var22] & 255) << 24 | (var10002[var22 + 1] & 255) << 16 | (var10002[var22 + 2] & 255) << 8 | var10002[var22 + 3] & 255)
            ^ -1721415758;
         var10000 += 1;
         var53 = var22 + 4;
         var22 += 4;
      } while (var53 < var10002.length);

      String[] var0 = new String[III(-1981701534, var17 ^ -150626128)];
      int var4 = 0;
      String var3;
      int var5 = (var3 = IIl(1508244202, (byte)-25, 16399, -2038303555, -1917459310, '輹')).length();
      int var2 = III(-1981701533, var17 ^ -984845500);
      int var19 = -1;

      label92:
      while (true) {
         var10000 = III(-1981701536, var17 ^ -1560718237);
         String var25 = var3.substring(++var19, var19 + var2);
         byte var37 = -1;

         while (true) {
            label87: {
               char[] var55 = var25.toCharArray();
               int var67 = var55.length;
               int var6 = 0;
               var53 = var10000;
               var42 = var55;
               var22 = var67;
               char[] var79;
               int var86;
               if (var67 <= 1) {
                  var79 = var55;
                  var67 = var10000;
                  var86 = var6;
               } else {
                  var53 = var10000;
                  var22 = var67;
                  if (var67 <= var6) {
                     break label87;
                  }

                  var79 = var55;
                  var67 = var10000;
                  var86 = var6;
               }

               while (true) {
                  var79[var86] = (char)(var79[var86] ^ var67 ^ switch (var6 % III(-1981701529, var17 ^ -123511104)) {
                     case 0 -> III(-1981701532, var17 ^ -216359905);
                     case 1 -> III(-1981701531, var17 ^ -1153100816);
                     case 2 -> III(-1981701526, var17 ^ 1269196678);
                     case 3 -> III(-1981701525, var17 ^ -578491843);
                     case 4 -> III(-1981701528, var17 ^ 588374143);
                     case 5 -> III(-1981701527, var17 ^ 2030418591);
                     default -> III(-1981701522, var17 ^ -149188897);
                  });
                  var6++;
                  if (var53 == 0) {
                     var86 = var53;
                     var79 = var42;
                     var67 = var53;
                  } else {
                     if (var22 <= var6) {
                        break;
                     }

                     var79 = var42;
                     var67 = var53;
                     var86 = var6;
                  }
               }
            }

            String var60 = new String(var42).intern();
            switch (var37) {
               case 0:
                  var0[var4++] = var60;
                  if ((var19 += var2) >= var5) {
                     I = new IIllllIIl(
                        IlIIllIII.Ill(var0[5]),
                        new Color(
                           III(-1981701524, var17 ^ 936799770),
                           III(-1981701523, var17 ^ 1275316286),
                           III(-1981701518, var17 ^ -535486143),
                           III(-1981701517, var17 ^ -1638314044)
                        )
                     );
                     Ill = new IIllllIIl(
                        IlIIllIII.Ill(var0[1]),
                        new Color(
                           III(-1981701520, var17 ^ 1326537094),
                           III(-1981701519, var17 ^ 954792028),
                           III(-1981701514, var17 ^ -49144556),
                           III(-1981701513, var17 ^ -439390321)
                        )
                     );
                     lI = new IIllllIIl(
                        IlIIllIII.Ill(var0[III(-1981701516, var17 ^ 1487560256)]),
                        new Color(
                           III(-1981701515, var17 ^ 1184935110),
                           III(-1981701510, var17 ^ 936859540),
                           III(-1981701509, var17 ^ -1833922386),
                           III(-1981701512, var17 ^ 1073520924)
                        )
                     );
                     ll = new IIllllIIl(
                        IlIIllIII.Ill(var0[III(-1981701506, var17 ^ 387763167)]),
                        new Color(
                           III(-1981701505, var17 ^ -2044292969),
                           III(-1981701508, var17 ^ -284745456),
                           III(-1981701507, var17 ^ -1730325893),
                           III(-1981701566, var17 ^ -1960215919)
                        )
                     );
                     Il = new IIllllIIl(
                        IlIIllIII.Ill(var0[III(-1981701568, var17 ^ 613425238)]),
                        new Color(
                           III(-1981701567, var17 ^ -630700843),
                           III(-1981701562, var17 ^ 336670273),
                           III(-1981701561, var17 ^ -164966951),
                           III(-1981701564, var17 ^ 1794250846)
                        )
                     );
                     III = new IIllllIIl(
                        IlIIllIII.Ill(var0[III(-1981701563, var17 ^ 1966197594)]),
                        new Color(
                           III(-1981701558, var17 ^ -139428163),
                           III(-1981701557, var17 ^ 1069680684),
                           III(-1981701560, var17 ^ -213219158),
                           III(-1981701559, var17 ^ -799271155)
                        )
                     );
                     II = new IIllllIIl(
                        IlIIllIII.Ill(var0[III(-1981701556, var17 ^ -375135703)]),
                        new Color(
                           III(-1981701555, var17 ^ 1326467030),
                           III(-1981701550, var17 ^ 392962568),
                           III(-1981701549, var17 ^ -1809218836),
                           III(-1981701552, var17 ^ -2102252377)
                        )
                     );
                     lII = new IIllllIIl(IlIIllIII.Ill(var0[0]), null);
                     l = ll();
                     return;
                  }

                  var2 = var3.charAt(var19);
                  break;
               default:
                  var0[var4++] = var60;
                  if ((var19 += var2) < var5) {
                     var2 = var3.charAt(var19);
                     continue label92;
                  }

                  var5 = (var3 = IIl(972597780, (byte)87, (short)14616, -2038303556, 882112772, '\ue4af')).length();
                  var2 = III(-1981701535, var17 ^ -407577298);
                  var19 = -1;
            }

            var10000 = III(-1981701530, var17 ^ 1752036152);
            var25 = var3.substring(++var19, var19 + var2);
            var37 = 0;
         }
      }
   }

   private IIllllIIl(IIIlIlIl var3, Color var4) {
      this.IlI = var3;
      this.IIl = var4;
   }

   private static IIllllIIl[] ll() {
      IIllllIIl[] var10000 = new IIllllIIl[III(-1981701545, -1925127785 ^ -1547406895)];
      var10000[0] = I;
      var10000[1] = Ill;
      var10000[2] = lI;
      var10000[3] = ll;
      var10000[4] = Il;
      var10000[5] = III;
      var10000[III(-1981701548, -1925127785 ^ -1017596568)] = II;
      var10000[III(-1981701547, -1925127785 ^ 1957888801)] = lII;
      return var10000;
   }
}
