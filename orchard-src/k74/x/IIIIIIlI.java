package k74.x;

import com.mojang.authlib.GameProfile;
import java.lang.reflect.Field;
import java.util.UUID;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1657;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_640;

@Environment(EnvType.CLIENT)
public final class IIIIIIlI {
   private static final Object[] III;
   private static Field I;
   private static final String[] l;
   private static final int[] lI;
   private static final String[] ll;
   private static final IIIlIlIl II;
   private static final String[] Il;

   private static boolean I(GameProfile var0) {
      if (var0 == null) {
         return false;
      } else {
         String var1 = lIlIIIll.Ill(var0);
         return II.Illl(var1);
      }
   }

   public static class_2561 l(class_640 var0, class_2561 var1) {
      if (var0 == null) {
         return var1;
      } else {
         return II(var0.method_2966()) ? var1 : Ill(var0.method_2966(), var1);
      }
   }

   private static boolean II(GameProfile var0) {
      if (var0 != null && lI()) {
         class_310 var1 = class_310.method_1551();
         if (var1.field_1724 == null) {
            return false;
         } else {
            UUID var2 = lIlIIIll.l(var0);
            return var2 != null && llI(var2, var1.field_1724);
         }
      } else {
         return false;
      }
   }

   private static Exception Il(Exception var0) {
      return var0;
   }

   private static boolean lI() {
      IIIIIllII var0 = IIIIIllII.III();
      if (var0 == null) {
         return false;
      } else {
         IIlIIIIll var1 = var0.II().lllll();
         return var1 != null && var1.IIIIlIl();
      }
   }

   static void ll() {
      I = null;
   }

   public static class_2561 III(Object param0, class_2561 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: aload 0
      // 01: ifnonnull 0a
      // 04: aload 1
      // 05: areturn
      // 06: invokestatic k74/x/IIIIIIlI.Il (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09: athrow
      // 0a: getstatic k74/x/IIIIIIlI.I Ljava/lang/reflect/Field;
      // 0d: ifnull 24
      // 10: getstatic k74/x/IIIIIIlI.I Ljava/lang/reflect/Field;
      // 13: invokevirtual java/lang/reflect/Field.getDeclaringClass ()Ljava/lang/Class;
      // 16: aload 0
      // 17: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 1a: if_acmpeq 56
      // 1d: goto 24
      // 20: invokestatic k74/x/IIIIIIlI.Il (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: aload 0
      // 25: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 28: ldc 1037774461
      // 2a: ldc 1146261252
      // 2c: ldc -1744584350
      // 2e: ixor
      // 2f: invokestatic k74/x/IIIIIIlI.IIIl (II)I
      // 32: ldc 1037774460
      // 34: ldc 1146261252
      // 36: ldc -645445970
      // 38: ixor
      // 39: invokestatic k74/x/IIIIIIlI.IIIl (II)I
      // 3c: invokestatic k74/x/IIIIIIlI.IlI (II)Ljava/lang/String;
      // 3f: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 42: invokevirtual java/lang/Class.getDeclaredField (Ljava/lang/String;)Ljava/lang/reflect/Field;
      // 45: putstatic k74/x/IIIIIIlI.I Ljava/lang/reflect/Field;
      // 48: getstatic k74/x/IIIIIIlI.I Ljava/lang/reflect/Field;
      // 4b: bipush 1
      // 4c: invokevirtual java/lang/reflect/Field.setAccessible (Z)V
      // 4f: goto 56
      // 52: invokestatic k74/x/IIIIIIlI.Il (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 55: athrow
      // 56: getstatic k74/x/IIIIIIlI.I Ljava/lang/reflect/Field;
      // 59: aload 0
      // 5a: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 5d: astore 2
      // 5e: aload 2
      // 5f: instanceof net/minecraft/class_1657
      // 62: ifeq 7c
      // 65: aload 2
      // 66: checkcast net/minecraft/class_1657
      // 69: astore 3
      // 6a: aload 3
      // 6b: invokestatic k74/x/IIIIIIlI.lll (Lnet/minecraft/class_1657;)Z
      // 6e: ifeq 73
      // 71: aload 1
      // 72: areturn
      // 73: aload 3
      // 74: invokevirtual net/minecraft/class_1657.method_7334 ()Lcom/mojang/authlib/GameProfile;
      // 77: aload 1
      // 78: invokestatic k74/x/IIIIIIlI.Ill (Lcom/mojang/authlib/GameProfile;Lnet/minecraft/class_2561;)Lnet/minecraft/class_2561;
      // 7b: areturn
      // 7c: aload 1
      // 7d: areturn
      // 7e: astore 2
      // 7f: aload 1
      // 80: areturn
   }

   private static int IIIl(int var0, int var1) {
      int var2 = lI[var0 ^ 1037774461] ^ var1 ^ var0;
      var2 -= 62953;
      var2 -= 54777;
      var2 -= 18942;
      var2 -= 65202;
      var2 += 2239;
      var2 ^= 38094;
      var2 -= 31038;
      return var2 ^ 6198;
   }

