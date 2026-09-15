package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1511;
import net.minecraft.class_1661;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3965;
import net.minecraft.class_3966;
import net.minecraft.class_5134;
import net.minecraft.class_746;
import net.minecraft.class_1297.class_5529;
import net.minecraft.class_239.class_240;

@Environment(EnvType.CLIENT)
public final class IIlllIIlI extends IlIIIIIIl {
   private boolean II;
   private boolean Il;
   private class_2350 lI;
   private boolean ll;
   private class_2338 III;
   private int IIl;
   private final IllIII<IlIlIII> IlI;
   private class_243 Ill;
   private static final String[] lII;
   private boolean lIl;
   private boolean llI;
   private boolean lll;
   private static final int[] IlIl;
   private final lllIIlII IIII;
   private int IIIl;
   private static String[] IIlI;
   private static final String[] IllI;
   private class_239 I;
   private static final Object[] Illl;
   private boolean IIll;
   private static final String[] IlII;

   private int I(class_1661 var1, class_1792 var2) {
      if (var1 != null && var2 != null) {
         for (int var3 = 0; var3 < lIIIl(-1860583483, -1329286788 ^ 374655700); var3++) {
            if (var1.method_5438(var3).method_31574(var2)) {
               return var3;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   private boolean II(class_310 var1) {
      return var1 != null
         && var1.field_1690 != null
         && var1.field_1690.field_1886 != null
         && (k74.x.IIll.IlIllll(var1, var1.field_1690.field_1886) || var1.field_1690.field_1886.method_1434());
   }

   private void Il(class_310 var1) {
      if (var1 != null) {
         var1.field_1765 = this.I;
      }

      this.I = null;
      this.IIll = false;
      this.Il = false;
   }

   @Override
   public void IlIlI(class_1297 var1) {
      String[] var2 = IIllllIl.IIIIl();
      if (var1 instanceof class_1511 var3 && var2 == null) {
         class_310 var4 = class_310.method_1551();
         if (var4 != null && !var4.method_1542() && !var3.method_31481()) {
            if (this.lI(var4.field_1724, class_1802.field_8301) && IIIll(var4.field_1724)) {
               this.IIl = var4.field_1724.field_6012;
               var3.method_5650(class_5529.field_26998);
               var3.method_36209();
            }
         }
      }
   }

   private boolean lI(class_746 var1, class_1792 var2) {
      return var1 != null && !var1.method_6047().method_7960() && var1.method_6047().method_31574(var2);
   }

   private void ll(class_310 var1) {
      if (var1 != null && var1.field_1690 != null) {
         k74.x.IIll.IlllIIl(var1, 1);
         this.II = true;
         if (var1.field_1690.field_1886 != null) {
            k74.x.IIll.lIIIIlI(var1.field_1690.field_1886);
         }
      }
   }

   private static String lIIlI(char var0, int var1, int var2) {
      int var3 = var0 ^ 4376;
      char[] var4 = IllI[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])Illl[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         Illl[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 30972;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ 'ꤼ';
         var10 -= 40318;
         var10 += 33068;
         var10 ^= 3362;
         var10 ^= 43060;
         var10 -= 32414;
         var10 += 46949;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var1 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private boolean l(class_310 var1) {
      return this.II(var1) || this.Illll(var1);
   }

   private void III() {
      this.III = null;
      this.lI = null;
      this.Ill = null;
   }

   private boolean IIl(class_2338 var1, class_310 var2) {
      return var2 != null && var2.field_1687 != null
         ? var2.field_1687.method_8320(var1).method_27852(class_2246.field_10540) || var2.field_1687.method_8320(var1).method_27852(class_2246.field_9987)
         : false;
   }

   @Override
   public void IlIII() {
      this.IlII();
      this.III();
      this.IIl = lIIIl(-1860583484, -725122129 ^ 257731968);
   }

   private class_243 Ill(class_2338 var1, class_2350 var2) {
      class_2350 var3 = var2 == null ? class_2350.field_11036 : var2;
      return new class_243(
         var1.method_10263() + 0.5 + var3.method_10148() * 0.5,
         var1.method_10264() + 0.5 + var3.method_10164() * 0.5,
         var1.method_10260() + 0.5 + var3.method_10165() * 0.5
      );
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var18 = 182721691;
      char[] var10001 = "䋟䊗".toCharArray();
      byte var14 = -1;
      char[] var9 = var10001;
      String var8 = "眍\uf496\ufded㨷쓀\u197e➺ꚓ쓌泌鵛ｿ᰾껜꿋᪫Ꮒ\udfb7\udc17潻辪攄ᴌ\uf4a4컮ﵸ甉\uf026䂕㒄鞾∠쬲팛챣닞랢ﰽੌ老쩔樇棩ಔ띑잆冱䀘㞕侃到Ւ遐⪪턱榲裤\ud94bᗜ⟽潑兗쑗ड\ueb2f잺邲\ue6a0杅얽梸Ựᚅ\uf56f봩謗砞\u17ea沎酜㇊㖮៱\ue8c9\ude1eﴎ螊ꋳ腚\ueba7\uefd3㐲㟧࿏\uf6a5族訒\u0efc湿ࡵ\u18ff\uda35葦ᕵ募墌欴㫲舸㻧楣溟㽐䲗敟Ẁ耭\ued35댑糢갤\u10c8\uf8d6槜\uf608\uf274렬ꐹ娯薭ﱙ엏\ue60e脯⺑⢴窮䱁摗ꖼ뫈例읝岸ꈺ\ue2db葤ါዳ\ud801鷞㘪\ue072礞ҟ\uecd0뭩\u1fd5샰兲ꎚ뻿턽䓍踱⇝␙㚮솬屘";
      short var7 = 17134;
      String[] var10 = new String[var9.length];

      while (true) {
         int var11 = 0;
         int var12 = 0;
         int var13 = 0;
         if (var14 == 0) {
            IllI = var10;
            Illl = new Object[var10.length];
            int var22 = 0;
            byte var25 = 0;
            byte[] var10002 = "~;\u0080$\u00830Õ© ½\n>±¥a\u0007=\u008a5 \u001b%\u0011ó|\u0093ã \u008dÊ\u007f©«ù]ú\u009c-A\u0011\u001bn\u0006oCÐí1\u009aÊ_\u008bT»ë\u0099ïÓ×íéh8~xg³c!Z\u0017\u0090\u0088É2´þûÉà\u009bU%]â×%7Qp\u001d¬J\u0085\u009b»e½\u001c¡'·Æ¹Ü\u0003\u000bR\u0018\u0099\u0082\u001eíÌ¬â>ÒýÍñS¾/\u0096õÁæHÚ\u009d©\u009f3\u001e¼ß¬¥\u0096\u0098ð\u009c>m\u009f¤\u0011.YQfz\u000f¥lséáØ\u0014øã\u009fÖ¡)\u0095ñª\u0093 ï\u0081\u001d\u0083\u0005\u0015\u001bÎ_ÿ\u0088vk¦¾\u008fð\u0085bRÿ\u008b0ÀÌË^\u0082<á9-ÖÇ&¬æ®<+÷ºyO³ÉîE\f@-Ó!fä~34JÄ;ã\u0097}].JSÜ¶\u0010åS^¬nÁ\u001eÕz\u0091\u0091À\"\u001f\u0092\u0088yÐQ\u0013¾È\u0011\u009e\u0082\f\u0092zÛ\u008f0âí\u008aFcÔÍ\u0017É°ËùàðtÐ\u0005u\u00ad9_ãz=\u009evÞäD©ÿ1\npUþ\u0016NÅ!Ý½E\u0082AcåI¼+\u001d\u008dÆhWÇÁÜ³áyÄE®êOÓJ\u0084\u000f8$\u0080À\u008fü7h\u008e\u008bÄ7Ç,\u009eé\u0096V\u0091ô¸\u0083¸#Þ\"?\u0007\u000eãÆ\u000fI¤,»0\u001f.k/Ê÷\u001a\u0005\nW©y\u008dTÈg\u009d4&$5U\u0014·\bÂ\u0011`\u0017 \u008dÓ¿\u001a!\u0087\u0084\u0093³*¾\u0014\u0016Û#ÒÜ9e\u0082(\u0019Ý\u008c\u0096çf\u0087\u008dê\n@ºì\u009d\u0089<\u0092Òw\u008dïG\u008b¨Ì\u001fÚV³\u00843UýxÍ³:¬Äq¡ZAÄ0&£V²\u00ade\u001c(Ý#(Þ´\u0089Á\u0098£e÷À2mP\u008bäÅ¬\u008cï\u009b .y\u001a3TáÄ\u0097\u009b¿²qSb\u0085\b\u0010+tÕÿ\rk¡Ü\u001dál¤\u000e\u008bþ7±$kD2K|þ§®\u0091Ã\u0089\u008a!0îP¬\u008boû/\u0086\f°\rî\u008b×Õ&+U\u009e\b±*\u0006º\r\"ó®Åþ¥\u0083×.ö\u008cÀ\u008e\u00947gd\u00adðfV\u001eÆ{9Ü=5PN¬-\u009f9¾Â 1\u0084\u009bÕ\u0090;û4#\u0098\fê\u0086\u0007\u009d¿BÀ³rØ\\¾\u009cìã\r\u009b\u001b\u008cAx\u009f&\u0092@Fr\u001d?\u0088\u001f\u0081í\u008f©è>\u0085~#¯KWßMÁüMjF\u0015kqá±jc\u000enYkçÒ\u0086W\u0093H¤\u0087@\n^ÿMÓ\u0092\u001fÄ{?\u009b7æ'IHÿ!¶åp¡:ôÏZ\u001c\u0084È´\u0017\u0085¹Tç\u0098Sÿ)ì¸·9\b£PT-¸Ê\u0088×g+ÉLo\u000e\u0019óúØ\tºþ\u009a\u0085e\u0017\u007f\u008eªÝ\u0092=ø+l\u0087z´\fÛòh\n{;wE\u0080\u0081?Ã&\u0005@\u0003ðB\u000eÐ*u6âXF\u0090W\u0011W¸´\u008aÙ0¦ñ\u009e8\u0000\u0018\u0011á{\u008dgÍâ\u0019Ú·¬ +Í\u0091t÷g\n\fM9\u000edê¦\u000fGÆ\u0006Z~LêÓ8\u000e=>\u0002\u009b\u009a¤báÝé6K\u008dGå$©¹¶\u0001\u0011|¹s\u009fÃ?\u0019\fðg,Þ\u0095É\u0082¼\u0092\u0001\u009b\u0087(øl8\u0089\u0081\u000f}¤ËÚ\u0092\u0007\u0090í\u000eO>²£ú\u0004þ\u0083-\u0097\u0092\u0089\u001d\u008e\f\u001evwès\u009cÒÅ_*;dä¹\u008bµ©BÂàÖ\u000bNwâY1É\u0012æ\u0018\u0002m\u0013Ù5r]ê\"¬\u0010\u0014IpiÙ\u0011\u000f÷WüHOD7\u009c\u0007äC´( $\u0012sÙ`(\u008e\u001a\u0090ã\u0084\u001bF$Y\u0006@\u001a\u0005m\u000bÊé² l#\u0015Y\t;Yl\u001fm©DOv\u0014C\u009debMSE\u0089V\u0083=î)¹\u0003å\u008eO\f#ygÀEPh}plæëª`Ì\r\u0014\u0014\u001a¤\u0094´aÒ\u0098\u001fÌg«À\u008aÝæ\t5ÕPÛhS\u0092ûcT¢\u0003¢2+\u0019sUHù'ô\u000b\u0012ÙÌ¹\u0011º0DÛrl¶&\tç[Hô\u000e\u0082©\u008b¯¾Ëþ\u007fÎ\u007f4eÈ«Ð>bDUÓs\u001e9\u008cT#\u0089¸ÑûUÍï`\u0097Mì5"
               .getBytes("ISO-8859-1");
            IlIl = new int[292];

            int var56;
            do {
               IlIl[var22] = ((var10002[var25] & 255) << 24 | (var10002[var25 + 1] & 255) << 16 | (var10002[var25 + 2] & 255) << 8 | var10002[var25 + 3] & 255)
                  ^ 1236494722;
               var22 += 1;
               var56 = var25 + 4;
               var25 += 4;
            } while (var56 < var10002.length);

            String[] var5 = new String[4];
            int var3 = 0;
            String var2;
            int var4 = (var2 = lIIlI('ᄘ', var18 ^ 958616017, 45603)).length();
            int var1 = lIIIl(-1860583715, var18 ^ -1608298026);
            int var20 = -1;

            label104:
            while (true) {
               var22 = lIIIl(-1860583716, var18 ^ -609698575);
               String var28 = var2.substring(++var20, var20 + var1);
               byte var40 = -1;

               while (true) {
                  label99: {
                     char[] var58 = var28.toCharArray();
                     int var70 = var58.length;
                     int var6 = 0;
                     var56 = var22;
                     var45 = var58;
                     int var33 = var70;
                     char[] var82;
                     int var89;
                     if (var70 <= 1) {
                        var82 = var58;
                        var70 = var22;
                        var89 = var6;
                     } else {
                        var56 = var22;
                        var33 = var70;
                        if (var70 <= var6) {
                           break label99;
                        }

                        var82 = var58;
                        var70 = var22;
                        var89 = var6;
                     }

                     while (true) {
                        var82[var89] = (char)(var82[var89] ^ var70 ^ switch (var6 % lIIIl(-1860583719, var18 ^ 741353590)) {
                           case 0 -> lIIIl(-1860583720, var18 ^ -433443014);
                           case 1 -> lIIIl(-1860583717, var18 ^ 40994294);
                           case 2 -> lIIIl(-1860583718, var18 ^ -2019781412);
                           case 3 -> lIIIl(-1860583707, var18 ^ -339495944);
                           case 4 -> lIIIl(-1860583708, var18 ^ 1542927956);
                           case 5 -> lIIIl(-1860583705, var18 ^ -2021521279);
                           default -> lIIIl(-1860583706, var18 ^ 1157761941);
                        });
                        var6++;
                        if (var56 == 0) {
                           var89 = var56;
                           var82 = var45;
                           var70 = var56;
                        } else {
                           if (var33 <= var6) {
                              break;
                           }

                           var82 = var45;
                           var70 = var56;
                           var89 = var6;
                        }
                     }
                  }

                  String var63 = new String(var45).intern();
                  switch (var40) {
                     case 0:
                        var5[var3++] = var63;
                        if ((var20 += var1) >= var4) {
                           IlII = var5;
                           lII = new String[4];
                           IIlI = new String[4];
                           IIIlI();
                           return;
                        }

                        var1 = var2.charAt(var20);
                        break;
                     default:
                        var5[var3++] = var63;
                        if ((var20 += var1) < var4) {
                           var1 = var2.charAt(var20);
                           continue label104;
                        }

                        var4 = (var2 = lIIlI('ᄙ', var18 ^ 1771973181, 11601)).length();
                        var1 = lIIIl(-1860583713, var18 ^ 641819815);
                        var20 = -1;
                  }

                  var22 = lIIIl(-1860583714, var18 ^ 1507875123);
                  var28 = var2.substring(++var20, var20 + var1);
                  var40 = 0;
               }
            }
         }

         do {
            var13 = var9[var11] ^ var7;
            char[] var15 = var8.substring(var12, var12 + var13).toCharArray();
            int var16 = 0;

            do {
               short var17 = switch (var16 % 6) {
                  default -> 126;
                  case 1 -> 221;
                  case 2 -> 189;
                  case 3 -> 201;
                  case 4 -> 18;
                  case 5 -> 249;
               };
               var15[var16] = (char)(var15[var16] ^ var17);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   private boolean lII(class_310 var1) {
      return var1 != null && var1.field_1724 != null && (this.IlI.IllI() == IlIlIII.III || var1.field_1724.field_6012 > this.IIl);
   }

   private boolean lIl(class_310 var1) {
      if (this.ll) {
         return false;
      } else if (var1 != null && var1.field_1690 != null && var1.field_1690.field_1886 != null) {
         boolean var2 = this.II(var1);
         boolean var3 = k74.x.IIll.IIIIIlI(var1.field_1690.field_1886) > 0;
         boolean var4 = var3 || var2 && !this.llI;
         this.llI = var2;
         if (!var2 && !var3) {
            this.ll = false;
         }

         return var4;
      } else {
         return false;
      }
   }

   @Override
   public void lllIlI(class_1297 var1, byte var2) {
      if (this.IlllI(var1, var2)) {
         class_310 var3 = class_310.method_1551();
         this.Il(var3);
         k74.x.IIll.lllIl(var3, this, lllIII.II);
         this.IlII();
         this.III();
      }
   }

   public boolean llI(class_2338 var1, class_2350 var2) {
      class_310 var3 = class_310.method_1551();
      if (this.IIIIlIl() && this.IIlII(var3) && var1 != null && var2 != null && this.IIl(var1, var3)) {
         var3.field_1761.method_2925();
         if (!this.lIl(var3)) {
            return true;
         } else if (!this.lI(var3.field_1724, class_1802.field_8301)) {
            return this.IIIII(var3);
         } else {
            if (this.lIIl(var3, var1, var2)) {
               this.IllII(var3);
               k74.x.IIll.llIllI(var3, this, 0);
            }

            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public void llIIII(class_310 var1) {
      if (this.IIll) {
         this.Il(var1);
      }
   }

   public boolean lll(class_310 var1) {
      if (!this.IIIIlIl() || !this.IIlII(var1) || this.Il) {
         return false;
      } else if (this.lI(var1.field_1724, class_1802.field_8301) && var1.field_1690 != null) {
         boolean var2 = this.II(var1);
         boolean var3 = this.Illll(var1);
         return var2 && var3 ? true : var3 && this.IIIIl(var1);
      } else {
         return false;
      }
   }

   private boolean IIII(class_310 var1, class_2338 var2, class_2350 var3) {
      return this.IIIIlIl() && this.IIlII(var1) && var2 != null && var3 != null
         ? this.lI(var1.field_1724, class_1802.field_8301) && this.IIl(var2, var1)
         : false;
   }

   private void IIIl(class_2338 var1, class_2350 var2, class_243 var3) {
      if (var1 != null && var2 != null) {
         this.III = var1.method_10062();
         this.lI = var2;
         this.Ill = var3;
      }
   }

   private void IIlI(class_310 var1) {
      if (var1 != null && var1.field_1690 != null && var1.field_1690.field_1904 != null) {
         k74.x.IIll.IlIll(var1);
         k74.x.IIll.lIIIIlI(var1.field_1690.field_1904);
         var1.field_1690.field_1904.method_23481(false);
      }
   }

   private void IIll(class_310 var1) {
      boolean var2 = this.II(var1);
      if (!var2) {
         this.ll = false;
         this.llI = false;
      }
   }

   @Override
   public void llIl() {
      this.Il(class_310.method_1551());
      this.IlII();
      this.III();
      this.IIl = lIIIl(-1860583481, -269620490 ^ 402332493);
   }

   private void IlII() {
      if (this.II) {
         k74.x.IIll.lllIIl(class_310.method_1551());
         this.II = false;
      }

      this.IIll = false;
      this.Il = false;
      this.I = null;
      this.lll = false;
      this.IIIl = lIIIl(-1860583482, -1000718977 ^ 760522748);
      this.ll = false;
      this.llI = false;
   }

   private static int lIIIl(int var0, int var1) {
      int var2 = IlIl[var0 ^ -1860583483] ^ var1 ^ var0;
      var2 ^= 32561;
      var2 += 65124;
      var2 -= 47109;
      var2 -= 7657;
      var2 -= 41459;
      var2 -= 13320;
      return var2 - 42348;
   }

   private static String IlIl(char[] var0, long var1, int var3) {
      int var4 = lIIIl(-1860583487, 1080457643 ^ -1707774512) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & lIIIl(-1860583488, 1080457643 ^ -2081910053);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private boolean IllI(class_310 var1) {
      if (this.III == null || this.lI == null || var1 == null || var1.field_1724 == null) {
         return false;
      } else if (!this.lII(var1)) {
         return false;
      } else if (!this.IIl(this.III, var1)) {
         this.III();
         return false;
      } else if (!this.lI(var1.field_1724, class_1802.field_8301)) {
         return false;
      } else if (IlllIlII.lllIl()) {
         return false;
      } else if (var1.field_1690 == null || var1.field_1690.field_1904 == null) {
         return false;
      } else if (IlllIlII.lllIl()) {
         return false;
      } else {
         class_3965 var2 = new class_3965(this.Ill == null ? this.Ill(this.III, this.lI) : this.Ill, this.lI, this.III, false);
         this.I = var1.field_1765;
         var1.field_1765 = var2;
         this.Il = true;
         this.IIll = true;
         k74.x.IIll.IlIll(var1);
         k74.x.IIll.lIIIIlI(var1.field_1690.field_1904);
         var1.field_1690.field_1904.method_23481(false);
         if (!k74.x.IIll.IIlIIl(var1)) {
            k74.x.IIll.lllIl(var1, this, lllIII.II);
            this.Il(var1);
            return false;
         } else {
            this.IllII(var1);
            k74.x.IIll.llIllI(var1, this, 0);
            this.lll = true;
            this.III();
            return true;
         }
      }
   }

   private boolean Illl(class_310 var1) {
      if (!this.IIlII(var1) || var1.field_1690 == null) {
         return false;
      } else {
         return !this.lI(var1.field_1724, class_1802.field_8301) ? false : this.l(var1) && this.IIIIl(var1);
      }
   }

   private void lIII(class_310 var1) {
      if (!this.IIlII(var1)) {
         k74.x.IIll.lllIl(var1, this, lllIII.II);
         this.IlII();
         this.III();
      } else {
         this.IIll(var1);
         if (!this.Illl(var1)) {
            k74.x.IIll.lllIl(var1, this, lllIII.II);
            this.IlII();
         } else if (this.IIllI(var1)) {
            if (this.lIlI(var1)) {
               this.lIIII(var1);
               this.ll(var1);
            } else if (this.IIIl != lIIIl(-1860583485, -2097945005 ^ -1496580366) && var1.field_1724.field_6012 <= this.IIIl) {
               this.ll(var1);
            } else {
               k74.x.IIll.lllIIl(var1);
               this.lIl = true;

               try {
                  k74.x.IIll.lIIII(var1);
               } finally {
                  this.lIl = false;
               }

               this.ll(var1);
            }
         } else {
            if (this.IllIl(var1)) {
               k74.x.IIll.lllIIl(var1);
               class_3965 var2 = (class_3965)var1.field_1765;
               this.IIIl(var2.method_17777(), var2.method_17780(), var2.method_17784());
            }
         }
      }
   }

   private boolean lIIl(class_310 var1, class_2338 var2, class_2350 var3) {
      if (var1.field_1724 == null || var1.field_1761 == null) {
         return false;
      } else if (IlllIlII.lllIl()) {
         return false;
      } else if (IlllIlII.lllIl()) {
         return false;
      } else {
         class_243 var4 = new class_243(var2.method_10263(), var2.method_10264(), var2.method_10260());
         class_3965 var5 = new class_3965(var4, var3, var2, false);
         return this.lIll(var1, var5);
      }
   }

   private boolean lIlI(class_310 var1) {
      if (var1 == null || var1.field_1724 == null) {
         return false;
      } else {
         return !this.lll && !var1.field_1724.method_6115()
            ? var1.field_1690 != null
               && var1.field_1690.field_1904 != null
               && (var1.field_1690.field_1904.method_1434() || k74.x.IIll.IIIIIlI(var1.field_1690.field_1904) > 0)
            : true;
      }
   }

   @Override
   public void IllIll(class_310 var1) {
      this.lIII(var1);
      this.IllI(var1);
   }

   private boolean lIll(class_310 var1, class_3965 var2) {
      return !this.lII(var1) ? false : IlllIlII.IIIlII(var1, lIIIl(-1860583486, 348824620 ^ 1101734175), var2.method_17784(), this::IIlll);
   }

   private static String llII(int var0, int var1) {
      int var9 = -987438567;
      int var2 = (var0 ^ lIIIl(-1860583475, var9 ^ -1233755400)) & lIIIl(-1860583476, var9 ^ -2120132473);
      if (lII[var2] == null) {
         char[] var3 = IlII[var2].toCharArray();

         int var4 = switch (var3[0] & lIIIl(-1860583473, var9 ^ 115416826)) {
            case 0 -> lIIIl(-1860583474, var9 ^ 1583347141);
            case 1 -> lIIIl(-1860583479, var9 ^ -2025502859);
            case 2 -> lIIIl(-1860583480, var9 ^ 1228206978);
            case 3 -> lIIIl(-1860583477, var9 ^ -228798540);
            case 4 -> lIIIl(-1860583478, var9 ^ -186179584);
            case 5 -> lIIIl(-1860583467, var9 ^ 1709747040);
            case 6 -> lIIIl(-1860583468, var9 ^ 1020596161);
            case 7 -> lIIIl(-1860583465, var9 ^ -1790563763);
            case 8 -> lIIIl(-1860583466, var9 ^ -478883384);
            case 9 -> lIIIl(-1860583471, var9 ^ -2032517662);
            case 10 -> lIIIl(-1860583472, var9 ^ -10994506);
            case 11 -> lIIIl(-1860583469, var9 ^ 1291781432);
            case 12 -> lIIIl(-1860583470, var9 ^ 1460306822);
            case 13 -> lIIIl(-1860583459, var9 ^ 2016543904);
            case 14 -> lIIIl(-1860583460, var9 ^ 976805465);
            case 15 -> lIIIl(-1860583457, var9 ^ -1047784456);
            case 16 -> lIIIl(-1860583458, var9 ^ 85367468);
            case 17 -> lIIIl(-1860583463, var9 ^ -263998104);
            case 18 -> lIIIl(-1860583464, var9 ^ 593356143);
            case 19 -> lIIIl(-1860583461, var9 ^ -321083869);
            case 20 -> lIIIl(-1860583462, var9 ^ -1954883270);
            case 21 -> lIIIl(-1860583451, var9 ^ 1431668061);
            case 22 -> lIIIl(-1860583452, var9 ^ -2101606771);
            case 23 -> lIIIl(-1860583449, var9 ^ -1037845017);
            case 24 -> lIIIl(-1860583450, var9 ^ -2055240664);
            case 25 -> lIIIl(-1860583455, var9 ^ 1880145027);
            case 26 -> lIIIl(-1860583456, var9 ^ 869681603);
            case 27 -> lIIIl(-1860583453, var9 ^ 1736490370);
            case 28 -> lIIIl(-1860583454, var9 ^ 1852242418);
            case 29 -> lIIIl(-1860583443, var9 ^ 158858093);
            case 30 -> lIIIl(-1860583444, var9 ^ -886165117);
            case 31 -> lIIIl(-1860583441, var9 ^ -333083837);
            case 32 -> lIIIl(-1860583442, var9 ^ -233962155);
            case 33 -> lIIIl(-1860583447, var9 ^ 412746596);
            case 34 -> lIIIl(-1860583448, var9 ^ 1114673366);
            case 35 -> lIIIl(-1860583445, var9 ^ 1982441066);
            case 36 -> lIIIl(-1860583446, var9 ^ -318080486);
            case 37 -> lIIIl(-1860583435, var9 ^ -503043736);
            case 38 -> lIIIl(-1860583436, var9 ^ -784054633);
            case 39 -> lIIIl(-1860583433, var9 ^ 560865648);
            case 40 -> lIIIl(-1860583434, var9 ^ -884457755);
            case 41 -> lIIIl(-1860583439, var9 ^ -81714111);
            case 42 -> lIIIl(-1860583440, var9 ^ -365600292);
            case 43 -> lIIIl(-1860583437, var9 ^ -1371081008);
            case 44 -> lIIIl(-1860583438, var9 ^ 298792333);
            case 45 -> lIIIl(-1860583427, var9 ^ 1021967827);
            case 46 -> lIIIl(-1860583428, var9 ^ 784028350);
            case 47 -> lIIIl(-1860583425, var9 ^ 644648783);
            case 48 -> lIIIl(-1860583426, var9 ^ 1084314289);
            case 49 -> lIIIl(-1860583431, var9 ^ -1053226753);
            case 50 -> lIIIl(-1860583432, var9 ^ 1322366058);
            case 51 -> lIIIl(-1860583429, var9 ^ -594424620);
            case 52 -> lIIIl(-1860583430, var9 ^ -1944135657);
            case 53 -> lIIIl(-1860583547, var9 ^ 35492070);
            case 54 -> lIIIl(-1860583548, var9 ^ -841086112);
            case 55 -> lIIIl(-1860583545, var9 ^ -711031173);
            case 56 -> 3;
            case 57 -> lIIIl(-1860583546, var9 ^ 287138372);
            case 58 -> lIIIl(-1860583551, var9 ^ -1832912216);
            case 59 -> lIIIl(-1860583552, var9 ^ -1748403268);
            case 60 -> lIIIl(-1860583549, var9 ^ -795291262);
            case 61 -> lIIIl(-1860583550, var9 ^ -696846143);
            case 62 -> lIIIl(-1860583539, var9 ^ 1767841038);
            case 63 -> lIIIl(-1860583540, var9 ^ -1330231300);
            case 64 -> lIIIl(-1860583537, var9 ^ 1739753140);
            case 65 -> lIIIl(-1860583538, var9 ^ -1016374206);
            case 66 -> lIIIl(-1860583543, var9 ^ -490859910);
            case 67 -> lIIIl(-1860583544, var9 ^ 1215368766);
            case 68 -> lIIIl(-1860583541, var9 ^ -659634766);
            case 69 -> lIIIl(-1860583542, var9 ^ 1477269819);
            case 70 -> lIIIl(-1860583531, var9 ^ -121199364);
            case 71 -> lIIIl(-1860583532, var9 ^ 188086);
            case 72 -> lIIIl(-1860583529, var9 ^ 1246288226);
            case 73 -> lIIIl(-1860583530, var9 ^ -1368497701);
            case 74 -> lIIIl(-1860583535, var9 ^ 1478620040);
            case 75 -> lIIIl(-1860583536, var9 ^ -825910021);
            case 76 -> lIIIl(-1860583533, var9 ^ 632002750);
            case 77 -> lIIIl(-1860583534, var9 ^ -1837945077);
            case 78 -> lIIIl(-1860583523, var9 ^ -1828397954);
            case 79 -> lIIIl(-1860583524, var9 ^ -626817345);
            case 80 -> lIIIl(-1860583521, var9 ^ -1948677638);
            case 81 -> lIIIl(-1860583522, var9 ^ -1525899011);
            case 82 -> lIIIl(-1860583527, var9 ^ -1012062371);
            case 83 -> lIIIl(-1860583528, var9 ^ 325902062);
            case 84 -> lIIIl(-1860583525, var9 ^ 1412117537);
            case 85 -> lIIIl(-1860583526, var9 ^ 764425760);
            case 86 -> lIIIl(-1860583515, var9 ^ 843443970);
            case 87 -> lIIIl(-1860583516, var9 ^ 411389827);
            case 88 -> lIIIl(-1860583513, var9 ^ 1677872282);
            case 89 -> lIIIl(-1860583514, var9 ^ 2048011453);
            case 90 -> lIIIl(-1860583519, var9 ^ 968510879);
            case 91 -> lIIIl(-1860583520, var9 ^ -1433937372);
            case 92 -> lIIIl(-1860583517, var9 ^ 2107160778);
            case 93 -> lIIIl(-1860583518, var9 ^ -835714381);
            case 94 -> lIIIl(-1860583507, var9 ^ -1710519494);
            case 95 -> lIIIl(-1860583508, var9 ^ 925961409);
            case 96 -> lIIIl(-1860583505, var9 ^ -961754484);
            case 97 -> lIIIl(-1860583506, var9 ^ 619354749);
            case 98 -> lIIIl(-1860583511, var9 ^ 72520893);
            case 99 -> lIIIl(-1860583512, var9 ^ -85352682);
            case 100 -> lIIIl(-1860583509, var9 ^ -142255958);
            case 101 -> lIIIl(-1860583510, var9 ^ -250441461);
            case 102 -> lIIIl(-1860583499, var9 ^ -1889702029);
            case 103 -> lIIIl(-1860583500, var9 ^ -221735954);
            case 104 -> lIIIl(-1860583497, var9 ^ -779042220);
            case 105 -> lIIIl(-1860583498, var9 ^ -1374999568);
            case 106 -> lIIIl(-1860583503, var9 ^ -520628950);
            case 107 -> lIIIl(-1860583504, var9 ^ 656661701);
            case 108 -> lIIIl(-1860583501, var9 ^ -1126868960);
            case 109 -> lIIIl(-1860583502, var9 ^ 766098291);
            case 110 -> lIIIl(-1860583491, var9 ^ -1356694266);
            case 111 -> lIIIl(-1860583492, var9 ^ 894581664);
            case 112 -> lIIIl(-1860583489, var9 ^ -1019506377);
            case 113 -> lIIIl(-1860583490, var9 ^ -2060681747);
            case 114 -> lIIIl(-1860583495, var9 ^ -574786250);
            case 115 -> lIIIl(-1860583496, var9 ^ -1771315809);
            case 116 -> lIIIl(-1860583493, var9 ^ -1855945766);
            case 117 -> lIIIl(-1860583494, var9 ^ 871760437);
            case 118 -> lIIIl(-1860583611, var9 ^ 1232002258);
            case 119 -> lIIIl(-1860583612, var9 ^ -2043631079);
            case 120 -> lIIIl(-1860583609, var9 ^ 1324195141);
            case 121 -> lIIIl(-1860583610, var9 ^ 228879602);
            case 122 -> lIIIl(-1860583615, var9 ^ -494767212);
            case 123 -> lIIIl(-1860583616, var9 ^ -1047332499);
            case 124 -> lIIIl(-1860583613, var9 ^ -1182690347);
            case 125 -> lIIIl(-1860583614, var9 ^ 708721707);
            case 126 -> lIIIl(-1860583603, var9 ^ 1505579921);
            case 127 -> lIIIl(-1860583604, var9 ^ -483871163);
            case 128 -> lIIIl(-1860583601, var9 ^ -569994722);
            case 129 -> lIIIl(-1860583602, var9 ^ 761350377);
            case 130 -> lIIIl(-1860583607, var9 ^ -1763646528);
            case 131 -> lIIIl(-1860583608, var9 ^ -1685870488);
            case 132 -> lIIIl(-1860583605, var9 ^ -217788655);
            case 133 -> lIIIl(-1860583606, var9 ^ 1000623445);
            case 134 -> lIIIl(-1860583595, var9 ^ 356397770);
            case 135 -> lIIIl(-1860583596, var9 ^ -1484637550);
            case 136 -> lIIIl(-1860583593, var9 ^ -1286937022);
            case 137 -> lIIIl(-1860583594, var9 ^ -1638386092);
            case 138 -> lIIIl(-1860583599, var9 ^ -1857055027);
            case 139 -> lIIIl(-1860583600, var9 ^ 719879199);
            case 140 -> lIIIl(-1860583597, var9 ^ -303477081);
            case 141 -> lIIIl(-1860583598, var9 ^ -604757662);
            case 142 -> lIIIl(-1860583587, var9 ^ 549079082);
            case 143 -> 2;
            case 144 -> lIIIl(-1860583588, var9 ^ -1314748652);
            case 145 -> lIIIl(-1860583585, var9 ^ -1555220268);
            case 146 -> lIIIl(-1860583586, var9 ^ -1726690039);
            case 147 -> lIIIl(-1860583591, var9 ^ 645147895);
            case 148 -> lIIIl(-1860583592, var9 ^ -2054950277);
            case 149 -> lIIIl(-1860583589, var9 ^ 437430169);
            case 150 -> lIIIl(-1860583590, var9 ^ -583243108);
            case 151 -> lIIIl(-1860583579, var9 ^ 1093764160);
            case 152 -> lIIIl(-1860583580, var9 ^ -25001216);
            case 153 -> lIIIl(-1860583577, var9 ^ -1848745969);
            case 154 -> lIIIl(-1860583578, var9 ^ 991779002);
            case 155 -> lIIIl(-1860583583, var9 ^ 1871849225);
            case 156 -> 0;
            case 157 -> lIIIl(-1860583584, var9 ^ 34534878);
            case 158 -> lIIIl(-1860583581, var9 ^ -1268308337);
            case 159 -> lIIIl(-1860583582, var9 ^ 1672263663);
            case 160 -> lIIIl(-1860583571, var9 ^ 1246778828);
            case 161 -> lIIIl(-1860583572, var9 ^ -507350493);
            case 162 -> lIIIl(-1860583569, var9 ^ 149186955);
            case 163 -> lIIIl(-1860583570, var9 ^ -1394246884);
            case 164 -> lIIIl(-1860583575, var9 ^ 1943434039);
            case 165 -> lIIIl(-1860583576, var9 ^ -821473412);
            case 166 -> lIIIl(-1860583573, var9 ^ 1428922128);
            case 167 -> 5;
            case 168 -> lIIIl(-1860583574, var9 ^ 399632149);
            case 169 -> lIIIl(-1860583563, var9 ^ -836958439);
            case 170 -> lIIIl(-1860583564, var9 ^ 1722844124);
            case 171 -> lIIIl(-1860583561, var9 ^ -72855043);
            case 172 -> lIIIl(-1860583562, var9 ^ -491868579);
            case 173 -> lIIIl(-1860583567, var9 ^ 1831740136);
            case 174 -> lIIIl(-1860583568, var9 ^ -757791657);
            case 175 -> lIIIl(-1860583565, var9 ^ -717549808);
            case 176 -> lIIIl(-1860583566, var9 ^ -1529085961);
            case 177 -> lIIIl(-1860583555, var9 ^ 1315975561);
            case 178 -> 1;
            case 179 -> lIIIl(-1860583556, var9 ^ -1523048165);
            case 180 -> lIIIl(-1860583553, var9 ^ -1092662156);
            case 181 -> lIIIl(-1860583554, var9 ^ -1522167614);
            case 182 -> lIIIl(-1860583559, var9 ^ 2057621992);
            case 183 -> lIIIl(-1860583560, var9 ^ 1921057193);
            case 184 -> lIIIl(-1860583557, var9 ^ -413724391);
            case 185 -> lIIIl(-1860583558, var9 ^ -485122812);
            case 186 -> lIIIl(-1860583675, var9 ^ 183539201);
            case 187 -> lIIIl(-1860583676, var9 ^ -1071831760);
            case 188 -> lIIIl(-1860583673, var9 ^ 920887122);
            case 189 -> lIIIl(-1860583674, var9 ^ -1450982433);
            case 190 -> lIIIl(-1860583679, var9 ^ 1971676125);
            case 191 -> lIIIl(-1860583680, var9 ^ 1791662225);
            case 192 -> lIIIl(-1860583677, var9 ^ 575422121);
            case 193 -> lIIIl(-1860583678, var9 ^ 1569515705);
            case 194 -> lIIIl(-1860583667, var9 ^ 325005974);
            case 195 -> lIIIl(-1860583668, var9 ^ 728580191);
            case 196 -> lIIIl(-1860583665, var9 ^ -1915221552);
            case 197 -> lIIIl(-1860583666, var9 ^ -1522822649);
            case 198 -> lIIIl(-1860583671, var9 ^ 757721347);
            case 199 -> lIIIl(-1860583672, var9 ^ 630128832);
            case 200 -> lIIIl(-1860583669, var9 ^ -51079753);
            case 201 -> lIIIl(-1860583670, var9 ^ -798162494);
            case 202 -> lIIIl(-1860583659, var9 ^ -1440532408);
            case 203 -> lIIIl(-1860583660, var9 ^ -803312562);
            case 204 -> lIIIl(-1860583657, var9 ^ 2055542030);
            case 205 -> lIIIl(-1860583658, var9 ^ 612465721);
            case 206 -> lIIIl(-1860583663, var9 ^ -1149215099);
            case 207 -> lIIIl(-1860583664, var9 ^ 466970166);
            case 208 -> lIIIl(-1860583661, var9 ^ -144957405);
            case 209 -> lIIIl(-1860583662, var9 ^ 548477461);
            case 210 -> lIIIl(-1860583651, var9 ^ -2027193624);
            case 211 -> lIIIl(-1860583652, var9 ^ -1067045257);
            case 212 -> lIIIl(-1860583649, var9 ^ -1865876026);
            case 213 -> 4;
            case 214 -> lIIIl(-1860583650, var9 ^ -1271484755);
            case 215 -> lIIIl(-1860583655, var9 ^ 217293226);
            case 216 -> lIIIl(-1860583656, var9 ^ -2108938462);
            case 217 -> lIIIl(-1860583653, var9 ^ 293568489);
            case 218 -> lIIIl(-1860583654, var9 ^ -1021652593);
            case 219 -> lIIIl(-1860583643, var9 ^ -1591928544);
            case 220 -> lIIIl(-1860583644, var9 ^ -1700274113);
            case 221 -> lIIIl(-1860583641, var9 ^ 621189450);
            case 222 -> lIIIl(-1860583642, var9 ^ 1613484908);
            case 223 -> lIIIl(-1860583647, var9 ^ -1886877573);
            case 224 -> lIIIl(-1860583648, var9 ^ 331359889);
            case 225 -> lIIIl(-1860583645, var9 ^ -1099621158);
            case 226 -> lIIIl(-1860583646, var9 ^ -1633513528);
            case 227 -> lIIIl(-1860583635, var9 ^ -1802332672);
            case 228 -> lIIIl(-1860583636, var9 ^ 66678639);
            case 229 -> lIIIl(-1860583633, var9 ^ 1846790863);
            case 230 -> lIIIl(-1860583634, var9 ^ 1118118712);
            case 231 -> lIIIl(-1860583639, var9 ^ -113863798);
            case 232 -> lIIIl(-1860583640, var9 ^ -1261577695);
            case 233 -> lIIIl(-1860583637, var9 ^ -880519621);
            case 234 -> lIIIl(-1860583638, var9 ^ -2741780);
            case 235 -> lIIIl(-1860583627, var9 ^ 258539643);
            case 236 -> lIIIl(-1860583628, var9 ^ 1889321458);
            case 237 -> lIIIl(-1860583625, var9 ^ 1876095523);
            case 238 -> lIIIl(-1860583626, var9 ^ -1314976620);
            case 239 -> lIIIl(-1860583631, var9 ^ 1843839263);
            case 240 -> lIIIl(-1860583632, var9 ^ 309874667);
            case 241 -> lIIIl(-1860583629, var9 ^ 1438669888);
            case 242 -> lIIIl(-1860583630, var9 ^ -2121728853);
            case 243 -> lIIIl(-1860583619, var9 ^ -1448658769);
            case 244 -> lIIIl(-1860583620, var9 ^ 268222934);
            case 245 -> lIIIl(-1860583617, var9 ^ 889258519);
            case 246 -> lIIIl(-1860583618, var9 ^ -32832611);
            case 247 -> lIIIl(-1860583623, var9 ^ 970333941);
            case 248 -> lIIIl(-1860583624, var9 ^ 126514549);
            case 249 -> lIIIl(-1860583621, var9 ^ -681137478);
            case 250 -> lIIIl(-1860583622, var9 ^ 1907101096);
            case 251 -> lIIIl(-1860583739, var9 ^ 347357415);
            case 252 -> lIIIl(-1860583740, var9 ^ 48410665);
            case 253 -> lIIIl(-1860583737, var9 ^ 1392053562);
            case 254 -> lIIIl(-1860583738, var9 ^ -2132116490);
            default -> lIIIl(-1860583743, var9 ^ 1321898200);
         };
         int var5 = (var1 & lIIIl(-1860583744, var9 ^ -1632438349)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & lIIIl(-1860583741, var9 ^ -1534067433)) >>> lIIIl(-1860583742, var9 ^ 1384332264)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & lIIIl(-1860583731, var9 ^ 2052021447);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & lIIIl(-1860583732, var9 ^ 1978821114);
            }
         }

         lII[var2] = new String(var3).intern();
      }

      return lII[var2];
   }

   public boolean lllI(class_2338 var1, class_2350 var2) {
      class_310 var3 = class_310.method_1551();
      if (!this.IIII(var3, var1, var2)) {
         return false;
      } else if (!this.lIl(var3)) {
         return true;
      } else {
         boolean var4 = this.lIIl(var3, var1, var2);
         if (var4) {
            this.IllII(var3);
            k74.x.IIll.llIllI(var3, this, 0);
         }

         return var4;
      }
   }

   private boolean IIIII(class_310 var1) {
      if (this.IIII.IllI() && var1 != null && var1.field_1724 != null) {
         int var2 = this.I(var1.field_1724.method_31548(), class_1802.field_8301);
         if (var2 < 0) {
            return false;
         } else if (!k74.x.IIll.IlllIll(var1, this, var2)) {
            return false;
         } else {
            this.IlII();
            return true;
         }
      } else {
         return false;
      }
   }

   private boolean IIIIl(class_310 var1) {
      return var1 != null && var1.field_1765 != null ? this.IllIl(var1) || this.IIllI(var1) : false;
   }

   private static void IIIlI() {
      int var0 = 1000823251;
      IIlI[0] = IlIl(
         llII(lIIIl(-1860583729, var0 ^ 99037098), lIIIl(-1860583730, var0 ^ 788531545)).toCharArray(), 66761L, lIIIl(-1860583735, var0 ^ 1520843561)
      );
      IIlI[1] = IlIl(
         llII(lIIIl(-1860583736, var0 ^ -2099372577), lIIIl(-1860583733, var0 ^ 795603964)).toCharArray(), 17149L, lIIIl(-1860583734, var0 ^ 1340793384)
      );
      IIlI[2] = IlIl(
         llII(lIIIl(-1860583723, var0 ^ -690367223), lIIIl(-1860583724, var0 ^ -1956665534)).toCharArray(), 60306L, lIIIl(-1860583721, var0 ^ 1425875059)
      );
      IIlI[3] = IlIl(
         llII(lIIIl(-1860583722, var0 ^ 1094627017), lIIIl(-1860583727, var0 ^ -1873154567)).toCharArray(), 31439L, lIIIl(-1860583728, var0 ^ 317390807)
      );
   }

   static boolean IIIll(class_746 var0) {
      return var0 != null && var0.method_45325(class_5134.field_23721) > 0.0;
   }

   private boolean IIlII(class_310 var1) {
      return var1 != null
         && var1.field_1724 != null
         && var1.field_1687 != null
         && var1.field_1761 != null
         && var1.field_1755 == null
         && var1.field_1724.method_5805();
   }

   public IIlllIIlI() {
      super(IlIIllIII.Ill(IIlI[0]), lllIIlIl.I, IlIIllIII.Ill(IIlI[1]));
      this.IlI = this.IllIIll(new IllIII<>(IlIIllIII.Ill(IIlI[2]), IlIlIII.class, IlIlIII.III));
      this.IIII = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IIlI[3]), false));
      this.IIIl = lIIIl(-1860583725, -691983233 ^ 1470525439);
      this.IIl = lIIIl(-1860583726, -691983233 ^ 878350900);
   }

   private boolean IIllI(class_310 var1) {
      if (var1 != null && var1.field_1765 != null) {
         return var1.field_1765 instanceof class_3966 var2 && var2.method_17782() instanceof class_1511 var3 ? !var3.method_31481() : false;
      } else {
         return false;
      }
   }

   private boolean IIlll(class_310 var1, class_3965 var2) {
      this.Il = true;

      boolean var3;
      try {
         var3 = k74.x.IIll.IlIIII(var1, var2);
      } finally {
         this.Il = false;
      }

      return var3;
   }

   private void IllII(class_310 var1) {
      this.ll = true;
      this.llI = this.II(var1);
   }

   private boolean IllIl(class_310 var1) {
      return var1 != null && var1.field_1765 != null
         ? var1.field_1765 instanceof class_3965 var2 && var2.method_17783() == class_240.field_1332 && this.IIl(var2.method_17777(), var1)
         : false;
   }

   private boolean IlllI(class_1297 var1, byte var2) {
      String[] var3 = IIllllIl.IIIIl();
      class_310 var4 = class_310.method_1551();
      return var1 != null && var4 != null && var4.field_1724 != null && var1 != var4.field_1724 && var1 instanceof class_1309 var5 && var3 == null
         ? var2 == 3 || var1.method_31481() || !var1.method_5805() || var5.method_6032() <= 0.0F
         : false;
   }

   private boolean Illll(class_310 var1) {
      return var1 != null
         && var1.field_1690 != null
         && var1.field_1690.field_1904 != null
         && (k74.x.IIll.IlIllll(var1, var1.field_1690.field_1904) || var1.field_1690.field_1904.method_1434());
   }

   private void lIIII(class_310 var1) {
      String[] var2 = IIllllIl.IIIIl();
      this.IIlI(var1);
      if (var1 != null && var1.field_1724 != null) {
         label23: {
            boolean var3 = var1.field_1761 != null && var1.field_1724.method_6115();
            if (var3) {
               var1.field_1761.method_2897(var1.field_1724);
               if (var2 == null) {
                  break label23;
               }
            }

            k74.x.IIll.IIIIIII(var1);
         }

         this.lll = false;
         this.IIIl = var1.field_1724.field_6012;
      }
   }
}
