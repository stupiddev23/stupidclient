/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import me.mioclient.m$$02HvsQoTvlnydRVIW36DOf6IhnOfidT08XwqgDPPCZ2Wtgkecu728WgtTm98aq9fJSSTUWNTNQhmlG5n6sGg1XkvY5K4DiROq;
import me.mioclient.m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$WBph0c7B9Yfm8iuQUN1x87mXXnM5VEpwOjDu2en4nUTP91vXRxsgLf1pJiQ9fPS3ViAA4Cx8ZT86kwAGMgboXtTgkfjN2VklC;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import net.minecraft.class_151;
import net.minecraft.class_1792;
import net.minecraft.class_2378;
import net.minecraft.class_7923;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG
implements m$$02HvsQoTvlnydRVIW36DOf6IhnOfidT08XwqgDPPCZ2Wtgkecu728WgtTm98aq9fJSSTUWNTNQhmlG5n6sGg1XkvY5K4DiROq {
    public final m$$WBph0c7B9Yfm8iuQUN1x87mXXnM5VEpwOjDu2en4nUTP91vXRxsgLf1pJiQ9fPS3ViAA4Cx8ZT86kwAGMgboXtTgkfjN2VklC m$$Dfm5XeZQmFNOedWuceFO3Ijx1GZeHuqtWF3LkFLMjl8lQmc78VLORpXQwbT5YkV51g6usVQMxTnHPYeYzZwsvEc8CoD8YCPWi = new m$$WBph0c7B9Yfm8iuQUN1x87mXXnM5VEpwOjDu2en4nUTP91vXRxsgLf1pJiQ9fPS3ViAA4Cx8ZT86kwAGMgboXtTgkfjN2VklC(m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.a(10791, 11361), (class_2378)class_7923.field_41178, (Object[])new class_1792[0]);
    public final m$$WBph0c7B9Yfm8iuQUN1x87mXXnM5VEpwOjDu2en4nUTP91vXRxsgLf1pJiQ9fPS3ViAA4Cx8ZT86kwAGMgboXtTgkfjN2VklC m$$connwPkjFPDyNIXiicJPgkJoI3WVxnFZxIR72cRi97PpB7WF7TaQELpwjmbe3gTKAMBMS0WDFOZQCzgyOku0P9BQBTbhW0Ngr = new m$$WBph0c7B9Yfm8iuQUN1x87mXXnM5VEpwOjDu2en4nUTP91vXRxsgLf1pJiQ9fPS3ViAA4Cx8ZT86kwAGMgboXtTgkfjN2VklC(m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.a(10790, 6971), (class_2378)class_7923.field_41178, (Object[])new class_1792[0]);
    public static int \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01;
    public static final String[] a;
    public static final String[] b;
    public static final Object[] c;
    public static final String[] d;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.c = new Object[27];
        m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.d = new String[27];
        m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.a();
        var13 = new String[7];
        var11_1 = 0;
        var10_2 = "qL\u0082\u007f\u001e\\\u0005l\u00ea\u00ce\u0087\u00bd\u0005oe\u008av5\u0006/4mp\u00e3\u00bd\u0005`tOT\u008d";
        var12_3 = "qL\u0082\u007f\u001e\\\u0005l\u00ea\u00ce\u0087\u00bd\u0005oe\u008av5\u0006/4mp\u00e3\u00bd\u0005`tOT\u008d".length();
        var9_4 = 6;
        var8_5 = -1;
        block11: while (true) {
            v0 = 124;
            v1 = ++var8_5;
            v2 = var10_2.substring(v1, v1 + var9_4);
            v3 = -1;
            if (true) ** GOTO lbl27
            block12: while (true) {
                var10_2 = "\u00e8\u00bb\u00a5B\u00e6\u0084\u009b7\u009d\u00cf\u0006\t\u0086A\u00ea\u00aa\"";
                var12_3 = "\u00e8\u00bb\u00a5B\u00e6\u0084\u009b7\u009d\u00cf\u0006\t\u0086A\u00ea\u00aa\"".length();
                var9_4 = 10;
                var8_5 = -1;
                while (true) {
                    v0 = 56;
                    v4 = ++var8_5;
                    v2 = var10_2.substring(v4, v4 + var9_4);
                    v3 = 0;
lbl27:
                    // 2 sources

                    v5 = v2.toCharArray();
                    v6 = v5.length;
                    var14_6 = 0;
                    v7 = v0;
                    v8 = v5;
                    v9 = v6;
                    if (v6 > 1) ** GOTO lbl75
                    do {
                        v10 = v7;
                        v8 = v8;
                        v11 = v8;
                        v12 = v7;
                        v13 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v14 = 99;
                                    break;
                                }
                                case 1: {
                                    v14 = 117;
                                    break;
                                }
                                case 2: {
                                    v14 = 9;
                                    break;
                                }
                                case 3: {
                                    v14 = 43;
                                    break;
                                }
                                case 4: {
                                    v14 = 124;
                                    break;
                                }
                                case 5: {
                                    v14 = 27;
                                    break;
                                }
                                default: {
                                    v14 = 103;
                                }
                            }
                            v11[v13] = (char)(v11[v13] ^ (v12 ^ v14));
                            ++var14_6;
                            v7 = v10;
                            if (v10 != 0) break;
                            v10 = v7;
                            v8 = v8;
                            v13 = v7;
                            v11 = v8;
                            v12 = v7;
                        }
lbl75:
                        // 2 sources

                        v15 = v8;
                        v9 = v9;
                    } while (v9 > var14_6);
                    v16 = new String(v15);
                    switch (v3) {
                        default: {
                            var13[var11_1++] = v16.intern();
                            if ((var8_5 += var9_4) >= var12_3) continue block12;
                            var9_4 = var10_2.charAt(var8_5);
                            continue block11;
                        }
                        case 0: 
                    }
                    var13[var11_1++] = v16.intern();
                    if ((var8_5 += var9_4) >= var12_3) {
                        m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.a = var13;
                        m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.b = new String[7];
                        var6_7 = 4873149258556809854L;
                        var4_8 = 52185401019918298L ^ var6_7;
                        m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)var4_8;
                        var2_9 = 2488324678842760195L;
                        var0_10 = 3659315897285817186L ^ var2_9;
                        m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.a("P", (long)var0_10, (long)1524129844198363L);
                        return;
                    }
                    var9_4 = var10_2.charAt(var8_5);
                }
                break;
            }
            break;
        }
    }

    public static Field b(Class clazz, String string, Class clazz2) {
        Field field = m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.b(classArray2[i], string, clazz2, n, classArray);
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
            int n = m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.a(l);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field c(long l) {
        int n = m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.a(l);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.b(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.b(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.a(clazz3, string2, clazz2)) != null) {
                    m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.b(89851800215220L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static Method d(long l) {
        int n = m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.a(l);
        Object object = c[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = d[n];
                int n3 = string2.indexOf(8);
                clazz3 = m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.b(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.b(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.b(89851800215220L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.b(89851800215220L);
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
        Object[] objectArray = c;
        c[0] = "\u001bYz3\f=\u0005Q`|q-\u0005";
        objectArray[1] = "\u0015-;0+\u0010\u001e\"*\u007fJ\u001e\u0015).%";
        objectArray[2] = Boolean.TYPE;
        m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.d[2] = "java/lang/Boolean";
        objectArray[3] = "\f \u000b\u0007\u0010#\u0002)L\u000f\u00178O(\u0001N\u0014+\u000brI%>&\u0003+u\u0001\u001e\t,$G+\u001c )1t\"\u0011 /\u0016n\u0007M>#r@\u001a)#\u0006/c\f\u0014$\u0002\u0001v\u001bL\b\u000e-\u0013<*uY\u0001K9A&\u0016\u0011P]\u001f}Xta\u00050x\u0014sW\u000e\u0011?\u0012=T\u0012-*\u0014\u0007k\u001b!5(&L,L";
        objectArray[4] = "\u0000v\u001fu\u0003=\u000e\u007fX}\u0004&C~\u0015<Z\u0016YFYq8a\u000f+\u0000Q,1\u000fbcz2\u00068JD+,`7f\u007fq\u0000g\u0015$gw;>\u0017XXj_\u0019'v\u007f.3\u0017*Awi^\u0018\u000eF\u0002i\u001c+\u0017{V|\u0000\u0003>I\u0004N<\u001b\ntIjZ\u0016\b#\u0000z\u000f\u0002*$\u0007I;\u0011&[\u0001^-";
        objectArray[5] = "^E\u000b\u0013WCPLL\u001bPX\u001dM\u0001Z\u000eh\u0007uM\u0017l\u001fQ\u0018\u00147xOQQw\u001cfxfyPMx\u001eiUk\u0017T\u0019K\u0017s\u0011o@IkL\f\u000bgyEkHgitrc\u000f\nfPu\u0016\u000fHUIHB\u001aT}`z\u0010(heTG]\f\u000ehV\u0010\u0014\u001c[|t\u0017\u0013/ooxh\u00158y\b^\u0004\u0001\u0004KUTe}MlUtT\u0016(R]d\u0013\u001d\u0010VAD\u0018q=IMB\u0011g\u001bWcJldMT\u001akaG\bfe\\EfMp\u001ek\u0018R+\u0006@WF|\r\u000eF\u0005JR\u0019\fxYRDMrtV\u0017R+d`veD\u0004O_\u0005NfNf\u0014d\u0019cF";
        objectArray[6] = "b\u0003(h~Kl\no`yP!\u000b\"!@f\u007f\u000e6f f6?`h/Mz7SK&\\7Qk]OJBSP@gS@\fBp%AaRhPCt6Wp]E\\|\u0001Jc&TE\u000fW<qt\\UPlVe;%~=Mp7PmrVcB\u0001djOP[\u0001mc}j=0miT";
        objectArray[7] = "1f\u0011>\u0001q/n\u000bqIq5d\u00136@juW\u0015:Km8f\u0013:";
        objectArray[8] = "\u001d<r\u0016rW\u001355\u001euL^4x_CL\u0017\u0013\u0015\bZN\u001a dM~\tF*5#HI\u0014=\u0004\u0003Uu75k\u000evW16\u0012\u0010Yh\b537*z\u0000j(#A\\47%2|\u000b\u001d\u000b\u000bKKl\u0006l9)^Z\u0002\u00184\u000biz\u001e\u001b*>T@!\u001a=\u0015Ql\u0002\f,2(JH\r>1i";
        objectArray[9] = "[\u0013iT\u0011,W\u001bh\u001fX$K\u0013jT<0W\u0012A\u0016\u0013.]\u0012p";
        objectArray[10] = "i\u0016hAb\u000be\u001ei\n+\u0003y\u0016kAO\u0017e\u0017J\ro\u0001i\r";
        objectArray[11] = "\u000f\u0015>)wp\u0004\u001a/f\nh\u0017\u001d&/";
        objectArray[12] = Void.TYPE;
        m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.d[12] = "java/lang/Void";
        objectArray[13] = "GJ{g2/IC<o54\u0004Bq.:\u0011\u007f];B<\u0011\u001e\u007f`g\u000e.BG\fm,2o]\u0010P\u00126b\u0016\u0011F2\u0017\u001a}'_2s\\dcp=\u0016\u0019e\u00058\u0019%\u001e|eP\u0013\u0006ExfO0\f\u007ff1m\u001a\u0001xZ%<\f(Ca$y\t\u000fK\u001d7~6\u0014O\u0017-{o1B\u001b$B6";
        objectArray[14] = Long.TYPE;
        m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.d[14] = "java/lang/Long";
        objectArray[15] = Integer.TYPE;
        m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.d[15] = "java/lang/Integer";
        objectArray[16] = "\u000e%\u001c.\u001c]\\3\u0011SDXS]\t.I__-\u00065J4\u0006&\u0019jQ^Q;\u000bm-";
        objectArray[17] = "biiK-\u001a#87JDX;\u001b|\u0014\"$b)9\u00154\u001f\"7>\u0002D";
        objectArray[18] = "4\u007f{,\u0000\u00030j!xq\u000fgwK)\u0001\t`qqt\u0015\r7\u001bufO\u0000{ 5xH\u0017\u000b+9(\n\u0016z#z}Af";
        objectArray[19] = "M\u0000VU NI\u0015\f\u0001QD\u001f\u0018fP!D\u0019\u000e\\\r5@NdX\u001foM\u0002_\u0018\u0001hZr";
        objectArray[20] = "\u0003}^h^}]\"W` /Tcy{D=T\u001fYoD+YoVtG@";
        objectArray[21] = "\u000b\u0003\u0014V\u0010\u007f_\b\u0015Lk\u0011\u000b\u0017CDS=x\u00072\b!~}\u0001\u0001I\rrY\r9{-&@(3\u000f\u0011\bC\u001a\u0016q\f\u0011z^\u0016\f\bpP;H\u000fV\u000bA\t\u000fu/#\u0005\r\u001eW2\u001dZ\u0006,wZ({\r4\t\u00196\n\r8N9\f|\n9V:\u0004f4JR\u000f\bh\u001b?G\u0011wX]!5\u0002uG\fCGWq\u0007]s\\\u0019~_\u000bME\u001a5Df";
        objectArray[22] = "SUAV\f\u000f\u0001CL+V\u0001\u0004QCJ[\u001dbSWOV\u0006\u0012\\LL=_\u0019C\u0013WW\b\u0004Q\u0014+";
        objectArray[23] = "{n#(to}g(.Jy=m<\n1p!\ng8tq71'&sfG:+v1g62h#z\u0017";
        objectArray[24] = "\u0010J\u00163q\u001c\u0014_Lg\u0000\u0019FU&6p\u0016DD\u001ckd\u0012\u0013.\u001frn@SDHo|G/";
        objectArray[25] = "\u0011\u0014Azt\bLO^p\u0013\u0001\u0006RAjb\u000bg.\bMb+VEmsj;\u0011NUwv\u001b\u001a\"xhz\u001d\u00134^vT\u0015n7\bu-4c\u0014MGR\u0003G5\bQ)4\u001a\u0001n'w\bD/H/qZH\u0001\\-O\u0006P\u0017\bSC\t\u0015\u0001nEW)g\u0017AnhZL5\u000bG#;\u001b0\u0003\u0017(\u001fP\u0007Aqc\u0001S\u00133+w\u001eJ@K-~\u0015L~";
        Object[] objectArray2 = objectArray;
        objectArray[26] = "&P\u000e'DktF\u0003Z\u000forO\u001b74l\u0017\u0015\u000bc\u001cf)\u0014\u0002&\u0004\u0002.S\u000bc\thyN\u0019du";
    }

    public static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.a(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00d1' || c == '\u00f2' || c == '\u00c1' || c == '\u00cf') {
                field = m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.c(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d1' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f2' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c1' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.d(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'L' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'P' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        int n3 = (n ^ 0x2A25) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 34;
                case 1 -> 231;
                case 2 -> 172;
                case 3 -> 145;
                case 4 -> 192;
                case 5 -> 198;
                case 6 -> 78;
                case 7 -> 147;
                case 8 -> 132;
                case 9 -> 118;
                case 10 -> 227;
                case 11 -> 200;
                case 12 -> 42;
                case 13 -> 251;
                case 14 -> 185;
                case 15 -> 54;
                case 16 -> 184;
                case 17 -> 254;
                case 18 -> 223;
                case 19 -> 233;
                case 20 -> 99;
                case 21 -> 207;
                case 22 -> 186;
                case 23 -> 209;
                case 24 -> 168;
                case 25 -> 116;
                case 26 -> 24;
                case 27 -> 217;
                case 28 -> 55;
                case 29 -> 72;
                case 30 -> 33;
                case 31 -> 153;
                case 32 -> 27;
                case 33 -> 240;
                case 34 -> 115;
                case 35 -> 224;
                case 36 -> 52;
                case 37 -> 80;
                case 38 -> 127;
                case 39 -> 37;
                case 40 -> 201;
                case 41 -> 38;
                case 42 -> 158;
                case 43 -> 235;
                case 44 -> 121;
                case 45 -> 226;
                case 46 -> 228;
                case 47 -> 22;
                case 48 -> 202;
                case 49 -> 161;
                case 50 -> 237;
                case 51 -> 61;
                case 52 -> 183;
                case 53 -> 98;
                case 54 -> 15;
                case 55 -> 131;
                case 56 -> 8;
                case 57 -> 225;
                case 58 -> 123;
                case 59 -> 11;
                case 60 -> 101;
                case 61 -> 222;
                case 62 -> 64;
                case 63 -> 196;
                case 64 -> 150;
                case 65 -> 203;
                case 66 -> 53;
                case 67 -> 29;
                case 68 -> 164;
                case 69 -> 213;
                case 70 -> 21;
                case 71 -> 169;
                case 72 -> 111;
                case 73 -> 242;
                case 74 -> 112;
                case 75 -> 73;
                case 76 -> 81;
                case 77 -> 218;
                case 78 -> 167;
                case 79 -> 175;
                case 80 -> 75;
                case 81 -> 106;
                case 82 -> 173;
                case 83 -> 229;
                case 84 -> 136;
                case 85 -> 95;
                case 86 -> 85;
                case 87 -> 6;
                case 88 -> 122;
                case 89 -> 66;
                case 90 -> 174;
                case 91 -> 96;
                case 92 -> 155;
                case 93 -> 4;
                case 94 -> 156;
                case 95 -> 182;
                case 96 -> 208;
                case 97 -> 154;
                case 98 -> 47;
                case 99 -> 77;
                case 100 -> 20;
                case 101 -> 238;
                case 102 -> 129;
                case 103 -> 104;
                case 104 -> 120;
                case 105 -> 178;
                case 106 -> 236;
                case 107 -> 124;
                case 108 -> 103;
                case 109 -> 57;
                case 110 -> 13;
                case 111 -> 69;
                case 112 -> 35;
                case 113 -> 212;
                case 114 -> 159;
                case 115 -> 89;
                case 116 -> 26;
                case 117 -> 128;
                case 118 -> 252;
                case 119 -> 117;
                case 120 -> 110;
                case 121 -> 5;
                case 122 -> 143;
                case 123 -> 67;
                case 124 -> 162;
                case 125 -> 71;
                case 126 -> 130;
                case 127 -> 239;
                case 128 -> 3;
                case 129 -> 193;
                case 130 -> 59;
                case 131 -> 68;
                case 132 -> 245;
                case 133 -> 220;
                case 134 -> 14;
                case 135 -> 247;
                case 136 -> 214;
                case 137 -> 137;
                case 138 -> 165;
                case 139 -> 40;
                case 140 -> 205;
                case 141 -> 74;
                case 142 -> 41;
                case 143 -> 44;
                case 144 -> 188;
                case 145 -> 30;
                case 146 -> 87;
                case 147 -> 79;
                case 148 -> 105;
                case 149 -> 119;
                case 150 -> 170;
                case 151 -> 146;
                case 152 -> 45;
                case 153 -> 199;
                case 154 -> 12;
                case 155 -> 97;
                case 156 -> 108;
                case 157 -> 65;
                case 158 -> 107;
                case 159 -> 204;
                case 160 -> 56;
                case 161 -> 210;
                case 162 -> 63;
                case 163 -> 100;
                case 164 -> 7;
                case 165 -> 189;
                case 166 -> 114;
                case 167 -> 113;
                case 168 -> 102;
                case 169 -> 94;
                case 170 -> 250;
                case 171 -> 0;
                case 172 -> 151;
                case 173 -> 48;
                case 174 -> 216;
                case 175 -> 126;
                case 176 -> 181;
                case 177 -> 194;
                case 178 -> 152;
                case 179 -> 134;
                case 180 -> 109;
                case 181 -> 82;
                case 182 -> 232;
                case 183 -> 60;
                case 184 -> 88;
                case 185 -> 140;
                case 186 -> 221;
                case 187 -> 1;
                case 188 -> 58;
                case 189 -> 62;
                case 190 -> 243;
                case 191 -> 211;
                case 192 -> 191;
                case 193 -> 163;
                case 194 -> 219;
                case 195 -> 241;
                case 196 -> 234;
                case 197 -> 206;
                case 198 -> 179;
                case 199 -> 36;
                case 200 -> 2;
                case 201 -> 90;
                case 202 -> 46;
                case 203 -> 83;
                case 204 -> 230;
                case 205 -> 10;
                case 206 -> 197;
                case 207 -> 31;
                case 208 -> 9;
                case 209 -> 19;
                case 210 -> 32;
                case 211 -> 176;
                case 212 -> 92;
                case 213 -> 17;
                case 214 -> 39;
                case 215 -> 16;
                case 216 -> 142;
                case 217 -> 149;
                case 218 -> 180;
                case 219 -> 246;
                case 220 -> 249;
                case 221 -> 25;
                case 222 -> 160;
                case 223 -> 144;
                case 224 -> 190;
                case 225 -> 166;
                case 226 -> 177;
                case 227 -> 187;
                case 228 -> 244;
                case 229 -> 253;
                case 230 -> 133;
                case 231 -> 125;
                case 232 -> 28;
                case 233 -> 51;
                case 234 -> 148;
                case 235 -> 43;
                case 236 -> 135;
                case 237 -> 86;
                case 238 -> 255;
                case 239 -> 171;
                case 240 -> 141;
                case 241 -> 157;
                case 242 -> 50;
                case 243 -> 93;
                case 244 -> 91;
                case 245 -> 84;
                case 246 -> 18;
                case 247 -> 139;
                case 248 -> 70;
                case 249 -> 195;
                case 250 -> 49;
                case 251 -> 215;
                case 252 -> 76;
                case 253 -> 23;
                case 254 -> 248;
                default -> 138;
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
            m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.b[n3] = new String(cArray).intern();
        }
        return b[n3];
    }

    public static int a(long l) {
        int n;
        int n2;
        int n3 = (int)(l >>> 46);
        if (d[n3] != null) {
            return n3;
        }
        Object object = c[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 10;
            case 1 -> 12;
            case 2 -> 60;
            case 3 -> 4;
            case 4 -> 33;
            case 5 -> 46;
            case 6 -> 43;
            case 7 -> 39;
            case 8 -> 57;
            case 9 -> 28;
            case 10 -> 0;
            case 11 -> 58;
            case 12 -> 14;
            case 13 -> 37;
            case 14 -> 25;
            case 15 -> 9;
            case 16 -> 52;
            case 17 -> 44;
            case 18 -> 19;
            case 19 -> 38;
            case 20 -> 56;
            case 21 -> 36;
            case 22 -> 41;
            case 23 -> 42;
            case 24 -> 29;
            case 25 -> 59;
            case 26 -> 20;
            case 27 -> 22;
            case 28 -> 18;
            case 29 -> 30;
            case 30 -> 6;
            case 31 -> 51;
            case 32 -> 5;
            case 33 -> 34;
            case 34 -> 8;
            case 35 -> 17;
            case 36 -> 16;
            case 37 -> 48;
            case 38 -> 3;
            case 39 -> 2;
            case 40 -> 26;
            case 41 -> 32;
            case 42 -> 27;
            case 43 -> 63;
            case 44 -> 24;
            case 45 -> 31;
            case 46 -> 61;
            case 47 -> 23;
            case 48 -> 15;
            case 49 -> 45;
            case 50 -> 62;
            case 51 -> 35;
            case 52 -> 55;
            case 53 -> 49;
            case 54 -> 53;
            case 55 -> 40;
            case 56 -> 7;
            case 57 -> 54;
            case 58 -> 11;
            case 59 -> 13;
            case 60 -> 1;
            case 61 -> 50;
            case 62 -> 21;
            default -> 47;
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
        m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.d[n3] = new String(cArray);
        return n3;
    }

    @Override
    public JsonElement toJson() {
        JsonObject jsonObject = new JsonObject();
        m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.a("L", (Object)jsonObject, (Object)m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.a(10788, -8330), (Object)m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.a("L", (Object)this.m$$Dfm5XeZQmFNOedWuceFO3Ijx1GZeHuqtWF3LkFLMjl8lQmc78VLORpXQwbT5YkV51g6usVQMxTnHPYeYzZwsvEc8CoD8YCPWi, (long)1231417441352534L), (long)1266918867140467L);
        m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.a("L", (Object)jsonObject, (Object)m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.a(10787, 21728), (Object)m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.a("L", (Object)this.m$$connwPkjFPDyNIXiicJPgkJoI3WVxnFZxIR72cRi97PpB7WF7TaQELpwjmbe3gTKAMBMS0WDFOZQCzgyOku0P9BQBTbhW0Ngr, (long)1231417441352534L), (long)1266918867140467L);
        return jsonObject;
    }

    @Override
    public void fromJson(JsonElement jsonElement) {
        if (jsonElement instanceof JsonObject) {
            JsonObject jsonObject = (JsonObject)jsonElement;
            try {
                if (m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.a("L", (Object)jsonObject, (Object)m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.a(10785, 1792), (long)1690546489969019L) != false) {
                    m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.a("L", (Object)this.m$$Dfm5XeZQmFNOedWuceFO3Ijx1GZeHuqtWF3LkFLMjl8lQmc78VLORpXQwbT5YkV51g6usVQMxTnHPYeYzZwsvEc8CoD8YCPWi, (Object)m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.a("L", (Object)jsonObject, (Object)m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.a(10788, -8330), (long)1404392895251538L), (long)1645021612571604L);
                }
            }
            catch (class_151 class_1512) {
                throw m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.a(class_1512);
            }
            try {
                if (m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.a("L", (Object)jsonObject, (Object)m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.a(10789, 13852), (long)1690546489969019L) != false) {
                    m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.a("L", (Object)this.m$$connwPkjFPDyNIXiicJPgkJoI3WVxnFZxIR72cRi97PpB7WF7TaQELpwjmbe3gTKAMBMS0WDFOZQCzgyOku0P9BQBTbhW0Ngr, (Object)m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.a("L", (Object)jsonObject, (Object)m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.a(10787, 21728), (long)1404392895251538L), (long)1645021612571604L);
                }
            }
            catch (class_151 class_1513) {
                throw m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.a(class_1513);
            }
        }
    }

    public m$$WBph0c7B9Yfm8iuQUN1x87mXXnM5VEpwOjDu2en4nUTP91vXRxsgLf1pJiQ9fPS3ViAA4Cx8ZT86kwAGMgboXtTgkfjN2VklC m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8) {
        try {
            if (m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 == m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$YWy5rBMpCuklbD3zTDnAybzKc0J7hpyOXTaG60VfHc1FEg1c0D46MZech44YFFDwCV2u1bWgleXLHZeqzwT2axHZRxigVhwi9) {
                return this.m$$connwPkjFPDyNIXiicJPgkJoI3WVxnFZxIR72cRi97PpB7WF7TaQELpwjmbe3gTKAMBMS0WDFOZQCzgyOku0P9BQBTbhW0Ngr;
            }
        }
        catch (class_151 class_1512) {
            throw m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.a(class_1512);
        }
        return this.m$$Dfm5XeZQmFNOedWuceFO3Ijx1GZeHuqtWF3LkFLMjl8lQmc78VLORpXQwbT5YkV51g6usVQMxTnHPYeYzZwsvEc8CoD8YCPWi;
    }

    public boolean m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_1792 class_17922, m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8) {
        boolean bl;
        CallSite callSite = m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.a("L", (Object)((Set)((Object)m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.a("L", (Object)m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.a("L", (Object)this, (Object)m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8, (long)1822199068053746L), (long)1422397444429388L))), (Object)class_17922, (long)1588057049459342L);
        try {
            m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.a("L", (Object)((Set)((Object)m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.a("L", (Object)this.m$$Dfm5XeZQmFNOedWuceFO3Ijx1GZeHuqtWF3LkFLMjl8lQmc78VLORpXQwbT5YkV51g6usVQMxTnHPYeYzZwsvEc8CoD8YCPWi, (long)1422397444429388L))), class_17923 -> class_17923.equals(class_17922), (long)1839734455698066L);
            m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.a("L", (Object)((Set)((Object)m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.a("L", (Object)this.m$$connwPkjFPDyNIXiicJPgkJoI3WVxnFZxIR72cRi97PpB7WF7TaQELpwjmbe3gTKAMBMS0WDFOZQCzgyOku0P9BQBTbhW0Ngr, (long)1422397444429388L))), class_17923 -> class_17923.equals(class_17922), (long)1839734455698066L);
            if (callSite == false) {
                m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.a("L", (Object)((Set)((Object)m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.a("L", (Object)m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.a("L", (Object)this, (Object)m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8, (long)1822199068053746L), (long)1422397444429388L))), (Object)class_17922, (long)1151361372809706L);
            }
        }
        catch (class_151 class_1512) {
            throw m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.a(class_1512);
        }
        try {
            bl = callSite == false;
        }
        catch (class_151 class_1513) {
            throw m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.a(class_1513);
        }
        return bl;
    }

    public static String m$$nZEsiJYLWGcGD28ST7m5tpoYSBEnW2tpmGGxq1I79FcL2YOzFbEqyBhIPy2ScLZaMQqcPw4yRD9LcLWLhFwqOR6PplF5OCi48(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{119, 17, 16, -124, 56, -125, 69, 58, 49, 67, -29, 70, 94, 126, -126, -94, -41};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 17]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        }
        catch (Throwable throwable) {
            return "";
        }
    }

    public static m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 m$$PflPiH1vUXcqhm2PHR71yV2HvSE1I49t7ezfuCSHxe1eRNEDNvute14oW31A8qCsUs5TfpVZYDUYbcuzf88HgajRExqTk1pCf(class_1792 class_17922) {
        m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG = m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$je1LVnw7J2j7tr5YnDQZ0FyD2aQebl6H6mP0t8U49aSYIhHqVYsl30IExEEpIdjlsmjPrZvw8dXOXhcAHjTWjMzT9mVrDp44z;
        try {
            if (m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG == null) {
                return null;
            }
        }
        catch (class_151 class_1512) {
            throw m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.a(class_1512);
        }
        try {
            if (m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.a("L", (Object)((Set)((Object)m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.a("L", (Object)m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.m$$Dfm5XeZQmFNOedWuceFO3Ijx1GZeHuqtWF3LkFLMjl8lQmc78VLORpXQwbT5YkV51g6usVQMxTnHPYeYzZwsvEc8CoD8YCPWi, (long)1422397444429388L))), (Object)class_17922, (long)1588057049459342L) != false) {
                return m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$ed56qUonQ9sl4ul9q0SFcWhdKmA2MjWVx4m0jEFVkmY7F0W3jPRVJQRDV1q7JZY0WFY7J6tlkwhGxJo07n4BEqPhhhJ4kK0uT;
            }
        }
        catch (class_151 class_1513) {
            throw m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.a(class_1513);
        }
        try {
            if (m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.a("L", (Object)((Set)((Object)m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.a("L", (Object)m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.m$$connwPkjFPDyNIXiicJPgkJoI3WVxnFZxIR72cRi97PpB7WF7TaQELpwjmbe3gTKAMBMS0WDFOZQCzgyOku0P9BQBTbhW0Ngr, (long)1422397444429388L))), (Object)class_17922, (long)1588057049459342L) != false) {
                return m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$YWy5rBMpCuklbD3zTDnAybzKc0J7hpyOXTaG60VfHc1FEg1c0D46MZech44YFFDwCV2u1bWgleXLHZeqzwT2axHZRxigVhwi9;
            }
        }
        catch (class_151 class_1514) {
            throw m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.a(class_1514);
        }
        return null;
    }

    @Override
    public String getConfigName() {
        return m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.a(10784, 8282);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