   private IIIIIIlI() {
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var24 = -718170939;
      short var13 = 24125;
      byte var20 = -1;
      char[] var15 = "帣".toCharArray();
      String var14 = "\uf54b\uf5da\uf51d\uf5bc\uf53a\uf595\uf5c4\uf552\uf573\uf566\uf5ae\uf55b\uf5e1\uf5c4\uf5f8\uf525\uf521\uf532\uf5f5\uf506\uf541\uf52d\uf5ab\uf5b8\uf5c9\uf504\uf5e4\uf501\uf522\uf567";
      String[] var16 = new String[var15.length];

      while (true) {
         int var17 = 0;
         int var18 = 0;
         int var19 = 0;
         if (var20 == 0) {
            ll = var16;
            III = new Object[var16.length];
            int var9 = 782703633;
            byte[] var7 = "Ï.\u008a\u0003\u008eª\u0002Còn\u0095\u009d®ÜèthÆ\u008e¾Àú+ÞÇa\u001a.n\u0015\u007fä¥ì?ó-#\n\u00111í¥\u0004`½6\u007fãiMÛ[gsô)3¬\u0019\u0015P8¦í\u0014º\u0082ôôRÿ¡cc÷(À4x\u0000fCþIù© \u0087 ²¹\u0092\u00122\u001bòO\u0080\u0018\u0086s¿¨\"ê\u0081ú\u001b$!²ð\u000e÷\u0007±\u0007w\u000e6Ý;ü@/ã \u0017v\u0004;¼»äØlÑ \u0015Á÷\u0098^/*ÖÒ÷\u001b\t\u008c.¿@IMß'â\u0016Á&lA\u0086Å¤ÎtB®ÅÄnú\u0019$4E÷¤\u0013\u000fi¼;ÌÍ@Ù\u0007M±«Z\u008cþNàî?4Ç§Á§\u0089òo\u0094#úÏÃ\u0013\t÷\u0097\u0007ð\u0096oäxåÿÐP\u0087§]\u0006â·\u00ad\u001bmÊÞ÷Haó¶\u0099\u0014t£>D.Ö§bÖ\u0004Rs±kÙW§j[Em\u009cçN\u0017#ü¿\u0018¨é\u009e\u0001ºß\u0097é\u0080\u0012k\u00ad-\u000f\u007fzx]hÆO©\u0080<à\tÔ,%Ôÿ¾ò\u0092õlh\u0082½ãe¿PÕ\u0094ó\u008dº1.=§Þ4\u001fl~uµÂBÀÕ\u0080º@zÓÿ0P\u0097\u001eÉeIÎ´æ\u0004\u0012âxX\u009a\"=v]ÕÌvØÙjq$\u000f\u0007\u0083ûÕ\u0012ïõA\u0083\u0081Û\u0019Á\u00028Öp©Z\u001aÊæÔ|\u0080ºí\u009a\u001e\u001bç]W?\u0085\u001e_7\u0097ayÞn{ÿ¿½®\u0005i®&qîë\u007fÙxÌ\u0087îI5C4(\u007fúÙK+¾RÚ%T\u0089/ÚNEkØ!*nv\u0007bî\u008a®\u0017\u0099\u0092P68\u0091v^6j´\fåÜ´\u0084Vv\u001f3\u009e¦\u008b\u0085\u0011v\\²vZ·\u0081\u000b\u001a\u0094\u0091µ\u0087¢\u0090\u009c§PáMïÕÞ6òõÔ.>¤\u008c\u0000°\u008bX5ý\u00943\u0017TBc\u0016\u008c.Eèo\u00131R¯\u0007Xìm_\u001c°\u008b¢¤kTÓó\u000f\u008b³t{\u008e û[\u001d\u009eéË\u000eñPÍ3û\u0015\u0004\u0012\u009cøu\u008b»\u001f\u000f¯¶#\u009ec\u009e\u001bì6ÆI\u0093íjº:1\u0094\u0085Yw?«bÒ\u009dàªÞ©G\u0083LFc7KãsV\u0006\tø´\u000b¥\u000fÅÏû\u001dz´\u007f\u0090³ß\u0005\u0091G¿¼\u008d\u0098½\u009fKS]{\u0007\u0086ï\u009d\u009a\u0001Ó\u0000\u0088á.:ÓÛÁ®CÚï?jDª\u009d\b¤\u0093Lk\u001cä6h G~\u0000C\"z²\u0080\u001bô\u001cÃmVæwÃ\u00adJz¢ÍWÉÃ\u008fÁÙýØY\u0011cÍ\u009d\u0014¾\u0002¼Wé9°,û\nÏßhÐGl\u0083%º\u008cd°1f5\u0019I\u0098Áe\u0006¯±÷Ö\u0084Êß.xÝ¦Lò\u0004ÌÍÍå;%z\u0087ÐPW%MZX5jÖ¡Â0\u0017-²+\u008fÛ&\u0012\u0011ù¥ÚP£BÇ\u0015k¾<M\u0091\u0003\u0089F-\b5(\u0002¹µ¿²\u0084'K\u0098\n<\u0081!ò\u0006ßoº\u0098å\u009e[[\u0093§\u0014\u008bÐ\fä¸î\u009ckÍä`Ôqâ\u0098Hø\b\u00adz\u00840\u0012è~®Dh\r¯Yé\u0018ºkþ\u008c¾}¥àÙ\u001b^~\u0002\t×<L\u0000¤MÃ,µõF\"Pñ\u0098â/\u001d\u0006ßg\u001f§r(\u0084¿ÍxPV(-M*º¡É\u0002\u000b\u009avâ/ãqI²²\u0018\u008a\u0003\u000bÏPê\u009b\u000fÓÍ\u008fÚMÇw×\u000e¼\u0086xÂü»TzÈ\u0097øtu®T\u008f¸ð\u0097\u000eLÀÉm¿\u0012 ^~²\n\u001ch¯e²\u0098râLMé\u0018\u0080\\«ûþ:Óé3ó\u0091ä\u0099q¬íô\u0091\u001e3V>\u0081\u0013µ\bi°\u0095\u0097<¾`[u¼?Ø¬\u0012\u0081RÅÇ\u001bênª,æ\u0001\u008b!·Ð\u0010\u001f\u009dQ¢,3ä\u0014è\u0084\u0091j£ï¨\u009e\u0005ÜA5\u009d\u001f|j¾éÞOo\u0096\u0083=\u0087l"
               .getBytes("ISO-8859-1");
            int var8 = var7.length / 4;
            lI = new int[var8];
            byte var10 = 0;
            int var11 = 0;

            do {
               int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
               var12 ^= var9;
               lI[var11] = var12;
               var10 += 4;
            } while (++var11 < var8);

            String[] var5 = new String[3];
            int var3 = 0;
            String var2;
            int var4 = (var2 = IIlI((char)'莋', (byte)-40, 193605405, (short)29800, (char)'\ueba5')).length();
            int var1 = IIIl(1037774463, var24 ^ 874521267);
            int var0 = -1;

            while (true) {
               char[] var10002;
               label83: {
                  int var28 = IIIl(1037774462, var24 ^ 1754423210);
                  char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                  int var10004 = var10003.length;
                  int var6 = 0;
                  int var34 = var28;
                  var10002 = var10003;
                  int var29 = var10004;
                  char[] var10005;
                  int var10006;
                  if (var10004 <= 1) {
                     var10005 = var10003;
                     var10004 = var28;
                     var10006 = var6;
                  } else {
                     var34 = var28;
                     var29 = var10004;
                     if (var10004 <= var6) {
                        break label83;
                     }

                     var10005 = var10003;
                     var10004 = var28;
                     var10006 = var6;
                  }

                  while (true) {
                     var10005[var10006] = (char)(var10005[var10006] ^ var10004 ^ switch (var6 % IIIl(1037774457, var24 ^ -1366804121)) {
                        case 0 -> IIIl(1037774456, var24 ^ 112499748);
                        case 1 -> IIIl(1037774459, var24 ^ 19901928);
                        case 2 -> IIIl(1037774458, var24 ^ -1470379982);
                        case 3 -> IIIl(1037774453, var24 ^ 1671596146);
                        case 4 -> IIIl(1037774452, var24 ^ -345129557);
                        case 5 -> IIIl(1037774455, var24 ^ -140307930);
                        default -> IIIl(1037774454, var24 ^ -1493990985);
                     });
                     var6++;
                     if (var34 == 0) {
                        var10006 = var34;
                        var10005 = var10002;
                        var10004 = var34;
                     } else {
                        if (var29 <= var6) {
                           break;
                        }

                        var10005 = var10002;
                        var10004 = var34;
                        var10006 = var6;
                     }
                  }
               }

               String var36 = new String(var10002).intern();
               byte var31 = -1;
               var5[var3++] = var36;
               if ((var0 += var1) >= var4) {
                  l = var5;
                  Il = new String[3];
                  II = IlIIllIII.Ill(IlI(IIIl(1037774449, var24 ^ 623320434), IIIl(1037774448, var24 ^ -1658251102)));
                  return;
               }

               var1 = var2.charAt(var0);
            }
         }

         do {
            var19 = var15[var17] ^ var13;
            char[] var21 = var14.substring(var18, var18 + var19).toCharArray();
            int var22 = 0;

            do {
               short var23 = switch (var22 % 5) {
                  default -> 68;
                  case 1 -> 98;
                  case 2 -> 110;
                  case 3 -> 232;
                  case 4 -> 143;
               };
               var21[var22] = (char)(var21[var22] ^ var23);
            } while (++var22 < var21.length);

            var16[var17] = new String(var21).intern();
            var18 += var19;
         } while (++var17 < var15.length);

         var20 = 0;
      }
   }

