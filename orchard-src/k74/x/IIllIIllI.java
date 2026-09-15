package k74.x;

import java.awt.Color;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_124;
import net.minecraft.class_1291;
import net.minecraft.class_1292;
import net.minecraft.class_1293;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_327;
import net.minecraft.class_332;
import net.minecraft.class_4081;
import net.minecraft.class_7923;

@Environment(EnvType.CLIENT)
public final class IIllIIllI extends IlIIIIIIl implements IIIIIlII {
   private final IIIlIIlll II;
   private static final double Il = 7.0;
   private final IIlIII lI;
   private double ll;
   private static final double III = 5.8;
   private static final int[] IIIIl;
   private static final String[] IIl;
   private static final double IlI = 5.0;
   private double Ill;
   private static final double lII = 0.9;
   private long lIl;
   private static final String[] llI;
   private final IIlIII lll;
   private final IIlIII IIII;
   private final lllIIlII IIIl;
   private static final double IIlI = 0.78;
   private final IIlIII IIll;
   private static final String[] IIIlI;
   private static final double IlII = 138.0;
   private static final double IlIl = 6.0;
   private final lllIIlII IllI;
   private static final double Illl = 2.3;
   private static final double lIII = 200.0;
   private final lllIIlII lIIl;
   private static String[] lIlI;
   private static final IIIllIIl lIll;
   private final lllIIlII llII;
   private static final int llIl = 96;
   private final IIlIII lllI;
   private final IIlIII llll;
   private static final Object[] IIIll;
   private static final double I = 0.18;
   private final Map<String, IlIl> IIIII;

   private static Throwable I(Throwable var0) {
      return var0;
   }

   @Override
   public void Illl(class_332 var1, int var2, int var3, float var4, boolean var5) {
      this.IIlI(var1, true, var5);
   }

   @Override
   public void llll(class_332 var1, int var2, int var3, float var4) {
      try {
         if (!this.IIIIlIl()) {
            return;
         }
      } catch (MatchException var5) {
         throw I(var5);
      }

      this.IIlI(var1, false, false);
   }

