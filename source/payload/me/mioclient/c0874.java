/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import me.mioclient.m$$8lHFCHB5G4twLA9vXtkpaXmTQs9IjVviLNTtgFLNrJgjbGiEDBc1t5KRsHd4L6o8YIlOsmE6yIE9ZkI0MYBZgC6qSMrZTeNYn;
import me.mioclient.m$$9kkCsGVIugTOa17M6sGnE2RdEX3cMQICSO1uUbESZiS4D2h2ejvd4r5bh5yHnzxDvrNqocr8rNKM5J47kOqVhWjiTvAPyvegZ;
import me.mioclient.m$$Bn6qQgFqPhYU76vE9YcEBTObCun0ptBzBmgsuPBGJMNjoy5tfgg7Anlr8rJZKJfSiKkyoIqYLnDCuH8io8NVbn6tpHDtmbGOD;
import me.mioclient.m$$Ewj3VdhmxX9qavyYzZhD6POqdMmNcEvsORnfQhn3U7ZYkPii2OiPy3pdZdGZlbaI00Iiy7ITTvKHAVceaIAwZScYzwx3MeJS9;
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;
import me.mioclient.m$$RzyTv70sKLxfjPXSNqlXS9GoGAlpVpmslkjkXamrXYZQPILEeEcUjwuI7AU925QYMsz5d6iQPXFoPKbgtwUKqOX2Yo8xHMGEM;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.m$$kpTvo9oTzJHyXKHJbRfi0f6aC99HAzlDuYQXVuWgtQF8Z8jTVvD7IVTXILsCJQTHXv2IvwM1oJzaTykQPBkH3kh0o4KMoj7pn;
import me.mioclient.m$$ty8j281AWhyS6juWYgQRe3g46vmEb30N5W6RwRXKdu1bUL1m0WCODcdJb12mdBO9O3MG2dOBThvdqiWzz7ueXcBHiTbBQtPM5;
import net.minecraft.class_4597;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5
implements m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82 {
    public static m$$ty8j281AWhyS6juWYgQRe3g46vmEb30N5W6RwRXKdu1bUL1m0WCODcdJb12mdBO9O3MG2dOBThvdqiWzz7ueXcBHiTbBQtPM5 m$$TZr6MSCrKevIO6kdYemef1C6Rhi0n0NUtzKscx45r6to9CRSrdeG0ZGiLv1JwAu6UHjLCZd9n123ji0kB1BmNWHKCa95H1J4J;
    public final Object2ObjectOpenHashMap m$$ht2BYMEMwQH28aKhTLu8NcYgWXv8WPlpBF8CIDaByYOveb9pbguvVHdK80azDJeQMygwZDJrVtJMlwdSg407gUivV6RMXm3FQ = new Object2ObjectOpenHashMap();
    public boolean m$$a3qcWmacuu2a0vwsi4RmEzyQiHzp11joDO1Au10HYlzWmTi190jlMmGksXtwEoS0Xwa30eShEpoVX5zKeDnZ5HRhYLkYky0Pt;
    public boolean m$$t6r5e459YdHSKou37sKtFxdaKJ4fGbp9wJye0396BfxiqjkP4lK33z9yJZBEdhYBe2CvwTq65iocuMeWSUkr5rZ6FqTr4IqR9;
    public static int \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01;
    public static final String[] c;
    public static final String[] d;
    public static final long[] e;
    public static final Integer[] f;
    public static final long[] g;
    public static final Long[] h;
    public static final Object[] i;
    public static final String[] j;

    public m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5() {
        m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.a("f", (Object)this, (Object)m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.b(-16820, 1970), (Object)new m$$RzyTv70sKLxfjPXSNqlXS9GoGAlpVpmslkjkXamrXYZQPILEeEcUjwuI7AU925QYMsz5d6iQPXFoPKbgtwUKqOX2Yo8xHMGEM(), (long)963583232118437L);
        m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.a("f", (Object)this, (Object)m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.b(-16819, -2572), (Object)new m$$9kkCsGVIugTOa17M6sGnE2RdEX3cMQICSO1uUbESZiS4D2h2ejvd4r5bh5yHnzxDvrNqocr8rNKM5J47kOqVhWjiTvAPyvegZ(), (long)963583232118437L);
        m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.a("f", (Object)this, (Object)m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.b(-16817, 13550), (Object)new m$$8lHFCHB5G4twLA9vXtkpaXmTQs9IjVviLNTtgFLNrJgjbGiEDBc1t5KRsHd4L6o8YIlOsmE6yIE9ZkI0MYBZgC6qSMrZTeNYn(), (long)963583232118437L);
        m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.a("f", (Object)this, (Object)m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.b(-16818, 908), (Object)new m$$Ewj3VdhmxX9qavyYzZhD6POqdMmNcEvsORnfQhn3U7ZYkPii2OiPy3pdZdGZlbaI00Iiy7ITTvKHAVceaIAwZScYzwx3MeJS9(), (long)963583232118437L);
        m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.a("f", (Object)this, (Object)m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.b(-16824, 29428), (Object)new m$$kpTvo9oTzJHyXKHJbRfi0f6aC99HAzlDuYQXVuWgtQF8Z8jTVvD7IVTXILsCJQTHXv2IvwM1oJzaTykQPBkH3kh0o4KMoj7pn(), (long)963583232118437L);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block33: {
            block32: {
                block31: {
                    block30: {
                        block29: {
                            block28: {
                                m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.i = new Object[21];
                                m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.j = new String[21];
                                m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.a();
                                var21 = new String[5];
                                var19_1 = 0;
                                var18_2 = "/\u00f8\u00b6\u0089dO\u009c\u0005\u001a\u0011\u0097\u00e8V\b\u00dbQ4S\u0083\u0016kz";
                                var20_3 = "/\u00f8\u00b6\u0089dO\u009c\u0005\u001a\u0011\u0097\u00e8V\b\u00dbQ4S\u0083\u0016kz".length();
                                var17_4 = 7;
                                var16_5 = -1;
lbl10:
                                // 2 sources

                                while (true) {
                                    v0 = 47;
                                    v1 = ++var16_5;
                                    v2 = var18_2.substring(v1, v1 + var17_4);
                                    v3 = -1;
                                    break block28;
                                    break;
                                }
lbl16:
                                // 1 sources

                                while (true) {
                                    var21[var19_1++] = v4.intern();
                                    if ((var16_5 += var17_4) < var20_3) {
                                        var17_4 = var18_2.charAt(var16_5);
                                        ** continue;
                                    }
                                    var18_2 = "L\u008f\u000e\u0084\u00b1\u00da)\u0005\u0083\u0019\u00e3\u00fb\u00c5";
                                    var20_3 = "L\u008f\u000e\u0084\u00b1\u00da)\u0005\u0083\u0019\u00e3\u00fb\u00c5".length();
                                    var17_4 = 7;
                                    var16_5 = -1;
lbl25:
                                    // 2 sources

                                    while (true) {
                                        v0 = 87;
                                        v5 = ++var16_5;
                                        v2 = var18_2.substring(v5, v5 + var17_4);
                                        v3 = 0;
                                        break block28;
                                        break;
                                    }
                                    break;
                                }
lbl31:
                                // 1 sources

                                while (true) {
                                    var21[var19_1++] = v4.intern();
                                    if ((var16_5 += var17_4) < var20_3) {
                                        var17_4 = var18_2.charAt(var16_5);
                                        ** continue;
                                    }
                                    break block29;
                                    break;
                                }
                            }
                            v6 = v2.toCharArray();
                            v7 = v6.length;
                            var22_6 = 0;
                            v8 = v0;
                            v9 = v6;
                            v10 = v7;
                            if (v7 > 1) ** GOTO lbl88
                            do {
                                v11 = v8;
                                v9 = v9;
                                v12 = v9;
                                v13 = v8;
                                v14 = var22_6;
                                while (true) {
                                    switch (var22_6 % 7) {
                                        case 0: {
                                            v15 = 8;
                                            break;
                                        }
                                        case 1: {
                                            v15 = 30;
                                            break;
                                        }
                                        case 2: {
                                            v15 = 110;
                                            break;
                                        }
                                        case 3: {
                                            v15 = 40;
                                            break;
                                        }
                                        case 4: {
                                            v15 = 38;
                                            break;
                                        }
                                        case 5: {
                                            v15 = 62;
                                            break;
                                        }
                                        default: {
                                            v15 = 63;
                                        }
                                    }
                                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                                    ++var22_6;
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
                            } while (v10 > var22_6);
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
                        m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.c = var21;
                        m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.d = new String[5];
                        var8_7 = 9190637610196646056L;
                        var14_8 = new long[5];
                        var11_9 = 0;
                        var12_10 = "9,\u00c7LE\u00d1K|\u0085\u0001}\u001a\u00fc\u00ed\u009a\u00a9\u00981\u0017/0\u00ec\u00d0\u00aa";
                        var13_11 = "9,\u00c7LE\u00d1K|\u0085\u0001}\u001a\u00fc\u00ed\u009a\u00a9\u00981\u0017/0\u00ec\u00d0\u00aa".length();
                        var10_12 = 0;
                        while (true) {
                            var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes("ISO-8859-1");
                            v17 = var14_8;
                            v18 = var11_9++;
                            v19 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                            v20 = -1;
                            break block30;
                            break;
                        }
lbl115:
                        // 1 sources

                        while (true) {
                            v17[v18] = v21;
                            if (var10_12 < var13_11) ** continue;
                            var12_10 = "\u00bb\u00d6\u0017\u00b5\u0001\u00a8\u0003 \u0006\u008b\u0002<n\u0014\u00faq";
                            var13_11 = "\u00bb\u00d6\u0017\u00b5\u0001\u00a8\u0003 \u0006\u008b\u0002<n\u0014\u00faq".length();
                            var10_12 = 0;
                            while (true) {
                                var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes("ISO-8859-1");
                                v17 = var14_8;
                                v18 = var11_9++;
                                v19 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                                v20 = 0;
                                break block30;
                                break;
                            }
                            break;
                        }
lbl128:
                        // 1 sources

                        while (true) {
                            v17[v18] = v21;
                            if (var10_12 < var13_11) ** continue;
                            break block31;
                            break;
                        }
                    }
                    v21 = v19 ^ var8_7;
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
                m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.e = var14_8;
                m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.f = new Integer[5];
                m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.a(6784, 6229643394906274725L);
                var0_14 = 167294574187777532L;
                var6_15 = new long[3];
                var3_16 = 0;
                var4_17 = "p\u00d6-\u0000\u00b6Q\u00b4=\u001be\u009d\u0003\u00e5\u00f8 \u009b\u00a1\u0005\u000b\u008d<\u00ba\u00dfu";
                var5_18 = "p\u00d6-\u0000\u00b6Q\u00b4=\u001be\u009d\u0003\u00e5\u00f8 \u009b\u00a1\u0005\u000b\u008d<\u00ba\u00dfu".length();
                var2_19 = 0;
                while (true) {
                    break block32;
                    break;
                }
lbl152:
                // 1 sources

                while (true) {
                    var6_15[v22] = (((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L) ^ var0_14;
                    if (var2_19 < var5_18) ** continue;
                    break block33;
                    break;
                }
            }
            var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes("ISO-8859-1");
            v22 = var3_16++;
            ** while (true)
        }
        m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.g = var6_15;
        m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.h = new Long[3];
        m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.a("v", (long)m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.b(17170, 4537571113881788853L), (long)1036849696009601L);
    }

    public static String b(int n, int n2) {
        int n3 = (n ^ 0xFFFFBE4C) & 0xFFFF;
        if (d[n3] == null) {
            int n4;
            char[] cArray = c[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 79;
                case 1 -> 173;
                case 2 -> 224;
                case 3 -> 125;
                case 4 -> 0;
                case 5 -> 15;
                case 6 -> 252;
                case 7 -> 192;
                case 8 -> 75;
                case 9 -> 253;
                case 10 -> 115;
                case 11 -> 133;
                case 12 -> 23;
                case 13 -> 146;
                case 14 -> 91;
                case 15 -> 104;
                case 16 -> 73;
                case 17 -> 243;
                case 18 -> 186;
                case 19 -> 141;
                case 20 -> 94;
                case 21 -> 50;
                case 22 -> 116;
                case 23 -> 124;
                case 24 -> 103;
                case 25 -> 43;
                case 26 -> 199;
                case 27 -> 156;
                case 28 -> 157;
                case 29 -> 184;
                case 30 -> 250;
                case 31 -> 135;
                case 32 -> 38;
                case 33 -> 70;
                case 34 -> 46;
                case 35 -> 158;
                case 36 -> 30;
                case 37 -> 130;
                case 38 -> 254;
                case 39 -> 208;
                case 40 -> 182;
                case 41 -> 120;
                case 42 -> 80;
                case 43 -> 160;
                case 44 -> 129;
                case 45 -> 17;
                case 46 -> 84;
                case 47 -> 210;
                case 48 -> 98;
                case 49 -> 159;
                case 50 -> 107;
                case 51 -> 20;
                case 52 -> 39;
                case 53 -> 190;
                case 54 -> 232;
                case 55 -> 53;
                case 56 -> 63;
                case 57 -> 96;
                case 58 -> 36;
                case 59 -> 240;
                case 60 -> 198;
                case 61 -> 166;
                case 62 -> 87;
                case 63 -> 65;
                case 64 -> 132;
                case 65 -> 233;
                case 66 -> 187;
                case 67 -> 57;
                case 68 -> 205;
                case 69 -> 251;
                case 70 -> 139;
                case 71 -> 95;
                case 72 -> 26;
                case 73 -> 59;
                case 74 -> 119;
                case 75 -> 191;
                case 76 -> 189;
                case 77 -> 16;
                case 78 -> 64;
                case 79 -> 181;
                case 80 -> 168;
                case 81 -> 200;
                case 82 -> 152;
                case 83 -> 58;
                case 84 -> 213;
                case 85 -> 231;
                case 86 -> 230;
                case 87 -> 128;
                case 88 -> 11;
                case 89 -> 5;
                case 90 -> 77;
                case 91 -> 161;
                case 92 -> 164;
                case 93 -> 113;
                case 94 -> 188;
                case 95 -> 185;
                case 96 -> 194;
                case 97 -> 242;
                case 98 -> 29;
                case 99 -> 76;
                case 100 -> 92;
                case 101 -> 245;
                case 102 -> 88;
                case 103 -> 45;
                case 104 -> 143;
                case 105 -> 42;
                case 106 -> 207;
                case 107 -> 117;
                case 108 -> 24;
                case 109 -> 147;
                case 110 -> 52;
                case 111 -> 136;
                case 112 -> 44;
                case 113 -> 83;
                case 114 -> 227;
                case 115 -> 106;
                case 116 -> 155;
                case 117 -> 100;
                case 118 -> 169;
                case 119 -> 35;
                case 120 -> 237;
                case 121 -> 90;
                case 122 -> 144;
                case 123 -> 68;
                case 124 -> 131;
                case 125 -> 137;
                case 126 -> 179;
                case 127 -> 6;
                case 128 -> 226;
                case 129 -> 176;
                case 130 -> 40;
                case 131 -> 4;
                case 132 -> 167;
                case 133 -> 180;
                case 134 -> 150;
                case 135 -> 55;
                case 136 -> 34;
                case 137 -> 222;
                case 138 -> 2;
                case 139 -> 154;
                case 140 -> 56;
                case 141 -> 22;
                case 142 -> 193;
                case 143 -> 108;
                case 144 -> 61;
                case 145 -> 66;
                case 146 -> 229;
                case 147 -> 142;
                case 148 -> 217;
                case 149 -> 239;
                case 150 -> 216;
                case 151 -> 246;
                case 152 -> 171;
                case 153 -> 67;
                case 154 -> 28;
                case 155 -> 81;
                case 156 -> 197;
                case 157 -> 101;
                case 158 -> 170;
                case 159 -> 93;
                case 160 -> 8;
                case 161 -> 228;
                case 162 -> 195;
                case 163 -> 86;
                case 164 -> 204;
                case 165 -> 196;
                case 166 -> 102;
                case 167 -> 138;
                case 168 -> 162;
                case 169 -> 25;
                case 170 -> 215;
                case 171 -> 69;
                case 172 -> 47;
                case 173 -> 211;
                case 174 -> 62;
                case 175 -> 19;
                case 176 -> 121;
                case 177 -> 89;
                case 178 -> 27;
                case 179 -> 10;
                case 180 -> 172;
                case 181 -> 78;
                case 182 -> 153;
                case 183 -> 214;
                case 184 -> 3;
                case 185 -> 177;
                case 186 -> 220;
                case 187 -> 165;
                case 188 -> 7;
                case 189 -> 212;
                case 190 -> 249;
                case 191 -> 51;
                case 192 -> 82;
                case 193 -> 225;
                case 194 -> 255;
                case 195 -> 13;
                case 196 -> 234;
                case 197 -> 99;
                case 198 -> 149;
                case 199 -> 203;
                case 200 -> 238;
                case 201 -> 183;
                case 202 -> 37;
                case 203 -> 148;
                case 204 -> 206;
                case 205 -> 49;
                case 206 -> 145;
                case 207 -> 12;
                case 208 -> 32;
                case 209 -> 235;
                case 210 -> 31;
                case 211 -> 18;
                case 212 -> 114;
                case 213 -> 236;
                case 214 -> 33;
                case 215 -> 74;
                case 216 -> 218;
                case 217 -> 122;
                case 218 -> 202;
                case 219 -> 221;
                case 220 -> 54;
                case 221 -> 97;
                case 222 -> 178;
                case 223 -> 126;
                case 224 -> 123;
                case 225 -> 85;
                case 226 -> 223;
                case 227 -> 174;
                case 228 -> 134;
                case 229 -> 244;
                case 230 -> 140;
                case 231 -> 127;
                case 232 -> 41;
                case 233 -> 1;
                case 234 -> 163;
                case 235 -> 247;
                case 236 -> 175;
                case 237 -> 21;
                case 238 -> 219;
                case 239 -> 109;
                case 240 -> 14;
                case 241 -> 110;
                case 242 -> 151;
                case 243 -> 105;
                case 244 -> 48;
                case 245 -> 209;
                case 246 -> 112;
                case 247 -> 248;
                case 248 -> 9;
                case 249 -> 111;
                case 250 -> 118;
                case 251 -> 201;
                case 252 -> 241;
                case 253 -> 71;
                case 254 -> 72;
                default -> 60;
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
            m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.d[n3] = new String(cArray).intern();
        }
        return d[n3];
    }

    public static long b(int n, long l) {
        int n2 = (n ^ (int)l ^ 0x22A6) & Short.MAX_VALUE;
        if (h[n2] == null) {
            m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.h[n2] = g[n2] ^ l;
        }
        return h[n2];
    }

    public static Class b(long l) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.a(l);
            object = i[n];
            try {
                if (!(object instanceof String)) break block2;
                m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.i[n] = clazz = Class.forName(j[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static Field b(Class clazz, String string, Class clazz2) {
        Field field = m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Field c(long l) {
        int n = m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.a(l);
        Object object = i[n];
        if (object instanceof String) {
            String string = j[n];
            int n2 = string.indexOf(8);
            Class clazz = m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.b(Long.parseLong(string.substring(0, n2), 36));
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.b(Long.parseLong(string.substring(++n3), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.a(clazz3, string2, clazz2)) != null) {
                    m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.i[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.i[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.b(79749985919525L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static Method d(long l) {
        int n = m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.a(l);
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
                clazz3 = m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.b(Long.parseLong(string2.substring(0, n3), 36));
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
                    clazz2 = m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.b(Long.parseLong(string2.substring(n6, n7), 36));
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.i[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.b(79749985919525L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.i[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.b(79749985919525L);
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

    public static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/mioclient/m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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

    public static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 1;
        long l = (Long)objectArray[n];
        MethodHandle methodHandle = m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.a(lookup, mutableCallSite, string, methodType, l);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'R' || c == '\u00e9' || c == 'e' || c == 'C') {
                field = m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.c(l);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'R' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e9' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'e' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.d(l);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'f' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'v' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 1, new Class[]{Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static void a() {
        Object[] objectArray = i;
        i[0] = "meD[u\"ixDJh\"*w\u000b]o>px\u0006\u0000t)nt\tZheKs\u0000Kx?6^\bD~(p^\u001aKu\u0003eb\u0002cz;";
        objectArray[1] = "?&Fv&\u00054)W9G\u000b?\"Sc";
        objectArray[2] = "t-4!!\u0000z$s)&\u001b7%>h\n\u0001/9K+\u000e\u001eI C\u0019\u007fYo\r#\u0015+*[\u001cU.\u000b\u001awxj8\n\u0015[%}?=?[\u000fP\u0001\u0006\u0005v1/8.\b~\u007f[\"$\u001d!:P\u0016\u0003%\u007f\u001bs\u0007#\u0016v\u0001k\u0015\u0004\u0001]\u000bo\u0004p\u0006vpT\u001a*\u0001/<j\u0004\f\u001bt*]\u0003\f";
        objectArray[3] = ";2\u001b<j}0=\ns\u0016d?=\f?(t";
        objectArray[4] = Void.TYPE;
        m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.j[4] = "java/lang/Void";
        objectArray[5] = "\b-C[r\u000f\u0006$\u0004Su\u0014K%I\u0012y+\u0013\u0011>uV\"W0![.\u0001V\u001b\u0014wN1',\u000f\u0005~\u00133z\nci:==\u0005\u0001o*<%\u0014gY)\fx=pV9\u001c\u001d_~|\u0006)\u0019 \u0002c5\u00021+go7*,>xBXQ)\u0007\u0007C$S~]lA6V\u0006&\u0003R\r\u0013\u0006?u.";
        objectArray[6] = "?\b,;%\u000e4\u0007=tX\u0016'\u00004=";
        objectArray[7] = Integer.TYPE;
        m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.j[7] = "java/lang/Integer";
        objectArray[8] = "\u00036\nf[3\r?Mn\\(@>\u0000/S\r;!JCU\rZ\u0003\u0011fg2\u0006;}lE.+!aQ{*&j`G[\u000b^\u0001V^[o\u0018\u0018\u0012qT\n]\u0019t9p9Z\u0000\u0014Qz\u001a\u0001\u0004\u0017NY\u0010;\u001a@ls\u001d<&T=e4\u0007\u001dUx`\u0013\u000faF\u007f_\b\u000bk\\z\u0006-\u0006gUC_";
        objectArray[9] = Long.TYPE;
        m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.j[9] = "java/lang/Long";
        objectArray[10] = "{\b6\u001f/0{\b!C#?aC!]#*f2q\u0000r";
        objectArray[11] = "d\"|M<|d\"k\u00110s~ik\u000f0fy\u0018<Vh,";
        objectArray[12] = "-\u001c,\u001bb9-\u001c;Gn67W;Yn#0&l\u00006gg\u001a4T|#\u001cMm\f7";
        objectArray[13] = "O\u0003c\u000b~q\u001f\u0018+\u000f\u0006{XHi\bwq94 /wQ\b_E\u0011\u007fAOT}\u0015caD8P\nogM.v\u0014Ao0- \u00178N=\u000ee%Gy\u0019/ 3<ND\u001bFEbr\u001a5`Md \u0016\u001btOZ|\u000e\r 1VsK\u001bF'BS9\ri\f} \u0012/#%6AE*+u:zN^'\u0011t&\r\u0000\u001bLea\u001a\u001czI{'\u0014d \u001b\u007fe\f\u0014i\u0014alt";
        objectArray[14] = "bplWeM%waNZ.nd=Cb\u0002\u001dtL\u000f\u0010A\u0018r\u007fN<M<~G|\u001c\u0019%[M\b 7&ihv=.\u001f-h\u000b9O5H6\bg4$zqr\u001e\u001c`~`P\u0003\"?uRpk\u0017\u001e~J\u000e(\to~FI\b3\u0019yGQ\u000b;\u0003G4U>7\rhA@ H=._2d\r3{pQe\u001f0$\r\u000fgN<z5\b%\t`\u0015";
        objectArray[15] = "j.G,l9o0\u0001\"\u0014=\u007faE9r*=\u0015U\u001d[)m,q$-%\u000b\u000f|\u0018*\u0005<6z\u001ct6h}\u007f\u0018ha7\u0015|/-a9(^\u001ex'\n!`)q\bh!\u0004}_\u0018\u0011,A,S8\r\u0006T?+c\t}a\u000ep(\u0002.a\u001bw\u0001\u001f.E2Xe\u001a6A\u001dmf6\u0017WB.1+(_su!jv8yz!(5H0u?!M";
        objectArray[16] = "\u0017-\n.t\u0006F'\u000eO#\u0004\u0005V\n~+\f\b4O+,i\u0002g\u0016*=\u000bG2\u0011O";
        objectArray[17] = "\u001a\t\u0000\u007f\u00017J\u0012H{y=\rB7`+6|\u00129s\u0015\u0000m(FM\u0018h|\u00121X=bB,\u0012=G\u0007\u0019V(lG\u0012L\u0007'J\u0002>^+\u001e@6`Y\u000b\u0019y96x\u000fC9H7H\u0014?n\u0015\u0015m-?^(\u001f\u001a\u0014*E\u001e\u0005E\"4~\u00075x6<o=\u0002Q6(L&=[\u001e\u001d\u0001E<\u001bTDe\u000b`X\nx<DfB\u0001@;\u0006!\u001enAb\u00066Y\u000fD|@8!";
        objectArray[18] = "Bb+?23\u0005028Y(\u0010r;b5\u001aG4j9aMBtd934\u0004e!lY";
        objectArray[19] = "AL\u001d&,\u0018\u0007]XsF\u0004\u0013JB}*6D\r\u001a\"~aNZXa~\u0003CO\\bF";
        Object[] objectArray2 = objectArray;
        objectArray[20] = "kki(E+:amI\u00059y\u0010ix\u001a!tr,-\u001dD~!u,\f&;trI\u0006ubuc+C e\u0010";
    }

    public static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2126;
        if (f[n2] == null) {
            m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.f[n2] = (int)(e[n2] ^ l);
        }
        return f[n2];
    }

    public static int a(long l) {
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
            case 0 -> 3;
            case 1 -> 5;
            case 2 -> 12;
            case 3 -> 22;
            case 4 -> 34;
            case 5 -> 24;
            case 6 -> 7;
            case 7 -> 33;
            case 8 -> 57;
            case 9 -> 62;
            case 10 -> 13;
            case 11 -> 48;
            case 12 -> 8;
            case 13 -> 16;
            case 14 -> 42;
            case 15 -> 46;
            case 16 -> 19;
            case 17 -> 23;
            case 18 -> 60;
            case 19 -> 30;
            case 20 -> 56;
            case 21 -> 43;
            case 22 -> 40;
            case 23 -> 41;
            case 24 -> 6;
            case 25 -> 47;
            case 26 -> 10;
            case 27 -> 15;
            case 28 -> 37;
            case 29 -> 31;
            case 30 -> 25;
            case 31 -> 2;
            case 32 -> 44;
            case 33 -> 0;
            case 34 -> 11;
            case 35 -> 49;
            case 36 -> 38;
            case 37 -> 29;
            case 38 -> 50;
            case 39 -> 51;
            case 40 -> 45;
            case 41 -> 27;
            case 42 -> 52;
            case 43 -> 9;
            case 44 -> 14;
            case 45 -> 53;
            case 46 -> 21;
            case 47 -> 59;
            case 48 -> 36;
            case 49 -> 20;
            case 50 -> 55;
            case 51 -> 1;
            case 52 -> 28;
            case 53 -> 54;
            case 54 -> 63;
            case 55 -> 4;
            case 56 -> 32;
            case 57 -> 35;
            case 58 -> 39;
            case 59 -> 18;
            case 60 -> 61;
            case 61 -> 58;
            case 62 -> 26;
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
        m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.j[n3] = new String(cArray);
        return n3;
    }

    public static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(String string, Runnable runnable) {
        m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.a("f", (Object)m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.a("f", (Object)this, (Object)string, (int)(((int)(m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.b(19864, 8251848543992606526L) - (long)(\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 & m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.a(11533, 8824181082276236331L))) & m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.a(14041, 7036654517318948861L)) << m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.a(25579, 7002635772529033929L) | (int)((long)(\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 >>> m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.a(822, 8330468009717015057L) & m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.a(14041, 7036654517318948861L)) - m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.b(17727, 6676777718041143195L)) & m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.a(14041, 7036654517318948861L)), (long)1208544297834124L), (Object)runnable, (long)1063767175043172L);
    }

    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(String string, m$$Bn6qQgFqPhYU76vE9YcEBTObCun0ptBzBmgsuPBGJMNjoy5tfgg7Anlr8rJZKJfSiKkyoIqYLnDCuH8io8NVbn6tpHDtmbGOD m$$Bn6qQgFqPhYU76vE9YcEBTObCun0ptBzBmgsuPBGJMNjoy5tfgg7Anlr8rJZKJfSiKkyoIqYLnDCuH8io8NVbn6tpHDtmbGOD) {
        m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.a("f", (Object)this.m$$ht2BYMEMwQH28aKhTLu8NcYgWXv8WPlpBF8CIDaByYOveb9pbguvVHdK80azDJeQMygwZDJrVtJMlwdSg407gUivV6RMXm3FQ, (Object)string, (Object)m$$Bn6qQgFqPhYU76vE9YcEBTObCun0ptBzBmgsuPBGJMNjoy5tfgg7Anlr8rJZKJfSiKkyoIqYLnDCuH8io8NVbn6tpHDtmbGOD, (long)1470855181422582L);
    }

    public static String m$$DgJfbsz66LxsNMhGLuvqBZwfiBFeyhBAD82Jmt7CxO8KptxLeKefqPlEfu2qhNEe1UFVMcGTXaanKtOTcd280lGgqsEBJ8bke(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{125, 36, 87, -31, 7, 43, -106, -76, -30, -109, -110, 94, 109, -74, -59};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 15]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        }
        catch (Throwable throwable) {
            return "";
        }
    }

    public static m$$ty8j281AWhyS6juWYgQRe3g46vmEb30N5W6RwRXKdu1bUL1m0WCODcdJb12mdBO9O3MG2dOBThvdqiWzz7ueXcBHiTbBQtPM5 m$$xQhInQr7unM5DvCMmuPmDYlV59KeN2i3zI6UTwEHrPvguP2HNlDUFl5Z0EHp9hYBinKhWhMcthEgNawUMhguoryJDSiEvZUWf(int n) {
        if (m$$TZr6MSCrKevIO6kdYemef1C6Rhi0n0NUtzKscx45r6to9CRSrdeG0ZGiLv1JwAu6UHjLCZd9n123ji0kB1BmNWHKCa95H1J4J == null) {
            CallSite callSite = m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.a("f", (Object)m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.a("f", (Object)m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge, (long)1294380747964919L), (long)1377473752037516L);
            m$$TZr6MSCrKevIO6kdYemef1C6Rhi0n0NUtzKscx45r6to9CRSrdeG0ZGiLv1JwAu6UHjLCZd9n123ji0kB1BmNWHKCa95H1J4J = new m$$ty8j281AWhyS6juWYgQRe3g46vmEb30N5W6RwRXKdu1bUL1m0WCODcdJb12mdBO9O3MG2dOBThvdqiWzz7ueXcBHiTbBQtPM5((class_4597.class_4598)callSite);
        }
        return m$$TZr6MSCrKevIO6kdYemef1C6Rhi0n0NUtzKscx45r6to9CRSrdeG0ZGiLv1JwAu6UHjLCZd9n123ji0kB1BmNWHKCa95H1J4J;
    }

    public m$$Bn6qQgFqPhYU76vE9YcEBTObCun0ptBzBmgsuPBGJMNjoy5tfgg7Anlr8rJZKJfSiKkyoIqYLnDCuH8io8NVbn6tpHDtmbGOD m$$GiZfUtIzdPDN6Di8UtAQL2kJb46W00Xe6BeaWCsnwMnIG0pmipHfQi309garOgdEDKOWYO3rZLoUlDDwveQPLfLRxPXEWmrxm(String string, int n) {
        return (m$$Bn6qQgFqPhYU76vE9YcEBTObCun0ptBzBmgsuPBGJMNjoy5tfgg7Anlr8rJZKJfSiKkyoIqYLnDCuH8io8NVbn6tpHDtmbGOD)((Object)m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.a("f", (Object)this.m$$ht2BYMEMwQH28aKhTLu8NcYgWXv8WPlpBF8CIDaByYOveb9pbguvVHdK80azDJeQMygwZDJrVtJMlwdSg407gUivV6RMXm3FQ, (Object)string, (long)1139365736050039L));
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

