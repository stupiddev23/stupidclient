/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import me.mioclient.m$$2clVljJRCQJbjif7omdchwHlBlBYJC5Nbtb7D33CeWvguFfuXUWrhxP60dJIXZZxzAev05L11xOoChOQF7omcBuSzZ9Ioc8oa;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm;
import net.minecraft.class_151;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc
implements ArgumentType {
    public static final ExecutorService m$$usnzfPeWGy6iAn1uPJLR6UgsJVhf38ORt1lPLe11bmnTdwQdPcmX3d47CHJiqfOhVCdu73R8QDlxYkQQkQDkuxD5AsqWq6mRg;
    public static int \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01;
    public static final String[] a;
    public static final String[] b;
    public static final long[] c;
    public static final Integer[] d;
    public static final Object[] e;
    public static final String[] f;

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block23: {
                block22: {
                    block21: {
                        m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.e = new Object[53];
                        m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.f = new String[53];
                        m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.a();
                        var17 = new String[2];
                        var15_1 = 0;
                        var14_2 = "\u0014\u00cf\u00cd\u00a9E\u00a1\u0011\u00ac\u0012\u00bc\u0083\u009cG^\u00b3b\u0081\u00cd\u00d3c\u0087\u0015o-\u0098\u0012\u0082";
                        var16_3 = "\u0014\u00cf\u00cd\u00a9E\u00a1\u0011\u00ac\u0012\u00bc\u0083\u009cG^\u00b3b\u0081\u00cd\u00d3c\u0087\u0015o-\u0098\u0012\u0082".length();
                        var13_4 = 8;
                        var12_5 = -1;
lbl10:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl12:
                        // 1 sources

                        while (true) {
                            var17[var15_1++] = new String(v0).intern();
                            if ((var12_5 += var13_4) < var16_3) {
                                var13_4 = var14_2.charAt(var12_5);
                                ** continue;
                            }
                            break block21;
                            break;
                        }
                        v1 = ++var12_5;
                        v2 = var14_2.substring(v1, v1 + var13_4).toCharArray();
                        v3 = v2.length;
                        var18_6 = 0;
                        v4 = 10;
                        v5 = v2;
                        v6 = v3;
                        if (v3 > 1) ** GOTO lbl70
                        do {
                            v7 = v4;
                            v5 = v5;
                            v8 = v5;
                            v9 = v4;
                            v10 = var18_6;
                            while (true) {
                                switch (var18_6 % 7) {
                                    case 0: {
                                        v11 = 107;
                                        break;
                                    }
                                    case 1: {
                                        v11 = 65;
                                        break;
                                    }
                                    case 2: {
                                        v11 = 18;
                                        break;
                                    }
                                    case 3: {
                                        v11 = 27;
                                        break;
                                    }
                                    case 4: {
                                        v11 = 104;
                                        break;
                                    }
                                    case 5: {
                                        v11 = 26;
                                        break;
                                    }
                                    default: {
                                        v11 = 6;
                                    }
                                }
                                v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                                ++var18_6;
                                v4 = v7;
                                if (v7 != 0) break;
                                v7 = v4;
                                v5 = v5;
                                v10 = v4;
                                v8 = v5;
                                v9 = v4;
                            }
lbl70:
                            // 2 sources

                            v0 = v5;
                            v6 = v6;
                        } while (v6 > var18_6);
                        ** while (true)
                    }
                    m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.a = var17;
                    m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.b = new String[2];
                    var4_7 = 3940082707766433914L;
                    var10_8 = new long[9];
                    var7_9 = 0;
                    var8_10 = "\u00f4\u00ba\u00b9\u00e7ab-\u00a9\u00f4\u00f8\u00adj\u0007\u00e9\u0092\u0001\u00a5\"\u00df%F\u001e\"5\u00d5\u0097\u00e5\u00ff6\u0003-\u00daEe)WI;z\u00998\u00d9\u0099\u00a3@\u0010\u00eb\u0086NA\u00d5\u0015%\u009f\u00ae\u00a6";
                    var9_11 = "\u00f4\u00ba\u00b9\u00e7ab-\u00a9\u00f4\u00f8\u00adj\u0007\u00e9\u0092\u0001\u00a5\"\u00df%F\u001e\"5\u00d5\u0097\u00e5\u00ff6\u0003-\u00daEe)WI;z\u00998\u00d9\u0099\u00a3@\u0010\u00eb\u0086NA\u00d5\u0015%\u009f\u00ae\u00a6".length();
                    var6_12 = 0;
                    while (true) {
                        var11_13 = var8_10.substring(var6_12, var6_12 += 8).getBytes("ISO-8859-1");
                        v12 = var10_8;
                        v13 = var7_9++;
                        v14 = ((long)var11_13[0] & 255L) << 56 | ((long)var11_13[1] & 255L) << 48 | ((long)var11_13[2] & 255L) << 40 | ((long)var11_13[3] & 255L) << 32 | ((long)var11_13[4] & 255L) << 24 | ((long)var11_13[5] & 255L) << 16 | ((long)var11_13[6] & 255L) << 8 | (long)var11_13[7] & 255L;
                        v15 = -1;
                        break block22;
                        break;
                    }
lbl93:
                    // 1 sources

                    while (true) {
                        v12[v13] = v16;
                        if (var6_12 < var9_11) ** continue;
                        var8_10 = "\u00d6y\u0019\u00c6\u00f5\"\u00a54\u00ed<\u00f81\u00dfUT\u00f4";
                        var9_11 = "\u00d6y\u0019\u00c6\u00f5\"\u00a54\u00ed<\u00f81\u00dfUT\u00f4".length();
                        var6_12 = 0;
                        while (true) {
                            var11_13 = var8_10.substring(var6_12, var6_12 += 8).getBytes("ISO-8859-1");
                            v12 = var10_8;
                            v13 = var7_9++;
                            v14 = ((long)var11_13[0] & 255L) << 56 | ((long)var11_13[1] & 255L) << 48 | ((long)var11_13[2] & 255L) << 40 | ((long)var11_13[3] & 255L) << 32 | ((long)var11_13[4] & 255L) << 24 | ((long)var11_13[5] & 255L) << 16 | ((long)var11_13[6] & 255L) << 8 | (long)var11_13[7] & 255L;
                            v15 = 0;
                            break block22;
                            break;
                        }
                        break;
                    }
lbl106:
                    // 1 sources

                    while (true) {
                        v12[v13] = v16;
                        if (var6_12 < var9_11) ** continue;
                        break block23;
                        break;
                    }
                }
                v16 = v14 ^ var4_7;
                switch (v15) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl117:
                    // 1 sources

                    ** continue;
                }
            }
            m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.c = var10_8;
            m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.d = new Integer[9];
            m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.a(9891, 739510377679633286L);
            break block24;
