/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
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
import me.mioclient.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk;
import me.mioclient.m$$UMzUbts95JkNSxbhWStV8Ed2iBf6xXdhcMJydtC5FzfYzcUNcIIHBKoMpYbgjayJ9s5ljuWZEBJIG3CDBdN8Sc3J6Gbd29oyx;
import me.mioclient.m$$UMzUbts95JkNSxbhWStV8Ed2iBf6xXdhcMJydtC5FzfYzcUNcIIHBKoMpYbgjayJ9s5ljuWZEBJIG3CDBdN8Sc3J6Gbd29oyx$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.mixin.m$$gl3EfLevy2HeXfmH3nGBAdrJgvseio5Dg5ySK0uWKWMcq2TqrBI7zUspmnI48A87k5xeRsaIk77R8tNALW9TMZhOs90axM5Zf;
import net.minecraft.class_151;
import net.minecraft.class_3675;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI
implements ArgumentType {
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
        block31: {
            block30: {
                block29: {
                    block28: {
                        block27: {
                            m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.e = new Object[39];
                            m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.f = new String[39];
                            m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a();
                            var17 = new String[5];
                            var15_1 = 0;
                            var14_2 = "\u00c6\u00be?`\u00c69e\u001bK\u00b4\u00c9\u00a3\u0090\u000e(b\u00e2\u00fb}J\u0012u\u00a5y\u0014\u001a+h\u0006`\u00be%r\u0002\u00cd";
                            var16_3 = "\u00c6\u00be?`\u00c69e\u001bK\u00b4\u00c9\u00a3\u0090\u000e(b\u00e2\u00fb}J\u0012u\u00a5y\u0014\u001a+h\u0006`\u00be%r\u0002\u00cd".length();
                            var13_4 = 13;
                            var12_5 = -1;
lbl10:
                            // 2 sources

                            while (true) {
                                v0 = 101;
                                v1 = ++var12_5;
                                v2 = var14_2.substring(v1, v1 + var13_4);
                                v3 = -1;
                                break block27;
                                break;
                            }
lbl16:
                            // 1 sources

                            while (true) {
                                var17[var15_1++] = v4.intern();
                                if ((var12_5 += var13_4) < var16_3) {
                                    var13_4 = var14_2.charAt(var12_5);
                                    ** continue;
                                }
                                var14_2 = ":\u00b9\u0018\u00e4\u00d3\u0005\u0012{\u001d\u00bcs";
                                var16_3 = ":\u00b9\u0018\u00e4\u00d3\u0005\u0012{\u001d\u00bcs".length();
                                var13_4 = 5;
                                var12_5 = -1;
lbl25:
                                // 2 sources

                                while (true) {
                                    v0 = 60;
                                    v5 = ++var12_5;
                                    v2 = var14_2.substring(v5, v5 + var13_4);
                                    v3 = 0;
                                    break block27;
                                    break;
                                }
                                break;
                            }
lbl31:
                            // 1 sources

                            while (true) {
                                var17[var15_1++] = v4.intern();
                                if ((var12_5 += var13_4) < var16_3) {
                                    var13_4 = var14_2.charAt(var12_5);
                                    ** continue;
                                }
                                break block28;
                                break;
                            }
                        }
                        v6 = v2.toCharArray();
                        v7 = v6.length;
                        var18_6 = 0;
                        v8 = v0;
                        v9 = v6;
                        v10 = v7;
                        if (v7 > 1) ** GOTO lbl88
                        do {
                            v11 = v8;
                            v9 = v9;
                            v12 = v9;
                            v13 = v8;
                            v14 = var18_6;
                            while (true) {
                                switch (var18_6 % 7) {
                                    case 0: {
                                        v15 = 121;
                                        break;
                                    }
                                    case 1: {
                                        v15 = 30;
                                        break;
                                    }
                                    case 2: {
                                        v15 = 126;
                                        break;
                                    }
                                    case 3: {
                                        v15 = 90;
                                        break;
                                    }
                                    case 4: {
                                        v15 = 26;
                                        break;
                                    }
                                    case 5: {
                                        v15 = 57;
                                        break;
                                    }
                                    default: {
                                        v15 = 72;
                                    }
                                }
                                v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                                ++var18_6;
                                v8 = v11;
                                if (v11 != 0) break;
                                v11 = v8;
                                v9 = v9;
                                v14 = v8;
                                v12 = v9;
                                v13 = v8;
                            }
lbl88:
                            // 2 sources

                            v16 = v9;
                            v10 = v10;
                        } while (v10 > var18_6);
                        v4 = new String(v16);
                        switch (v3) {
                            default: {
                                ** continue;
                            }
                            ** case 0:
lbl98:
                            // 1 sources

                            ** continue;
                        }
                    }
                    m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a = var17;
                    m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.b = new String[5];
                    var4_7 = 2562852056510793481L;
                    var10_8 = new long[15];
                    var7_9 = 0;
                    var8_10 = "\u00b3\u0014\u0092\u0019\u00b6\u00f4D1\u00b1\u00b0\u001b\u001a\u00c5\u00d6B\u00b5\t\u0087\u0089\\\u00a2\u00ca\u00f8\u00c7W\u0088\u00d7\u00ea]J\u00c4\u008b\u00e4\n\u00d9\u00e5\u00c6{?\u00fek;\u00d4\u008el\u0019\u00c9\u00d4\u00d1}\r}\u0017\u00d7\u00e7M\u00d8~;\u0089\u009f\u00e9\u00cc\u0010k\u00bc\u00f3\u00b6v\u00b4cv\u00ac\u0097\u00e0\u0018\u0001H\u0097\u001dE\u0088\u0088x\u00a3\u00edP\u00cdT\u0019\u00fd\u009fO\u0089x'\u001a\u00ecox\u00a7I\u0012\u0085";
                    var9_11 = "\u00b3\u0014\u0092\u0019\u00b6\u00f4D1\u00b1\u00b0\u001b\u001a\u00c5\u00d6B\u00b5\t\u0087\u0089\\\u00a2\u00ca\u00f8\u00c7W\u0088\u00d7\u00ea]J\u00c4\u008b\u00e4\n\u00d9\u00e5\u00c6{?\u00fek;\u00d4\u008el\u0019\u00c9\u00d4\u00d1}\r}\u0017\u00d7\u00e7M\u00d8~;\u0089\u009f\u00e9\u00cc\u0010k\u00bc\u00f3\u00b6v\u00b4cv\u00ac\u0097\u00e0\u0018\u0001H\u0097\u001dE\u0088\u0088x\u00a3\u00edP\u00cdT\u0019\u00fd\u009fO\u0089x'\u001a\u00ecox\u00a7I\u0012\u0085".length();
                    var6_12 = 0;
                    while (true) {
                        var11_13 = var8_10.substring(var6_12, var6_12 += 8).getBytes("ISO-8859-1");
                        v17 = var10_8;
                        v18 = var7_9++;
                        v19 = ((long)var11_13[0] & 255L) << 56 | ((long)var11_13[1] & 255L) << 48 | ((long)var11_13[2] & 255L) << 40 | ((long)var11_13[3] & 255L) << 32 | ((long)var11_13[4] & 255L) << 24 | ((long)var11_13[5] & 255L) << 16 | ((long)var11_13[6] & 255L) << 8 | (long)var11_13[7] & 255L;
                        v20 = -1;
                        break block29;
                        break;
                    }
lbl115:
                    // 1 sources

                    while (true) {
                        v17[v18] = v21;
                        if (var6_12 < var9_11) ** continue;
                        var8_10 = "=\u00e3\u00de\u00b9-\u00dd\u000en\u00d7\u00d0R\u00cb\u00d0TJJ";
                        var9_11 = "=\u00e3\u00de\u00b9-\u00dd\u000en\u00d7\u00d0R\u00cb\u00d0TJJ".length();
                        var6_12 = 0;
                        while (true) {
                            var11_13 = var8_10.substring(var6_12, var6_12 += 8).getBytes("ISO-8859-1");
                            v17 = var10_8;
                            v18 = var7_9++;
                            v19 = ((long)var11_13[0] & 255L) << 56 | ((long)var11_13[1] & 255L) << 48 | ((long)var11_13[2] & 255L) << 40 | ((long)var11_13[3] & 255L) << 32 | ((long)var11_13[4] & 255L) << 24 | ((long)var11_13[5] & 255L) << 16 | ((long)var11_13[6] & 255L) << 8 | (long)var11_13[7] & 255L;
                            v20 = 0;
                            break block29;
                            break;
                        }
                        break;
                    }
lbl128:
                    // 1 sources

                    while (true) {
                        v17[v18] = v21;
                        if (var6_12 < var9_11) ** continue;
                        break block30;
                        break;
                    }
                }
                v21 = v19 ^ var4_7;
                switch (v20) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl139:
                    // 1 sources

                    ** continue;
                }
            }
            m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.c = var10_8;
            m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.d = new Integer[15];
            m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a(4193, 5142726483591636440L);
            break block31;
lbl145:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var2_14 = 2010128004065500608L;
        ** while (true)
        var0_15 = 8143415690718005838L ^ var2_14;
        m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a("e", (long)var0_15, (long)2029762309996014L);
    }

    public static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.b(classArray2[i], string, clazz2, n, classArray);
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
            int n = m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a(l);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field b(Class clazz, String string, Class clazz2) {
        Field field = m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Field c(long l) {
        int n = m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a(l);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.b(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.b(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a(clazz3, string2, clazz2)) != null) {
                    m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.b(1354743497448611L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static Method d(long l) {
        int n = m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a(l);
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
                clazz3 = m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.b(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.b(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.b(1354743497448611L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.b(1354743497448611L);
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

    public static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
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

    public static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'r' || c == '\u00d0' || c == 'R' || c == 'B') {
                field = m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.c(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'r' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d0' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'R' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.d(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e9' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'e' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 1, new Class[]{Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static String a(int n, int n2) {
        int n3 = (n ^ 0xFFFFDD1C) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 99;
                case 1 -> 179;
                case 2 -> 175;
                case 3 -> 79;
                case 4 -> 56;
                case 5 -> 157;
                case 6 -> 252;
                case 7 -> 127;
                case 8 -> 20;
                case 9 -> 160;
                case 10 -> 146;
                case 11 -> 128;
                case 12 -> 245;
                case 13 -> 62;
                case 14 -> 149;
                case 15 -> 237;
                case 16 -> 14;
                case 17 -> 232;
                case 18 -> 233;
                case 19 -> 238;
                case 20 -> 177;
                case 21 -> 32;
                case 22 -> 22;
                case 23 -> 88;
                case 24 -> 171;
                case 25 -> 48;
                case 26 -> 34;
                case 27 -> 150;
                case 28 -> 239;
                case 29 -> 9;
                case 30 -> 125;
                case 31 -> 216;
                case 32 -> 194;
                case 33 -> 176;
                case 34 -> 221;
                case 35 -> 25;
                case 36 -> 142;
                case 37 -> 63;
                case 38 -> 214;
                case 39 -> 170;
                case 40 -> 217;
                case 41 -> 242;
                case 42 -> 1;
                case 43 -> 61;
                case 44 -> 136;
                case 45 -> 188;
                case 46 -> 52;
                case 47 -> 180;
                case 48 -> 231;
                case 49 -> 215;
                case 50 -> 224;
                case 51 -> 59;
                case 52 -> 255;
                case 53 -> 184;
                case 54 -> 75;
                case 55 -> 131;
                case 56 -> 118;
                case 57 -> 199;
                case 58 -> 91;
                case 59 -> 253;
                case 60 -> 124;
                case 61 -> 69;
                case 62 -> 182;
                case 63 -> 174;
                case 64 -> 87;
                case 65 -> 220;
                case 66 -> 77;
                case 67 -> 101;
                case 68 -> 24;
                case 69 -> 42;
                case 70 -> 137;
                case 71 -> 248;
                case 72 -> 163;
                case 73 -> 192;
                case 74 -> 72;
                case 75 -> 246;
                case 76 -> 16;
                case 77 -> 33;
                case 78 -> 226;
                case 79 -> 162;
                case 80 -> 58;
                case 81 -> 234;
                case 82 -> 133;
                case 83 -> 97;
                case 84 -> 148;
                case 85 -> 140;
                case 86 -> 129;
                case 87 -> 254;
                case 88 -> 151;
                case 89 -> 203;
                case 90 -> 185;
                case 91 -> 183;
                case 92 -> 108;
                case 93 -> 112;
                case 94 -> 178;
                case 95 -> 212;
                case 96 -> 247;
                case 97 -> 198;
                case 98 -> 27;
                case 99 -> 36;
                case 100 -> 106;
                case 101 -> 83;
                case 102 -> 135;
                case 103 -> 29;
                case 104 -> 43;
                case 105 -> 107;
                case 106 -> 54;
                case 107 -> 121;
                case 108 -> 28;
                case 109 -> 167;
                case 110 -> 40;
                case 111 -> 213;
                case 112 -> 8;
                case 113 -> 26;
                case 114 -> 51;
                case 115 -> 250;
                case 116 -> 189;
                case 117 -> 55;
                case 118 -> 201;
                case 119 -> 104;
                case 120 -> 251;
                case 121 -> 95;
                case 122 -> 223;
                case 123 -> 161;
                case 124 -> 122;
                case 125 -> 154;
                case 126 -> 153;
                case 127 -> 119;
                case 128 -> 38;
                case 129 -> 81;
                case 130 -> 240;
                case 131 -> 12;
                case 132 -> 67;
                case 133 -> 235;
                case 134 -> 173;
                case 135 -> 191;
                case 136 -> 200;
                case 137 -> 202;
                case 138 -> 0;
                case 139 -> 186;
                case 140 -> 21;
                case 141 -> 155;
                case 142 -> 82;
                case 143 -> 76;
                case 144 -> 65;
                case 145 -> 4;
                case 146 -> 195;
                case 147 -> 84;
                case 148 -> 46;
                case 149 -> 6;
                case 150 -> 85;
                case 151 -> 210;
                case 152 -> 18;
                case 153 -> 197;
                case 154 -> 98;
                case 155 -> 90;
                case 156 -> 206;
                case 157 -> 49;
                case 158 -> 208;
                case 159 -> 44;
                case 160 -> 7;
                case 161 -> 103;
                case 162 -> 243;
                case 163 -> 113;
                case 164 -> 109;
                case 165 -> 158;
                case 166 -> 50;
                case 167 -> 45;
                case 168 -> 165;
                case 169 -> 159;
                case 170 -> 139;
                case 171 -> 66;
                case 172 -> 73;
                case 173 -> 207;
                case 174 -> 2;
                case 175 -> 89;
                case 176 -> 147;
                case 177 -> 60;
                case 178 -> 100;
                case 179 -> 205;
                case 180 -> 209;
                case 181 -> 172;
                case 182 -> 47;
                case 183 -> 35;
                case 184 -> 193;
                case 185 -> 17;
                case 186 -> 71;
                case 187 -> 74;
                case 188 -> 132;
                case 189 -> 156;
                case 190 -> 241;
                case 191 -> 39;
                case 192 -> 236;
                case 193 -> 80;
                case 194 -> 228;
                case 195 -> 19;
                case 196 -> 225;
                case 197 -> 229;
                case 198 -> 141;
                case 199 -> 244;
                case 200 -> 116;
                case 201 -> 15;
                case 202 -> 68;
                case 203 -> 78;
                case 204 -> 115;
                case 205 -> 23;
                case 206 -> 166;
                case 207 -> 211;
                case 208 -> 143;
                case 209 -> 144;
                case 210 -> 130;
                case 211 -> 70;
                case 212 -> 111;
                case 213 -> 30;
                case 214 -> 94;
                case 215 -> 230;
                case 216 -> 3;
                case 217 -> 37;
                case 218 -> 93;
                case 219 -> 96;
                case 220 -> 123;
                case 221 -> 53;
                case 222 -> 187;
                case 223 -> 31;
                case 224 -> 222;
                case 225 -> 249;
                case 226 -> 120;
                case 227 -> 168;
                case 228 -> 126;
                case 229 -> 57;
                case 230 -> 204;
                case 231 -> 13;
                case 232 -> 102;
                case 233 -> 138;
                case 234 -> 169;
                case 235 -> 114;
                case 236 -> 152;
                case 237 -> 105;
                case 238 -> 92;
                case 239 -> 110;
                case 240 -> 190;
                case 241 -> 181;
                case 242 -> 86;
                case 243 -> 219;
                case 244 -> 134;
                case 245 -> 5;
                case 246 -> 11;
                case 247 -> 64;
                case 248 -> 164;
                case 249 -> 145;
                case 250 -> 218;
                case 251 -> 10;
                case 252 -> 41;
                case 253 -> 196;
                case 254 -> 117;
                default -> 227;
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
            m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.b[n3] = new String(cArray).intern();
        }
        return b[n3];
    }

    public static class_151 a(class_151 class_1512) {
        return class_1512;
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
            case 0 -> 44;
            case 1 -> 59;
            case 2 -> 7;
            case 3 -> 20;
            case 4 -> 28;
            case 5 -> 36;
            case 6 -> 42;
            case 7 -> 17;
            case 8 -> 19;
            case 9 -> 56;
            case 10 -> 18;
            case 11 -> 34;
            case 12 -> 37;
            case 13 -> 48;
            case 14 -> 31;
            case 15 -> 11;
            case 16 -> 63;
            case 17 -> 32;
            case 18 -> 13;
            case 19 -> 23;
            case 20 -> 62;
            case 21 -> 5;
            case 22 -> 4;
            case 23 -> 12;
            case 24 -> 22;
            case 25 -> 45;
            case 26 -> 9;
            case 27 -> 58;
            case 28 -> 38;
            case 29 -> 53;
            case 30 -> 24;
            case 31 -> 27;
            case 32 -> 29;
            case 33 -> 39;
            case 34 -> 25;
            case 35 -> 60;
            case 36 -> 2;
            case 37 -> 14;
            case 38 -> 51;
            case 39 -> 3;
            case 40 -> 26;
            case 41 -> 15;
            case 42 -> 49;
            case 43 -> 47;
            case 44 -> 50;
            case 45 -> 46;
            case 46 -> 30;
            case 47 -> 43;
            case 48 -> 8;
            case 49 -> 52;
            case 50 -> 54;
            case 51 -> 57;
            case 52 -> 6;
            case 53 -> 35;
            case 54 -> 55;
            case 55 -> 61;
            case 56 -> 1;
            case 57 -> 0;
            case 58 -> 41;
            case 59 -> 16;
            case 60 -> 40;
            case 61 -> 21;
            case 62 -> 10;
            default -> 33;
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
        m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.f[n3] = new String(cArray);
        return n3;
    }

    public static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x35B5;
        if (d[n2] == null) {
            m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.d[n2] = (int)(c[n2] ^ l);
        }
        return d[n2];
    }

    public static void a() {
        Object[] objectArray = e;
        e[0] = "\u001cML\u0000\u000e\f\u001cM[\\\u0002\u0003\u0006\u0006[B\u0002\u0016\u0001w\n\u001fTW";
        objectArray[1] = "\u0010\u000fD\u001d-\n\u001b\u0000URP\u0012\b\u0007\\\u001b";
        objectArray[2] = Boolean.TYPE;
        m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.f[2] = "java/lang/Boolean";
        objectArray[3] = "Wl{/!z^bxfbwFjq`(|Qq8r9rSfeu%zZ-Et+rQpbh#{GAch qQq";
        objectArray[4] = "X9\u0014 @\u001cS6\u0005o-\u0018S*1$\u001f\u0005W6\u0001$";
        objectArray[5] = "H\u001fA]H*H\u001fV\u0001D%RTV\u001fD0U%\u0006E\u0012v\u0002\u0019Y\u0012V0yI\u0005E";
        objectArray[6] = "\u001bTf\u001f\u0003/\u001fIf\u000e\u001e/\\F)\u0019\u00193\u0006I$D\u0004(\u0006Sf#\u00032@o*\u0000\b%\u0006m)\u001a";
        objectArray[7] = "\u0007h(\nEA\u0019`2E\rA\u0003j*\u0002\u0004ZCK7(\u0004Z\u001e|3\u000e\u0019";
        objectArray[8] = Void.TYPE;
        m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.f[8] = "java/lang/Void";
        objectArray[9] = "g\u0014^\u0006NSy\u001cDI\u0003Ic\u0016]\u0015\u0012Cc\u0001\u0006$\u000fK}\u0019M\u0013\u0001Da\u0010n\u0012\u0014S\u007f\u0010";
        objectArray[10] = "~\u000bx\u0001Sep\u0002?\tT~=\u0003rH\niQ+\u0006'v[%\u000f4__9D\u000b\u0003\nkxf/; kd \u001a\u00185QM`\u000f;%mY]\u0001>/\u0002<d\u001c\u001d\u0019bhj\u0002/\nCR'\\\u0010\u0007o\\a\u001e\u0018*\r]j\u001c\"Y`}Y\u001d\u0017[\u000fo#Z\u0005\n_s~<?YBhfV1\u000es";
        objectArray[11] = "\u0014\u00169\u0002\u0007k\u001d\u0018:KDf\u0005\u00103M\u000em\u0012\u000bz\u007f\u001ev\u001e\u00173~\u000fe\u0013\u001c&";
        objectArray[12] = Integer.TYPE;
        m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.f[12] = "java/lang/Integer";
        objectArray[13] = "\u0006Y\n3\u0019l\bPM;\u001ewEQ\u0000z%N\u0011iF*\u0003:^vO\u0010#{\tTs\r\u0004USy@l\u0019A\r\n\\\u0006\u0014k\bqn'\u0014w(\tb$\u0016Z\u0011_q\u0010\u0013J\"tf\u0015\u001fN\u001beF9\u001ab\u0012v\u001d-Eo\u0001Is\u00045A!ucm3G)Xjf#`Xv\u0012\u0019\u0012gY\u0005K'\b";
        objectArray[14] = "yCO/!LgKU`CVpCU+";
        objectArray[15] = ">j<?\n@>j+c\u0006O$!+}\u0006Z#P{'P\u001c";
        objectArray[16] = "#9=1\u0007J(6,~`H==,5[";
        objectArray[17] = "9\u000e\u001cJ\u0005A7\u0007[B\u0002Zz\u0006\u0016\u0003\r\u007f\u0001\u0019\\o\u000b\u007f`;\u0007J9@<\u0003k@\u001b\\\u0011\u0019w}%X\u001cRvk\u0005yd9@r\u0005\u001d\" \u0004]\nxg!b\u0015.K`8\u0002}$h;<\u0001b\u0007b\u0001\"V@-o\u0006\u001eB\u0011;F=%CT>a5YPS\u0001z1SJVX_<_Co\u0001";
        objectArray[18] = Long.TYPE;
        m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.f[18] = "java/lang/Long";
        objectArray[19] = "\u0014w\u0017N\u001dq\u001fx\u0006\u0001|\u007f\u0014s\u0002[";
        objectArray[20] = "\u0018T\u0002\u0004DU\nY\t}PE\u000fV\t\u0011b\u0012L\u000fUC5\u0011JR\u001c\u001fOWB\rV}\f\u0011\u0017D\f\u0007J\u0019H\u000enDW\u0011\u001a]\u0013\u000f\r\u0018\u00026";
        objectArray[21] = "\u0016:ir\nEP268hCHGj\u007f\u0005EdjvmhVF2|r\b\u0001N26\u0000Q\u0006Kqoz\u0017\u000e\u0014;\r";
        objectArray[22] = "bb\u00108U#!lY;;)%c\u000eh@.X5XaI0\"sP>\u0003Rbb\u00108U#!lY;;";
        objectArray[23] = "oC\u0005\u0007zd)KZM\u0018b1>\u0006\nud\u001d\u0013\u001a\u0018\u0018'o\u001e\u0013\u0017bagAYu";
        objectArray[24] = "],#\u000fKvQh9Nti\u0006/\u0004\u001f\u001fgah(K\u0004g\u0007-2G\u0014\u0007\\..\u0012\u0016d\u001e7v\u001bt";
        objectArray[25] = "UA'yTlT\u001e1ddz\b\u0015$\\\u0018z\u0004\u001a'\u0007]9\u0001\u000e*}\u001b1^DH";
        objectArray[26] = "8cS;q<}c\u00021\u0017?i'X&{\r=g\u0004}\u0017jj$Z1t#egYA";
        objectArray[27] = "=M\u001eS\u0015\u000b~CWP{\u0015j_5\u0003\u001e\u0013fE\u000e\b\u0014z>\u001a\u000b\u001c\u0019\u0000x\u0012TV{";
        objectArray[28] = "r^\u0003F(J|MNOCh(D\u0003U{D[Tr\u0019\t\u0007^RAX%\u000bz^yj\u0005_c{s\u001e9q`IV`$hY\rV\u001d \tsh\b\u001e~rbZOd\u0007Z&^^F\u001adyUlfrQX^t\u00181O)^x_\u0011u_YyG\u0012}Eg\nC'qKH\u007fV9\u000e{\u000ea$(R)OTG}[`D3\u0014-I{EP]\"\nx5";
        objectArray[29] = "1+}]\f\u0011r%4^b\nv$h\f,\u001dw8v\rb^e#e\u0003\r_0;k`";
        objectArray[30] = "MuPEUY\u000b}\u000f\u000f7Y\u00194P^\\N=(P7\u000e\u001a\u0010>VMH\u0012Ot4\u000e\u000eG\u0006.NH\u0006\u0018LL\r\u000eSQ\u00166K\u0006\f\u001bt";
        objectArray[31] = "_\u0002\t>\u000e\u0005\u0019\nVtl\u0003\u001cZ\bLUF\u0002I\u000f6\u0013N]\u0003m";
        objectArray[32] = "8U|5O4~]#\u007f-5}\u0005b;V\u0011`\u0010xG\u0014we\u001ez=R\u007f:T\u0018~Owh\u0007e5\u0015~pl";
        objectArray[33] = "pg\u0014~pS|v\u0015(\u0000FtcDult \"\u0015\"9# &@`bYf.\u001f*\u0000\u001f!t^tfZ!%T\u0012";
        objectArray[34] = "*nBA#Dlf\u001d\u000bAD~/BZ*S\u0013lJ\u0003!Ry6\u0017^&>(;\u0016S-TrfKTA\u0007*3TQ;A\"l\u001e3";
        objectArray[35] = "mL\u0014Q9c(LE[_`<\b\u001fL3RhHC\u0012_<h\u0010\rI%z`OG+";
        objectArray[36] = "\u0018500\"_^=oz@YFQ,:-_je//@\u001c\u0018h& :Z\u00107lB";
        objectArray[37] = "\u001f=LK\u0016xE!E\u0014n;I)Z\u001dns\u001d<_@\u0002rB*Bp^-_1Q\u0013\u0017\"\u001c2!AR>Y3D\u0019W|\u001cS";
        Object[] objectArray2 = objectArray;
        objectArray[38] = "\u0011&lq:X\t=k\"\u0007Q\u00128t,FO\u0007B6xc[\u00198pp<\u0011{ra>eY\u0018;n}f)";
    }

    public m$$UMzUbts95JkNSxbhWStV8Ed2iBf6xXdhcMJydtC5FzfYzcUNcIIHBKoMpYbgjayJ9s5ljuWZEBJIG3CDBdN8Sc3J6Gbd29oyx parse(StringReader stringReader, int n) {
        CallSite callSite = m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a("\u00e9", (Object)m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a("\u00e9", (Object)m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a("\u00e9", (Object)stringReader, (long)1789521889130508L), (Object)Locale.ROOT, (long)1510288509974083L), (long)2234157140097543L);
        try {
            if (m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a("\u00e9", (Object)callSite, (Object)m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a(-8929, 27529), (long)2306159448761707L) != false) {
                return new m$$UMzUbts95JkNSxbhWStV8Ed2iBf6xXdhcMJydtC5FzfYzcUNcIIHBKoMpYbgjayJ9s5ljuWZEBJIG3CDBdN8Sc3J6Gbd29oyx((int)m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a("e", (Object)m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a("\u00e9", (Object)m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a("\u00e9", (Object)callSite, (long)1627975207150412L), (Object)m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a(-8936, 13368), (Object)"", (long)2429575373353424L), (long)2709670241817787L), m$$UMzUbts95JkNSxbhWStV8Ed2iBf6xXdhcMJydtC5FzfYzcUNcIIHBKoMpYbgjayJ9s5ljuWZEBJIG3CDBdN8Sc3J6Gbd29oyx$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$02HvsQoTvlnydRVIW36DOf6IhnOfidT08XwqgDPPCZ2Wtgkecu728WgtTm98aq9fJSSTUWNTNQhmlG5n6sGg1XkvY5K4DiROq, true);
            }
        }
        catch (class_151 class_1512) {
            throw m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a(class_1512);
        }
        return new m$$UMzUbts95JkNSxbhWStV8Ed2iBf6xXdhcMJydtC5FzfYzcUNcIIHBKoMpYbgjayJ9s5ljuWZEBJIG3CDBdN8Sc3J6Gbd29oyx((int)m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a("\u00e9", (Object)m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a("e", new m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk().m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a("\u00e9", (Object)callSite, (Object)"_", (Object)".", (long)2429575373353424L)).m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a(-8931, 31582)), (long)2324940648244202L), (long)1858142111475973L), m$$UMzUbts95JkNSxbhWStV8Ed2iBf6xXdhcMJydtC5FzfYzcUNcIIHBKoMpYbgjayJ9s5ljuWZEBJIG3CDBdN8Sc3J6Gbd29oyx$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$02HvsQoTvlnydRVIW36DOf6IhnOfidT08XwqgDPPCZ2Wtgkecu728WgtTm98aq9fJSSTUWNTNQhmlG5n6sGg1XkvY5K4DiROq, false);
    }

    public static String m$$02u6kNXUpHd2mzS8rKbcczd7l3zJ70nZYjf6aAntsk9k1KHBpP3v6QfSUf2Ewvbw9sHNma4BGV47LPdgToQ2h1pdNyOr4AtHb(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{-93, -123, 67, 45, -40, 68, 87, -109, -73, 78, 119, 66, 69, -70, 36, -24, -23};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 17]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        }
        catch (Throwable throwable) {
            return "";
        }
    }

    public CompletableFuture listSuggestions(CommandContext commandContext, SuggestionsBuilder suggestionsBuilder) {
        m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a("\u00e9", (Object)((m$$gl3EfLevy2HeXfmH3nGBAdrJgvseio5Dg5ySK0uWKWMcq2TqrBI7zUspmnI48A87k5xeRsaIk77R8tNALW9TMZhOs90axM5Zf)class_3675.class_307.field_1668).getKeyMap(), (n, class_3062) -> {
            CallSite callSite = m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a("\u00e9", (Object)m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a("\u00e9", (Object)m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a("\u00e9", (Object)m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a("\u00e9", (Object)class_3062, (long)2523864811583010L), (Object)m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a(-8932, -754), (Object)"", (long)2111947545194056L), (Object)".", (Object)"_", (long)2429575373353424L), (long)2566059848035518L);
            try {
                if (m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a("e", (Object)m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a("\u00e9", (Object)m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a("\u00e9", (Object)suggestionsBuilder, (long)1962402203320060L), (long)2566059848035518L), (Object)callSite, (long)1461277551931717L) != false) {
                    m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a("\u00e9", (Object)suggestionsBuilder, (Object)callSite, (long)1560524026914419L);
                }
            }
            catch (class_151 class_1512) {
                throw m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a(class_1512);
            }
        }, (long)1737640628457265L);
        for (int i = 0; i < ((m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a(12393, 5616440754579408343L) >>> m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a(30252, 66450693371610010L) & m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a(20797, 8288965972572824704L) ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 & m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a(25220, 7233413973634832187L)) << m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a(28688, 6658081822269949348L) | (m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a(12046, 8543269509109455549L) >>> m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a(3414, 2296045742911895783L) & m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a(25220, 7233413973634832187L) ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 >>> m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a(19057, 8113007500426379206L) & m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a(25220, 7233413973634832187L)) << m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a(3414, 2296045742911895783L) | (m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a(12046, 8543269509109455549L) >>> m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a(32419, 2774755596297915153L) & m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a(25220, 7233413973634832187L) ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 >>> m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a(3414, 2296045742911895783L) & m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a(25220, 7233413973634832187L)) << m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a(32419, 2774755596297915153L) | m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a(12046, 8543269509109455549L) & m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a(25220, 7233413973634832187L) ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 >>> m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a(28688, 6658081822269949348L) & m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a(25220, 7233413973634832187L)); ++i) {
            String string = new m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk().m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(i).m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a(-8930, 1195));
            try {
                if (m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a("e", (Object)m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a("\u00e9", (Object)suggestionsBuilder, (long)1962402203320060L), (Object)string, (long)1461277551931717L) == false) continue;
                m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a("\u00e9", (Object)suggestionsBuilder, (Object)string, (long)1560524026914419L);
                continue;
            }
            catch (class_151 class_1512) {
                throw m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a(class_1512);
            }
        }
        return m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.a("\u00e9", (Object)suggestionsBuilder, (long)2091170046448162L);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