   public static boolean IIl(UUID var0) {
      String[] var1 = IIllllIl.IIIIl();
      if (var0 == null) {
         return false;
      } else {
         class_310 var2 = class_310.method_1551();
         if (var2.field_1724 != null && llI(var0, var2.field_1724) && I(var2.field_1724.method_7334())) {
            return true;
         } else {
            if (var2.method_1562() != null) {
               class_640 var3 = var2.method_1562().method_2871(var0);
               if (var3 != null && I(var3.method_2966())) {
                  return true;
               }
            }

            if (var2.field_1687 == null) {
               return false;
            } else {
               for (class_1657 var4 : var2.field_1687.method_18456()) {
                  if (llI(var0, var4) && I(var4.method_7334())) {
                     return true;
                  }

                  if (var1 != null) {
                     break;
                  }
               }

               return false;
            }
         }
      }
   }

   private static String IlI(int var0, int var1) {
      int var9 = -889750967;
      int var2 = (var0 ^ IIIl(1037774451, var9 ^ -256175560)) & IIIl(1037774450, var9 ^ -857837296);
      if (Il[var2] == null) {
         char[] var3 = l[var2].toCharArray();

         int var4 = switch (var3[0] & IIIl(1037774445, var9 ^ 882696235)) {
            case 0 -> IIIl(1037774444, var9 ^ 763104219);
            case 1 -> IIIl(1037774447, var9 ^ 2028681894);
            case 2 -> IIIl(1037774446, var9 ^ -246911733);
            case 3 -> IIIl(1037774441, var9 ^ -638706910);
            case 4 -> IIIl(1037774440, var9 ^ -1871580940);
            case 5 -> IIIl(1037774443, var9 ^ 1579740089);
            case 6 -> IIIl(1037774442, var9 ^ 1268411144);
            case 7 -> IIIl(1037774437, var9 ^ 734517443);
            case 8 -> IIIl(1037774436, var9 ^ 1610343741);
            case 9 -> IIIl(1037774439, var9 ^ -77407368);
            case 10 -> IIIl(1037774438, var9 ^ -1028884468);
            case 11 -> IIIl(1037774433, var9 ^ 696692309);
            case 12 -> IIIl(1037774432, var9 ^ 1754213980);
            case 13 -> IIIl(1037774435, var9 ^ -279616727);
            case 14 -> IIIl(1037774434, var9 ^ -1717060666);
            case 15 -> 4;
            case 16 -> IIIl(1037774429, var9 ^ -822190666);
            case 17 -> IIIl(1037774428, var9 ^ 1697889669);
            case 18 -> IIIl(1037774431, var9 ^ -1252394714);
            case 19 -> IIIl(1037774430, var9 ^ 411025764);
            case 20 -> IIIl(1037774425, var9 ^ -157118577);
            case 21 -> IIIl(1037774424, var9 ^ 781406218);
            case 22 -> IIIl(1037774427, var9 ^ -147384003);
            case 23 -> IIIl(1037774426, var9 ^ -1806205243);
            case 24 -> IIIl(1037774421, var9 ^ -817266782);
            case 25 -> IIIl(1037774420, var9 ^ -1743872696);
            case 26 -> IIIl(1037774423, var9 ^ 402397210);
            case 27 -> IIIl(1037774422, var9 ^ 474756179);
            case 28 -> IIIl(1037774417, var9 ^ -1062441705);
            case 29 -> IIIl(1037774416, var9 ^ 774654586);
            case 30 -> IIIl(1037774419, var9 ^ -1338744138);
            case 31 -> IIIl(1037774418, var9 ^ 348684368);
            case 32 -> IIIl(1037774413, var9 ^ -1808141944);
            case 33 -> IIIl(1037774412, var9 ^ 1433802703);
            case 34 -> IIIl(1037774415, var9 ^ 934768196);
            case 35 -> IIIl(1037774414, var9 ^ 2118778191);
            case 36 -> IIIl(1037774409, var9 ^ 736611531);
            case 37 -> IIIl(1037774408, var9 ^ 591895094);
            case 38 -> IIIl(1037774411, var9 ^ -796930603);
            case 39 -> IIIl(1037774410, var9 ^ 689845605);
            case 40 -> IIIl(1037774405, var9 ^ -1586649470);
            case 41 -> IIIl(1037774404, var9 ^ -1995440653);
            case 42 -> 0;
            case 43 -> IIIl(1037774407, var9 ^ -546640245);
            case 44 -> IIIl(1037774406, var9 ^ -1025141777);
            case 45 -> IIIl(1037774401, var9 ^ 784350016);
            case 46 -> IIIl(1037774400, var9 ^ 1863404825);
            case 47 -> IIIl(1037774403, var9 ^ 2058755299);
            case 48 -> IIIl(1037774402, var9 ^ 254752848);
            case 49 -> IIIl(1037774397, var9 ^ -572905094);
            case 50 -> IIIl(1037774396, var9 ^ -1303310713);
            case 51 -> IIIl(1037774399, var9 ^ -1278010288);
            case 52 -> IIIl(1037774398, var9 ^ 1164908322);
            case 53 -> IIIl(1037774393, var9 ^ -93002141);
            case 54 -> IIIl(1037774392, var9 ^ 1902233438);
            case 55 -> IIIl(1037774395, var9 ^ 1666699105);
            case 56 -> IIIl(1037774394, var9 ^ 1503277763);
            case 57 -> IIIl(1037774389, var9 ^ -192469569);
            case 58 -> IIIl(1037774388, var9 ^ -1579863607);
            case 59 -> IIIl(1037774391, var9 ^ -1776166614);
            case 60 -> IIIl(1037774390, var9 ^ 964792052);
            case 61 -> 2;
            case 62 -> IIIl(1037774385, var9 ^ -61036881);
            case 63 -> IIIl(1037774384, var9 ^ 723168328);
            case 64 -> IIIl(1037774387, var9 ^ -1324685491);
            case 65 -> IIIl(1037774386, var9 ^ -1137243715);
            case 66 -> IIIl(1037774381, var9 ^ 1299961126);
            case 67 -> IIIl(1037774380, var9 ^ -391747763);
            case 68 -> IIIl(1037774383, var9 ^ 129779133);
            case 69 -> IIIl(1037774382, var9 ^ -1476530877);
            case 70 -> IIIl(1037774377, var9 ^ -1689743535);
            case 71 -> IIIl(1037774376, var9 ^ 1674059830);
            case 72 -> IIIl(1037774379, var9 ^ 649595374);
            case 73 -> IIIl(1037774378, var9 ^ -952025200);
            case 74 -> IIIl(1037774373, var9 ^ 389857145);
            case 75 -> IIIl(1037774372, var9 ^ -882236783);
            case 76 -> IIIl(1037774375, var9 ^ 1135240254);
            case 77 -> IIIl(1037774374, var9 ^ -2074241353);
            case 78 -> IIIl(1037774369, var9 ^ 22098117);
            case 79 -> IIIl(1037774368, var9 ^ -41460011);
            case 80 -> IIIl(1037774371, var9 ^ 576539251);
            case 81 -> IIIl(1037774370, var9 ^ 751425847);
            case 82 -> IIIl(1037774365, var9 ^ 43097075);
            case 83 -> IIIl(1037774364, var9 ^ -513922642);
            case 84 -> IIIl(1037774367, var9 ^ -2087545933);
            case 85 -> IIIl(1037774366, var9 ^ 234149896);
            case 86 -> IIIl(1037774361, var9 ^ 873613135);
            case 87 -> IIIl(1037774360, var9 ^ 1054150121);
            case 88 -> IIIl(1037774363, var9 ^ 1553335912);
            case 89 -> IIIl(1037774362, var9 ^ 1323901075);
            case 90 -> IIIl(1037774357, var9 ^ -1208768772);
            case 91 -> IIIl(1037774356, var9 ^ 1680236477);
            case 92 -> IIIl(1037774359, var9 ^ 2007902419);
            case 93 -> IIIl(1037774358, var9 ^ 855081982);
            case 94 -> IIIl(1037774353, var9 ^ 353350841);
            case 95 -> IIIl(1037774352, var9 ^ -322212555);
            case 96 -> IIIl(1037774355, var9 ^ -1502445099);
            case 97 -> IIIl(1037774354, var9 ^ -231339012);
            case 98 -> IIIl(1037774349, var9 ^ -52637675);
            case 99 -> IIIl(1037774348, var9 ^ 63315404);
            case 100 -> IIIl(1037774351, var9 ^ 27882313);
            case 101 -> IIIl(1037774350, var9 ^ -1349567897);
            case 102 -> IIIl(1037774345, var9 ^ 1395019487);
            case 103 -> IIIl(1037774344, var9 ^ 1272474825);
            case 104 -> IIIl(1037774347, var9 ^ 1224607596);
            case 105 -> IIIl(1037774346, var9 ^ -1287891483);
            case 106 -> IIIl(1037774341, var9 ^ 87874859);
            case 107 -> IIIl(1037774340, var9 ^ -1349031556);
            case 108 -> IIIl(1037774343, var9 ^ 2130959398);
            case 109 -> IIIl(1037774342, var9 ^ -1345000594);
            case 110 -> IIIl(1037774337, var9 ^ -2092967516);
            case 111 -> IIIl(1037774336, var9 ^ -1021523825);
            case 112 -> IIIl(1037774339, var9 ^ 1579862046);
            case 113 -> 1;
            case 114 -> IIIl(1037774338, var9 ^ 2128132158);
            case 115 -> IIIl(1037774589, var9 ^ 912099303);
            case 116 -> IIIl(1037774588, var9 ^ 729648589);
            case 117 -> IIIl(1037774591, var9 ^ -416492054);
            case 118 -> IIIl(1037774590, var9 ^ 1761804390);
            case 119 -> IIIl(1037774585, var9 ^ 605842144);
            case 120 -> IIIl(1037774584, var9 ^ -1916126552);
            case 121 -> IIIl(1037774587, var9 ^ 1436950401);
            case 122 -> IIIl(1037774586, var9 ^ -1231329116);
            case 123 -> IIIl(1037774581, var9 ^ 1989083414);
            case 124 -> IIIl(1037774580, var9 ^ -1260960122);
            case 125 -> IIIl(1037774583, var9 ^ 1378549368);
            case 126 -> IIIl(1037774582, var9 ^ -1923372374);
            case 127 -> IIIl(1037774577, var9 ^ 1379610030);
            case 128 -> IIIl(1037774576, var9 ^ 1462280919);
            case 129 -> IIIl(1037774579, var9 ^ -1005146010);
            case 130 -> IIIl(1037774578, var9 ^ -679933686);
            case 131 -> IIIl(1037774573, var9 ^ -361542295);
            case 132 -> 3;
            case 133 -> IIIl(1037774572, var9 ^ -887840257);
            case 134 -> IIIl(1037774575, var9 ^ 1379091733);
            case 135 -> IIIl(1037774574, var9 ^ 1983806014);
            case 136 -> IIIl(1037774569, var9 ^ -1172946451);
            case 137 -> IIIl(1037774568, var9 ^ -280096290);
            case 138 -> IIIl(1037774571, var9 ^ 887284664);
            case 139 -> IIIl(1037774570, var9 ^ -400761009);
            case 140 -> IIIl(1037774565, var9 ^ -1363676523);
            case 141 -> IIIl(1037774564, var9 ^ 185973036);
            case 142 -> IIIl(1037774567, var9 ^ 119611061);
            case 143 -> IIIl(1037774566, var9 ^ -1781646510);
            case 144 -> IIIl(1037774561, var9 ^ -1838470435);
            case 145 -> IIIl(1037774560, var9 ^ -545152784);
            case 146 -> IIIl(1037774563, var9 ^ -768780787);
            case 147 -> IIIl(1037774562, var9 ^ 376653103);
            case 148 -> IIIl(1037774557, var9 ^ 1844955795);
            case 149 -> IIIl(1037774556, var9 ^ 109955852);
            case 150 -> IIIl(1037774559, var9 ^ 1714738636);
            case 151 -> IIIl(1037774558, var9 ^ 1679233789);
            case 152 -> IIIl(1037774553, var9 ^ -2064424999);
            case 153 -> IIIl(1037774552, var9 ^ 907395706);
            case 154 -> IIIl(1037774555, var9 ^ 176738624);
            case 155 -> IIIl(1037774554, var9 ^ -139294320);
            case 156 -> IIIl(1037774549, var9 ^ 405150333);
            case 157 -> IIIl(1037774548, var9 ^ 917975610);
            case 158 -> IIIl(1037774551, var9 ^ 1930777270);
            case 159 -> IIIl(1037774550, var9 ^ 1254372035);
            case 160 -> IIIl(1037774545, var9 ^ 1035874970);
            case 161 -> IIIl(1037774544, var9 ^ -1628022168);
            case 162 -> IIIl(1037774547, var9 ^ -67966244);
            case 163 -> IIIl(1037774546, var9 ^ -1032043343);
            case 164 -> IIIl(1037774541, var9 ^ -1260470728);
            case 165 -> IIIl(1037774540, var9 ^ 438637455);
            case 166 -> IIIl(1037774543, var9 ^ 2068123567);
            case 167 -> IIIl(1037774542, var9 ^ 436705701);
            case 168 -> IIIl(1037774537, var9 ^ 609222724);
            case 169 -> IIIl(1037774536, var9 ^ -1169832582);
            case 170 -> IIIl(1037774539, var9 ^ 1737155621);
            case 171 -> IIIl(1037774538, var9 ^ 816966159);
            case 172 -> IIIl(1037774533, var9 ^ 578983493);
            case 173 -> IIIl(1037774532, var9 ^ -1319624960);
            case 174 -> IIIl(1037774535, var9 ^ 1521345275);
            case 175 -> IIIl(1037774534, var9 ^ -1120376608);
            case 176 -> IIIl(1037774529, var9 ^ -326036554);
            case 177 -> IIIl(1037774528, var9 ^ 418209714);
            case 178 -> IIIl(1037774531, var9 ^ 1753190208);
            case 179 -> IIIl(1037774530, var9 ^ 324499372);
            case 180 -> IIIl(1037774525, var9 ^ 70129336);
            case 181 -> IIIl(1037774524, var9 ^ -582708056);
            case 182 -> IIIl(1037774527, var9 ^ 1018396025);
            case 183 -> IIIl(1037774526, var9 ^ 1582827999);
            case 184 -> IIIl(1037774521, var9 ^ -54198145);
            case 185 -> IIIl(1037774520, var9 ^ -320696468);
            case 186 -> IIIl(1037774523, var9 ^ 465063626);
            case 187 -> IIIl(1037774522, var9 ^ 1805899313);
            case 188 -> 5;
            case 189 -> IIIl(1037774517, var9 ^ -6666215);
            case 190 -> IIIl(1037774516, var9 ^ 2085751237);
            case 191 -> IIIl(1037774519, var9 ^ -1689301765);
            case 192 -> IIIl(1037774518, var9 ^ 1739854946);
            case 193 -> IIIl(1037774513, var9 ^ -637460672);
            case 194 -> IIIl(1037774512, var9 ^ -776113818);
            case 195 -> IIIl(1037774515, var9 ^ 1614669530);
            case 196 -> IIIl(1037774514, var9 ^ 1571754564);
            case 197 -> IIIl(1037774509, var9 ^ -743122109);
            case 198 -> IIIl(1037774508, var9 ^ 730760915);
            case 199 -> IIIl(1037774511, var9 ^ 1662041143);
            case 200 -> IIIl(1037774510, var9 ^ -2100049342);
            case 201 -> IIIl(1037774505, var9 ^ -855406568);
            case 202 -> IIIl(1037774504, var9 ^ 1026602763);
            case 203 -> IIIl(1037774507, var9 ^ -1304052214);
            case 204 -> IIIl(1037774506, var9 ^ 234470220);
            case 205 -> IIIl(1037774501, var9 ^ -1854910140);
            case 206 -> IIIl(1037774500, var9 ^ -1559467601);
            case 207 -> IIIl(1037774503, var9 ^ 838268009);
            case 208 -> IIIl(1037774502, var9 ^ -1316620583);
            case 209 -> IIIl(1037774497, var9 ^ 814800978);
            case 210 -> IIIl(1037774496, var9 ^ 654632866);
            case 211 -> IIIl(1037774499, var9 ^ 2087223500);
            case 212 -> IIIl(1037774498, var9 ^ -2013897851);
            case 213 -> IIIl(1037774493, var9 ^ 246682687);
            case 214 -> IIIl(1037774492, var9 ^ 2110101834);
            case 215 -> IIIl(1037774495, var9 ^ 1820138622);
            case 216 -> IIIl(1037774494, var9 ^ -1988509415);
            case 217 -> IIIl(1037774489, var9 ^ -157982884);
            case 218 -> IIIl(1037774488, var9 ^ -1097335133);
            case 219 -> IIIl(1037774491, var9 ^ -250812883);
            case 220 -> IIIl(1037774490, var9 ^ -1579675663);
            case 221 -> IIIl(1037774485, var9 ^ -188386513);
            case 222 -> IIIl(1037774484, var9 ^ 2017549218);
            case 223 -> IIIl(1037774487, var9 ^ 1140767648);
            case 224 -> IIIl(1037774486, var9 ^ 989401335);
            case 225 -> IIIl(1037774481, var9 ^ 1804653513);
            case 226 -> IIIl(1037774480, var9 ^ -767096488);
            case 227 -> IIIl(1037774483, var9 ^ 1116179073);
            case 228 -> IIIl(1037774482, var9 ^ 1448219741);
            case 229 -> IIIl(1037774477, var9 ^ -1369484077);
            case 230 -> IIIl(1037774476, var9 ^ 1609603302);
            case 231 -> IIIl(1037774479, var9 ^ 1658594175);
            case 232 -> IIIl(1037774478, var9 ^ 1315974236);
            case 233 -> IIIl(1037774473, var9 ^ 2010961314);
            case 234 -> IIIl(1037774472, var9 ^ 689919053);
            case 235 -> IIIl(1037774475, var9 ^ 423704512);
            case 236 -> IIIl(1037774474, var9 ^ -878181356);
            case 237 -> IIIl(1037774469, var9 ^ 1803699632);
            case 238 -> IIIl(1037774468, var9 ^ 1995303804);
            case 239 -> IIIl(1037774471, var9 ^ -1419111312);
            case 240 -> IIIl(1037774470, var9 ^ 814799104);
            case 241 -> IIIl(1037774465, var9 ^ 1920181822);
            case 242 -> IIIl(1037774464, var9 ^ 174156354);
            case 243 -> IIIl(1037774467, var9 ^ 1215086801);
            case 244 -> IIIl(1037774466, var9 ^ 1969597599);
            case 245 -> IIIl(1037774717, var9 ^ -944041993);
            case 246 -> IIIl(1037774716, var9 ^ 1486613805);
            case 247 -> IIIl(1037774719, var9 ^ -1338454656);
            case 248 -> IIIl(1037774718, var9 ^ -449430593);
            case 249 -> IIIl(1037774713, var9 ^ -1405852570);
            case 250 -> IIIl(1037774712, var9 ^ 1973082257);
            case 251 -> IIIl(1037774715, var9 ^ 474956758);
            case 252 -> IIIl(1037774714, var9 ^ -1222478627);
            case 253 -> IIIl(1037774709, var9 ^ -670860845);
            case 254 -> IIIl(1037774708, var9 ^ 160974746);
            default -> IIIl(1037774711, var9 ^ -2010483625);
         };
         int var5 = (var1 & IIIl(1037774710, var9 ^ 1033679670)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & IIIl(1037774705, var9 ^ 1222962010)) >>> IIIl(1037774704, var9 ^ 1897291121)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & IIIl(1037774707, var9 ^ -1732393304);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & IIIl(1037774706, var9 ^ -1511856801);
            }
         }

