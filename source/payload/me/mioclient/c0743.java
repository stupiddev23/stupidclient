/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.concurrent.CompletableFuture;
import me.mioclient.m$$ai2OPmCv1Ik4Bf9MmMIhWdABomxdU9F78feCd0tTx0o2LclrgFD4fPbSdLMlzTFtzsZYcmSUSC7Yf9GKFuBGWqaoZ9eM43gC5;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import net.minecraft.class_151;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz
implements ArgumentType {
    public final Class m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz;
    public final String m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI;
    public static int \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01;
    public static final String[] a;
    public static final String[] b;
    public static final long[] c;
    public static final Integer[] d;
    public static final Object[] e;
    public static final String[] f;

    public m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz(Class clazz) {
        this(clazz, me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.a(13181, -25825));
    }

    public m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz(Class clazz, String string) {
        this.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz = clazz;
        this.m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI = string;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block23: {
                block22: {
                    block21: {
                        me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.e = new Object[40];
                        me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.f = new String[40];
                        me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.a();
                        var17 = new String[2];
                        var15_1 = 0;
                        var14_2 = "I\u00f7\u00d2\u0003\u0013\u0006\u00e4\u0002\u0097\u000fG\u009b\u0090\u0092\u0080\u00c62\u001b\u00a6\u00cf\u00e4:\u00abo";
                        var16_3 = "I\u00f7\u00d2\u0003\u0013\u0006\u00e4\u0002\u0097\u000fG\u009b\u0090\u0092\u0080\u00c62\u001b\u00a6\u00cf\u00e4:\u00abo".length();
                        var13_4 = 4;
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
                        v4 = 8;
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
                                        v11 = 81;
                                        break;
                                    }
                                    case 1: {
                                        v11 = 64;
                                        break;
                                    }
                                    case 2: {
                                        v11 = 64;
                                        break;
                                    }
                                    case 3: {
                                        v11 = 50;
                                        break;
                                    }
                                    case 4: {
                                        v11 = 25;
                                        break;
                                    }
                                    case 5: {
                                        v11 = 91;
                                        break;
                                    }
                                    default: {
                                        v11 = 41;
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
                    me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.a = var17;
                    me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.b = new String[2];
                    var4_7 = 5900184439885494841L;
                    var10_8 = new long[8];
                    var7_9 = 0;
                    var8_10 = "\u00f5\u008b?M}\u0097\u0087\u00a3\u00ef\u00fc\u001c\u00ce\u00ea\u00a2\u0094\u00e1^\u00058\u00b6\u00f6\u00cf\u00f5\u00a9\u0015\u00c9^\u0010\u00b0\u00d4\u00e4\u008c0\u0088\u00ed\u00e15'=\u00be\u00bdc\u00c3\u00b5\u0003\u00ac\u00b9\r";
                    var9_11 = "\u00f5\u008b?M}\u0097\u0087\u00a3\u00ef\u00fc\u001c\u00ce\u00ea\u00a2\u0094\u00e1^\u00058\u00b6\u00f6\u00cf\u00f5\u00a9\u0015\u00c9^\u0010\u00b0\u00d4\u00e4\u008c0\u0088\u00ed\u00e15'=\u00be\u00bdc\u00c3\u00b5\u0003\u00ac\u00b9\r".length();
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
                        var8_10 = "*%\u009av\u00e0\u0017\u0006M@y\u008eC\u0089\u0007Lt";
                        var9_11 = "*%\u009av\u00e0\u0017\u0006M@y\u008eC\u0089\u0007Lt".length();
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
            me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.c = var10_8;
            me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.d = new Integer[8];
            me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.a(24003, 6991365026346604275L);
            break block24;
lbl123:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var2_14 = 2770603873898080712L;
        ** while (true)
        var0_15 = 856216551585701250L ^ var2_14;
        me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.a("I", (long)var0_15, (long)2532422414337215L);
    }

    public String name(Enum enum_) {
        try {
            if (enum_ instanceof m$$ai2OPmCv1Ik4Bf9MmMIhWdABomxdU9F78feCd0tTx0o2LclrgFD4fPbSdLMlzTFtzsZYcmSUSC7Yf9GKFuBGWqaoZ9eM43gC5) {
                return me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.a("n", (Object)((m$$ai2OPmCv1Ik4Bf9MmMIhWdABomxdU9F78feCd0tTx0o2LclrgFD4fPbSdLMlzTFtzsZYcmSUSC7Yf9GKFuBGWqaoZ9eM43gC5)((Object)enum_)), (long)2406240498556795L);
            }
        }
        catch (class_151 class_1512) {
            throw me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.a(class_1512);
        }
        return me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.a("n", (Object)me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.a("n", (Object)enum_, (long)2162796233837475L), (Object)Locale.ROOT, (long)1843944082691170L);
    }

    public static Field b(Class clazz, String string, Class clazz2) {
        Field field = me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Class b(long l) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.a(l);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field c(long l) {
        int n = me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.a(l);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.b(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.b(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.a(clazz3, string2, clazz2)) != null) {
                    me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.b(1387657787663642L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static Method d(long l) {
        int n = me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.a(l);
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
                clazz3 = me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.b(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.b(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.b(1387657787663642L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.b(1387657787663642L);
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

    public static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.a(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c6' || c == 'N' || c == 'T' || c == 'Y') {
                field = me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.c(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c6' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'N' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'T' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.d(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'n' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'I' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        int n3 = (n ^ 0x337D) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 249;
                case 1 -> 69;
                case 2 -> 46;
                case 3 -> 83;
                case 4 -> 151;
                case 5 -> 110;
                case 6 -> 179;
                case 7 -> 6;
                case 8 -> 184;
                case 9 -> 48;
                case 10 -> 193;
                case 11 -> 79;
                case 12 -> 24;
                case 13 -> 99;
                case 14 -> 53;
                case 15 -> 168;
                case 16 -> 202;
                case 17 -> 41;
                case 18 -> 146;
                case 19 -> 80;
                case 20 -> 196;
                case 21 -> 122;
                case 22 -> 59;
                case 23 -> 117;
                case 24 -> 58;
                case 25 -> 114;
                case 26 -> 194;
                case 27 -> 5;
                case 28 -> 26;
                case 29 -> 183;
                case 30 -> 97;
                case 31 -> 182;
                case 32 -> 84;
                case 33 -> 144;
                case 34 -> 116;
                case 35 -> 73;
                case 36 -> 174;
                case 37 -> 160;
                case 38 -> 172;
                case 39 -> 152;
                case 40 -> 60;
                case 41 -> 50;
                case 42 -> 28;
                case 43 -> 82;
                case 44 -> 3;
                case 45 -> 19;
                case 46 -> 163;
                case 47 -> 47;
                case 48 -> 51;
                case 49 -> 176;
                case 50 -> 11;
                case 51 -> 119;
                case 52 -> 57;
                case 53 -> 180;
                case 54 -> 147;
                case 55 -> 77;
                case 56 -> 105;
                case 57 -> 195;
                case 58 -> 113;
                case 59 -> 52;
                case 60 -> 231;
                case 61 -> 63;
                case 62 -> 233;
                case 63 -> 246;
                case 64 -> 20;
                case 65 -> 1;
                case 66 -> 218;
                case 67 -> 221;
                case 68 -> 162;
                case 69 -> 142;
                case 70 -> 209;
                case 71 -> 87;
                case 72 -> 175;
                case 73 -> 89;
                case 74 -> 245;
                case 75 -> 15;
                case 76 -> 34;
                case 77 -> 240;
                case 78 -> 127;
                case 79 -> 198;
                case 80 -> 199;
                case 81 -> 123;
                case 82 -> 215;
                case 83 -> 101;
                case 84 -> 238;
                case 85 -> 9;
                case 86 -> 181;
                case 87 -> 91;
                case 88 -> 210;
                case 89 -> 226;
                case 90 -> 255;
                case 91 -> 88;
                case 92 -> 156;
                case 93 -> 228;
                case 94 -> 178;
                case 95 -> 32;
                case 96 -> 100;
                case 97 -> 222;
                case 98 -> 131;
                case 99 -> 161;
                case 100 -> 10;
                case 101 -> 55;
                case 102 -> 216;
                case 103 -> 35;
                case 104 -> 17;
                case 105 -> 125;
                case 106 -> 237;
                case 107 -> 143;
                case 108 -> 44;
                case 109 -> 21;
                case 110 -> 30;
                case 111 -> 191;
                case 112 -> 235;
                case 113 -> 0;
                case 114 -> 54;
                case 115 -> 104;
                case 116 -> 102;
                case 117 -> 141;
                case 118 -> 201;
                case 119 -> 14;
                case 120 -> 177;
                case 121 -> 31;
                case 122 -> 115;
                case 123 -> 68;
                case 124 -> 150;
                case 125 -> 111;
                case 126 -> 109;
                case 127 -> 207;
                case 128 -> 148;
                case 129 -> 38;
                case 130 -> 75;
                case 131 -> 248;
                case 132 -> 29;
                case 133 -> 212;
                case 134 -> 140;
                case 135 -> 227;
                case 136 -> 187;
                case 137 -> 137;
                case 138 -> 145;
                case 139 -> 166;
                case 140 -> 39;
                case 141 -> 211;
                case 142 -> 204;
                case 143 -> 62;
                case 144 -> 192;
                case 145 -> 66;
                case 146 -> 95;
                case 147 -> 250;
                case 148 -> 56;
                case 149 -> 173;
                case 150 -> 27;
                case 151 -> 33;
                case 152 -> 85;
                case 153 -> 224;
                case 154 -> 106;
                case 155 -> 118;
                case 156 -> 98;
                case 157 -> 108;
                case 158 -> 25;
                case 159 -> 49;
                case 160 -> 112;
                case 161 -> 18;
                case 162 -> 149;
                case 163 -> 232;
                case 164 -> 61;
                case 165 -> 229;
                case 166 -> 7;
                case 167 -> 244;
                case 168 -> 124;
                case 169 -> 74;
                case 170 -> 8;
                case 171 -> 43;
                case 172 -> 164;
                case 173 -> 169;
                case 174 -> 185;
                case 175 -> 254;
                case 176 -> 251;
                case 177 -> 93;
                case 178 -> 203;
                case 179 -> 223;
                case 180 -> 165;
                case 181 -> 158;
                case 182 -> 71;
                case 183 -> 135;
                case 184 -> 139;
                case 185 -> 36;
                case 186 -> 230;
                case 187 -> 2;
                case 188 -> 252;
                case 189 -> 23;
                case 190 -> 78;
                case 191 -> 247;
                case 192 -> 129;
                case 193 -> 136;
                case 194 -> 16;
                case 195 -> 159;
                case 196 -> 65;
                case 197 -> 236;
                case 198 -> 92;
                case 199 -> 90;
                case 200 -> 155;
                case 201 -> 103;
                case 202 -> 242;
                case 203 -> 234;
                case 204 -> 171;
                case 205 -> 253;
                case 206 -> 213;
                case 207 -> 241;
                case 208 -> 167;
                case 209 -> 126;
                case 210 -> 67;
                case 211 -> 205;
                case 212 -> 153;
                case 213 -> 40;
                case 214 -> 138;
                case 215 -> 219;
                case 216 -> 132;
                case 217 -> 217;
                case 218 -> 120;
                case 219 -> 225;
                case 220 -> 12;
                case 221 -> 188;
                case 222 -> 45;
                case 223 -> 130;
                case 224 -> 37;
                case 225 -> 186;
                case 226 -> 96;
                case 227 -> 4;
                case 228 -> 239;
                case 229 -> 107;
                case 230 -> 13;
                case 231 -> 200;
                case 232 -> 94;
                case 233 -> 214;
                case 234 -> 208;
                case 235 -> 128;
                case 236 -> 157;
                case 237 -> 190;
                case 238 -> 154;
                case 239 -> 220;
                case 240 -> 72;
                case 241 -> 133;
                case 242 -> 42;
                case 243 -> 121;
                case 244 -> 170;
                case 245 -> 22;
                case 246 -> 206;
                case 247 -> 76;
                case 248 -> 189;
                case 249 -> 134;
                case 250 -> 81;
                case 251 -> 86;
                case 252 -> 70;
                case 253 -> 197;
                case 254 -> 243;
                default -> 64;
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
            me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.b[n3] = new String(cArray).intern();
        }
        return b[n3];
    }

    public static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4B34;
        if (d[n2] == null) {
            me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.d[n2] = (int)(c[n2] ^ l);
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
            case 1 -> 11;
            case 2 -> 45;
            case 3 -> 59;
            case 4 -> 34;
            case 5 -> 54;
            case 6 -> 52;
            case 7 -> 39;
            case 8 -> 47;
            case 9 -> 27;
            case 10 -> 23;
            case 11 -> 18;
            case 12 -> 55;
            case 13 -> 16;
            case 14 -> 56;
            case 15 -> 10;
            case 16 -> 1;
            case 17 -> 43;
            case 18 -> 25;
            case 19 -> 58;
            case 20 -> 6;
            case 21 -> 53;
            case 22 -> 5;
            case 23 -> 13;
            case 24 -> 35;
            case 25 -> 60;
            case 26 -> 62;
            case 27 -> 17;
            case 28 -> 8;
            case 29 -> 19;
            case 30 -> 63;
            case 31 -> 4;
            case 32 -> 40;
            case 33 -> 32;
            case 34 -> 38;
            case 35 -> 21;
            case 36 -> 50;
            case 37 -> 61;
            case 38 -> 3;
            case 39 -> 36;
            case 40 -> 29;
            case 41 -> 9;
            case 42 -> 20;
            case 43 -> 22;
            case 44 -> 51;
            case 45 -> 2;
            case 46 -> 7;
            case 47 -> 41;
            case 48 -> 42;
            case 49 -> 48;
            case 50 -> 44;
            case 51 -> 49;
            case 52 -> 12;
            case 53 -> 14;
            case 54 -> 26;
            case 55 -> 30;
            case 56 -> 15;
            case 57 -> 28;
            case 58 -> 37;
            case 59 -> 33;
            case 60 -> 24;
            case 61 -> 31;
            case 62 -> 0;
            default -> 57;
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
        me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.f[n3] = new String(cArray);
        return n3;
    }

    public static void a() {
        Object[] objectArray = e;
        e[0] = "\u000e,\u0006,\fG\u0005#\u0017caG\u0005>\u0003";
        objectArray[1] = "\u0015u[Ytp`UPVe?\u0001[[]aeu";
        objectArray[2] = "\tT\u0000]\"f\u0017\\\u001a\u0012Ma\u0011T\u000fO";
        objectArray[3] = "X}aXgJ-]jWv\u0005LSa\\r_8";
        objectArray[4] = "l=z(Q\u0010r5`g\f\u0011t9m$Q6r.i(\u0012";
        objectArray[5] = "(\u0014)A~56\u001c3\u000e65,\u0016+I?.l3*N34+\u001a1";
        objectArray[6] = "2\u0012\u007fv\u0003s2\u0012h*\u000f|(Yh4\u000fi/(9iY(";
        objectArray[7] = "RI\u000f>S^[G\fw\u0010SCO\u0005qZXTTLcKVVC\u0011dW^_\b1eYVTU\u0016yQ_Bd\u0017yRUTT";
        objectArray[8] = "&\"w\u000b\u001e]8*mDSG\" t\u0018BM\"7/)_E</d\u001eQJ &G\u001fD]>&";
        objectArray[9] = "M\u0000\u0015ogfC\tRg`}\u000e\b\u001f&XKW\u000e\\ab9R\"Sm:LsRVU~{S3\tMtEP\r\\;wEq+i[cYZ\u0006hjD|B\bIa`qcS}nLM\u0013*sZ_ZJQ\rRTzR$W{8Gu\u0017wF;Ds(jc|mk(iF:pj!uFt";
        objectArray[10] = "gEsKUHnKp\u0002\u0016EvCy\u0004\\NaX06LUmDy7]F`Ol";
        objectArray[11] = Integer.TYPE;
        me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.f[11] = "java/lang/Integer";
        objectArray[12] = "XO\u001aE(/S@\u000b\nC-GC";
        objectArray[13] = "$g\u0007bn\u0001*n@ji\u001ago\r+f?\u001cpGG`?}R\u001cbR\u0000!jphp\u001c\fplUN\u0018\u0001;mCn9yP[Zn]?I\u001fua8zHy=E\u000b}Q\u0019UO(&U\u001aJl\"\u001cKMhF/\u001bwY9P\u0006 LX|U!(0K{j:,:Q~3\u001f!6XGj";
        objectArray[14] = Long.TYPE;
        me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.f[14] = "java/lang/Long";
        objectArray[15] = "\u0007\u001co/{b\f\u0013~`\u0006z\u001f\u0014w)";
        objectArray[16] = "H\u0017VnccV\u001fL!\u0001yA\u0017Lj";
        objectArray[17] = "50:\u001f\u0007\u0006;9}\u0017\u0000\u001dv80V\u000f\u0000j\u001aD\u001f-\u001fi\u001c\u007fF,\u000fa\u0018y?'\u0001\u000f1U0\u0001\u0004 1AK(^`3q1\nY,\u0001lB\u0001[\u00146x\u0000\t/\u001car\"\f:<\u0019Y\u001e\u0014=\u001e!n\u000140;8G'=*o\frK)\"\u001e V59\u00189:NK\u000b$lfs1[";
        objectArray[18] = "S\u0012\r#n_Z\u001c\u000ej-RB\u0014\u0007lgYU\u000fNh{SU\r\u0014dl^CS$tmQ]\u0014\u0003Nl]]\u001c\u000eiFHS\u0018\u0010yj_^)\u0019}f";
        objectArray[19] = "K\u0012\u001d\u0003\u0007\u0015@\u001d\fLf\u001bK\u0016\b\u0016";
        objectArray[20] = "\u001a^W\u0010=n\u0013PTY~c\u000bX]_4h\u001cC\u0014[(b\u001cANW?o\n\u001fyQ=l\u0018_^m)o\rPB{(b\u001cANW?o";
        objectArray[21] = Boolean.TYPE;
        me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.f[21] = "java/lang/Boolean";
        objectArray[22] = "Lthw>%9Tcx/jXZhs+0,";
        objectArray[23] = "u\u00135H\u0017\u0007u\u0013\"\u0014\u001b\boX\"\n\u001b\u001dh)sSL_";
        objectArray[24] = "s0}+\u0002Bs0jw\u000eMi{ji\u000eXn\n<7Z\u001b";
        objectArray[25] = "2aWNb\u0000{{=Bh\u0004Om@HN\u001fdpADc\u0004y\u000bSNh\u0015{0\u0006]o\u0013\u0002";
        objectArray[26] = "nd[7v,5$\u001ex\u001b9c\u001a\u0004yv?O7\u0018k\u001b/d \f9v\"xo\u001f\u0006q\u007f<o\u000eo*?y c";
        objectArray[27] = "!3V\u0013\u000b/zs\u0013\\f(,s\u000bK\u001aF!3V\u0013\u000b/zs\u0013\\f((d\u0003[]};c\u0005\"\f|s8\u0003KW<6wn";
        objectArray[28] = "z{}k\u0005<~v#2d.?b)<\u0001U-{)8\u001dnxh.>do=y%+\u000f'<))U";
        objectArray[29] = "e$R\u0011PV+&E\u0014(\u001e2$Q@(X+,C\u001c\u0012\u0004#,H-\u0017\u001bc0\u001b\u0015E\u001fc;*\u001dR\u001ag:E\u0014\u0014\\:^";
        objectArray[30] = "sO'kmjz\ta6\tc*P6Wc?{\u00046>8\u007f>K[";
        objectArray[31] = "f6>drO(4)a\n\u00191)+X:\u0005$p\"73Cb-F20Gi!/ip\u0002&L";
        objectArray[32] = "VKZ0>\u0014\nCZ;\u000fT\u0005RD\u0002sT\t]GYe\u0014P\nE0>T\u0015E(";
        objectArray[33] = "\u0017\u0015\ttF\u0019_\u0014Yx8\u0017D\u0013h.[\u0003\u0014\u0015\u001apYBUkRkY\u0013S\u0000\u001aj\t\u001f-";
        objectArray[34] = "\u001adkh\u0010\u0001\t=}i!\u0001\u001c'RnD\u0003q1.?\u0010\u0003\u0018jnz_n";
        objectArray[35] = "\u0017n,O&~\u001b=)\u0017XP\u0017&\"\u0004`|d6SH\u0012?a0`\t>3E<X;\u001eg\\\u0019RO\"I_+w1?PfowL;1L\n)OeJ]8n5\u001cb\u0019<\u007f\u0017\u0001\\F7M7iig<UI*w\u0016<Y\u000e\nM`;X\u0016\tEz\u0005+\u0012<It*^\u0007\"6Dl@u1dImv\u000e84\u001f/\u0012J%6Hf*\u0018!6CW";
        objectArray[36] = "w$\\+DB,.U0\u007fHf9X3\u0012#p2O3AZ};[\"\u007fNwiM2\u0012A`=KO";
        objectArray[37] = "\u0004v\u001e7:}_6[xWy\u00171Ob,U\u0001*A|:_\u00077K\u0006=.V}Kofn\u00132&k1i\u001f)Jg=w\u0007L";
        objectArray[38] = "YW\u0016[\u0004\u0015\u0006OIZo\u001b\bN\u0013\u0003\u0003)T\bMXoD\u001bS\u0012\u001a\u0004\f\u001a\u0003\u001edS\u0000\u001dC\u0002\u001cVC\u001c@sZR\u0010\u0002\tI\u0016\u000eE\u00062";
        Object[] objectArray2 = objectArray;
        objectArray[39] = "n;hy\u0001+0oo2:sl.odVA=i3<\u0002\u0016kh72W\u007f0(r}:yz?ei\u0003g9(v\u0003";
    }

    public Enum parse(StringReader stringReader, int n) {
        CallSite callSite = me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.a("n", (Object)stringReader, (long)2261068516661843L);
        for (Enum enum_ : (Enum[])me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.a("n", (Object)this.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz, (long)1825672337705204L)) {
            try {
                if (me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.a("n", (Object)me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.a("n", (Object)this, (Object)enum_, (long)2185652739151393L), (Object)callSite, (long)2626594169473617L) == false) continue;
                return enum_;
            }
            catch (class_151 class_1512) {
                throw me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.a(class_1512);
            }
        }
        throw me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.a("n", (Object)new DynamicCommandExceptionType(object -> {
            Object[] objectArray = new Object[me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.a(14653, 9028526353166758411L) - (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 & me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.a(23058, 8895973990888837415L)) + (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 >>> me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.a(21906, 5961919013721054885L) & me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.a(641, 6000180914446846386L)) ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01];
            objectArray[0] = this.m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI;
            objectArray[1] = object;
            return me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.a("I", (Object)me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.a("I", me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.a(13180, -102), (Object)objectArray, (long)1955866363331430L), (long)2798322119664950L);
        }), (Object)callSite, (long)2591715491169211L);
    }

    public static String m$$nQWHdJ7GN4KtJ0wT5afprZ5QhDmxpTQmSIuZTx3P6yY6kp84H9hfBsuoiWsOVh29W6HAbYKJypqors82YXlK8e9bxSnnaxehl(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{44, 12, 83, 16, -21, -72, 73, 23, 127, 119, -43};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 11]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        }
        catch (Throwable throwable) {
            return "";
        }
    }

    public CompletableFuture listSuggestions(CommandContext commandContext, SuggestionsBuilder suggestionsBuilder) {
        return me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.a("I", (Object)me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.a("n", (Object)me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.a("I", (Object)((Enum[])me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.a("n", (Object)this.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz, (long)1825672337705204L)), (long)2001095056707601L), this::name, (long)2359828449077661L), (Object)suggestionsBuilder, (long)2718048073039242L);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