   private static String lIll(int var0, int var1) {
      int var3 = var0 ^ -1843454545;
      char[] var4 = IIIlI[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])IIIll[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         IIIll[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -1278364826;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 131;
            case 1 -> 99;
            case 2 -> 190;
            case 3 -> 168;
            case 4 -> 171;
            case 5 -> 232;
            case 6 -> 91;
            case 7 -> 68;
            case 8 -> 7;
            case 9 -> 74;
            case 10 -> 127;
            case 11 -> 19;
            case 12 -> 18;
            case 13 -> 223;
            case 14 -> 155;
            case 15 -> 61;
            case 16 -> 211;
            case 17 -> 91;
            case 18 -> 165;
            case 19 -> 146;
            case 20 -> 10;
            case 21 -> 207;
            case 22 -> 207;
            case 23 -> 138;
            case 24 -> 103;
            case 25 -> 86;
            case 26 -> 124;
            case 27 -> 100;
            case 28 -> 30;
            case 29 -> 70;
            case 30 -> 212;
            case 31 -> 26;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   @Override
   public void IIIII(class_332 var1, int var2, int var3, float var4) {
      this.IIlI(var1, false, false);
   }

   private static String l(class_1293 var0, class_310 var1) {
      int var6 = 1025995434;

      try {
         if (var0.method_48559()) {
            return IlIIllIII.lI(lIlI[lIlI(1136784084, var6 ^ 351491002)]);
         }
      } catch (Throwable var7) {
         throw I(var7);
      }

      try {
         class_1293 var10000;
         float var10001;
         try {
            var10000 = var0;
            var10001 = 1.0F;
            if (var1.field_1687 == null) {
               return class_1292.method_5577(var0, 1.0F, 20.0F).getString();
            }
         } catch (Throwable var8) {
            throw I(var8);
         }

         return class_1292.method_5577(var10000, var10001, var1.field_1687.method_54719().method_54748()).getString();
      } catch (Throwable var9) {
         int var3 = Math.max(0, var0.method_5584() / lIlI(1136784085, var6 ^ 1340181231));
         int var4 = var3 / lIlI(1136784086, var6 ^ 1350953500);
         int var5 = var3 % lIlI(1136784087, var6 ^ -805292318);
         return String.format(IlIIllIII.lI(lIlI[lIlI(1136784080, var6 ^ -1297918347)]), var4, var5);
      }
   }

   private static int II(IlIl var0, IlIl var1) {
      int var2 = Integer.compare(var1.Il.Ill, var0.Il.Ill);

      try {
         if (var2 != 0) {
            return var2;
         }
      } catch (MatchException var3) {
         throw I(var3);
      }

      return Integer.compare(var0.ll, var1.ll);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private int Il(class_1291 var1) {
      int var6 = 1670801254;
      String[] var2 = IIllllIl.IIIIl();
      if (this.llII.IllI()) {
         class_4081 var69 = var1.method_18792();

         try {
            switch (IIIlIlllI.I[var69.ordinal()]) {
               case 1:
                  return lIlI(1136784081, var6 ^ 1952126588);
               case 2:
                  return lIlI(1136784082, var6 ^ -1410671133);
               case 3:
                  return lIlI(1136784083, var6 ^ 716854685);
               default:
                  throw new MatchException(null, null);
            }
         } catch (MatchException var7) {
            throw I(var7);
         }
      } else {
         class_2960 var3 = class_7923.field_41174.method_10221(var1);

         label654: {
            try {
               if (var3 == null || !var3.method_12836().equals(IlIIllIII.lI(lIlI[lIlI(1136784092, var6 ^ 145391101)]))) {
                  break label654;
               }
            } catch (MatchException var68) {
               throw I(var68);
            }

            String var4 = var3.method_12832();
            int var5 = -1;

            label655: {
               label656: {
                  label657: {
                     label658: {
                        label659: {
                           label660: {
                              label661: {
                                 label662: {
                                    label663: {
                                       label664: {
                                          label665: {
                                             label666: {
                                                label667: {
                                                   label668: {
                                                      label669: {
                                                         label670: {
                                                            label671: {
                                                               label672: {
                                                                  label673: {
                                                                     label674: {
                                                                        label675: {
                                                                           label676: {
                                                                              label677: {
                                                                                 label678: {
                                                                                    label679: {
                                                                                       label680: {
                                                                                          label681: {
                                                                                             label682: {
                                                                                                label683: {
                                                                                                   label684: {
                                                                                                      try {
                                                                                                         switch (var4.hashCode()) {
                                                                                                            case -1781004809:
                                                                                                               break label672;
                                                                                                            case -1259714865:
                                                                                                               break label664;
                                                                                                            case -1248513139:
                                                                                                               break label679;
                                                                                                            case -1206104397:
                                                                                                               break label669;
                                                                                                            case -1130648966:
                                                                                                               break label680;
                                                                                                            case -1083012136:
                                                                                                               break label684;
                                                                                                            case -1052579859:
                                                                                                               break label677;
                                                                                                            case -982749432:
                                                                                                               break label667;
                                                                                                            case -840436278:
                                                                                                               break label659;
                                                                                                            case -787569677:
                                                                                                               break label666;
                                                                                                            case -736186929:
                                                                                                               break label668;
                                                                                                            case -606546085:
                                                                                                               break label657;
                                                                                                            case -306977811:
                                                                                                               break label661;
                                                                                                            case -251715502:
                                                                                                               break label678;
                                                                                                            case -230491182:
                                                                                                               break label663;
                                                                                                            case -84082086:
                                                                                                               break label673;
                                                                                                            case 3333041:
                                                                                                               break label660;
                                                                                                            case 99050123:
                                                                                                               break label683;
                                                                                                            case 109641799:
                                                                                                               if (!var4.equals(
                                                                                                                  lIlI[lIlI(1136784093, var6 ^ 2049467933)]
                                                                                                               )) {
                                                                                                                  break label655;
                                                                                                               }
                                                                                                               break;
                                                                                                            case 121707317:
                                                                                                               break label662;
                                                                                                            case 151619372:
                                                                                                               break label671;
                                                                                                            case 845042688:
                                                                                                               break label665;
                                                                                                            case 1032770443:
                                                                                                               break label676;
                                                                                                            case 1254846936:
                                                                                                               break label682;
                                                                                                            case 1623775714:
                                                                                                               break label674;
                                                                                                            case 1741803213:
                                                                                                               break label656;
                                                                                                            case 1749920239:
                                                                                                               break label670;
                                                                                                            case 1791316033:
                                                                                                               break label681;
                                                                                                            case 1863800889:
                                                                                                               break label675;
                                                                                                            case 2139296513:
                                                                                                               break label658;
                                                                                                            default:
                                                                                                               break label655;
                                                                                                         }
                                                                                                      } catch (MatchException var67) {
                                                                                                         throw I(var67);
                                                                                                      }

                                                                                                      var5 = 0;

                                                                                                      try {
                                                                                                         if (var2 == null) {
                                                                                                            break label655;
                                                                                                         }
                                                                                                      } catch (MatchException var66) {
                                                                                                         throw I(var66);
                                                                                                      }
                                                                                                   }

                                                                                                   try {
                                                                                                      if (!var4.equals(lIlI[lIlI(1136784094, var6 ^ 931749402)])
                                                                                                         )
                                                                                                       {
                                                                                                         break label655;
                                                                                                      }
                                                                                                   } catch (MatchException var65) {
                                                                                                      throw I(var65);
                                                                                                   }

                                                                                                   var5 = 1;

                                                                                                   try {
                                                                                                      if (var2 == null) {
                                                                                                         break label655;
                                                                                                      }
                                                                                                   } catch (MatchException var64) {
                                                                                                      throw I(var64);
                                                                                                   }
                                                                                                }

                                                                                                try {
                                                                                                   if (!var4.equals(lIlI[lIlI(1136784095, var6 ^ 564097540)])) {
                                                                                                      break label655;
                                                                                                   }
                                                                                                } catch (MatchException var63) {
                                                                                                   throw I(var63);
                                                                                                }

                                                                                                var5 = 2;

                                                                                                try {
                                                                                                   if (var2 == null) {
                                                                                                      break label655;
                                                                                                   }
                                                                                                } catch (MatchException var62) {
                                                                                                   throw I(var62);
                                                                                                }
                                                                                             }

                                                                                             try {
                                                                                                if (!var4.equals(lIlI[lIlI(1136784088, var6 ^ 625259262)])) {
                                                                                                   break label655;
                                                                                                }
                                                                                             } catch (MatchException var61) {
                                                                                                throw I(var61);
                                                                                             }

                                                                                             var5 = 3;

                                                                                             try {
                                                                                                if (var2 == null) {
                                                                                                   break label655;
                                                                                                }
                                                                                             } catch (MatchException var60) {
                                                                                                throw I(var60);
                                                                                             }
                                                                                          }

                                                                                          try {
                                                                                             if (!var4.equals(lIlI[lIlI(1136784089, var6 ^ 67783217)])) {
                                                                                                break label655;
                                                                                             }
                                                                                          } catch (MatchException var59) {
                                                                                             throw I(var59);
                                                                                          }

                                                                                          var5 = 4;

                                                                                          try {
                                                                                             if (var2 == null) {
                                                                                                break label655;
                                                                                             }
                                                                                          } catch (MatchException var58) {
                                                                                             throw I(var58);
                                                                                          }
                                                                                       }

                                                                                       try {
                                                                                          if (!var4.equals(lIlI[lIlI(1136784090, var6 ^ -1865906994)])) {
                                                                                             break label655;
                                                                                          }
                                                                                       } catch (MatchException var57) {
                                                                                          throw I(var57);
                                                                                       }

                                                                                       var5 = 5;

                                                                                       try {
                                                                                          if (var2 == null) {
                                                                                             break label655;
                                                                                          }
                                                                                       } catch (MatchException var56) {
                                                                                          throw I(var56);
                                                                                       }
                                                                                    }

                                                                                    try {
                                                                                       if (!var4.equals(lIlI[lIlI(1136784091, var6 ^ -414779190)])) {
                                                                                          break label655;
                                                                                       }
                                                                                    } catch (MatchException var55) {
                                                                                       throw I(var55);
                                                                                    }

                                                                                    var5 = lIlI(1136784068, var6 ^ 497487165);

                                                                                    try {
                                                                                       if (var2 == null) {
                                                                                          break label655;
                                                                                       }
                                                                                    } catch (MatchException var54) {
                                                                                       throw I(var54);
                                                                                    }
                                                                                 }

                                                                                 try {
                                                                                    if (!var4.equals(lIlI[lIlI(1136784069, var6 ^ -336388923)])) {
                                                                                       break label655;
                                                                                    }
                                                                                 } catch (MatchException var53) {
                                                                                    throw I(var53);
                                                                                 }

                                                                                 var5 = lIlI(1136784070, var6 ^ -2130577333);

                                                                                 try {
                                                                                    if (var2 == null) {
                                                                                       break label655;
                                                                                    }
                                                                                 } catch (MatchException var52) {
                                                                                    throw I(var52);
                                                                                 }
                                                                              }

                                                                              try {
                                                                                 if (!var4.equals(lIlI[lIlI(1136784071, var6 ^ -717269257)])) {
                                                                                    break label655;
                                                                                 }
                                                                              } catch (MatchException var51) {
                                                                                 throw I(var51);
                                                                              }

                                                                              var5 = lIlI(1136784064, var6 ^ 191848245);

                                                                              try {
                                                                                 if (var2 == null) {
                                                                                    break label655;
                                                                                 }
                                                                              } catch (MatchException var50) {
                                                                                 throw I(var50);
                                                                              }
                                                                           }

                                                                           try {
                                                                              if (!var4.equals(lIlI[lIlI(1136784065, var6 ^ 1430550097)])) {
                                                                                 break label655;
                                                                              }
                                                                           } catch (MatchException var49) {
                                                                              throw I(var49);
                                                                           }

                                                                           var5 = lIlI(1136784066, var6 ^ 1057480268);

                                                                           try {
                                                                              if (var2 == null) {
                                                                                 break label655;
                                                                              }
                                                                           } catch (MatchException var48) {
                                                                              throw I(var48);
                                                                           }
                                                                        }

                                                                        try {
                                                                           if (!var4.equals(lIlI[lIlI(1136784067, var6 ^ 677423872)])) {
                                                                              break label655;
                                                                           }
                                                                        } catch (MatchException var47) {
                                                                           throw I(var47);
                                                                        }

                                                                        var5 = lIlI(1136784076, var6 ^ -1927112730);

                                                                        try {
                                                                           if (var2 == null) {
                                                                              break label655;
                                                                           }
                                                                        } catch (MatchException var46) {
                                                                           throw I(var46);
                                                                        }
                                                                     }

                                                                     try {
                                                                        if (!var4.equals(lIlI[lIlI(1136784077, var6 ^ -2142556177)])) {
                                                                           break label655;
                                                                        }
                                                                     } catch (MatchException var45) {
                                                                        throw I(var45);
                                                                     }

                                                                     var5 = lIlI(1136784078, var6 ^ -1318557547);

                                                                     try {
                                                                        if (var2 == null) {
                                                                           break label655;
                                                                        }
                                                                     } catch (MatchException var44) {
                                                                        throw I(var44);
                                                                     }
                                                                  }

                                                                  try {
                                                                     if (!var4.equals(lIlI[lIlI(1136784079, var6 ^ -1472637146)])) {
                                                                        break label655;
                                                                     }
                                                                  } catch (MatchException var43) {
                                                                     throw I(var43);
                                                                  }

                                                                  var5 = lIlI(1136784072, var6 ^ -1483732985);

                                                                  try {
                                                                     if (var2 == null) {
                                                                        break label655;
                                                                     }
                                                                  } catch (MatchException var42) {
                                                                     throw I(var42);
                                                                  }
                                                               }

                                                               try {
                                                                  if (!var4.equals(lIlI[lIlI(1136784073, var6 ^ 541738157)])) {
                                                                     break label655;
                                                                  }
                                                               } catch (MatchException var41) {
                                                                  throw I(var41);
                                                               }

                                                               var5 = lIlI(1136784074, var6 ^ -939521395);

                                                               try {
                                                                  if (var2 == null) {
                                                                     break label655;
                                                                  }
                                                               } catch (MatchException var40) {
                                                                  throw I(var40);
                                                               }
                                                            }

                                                            try {
                                                               if (!var4.equals(lIlI[lIlI(1136784075, var6 ^ -1436859010)])) {
                                                                  break label655;
                                                               }
                                                            } catch (MatchException var39) {
                                                               throw I(var39);
                                                            }

                                                            var5 = lIlI(1136784116, var6 ^ -1644274080);

                                                            try {
                                                               if (var2 == null) {
                                                                  break label655;
                                                               }
                                                            } catch (MatchException var38) {
                                                               throw I(var38);
                                                            }
                                                         }

                                                         try {
                                                            if (!var4.equals(lIlI[lIlI(1136784117, var6 ^ 2110754228)])) {
                                                               break label655;
                                                            }
                                                         } catch (MatchException var37) {
                                                            throw I(var37);
                                                         }

                                                         var5 = lIlI(1136784118, var6 ^ -1578921091);

                                                         try {
                                                            if (var2 == null) {
                                                               break label655;
                                                            }
                                                         } catch (MatchException var36) {
                                                            throw I(var36);
                                                         }
                                                      }

                                                      try {
                                                         if (!var4.equals(lIlI[lIlI(1136784119, var6 ^ -1227338760)])) {
                                                            break label655;
                                                         }
                                                      } catch (MatchException var35) {
                                                         throw I(var35);
                                                      }

                                                      var5 = lIlI(1136784112, var6 ^ -1792870074);

                                                      try {
                                                         if (var2 == null) {
                                                            break label655;
                                                         }
                                                      } catch (MatchException var34) {
                                                         throw I(var34);
                                                      }
                                                   }

                                                   try {
                                                      if (!var4.equals(lIlI[lIlI(1136784113, var6 ^ 913022430)])) {
                                                         break label655;
                                                      }
                                                   } catch (MatchException var33) {
                                                      throw I(var33);
                                                   }

                                                   var5 = lIlI(1136784114, var6 ^ -1022686821);

                                                   try {
                                                      if (var2 == null) {
                                                         break label655;
                                                      }
                                                   } catch (MatchException var32) {
                                                      throw I(var32);
                                                   }
                                                }

                                                try {
                                                   if (!var4.equals(lIlI[lIlI(1136784115, var6 ^ -866608433)])) {
                                                      break label655;
                                                   }
                                                } catch (MatchException var31) {
                                                   throw I(var31);
                                                }

                                                var5 = lIlI(1136784124, var6 ^ 881874584);

                                                try {
                                                   if (var2 == null) {
                                                      break label655;
                                                   }
                                                } catch (MatchException var30) {
                                                   throw I(var30);
                                                }
                                             }

                                             try {
                                                if (!var4.equals(lIlI[lIlI(1136784125, var6 ^ -1539262713)])) {
                                                   break label655;
                                                }
                                             } catch (MatchException var29) {
                                                throw I(var29);
                                             }

                                             var5 = lIlI(1136784126, var6 ^ 564984967);

                                             try {
                                                if (var2 == null) {
                                                   break label655;
                                                }
                                             } catch (MatchException var28) {
                                                throw I(var28);
                                             }
                                          }

                                          try {
                                             if (!var4.equals(lIlI[lIlI(1136784127, var6 ^ 831984582)])) {
                                                break label655;
                                             }
                                          } catch (MatchException var27) {
                                             throw I(var27);
                                          }

                                          var5 = lIlI(1136784120, var6 ^ -960095517);

                                          try {
                                             if (var2 == null) {
                                                break label655;
                                             }
                                          } catch (MatchException var26) {
                                             throw I(var26);
                                          }
                                       }

                                       try {
                                          if (!var4.equals(lIlI[lIlI(1136784121, var6 ^ -144339197)])) {
                                             break label655;
                                          }
                                       } catch (MatchException var25) {
                                          throw I(var25);
                                       }

                                       var5 = lIlI(1136784122, var6 ^ 1474942507);

                                       try {
                                          if (var2 == null) {
                                             break label655;
                                          }
                                       } catch (MatchException var24) {
                                          throw I(var24);
                                       }
                                    }

                                    try {
                                       if (!var4.equals(lIlI[lIlI(1136784123, var6 ^ 13392814)])) {
                                          break label655;
                                       }
                                    } catch (MatchException var23) {
                                       throw I(var23);
                                    }

                                    var5 = lIlI(1136784100, var6 ^ -31723451);

                                    try {
                                       if (var2 == null) {
                                          break label655;
                                       }
                                    } catch (MatchException var22) {
                                       throw I(var22);
                                    }
                                 }

                                 try {
                                    if (!var4.equals(lIlI[lIlI(1136784101, var6 ^ -323649202)])) {
                                       break label655;
                                    }
                                 } catch (MatchException var21) {
                                    throw I(var21);
                                 }

                                 var5 = lIlI(1136784102, var6 ^ 2117392901);

                                 try {
                                    if (var2 == null) {
                                       break label655;
                                    }
                                 } catch (MatchException var20) {
                                    throw I(var20);
                                 }
                              }

                              try {
                                 if (!var4.equals(lIlI[lIlI(1136784103, var6 ^ -2120855436)])) {
                                    break label655;
                                 }
                              } catch (MatchException var19) {
                                 throw I(var19);
                              }

                              var5 = lIlI(1136784096, var6 ^ 1322701971);

                              try {
                                 if (var2 == null) {
                                    break label655;
                                 }
                              } catch (MatchException var18) {
                                 throw I(var18);
                              }
                           }

                           try {
                              if (!var4.equals(lIlI[lIlI(1136784097, var6 ^ 1820249019)])) {
                                 break label655;
                              }
                           } catch (MatchException var17) {
                              throw I(var17);
                           }

                           var5 = lIlI(1136784098, var6 ^ 432207718);

                           try {
                              if (var2 == null) {
                                 break label655;
                              }
                           } catch (MatchException var16) {
                              throw I(var16);
                           }
                        }

                        try {
                           if (!var4.equals(lIlI[lIlI(1136784099, var6 ^ -1020112731)])) {
                              break label655;
                           }
                        } catch (MatchException var15) {
                           throw I(var15);
                        }

                        var5 = lIlI(1136784108, var6 ^ 1620472859);

                        try {
                           if (var2 == null) {
                              break label655;
                           }
                        } catch (MatchException var14) {
                           throw I(var14);
                        }
                     }

                     try {
                        if (!var4.equals(lIlI[lIlI(1136784109, var6 ^ 382763168)])) {
                           break label655;
                        }
                     } catch (MatchException var13) {
                        throw I(var13);
                     }

                     var5 = lIlI(1136784110, var6 ^ 1788259318);

                     try {
                        if (var2 == null) {
                           break label655;
                        }
                     } catch (MatchException var12) {
                        throw I(var12);
                     }
                  }

                  try {
                     if (!var4.equals(lIlI[lIlI(1136784111, var6 ^ 2035042219)])) {
                        break label655;
                     }
                  } catch (MatchException var11) {
                     throw I(var11);
                  }

                  var5 = lIlI(1136784104, var6 ^ 77165758);

                  try {
                     if (var2 == null) {
                        break label655;
                     }
                  } catch (MatchException var10) {
                     throw I(var10);
                  }
               }

               try {
                  if (!var4.equals(lIlI[lIlI(1136784105, var6 ^ 2100283773)])) {
                     break label655;
                  }
               } catch (MatchException var9) {
                  throw I(var9);
               }

               var5 = lIlI(1136784106, var6 ^ -747854312);
            }

            try {
               switch (var5) {
                  case 0:
                     return lIlI(1136784107, var6 ^ -664940087);
                  case 1:
                     return lIlI(1136784020, var6 ^ 818001979);
                  case 2:
                     return lIlI(1136784021, var6 ^ 639825442);
                  case 3:
                     return lIlI(1136784022, var6 ^ -1996263930);
                  case 4:
                     return lIlI(1136784023, var6 ^ -1737846751);
                  case 5:
                     return lIlI(1136784016, var6 ^ -2095266485);
                  case 6:
                     return lIlI(1136784017, var6 ^ 856219060);
                  case 7:
                     return lIlI(1136784018, var6 ^ 1156659858);
                  case 8:
                     return lIlI(1136784019, var6 ^ 1249132207);
                  case 9:
                     return lIlI(1136784028, var6 ^ -740204386);
                  case 10:
                     return lIlI(1136784029, var6 ^ -1994976394);
                  case 11:
                     return lIlI(1136784030, var6 ^ 456672791);
                  case 12:
                     return lIlI(1136784031, var6 ^ 622564185);
                  case 13:
                     return lIlI(1136784024, var6 ^ 1211932791);
                  case 14:
                     return lIlI(1136784025, var6 ^ -1155108000);
                  case 15:
                     return lIlI(1136784026, var6 ^ -1907094777);
                  case 16:
                     return lIlI(1136784027, var6 ^ -714266781);
                  case 17:
                     return lIlI(1136784004, var6 ^ 1994759609);
                  case 18:
                     return lIlI(1136784005, var6 ^ 1437260438);
                  case 19:
                     return lIlI(1136784006, var6 ^ 1043660912);
                  case 20:
                     return lIlI(1136784007, var6 ^ 61505693);
                  case 21:
                     return lIlI(1136784000, var6 ^ -1136059501);
                  case 22:
                     return lIlI(1136784001, var6 ^ 968446618);
                  case 23:
                     return lIlI(1136784002, var6 ^ -429298258);
                  case 24:
                     return lIlI(1136784003, var6 ^ 1519502744);
                  case 25:
                     return lIlI(1136784012, var6 ^ 1027676746);
                  case 26:
                     return lIlI(1136784013, var6 ^ 777071406);
                  case 27:
                     return lIlI(1136784014, var6 ^ 1344113700);
                  case 28:
                     return lIlI(1136784015, var6 ^ 1863533540);
                  case 29:
                     return lIlI(1136784008, var6 ^ 1101759994);
               }
            } catch (MatchException var8) {
               throw I(var8);
            }
         }

         int var70 = var1.method_5556();
         return lIlI(1136784009, var6 ^ -1418951692) | var70 & lIlI(1136784010, var6 ^ 499767061);
      }
   }

   @Override
   public double ll() {
      return this.IIll.IllI();
   }

   private static String lI(char[] var0, long var1, int var3) {
      int var4 = lIlI(1136784011, -328010197 ^ -1473399428) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & lIlI(1136784052, -328010197 ^ -1023252849);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private void III(class_332 var1, class_327 var2, String var3, double var4, double var6, int var8, double var9) {
      IlIIlllIl.IIllll(var1);

      try {
         IlIIlllIl.IlIIlI(var1, var4, var6);
         IlIIlllIl.llIIIl(var1, var9, var9);
         IlIIlllIl.IIll(var1, var2, var3, 0.0, 0.0, var8);
      } finally {
         IlIIlllIl.lIIIll(var1);
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = -270877476;
      String[] var15 = new String[2];
      short var18 = 13287;
      int var16 = 0;
      int var14 = "ʃ鮴Ꚑ翡Ꮳᔅﺰ\u12b6栾菙\uf645で乼\ue69b㚣宱ꂬ쭤죃怪ꘝﹰ꛰薸囈ᶉ騿磥ᅡ䰈醧䗯\u16fd骚䜸ｴમ蚎\uf7f0褦綞폨秫춘嶨δꞮ駋\uf6feၑ察\udf24ꏺꦡ붌釔ꈯ㰯쇯ꙶ봟菠⧗\u0cd8\ufb11鵷㙅ꗈ仡ヤ\ue6af榜蓝뎊欋ࣚ㝵췏跢蜩❏㠂멼댝汐\udd6b홐\ud9f6\ua7da睈ᥔ\ueddeఌ➑橲췻ί㳋夞苷꒛됳团㋽찆ퟛ\udcc1褆똉ٝ裠騟ḇ䰽㴺虈ᕷ蜿䜩袭阫⏥앸咐ᷘ㺄ꁇ霴侵氩ַ캾㡲ᓥ吹设䀮荾㒗垓羹\ud8f2\u3101넿᥀쾗ᙨ\u243e챾瓙᷑剆ｗᄛ陼頚뵹᭬ńɸக郼뛳︒ᨠঀ\ue54f痎儽ꜰ罨肈곑䆕\udc12䤘奛跁敶⩱ᘪ쿍럤ￋ0聘⺊礣᪘쨵阰ヂ҂蟵ᓿ蛀輻鍯韇\udbaaᬑ䰕侐责開䰡\ue505餋桴쩲㘲옇䂣㠦騺ᝥ첊渖Ѵ熱웽䙁묌蔀럣沛撴錚훬켫瀭悖譫賑ᚧ嚐⚜莶\uda3e騈\ue84b쉩㘞薫⧎ⶑ趔疰롲냟\ueecf㈗颹ꨫ趠昲拶ꌔ直禐퀈櫆\ueb35䐽䭿茨ה튯燔뗺\ue937ཝ㒥㮃༻⽲ᙚ\uf74e뽰ﳊત聨홭瘤䪢苓䣰묪⽠쿿뚟韥뤀뻎ᚤ囃㛡ൡ䔴筗躣茀첤\uf07c菝賋䡳韚穹㺧锰贝뤗类戗\u00ad헓僺娘\uf7e5༥\ue89cᛲ峦坦秪있钶盱ꠕ珈\u0a53皭ᤅ᠅᥍\uf8cc䪽㛲慥幅急긞\uf153몎넂\u175b崜耉鿱揍薸엀䯇\udb50\ue5d4跲蚦酞\ud9b1\udc0dಖ诟㥔⎳㯽셥☐⣴⟤玪\u0ffb\uecb9菠뙄\ue40f쟁禩\uebb9\ufdc8혴䚛㪷\uddea铈蝸回冩馊\ue910ᘤ覗\ue352멋흪ᣡ擤뤨迸➑閖圊䍱馼\udffe莈ḳ눬膩㪻勦沠䕼呞쳰윢衬─\udb3f\uf64b\uf61b괋得㾷馸茘맛⪶伓쳅퓄ຘㇽ喰丅쌭鼄눇뛡ᣯ矷ഔ᎐耀哌蛵䍶攧ﴽ愍쾖된\ue5a9൫龍\u1778噆짒⮡יִ\u31e9ꁾऑ\ue056踖쐻\u0ba5\ue25b렦팉襰ሴड़쾃㢑뽡屢湡鴏銆胘広皔듰ᘒ濊ꄎ䨛㯲ᅝ衡蠥荑\u0098Ⴇ\uee7d\ud861觌텚쑺沭땄\ue013뚏璏耨ᐍ\ud87e売怿麥㚘\ue52bፖ\ue581\ude23활䏋ࡋ謪鵮̵ᚉ㽓뷎菨゛\uecf6ك\udf7d\udd54쇋㐹莰獚イ㲶\udc47맂곕\u0a43愹\ueba7죵ᐞ\uec7a㙄⒍숐ﵳ\uf449膈磝\ue8f0謹抙맮ᗺ\ue610缓㹋\ue467\uf4d3ᴊᚫꏀ鉊ે㼼肩䕓㪘屮✄彮齙⹌½⭫墲혬ヾ\udffb᧷༉낌ҳ않䡺茡㒧\ue6c5砑\uf162ቛ灻틨骻緊렢粶赃妓덐횵탳䄯ꉔ뵿蝙\ud894紩\ud8fe㾓爸䯾檹\ufb0c듰楜嘱휮集\ueb60扏鞐\uf642\ue1e4缱陷\uf65eᮘ䧾ﻒ\ue7e0ຣ۸荆㷐펹浝\ua6fc殜츭\u0015䡽渓郥↧垹ꗭ䁰\uf078梐宦愼雧瞊聊꙾\u20f3Ὀ⨩巟봲閫"
         .length();
      int var17 = 0;
      String var13 = "ʃ鮴Ꚑ翡Ꮳᔅﺰ\u12b6栾菙\uf645で乼\ue69b㚣宱ꂬ쭤죃怪ꘝﹰ꛰薸囈ᶉ騿磥ᅡ䰈醧䗯\u16fd骚䜸ｴમ蚎\uf7f0褦綞폨秫춘嶨δꞮ駋\uf6feၑ察\udf24ꏺꦡ붌釔ꈯ㰯쇯ꙶ봟菠⧗\u0cd8\ufb11鵷㙅ꗈ仡ヤ\ue6af榜蓝뎊欋ࣚ㝵췏跢蜩❏㠂멼댝汐\udd6b홐\ud9f6\ua7da睈ᥔ\ueddeఌ➑橲췻ί㳋夞苷꒛됳团㋽찆ퟛ\udcc1褆똉ٝ裠騟ḇ䰽㴺虈ᕷ蜿䜩袭阫⏥앸咐ᷘ㺄ꁇ霴侵氩ַ캾㡲ᓥ吹设䀮荾㒗垓羹\ud8f2\u3101넿᥀쾗ᙨ\u243e챾瓙᷑剆ｗᄛ陼頚뵹᭬ńɸக郼뛳︒ᨠঀ\ue54f痎儽ꜰ罨肈곑䆕\udc12䤘奛跁敶⩱ᘪ쿍럤ￋ0聘⺊礣᪘쨵阰ヂ҂蟵ᓿ蛀輻鍯韇\udbaaᬑ䰕侐责開䰡\ue505餋桴쩲㘲옇䂣㠦騺ᝥ첊渖Ѵ熱웽䙁묌蔀럣沛撴錚훬켫瀭悖譫賑ᚧ嚐⚜莶\uda3e騈\ue84b쉩㘞薫⧎ⶑ趔疰롲냟\ueecf㈗颹ꨫ趠昲拶ꌔ直禐퀈櫆\ueb35䐽䭿茨ה튯燔뗺\ue937ཝ㒥㮃༻⽲ᙚ\uf74e뽰ﳊત聨홭瘤䪢苓䣰묪⽠쿿뚟韥뤀뻎ᚤ囃㛡ൡ䔴筗躣茀첤\uf07c菝賋䡳韚穹㺧锰贝뤗类戗\u00ad헓僺娘\uf7e5༥\ue89cᛲ峦坦秪있钶盱ꠕ珈\u0a53皭ᤅ᠅᥍\uf8cc䪽㛲慥幅急긞\uf153몎넂\u175b崜耉鿱揍薸엀䯇\udb50\ue5d4跲蚦酞\ud9b1\udc0dಖ诟㥔⎳㯽셥☐⣴⟤玪\u0ffb\uecb9菠뙄\ue40f쟁禩\uebb9\ufdc8혴䚛㪷\uddea铈蝸回冩馊\ue910ᘤ覗\ue352멋흪ᣡ擤뤨迸➑閖圊䍱馼\udffe莈ḳ눬膩㪻勦沠䕼呞쳰윢衬─\udb3f\uf64b\uf61b괋得㾷馸茘맛⪶伓쳅퓄ຘㇽ喰丅쌭鼄눇뛡ᣯ矷ഔ᎐耀哌蛵䍶攧ﴽ愍쾖된\ue5a9൫龍\u1778噆짒⮡יִ\u31e9ꁾऑ\ue056踖쐻\u0ba5\ue25b렦팉襰ሴड़쾃㢑뽡屢湡鴏銆胘広皔듰ᘒ濊ꄎ䨛㯲ᅝ衡蠥荑\u0098Ⴇ\uee7d\ud861觌텚쑺沭땄\ue013뚏璏耨ᐍ\ud87e売怿麥㚘\ue52bፖ\ue581\ude23활䏋ࡋ謪鵮̵ᚉ㽓뷎菨゛\uecf6ك\udf7d\udd54쇋㐹莰獚イ㲶\udc47맂곕\u0a43愹\ueba7죵ᐞ\uec7a㙄⒍숐ﵳ\uf449膈磝\ue8f0謹抙맮ᗺ\ue610缓㹋\ue467\uf4d3ᴊᚫꏀ鉊ે㼼肩䕓㪘屮✄彮齙⹌½⭫墲혬ヾ\udffb᧷༉낌ҳ않䡺茡㒧\ue6c5砑\uf162ቛ灻틨骻緊렢粶赃妓덐횵탳䄯ꉔ뵿蝙\ud894紩\ud8fe㾓爸䯾檹\ufb0c듰楜嘱휮集\ueb60扏鞐\uf642\ue1e4缱陷\uf65eᮘ䧾ﻒ\ue7e0ຣ۸荆㷐펹浝\ua6fc殜츭\u0015䡽渓郥↧垹ꗭ䁰\uf078梐宦愼雧瞊聊꙾\u20f3Ὀ⨩巟봲閫";

      do {
         char var19 = var13.charAt(var17);
         int var21 = 0;
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 5) {
               default -> 69;
               case 1 -> 243;
               case 2 -> 245;
               case 3 -> 180;
               case 4 -> 53;
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

      IIIlI = var15;
      IIIll = new Object[var15.length];
      int var9 = 209661521;
      byte[] var7 = "\u0099\u0095(^Â\u0087òrÝã\u0092\u008a]fNu?Å-\u0094§K\u0000æx\u0010îoùmìFÛ}\u0010×©ÿ\u000b1ä^34òH\u001f|ö\u0093ßÓ×Ý'LC\u001fêÿ4\u0091\u0095³Îpc+8$q\u0098RÖ\u0096^\u0006è;½Ø¸1\r\u0086\u0093\u001b1ìÐ°wû·ÆX^õùüS\u009cB\u009db¿\u0006\u008c{î:JtGf3ó\u009d)ì\u001b×dºy\u008c(<N)0n®\u0018àÏr4ýpe\u000f&©Fõ\u00946å¼ð \u0010Üdè\u001f\u008f÷\u0082çG;úw\u0097Ú`ò{\u0091æâ@~\u009c\u0015\u0011w\u009f$²â\t\u0084>»TÓ\u001b6É-Ì\u009d#?bì2\u00adã·`RA=3\u009d\u0001º\u009b¿©¦®Ê\u0015\u0099m\u0010å=´³A\u0019qÅ\u0007íÐ¹AÆ\u009fª\u009b*³×N\u001aº®ø¤\u0018\u0000»È\u001f\u000buéiãa~äõô¾gZÔ\u0098@K¼ë0PÊµ\u0014àÞ³à\u0097á\\\u0084\u0099#Yì\u00006òk[À[ ÈïïY÷ÌË\u008d\u009bÔ\u009f[hw\u0014\u0089]c·Ö\u0006ÝAG¥-\u0014É\u0086º¼\u0097í\u008em©Ð}&\u0091o\u009e$Ãêo<Ð5¿\nü\u00897¨Pï\u0096|¾ýºë+\u0083Káá½Ä%×\u0093|ã9y»í\u00ad1\u001f±Ô<ÔZê\u009f1\u009a=³\u008d~Í%\u0085ôt8]éïË©¤Êm\u0018\u008a\u000e/\u007fûl\u001a\u0081=w\u0083Z\u0010\u001eâ\u0095Û±\u0017ä(+\u0005ÝRÔms3cð1üÆR\u009f÷ó\u008cq\u0018\u008c\u008båÆÝÏ'\u009fr*õæ\u0003\u0096¤ë\u009fÿ\u0019åWì`\u0016Ýí\u001cÅ\u008a\u0001\u0002Â]¨r0\u001aç§()\u0017%1ï\u0011_<\u0003cr\u0005\u0004ÍÑ\u0081þê\u0080è\u008c, \u00875¸d\u008e6·ÍÂyP×§^\u001cLö\u0012¢\bü\u007f\u0012q/ç\u0089w#6ã\u0081K«\u007f\u0083\u0003fbà{\u000f\u0006LÎèfux.c¢k\u009b\u008dý\u0085·aGÞpà?²Z5ñÓ+ÿÃ\u008bÖÐ\u0092\u0098ÖI\u0081÷ÉVíj[iSlr\u0080¨v7´oð.°ÌF\bñÆ\u008bbØ´à\u009bÿ¨QÐ¼\rµK<T\fk÷\u007f/o\u000b?\u0012\"é?ÑÇ2ÎÚÿF\r\u009aK×ô\u001fÏ\u001eÛ¿Õz?è!ôt×)\u0094O¿h«q¸!<\fVO§\u0091\u0006^Ø\u0092Õq\u0094\u0006o,i±²\u001e»\u0091\u0017b¹k±\"zòÊf{t\u0005B\u0002\u009eu\u0018L»0\u008am\u0097k\u000f\u0005L\u0096N\u0082ç¿\u0088\rTa\u000e\u0017\u0016^\u0085M\u0019&DyD&¥Íî\u0081v$Hv\u0087)³eb\u0003Hi9o\u008bÅÇ\u001c=ÅÕx?\u0082\u0013.\u0012\u0094FzÅn\u0018hñM#*\u0011~z)ã2\u008d\u0014fZ\u0013Eà\u0091n\u0000ñ\u009cÚÆ}Zp??L\u0018 \u0080ä\n²\u0080w\u0093·y¬±W8}+ûüþ\u009cz¾\u0016`¶Z¼mÌ£lãlýù\u001aµ÷õ²a÷Ò³\u0013\u008dÆ×eÈk7F\u0095_¸|#\u008aT3\\XÊ{CC+7Ï\u008cà\u0087l«³àE\u008f\u0014òô\u0090`fû\u0004é'\u008cýY¯ÞtLÝ\u008báb¢'^à \u008a{Ê\u0087!\u0097\u00116\u0014\u0091Þ\u0088ª\u0090ßÀ\u009bänY¾±ã3>\u009aÓ\u0084'sÁ\u00adû{Ëñ~Ð21\u0007+\u001eè) ·0U?\u0095¬¤t\u0013\u0088å¥î3\u000fÿc.TÔÄ\u009a\u0099vÑ\u00ad\\ßQÉ\u0087Ag\u008b*ßÕ\u0095\\§\u0094\u0093ð\u009fÍ®Ú\u0006¿åáL¸ÎòòÎáFÐ\u000bÏé]\u0000û\u000f\u00ad¸|-æ\u001c\u0001\u0013p5\u0093ù\u0004:N¡ñÑTY\u0001éÏ¶_q¦\u0097vÚ®s\u0015×ë\u0088\u009f)]ê\u001eÉ\u008eã`_\u001e\u0012\u0018Þ[ÿý\u008b¨\u0004U«üÅ\u008dCÝG\u00ad\u0004DgÞFTwü;\u001ex\u009cïºèt\u0012\u0087\rÍ\u000fNR\u0089@½Ôy-\u00ad\u009ffB²\u00118\u00061Ð\u009f§ð\\\u0097\u0098\u0099ËJ¹\u001d\u0097ö´íÈ\u008c\u000bÍÜ£±<fÛ\u0017øÜ)føROÇä\u0094\u001a\u0092Mé-ì5Æ\u0012\u0084\u0080\u000f±+1\u007fé**V8\u0017óz\u0013\u0098ôñôËÌ@lX9\u008e$sÈ\u0091\b9ÌçariW\u0005\u0095°iUbÂ\u0093Òµ´û\u008d\u0019\u009b¶ë<\u0007rÈ©Ïqñ®Ô\u0086Y,îKú5R\u008e\f<ël\u00017\f\u0094ÓBX\u000f@\u009c\u0096Ãò/\u0090\u009aPªÐã¬6#ö5|ÑÅ\u0004qòÚËµ\u008dÚ!¦%\u0019\bì_õO´Ô»h\u0087U%¦¥ôµ\u001dj¬ïµ\u007fDz¸¾Ì\\B\u0083&\u008f¨\u00886D&¸l\u0099*\u001e%Å#\u0013áHÕ+Ì }\u00ad7ZÆ\u001c.ù{ûY÷,[\u0081Â$$]±\u008bÐ{lxví{¬\u0019Q$=\u0010RÁl[\u0017D¦\u0015È,\u008c\u0011âC¿F´\u009f\u0085¯È¾\u001eãïñhc¥ÈÏ»gÞ8Eß9Óä\u00938ÿ3bõÊ£m\u009e¤¡X\u009e\n\u0095ò\u0019;bajYú¤Á³ëu|zá\u007fF\u0015ií¨}\u0011\u0018\u008f\u000e\u008c\u0081¼åX\u0003Wñ«\u0080Æ¯ ,\u0099¹\\ÔWûIK\u0094ÓÁ\u0093áÏÇ!\u009f\u001b´ÃG×v\u0019ÖYG\u0088¯ÏÓÍ\u0003ÑÇ.\u0088í\u009b\u008aäI\u0081\u0007\u0014Ð¸$@\u0017L3$\u0090èàEª]¥\\Ô¾\f.:]ËVÏj¹\u0085Ð2sÍ\u008dÌÞ\u0004Òõ\u007f\u0010\u00ad-cüû3h*kúà\u0093¯S#s`\u009d9õÞ#¤\u0085Ú\u0087,\f¥\u0014\u009fB?e\u0082S,²Ù!¦\u0018\u0089Ò>/#\u008b\u0019\u0097\u0001Ð\u0084\u001dÙã+\u000eÒ\u0083\u0014Æiã\u0007þ²ÓX\u0000\u001eó:\tÆò`Ôº\u0091ý:cÎi¼ì \u0081v\u0091ö.ít\b\u0098\u009c!aZL\u001bñ\u009d\u0015«ÑÐ\u009eúÝ\b\f\u0098Ò{'\u001a\rÅA\u000fýS\u008c1\u0098Þ\u009bjÔ\u0084¶\u00063¸É4²\u0015aÐy\u0091Hð\u0004Ñ\u0003O>\u0096\u0080y©\u0003MåèbpÃBÈèpÉ\u0003\u001b®~±>Ùr©8Tà}\u0012õ¨\u0098Îò[ø/\u0094 ¢¾\u0005A\u0090+ð«$\u0096X\"t&?4\u0012)w\r\u00053X\u000eMR1½fÉÈ´\u009eaâ\u0018Ñ§0áZ¼ÊpX&\u000ep\u0014e\u0007.ö\u001ewì¬\u0091ç.cU'\u0003)ÌËhÜF \u0017\u0084Ið\u00adì{Fq?Ìg]Ñ\u001eÑÕ£µ^i\u0083ÜO\u0082QgK\u009cdeÿ\u008a&ý\u008d§jí=\u0007»ó\u0003\u0017\u0006\u0011Oü³\u0084|×|\u001d\u0003vEÕýëÚ\u0097GÂ¿\u0099Ð³ð;l\u0093§¢°ý©Ç\u0080Öy\u0086It×A\u0010\u009a\u0095öL¯©ôi¾P2`Ütþ\u0019¿3Åd\u0087\u001aÊ\u001c±\u0015\u009f¡\u000bH5\u0010\u008aoÂp1NvWu:\u0088àFcÉ~Ãã\u0013ñ/u\u0016\u0007ÖHó¿jAVBðY\u001ag\u0084ëK\u0019i)\u009a\u0090\u008e\bqFäÝ\u009d6¼;Ê\u009c\u0084b\u001f\u0086Ü\u0015ï¡Y\u0004DÈ\u0000\u0083éßñªüÓ;',õñ,\u0091\u009eæx\u0096þr0feÒfÚ\u0094\u009fACðÓÒËtûJ\u0019ª\"\u00adëHË\u0000\u0013£\u0084aWoýÆN\"Ì\u0013\u00831fûçÿç\u009a\u0080¢\u0007T\u0002\u0095Åí:M\u0080\rmº\u0006Ðw\u009cöb¼\u001aß}»mBf\u0093ä\u00adÌS\u0013í\u0086¦ÇÒ/§ü\u0083yèZ\u001c'w¹³ön\u00adD)¨\u008d5ÿø¶\u0085\rñ\u001a\u0081\b\u0087å¦[r6ê\"J\u0090?\u0092ä%÷a\u001bPÑïIÐ\u0080\f\u0085l\t\u001a\u00ad*ÃÌ#\u000f\u0098\u0004#Û\u0007\u00808«\\4§s¦n{\u0013b²az\u001d4A9Âÿ\u0081¨\u009e±%è¡\u001e9÷^.E\u0080KÜÅebr9\u0001ûì\u0000k±â\u0084\u009cÕ\u0082Eå½ÉÝ\u009fÄ\u0006\u0092É$¥òÄl\u0093\u0001oèê¶\u0096èr#YÌ\u0004Á§ú#{-<UÍW{Ýù\u0099>B\f3¦\u0098BRÿ©[\u001d2\u0090«4\u008a \u0096\u0095ð5á\u001dÛô$!\u009d¹_N¹6ì¦\u0090\r\u0084\u009d=Ä\rÆâÖ9\u0083Ìº°Äô\u0012¥\rÀ\u009aJb\u0091\u0093k\u008bD\u0096\u009b\u0087É\u0019ç\u000b©j¿±\u0095\n`®#ÄË±\u0098¯&)×Nìå¶ïP¤\u0004\u008cµ(w.ZãÐ&Ådõ±j\u001fÀå§0µ_ÏÅ\u0013G:L\u001c+®0ø\txE¦èÑl(³>)\u007fÆë´\u0019¾\u009eö\u0005r«Ø\u0014\u0091Ç\u008f»j»äù\u0096\f4Èj%î\u0095\u0012Z¡Y\u0087GCå\u0014\u0002tZ¤\u0096\u008e\u001e¹úý{\u0089è\u0011\u0019¦ÎàÃMö¡WÖÙö¯Y0\u0019[E¸_IíÜ!Ö£¦HÕ\u008cÄ\u0003\r\u0091È\u009fx\u0097~>¾\u000br'â´\u000f~Å\u0016T\u0096+ \u000b,¾\u009a\u0013rá\u0081øEñ#ï5/ß34r×\u009b¯O÷LxyÖ³Ã\u007fÐ\u001a\fa\u0016Àê\u0088\u0094\u008dÿC³è>\\\\\u0080\u0012\u0000ÝÍA\u001b\u009d\u0007¥\u00ad7üú\u0093q\u000b¹*\u0013*>T\u007f¦+»[\n"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      IIIIl = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         IIIIl[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var5 = new String[lIlI(1136784037, var23 ^ -1866716704)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = lIll(-1843454545, var23 ^ -574899156)).length();
      int var1 = lIlI(1136784038, var23 ^ 1970164711);
      int var25 = -1;

      label99:
      while (true) {
         int var28 = lIlI(1136784039, var23 ^ -918593923);
         String var10001 = var2.substring(++var25, var25 + var1);
         byte var10002 = -1;

         while (true) {
            label94: {
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
                     break label94;
                  }

                  var56 = var44;
                  var10004 = var28;
                  var10006 = var6;
               }

               while (true) {
                  var56[var10006] = (char)(var56[var10006] ^ var10004 ^ switch (var6 % lIlI(1136784035, var23 ^ 1587115927)) {
                     case 0 -> lIlI(1136784044, var23 ^ -135690497);
                     case 1 -> lIlI(1136784045, var23 ^ -1203986928);
                     case 2 -> lIlI(1136784046, var23 ^ 1220445203);
                     case 3 -> lIlI(1136784047, var23 ^ 1321503378);
                     case 4 -> lIlI(1136784040, var23 ^ 1021948821);
                     case 5 -> lIlI(1136784041, var23 ^ -1840629910);
                     default -> lIlI(1136784042, var23 ^ -1256497658);
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
                     llI = var5;
                     IIl = new String[lIlI(1136784034, var23 ^ -1299746017)];
                     lIlI = new String[lIlI(1136784043, var23 ^ 1941647790)];
                     IlII();
                     lIll = IIIllIIl.II;
                     return;
                  }

                  var1 = var2.charAt(var25);
                  break;
               default:
                  var5[var3++] = var49;
                  if ((var25 += var1) < var4) {
                     var1 = var2.charAt(var25);
                     continue label99;
                  }

                  var4 = (var2 = lIll(-1843454546, var23 ^ -2095005827)).length();
                  var1 = lIlI(1136784032, var23 ^ -1602072399);
                  var25 = -1;
            }

            var28 = lIlI(1136784033, var23 ^ -1275354359);
            var10001 = var2.substring(++var25, var25 + var1);
            var10002 = 0;
         }
      }
   }

   private static int lIlI(int var0, int var1) {
      int var2 = IIIIl[var0 ^ 1136784084] ^ var1 ^ var0;
      var2 += 194;
      var2 -= 49380;
      var2 += 858;
      var2 ^= 15265;
      var2 ^= 35639;
      var2 += 58154;
      return var2 ^ 36019;
   }

   private double IIl() {
      return Math.max(0.4, this.lllI.IllI() / 100.0);
   }

   @Override
   public double IIIl() {
      return this.Ill * this.IIl();
   }

   @Override
   public double IIllI() {
      return this.ll * this.IIl();
   }

   @Override
   public boolean llII(double param1, double param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: dload 1
      // 01: aload 0
      // 02: invokevirtual k74/x/IIllIIllI.lll ()D
      // 05: dcmpl
      // 06: iflt 4b
      // 09: dload 1
      // 0a: aload 0
      // 0b: invokevirtual k74/x/IIllIIllI.lll ()D
      // 0e: aload 0
      // 0f: invokevirtual k74/x/IIllIIllI.IIllI ()D
      // 12: dadd
      // 13: dcmpg
      // 14: ifgt 4b
      // 17: goto 1e
      // 1a: invokestatic k74/x/IIllIIllI.I (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: dload 3
      // 1f: aload 0
      // 20: invokevirtual k74/x/IIllIIllI.ll ()D
      // 23: dcmpl
      // 24: iflt 4b
      // 27: goto 2e
      // 2a: invokestatic k74/x/IIllIIllI.I (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d: athrow
      // 2e: dload 3
      // 2f: aload 0
      // 30: invokevirtual k74/x/IIllIIllI.ll ()D
      // 33: aload 0
      // 34: invokevirtual k74/x/IIllIIllI.IIIl ()D
      // 37: dadd
      // 38: dcmpg
      // 39: ifgt 4b
      // 3c: goto 43
      // 3f: invokestatic k74/x/IIllIIllI.I (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 42: athrow
      // 43: bipush 1
      // 44: goto 4c
      // 47: invokestatic k74/x/IIllIIllI.I (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a: athrow
      // 4b: bipush 0
      // 4c: ireturn
   }

   private lIIIIlll Ill(class_327 var1) {
      int var10 = 1670749997;
      String var2 = IlIIllIII.lI(lIlI[lIlI(1136784053, var10 ^ 1616505054)]);
      String var3 = IlIIllIII.lI(lIlI[lIlI(1136784054, var10 ^ -162438557)]);

      int var10000;
      label17: {
         try {
            if (class_124.field_1075.method_532() == null) {
               var10000 = lIlI(1136784055, var10 ^ -350062760);
               break label17;
            }
         } catch (MatchException var11) {
            throw I(var11);
         }

         var10000 = lIlI(1136784048, var10 ^ 427635425) | class_124.field_1075.method_532();
      }

      int var4 = var10000;
      double var5 = var1.method_1727(var2) * 0.9;
      double var7 = var1.method_1727(var3);
      lIIIIlll var9 = new lIIIIlll(var2, var3, var4, false, 0.6, var5, var7, 0.72, lIlI(1136784049, var10 ^ -1093925376));
      var9.I = this.IIll() + 11.6 + 5.0 + var5 + 7.0 + var7 * 0.78 + this.IIll() + 4.0;
      return var9;
   }

   @Override
   public double lll() {
      return this.lI.IllI();
   }

   @Override
   public void lllI(double var1, double var3) {
      this.lI.Ill(Math.max(0.0, var1));
      this.IIll.Ill(Math.max(0.0, var3));
   }

   private void lII(
      class_332 param1,
      class_327 param2,
      double param3,
      double param5,
      double param7,
      double param9,
      lIIIIlll param11,
      int param12,
      double param13,
      boolean param15
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: dload 13
      // 002: invokestatic k74/x/IlllIII.ll (D)D
      // 005: dstore 16
      // 007: dload 16
      // 009: ldc2_w 0.01
      // 00c: dcmpg
      // 00d: ifgt 015
      // 010: return
      // 011: invokestatic k74/x/IIllIIllI.I (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 014: athrow
      // 015: dconst_1
      // 016: dstore 18
      // 018: dload 16
      // 01a: dload 18
      // 01c: dmul
      // 01d: invokestatic k74/x/IlllIII.ll (D)D
      // 020: dstore 20
      // 022: aload 1
      // 023: getstatic k74/x/IIllIIllI.lIll Lk74/x/IIIllIIl;
      // 026: dload 3
      // 027: dload 5
      // 029: dload 7
      // 02b: dload 9
      // 02d: iload 15
      // 02f: dload 16
      // 031: invokestatic k74/x/IIIlIllII.Ill (Lnet/minecraft/class_332;Lk74/x/IIIllIIl;DDDDZD)V
      // 034: aload 0
      // 035: invokevirtual k74/x/IIllIIllI.IIll ()D
      // 038: dstore 22
      // 03a: dload 3
      // 03b: dload 22
      // 03d: dadd
      // 03e: ldc2_w 5.8
      // 041: dadd
      // 042: dstore 24
      // 044: dload 5
      // 046: dload 9
      // 048: ldc2_w 0.5
      // 04b: dmul
      // 04c: dadd
      // 04d: dstore 26
      // 04f: aload 0
      // 050: getfield k74/x/IIllIIllI.lIIl Lk74/x/lllIIlII;
      // 053: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 056: checkcast java/lang/Boolean
      // 059: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 05c: ifeq 06f
      // 05f: aload 11
      // 061: getfield k74/x/lIIIIlll.Il D
      // 064: ldc2_w 0.78
      // 067: dmul
      // 068: goto 070
      // 06b: invokestatic k74/x/IIllIIllI.I (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06e: athrow
      // 06f: dconst_0
      // 070: dstore 28
      // 072: dload 3
      // 073: dload 7
      // 075: dadd
      // 076: dload 22
      // 078: dsub
      // 079: ldc2_w 4.0
      // 07c: dsub
      // 07d: dstore 30
      // 07f: dload 30
      // 081: dload 28
      // 083: dsub
      // 084: dstore 32
      // 086: dload 24
      // 088: ldc2_w 5.8
      // 08b: dadd
      // 08c: ldc2_w 5.0
      // 08f: dadd
      // 090: dstore 34
      // 092: dload 5
      // 094: dload 9
      // 096: ldc2_w 0.5
      // 099: dmul
      // 09a: dadd
      // 09b: dstore 36
      // 09d: dload 36
      // 09f: aload 2
      // 0a0: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 0a3: pop
      // 0a4: ldc2_w 9.0
      // 0a7: ldc2_w 0.9
      // 0aa: dmul
      // 0ab: ldc2_w 0.5
      // 0ae: dmul
      // 0af: dsub
      // 0b0: dstore 38
      // 0b2: ldc2_w 22.0
      // 0b5: aload 0
      // 0b6: getfield k74/x/IIllIIllI.lIIl Lk74/x/lllIIlII;
      // 0b9: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 0bc: checkcast java/lang/Boolean
      // 0bf: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0c2: ifeq 0e4
      // 0c5: aload 11
      // 0c7: getfield k74/x/lIIIIlll.lI Ljava/lang/String;
      // 0ca: invokevirtual java/lang/String.isEmpty ()Z
      // 0cd: ifne 0e4
      // 0d0: goto 0d7
      // 0d3: invokestatic k74/x/IIllIIllI.I (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d6: athrow
      // 0d7: dload 32
      // 0d9: ldc2_w 7.0
      // 0dc: dsub
      // 0dd: goto 0e6
      // 0e0: invokestatic k74/x/IIllIIllI.I (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e3: athrow
      // 0e4: dload 30
      // 0e6: dload 34
      // 0e8: dsub
      // 0e9: invokestatic java/lang/Math.max (DD)D
      // 0ec: dstore 40
      // 0ee: aload 2
      // 0ef: aload 11
      // 0f1: getfield k74/x/lIIIIlll.ll Ljava/lang/String;
      // 0f4: dload 40
      // 0f6: ldc2_w 0.9
      // 0f9: ddiv
      // 0fa: invokestatic k74/x/IlIIlllIl.llIIl (Lnet/minecraft/class_327;Ljava/lang/String;D)Ljava/lang/String;
      // 0fd: astore 42
      // 0ff: iload 12
      // 101: ldc_w 1136784050
      // 104: ldc_w 2095315465
      // 107: ldc_w -470466071
      // 10a: ixor
      // 10b: invokestatic k74/x/IIllIIllI.lIlI (II)I
      // 10e: ldc2_w 0.72
      // 111: invokestatic k74/x/IllllllI.IIlI (IID)I
      // 114: istore 43
      // 116: iload 43
      // 118: ldc2_w 0.94
      // 11b: dload 20
      // 11d: dmul
      // 11e: invokestatic k74/x/IllllllI.III (ID)I
      // 121: istore 44
      // 123: aload 0
      // 124: aload 1
      // 125: aload 2
      // 126: aload 42
      // 128: dload 34
      // 12a: dload 38
      // 12c: iload 44
      // 12e: ldc2_w 0.9
      // 131: invokevirtual k74/x/IIllIIllI.III (Lnet/minecraft/class_332;Lnet/minecraft/class_327;Ljava/lang/String;DDID)V
      // 134: aload 0
      // 135: getfield k74/x/IIllIIllI.lIIl Lk74/x/lllIIlII;
      // 138: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 13b: checkcast java/lang/Boolean
      // 13e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 141: ifeq 1ba
      // 144: aload 11
      // 146: getfield k74/x/lIIIIlll.lI Ljava/lang/String;
      // 149: ifnull 1ba
      // 14c: goto 153
      // 14f: invokestatic k74/x/IIllIIllI.I (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 152: athrow
      // 153: aload 11
      // 155: getfield k74/x/lIIIIlll.lI Ljava/lang/String;
      // 158: invokevirtual java/lang/String.isEmpty ()Z
      // 15b: ifne 1ba
      // 15e: goto 165
      // 161: invokestatic k74/x/IIllIIllI.I (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 164: athrow
      // 165: aload 11
      // 167: getfield k74/x/lIIIIlll.IIl I
      // 16a: aload 11
      // 16c: getfield k74/x/lIIIIlll.II Z
      // 16f: ifeq 186
      // 172: goto 179
      // 175: invokestatic k74/x/IIllIIllI.I (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 178: athrow
      // 179: ldc2_w 0.96
      // 17c: dload 20
      // 17e: dmul
      // 17f: goto 18c
      // 182: invokestatic k74/x/IIllIIllI.I (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 185: athrow
      // 186: ldc2_w 0.86
      // 189: dload 16
      // 18b: dmul
      // 18c: invokestatic k74/x/IllllllI.III (ID)I
      // 18f: istore 45
      // 191: dload 36
      // 193: aload 2
      // 194: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 197: pop
      // 198: ldc2_w 9.0
      // 19b: ldc2_w 0.78
      // 19e: dmul
      // 19f: ldc2_w 0.5
      // 1a2: dmul
      // 1a3: dsub
      // 1a4: dstore 46
      // 1a6: aload 0
      // 1a7: aload 1
      // 1a8: aload 2
      // 1a9: aload 11
      // 1ab: getfield k74/x/lIIIIlll.lI Ljava/lang/String;
      // 1ae: dload 32
      // 1b0: dload 46
      // 1b2: iload 45
      // 1b4: ldc2_w 0.78
      // 1b7: invokevirtual k74/x/IIllIIllI.III (Lnet/minecraft/class_332;Lnet/minecraft/class_327;Ljava/lang/String;DDID)V
      // 1ba: aload 11
      // 1bc: getfield k74/x/lIIIIlll.IIl I
      // 1bf: ldc_w 1136784051
      // 1c2: ldc_w 2095315465
      // 1c5: ldc_w -691486669
      // 1c8: ixor
      // 1c9: invokestatic k74/x/IIllIIllI.lIlI (II)I
      // 1cc: ldc2_w 0.7
      // 1cf: invokestatic k74/x/IllllllI.IIlI (IID)I
      // 1d2: istore 45
      // 1d4: iload 45
      // 1d6: dload 16
      // 1d8: invokestatic k74/x/IllllllI.III (ID)I
      // 1db: istore 46
      // 1dd: aload 11
      // 1df: getfield k74/x/lIIIIlll.IIl I
      // 1e2: dload 16
      // 1e4: invokestatic k74/x/IllllllI.III (ID)I
      // 1e7: istore 47
      // 1e9: aload 0
      // 1ea: aload 1
      // 1eb: dload 24
      // 1ed: dload 26
      // 1ef: ldc2_w 5.8
      // 1f2: ldc2_w 2.3
      // 1f5: aload 11
      // 1f7: getfield k74/x/lIIIIlll.IlI D
      // 1fa: iload 47
      // 1fc: iload 46
      // 1fe: invokevirtual k74/x/IIllIIllI.lIII (Lnet/minecraft/class_332;DDDDDII)V
      // 201: return
   }

   private static String lIl(class_1293 var0) {
      class_1291 var1 = (class_1291)var0.method_5579().comp_349();
      class_2960 var2 = class_7923.field_41174.method_10221(var1);

      String var10000;
      label17: {
         try {
            if (var2 == null) {
               var10000 = var1.method_5567();
               break label17;
            }
         } catch (MatchException var7) {
            throw I(var7);
         }

         var10000 = var2.toString();
      }

      String var3 = var10000;
      String var10001 = IlIIllIII.lI(lIlI[lIlI(1136784060, -1504205422 ^ -1790133076)]);
      int var6 = var0.method_5578();
      String var5 = var10001;
      return var3 + var5 + var6;
   }

   private List<IlIl> llI(double param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: new java/util/ArrayList
      // 03: dup
      // 04: invokespecial java/util/ArrayList.<init> ()V
      // 07: astore 3
      // 08: aload 0
      // 09: getfield k74/x/IIllIIllI.IIIII Ljava/util/Map;
      // 0c: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 11: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 16: astore 4
      // 18: aload 4
      // 1a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1f: ifeq c9
      // 22: aload 4
      // 24: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 29: checkcast java/util/Map$Entry
      // 2c: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 31: checkcast k74/x/IlIl
      // 34: astore 5
      // 36: aload 5
      // 38: getfield k74/x/IlIl.II Z
      // 3b: ifeq 46
      // 3e: dconst_1
      // 3f: goto 47
      // 42: invokestatic k74/x/IIllIIllI.I (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 45: athrow
      // 46: dconst_0
      // 47: dstore 6
      // 49: aload 5
      // 4b: getfield k74/x/IlIl.II Z
      // 4e: ifeq 5b
      // 51: ldc2_w 0.24
      // 54: goto 5e
      // 57: invokestatic k74/x/IIllIIllI.I (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5a: athrow
      // 5b: ldc2_w 0.18
      // 5e: dstore 8
      // 60: aload 5
      // 62: aload 5
      // 64: getfield k74/x/IlIl.lI D
      // 67: dload 6
      // 69: dload 8
      // 6b: dload 1
      // 6c: invokestatic k74/x/IlllIII.lI (DDDD)D
      // 6f: putfield k74/x/IlIl.lI D
      // 72: aload 5
      // 74: getfield k74/x/IlIl.II Z
      // 77: ifne 9b
      // 7a: aload 5
      // 7c: getfield k74/x/IlIl.lI D
      // 7f: ldc2_w 0.015
      // 82: dcmpg
      // 83: ifgt 9b
      // 86: goto 8d
      // 89: invokestatic k74/x/IIllIIllI.I (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8c: athrow
      // 8d: aload 4
      // 8f: invokeinterface java/util/Iterator.remove ()V 1
      // 94: goto 18
      // 97: invokestatic k74/x/IIllIIllI.I (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9a: athrow
      // 9b: aload 5
      // 9d: getfield k74/x/IlIl.Il Lk74/x/lIIIIlll;
      // a0: ifnull c6
      // a3: aload 5
      // a5: getfield k74/x/IlIl.lI D
      // a8: ldc2_w 0.015
      // ab: dcmpl
      // ac: ifle c6
      // af: goto b6
      // b2: invokestatic k74/x/IIllIIllI.I (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b5: athrow
      // b6: aload 3
      // b7: aload 5
      // b9: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // be: pop
      // bf: goto c6
      // c2: invokestatic k74/x/IIllIIllI.I (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c5: athrow
      // c6: goto 18
      // c9: aload 3
      // ca: areturn
   }

   private static String IIII(int var0) {
      int var1 = 91893269;

      try {
         if (var0 <= 0) {
            return lIlI[lIlI(1136784061, var1 ^ 1471085737)];
         }
      } catch (MatchException var2) {
         throw I(var2);
      }

      try {
         switch (var0) {
            case 1:
               return IlIIllIII.lI(lIlI[1]);
            case 2:
               return IlIIllIII.lI(lIlI[lIlI(1136784062, var1 ^ -1562439884)]);
            case 3:
               return IlIIllIII.lI(lIlI[4]);
            case 4:
               return IlIIllIII.lI(lIlI[lIlI(1136784063, var1 ^ -1327073823)]);
            case 5:
               return IlIIllIII.lI(lIlI[2]);
            case 6:
               return IlIIllIII.lI(lIlI[5]);
            case 7:
               return IlIIllIII.lI(lIlI[lIlI(1136784056, var1 ^ -666364848)]);
            case 8:
               return IlIIllIII.lI(lIlI[lIlI(1136784057, var1 ^ 1158339547)]);
            case 9:
               return IlIIllIII.lI(lIlI[lIlI(1136784058, var1 ^ -408629015)]);
            case 10:
               return IlIIllIII.lI(lIlI[3]);
         }
      } catch (MatchException var3) {
         throw I(var3);
      }

      return String.valueOf(var0);
   }

   private void IIlI(class_332 param1, boolean param2, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 003: astore 4
      // 005: aload 4
      // 007: ifnull 028
      // 00a: aload 4
      // 00c: getfield net/minecraft/class_310.field_1772 Lnet/minecraft/class_327;
      // 00f: ifnull 028
      // 012: goto 019
      // 015: invokestatic k74/x/IIllIIllI.I (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 018: athrow
      // 019: aload 4
      // 01b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 01e: ifnonnull 02d
      // 021: goto 028
      // 024: invokestatic k74/x/IIllIIllI.I (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 027: athrow
      // 028: return
      // 029: invokestatic k74/x/IIllIIllI.I (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02c: athrow
      // 02d: aload 4
      // 02f: getfield net/minecraft/class_310.field_1772 Lnet/minecraft/class_327;
      // 032: astore 5
      // 034: invokestatic java/lang/System.currentTimeMillis ()J
      // 037: lstore 6
      // 039: aload 0
      // 03a: lload 6
      // 03c: invokevirtual k74/x/IIllIIllI.IllI (J)D
      // 03f: dstore 8
      // 041: aload 0
      // 042: getfield k74/x/IIllIIllI.IIIII Ljava/util/Map;
      // 045: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 04a: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 04f: astore 10
      // 051: aload 10
      // 053: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 058: ifeq 070
      // 05b: aload 10
      // 05d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 062: checkcast k74/x/IlIl
      // 065: astore 11
      // 067: aload 11
      // 069: bipush 0
      // 06a: putfield k74/x/IlIl.II Z
      // 06d: goto 051
      // 070: bipush 0
      // 071: istore 10
      // 073: new java/util/ArrayList
      // 076: dup
      // 077: aload 4
      // 079: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 07c: invokevirtual net/minecraft/class_746.method_6026 ()Ljava/util/Collection;
      // 07f: invokespecial java/util/ArrayList.<init> (Ljava/util/Collection;)V
      // 082: astore 11
      // 084: aload 11
      // 086: invokedynamic applyAsInt ()Ljava/util/function/ToIntFunction; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)I, net/minecraft/class_1293.method_5584 ()I, (Lnet/minecraft/class_1293;)I ]
      // 08b: invokestatic java/util/Comparator.comparingInt (Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;
      // 08e: invokeinterface java/util/Comparator.reversed ()Ljava/util/Comparator; 1
      // 093: invokeinterface java/util/List.sort (Ljava/util/Comparator;)V 2
      // 098: aload 11
      // 09a: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 09f: astore 12
      // 0a1: aload 12
      // 0a3: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0a8: ifeq 16d
      // 0ab: aload 12
      // 0ad: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0b2: checkcast net/minecraft/class_1293
      // 0b5: astore 13
      // 0b7: aload 13
      // 0b9: invokestatic k74/x/IIllIIllI.lIl (Lnet/minecraft/class_1293;)Ljava/lang/String;
      // 0bc: astore 14
      // 0be: aload 0
      // 0bf: getfield k74/x/IIllIIllI.IIIII Ljava/util/Map;
      // 0c2: aload 14
      // 0c4: invokedynamic apply ()Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, k74/x/IlIl.<init> (Ljava/lang/String;)V, (Ljava/lang/String;)Lk74/x/IlIl; ]
      // 0c9: invokeinterface java/util/Map.computeIfAbsent (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object; 3
      // 0ce: checkcast k74/x/IlIl
      // 0d1: astore 15
      // 0d3: aload 15
      // 0d5: bipush 1
      // 0d6: putfield k74/x/IlIl.II Z
      // 0d9: aload 15
      // 0db: iload 10
      // 0dd: iinc 10 1
      // 0e0: putfield k74/x/IlIl.ll I
      // 0e3: aload 13
      // 0e5: invokevirtual net/minecraft/class_1293.method_48559 ()Z
      // 0e8: ifeq 0ff
      // 0eb: ldc_w 1136784059
      // 0ee: ldc_w -993906663
      // 0f1: ldc_w 2029201667
      // 0f4: ixor
      // 0f5: invokestatic k74/x/IIllIIllI.lIlI (II)I
      // 0f8: goto 108
      // 0fb: invokestatic k74/x/IIllIIllI.I (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fe: athrow
      // 0ff: bipush 0
      // 100: aload 13
      // 102: invokevirtual net/minecraft/class_1293.method_5584 ()I
      // 105: invokestatic java/lang/Math.max (II)I
      // 108: istore 16
      // 10a: aload 13
      // 10c: invokevirtual net/minecraft/class_1293.method_48559 ()Z
      // 10f: ifeq 12b
      // 112: aload 15
      // 114: ldc_w 1136784036
      // 117: ldc_w -993906663
      // 11a: ldc_w 2137519949
      // 11d: ixor
      // 11e: invokestatic k74/x/IIllIIllI.lIlI (II)I
      // 121: putfield k74/x/IlIl.I I
      // 124: goto 156
      // 127: invokestatic k74/x/IIllIIllI.I (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12a: athrow
      // 12b: iload 16
      // 12d: aload 15
      // 12f: getfield k74/x/IlIl.I I
      // 132: if_icmpgt 144
      // 135: aload 15
      // 137: getfield k74/x/IlIl.I I
      // 13a: ifgt 156
      // 13d: goto 144
      // 140: invokestatic k74/x/IIllIIllI.I (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 143: athrow
      // 144: aload 15
      // 146: bipush 1
      // 147: iload 16
      // 149: invokestatic java/lang/Math.max (II)I
      // 14c: putfield k74/x/IlIl.I I
      // 14f: goto 156
      // 152: invokestatic k74/x/IIllIIllI.I (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 155: athrow
      // 156: aload 15
      // 158: aload 0
      // 159: aload 4
      // 15b: aload 5
      // 15d: aload 13
      // 15f: aload 15
      // 161: getfield k74/x/IlIl.I I
      // 164: invokevirtual k74/x/IIllIIllI.IlIl (Lnet/minecraft/class_310;Lnet/minecraft/class_327;Lnet/minecraft/class_1293;I)Lk74/x/lIIIIlll;
      // 167: putfield k74/x/IlIl.Il Lk74/x/lIIIIlll;
      // 16a: goto 0a1
      // 16d: aload 0
      // 16e: dload 8
      // 170: invokevirtual k74/x/IIllIIllI.llI (D)Ljava/util/List;
      // 173: astore 12
      // 175: aload 12
      // 177: invokeinterface java/util/List.isEmpty ()Z 1
      // 17c: ifeq 1bc
      // 17f: iload 2
      // 180: ifeq 1bc
      // 183: goto 18a
      // 186: invokestatic k74/x/IIllIIllI.I (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 189: athrow
      // 18a: new k74/x/IlIl
      // 18d: dup
      // 18e: getstatic k74/x/IIllIIllI.lIlI [Ljava/lang/String;
      // 191: bipush 0
      // 192: aaload
      // 193: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 196: invokespecial k74/x/IlIl.<init> (Ljava/lang/String;)V
      // 199: astore 13
      // 19b: aload 13
      // 19d: bipush 1
      // 19e: putfield k74/x/IlIl.II Z
      // 1a1: aload 13
      // 1a3: dconst_1
      // 1a4: putfield k74/x/IlIl.lI D
      // 1a7: aload 13
      // 1a9: aload 0
      // 1aa: aload 5
      // 1ac: invokevirtual k74/x/IIllIIllI.Ill (Lnet/minecraft/class_327;)Lk74/x/lIIIIlll;
      // 1af: putfield k74/x/IlIl.Il Lk74/x/lIIIIlll;
      // 1b2: aload 12
      // 1b4: aload 13
      // 1b6: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1bb: pop
      // 1bc: aload 12
      // 1be: invokeinterface java/util/List.isEmpty ()Z 1
      // 1c3: ifeq 1d0
      // 1c6: aload 0
      // 1c7: dconst_0
      // 1c8: putfield k74/x/IIllIIllI.Ill D
      // 1cb: return
      // 1cc: invokestatic k74/x/IIllIIllI.I (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1cf: athrow
      // 1d0: aload 12
      // 1d2: invokedynamic compare ()Ljava/util/Comparator; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;Ljava/lang/Object;)I, k74/x/IIllIIllI.II (Lk74/x/IlIl;Lk74/x/IlIl;)I, (Lk74/x/IlIl;Lk74/x/IlIl;)I ]
      // 1d7: invokeinterface java/util/List.sort (Ljava/util/Comparator;)V 2
      // 1dc: aload 0
      // 1dd: getfield k74/x/IIllIIllI.llll Lk74/x/IIlIII;
      // 1e0: invokevirtual k74/x/IIlIII.IllI ()Ljava/lang/Object;
      // 1e3: checkcast java/lang/Double
      // 1e6: invokevirtual java/lang/Double.doubleValue ()D
      // 1e9: dstore 13
      // 1eb: aload 0
      // 1ec: getfield k74/x/IIllIIllI.IIII Lk74/x/IIlIII;
      // 1ef: invokevirtual k74/x/IIlIII.IllI ()Ljava/lang/Object;
      // 1f2: checkcast java/lang/Double
      // 1f5: invokevirtual java/lang/Double.doubleValue ()D
      // 1f8: dstore 15
      // 1fa: ldc2_w 138.0
      // 1fd: dstore 17
      // 1ff: aload 12
      // 201: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 206: astore 19
      // 208: aload 19
      // 20a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 20f: ifeq 230
      // 212: aload 19
      // 214: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 219: checkcast k74/x/IlIl
      // 21c: astore 20
      // 21e: dload 17
      // 220: aload 20
      // 222: getfield k74/x/IlIl.Il Lk74/x/lIIIIlll;
      // 225: getfield k74/x/lIIIIlll.I D
      // 228: invokestatic java/lang/Math.max (DD)D
      // 22b: dstore 17
      // 22d: goto 208
      // 230: aload 12
      // 232: invokeinterface java/util/List.size ()I 1
      // 237: i2d
      // 238: dload 13
      // 23a: dmul
      // 23b: bipush 0
      // 23c: aload 12
      // 23e: invokeinterface java/util/List.size ()I 1
      // 243: bipush 1
      // 244: isub
      // 245: invokestatic java/lang/Math.max (II)I
      // 248: i2d
      // 249: dload 15
      // 24b: dmul
      // 24c: dadd
      // 24d: dstore 19
      // 24f: aload 0
      // 250: dload 17
      // 252: putfield k74/x/IIllIIllI.ll D
      // 255: aload 0
      // 256: dload 19
      // 258: putfield k74/x/IIllIIllI.Ill D
      // 25b: aload 0
      // 25c: invokevirtual k74/x/IIllIIllI.IIl ()D
      // 25f: dstore 21
      // 261: aload 1
      // 262: invokestatic k74/x/IlIIlllIl.IIllll (Lnet/minecraft/class_332;)V
      // 265: aload 1
      // 266: aload 0
      // 267: getfield k74/x/IIllIIllI.lI Lk74/x/IIlIII;
      // 26a: invokevirtual k74/x/IIlIII.IllI ()Ljava/lang/Object;
      // 26d: checkcast java/lang/Double
      // 270: invokevirtual java/lang/Double.doubleValue ()D
      // 273: aload 0
      // 274: getfield k74/x/IIllIIllI.IIll Lk74/x/IIlIII;
      // 277: invokevirtual k74/x/IIlIII.IllI ()Ljava/lang/Object;
      // 27a: checkcast java/lang/Double
      // 27d: invokevirtual java/lang/Double.doubleValue ()D
      // 280: invokestatic k74/x/IlIIlllIl.IlIIlI (Lnet/minecraft/class_332;DD)V
      // 283: aload 1
      // 284: dload 21
      // 286: dload 21
      // 288: invokestatic k74/x/IlIIlllIl.llIIIl (Lnet/minecraft/class_332;DD)V
      // 28b: dconst_0
      // 28c: dstore 23
      // 28e: aload 0
      // 28f: getfield k74/x/IIllIIllI.II Lk74/x/IIIlIIlll;
      // 292: invokevirtual k74/x/IIIlIIlll.IllI ()Ljava/lang/Object;
      // 295: ifnonnull 2a0
      // 298: bipush -1
      // 299: goto 2ad
      // 29c: invokestatic k74/x/IIllIIllI.I (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29f: athrow
      // 2a0: aload 0
      // 2a1: getfield k74/x/IIllIIllI.II Lk74/x/IIIlIIlll;
      // 2a4: invokevirtual k74/x/IIIlIIlll.IllI ()Ljava/lang/Object;
      // 2a7: checkcast java/awt/Color
      // 2aa: invokevirtual java/awt/Color.getRGB ()I
      // 2ad: istore 25
      // 2af: aload 12
      // 2b1: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 2b6: astore 26
      // 2b8: aload 26
      // 2ba: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2bf: ifeq 306
      // 2c2: aload 26
      // 2c4: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2c9: checkcast k74/x/IlIl
      // 2cc: astore 27
      // 2ce: ldc2_w 138.0
      // 2d1: aload 27
      // 2d3: getfield k74/x/IlIl.Il Lk74/x/lIIIIlll;
      // 2d6: getfield k74/x/lIIIIlll.I D
      // 2d9: invokestatic java/lang/Math.max (DD)D
      // 2dc: dstore 28
      // 2de: aload 0
      // 2df: aload 1
      // 2e0: aload 5
      // 2e2: dconst_0
      // 2e3: dload 23
      // 2e5: dload 28
      // 2e7: dload 13
      // 2e9: aload 27
      // 2eb: getfield k74/x/IlIl.Il Lk74/x/lIIIIlll;
      // 2ee: iload 25
      // 2f0: aload 27
      // 2f2: getfield k74/x/IlIl.lI D
      // 2f5: iload 3
      // 2f6: invokevirtual k74/x/IIllIIllI.lII (Lnet/minecraft/class_332;Lnet/minecraft/class_327;DDDDLk74/x/lIIIIlll;IDZ)V
      // 2f9: dload 23
      // 2fb: dload 13
      // 2fd: dload 15
      // 2ff: dadd
      // 300: dadd
      // 301: dstore 23
      // 303: goto 2b8
      // 306: aload 1
      // 307: invokestatic k74/x/IlIIlllIl.lIIIll (Lnet/minecraft/class_332;)V
      // 30a: goto 316
      // 30d: astore 30
      // 30f: aload 1
      // 310: invokestatic k74/x/IlIIlllIl.lIIIll (Lnet/minecraft/class_332;)V
      // 313: aload 30
      // 315: athrow
      // 316: return
   }

   private double IIll() {
      return Math.max(8.0, this.lll.IllI());
   }

   private static void IlII() {
      int var0 = -1423056938;
      lIlI[0] = lI(lIIl(lIlI(1136783956, var0 ^ -1559749187), lIlI(1136783957, var0 ^ -1398792991)).toCharArray(), 65862L, lIlI(1136783958, var0 ^ 1056311976));
      lIlI[1] = lI(lIIl(lIlI(1136783959, var0 ^ 119563680), lIlI(1136783952, var0 ^ 1184628514)).toCharArray(), 66880L, lIlI(1136783953, var0 ^ -1668641700));
      lIlI[2] = lI(lIIl(lIlI(1136783954, var0 ^ -1843679266), lIlI(1136783955, var0 ^ -118620852)).toCharArray(), 54179L, lIlI(1136783964, var0 ^ -1639519086));
      lIlI[3] = lI(lIIl(lIlI(1136783965, var0 ^ 2039281645), lIlI(1136783966, var0 ^ 488668781)).toCharArray(), 40475L, lIlI(1136783967, var0 ^ -1364899345));
      lIlI[4] = lI(lIIl(lIlI(1136783960, var0 ^ 2026825472), lIlI(1136783961, var0 ^ -1768868332)).toCharArray(), 21094L, lIlI(1136783962, var0 ^ 10432276));
      lIlI[5] = lI(lIIl(lIlI(1136783963, var0 ^ -78437927), lIlI(1136783940, var0 ^ 782046507)).toCharArray(), 79586L, lIlI(1136783941, var0 ^ 666049013));
      lIlI[lIlI(1136783942, var0 ^ -872526094)] = lI(
         lIIl(lIlI(1136783943, var0 ^ 1391295265), lIlI(1136783936, var0 ^ 1300347458)).toCharArray(), 28281L, lIlI(1136783937, var0 ^ 534483529)
      );
      lIlI[lIlI(1136783938, var0 ^ -1681612778)] = lI(
         lIIl(lIlI(1136783939, var0 ^ -1358725892), lIlI(1136783948, var0 ^ 1415533231)).toCharArray(), 64382L, lIlI(1136783949, var0 ^ 882338733)
      );
      lIlI[lIlI(1136783950, var0 ^ -1009240419)] = lI(
         lIIl(lIlI(1136783951, var0 ^ -456867263), lIlI(1136783944, var0 ^ 1486783669)).toCharArray(), 32669L, lIlI(1136783945, var0 ^ 1891272273)
      );
      lIlI[lIlI(1136783946, var0 ^ -334235284)] = lI(
         lIIl(lIlI(1136783947, var0 ^ 273915623), lIlI(1136783988, var0 ^ -229436919)).toCharArray(), 15190L, lIlI(1136783989, var0 ^ -1752808325)
      );
      lIlI[lIlI(1136783990, var0 ^ 1566657627)] = lI("".toCharArray(), 41069L, lIlI(1136783991, var0 ^ -1589697856));
      lIlI[lIlI(1136783984, var0 ^ 95906242)] = lI(
         lIIl(lIlI(1136783985, var0 ^ 1632861108), lIlI(1136783986, var0 ^ -283579828)).toCharArray(), 22898L, lIlI(1136783987, var0 ^ 1189244916)
      );
      lIlI[lIlI(1136783996, var0 ^ -1340248559)] = lI(
         lIIl(lIlI(1136783997, var0 ^ 660658818), lIlI(1136783998, var0 ^ -1124233021)).toCharArray(), 33773L, lIlI(1136783999, var0 ^ -809765741)
      );
      lIlI[lIlI(1136783992, var0 ^ -1888831207)] = lI(
         lIIl(lIlI(1136783993, var0 ^ 1927102172), lIlI(1136783994, var0 ^ -1593976679)).toCharArray(), 84488L, lIlI(1136783995, var0 ^ -1498368709)
      );
      lIlI[lIlI(1136783972, var0 ^ 1637751880)] = lI(
         lIIl(lIlI(1136783973, var0 ^ 1612224196), lIlI(1136783974, var0 ^ 435394764)).toCharArray(), 36408L, lIlI(1136783975, var0 ^ -161081565)
      );
      lIlI[lIlI(1136783968, var0 ^ 1996209444)] = lI(
         lIIl(lIlI(1136783969, var0 ^ 505420474), lIlI(1136783970, var0 ^ -1718988095)).toCharArray(), 2952L, lIlI(1136783971, var0 ^ -2141444366)
      );
      lIlI[lIlI(1136783980, var0 ^ 209357785)] = lI(
         lIIl(lIlI(1136783981, var0 ^ 1450551953), lIlI(1136783982, var0 ^ 1646841403)).toCharArray(), 69232L, lIlI(1136783983, var0 ^ 383331574)
      );
      lIlI[lIlI(1136783976, var0 ^ 1059365854)] = lI(
         lIIl(lIlI(1136783977, var0 ^ 853538503), lIlI(1136783978, var0 ^ 405072781)).toCharArray(), 62089L, lIlI(1136783979, var0 ^ -102574101)
      );
      lIlI[lIlI(1136783892, var0 ^ 122753263)] = lI(
         lIIl(lIlI(1136783893, var0 ^ 1666388447), lIlI(1136783894, var0 ^ -897478666)).toCharArray(), 40937L, lIlI(1136783895, var0 ^ -755727211)
      );
      lIlI[lIlI(1136783888, var0 ^ 1939707932)] = lI(
         lIIl(lIlI(1136783889, var0 ^ 830336397), lIlI(1136783890, var0 ^ 848292061)).toCharArray(), 71692L, lIlI(1136783891, var0 ^ -1578665530)
      );
      lIlI[lIlI(1136783900, var0 ^ 1586250822)] = lI(
         lIIl(lIlI(1136783901, var0 ^ 463278202), lIlI(1136783902, var0 ^ -586033027)).toCharArray(), 4871L, lIlI(1136783903, var0 ^ -1325034650)
      );
      lIlI[lIlI(1136783896, var0 ^ -1142148825)] = lI(
         lIIl(lIlI(1136783897, var0 ^ -1444086961), lIlI(1136783898, var0 ^ -1407844975)).toCharArray(), 54580L, lIlI(1136783899, var0 ^ -2091036545)
      );
      lIlI[lIlI(1136783876, var0 ^ -527422550)] = lI(
         lIIl(lIlI(1136783877, var0 ^ 1641192150), lIlI(1136783878, var0 ^ -1388885059)).toCharArray(), 32519L, lIlI(1136783879, var0 ^ -909900743)
      );
      lIlI[lIlI(1136783872, var0 ^ 2006002729)] = lI(
         lIIl(lIlI(1136783873, var0 ^ -1365547409), lIlI(1136783874, var0 ^ 2057001890)).toCharArray(), 67967L, lIlI(1136783875, var0 ^ -1733680024)
      );
      lIlI[lIlI(1136783884, var0 ^ 2124725603)] = lI(
         lIIl(lIlI(1136783885, var0 ^ 1576651902), lIlI(1136783886, var0 ^ 1733249512)).toCharArray(), 84599L, lIlI(1136783887, var0 ^ -981674139)
      );
      lIlI[lIlI(1136783880, var0 ^ 1613731194)] = lI(
         lIIl(lIlI(1136783881, var0 ^ 748879941), lIlI(1136783882, var0 ^ 1677644207)).toCharArray(), 73834L, lIlI(1136783883, var0 ^ -408430956)
      );
      lIlI[lIlI(1136783924, var0 ^ -375896734)] = lI(
         lIIl(lIlI(1136783925, var0 ^ 2107086599), lIlI(1136783926, var0 ^ 1021344061)).toCharArray(), 6862L, lIlI(1136783927, var0 ^ -847745192)
      );
      lIlI[lIlI(1136783920, var0 ^ -957926299)] = lI(
         lIIl(lIlI(1136783921, var0 ^ -1186214605), lIlI(1136783922, var0 ^ 1142510340)).toCharArray(), 21857L, lIlI(1136783923, var0 ^ 1823950671)
      );
      lIlI[lIlI(1136783932, var0 ^ 762857406)] = lI(
         lIIl(lIlI(1136783933, var0 ^ -1815733164), lIlI(1136783934, var0 ^ -604630833)).toCharArray(), 43105L, lIlI(1136783935, var0 ^ -1726030462)
      );
      lIlI[lIlI(1136783928, var0 ^ 676482230)] = lI(
         lIIl(lIlI(1136783929, var0 ^ -1622409414), lIlI(1136783930, var0 ^ -1231644630)).toCharArray(), 93742L, lIlI(1136783931, var0 ^ -432135081)
      );
      lIlI[lIlI(1136783908, var0 ^ 711720288)] = lI(
         lIIl(lIlI(1136783909, var0 ^ -213537788), lIlI(1136783910, var0 ^ 725204209)).toCharArray(), 34924L, lIlI(1136783911, var0 ^ 230472602)
      );
      lIlI[lIlI(1136783904, var0 ^ -1819708523)] = lI(
         lIIl(lIlI(1136783905, var0 ^ 677606396), lIlI(1136783906, var0 ^ 892890066)).toCharArray(), 17946L, lIlI(1136783907, var0 ^ 170297246)
      );
      lIlI[lIlI(1136783916, var0 ^ -1238365635)] = lI(
         lIIl(lIlI(1136783917, var0 ^ -756298357), lIlI(1136783918, var0 ^ 1874375494)).toCharArray(), 63574L, lIlI(1136783919, var0 ^ -84418799)
      );
      lIlI[lIlI(1136783912, var0 ^ -2003023196)] = lI(
         lIIl(lIlI(1136783913, var0 ^ -1246325391), lIlI(1136783914, var0 ^ -24278843)).toCharArray(), 637L, lIlI(1136783915, var0 ^ 1382870369)
      );
      lIlI[lIlI(1136784340, var0 ^ -97909535)] = lI(
         lIIl(lIlI(1136784341, var0 ^ -729427845), lIlI(1136784342, var0 ^ -530325283)).toCharArray(), 27985L, lIlI(1136784343, var0 ^ -2060536261)
      );
      lIlI[lIlI(1136784336, var0 ^ 444572890)] = lI(
         lIIl(lIlI(1136784337, var0 ^ -2003465889), lIlI(1136784338, var0 ^ 1439522188)).toCharArray(), 33638L, lIlI(1136784339, var0 ^ 1056487589)
      );
      lIlI[lIlI(1136784348, var0 ^ -723874839)] = lI(
         lIIl(lIlI(1136784349, var0 ^ -1107559502), lIlI(1136784350, var0 ^ -1256219346)).toCharArray(), 48306L, lIlI(1136784351, var0 ^ -813893750)
      );
      lIlI[lIlI(1136784344, var0 ^ 1183238740)] = lI(
         lIIl(lIlI(1136784345, var0 ^ -1785728410), lIlI(1136784346, var0 ^ -92202670)).toCharArray(), 80086L, lIlI(1136784347, var0 ^ 822193457)
      );
      lIlI[lIlI(1136784324, var0 ^ -1284996819)] = lI(
         lIIl(lIlI(1136784325, var0 ^ -408354772), lIlI(1136784326, var0 ^ 970316769)).toCharArray(), 95891L, lIlI(1136784327, var0 ^ 906626024)
      );
      lIlI[lIlI(1136784320, var0 ^ 1327179960)] = lI(
         lIIl(lIlI(1136784321, var0 ^ 85201311), lIlI(1136784322, var0 ^ -1585131120)).toCharArray(), 59850L, lIlI(1136784323, var0 ^ -1502672588)
      );
      lIlI[lIlI(1136784332, var0 ^ 1430150564)] = lI(
         lIIl(lIlI(1136784333, var0 ^ -1497828263), lIlI(1136784334, var0 ^ 1225543549)).toCharArray(), 46218L, lIlI(1136784335, var0 ^ 467075125)
      );
      lIlI[lIlI(1136784328, var0 ^ 716983110)] = lI(
         lIIl(lIlI(1136784329, var0 ^ -349168954), lIlI(1136784330, var0 ^ -2102925481)).toCharArray(), 19612L, lIlI(1136784331, var0 ^ 933427982)
      );
      lIlI[lIlI(1136784372, var0 ^ -157001543)] = lI(
         lIIl(lIlI(1136784373, var0 ^ -693096052), lIlI(1136784374, var0 ^ 655003260)).toCharArray(), 35095L, lIlI(1136784375, var0 ^ -2041801412)
      );
      lIlI[lIlI(1136784368, var0 ^ -482436240)] = lI(
         lIIl(lIlI(1136784369, var0 ^ -485409), lIlI(1136784370, var0 ^ 1451602220)).toCharArray(), 92929L, lIlI(1136784371, var0 ^ -870850129)
      );
      lIlI[lIlI(1136784380, var0 ^ -1687984645)] = lI(
         lIIl(lIlI(1136784381, var0 ^ 705919773), lIlI(1136784382, var0 ^ 825928801)).toCharArray(), 42135L, lIlI(1136784383, var0 ^ -1536236881)
      );
      lIlI[lIlI(1136784376, var0 ^ -274915298)] = lI(
         lIIl(lIlI(1136784377, var0 ^ -684924663), lIlI(1136784378, var0 ^ 585356682)).toCharArray(), 43773L, lIlI(1136784379, var0 ^ -2012965230)
      );
      lIlI[lIlI(1136784356, var0 ^ -678709828)] = lI(
         lIIl(lIlI(1136784357, var0 ^ 1916504288), lIlI(1136784358, var0 ^ -1425677723)).toCharArray(), 7572L, lIlI(1136784359, var0 ^ 979198376)
      );
      lIlI[lIlI(1136784352, var0 ^ -1349035566)] = lI(
         lIIl(lIlI(1136784353, var0 ^ -2133170659), lIlI(1136784354, var0 ^ 471762872)).toCharArray(), 26515L, lIlI(1136784355, var0 ^ -1443351706)
      );
      lIlI[lIlI(1136784364, var0 ^ -806711856)] = lI(
         lIIl(lIlI(1136784365, var0 ^ -181962891), lIlI(1136784366, var0 ^ -1239607885)).toCharArray(), 74692L, lIlI(1136784367, var0 ^ -149872732)
      );
      lIlI[lIlI(1136784360, var0 ^ 402130875)] = lI(
         lIIl(lIlI(1136784361, var0 ^ 1130614238), lIlI(1136784362, var0 ^ -1917974889)).toCharArray(), 43891L, lIlI(1136784363, var0 ^ 1926195439)
      );
      lIlI[lIlI(1136784276, var0 ^ -879789908)] = lI(
         lIIl(lIlI(1136784277, var0 ^ 949659424), lIlI(1136784278, var0 ^ -894879430)).toCharArray(), 71304L, lIlI(1136784279, var0 ^ 298611665)
      );
      lIlI[lIlI(1136784272, var0 ^ -1766394567)] = lI(
         lIIl(lIlI(1136784273, var0 ^ 1047889390), lIlI(1136784274, var0 ^ 1150911930)).toCharArray(), 93265L, lIlI(1136784275, var0 ^ 1761420155)
      );
      lIlI[lIlI(1136784284, var0 ^ 1313436205)] = lI(
         lIIl(lIlI(1136784285, var0 ^ -270954432), lIlI(1136784286, var0 ^ -1216139977)).toCharArray(), 34268L, lIlI(1136784287, var0 ^ 180767808)
      );
      lIlI[lIlI(1136784280, var0 ^ -684681714)] = lI(
         lIIl(lIlI(1136784281, var0 ^ 1038301936), lIlI(1136784282, var0 ^ 757631797)).toCharArray(), 43840L, lIlI(1136784283, var0 ^ -1593104417)
      );
      lIlI[lIlI(1136784260, var0 ^ 1051326341)] = lI(
         lIIl(lIlI(1136784261, var0 ^ -98281439), lIlI(1136784262, var0 ^ 674369949)).toCharArray(), 64536L, lIlI(1136784263, var0 ^ 1497231969)
      );
      lIlI[lIlI(1136784256, var0 ^ 899002216)] = lI(
         lIIl(lIlI(1136784257, var0 ^ 1117502976), lIlI(1136784258, var0 ^ -1699849815)).toCharArray(), 75141L, lIlI(1136784259, var0 ^ -1455686061)
      );
      lIlI[lIlI(1136784268, var0 ^ 1610656962)] = lI(
         lIIl(lIlI(1136784269, var0 ^ -166256304), lIlI(1136784270, var0 ^ 1246276610)).toCharArray(), 63070L, lIlI(1136784271, var0 ^ -362265289)
      );
      lIlI[lIlI(1136784264, var0 ^ 203977380)] = lI(
         lIIl(lIlI(1136784265, var0 ^ -750780148), lIlI(1136784266, var0 ^ -114405463)).toCharArray(), 36401L, lIlI(1136784267, var0 ^ 878903002)
      );
      lIlI[lIlI(1136784308, var0 ^ -741160383)] = lI(
         lIIl(lIlI(1136784309, var0 ^ -190973429), lIlI(1136784310, var0 ^ -1096512806)).toCharArray(), 3575L, lIlI(1136784311, var0 ^ 1958779581)
      );
      lIlI[lIlI(1136784304, var0 ^ -1001060541)] = lI(
         lIIl(lIlI(1136784305, var0 ^ -2007731696), lIlI(1136784306, var0 ^ 2040106419)).toCharArray(), 73182L, lIlI(1136784307, var0 ^ 553229461)
      );
      lIlI[lIlI(1136784316, var0 ^ 1139990037)] = lI(
         lIIl(lIlI(1136784317, var0 ^ -378161555), lIlI(1136784318, var0 ^ 2047265254)).toCharArray(), 63643L, lIlI(1136784319, var0 ^ 1953868192)
      );
      lIlI[lIlI(1136784312, var0 ^ 1846586980)] = lI(
         lIIl(lIlI(1136784313, var0 ^ 1680508701), lIlI(1136784314, var0 ^ 154883056)).toCharArray(), 31774L, lIlI(1136784315, var0 ^ 1900059362)
      );
   }

   private lIIIIlll IlIl(class_310 param1, class_327 param2, class_1293 param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w -1597901939
      // 003: istore 25
      // 005: aload 3
      // 006: invokevirtual net/minecraft/class_1293.method_5579 ()Lnet/minecraft/class_6880;
      // 009: astore 5
      // 00b: aload 5
      // 00d: invokeinterface net/minecraft/class_6880.comp_349 ()Ljava/lang/Object; 1
      // 012: checkcast net/minecraft/class_1291
      // 015: astore 6
      // 017: aload 6
      // 019: invokevirtual net/minecraft/class_1291.method_5567 ()Ljava/lang/String;
      // 01c: invokestatic net/minecraft/class_2561.method_43471 (Ljava/lang/String;)Lnet/minecraft/class_5250;
      // 01f: invokevirtual net/minecraft/class_5250.getString ()Ljava/lang/String;
      // 022: astore 7
      // 024: aload 3
      // 025: invokevirtual net/minecraft/class_1293.method_5578 ()I
      // 028: istore 8
      // 02a: aload 0
      // 02b: getfield k74/x/IIllIIllI.IllI Lk74/x/lllIIlII;
      // 02e: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 031: checkcast java/lang/Boolean
      // 034: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 037: ifeq 083
      // 03a: iload 8
      // 03c: ifle 083
      // 03f: goto 046
      // 042: invokestatic k74/x/IIllIIllI.I (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 045: athrow
      // 046: aload 7
      // 048: getstatic k74/x/IIllIIllI.lIlI [Ljava/lang/String;
      // 04b: ldc_w 1136784292
      // 04e: iload 25
      // 050: ldc_w -1858330899
      // 053: ixor
      // 054: invokestatic k74/x/IIllIIllI.lIlI (II)I
      // 057: aaload
      // 058: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 05b: iload 8
      // 05d: bipush 1
      // 05e: iadd
      // 05f: invokestatic k74/x/IIllIIllI.IIII (I)Ljava/lang/String;
      // 062: astore 24
      // 064: astore 23
      // 066: astore 22
      // 068: new java/lang/StringBuilder
      // 06b: dup
      // 06c: invokespecial java/lang/StringBuilder.<init> ()V
      // 06f: aload 22
      // 071: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 074: aload 23
      // 076: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 079: aload 24
      // 07b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 07e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 081: astore 7
      // 083: aload 0
      // 084: getfield k74/x/IIllIIllI.lIIl Lk74/x/lllIIlII;
      // 087: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 08a: checkcast java/lang/Boolean
      // 08d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 090: ifeq 09f
      // 093: aload 3
      // 094: aload 1
      // 095: invokestatic k74/x/IIllIIllI.l (Lnet/minecraft/class_1293;Lnet/minecraft/class_310;)Ljava/lang/String;
      // 098: goto 0af
      // 09b: invokestatic k74/x/IIllIIllI.I (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09e: athrow
      // 09f: getstatic k74/x/IIllIIllI.lIlI [Ljava/lang/String;
      // 0a2: ldc_w 1136784293
      // 0a5: iload 25
      // 0a7: ldc_w 332859955
      // 0aa: ixor
      // 0ab: invokestatic k74/x/IIllIIllI.lIlI (II)I
      // 0ae: aaload
      // 0af: astore 9
      // 0b1: aload 0
      // 0b2: aload 6
      // 0b4: invokevirtual k74/x/IIllIIllI.Il (Lnet/minecraft/class_1291;)I
      // 0b7: istore 10
      // 0b9: aload 3
      // 0ba: invokevirtual net/minecraft/class_1293.method_48559 ()Z
      // 0bd: ifeq 0d3
      // 0c0: ldc_w 1136784294
      // 0c3: iload 25
      // 0c5: ldc_w 273112230
      // 0c8: ixor
      // 0c9: invokestatic k74/x/IIllIIllI.lIlI (II)I
      // 0cc: goto 0db
      // 0cf: invokestatic k74/x/IIllIIllI.I (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d2: athrow
      // 0d3: bipush 0
      // 0d4: aload 3
      // 0d5: invokevirtual net/minecraft/class_1293.method_5584 ()I
      // 0d8: invokestatic java/lang/Math.max (II)I
      // 0db: istore 11
      // 0dd: aload 3
      // 0de: invokevirtual net/minecraft/class_1293.method_48559 ()Z
      // 0e1: ifne 104
      // 0e4: iload 11
      // 0e6: ldc_w 1136784295
      // 0e9: iload 25
      // 0eb: ldc_w 1008288168
      // 0ee: ixor
      // 0ef: invokestatic k74/x/IIllIIllI.lIlI (II)I
      // 0f2: if_icmpgt 104
      // 0f5: goto 0fc
      // 0f8: invokestatic k74/x/IIllIIllI.I (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fb: athrow
      // 0fc: bipush 1
      // 0fd: goto 105
      // 100: invokestatic k74/x/IIllIIllI.I (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 103: athrow
      // 104: bipush 0
      // 105: istore 12
      // 107: aload 3
      // 108: invokevirtual net/minecraft/class_1293.method_48559 ()Z
      // 10b: ifeq 116
      // 10e: dconst_1
      // 10f: goto 124
      // 112: invokestatic k74/x/IIllIIllI.I (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 115: athrow
      // 116: iload 11
      // 118: i2d
      // 119: bipush 1
      // 11a: iload 4
      // 11c: invokestatic java/lang/Math.max (II)I
      // 11f: i2d
      // 120: ddiv
      // 121: invokestatic k74/x/IlllIII.ll (D)D
      // 124: dstore 13
      // 126: aload 2
      // 127: aload 7
      // 129: invokevirtual net/minecraft/class_327.method_1727 (Ljava/lang/String;)I
      // 12c: i2d
      // 12d: ldc2_w 0.9
      // 130: dmul
      // 131: dstore 15
      // 133: aload 9
      // 135: invokevirtual java/lang/String.isEmpty ()Z
      // 138: ifeq 143
      // 13b: dconst_0
      // 13c: goto 14a
      // 13f: invokestatic k74/x/IIllIIllI.I (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 142: athrow
      // 143: aload 2
      // 144: aload 9
      // 146: invokevirtual net/minecraft/class_327.method_1727 (Ljava/lang/String;)I
      // 149: i2d
      // 14a: dstore 17
      // 14c: aload 6
      // 14e: invokevirtual net/minecraft/class_1291.method_5567 ()Ljava/lang/String;
      // 151: invokevirtual java/lang/String.hashCode ()I
      // 154: ldc_w 1136784288
      // 157: iload 25
      // 159: ldc_w -992539558
      // 15c: ixor
      // 15d: invokestatic k74/x/IIllIIllI.lIlI (II)I
      // 160: irem
      // 161: invokestatic java/lang/Math.abs (I)I
      // 164: i2d
      // 165: ldc2_w 90.0
      // 168: ddiv
      // 169: dstore 19
      // 16b: new k74/x/lIIIIlll
      // 16e: dup
      // 16f: aload 7
      // 171: aload 9
      // 173: iload 10
      // 175: iload 12
      // 177: dload 19
      // 179: dload 15
      // 17b: dload 17
      // 17d: dload 13
      // 17f: iload 11
      // 181: invokespecial k74/x/lIIIIlll.<init> (Ljava/lang/String;Ljava/lang/String;IZDDDDI)V
      // 184: astore 21
      // 186: aload 21
      // 188: aload 0
      // 189: invokevirtual k74/x/IIllIIllI.IIll ()D
      // 18c: ldc2_w 11.6
      // 18f: dadd
      // 190: ldc2_w 5.0
      // 193: dadd
      // 194: dload 15
      // 196: dadd
      // 197: aload 9
      // 199: invokevirtual java/lang/String.isEmpty ()Z
      // 19c: ifeq 1a7
      // 19f: dconst_0
      // 1a0: goto 1b1
      // 1a3: invokestatic k74/x/IIllIIllI.I (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a6: athrow
      // 1a7: ldc2_w 7.0
      // 1aa: dload 17
      // 1ac: ldc2_w 0.78
      // 1af: dmul
      // 1b0: dadd
      // 1b1: dadd
      // 1b2: aload 0
      // 1b3: invokevirtual k74/x/IIllIIllI.IIll ()D
      // 1b6: dadd
      // 1b7: ldc2_w 4.0
      // 1ba: dadd
      // 1bb: putfield k74/x/lIIIIlll.I D
      // 1be: aload 21
      // 1c0: areturn
   }

   private double IllI(long var1) {
      try {
         if (this.lIl <= 0L) {
            this.lIl = var1;
            return 0.016666666666666666;
         }
      } catch (MatchException var6) {
         throw I(var6);
      }

      double var3 = Math.max(0.0, Math.min(0.12, (var1 - this.lIl) / 1000.0));

      try {
         this.lIl = var1;
         if (var3 <= 0.0) {
            return 0.016666666666666666;
         }
      } catch (MatchException var5) {
         throw I(var5);
      }

      return var3;
   }

   public IIllIIllI() {
      int var1 = 119512312;
      super(IlIIllIII.Ill(lIlI[lIlI(1136784289, var1 ^ -53853059)]), lllIIlIl.II, IlIIllIII.Ill(lIlI[lIlI(1136784290, var1 ^ 616519803)]), true);
      this.lI = this.IllIIll(new IIlIII(IlIIllIII.Ill(lIlI[3]), 6.0, 0.0, 4000.0, 1.0).IlII(IlIIllIII.lI(lIlI[lIlI(1136784291, var1 ^ -1765700596)])));
      this.IIll = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(lIlI[lIlI(1136784300, var1 ^ 1947812780)]), 200.0, 0.0, 4000.0, 1.0)
            .IlII(IlIIllIII.lI(lIlI[lIlI(1136784301, var1 ^ -1366765839)]))
      );
      this.lllI = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(lIlI[lIlI(1136784302, var1 ^ 1072781409)]), 100.0, 60.0, 180.0, 5.0)
            .IlII(IlIIllIII.lI(lIlI[lIlI(1136784303, var1 ^ 2052933233)]))
      );
      this.llll = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(lIlI[lIlI(1136784296, var1 ^ -1713997261)]), 32.0, 20.0, 46.0, 1.0)
            .IlII(IlIIllIII.lI(lIlI[lIlI(1136784297, var1 ^ 1035656755)]))
      );
      this.IIII = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(lIlI[lIlI(1136784298, var1 ^ -1337310089)]), 4.0, 0.0, 12.0, 1.0)
            .IlII(IlIIllIII.lI(lIlI[lIlI(1136784299, var1 ^ -1826717444)]))
      );
      this.lll = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(lIlI[lIlI(1136784212, var1 ^ -2072377436)]), 10.0, 4.0, 18.0, 1.0)
            .IlII(IlIIllIII.lI(lIlI[lIlI(1136784213, var1 ^ 1461402899)]))
      );
      this.IllI = this.IllIIll(new lllIIlII(IlIIllIII.Ill(lIlI[lIlI(1136784214, var1 ^ 302138345)]), true));
      this.lIIl = this.IllIIll(new lllIIlII(IlIIllIII.Ill(lIlI[lIlI(1136784215, var1 ^ -1150243568)]), true));
      this.llII = this.IllIIll(new lllIIlII(IlIIllIII.Ill(lIlI[lIlI(1136784208, var1 ^ 2080922440)]), false));
      this.IIIl = this.IllIIll(new lllIIlII(IlIIllIII.Ill(lIlI[lIlI(1136784209, var1 ^ 249251708)]), false));
      this.II = this.IllIIll(
         new IIIlIIlll(
            IlIIllIII.Ill(lIlI[lIlI(1136784210, var1 ^ -996992535)]),
            new Color(
               lIlI(1136784211, var1 ^ 1767523707),
               lIlI(1136784220, var1 ^ -934397371),
               lIlI(1136784221, var1 ^ -727552856),
               lIlI(1136784222, var1 ^ -545981327)
            )
         )
      );
      this.IIIII = new HashMap<>();
      this.ll = 138.0;
      this.Ill = 32.0;
   }

   private void lIII(class_332 var1, double var2, double var4, double var6, double var8, double var10, int var12, int var13) {
      double var14 = k74.x.IlllIII.ll(var10);

      try {
         IlIIlllIl.IIIIIl(var1, var2, var4, var6, var8, var13);
         if (var14 <= 0.001) {
            return;
         }
      } catch (MatchException var16) {
         throw I(var16);
      }

      IlIIlllIl.lIIlII(var1, var2, var4, var6, var8, var14, var12);
   }

   private static String lIIl(int var0, int var1) {
      int var9 = -340201147;
      int var2 = (var0 ^ lIlI(1136784223, var9 ^ -1150677973)) & lIlI(1136784216, var9 ^ 2022347181);
      if (IIl[var2] == null) {
         char[] var3 = llI[var2].toCharArray();

         int var4 = switch (var3[0] & lIlI(1136784217, var9 ^ 1644962834)) {
            case 0 -> lIlI(1136784218, var9 ^ -8642491);
            case 1 -> lIlI(1136784219, var9 ^ 2012569499);
            case 2 -> lIlI(1136784196, var9 ^ -994327234);
            case 3 -> lIlI(1136784197, var9 ^ -643115340);
            case 4 -> lIlI(1136784198, var9 ^ -2099749856);
            case 5 -> lIlI(1136784199, var9 ^ -768883616);
            case 6 -> lIlI(1136784192, var9 ^ 2020795246);
            case 7 -> lIlI(1136784193, var9 ^ 1512668519);
            case 8 -> lIlI(1136784194, var9 ^ -2112171736);
            case 9 -> lIlI(1136784195, var9 ^ -1988432204);
            case 10 -> lIlI(1136784204, var9 ^ 840629703);
            case 11 -> lIlI(1136784205, var9 ^ -383081745);
            case 12 -> lIlI(1136784206, var9 ^ 1158332530);
            case 13 -> lIlI(1136784207, var9 ^ -1660184203);
            case 14 -> lIlI(1136784200, var9 ^ -513275918);
            case 15 -> lIlI(1136784201, var9 ^ 943166315);
            case 16 -> lIlI(1136784202, var9 ^ -1218872486);
            case 17 -> lIlI(1136784203, var9 ^ -904932306);
            case 18 -> lIlI(1136784244, var9 ^ 804348547);
            case 19 -> lIlI(1136784245, var9 ^ 2056823749);
            case 20 -> lIlI(1136784246, var9 ^ 1074292594);
            case 21 -> lIlI(1136784247, var9 ^ -265803142);
            case 22 -> lIlI(1136784240, var9 ^ -1591414055);
            case 23 -> lIlI(1136784241, var9 ^ -1020558671);
            case 24 -> lIlI(1136784242, var9 ^ 1106526115);
            case 25 -> 4;
            case 26 -> lIlI(1136784243, var9 ^ 1409591711);
            case 27 -> lIlI(1136784252, var9 ^ 1784752064);
            case 28 -> 3;
            case 29 -> lIlI(1136784253, var9 ^ 825064753);
            case 30 -> lIlI(1136784254, var9 ^ 1573536507);
            case 31 -> lIlI(1136784255, var9 ^ 1867247507);
            case 32 -> lIlI(1136784248, var9 ^ -1954518119);
            case 33 -> lIlI(1136784249, var9 ^ -1409471681);
            case 34 -> lIlI(1136784250, var9 ^ 348613742);
            case 35 -> lIlI(1136784251, var9 ^ 575732059);
            case 36 -> lIlI(1136784228, var9 ^ -1106142251);
            case 37 -> lIlI(1136784229, var9 ^ -1732562217);
            case 38 -> lIlI(1136784230, var9 ^ 724629811);
            case 39 -> lIlI(1136784231, var9 ^ -175683427);
            case 40 -> lIlI(1136784224, var9 ^ -2104799052);
            case 41 -> lIlI(1136784225, var9 ^ 253330514);
            case 42 -> lIlI(1136784226, var9 ^ -1370398346);
            case 43 -> lIlI(1136784227, var9 ^ -1449000677);
            case 44 -> lIlI(1136784236, var9 ^ -807839622);
            case 45 -> lIlI(1136784237, var9 ^ 1589144214);
            case 46 -> lIlI(1136784238, var9 ^ -1420632444);
            case 47 -> lIlI(1136784239, var9 ^ 64720258);
            case 48 -> lIlI(1136784232, var9 ^ 1691215989);
            case 49 -> lIlI(1136784233, var9 ^ 754253821);
            case 50 -> lIlI(1136784234, var9 ^ 66565341);
            case 51 -> lIlI(1136784235, var9 ^ 1782881496);
            case 52 -> lIlI(1136784148, var9 ^ -1823644433);
            case 53 -> lIlI(1136784149, var9 ^ -1176426430);
            case 54 -> lIlI(1136784150, var9 ^ 1796776116);
            case 55 -> lIlI(1136784151, var9 ^ -1853250917);
            case 56 -> lIlI(1136784144, var9 ^ 1435102550);
            case 57 -> lIlI(1136784145, var9 ^ 1557598045);
            case 58 -> lIlI(1136784146, var9 ^ 739596001);
            case 59 -> lIlI(1136784147, var9 ^ -1126720897);
            case 60 -> lIlI(1136784156, var9 ^ 2096812887);
            case 61 -> lIlI(1136784157, var9 ^ -1869535639);
            case 62 -> lIlI(1136784158, var9 ^ 2079227617);
            case 63 -> lIlI(1136784159, var9 ^ -1420552699);
            case 64 -> lIlI(1136784152, var9 ^ 495502909);
            case 65 -> 2;
            case 66 -> lIlI(1136784153, var9 ^ 1017391946);
            case 67 -> lIlI(1136784154, var9 ^ -1976805089);
            case 68 -> lIlI(1136784155, var9 ^ 93354346);
            case 69 -> lIlI(1136784132, var9 ^ 343649033);
            case 70 -> lIlI(1136784133, var9 ^ 275095158);
            case 71 -> lIlI(1136784134, var9 ^ -1535910756);
            case 72 -> lIlI(1136784135, var9 ^ -698445009);
            case 73 -> lIlI(1136784128, var9 ^ 1727938996);
            case 74 -> lIlI(1136784129, var9 ^ 1492057197);
            case 75 -> lIlI(1136784130, var9 ^ 335891075);
            case 76 -> lIlI(1136784131, var9 ^ 657360568);
            case 77 -> lIlI(1136784140, var9 ^ 1485815728);
            case 78 -> lIlI(1136784141, var9 ^ -1508761458);
            case 79 -> lIlI(1136784142, var9 ^ 473646381);
            case 80 -> lIlI(1136784143, var9 ^ -1958082274);
            case 81 -> lIlI(1136784136, var9 ^ 929717567);
            case 82 -> lIlI(1136784137, var9 ^ -352038666);
            case 83 -> lIlI(1136784138, var9 ^ -617643850);
            case 84 -> lIlI(1136784139, var9 ^ 311242065);
            case 85 -> lIlI(1136784180, var9 ^ 1264807134);
            case 86 -> lIlI(1136784181, var9 ^ 391533489);
            case 87 -> lIlI(1136784182, var9 ^ 843557153);
            case 88 -> lIlI(1136784183, var9 ^ 992317118);
            case 89 -> lIlI(1136784176, var9 ^ 1111935690);
            case 90 -> lIlI(1136784177, var9 ^ 1065279613);
            case 91 -> lIlI(1136784178, var9 ^ 1195962340);
            case 92 -> lIlI(1136784179, var9 ^ -84757868);
            case 93 -> lIlI(1136784188, var9 ^ 1265866174);
            case 94 -> lIlI(1136784189, var9 ^ 734574507);
            case 95 -> lIlI(1136784190, var9 ^ 210551735);
            case 96 -> lIlI(1136784191, var9 ^ -1145071083);
            case 97 -> lIlI(1136784184, var9 ^ 624564983);
            case 98 -> lIlI(1136784185, var9 ^ -1428779108);
            case 99 -> lIlI(1136784186, var9 ^ 1546629793);
            case 100 -> lIlI(1136784187, var9 ^ -460080973);
            case 101 -> lIlI(1136784164, var9 ^ 420061430);
            case 102 -> lIlI(1136784165, var9 ^ 1014829631);
            case 103 -> lIlI(1136784166, var9 ^ 1116787507);
            case 104 -> lIlI(1136784167, var9 ^ -881331852);
            case 105 -> lIlI(1136784160, var9 ^ 488449168);
            case 106 -> lIlI(1136784161, var9 ^ 1833288405);
            case 107 -> 5;
            case 108 -> lIlI(1136784162, var9 ^ -948069418);
            case 109 -> lIlI(1136784163, var9 ^ -584716408);
            case 110 -> lIlI(1136784172, var9 ^ -90112311);
            case 111 -> lIlI(1136784173, var9 ^ -1812366805);
            case 112 -> lIlI(1136784174, var9 ^ -2079829039);
            case 113 -> lIlI(1136784175, var9 ^ -2000495206);
            case 114 -> lIlI(1136784168, var9 ^ -1375152820);
            case 115 -> lIlI(1136784169, var9 ^ -987790743);
            case 116 -> lIlI(1136784170, var9 ^ -1517565592);
            case 117 -> lIlI(1136784171, var9 ^ 1043045486);
            case 118 -> lIlI(1136783572, var9 ^ -815351587);
            case 119 -> lIlI(1136783573, var9 ^ -1423299709);
            case 120 -> lIlI(1136783574, var9 ^ 788706168);
            case 121 -> lIlI(1136783575, var9 ^ -237283525);
            case 122 -> lIlI(1136783568, var9 ^ 322107966);
            case 123 -> lIlI(1136783569, var9 ^ -125985976);
            case 124 -> lIlI(1136783570, var9 ^ 872692835);
            case 125 -> lIlI(1136783571, var9 ^ 2033576353);
            case 126 -> lIlI(1136783580, var9 ^ 1788805810);
            case 127 -> lIlI(1136783581, var9 ^ -1541512374);
            case 128 -> lIlI(1136783582, var9 ^ -100749872);
            case 129 -> lIlI(1136783583, var9 ^ -834922504);
            case 130 -> lIlI(1136783576, var9 ^ 377091170);
            case 131 -> lIlI(1136783577, var9 ^ -503371362);
            case 132 -> lIlI(1136783578, var9 ^ -955279175);
            case 133 -> lIlI(1136783579, var9 ^ 1093044068);
            case 134 -> lIlI(1136783556, var9 ^ 918265798);
            case 135 -> lIlI(1136783557, var9 ^ -1085000402);
            case 136 -> lIlI(1136783558, var9 ^ 1209302088);
            case 137 -> lIlI(1136783559, var9 ^ -1674848533);
            case 138 -> lIlI(1136783552, var9 ^ -1485143282);
            case 139 -> lIlI(1136783553, var9 ^ 31841690);
            case 140 -> lIlI(1136783554, var9 ^ -498462786);
            case 141 -> lIlI(1136783555, var9 ^ -155331693);
            case 142 -> lIlI(1136783564, var9 ^ -691272131);
            case 143 -> lIlI(1136783565, var9 ^ -310578045);
            case 144 -> lIlI(1136783566, var9 ^ 1098445450);
            case 145 -> lIlI(1136783567, var9 ^ -1101028648);
            case 146 -> lIlI(1136783560, var9 ^ 1830017090);
            case 147 -> lIlI(1136783561, var9 ^ -876188875);
            case 148 -> lIlI(1136783562, var9 ^ 2114886609);
            case 149 -> lIlI(1136783563, var9 ^ 187176585);
            case 150 -> lIlI(1136783604, var9 ^ -1954941656);
            case 151 -> lIlI(1136783605, var9 ^ 938533052);
            case 152 -> lIlI(1136783606, var9 ^ 1899640363);
            case 153 -> 0;
            case 154 -> lIlI(1136783607, var9 ^ 1415708172);
            case 155 -> lIlI(1136783600, var9 ^ -2130806309);
            case 156 -> lIlI(1136783601, var9 ^ -257569331);
            case 157 -> lIlI(1136783602, var9 ^ 677352615);
            case 158 -> lIlI(1136783603, var9 ^ 1218136854);
            case 159 -> lIlI(1136783612, var9 ^ 568643068);
            case 160 -> lIlI(1136783613, var9 ^ 1648035577);
            case 161 -> lIlI(1136783614, var9 ^ -211335072);
            case 162 -> lIlI(1136783615, var9 ^ -1286019147);
            case 163 -> lIlI(1136783608, var9 ^ -1398286394);
            case 164 -> lIlI(1136783609, var9 ^ -609081835);
            case 165 -> lIlI(1136783610, var9 ^ 1050380432);
            case 166 -> lIlI(1136783611, var9 ^ 1510086031);
            case 167 -> lIlI(1136783588, var9 ^ 810031289);
            case 168 -> lIlI(1136783589, var9 ^ -953385987);
            case 169 -> lIlI(1136783590, var9 ^ -1102826500);
            case 170 -> lIlI(1136783591, var9 ^ -1002570637);
            case 171 -> lIlI(1136783584, var9 ^ -1830985777);
            case 172 -> lIlI(1136783585, var9 ^ -1617598195);
            case 173 -> lIlI(1136783586, var9 ^ 873533613);
            case 174 -> lIlI(1136783587, var9 ^ -854488165);
            case 175 -> 1;
            case 176 -> lIlI(1136783596, var9 ^ 37092771);
            case 177 -> lIlI(1136783597, var9 ^ -66856381);
            case 178 -> lIlI(1136783598, var9 ^ 1992666219);
            case 179 -> lIlI(1136783599, var9 ^ 209856503);
            case 180 -> lIlI(1136783592, var9 ^ -1027097681);
            case 181 -> lIlI(1136783593, var9 ^ 1751081277);
            case 182 -> lIlI(1136783594, var9 ^ 151408862);
            case 183 -> lIlI(1136783595, var9 ^ 1187735843);
            case 184 -> lIlI(1136783508, var9 ^ 1869830852);
            case 185 -> lIlI(1136783509, var9 ^ -838218712);
            case 186 -> lIlI(1136783510, var9 ^ 1176636686);
            case 187 -> lIlI(1136783511, var9 ^ 2053391105);
            case 188 -> lIlI(1136783504, var9 ^ 356568214);
            case 189 -> lIlI(1136783505, var9 ^ -43387870);
            case 190 -> lIlI(1136783506, var9 ^ -960217613);
            case 191 -> lIlI(1136783507, var9 ^ -1659162716);
            case 192 -> lIlI(1136783516, var9 ^ -667598724);
            case 193 -> lIlI(1136783517, var9 ^ -1626477702);
            case 194 -> lIlI(1136783518, var9 ^ 1446601477);
            case 195 -> lIlI(1136783519, var9 ^ 963144287);
            case 196 -> lIlI(1136783512, var9 ^ -792891519);
            case 197 -> lIlI(1136783513, var9 ^ -600776671);
            case 198 -> lIlI(1136783514, var9 ^ 1347457845);
            case 199 -> lIlI(1136783515, var9 ^ -361958526);
            case 200 -> lIlI(1136783492, var9 ^ -170246855);
            case 201 -> lIlI(1136783493, var9 ^ -362719692);
            case 202 -> lIlI(1136783494, var9 ^ 1915664220);
            case 203 -> lIlI(1136783495, var9 ^ -1102113323);
            case 204 -> lIlI(1136783488, var9 ^ -166374);
            case 205 -> lIlI(1136783489, var9 ^ 1938741224);
            case 206 -> lIlI(1136783490, var9 ^ -1205216148);
            case 207 -> lIlI(1136783491, var9 ^ 1057770453);
            case 208 -> lIlI(1136783500, var9 ^ 1144593575);
            case 209 -> lIlI(1136783501, var9 ^ 1800185584);
            case 210 -> lIlI(1136783502, var9 ^ -1628782931);
            case 211 -> lIlI(1136783503, var9 ^ 400937631);
            case 212 -> lIlI(1136783496, var9 ^ 1795289878);
            case 213 -> lIlI(1136783497, var9 ^ 509547194);
            case 214 -> lIlI(1136783498, var9 ^ 936462818);
            case 215 -> lIlI(1136783499, var9 ^ 1921400682);
            case 216 -> lIlI(1136783540, var9 ^ -270514350);
            case 217 -> lIlI(1136783541, var9 ^ -1375958161);
            case 218 -> lIlI(1136783542, var9 ^ -2081592495);
            case 219 -> lIlI(1136783543, var9 ^ -733835215);
            case 220 -> lIlI(1136783536, var9 ^ -1090491160);
            case 221 -> lIlI(1136783537, var9 ^ 1865519909);
            case 222 -> lIlI(1136783538, var9 ^ -1251153881);
            case 223 -> lIlI(1136783539, var9 ^ -90145482);
            case 224 -> lIlI(1136783548, var9 ^ 404548898);
            case 225 -> lIlI(1136783549, var9 ^ 799235463);
            case 226 -> lIlI(1136783550, var9 ^ -706264847);
            case 227 -> lIlI(1136783551, var9 ^ -1501400861);
            case 228 -> lIlI(1136783544, var9 ^ 1256218414);
            case 229 -> lIlI(1136783545, var9 ^ -1153779781);
            case 230 -> lIlI(1136783546, var9 ^ -89247795);
            case 231 -> lIlI(1136783547, var9 ^ -1386830882);
            case 232 -> lIlI(1136783524, var9 ^ 1117961423);
            case 233 -> lIlI(1136783525, var9 ^ 78648516);
            case 234 -> lIlI(1136783526, var9 ^ 2049923610);
            case 235 -> lIlI(1136783527, var9 ^ 321680866);
            case 236 -> lIlI(1136783520, var9 ^ 1492412616);
            case 237 -> lIlI(1136783521, var9 ^ -998150857);
            case 238 -> lIlI(1136783522, var9 ^ 1699213939);
            case 239 -> lIlI(1136783523, var9 ^ 2082164094);
            case 240 -> lIlI(1136783532, var9 ^ 624750459);
            case 241 -> lIlI(1136783533, var9 ^ -841852308);
            case 242 -> lIlI(1136783534, var9 ^ 2001167331);
            case 243 -> lIlI(1136783535, var9 ^ 689469506);
            case 244 -> lIlI(1136783528, var9 ^ 503896650);
            case 245 -> lIlI(1136783529, var9 ^ 1859528341);
            case 246 -> lIlI(1136783530, var9 ^ 1871392323);
            case 247 -> lIlI(1136783531, var9 ^ -189395288);
            case 248 -> lIlI(1136783444, var9 ^ 595603337);
            case 249 -> lIlI(1136783445, var9 ^ -1736038135);
            case 250 -> lIlI(1136783446, var9 ^ 1469640498);
            case 251 -> lIlI(1136783447, var9 ^ -1317966335);
            case 252 -> lIlI(1136783440, var9 ^ -1531295209);
            case 253 -> lIlI(1136783441, var9 ^ 1705354670);
            case 254 -> lIlI(1136783442, var9 ^ 1241065316);
            default -> lIlI(1136783443, var9 ^ 451044574);
         };
         int var5 = (var1 & lIlI(1136783452, var9 ^ -27996472)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & lIlI(1136783453, var9 ^ -1586855106)) >>> lIlI(1136783454, var9 ^ -489428561)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & lIlI(1136783455, var9 ^ 1705870993);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & lIlI(1136783448, var9 ^ 1883415098);
            }
         }

         IIl[var2] = new String(var3).intern();
      }

      return IIl[var2];
   }
}
