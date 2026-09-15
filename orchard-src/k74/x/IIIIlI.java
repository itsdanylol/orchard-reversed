package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_304;
import net.minecraft.class_310;
import net.minecraft.class_315;

@Environment(EnvType.CLIENT)
public final class IIIIlI extends IlIIIIIIl {
   private static final String[] llI;
   private boolean I;
   private boolean II;
   private long Il;
   private boolean lI;
   private static final String[] ll;
   private static final int[] lIl;
   private long III;
   private static final Object[] lll;
   private static final String[] IIl;
   private long IlI;
   private long Ill;
   private boolean lII;

   private static String I(int var0, int var1) {
      int var9 = 328449581;
      int var2 = (var0 ^ Il(2096605420, var9 ^ 40743862)) & Il(2096605421, var9 ^ -1166418776);
      if (ll[var2] == null) {
         char[] var3 = IIl[var2].toCharArray();

         int var4 = switch (var3[0] & Il(2096605422, var9 ^ 980619527)) {
            case 0 -> Il(2096605423, var9 ^ -706693855);
            case 1 -> Il(2096605416, var9 ^ 237929543);
            case 2 -> Il(2096605417, var9 ^ -1281234126);
            case 3 -> Il(2096605418, var9 ^ -202699129);
            case 4 -> Il(2096605419, var9 ^ -615084762);
            case 5 -> Il(2096605412, var9 ^ -912725167);
            case 6 -> Il(2096605413, var9 ^ 1279074275);
            case 7 -> Il(2096605414, var9 ^ 1995634047);
            case 8 -> Il(2096605415, var9 ^ -934129724);
            case 9 -> Il(2096605408, var9 ^ -70566745);
            case 10 -> Il(2096605409, var9 ^ 313931951);
            case 11 -> Il(2096605410, var9 ^ 1257869097);
            case 12 -> Il(2096605411, var9 ^ 45507720);
            case 13 -> Il(2096605436, var9 ^ -1240023140);
            case 14 -> Il(2096605437, var9 ^ 1384646458);
            case 15 -> Il(2096605438, var9 ^ 1471595633);
            case 16 -> Il(2096605439, var9 ^ 1560144647);
            case 17 -> Il(2096605432, var9 ^ -1438308784);
            case 18 -> Il(2096605433, var9 ^ -1280995511);
            case 19 -> Il(2096605434, var9 ^ 1041264776);
            case 20 -> Il(2096605435, var9 ^ 1165773205);
            case 21 -> Il(2096605428, var9 ^ 1019404410);
            case 22 -> Il(2096605429, var9 ^ -452213179);
            case 23 -> Il(2096605430, var9 ^ 1810410725);
            case 24 -> Il(2096605431, var9 ^ -886323012);
            case 25 -> Il(2096605424, var9 ^ -1557134092);
            case 26 -> Il(2096605425, var9 ^ 415019975);
            case 27 -> Il(2096605426, var9 ^ -1428458935);
            case 28 -> Il(2096605427, var9 ^ 1976772355);
            case 29 -> Il(2096605388, var9 ^ 130837688);
            case 30 -> Il(2096605389, var9 ^ 1577632963);
            case 31 -> Il(2096605390, var9 ^ 1706288254);
            case 32 -> Il(2096605391, var9 ^ 1279850682);
            case 33 -> Il(2096605384, var9 ^ 2014830974);
            case 34 -> Il(2096605385, var9 ^ -808218057);
            case 35 -> Il(2096605386, var9 ^ -1233638246);
            case 36 -> Il(2096605387, var9 ^ -1803205435);
            case 37 -> Il(2096605380, var9 ^ -1495088146);
            case 38 -> Il(2096605381, var9 ^ -95340818);
            case 39 -> Il(2096605382, var9 ^ -840818680);
            case 40 -> Il(2096605383, var9 ^ 1352381562);
            case 41 -> Il(2096605376, var9 ^ -2045648848);
            case 42 -> Il(2096605377, var9 ^ -1760840719);
            case 43 -> Il(2096605378, var9 ^ 1042823105);
            case 44 -> Il(2096605379, var9 ^ 765648205);
            case 45 -> Il(2096605404, var9 ^ -1554121664);
            case 46 -> Il(2096605405, var9 ^ -436440077);
            case 47 -> Il(2096605406, var9 ^ -2055284874);
            case 48 -> Il(2096605407, var9 ^ -1650363612);
            case 49 -> Il(2096605400, var9 ^ 2113200307);
            case 50 -> Il(2096605401, var9 ^ -397953485);
            case 51 -> Il(2096605402, var9 ^ 392055754);
            case 52 -> Il(2096605403, var9 ^ -25986628);
            case 53 -> Il(2096605396, var9 ^ -1060913793);
            case 54 -> Il(2096605397, var9 ^ 1848117214);
            case 55 -> Il(2096605398, var9 ^ 1664931313);
            case 56 -> Il(2096605399, var9 ^ -1823753823);
            case 57 -> Il(2096605392, var9 ^ 2084558492);
            case 58 -> Il(2096605393, var9 ^ -787986014);
            case 59 -> 4;
            case 60 -> Il(2096605394, var9 ^ 958785690);
            case 61 -> Il(2096605395, var9 ^ -2046714655);
            case 62 -> Il(2096605356, var9 ^ -1974757473);
            case 63 -> Il(2096605357, var9 ^ 1824978580);
            case 64 -> Il(2096605358, var9 ^ 1622562068);
            case 65 -> Il(2096605359, var9 ^ -974709301);
            case 66 -> Il(2096605352, var9 ^ -2009271954);
            case 67 -> Il(2096605353, var9 ^ -1665864902);
            case 68 -> Il(2096605354, var9 ^ 465004387);
            case 69 -> Il(2096605355, var9 ^ -1661868389);
            case 70 -> Il(2096605348, var9 ^ -457209596);
            case 71 -> Il(2096605349, var9 ^ 1458352014);
            case 72 -> Il(2096605350, var9 ^ -1771918229);
            case 73 -> Il(2096605351, var9 ^ -734014006);
            case 74 -> Il(2096605344, var9 ^ 1552544677);
            case 75 -> Il(2096605345, var9 ^ 1682138559);
            case 76 -> Il(2096605346, var9 ^ -226911823);
            case 77 -> Il(2096605347, var9 ^ -807493115);
            case 78 -> Il(2096605372, var9 ^ 321378132);
            case 79 -> Il(2096605373, var9 ^ -903696153);
            case 80 -> Il(2096605374, var9 ^ 1144847880);
            case 81 -> Il(2096605375, var9 ^ 1551490358);
            case 82 -> Il(2096605368, var9 ^ 799614500);
            case 83 -> Il(2096605369, var9 ^ -904003898);
            case 84 -> Il(2096605370, var9 ^ -152309933);
            case 85 -> Il(2096605371, var9 ^ -1826872804);
            case 86 -> Il(2096605364, var9 ^ 1940183695);
            case 87 -> Il(2096605365, var9 ^ 418861654);
            case 88 -> Il(2096605366, var9 ^ 724764404);
            case 89 -> Il(2096605367, var9 ^ -52232217);
            case 90 -> Il(2096605360, var9 ^ 1383066058);
            case 91 -> Il(2096605361, var9 ^ 104997485);
            case 92 -> Il(2096605362, var9 ^ -866052486);
            case 93 -> Il(2096605363, var9 ^ 418857272);
            case 94 -> Il(2096605324, var9 ^ -1289205357);
            case 95 -> Il(2096605325, var9 ^ -100221897);
            case 96 -> Il(2096605326, var9 ^ 299276136);
            case 97 -> Il(2096605327, var9 ^ -1032159234);
            case 98 -> Il(2096605320, var9 ^ -135839610);
            case 99 -> Il(2096605321, var9 ^ -204356533);
            case 100 -> Il(2096605322, var9 ^ 1509065286);
            case 101 -> Il(2096605323, var9 ^ -376648426);
            case 102 -> Il(2096605316, var9 ^ 231741581);
            case 103 -> Il(2096605317, var9 ^ 957759622);
            case 104 -> Il(2096605318, var9 ^ -972252063);
            case 105 -> Il(2096605319, var9 ^ 1089113690);
            case 106 -> Il(2096605312, var9 ^ -36063488);
            case 107 -> Il(2096605313, var9 ^ -1005669669);
            case 108 -> Il(2096605314, var9 ^ -649013014);
            case 109 -> Il(2096605315, var9 ^ 1679296811);
            case 110 -> Il(2096605340, var9 ^ 2002122743);
            case 111 -> Il(2096605341, var9 ^ -1864768374);
            case 112 -> Il(2096605342, var9 ^ 1521175135);
            case 113 -> Il(2096605343, var9 ^ -1820819857);
            case 114 -> Il(2096605336, var9 ^ 1686954706);
            case 115 -> Il(2096605337, var9 ^ -1486694229);
            case 116 -> Il(2096605338, var9 ^ 562996081);
            case 117 -> Il(2096605339, var9 ^ -1448362740);
            case 118 -> Il(2096605332, var9 ^ -179820902);
            case 119 -> Il(2096605333, var9 ^ -892341417);
            case 120 -> Il(2096605334, var9 ^ 642353450);
            case 121 -> Il(2096605335, var9 ^ -1880091570);
            case 122 -> Il(2096605328, var9 ^ -994441356);
            case 123 -> Il(2096605329, var9 ^ -680200075);
            case 124 -> Il(2096605330, var9 ^ -537643781);
            case 125 -> Il(2096605331, var9 ^ 1137204013);
            case 126 -> Il(2096605292, var9 ^ -778416185);
            case 127 -> Il(2096605293, var9 ^ 1438293459);
            case 128 -> Il(2096605294, var9 ^ -1894360003);
            case 129 -> Il(2096605295, var9 ^ -847080906);
            case 130 -> Il(2096605288, var9 ^ -1045303898);
            case 131 -> Il(2096605289, var9 ^ 1887688370);
            case 132 -> Il(2096605290, var9 ^ -650008355);
            case 133 -> Il(2096605291, var9 ^ -813379901);
            case 134 -> Il(2096605284, var9 ^ -1603076504);
            case 135 -> Il(2096605285, var9 ^ 1234602121);
            case 136 -> Il(2096605286, var9 ^ -258277469);
            case 137 -> Il(2096605287, var9 ^ 1835423479);
            case 138 -> Il(2096605280, var9 ^ 966817685);
            case 139 -> Il(2096605281, var9 ^ 1391255579);
            case 140 -> Il(2096605282, var9 ^ -953343753);
            case 141 -> Il(2096605283, var9 ^ 830357706);
            case 142 -> Il(2096605308, var9 ^ 1760763302);
            case 143 -> Il(2096605309, var9 ^ 1452193044);
            case 144 -> Il(2096605310, var9 ^ 676934253);
            case 145 -> Il(2096605311, var9 ^ -1935372658);
            case 146 -> Il(2096605304, var9 ^ -486241574);
            case 147 -> 5;
            case 148 -> Il(2096605305, var9 ^ 526494084);
            case 149 -> Il(2096605306, var9 ^ -104143930);
            case 150 -> Il(2096605307, var9 ^ -1315410511);
            case 151 -> Il(2096605300, var9 ^ -322448660);
            case 152 -> 0;
            case 153 -> Il(2096605301, var9 ^ -853513038);
            case 154 -> Il(2096605302, var9 ^ 1665884819);
            case 155 -> Il(2096605303, var9 ^ -2022984797);
            case 156 -> Il(2096605296, var9 ^ -1799873248);
            case 157 -> Il(2096605297, var9 ^ 1110466522);
            case 158 -> Il(2096605298, var9 ^ 1368165193);
            case 159 -> Il(2096605299, var9 ^ 728823031);
            case 160 -> Il(2096605260, var9 ^ -718509907);
            case 161 -> Il(2096605261, var9 ^ -1562974530);
            case 162 -> Il(2096605262, var9 ^ -717588342);
            case 163 -> Il(2096605263, var9 ^ 935530702);
            case 164 -> Il(2096605256, var9 ^ -1126052087);
            case 165 -> Il(2096605257, var9 ^ -914570137);
            case 166 -> Il(2096605258, var9 ^ -1853569118);
            case 167 -> Il(2096605259, var9 ^ -1856081480);
            case 168 -> Il(2096605252, var9 ^ 1541942759);
            case 169 -> Il(2096605253, var9 ^ -1871152306);
            case 170 -> Il(2096605254, var9 ^ 1197843971);
            case 171 -> Il(2096605255, var9 ^ -1679402471);
            case 172 -> Il(2096605248, var9 ^ 1786315252);
            case 173 -> Il(2096605249, var9 ^ 460744768);
            case 174 -> Il(2096605250, var9 ^ -1715300673);
            case 175 -> Il(2096605251, var9 ^ 1136933284);
            case 176 -> Il(2096605276, var9 ^ 1523286145);
            case 177 -> Il(2096605277, var9 ^ 152967821);
            case 178 -> Il(2096605278, var9 ^ -651620239);
            case 179 -> Il(2096605279, var9 ^ -1469229008);
            case 180 -> Il(2096605272, var9 ^ -24582022);
            case 181 -> Il(2096605273, var9 ^ -267686214);
            case 182 -> Il(2096605274, var9 ^ -1409882820);
            case 183 -> Il(2096605275, var9 ^ -1441184461);
            case 184 -> Il(2096605268, var9 ^ 1625139265);
            case 185 -> Il(2096605269, var9 ^ -621847210);
            case 186 -> Il(2096605270, var9 ^ -837104235);
            case 187 -> Il(2096605271, var9 ^ -1492404691);
            case 188 -> Il(2096605264, var9 ^ -2027298092);
            case 189 -> Il(2096605265, var9 ^ 527966051);
            case 190 -> Il(2096605266, var9 ^ -2058417247);
            case 191 -> Il(2096605267, var9 ^ 515665821);
            case 192 -> Il(2096605228, var9 ^ 1532925596);
            case 193 -> Il(2096605229, var9 ^ -742458571);
            case 194 -> Il(2096605230, var9 ^ 409687109);
            case 195 -> Il(2096605231, var9 ^ 807993732);
            case 196 -> Il(2096605224, var9 ^ -1404897044);
            case 197 -> Il(2096605225, var9 ^ 1407036082);
            case 198 -> Il(2096605226, var9 ^ 732079461);
            case 199 -> Il(2096605227, var9 ^ -1690462122);
            case 200 -> Il(2096605220, var9 ^ 1216695593);
            case 201 -> Il(2096605221, var9 ^ -440264243);
            case 202 -> Il(2096605222, var9 ^ -1272005772);
            case 203 -> Il(2096605223, var9 ^ -945369128);
            case 204 -> Il(2096605216, var9 ^ -133260764);
            case 205 -> Il(2096605217, var9 ^ 22502229);
            case 206 -> Il(2096605218, var9 ^ 1222844073);
            case 207 -> Il(2096605219, var9 ^ -355654105);
            case 208 -> Il(2096605244, var9 ^ -568857575);
            case 209 -> Il(2096605245, var9 ^ -1049165974);
            case 210 -> Il(2096605246, var9 ^ 339729017);
            case 211 -> Il(2096605247, var9 ^ -1278596320);
            case 212 -> Il(2096605240, var9 ^ -1641266903);
            case 213 -> Il(2096605241, var9 ^ -675703322);
            case 214 -> 1;
            case 215 -> Il(2096605242, var9 ^ -1815522682);
            case 216 -> Il(2096605243, var9 ^ 1656476116);
            case 217 -> Il(2096605236, var9 ^ -1501664825);
            case 218 -> Il(2096605237, var9 ^ -1998498185);
            case 219 -> Il(2096605238, var9 ^ -1321825970);
            case 220 -> Il(2096605239, var9 ^ 1385838360);
            case 221 -> Il(2096605232, var9 ^ 273167337);
            case 222 -> 3;
            case 223 -> Il(2096605233, var9 ^ -926828318);
            case 224 -> Il(2096605234, var9 ^ 475949564);
            case 225 -> Il(2096605235, var9 ^ 957040011);
            case 226 -> Il(2096605196, var9 ^ -2009988270);
            case 227 -> Il(2096605197, var9 ^ 453075286);
            case 228 -> Il(2096605198, var9 ^ -350522131);
            case 229 -> Il(2096605199, var9 ^ -876610775);
            case 230 -> Il(2096605192, var9 ^ -946642427);
            case 231 -> Il(2096605193, var9 ^ -1223527940);
            case 232 -> Il(2096605194, var9 ^ -1255408613);
            case 233 -> Il(2096605195, var9 ^ 748420549);
            case 234 -> Il(2096605188, var9 ^ 1788180145);
            case 235 -> Il(2096605189, var9 ^ 2052771749);
            case 236 -> Il(2096605190, var9 ^ -76726490);
            case 237 -> Il(2096605191, var9 ^ 1494071868);
            case 238 -> 2;
            case 239 -> Il(2096605184, var9 ^ 1893736876);
            case 240 -> Il(2096605185, var9 ^ 114970042);
            case 241 -> Il(2096605186, var9 ^ -167547615);
            case 242 -> Il(2096605187, var9 ^ -405610621);
            case 243 -> Il(2096605212, var9 ^ -53781048);
            case 244 -> Il(2096605213, var9 ^ -1081307222);
            case 245 -> Il(2096605214, var9 ^ -2099093039);
            case 246 -> Il(2096605215, var9 ^ 789183811);
            case 247 -> Il(2096605208, var9 ^ 1011492242);
            case 248 -> Il(2096605209, var9 ^ 640405787);
            case 249 -> Il(2096605210, var9 ^ -1278658748);
            case 250 -> Il(2096605211, var9 ^ -887216755);
            case 251 -> Il(2096605204, var9 ^ -1754010503);
            case 252 -> Il(2096605205, var9 ^ -877293736);
            case 253 -> Il(2096605206, var9 ^ 642098626);
            case 254 -> Il(2096605207, var9 ^ -1235606933);
            default -> Il(2096605200, var9 ^ 1249853656);
         };
         int var5 = (var1 & Il(2096605201, var9 ^ -14266146)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & Il(2096605202, var9 ^ 1077676241)) >>> Il(2096605203, var9 ^ -2031074638)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & Il(2096605676, var9 ^ 747968804);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & Il(2096605677, var9 ^ 505085712);
            }
         }

