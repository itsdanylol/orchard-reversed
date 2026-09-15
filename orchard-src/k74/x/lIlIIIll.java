package k74.x;

import com.google.common.collect.ArrayListMultimap;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import com.mojang.authlib.properties.PropertyMap;
import java.lang.reflect.Method;
import java.util.UUID;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class lIlIIIll {
   private static final Object[] IlI;
   private static final Method I;
   private static final String[] l;
   private static String[] II;
   private static final String[] IIl;
   private static final String[] Il;
   private static final int[] III;
   private static final Method lI;
   private static final Method ll;

   public static PropertyMap I(GameProfile var0) {
      return IIl(var0, lI, PropertyMap.class);
   }

   public static UUID l(GameProfile var0) {
      return IIl(var0, ll, UUID.class);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = 463020330;
      short var18 = 21858;
      int var10001 = "'왩壕\udca1即ꯦﳋ撇\ue8bf㫙\uecf5㡣⽀ཷ蒵继쯟⊣俨띎溋\uf367俏㩲濹檗踦塍᯽죯쎼₰윋녦\uec69냡鑘㒃㐫袬!鶴牖⡁㬊뼔雈棰聸뻣鐖䅋퐃\ue084⠣隲흱倐Ṽ郷쩇眔黄웧\udb6f虻鴈\uf47a᱉뼢ˊ䝠쒡퇇".length();
      int var17 = 0;
      int var16 = 0;
      String[] var15 = new String[2];
      int var14 = var10001;
      String var13 = "'왩壕\udca1即ꯦﳋ撇\ue8bf㫙\uecf5㡣⽀ཷ蒵继쯟⊣俨띎溋\uf367俏㩲濹檗踦塍᯽죯쎼₰윋녦\uec69냡鑘㒃㐫袬!鶴牖⡁㬊뼔雈棰聸뻣鐖䅋퐃\ue084⠣隲흱倐Ṽ郷쩇眔黄웧\udb6f虻鴈\uf47a᱉뼢ˊ䝠쒡퇇";

      do {
         int var21 = 0;
         char var19 = var13.charAt(var17);
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 6) {
               default -> 44;
               case 1 -> 92;
               case 2 -> 240;
               case 3 -> 173;
               case 4 -> 11;
               case 5 -> 4;
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

      IIl = var15;
      IlI = new Object[var15.length];
      int var9 = 193334347;
      byte[] var7 = "7|#¶¢\u0083Oõ\nL;Ïöo®!Yaj\n\u0095ø\u0003A\u000e¥\u0095Y@º\u008a\u0016g+;®1\u0018ï\u0085lXÅ·\u0015\u0088I ¯\u0007\u009b§Ë«\u000f·ÓÒ\u0019Õ\u0016kyà#ºã_\u009d>¶\u008b\u000012p)õ¯ì\u0081q\u008eFÓ\u0080\u007f¸\u009b\u0010\u0004\u0004\u0014ô\u001ej\u009a\u0019P\u0092ÑÚ}ý+GAÇ¸r î\u0018~w³¥ô¬fÝWÔ\u0098kWý\u0091å\u008c_¡üù\u001e\u0083*é\n\u0003¸îK`UüU!¿§Ã\u0084Rê¶AÉDp&¯0\u0085ü8fi\u0004\u0092\u0004½ÉÚ\u0019\u008fÔOªÝ\u000f«¡é·¶\u008dÙþPáÀïm»+!&©Ñ0í±\u008cK\u0000/0\u007f\u0090\u001a|gIó\u00016ï.\u0002éöýýèU@æk\u0084ÍÈ\u00adn¥.¡\u0017\u0081+ìJ:²t\u0081î7«\u0085\u0018\u001d¾×\u009cêÛ>ª\u0013$ê>N\u0082áÚÉR\u001c\u0092\u001d\u009bò{ïÚ3/eÊ¯íÈy\u008es¹h¦hPÅ\u0086;Ø\u00817vFÅ\u001aß\u00adYð'Ð£K~\rs)OtOÊ?\u009fèF\u000flì\u0004\u0005%+¹õùÅi&\u0010\t\u0006\bÊ¿.Ó>öx0\u0015c/b\u0002iµ¦0\u007f \u0001\u007f\u0003\u000b\u001a\u0092\u0016)P-\u0013ý³\u0096÷\u0090RTM:¤)\\Ú+þ©ô\n9¡\u00adU\u0019G[\u009c\u0083ø\u0081®nöí\u0003\u008c[:ªÇòÂ\u008eÔ»+8üæ\bÃ>ê^\u008ecY\u009f¬¡la£\u001e\u009fëZå\u001c\u0098]fNf\u0085jL_~o\u009c^\u0016\u001e\u008b2±G\u0094\u0010&ü\u007f ð\u0018-·Åxè\\DÖ\u001acRÂ.\u000f°\u008a\u0012õ\u0019\u0095<Ã|®J·xpþÍGxL\u0088HÔ©Ç6ìÚX\n´J\u001c\u0087~à\u0019\u001b\u0089Úìæ£Ëg\u0018\u0084Xg\ro/Î¸\u0086i{\u0093^÷\u008a+y\u0013\u009a\bÇô[º;o\u0018¿Ë\u000f¦¤\u001e#(@Å\u0081\u009a \u0091OuÐÔ\u008dû\\ÈnÖGN«³<\u000e\u0011g/\u0084¢\u001a%GîÍ%ªx\u008a\u009fU4älXïÇf8\u0007ãÎ\u00107OZ\fa%\u0088<½>lª¶\u0087 èÂÂ-?\u0094ÿ8<\u0092/øü\u008eÝ&ÙoûìVjçÑù\u0093üÚI¦Gk¸Äù}\u0089ÖZ»¿\u0017Õá\n)7X\u0098.À\u0085ÀOÛÞàJ.që|\u0092ÿ\u0082äl\u008a\u0006\u0006öï\u000b´ÿ{\u0016ÛF3/g-p^\u009f\u0086z\u000f\u000f\u0095ÞÊ8¥\"6\u001cf\u00ad=Ã\u00942I:\u000bz\u0088u,æü\u001flÇE\"b\u0089¼÷Çä\u001e\u007fôì\u008d¶\u00970:\u0081\u0002\u0012od=+©w#Íó÷3k\u0094ªþ»\u007fÍV}Å÷}L\u008e\u0000it=\u001c\u001a\u0002\n\u0019JZo)Ã +³ªZõRS1th÷`>\u0085\u0093\t'\u0004!Ñç'4\u001a½5B\r\u008bËpÃL\u0092N7Àîí¦³vGxg\u0090gZ&r(\fK;½\u0003\u0093V¼ýVÊo\u0002Ñ·\"²R\u0081\u001aF\"Ý\u008dúë2\u0010¡Ä ¯-b\u00109ë\u0018V\u0080ã\u0002KÜ:\u0016\u0087\u000f\u008b{\u0080dvb.{Ô[G3ÆäZ2_p\u0082ñ(æj£Cû®5\u0096ìQ\u008a~\u0088\u009dÙCÊ?½þòÊ\tÙÚ\u0080q\u0092Y(ÖMÊé@\u001eìZ\u008ff±\u0017\u007fD#¦\u0004D·\u0007°\u000bf\u008ev\u0004óK4k¤z\u0081\u008d\u008d0÷^:\u0006_u~x÷M¢@¢\u0087\u0099ÆB¹úú°â\u001e\u0093ø\u0000(ÿ?5q\u0098\u0099¼ã\u0091å3å\u008cuô~hRóbu\u0098;¨/.à?\u001a\u0098\u008f)0C7!Á\u0011N\u00824\u0085£ (áIÛ!B-TX§\u0017&ýq\u009b¥(¨Õ¸8eÕ*\u0087I=ù`ÒEã\u0084r\t{\u0013X+4ëpåîl£\u0013\u009b\r!gS\rJÝ\u0092©¶\u0001¥aýBÓ\u0090CS;×ðâE\u000bâÚ*\u009d²-²á®?É\u0014Y$%\u0097ÐÐ\u009e\u0097ÅUhó\u001fmnF\u009dÅ_\u009d<\u0091®\r&ý\u0080µ\u0015\u009f(\u00ad"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      III = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         III[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var5 = new String[lII(-1255832784, var23 ^ -1840930723)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = lIl('筸', 52, -1859339932, 195347066)).length();
      int var1 = lII(-1255832783, var23 ^ 129682449);
      int var25 = -1;

      label100:
      while (true) {
         int var28 = lII(-1255832782, var23 ^ -1351239660);
         String var30 = var2.substring(++var25, var25 + var1);
         byte var10002 = -1;

         while (true) {
            label95: {
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
                     break label95;
                  }

                  var57 = var45;
                  var10004 = var28;
                  var10006 = var6;
               }

               while (true) {
                  var57[var10006] = (char)(var57[var10006] ^ var10004 ^ switch (var6 % lII(-1255832778, var23 ^ -1415833925)) {
                     case 0 -> lII(-1255832777, var23 ^ -444395978);
                     case 1 -> lII(-1255832776, var23 ^ -1038958666);
                     case 2 -> lII(-1255832775, var23 ^ -1809748998);
                     case 3 -> lII(-1255832774, var23 ^ -916373071);
                     case 4 -> lII(-1255832773, var23 ^ -1330524916);
                     case 5 -> lII(-1255832772, var23 ^ 171843467);
                     default -> lII(-1255832771, var23 ^ 1855097983);
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
                     Il = new String[lII(-1255832779, var23 ^ 817987759)];
                     II = new String[lII(-1255832770, var23 ^ 1995151920)];
                     Il();
                     ll = II(IlIIllIII.lI(II[0]), IlIIllIII.lI(II[2]));
                     I = II(IlIIllIII.lI(II[3]), IlIIllIII.lI(II[5]));
                     lI = II(IlIIllIII.lI(II[1]), IlIIllIII.lI(II[4]));
                     return;
                  }

                  var1 = var2.charAt(var25);
                  break;
               default:
                  var5[var3++] = var50;
                  if ((var25 += var1) < var4) {
                     var1 = var2.charAt(var25);
                     continue label100;
                  }

                  var4 = (var2 = lIl(4366, (byte)61, -1859339931, -72641728)).length();
                  var1 = lII(-1255832781, var23 ^ 1398156739);
                  var25 = -1;
            }

            var28 = lII(-1255832780, var23 ^ -61280723);
            var30 = var2.substring(++var25, var25 + var1);
            var10002 = 0;
         }
      }
   }

   private static Method II(String... var0) {
      for (String var4 : var0) {
         try {
            Method var5 = GameProfile.class.getMethod(var4);
            var5.setAccessible(true);
            return var5;
         } catch (ReflectiveOperationException var6) {
         }
      }

      return null;
   }

   private static int lII(int var0, int var1) {
      int var2 = III[var0 ^ -1255832784] ^ var1 ^ var0;
      var2 ^= 15981;
      var2 += 27052;
      var2 -= 37335;
      var2 -= 56397;
      var2 -= 63306;
      var2 -= 30183;
      return var2 - 41512;
   }

   private static void Il() {
      int var0 = 1405524708;
      II[0] = ll(IlI(lII(-1255832769, var0 ^ -83039784), lII(-1255832800, var0 ^ -824390577)).toCharArray(), 93583L, lII(-1255832799, var0 ^ 1320431281));
      II[1] = ll(IlI(lII(-1255832798, var0 ^ -313089449), lII(-1255832797, var0 ^ -997050474)).toCharArray(), 86833L, lII(-1255832796, var0 ^ -193111625));
      II[2] = ll(IlI(lII(-1255832795, var0 ^ 1055387543), lII(-1255832794, var0 ^ 1987566037)).toCharArray(), 4212L, lII(-1255832793, var0 ^ 1800178838));
      II[3] = ll(IlI(lII(-1255832792, var0 ^ 2004795582), lII(-1255832791, var0 ^ 1019070741)).toCharArray(), 95554L, lII(-1255832790, var0 ^ -2025518802));
      II[4] = ll(IlI(lII(-1255832789, var0 ^ 1427452102), lII(-1255832788, var0 ^ -182970287)).toCharArray(), 60868L, lII(-1255832787, var0 ^ 1860444410));
      II[5] = ll(IlI(lII(-1255832786, var0 ^ 808469686), lII(-1255832785, var0 ^ -2043550653)).toCharArray(), 46372L, lII(-1255832816, var0 ^ 425067148));
   }

   private static ReflectiveOperationException lI(ReflectiveOperationException var0) {
      return var0;
   }

   private static String lIl(char var0, byte var1, int var2, int var3) {
      int var8 = var2 ^ -1859339932;
      char[] var7 = IIl[var8].toCharArray();
      StackTraceElement[] var9 = (StackTraceElement[])IlI[var8];
      StackTraceElement[] var10;
      if (var9 != null) {
         var10 = var9;
      } else {
         var10 = new Throwable().getStackTrace();
         IlI[var8] = var10;
      }

      StackTraceElement var11 = var10[1];
      int var5 = (var11.getClassName().hashCode() ^ var11.getMethodName().hashCode()) >> 16 ^ 54;
      int var6 = 0;

      do {
         var7[var6] = (char)(var7[var6] ^ var6 ^ 15489 ^ var5 ^ var0 ^ var2 ^ var3 ^ var1);
      } while (++var6 < var7.length);

      return new String(var7).intern();
   }

   private static String ll(char[] var0, long var1, int var3) {
      int var4 = lII(-1255832815, -1104905831 ^ -167375140) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & lII(-1255832814, -1104905831 ^ 711841406);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private lIlIIIll() {
   }

   public static GameProfile III(GameProfile var0, String var1, Property var2) {
      if (var0 != null && var1 != null && !var1.isBlank() && var2 != null) {
         ArrayListMultimap var3 = ArrayListMultimap.create();
         PropertyMap var4 = I(var0);
         if (var4 != null) {
            var3.putAll(var4);
         }

         var3.put(var1, var2);
         return new GameProfile(l(var0), Ill(var0), new PropertyMap(var3));
      } else {
         return var0;
      }
   }

   private static <T> T IIl(GameProfile param0, Method param1, Class<T> param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: ifnull 0f
      // 04: aload 1
      // 05: ifnonnull 15
      // 08: goto 0f
      // 0b: invokestatic k74/x/lIlIIIll.lI (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 0e: athrow
      // 0f: aconst_null
      // 10: areturn
      // 11: invokestatic k74/x/lIlIIIll.lI (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 14: athrow
      // 15: aload 1
      // 16: aload 0
      // 17: bipush 0
      // 18: anewarray 4
      // 1b: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1e: astore 3
      // 1f: aload 2
      // 20: aload 3
      // 21: invokevirtual java/lang/Class.isInstance (Ljava/lang/Object;)Z
      // 24: ifeq 33
      // 27: aload 2
      // 28: aload 3
      // 29: invokevirtual java/lang/Class.cast (Ljava/lang/Object;)Ljava/lang/Object;
      // 2c: goto 34
      // 2f: invokestatic k74/x/lIlIIIll.lI (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 32: athrow
      // 33: aconst_null
      // 34: areturn
      // 35: astore 3
      // 36: aconst_null
      // 37: areturn
   }

   private static String IlI(int var0, int var1) {
      int var9 = 1040150278;
      int var2 = (var0 ^ lII(-1255832813, var9 ^ 1001402005)) & lII(-1255832812, var9 ^ -693856059);
      if (Il[var2] == null) {
         char[] var3 = l[var2].toCharArray();

         int var4 = switch (var3[0] & lII(-1255832811, var9 ^ 1022888289)) {
            case 0 -> lII(-1255832810, var9 ^ -776635359);
            case 1 -> lII(-1255832809, var9 ^ 1243331242);
            case 2 -> lII(-1255832808, var9 ^ 745492364);
            case 3 -> lII(-1255832807, var9 ^ -1153850519);
            case 4 -> lII(-1255832806, var9 ^ 291207016);
            case 5 -> lII(-1255832805, var9 ^ 1497777559);
            case 6 -> lII(-1255832804, var9 ^ -856352982);
            case 7 -> lII(-1255832803, var9 ^ 687743995);
            case 8 -> lII(-1255832802, var9 ^ 902960116);
            case 9 -> 1;
            case 10 -> lII(-1255832801, var9 ^ -742519500);
            case 11 -> lII(-1255832832, var9 ^ -286989876);
            case 12 -> lII(-1255832831, var9 ^ -1510597384);
            case 13 -> lII(-1255832830, var9 ^ 1861109293);
            case 14 -> lII(-1255832829, var9 ^ -2089747723);
            case 15 -> lII(-1255832828, var9 ^ 323335765);
            case 16 -> lII(-1255832827, var9 ^ -894645286);
            case 17 -> lII(-1255832826, var9 ^ 1819396261);
            case 18 -> lII(-1255832825, var9 ^ 1973565380);
            case 19 -> lII(-1255832824, var9 ^ -702599993);
            case 20 -> lII(-1255832823, var9 ^ 127009295);
            case 21 -> lII(-1255832822, var9 ^ -302324509);
            case 22 -> lII(-1255832821, var9 ^ -1797332522);
            case 23 -> lII(-1255832820, var9 ^ -916095067);
            case 24 -> lII(-1255832819, var9 ^ 45219226);
            case 25 -> lII(-1255832818, var9 ^ 105371584);
            case 26 -> lII(-1255832817, var9 ^ 1422073985);
            case 27 -> lII(-1255832720, var9 ^ -1107961385);
            case 28 -> lII(-1255832719, var9 ^ 1767998681);
            case 29 -> lII(-1255832718, var9 ^ 1652884390);
            case 30 -> lII(-1255832717, var9 ^ -1613899915);
            case 31 -> lII(-1255832716, var9 ^ 1898193510);
            case 32 -> lII(-1255832715, var9 ^ -1334792226);
            case 33 -> lII(-1255832714, var9 ^ 749863555);
            case 34 -> lII(-1255832713, var9 ^ 221017018);
            case 35 -> lII(-1255832712, var9 ^ 624401057);
            case 36 -> lII(-1255832711, var9 ^ 90444304);
            case 37 -> lII(-1255832710, var9 ^ -1272345364);
            case 38 -> lII(-1255832709, var9 ^ -1719638134);
            case 39 -> lII(-1255832708, var9 ^ 1937250950);
            case 40 -> lII(-1255832707, var9 ^ -937310229);
            case 41 -> lII(-1255832706, var9 ^ -1441744409);
            case 42 -> lII(-1255832705, var9 ^ 1231050219);
            case 43 -> lII(-1255832736, var9 ^ -984570337);
            case 44 -> lII(-1255832735, var9 ^ -2024083607);
            case 45 -> lII(-1255832734, var9 ^ 984232834);
            case 46 -> lII(-1255832733, var9 ^ -361113043);
            case 47 -> lII(-1255832732, var9 ^ -2057894107);
            case 48 -> lII(-1255832731, var9 ^ -1383271201);
            case 49 -> lII(-1255832730, var9 ^ -76554408);
            case 50 -> lII(-1255832729, var9 ^ -1405237100);
            case 51 -> lII(-1255832728, var9 ^ 922353091);
            case 52 -> lII(-1255832727, var9 ^ 593409327);
            case 53 -> lII(-1255832726, var9 ^ -2008719440);
            case 54 -> lII(-1255832725, var9 ^ -1441798301);
            case 55 -> lII(-1255832724, var9 ^ 2129419094);
            case 56 -> lII(-1255832723, var9 ^ 319658483);
            case 57 -> lII(-1255832722, var9 ^ -1174674530);
            case 58 -> lII(-1255832721, var9 ^ 1500787880);
            case 59 -> lII(-1255832752, var9 ^ 2002121566);
            case 60 -> lII(-1255832751, var9 ^ 772461552);
            case 61 -> lII(-1255832750, var9 ^ -658290354);
            case 62 -> lII(-1255832749, var9 ^ 49390794);
            case 63 -> lII(-1255832748, var9 ^ 1851541032);
            case 64 -> lII(-1255832747, var9 ^ -1175122640);
            case 65 -> lII(-1255832746, var9 ^ 1104223984);
            case 66 -> lII(-1255832745, var9 ^ -1469630781);
            case 67 -> lII(-1255832744, var9 ^ -1952648099);
            case 68 -> lII(-1255832743, var9 ^ -573462211);
            case 69 -> lII(-1255832742, var9 ^ 485715146);
            case 70 -> lII(-1255832741, var9 ^ -486747036);
            case 71 -> lII(-1255832740, var9 ^ 1745168522);
            case 72 -> lII(-1255832739, var9 ^ 453160079);
            case 73 -> lII(-1255832738, var9 ^ -438654995);
            case 74 -> lII(-1255832737, var9 ^ -601774756);
            case 75 -> lII(-1255832768, var9 ^ -582363929);
            case 76 -> lII(-1255832767, var9 ^ -1309766312);
            case 77 -> lII(-1255832766, var9 ^ -1820772858);
            case 78 -> lII(-1255832765, var9 ^ 598725354);
            case 79 -> lII(-1255832764, var9 ^ 882553349);
            case 80 -> lII(-1255832763, var9 ^ -551871446);
            case 81 -> lII(-1255832762, var9 ^ -536016783);
            case 82 -> lII(-1255832761, var9 ^ -1930477538);
            case 83 -> lII(-1255832760, var9 ^ 1984323475);
            case 84 -> lII(-1255832759, var9 ^ 1076061348);
            case 85 -> lII(-1255832758, var9 ^ 875019639);
            case 86 -> lII(-1255832757, var9 ^ 1310241462);
            case 87 -> lII(-1255832756, var9 ^ 186064490);
            case 88 -> lII(-1255832755, var9 ^ 1147741888);
            case 89 -> lII(-1255832754, var9 ^ -615154000);
            case 90 -> lII(-1255832753, var9 ^ -1613188060);
            case 91 -> lII(-1255832656, var9 ^ -1706802380);
            case 92 -> lII(-1255832655, var9 ^ 1874422125);
            case 93 -> lII(-1255832654, var9 ^ -465088827);
            case 94 -> lII(-1255832653, var9 ^ -464345846);
            case 95 -> lII(-1255832652, var9 ^ 1307003959);
            case 96 -> lII(-1255832651, var9 ^ -120810264);
            case 97 -> lII(-1255832650, var9 ^ 158643115);
            case 98 -> lII(-1255832649, var9 ^ 425135606);
            case 99 -> lII(-1255832648, var9 ^ -656019097);
            case 100 -> lII(-1255832647, var9 ^ -1679817100);
            case 101 -> lII(-1255832646, var9 ^ 637260825);
            case 102 -> lII(-1255832645, var9 ^ -1424027817);
            case 103 -> 0;
            case 104 -> lII(-1255832644, var9 ^ 427776949);
            case 105 -> lII(-1255832643, var9 ^ -158392773);
            case 106 -> lII(-1255832642, var9 ^ 2013463226);
            case 107 -> lII(-1255832641, var9 ^ 1427670156);
            case 108 -> lII(-1255832672, var9 ^ 811844824);
            case 109 -> lII(-1255832671, var9 ^ -462401923);
            case 110 -> lII(-1255832670, var9 ^ -1720022373);
            case 111 -> lII(-1255832669, var9 ^ 1316643035);
            case 112 -> lII(-1255832668, var9 ^ 163618599);
            case 113 -> lII(-1255832667, var9 ^ 1731433200);
            case 114 -> lII(-1255832666, var9 ^ 1144648328);
            case 115 -> lII(-1255832665, var9 ^ 1620171497);
            case 116 -> lII(-1255832664, var9 ^ -872038094);
            case 117 -> lII(-1255832663, var9 ^ -1495796219);
            case 118 -> lII(-1255832662, var9 ^ -1120704571);
            case 119 -> lII(-1255832661, var9 ^ 83830184);
            case 120 -> lII(-1255832660, var9 ^ 1098053050);
            case 121 -> lII(-1255832659, var9 ^ 2087188095);
            case 122 -> 5;
            case 123 -> lII(-1255832658, var9 ^ -1398327772);
            case 124 -> lII(-1255832657, var9 ^ 1584993211);
            case 125 -> lII(-1255832688, var9 ^ 2025036928);
            case 126 -> lII(-1255832687, var9 ^ 1687040800);
            case 127 -> lII(-1255832686, var9 ^ 2139456405);
            case 128 -> lII(-1255832685, var9 ^ -1003195872);
            case 129 -> lII(-1255832684, var9 ^ 2049065847);
            case 130 -> lII(-1255832683, var9 ^ -639339107);
            case 131 -> lII(-1255832682, var9 ^ 1455341727);
            case 132 -> 2;
            case 133 -> 3;
            case 134 -> lII(-1255832681, var9 ^ -1274588629);
            case 135 -> lII(-1255832680, var9 ^ 1138363020);
            case 136 -> lII(-1255832679, var9 ^ 1484860041);
            case 137 -> lII(-1255832678, var9 ^ -1389485755);
            case 138 -> lII(-1255832677, var9 ^ 295716876);
            case 139 -> lII(-1255832676, var9 ^ -271201092);
            case 140 -> lII(-1255832675, var9 ^ 1974518097);
            case 141 -> lII(-1255832674, var9 ^ 2082790652);
            case 142 -> lII(-1255832673, var9 ^ -982719127);
            case 143 -> lII(-1255832704, var9 ^ -1372613604);
            case 144 -> lII(-1255832703, var9 ^ 86361353);
            case 145 -> lII(-1255832702, var9 ^ 377553064);
            case 146 -> lII(-1255832701, var9 ^ 645790545);
            case 147 -> lII(-1255832700, var9 ^ -437061861);
            case 148 -> lII(-1255832699, var9 ^ 393053148);
            case 149 -> lII(-1255832698, var9 ^ -2010824107);
            case 150 -> lII(-1255832697, var9 ^ -1346816264);
            case 151 -> lII(-1255832696, var9 ^ -275216257);
            case 152 -> lII(-1255832695, var9 ^ -506038544);
            case 153 -> lII(-1255832694, var9 ^ 1153160263);
            case 154 -> lII(-1255832693, var9 ^ 2008238007);
            case 155 -> lII(-1255832692, var9 ^ 342880481);
            case 156 -> lII(-1255832691, var9 ^ -2125617834);
            case 157 -> lII(-1255832690, var9 ^ -1099668612);
            case 158 -> lII(-1255832689, var9 ^ -1601029682);
            case 159 -> lII(-1255832592, var9 ^ -1338745324);
            case 160 -> lII(-1255832591, var9 ^ 2112140638);
            case 161 -> lII(-1255832590, var9 ^ -719188224);
            case 162 -> lII(-1255832589, var9 ^ -32292062);
            case 163 -> lII(-1255832588, var9 ^ -366217221);
            case 164 -> lII(-1255832587, var9 ^ -1721909111);
            case 165 -> lII(-1255832586, var9 ^ -922376746);
            case 166 -> lII(-1255832585, var9 ^ 1082123919);
            case 167 -> lII(-1255832584, var9 ^ 688209893);
            case 168 -> lII(-1255832583, var9 ^ -798048594);
            case 169 -> lII(-1255832582, var9 ^ 1950348218);
            case 170 -> lII(-1255832581, var9 ^ 274132343);
            case 171 -> lII(-1255832580, var9 ^ -1567740582);
            case 172 -> lII(-1255832579, var9 ^ -1220184191);
            case 173 -> lII(-1255832578, var9 ^ -1051572536);
            case 174 -> lII(-1255832577, var9 ^ -207846985);
            case 175 -> lII(-1255832608, var9 ^ -848819534);
            case 176 -> lII(-1255832607, var9 ^ 1861844576);
            case 177 -> lII(-1255832606, var9 ^ -1004032734);
            case 178 -> lII(-1255832605, var9 ^ -469374131);
            case 179 -> lII(-1255832604, var9 ^ -1420590631);
            case 180 -> lII(-1255832603, var9 ^ 1046240865);
            case 181 -> lII(-1255832602, var9 ^ 1067621459);
            case 182 -> lII(-1255832601, var9 ^ -329442527);
            case 183 -> lII(-1255832600, var9 ^ -1578264487);
            case 184 -> lII(-1255832599, var9 ^ -1726355302);
            case 185 -> lII(-1255832598, var9 ^ 245703077);
            case 186 -> lII(-1255832597, var9 ^ -1812066714);
            case 187 -> lII(-1255832596, var9 ^ 745711856);
            case 188 -> lII(-1255832595, var9 ^ -1162554749);
            case 189 -> lII(-1255832594, var9 ^ 62703669);
            case 190 -> lII(-1255832593, var9 ^ 1600510896);
            case 191 -> lII(-1255832624, var9 ^ -1932218031);
            case 192 -> lII(-1255832623, var9 ^ -416700229);
            case 193 -> lII(-1255832622, var9 ^ -125070927);
            case 194 -> lII(-1255832621, var9 ^ -1332138313);
            case 195 -> 4;
            case 196 -> lII(-1255832620, var9 ^ -1325352370);
            case 197 -> lII(-1255832619, var9 ^ 1920412537);
            case 198 -> lII(-1255832618, var9 ^ 538719927);
            case 199 -> lII(-1255832617, var9 ^ -1228331411);
            case 200 -> lII(-1255832616, var9 ^ 153174699);
            case 201 -> lII(-1255832615, var9 ^ 1511786268);
            case 202 -> lII(-1255832614, var9 ^ 1050753157);
            case 203 -> lII(-1255832613, var9 ^ -1970925484);
            case 204 -> lII(-1255832612, var9 ^ -221408299);
            case 205 -> lII(-1255832611, var9 ^ 1427243222);
            case 206 -> lII(-1255832610, var9 ^ -1019140432);
            case 207 -> lII(-1255832609, var9 ^ 205093744);
            case 208 -> lII(-1255832640, var9 ^ -65279696);
            case 209 -> lII(-1255832639, var9 ^ -2028241419);
            case 210 -> lII(-1255832638, var9 ^ 861187198);
            case 211 -> lII(-1255832637, var9 ^ -178570811);
            case 212 -> lII(-1255832636, var9 ^ -1221300658);
            case 213 -> lII(-1255832635, var9 ^ 47335314);
            case 214 -> lII(-1255832634, var9 ^ 1946284240);
            case 215 -> lII(-1255832633, var9 ^ -601181090);
            case 216 -> lII(-1255832632, var9 ^ 1947365207);
            case 217 -> lII(-1255832631, var9 ^ 567825391);
            case 218 -> lII(-1255832630, var9 ^ -1041878985);
            case 219 -> lII(-1255832629, var9 ^ 868078496);
            case 220 -> lII(-1255832628, var9 ^ 2069881452);
            case 221 -> lII(-1255832627, var9 ^ -1133855611);
            case 222 -> lII(-1255832626, var9 ^ 451094897);
            case 223 -> lII(-1255832625, var9 ^ 1718364291);
            case 224 -> lII(-1255833040, var9 ^ -156519057);
            case 225 -> lII(-1255833039, var9 ^ -777213656);
            case 226 -> lII(-1255833038, var9 ^ 459563797);
            case 227 -> lII(-1255833037, var9 ^ -1379929009);
            case 228 -> lII(-1255833036, var9 ^ 466674342);
            case 229 -> lII(-1255833035, var9 ^ -1066865930);
            case 230 -> lII(-1255833034, var9 ^ -1844360874);
            case 231 -> lII(-1255833033, var9 ^ 117205770);
            case 232 -> lII(-1255833032, var9 ^ 1645613236);
            case 233 -> lII(-1255833031, var9 ^ -1049452693);
            case 234 -> lII(-1255833030, var9 ^ 608759293);
            case 235 -> lII(-1255833029, var9 ^ -222007778);
            case 236 -> lII(-1255833028, var9 ^ 730493740);
            case 237 -> lII(-1255833027, var9 ^ -427105816);
            case 238 -> lII(-1255833026, var9 ^ -899534109);
            case 239 -> lII(-1255833025, var9 ^ 1360670565);
            case 240 -> lII(-1255833056, var9 ^ -245976880);
            case 241 -> lII(-1255833055, var9 ^ -613089442);
            case 242 -> lII(-1255833054, var9 ^ -205904400);
            case 243 -> lII(-1255833053, var9 ^ 541872239);
            case 244 -> lII(-1255833052, var9 ^ -1573349200);
            case 245 -> lII(-1255833051, var9 ^ -914204262);
            case 246 -> lII(-1255833050, var9 ^ 895380997);
            case 247 -> lII(-1255833049, var9 ^ 2115837808);
            case 248 -> lII(-1255833048, var9 ^ -1072892124);
            case 249 -> lII(-1255833047, var9 ^ 1941802552);
            case 250 -> lII(-1255833046, var9 ^ 1636164084);
            case 251 -> lII(-1255833045, var9 ^ 829585748);
            case 252 -> lII(-1255833044, var9 ^ 761267649);
            case 253 -> lII(-1255833043, var9 ^ -629412343);
            case 254 -> lII(-1255833042, var9 ^ 1401902503);
            default -> lII(-1255833041, var9 ^ 1175102391);
         };
         int var5 = (var1 & lII(-1255833072, var9 ^ -1674402394)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & lII(-1255833071, var9 ^ 513643388)) >>> lII(-1255833070, var9 ^ -1076993306)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & lII(-1255833069, var9 ^ -1516090538);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & lII(-1255833068, var9 ^ -1765743799);
            }
         }

         Il[var2] = new String(var3).intern();
      }

      return Il[var2];
   }

   public static String Ill(GameProfile var0) {
      return IIl(var0, I, String.class);
   }
}