lbl123:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var2_14 = 7189260582821383306L;
        ** while (true)
        var0_15 = 6601985207889305268L ^ var2_14;
        m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.a("\u00d4", (long)var0_15, (long)3408518206526742L);
        m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.m$$usnzfPeWGy6iAn1uPJLR6UgsJVhf38ORt1lPLe11bmnTdwQdPcmX3d47CHJiqfOhVCdu73R8QDlxYkQQkQDkuxD5AsqWq6mRg = m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.a("\u00d4", (long)2677563780100032L);
    }

    public static Field b(Class clazz, String string, Class clazz2) {
        Field field = m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Class b(long l) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.a(l);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field c(long l) {
        int n = m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.a(l);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.b(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.b(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.a(clazz3, string2, clazz2)) != null) {
                    m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.b(715936392143069L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static Method d(long l) {
        int n = m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.a(l);
        Object object = e[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = f[n];
                int n3 = string2.indexOf(8);
                clazz3 = m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.b(Long.parseLong(string2.substring(0, n3), 36));
                int n4 = string2.indexOf(8, ++n3);
                string = string2.substring(n3, n4);
                int n5 = -1;
                int n6 = n4;
                do {
                    ++n5;
                    ++n6;
                } while ((n6 = string2.indexOf(8, n6)) > -1);
                n2 = n5 - 1;
                classArray2 = new Class[n2];
                clazz2 = null;
                n6 = n4 + 1;
                for (int i = 0; i < n5; ++i) {
                    int n7 = string2.indexOf(8, n6);
                    clazz2 = m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.b(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.b(715936392143069L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.b(715936392143069L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchMethodException in ").append(clazz3.getName()).append(' ').append(clazz2.getName()).append(' ').append(string).append('(');
            int n8 = 0;
            while (n8 < n2) {
                stringBuffer.append(classArray2[n8].getName());
                if (++n8 >= n2) continue;
                stringBuffer.append(", ");
            }
            stringBuffer.append(')');
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Method)object;
    }

    public static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static void a() {
        Object[] objectArray = e;
        e[0] = "r)\n\u0007.+| M\u000f)01!\u0000Nu's\u001aH\u0000\r\u0016\\\u001dn\b--y{K\u0007#'w;l\u0006\u0005(]\u0015n)r\n}8F]\u0003w,\u000fA=1#j\nB\u001f\u001f\u0011H>L\u0012\u0017r/(n#\u001f\u001eE4^+\"2/yh[v<P#g\u0002\b\u0015Y{K\u0007$\u0006j\u001f^0~\rp/\u001c\u0005&";
        objectArray[1] = "y\u00185\t\u0016\u0005r\u0017$Fk\u001da\u0010-\u000f";
        objectArray[2] = Boolean.TYPE;
        m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.f[2] = "java/lang/Boolean";
        objectArray[3] = "v@'!aqxI`)fj5H-hr\u007fM\u007f~)bZH\u001dd)Fl\\|X+~*W\u0016S=I(b@={@|BQP#:l)\u001ce~y'PuN\u000b>mjqK\u000bz*i\u001dD\b`poqD:ro\\iG\u001blS(`\u007f!A*-}:\bF_q\u0012d4yF}PS<k";
        objectArray[4] = "XW\u007ff)\u001cQY|/j\u0011IQu) \u001a^J<\u001b0\u0001RVu\u001a!\u0012_]`";
        objectArray[5] = Integer.TYPE;
        m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.f[5] = "java/lang/Integer";
        objectArray[6] = "\u000fwkl\u001cM\u0011\u007fq#QW\u000buh\u007f@]\u000bb3HJ]\u0006cib@K";
        objectArray[7] = "LY]\u0014}ERQG[0_H[^\u0007!UHL\u00050+UEM_\u001a!cCJ]\u001c0U";
        objectArray[8] = "M/P_\u0011+C&\u0017W\u00160\u000e'Z\u0016\u0019\u0015u8\u0010z\u001f\u0015\u0014\u001aK_-*H\"'U\u000f6e8;h12hs:~\u0011\u0013\u0010\u0018\fg\u0011wV\u0001HH\u001e\u0012\u0013\u0000.\u0000:!\u0014\u0019Nh0\u0002O\u001dMw\u0013\bu\u0003\u001aU9\u0005r?\u000e\u0004/,I\u0004\u000fA*\u000bAx\u001cF\u0015\u0010Er\u0006CL5H~\u000fz\u0015";
        objectArray[9] = Long.TYPE;
        m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.f[9] = "java/lang/Long";
        objectArray[10] = "1T\u001f/\u00168:[\u000e`w61P\n:";
        objectArray[11] = "VF_Ch`VFH\u001fdoL\rH\u0001dzK|\u0019X38";
        objectArray[12] = "^|\u0014\tw]@t\u000eF:GZ~\u0017\u001a+MZiL+6EDq\u0007\u001c8JXx$\u001d-]Fx";
        objectArray[13] = "{Y9NFteQ#\u0001\u000et\u007f[;F\u0007o?k:_\u0018mx]=";
        objectArray[14] = "8\u007fE]1l&w_\u0012|v<}FNm|<j\u001dyg|1kGSm";
        objectArray[15] = "KL\t\fZAUD\u0013C;DUD\u0010\u0003\u0015X";
        objectArray[16] = "<9^w2G20\u0019\u007f5\\\u007f1T>ba\u00199\u0018Q<Z?\u001bCIld\u0012\u000bDo(m\u00107\u0005\\\u0001\u001eg1Fwi\u001b4k\u0014@8M\u0015\u0015\bS\u0002\u00198=4K\u0002Q\u0001m\u0005N(G\u0007d\u001f\":|h;>w\u001c\u001a\u0014\u001e(*o[!l'\u007fmg\u0019\u0014\u001eL\u0002\u0011&\u0018\u0011(<K6+&j\u0011";
        objectArray[17] = "Iz(lWVWr2#\u001fVMx*d\u0016M\rK,h\u001dJ@z*h";
        objectArray[18] = "~$\u001a\u001c_Rw*\u0019U\u001c_o\"\u0010SVTx9YQ]Si.\u000fF\u001c~r&\u001aS\\Y^$\u0019FWEi";
        objectArray[19] = "Z\u000e\u0013v?rQ\u0001\u00029RrQ\u001c\u0016";
        objectArray[20] = "n)=t\u001dS` z|\u001aH-!7=\rQR$|a2mM<F\u007f\u001dPi\u0016XU@\fF\u007f!p&]k|JtBPK\u001axqMP16il;ti\u0014KN\u0002MN>AI-MY\u000brq\u0016tI|GX\u0015\nz\u0001[k\u0004th<iC\u0006ZO{~kDFk\t{[\u0018N1| l\u0010";
        objectArray[21] = "d\u0019gK\u0004\nj\u0010 C\u0003\u0011'\u0011m\u0002\u001bUE\t\u000fU\u001a#B-\u001aL5\u0011D?\u000eR\u001f$_-q`8Td/zQ\"\u0002j=\u0004H?3_N-EZ\u0010z;\u000e\u001f\u001c5Q->s\u000e\u0002d6yi\u001c\u0017l\u00061OU\u0002M,-b<\u0011F\u001a\u0007e\"\u000e{1\fB=-K\u0017\u000ft9]Y\u001f\"H\u0000";
        objectArray[22] = "IV\u001b{z9G_\\s}\"\n^\u00112J1iGYoX/pY_u}\u0011W\u0000Sw'%ue\u0003op\u001fp]VXb\u0011FjyUt\u0014EzL j\u001a~tAr%1w[AP~g\u0014\u0000\fU`\u001f^iVo#\u001e\u001cK\u0002{k\u0017}CFT$\u000f`\nDp&5N_@W*=TPp[~";
        objectArray[23] = "YNI_TbP@J\u0016\u0017oHHC\u0010]d_S\n\u0014An_QP\u0018VcI\u000f`\bWlWHG2V`W@J\u0015|uYDT\u0005PbTu]\u0001\\";
        objectArray[24] = "X\u0017yUwjQ\u0019z\u001c4gI\u0011s\u001a~l^\n:\u001ebf^\b`\u0012ukHVW\u0014whZ\u0016p(ckO\u0019l>bf^\b`\u0012uk";
        objectArray[25] = "q\u0019\u000f\u0018K`o\u0011\u0015W&zw\u0014\u001c\u001a\u0011|t\u0016";
        objectArray[26] = Void.TYPE;
        m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.f[26] = "java/lang/Void";
        objectArray[27] = "\u001d\u0000O.B\u001d\u0003\bUa \u0001\u0004\u0015";
        objectArray[28] = "\u000f7R#B6\u0011?Hl\u001f7\u00173E/B\u0010\u0011$A#\u0001";
        objectArray[29] = "0f\u001d>\rH.n\u0007qEH4d\u001f6LStA\u001e1@I3h\u0005";
        objectArray[30] = "*3H\u0002AZ*3_^MU0x_@M@7\t\u000e\u001d\u001b\u0001";
        objectArray[31] = "\u001b\u0013tdVP\u0012\u001dw-\u0015]\n\u0015~+_V\u001d\u000e79NX\u001f\u0019j>RP\u0016RJ?\\X\u001d\u000fm#TQ\u000b>l#W[\u001d\u000e";
        objectArray[32] = "9\n\u0017fS$-\f\u0012\u0017B=-\u0015\u001cPRTvQ\n/Y%8Y\u0000*<$+\u000e\u0000xL0-\u000bq";
        objectArray[33] = "*/\u001bsV# 6\u00173$t.#gw\u001d`{:\u00169\u0015j~_";
        objectArray[34] = "\rg*=7\r]&v{\r\u0014K1;:|\u001e*Mr\u001d|>\u001b&\u0017#t.\\-/'h\u000eWA\u00028d\b^W$&J\u0000#Tr%3!.w7\u0017L\u0016\nVr\u00017!Wb\u0014wi\u001d\tL2\u007foO\u0005b&}Q\u0013\u001dtr\u0003]\u001cXb\u0014\u0015I<*t;>vO\u0001Vq\u0017=.VSyGf@\u0018b1$b\u001fZ{I.}\r\\oq$d\u0001\u001c\u001d";
        objectArray[35] = "\u001cFg\u0016\u001a\u000f\u0011\u0000rEp^\u001d\u0000B\u0003\u001fL\u0015\u0011m\u0005pA\u0012\u001az\u0016\u0000U\u0014\u001f\u000b\u0015\bK\u001b\u00031\u0007\n^\t|4@\u000b\t\u0015\rzH\u0001\fp";
        objectArray[36] = "\u0016i\u0001;pp\u0016qDs\tp[oB/xB]f\\ \t:B*U'oeKe_K``\u001a/H57iJm:{w0VnA{ou\u001e\u0017";
        objectArray[37] = "0YU=)i`\u0007K^(>  Z;*S,\u0004U/(#8\u0002P^";
        objectArray[38] = "VF\u0018\u0014b\r\bJ\u0012\u0010RU\u0007^y\u000b4\\\u000eL~\n(^\u0003Mo\u001a?X\u0017]E\u0010R\u000eV^G\u000bnN\f\u0010Pj";
        objectArray[39] = "\u0018\f\u000b\b\u000bnHMWN1}\u001f\n2\u001f^s\t\n\u0012\u00031r\b\u0006\u0003\u0018\u0000+\u0012\u0016Sr";
        objectArray[40] = "\u001b\u001fUY/@\u0015\u001d\u000fMP\u001fI\u0005\u000bD<-\u001fAR\u001dkzT\u001b\rR?\n@\u001d\b#o\u001c\u001a\u0003\u0014\u0019a\u001e@\u0017k";
        objectArray[41] = "\u000bQaM63\\K}[Z*I\u0017Ba;wU\u0001_C'\u0002\u000b\u000bMA\u0007uUQhXj1\u0018yO\u0005= \u001bx<m!-\u0004dq`g-9C`V .\u001c\u0003m\\j3\nGNO\u001a\u0002'_S\u00019\fYGCD\bw%D]d\u0007\u0004TZcF$\u0005\u001ekB_\u0007?.F3T\u001344Ro?a-\u001d\\7\\as\u001b\\\r^k3\u0000Y1N=4\u001f;";
        objectArray[42] = "d\u007f\u001f\u000eJ\u001f#z\n\u001e6\u00192x\u0001?J\u0019>w\u0002dF\u00019`\u0002\u0014R\u0007<\u0011";
        objectArray[43] = "\u0012~-m\u0017,\u0012fh%n8O|\u0016\"W,\u001aegl_&\u001f\u0000";
        objectArray[44] = "Y$\u0019[-U\u0002w\u0003GTB\n0\u0005ST\u0001\r8\u0014B(F\b-\u0004>oX\u001b-D]o\u0006\u001d-~N6\\\u0012%\u000eZ0Yc";
        objectArray[45] = "\u000bTa`\u000b*\u0006\u0016{)w6\u0016Vm1\u0012M\t\u0017=e\u001a<\fI02w";
        objectArray[46] = "[<\u001b\u0011\u0017\u0015\u000e\u007f\u000bMnL\u001bo\u0015\f\u001fFz\u0013\\+\u001ffKx9\u0015\u0017v\fs\u0001\u0011\u000bV\u0007\u001f,\u000e\u0007P\u000e\t\n\u0010)Xs\n\\\u0013Py~)\u0019!/NZ\b\\7Ty\u0007<:A\nEY\u0012\u001cI\f\u0017U<\bK2KM*\\5>D\b<:#*dz*\u0015\b\u0015\u0017Q\b_!^v\u0006\rWq\u0003VJ%\u001c\bVR\u0006}g\u001f\u0004EE/\u001bH\u001eYSC";
        objectArray[47] = "n\u00052XI0k[?\u000f$$dF\u000f\u0006D\"iA4\u0017J.4>l^\u0019|`Oi\u0000\u0014+\r";
        objectArray[48] = "L\u0004\npM`\u001c\u0005\f)+Y@\tXd\u0013u3\u0019)(a66\u001f\u001aiM:\u0012\u0013\"[mn\u000b6(/Q@\b\u0004\rQLY1@\r,H8\u001b%S/\u0016C\n\u0017\u0014UokN\u0013\u0005wrU\u0011\u00187W\u001a`0\u0013/)Y~A\u0013#nyD7\u0014\"vzL-*QrO@#\u0005$gQ?\u0013C:\u0015\u0015a\u000f\u0013\u001a.G}\u0003\u0013h.I\u007f\u0016B\u000b.\u0017y\u0016x";
        objectArray[49] = "d.4\u0013\u001f3n\u007f0U`gq,dW\r\f4xv\u0013\u0005}zp|\u0016`cz-oE\u0002j:<1+";
        objectArray[50] = "_R\u001b\u0005\u0007/KT\u001et\u0005&RY\u0019\u000f)0IW\u0007\u0019#6T]}\u0004\n9^_\r\u0010\f</\t\u0018\u000fT!Q\r\fHW_";
        objectArray[51] = "\u000b\u0017UzI\b\u0001\u000eY:;Q\u0019*L9GAb^L:\u0007N\u001cZX}\u00040";
        Object[] objectArray2 = objectArray;
        objectArray[52] = "$\u0010a\u0004\u0002Xz\u001f/\u0005y_*\u001e\u007f\u001e\u0015mvX!EyY|_\"\u0014\b\\\"Ruy\u001dDw\rr\u0017\u0013X=]\u001fI\u0007\u00017\u001bdI\u001fD\u007fb";
    }

    public static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.a(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'I' || c == 'N' || c == '\u00df' || c == '\u00ff') {
                field = m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.c(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'I' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'N' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00df' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.d(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'h' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 1, new Class[]{Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static Method a(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        block0: for (Method method : clazz.getDeclaredMethods()) {
            Class<?>[] classArray2;
            if (!method.getName().equals(string) || method.getReturnType() != clazz2 || (classArray2 = method.getParameterTypes()).length != n) continue;
            for (int i = 0; i < n; ++i) {
                if (classArray2[i] != classArray[i]) continue block0;
            }
            return method;
        }
        return null;
    }

    public static class_151 a(class_151 class_1512) {
        return class_1512;
    }

    public static String a(int n, int n2) {
        int n3 = (n ^ 0xFFFFC011) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 116;
                case 1 -> 92;
                case 2 -> 189;
                case 3 -> 164;
                case 4 -> 157;
                case 5 -> 123;
                case 6 -> 76;
                case 7 -> 28;
                case 8 -> 217;
                case 9 -> 148;
                case 10 -> 136;
                case 11 -> 56;
                case 12 -> 144;
                case 13 -> 245;
                case 14 -> 171;
                case 15 -> 78;
                case 16 -> 222;
                case 17 -> 154;
                case 18 -> 68;
                case 19 -> 111;
                case 20 -> 221;
                case 21 -> 29;
                case 22 -> 98;
                case 23 -> 88;
                case 24 -> 14;
                case 25 -> 232;
                case 26 -> 155;
                case 27 -> 246;
                case 28 -> 117;
                case 29 -> 45;
                case 30 -> 43;
                case 31 -> 91;
                case 32 -> 61;
                case 33 -> 196;
                case 34 -> 93;
                case 35 -> 224;
                case 36 -> 169;
                case 37 -> 53;
                case 38 -> 134;
                case 39 -> 18;
                case 40 -> 96;
                case 41 -> 147;
                case 42 -> 32;
                case 43 -> 118;
                case 44 -> 85;
                case 45 -> 101;
                case 46 -> 159;
                case 47 -> 63;
                case 48 -> 114;
                case 49 -> 46;
                case 50 -> 181;
                case 51 -> 194;
                case 52 -> 22;
                case 53 -> 4;
                case 54 -> 203;
                case 55 -> 57;
                case 56 -> 188;
                case 57 -> 240;
                case 58 -> 36;
                case 59 -> 44;
                case 60 -> 209;
                case 61 -> 83;
                case 62 -> 249;
                case 63 -> 185;
                case 64 -> 158;
                case 65 -> 50;
                case 66 -> 6;
                case 67 -> 102;
                case 68 -> 66;
                case 69 -> 179;
                case 70 -> 251;
                case 71 -> 206;
                case 72 -> 128;
                case 73 -> 81;
                case 74 -> 40;
                case 75 -> 165;
                case 76 -> 135;
                case 77 -> 51;
                case 78 -> 58;
                case 79 -> 70;
                case 80 -> 247;
                case 81 -> 137;
                case 82 -> 90;
                case 83 -> 227;
                case 84 -> 199;
                case 85 -> 124;
                case 86 -> 82;
                case 87 -> 213;
                case 88 -> 160;
                case 89 -> 152;
                case 90 -> 183;
                case 91 -> 62;
                case 92 -> 35;
                case 93 -> 23;
                case 94 -> 112;
                case 95 -> 87;
                case 96 -> 41;
                case 97 -> 236;
                case 98 -> 73;
                case 99 -> 243;
                case 100 -> 94;
                case 101 -> 42;
                case 102 -> 127;
                case 103 -> 71;
                case 104 -> 27;
                case 105 -> 39;
                case 106 -> 110;
                case 107 -> 132;
                case 108 -> 65;
                case 109 -> 104;
                case 110 -> 204;
                case 111 -> 1;
                case 112 -> 106;
                case 113 -> 235;
                case 114 -> 142;
                case 115 -> 48;
                case 116 -> 100;
                case 117 -> 231;
                case 118 -> 129;
                case 119 -> 17;
                case 120 -> 95;
                case 121 -> 198;
                case 122 -> 0;
                case 123 -> 25;
                case 124 -> 233;
                case 125 -> 141;
                case 126 -> 239;
                case 127 -> 153;
                case 128 -> 172;
                case 129 -> 97;
                case 130 -> 86;
                case 131 -> 99;
                case 132 -> 7;
                case 133 -> 253;
                case 134 -> 72;
                case 135 -> 52;
                case 136 -> 182;
                case 137 -> 80;
                case 138 -> 212;
                case 139 -> 176;
                case 140 -> 195;
                case 141 -> 223;
                case 142 -> 248;
                case 143 -> 89;
                case 144 -> 238;
                case 145 -> 60;
                case 146 -> 254;
                case 147 -> 208;
                case 148 -> 8;
                case 149 -> 234;
                case 150 -> 201;
                case 151 -> 26;
                case 152 -> 140;
                case 153 -> 210;
                case 154 -> 31;
                case 155 -> 149;
                case 156 -> 11;
                case 157 -> 115;
                case 158 -> 109;
                case 159 -> 242;
                case 160 -> 229;
                case 161 -> 156;
                case 162 -> 205;
                case 163 -> 30;
                case 164 -> 163;
                case 165 -> 19;
                case 166 -> 215;
                case 167 -> 130;
                case 168 -> 237;
                case 169 -> 2;
                case 170 -> 252;
                case 171 -> 167;
                case 172 -> 191;
                case 173 -> 15;
                case 174 -> 12;
                case 175 -> 9;
                case 176 -> 121;
                case 177 -> 67;
                case 178 -> 175;
                case 179 -> 131;
                case 180 -> 125;
                case 181 -> 47;
                case 182 -> 64;
                case 183 -> 220;
                case 184 -> 241;
                case 185 -> 105;
                case 186 -> 170;
                case 187 -> 24;
                case 188 -> 226;
                case 189 -> 21;
                case 190 -> 54;
                case 191 -> 120;
                case 192 -> 143;
                case 193 -> 186;
                case 194 -> 180;
                case 195 -> 184;
                case 196 -> 133;
                case 197 -> 74;
                case 198 -> 190;
                case 199 -> 37;
                case 200 -> 5;
                case 201 -> 59;
                case 202 -> 211;
                case 203 -> 192;
                case 204 -> 244;
                case 205 -> 145;
                case 206 -> 216;
                case 207 -> 126;
                case 208 -> 207;
                case 209 -> 151;
                case 210 -> 197;
                case 211 -> 161;
                case 212 -> 3;
                case 213 -> 113;
                case 214 -> 139;
                case 215 -> 13;
                case 216 -> 38;
                case 217 -> 166;
                case 218 -> 20;
                case 219 -> 119;
                case 220 -> 230;
                case 221 -> 75;
                case 222 -> 228;
                case 223 -> 146;
                case 224 -> 150;
                case 225 -> 162;
                case 226 -> 168;
                case 227 -> 84;
                case 228 -> 79;
                case 229 -> 34;
                case 230 -> 103;
                case 231 -> 10;
                case 232 -> 193;
                case 233 -> 69;
                case 234 -> 173;
                case 235 -> 49;
                case 236 -> 218;
                case 237 -> 200;
                case 238 -> 122;
                case 239 -> 214;
                case 240 -> 77;
                case 241 -> 16;
                case 242 -> 250;
                case 243 -> 255;
                case 244 -> 174;
                case 245 -> 108;
                case 246 -> 177;
                case 247 -> 107;
                case 248 -> 178;
                case 249 -> 219;
                case 250 -> 187;
                case 251 -> 202;
                case 252 -> 138;
                case 253 -> 33;
                case 254 -> 225;
                default -> 55;
            };
            int n6 = (n2 & 0xFF) - n5;
            if (n6 < 0) {
                n6 += 256;
            }
            if ((n4 = ((n2 & 0xFFFF) >>> 8) - n5) < 0) {
                n4 += 256;
            }
            int n7 = 0;
            while (n7 < cArray.length) {
                int n8 = n7 % 2;
                int n9 = n7;
                char[] cArray2 = cArray;
                char c = cArray[n9];
                if (n8 == 0) {
                    cArray2[n9] = (char)(c ^ n6);
                    n6 = ((n6 >>> 3 | n6 << 5) ^ cArray[n7]) & 0xFF;
                } else {
                    cArray2[n9] = (char)(c ^ n4);
                    n4 = ((n4 >>> 3 | n4 << 5) ^ cArray[n7]) & 0xFF;
                }
                ++n7;
            }
            m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.b[n3] = new String(cArray).intern();
        }
        return b[n3];
    }

    public static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1D2D;
        if (d[n2] == null) {
            m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.d[n2] = (int)(c[n2] ^ l);
        }
        return d[n2];
    }

    public static int a(long l) {
        int n;
        int n2;
        int n3 = (int)(l >>> 46);
        if (f[n3] != null) {
            return n3;
        }
        Object object = e[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 46;
            case 1 -> 28;
            case 2 -> 25;
            case 3 -> 15;
            case 4 -> 32;
            case 5 -> 56;
            case 6 -> 20;
            case 7 -> 7;
            case 8 -> 29;
            case 9 -> 57;
            case 10 -> 40;
            case 11 -> 16;
            case 12 -> 36;
            case 13 -> 53;
            case 14 -> 61;
            case 15 -> 8;
            case 16 -> 58;
            case 17 -> 43;
            case 18 -> 13;
            case 19 -> 55;
            case 20 -> 19;
            case 21 -> 47;
            case 22 -> 48;
            case 23 -> 49;
            case 24 -> 37;
            case 25 -> 52;
            case 26 -> 34;
            case 27 -> 24;
            case 28 -> 14;
            case 29 -> 33;
            case 30 -> 12;
            case 31 -> 18;
            case 32 -> 5;
            case 33 -> 51;
            case 34 -> 9;
            case 35 -> 23;
            case 36 -> 42;
            case 37 -> 11;
            case 38 -> 59;
            case 39 -> 41;
            case 40 -> 30;
            case 41 -> 54;
            case 42 -> 60;
            case 43 -> 3;
            case 44 -> 2;
            case 45 -> 63;
            case 46 -> 6;
            case 47 -> 1;
            case 48 -> 10;
            case 49 -> 27;
            case 50 -> 21;
            case 51 -> 26;
            case 52 -> 45;
            case 53 -> 0;
            case 54 -> 39;
            case 55 -> 62;
            case 56 -> 4;
            case 57 -> 22;
            case 58 -> 50;
            case 59 -> 38;
            case 60 -> 44;
            case 61 -> 35;
            case 62 -> 31;
            default -> 17;
        };
        int[] nArray = new int[6];
        int n5 = 0;
        while (n5 < 6) {
            n2 = 7 * (5 - n5);
            n = (int)(l >>> n2 & 0x7FL);
            if ((n -= n4) < 0) {
                n += 128;
            }
            nArray[n5] = n;
            ++n5;
        }
        char[] cArray = ((String)object).toCharArray();
        n2 = 0;
        while (n2 < cArray.length) {
            n = nArray[n2 % nArray.length];
            if (n == 0) break;
            cArray[n2] = (char)(cArray[n2] ^ n);
            ++n2;
        }
        m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.f[n3] = new String(cArray);
        return n3;
    }

    public String parse(StringReader stringReader, int n) {
        return m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.a("h", (Object)stringReader, (long)3011329295884397L);
    }

    public static String m$$euM1EpojsklPMnKsqZYUbiGWcraFw2LKdL6HtaxYYjhNuUlvO25q2OSasPdOWo28OXzvXocmqgtkx2E5ff3HjMGd2uEI4aX18(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{-50, -92, -52, 81, 58, -101, 111, -36, 33, 100, -103, -31, 96, 54, 96};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 15]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        }
        catch (Throwable throwable) {
            return "";
        }
    }

    public CompletableFuture listSuggestions(CommandContext commandContext, SuggestionsBuilder suggestionsBuilder) {
        return m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.a("\u00d4", () -> {
            CallSite callSite = m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.a("h", (Object)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$HAOsLBln67ivaO05OnnNGcKBhsRJUSgJDKvKWsdSjDfYhVLWwp217mEcD1XbMfZvXQ0OHszvhVyEuQzElIpaUNNUIup75goW4, (Object)((m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm)((Object)m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.a("h", (Object)commandContext, (Object)m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.a(-16367, -13059), m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.class, (long)2490366813409248L))), (long)3280565086965335L);
            try {
                m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.a("h", (Object)callSite, (int)((~(((m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.a(28530, 5986587143201419865L) & m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.a(10408, 1085376786821985668L)) << m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.a(11972, 5535950381877769196L) | m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.a(25825, 2083288666038204875L) >>> m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.a(11972, 5535950381877769196L) & m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.a(10408, 1085376786821985668L)) - (~\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 & m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.a(10408, 1085376786821985668L))) ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 >>> m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.a(11972, 5535950381877769196L) & m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.a(10408, 1085376786821985668L)) - (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 & m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.a(10408, 1085376786821985668L))), (long)2890366526734066L);
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            CallSite callSite2 = m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.a("h", (Object)m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.a("h", (Object)((List)((Object)m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.a("h", (Object)callSite, (long)2749507593136693L))), (long)3202038070334058L), m$$2clVljJRCQJbjif7omdchwHlBlBYJC5Nbtb7D33CeWvguFfuXUWrhxP60dJIXZZxzAev05L11xOoChOQF7omcBuSzZ9Ioc8oa::getName, (long)3374076699582170L);
            try {
                return (Suggestions)m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.a("h", (Object)m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.a("\u00d4", (Object)callSite2, (Object)suggestionsBuilder, (long)3698071909402447L), (long)3027647622281321L);
            }
            catch (Exception exception) {
                return null;
            }
        }, (Object)m$$usnzfPeWGy6iAn1uPJLR6UgsJVhf38ORt1lPLe11bmnTdwQdPcmX3d47CHJiqfOhVCdu73R8QDlxYkQQkQDkuxD5AsqWq6mRg, (long)2601111505781899L);
    }

    public static m$$2clVljJRCQJbjif7omdchwHlBlBYJC5Nbtb7D33CeWvguFfuXUWrhxP60dJIXZZxzAev05L11xOoChOQF7omcBuSzZ9Ioc8oa getPreset(CommandContext commandContext, String string, String string2, int n) {
        m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm = (m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm)((Object)m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.a("h", (Object)commandContext, (Object)string, m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.class, (long)2490366813409248L));
        String string3 = (String)((Object)m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.a("h", (Object)commandContext, (Object)string2, String.class, (long)2490366813409248L));
        CallSite callSite = m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.a("h", (Object)m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.a("h", (Object)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$HAOsLBln67ivaO05OnnNGcKBhsRJUSgJDKvKWsdSjDfYhVLWwp217mEcD1XbMfZvXQ0OHszvhVyEuQzElIpaUNNUIup75goW4, (Object)m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm, (long)3280565086965335L), m$$2clVljJRCQJbjif7omdchwHlBlBYJC5Nbtb7D33CeWvguFfuXUWrhxP60dJIXZZxzAev05L11xOoChOQF7omcBuSzZ9Ioc8oa -> (boolean)m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.a("h", (Object)m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.a("h", (Object)m$$2clVljJRCQJbjif7omdchwHlBlBYJC5Nbtb7D33CeWvguFfuXUWrhxP60dJIXZZxzAev05L11xOoChOQF7omcBuSzZ9Ioc8oa, (long)2615805692407400L), (Object)string3, (long)3525956439099786L), (long)2405464773363458L);
        try {
            if (m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.a("h", (Object)callSite, (long)3592824254947010L) != false) {
                throw m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.a("h", (Object)new DynamicCommandExceptionType(object -> m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.a("\u00d4", new m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk().m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.a("\u00d4", (Object)object, (long)2320306692284004L)).m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.a(-16368, 1496)), (long)2852446159387279L)), (Object)string3, (long)3501452532939538L);
            }
        }
        catch (class_151 class_1512) {
            throw m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.a(class_1512);
        }
        return (m$$2clVljJRCQJbjif7omdchwHlBlBYJC5Nbtb7D33CeWvguFfuXUWrhxP60dJIXZZxzAev05L11xOoChOQF7omcBuSzZ9Ioc8oa)((Object)m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.a("h", (Object)callSite, (long)2383086261659316L));
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