         Il[var2] = new String(var3).intern();
      }

      return Il[var2];
   }

   public static class_2561 Ill(GameProfile var0, class_2561 var1) {
      return var1;
   }

   public static class_2561 lII(class_1657 var0, class_2561 var1) {
      if (var0 == null) {
         return var1;
      } else {
         return lll(var0) ? var1 : Ill(var0.method_7334(), var1);
      }
   }

   public static boolean lIl(Object param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: aload 0
      // 01: ifnonnull 0a
      // 04: bipush 0
      // 05: ireturn
      // 06: invokestatic k74/x/IIIIIIlI.Il (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09: athrow
      // 0a: getstatic k74/x/IIIIIIlI.I Ljava/lang/reflect/Field;
      // 0d: ifnull 24
      // 10: getstatic k74/x/IIIIIIlI.I Ljava/lang/reflect/Field;
      // 13: invokevirtual java/lang/reflect/Field.getDeclaringClass ()Ljava/lang/Class;
      // 16: aload 0
      // 17: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 1a: if_acmpeq 5c
      // 1d: goto 24
      // 20: invokestatic k74/x/IIIIIIlI.Il (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: aload 0
      // 25: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 28: ldc_w 1037774701
      // 2b: ldc_w 1265050
      // 2e: ldc_w -853284998
      // 31: ixor
      // 32: invokestatic k74/x/IIIIIIlI.IIIl (II)I
      // 35: ldc_w 1037774700
      // 38: ldc_w 1265050
      // 3b: ldc_w -1873722246
      // 3e: ixor
      // 3f: invokestatic k74/x/IIIIIIlI.IIIl (II)I
      // 42: invokestatic k74/x/IIIIIIlI.IlI (II)Ljava/lang/String;
      // 45: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 48: invokevirtual java/lang/Class.getDeclaredField (Ljava/lang/String;)Ljava/lang/reflect/Field;
      // 4b: putstatic k74/x/IIIIIIlI.I Ljava/lang/reflect/Field;
      // 4e: getstatic k74/x/IIIIIIlI.I Ljava/lang/reflect/Field;
      // 51: bipush 1
      // 52: invokevirtual java/lang/reflect/Field.setAccessible (Z)V
      // 55: goto 5c
      // 58: invokestatic k74/x/IIIIIIlI.Il (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5b: athrow
      // 5c: getstatic k74/x/IIIIIIlI.I Ljava/lang/reflect/Field;
      // 5f: aload 0
      // 60: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 63: astore 1
      // 64: aload 1
      // 65: instanceof net/minecraft/class_1657
      // 68: ifeq 82
      // 6b: aload 1
      // 6c: checkcast net/minecraft/class_1657
      // 6f: astore 2
      // 70: aload 2
      // 71: invokevirtual net/minecraft/class_1657.method_7334 ()Lcom/mojang/authlib/GameProfile;
      // 74: invokestatic k74/x/IIIIIIlI.I (Lcom/mojang/authlib/GameProfile;)Z
      // 77: ifeq 82
      // 7a: bipush 1
      // 7b: goto 83
      // 7e: invokestatic k74/x/IIIIIIlI.Il (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 81: athrow
      // 82: bipush 0
      // 83: ireturn
      // 84: astore 1
      // 85: bipush 0
      // 86: ireturn
   }

   private static boolean llI(UUID var0, class_1657 var1) {
      if (var1 == null) {
         return false;
      } else if (var0.equals(var1.method_5667())) {
         return true;
      } else {
         UUID var2 = lIlIIIll.l(var1.method_7334());
         return var2 != null && var0.equals(var2);
      }
   }

   private static boolean lll(class_1657 var0) {
      return var0 != null && lI() && llI(var0.method_5667(), var0) && IIII(var0);
   }

   private static String IIlI(char var0, byte var1, int var2, short var3, char var4) {
      int var9 = var2 ^ 193605405;
      char[] var8 = ll[var9].toCharArray();
      StackTraceElement[] var10 = (StackTraceElement[])III[var9];
      StackTraceElement[] var11;
      if (var10 != null) {
         var11 = var10;
      } else {
         var11 = new Throwable().getStackTrace();
         III[var9] = var11;
      }

      StackTraceElement var12 = var11[1];
      int var6 = (var12.getClassName().hashCode() ^ var12.getMethodName().hashCode()) >> 16 ^ 59101;

      for (int var7 = 0; var7 < var8.length; var7++) {
         var8[var7] = (char)(var8[var7] ^ switch (var7 % 18) {
            default -> 0;
            case 1 -> 134;
            case 2 -> 38;
            case 3 -> 79;
            case 4 -> 14;
            case 5 -> 204;
            case 6 -> 92;
            case 7 -> 238;
            case 8 -> 134;
            case 9 -> 169;
            case 10 -> 41;
            case 11 -> 173;
            case 12 -> 69;
            case 13 -> 135;
            case 14 -> 186;
            case 15 -> 177;
            case 16 -> 253;
            case 17 -> 92;
         } ^ var7 ^ var1 ^ var0 ^ var4 ^ var3 ^ var2 ^ var6);
      }

      return new String(var8).intern();
   }

   private static boolean IIII(class_1657 var0) {
      class_310 var1 = class_310.method_1551();
      return var1.field_1724 != null && llI(var0.method_5667(), var1.field_1724);
   }
}