         ll[var2] = new String(var3).intern();
      }

      return ll[var2];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var18 = 1175352030;
      char[] var9 = "ᠩ".toCharArray();
      byte var14 = -1;
      String var8 = "䏶䌳䏲䎎䎾䌑䏍䎣䎼䌣䎞䎽䎸䍓䎅䏢䏀䌿䎆䏥䌸䌻䌮䌷䌶䎗䏴䏷䍫䍾䌂䏡䏱䏷䎲䎞䍬䎃䏕䏕䎞䌡䏪䏱䏎䎱䎮䌒䌺䍐䎹䍦䍣䎪䎧䍯䍂䍥䍖䏦䍵䎜䏥䌠䏼䏇䏱䏾䌜䌾䌰䌚䍷䍢䌻䏭䏬䎹䍯䌆䍓䌵䌠䌌䌛䍸䌺䌅䍟䎥䎙䌺䌛䍃䎩䎐䍿䌯䍚䍰䎿䌶䎠䎇䎏";
      short var7 = 6208;
      String[] var10 = new String[var9.length];

      while (true) {
         int var11 = 0;
         int var12 = 0;
         int var13 = 0;
         if (var14 == 0) {
            llI = var10;
            lll = new Object[var10.length];
            int var21 = 0;
            int var10001 = 0;
            byte[] var10002 = "L\u0085öÊ\u000bn®tt\u009b|Ø\u009b\bÀj@Æö±ýI\u009e¦½\u0003|r\u0095¾øU\u0087p\u009e?\u0002Õj¶8\u001a\u0098ÿ\u0086º:Öµ#Q\n\\^U\u0015\u0004\u0011ú\tL^\u0011\u0083øþÍ@\u001c`j\u0089\u0019^±C\u0012\u0015\u009e\u0011ä\u00adSOýMú>pø\u0005\u0081\u000b\u0094<\u0094r*\u0095[«ã³\u001a%\u0000Þ\u0011\u0085Ã¥ íØi1VTÞ\u0002ä3\u0007J;;R-I$\u0019\u0090\u0010à©q+[\u0091%\u0002 \u008d³6ÿ\u0094/\u0081;ÿ¦ø\u0090A\u0012Úm1öè\n¶Ø´¹C¦\u0083\nU\u0006\u001esÁQÈù\u0095DÙãÆ÷pÀZ9cJ¨Xíµ\u00892«\u0014\u0006ëË\u0096¢\\ÓI\u001eÈ3\u001c\u008d]¦¯Ã*Y¶9\u0018°\u009b\fû\u008e+È@ ÀjM-Ô ½Ý£Ì¥2×£\u008f\u009fà<÷wÍ\u0085\u001aÈéî!Ä£â°\".\u0083ë.^8í\u008b\u000fhùÆÔ\u0084\u000fÒ\\\u0086úU_\n¦Ò\u0019\u0093\u0086ªWü?\u0018\u0004ÂHØ\u008aÙ6\u009a× ö\u0012a\u0081\u000e*«\u0010\u00ad¼\u0091ìå\u00816Ðª]Ï¢\u0011\u0084ÊÅ\u009e\nÔ\u008c°\u0012\u0091°õaAS\n\u0084õ\u008cn¸\u0003\u009a\u0015ÝôOã=L·fV\u001f óeÛkr²\n\u008a\u009e\u001c\u0087\u009cÚHªPØ\u0082\u0089{óV\u001f4jýÀ$I´îÉ\u0001_>â>\u008c\u0092\u0012\u0019¹\u000f5î½9©\u008b\u0017\u001aðÚ§d¿¸C8mãwþ5¼\u0088äé0\u000e\u0002ã\u0091³1ÂJ\u008aæÇÑ\u0097¸\u00adÍ*ðdÍ9½\u009a$Þ1\u0091º\u0014C8ÙÝ\u0090\u000by*d\u008f\u0000é\u008a\u00ad\u0083ofÖ7çCÈ\u0017» Kc\u0084'\u0086Ch¡ü4Á\u0018a~\u008aRr\u0096\u0099\u009c\u008d\u000b\u0091\u001cFK\r .u\u009fr:Ñ\u001bRè[Áþ.z\u0083jÿ\b\u008fY\u0098,>k»\u0084\u0097©Ú®\u0081l£ãî\u009a\u008bá\u0007~ý^¾r\u008a\u001a#\u008e;ÕwH\u0005Ê\u001c\u0004\u0095®\u0089ÅU-\u007f\u00962¾&\u001bp\u008a\u0018fÇff±G»ÂLüß\u00adìø¢Q\u0089Ûà·\"\u0096Ïÿp\u0018h¢/§è\u0083È\u001eÓ-£\u0010ÊÉ\u0083ÆDÚPpb\fØ*\u001c\u001fdþ¬e\u0098\u0099µ\u009bÄ\u001aóì>\u0093F\u009bÒ\nÍy+e_ò\tºí\u0087\u0094¶\bßl²Vß¶\u0004\\\u0015\u0000X0Þ\u0090\u000e¨\t\u008dÓ»Õ\u000e/*$\u0091làU\u009e\u001d½×*ã0\r,T\u0099\u0014#í\u009eGöo¡\u0097Á}\u0016æ\u0085-Ò°`\u0085{¾ã\u001b\u0000å\u001e\u0090ääñ0ï.5Å\u007f\u0094\u0007/\u0006\u0080ò¿ÎéãÃ\u008dÉÁ\u0090§Q\u0090rPË§yèPT\u001dâ\u0015¶ä³\u009dV\u0089\rV\u0083!°~ÁtMâª\u008dm\u001d5ÇõeJÐÛÕÕõ!\u0006m8\u0093«*l\u009eúÆÎÝ\u0089N¢ª¶æïÞO¿.µ\u0006\u000bsï¤%Kc\u0090ÿ\u009e\u0019\u008f\u009e\u008a,Z×¯æý\"^\u0099ÐÄ4h\u0099Qø³Ý!'\u001a,S¤\u0098è\u0096\u0004ÎÆ\t;\u0018ÿÞü¡\u001crBÐ^ ^î\u0086)Õ\u0092R¶\u0004\u009dwã0hÆÚv\u008fUé\u0014#¥ó\u0001o\u0085W\u0089!\u0089{\u0017xùú\u0003ïûÃ\u008e\u0010bs\u0090\u0090$}\u001bò4²º\u0019µ\u0085M\u0001\u0017åÏª>\bLÍH28\u0010¸ë\u0000k©:ª\u0012²#0ìñdúJÌ\n\u0013Óaá\u008fbr¢PEhÃ¤ìý!Z\u001e\u0085öW\u0098Ù\u009b\u0099è\u0085]ú½h\u00adÈ´ø²WÆ\u0004\u00972Â±Î=þñ+zòÈ\u00180\u0081b}uùPò\u0093Ìëu\u001f\u0099ÎÑâ\u0005îznëð\\\u009fÜSpàÇj³\u009dåá\bö\u0088`,áÒR²¦*@\u0081´uéÎaqk\u00974\u0011/XI\\®ý.¢"
               .getBytes("ISO-8859-1");
            lIl = new int[272];

            int var44;
            do {
               lIl[var21] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ -562886621;
               var21 += 1;
               var44 = var10001 + 4;
               var10001 += 4;
            } while (var44 < var10002.length);

            String[] var5 = new String[2];
            int var3 = 0;
            String var2;
            int var4 = (var2 = lI(466762802, var18 ^ -1773194385)).length();
            int var1 = Il(2096605678, var18 ^ -268394312);
            int var0 = -1;

            while (true) {
               label85: {
                  var21 = Il(2096605679, var18 ^ -710649105);
                  char[] var45 = var2.substring(++var0, var0 + var1).toCharArray();
                  int var55 = var45.length;
                  int var6 = 0;
                  var44 = var21;
                  var34 = var45;
                  var10001 = var55;
                  char[] var64;
                  int var71;
                  if (var55 <= 1) {
                     var64 = var45;
                     var55 = var21;
                     var71 = var6;
                  } else {
                     var44 = var21;
                     var10001 = var55;
                     if (var55 <= var6) {
                        break label85;
                     }

                     var64 = var45;
                     var55 = var21;
                     var71 = var6;
                  }

                  while (true) {
                     var64[var71] = (char)(var64[var71] ^ var55 ^ switch (var6 % Il(2096605672, var18 ^ -183512615)) {
                        case 0 -> Il(2096605673, var18 ^ -349626148);
                        case 1 -> Il(2096605674, var18 ^ 1208309762);
                        case 2 -> Il(2096605675, var18 ^ 1908810435);
                        case 3 -> Il(2096605668, var18 ^ -92451283);
                        case 4 -> Il(2096605669, var18 ^ 2069454534);
                        case 5 -> Il(2096605670, var18 ^ 1237786250);
                        default -> Il(2096605671, var18 ^ 1542720729);
                     });
                     var6++;
                     if (var44 == 0) {
                        var71 = var44;
                        var64 = var34;
                        var55 = var44;
                     } else {
                        if (var10001 <= var6) {
                           break;
                        }

                        var64 = var34;
                        var55 = var44;
                        var71 = var6;
                     }
                  }
               }

               String var48 = new String(var34).intern();
               byte var28 = -1;
               var5[var3++] = var48;
               if ((var0 += var1) >= var4) {
                  IIl = var5;
                  ll = new String[2];
                  return;
               }

               var1 = var2.charAt(var0);
            }
         }

         do {
            var13 = var9[var11] ^ var7;
            char[] var15 = var8.substring(var12, var12 + var13).toCharArray();
            int var16 = 0;

            do {
               short var17 = switch (var16 % 6) {
                  default -> 77;
                  case 1 -> 246;
                  case 2 -> 52;
                  case 3 -> 140;
                  case 4 -> 89;
                  case 5 -> 120;
               };
               var15[var16] = (char)(var15[var16] ^ var17);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   private void l(class_310 var1, class_304 var2, boolean var3, boolean var4, class_304 var5, boolean var6, boolean var7) {
      String[] var10000 = IIllllIl.IIIIl();
      IlIlIIII var9 = IlIlIIII.llI();
      String[] var8 = var10000;
      if (var9 != null) {
         if (var3 && var6) {
            var9.ll(this, var1, var2, var4);
            var9.ll(this, var1, var5, var7);
            if (var8 == null) {
               return;
            }
         }

         var9.IIII(this, var1, var2);
         var9.IIII(this, var1, var5);
      }
   }

   private static int Il(int var0, int var1) {
      int var2 = lIl[var0 ^ 2096605420] ^ var1 ^ var0;
      var2 += 5175;
      var2 += 20795;
      var2 += 21000;
      var2 += 49242;
      var2 += 38919;
      var2 -= 35662;
      var2 ^= 19443;
      return var2 - 47936;
   }

   private static String lI(int var0, int var1) {
      int var3 = var0 ^ 466762802;
      char[] var4 = llI[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])lll[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         lll[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -145279781;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 12;
            case 1 -> 98;
            case 2 -> 36;
            case 3 -> 179;
            case 4 -> 51;
            case 5 -> 195;
            case 6 -> 78;
            case 7 -> 118;
            case 8 -> 2;
            case 9 -> 12;
            case 10 -> 80;
            case 11 -> 121;
            case 12 -> 24;
            case 13 -> 24;
            case 14 -> 128;
            case 15 -> 78;
            case 16 -> 72;
            case 17 -> 46;
            case 18 -> 73;
            case 19 -> 211;
            case 20 -> 117;
            case 21 -> 96;
            case 22 -> 71;
            case 23 -> 31;
            case 24 -> 48;
            case 25 -> 60;
            case 26 -> 158;
            case 27 -> 168;
            case 28 -> 15;
            case 29 -> 113;
            case 30 -> 119;
            case 31 -> 95;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static boolean II(boolean var0, boolean var1, long var2, long var4, boolean var6) {
      if (var0 && var1) {
         boolean var7 = var2 > var4;
         return var6 ? var7 : !var7;
      } else {
         return var6 ? var0 : var1;
      }
   }

   @Override
   public void llIl() {
      class_310 var1 = class_310.method_1551();
      if (var1 != null && var1.field_1690 != null) {
         IlIlIIII var2 = IlIlIIII.llI();
         if (var2 != null) {
            var2.IlI(this, var1);
         }

         class_315 var3 = var1.field_1690;
         var3.field_1913.method_23481(IIll.IlIllll(var1, var3.field_1913));
         var3.field_1849.method_23481(IIll.IlIllll(var1, var3.field_1849));
         var3.field_1894.method_23481(IIll.IlIllll(var1, var3.field_1894));
         var3.field_1881.method_23481(IIll.IlIllll(var1, var3.field_1881));
      }
   }

   public IIIIlI() {
      super(
         IlIIllIII.Ill(I(Il(2096605664, -1118049208 ^ 166623076), Il(2096605665, -1118049208 ^ -1950895464))),
         lllIIlIl.III,
         IlIIllIII.Ill(I(Il(2096605666, -1118049208 ^ -814194872), Il(2096605667, -1118049208 ^ 1323119700)))
      );
   }

   @Override
   public void llIIII(class_310 var1) {
      if (var1 != null && var1.field_1724 != null && var1.field_1690 != null && var1.field_1755 == null) {
         IIIIIllII var2 = IIIIIllII.III();
         if (var2 == null || var2.II() == null || var2.II().IIIllI() == null || !var2.II().IIIllI().llI()) {
            class_315 var3 = var1.field_1690;
            boolean var4 = IIll.IlIllll(var1, var3.field_1913);
            boolean var5 = IIll.IlIllll(var1, var3.field_1849);
            boolean var6 = IIll.IlIllll(var1, var3.field_1894);
            boolean var7 = IIll.IlIllll(var1, var3.field_1881);
            long var8 = System.currentTimeMillis();
            if (var4 && !this.I) {
               this.IlI = var8;
            }

            if (var5 && !this.lI) {
               this.III = var8;
            }

            if (var6 && !this.lII) {
               this.Il = var8;
            }

            if (var7 && !this.II) {
               this.Ill = var8;
            }

            this.I = var4;
            this.lI = var5;
            this.lII = var6;
            this.II = var7;
            boolean var10 = II(var4, var5, this.IlI, this.III, true);
            boolean var11 = II(var4, var5, this.IlI, this.III, false);
            boolean var12 = II(var7, var6, this.Ill, this.Il, false);
            boolean var13 = II(var7, var6, this.Ill, this.Il, true);
            this.l(var1, var3.field_1913, var4, var10, var3.field_1849, var5, var11);
            this.l(var1, var3.field_1894, var6, var12, var3.field_1881, var7, var13);
            var3.field_1913.method_23481(var10);
            var3.field_1849.method_23481(var11);
            var3.field_1894.method_23481(var12);
            var3.field_1881.method_23481(var13);
         }
      }
   }

   @Override
   public void IlIII() {
      this.I = false;
      this.lI = false;
      this.lII = false;
      this.II = false;
      this.IlI = 0L;
      this.III = 0L;
      this.Il = 0L;
      this.Ill = 0L;
   }
}
