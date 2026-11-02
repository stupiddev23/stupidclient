/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import me.mioclient.m$;
import me.mioclient.m$$NQt2798j6vOZRlMQMSWVrj9gQpt0IiJ5SfvOefoOgbO9y2jwu2HDCktlkccFsXkZBM41wWExM9SCZbDCTUIM1K3LUATNdPJA2;
import me.mioclient.m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.m$$jEo7K9BsAz36gRbxJ6i1mDmSkJa8BzwTX7caII2qnw8vgoIevYisYjRmYdCkqs7lYHj7adVuoywOKqgS57Ow328sALR2lbOJQ;
import net.minecraft.class_151;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_418;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk
extends m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM {
    public static int \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01;
    public static final String[] e;
    public static final String[] f;
    public static final long[] g;
    public static final Long[] h;
    public static final Object[] i;
    public static final String[] j;

    public m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk() {
        super(m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.c(-20221, 9715), m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.c(-20222, -14997), m$$jEo7K9BsAz36gRbxJ6i1mDmSkJa8BzwTX7caII2qnw8vgoIevYisYjRmYdCkqs7lYHj7adVuoywOKqgS57Ow328sALR2lbOJQ.m$$cifDyLjhDwVc7DsvicJov1z4w8LSeSc2Sfex0PAhnjIP2XhHgs2BkQSDAhNNuatlpTbaG9XEHrL4hgna1ccB8XvriWnVKoq0N, new String[0]);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block12: {
            m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.i = new Object[17];
            m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.j = new String[17];
            m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.f();
            var17 = new String[2];
            var15_1 = 0;
            var14_2 = "m\u0099\u008c\u0087\u00e0\u0015\u008a\u00b3T\u0017\u00ce\u001f\u00a7\u0004k\u008f+\u00a8\u001f\u00f67i\u00eaVt\u0010Rzt\"n\u001d\u00d2\u001b\r\u0006\u00d4\u00b9\u00f8ne.";
            var16_3 = "m\u0099\u008c\u0087\u00e0\u0015\u008a\u00b3T\u0017\u00ce\u001f\u00a7\u0004k\u008f+\u00a8\u001f\u00f67i\u00eaVt\u0010Rzt\"n\u001d\u00d2\u001b\r\u0006\u00d4\u00b9\u00f8ne.".length();
            var13_4 = 35;
            var12_5 = -1;
lbl10:
            // 2 sources

            while (true) {
                v0 = ++var12_5;
                v1 = var14_2.substring(v0, v0 + var13_4).toCharArray();
                v2 = v1.length;
                var18_6 = 0;
                v3 = 108;
                v4 = v1;
                v5 = v2;
                if (v2 > 1) ** GOTO lbl92
                break block12;
                break;
            }
            var13_4 = var14_2.charAt(var12_5);
            ** while (true)
lbl26:
            // 1 sources

            m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.e = var17;
            m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.f = new String[2];
            var10_7 = 5498684081480846764L;
            var8_8 = -8139133764010704455L ^ var10_7;
            m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)var8_8;
            var0_9 = 6378460421308843633L;
            var6_10 = new long[2];
            var3_11 = 0;
            var4_12 = "\u0012\u00bd\u000b]\u0083&\u0017\u00cd]\u00ec=\u0002GLa\u00f3";
            var5_13 = "\u0012\u00bd\u000b]\u0083&\u0017\u00cd]\u00ec=\u0002GLa\u00f3".length();
            var2_14 = 0;
            do {
                var7_15 = var4_12.substring(var2_14, var2_14 += 8).getBytes("ISO-8859-1");
                v6 = var3_11++;
                var6_10[v6] = (((long)var7_15[0] & 255L) << 56 | ((long)var7_15[1] & 255L) << 48 | ((long)var7_15[2] & 255L) << 40 | ((long)var7_15[3] & 255L) << 32 | ((long)var7_15[4] & 255L) << 24 | ((long)var7_15[5] & 255L) << 16 | ((long)var7_15[6] & 255L) << 8 | (long)var7_15[7] & 255L) ^ var0_9;
            } while (var2_14 < var5_13);
            m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.g = var6_10;
            m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.h = new Long[2];
            m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.f("\u00d1", (long)m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.b(19271, 8846222537491960265L), (long)882585317539877L);
            return;
        }
        do {
            v7 = v3;
            v4 = v4;
            v8 = v4;
            v9 = v3;
            v10 = var18_6;
            while (true) {
                switch (var18_6 % 7) {
                    case 0: {
                        v11 = 54;
                        break;
                    }
                    case 1: {
                        v11 = 72;
                        break;
                    }
                    case 2: {
                        v11 = 101;
                        break;
                    }
                    case 3: {
                        v11 = 14;
                        break;
                    }
                    case 4: {
                        v11 = 31;
                        break;
                    }
                    case 5: {
                        v11 = 21;
                        break;
                    }
                    default: {
                        v11 = 63;
                    }
                }
                v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                ++var18_6;
                v3 = v7;
                if (v7 != 0) break;
                v7 = v3;
                v4 = v4;
                v10 = v3;
                v8 = v4;
                v9 = v3;
            }
lbl92:
            // 2 sources

            v12 = v4;
            v5 = v5;
        } while (v5 > var18_6);
        var17[var15_1++] = new String(v12).intern();
        if ((var12_5 += var13_4) >= var16_3) ** GOTO lbl26
    }

    public static long b(int n, long l) {
        int n2 = (n ^ (int)l ^ 0x1A8E) & Short.MAX_VALUE;
        if (h[n2] == null) {
            m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.h[n2] = g[n2] ^ l;
        }
        return h[n2];
    }

    public static Method x(long l) {
        int n = m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.u(l);
        Object object = i[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = j[n];
                int n3 = string2.indexOf(8);
                clazz3 = m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.v(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.v(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.k(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.i[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.v(708615596730055L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.l(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.i[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.v(708615596730055L);
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

    public static String c(int n, int n2) {
        int n3 = (n ^ 0xFFFFB102) & 0xFFFF;
        if (f[n3] == null) {
            int n4;
            char[] cArray = e[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 18;
                case 1 -> 19;
                case 2 -> 168;
                case 3 -> 97;
                case 4 -> 35;
                case 5 -> 93;
                case 6 -> 232;
                case 7 -> 215;
                case 8 -> 196;
                case 9 -> 138;
                case 10 -> 126;
                case 11 -> 244;
                case 12 -> 189;
                case 13 -> 95;
                case 14 -> 200;
                case 15 -> 202;
                case 16 -> 186;
                case 17 -> 128;
                case 18 -> 61;
                case 19 -> 94;
                case 20 -> 166;
                case 21 -> 235;
                case 22 -> 162;
                case 23 -> 56;
                case 24 -> 116;
                case 25 -> 60;
                case 26 -> 233;
                case 27 -> 192;
                case 28 -> 80;
                case 29 -> 140;
                case 30 -> 13;
                case 31 -> 135;
                case 32 -> 210;
                case 33 -> 243;
                case 34 -> 59;
                case 35 -> 147;
                case 36 -> 253;
                case 37 -> 161;
                case 38 -> 226;
                case 39 -> 46;
                case 40 -> 106;
                case 41 -> 133;
                case 42 -> 132;
                case 43 -> 110;
                case 44 -> 33;
                case 45 -> 90;
                case 46 -> 254;
                case 47 -> 52;
                case 48 -> 236;
                case 49 -> 111;
                case 50 -> 30;
                case 51 -> 146;
                case 52 -> 163;
                case 53 -> 117;
                case 54 -> 27;
                case 55 -> 246;
                case 56 -> 103;
                case 57 -> 75;
                case 58 -> 255;
                case 59 -> 41;
                case 60 -> 219;
                case 61 -> 184;
                case 62 -> 73;
                case 63 -> 198;
                case 64 -> 125;
                case 65 -> 148;
                case 66 -> 101;
                case 67 -> 220;
                case 68 -> 39;
                case 69 -> 54;
                case 70 -> 221;
                case 71 -> 2;
                case 72 -> 86;
                case 73 -> 130;
                case 74 -> 193;
                case 75 -> 173;
                case 76 -> 227;
                case 77 -> 179;
                case 78 -> 154;
                case 79 -> 177;
                case 80 -> 217;
                case 81 -> 242;
                case 82 -> 115;
                case 83 -> 245;
                case 84 -> 222;
                case 85 -> 144;
                case 86 -> 79;
                case 87 -> 190;
                case 88 -> 67;
                case 89 -> 241;
                case 90 -> 136;
                case 91 -> 36;
                case 92 -> 24;
                case 93 -> 153;
                case 94 -> 121;
                case 95 -> 48;
                case 96 -> 8;
                case 97 -> 247;
                case 98 -> 7;
                case 99 -> 72;
                case 100 -> 23;
                case 101 -> 172;
                case 102 -> 155;
                case 103 -> 5;
                case 104 -> 1;
                case 105 -> 42;
                case 106 -> 15;
                case 107 -> 96;
                case 108 -> 38;
                case 109 -> 181;
                case 110 -> 14;
                case 111 -> 151;
                case 112 -> 150;
                case 113 -> 182;
                case 114 -> 252;
                case 115 -> 100;
                case 116 -> 62;
                case 117 -> 40;
                case 118 -> 107;
                case 119 -> 216;
                case 120 -> 83;
                case 121 -> 207;
                case 122 -> 20;
                case 123 -> 250;
                case 124 -> 87;
                case 125 -> 159;
                case 126 -> 240;
                case 127 -> 120;
                case 128 -> 92;
                case 129 -> 213;
                case 130 -> 113;
                case 131 -> 21;
                case 132 -> 25;
                case 133 -> 171;
                case 134 -> 139;
                case 135 -> 137;
                case 136 -> 183;
                case 137 -> 180;
                case 138 -> 228;
                case 139 -> 4;
                case 140 -> 248;
                case 141 -> 84;
                case 142 -> 45;
                case 143 -> 123;
                case 144 -> 74;
                case 145 -> 47;
                case 146 -> 223;
                case 147 -> 49;
                case 148 -> 109;
                case 149 -> 105;
                case 150 -> 199;
                case 151 -> 203;
                case 152 -> 238;
                case 153 -> 50;
                case 154 -> 149;
                case 155 -> 3;
                case 156 -> 167;
                case 157 -> 68;
                case 158 -> 185;
                case 159 -> 249;
                case 160 -> 237;
                case 161 -> 230;
                case 162 -> 114;
                case 163 -> 231;
                case 164 -> 65;
                case 165 -> 70;
                case 166 -> 119;
                case 167 -> 129;
                case 168 -> 6;
                case 169 -> 85;
                case 170 -> 26;
                case 171 -> 53;
                case 172 -> 17;
                case 173 -> 160;
                case 174 -> 229;
                case 175 -> 176;
                case 176 -> 208;
                case 177 -> 174;
                case 178 -> 34;
                case 179 -> 206;
                case 180 -> 204;
                case 181 -> 175;
                case 182 -> 195;
                case 183 -> 211;
                case 184 -> 234;
                case 185 -> 88;
                case 186 -> 212;
                case 187 -> 43;
                case 188 -> 91;
                case 189 -> 194;
                case 190 -> 164;
                case 191 -> 32;
                case 192 -> 12;
                case 193 -> 224;
                case 194 -> 28;
                case 195 -> 58;
                case 196 -> 205;
                case 197 -> 104;
                case 198 -> 197;
                case 199 -> 118;
                case 200 -> 11;
                case 201 -> 44;
                case 202 -> 98;
                case 203 -> 122;
                case 204 -> 218;
                case 205 -> 63;
                case 206 -> 225;
                case 207 -> 77;
                case 208 -> 102;
                case 209 -> 131;
                case 210 -> 9;
                case 211 -> 157;
                case 212 -> 156;
                case 213 -> 187;
                case 214 -> 108;
                case 215 -> 57;
                case 216 -> 82;
                case 217 -> 78;
                case 218 -> 71;
                case 219 -> 188;
                case 220 -> 29;
                case 221 -> 10;
                case 222 -> 169;
                case 223 -> 99;
                case 224 -> 64;
                case 225 -> 143;
                case 226 -> 55;
                case 227 -> 16;
                case 228 -> 170;
                case 229 -> 127;
                case 230 -> 69;
                case 231 -> 214;
                case 232 -> 22;
                case 233 -> 251;
                case 234 -> 145;
                case 235 -> 191;
                case 236 -> 76;
                case 237 -> 209;
                case 238 -> 141;
                case 239 -> 201;
                case 240 -> 51;
                case 241 -> 0;
                case 242 -> 37;
                case 243 -> 31;
                case 244 -> 178;
                case 245 -> 89;
                case 246 -> 142;
                case 247 -> 152;
                case 248 -> 66;
                case 249 -> 112;
                case 250 -> 134;
                case 251 -> 124;
                case 252 -> 239;
                case 253 -> 165;
                case 254 -> 158;
                default -> 81;
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
            m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.f[n3] = new String(cArray).intern();
        }
        return f[n3];
    }

    public static MethodHandle f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00dd' || c == 'a' || c == '\u00db' || c == 'f') {
                field = m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.w(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00dd' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'a' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00db' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.x(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'j' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 1, new Class[]{Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static void f() {
        Object[] objectArray = i;
        i[0] = "N\u0011?\u0013:\"N\u0011(O6-TZ(Q68S+y\td";
        objectArray[1] = ">c\u000f\u0006T\u0001>c\u0018ZX\u000e$(\u0018DX\u001b#YI\u001b\fXte\u0017IJ\u001b\u000f4H\u001d\b";
        objectArray[2] = Double.TYPE;
        m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.j[2] = "java/lang/Double";
        objectArray[3] = "4^0\u0017@w?Q!X*t+]*\u0013";
        objectArray[4] = Long.TYPE;
        m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.j[4] = "java/lang/Long";
        objectArray[5] = "}gC\"s$}gT~\u007f+g,T`\u007f>`]\u00008(";
        objectArray[6] = "i|Kax{i|\\=tts7\\#tatF\r|-";
        objectArray[7] = Void.TYPE;
        m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.j[7] = "java/lang/Void";
        objectArray[8] = "p6*B\u0019A~?mJ\u001eZ3> \u000b\u0011\u007fH!jg\u0017\u007f)\u00031B%@u;]H\u0007\\X!Au9XUj@c\u0019y-\u0001vz\u0019\u001dk\u00182U\u0016x.\u0019T\u001d2K)\u00004u8hr\u00047j\u001bbH\u001a`H1oO&t\u0019'Ft\u001du\\\"a|af[\u001dzxk|^D_ugug\u001d";
        objectArray[9] = Integer.TYPE;
        m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.j[9] = "java/lang/Integer";
        objectArray[10] = "0`D\u001f6~;oUPWp0dQ\n";
        objectArray[11] = "\u0003Orshl\u0005\u00117.\u00054^\u0018!\u0003d,B\")\u0005b-S\u001a#I>nEA3tt7_CNpcm\u0006\u0004p9;7A~";
        objectArray[12] = "\u0001BI\u000e'4G@P\u0007VU\rU\u0018Ony~Ei\u0003\u001c:{CZB06_Obp\u0010bFjh\u0004,LEXMz1U|\u001cM\u000754Vy\u0013\u0004kOGKT~\u0012g\u0003OE\\\u000fY\\Dw|gl}Oo\u0002$r\fOcE\u0004HzHb]\u0007@`v\u0011Y2LnYdL,3^\u001fz>m5@\u001bU\u0003'lZ\u0019(\u0000<uP[\u0019Y)rQ$";
        objectArray[13] = "G YI3\fG.\u0018\rP\b\u0011?B\u0014<:As\u001fLPQ\u0000)M\u0012(\r\u001a#Nsm\u0003\u00121N\u00105SA!\"";
        objectArray[14] = "Q\u001bl[eBQ\u0015-\u001f\u0006F\u0007\u0004w\u0006jtSH(P6#P\u0018t]`E\u000b@qa";
        objectArray[15] = "\u001a\u0019M\u001c\u0001G\u001a\u0017\fXbCL\u0006VA\u000eq\u0018J\t\u0017S&\u001b\u001aU\u001a\u0004@@BP&_HO\bZE\u0007\u0018\u001c\u00186";
        Object[] objectArray2 = objectArray;
        objectArray[16] = "\u007f~D3V\u001c$&A\u000fU\u00179~@cgAu\"\u0016>0\u0001{bB3HBtc'6VGzd\u0019\u007f\u000e\u001d=\u001e\u001doSF#xF7Vz";
    }

    public static CallSite f(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static Object f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.f(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static Field l(Class clazz, String string, Class clazz2) {
        Field field = m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.k(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.l(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Method l(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.k(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.l(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static class_151 a(class_151 class_1512) {
        return class_1512;
    }

    public static Field k(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static Method k(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    public static Class v(long l) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.u(l);
            object = i[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.i[n] = clazz = Class.forName(j[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field w(long l) {
        int n = m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.u(l);
        Object object = i[n];
        if (object instanceof String) {
            String string = j[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.v(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.v(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.k(clazz3, string2, clazz2)) != null) {
                    m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.i[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.l(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.i[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.v(708615596730055L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static int u(long l) {
        int n;
        int n2;
        int n3 = (int)(l >>> 46);
        if (j[n3] != null) {
            return n3;
        }
        Object object = i[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 17;
            case 1 -> 44;
            case 2 -> 39;
            case 3 -> 2;
            case 4 -> 29;
            case 5 -> 31;
            case 6 -> 20;
            case 7 -> 51;
            case 8 -> 34;
            case 9 -> 7;
            case 10 -> 9;
            case 11 -> 4;
            case 12 -> 43;
            case 13 -> 52;
            case 14 -> 41;
            case 15 -> 46;
            case 16 -> 45;
            case 17 -> 59;
            case 18 -> 58;
            case 19 -> 30;
            case 20 -> 5;
            case 21 -> 14;
            case 22 -> 27;
            case 23 -> 48;
            case 24 -> 19;
            case 25 -> 21;
            case 26 -> 22;
            case 27 -> 47;
            case 28 -> 63;
            case 29 -> 57;
            case 30 -> 36;
            case 31 -> 55;
            case 32 -> 25;
            case 33 -> 53;
            case 34 -> 54;
            case 35 -> 12;
            case 36 -> 35;
            case 37 -> 13;
            case 38 -> 1;
            case 39 -> 3;
            case 40 -> 8;
            case 41 -> 49;
            case 42 -> 11;
            case 43 -> 60;
            case 44 -> 32;
            case 45 -> 23;
            case 46 -> 33;
            case 47 -> 15;
            case 48 -> 28;
            case 49 -> 62;
            case 50 -> 16;
            case 51 -> 61;
            case 52 -> 37;
            case 53 -> 38;
            case 54 -> 0;
            case 55 -> 24;
            case 56 -> 26;
            case 57 -> 10;
            case 58 -> 56;
            case 59 -> 42;
            case 60 -> 6;
            case 61 -> 50;
            case 62 -> 40;
            default -> 18;
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
        m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.j[n3] = new String(cArray);
        return n3;
    }

    @m$.zU7OG2ZmK3j9w8beuBv9r3hTHBLd8MHcotjd4QIayurkpjBcjhRL3g219V8VLsf8LdcQyyCXjUaBV0FuuWwWXyGBmC841lZ62
    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$NQt2798j6vOZRlMQMSWVrj9gQpt0IiJ5SfvOefoOgbO9y2jwu2HDCktlkccFsXkZBM41wWExM9SCZbDCTUIM1K3LUATNdPJA2 m$$NQt2798j6vOZRlMQMSWVrj9gQpt0IiJ5SfvOefoOgbO9y2jwu2HDCktlkccFsXkZBM41wWExM9SCZbDCTUIM1K3LUATNdPJA2) {
        block4: {
            block5: {
                try {
                    try {
                        if (!(m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1755 instanceof class_418)) break block4;
                        if (!m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724.field_5992) break block5;
                    }
                    catch (class_151 class_1512) {
                        throw m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.a(class_1512);
                    }
                    m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.f("j", (Object)m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724, (Object)new class_238(0.0, 0.0, 0.0, 0.0, 0.0, 0.0), (long)982242581841820L);
                }
                catch (class_151 class_1513) {
                    throw m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.a(class_1513);
                }
            }
            m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.f("j", (Object)m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724, (Object)m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.f("j", (Object)m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.f("j", (Object)m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724, (long)1034583724877159L), (Object)class_2350.class_2351.field_11052, (double)m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.f("\u00d1", (long)m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.b(32013, 4999253933719086978L), (long)776706924696820L), (long)1147148075346575L), (long)1075809791297491L);
        }
    }

    public static String m$$3xMcUIDOfXUFWQNxlw6zEePLziEL4lmpJBNUyeCf06r8MklIC4hYJPTPRtKwL5SqapbTzyJDJKAq7e76JLPLlKxLW3IG9wmHd(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{-77, -19, -77, 36, 11, -127, -66, 56};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 8]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        }
        catch (Throwable throwable) {
            return "";
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$UxJSYY5nxhL04kNxsSsa7MO9HK9FpEbZebeYNT0AkSkcYRebHa0RqXyvW23w5dxz5ydas7sbXnYXOePxdZe59GsR2OmDtBfyk.class, "f", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

